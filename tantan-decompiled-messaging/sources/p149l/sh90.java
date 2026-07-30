package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.C7943c;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class sh90 extends yw2 implements d30 {

    /* JADX INFO: renamed from: b */
    public C7943c f164524b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f164525c;

    /* JADX INFO: renamed from: d */
    public qol0 f164526d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f164527e;

    /* JADX INFO: renamed from: f */
    public ViewTreeObserverOnGlobalLayoutListenerC7866b f164528f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f164529g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f164530h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f164531i = 2;

    /* JADX INFO: renamed from: j */
    public long f164532j = -1;

    public sh90(BifrostLayout bifrostLayout, C7943c c7943c, qol0 qol0Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        this.f164524b = c7943c;
        this.f164526d = qol0Var;
        c7943c.m37908L(this);
        this.f164525c = bifrostLayout;
        this.f164528f = viewTreeObserverOnGlobalLayoutListenerC7866b;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m184165o(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m184170A(View.OnClickListener onClickListener) {
        this.f164527e = onClickListener;
    }

    @Override // p149l.d30
    public void call() {
        mo104259a();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: d */
    public void mo100897d(View view, int i) {
        C7943c c7943c;
        int iMo100901h = mo100901h(i);
        if (iMo100901h == 0 && (view instanceof a5m)) {
            C7943c c7943c2 = this.f164524b;
            c7943c2.mo20402j(view, c7943c2.getItem(i), mo100901h(i), i);
            if (i != 0) {
                view.setOnClickListener(null);
                return;
            }
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.mh90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f133787a.m184176w(view2);
                }
            });
            if (upa.m194675N3()) {
                view.setClickable(false);
                return;
            }
            return;
        }
        if (view instanceof VirtualCard) {
            if (i == 0 && (c7943c = this.f164524b) != null) {
                c7943c.m37901D();
            }
            final VirtualCard virtualCard = (VirtualCard) view;
            VirtualCardType virtualCardType = this.f164530h.get(Integer.valueOf(iMo100901h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            if (BifrostLayout.f23322e && virtualCardType == VirtualCardType.LiveLivingCard) {
                lsi0.m151580j("直播展示了：" + i);
            }
            CoreSuggested.UserInfo item = this.f164524b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f164526d.mo36754d2(virtualCardType, item));
                virtualCard.setClipChildren(false);
            }
            m184173t(this.f164524b.getItem(i), i);
            virtualCard.m46085K0(i, virtualCardType, item);
            if (i == 0) {
                xdl0.m208329E0(virtualCard, new View.OnClickListener() { // from class: l.nh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.m46082H0(virtualCard2);
                    }
                });
            } else {
                xdl0.m208329E0(virtualCard, new View.OnClickListener() { // from class: l.oh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        sh90.m184165o(view2);
                    }
                });
            }
            if (i == 0) {
                final CoreSuggested.UserInfo item2 = this.f164524b.getItem(0);
                e51.m114743H(this.f164525c.getContext(), new Runnable() { // from class: l.ph90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f148882a.m184177x(item2, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: e */
    public View mo100898e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f164524b.mo20403m(this.f164525c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        xdl0.m208345M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: f */
    public int mo100899f() {
        return this.f164524b.getCount();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo100900g(int i) {
        return this.f164524b.getItem(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: h */
    public int mo100901h(int i) {
        CoreSuggested.UserInfo item = this.f164524b.getItem(i);
        m184174u(item);
        return TextUtils.equals(item.f19472id, CoreSuggested.UserInfo.VIRTUAL_CARD) ? m184175v(item.virtualCardType) : this.f164524b.getItemViewType(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: i */
    public String mo100902i(int i) {
        CoreSuggested.UserInfo item = this.f164524b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f164524b.getItem(i).f19472id);
        VirtualCardType virtualCardType = item.virtualCardType;
        sb.append(virtualCardType != null ? virtualCardType.getId() : "userType");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yw2
    /* JADX INFO: renamed from: j */
    public void mo184171j(View view) {
        super.mo184171j(view);
        if (view instanceof iol) {
            ((iol) view).mo37922A0(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yw2
    /* JADX INFO: renamed from: k */
    public void mo184172k(View view) {
        super.mo184172k(view);
        if (view instanceof iol) {
            ((iol) view).mo37962K(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yw2
    /* JADX INFO: renamed from: l */
    public void mo100903l(View view, boolean z) {
        if (view instanceof iol) {
            ((iol) view).mo36901k(z);
        }
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: m */
    public void mo100904m(pol0 pol0Var) {
        CoreSuggested.UserInfo userInfo;
        User userM37913z;
        if (mo100899f() <= 0) {
            CrashHelper.m81296c(new RuntimeException("移出卡片时栈已经空了" + mo104260b()));
            this.f164525c.post(new Runnable() { // from class: l.rh90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159348a.m184179z();
                }
            });
            return;
        }
        Object obj = pol0Var.f150532c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo2 = (CoreSuggested.UserInfo) obj;
            y1j.m212199h("remove card:" + userInfo2.f19472id + Constants.SEPARATOR_COMMA + userInfo2.virtualCardType + Constants.SEPARATOR_COMMA + pol0Var.m170603d());
            if (!this.f164524b.m37906J(userInfo2)) {
                CrashHelper.m81296c(new RuntimeException("移出卡片时数据已经不存在:" + mo100899f() + "renderList:" + mo104260b()));
                this.f164525c.post(new Runnable() { // from class: l.qh90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f154438a.m184178y();
                    }
                });
                return;
            }
            CoreModule.f17545c.f19663m0.m31014J8(userInfo2);
            if (upa.m194675N3()) {
                if (CoreModule.f17545c.f19663m0.f19394a0.m221515e() == null || vwb.m200296J(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded)) {
                    userInfo = null;
                    userM37913z = null;
                } else {
                    userInfo = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0);
                    userM37913z = this.f164524b.m37913z(userInfo.f19472id);
                }
                ExpandedCardStyleHelper.m38090o().m38110z(userM37913z, userInfo);
            }
            this.f164524b.m37902E();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m184173t(CoreSuggested.UserInfo userInfo, int i) {
        if (i == 0) {
            if (userInfo.isVirtualCard()) {
                CoreModule.f17545c.f19663m0.f19347J0.m132487l(Boolean.TRUE);
            } else {
                CoreModule.f17545c.f19663m0.f19347J0.m132487l(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m184174u(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.m81303a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final int m184175v(VirtualCardType virtualCardType) {
        if (this.f164529g.containsKey(virtualCardType)) {
            return this.f164529g.get(virtualCardType).intValue();
        }
        int i = this.f164531i;
        this.f164531i = i + 1;
        this.f164529g.put(virtualCardType, Integer.valueOf(i));
        this.f164530h.put(Integer.valueOf(i), virtualCardType);
        return this.f164529g.get(virtualCardType).intValue();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m184176w(View view) {
        if (NullChecker.m81303a(this.f164527e)) {
            if (this.f164532j == -1 || mqi0.m155944o() - this.f164532j >= 500 || mqi0.m155944o() - this.f164532j < 0) {
                this.f164532j = mqi0.m155944o();
                this.f164527e.onClick(view);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m184177x(CoreSuggested.UserInfo userInfo, VirtualCard virtualCard) {
        if (userInfo != null) {
            HomeStatisticsHelper.m36703i(userInfo, "p_suggest_users_home_view");
            HomeStatisticsHelper.m36712r(virtualCard.getCardData(), "p_suggest_users_home_view", userInfo.f19472id, this.f164528f.m37366v2().m161221g6(userInfo.f19472id));
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m184178y() {
        mo104259a();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m184179z() {
        mo104259a();
    }
}
