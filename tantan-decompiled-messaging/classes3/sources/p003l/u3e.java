package p003l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import l.ky00;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class u3e {

    /* JADX INFO: renamed from: a */
    public float f7911a;

    /* JADX INFO: renamed from: b */
    public float f7912b;

    /* JADX INFO: renamed from: c */
    public float f7913c;

    /* JADX INFO: renamed from: d */
    public float f7914d;

    /* JADX INFO: renamed from: g */
    public final float f7917g;

    /* JADX INFO: renamed from: h */
    public sd50 f7918h;

    /* JADX INFO: renamed from: f */
    public boolean f7916f = false;

    /* JADX INFO: renamed from: i */
    public boolean f7919i = true;

    /* JADX INFO: renamed from: e */
    public final int f7915e = t100.d(100.0f);

    public u3e(sd50 sd50Var, Context context) {
        this.f7918h = sd50Var;
        this.f7917g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo7343a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX INFO: renamed from: b */
    public boolean mo7344b(MotionEvent motionEvent) {
        float rawY;
        int iC = ky00.c(motionEvent);
        if (iC == 1) {
            this.f7913c = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f7914d = rawY;
            if (rawY - this.f7912b <= this.f7915e || mo7343a()) {
                this.f7918h.mo6255e(true);
            } else {
                this.f7918h.mo6255e(false);
            }
            mo7345c(false);
        } else if (iC != 2) {
            if (iC == 3) {
                this.f7913c = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f7914d = rawY;
                if (rawY - this.f7912b <= this.f7915e) {
                    this.f7918h.mo6255e(true);
                } else {
                    this.f7918h.mo6255e(true);
                }
                mo7345c(false);
            } else if (iC == 5) {
                this.f7919i = false;
            }
        } else if (this.f7919i) {
            if (this.f7911a == 0.0f) {
                this.f7911a = motionEvent.getRawX();
            }
            if (this.f7912b == 0.0f) {
                this.f7912b = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f7916f) {
                float f = this.f7912b;
                if (rawY2 - f > this.f7917g && rawY2 - f > Math.abs(rawX - this.f7911a)) {
                    this.f7916f = true;
                }
            }
            if (this.f7916f) {
                this.f7918h.mo6250a(rawX - this.f7911a, rawY2 - this.f7912b);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo7345c(boolean z) {
        this.f7919i = true;
        this.f7911a = 0.0f;
        this.f7912b = 0.0f;
        this.f7916f = false;
        if (z) {
            this.f7918h.mo6255e(false);
        }
    }
}
