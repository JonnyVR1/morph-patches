package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p046p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.view.circleindicator.CircleIndicator2;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.subjects.C22392a;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 p2\u00020\u0001:\u0001\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001c\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010\u001f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J[\u0010\"\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\nJ\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\nJ\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010W\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010^R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010h\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010a\u001a\u0004\bf\u0010c\"\u0004\bg\u0010eR*\u0010m\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u000fR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010i\u001a\u0004\bn\u0010k\"\u0004\bo\u0010\u000f¨\u0006q"}, m87232d2 = {"Ll/g6e0;", "Ll/c3m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "j", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "m", "(Ljava/util/List;)V", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/ViewGroup;", "root", "", "small", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;Z)Landroid/view/View;", "Ll/e30;", "sectionClicked", "", "dialogStateAction", "h", "(Ljava/util/List;Ll/e30;Ll/e30;)V", "sectionPayAction", "f", "(Ljava/util/List;Ll/e30;Ll/e30;Ll/e30;)V", "upgradeSections", "k", "(Ljava/util/List;Ll/e30;Ll/e30;Ll/e30;Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/PayMethod;", FirebaseAnalytics.Param.METHOD, "e", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Ll/b90;", "helper", "c", "(Ll/b90;)V", "release", "o", "n", "show", "r", "(Z)V", "visible", "", "priceStr", "p", "(ZLjava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "setAct", "(Lcom/p1/mobile/android/app/Act;)V", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "getVpPrices", "()Landroidx/recyclerview/widget/RecyclerView;", "setVpPrices", "(Landroidx/recyclerview/widget/RecyclerView;)V", "vpPrices", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "getVpIndicator", "()Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "setVpIndicator", "(Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;)V", "vpIndicator", "Lv/VText;", "Lv/VText;", "getUpgradeTip", "()Lv/VText;", "setUpgradeTip", "(Lv/VText;)V", "upgradeTip", "Ll/c4g0;", "Ll/c4g0;", "subscribe", "g", "selectedSubscribe", "Ll/y5e0;", "Ll/y5e0;", "adapter", RXScreenCaptureService.KEY_INDEX, "Ll/e30;", "getSectionClicked", "()Ll/e30;", "setSectionClicked", "(Ll/e30;)V", "getSectionPayClicked", "setSectionPayClicked", "sectionPayClicked", "Ljava/util/List;", "getPurchaseSectionList", "()Ljava/util/List;", "setPurchaseSectionList", "purchaseSectionList", "getUpgradeSections", "setUpgradeSections", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g6e0 implements c3m {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static C22392a<Integer> f101248m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public PurchaseType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public RecyclerView vpPrices;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public CircleIndicator2 vpIndicator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public VText upgradeTip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public c4g0 subscribe;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public c4g0 selectedSubscribe;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public y5e0 adapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public e30<C8765d> sectionClicked;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<C8765d> sectionPayClicked;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public List<C8765d> purchaseSectionList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public List<C8765d> upgradeSections;

    static {
        C22392a<Integer> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        f101248m = c22392aM221512b;
    }

    public g6e0(@NotNull Act act, @Nullable PurchaseType purchaseType) {
        act.getClass();
        this.act = act;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: g */
    public static void m124578g(g6e0 g6e0Var, Integer num) {
        List<C8765d> list = g6e0Var.purchaseSectionList;
        list.getClass();
        int size = list.size();
        num.getClass();
        if (size > num.intValue()) {
            List<C8765d> list2 = g6e0Var.purchaseSectionList;
            list2.getClass();
            C8765d c8765d = list2.get(num.intValue());
            C8765d.a aVarM53520b = c8765d.m53531m() ? c8765d.m53520b() : c8765d.m53522d();
            if (NullChecker.m81303a(aVarM53520b)) {
                aVarM53520b.getClass();
                aVarM53520b.m53578e0("");
            }
            if (c8765d.m53530l()) {
                RecyclerView recyclerView = g6e0Var.vpPrices;
                recyclerView.getClass();
                recyclerView.smoothScrollToPosition(num.intValue());
                RecyclerView recyclerView2 = g6e0Var.vpPrices;
                recyclerView2.getClass();
                recyclerView2.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m124579i(List list, g6e0 g6e0Var, Integer num) {
        int iIntValue = num != null ? num.intValue() : -1;
        int size = list.size();
        C8765d c8765d = null;
        int i = 0;
        while (i < size) {
            C8765d c8765d2 = (C8765d) list.get(i);
            c8765d2.m53540v(i == iIntValue);
            c8765d2.m53535q(i == iIntValue);
            if (i == iIntValue) {
                c8765d = c8765d2;
            }
            i++;
        }
        if (c8765d != null) {
            RecyclerView recyclerView = g6e0Var.vpPrices;
            recyclerView.getClass();
            recyclerView.smoothScrollToPosition(iIntValue);
            y5e0 y5e0Var = g6e0Var.adapter;
            if (y5e0Var != null) {
                y5e0Var.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m124580j() {
        RecyclerView recyclerView = this.vpPrices;
        recyclerView.getClass();
        PurchaseType purchaseType = this.type;
        purchaseType.getClass();
        List<C8765d> list = this.purchaseSectionList;
        list.getClass();
        this.adapter = new y5e0(recyclerView, purchaseType, list, this.sectionClicked, this.sectionPayClicked, this.upgradeSections);
        RecyclerView recyclerView2 = this.vpPrices;
        recyclerView2.getClass();
        recyclerView2.setAdapter(this.adapter);
        jar jarVar = new jar();
        jarVar.mo3857b(this.vpPrices);
        CircleIndicator2 circleIndicator2 = this.vpIndicator;
        circleIndicator2.getClass();
        RecyclerView recyclerView3 = this.vpPrices;
        recyclerView3.getClass();
        circleIndicator2.m56214n(recyclerView3, jarVar);
        y5e0 y5e0Var = this.adapter;
        y5e0Var.getClass();
        CircleIndicator2 circleIndicator3 = this.vpIndicator;
        circleIndicator3.getClass();
        y5e0Var.registerAdapterDataObserver(circleIndicator3.getAdapterDataObserver());
        if (sab0.m182904v(this.type)) {
            CircleIndicator2 circleIndicator4 = this.vpIndicator;
            circleIndicator4.getClass();
            circleIndicator4.mo56208k(Color.parseColor("#F9E7FF"), Color.parseColor("#26F9E7FF"));
        } else if (sab0.m182899q(this.type)) {
            CircleIndicator2 circleIndicator5 = this.vpIndicator;
            circleIndicator5.getClass();
            circleIndicator5.mo56208k(Color.parseColor("#FFDEA2"), Color.parseColor("#26FFDEA2"));
        } else if (sab0.m182905w(this.type)) {
            CircleIndicator2 circleIndicator6 = this.vpIndicator;
            circleIndicator6.getClass();
            circleIndicator6.mo56208k(Color.parseColor("#FFD767"), Color.parseColor("#0A000000"));
        }
        if (!vwb.m200296J(this.upgradeSections)) {
            RecyclerView recyclerView4 = this.vpPrices;
            if (recyclerView4 != null) {
                recyclerView4.scrollToPosition(0);
            }
            e30<C8765d> e30Var = this.sectionClicked;
            if (e30Var != null) {
                List<C8765d> list2 = this.upgradeSections;
                e30Var.call(list2 != null ? list2.get(0) : null);
                return;
            }
            return;
        }
        List<C8765d> list3 = this.purchaseSectionList;
        list3.getClass();
        for (C8765d c8765d : list3) {
            c8765d.getClass();
            C8765d c8765d2 = c8765d;
            if (c8765d2.m53530l()) {
                e30<C8765d> e30Var2 = this.sectionClicked;
                if (e30Var2 != null) {
                    e30Var2.call(c8765d2);
                }
                RecyclerView recyclerView5 = this.vpPrices;
                if (recyclerView5 != null) {
                    List<C8765d> list4 = this.purchaseSectionList;
                    list4.getClass();
                    recyclerView5.scrollToPosition(list4.indexOf(c8765d2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m124581q(g6e0 g6e0Var, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        g6e0Var.m124587p(z, str);
    }

    @Override // p149l.c3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo105092a(@Nullable ViewGroup root, boolean small) {
        View viewInflate = o7r.m163037a(this.act).inflate(m6c0.f131541V, root, false);
        this.vpPrices = (RecyclerView) viewInflate.findViewById(z4c0.f201551n1);
        this.vpIndicator = (CircleIndicator2) viewInflate.findViewById(z4c0.f201554o1);
        this.upgradeTip = (VText) viewInflate.findViewById(z4c0.f201542k1);
        RecyclerView recyclerView = this.vpPrices;
        recyclerView.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(this.act, 0, false));
        RecyclerView recyclerView2 = this.vpPrices;
        recyclerView2.getClass();
        recyclerView2.addItemDecoration(new oel(t100.f167259h));
        return viewInflate;
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: f */
    public void mo105096f(@NotNull List<C8765d> purchaseSections, @Nullable e30<C8765d> sectionClicked, @Nullable e30<Integer> dialogStateAction, @Nullable e30<C8765d> sectionPayAction) {
        purchaseSections.getClass();
        m124582k(purchaseSections, sectionClicked, dialogStateAction, sectionPayAction, null);
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: h */
    public void mo105097h(@NotNull List<C8765d> purchaseSections, @Nullable e30<C8765d> sectionClicked, @Nullable e30<Integer> dialogStateAction) {
        purchaseSections.getClass();
        mo105096f(purchaseSections, sectionClicked, dialogStateAction, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m124582k(@NotNull List<C8765d> purchaseSections, @Nullable e30<C8765d> sectionClicked, @Nullable e30<Integer> dialogStateAction, @Nullable e30<C8765d> sectionPayAction, @Nullable List<C8765d> upgradeSections) {
        purchaseSections.getClass();
        this.sectionClicked = sectionClicked;
        this.sectionPayClicked = sectionPayAction;
        this.purchaseSectionList = purchaseSections;
        this.upgradeSections = upgradeSections;
        m124580j();
        m124584m(purchaseSections);
        m124585n();
        m124583l();
    }

    /* JADX INFO: renamed from: l */
    public final void m124583l() {
        this.selectedSubscribe = this.act.duringCreated(f101248m).subscribe(mkd0.m154955G(new e30() { // from class: l.e6e0
            @Override // p149l.e30
            public final void call(Object obj) {
                g6e0.m124578g(this.f89572a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m124584m(final List<C8765d> purchaseSections) {
        if (!h6a.m129470c() && CoreModule.m29935P().m94651a().mo33442Xi() && PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.type) {
            this.subscribe = this.act.duringCreated(ogj.m164200c().f143865b.observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.f6e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    g6e0.m124579i(purchaseSections, this, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m124585n() {
        C8765d.a aVarM53520b;
        C8765d c8765d;
        C8765d c8765d2;
        if (vwb.m200296J(this.upgradeSections)) {
            return;
        }
        List<C8765d> list = this.upgradeSections;
        list.getClass();
        String string = "";
        String strM53581g = "";
        for (C8765d c8765d3 : list) {
            c8765d3.getClass();
            C8765d c8765d4 = c8765d3;
            C8765d.a aVarM53522d = c8765d4.m53522d();
            if (aVarM53522d == null) {
                aVarM53522d = c8765d4.m53520b();
            }
            if (aVarM53522d != null && aVarM53522d.m53605w() == 1) {
                strM53581g = aVarM53522d.m53581g();
                strM53581g.getClass();
            }
        }
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f17545c.f19569G2.f80117R;
        if (membershipUpgradeInfo == null) {
            return;
        }
        Iterator<MembershipUpgradeDurationInfo> it = membershipUpgradeInfo.duration.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = it.next().count;
            if (i2 > i) {
                i = i2;
            }
        }
        List<C8765d> list2 = this.upgradeSections;
        if (list2 == null || (c8765d2 = list2.get(0)) == null || (aVarM53520b = c8765d2.m53522d()) == null) {
            List<C8765d> list3 = this.upgradeSections;
            aVarM53520b = (list3 == null || (c8765d = list3.get(0)) == null) ? null : c8765d.m53520b();
        }
        ProductCategory productCategoryM53579f = aVarM53520b != null ? aVarM53520b.m53579f() : null;
        int color = Color.parseColor("#99D0B585");
        if (TEnum.equals(productCategoryM53579f, ProductCategory.tttVipUpgradeToPremium)) {
            string = this.act.getString(R$string.f27649x3, strM53581g, Integer.valueOf(i), "VIP");
            string.getClass();
        } else if (TEnum.equals(productCategoryM53579f, ProductCategory.tttSeeUpgradeToPremium)) {
            string = this.act.getString(R$string.f27649x3, strM53581g, Integer.valueOf(i), this.act.getString(R$string.f27609t7));
            string.getClass();
        } else if (TEnum.equals(productCategoryM53579f, ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(productCategoryM53579f, ProductCategory.Promo_premiumUpgradeToUltra)) {
            color = Color.parseColor("#80F9E7FF");
            string = this.act.getString(R$string.f27671z3, strM53581g, Integer.valueOf(i));
            string.getClass();
        }
        VText vText = this.upgradeTip;
        if (vText != null) {
            vText.setTextColor(color);
        }
        VText vText2 = this.upgradeTip;
        if (vText2 != null) {
            vText2.setText(string);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m124586o() {
        if (vwb.m200296J(this.purchaseSectionList) || this.vpPrices == null) {
            return;
        }
        List<C8765d> list = this.purchaseSectionList;
        list.getClass();
        for (C8765d c8765d : list) {
            c8765d.getClass();
            C8765d c8765d2 = c8765d;
            if (c8765d2.m53530l()) {
                e30<C8765d> e30Var = this.sectionClicked;
                if (e30Var != null) {
                    e30Var.call(c8765d2);
                }
                RecyclerView recyclerView = this.vpPrices;
                if (recyclerView != null) {
                    List<C8765d> list2 = this.purchaseSectionList;
                    list2.getClass();
                    recyclerView.scrollToPosition(list2.indexOf(c8765d2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m124587p(boolean visible, @NotNull String priceStr) {
        priceStr.getClass();
        y5e0 y5e0Var = this.adapter;
        if (y5e0Var != null) {
            y5e0Var.m212982G(visible);
        }
        y5e0 y5e0Var2 = this.adapter;
        if (y5e0Var2 != null) {
            y5e0Var2.m212981F(priceStr);
        }
        y5e0 y5e0Var3 = this.adapter;
        if (y5e0Var3 != null) {
            y5e0Var3.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m124588r(boolean show) {
        xdl0.m208344M(this.upgradeTip, show);
    }

    @Override // p149l.c3m
    public void release() {
        c4g0 c4g0Var = this.subscribe;
        if (c4g0Var != null) {
            c4g0Var.getClass();
            if (!c4g0Var.isUnsubscribed()) {
                c4g0 c4g0Var2 = this.subscribe;
                c4g0Var2.getClass();
                c4g0Var2.unsubscribe();
            }
        }
        mkd0.m154992z(this.selectedSubscribe);
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: c */
    public void mo105094c(@Nullable b90 helper) {
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: e */
    public void mo105095e(@Nullable PayMethod method) {
    }
}
