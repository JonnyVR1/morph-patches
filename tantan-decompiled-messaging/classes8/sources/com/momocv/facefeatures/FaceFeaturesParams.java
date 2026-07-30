package com.momocv.facefeatures;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class FaceFeaturesParams {
    public float[] constraint_euler_angles_;
    public float[][] multi_euler_angles_;
    public float[][] multi_landmarks_96_;
    public int[] multi_tracking_id_;
    public int big_features_version_ = BigFeatureVersion.f468V1;
    public boolean feature_strict_ = false;
    public boolean quality_detect_switch_ = true;
    public boolean extact_single_frame_ = false;

    public class BigFeatureVersion {

        /* JADX INFO: renamed from: V0 */
        public static final int f467V0 = 1597463007;

        /* JADX INFO: renamed from: V1 */
        public static final int f468V1 = 1597463022;

        /* JADX INFO: renamed from: V2 */
        public static final int f469V2 = 1597462955;

        public BigFeatureVersion() {
        }
    }
}
