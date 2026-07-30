package com.p051p1.mobile.putong.core.p058ui.messages.media.widget;

import android.view.MotionEvent;
import p153l.qa00;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8701a {

    /* JADX INFO: renamed from: b */
    public int f32697b;

    /* JADX INFO: renamed from: c */
    public int f32698c;

    /* JADX INFO: renamed from: d */
    public int f32699d;

    /* JADX INFO: renamed from: g */
    public float f32702g;

    /* JADX INFO: renamed from: h */
    public float f32703h;

    /* JADX INFO: renamed from: i */
    public a f32704i;

    /* JADX INFO: renamed from: a */
    public boolean f32696a = false;

    /* JADX INFO: renamed from: e */
    public float f32700e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f32701f = -1.0f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo50382a(float f);

        /* JADX INFO: renamed from: b */
        void mo50383b(float f);

        /* JADX INFO: renamed from: c */
        void mo50384c(boolean z, float f);

        /* JADX INFO: renamed from: d */
        void mo50385d();

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m50409a(float f, float f2) {
        a aVar;
        float f3 = f - this.f32700e;
        float f4 = f2 - this.f32701f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f32698c || (aVar = this.f32704i) == null) {
            return;
        }
        aVar.mo50384c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m50410b(float f, float f2) {
        float f3 = f - this.f32700e;
        float f4 = f2 - this.f32701f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f32697b) {
            this.f32696a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m50411c(MotionEvent motionEvent) {
        a aVar;
        if (motionEvent.getPointerCount() == 2) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32696a = false;
            return true;
        }
        if (action == 1) {
            if (this.f32696a) {
                m50409a(x, y);
            }
            if (this.f32704i != null) {
                if (!this.f32696a && y - this.f32701f > qa00.m175859d(80.0f) && this.f32701f != -1.0f) {
                    this.f32704i.mo50385d();
                }
                float fM50410b = m50410b(x, y);
                int i = this.f32699d;
                if (fM50410b <= (-i) && this.f32702g > x) {
                    this.f32704i.mo50383b(fM50410b);
                } else if (fM50410b < i || this.f32702g >= x) {
                    this.f32704i.onCancel();
                } else {
                    this.f32704i.mo50383b(fM50410b);
                }
            }
            this.f32696a = false;
            this.f32700e = -1.0f;
            this.f32701f = -1.0f;
        } else if (action == 2) {
            if (this.f32700e == -1.0f) {
                this.f32700e = x;
                this.f32701f = y;
            }
            float fM50410b2 = m50410b(x, y);
            if (this.f32696a && (aVar = this.f32704i) != null) {
                aVar.mo50382a(fM50410b2);
                this.f32702g = this.f32703h;
                this.f32703h = x;
            }
        }
        return this.f32696a;
    }

    /* JADX INFO: renamed from: d */
    public void m50412d(a aVar) {
        this.f32704i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m50413e(int i) {
        this.f32698c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m50414f(int i) {
        this.f32699d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m50415g(int i) {
        this.f32697b = i;
    }
}
