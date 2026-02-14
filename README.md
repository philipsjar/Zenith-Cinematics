# Zenith-Cinematics

Lightweight cinematic camera engine for Paper/Spigot servers using Catmull-Rom spline interpolation.

### Project's Structure
```
Zenith-Cinematics/
├── pom.xml                         
└── src/
    └── main/
        ├── java/
        │   └── com/
        │       └── zenith/
        │           └── cinematics/
        │               ├── ZenithPlugin.java
        │               ├── camera/
        │               │   ├── CameraCommand.java
        │               │   └── ScenePlayer.java
        │               └── util/
        │                   └── Interpolator.java
        └── resources/
            └── plugin.yml
```

### Implementation
The engine calculates smooth transitions between N waypoints. Unlike linear interpolation, this provides a curved pathing system that eliminates harsh camera snaps at waypoints.

### Usage
```java
ScenePlayer player = new ScenePlayer();
player.play(targetPlayer, locationList, 200);
