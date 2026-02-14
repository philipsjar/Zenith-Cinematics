# Zenith-Cinematics

Lightweight cinematic camera engine for Paper/Spigot servers using Catmull-Rom spline interpolation.



### Implementation
The engine calculates smooth transitions between N waypoints. Unlike linear interpolation, this provides a curved pathing system that eliminates harsh camera snaps at waypoints.

### Usage
```java
ScenePlayer player = new ScenePlayer();
player.play(targetPlayer, locationList, 200);
