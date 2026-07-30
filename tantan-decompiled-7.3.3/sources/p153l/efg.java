package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class efg extends LiveMenuDialogHolder<rfg> implements ntl, otl {

    /* JADX INFO: renamed from: k */
    public VImage f93772k;

    /* JADX INFO: renamed from: l */
    public VText f93773l;

    /* JADX INFO: renamed from: m */
    public VImage f93774m;

    /* JADX INFO: renamed from: n */
    public VText f93775n;

    /* JADX INFO: renamed from: o */
    public FansGroupListView f93776o;

    /* JADX INFO: renamed from: p */
    public FansGroupNoticeListView f93777p;

    /* JADX INFO: renamed from: q */
    public String f93778q;

    /* JADX INFO: renamed from: r */
    public boolean f93779r;

    /* JADX INFO: renamed from: s */
    public FanbaseGroupsBean f93780s;

    /* JADX INFO: renamed from: t */
    public boolean f93781t;

    /* JADX INFO: renamed from: l.efg$a */
    public class ViewOnClickListenerC16765a implements View.OnClickListener {
        public ViewOnClickListenerC16765a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((rfg) efg.this.f48605b).m181206s4();
        }
    }

    /* JADX INFO: renamed from: l.efg$b */
    public class ViewOnClickListenerC16766b implements View.OnClickListener {
        public ViewOnClickListenerC16766b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            efg.this.mo73021p();
        }
    }

    /* JADX INFO: renamed from: l.efg$c */
    public class ViewOnClickListenerC16767c implements View.OnClickListener {
        public ViewOnClickListenerC16767c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FanbaseGroupsBean fanbaseGroupsBean = efg.this.f93780s;
            efg efgVar = efg.this;
            if (fanbaseGroupsBean == null) {
                efgVar.mo73021p();
            } else {
                efgVar.m120679N(efgVar.f93781t, efg.this.f93780s);
                ((rfg) efg.this.f48605b).m181194f4();
            }
        }
    }

    public efg(Act act, @NonNull @NotNull rfg rfgVar) {
        super(yec0.f199303x0, act, rfgVar, qag0.m175922c(0.0f));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((rfg) this.f48605b).m113230C0();
    }

    /* JADX INFO: renamed from: H */
    public final void m120675H(View view) {
        ffg.m125370a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m120677L(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f93777p.m68822K(baseLiveListBean);
    }

    /* JADX INFO: renamed from: M */
    public void m120678M() {
        this.f93777p.m68821G();
    }

    /* JADX INFO: renamed from: N */
    public void m120679N(boolean z, FanbaseGroupsBean fanbaseGroupsBean) {
        this.f93781t = z;
        this.f93780s = fanbaseGroupsBean;
        this.f93779r = true;
        this.f93773l.setText(R$string.f48470x3);
        this.f93776o.setVisibility(0);
        this.f93777p.setVisibility(8);
        this.f93774m.setVisibility(z ? 0 : 8);
        this.f93776o.m68809z(z, fanbaseGroupsBean);
        m120681P(this.f93778q);
        bnl0.m105509E0(this.f93774m, new ViewOnClickListenerC16765a());
        bnl0.m105509E0(this.f93772k, new ViewOnClickListenerC16766b());
    }

    /* JADX INFO: renamed from: O */
    public void m120680O(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f93779r = false;
        this.f93773l.setText(R$string.f48404u3);
        this.f93776o.setVisibility(8);
        this.f93777p.setVisibility(0);
        this.f93774m.setVisibility(8);
        this.f93775n.setVisibility(8);
        this.f93777p.m68823M(baseLiveListBean);
        bnl0.m105509E0(this.f93772k, new ViewOnClickListenerC16767c());
    }

    /* JADX INFO: renamed from: P */
    public void m120681P(String str) {
        this.f93778q = str;
        if (this.f93779r) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f93778q, "0")) {
                this.f93775n.setVisibility(8);
            } else {
                this.f93775n.setVisibility(this.f93781t ? 0 : 8);
                this.f93775n.setText(this.f93778q);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m120682Q(int i, String str) {
        this.f93777p.m68824N(i, str);
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: a */
    public void mo120683a() {
        ((rfg) this.f48605b).m181206s4();
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: b */
    public void mo120684b(int i, String str, String str2) {
        ((rfg) this.f48605b).m181192d4(i, str, str2, true);
    }

    @Override // p153l.ntl
    /* JADX INFO: renamed from: c */
    public void mo71689c() {
        ((rfg) this.f48605b).m181193e4();
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: e */
    public void mo120685e(int i, String str, String str2) {
        ((rfg) this.f48605b).m181192d4(i, str, str2, false);
    }

    @Override // p153l.otl
    /* JADX INFO: renamed from: f */
    public void mo120686f(String str) {
        ((rfg) this.f48605b).m181204q4(str);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.otl
    public boolean isLoading() {
        return ((rfg) this.f48605b).m181195g4();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m120675H(view);
        m73014A(80);
        this.f93776o.m68807u(true, this);
        this.f93777p.m68820E(true, this);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rfg rfgVar) {
    }

    @Override // p153l.ntl
    /* JADX INFO: renamed from: d */
    public void mo71690d(String str) {
    }
}
