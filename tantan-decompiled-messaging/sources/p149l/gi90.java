package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class gi90 extends yw2 implements d30 {

    /* JADX INFO: renamed from: b */
    public hz30 f102860b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f102861c;

    /* JADX INFO: renamed from: d */
    public qol0 f102862d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f102863e;

    /* JADX INFO: renamed from: f */
    public idl f102864f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f102865g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f102866h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f102867i = 2;

    /* JADX INFO: renamed from: j */
    public long f102868j = -1;

    public gi90(BifrostLayout bifrostLayout, hz30 hz30Var, qol0 qol0Var, idl idlVar) {
        this.f102860b = hz30Var;
        this.f102862d = qol0Var;
        hz30Var.m133661H(this);
        this.f102861c = bifrostLayout;
        this.f102864f = idlVar;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m126267r(View view) {
    }

    /* JADX INFO: renamed from: t */
    private void m126269t(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.m81303a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    private int m126270u(VirtualCardType virtualCardType) {
        if (this.f102865g.containsKey(virtualCardType)) {
            return this.f102865g.get(virtualCardType).intValue();
        }
        int i = this.f102867i;
        this.f102867i = i + 1;
        this.f102865g.put(virtualCardType, Integer.valueOf(i));
        this.f102866h.put(Integer.valueOf(i), virtualCardType);
        return this.f102865g.get(virtualCardType).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m126271v(View view) {
        if (NullChecker.m81303a(this.f102863e)) {
            if (this.f102868j == -1 || mqi0.m155944o() - this.f102868j >= 500 || mqi0.m155944o() - this.f102868j < 0) {
                this.f102868j = mqi0.m155944o();
                this.f102863e.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m126272x() {
        mo104259a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m126273y() {
        mo104259a();
    }

    @Override // p149l.d30
    public void call() {
        mo104259a();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: d */
    public void mo100897d(View view, final int i) {
        int iMo100901h = mo100901h(i);
        if (iMo100901h == 0 && (view instanceof a5m)) {
            hz30 hz30Var = this.f102860b;
            hz30Var.mo20402j(view, hz30Var.getItem(i), mo100901h(i), i);
            if (i == 0) {
                xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ci90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f81048a.m126271v(view2);
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
            VirtualCardType virtualCardType = this.f102866h.get(Integer.valueOf(iMo100901h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            CoreSuggested.UserInfo item = this.f102860b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f102862d.mo36754d2(virtualCardType, item));
                virtualCard.setClipChildren(false);
            }
            virtualCard.m46085K0(i, virtualCardType, item);
            if (i == 0) {
                xdl0.m208329E0(virtualCard, new View.OnClickListener() { // from class: l.di90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.m46082H0(virtualCard2);
                    }
                });
            } else {
                xdl0.m208329E0(virtualCard, new View.OnClickListener() { // from class: l.ei90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        gi90.m126267r(view2);
                    }
                });
            }
            if (i == 0) {
                e51.m114743H(this.f102861c.getContext(), new Runnable() { // from class: l.fi90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f97644a.m126274w(i, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: e */
    public View mo100898e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f102860b.mo20403m(this.f102861c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        xdl0.m208345M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: f */
    public int mo100899f() {
        return this.f102860b.getCount();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo100900g(int i) {
        return this.f102860b.getItem(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: h */
    public int mo100901h(int i) {
        CoreSuggested.UserInfo item = this.f102860b.getItem(i);
        m126269t(item);
        return TextUtils.equals(item.f19472id, CoreSuggested.UserInfo.VIRTUAL_CARD) ? m126270u(item.virtualCardType) : this.f102860b.getItemViewType(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: i */
    public String mo100902i(int i) {
        CoreSuggested.UserInfo item = this.f102860b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102860b.getItem(i).f19472id);
        VirtualCardType virtualCardType = item.virtualCardType;
        sb.append(virtualCardType != null ? virtualCardType.getId() : "userType");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yw2
    /* JADX INFO: renamed from: l */
    public void mo100903l(View view, boolean z) {
        if (view instanceof mol) {
            ((mol) view).mo36901k(z);
        }
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: m */
    public void mo100904m(pol0 pol0Var) {
        if (mo100899f() <= 0) {
            CrashHelper.m81296c(new RuntimeException("移出卡片时栈已经空了" + mo104260b()));
            this.f102861c.post(new Runnable() { // from class: l.bi90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75712a.m126273y();
                }
            });
            return;
        }
        Object obj = pol0Var.f150532c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
            y1j.m212199h("remove card:" + userInfo.f19472id + Constants.SEPARATOR_COMMA + userInfo.virtualCardType + Constants.SEPARATOR_COMMA + pol0Var.m170603d());
            if (this.f102860b.m133659F(userInfo)) {
                CoreModule.f17545c.f19666n0.m31453X3(userInfo);
                return;
            }
            CrashHelper.m81296c(new RuntimeException("移出卡片时数据已经不存在:" + mo100899f() + "renderList:" + mo104260b()));
            this.f102861c.post(new Runnable() { // from class: l.ai90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69964a.m126272x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m126274w(int i, VirtualCard virtualCard) {
        HomeStatisticsHelper.m36703i(this.f102860b.getItem(i), "p_suggest_users_home_view");
        HomeStatisticsHelper.m36712r(virtualCard.getCardData(), "p_suggest_users_home_view", this.f102860b.getItem(i).f19472id, this.f102864f.m135577p0().m110809N1(this.f102860b.getItem(i).f19472id));
    }

    /* JADX INFO: renamed from: z */
    public void m126275z(View.OnClickListener onClickListener) {
        this.f102863e = onClickListener;
    }
}
