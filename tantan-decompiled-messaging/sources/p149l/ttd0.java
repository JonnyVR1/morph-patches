package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import com.sunshine.engine.base.AbstractC13484a;
import com.sunshine.engine.base.AbstractC13502s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes13.dex */
public class ttd0 extends AbstractC13484a {

    /* JADX INFO: renamed from: A */
    public int f172009A;

    /* JADX INFO: renamed from: B */
    public List<r860> f172010B;

    /* JADX INFO: renamed from: C */
    public List<r860> f172011C;

    /* JADX INFO: renamed from: D */
    public List<s860> f172012D;

    /* JADX INFO: renamed from: E */
    private long f172013E;

    /* JADX INFO: renamed from: F */
    private long f172014F;

    /* JADX INFO: renamed from: G */
    private long f172015G;

    /* JADX INFO: renamed from: H */
    private gc90 f172016H;

    /* JADX INFO: renamed from: I */
    private boolean f172017I;

    /* JADX INFO: renamed from: J */
    private boolean f172018J;

    /* JADX INFO: renamed from: K */
    private long f172019K;

    /* JADX INFO: renamed from: L */
    private long f172020L;

    /* JADX WARN: Type inference failed for: r3v6, types: [T] */
    public ttd0(AbstractC13502s abstractC13502s, String str, String str2, String str3) {
        super(abstractC13502s, str, str2, str3);
        this.f172009A = 6;
        this.f172010B = new ArrayList();
        this.f172011C = new ArrayList();
        this.f172012D = new ArrayList();
        this.f172013E = -1L;
        this.f172014F = -1L;
        this.f172015G = -1L;
        this.f172016H = new gc90(Float.valueOf(0.0f), Float.valueOf(1.0f), "spring");
        this.f172017I = false;
        this.f172018J = false;
        this.f172019K = -1L;
        this.f172020L = -1L;
        uif0<Integer> uif0Var = this.f55660h;
        uif0Var.f176652b = uif0Var.f176651a;
    }

    /* JADX INFO: renamed from: l */
    private void m190600l() {
        int size;
        s860 s860Var;
        if (((this.f172017I || this.f55670r) ? this.f172009A : (int) (this.f172016H.mo125466a(m80954f()).floatValue() * this.f172009A)) <= this.f172011C.size() || !m190601n(this.f172009A - this.f172011C.size()) || (size = this.f172010B.size()) <= 0) {
            return;
        }
        r860 r860Var = this.f172010B.get(0);
        this.f172014F = xsi0.m210767h();
        if (this.f172012D.size() == 1) {
            s860Var = this.f172012D.get(0);
        } else {
            float fRandom = (float) Math.random();
            s860 s860Var2 = null;
            for (int i = 0; i < this.f172012D.size() && ((s860Var2 = this.f172012D.get(i)) == null || !xsi0.m210768i(fRandom, s860Var2.f162998c.m145364c().floatValue(), s860Var2.f162998c.m145368g().floatValue())); i++) {
            }
            s860Var = s860Var2;
        }
        if (s860Var != null) {
            s860Var.m182579a(this, r860Var);
            if (!this.f172017I && this.f55670r && size > 4) {
                r860Var.f158151f = this.f172015G - ((long) (((double) r860Var.f158150e) * Math.random()));
            }
            this.f172010B.remove(r860Var);
            this.f172011C.add(r860Var);
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m190601n(int i) {
        if (!this.f172017I) {
            return i > 2 || Math.abs(xsi0.m210767h() - this.f172014F) >= this.f172013E;
        }
        boolean z = this.f172018J;
        this.f172018J = false;
        return z;
    }

    /* JADX INFO: renamed from: o */
    private void m190602o(Canvas canvas) {
        Iterator<r860> it = this.f172011C.iterator();
        while (it.hasNext()) {
            r860 next = it.next();
            if (next.m178240a(this, canvas, this.f172015G)) {
                it.remove();
                this.f172010B.add(next);
            }
        }
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: c */
    public void mo80951c(Canvas canvas) {
        m190600l();
        m190602o(canvas);
        if (this.f55670r || this.f172017I || m80954f() < 1.0f || this.f172011C.size() != 0 || this.f55666n) {
            return;
        }
        this.f55653a.mo80972e();
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: d */
    public boolean mo80952d(Canvas canvas, long j) {
        this.f172015G = j;
        return super.mo80952d(canvas, j);
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: e */
    public DefaultHandler mo80953e() {
        return new wtd0(this);
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: h */
    public boolean mo80956h(float f) {
        return !this.f172017I || this.f172011C.size() > 0 || this.f172018J;
    }

    @Override // com.sunshine.engine.base.AbstractC13484a
    /* JADX INFO: renamed from: j */
    public void mo80958j(Bitmap bitmap, MediaPlayer mediaPlayer) {
        super.mo80958j(bitmap, mediaPlayer);
        int iFloatValue = 0;
        for (s860 s860Var : this.f172012D) {
            iFloatValue = (int) (iFloatValue + ((s860Var.f162998c.m145368g().floatValue() - s860Var.f162998c.m145364c().floatValue()) * ((s860Var.f162999d.m145364c().intValue() + s860Var.f162999d.m145368g().intValue()) / 2)));
        }
        this.f172013E = iFloatValue / this.f172009A;
    }

    /* JADX INFO: renamed from: k */
    public void m190603k(s860 s860Var) {
        this.f172012D.add(s860Var);
    }

    /* JADX INFO: renamed from: m */
    public s860 m190604m() {
        if (this.f172012D.size() <= 0) {
            return null;
        }
        List<s860> list = this.f172012D;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: p */
    public void m190605p(int i) {
        this.f172009A = i;
        this.f172010B.clear();
        this.f172011C.clear();
        while (this.f172010B.size() < this.f172009A) {
            this.f172010B.add(new r860());
        }
    }
}
