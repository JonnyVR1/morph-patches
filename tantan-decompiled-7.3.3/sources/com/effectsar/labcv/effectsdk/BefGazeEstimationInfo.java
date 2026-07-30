package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefGazeEstimationInfo {
    int faceCount;
    BefGazeEstimation[] infos;

    public static class BefGazeEstimation {
        long faceId;
        float[] head_r;
        float[] head_t;
        float[] leye_gaze;
        float[] leye_gaze_2d;
        float[] leye_pos;
        float[] leye_pos2d;
        float[] mid_gaze;
        float[] reye_gaze;
        float[] reye_gaze2d;
        float[] reye_pos;
        float[] reye_pos2d;
        boolean valid;

        public long getFaceId() {
            return this.faceId;
        }

        public float[] getHead_r() {
            return this.head_r;
        }

        public float[] getHead_t() {
            return this.head_t;
        }

        public float[] getLeye_gaze() {
            return this.leye_gaze;
        }

        public float[] getLeye_gaze_2d() {
            return this.leye_gaze_2d;
        }

        public float[] getLeye_pos() {
            return this.leye_pos;
        }

        public float[] getLeye_pos2d() {
            return this.leye_pos2d;
        }

        public float[] getMid_gaze() {
            return this.mid_gaze;
        }

        public float[] getReye_gaze() {
            return this.reye_gaze;
        }

        public float[] getReye_gaze2d() {
            return this.reye_gaze2d;
        }

        public float[] getReye_pos() {
            return this.reye_pos;
        }

        public float[] getReye_pos2d() {
            return this.reye_pos2d;
        }

        public boolean isValid() {
            return this.valid;
        }
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    public BefGazeEstimation[] getInfos() {
        return this.infos;
    }
}
