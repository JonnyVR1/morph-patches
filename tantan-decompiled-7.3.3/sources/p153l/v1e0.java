package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import com.sunshine.engine.base.AbstractC13647a;
import com.sunshine.engine.base.AbstractC13665s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes11.dex */
public class v1e0 extends AbstractC13647a {

    /* JADX INFO: renamed from: A */
    public int f181949A;

    /* JADX INFO: renamed from: B */
    public List<wg60> f181950B;

    /* JADX INFO: renamed from: C */
    public List<wg60> f181951C;

    /* JADX INFO: renamed from: D */
    public List<xg60> f181952D;

    /* JADX INFO: renamed from: E */
    private long f181953E;

    /* JADX INFO: renamed from: F */
    private long f181954F;

    /* JADX INFO: renamed from: G */
    private long f181955G;

    /* JADX INFO: renamed from: H */
    private kk90 f181956H;

    /* JADX INFO: renamed from: I */
    private boolean f181957I;

    /* JADX INFO: renamed from: J */
    private boolean f181958J;

    /* JADX INFO: renamed from: K */
    private long f181959K;

    /* JADX INFO: renamed from: L */
    private long f181960L;

    /* JADX WARN: Type inference failed for: r3v6, types: [T] */
    public v1e0(AbstractC13665s abstractC13665s, String str, String str2, String str3) {
        super(abstractC13665s, str, str2, str3);
        this.f181949A = 6;
        this.f181950B = new ArrayList();
        this.f181951C = new ArrayList();
        this.f181952D = new ArrayList();
        this.f181953E = -1L;
        this.f181954F = -1L;
        this.f181955G = -1L;
        this.f181956H = new kk90(Float.valueOf(0.0f), Float.valueOf(1.0f), "spring");
        this.f181957I = false;
        this.f181958J = false;
        this.f181959K = -1L;
        this.f181960L = -1L;
        drf0<Integer> drf0Var = this.f56508h;
        drf0Var.f90385b = drf0Var.f90384a;
    }

    /* JADX INFO: renamed from: l */
    private void m199003l() {
        int size;
        xg60 xg60Var;
        if (((this.f181957I || this.f56518r) ? this.f181949A : (int) (this.f181956H.mo150085a(m82137f()).floatValue() * this.f181949A)) <= this.f181951C.size() || !m199004n(this.f181949A - this.f181951C.size()) || (size = this.f181950B.size()) <= 0) {
            return;
        }
        wg60 wg60Var = this.f181950B.get(0);
        this.f181954F = a2j0.m95705h();
        if (this.f181952D.size() == 1) {
            xg60Var = this.f181952D.get(0);
        } else {
            float fRandom = (float) Math.random();
            xg60 xg60Var2 = null;
            for (int i = 0; i < this.f181952D.size() && ((xg60Var2 = this.f181952D.get(i)) == null || !a2j0.m95706i(fRandom, xg60Var2.f194140c.m167988c().floatValue(), xg60Var2.f194140c.m167992g().floatValue())); i++) {
            }
            xg60Var = xg60Var2;
        }
        if (xg60Var != null) {
            xg60Var.m210878a(this, wg60Var);
            if (!this.f181957I && this.f56518r && size > 4) {
                wg60Var.f188914f = this.f181955G - ((long) (((double) wg60Var.f188913e) * Math.random()));
            }
            this.f181950B.remove(wg60Var);
            this.f181951C.add(wg60Var);
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m199004n(int i) {
        if (!this.f181957I) {
            return i > 2 || Math.abs(a2j0.m95705h() - this.f181954F) >= this.f181953E;
        }
        boolean z = this.f181958J;
        this.f181958J = false;
        return z;
    }

    /* JADX INFO: renamed from: o */
    private void m199005o(Canvas canvas) {
        Iterator<wg60> it = this.f181951C.iterator();
        while (it.hasNext()) {
            wg60 next = it.next();
            if (next.m206178a(this, canvas, this.f181955G)) {
                it.remove();
                this.f181950B.add(next);
            }
        }
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: c */
    public void mo82134c(Canvas canvas) {
        m199003l();
        m199005o(canvas);
        if (this.f56518r || this.f181957I || m82137f() < 1.0f || this.f181951C.size() != 0 || this.f56514n) {
            return;
        }
        this.f56501a.mo82155e();
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: d */
    public boolean mo82135d(Canvas canvas, long j) {
        this.f181955G = j;
        return super.mo82135d(canvas, j);
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: e */
    public DefaultHandler mo82136e() {
        return new y1e0(this);
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: h */
    public boolean mo82139h(float f) {
        return !this.f181957I || this.f181951C.size() > 0 || this.f181958J;
    }

    @Override // com.sunshine.engine.base.AbstractC13647a
    /* JADX INFO: renamed from: j */
    public void mo82141j(Bitmap bitmap, MediaPlayer mediaPlayer) {
        super.mo82141j(bitmap, mediaPlayer);
        int iFloatValue = 0;
        for (xg60 xg60Var : this.f181952D) {
            iFloatValue = (int) (iFloatValue + ((xg60Var.f194140c.m167992g().floatValue() - xg60Var.f194140c.m167988c().floatValue()) * ((xg60Var.f194141d.m167988c().intValue() + xg60Var.f194141d.m167992g().intValue()) / 2)));
        }
        this.f181953E = iFloatValue / this.f181949A;
    }

    /* JADX INFO: renamed from: k */
    public void m199006k(xg60 xg60Var) {
        this.f181952D.add(xg60Var);
    }

    /* JADX INFO: renamed from: m */
    public xg60 m199007m() {
        if (this.f181952D.size() <= 0) {
            return null;
        }
        List<xg60> list = this.f181952D;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: p */
    public void m199008p(int i) {
        this.f181949A = i;
        this.f181950B.clear();
        this.f181951C.clear();
        while (this.f181950B.size() < this.f181949A) {
            this.f181950B.add(new wg60());
        }
    }
}
