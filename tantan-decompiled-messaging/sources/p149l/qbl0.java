package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes12.dex */
public class qbl0 {

    /* JADX INFO: renamed from: c */
    public final float f153669c;

    /* JADX INFO: renamed from: d */
    public obl0 f153670d;

    /* JADX INFO: renamed from: g */
    public float f153673g;

    /* JADX INFO: renamed from: h */
    public float f153674h;

    /* JADX INFO: renamed from: i */
    public float f153675i;

    /* JADX INFO: renamed from: j */
    public float f153676j;

    /* JADX INFO: renamed from: k */
    public ViewParent f153677k;

    /* JADX INFO: renamed from: l */
    public sbl0 f153678l;

    /* JADX INFO: renamed from: m */
    public boolean f153679m;

    /* JADX INFO: renamed from: b */
    public final int f153668b = t100.m186890d(50.0f);

    /* JADX INFO: renamed from: e */
    public boolean f153671e = false;

    /* JADX INFO: renamed from: f */
    public boolean f153672f = true;

    /* JADX INFO: renamed from: a */
    public final int f153667a = t100.m186890d(100.0f);

    public qbl0(Context context, obl0 obl0Var, boolean z) {
        this.f153669c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f153670d = obl0Var;
        this.f153678l = new sbl0(context);
        this.f153679m = z;
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
    public boolean m173832a(MotionEvent motionEvent) {
        float rawY;
        boolean z;
        boolean z2;
        obl0 obl0Var;
        this.f153678l.m183228a(motionEvent);
        int iM147817c = ky00.m147817c(motionEvent);
        if (iM147817c == 1) {
            if (this.f153673g != 0.0f && this.f153674h == 0.0f) {
                return false;
            }
            this.f153675i = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f153676j = rawY;
            if (rawY - this.f153674h <= this.f153667a || this.f153678l.m183232e()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f153679m || this.f153675i - this.f153673g <= this.f153668b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                this.f153670d.m163458m(true);
            } else {
                obl0Var = this.f153670d;
                if (z2) {
                    obl0Var.m163449d();
                } else {
                    obl0Var.m163458m(false);
                }
            }
            this.f153677k.requestDisallowInterceptTouchEvent(false);
            m173833b(false);
        } else if (iM147817c != 2) {
            if (iM147817c == 3) {
                if (this.f153673g != 0.0f) {
                }
                this.f153675i = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f153676j = rawY;
                if (rawY - this.f153674h <= this.f153667a) {
                    z = true;
                } else {
                    z = true;
                }
                if (this.f153679m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    this.f153670d.m163458m(true);
                } else {
                    obl0Var = this.f153670d;
                    if (z2) {
                        obl0Var.m163449d();
                    } else {
                        obl0Var.m163458m(false);
                    }
                }
                this.f153677k.requestDisallowInterceptTouchEvent(false);
                m173833b(false);
            } else if (iM147817c == 5) {
                this.f153672f = false;
            }
        } else if (this.f153672f) {
            if (this.f153673g == 0.0f) {
                this.f153673g = motionEvent.getRawX();
            }
            if (this.f153674h == 0.0f) {
                this.f153674h = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f153671e) {
                float f = this.f153674h;
                if (rawY2 - f > this.f153669c && rawY2 - f > Math.abs(rawX - this.f153673g)) {
                    this.f153671e = true;
                } else if (this.f153679m && rawX - this.f153673g > this.f153669c) {
                    this.f153671e = true;
                }
            } else if (this.f153679m) {
                this.f153671e = true;
            }
            if (this.f153671e) {
                this.f153677k.requestDisallowInterceptTouchEvent(true);
                this.f153670d.m163457l(rawX - this.f153673g, rawY2 - this.f153674h);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m173833b(boolean z) {
        this.f153672f = true;
        this.f153673g = 0.0f;
        this.f153674h = 0.0f;
        this.f153671e = false;
        this.f153678l.m183230c();
        if (z) {
            this.f153670d.m163458m(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m173834c(ViewParent viewParent) {
        this.f153677k = viewParent;
    }
}
