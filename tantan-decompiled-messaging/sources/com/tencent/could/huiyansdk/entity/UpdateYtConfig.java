package com.tencent.could.huiyansdk.entity;

/* JADX INFO: loaded from: classes2.dex */
public class UpdateYtConfig {
    public AngleDetectConfig angleDetectConfig = null;

    public static class AngleDetectConfig {
        public float secondaryYawThreshold = 30.0f;
        public float secondaryRollThreshold = 30.0f;
        public float secondaryPitchThreshold = 40.0f;

        public float getSecondaryPitchThreshold() {
            return this.secondaryPitchThreshold;
        }

        public float getSecondaryRollThreshold() {
            return this.secondaryRollThreshold;
        }

        public float getSecondaryYawThreshold() {
            return this.secondaryYawThreshold;
        }

        public void setSecondaryPitchThreshold(float f) {
            this.secondaryPitchThreshold = f;
        }

        public void setSecondaryRollThreshold(float f) {
            this.secondaryRollThreshold = f;
        }

        public void setSecondaryYawThreshold(float f) {
            this.secondaryYawThreshold = f;
        }

        public String toString() {
            return "AngleDetectConfig{secondaryYawThreshold=" + this.secondaryYawThreshold + ", secondaryRollThreshold=" + this.secondaryRollThreshold + ", secondaryPitchThreshold=" + this.secondaryPitchThreshold + '}';
        }
    }

    public AngleDetectConfig getAngleDetectConfig() {
        return this.angleDetectConfig;
    }

    public void setAngleDetectConfig(AngleDetectConfig angleDetectConfig) {
        this.angleDetectConfig = angleDetectConfig;
    }

    public String toString() {
        if (this.angleDetectConfig == null) {
            return "";
        }
        return "UpdateYtConfig{angleDetectConfig=" + this.angleDetectConfig.toString() + '}';
    }
}
