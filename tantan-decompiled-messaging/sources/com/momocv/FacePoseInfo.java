package com.momocv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class FacePoseInfo implements Serializable {
    public float[] camera_matrix_;
    public float[] euler_angles_;
    public float[] modelview_matrix_;
    public float[] projection_matrix_;
    public float[] projection_matrix_opengl_;
    public float[] rotation_matrix_;
    public float[] rotation_vector_;
    public float[] translation_vector_;
}
