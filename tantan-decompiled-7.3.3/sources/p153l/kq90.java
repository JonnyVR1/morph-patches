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
public class kq90 extends nx2 implements x20 {

    /* JADX INFO: renamed from: b */
    public v740 f128198b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f128199c;

    /* JADX INFO: renamed from: d */
    public uxl0 f128200d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f128201e;

    /* JADX INFO: renamed from: f */
    public yfl f128202f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f128203g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f128204h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f128205i = 2;

    /* JADX INFO: renamed from: j */
    public long f128206j = -1;

    public kq90(BifrostLayout bifrostLayout, v740 v740Var, uxl0 uxl0Var, yfl yflVar) {
        this.f128198b = v740Var;
        this.f128200d = uxl0Var;
        v740Var.m200188H(this);
        this.f128199c = bifrostLayout;
        this.f128202f = yflVar;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m150848r(View view) {
    }

    /* JADX INFO: renamed from: t */
    private void m150850t(CoreSuggested.UserInfo userInfo) {
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
    private int m150851u(VirtualCardType virtualCardType) {
        if (this.f128203g.containsKey(virtualCardType)) {
            return this.f128203g.get(virtualCardType).intValue();
        }
        int i = this.f128205i;
        this.f128205i = i + 1;
        this.f128203g.put(virtualCardType, Integer.valueOf(i));
        this.f128204h.put(Integer.valueOf(i), virtualCardType);
        return this.f128203g.get(virtualCardType).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m150852v(View view) {
        if (NullChecker.m82486a(this.f128201e)) {
            if (this.f128206j == -1 || pzi0.m174454o() - this.f128206j >= 500 || pzi0.m174454o() - this.f128206j < 0) {
                this.f128206j = pzi0.m174454o();
                this.f128201e.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m150853x() {
        mo140726a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m150854y() {
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
            v740 v740Var = this.f128198b;
            v740Var.mo21401j(view, v740Var.getItem(i), mo105833h(i), i);
            if (i == 0) {
                bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.gq90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f105667a.m150852v(view2);
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
            VirtualCardType virtualCardType = this.f128204h.get(Integer.valueOf(iMo105833h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            CoreSuggested.UserInfo item = this.f128198b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f128200d.mo37757d2(virtualCardType, item));
                virtualCard.setClipChildren(false);
            }
            virtualCard.m47268K0(i, virtualCardType, item);
            if (i == 0) {
                bnl0.m105509E0(virtualCard, new View.OnClickListener() { // from class: l.hq90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.m47265H0(virtualCard2);
                    }
                });
            } else {
                bnl0.m105509E0(virtualCard, new View.OnClickListener() { // from class: l.iq90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        kq90.m150848r(view2);
                    }
                });
            }
            if (i == 0) {
                l51.m152888H(this.f128199c.getContext(), new Runnable() { // from class: l.jq90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f122188a.m150855w(i, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: e */
    public View mo105830e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f128198b.mo21402m(this.f128199c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        bnl0.m105525M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: f */
    public int mo105831f() {
        return this.f128198b.getCount();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: g */
    public Object mo105832g(int i) {
        return this.f128198b.getItem(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: h */
    public int mo105833h(int i) {
        CoreSuggested.UserInfo item = this.f128198b.getItem(i);
        m150850t(item);
        return TextUtils.equals(item.f20214id, CoreSuggested.UserInfo.VIRTUAL_CARD) ? m150851u(item.virtualCardType) : this.f128198b.getItemViewType(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: i */
    public String mo105834i(int i) {
        CoreSuggested.UserInfo item = this.f128198b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f128198b.getItem(i).f20214id);
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
            this.f128199c.post(new Runnable() { // from class: l.fq90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100258a.m150854y();
                }
            });
            return;
        }
        Object obj = txl0Var.f176570c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
            t4j.m189282h("remove card:" + userInfo.f20214id + Constants.SEPARATOR_COMMA + userInfo.virtualCardType + Constants.SEPARATOR_COMMA + txl0Var.m193511d());
            if (this.f128198b.m200186F(userInfo)) {
                CoreModule.f18264c.f20408n0.m32456X3(userInfo);
                return;
            }
            CrashHelper.m82479c(new RuntimeException("移出卡片时数据已经不存在:" + mo105831f() + "renderList:" + mo140727b()));
            this.f128199c.post(new Runnable() { // from class: l.eq90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f95317a.m150853x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m150855w(int i, VirtualCard virtualCard) {
        HomeStatisticsHelper.m37706i(this.f128198b.getItem(i), "p_suggest_users_home_view");
        HomeStatisticsHelper.m37715r(virtualCard.getCardData(), "p_suggest_users_home_view", this.f128198b.getItem(i).f20214id, this.f128202f.m215730p0().m190791N1(this.f128198b.getItem(i).f20214id));
    }

    /* JADX INFO: renamed from: z */
    public void m150856z(View.OnClickListener onClickListener) {
        this.f128201e = onClickListener;
    }
}
