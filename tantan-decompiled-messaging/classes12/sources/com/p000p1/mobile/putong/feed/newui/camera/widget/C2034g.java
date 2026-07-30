package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2034g {

    /* JADX INFO: renamed from: b */
    public int f1347b;

    /* JADX INFO: renamed from: c */
    public int f1348c;

    /* JADX INFO: renamed from: d */
    public int f1349d;

    /* JADX INFO: renamed from: g */
    public float f1352g;

    /* JADX INFO: renamed from: h */
    public float f1353h;

    /* JADX INFO: renamed from: i */
    public a f1354i;

    /* JADX INFO: renamed from: a */
    public boolean f1346a = false;

    /* JADX INFO: renamed from: e */
    public float f1350e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f1351f = -1.0f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2552a(float f);

        /* JADX INFO: renamed from: b */
        void mo2553b(float f);

        /* JADX INFO: renamed from: c */
        void mo2554c(boolean z, float f);

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m2777a(float f, float f2) {
        float f3 = f - this.f1350e;
        float f4 = f2 - this.f1351f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f1348c || !NullChecker.a(this.f1354i)) {
            return;
        }
        this.f1354i.mo2554c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m2778b(float f, float f2) {
        float f3 = f - this.f1350e;
        float f4 = f2 - this.f1351f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f1347b) {
            this.f1346a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2779c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1346a = false;
            return true;
        }
        if (action == 1) {
            if (this.f1346a) {
                m2777a(x, y);
            }
            if (NullChecker.a(this.f1354i)) {
                float fM2778b = m2778b(x, y);
                int i = this.f1349d;
                if (fM2778b <= (-i) && this.f1352g > x) {
                    this.f1354i.mo2553b(fM2778b);
                } else if (fM2778b < i || this.f1352g >= x) {
                    this.f1354i.onCancel();
                } else {
                    this.f1354i.mo2553b(fM2778b);
                }
            }
            this.f1346a = false;
            this.f1350e = -1.0f;
            this.f1351f = -1.0f;
        } else if (action == 2) {
            if (this.f1350e == -1.0f) {
                this.f1350e = x;
                this.f1351f = y;
            }
            float fM2778b2 = m2778b(x, y);
            if (this.f1346a && NullChecker.a(this.f1354i)) {
                this.f1354i.mo2552a(fM2778b2);
                this.f1352g = this.f1353h;
                this.f1353h = x;
            }
        }
        return this.f1346a;
    }

    /* JADX INFO: renamed from: d */
    public void m2780d(a aVar) {
        this.f1354i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m2781e(int i) {
        this.f1348c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m2782f(int i) {
        this.f1349d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m2783g(int i) {
        this.f1347b = i;
    }
}
