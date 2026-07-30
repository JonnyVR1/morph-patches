package p007l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import l.ky00;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qbl0 {

    /* JADX INFO: renamed from: c */
    public final float f12193c;

    /* JADX INFO: renamed from: d */
    public obl0 f12194d;

    /* JADX INFO: renamed from: g */
    public float f12197g;

    /* JADX INFO: renamed from: h */
    public float f12198h;

    /* JADX INFO: renamed from: i */
    public float f12199i;

    /* JADX INFO: renamed from: j */
    public float f12200j;

    /* JADX INFO: renamed from: k */
    public ViewParent f12201k;

    /* JADX INFO: renamed from: l */
    public sbl0 f12202l;

    /* JADX INFO: renamed from: m */
    public boolean f12203m;

    /* JADX INFO: renamed from: b */
    public final int f12192b = t100.d(50.0f);

    /* JADX INFO: renamed from: e */
    public boolean f12195e = false;

    /* JADX INFO: renamed from: f */
    public boolean f12196f = true;

    /* JADX INFO: renamed from: a */
    public final int f12191a = t100.d(100.0f);

    public qbl0(Context context, obl0 obl0Var, boolean z) {
        this.f12193c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f12194d = obl0Var;
        this.f12202l = new sbl0(context);
        this.f12203m = z;
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
    public boolean m13501a(MotionEvent motionEvent) {
        float rawY;
        boolean z;
        boolean z2;
        obl0 obl0Var;
        this.f12202l.m14118a(motionEvent);
        int iC = ky00.c(motionEvent);
        if (iC == 1) {
            if (this.f12197g != 0.0f && this.f12198h == 0.0f) {
                return false;
            }
            this.f12199i = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f12200j = rawY;
            if (rawY - this.f12198h <= this.f12191a || this.f12202l.m14122e()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f12203m || this.f12199i - this.f12197g <= this.f12192b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                this.f12194d.m12524m(true);
            } else {
                obl0Var = this.f12194d;
                if (z2) {
                    obl0Var.m12515d();
                } else {
                    obl0Var.m12524m(false);
                }
            }
            this.f12201k.requestDisallowInterceptTouchEvent(false);
            m13502b(false);
        } else if (iC != 2) {
            if (iC == 3) {
                if (this.f12197g != 0.0f) {
                }
                this.f12199i = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f12200j = rawY;
                if (rawY - this.f12198h <= this.f12191a) {
                    z = true;
                } else {
                    z = true;
                }
                if (this.f12203m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    this.f12194d.m12524m(true);
                } else {
                    obl0Var = this.f12194d;
                    if (z2) {
                        obl0Var.m12515d();
                    } else {
                        obl0Var.m12524m(false);
                    }
                }
                this.f12201k.requestDisallowInterceptTouchEvent(false);
                m13502b(false);
            } else if (iC == 5) {
                this.f12196f = false;
            }
        } else if (this.f12196f) {
            if (this.f12197g == 0.0f) {
                this.f12197g = motionEvent.getRawX();
            }
            if (this.f12198h == 0.0f) {
                this.f12198h = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f12195e) {
                float f = this.f12198h;
                if (rawY2 - f > this.f12193c && rawY2 - f > Math.abs(rawX - this.f12197g)) {
                    this.f12195e = true;
                } else if (this.f12203m && rawX - this.f12197g > this.f12193c) {
                    this.f12195e = true;
                }
            } else if (this.f12203m) {
                this.f12195e = true;
            }
            if (this.f12195e) {
                this.f12201k.requestDisallowInterceptTouchEvent(true);
                this.f12194d.m12523l(rawX - this.f12197g, rawY2 - this.f12198h);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m13502b(boolean z) {
        this.f12196f = true;
        this.f12197g = 0.0f;
        this.f12198h = 0.0f;
        this.f12195e = false;
        this.f12202l.m14120c();
        if (z) {
            this.f12194d.m12524m(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m13503c(ViewParent viewParent) {
        this.f12201k = viewParent;
    }
}
