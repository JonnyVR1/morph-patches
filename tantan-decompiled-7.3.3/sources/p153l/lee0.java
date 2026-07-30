package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p051p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.view.circleindicator.CircleIndicator2;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22507a;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 p2\u00020\u0001:\u0001\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001c\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010\u001f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J[\u0010\"\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\nJ\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\nJ\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010W\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010^R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010h\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010a\u001a\u0004\bf\u0010c\"\u0004\bg\u0010eR*\u0010m\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u000fR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010i\u001a\u0004\bn\u0010k\"\u0004\bo\u0010\u000f¨\u0006q"}, m88121d2 = {"Ll/lee0;", "Ll/t5m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "j", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "m", "(Ljava/util/List;)V", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/ViewGroup;", "root", "", "small", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;Z)Landroid/view/View;", "Ll/y20;", "sectionClicked", "", "dialogStateAction", "h", "(Ljava/util/List;Ll/y20;Ll/y20;)V", "sectionPayAction", "f", "(Ljava/util/List;Ll/y20;Ll/y20;Ll/y20;)V", "upgradeSections", "k", "(Ljava/util/List;Ll/y20;Ll/y20;Ll/y20;Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/PayMethod;", FirebaseAnalytics.Param.METHOD, "e", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Ll/x80;", "helper", "c", "(Ll/x80;)V", "release", "o", "n", "show", "r", "(Z)V", "visible", "", "priceStr", "p", "(ZLjava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "setAct", "(Lcom/p1/mobile/android/app/Act;)V", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "getVpPrices", "()Landroidx/recyclerview/widget/RecyclerView;", "setVpPrices", "(Landroidx/recyclerview/widget/RecyclerView;)V", "vpPrices", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "getVpIndicator", "()Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "setVpIndicator", "(Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;)V", "vpIndicator", "Lv/VText;", "Lv/VText;", "getUpgradeTip", "()Lv/VText;", "setUpgradeTip", "(Lv/VText;)V", "upgradeTip", "Ll/kcg0;", "Ll/kcg0;", "subscribe", "g", "selectedSubscribe", "Ll/dee0;", "Ll/dee0;", "adapter", RXScreenCaptureService.KEY_INDEX, "Ll/y20;", "getSectionClicked", "()Ll/y20;", "setSectionClicked", "(Ll/y20;)V", "getSectionPayClicked", "setSectionPayClicked", "sectionPayClicked", "Ljava/util/List;", "getPurchaseSectionList", "()Ljava/util/List;", "setPurchaseSectionList", "purchaseSectionList", "getUpgradeSections", "setUpgradeSections", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class lee0 implements t5m {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static C22507a<Integer> f131730m;

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
    public kcg0 subscribe;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public kcg0 selectedSubscribe;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public dee0 adapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public y20<C8928d> sectionClicked;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public y20<C8928d> sectionPayClicked;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public List<C8928d> purchaseSectionList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public List<C8928d> upgradeSections;

    static {
        C22507a<Integer> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        f131730m = c22507aM222758b;
    }

    public lee0(@NotNull Act act, @Nullable PurchaseType purchaseType) {
        act.getClass();
        this.act = act;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: g */
    public static void m153882g(lee0 lee0Var, Integer num) {
        List<C8928d> list = lee0Var.purchaseSectionList;
        list.getClass();
        int size = list.size();
        num.getClass();
        if (size > num.intValue()) {
            List<C8928d> list2 = lee0Var.purchaseSectionList;
            list2.getClass();
            C8928d c8928d = list2.get(num.intValue());
            C8928d.a aVarM54703b = c8928d.m54714m() ? c8928d.m54703b() : c8928d.m54705d();
            if (NullChecker.m82486a(aVarM54703b)) {
                aVarM54703b.getClass();
                aVarM54703b.m54761e0("");
            }
            if (c8928d.m54713l()) {
                RecyclerView recyclerView = lee0Var.vpPrices;
                recyclerView.getClass();
                recyclerView.smoothScrollToPosition(num.intValue());
                RecyclerView recyclerView2 = lee0Var.vpPrices;
                recyclerView2.getClass();
                recyclerView2.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m153883i(List list, lee0 lee0Var, Integer num) {
        int iIntValue = num != null ? num.intValue() : -1;
        int size = list.size();
        C8928d c8928d = null;
        int i = 0;
        while (i < size) {
            C8928d c8928d2 = (C8928d) list.get(i);
            c8928d2.m54723v(i == iIntValue);
            c8928d2.m54718q(i == iIntValue);
            if (i == iIntValue) {
                c8928d = c8928d2;
            }
            i++;
        }
        if (c8928d != null) {
            RecyclerView recyclerView = lee0Var.vpPrices;
            recyclerView.getClass();
            recyclerView.smoothScrollToPosition(iIntValue);
            dee0 dee0Var = lee0Var.adapter;
            if (dee0Var != null) {
                dee0Var.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m153884j() {
        RecyclerView recyclerView = this.vpPrices;
        recyclerView.getClass();
        PurchaseType purchaseType = this.type;
        purchaseType.getClass();
        List<C8928d> list = this.purchaseSectionList;
        list.getClass();
        this.adapter = new dee0(recyclerView, purchaseType, list, this.sectionClicked, this.sectionPayClicked, this.upgradeSections);
        RecyclerView recyclerView2 = this.vpPrices;
        recyclerView2.getClass();
        recyclerView2.setAdapter(this.adapter);
        lcr lcrVar = new lcr();
        lcrVar.mo3858b(this.vpPrices);
        CircleIndicator2 circleIndicator2 = this.vpIndicator;
        circleIndicator2.getClass();
        RecyclerView recyclerView3 = this.vpPrices;
        recyclerView3.getClass();
        circleIndicator2.m57397n(recyclerView3, lcrVar);
        dee0 dee0Var = this.adapter;
        dee0Var.getClass();
        CircleIndicator2 circleIndicator3 = this.vpIndicator;
        circleIndicator3.getClass();
        dee0Var.registerAdapterDataObserver(circleIndicator3.getAdapterDataObserver());
        if (wib0.m206578v(this.type)) {
            CircleIndicator2 circleIndicator4 = this.vpIndicator;
            circleIndicator4.getClass();
            circleIndicator4.mo57391k(Color.parseColor("#F9E7FF"), Color.parseColor("#26F9E7FF"));
        } else if (wib0.m206573q(this.type)) {
            CircleIndicator2 circleIndicator5 = this.vpIndicator;
            circleIndicator5.getClass();
            circleIndicator5.mo57391k(Color.parseColor("#FFDEA2"), Color.parseColor("#26FFDEA2"));
        } else if (wib0.m206579w(this.type)) {
            CircleIndicator2 circleIndicator6 = this.vpIndicator;
            circleIndicator6.getClass();
            circleIndicator6.mo57391k(Color.parseColor("#FFD767"), Color.parseColor("#0A000000"));
        }
        if (!jyb.m147479J(this.upgradeSections)) {
            RecyclerView recyclerView4 = this.vpPrices;
            if (recyclerView4 != null) {
                recyclerView4.scrollToPosition(0);
            }
            y20<C8928d> y20Var = this.sectionClicked;
            if (y20Var != null) {
                List<C8928d> list2 = this.upgradeSections;
                y20Var.call(list2 != null ? list2.get(0) : null);
                return;
            }
            return;
        }
        List<C8928d> list3 = this.purchaseSectionList;
        list3.getClass();
        for (C8928d c8928d : list3) {
            c8928d.getClass();
            C8928d c8928d2 = c8928d;
            if (c8928d2.m54713l()) {
                y20<C8928d> y20Var2 = this.sectionClicked;
                if (y20Var2 != null) {
                    y20Var2.call(c8928d2);
                }
                RecyclerView recyclerView5 = this.vpPrices;
                if (recyclerView5 != null) {
                    List<C8928d> list4 = this.purchaseSectionList;
                    list4.getClass();
                    recyclerView5.scrollToPosition(list4.indexOf(c8928d2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m153885q(lee0 lee0Var, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        lee0Var.m153891p(z, str);
    }

    @Override // p153l.t5m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo126108a(@Nullable ViewGroup root, boolean small) {
        View viewInflate = p9r.m171370a(this.act).inflate(rec0.f162501V, root, false);
        this.vpPrices = (RecyclerView) viewInflate.findViewById(fdc0.f98427n1);
        this.vpIndicator = (CircleIndicator2) viewInflate.findViewById(fdc0.f98430o1);
        this.upgradeTip = (VText) viewInflate.findViewById(fdc0.f98418k1);
        RecyclerView recyclerView = this.vpPrices;
        recyclerView.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(this.act, 0, false));
        RecyclerView recyclerView2 = this.vpPrices;
        recyclerView2.getClass();
        recyclerView2.addItemDecoration(new ehl(qa00.f156321h));
        return viewInflate;
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: f */
    public void mo141377f(@NotNull List<C8928d> purchaseSections, @Nullable y20<C8928d> sectionClicked, @Nullable y20<Integer> dialogStateAction, @Nullable y20<C8928d> sectionPayAction) {
        purchaseSections.getClass();
        m153886k(purchaseSections, sectionClicked, dialogStateAction, sectionPayAction, null);
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: h */
    public void mo126117h(@NotNull List<C8928d> purchaseSections, @Nullable y20<C8928d> sectionClicked, @Nullable y20<Integer> dialogStateAction) {
        purchaseSections.getClass();
        mo141377f(purchaseSections, sectionClicked, dialogStateAction, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m153886k(@NotNull List<C8928d> purchaseSections, @Nullable y20<C8928d> sectionClicked, @Nullable y20<Integer> dialogStateAction, @Nullable y20<C8928d> sectionPayAction, @Nullable List<C8928d> upgradeSections) {
        purchaseSections.getClass();
        this.sectionClicked = sectionClicked;
        this.sectionPayClicked = sectionPayAction;
        this.purchaseSectionList = purchaseSections;
        this.upgradeSections = upgradeSections;
        m153884j();
        m153888m(purchaseSections);
        m153889n();
        m153887l();
    }

    /* JADX INFO: renamed from: l */
    public final void m153887l() {
        this.selectedSubscribe = this.act.duringCreated(f131730m).subscribe(psd0.m173596G(new y20() { // from class: l.jee0
            @Override // p153l.y20
            public final void call(Object obj) {
                lee0.m153882g(this.f120482a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m153888m(final List<C8928d> purchaseSections) {
        if (!t7a.m189547c() && CoreModule.m30933P().m143405a().mo34445Xi() && PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.type) {
            this.subscribe = this.act.duringCreated(ijj.m140191c().f115232b.observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.kee0
                @Override // p153l.y20
                public final void call(Object obj) {
                    lee0.m153883i(purchaseSections, this, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m153889n() {
        C8928d.a aVarM54703b;
        C8928d c8928d;
        C8928d c8928d2;
        if (jyb.m147479J(this.upgradeSections)) {
            return;
        }
        List<C8928d> list = this.upgradeSections;
        list.getClass();
        String string = "";
        String strM54764g = "";
        for (C8928d c8928d3 : list) {
            c8928d3.getClass();
            C8928d c8928d4 = c8928d3;
            C8928d.a aVarM54705d = c8928d4.m54705d();
            if (aVarM54705d == null) {
                aVarM54705d = c8928d4.m54703b();
            }
            if (aVarM54705d != null && aVarM54705d.m54788w() == 1) {
                strM54764g = aVarM54705d.m54764g();
                strM54764g.getClass();
            }
        }
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f18264c.f20311G2.f131283R;
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
        List<C8928d> list2 = this.upgradeSections;
        if (list2 == null || (c8928d2 = list2.get(0)) == null || (aVarM54703b = c8928d2.m54705d()) == null) {
            List<C8928d> list3 = this.upgradeSections;
            aVarM54703b = (list3 == null || (c8928d = list3.get(0)) == null) ? null : c8928d.m54703b();
        }
        ProductCategory productCategoryM54762f = aVarM54703b != null ? aVarM54703b.m54762f() : null;
        int color = Color.parseColor("#99D0B585");
        if (TEnum.equals(productCategoryM54762f, ProductCategory.tttVipUpgradeToPremium)) {
            string = this.act.getString(R$string.f28497x3, strM54764g, Integer.valueOf(i), "VIP");
            string.getClass();
        } else if (TEnum.equals(productCategoryM54762f, ProductCategory.tttSeeUpgradeToPremium)) {
            string = this.act.getString(R$string.f28497x3, strM54764g, Integer.valueOf(i), this.act.getString(R$string.f28457t7));
            string.getClass();
        } else if (TEnum.equals(productCategoryM54762f, ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(productCategoryM54762f, ProductCategory.Promo_premiumUpgradeToUltra)) {
            color = Color.parseColor("#80F9E7FF");
            string = this.act.getString(R$string.f28519z3, strM54764g, Integer.valueOf(i));
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
    public final void m153890o() {
        if (jyb.m147479J(this.purchaseSectionList) || this.vpPrices == null) {
            return;
        }
        List<C8928d> list = this.purchaseSectionList;
        list.getClass();
        for (C8928d c8928d : list) {
            c8928d.getClass();
            C8928d c8928d2 = c8928d;
            if (c8928d2.m54713l()) {
                y20<C8928d> y20Var = this.sectionClicked;
                if (y20Var != null) {
                    y20Var.call(c8928d2);
                }
                RecyclerView recyclerView = this.vpPrices;
                if (recyclerView != null) {
                    List<C8928d> list2 = this.purchaseSectionList;
                    list2.getClass();
                    recyclerView.scrollToPosition(list2.indexOf(c8928d2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m153891p(boolean visible, @NotNull String priceStr) {
        priceStr.getClass();
        dee0 dee0Var = this.adapter;
        if (dee0Var != null) {
            dee0Var.m115410G(visible);
        }
        dee0 dee0Var2 = this.adapter;
        if (dee0Var2 != null) {
            dee0Var2.m115409F(priceStr);
        }
        dee0 dee0Var3 = this.adapter;
        if (dee0Var3 != null) {
            dee0Var3.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m153892r(boolean show) {
        bnl0.m105524M(this.upgradeTip, show);
    }

    @Override // p153l.t5m
    public void release() {
        kcg0 kcg0Var = this.subscribe;
        if (kcg0Var != null) {
            kcg0Var.getClass();
            if (!kcg0Var.isUnsubscribed()) {
                kcg0 kcg0Var2 = this.subscribe;
                kcg0Var2.getClass();
                kcg0Var2.unsubscribe();
            }
        }
        psd0.m173633z(this.selectedSubscribe);
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: c */
    public void mo126112c(@Nullable x80 helper) {
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: e */
    public void mo126115e(@Nullable PayMethod method) {
    }
}
