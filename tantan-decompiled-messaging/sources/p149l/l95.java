package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class l95 {

    /* JADX INFO: renamed from: e */
    public static final l95 f126916e = new l95(0.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f126917a;

    /* JADX INFO: renamed from: b */
    public final float f126918b;

    /* JADX INFO: renamed from: c */
    public final float f126919c;

    /* JADX INFO: renamed from: d */
    public final float f126920d;

    public l95(float f, float f2, float f3, float f4) {
        this.f126918b = f2;
        this.f126917a = f;
        this.f126919c = f3;
        this.f126920d = f4;
    }

    /* JADX INFO: renamed from: a */
    public static l95 m148999a(View view, View view2) {
        float width = (view2.getWidth() * 1.0f) / view.getWidth();
        float height = (view2.getHeight() * 1.0f) / view.getHeight();
        float f = (1.0f - height) * 0.5f;
        float f2 = (1.0f - width) * 0.5f;
        return new l95(f, f2, height + f, width + f2);
    }

    /* JADX INFO: renamed from: b */
    public float m149000b() {
        return this.f126919c - this.f126917a;
    }

    /* JADX INFO: renamed from: c */
    public float m149001c() {
        return this.f126920d - this.f126918b;
    }
}
