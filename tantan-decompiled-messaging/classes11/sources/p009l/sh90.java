package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.C0107c;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.d30;
import l.e51;
import l.lsi0;
import l.qol0;
import l.upa;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sh90 extends yw2 implements d30 {

    /* JADX INFO: renamed from: b */
    public C0107c f20256b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f20257c;

    /* JADX INFO: renamed from: d */
    public qol0 f20258d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f20259e;

    /* JADX INFO: renamed from: f */
    public ViewTreeObserverOnGlobalLayoutListenerC0030b f20260f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f20261g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f20262h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f20263i = 2;

    /* JADX INFO: renamed from: j */
    public long f20264j = -1;

    public sh90(BifrostLayout bifrostLayout, C0107c c0107c, qol0 qol0Var, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b) {
        this.f20256b = c0107c;
        this.f20258d = qol0Var;
        c0107c.m1879L(this);
        this.f20257c = bifrostLayout;
        this.f20260f = viewTreeObserverOnGlobalLayoutListenerC0030b;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m22184o(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m22189A(View.OnClickListener onClickListener) {
        this.f20259e = onClickListener;
    }

    public void call() {
        mo12312a();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: d */
    public void mo11922d(View view, int i) {
        C0107c c0107c;
        int iMo11926h = mo11926h(i);
        if (iMo11926h == 0 && (view instanceof a5m)) {
            C0107c c0107c2 = this.f20256b;
            c0107c2.m1882j(view, (CoreSuggested.UserInfo) c0107c2.getItem(i), mo11926h(i), i);
            if (i != 0) {
                view.setOnClickListener(null);
                return;
            }
            xdl0.E0(view, new View.OnClickListener() { // from class: l.mh90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f16921a.m22195w(view2);
                }
            });
            if (upa.N3()) {
                view.setClickable(false);
                return;
            }
            return;
        }
        if (view instanceof VirtualCard) {
            if (i == 0 && (c0107c = this.f20256b) != null) {
                c0107c.m1872D();
            }
            final VirtualCard virtualCard = (VirtualCard) view;
            VirtualCardType virtualCardType = this.f20262h.get(Integer.valueOf(iMo11926h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            if (BifrostLayout.f2100e && virtualCardType == VirtualCardType.LiveLivingCard) {
                lsi0.j("直播展示了：" + i);
            }
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f20256b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f20258d.d2(virtualCardType, userInfo));
                virtualCard.setClipChildren(false);
            }
            m22192t((CoreSuggested.UserInfo) this.f20256b.getItem(i), i);
            virtualCard.K0(i, virtualCardType, userInfo);
            if (i == 0) {
                xdl0.E0(virtualCard, new View.OnClickListener() { // from class: l.nh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.H0(virtualCard2);
                    }
                });
            } else {
                xdl0.E0(virtualCard, new View.OnClickListener() { // from class: l.oh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        sh90.m22184o(view2);
                    }
                });
            }
            if (i == 0) {
                final CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) this.f20256b.getItem(0);
                e51.H(this.f20257c.getContext(), new Runnable() { // from class: l.ph90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18590a.m22196x(userInfo2, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: e */
    public View mo11923e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f20256b.m1883m(this.f20257c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        xdl0.M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: f */
    public int mo11924f() {
        return this.f20256b.getCount();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo11925g(int i) {
        return this.f20256b.getItem(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: h */
    public int mo11926h(int i) {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f20256b.getItem(i);
        m22193u(userInfo);
        return TextUtils.equals(userInfo.id, "VirtualCard") ? m22194v(userInfo.virtualCardType) : this.f20256b.getItemViewType(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: i */
    public String mo11927i(int i) {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f20256b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(((CoreSuggested.UserInfo) this.f20256b.getItem(i)).id);
        VirtualCardType virtualCardType = userInfo.virtualCardType;
        sb.append(virtualCardType != null ? virtualCardType.getId() : "userType");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.yw2
    /* JADX INFO: renamed from: j */
    public void mo22190j(View view) {
        super.mo22190j(view);
        if (view instanceof iol) {
            ((iol) view).mo1896A0(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.yw2
    /* JADX INFO: renamed from: k */
    public void mo22191k(View view) {
        super.mo22191k(view);
        if (view instanceof iol) {
            ((iol) view).mo1936K(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.yw2
    /* JADX INFO: renamed from: l */
    public void mo11928l(View view, boolean z) {
        if (view instanceof iol) {
            ((iol) view).mo864k(z);
        }
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: m */
    public void mo11929m(pol0 pol0Var) {
        CoreSuggested.UserInfo userInfo;
        User userM1887z;
        if (mo11924f() <= 0) {
            CrashHelper.c(new RuntimeException("移出卡片时栈已经空了" + mo12313b()));
            this.f20257c.post(new Runnable() { // from class: l.rh90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19837a.m22198z();
                }
            });
            return;
        }
        Object obj = pol0Var.f18802c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) obj;
            y1j.m25171h("remove card:" + userInfo2.id + "," + userInfo2.virtualCardType + "," + pol0Var.m20522d());
            if (!this.f20256b.m1877J(userInfo2)) {
                CrashHelper.c(new RuntimeException("移出卡片时数据已经不存在:" + mo11924f() + "renderList:" + mo12313b()));
                this.f20257c.post(new Runnable() { // from class: l.qh90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19256a.m22197y();
                    }
                });
                return;
            }
            CoreModule.c.m0.J8(userInfo2);
            if (upa.N3()) {
                if (CoreModule.c.m0.a0.e() == null || vwb.J(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded)) {
                    userInfo = null;
                    userM1887z = null;
                } else {
                    userInfo = (CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0);
                    userM1887z = this.f20256b.m1887z(userInfo.id);
                }
                ExpandedCardStyleHelper.m2064o().m2084z(userM1887z, userInfo);
            }
            this.f20256b.m1873E();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m22192t(CoreSuggested.UserInfo userInfo, int i) {
        if (i == 0) {
            if (userInfo.isVirtualCard()) {
                CoreModule.c.m0.J0.onNext(Boolean.TRUE);
            } else {
                CoreModule.c.m0.J0.onNext(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m22193u(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.id = "VirtualCard";
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m22194v(VirtualCardType virtualCardType) {
        if (this.f20261g.containsKey(virtualCardType)) {
            return this.f20261g.get(virtualCardType).intValue();
        }
        int i = this.f20263i;
        this.f20263i = i + 1;
        this.f20261g.put(virtualCardType, Integer.valueOf(i));
        this.f20262h.put(Integer.valueOf(i), virtualCardType);
        return this.f20261g.get(virtualCardType).intValue();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m22195w(View view) {
        if (NullChecker.a(this.f20259e)) {
            if (this.f20264j == -1 || mqi0.m18550o() - this.f20264j >= 500 || mqi0.m18550o() - this.f20264j < 0) {
                this.f20264j = mqi0.m18550o();
                this.f20259e.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m22196x(CoreSuggested.UserInfo userInfo, VirtualCard virtualCard) {
        if (userInfo != null) {
            HomeStatisticsHelper.m652i(userInfo, "p_suggest_users_home_view");
            HomeStatisticsHelper.m661r(virtualCard.getCardData(), "p_suggest_users_home_view", userInfo.id, this.f20260f.m1335v2().m19427g6(userInfo.id));
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m22197y() {
        mo12312a();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m22198z() {
        mo12312a();
    }
}
