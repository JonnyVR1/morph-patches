package com.p046p1.mobile.putong.core.p053ui.messages.media.widget;

import android.view.MotionEvent;
import p149l.t100;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8538a {

    /* JADX INFO: renamed from: b */
    public int f31849b;

    /* JADX INFO: renamed from: c */
    public int f31850c;

    /* JADX INFO: renamed from: d */
    public int f31851d;

    /* JADX INFO: renamed from: g */
    public float f31854g;

    /* JADX INFO: renamed from: h */
    public float f31855h;

    /* JADX INFO: renamed from: i */
    public a f31856i;

    /* JADX INFO: renamed from: a */
    public boolean f31848a = false;

    /* JADX INFO: renamed from: e */
    public float f31852e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f31853f = -1.0f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo49199a(float f);

        /* JADX INFO: renamed from: b */
        void mo49200b(float f);

        /* JADX INFO: renamed from: c */
        void mo49201c(boolean z, float f);

        /* JADX INFO: renamed from: d */
        void mo49202d();

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m49226a(float f, float f2) {
        a aVar;
        float f3 = f - this.f31852e;
        float f4 = f2 - this.f31853f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f31850c || (aVar = this.f31856i) == null) {
            return;
        }
        aVar.mo49201c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m49227b(float f, float f2) {
        float f3 = f - this.f31852e;
        float f4 = f2 - this.f31853f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f31849b) {
            this.f31848a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m49228c(MotionEvent motionEvent) {
        a aVar;
        if (motionEvent.getPointerCount() == 2) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31848a = false;
            return true;
        }
        if (action == 1) {
            if (this.f31848a) {
                m49226a(x, y);
            }
            if (this.f31856i != null) {
                if (!this.f31848a && y - this.f31853f > t100.m186890d(80.0f) && this.f31853f != -1.0f) {
                    this.f31856i.mo49202d();
                }
                float fM49227b = m49227b(x, y);
                int i = this.f31851d;
                if (fM49227b <= (-i) && this.f31854g > x) {
                    this.f31856i.mo49200b(fM49227b);
                } else if (fM49227b < i || this.f31854g >= x) {
                    this.f31856i.onCancel();
                } else {
                    this.f31856i.mo49200b(fM49227b);
                }
            }
            this.f31848a = false;
            this.f31852e = -1.0f;
            this.f31853f = -1.0f;
        } else if (action == 2) {
            if (this.f31852e == -1.0f) {
                this.f31852e = x;
                this.f31853f = y;
            }
            float fM49227b2 = m49227b(x, y);
            if (this.f31848a && (aVar = this.f31856i) != null) {
                aVar.mo49199a(fM49227b2);
                this.f31854g = this.f31855h;
                this.f31855h = x;
            }
        }
        return this.f31848a;
    }

    /* JADX INFO: renamed from: d */
    public void m49229d(a aVar) {
        this.f31856i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m49230e(int i) {
        this.f31850c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m49231f(int i) {
        this.f31851d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m49232g(int i) {
        this.f31849b = i;
    }
}
