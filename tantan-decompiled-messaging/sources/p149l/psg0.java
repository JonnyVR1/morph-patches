package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveAnchorsPlug;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareVoiceCompanionDialogView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0013\u001a\u00020\n2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010.\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)¨\u0006/"}, m87232d2 = {"Ll/psg0;", "Ll/svs;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", BaseSei.INFO, "Ll/ssg0;", "util", "<init>", "(Ll/mcr;Ll/mss;Ll/ssg0;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "b3", "a3", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "data", "c3", "(Ljava/util/ArrayList;)V", "f", "Ll/ssg0;", "getUtil", "()Ll/ssg0;", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "g", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "getApi", "()Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "api", "Ll/zpd0;", "h", "Ll/zpd0;", "suggestSaveCardTime", "Ll/tpd0;", RXScreenCaptureService.KEY_INDEX, "Ll/tpd0;", "suggestSaveCardTimeDayCount", "", "j", "Z", "fragIsShow", "k", "needAddAdd", BLiveStormDanmakuGiftResourceType.f44444l, "hasRetry", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class psg0 extends svs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ssg0 util;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final LiveAnchorsPlug api;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final zpd0 suggestSaveCardTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final tpd0 suggestSaveCardTimeDayCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean fragIsShow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean needAddAdd;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean hasRetry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psg0(@NotNull mcr mcrVar, @NotNull mss mssVar, @NotNull ssg0 ssg0Var) {
        super(mcrVar, mssVar);
        mcrVar.getClass();
        mssVar.getClass();
        ssg0Var.getClass();
        this.util = ssg0Var;
        LiveAnchorsPlug liveAnchorsPlug = new LiveAnchorsPlug(mcrVar);
        liveAnchorsPlug.setSearch(RelationshipStatus.suggested);
        liveAnchorsPlug.setSource("square-card");
        liveAnchorsPlug.setLimit(6);
        this.api = liveAnchorsPlug;
        this.suggestSaveCardTime = new zpd0("SuggestCard_guide_time_" + l9s.m149093o0(), 0L);
        this.suggestSaveCardTimeDayCount = new tpd0("SuggestCard_guide_show_day_count_" + l9s.m149093o0(), 0);
    }

    /* JADX INFO: renamed from: Q2 */
    public static void m171139Q2(psg0 psg0Var, Boolean bool) {
        if (Intrinsics.m87488d(bool, Boolean.FALSE)) {
            psg0Var.m171153a3();
        }
    }

    /* JADX INFO: renamed from: S2 */
    public static Boolean m171141S2(s2u.C19834a c19834a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c19834a.f162016a));
    }

    /* JADX INFO: renamed from: U2 */
    public static void m171143U2(psg0 psg0Var, s2u.C19834a c19834a) {
        psg0Var.m171154b3();
    }

    /* JADX INFO: renamed from: X2 */
    public static Boolean m171146X2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y2 */
    public static void m171147Y2(psg0 psg0Var, Boolean bool) {
        psg0Var.fragIsShow = !bool.booleanValue();
    }

    /* JADX INFO: renamed from: Z2 */
    public static Unit m171148Z2(psg0 psg0Var, ModelData modelData) {
        modelData.getClass();
        if (psg0Var.fragIsShow) {
            if (!vwb.m200296J(psg0Var.api.getResultData()) && modelData.isSuccess() && !pgi0.m168730l().m168738j() && !pgi0.m168730l().m168751x()) {
                psg0Var.m171155c3(psg0Var.api.getResultData());
            }
            if (vwb.m200296J(psg0Var.api.getResultData()) && !psg0Var.hasRetry) {
                psg0Var.hasRetry = true;
                psg0Var.api.getData();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d3 */
    public static final void m171149d3(i9t i9tVar, View view) {
        i9tVar.dismiss();
    }

    /* JADX INFO: renamed from: e3 */
    public static final void m171150e3(i9t i9tVar, DialogInterface dialogInterface) {
        zvf0.m220396r("e_live_no_action_guide_popup_close", "p_live_no_action_guide_popup");
        i9tVar.dismiss();
    }

    /* JADX INFO: renamed from: f3 */
    public static final Unit m171151f3(HashMap map, dd80 dd80Var, Act act, BLiveAnchors bLiveAnchors) {
        adu.m96009e("p_live_no_action_guide_popup", map);
        dd80Var.dismiss();
        act.startActivity(s9s.f163232f.m134373f(act.act(), AudienceStartData.getBuilder().m67594E(bLiveAnchors.onGoingLiveId).m67604O("square-card").m67611u()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g3 */
    public static final Unit m171152g3(dd80 dd80Var) {
        zvf0.m220396r("e_live_no_action_guide_popup_close", "p_live_no_action_guide_popup");
        dd80Var.dismiss();
        return Unit.INSTANCE;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(s2u.m182077i()).subscribe(ffw.m121193d(new e30() { // from class: l.fsg0
            @Override // p149l.e30
            public final void call(Object obj) {
                psg0.m171147Y2(this.f99075a, (Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(s2u.m182078j());
        final Function1 function1 = new Function1() { // from class: l.gsg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psg0.m171141S2((s2u.C19834a) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.hsg0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return psg0.m171146X2(function1, obj);
            }
        }).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.isg0
            @Override // p149l.e30
            public final void call(Object obj) {
                psg0.m171143U2(this.f114764a, (s2u.C19834a) obj);
            }
        }));
        this.api.observe(new Function1() { // from class: l.jsg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psg0.m171148Z2(this.f119508a, (ModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public final void m171153a3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM195966v5 = s9s.f163228b.m195966v5();
        if (bSuggestedTabAnimationItemM195966v5 == null) {
            return;
        }
        Long l2 = this.suggestSaveCardTime.get();
        Integer num = this.suggestSaveCardTimeDayCount.get();
        long jM155943n = mqi0.m155943n();
        if (l2 != null && l2.longValue() == jM155943n) {
            if (num.intValue() < bSuggestedTabAnimationItemM195966v5.dayLimit) {
                this.needAddAdd = true;
                this.api.getData();
                return;
            }
            return;
        }
        long jM155943n2 = mqi0.m155943n();
        l2.getClass();
        if (jM155943n2 - l2.longValue() <= bSuggestedTabAnimationItemM195966v5.nextDay * 86400000 || bSuggestedTabAnimationItemM195966v5.dayLimit <= 0) {
            return;
        }
        this.needAddAdd = false;
        this.api.getData();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m171154b3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM195966v5 = s9s.f163228b.m195966v5();
        if (bSuggestedTabAnimationItemM195966v5 == null || !bSuggestedTabAnimationItemM195966v5.f44517on) {
            return;
        }
        duringCreated((C22306c) m151646N2(new x40())).subscribe(ffw.m121193d(new e30() { // from class: l.osg0
            @Override // p149l.e30
            public final void call(Object obj) {
                psg0.m171139Q2(this.f145394a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c3 */
    public final void m171155c3(ArrayList<BLiveAnchors> data) {
        final Act act;
        if (!this.util.m185745a("SuggestCard") || (act = getAct()) == null || act.isFinishing() || data.size() == 0) {
            return;
        }
        int size = data.size();
        Act act2 = act.act;
        if (size >= 6) {
            View viewInflate = LayoutInflater.from(act2).inflate(s6c0.f162704S0, (ViewGroup) null);
            final i9t i9tVar = new i9t(act.act, viewInflate);
            Act act3 = act.act;
            act3.getClass();
            viewInflate.getClass();
            new rsg0(act3, i9tVar, viewInflate, data);
            viewInflate.findViewById(f5c0.f94997F).setOnClickListener(new View.OnClickListener() { // from class: l.ksg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    psg0.m171149d3(i9tVar, view);
                }
            });
            i9tVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lsg0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    psg0.m171150e3(i9tVar, dialogInterface);
                }
            });
            i9tVar.show();
        } else {
            final dd80 dd80VarM110989r0 = new dd80.C16336a(act2).m110962Q(s6c0.f162725Z0).m110961P(false).m110989r0();
            dd80VarM110989r0.setCanceledOnTouchOutside(false);
            BLiveAnchors bLiveAnchors = data.get(0);
            bLiveAnchors.getClass();
            final BLiveAnchors bLiveAnchors2 = bLiveAnchors;
            View viewM110906L = dd80VarM110989r0.m110906L();
            viewM110906L.getClass();
            LiveSquareVoiceCompanionDialogView liveSquareVoiceCompanionDialogView = (LiveSquareVoiceCompanionDialogView) viewM110906L;
            liveSquareVoiceCompanionDialogView.m70916e(bLiveAnchors2);
            final HashMap map = new HashMap();
            map.put("liveId", bLiveAnchors2.onGoingLiveId);
            map.put("anchorId", bLiveAnchors2.userId);
            map.put(FirebaseAnalytics.Param.INDEX, "NA");
            map.put("module", "no_action_guide_popup");
            map.put("liveRecommendCategory", "NA");
            liveSquareVoiceCompanionDialogView.setSureAction(new Function0() { // from class: l.msg0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return psg0.m171151f3(map, dd80VarM110989r0, act, bLiveAnchors2);
                }
            });
            liveSquareVoiceCompanionDialogView.setDismissAction(new Function0() { // from class: l.nsg0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return psg0.m171152g3(dd80VarM110989r0);
                }
            });
            adu.m96010f("p_live_no_action_guide_popup", map);
        }
        boolean z = this.needAddAdd;
        tpd0 tpd0Var = this.suggestSaveCardTimeDayCount;
        if (z) {
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        } else {
            tpd0Var.put(1);
        }
        this.suggestSaveCardTime.put(Long.valueOf(mqi0.m155943n()));
    }
}
