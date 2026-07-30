package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.marry.status.MarryStatusSetAct;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class t5x implements iam<p5x>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public MarryStatusSetAct f172241A;

    /* JADX INFO: renamed from: B */
    public VImage[] f172242B;

    /* JADX INFO: renamed from: C */
    public View[] f172243C;

    /* JADX INFO: renamed from: D */
    public boolean f172244D = false;

    /* JADX INFO: renamed from: E */
    public int f172245E = -1;

    /* JADX INFO: renamed from: F */
    public final int f172246F = 7;

    /* JADX INFO: renamed from: a */
    public VDraweeView f172247a;

    /* JADX INFO: renamed from: b */
    public VText f172248b;

    /* JADX INFO: renamed from: c */
    public VLinear f172249c;

    /* JADX INFO: renamed from: d */
    public VText f172250d;

    /* JADX INFO: renamed from: e */
    public VImage f172251e;

    /* JADX INFO: renamed from: f */
    public VLinear f172252f;

    /* JADX INFO: renamed from: g */
    public VText f172253g;

    /* JADX INFO: renamed from: h */
    public VImage f172254h;

    /* JADX INFO: renamed from: i */
    public VLinear f172255i;

    /* JADX INFO: renamed from: j */
    public VText f172256j;

    /* JADX INFO: renamed from: k */
    public VImage f172257k;

    /* JADX INFO: renamed from: l */
    public VLinear f172258l;

    /* JADX INFO: renamed from: m */
    public VText f172259m;

    /* JADX INFO: renamed from: n */
    public VImage f172260n;

    /* JADX INFO: renamed from: o */
    public VLinear f172261o;

    /* JADX INFO: renamed from: p */
    public VText f172262p;

    /* JADX INFO: renamed from: q */
    public VImage f172263q;

    /* JADX INFO: renamed from: r */
    public VLinear f172264r;

    /* JADX INFO: renamed from: s */
    public VImage f172265s;

    /* JADX INFO: renamed from: t */
    public VLinear f172266t;

    /* JADX INFO: renamed from: u */
    public VImage f172267u;

    /* JADX INFO: renamed from: v */
    public VLinear f172268v;

    /* JADX INFO: renamed from: w */
    public VImage f172269w;

    /* JADX INFO: renamed from: x */
    public VButton f172270x;

    /* JADX INFO: renamed from: y */
    public VImage f172271y;

    /* JADX INFO: renamed from: z */
    public p5x f172272z;

    public t5x(MarryStatusSetAct marryStatusSetAct) {
        this.f172241A = marryStatusSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m189431j(View view) {
        this.f172244D = !this.f172244D;
        m189438m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m189432k(View view) {
        this.f172241A.m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m189433l(View view) {
        int i = this.f172245E;
        if (i >= 0) {
            this.f172272z.m170697i0(i);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f172241A;
    }

    /* JADX INFO: renamed from: d */
    public View m189434d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u5x.m194631b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p5x p5xVar) {
        this.f172272z = p5xVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m189436f() {
        int i = 0;
        while (true) {
            VImage[] vImageArr = this.f172242B;
            if (i >= vImageArr.length) {
                m189437i();
                return;
            } else {
                vImageArr[i].setImageResource(i == this.f172245E ? dbc0.f86662Vd : dbc0.f86630Ud);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m189437i() {
        this.f172270x.setEnabled(this.f172245E >= 0);
        this.f172270x.setBackgroundResource(this.f172245E >= 0 ? dbc0.f86584T : dbc0.f87399s);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m189434d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public final void m189438m() {
        this.f172263q.setRotation(this.f172244D ? 180.0f : 0.0f);
        int i = 4;
        while (true) {
            View[] viewArr = this.f172243C;
            if (i >= viewArr.length) {
                return;
            }
            bnl0.m105524M(viewArr[i], this.f172244D);
            i++;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f172245E = ((Integer) view.getTag()).intValue();
        m189436f();
    }

    /* JADX INFO: renamed from: r */
    public void m189439r() {
        uqb0.f180374G.m127115L0(this.f172247a, "https://auto.tancdn.com/v1/raw/904432ed-ba77-4288-8865-1411b792009c10.webp");
        this.f172248b.getPaint().setFakeBoldText(true);
        this.f172242B = new VImage[]{this.f172251e, this.f172254h, this.f172257k, this.f172260n, this.f172265s, this.f172267u, this.f172269w};
        this.f172243C = new View[]{this.f172249c, this.f172252f, this.f172255i, this.f172258l, this.f172264r, this.f172266t, this.f172268v};
        for (int i = 0; i < 7; i++) {
            this.f172243C[i].setOnClickListener(this);
            this.f172243C[i].setTag(Integer.valueOf(i));
        }
        bnl0.m105509E0(this.f172261o, new View.OnClickListener() { // from class: l.q5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155769a.m189431j(view);
            }
        });
        bnl0.m105509E0(this.f172271y, new View.OnClickListener() { // from class: l.r5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161413a.m189432k(view);
            }
        });
        bnl0.m105509E0(this.f172270x, new View.OnClickListener() { // from class: l.s5x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166520a.m189433l(view);
            }
        });
        m189437i();
        m189436f();
        bnl0.m105542Z(this.f172271y);
        this.f172250d.setTypeface(lyh0.m156283c(3), 1);
        this.f172253g.setTypeface(lyh0.m156283c(3), 1);
        this.f172256j.setTypeface(lyh0.m156283c(3), 1);
        this.f172259m.setTypeface(lyh0.m156283c(3), 1);
        this.f172262p.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
