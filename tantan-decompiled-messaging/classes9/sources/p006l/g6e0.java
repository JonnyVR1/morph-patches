package p006l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.view.circleindicator.CircleIndicator2;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo;
import com.p1.mobile.putong.core.data.MembershipUpgradeInfo;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l.c4g0;
import l.e30;
import l.jo0;
import l.m6c0;
import l.mkd0;
import l.o7r;
import l.ogj;
import l.sab0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.subjects.a;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 p2\u00020\u0001:\u0001\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u001c\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010\u001f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J[\u0010\"\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\nJ\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\nJ\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\nJ\u0015\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010W\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010^R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010h\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010a\u001a\u0004\bf\u0010c\"\u0004\bg\u0010eR*\u0010m\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u000fR*\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010i\u001a\u0004\bn\u0010k\"\u0004\bo\u0010\u000f¨\u0006q"}, d2 = {"Ll/g6e0;", "Ll/c3m;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "j", "()V", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSections", "m", "(Ljava/util/List;)V", "l", "Landroid/view/ViewGroup;", "root", "", "small", "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;Z)Landroid/view/View;", "Ll/e30;", "sectionClicked", "", "dialogStateAction", "h", "(Ljava/util/List;Ll/e30;Ll/e30;)V", "sectionPayAction", "f", "(Ljava/util/List;Ll/e30;Ll/e30;Ll/e30;)V", "upgradeSections", "k", "(Ljava/util/List;Ll/e30;Ll/e30;Ll/e30;Ljava/util/List;)V", "Lcom/p1/mobile/putong/data/PayMethod;", "method", "e", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "Ll/b90;", "helper", "c", "(Ll/b90;)V", "release", "o", "n", "show", "r", "(Z)V", "visible", "", "priceStr", "p", "(ZLjava/lang/String;)V", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "setAct", "(Lcom/p1/mobile/android/app/Act;)V", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "getVpPrices", "()Landroidx/recyclerview/widget/RecyclerView;", "setVpPrices", "(Landroidx/recyclerview/widget/RecyclerView;)V", "vpPrices", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "d", "Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "getVpIndicator", "()Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;", "setVpIndicator", "(Lcom/p1/mobile/putong/core/ui/view/circleindicator/CircleIndicator2;)V", "vpIndicator", "Lv/VText;", "Lv/VText;", "getUpgradeTip", "()Lv/VText;", "setUpgradeTip", "(Lv/VText;)V", "upgradeTip", "Ll/c4g0;", "Ll/c4g0;", "subscribe", "g", "selectedSubscribe", "Ll/y5e0;", "Ll/y5e0;", "adapter", "i", "Ll/e30;", "getSectionClicked", "()Ll/e30;", "setSectionClicked", "(Ll/e30;)V", "getSectionPayClicked", "setSectionPayClicked", "sectionPayClicked", "Ljava/util/List;", "getPurchaseSectionList", "()Ljava/util/List;", "setPurchaseSectionList", "purchaseSectionList", "getUpgradeSections", "setUpgradeSections", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g6e0 implements c3m {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static a<Integer> f13068m;

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
    public e30<d> sectionClicked;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<d> sectionPayClicked;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public List<d> purchaseSectionList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public List<d> upgradeSections;

    static {
        a<Integer> aVarB = a.b();
        aVarB.getClass();
        f13068m = aVarB;
    }

    public g6e0(@NotNull Act act, @Nullable PurchaseType purchaseType) {
        act.getClass();
        this.act = act;
        this.type = purchaseType;
    }

    /* JADX INFO: renamed from: g */
    public static void m15604g(g6e0 g6e0Var, Integer num) {
        List<d> list = g6e0Var.purchaseSectionList;
        list.getClass();
        int size = list.size();
        num.getClass();
        if (size > num.intValue()) {
            List<d> list2 = g6e0Var.purchaseSectionList;
            list2.getClass();
            d dVar = list2.get(num.intValue());
            d.a aVarB = dVar.m() ? dVar.b() : dVar.d();
            if (NullChecker.a(aVarB)) {
                aVarB.getClass();
                aVarB.e0("");
            }
            if (dVar.l()) {
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
    public static void m15605i(List list, g6e0 g6e0Var, Integer num) {
        int iIntValue = num != null ? num.intValue() : -1;
        int size = list.size();
        d dVar = null;
        int i = 0;
        while (i < size) {
            d dVar2 = (d) list.get(i);
            dVar2.v(i == iIntValue);
            dVar2.q(i == iIntValue);
            if (i == iIntValue) {
                dVar = dVar2;
            }
            i++;
        }
        if (dVar != null) {
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
    private final void m15606j() {
        RecyclerView recyclerView = this.vpPrices;
        recyclerView.getClass();
        PurchaseType purchaseType = this.type;
        purchaseType.getClass();
        List<d> list = this.purchaseSectionList;
        list.getClass();
        this.adapter = new y5e0(recyclerView, purchaseType, list, this.sectionClicked, this.sectionPayClicked, this.upgradeSections);
        RecyclerView recyclerView2 = this.vpPrices;
        recyclerView2.getClass();
        recyclerView2.setAdapter(this.adapter);
        w jarVar = new jar();
        jarVar.m17410b(this.vpPrices);
        CircleIndicator2 circleIndicator2 = this.vpIndicator;
        circleIndicator2.getClass();
        RecyclerView recyclerView3 = this.vpPrices;
        recyclerView3.getClass();
        circleIndicator2.m9647n(recyclerView3, jarVar);
        y5e0 y5e0Var = this.adapter;
        y5e0Var.getClass();
        CircleIndicator2 circleIndicator3 = this.vpIndicator;
        circleIndicator3.getClass();
        y5e0Var.registerAdapterDataObserver(circleIndicator3.getAdapterDataObserver());
        if (sab0.v(this.type)) {
            CircleIndicator2 circleIndicator4 = this.vpIndicator;
            circleIndicator4.getClass();
            circleIndicator4.mo9641k(Color.parseColor("#F9E7FF"), Color.parseColor("#26F9E7FF"));
        } else if (sab0.q(this.type)) {
            CircleIndicator2 circleIndicator5 = this.vpIndicator;
            circleIndicator5.getClass();
            circleIndicator5.mo9641k(Color.parseColor("#FFDEA2"), Color.parseColor("#26FFDEA2"));
        } else if (sab0.w(this.type)) {
            CircleIndicator2 circleIndicator6 = this.vpIndicator;
            circleIndicator6.getClass();
            circleIndicator6.mo9641k(Color.parseColor("#FFD767"), Color.parseColor("#0A000000"));
        }
        if (!vwb.J(this.upgradeSections)) {
            RecyclerView recyclerView4 = this.vpPrices;
            if (recyclerView4 != null) {
                recyclerView4.scrollToPosition(0);
            }
            e30<d> e30Var = this.sectionClicked;
            if (e30Var != null) {
                List<d> list2 = this.upgradeSections;
                e30Var.call(list2 != null ? list2.get(0) : null);
                return;
            }
            return;
        }
        List<d> list3 = this.purchaseSectionList;
        list3.getClass();
        for (d dVar : list3) {
            dVar.getClass();
            d dVar2 = dVar;
            if (dVar2.l()) {
                e30<d> e30Var2 = this.sectionClicked;
                if (e30Var2 != null) {
                    e30Var2.call(dVar2);
                }
                RecyclerView recyclerView5 = this.vpPrices;
                if (recyclerView5 != null) {
                    List<d> list4 = this.purchaseSectionList;
                    list4.getClass();
                    recyclerView5.scrollToPosition(list4.indexOf(dVar2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m15607q(g6e0 g6e0Var, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        g6e0Var.m15613p(z, str);
    }

    @Override // p006l.c3m
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo13098a(@Nullable ViewGroup root, boolean small) {
        View viewInflate = o7r.a(this.act).inflate(m6c0.V, root, false);
        this.vpPrices = viewInflate.findViewById(z4c0.n1);
        this.vpIndicator = (CircleIndicator2) viewInflate.findViewById(z4c0.o1);
        this.upgradeTip = viewInflate.findViewById(z4c0.k1);
        RecyclerView recyclerView = this.vpPrices;
        recyclerView.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManager(this.act, 0, false));
        RecyclerView recyclerView2 = this.vpPrices;
        recyclerView2.getClass();
        recyclerView2.addItemDecoration(new oel(t100.h));
        return viewInflate;
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: f */
    public void mo13102f(@NotNull List<d> purchaseSections, @Nullable e30<d> sectionClicked, @Nullable e30<Integer> dialogStateAction, @Nullable e30<d> sectionPayAction) {
        purchaseSections.getClass();
        m15608k(purchaseSections, sectionClicked, dialogStateAction, sectionPayAction, null);
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: h */
    public void mo13103h(@NotNull List<d> purchaseSections, @Nullable e30<d> sectionClicked, @Nullable e30<Integer> dialogStateAction) {
        purchaseSections.getClass();
        mo13102f(purchaseSections, sectionClicked, dialogStateAction, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m15608k(@NotNull List<d> purchaseSections, @Nullable e30<d> sectionClicked, @Nullable e30<Integer> dialogStateAction, @Nullable e30<d> sectionPayAction, @Nullable List<d> upgradeSections) {
        purchaseSections.getClass();
        this.sectionClicked = sectionClicked;
        this.sectionPayClicked = sectionPayAction;
        this.purchaseSectionList = purchaseSections;
        this.upgradeSections = upgradeSections;
        m15606j();
        m15610m(purchaseSections);
        m15611n();
        m15609l();
    }

    /* JADX INFO: renamed from: l */
    public final void m15609l() {
        this.selectedSubscribe = this.act.duringCreated(f13068m).subscribe(mkd0.G(new e30() { // from class: l.e6e0
            public final void call(Object obj) {
                g6e0.m15604g(this.f10827a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m15610m(final List<d> purchaseSections) {
        if (!h6a.m16049c() && CoreModule.m1854P().m11706a().m5379Xi() && PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE == this.type) {
            this.subscribe = this.act.duringCreated(ogj.c().b.observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.f6e0
                public final void call(Object obj) {
                    g6e0.m15605i(purchaseSections, this, (Integer) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15611n() {
        d.a aVarB;
        d dVar;
        d dVar2;
        if (vwb.J(this.upgradeSections)) {
            return;
        }
        List<d> list = this.upgradeSections;
        list.getClass();
        String string = "";
        String strG = "";
        for (d dVar3 : list) {
            dVar3.getClass();
            d dVar4 = dVar3;
            d.a aVarD = dVar4.d();
            if (aVarD == null) {
                aVarD = dVar4.b();
            }
            if (aVarD != null && aVarD.w() == 1) {
                strG = aVarD.g();
                strG.getClass();
            }
        }
        MembershipUpgradeInfo membershipUpgradeInfo = CoreModule.f1534c.f3558G2.f9573R;
        if (membershipUpgradeInfo == null) {
            return;
        }
        Iterator it = membershipUpgradeInfo.duration.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((MembershipUpgradeDurationInfo) it.next()).count;
            if (i2 > i) {
                i = i2;
            }
        }
        List<d> list2 = this.upgradeSections;
        if (list2 == null || (dVar2 = list2.get(0)) == null || (aVarB = dVar2.d()) == null) {
            List<d> list3 = this.upgradeSections;
            aVarB = (list3 == null || (dVar = list3.get(0)) == null) ? null : dVar.b();
        }
        ProductCategory productCategoryF = aVarB != null ? aVarB.f() : null;
        int color = Color.parseColor("#99D0B585");
        if (TEnum.equals(productCategoryF, "tttVipUpgradeToPremium")) {
            string = this.act.getString(R.string.x3, strG, Integer.valueOf(i), "VIP");
            string.getClass();
        } else if (TEnum.equals(productCategoryF, "tttSeeUpgradeToPremium")) {
            string = this.act.getString(R.string.x3, strG, Integer.valueOf(i), this.act.getString(R.string.t7));
            string.getClass();
        } else if (TEnum.equals(productCategoryF, "tttPremiumUpgradeToUltra") || TEnum.equals(productCategoryF, "Promo_premiumUpgradeToUltra")) {
            color = Color.parseColor("#80F9E7FF");
            string = this.act.getString(R.string.z3, strG, Integer.valueOf(i));
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
    public final void m15612o() {
        if (vwb.J(this.purchaseSectionList) || this.vpPrices == null) {
            return;
        }
        List<d> list = this.purchaseSectionList;
        list.getClass();
        for (d dVar : list) {
            dVar.getClass();
            d dVar2 = dVar;
            if (dVar2.l()) {
                e30<d> e30Var = this.sectionClicked;
                if (e30Var != null) {
                    e30Var.call(dVar2);
                }
                RecyclerView recyclerView = this.vpPrices;
                if (recyclerView != null) {
                    List<d> list2 = this.purchaseSectionList;
                    list2.getClass();
                    recyclerView.scrollToPosition(list2.indexOf(dVar2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m15613p(boolean visible, @NotNull String priceStr) {
        priceStr.getClass();
        y5e0 y5e0Var = this.adapter;
        if (y5e0Var != null) {
            y5e0Var.m28085G(visible);
        }
        y5e0 y5e0Var2 = this.adapter;
        if (y5e0Var2 != null) {
            y5e0Var2.m28084F(priceStr);
        }
        y5e0 y5e0Var3 = this.adapter;
        if (y5e0Var3 != null) {
            y5e0Var3.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15614r(boolean show) {
        xdl0.M(this.upgradeTip, show);
    }

    @Override // p006l.c3m
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
        mkd0.z(this.selectedSubscribe);
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: c */
    public void mo13100c(@Nullable b90 helper) {
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: e */
    public void mo13101e(@Nullable PayMethod method) {
    }
}
