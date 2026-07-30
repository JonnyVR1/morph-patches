package com.momo.mcamera.mask;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ActionInfo implements Serializable {
    private List<BodyBean> body;
    private String hand = "";
    private String mouth = "";
    private String head = "";
    private String eye = "";

    public static class BodyBean implements Serializable {
        private int first;
        private List<Float> offsetX;
        private List<Float> offsetY;
        private float score;
        private int second;

        public int getFirst() {
            return this.first;
        }

        public List<Float> getOffsetX() {
            return this.offsetX;
        }

        public List<Float> getOffsetY() {
            return this.offsetY;
        }

        public float getScore() {
            return this.score;
        }

        public int getSecond() {
            return this.second;
        }
    }

    public List<BodyBean> getBody() {
        return this.body;
    }

    public String getEye() {
        return this.eye;
    }

    public String getHand() {
        return this.hand;
    }

    public String getHead() {
        return this.head;
    }

    public String getMouth() {
        return this.mouth;
    }
}
