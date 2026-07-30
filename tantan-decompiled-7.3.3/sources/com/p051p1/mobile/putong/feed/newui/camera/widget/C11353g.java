package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.g */
/* JADX INFO: loaded from: classes13.dex */
public class C11353g {

    /* JADX INFO: renamed from: b */
    public int f40734b;

    /* JADX INFO: renamed from: c */
    public int f40735c;

    /* JADX INFO: renamed from: d */
    public int f40736d;

    /* JADX INFO: renamed from: g */
    public float f40739g;

    /* JADX INFO: renamed from: h */
    public float f40740h;

    /* JADX INFO: renamed from: i */
    public a f40741i;

    /* JADX INFO: renamed from: a */
    public boolean f40733a = false;

    /* JADX INFO: renamed from: e */
    public float f40737e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f40738f = -1.0f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo62784a(float f);

        /* JADX INFO: renamed from: b */
        void mo62785b(float f);

        /* JADX INFO: renamed from: c */
        void mo62786c(boolean z, float f);

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m62996a(float f, float f2) {
        float f3 = f - this.f40737e;
        float f4 = f2 - this.f40738f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f40735c || !NullChecker.m82486a(this.f40741i)) {
            return;
        }
        this.f40741i.mo62786c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m62997b(float f, float f2) {
        float f3 = f - this.f40737e;
        float f4 = f2 - this.f40738f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f40734b) {
            this.f40733a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m62998c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f40733a = false;
            return true;
        }
        if (action == 1) {
            if (this.f40733a) {
                m62996a(x, y);
            }
            if (NullChecker.m82486a(this.f40741i)) {
                float fM62997b = m62997b(x, y);
                int i = this.f40736d;
                if (fM62997b <= (-i) && this.f40739g > x) {
                    this.f40741i.mo62785b(fM62997b);
                } else if (fM62997b < i || this.f40739g >= x) {
                    this.f40741i.onCancel();
                } else {
                    this.f40741i.mo62785b(fM62997b);
                }
            }
            this.f40733a = false;
            this.f40737e = -1.0f;
            this.f40738f = -1.0f;
        } else if (action == 2) {
            if (this.f40737e == -1.0f) {
                this.f40737e = x;
                this.f40738f = y;
            }
            float fM62997b2 = m62997b(x, y);
            if (this.f40733a && NullChecker.m82486a(this.f40741i)) {
                this.f40741i.mo62784a(fM62997b2);
                this.f40739g = this.f40740h;
                this.f40740h = x;
            }
        }
        return this.f40733a;
    }

    /* JADX INFO: renamed from: d */
    public void m62999d(a aVar) {
        this.f40741i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m63000e(int i) {
        this.f40735c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m63001f(int i) {
        this.f40736d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m63002g(int i) {
        this.f40734b = i;
    }
}
