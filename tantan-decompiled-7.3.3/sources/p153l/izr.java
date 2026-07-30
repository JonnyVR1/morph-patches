package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveBlackListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001Y\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010\u000eJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00100\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\fR\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010\fR\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010,\u001a\u0004\bE\u0010.\"\u0004\bF\u0010\fR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010R\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010BR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010\\¨\u0006^"}, m88121d2 = {"Ll/izr;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/wzr;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/wzr;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "J", "(Landroid/view/View;)V", "r", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "blackListInfo", "", "Ll/yzr;", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)Ljava/util/List;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "U", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", p7f.GPS_DIRECTION_TRUE, "w", "itemModel", p7f.LATITUDE_SOUTH, "(Ll/yzr;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "R", "()Landroid/view/View;", "set_shadow", "_shadow", "get_bg", "set_bg", "_bg", "Lv/VText;", "n", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VImage;", "o", "Lv/VImage;", BloodType.f39576O, "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "p", "get_divider", "set_divider", "_divider", "Lv/VRecyclerView;", "q", "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "P", "set_emptyView", "_emptyView", "Ll/dzr;", BLiveStormDanmakuGiftResourceType.f45294s, "Lkotlin/Lazy;", "L", "()Ll/dzr;", "blackListAdapter", "l/izr$a", Constants.KEY_T, "M", "()Ll/izr$a;", "blackListListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class izr extends LiveMenuDialogHolder<wzr> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VImage _back;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _emptyView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackListAdapter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy blackListListener;

    /* JADX INFO: renamed from: l.izr$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/izr$a", "Ll/czr;", "Ll/yzr;", "model", "", "a", "(Ll/yzr;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17834a implements czr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wzr f117755a;

        public C17834a(wzr wzrVar) {
            this.f117755a = wzrVar;
        }

        @Override // p153l.czr
        /* JADX INFO: renamed from: a */
        public void mo113348a(yzr model) {
            model.getClass();
            this.f117755a.m208762g4(model);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izr(@NotNull Act act, @NotNull final wzr wzrVar) {
        super(yec0.f199237s, act, wzrVar);
        act.getClass();
        wzrVar.getClass();
        this.act = act;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.blackListAdapter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.gzr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return izr.m142831F();
            }
        });
        this.blackListListener = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.hzr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return izr.m142833H(wzrVar);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static dzr m142831F() {
        return new dzr();
    }

    /* JADX INFO: renamed from: G */
    public static void m142832G(izr izrVar, View view) {
        izrVar.mo73021p();
    }

    /* JADX INFO: renamed from: H */
    public static C17834a m142833H(wzr wzrVar) {
        return new C17834a(wzrVar);
    }

    /* JADX INFO: renamed from: I */
    public static void m142834I(izr izrVar, View view) {
        izrVar.mo73021p();
    }

    /* JADX INFO: renamed from: r */
    private final void m142835r() {
        bnl0.m105509E0(m142844R(), new View.OnClickListener() { // from class: l.ezr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                izr.m142832G(this.f96623a, view);
            }
        });
        bnl0.m105509E0(m142841O(), new View.OnClickListener() { // from class: l.fzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                izr.m142834I(this.f101544a, view);
            }
        });
        m142843Q().setLayoutManager(new LinearLayoutManager(getContext()));
        m142843Q().setAdapter(m142838L());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m142844R().getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: J */
    public final void m142836J(View view) {
        jzr.m147715a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m142837K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM147716b = jzr.m147716b(this, inflater, parent);
        viewM147716b.getClass();
        return viewM147716b;
    }

    /* JADX INFO: renamed from: L */
    public final dzr m142838L() {
        return (dzr) this.blackListAdapter.getValue();
    }

    /* JADX INFO: renamed from: M */
    public final C17834a m142839M() {
        return (C17834a) this.blackListListener.getValue();
    }

    /* JADX INFO: renamed from: N */
    public final List<yzr> m142840N(BLiveExtraData blackListInfo) {
        List<BLiveBlackListItem> list = blackListInfo.blackList;
        list.getClass();
        List<BLiveBlackListItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BLiveBlackListItem bLiveBlackListItem : list2) {
            bLiveBlackListItem.getClass();
            arrayList.add(new yzr(bLiveBlackListItem, m142839M()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m142841O() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VImage m142842P() {
        VImage vImage = this._emptyView;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_emptyView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m142843Q() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m142844R() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final void m142845S(@NotNull yzr itemModel) {
        itemModel.getClass();
        m142838L().m118765g0(itemModel);
        if (m142838L().m118764f0()) {
            m142846T();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m142846T() {
        bnl0.m105524M(m142843Q(), false);
        bnl0.m105524M(m142842P(), true);
    }

    /* JADX INFO: renamed from: U */
    public final void m142847U(@NotNull BLiveExtraData blackListInfo) {
        blackListInfo.getClass();
        List<yzr> listM142840N = m142840N(blackListInfo);
        List<yzr> list = listM142840N;
        if (list == null || list.isEmpty()) {
            bnl0.m105524M(m142843Q(), false);
            bnl0.m105524M(m142842P(), true);
        } else {
            bnl0.m105524M(m142843Q(), true);
            bnl0.m105524M(m142842P(), false);
            m142838L().m118766h0(listM142840N);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m142837K(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m142836J(view);
        m142835r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        m142838L().m118763e0();
    }
}
