package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qdg extends LiveMenuDialogHolder<deg> implements arl, brl {

    /* JADX INFO: renamed from: k */
    public VImage f153917k;

    /* JADX INFO: renamed from: l */
    public VText f153918l;

    /* JADX INFO: renamed from: m */
    public VImage f153919m;

    /* JADX INFO: renamed from: n */
    public VText f153920n;

    /* JADX INFO: renamed from: o */
    public FansGroupListView f153921o;

    /* JADX INFO: renamed from: p */
    public FansGroupNoticeListView f153922p;

    /* JADX INFO: renamed from: q */
    public String f153923q;

    /* JADX INFO: renamed from: r */
    public boolean f153924r;

    /* JADX INFO: renamed from: s */
    public FanbaseGroupsBean f153925s;

    /* JADX INFO: renamed from: t */
    public boolean f153926t;

    /* JADX INFO: renamed from: l.qdg$a */
    public class ViewOnClickListenerC19464a implements View.OnClickListener {
        public ViewOnClickListenerC19464a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((deg) qdg.this.f47757b).m111256s4();
        }
    }

    /* JADX INFO: renamed from: l.qdg$b */
    public class ViewOnClickListenerC19465b implements View.OnClickListener {
        public ViewOnClickListenerC19465b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qdg.this.mo71838p();
        }
    }

    /* JADX INFO: renamed from: l.qdg$c */
    public class ViewOnClickListenerC19466c implements View.OnClickListener {
        public ViewOnClickListenerC19466c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FanbaseGroupsBean fanbaseGroupsBean = qdg.this.f153925s;
            qdg qdgVar = qdg.this;
            if (fanbaseGroupsBean == null) {
                qdgVar.mo71838p();
            } else {
                qdgVar.m174039N(qdgVar.f153926t, qdg.this.f153925s);
                ((deg) qdg.this.f47757b).m111244f4();
            }
        }
    }

    public qdg(Act act, @NonNull @NotNull deg degVar) {
        super(t6c0.f168571x0, act, degVar, j2g0.m139456c(0.0f));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((deg) this.f47757b).m104249C0();
    }

    /* JADX INFO: renamed from: H */
    public final void m174035H(View view) {
        rdg.m178962a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m174037L(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f153922p.m67639K(baseLiveListBean);
    }

    /* JADX INFO: renamed from: M */
    public void m174038M() {
        this.f153922p.m67638G();
    }

    /* JADX INFO: renamed from: N */
    public void m174039N(boolean z, FanbaseGroupsBean fanbaseGroupsBean) {
        this.f153926t = z;
        this.f153925s = fanbaseGroupsBean;
        this.f153924r = true;
        this.f153918l.setText(R$string.f47622x3);
        this.f153921o.setVisibility(0);
        this.f153922p.setVisibility(8);
        this.f153919m.setVisibility(z ? 0 : 8);
        this.f153921o.m67626z(z, fanbaseGroupsBean);
        m174041P(this.f153923q);
        xdl0.m208329E0(this.f153919m, new ViewOnClickListenerC19464a());
        xdl0.m208329E0(this.f153917k, new ViewOnClickListenerC19465b());
    }

    /* JADX INFO: renamed from: O */
    public void m174040O(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f153924r = false;
        this.f153918l.setText(R$string.f47556u3);
        this.f153921o.setVisibility(8);
        this.f153922p.setVisibility(0);
        this.f153919m.setVisibility(8);
        this.f153920n.setVisibility(8);
        this.f153922p.m67640M(baseLiveListBean);
        xdl0.m208329E0(this.f153917k, new ViewOnClickListenerC19466c());
    }

    /* JADX INFO: renamed from: P */
    public void m174041P(String str) {
        this.f153923q = str;
        if (this.f153924r) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f153923q, "0")) {
                this.f153920n.setVisibility(8);
            } else {
                this.f153920n.setVisibility(this.f153926t ? 0 : 8);
                this.f153920n.setText(this.f153923q);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m174042Q(int i, String str) {
        this.f153922p.m67641N(i, str);
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: a */
    public void mo103553a() {
        ((deg) this.f47757b).m111256s4();
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: b */
    public void mo103554b(int i, String str, String str2) {
        ((deg) this.f47757b).m111242d4(i, str, str2, true);
    }

    @Override // p149l.arl
    /* JADX INFO: renamed from: c */
    public void mo70506c() {
        ((deg) this.f47757b).m111243e4();
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: e */
    public void mo103555e(int i, String str, String str2) {
        ((deg) this.f47757b).m111242d4(i, str, str2, false);
    }

    @Override // p149l.brl
    /* JADX INFO: renamed from: f */
    public void mo103556f(String str) {
        ((deg) this.f47757b).m111254q4(str);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.brl
    public boolean isLoading() {
        return ((deg) this.f47757b).m111245g4();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m174035H(view);
        m71831A(80);
        this.f153921o.m67624u(true, this);
        this.f153922p.m67637E(true, this);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(deg degVar) {
    }

    @Override // p149l.arl
    /* JADX INFO: renamed from: d */
    public void mo70507d(String str) {
    }
}
