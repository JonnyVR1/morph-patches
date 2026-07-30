package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.d30;
import l.e51;
import l.qol0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gi90 extends yw2 implements d30 {

    /* JADX INFO: renamed from: b */
    public hz30 f13580b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f13581c;

    /* JADX INFO: renamed from: d */
    public qol0 f13582d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f13583e;

    /* JADX INFO: renamed from: f */
    public idl f13584f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f13585g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f13586h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f13587i = 2;

    /* JADX INFO: renamed from: j */
    public long f13588j = -1;

    public gi90(BifrostLayout bifrostLayout, hz30 hz30Var, qol0 qol0Var, idl idlVar) {
        this.f13580b = hz30Var;
        this.f13582d = qol0Var;
        hz30Var.m16043H(this);
        this.f13581c = bifrostLayout;
        this.f13584f = idlVar;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m15053r(View view) {
    }

    /* JADX INFO: renamed from: t */
    private void m15055t(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.id = "VirtualCard";
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private int m15056u(VirtualCardType virtualCardType) {
        if (this.f13585g.containsKey(virtualCardType)) {
            return this.f13585g.get(virtualCardType).intValue();
        }
        int i = this.f13587i;
        this.f13587i = i + 1;
        this.f13585g.put(virtualCardType, Integer.valueOf(i));
        this.f13586h.put(Integer.valueOf(i), virtualCardType);
        return this.f13585g.get(virtualCardType).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m15057v(View view) {
        if (NullChecker.a(this.f13583e)) {
            if (this.f13588j == -1 || mqi0.m18550o() - this.f13588j >= 500 || mqi0.m18550o() - this.f13588j < 0) {
                this.f13588j = mqi0.m18550o();
                this.f13583e.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m15058x() {
        mo12312a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m15059y() {
        mo12312a();
    }

    public void call() {
        mo12312a();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: d */
    public void mo11922d(View view, final int i) {
        int iMo11926h = mo11926h(i);
        if (iMo11926h == 0 && (view instanceof a5m)) {
            hz30 hz30Var = this.f13580b;
            hz30Var.m16044j(view, (CoreSuggested.UserInfo) hz30Var.getItem(i), mo11926h(i), i);
            if (i == 0) {
                xdl0.E0(view, new View.OnClickListener() { // from class: l.ci90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f10613a.m15057v(view2);
                    }
                });
                return;
            } else {
                view.setOnClickListener(null);
                return;
            }
        }
        if (view instanceof VirtualCard) {
            final VirtualCard virtualCard = (VirtualCard) view;
            VirtualCardType virtualCardType = this.f13586h.get(Integer.valueOf(iMo11926h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f13580b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f13582d.d2(virtualCardType, userInfo));
                virtualCard.setClipChildren(false);
            }
            virtualCard.K0(i, virtualCardType, userInfo);
            if (i == 0) {
                xdl0.E0(virtualCard, new View.OnClickListener() { // from class: l.di90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.H0(virtualCard2);
                    }
                });
            } else {
                xdl0.E0(virtualCard, new View.OnClickListener() { // from class: l.ei90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        gi90.m15053r(view2);
                    }
                });
            }
            if (i == 0) {
                e51.H(this.f13581c.getContext(), new Runnable() { // from class: l.fi90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13024a.m15060w(i, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: e */
    public View mo11923e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f13580b.m16045m(this.f13581c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        xdl0.M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: f */
    public int mo11924f() {
        return this.f13580b.getCount();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo11925g(int i) {
        return this.f13580b.getItem(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: h */
    public int mo11926h(int i) {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f13580b.getItem(i);
        m15055t(userInfo);
        return TextUtils.equals(userInfo.id, "VirtualCard") ? m15056u(userInfo.virtualCardType) : this.f13580b.getItemViewType(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: i */
    public String mo11927i(int i) {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f13580b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(((CoreSuggested.UserInfo) this.f13580b.getItem(i)).id);
        VirtualCardType virtualCardType = userInfo.virtualCardType;
        sb.append(virtualCardType != null ? virtualCardType.getId() : "userType");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.yw2
    /* JADX INFO: renamed from: l */
    public void mo11928l(View view, boolean z) {
        if (view instanceof mol) {
            ((mol) view).mo864k(z);
        }
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: m */
    public void mo11929m(pol0 pol0Var) {
        if (mo11924f() <= 0) {
            CrashHelper.c(new RuntimeException("移出卡片时栈已经空了" + mo12313b()));
            this.f13581c.post(new Runnable() { // from class: l.bi90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10117a.m15059y();
                }
            });
            return;
        }
        Object obj = pol0Var.f18802c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
            y1j.m25171h("remove card:" + userInfo.id + "," + userInfo.virtualCardType + "," + pol0Var.m20522d());
            if (this.f13580b.m16041F(userInfo)) {
                CoreModule.c.n0.X3(userInfo);
                return;
            }
            CrashHelper.c(new RuntimeException("移出卡片时数据已经不存在:" + mo11924f() + "renderList:" + mo12313b()));
            this.f13581c.post(new Runnable() { // from class: l.ai90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9530a.m15058x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m15060w(int i, VirtualCard virtualCard) {
        HomeStatisticsHelper.m652i((CoreSuggested.UserInfo) this.f13580b.getItem(i), "p_suggest_users_home_view");
        HomeStatisticsHelper.m661r(virtualCard.getCardData(), "p_suggest_users_home_view", ((CoreSuggested.UserInfo) this.f13580b.getItem(i)).id, this.f13584f.m16470p0().m13119N1(((CoreSuggested.UserInfo) this.f13580b.getItem(i)).id));
    }

    /* JADX INFO: renamed from: z */
    public void m15061z(View.OnClickListener onClickListener) {
        this.f13583e = onClickListener;
    }
}
