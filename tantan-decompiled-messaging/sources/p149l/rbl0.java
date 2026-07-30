package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public class rbl0 {

    /* JADX INFO: renamed from: c */
    public final float f158633c;

    /* JADX INFO: renamed from: d */
    public pbl0 f158634d;

    /* JADX INFO: renamed from: g */
    public float f158637g;

    /* JADX INFO: renamed from: h */
    public float f158638h;

    /* JADX INFO: renamed from: i */
    public float f158639i;

    /* JADX INFO: renamed from: j */
    public float f158640j;

    /* JADX INFO: renamed from: k */
    public ViewParent f158641k;

    /* JADX INFO: renamed from: l */
    public tbl0 f158642l;

    /* JADX INFO: renamed from: m */
    public boolean f158643m;

    /* JADX INFO: renamed from: b */
    public final int f158632b = t100.m186890d(50.0f);

    /* JADX INFO: renamed from: e */
    public boolean f158635e = false;

    /* JADX INFO: renamed from: f */
    public boolean f158636f = true;

    /* JADX INFO: renamed from: a */
    public final int f158631a = t100.m186890d(100.0f);

    public rbl0(Context context, pbl0 pbl0Var, boolean z) {
        this.f158633c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f158634d = pbl0Var;
        this.f158642l = new tbl0(context);
        this.f158643m = z;
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
    public boolean m178615a(MotionEvent motionEvent) {
        float rawY;
        boolean z;
        boolean z2;
        pbl0 pbl0Var;
        this.f158642l.m187878a(motionEvent);
        int iM147817c = ky00.m147817c(motionEvent);
        if (iM147817c == 1) {
            if (this.f158637g != 0.0f && this.f158638h == 0.0f) {
                return false;
            }
            this.f158639i = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f158640j = rawY;
            if (rawY - this.f158638h <= this.f158631a || this.f158642l.m187882e()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f158643m || this.f158639i - this.f158637g <= this.f158632b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                this.f158634d.m168238m(true);
            } else {
                pbl0Var = this.f158634d;
                if (z2) {
                    pbl0Var.m168229d();
                } else {
                    pbl0Var.m168238m(false);
                }
            }
            this.f158641k.requestDisallowInterceptTouchEvent(false);
            m178616b(false);
        } else if (iM147817c != 2) {
            if (iM147817c == 3) {
                if (this.f158637g != 0.0f) {
                }
                this.f158639i = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f158640j = rawY;
                if (rawY - this.f158638h <= this.f158631a) {
                    z = true;
                } else {
                    z = true;
                }
                if (this.f158643m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    this.f158634d.m168238m(true);
                } else {
                    pbl0Var = this.f158634d;
                    if (z2) {
                        pbl0Var.m168229d();
                    } else {
                        pbl0Var.m168238m(false);
                    }
                }
                this.f158641k.requestDisallowInterceptTouchEvent(false);
                m178616b(false);
            } else if (iM147817c == 5) {
                this.f158636f = false;
            }
        } else if (this.f158636f) {
            if (this.f158637g == 0.0f) {
                this.f158637g = motionEvent.getRawX();
            }
            if (this.f158638h == 0.0f) {
                this.f158638h = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f158635e) {
                float f = this.f158638h;
                if (rawY2 - f > this.f158633c && rawY2 - f > Math.abs(rawX - this.f158637g)) {
                    this.f158635e = true;
                } else if (this.f158643m && rawX - this.f158637g > this.f158633c) {
                    this.f158635e = true;
                }
            } else if (this.f158643m) {
                this.f158635e = true;
            }
            if (this.f158635e) {
                this.f158641k.requestDisallowInterceptTouchEvent(true);
                this.f158634d.m168237l(rawX - this.f158637g, rawY2 - this.f158638h);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m178616b(boolean z) {
        this.f158636f = true;
        this.f158637g = 0.0f;
        this.f158638h = 0.0f;
        this.f158635e = false;
        this.f158642l.m187880c();
        if (z) {
            this.f158634d.m168238m(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m178617c(ViewParent viewParent) {
        this.f158641k = viewParent;
    }
}
