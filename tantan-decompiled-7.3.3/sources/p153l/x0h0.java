package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveAnchorsPlug;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareVoiceCompanionDialogView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0013\u001a\u00020\n2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)¨\u0006/"}, m88121d2 = {"Ll/x0h0;", "Ll/txs;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", BaseSei.INFO, "Ll/a1h0;", "util", "<init>", "(Ll/ner;Ll/nus;Ll/a1h0;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "b3", "a3", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "data", "c3", "(Ljava/util/ArrayList;)V", "f", "Ll/a1h0;", "getUtil", "()Ll/a1h0;", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "g", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "getApi", "()Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "api", "Ll/byd0;", "h", "Ll/byd0;", "suggestSaveCardTime", "Ll/vxd0;", RXScreenCaptureService.KEY_INDEX, "Ll/vxd0;", "suggestSaveCardTimeDayCount", "", "j", "Z", "fragIsShow", "k", "needAddAdd", BLiveStormDanmakuGiftResourceType.f45292l, "hasRetry", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class x0h0 extends txs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final a1h0 util;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final LiveAnchorsPlug api;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final byd0 suggestSaveCardTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final vxd0 suggestSaveCardTimeDayCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean fragIsShow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean needAddAdd;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean hasRetry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0h0(@NotNull ner nerVar, @NotNull nus nusVar, @NotNull a1h0 a1h0Var) {
        super(nerVar, nusVar);
        nerVar.getClass();
        nusVar.getClass();
        a1h0Var.getClass();
        this.util = a1h0Var;
        LiveAnchorsPlug liveAnchorsPlug = new LiveAnchorsPlug(nerVar);
        liveAnchorsPlug.setSearch(RelationshipStatus.suggested);
        liveAnchorsPlug.setSource("square-card");
        liveAnchorsPlug.setLimit(6);
        this.api = liveAnchorsPlug;
        this.suggestSaveCardTime = new byd0("SuggestCard_guide_time_" + mbs.m157870o0(), 0L);
        this.suggestSaveCardTimeDayCount = new vxd0("SuggestCard_guide_show_day_count_" + mbs.m157870o0(), 0);
    }

    /* JADX INFO: renamed from: Q2 */
    public static void m208838Q2(x0h0 x0h0Var, Boolean bool) {
        if (Intrinsics.m88377d(bool, Boolean.FALSE)) {
            x0h0Var.m208852a3();
        }
    }

    /* JADX INFO: renamed from: S2 */
    public static Boolean m208840S2(t4u.C20236a c20236a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c20236a.f172139a));
    }

    /* JADX INFO: renamed from: U2 */
    public static void m208842U2(x0h0 x0h0Var, t4u.C20236a c20236a) {
        x0h0Var.m208853b3();
    }

    /* JADX INFO: renamed from: X2 */
    public static Boolean m208845X2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y2 */
    public static void m208846Y2(x0h0 x0h0Var, Boolean bool) {
        x0h0Var.fragIsShow = !bool.booleanValue();
    }

    /* JADX INFO: renamed from: Z2 */
    public static Unit m208847Z2(x0h0 x0h0Var, ModelData modelData) {
        modelData.getClass();
        if (x0h0Var.fragIsShow) {
            if (!jyb.m147479J(x0h0Var.api.getResultData()) && modelData.isSuccess() && !ppi0.m173207l().m173215j() && !ppi0.m173207l().m173228x()) {
                x0h0Var.m208854c3(x0h0Var.api.getResultData());
            }
            if (jyb.m147479J(x0h0Var.api.getResultData()) && !x0h0Var.hasRetry) {
                x0h0Var.hasRetry = true;
                x0h0Var.api.getData();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d3 */
    public static final void m208848d3(jbt jbtVar, View view) {
        jbtVar.dismiss();
    }

    /* JADX INFO: renamed from: e3 */
    public static final void m208849e3(jbt jbtVar, DialogInterface dialogInterface) {
        i4g0.m138520r("e_live_no_action_guide_popup_close", "p_live_no_action_guide_popup");
        jbtVar.dismiss();
    }

    /* JADX INFO: renamed from: f3 */
    public static final Unit m208850f3(HashMap map, jl80 jl80Var, Act act, BLiveAnchors bLiveAnchors) {
        bfu.m104073e("p_live_no_action_guide_popup", map);
        jl80Var.dismiss();
        act.startActivity(tbs.f172993f.m143704f(act.act(), AudienceStartData.getBuilder().m68777E(bLiveAnchors.onGoingLiveId).m68787O("square-card").m68794u()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g3 */
    public static final Unit m208851g3(jl80 jl80Var) {
        i4g0.m138520r("e_live_no_action_guide_popup_close", "p_live_no_action_guide_popup");
        jl80Var.dismiss();
        return Unit.INSTANCE;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(t4u.m189320i()).subscribe(dhw.m115825d(new y20() { // from class: l.n0h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x0h0.m208846Y2(this.f139629a, (Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(t4u.m189321j());
        final Function1 function1 = new Function1() { // from class: l.o0h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0h0.m208840S2((t4u.C20236a) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.p0h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x0h0.m208845X2(function1, obj);
            }
        }).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.q0h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x0h0.m208842U2(this.f155053a, (t4u.C20236a) obj);
            }
        }));
        this.api.observe(new Function1() { // from class: l.r0h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x0h0.m208847Z2(this.f160633a, (ModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public final void m208852a3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM203753v5 = tbs.f172989b.m203753v5();
        if (bSuggestedTabAnimationItemM203753v5 == null) {
            return;
        }
        Long l2 = this.suggestSaveCardTime.get();
        Integer num = this.suggestSaveCardTimeDayCount.get();
        long jM174453n = pzi0.m174453n();
        if (l2 != null && l2.longValue() == jM174453n) {
            if (num.intValue() < bSuggestedTabAnimationItemM203753v5.dayLimit) {
                this.needAddAdd = true;
                this.api.getData();
                return;
            }
            return;
        }
        long jM174453n2 = pzi0.m174453n();
        l2.getClass();
        if (jM174453n2 - l2.longValue() <= bSuggestedTabAnimationItemM203753v5.nextDay * 86400000 || bSuggestedTabAnimationItemM203753v5.dayLimit <= 0) {
            return;
        }
        this.needAddAdd = false;
        this.api.getData();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m208853b3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM203753v5 = tbs.f172989b.m203753v5();
        if (bSuggestedTabAnimationItemM203753v5 == null || !bSuggestedTabAnimationItemM203753v5.f45365on) {
            return;
        }
        duringCreated((C22421c) m160243N2(new r40())).subscribe(dhw.m115825d(new y20() { // from class: l.w0h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x0h0.m208838Q2(this.f186596a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m208854c3(ArrayList<BLiveAnchors> data) {
        final Act act;
        if (!this.util.m95506a("SuggestCard") || (act = getAct()) == null || act.isFinishing() || data.size() == 0) {
            return;
        }
        int size = data.size();
        Act act2 = act.act;
        if (size >= 6) {
            View viewInflate = LayoutInflater.from(act2).inflate(xec0.f193818S0, (ViewGroup) null);
            final jbt jbtVar = new jbt(act.act, viewInflate);
            Act act3 = act.act;
            act3.getClass();
            viewInflate.getClass();
            new z0h0(act3, jbtVar, viewInflate, data);
            viewInflate.findViewById(ldc0.f131454F).setOnClickListener(new View.OnClickListener() { // from class: l.s0h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x0h0.m208848d3(jbtVar, view);
                }
            });
            jbtVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.t0h0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    x0h0.m208849e3(jbtVar, dialogInterface);
                }
            });
            jbtVar.show();
        } else {
            final jl80 jl80VarM146049r0 = new jl80.C17971a(act2).m146022Q(xec0.f193839Z0).m146021P(false).m146049r0();
            jl80VarM146049r0.setCanceledOnTouchOutside(false);
            BLiveAnchors bLiveAnchors = data.get(0);
            bLiveAnchors.getClass();
            final BLiveAnchors bLiveAnchors2 = bLiveAnchors;
            View viewM145966L = jl80VarM146049r0.m145966L();
            viewM145966L.getClass();
            LiveSquareVoiceCompanionDialogView liveSquareVoiceCompanionDialogView = (LiveSquareVoiceCompanionDialogView) viewM145966L;
            liveSquareVoiceCompanionDialogView.m72099e(bLiveAnchors2);
            final HashMap map = new HashMap();
            map.put("liveId", bLiveAnchors2.onGoingLiveId);
            map.put("anchorId", bLiveAnchors2.userId);
            map.put(FirebaseAnalytics.Param.INDEX, "NA");
            map.put("module", "no_action_guide_popup");
            map.put("liveRecommendCategory", "NA");
            liveSquareVoiceCompanionDialogView.setSureAction(new Function0() { // from class: l.u0h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x0h0.m208850f3(map, jl80VarM146049r0, act, bLiveAnchors2);
                }
            });
            liveSquareVoiceCompanionDialogView.setDismissAction(new Function0() { // from class: l.v0h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x0h0.m208851g3(jl80VarM146049r0);
                }
            });
            bfu.m104074f("p_live_no_action_guide_popup", map);
        }
        boolean z = this.needAddAdd;
        vxd0 vxd0Var = this.suggestSaveCardTimeDayCount;
        if (z) {
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        } else {
            vxd0Var.put(1);
        }
        this.suggestSaveCardTime.put(Long.valueOf(pzi0.m174453n()));
    }
}
