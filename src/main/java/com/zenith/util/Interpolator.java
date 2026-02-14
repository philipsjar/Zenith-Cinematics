package com.zenith.cinematics.util;
import org.bukkit.util.Vector;
public class Interpolator {
    public static Vector catmullRom(Vector p0, Vector p1, Vector p2, Vector p3, double t) {
        double t2 = t * t;
        double t3 = t2 * t;
        return p1.clone().multiply(2)
            .add(p2.clone().subtract(p0).multiply(t))
            .add(p0.clone().multiply(2).subtract(p1.clone().multiply(5)).add(p2.clone().multiply(4)).subtract(p3).multiply(t2))
            .add(p1.clone().multiply(3).subtract(p0).subtract(p2.clone().multiply(3)).add(p3).multiply(t3))
            .multiply(0.5);
    }
}
