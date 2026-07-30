package com.tantanapp.media.ttmediaeffect.anim;

import com.immomo.svgaplayer.SVGARect;

/* JADX INFO: loaded from: classes12.dex */
public class AnimRect {
    private double mHeight;
    private double mWidth;

    /* JADX INFO: renamed from: mX */
    private double f57008mX;

    /* JADX INFO: renamed from: mY */
    private double f57009mY;

    public static AnimRect fromMomoRect(SVGARect sVGARect) {
        AnimRect animRect = new AnimRect();
        animRect.f57008mX = sVGARect.getX();
        animRect.f57009mY = sVGARect.getY();
        animRect.mWidth = sVGARect.getWidth();
        animRect.mHeight = sVGARect.getHeight();
        return animRect;
    }
}
