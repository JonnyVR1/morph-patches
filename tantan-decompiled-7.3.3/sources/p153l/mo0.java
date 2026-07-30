package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;

/* JADX INFO: loaded from: classes11.dex */
public class mo0 {

    /* JADX INFO: renamed from: a */
    public float f137753a;

    /* JADX INFO: renamed from: b */
    public float f137754b;

    /* JADX INFO: renamed from: c */
    public float f137755c;

    /* JADX INFO: renamed from: d */
    public float f137756d;

    /* JADX INFO: renamed from: e */
    public float f137757e;

    /* JADX INFO: renamed from: f */
    public float f137758f;

    /* JADX INFO: renamed from: g */
    public float f137759g;

    /* JADX INFO: renamed from: h */
    public float f137760h;

    /* JADX INFO: renamed from: i */
    public float f137761i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f137762j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f137763k = 0.0f;

    /* JADX INFO: renamed from: l */
    public float f137764l = 1.0f;

    /* JADX INFO: renamed from: a */
    public float m159219a(float f) {
        float f2 = this.f137755c;
        float f3 = f2 + ((this.f137756d - f2) * f);
        float f4 = this.f137753a;
        float f5 = f4 + ((this.f137754b - f4) * f);
        return (float) Math.sqrt((f3 * f3) + (f5 * f5));
    }

    /* JADX INFO: renamed from: b */
    public void m159220b() {
        this.f137754b = 0.0f;
        this.f137756d = 0.0f;
        this.f137758f = 1.0f;
        this.f137760h = 0.0f;
        this.f137762j = 1.0f;
        this.f137764l = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m159221c(View view, CardOperation cardOperation, float f, float f2, float f3, float f4) {
        m159222d(view, cardOperation, f, f2, f3, f4, false);
    }

    /* JADX INFO: renamed from: d */
    public void m159222d(View view, CardOperation cardOperation, float f, float f2, float f3, float f4, boolean z) {
        if (cardOperation == CardOperation.SWIPE_RIGHT) {
            this.f137756d = Math.max(view.getMeasuredWidth() * 1.25f, view.getTranslationX() + f);
            this.f137754b = view.getTranslationY();
            if (Float.isNaN(this.f137756d)) {
                this.f137754b = 0.0f;
            }
            if (this.f137754b != 0.0f) {
                if (Math.abs(f2) < qa00.m175859d(50.0f)) {
                    this.f137754b += (f2 > 0.0f ? 1.0f : -1.0f) * (pzi0.m174454o() % ((long) qa00.m175859d(50.0f)));
                } else if (z) {
                    this.f137754b += Math.min(view.getHeight(), Math.abs(f2)) * (f2 > 0.0f ? 1.0f : -1.0f);
                } else {
                    float f5 = this.f137754b;
                    if (f2 > 0.0f) {
                        this.f137754b = f5 + (Math.min(view.getHeight(), f2) / vo0.f184971r);
                    } else {
                        this.f137754b = f5 + (Math.max(-view.getHeight(), f2) / vo0.f184971r);
                    }
                }
            }
        } else if (cardOperation == CardOperation.SWIPE_LEFT) {
            this.f137756d = Math.max(Math.abs(view.getTranslationX()) + f, view.getMeasuredWidth() * 1.25f) * (-1.0f);
            this.f137754b = view.getTranslationY();
            if (Float.isNaN(this.f137756d)) {
                this.f137754b = 0.0f;
            }
            if (this.f137754b != 0.0f) {
                if (Math.abs(f2) < qa00.m175859d(50.0f)) {
                    this.f137754b += (f2 > 0.0f ? 1.0f : -1.0f) * (pzi0.m174454o() % ((long) qa00.m175859d(50.0f)));
                } else if (z) {
                    this.f137754b += Math.min(view.getHeight(), Math.abs(f2)) * (f2 > 0.0f ? 1.0f : -1.0f);
                } else {
                    float f6 = this.f137754b;
                    if (f2 > 0.0f) {
                        this.f137754b = f6 + (Math.min(view.getHeight(), f2) / vo0.f184971r);
                    } else {
                        this.f137754b = f6 + (Math.max(-view.getHeight(), f2) / vo0.f184971r);
                    }
                }
            }
        } else {
            this.f137754b = view.getMeasuredHeight() * (-1.5f);
            float translationX = view.getTranslationX();
            this.f137755c = translationX;
            if (Float.isNaN(translationX)) {
                this.f137755c = 0.0f;
            }
            this.f137756d = this.f137755c;
        }
        this.f137758f = 1.0f;
        this.f137760h = view.getRotation() * 1.2f;
        this.f137764l = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public void m159223e(View view) {
        this.f137753a = view.getTranslationY();
        this.f137755c = view.getTranslationX();
        this.f137757e = view.getScaleX();
        this.f137759g = view.getRotation();
        this.f137761i = view.getAlpha();
        if (Float.isNaN(this.f137753a)) {
            this.f137753a = 0.0f;
        }
        if (Float.isNaN(this.f137755c)) {
            this.f137755c = 0.0f;
        }
        this.f137763k = ((float) Math.sqrt((view.getTranslationX() * view.getTranslationX()) + (view.getTranslationY() * view.getTranslationY()))) / vo0.f184973t;
    }
}
