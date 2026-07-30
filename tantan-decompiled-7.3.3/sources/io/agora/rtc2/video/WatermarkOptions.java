package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes2.dex */
public class WatermarkOptions {
    public boolean visibleInPreview = true;
    public Rectangle positionInLandscapeMode = new Rectangle();
    public Rectangle positionInPortraitMode = new Rectangle();

    public static class Rectangle {
        public int height;
        public int width;

        /* JADX INFO: renamed from: x */
        public int f64045x;

        /* JADX INFO: renamed from: y */
        public int f64046y;

        public Rectangle() {
            this.f64045x = 0;
            this.f64046y = 0;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int i, int i2, int i3, int i4) {
            this.f64045x = i;
            this.f64046y = i2;
            this.width = i3;
            this.height = i4;
        }
    }
}
