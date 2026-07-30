package io.agora.rtc2.video;

/* JADX INFO: loaded from: classes2.dex */
public class AgoraImage {
    public double alpha;
    public int height;
    public String url;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f64041x;

    /* JADX INFO: renamed from: y */
    public int f64042y;
    public int zOrder;

    public AgoraImage() {
        this.url = null;
        this.f64041x = 0;
        this.f64042y = 0;
        this.width = 0;
        this.height = 0;
        this.zOrder = 0;
        this.alpha = 1.0d;
    }

    public AgoraImage(String str) {
        this.url = str;
        this.f64041x = 0;
        this.f64042y = 0;
        this.width = 0;
        this.height = 0;
        this.zOrder = 0;
        this.alpha = 1.0d;
    }
}
