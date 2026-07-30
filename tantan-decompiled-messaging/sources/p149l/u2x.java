package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.marry.status.MarryStatusSetAct;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class u2x implements s7m<q2x>, View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public MarryStatusSetAct f173529A;

    /* JADX INFO: renamed from: B */
    public VImage[] f173530B;

    /* JADX INFO: renamed from: C */
    public View[] f173531C;

    /* JADX INFO: renamed from: D */
    public boolean f173532D = false;

    /* JADX INFO: renamed from: E */
    public int f173533E = -1;

    /* JADX INFO: renamed from: F */
    public final int f173534F = 7;

    /* JADX INFO: renamed from: a */
    public VDraweeView f173535a;

    /* JADX INFO: renamed from: b */
    public VText f173536b;

    /* JADX INFO: renamed from: c */
    public VLinear f173537c;

    /* JADX INFO: renamed from: d */
    public VText f173538d;

    /* JADX INFO: renamed from: e */
    public VImage f173539e;

    /* JADX INFO: renamed from: f */
    public VLinear f173540f;

    /* JADX INFO: renamed from: g */
    public VText f173541g;

    /* JADX INFO: renamed from: h */
    public VImage f173542h;

    /* JADX INFO: renamed from: i */
    public VLinear f173543i;

    /* JADX INFO: renamed from: j */
    public VText f173544j;

    /* JADX INFO: renamed from: k */
    public VImage f173545k;

    /* JADX INFO: renamed from: l */
    public VLinear f173546l;

    /* JADX INFO: renamed from: m */
    public VText f173547m;

    /* JADX INFO: renamed from: n */
    public VImage f173548n;

    /* JADX INFO: renamed from: o */
    public VLinear f173549o;

    /* JADX INFO: renamed from: p */
    public VText f173550p;

    /* JADX INFO: renamed from: q */
    public VImage f173551q;

    /* JADX INFO: renamed from: r */
    public VLinear f173552r;

    /* JADX INFO: renamed from: s */
    public VImage f173553s;

    /* JADX INFO: renamed from: t */
    public VLinear f173554t;

    /* JADX INFO: renamed from: u */
    public VImage f173555u;

    /* JADX INFO: renamed from: v */
    public VLinear f173556v;

    /* JADX INFO: renamed from: w */
    public VImage f173557w;

    /* JADX INFO: renamed from: x */
    public VButton f173558x;

    /* JADX INFO: renamed from: y */
    public VImage f173559y;

    /* JADX INFO: renamed from: z */
    public q2x f173560z;

    public u2x(MarryStatusSetAct marryStatusSetAct) {
        this.f173529A = marryStatusSetAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m191548j(View view) {
        this.f173532D = !this.f173532D;
        m191555m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m191549k(View view) {
        this.f173529A.m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m191550l(View view) {
        int i = this.f173533E;
        if (i >= 0) {
            this.f173560z.m172528i0(i);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f173529A;
    }

    /* JADX INFO: renamed from: d */
    public View m191551d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v2x.m196823b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(q2x q2xVar) {
        this.f173560z = q2xVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m191553f() {
        int i = 0;
        while (true) {
            VImage[] vImageArr = this.f173530B;
            if (i >= vImageArr.length) {
                m191554i();
                return;
            } else {
                vImageArr[i].setImageResource(i == this.f173533E ? x2c0.f189793Ud : x2c0.f189762Td);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m191554i() {
        this.f173558x.setEnabled(this.f173533E >= 0);
        this.f173558x.setBackgroundResource(this.f173533E >= 0 ? x2c0.f189717S : x2c0.f190506r);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m191551d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public final void m191555m() {
        this.f173551q.setRotation(this.f173532D ? 180.0f : 0.0f);
        int i = 4;
        while (true) {
            View[] viewArr = this.f173531C;
            if (i >= viewArr.length) {
                return;
            }
            xdl0.m208344M(viewArr[i], this.f173532D);
            i++;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f173533E = ((Integer) view.getTag()).intValue();
        m191553f();
    }

    /* JADX INFO: renamed from: r */
    public void m191556r() {
        qib0.f154691G.m102331L0(this.f173535a, "https://auto.tancdn.com/v1/raw/904432ed-ba77-4288-8865-1411b792009c10.webp");
        this.f173536b.getPaint().setFakeBoldText(true);
        this.f173530B = new VImage[]{this.f173539e, this.f173542h, this.f173545k, this.f173548n, this.f173553s, this.f173555u, this.f173557w};
        this.f173531C = new View[]{this.f173537c, this.f173540f, this.f173543i, this.f173546l, this.f173552r, this.f173554t, this.f173556v};
        for (int i = 0; i < 7; i++) {
            this.f173531C[i].setOnClickListener(this);
            this.f173531C[i].setTag(Integer.valueOf(i));
        }
        xdl0.m208329E0(this.f173549o, new View.OnClickListener() { // from class: l.r2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157458a.m191548j(view);
            }
        });
        xdl0.m208329E0(this.f173559y, new View.OnClickListener() { // from class: l.s2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162021a.m191549k(view);
            }
        });
        xdl0.m208329E0(this.f173558x, new View.OnClickListener() { // from class: l.t2x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167555a.m191550l(view);
            }
        });
        m191554i();
        m191553f();
        xdl0.m208362Z(this.f173559y);
        this.f173538d.setTypeface(eqh0.m117752c(3), 1);
        this.f173541g.setTypeface(eqh0.m117752c(3), 1);
        this.f173544j.setTypeface(eqh0.m117752c(3), 1);
        this.f173547m.setTypeface(eqh0.m117752c(3), 1);
        this.f173550p.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
