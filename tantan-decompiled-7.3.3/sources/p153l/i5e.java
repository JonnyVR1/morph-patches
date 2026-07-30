package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class i5e {

    /* JADX INFO: renamed from: a */
    public float f113058a;

    /* JADX INFO: renamed from: b */
    public float f113059b;

    /* JADX INFO: renamed from: c */
    public float f113060c;

    /* JADX INFO: renamed from: d */
    public float f113061d;

    /* JADX INFO: renamed from: g */
    public final float f113064g;

    /* JADX INFO: renamed from: h */
    public zl50 f113065h;

    /* JADX INFO: renamed from: f */
    public boolean f113063f = false;

    /* JADX INFO: renamed from: i */
    public boolean f113066i = true;

    /* JADX INFO: renamed from: e */
    public final int f113062e = qa00.m175859d(100.0f);

    public i5e(zl50 zl50Var, Context context) {
        this.f113065h = zl50Var;
        this.f113064g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo138695a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX INFO: renamed from: b */
    public boolean mo138696b(MotionEvent motionEvent) {
        float rawY;
        int iM194643c = u610.m194643c(motionEvent);
        if (iM194643c == 1) {
            this.f113060c = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f113061d = rawY;
            if (rawY - this.f113059b <= this.f113062e || mo138695a()) {
                this.f113065h.mo189052e(true);
            } else {
                this.f113065h.mo189052e(false);
            }
            mo138697c(false);
        } else if (iM194643c != 2) {
            if (iM194643c == 3) {
                this.f113060c = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f113061d = rawY;
                if (rawY - this.f113059b <= this.f113062e) {
                    this.f113065h.mo189052e(true);
                } else {
                    this.f113065h.mo189052e(true);
                }
                mo138697c(false);
            } else if (iM194643c == 5) {
                this.f113066i = false;
            }
        } else if (this.f113066i) {
            if (this.f113058a == 0.0f) {
                this.f113058a = motionEvent.getRawX();
            }
            if (this.f113059b == 0.0f) {
                this.f113059b = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f113063f) {
                float f = this.f113059b;
                if (rawY2 - f > this.f113064g && rawY2 - f > Math.abs(rawX - this.f113058a)) {
                    this.f113063f = true;
                }
            }
            if (this.f113063f) {
                this.f113065h.mo189047a(rawX - this.f113058a, rawY2 - this.f113059b);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo138697c(boolean z) {
        this.f113066i = true;
        this.f113058a = 0.0f;
        this.f113059b = 0.0f;
        this.f113063f = false;
        if (z) {
            this.f113065h.mo189052e(false);
        }
    }
}
