package com.effectsar.labcv.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class BefDynamicGestureInfo {
    private GestureInfo[] gestureInfos;
    private int gestureNum;

    public static class GestureInfo {
        private int actionType = 0;
        private float actionScore = 0.0f;

        public float getActionScore() {
            return this.actionScore;
        }

        public int getActionType() {
            return this.actionType;
        }

        public String toString() {
            return "GestureInfo{actionType=" + this.actionType + ", actionType=" + this.actionType + '}';
        }
    }

    public GestureInfo[] getGestureInfos() {
        return this.gestureInfos;
    }

    public int getGestureNum() {
        return this.gestureNum;
    }

    public void setGestureInfos(GestureInfo[] gestureInfoArr) {
        this.gestureInfos = gestureInfoArr;
    }

    public void setGestureNum(int i) {
        this.gestureNum = i;
    }
}
