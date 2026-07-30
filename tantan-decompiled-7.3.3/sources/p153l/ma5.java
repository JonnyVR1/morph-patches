package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class ma5 {

    /* JADX INFO: renamed from: e */
    public static final ma5 f135470e = new ma5(0.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f135471a;

    /* JADX INFO: renamed from: b */
    public final float f135472b;

    /* JADX INFO: renamed from: c */
    public final float f135473c;

    /* JADX INFO: renamed from: d */
    public final float f135474d;

    public ma5(float f, float f2, float f3, float f4) {
        this.f135472b = f2;
        this.f135471a = f;
        this.f135473c = f3;
        this.f135474d = f4;
    }

    /* JADX INFO: renamed from: a */
    public static ma5 m157634a(View view, View view2) {
        float width = (view2.getWidth() * 1.0f) / view.getWidth();
        float height = (view2.getHeight() * 1.0f) / view.getHeight();
        float f = (1.0f - height) * 0.5f;
        float f2 = (1.0f - width) * 0.5f;
        return new ma5(f, f2, height + f, width + f2);
    }

    /* JADX INFO: renamed from: b */
    public float m157635b() {
        return this.f135473c - this.f135471a;
    }

    /* JADX INFO: renamed from: c */
    public float m157636c() {
        return this.f135474d - this.f135472b;
    }
}
