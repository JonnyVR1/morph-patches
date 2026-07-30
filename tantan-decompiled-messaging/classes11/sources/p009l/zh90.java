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
public class zh90 extends yw2 implements d30 {

    /* JADX INFO: renamed from: b */
    public ez30 f23664b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f23665c;

    /* JADX INFO: renamed from: d */
    public qol0 f23666d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f23667e;

    /* JADX INFO: renamed from: f */
    public pip f23668f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f23669g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f23670h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f23671i = 2;

    /* JADX INFO: renamed from: j */
    public long f23672j = -1;

    public zh90(BifrostLayout bifrostLayout, ez30 ez30Var, qol0 qol0Var, pip pipVar) {
        this.f23664b = ez30Var;
        this.f23666d = qol0Var;
        ez30Var.m14191H(this);
        this.f23665c = bifrostLayout;
        this.f23668f = pipVar;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m25773p(View view) {
    }

    /* JADX INFO: renamed from: t */
    private void m25777t(CoreSuggested.UserInfo userInfo) {
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
    private int m25778u(VirtualCardType virtualCardType) {
        if (this.f23669g.containsKey(virtualCardType)) {
            return this.f23669g.get(virtualCardType).intValue();
        }
        int i = this.f23671i;
        this.f23671i = i + 1;
        this.f23669g.put(virtualCardType, Integer.valueOf(i));
        this.f23670h.put(Integer.valueOf(i), virtualCardType);
        return this.f23669g.get(virtualCardType).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m25779v(View view) {
        if (NullChecker.a(this.f23667e)) {
            if (this.f23672j == -1 || mqi0.m18550o() - this.f23672j >= 500 || mqi0.m18550o() - this.f23672j < 0) {
                this.f23672j = mqi0.m18550o();
                this.f23667e.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m25780w(int i, VirtualCard virtualCard) {
        HomeStatisticsHelper.m652i((CoreSuggested.UserInfo) this.f23664b.getItem(i), "p_suggest_users_home_view");
        HomeStatisticsHelper.m661r(virtualCard.getCardData(), "p_suggest_users_home_view", ((CoreSuggested.UserInfo) this.f23664b.getItem(i)).id, this.f23668f.m20410k0().m15787B1(((CoreSuggested.UserInfo) this.f23664b.getItem(i)).id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m25781x() {
        mo12312a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m25782y() {
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
            ez30 ez30Var = this.f23664b;
            ez30Var.m14192j(view, (CoreSuggested.UserInfo) ez30Var.getItem(i), mo11926h(i), i);
            if (i == 0) {
                xdl0.E0(view, new View.OnClickListener() { // from class: l.th90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f20694a.m25779v(view2);
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
            VirtualCardType virtualCardType = this.f23670h.get(Integer.valueOf(iMo11926h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f23664b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f23666d.d2(virtualCardType, userInfo));
                virtualCard.setClipChildren(false);
            }
            virtualCard.K0(i, virtualCardType, userInfo);
            if (i == 0) {
                xdl0.E0(virtualCard, new View.OnClickListener() { // from class: l.uh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.H0(virtualCard2);
                    }
                });
            } else {
                xdl0.E0(virtualCard, new View.OnClickListener() { // from class: l.vh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        zh90.m25773p(view2);
                    }
                });
            }
            if (i == 0) {
                e51.H(this.f23665c.getContext(), new Runnable() { // from class: l.wh90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22109a.m25780w(i, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: e */
    public View mo11923e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f23664b.m14193m(this.f23665c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        xdl0.M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: f */
    public int mo11924f() {
        return this.f23664b.getCount();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo11925g(int i) {
        return this.f23664b.getItem(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: h */
    public int mo11926h(int i) {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f23664b.getItem(i);
        m25777t(userInfo);
        return TextUtils.equals(userInfo.id, "VirtualCard") ? m25778u(userInfo.virtualCardType) : this.f23664b.getItemViewType(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: i */
    public String mo11927i(int i) {
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) this.f23664b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(((CoreSuggested.UserInfo) this.f23664b.getItem(i)).id);
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
            this.f23665c.post(new Runnable() { // from class: l.yh90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23061a.m25782y();
                }
            });
            return;
        }
        Object obj = pol0Var.f18802c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
            y1j.m25171h("remove card:" + userInfo.id + "," + userInfo.virtualCardType + "," + pol0Var.m20522d());
            if (this.f23664b.m14189F(userInfo)) {
                CoreModule.c.o0.Z3(userInfo);
                return;
            }
            CrashHelper.c(new RuntimeException("移出卡片时数据已经不存在:" + mo11924f() + "renderList:" + mo12313b()));
            this.f23665c.post(new Runnable() { // from class: l.xh90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22609a.m25781x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public void m25783z(View.OnClickListener onClickListener) {
        this.f23667e = onClickListener;
    }
}
