package com.tantanapp.media.ttmediaeffect.anim;

import com.immomo.svgaplayer.SVGARect;

/* JADX INFO: loaded from: classes13.dex */
public class AnimRect {
    private double mHeight;
    private double mWidth;

    /* JADX INFO: renamed from: mX */
    private double f56160mX;

    /* JADX INFO: renamed from: mY */
    private double f56161mY;

    public static AnimRect fromMomoRect(SVGARect sVGARect) {
        AnimRect animRect = new AnimRect();
        animRect.f56160mX = sVGARect.getX();
        animRect.f56161mY = sVGARect.getY();
        animRect.mWidth = sVGARect.getWidth();
        animRect.mHeight = sVGARect.getHeight();
        return animRect;
    }
}
