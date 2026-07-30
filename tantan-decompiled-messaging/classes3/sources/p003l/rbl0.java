package p003l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import l.ky00;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rbl0 {

    /* JADX INFO: renamed from: c */
    public final float f6845c;

    /* JADX INFO: renamed from: d */
    public pbl0 f6846d;

    /* JADX INFO: renamed from: g */
    public float f6849g;

    /* JADX INFO: renamed from: h */
    public float f6850h;

    /* JADX INFO: renamed from: i */
    public float f6851i;

    /* JADX INFO: renamed from: j */
    public float f6852j;

    /* JADX INFO: renamed from: k */
    public ViewParent f6853k;

    /* JADX INFO: renamed from: l */
    public tbl0 f6854l;

    /* JADX INFO: renamed from: m */
    public boolean f6855m;

    /* JADX INFO: renamed from: b */
    public final int f6844b = t100.d(50.0f);

    /* JADX INFO: renamed from: e */
    public boolean f6847e = false;

    /* JADX INFO: renamed from: f */
    public boolean f6848f = true;

    /* JADX INFO: renamed from: a */
    public final int f6843a = t100.d(100.0f);

    public rbl0(Context context, pbl0 pbl0Var, boolean z) {
        this.f6845c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6846d = pbl0Var;
        this.f6854l = new tbl0(context);
        this.f6855m = z;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX INFO: renamed from: a */
    public boolean m7178a(MotionEvent motionEvent) {
        float rawY;
        boolean z;
        boolean z2;
        pbl0 pbl0Var;
        this.f6854l.m7731a(motionEvent);
        int iC = ky00.c(motionEvent);
        if (iC == 1) {
            if (this.f6849g != 0.0f && this.f6850h == 0.0f) {
                return false;
            }
            this.f6851i = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f6852j = rawY;
            if (rawY - this.f6850h <= this.f6843a || this.f6854l.m7735e()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f6855m || this.f6851i - this.f6849g <= this.f6844b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                this.f6846d.m6830m(true);
            } else {
                pbl0Var = this.f6846d;
                if (z2) {
                    pbl0Var.m6821d();
                } else {
                    pbl0Var.m6830m(false);
                }
            }
            this.f6853k.requestDisallowInterceptTouchEvent(false);
            m7179b(false);
        } else if (iC != 2) {
            if (iC == 3) {
                if (this.f6849g != 0.0f) {
                }
                this.f6851i = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f6852j = rawY;
                if (rawY - this.f6850h <= this.f6843a) {
                    z = true;
                } else {
                    z = true;
                }
                if (this.f6855m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    this.f6846d.m6830m(true);
                } else {
                    pbl0Var = this.f6846d;
                    if (z2) {
                        pbl0Var.m6821d();
                    } else {
                        pbl0Var.m6830m(false);
                    }
                }
                this.f6853k.requestDisallowInterceptTouchEvent(false);
                m7179b(false);
            } else if (iC == 5) {
                this.f6848f = false;
            }
        } else if (this.f6848f) {
            if (this.f6849g == 0.0f) {
                this.f6849g = motionEvent.getRawX();
            }
            if (this.f6850h == 0.0f) {
                this.f6850h = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f6847e) {
                float f = this.f6850h;
                if (rawY2 - f > this.f6845c && rawY2 - f > Math.abs(rawX - this.f6849g)) {
                    this.f6847e = true;
                } else if (this.f6855m && rawX - this.f6849g > this.f6845c) {
                    this.f6847e = true;
                }
            } else if (this.f6855m) {
                this.f6847e = true;
            }
            if (this.f6847e) {
                this.f6853k.requestDisallowInterceptTouchEvent(true);
                this.f6846d.m6829l(rawX - this.f6849g, rawY2 - this.f6850h);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m7179b(boolean z) {
        this.f6848f = true;
        this.f6849g = 0.0f;
        this.f6850h = 0.0f;
        this.f6847e = false;
        this.f6854l.m7733c();
        if (z) {
            this.f6846d.m6830m(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7180c(ViewParent viewParent) {
        this.f6853k = viewParent;
    }
}
