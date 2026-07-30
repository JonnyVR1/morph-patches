package com.p000p1.mobile.putong.core.p001ui.messages.media.widget;

import android.view.MotionEvent;
import l.t100;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0121a {

    /* JADX INFO: renamed from: b */
    public int f1740b;

    /* JADX INFO: renamed from: c */
    public int f1741c;

    /* JADX INFO: renamed from: d */
    public int f1742d;

    /* JADX INFO: renamed from: g */
    public float f1745g;

    /* JADX INFO: renamed from: h */
    public float f1746h;

    /* JADX INFO: renamed from: i */
    public a f1747i;

    /* JADX INFO: renamed from: a */
    public boolean f1739a = false;

    /* JADX INFO: renamed from: e */
    public float f1743e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f1744f = -1.0f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2318a(float f);

        /* JADX INFO: renamed from: b */
        void mo2319b(float f);

        /* JADX INFO: renamed from: c */
        void mo2320c(boolean z, float f);

        /* JADX INFO: renamed from: d */
        void mo2321d();

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m2345a(float f, float f2) {
        a aVar;
        float f3 = f - this.f1743e;
        float f4 = f2 - this.f1744f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f1741c || (aVar = this.f1747i) == null) {
            return;
        }
        aVar.mo2320c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m2346b(float f, float f2) {
        float f3 = f - this.f1743e;
        float f4 = f2 - this.f1744f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f1740b) {
            this.f1739a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2347c(MotionEvent motionEvent) {
        a aVar;
        if (motionEvent.getPointerCount() == 2) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1739a = false;
            return true;
        }
        if (action == 1) {
            if (this.f1739a) {
                m2345a(x, y);
            }
            if (this.f1747i != null) {
                if (!this.f1739a && y - this.f1744f > t100.d(80.0f) && this.f1744f != -1.0f) {
                    this.f1747i.mo2321d();
                }
                float fM2346b = m2346b(x, y);
                int i = this.f1742d;
                if (fM2346b <= (-i) && this.f1745g > x) {
                    this.f1747i.mo2319b(fM2346b);
                } else if (fM2346b < i || this.f1745g >= x) {
                    this.f1747i.onCancel();
                } else {
                    this.f1747i.mo2319b(fM2346b);
                }
            }
            this.f1739a = false;
            this.f1743e = -1.0f;
            this.f1744f = -1.0f;
        } else if (action == 2) {
            if (this.f1743e == -1.0f) {
                this.f1743e = x;
                this.f1744f = y;
            }
            float fM2346b2 = m2346b(x, y);
            if (this.f1739a && (aVar = this.f1747i) != null) {
                aVar.mo2318a(fM2346b2);
                this.f1745g = this.f1746h;
                this.f1746h = x;
            }
        }
        return this.f1739a;
    }

    /* JADX INFO: renamed from: d */
    public void m2348d(a aVar) {
        this.f1747i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m2349e(int i) {
        this.f1741c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m2350f(int i) {
        this.f1742d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m2351g(int i) {
        this.f1740b = i;
    }
}
