package p006l;

import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l95 {

    /* JADX INFO: renamed from: e */
    public static final l95 f16270e = new l95(0.0f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f16271a;

    /* JADX INFO: renamed from: b */
    public final float f16272b;

    /* JADX INFO: renamed from: c */
    public final float f16273c;

    /* JADX INFO: renamed from: d */
    public final float f16274d;

    public l95(float f, float f2, float f3, float f4) {
        this.f16272b = f2;
        this.f16271a = f;
        this.f16273c = f3;
        this.f16274d = f4;
    }

    /* JADX INFO: renamed from: a */
    public static l95 m18605a(View view, View view2) {
        float width = (view2.getWidth() * 1.0f) / view.getWidth();
        float height = (view2.getHeight() * 1.0f) / view.getHeight();
        float f = (1.0f - height) * 0.5f;
        float f2 = (1.0f - width) * 0.5f;
        return new l95(f, f2, height + f, width + f2);
    }

    /* JADX INFO: renamed from: b */
    public float m18606b() {
        return this.f16273c - this.f16271a;
    }

    /* JADX INFO: renamed from: c */
    public float m18607c() {
        return this.f16274d - this.f16272b;
    }
}
