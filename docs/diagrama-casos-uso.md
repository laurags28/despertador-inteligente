# Diagrama de casos de uso

```mermaid
flowchart LR

    usuario[Usuario]

    UC1((Crear alarma))
    UC2((Editar alarma))
    UC3((Eliminar alarma))
    UC4((Activar alarma))
    UC5((Desactivar alarma))
    UC6((Posponer alarma))
    UC7((Detener alarma))
    UC8((Consultar próximas alarmas))

    UC9((Configurar hora))
    UC10((Configurar repetición))
    UC11((Configurar sonido))
    UC12((Configurar volumen))
    UC13((Configurar etiqueta))

    UC14((Activar modo vacaciones))
    UC15((Detectar conflictos))
    UC16((Gestionar categorías))

    usuario --> UC1
    usuario --> UC2
    usuario --> UC3
    usuario --> UC4
    usuario --> UC5
    usuario --> UC6
    usuario --> UC7
    usuario --> UC8
    usuario --> UC14
    usuario --> UC16

    UC1 -. include .-> UC9
    UC1 -. include .-> UC10
    UC1 -. include .-> UC11
    UC1 -. include .-> UC12
    UC1 -. include .-> UC13

    UC6 -. extend .-> UC4

    UC15 -. extend .-> UC1
```
