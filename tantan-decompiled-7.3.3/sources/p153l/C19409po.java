package p153l;

import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.po */
/* JADX INFO: loaded from: classes9.dex */
public class C19409po {

    /* JADX INFO: renamed from: b */
    public int f153344b;

    /* JADX INFO: renamed from: c */
    public int f153345c;

    /* JADX INFO: renamed from: d */
    public int f153346d;

    /* JADX INFO: renamed from: g */
    public float f153349g;

    /* JADX INFO: renamed from: h */
    public float f153350h;

    /* JADX INFO: renamed from: i */
    public a f153351i;

    /* JADX INFO: renamed from: a */
    public boolean f153343a = false;

    /* JADX INFO: renamed from: e */
    public float f153347e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f153348f = -1.0f;

    /* JADX INFO: renamed from: l.po$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo29869a(float f);

        /* JADX INFO: renamed from: b */
        void mo29870b(float f);

        /* JADX INFO: renamed from: c */
        void mo29871c(boolean z, float f);

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m173087a(float f, float f2) {
        float f3 = f - this.f153347e;
        float f4 = f2 - this.f153348f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f153345c || !NullChecker.m82486a(this.f153351i)) {
            return;
        }
        this.f153351i.mo29871c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m173088b(float f, float f2) {
        float f3 = f - this.f153347e;
        float f4 = f2 - this.f153348f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f153344b) {
            this.f153343a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m173089c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f153343a = false;
            return true;
        }
        if (action == 1) {
            if (this.f153343a) {
                m173087a(x, y);
            }
            if (NullChecker.m82486a(this.f153351i)) {
                float fM173088b = m173088b(x, y);
                int i = this.f153346d;
                if (fM173088b <= (-i) && this.f153349g > x) {
                    this.f153351i.mo29870b(fM173088b);
                } else if (fM173088b < i || this.f153349g >= x) {
                    this.f153351i.onCancel();
                } else {
                    this.f153351i.mo29870b(fM173088b);
                }
            }
            this.f153343a = false;
            this.f153347e = -1.0f;
            this.f153348f = -1.0f;
        } else if (action == 2) {
            if (this.f153347e == -1.0f) {
                this.f153347e = x;
                this.f153348f = y;
            }
            float fM173088b2 = m173088b(x, y);
            if (this.f153343a && NullChecker.m82486a(this.f153351i)) {
                this.f153351i.mo29869a(fM173088b2);
                this.f153349g = this.f153350h;
                this.f153350h = x;
            }
        }
        return this.f153343a;
    }

    /* JADX INFO: renamed from: d */
    public void m173090d(a aVar) {
        this.f153351i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m173091e(int i) {
        this.f153345c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m173092f(int i) {
        this.f153346d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m173093g(int i) {
        this.f153344b = i;
    }
}
