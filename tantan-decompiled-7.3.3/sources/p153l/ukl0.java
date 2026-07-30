package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes13.dex */
public class ukl0 {

    /* JADX INFO: renamed from: c */
    public final float f179427c;

    /* JADX INFO: renamed from: d */
    public skl0 f179428d;

    /* JADX INFO: renamed from: g */
    public float f179431g;

    /* JADX INFO: renamed from: h */
    public float f179432h;

    /* JADX INFO: renamed from: i */
    public float f179433i;

    /* JADX INFO: renamed from: j */
    public float f179434j;

    /* JADX INFO: renamed from: k */
    public ViewParent f179435k;

    /* JADX INFO: renamed from: l */
    public wkl0 f179436l;

    /* JADX INFO: renamed from: m */
    public boolean f179437m;

    /* JADX INFO: renamed from: b */
    public final int f179426b = qa00.m175859d(50.0f);

    /* JADX INFO: renamed from: e */
    public boolean f179429e = false;

    /* JADX INFO: renamed from: f */
    public boolean f179430f = true;

    /* JADX INFO: renamed from: a */
    public final int f179425a = qa00.m175859d(100.0f);

    public ukl0(Context context, skl0 skl0Var, boolean z) {
        this.f179427c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f179428d = skl0Var;
        this.f179436l = new wkl0(context);
        this.f179437m = z;
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
    public boolean m196504a(MotionEvent motionEvent) {
        float rawY;
        boolean z;
        boolean z2;
        skl0 skl0Var;
        this.f179436l.m206843a(motionEvent);
        int iM194643c = u610.m194643c(motionEvent);
        if (iM194643c == 1) {
            if (this.f179431g != 0.0f && this.f179432h == 0.0f) {
                return false;
            }
            this.f179433i = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f179434j = rawY;
            if (rawY - this.f179432h <= this.f179425a || this.f179436l.m206847e()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f179437m || this.f179433i - this.f179431g <= this.f179426b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                this.f179428d.m186532m(true);
            } else {
                skl0Var = this.f179428d;
                if (z2) {
                    skl0Var.m186523d();
                } else {
                    skl0Var.m186532m(false);
                }
            }
            this.f179435k.requestDisallowInterceptTouchEvent(false);
            m196505b(false);
        } else if (iM194643c != 2) {
            if (iM194643c == 3) {
                if (this.f179431g != 0.0f) {
                }
                this.f179433i = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f179434j = rawY;
                if (rawY - this.f179432h <= this.f179425a) {
                    z = true;
                } else {
                    z = true;
                }
                if (this.f179437m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    this.f179428d.m186532m(true);
                } else {
                    skl0Var = this.f179428d;
                    if (z2) {
                        skl0Var.m186523d();
                    } else {
                        skl0Var.m186532m(false);
                    }
                }
                this.f179435k.requestDisallowInterceptTouchEvent(false);
                m196505b(false);
            } else if (iM194643c == 5) {
                this.f179430f = false;
            }
        } else if (this.f179430f) {
            if (this.f179431g == 0.0f) {
                this.f179431g = motionEvent.getRawX();
            }
            if (this.f179432h == 0.0f) {
                this.f179432h = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f179429e) {
                float f = this.f179432h;
                if (rawY2 - f > this.f179427c && rawY2 - f > Math.abs(rawX - this.f179431g)) {
                    this.f179429e = true;
                } else if (this.f179437m && rawX - this.f179431g > this.f179427c) {
                    this.f179429e = true;
                }
            } else if (this.f179437m) {
                this.f179429e = true;
            }
            if (this.f179429e) {
                this.f179435k.requestDisallowInterceptTouchEvent(true);
                this.f179428d.m186531l(rawX - this.f179431g, rawY2 - this.f179432h);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m196505b(boolean z) {
        this.f179430f = true;
        this.f179431g = 0.0f;
        this.f179432h = 0.0f;
        this.f179429e = false;
        this.f179436l.m206845c();
        if (z) {
            this.f179428d.m186532m(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m196506c(ViewParent viewParent) {
        this.f179435k = viewParent;
    }
}
