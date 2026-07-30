package com.effectsar.labcv.effectsdk;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefHandInfo {
    private int handCount = 0;
    private BefHand[] hands;

    public static class BefHand {
        private int action;

        /* JADX INFO: renamed from: id */
        private int f5862id;
        private BefKeyPoint[] keyPoints;
        private BefKeyPoint[] keyPointsExt;
        private Rect rect;
        private float rotAngle;
        private float rotAngleBothhand;
        private float score;
        private int seqAction;

        public int getAction() {
            return this.action;
        }

        public int getId() {
            return this.f5862id;
        }

        public BefKeyPoint[] getKeyPoints() {
            return this.keyPoints;
        }

        public BefKeyPoint[] getKeyPointsExt() {
            return this.keyPointsExt;
        }

        public Rect getRect() {
            return this.rect;
        }

        public float getRotAngle() {
            return this.rotAngle;
        }

        public float getRotAngleBothhand() {
            return this.rotAngleBothhand;
        }

        public float getScore() {
            return this.score;
        }

        public int getSeqAction() {
            return this.seqAction;
        }

        public String toString() {
            return "BefHand{id=" + this.f5862id + ", rect=" + this.rect + ", action=" + this.action + ", rotAngle=" + this.rotAngle + ", score=" + this.score + ", rotAngleBothhand=" + this.rotAngleBothhand + ", keyPoints=" + Arrays.toString(this.keyPoints) + ", keyPointsExt=" + Arrays.toString(this.keyPointsExt) + ", seqAction=" + this.seqAction + '}';
        }
    }

    public static class BefKeyPoint {
        boolean is_detect;

        /* JADX INFO: renamed from: x */
        float f5863x;

        /* JADX INFO: renamed from: y */
        float f5864y;

        public BefKeyPoint(float f, float f2, boolean z) {
            this.f5863x = f;
            this.f5864y = f2;
            this.is_detect = z;
        }

        public PointF asPoint() {
            return new PointF(this.f5863x, this.f5864y);
        }

        public String toString() {
            return "BefKeyPoint { x =" + this.f5863x + " y =" + this.f5864y + " is_detect =" + this.is_detect + "}";
        }
    }

    public int getHandCount() {
        return this.handCount;
    }

    public BefHand[] getHands() {
        return this.hands;
    }

    public String toString() {
        return "BefHandInfo{hands=" + Arrays.toString(this.hands) + ", handCount=" + this.handCount + '}';
    }
}
