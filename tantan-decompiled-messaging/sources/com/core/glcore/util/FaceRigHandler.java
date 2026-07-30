package com.core.glcore.util;

/* JADX INFO: loaded from: classes.dex */
public interface FaceRigHandler {

    public interface FaceRigAnim {
        void hide();

        void resetFace();

        void show();
    }

    byte[] onAssembleFaceRigFeature();

    void onFaceDetect(int i);

    void onFaceRigStatusChanged(boolean z, FaceRigAnim faceRigAnim);

    byte[] onLoadFaModel();

    byte[] onLoadFaceRigModel();

    byte[] onLoadFdModel();

    void onSaveFadeRigFeature(byte[] bArr);

    void onStartFaceRigModel();

    void onStopFaceRigModel();
}
