package p149l;

import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.uo */
/* JADX INFO: loaded from: classes9.dex */
public class C20469uo {

    /* JADX INFO: renamed from: b */
    public int f177477b;

    /* JADX INFO: renamed from: c */
    public int f177478c;

    /* JADX INFO: renamed from: d */
    public int f177479d;

    /* JADX INFO: renamed from: g */
    public float f177482g;

    /* JADX INFO: renamed from: h */
    public float f177483h;

    /* JADX INFO: renamed from: i */
    public a f177484i;

    /* JADX INFO: renamed from: a */
    public boolean f177476a = false;

    /* JADX INFO: renamed from: e */
    public float f177480e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f177481f = -1.0f;

    /* JADX INFO: renamed from: l.uo$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo28870a(float f);

        /* JADX INFO: renamed from: b */
        void mo28871b(float f);

        /* JADX INFO: renamed from: c */
        void mo28872c(boolean z, float f);

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m194533a(float f, float f2) {
        float f3 = f - this.f177480e;
        float f4 = f2 - this.f177481f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f177478c || !NullChecker.m81303a(this.f177484i)) {
            return;
        }
        this.f177484i.mo28872c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m194534b(float f, float f2) {
        float f3 = f - this.f177480e;
        float f4 = f2 - this.f177481f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f177477b) {
            this.f177476a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m194535c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f177476a = false;
            return true;
        }
        if (action == 1) {
            if (this.f177476a) {
                m194533a(x, y);
            }
            if (NullChecker.m81303a(this.f177484i)) {
                float fM194534b = m194534b(x, y);
                int i = this.f177479d;
                if (fM194534b <= (-i) && this.f177482g > x) {
                    this.f177484i.mo28871b(fM194534b);
                } else if (fM194534b < i || this.f177482g >= x) {
                    this.f177484i.onCancel();
                } else {
                    this.f177484i.mo28871b(fM194534b);
                }
            }
            this.f177476a = false;
            this.f177480e = -1.0f;
            this.f177481f = -1.0f;
        } else if (action == 2) {
            if (this.f177480e == -1.0f) {
                this.f177480e = x;
                this.f177481f = y;
            }
            float fM194534b2 = m194534b(x, y);
            if (this.f177476a && NullChecker.m81303a(this.f177484i)) {
                this.f177484i.mo28870a(fM194534b2);
                this.f177482g = this.f177483h;
                this.f177483h = x;
            }
        }
        return this.f177476a;
    }

    /* JADX INFO: renamed from: d */
    public void m194536d(a aVar) {
        this.f177484i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m194537e(int i) {
        this.f177478c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m194538f(int i) {
        this.f177479d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m194539g(int i) {
        this.f177477b = i;
    }
}
