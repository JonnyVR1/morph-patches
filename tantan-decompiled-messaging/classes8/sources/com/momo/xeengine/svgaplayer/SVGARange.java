package com.momo.xeengine.svgaplayer;

import kotlin.Metadata;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/momo/xeengine/svgaplayer/SVGARange;", "", "location", "", "length", "(II)V", "getLength", "()I", "getLocation", "gift_player_release"}, k = 1, mv = {1, 1, 15})
public final class SVGARange {
    private final int length;
    private final int location;

    public SVGARange(int i, int i2) {
        this.location = i;
        this.length = i2;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLocation() {
        return this.location;
    }
}
