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
public class zh90 extends yw2 implements d30 {

    /* JADX INFO: renamed from: b */
    public ez30 f203145b;

    /* JADX INFO: renamed from: c */
    public BifrostLayout f203146c;

    /* JADX INFO: renamed from: d */
    public qol0 f203147d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f203148e;

    /* JADX INFO: renamed from: f */
    public pip f203149f;

    /* JADX INFO: renamed from: g */
    public HashMap<VirtualCardType, Integer> f203150g = new HashMap<>();

    /* JADX INFO: renamed from: h */
    public HashMap<Integer, VirtualCardType> f203151h = new HashMap<>();

    /* JADX INFO: renamed from: i */
    public int f203152i = 2;

    /* JADX INFO: renamed from: j */
    public long f203153j = -1;

    public zh90(BifrostLayout bifrostLayout, ez30 ez30Var, qol0 qol0Var, pip pipVar) {
        this.f203145b = ez30Var;
        this.f203147d = qol0Var;
        ez30Var.m118837H(this);
        this.f203146c = bifrostLayout;
        this.f203149f = pipVar;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m218779p(View view) {
    }

    /* JADX INFO: renamed from: t */
    private void m218783t(CoreSuggested.UserInfo userInfo) {
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
    private int m218784u(VirtualCardType virtualCardType) {
        if (this.f203150g.containsKey(virtualCardType)) {
            return this.f203150g.get(virtualCardType).intValue();
        }
        int i = this.f203152i;
        this.f203152i = i + 1;
        this.f203150g.put(virtualCardType, Integer.valueOf(i));
        this.f203151h.put(Integer.valueOf(i), virtualCardType);
        return this.f203150g.get(virtualCardType).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m218785v(View view) {
        if (NullChecker.m81303a(this.f203148e)) {
            if (this.f203153j == -1 || mqi0.m155944o() - this.f203153j >= 500 || mqi0.m155944o() - this.f203153j < 0) {
                this.f203153j = mqi0.m155944o();
                this.f203148e.onClick(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m218786w(int i, VirtualCard virtualCard) {
        HomeStatisticsHelper.m36703i(this.f203145b.getItem(i), "p_suggest_users_home_view");
        HomeStatisticsHelper.m36712r(virtualCard.getCardData(), "p_suggest_users_home_view", this.f203145b.getItem(i).f19472id, this.f203149f.m169725k0().m131045B1(this.f203145b.getItem(i).f19472id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m218787x() {
        mo104259a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m218788y() {
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
            ez30 ez30Var = this.f203145b;
            ez30Var.mo20402j(view, ez30Var.getItem(i), mo100901h(i), i);
            if (i == 0) {
                xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.th90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f170212a.m218785v(view2);
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
            VirtualCardType virtualCardType = this.f203151h.get(Integer.valueOf(iMo100901h));
            if (virtualCardType == null) {
                virtualCardType = VirtualCardType.Unknown;
            }
            CoreSuggested.UserInfo item = this.f203145b.getItem(i);
            if (virtualCard.getAdapter() == null || virtualCard.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
                virtualCard.setCardType(virtualCardType);
                virtualCard.setAdapter(this.f203147d.mo36754d2(virtualCardType, item));
                virtualCard.setClipChildren(false);
            }
            virtualCard.m46085K0(i, virtualCardType, item);
            if (i == 0) {
                xdl0.m208329E0(virtualCard, new View.OnClickListener() { // from class: l.uh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        VirtualCard virtualCard2 = virtualCard;
                        virtualCard2.m46082H0(virtualCard2);
                    }
                });
            } else {
                xdl0.m208329E0(virtualCard, new View.OnClickListener() { // from class: l.vh90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        zh90.m218779p(view2);
                    }
                });
            }
            if (i == 0) {
                e51.m114743H(this.f203146c.getContext(), new Runnable() { // from class: l.wh90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f186375a.m218786w(i, virtualCard);
                    }
                }, 100L);
            }
        }
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: e */
    public View mo100898e(int i, Context context, LayoutInflater layoutInflater) {
        if (i == 0) {
            return this.f203145b.mo20403m(this.f203146c, i);
        }
        VirtualCard virtualCard = new VirtualCard(context);
        xdl0.m208345M0(virtualCard, true);
        return virtualCard;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: f */
    public int mo100899f() {
        return this.f203145b.getCount();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo100900g(int i) {
        return this.f203145b.getItem(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: h */
    public int mo100901h(int i) {
        CoreSuggested.UserInfo item = this.f203145b.getItem(i);
        m218783t(item);
        return TextUtils.equals(item.f19472id, CoreSuggested.UserInfo.VIRTUAL_CARD) ? m218784u(item.virtualCardType) : this.f203145b.getItemViewType(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: i */
    public String mo100902i(int i) {
        CoreSuggested.UserInfo item = this.f203145b.getItem(i);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f203145b.getItem(i).f19472id);
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
            this.f203146c.post(new Runnable() { // from class: l.yh90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198287a.m218788y();
                }
            });
            return;
        }
        Object obj = pol0Var.f150532c;
        if (obj instanceof CoreSuggested.UserInfo) {
            CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
            y1j.m212199h("remove card:" + userInfo.f19472id + Constants.SEPARATOR_COMMA + userInfo.virtualCardType + Constants.SEPARATOR_COMMA + pol0Var.m170603d());
            if (this.f203145b.m118835F(userInfo)) {
                CoreModule.f17545c.f19669o0.m34323Z3(userInfo);
                return;
            }
            CrashHelper.m81296c(new RuntimeException("移出卡片时数据已经不存在:" + mo100899f() + "renderList:" + mo104260b()));
            this.f203146c.post(new Runnable() { // from class: l.xh90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192865a.m218787x();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public void m218789z(View.OnClickListener onClickListener) {
        this.f203148e = onClickListener;
    }
}
