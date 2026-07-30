package com.momocv.facefeatures;

/* JADX INFO: loaded from: classes8.dex */
public class FaceFeaturesParams {
    public float[] constraint_euler_angles_;
    public float[][] multi_euler_angles_;
    public float[][] multi_landmarks_96_;
    public int[] multi_tracking_id_;
    public int big_features_version_ = BigFeatureVersion.f15488V1;
    public boolean feature_strict_ = false;
    public boolean quality_detect_switch_ = true;
    public boolean extact_single_frame_ = false;

    public class BigFeatureVersion {

        /* JADX INFO: renamed from: V0 */
        public static final int f15487V0 = 1597463007;

        /* JADX INFO: renamed from: V1 */
        public static final int f15488V1 = 1597463022;

        /* JADX INFO: renamed from: V2 */
        public static final int f15489V2 = 1597462955;

        public BigFeatureVersion() {
        }
    }
}
