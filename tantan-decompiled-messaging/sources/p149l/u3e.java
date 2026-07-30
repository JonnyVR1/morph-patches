package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class u3e {

    /* JADX INFO: renamed from: a */
    public float f173595a;

    /* JADX INFO: renamed from: b */
    public float f173596b;

    /* JADX INFO: renamed from: c */
    public float f173597c;

    /* JADX INFO: renamed from: d */
    public float f173598d;

    /* JADX INFO: renamed from: g */
    public final float f173601g;

    /* JADX INFO: renamed from: h */
    public sd50 f173602h;

    /* JADX INFO: renamed from: f */
    public boolean f173600f = false;

    /* JADX INFO: renamed from: i */
    public boolean f173603i = true;

    /* JADX INFO: renamed from: e */
    public final int f173599e = t100.m186890d(100.0f);

    public u3e(sd50 sd50Var, Context context) {
        this.f173602h = sd50Var;
        this.f173601g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo123845a() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX INFO: renamed from: b */
    public boolean mo123846b(MotionEvent motionEvent) {
        float rawY;
        int iM147817c = ky00.m147817c(motionEvent);
        if (iM147817c == 1) {
            this.f173597c = motionEvent.getRawX();
            rawY = motionEvent.getRawY();
            this.f173598d = rawY;
            if (rawY - this.f173596b <= this.f173599e || mo123845a()) {
                this.f173602h.mo152789e(true);
            } else {
                this.f173602h.mo152789e(false);
            }
            mo123847c(false);
        } else if (iM147817c != 2) {
            if (iM147817c == 3) {
                this.f173597c = motionEvent.getRawX();
                rawY = motionEvent.getRawY();
                this.f173598d = rawY;
                if (rawY - this.f173596b <= this.f173599e) {
                    this.f173602h.mo152789e(true);
                } else {
                    this.f173602h.mo152789e(true);
                }
                mo123847c(false);
            } else if (iM147817c == 5) {
                this.f173603i = false;
            }
        } else if (this.f173603i) {
            if (this.f173595a == 0.0f) {
                this.f173595a = motionEvent.getRawX();
            }
            if (this.f173596b == 0.0f) {
                this.f173596b = motionEvent.getRawY();
            }
            float rawX = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (!this.f173600f) {
                float f = this.f173596b;
                if (rawY2 - f > this.f173601g && rawY2 - f > Math.abs(rawX - this.f173595a)) {
                    this.f173600f = true;
                }
            }
            if (this.f173600f) {
                this.f173602h.mo152784a(rawX - this.f173595a, rawY2 - this.f173596b);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void mo123847c(boolean z) {
        this.f173603i = true;
        this.f173595a = 0.0f;
        this.f173596b = 0.0f;
        this.f173600f = false;
        if (z) {
            this.f173602h.mo152789e(false);
        }
    }
}
