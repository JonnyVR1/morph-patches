package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveBlackListItem;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
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
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006*\u0001Y\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010\u000eJ\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00100\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\fR\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010\fR\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010,\u001a\u0004\bE\u0010.\"\u0004\bF\u0010\fR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010R\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\bP\u0010@\"\u0004\bQ\u0010BR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010U\u001a\u0004\b[\u0010\\¨\u0006^"}, m87232d2 = {"Ll/hxr;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/vxr;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/vxr;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "J", "(Landroid/view/View;)V", "r", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "blackListInfo", "", "Ll/xxr;", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)Ljava/util/List;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "K", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "U", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", j6f.GPS_DIRECTION_TRUE, "w", "itemModel", j6f.LATITUDE_SOUTH, "(Ll/xxr;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroid/view/View;", "R", "()Landroid/view/View;", "set_shadow", "_shadow", "get_bg", "set_bg", "_bg", "Lv/VText;", "n", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VImage;", "o", "Lv/VImage;", BloodType.f38728O, "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "p", "get_divider", "set_divider", "_divider", "Lv/VRecyclerView;", "q", "Lv/VRecyclerView;", "Q", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "P", "set_emptyView", "_emptyView", "Ll/cxr;", BLiveStormDanmakuGiftResourceType.f44446s, "Lkotlin/Lazy;", "L", "()Ll/cxr;", "blackListAdapter", "l/hxr$a", Constants.KEY_T, "M", "()Ll/hxr$a;", "blackListListener", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class hxr extends LiveMenuDialogHolder<vxr> {

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

    /* JADX INFO: renamed from: l.hxr$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/hxr$a", "Ll/bxr;", "Ll/xxr;", "model", "", "a", "(Ll/xxr;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17429a implements bxr {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vxr f109920a;

        public C17429a(vxr vxrVar) {
            this.f109920a = vxrVar;
        }

        @Override // p149l.bxr
        /* JADX INFO: renamed from: a */
        public void mo104369a(xxr model) {
            model.getClass();
            this.f109920a.m200592g4(model);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxr(@NotNull Act act, @NotNull final vxr vxrVar) {
        super(t6c0.f168505s, act, vxrVar);
        act.getClass();
        vxrVar.getClass();
        this.act = act;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.blackListAdapter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.fxr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hxr.m133369F();
            }
        });
        this.blackListListener = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.gxr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hxr.m133371H(vxrVar);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static cxr m133369F() {
        return new cxr();
    }

    /* JADX INFO: renamed from: G */
    public static void m133370G(hxr hxrVar, View view) {
        hxrVar.mo71838p();
    }

    /* JADX INFO: renamed from: H */
    public static C17429a m133371H(vxr vxrVar) {
        return new C17429a(vxrVar);
    }

    /* JADX INFO: renamed from: I */
    public static void m133372I(hxr hxrVar, View view) {
        hxrVar.mo71838p();
    }

    /* JADX INFO: renamed from: r */
    private final void m133373r() {
        xdl0.m208329E0(m133382R(), new View.OnClickListener() { // from class: l.dxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hxr.m133370G(this.f88317a, view);
            }
        });
        xdl0.m208329E0(m133379O(), new View.OnClickListener() { // from class: l.exr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hxr.m133372I(this.f93685a, view);
            }
        });
        m133381Q().setLayoutManager(new LinearLayoutManager(getContext()));
        m133381Q().setAdapter(m133376L());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m133382R().getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: J */
    public final void m133374J(View view) {
        ixr.m138890a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m133375K(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM138891b = ixr.m138891b(this, inflater, parent);
        viewM138891b.getClass();
        return viewM138891b;
    }

    /* JADX INFO: renamed from: L */
    public final cxr m133376L() {
        return (cxr) this.blackListAdapter.getValue();
    }

    /* JADX INFO: renamed from: M */
    public final C17429a m133377M() {
        return (C17429a) this.blackListListener.getValue();
    }

    /* JADX INFO: renamed from: N */
    public final List<xxr> m133378N(BLiveExtraData blackListInfo) {
        List<BLiveBlackListItem> list = blackListInfo.blackList;
        list.getClass();
        List<BLiveBlackListItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BLiveBlackListItem bLiveBlackListItem : list2) {
            bLiveBlackListItem.getClass();
            arrayList.add(new xxr(bLiveBlackListItem, m133377M()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VImage m133379O() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final VImage m133380P() {
        VImage vImage = this._emptyView;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_emptyView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final VRecyclerView m133381Q() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_recyclerView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m133382R() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_shadow");
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final void m133383S(@NotNull xxr itemModel) {
        itemModel.getClass();
        m133376L().m109108g0(itemModel);
        if (m133376L().m109107f0()) {
            m133384T();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m133384T() {
        xdl0.m208344M(m133381Q(), false);
        xdl0.m208344M(m133380P(), true);
    }

    /* JADX INFO: renamed from: U */
    public final void m133385U(@NotNull BLiveExtraData blackListInfo) {
        blackListInfo.getClass();
        List<xxr> listM133378N = m133378N(blackListInfo);
        List<xxr> list = listM133378N;
        if (list == null || list.isEmpty()) {
            xdl0.m208344M(m133381Q(), false);
            xdl0.m208344M(m133380P(), true);
        } else {
            xdl0.m208344M(m133381Q(), true);
            xdl0.m208344M(m133380P(), false);
            m133376L().m109109h0(listM133378N);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m133375K(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m133374J(view);
        m133373r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m133376L().m109106e0();
    }
}
