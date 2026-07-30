package com.momo.xeengine.svgaplayer;

import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m87232d2 = {"Lcom/momo/xeengine/svgaplayer/SVGARect;", "", BaseSei.f13930X, "", BaseSei.f13931Y, "width", "height", "(DDDD)V", "getHeight", "()D", "getWidth", "getX", "getY", "gift_player_release"}, m87233k = 1, m87234mv = {1, 1, 15})
public final class SVGARect {
    private final double height;
    private final double width;
    private final double x;
    private final double y;

    public SVGARect(double d, double d2, double d3, double d4) {
        this.x = d;
        this.y = d2;
        this.width = d3;
        this.height = d4;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }
}
