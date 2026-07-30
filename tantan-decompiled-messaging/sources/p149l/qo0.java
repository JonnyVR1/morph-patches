package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;

/* JADX INFO: loaded from: classes11.dex */
public class qo0 {

    /* JADX INFO: renamed from: a */
    public float f155518a;

    /* JADX INFO: renamed from: b */
    public float f155519b;

    /* JADX INFO: renamed from: c */
    public float f155520c;

    /* JADX INFO: renamed from: d */
    public float f155521d;

    /* JADX INFO: renamed from: e */
    public float f155522e;

    /* JADX INFO: renamed from: f */
    public float f155523f;

    /* JADX INFO: renamed from: g */
    public float f155524g;

    /* JADX INFO: renamed from: h */
    public float f155525h;

    /* JADX INFO: renamed from: i */
    public float f155526i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f155527j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f155528k = 0.0f;

    /* JADX INFO: renamed from: l */
    public float f155529l = 1.0f;

    /* JADX INFO: renamed from: a */
    public float m175716a(float f) {
        float f2 = this.f155520c;
        float f3 = f2 + ((this.f155521d - f2) * f);
        float f4 = this.f155518a;
        float f5 = f4 + ((this.f155519b - f4) * f);
        return (float) Math.sqrt((f3 * f3) + (f5 * f5));
    }

    /* JADX INFO: renamed from: b */
    public void m175717b() {
        this.f155519b = 0.0f;
        this.f155521d = 0.0f;
        this.f155523f = 1.0f;
        this.f155525h = 0.0f;
        this.f155527j = 1.0f;
        this.f155529l = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public void m175718c(View view, CardOperation cardOperation, float f, float f2, float f3, float f4) {
        m175719d(view, cardOperation, f, f2, f3, f4, false);
    }

    /* JADX INFO: renamed from: d */
    public void m175719d(View view, CardOperation cardOperation, float f, float f2, float f3, float f4, boolean z) {
        if (cardOperation == CardOperation.SWIPE_RIGHT) {
            this.f155521d = Math.max(view.getMeasuredWidth() * 1.25f, view.getTranslationX() + f);
            this.f155519b = view.getTranslationY();
            if (Float.isNaN(this.f155521d)) {
                this.f155519b = 0.0f;
            }
            if (this.f155519b != 0.0f) {
                if (Math.abs(f2) < t100.m186890d(50.0f)) {
                    this.f155519b += (f2 > 0.0f ? 1.0f : -1.0f) * (mqi0.m155944o() % ((long) t100.m186890d(50.0f)));
                } else if (z) {
                    this.f155519b += Math.min(view.getHeight(), Math.abs(f2)) * (f2 > 0.0f ? 1.0f : -1.0f);
                } else {
                    float f5 = this.f155519b;
                    if (f2 > 0.0f) {
                        this.f155519b = f5 + (Math.min(view.getHeight(), f2) / zo0.f204065r);
                    } else {
                        this.f155519b = f5 + (Math.max(-view.getHeight(), f2) / zo0.f204065r);
                    }
                }
            }
        } else if (cardOperation == CardOperation.SWIPE_LEFT) {
            this.f155521d = Math.max(Math.abs(view.getTranslationX()) + f, view.getMeasuredWidth() * 1.25f) * (-1.0f);
            this.f155519b = view.getTranslationY();
            if (Float.isNaN(this.f155521d)) {
                this.f155519b = 0.0f;
            }
            if (this.f155519b != 0.0f) {
                if (Math.abs(f2) < t100.m186890d(50.0f)) {
                    this.f155519b += (f2 > 0.0f ? 1.0f : -1.0f) * (mqi0.m155944o() % ((long) t100.m186890d(50.0f)));
                } else if (z) {
                    this.f155519b += Math.min(view.getHeight(), Math.abs(f2)) * (f2 > 0.0f ? 1.0f : -1.0f);
                } else {
                    float f6 = this.f155519b;
                    if (f2 > 0.0f) {
                        this.f155519b = f6 + (Math.min(view.getHeight(), f2) / zo0.f204065r);
                    } else {
                        this.f155519b = f6 + (Math.max(-view.getHeight(), f2) / zo0.f204065r);
                    }
                }
            }
        } else {
            this.f155519b = view.getMeasuredHeight() * (-1.5f);
            float translationX = view.getTranslationX();
            this.f155520c = translationX;
            if (Float.isNaN(translationX)) {
                this.f155520c = 0.0f;
            }
            this.f155521d = this.f155520c;
        }
        this.f155523f = 1.0f;
        this.f155525h = view.getRotation() * 1.2f;
        this.f155529l = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public void m175720e(View view) {
        this.f155518a = view.getTranslationY();
        this.f155520c = view.getTranslationX();
        this.f155522e = view.getScaleX();
        this.f155524g = view.getRotation();
        this.f155526i = view.getAlpha();
        if (Float.isNaN(this.f155518a)) {
            this.f155518a = 0.0f;
        }
        if (Float.isNaN(this.f155520c)) {
            this.f155520c = 0.0f;
        }
        this.f155528k = ((float) Math.sqrt((view.getTranslationX() * view.getTranslationX()) + (view.getTranslationY() * view.getTranslationY()))) / zo0.f204067t;
    }
}
