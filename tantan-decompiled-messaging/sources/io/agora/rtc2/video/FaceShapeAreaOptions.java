package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class FaceShapeAreaOptions {
    public static final int FACE_SHAPE_AREA_CHEEK = 6;
    public static final int FACE_SHAPE_AREA_CHEEKBONE = 5;
    public static final int FACE_SHAPE_AREA_CHIN = 7;
    public static final int FACE_SHAPE_AREA_EYESCALE = 8;
    public static final int FACE_SHAPE_AREA_FACECONTOUR = 2;
    public static final int FACE_SHAPE_AREA_FACELENGTH = 3;
    public static final int FACE_SHAPE_AREA_FACEWIDTH = 4;
    public static final int FACE_SHAPE_AREA_FOREHEAD = 1;
    public static final int FACE_SHAPE_AREA_HEADSCALE = 0;
    public static final int FACE_SHAPE_AREA_MOUTHSCALE = 11;
    public static final int FACE_SHAPE_AREA_NONE = -1;
    public static final int FACE_SHAPE_AREA_NOSELENGTH = 9;
    public static final int FACE_SHAPE_AREA_NOSEWIDTH = 10;
    public int shapeArea;
    public int shapeIntensity;

    public FaceShapeAreaOptions() {
        this.shapeArea = -1;
        this.shapeIntensity = 0;
    }

    @CalledByNative
    public FaceShapeAreaOptions(int i, int i2) {
        this.shapeArea = i;
        this.shapeIntensity = i2;
    }
}
