package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public class vkl0 {

    /* JADX INFO: renamed from: c */
    public final float f184497c;

    /* JADX INFO: renamed from: d */
    public tkl0 f184498d;

    /* JADX INFO: renamed from: g */
    public float f184501g;

    /* JADX INFO: renamed from: h */
    public float f184502h;

    /* JADX INFO: renamed from: i */
    public float f184503i;

    /* JADX INFO: renamed from: j */
    public float f184504j;

    /* JADX INFO: renamed from: k */
    public ViewParent f184505k;

    /* JADX INFO: renamed from: l */
    public xkl0 f184506l;

    /* JADX INFO: renamed from: m */
    public boolean f184507m;

    /* JADX INFO: renamed from: b */
    public final int f184496b = qa00.m175859d(50.0f);

    /* JADX INFO: renamed from: e */
    public boolean f184499e = false;

    /* JADX INFO: renamed from: f */
    public boolean f184500f = true;

    /* JADX INFO: renamed from: a */
    public final int f184495a = qa00.m175859d(100.0f);

    public vkl0(Context context, tkl0 tkl0Var, boolean z) {
        this.f184497c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f184498d = tkl0Var;
        this.f184506l = new xkl0(context);
        this.f184507m = z;
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
    public boolean m201570a(MotionEvent motionEvent) {
        float rawY;
        boolean z;
        boolean z2;
        tkl0 tkl0Var;
        this.f184506l.m211403a(motionEvent);
        int iM194643c = u610.m194643c(motionEvent);
        if (iM194643c == 1) {
            if (this.f184501g != 0.0f && this.f184502h == 0.0f) {
                return false;
            }
            this.f184503i = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f184504j = rawY;
            if (rawY - this.f184502h <= this.f184495a || this.f184506l.m211407e()) {
                z = true;
            } else {
                z = false;
            }
            if (this.f184507m || this.f184503i - this.f184501g <= this.f184496b) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z) {
                this.f184498d.m191577m(true);
            } else {
                tkl0Var = this.f184498d;
                if (z2) {
                    tkl0Var.m191568d();
                } else {
                    tkl0Var.m191577m(false);
                }
            }
            this.f184505k.requestDisallowInterceptTouchEvent(false);
            m201571b(false);
        } else if (iM194643c != 2) {
            if (iM194643c == 3) {
                if (this.f184501g != 0.0f) {
                }
                this.f184503i = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f184504j = rawY;
                if (rawY - this.f184502h <= this.f184495a) {
                    z = true;
                } else {
                    z = true;
                }
                if (this.f184507m) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z) {
                    this.f184498d.m191577m(true);
                } else {
                    tkl0Var = this.f184498d;
                    if (z2) {
                        tkl0Var.m191568d();
                    } else {
                        tkl0Var.m191577m(false);
                    }
                }
                this.f184505k.requestDisallowInterceptTouchEvent(false);
                m201571b(false);
            } else if (iM194643c == 5) {
                this.f184500f = false;
            }
        } else if (this.f184500f) {
            if (this.f184501g == 0.0f) {
                this.f184501g = motionEvent.getRawX();
            }
            if (this.f184502h == 0.0f) {
                this.f184502h = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f184499e) {
                float f = this.f184502h;
                if (rawY2 - f > this.f184497c && rawY2 - f > Math.abs(rawX - this.f184501g)) {
                    this.f184499e = true;
                } else if (this.f184507m && rawX - this.f184501g > this.f184497c) {
                    this.f184499e = true;
                }
            } else if (this.f184507m) {
                this.f184499e = true;
            }
            if (this.f184499e) {
                this.f184505k.requestDisallowInterceptTouchEvent(true);
                this.f184498d.m191576l(rawX - this.f184501g, rawY2 - this.f184502h);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m201571b(boolean z) {
        this.f184500f = true;
        this.f184501g = 0.0f;
        this.f184502h = 0.0f;
        this.f184499e = false;
        this.f184506l.m211405c();
        if (z) {
            this.f184498d.m191577m(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m201572c(ViewParent viewParent) {
        this.f184505k = viewParent;
    }
}
