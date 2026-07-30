package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import l.arl;
import l.brl;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qdg extends LiveMenuDialogHolder<deg> implements arl, brl {

    /* JADX INFO: renamed from: k */
    public VImage f17943k;

    /* JADX INFO: renamed from: l */
    public VText f17944l;

    /* JADX INFO: renamed from: m */
    public VImage f17945m;

    /* JADX INFO: renamed from: n */
    public VText f17946n;

    /* JADX INFO: renamed from: o */
    public FansGroupListView f17947o;

    /* JADX INFO: renamed from: p */
    public FansGroupNoticeListView f17948p;

    /* JADX INFO: renamed from: q */
    public String f17949q;

    /* JADX INFO: renamed from: r */
    public boolean f17950r;

    /* JADX INFO: renamed from: s */
    public FanbaseGroupsBean f17951s;

    /* JADX INFO: renamed from: t */
    public boolean f17952t;

    /* JADX INFO: renamed from: l.qdg$a */
    public class ViewOnClickListenerC0785a implements View.OnClickListener {
        public ViewOnClickListenerC0785a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((deg) qdg.this.f3799b).m11796s4();
        }
    }

    /* JADX INFO: renamed from: l.qdg$b */
    public class ViewOnClickListenerC0786b implements View.OnClickListener {
        public ViewOnClickListenerC0786b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qdg.this.mo5216p();
        }
    }

    /* JADX INFO: renamed from: l.qdg$c */
    public class ViewOnClickListenerC0787c implements View.OnClickListener {
        public ViewOnClickListenerC0787c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FanbaseGroupsBean fanbaseGroupsBean = qdg.this.f17951s;
            qdg qdgVar = qdg.this;
            if (fanbaseGroupsBean == null) {
                qdgVar.mo5216p();
            } else {
                qdgVar.m21230N(qdgVar.f17952t, qdg.this.f17951s);
                ((deg) qdg.this.f3799b).m11784f4();
            }
        }
    }

    public qdg(Act act, @NonNull @NotNull deg degVar) {
        super(t6c0.f20067x0, act, degVar, j2g0.m15577c(0.0f));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((deg) this.f3799b).C0();
    }

    /* JADX INFO: renamed from: H */
    public final void m21226H(View view) {
        rdg.m21908a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m21228L(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f17948p.K(baseLiveListBean);
    }

    /* JADX INFO: renamed from: M */
    public void m21229M() {
        this.f17948p.G();
    }

    /* JADX INFO: renamed from: N */
    public void m21230N(boolean z, FanbaseGroupsBean fanbaseGroupsBean) {
        this.f17952t = z;
        this.f17951s = fanbaseGroupsBean;
        this.f17950r = true;
        this.f17944l.setText(R$string.f3664x3);
        this.f17947o.setVisibility(0);
        this.f17948p.setVisibility(8);
        this.f17945m.setVisibility(z ? 0 : 8);
        this.f17947o.z(z, fanbaseGroupsBean);
        m21232P(this.f17949q);
        xdl0.E0(this.f17945m, new ViewOnClickListenerC0785a());
        xdl0.E0(this.f17943k, new ViewOnClickListenerC0786b());
    }

    /* JADX INFO: renamed from: O */
    public void m21231O(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f17950r = false;
        this.f17944l.setText(R$string.f3598u3);
        this.f17947o.setVisibility(8);
        this.f17948p.setVisibility(0);
        this.f17945m.setVisibility(8);
        this.f17946n.setVisibility(8);
        this.f17948p.M(baseLiveListBean);
        xdl0.E0(this.f17943k, new ViewOnClickListenerC0787c());
    }

    /* JADX INFO: renamed from: P */
    public void m21232P(String str) {
        this.f17949q = str;
        if (this.f17950r) {
            if (TextUtils.isEmpty(str) || TextUtils.equals(this.f17949q, "0")) {
                this.f17946n.setVisibility(8);
            } else {
                this.f17946n.setVisibility(this.f17952t ? 0 : 8);
                this.f17946n.setText(this.f17949q);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m21233Q(int i, String str) {
        this.f17948p.N(i, str);
    }

    /* JADX INFO: renamed from: a */
    public void m21234a() {
        ((deg) this.f3799b).m11796s4();
    }

    /* JADX INFO: renamed from: b */
    public void m21235b(int i, String str, String str2) {
        ((deg) this.f3799b).m11782d4(i, str, str2, true);
    }

    /* JADX INFO: renamed from: c */
    public void m21236c() {
        ((deg) this.f3799b).m11783e4();
    }

    /* JADX INFO: renamed from: e */
    public void m21238e(int i, String str, String str2) {
        ((deg) this.f3799b).m11782d4(i, str, str2, false);
    }

    /* JADX INFO: renamed from: f */
    public void m21239f(String str) {
        ((deg) this.f3799b).m11794q4(str);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isLoading() {
        return ((deg) this.f3799b).m11785g4();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m21226H(view);
        m5207A(80);
        this.f17947o.u(true, this);
        this.f17948p.E(true, this);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(deg degVar) {
    }

    /* JADX INFO: renamed from: d */
    public void m21237d(String str) {
    }
}
