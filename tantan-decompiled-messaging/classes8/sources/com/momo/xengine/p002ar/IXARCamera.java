package com.momo.xengine.p002ar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface IXARCamera {

    public static class Size {
        protected int height;
        protected int width;

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }
    }

    Size getTextureSize();

    void pause();

    void resume();

    boolean update(int i, Size size);
}
