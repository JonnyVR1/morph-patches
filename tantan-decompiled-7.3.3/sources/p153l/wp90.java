package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.C8094c;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class wp90 extends nx2 implements x20 {

    /* JADX INFO: renamed from: b */
    public C8094c f190267b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f190268c;

    /* JADX INFO: renamed from: d */
    public uxl0 f190269d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f190270e;

    /* JADX INFO: renamed from: f */
    public ViewTreeObserverOnGlobalLayoutListenerC8017b f190271f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f190272g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f190273h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f190274i = 2;

    /* JADX INFO: renamed from: j */
    public long f190275j = -1;

    public wp90(BifrostLayout bifrostLayout, C8094c c8094c, uxl0 uxl0Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        this.f190267b = c8094c;
        this.f190269d = uxl0Var;
        c8094c.m38911L(this);
        this.f190268c = bifrostLayout;
        this.f190271f = viewTreeObserverOnGlobalLayoutListenerC8017b;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m207420o(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m207425A(View.OnClickListener onClickListener) {
        this.f190270e = onClickListener;
    }

    @Override // p153l.x20
    public void call() {
        mo140726a();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: d */
    public void mo105829d(View view, int i) {
        C8094c c8094c;
        int iMo105833h = mo105833h(i);
        if (iMo105833h == 0 && (view instanceof q7m)) {
            C8094c c8094c2 = this.f190267b;
            c8094c2.mo21401j(view, c8094c2.getItem(i), mo105833h(i), i);
            if (i != 0) {
                view.setOnClickListener(null);
                return;
            }
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.qp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f158849a.m207429w(view2);
                }
            });
            if (gra.m131606N3()) {
                view.setClickable(false);
                return;
            }
            return;
        }
        if (view instanceof VirtualCard) {
            if (i == 0 && (c8094c = this.f190267b) != null) {
                c8094c.m38904D();
            }
            final VirtualCard virtualCard = (VirtualCard) view;
            VirtualCardType virtualCardType = this.f190273h.get(Integer.valueOf(iMo105833h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            if (BifrostLayout.f24064e && virtualCardType == VirtualCardType.LiveLivingCard) {
                o1j0.m165636j("直播展示了：" + i);
            }
            CoreSuggested.UserInfo item = this.f190267b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f190269d.mo37757d2(virtualCardType, item));
                virtualCard.setClipChildren(false);
            }
            m207426t(this.f190267b.getItem(i), i);
            virtualCard.m47268K0(i, virtualCardType, item);
            if (i == 0) {
                bnl0.m105509E0(virtualCard, new View.OnClickListener() { // from class: l.rp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.m47265H0(virtualCard2);
                    }
                });
            } else {
                bnl0.m105509E0(virtualCard, new View.OnClickListener() { // from class: l.sp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        wp90.m207420o(view2);
                    }
                });
            }
            if (i == 0) {
                final CoreSuggested.UserInfo item2 = this.f190267b.getItem(0);
                l51.m152888H(this.f190268c.getContext(), new Runnable() { // from class: l.tp90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f175575a.m207430x(item2, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: e */
    public View mo105830e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f190267b.mo21402m(this.f190268c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        bnl0.m105525M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: f */
    public int mo105831f() {
        return this.f190267b.getCount();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: g */
    public Object mo105832g(int i) {
        return this.f190267b.getItem(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: h */
    public int mo105833h(int i) {
        CoreSuggested.UserInfo item = this.f190267b.getItem(i);
        m207427u(item);
        return TextUtils.equals(item.f20214id, CoreSuggested.UserInfo.VIRTUAL_CARD) ? m207428v(item.virtualCardType) : this.f190267b.getItemViewType(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: i */
    public String mo105834i(int i) {
        CoreSuggested.UserInfo item = this.f190267b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f190267b.getItem(i).f20214id);
        VirtualCardType virtualCardType = item.virtualCardType;
        sb.append(virtualCardType != null ? virtualCardType.getId() : "userType");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.nx2
    /* JADX INFO: renamed from: j */
    public void mo165055j(View view) {
        super.mo165055j(view);
        if (view instanceof tql) {
            ((tql) view).mo38925A0(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.nx2
    /* JADX INFO: renamed from: k */
    public void mo165056k(View view) {
        super.mo165056k(view);
        if (view instanceof tql) {
            ((tql) view).mo38965K(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.nx2
    /* JADX INFO: renamed from: l */
    public void mo105835l(View view, boolean z) {
        if (view instanceof tql) {
            ((tql) view).mo37904k(z);
        }
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: m */
    public void mo105836m(txl0 txl0Var) {
        CoreSuggested.UserInfo userInfo;
        User userM38916z;
        if (mo105831f() <= 0) {
            CrashHelper.m82479c(new RuntimeException("移出卡片时栈已经空了" + mo140727b()));
            this.f190268c.post(new Runnable() { // from class: l.vp90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185223a.m207432z();
                }
            });
            return;
        }
        Object obj = txl0Var.f176570c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) obj;
            t4j.m189282h("remove card:" + userInfo2.f20214id + Constants.SEPARATOR_COMMA + userInfo2.virtualCardType + Constants.SEPARATOR_COMMA + txl0Var.m193511d());
            if (!this.f190267b.m38909J(userInfo2)) {
                CrashHelper.m82479c(new RuntimeException("移出卡片时数据已经不存在:" + mo105831f() + "renderList:" + mo140727b()));
                this.f190268c.post(new Runnable() { // from class: l.up90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f180230a.m207431y();
                    }
                });
                return;
            }
            CoreModule.f18264c.f20405m0.m32017J8(userInfo2);
            if (gra.m131606N3()) {
                if (CoreModule.f18264c.f20405m0.f20136a0.m222761e() == null || jyb.m147479J(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded)) {
                    userInfo = null;
                    userM38916z = null;
                } else {
                    userInfo = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0);
                    userM38916z = this.f190267b.m38916z(userInfo.f20214id);
                }
                ExpandedCardStyleHelper.m39093o().m39113z(userM38916z, userInfo);
            }
            this.f190267b.m38905E();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m207426t(CoreSuggested.UserInfo userInfo, int i) {
        if (i == 0) {
            if (userInfo.isVirtualCard()) {
                CoreModule.f18264c.f20405m0.f20089J0.m137019l(Boolean.TRUE);
            } else {
                CoreModule.f18264c.f20405m0.f20089J0.m137019l(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m207427u(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.m82486a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m207428v(VirtualCardType virtualCardType) {
        if (this.f190272g.containsKey(virtualCardType)) {
            return this.f190272g.get(virtualCardType).intValue();
        }
        int i = this.f190274i;
        this.f190274i = i + 1;
        this.f190272g.put(virtualCardType, Integer.valueOf(i));
        this.f190273h.put(Integer.valueOf(i), virtualCardType);
        return this.f190272g.get(virtualCardType).intValue();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m207429w(View view) {
        if (NullChecker.m82486a(this.f190270e)) {
            if (this.f190275j == -1 || pzi0.m174454o() - this.f190275j >= 500 || pzi0.m174454o() - this.f190275j < 0) {
                this.f190275j = pzi0.m174454o();
                this.f190270e.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m207430x(CoreSuggested.UserInfo userInfo, VirtualCard virtualCard) {
        if (userInfo != null) {
            HomeStatisticsHelper.m37706i(userInfo, "p_suggest_users_home_view");
            HomeStatisticsHelper.m37715r(virtualCard.getCardData(), "p_suggest_users_home_view", userInfo.f20214id, this.f190271f.m38369v2().m102015g6(userInfo.f20214id));
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m207431y() {
        mo140726a();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m207432z() {
        mo140726a();
    }
}
