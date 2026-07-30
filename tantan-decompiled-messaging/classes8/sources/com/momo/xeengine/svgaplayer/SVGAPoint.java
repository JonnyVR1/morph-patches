package com.momo.xeengine.svgaplayer;

import kotlin.Metadata;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAPoint;", "", "x", "", "y", "value", "(FFF)V", "getValue", "()F", "getX", "getY", "gift_player_release"}, k = 1, mv = {1, 1, 15})
public final class SVGAPoint {
    private final float value;
    private final float x;
    private final float y;

    public SVGAPoint(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.value = f3;
    }

    public final float getValue() {
        return this.value;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }
}
