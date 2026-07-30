package com.effectsar.labcv.effectsdk;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefGeneralObjectInfo {
    private ObjectInfo[] infos;
    private int num;

    public static class ObjectInfo {
        private ObjectRect box;
        private int label;

        public ObjectRect getBox() {
            return this.box;
        }

        public int getLabel() {
            return this.label;
        }

        public String toString() {
            return "ObjectInfo{label=" + this.label + ", box=" + this.box + '}';
        }
    }

    public static class ObjectRect {
        private int bottom;
        private int left;
        private int right;
        private int top;

        public ObjectRect(int i, int i2, int i3, int i4) {
            this.left = i;
            this.top = i2;
            this.right = i3;
            this.bottom = i4;
        }

        public int getBottom() {
            return this.bottom;
        }

        public int getLeft() {
            return this.left;
        }

        public int getRight() {
            return this.right;
        }

        public int getTop() {
            return this.top;
        }

        public Rect toRect() {
            return new Rect(this.left, this.top, this.right, this.bottom);
        }

        public String toString() {
            return "ObjectRect{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
        }
    }

    public ObjectInfo[] getInfos() {
        return this.infos;
    }

    public int getNum() {
        return this.num;
    }

    public String toString() {
        return "BefGeneralObjectInfo{num=" + this.num + ", infos=" + Arrays.toString(this.infos) + '}';
    }
}
