package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.svip.SVIPRefundItemView;
import com.p000p1.mobile.putong.core.p004ui.svip.SVIPRefundTitleView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AccountRecord;
import com.p1.mobile.putong.core.pay.R;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.jnd0;
import l.lsi0;
import l.m6c0;
import l.o7r;
import l.s7m;
import l.xdl0;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hnd0 implements s7m<cnd0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f13953a;

    /* JADX INFO: renamed from: b */
    public VText f13954b;

    /* JADX INFO: renamed from: c */
    public VText f13955c;

    /* JADX INFO: renamed from: d */
    public VText f13956d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f13957e;

    /* JADX INFO: renamed from: f */
    public VText f13958f;

    /* JADX INFO: renamed from: g */
    public ImageView f13959g;

    /* JADX INFO: renamed from: h */
    public VText f13960h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f13961i;

    /* JADX INFO: renamed from: j */
    public final PutongAct f13962j;

    /* JADX INFO: renamed from: k */
    public cnd0 f13963k;

    /* JADX INFO: renamed from: l */
    public C0808a f13964l;

    /* JADX INFO: renamed from: m */
    public boolean f13965m = false;

    /* JADX INFO: renamed from: n */
    public String f13966n;

    /* JADX INFO: renamed from: l.hnd0$a */
    public class C0808a extends dac0<AccountRecord> {

        /* JADX INFO: renamed from: c */
        public List<AccountRecord> f13967c;

        public C0808a() {
            this.f13967c = new ArrayList();
        }

        /* JADX INFO: renamed from: C */
        public int m16266C() {
            return this.f13967c.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m16267D(ViewGroup viewGroup, int i) {
            hnd0 hnd0Var = hnd0.this;
            return 1 == i ? o7r.a(hnd0Var.f13962j).inflate(m6c0.d2, viewGroup, false) : o7r.a(hnd0Var.f13962j).inflate(m6c0.e2, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m16265A(View view, AccountRecord accountRecord, int i, int i2) {
            if (i == 0) {
                ((SVIPRefundTitleView) view).m9234i0();
            } else {
                ((SVIPRefundItemView) view).m9232i0(accountRecord);
            }
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public AccountRecord getItem(int i) {
            return i == 0 ? AccountRecord.new_() : this.f13967c.get(i - 1);
        }

        /* JADX INFO: renamed from: G */
        public void m16270G(List<AccountRecord> list) {
            this.f13967c.clear();
            this.f13967c.addAll(list);
            notifyDataSetChanged();
        }

        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }
    }

    public hnd0(PutongAct putongAct) {
        this.f13962j = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16246C0() {
        return this.f13962j;
    }

    @Nullable
    public Act act() {
        return this.f13962j;
    }

    /* JADX INFO: renamed from: e */
    public View m16247e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jnd0.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m16248f(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.ha);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.h(R.string.ia);
        } else if (i == 41906) {
            lsi0.h(R.string.ja);
        } else {
            lsi0.h(R.string.ha);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m16249i(j760<Integer, String> j760Var) {
        act().progressDismiss();
        if (9000 != ((Integer) j760Var.a).intValue()) {
            lsi0.h(R.string.ha);
        } else {
            m16260u((String) j760Var.b);
            lsi0.w(R.string.ka);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16247e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m16250i1(cnd0 cnd0Var) {
        this.f13963k = cnd0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m16252k() {
        this.f13962j.dialog().D(R.string.z1).t0(R.string.y1, new Runnable() { // from class: l.gnd0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13408a.m16256p();
            }
        }).k0(R.string.B1).B(true).z0();
    }

    /* JADX INFO: renamed from: l */
    public String m16253l() {
        return this.f13966n;
    }

    /* JADX INFO: renamed from: m */
    public void m16254m() {
        this.f13965m = false;
        this.f13960h.setText(R.string.E1);
        xdl0.E0(this.f13957e, new View.OnClickListener() { // from class: l.end0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11287a.m16257q(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public void m16255n(double d) {
        VText vText = this.f13956d;
        if (d > 0.0d) {
            vText.setTextColor(Color.parseColor("#d74d37"));
            xdl0.E0(this.f13956d, new View.OnClickListener() { // from class: l.fnd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12798a.m16259s(view);
                }
            });
        } else {
            vText.setTextColor(Color.parseColor("#80d74d37"));
            this.f13956d.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m16256p() {
        act().progress(R.string.T1);
        this.f13963k.m13546o0();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m16257q(View view) {
        m16252k();
    }

    /* JADX INFO: renamed from: r */
    public void m16258r() {
        act().setTitle(R.string.D1);
        this.f13954b.setText("0.0");
        this.f13955c.setText(R.string.V1);
        this.f13958f.setText(R.string.A1);
        this.f13956d.setText(R.string.la);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m16259s(View view) {
        if (!this.f13965m) {
            m16252k();
        } else {
            act().progress(R.string.T1);
            this.f13963k.m13547p0(this.f13954b.getText().toString(), this.f13966n);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16260u(String str) {
        this.f13965m = true;
        this.f13960h.setText(R.string.x1);
        this.f13957e.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: v */
    public void m16261v(List<AccountRecord> list) {
        this.f13961i.setLayoutManager(new LinearLayoutManager(this.f13962j));
        C0808a c0808a = new C0808a();
        this.f13964l = c0808a;
        this.f13961i.setAdapter(c0808a);
        this.f13964l.m16270G(list);
    }

    /* JADX INFO: renamed from: w */
    public void m16262w(String str, String str2) {
        this.f13966n = str;
        this.f13954b.setText(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public void m16263x(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.P1);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41902) {
            lsi0.h(R.string.ma);
        } else if (i == 41910) {
            lsi0.h(R.string.na);
        } else {
            lsi0.h(R.string.P1);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16264y() {
        act().progressDismiss();
    }

    public void destroy() {
    }
}
