package p006l;

import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.uo */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C1352uo {

    /* JADX INFO: renamed from: b */
    public int f23676b;

    /* JADX INFO: renamed from: c */
    public int f23677c;

    /* JADX INFO: renamed from: d */
    public int f23678d;

    /* JADX INFO: renamed from: g */
    public float f23681g;

    /* JADX INFO: renamed from: h */
    public float f23682h;

    /* JADX INFO: renamed from: i */
    public a f23683i;

    /* JADX INFO: renamed from: a */
    public boolean f23675a = false;

    /* JADX INFO: renamed from: e */
    public float f23679e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f23680f = -1.0f;

    /* JADX INFO: renamed from: l.uo$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo776a(float f);

        /* JADX INFO: renamed from: b */
        void mo777b(float f);

        /* JADX INFO: renamed from: c */
        void mo778c(boolean z, float f);

        void onCancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m25297a(float f, float f2) {
        float f3 = f - this.f23679e;
        float f4 = f2 - this.f23680f;
        float fAbs = Math.abs(f3);
        if (fAbs <= Math.abs(f4) || fAbs <= this.f23677c || !NullChecker.a(this.f23683i)) {
            return;
        }
        this.f23683i.mo778c(f3 < 0.0f, fAbs);
    }

    /* JADX INFO: renamed from: b */
    public final float m25298b(float f, float f2) {
        float f3 = f - this.f23679e;
        float f4 = f2 - this.f23680f;
        float fAbs = Math.abs(f3);
        if (fAbs > Math.abs(f4) && fAbs > this.f23676b) {
            this.f23675a = true;
        }
        return f3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m25299c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23675a = false;
            return true;
        }
        if (action == 1) {
            if (this.f23675a) {
                m25297a(x, y);
            }
            if (NullChecker.a(this.f23683i)) {
                float fM25298b = m25298b(x, y);
                int i = this.f23678d;
                if (fM25298b <= (-i) && this.f23681g > x) {
                    this.f23683i.mo777b(fM25298b);
                } else if (fM25298b < i || this.f23681g >= x) {
                    this.f23683i.onCancel();
                } else {
                    this.f23683i.mo777b(fM25298b);
                }
            }
            this.f23675a = false;
            this.f23679e = -1.0f;
            this.f23680f = -1.0f;
        } else if (action == 2) {
            if (this.f23679e == -1.0f) {
                this.f23679e = x;
                this.f23680f = y;
            }
            float fM25298b2 = m25298b(x, y);
            if (this.f23675a && NullChecker.a(this.f23683i)) {
                this.f23683i.mo776a(fM25298b2);
                this.f23681g = this.f23682h;
                this.f23682h = x;
            }
        }
        return this.f23675a;
    }

    /* JADX INFO: renamed from: d */
    public void m25300d(a aVar) {
        this.f23683i = aVar;
    }

    /* JADX INFO: renamed from: e */
    public void m25301e(int i) {
        this.f23677c = i;
    }

    /* JADX INFO: renamed from: f */
    public void m25302f(int i) {
        this.f23678d = i;
    }

    /* JADX INFO: renamed from: g */
    public void m25303g(int i) {
        this.f23676b = i;
    }
}
