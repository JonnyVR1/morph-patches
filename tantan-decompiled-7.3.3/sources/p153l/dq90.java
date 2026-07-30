package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class dq90 extends nx2 implements x20 {

    /* JADX INFO: renamed from: b */
    public s740 f90181b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f90182c;

    /* JADX INFO: renamed from: d */
    public uxl0 f90183d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f90184e;

    /* JADX INFO: renamed from: f */
    public pkp f90185f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f90186g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f90187h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f90188i = 2;

    /* JADX INFO: renamed from: j */
    public long f90189j = -1;

    public dq90(BifrostLayout bifrostLayout, s740 s740Var, uxl0 uxl0Var, pkp pkpVar) {
        this.f90181b = s740Var;
        this.f90183d = uxl0Var;
        s740Var.m184954H(this);
        this.f90182c = bifrostLayout;
        this.f90185f = pkpVar;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m117500p(View view) {
    }

    /* JADX INFO: renamed from: t */
    private void m117504t(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.m82486a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private int m117505u(VirtualCardType virtualCardType) {
        if (this.f90186g.containsKey(virtualCardType)) {
            return this.f90186g.get(virtualCardType).intValue();
        }
        int i = this.f90188i;
        this.f90188i = i + 1;
        this.f90186g.put(virtualCardType, Integer.valueOf(i));
        this.f90187h.put(Integer.valueOf(i), virtualCardType);
        return this.f90186g.get(virtualCardType).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m117506v(View view) {
        if (NullChecker.m82486a(this.f90184e)) {
            if (this.f90189j == -1 || pzi0.m174454o() - this.f90189j >= 500 || pzi0.m174454o() - this.f90189j < 0) {
                this.f90189j = pzi0.m174454o();
                this.f90184e.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m117507w(int i, VirtualCard virtualCard) {
        HomeStatisticsHelper.m37706i(this.f90181b.getItem(i), "p_suggest_users_home_view");
        HomeStatisticsHelper.m37715r(virtualCard.getCardData(), "p_suggest_users_home_view", this.f90181b.getItem(i).f20214id, this.f90185f.m172721k0().m135449B1(this.f90181b.getItem(i).f20214id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m117508x() {
        mo140726a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m117509y() {
        mo140726a();
    }

    @Override // p153l.x20
    public void call() {
        mo140726a();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: d */
    public void mo105829d(View view, final int i) {
        int iMo105833h = mo105833h(i);
        if (iMo105833h == 0 && (view instanceof q7m)) {
            s740 s740Var = this.f90181b;
            s740Var.mo21401j(view, s740Var.getItem(i), mo105833h(i), i);
            if (i == 0) {
                bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.xp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f195699a.m117506v(view2);
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
            VirtualCardType virtualCardType = this.f90187h.get(Integer.valueOf(iMo105833h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            CoreSuggested.UserInfo item = this.f90181b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f90183d.mo37757d2(virtualCardType, item));
                virtualCard.setClipChildren(false);
            }
            virtualCard.m47268K0(i, virtualCardType, item);
            if (i == 0) {
                bnl0.m105509E0(virtualCard, new View.OnClickListener() { // from class: l.yp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.m47265H0(virtualCard2);
                    }
                });
            } else {
                bnl0.m105509E0(virtualCard, new View.OnClickListener() { // from class: l.zp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        dq90.m117500p(view2);
                    }
                });
            }
            if (i == 0) {
                l51.m152888H(this.f90182c.getContext(), new Runnable() { // from class: l.aq90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72797a.m117507w(i, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: e */
    public View mo105830e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f90181b.mo21402m(this.f90182c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        bnl0.m105525M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: f */
    public int mo105831f() {
        return this.f90181b.getCount();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: g */
    public Object mo105832g(int i) {
        return this.f90181b.getItem(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: h */
    public int mo105833h(int i) {
        CoreSuggested.UserInfo item = this.f90181b.getItem(i);
        m117504t(item);
        return TextUtils.equals(item.f20214id, CoreSuggested.UserInfo.VIRTUAL_CARD) ? m117505u(item.virtualCardType) : this.f90181b.getItemViewType(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: i */
    public String mo105834i(int i) {
        CoreSuggested.UserInfo item = this.f90181b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f90181b.getItem(i).f20214id);
        VirtualCardType virtualCardType = item.virtualCardType;
        sb.append(virtualCardType != null ? virtualCardType.getId() : "userType");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.nx2
    /* JADX INFO: renamed from: l */
    public void mo105835l(View view, boolean z) {
        if (view instanceof xql) {
            ((xql) view).mo37904k(z);
        }
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: m */
    public void mo105836m(txl0 txl0Var) {
        if (mo105831f() <= 0) {
            CrashHelper.m82479c(new RuntimeException("移出卡片时栈已经空了" + mo140727b()));
            this.f90182c.post(new Runnable() { // from class: l.cq90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83076a.m117509y();
                }
            });
            return;
        }
        Object obj = txl0Var.f176570c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
            t4j.m189282h("remove card:" + userInfo.f20214id + Constants.SEPARATOR_COMMA + userInfo.virtualCardType + Constants.SEPARATOR_COMMA + txl0Var.m193511d());
            if (this.f90181b.m184952F(userInfo)) {
                CoreModule.f18264c.f20411o0.m35326Z3(userInfo);
                return;
            }
            CrashHelper.m82479c(new RuntimeException("移出卡片时数据已经不存在:" + mo105831f() + "renderList:" + mo140727b()));
            this.f90182c.post(new Runnable() { // from class: l.bq90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77867a.m117508x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public void m117510z(View.OnClickListener onClickListener) {
        this.f90184e = onClickListener;
    }
}
