package p009l;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qo0 {

    /* JADX INFO: renamed from: a */
    public float f19395a;

    /* JADX INFO: renamed from: b */
    public float f19396b;

    /* JADX INFO: renamed from: c */
    public float f19397c;

    /* JADX INFO: renamed from: d */
    public float f19398d;

    /* JADX INFO: renamed from: e */
    public float f19399e;

    /* JADX INFO: renamed from: f */
    public float f19400f;

    /* JADX INFO: renamed from: g */
    public float f19401g;

    /* JADX INFO: renamed from: h */
    public float f19402h;

    /* JADX INFO: renamed from: i */
    public float f19403i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f19404j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f19405k = 0.0f;

    /* JADX INFO: renamed from: l */
    public float f19406l = 1.0f;

    /* JADX INFO: renamed from: a */
    public float m21115a(float f) {
        float f2 = this.f19397c;
        float f3 = f2 + ((this.f19398d - f2) * f);
        float f4 = this.f19395a;
        float f5 = f4 + ((this.f19396b - f4) * f);
        return (float) Math.sqrt((f3 * f3) + (f5 * f5));
    }

    /* JADX INFO: renamed from: b */
    public void m21116b() {
        this.f19396b = 0.0f;
        this.f19398d = 0.0f;
        this.f19400f = 1.0f;
        this.f19402h = 0.0f;
        this.f19404j = 1.0f;
        this.f19406l = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m21117c(View view, CardOperation cardOperation, float f, float f2, float f3, float f4) {
        m21118d(view, cardOperation, f, f2, f3, f4, false);
    }

    /* JADX INFO: renamed from: d */
    public void m21118d(View view, CardOperation cardOperation, float f, float f2, float f3, float f4, boolean z) {
        if (cardOperation == CardOperation.SWIPE_RIGHT) {
            this.f19398d = Math.max(view.getMeasuredWidth() * 1.25f, view.getTranslationX() + f);
            this.f19396b = view.getTranslationY();
            if (Float.isNaN(this.f19398d)) {
                this.f19396b = 0.0f;
            }
            if (this.f19396b != 0.0f) {
                if (Math.abs(f2) < t100.d(50.0f)) {
                    this.f19396b += (f2 > 0.0f ? 1.0f : -1.0f) * (mqi0.m18550o() % ((long) t100.d(50.0f)));
                } else if (z) {
                    this.f19396b += Math.min(view.getHeight(), Math.abs(f2)) * (f2 > 0.0f ? 1.0f : -1.0f);
                } else {
                    float f5 = this.f19396b;
                    if (f2 > 0.0f) {
                        this.f19396b = f5 + (Math.min(view.getHeight(), f2) / zo0.f23789r);
                    } else {
                        this.f19396b = f5 + (Math.max(-view.getHeight(), f2) / zo0.f23789r);
                    }
                }
            }
        } else if (cardOperation == CardOperation.SWIPE_LEFT) {
            this.f19398d = Math.max(Math.abs(view.getTranslationX()) + f, view.getMeasuredWidth() * 1.25f) * (-1.0f);
            this.f19396b = view.getTranslationY();
            if (Float.isNaN(this.f19398d)) {
                this.f19396b = 0.0f;
            }
            if (this.f19396b != 0.0f) {
                if (Math.abs(f2) < t100.d(50.0f)) {
                    this.f19396b += (f2 > 0.0f ? 1.0f : -1.0f) * (mqi0.m18550o() % ((long) t100.d(50.0f)));
                } else if (z) {
                    this.f19396b += Math.min(view.getHeight(), Math.abs(f2)) * (f2 > 0.0f ? 1.0f : -1.0f);
                } else {
                    float f6 = this.f19396b;
                    if (f2 > 0.0f) {
                        this.f19396b = f6 + (Math.min(view.getHeight(), f2) / zo0.f23789r);
                    } else {
                        this.f19396b = f6 + (Math.max(-view.getHeight(), f2) / zo0.f23789r);
                    }
                }
            }
        } else {
            this.f19396b = view.getMeasuredHeight() * (-1.5f);
            float translationX = view.getTranslationX();
            this.f19397c = translationX;
            if (Float.isNaN(translationX)) {
                this.f19397c = 0.0f;
            }
            this.f19398d = this.f19397c;
        }
        this.f19400f = 1.0f;
        this.f19402h = view.getRotation() * 1.2f;
        this.f19406l = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public void m21119e(View view) {
        this.f19395a = view.getTranslationY();
        this.f19397c = view.getTranslationX();
        this.f19399e = view.getScaleX();
        this.f19401g = view.getRotation();
        this.f19403i = view.getAlpha();
        if (Float.isNaN(this.f19395a)) {
            this.f19395a = 0.0f;
        }
        if (Float.isNaN(this.f19397c)) {
            this.f19397c = 0.0f;
        }
        this.f19405k = ((float) Math.sqrt((view.getTranslationX() * view.getTranslationX()) + (view.getTranslationY() * view.getTranslationY()))) / zo0.f23791t;
    }
}
