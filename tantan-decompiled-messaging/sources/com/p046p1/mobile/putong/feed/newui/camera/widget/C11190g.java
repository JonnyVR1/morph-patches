package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.g */
/* JADX INFO: loaded from: classes12.dex */
public class C11190g {

    /* JADX INFO: renamed from: b */
    public int f39886b;

    /* JADX INFO: renamed from: c */
    public int f39887c;

    /* JADX INFO: renamed from: d */
    public int f39888d;

    /* JADX INFO: renamed from: g */
    public float f39891g;

    /* JADX INFO: renamed from: h */
    public float f39892h;

    /* JADX INFO: renamed from: i */
    public a f39893i;

    /* JADX INFO: renamed from: a */
    public boolean f39885a = false;

    /* JADX INFO: renamed from: e */
    public float f39889e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f39890f = -1.0f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo61600a(float f);

        /* JADX INFO: renamed from: b */
        void mo61601b(float f);

        /* JADX INFO: renamed from: c */
        void mo61602c(boolean z, float f);

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m61813a(float f, float f2) {
        float f3 = f - this.f39889e;
        float f4 = f2 - this.f39890f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f39887c || !NullChecker.m81303a(this.f39893i)) {
            return;
        }
        this.f39893i.mo61602c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m61814b(float f, float f2) {
        float f3 = f - this.f39889e;
        float f4 = f2 - this.f39890f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f39886b) {
            this.f39885a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m61815c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f39885a = false;
            return true;
        }
        if (action == 1) {
            if (this.f39885a) {
                m61813a(x, y);
            }
            if (NullChecker.m81303a(this.f39893i)) {
                float fM61814b = m61814b(x, y);
                int i = this.f39888d;
                if (fM61814b <= (-i) && this.f39891g > x) {
                    this.f39893i.mo61601b(fM61814b);
                } else if (fM61814b < i || this.f39891g >= x) {
                    this.f39893i.onCancel();
                } else {
                    this.f39893i.mo61601b(fM61814b);
                }
            }
            this.f39885a = false;
            this.f39889e = -1.0f;
            this.f39890f = -1.0f;
        } else if (action == 2) {
            if (this.f39889e == -1.0f) {
                this.f39889e = x;
                this.f39890f = y;
            }
            float fM61814b2 = m61814b(x, y);
            if (this.f39885a && NullChecker.m81303a(this.f39893i)) {
                this.f39893i.mo61600a(fM61814b2);
                this.f39891g = this.f39892h;
                this.f39892h = x;
            }
        }
        return this.f39885a;
    }

    /* JADX INFO: renamed from: d */
    public void m61816d(a aVar) {
        this.f39893i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m61817e(int i) {
        this.f39887c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m61818f(int i) {
        this.f39888d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m61819g(int i) {
        this.f39886b = i;
    }
}
