package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveAnchorsPlug;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ'\u0010\u0015\u001a\u00020\n2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010,\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\"\u00102\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m87232d2 = {"Ll/etg0;", "Ll/svs;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", BaseSei.INFO, "Ll/ssg0;", "util", "<init>", "(Ll/mcr;Ll/mss;Ll/ssg0;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "", "b3", "()Z", "c3", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "resultData", "d3", "(Ljava/util/ArrayList;)V", "f", "Ll/ssg0;", "getUtil", "()Ll/ssg0;", "Ll/zpd0;", "g", "Ll/zpd0;", "getSuggest_save_follow_time", "()Ll/zpd0;", "suggest_save_follow_time", "Ll/tpd0;", "h", "Ll/tpd0;", "getSuggest_save_follow_show_day_count", "()Ll/tpd0;", "suggest_save_follow_show_day_count", RXScreenCaptureService.KEY_INDEX, "getSuggest_save_follow_show_suggest_time", "suggest_save_follow_show_suggest_time", "j", "getSuggest_save_follow_show_suggest_count", "suggest_save_follow_show_suggest_count", "k", "Z", "getNeedAdd", "setNeedAdd", "(Z)V", "needAdd", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "api", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class etg0 extends svs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final ssg0 util;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final zpd0 suggest_save_follow_time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final tpd0 suggest_save_follow_show_day_count;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final zpd0 suggest_save_follow_show_suggest_time;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final tpd0 suggest_save_follow_show_suggest_count;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean needAdd;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final LiveAnchorsPlug api;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etg0(@NotNull mcr mcrVar, @NotNull mss mssVar, @NotNull ssg0 ssg0Var) {
        super(mcrVar, mssVar);
        mcrVar.getClass();
        mssVar.getClass();
        ssg0Var.getClass();
        this.util = ssg0Var;
        this.suggest_save_follow_time = new zpd0("SuggestFollow_follow_time_" + l9s.m149093o0(), 0L);
        this.suggest_save_follow_show_day_count = new tpd0("SuggestFollow_follow_show_day_count_" + l9s.m149093o0(), 0);
        this.suggest_save_follow_show_suggest_time = new zpd0("SuggestFollow_follow_suggest_time_" + l9s.m149093o0(), 0L);
        this.suggest_save_follow_show_suggest_count = new tpd0("SuggestFollow_follow_suggest_count_" + l9s.m149093o0(), 0);
        LiveAnchorsPlug liveAnchorsPlug = new LiveAnchorsPlug(this);
        liveAnchorsPlug.setSearch(RelationshipStatus.suggested);
        liveAnchorsPlug.setSource("square-follow-page");
        liveAnchorsPlug.setLimit(9);
        this.api = liveAnchorsPlug;
    }

    /* JADX INFO: renamed from: Q2 */
    public static Boolean m118086Q2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R2 */
    public static void m118087R2(etg0 etg0Var, s2u.C19834a c19834a) {
        etg0Var.m118098c3();
    }

    /* JADX INFO: renamed from: S2 */
    public static Boolean m118088S2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T2 */
    public static Boolean m118089T2(s2u.C19834a c19834a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c19834a.f162016a));
    }

    /* JADX INFO: renamed from: U2 */
    public static void m118090U2(etg0 etg0Var, s2u.C19834a c19834a) {
        etg0Var.m118098c3();
    }

    /* JADX INFO: renamed from: V2 */
    public static Boolean m118091V2(s2u.C19834a c19834a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c19834a.f162016a));
    }

    /* JADX INFO: renamed from: W2 */
    public static Unit m118092W2(etg0 etg0Var, ModelData modelData) {
        modelData.getClass();
        if (modelData.isSuccess() && !vwb.m200296J(etg0Var.api.getResultData())) {
            etg0Var.m118099d3(etg0Var.api.getResultData());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X2 */
    public static Boolean m118093X2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y2 */
    public static Boolean m118094Y2(etg0 etg0Var, s2u.C19834a c19834a) {
        return Boolean.valueOf(etg0Var.m118097b3());
    }

    /* JADX INFO: renamed from: Z2 */
    public static Boolean m118095Z2(etg0 etg0Var, s2u.C19834a c19834a) {
        return Boolean.valueOf(etg0Var.m118097b3());
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m118096a3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (this.util.getRole() == 14 || this.util.getRole() == 20) {
            C22306c<T> c22306cDuringCreated = duringCreated(s2u.m182078j());
            final Function1 function1 = new Function1() { // from class: l.tsg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return etg0.m118091V2((s2u.C19834a) obj);
                }
            };
            C22306c c22306cTake = c22306cDuringCreated.filter(new w9j() { // from class: l.wsg0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return etg0.m118086Q2(function1, obj);
                }
            }).take(1);
            final Function1 function2 = new Function1() { // from class: l.xsg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return etg0.m118095Z2(this.f194274a, (s2u.C19834a) obj);
                }
            };
            c22306cTake.filter(new w9j() { // from class: l.ysg0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return etg0.m118088S2(function2, obj);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.zsg0
                @Override // p149l.e30
                public final void call(Object obj) {
                    etg0.m118087R2(this.f204594a, (s2u.C19834a) obj);
                }
            }));
        }
        if (this.util.getRole() == 24) {
            C22306c<T> c22306cDuringCreated2 = duringCreated(s2u.m182078j());
            final Function1 function3 = new Function1() { // from class: l.atg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return etg0.m118089T2((s2u.C19834a) obj);
                }
            };
            C22306c c22306cTake2 = c22306cDuringCreated2.filter(new w9j() { // from class: l.btg0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return etg0.m118096a3(function3, obj);
                }
            }).take(1);
            final Function1 function4 = new Function1() { // from class: l.ctg0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return etg0.m118094Y2(this.f82481a, (s2u.C19834a) obj);
                }
            };
            c22306cTake2.filter(new w9j() { // from class: l.dtg0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return etg0.m118093X2(function4, obj);
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.usg0
                @Override // p149l.e30
                public final void call(Object obj) {
                    etg0.m118090U2(this.f177971a, (s2u.C19834a) obj);
                }
            }));
        }
        this.api.observe(new Function1() { // from class: l.vsg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return etg0.m118092W2(this.f182847a, (ModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m118097b3() {
        Long l2 = this.suggest_save_follow_show_suggest_time.get();
        int iIntValue = this.suggest_save_follow_show_suggest_count.get().intValue() + 1;
        this.suggest_save_follow_show_suggest_count.put(Integer.valueOf(iIntValue));
        long jM155943n = mqi0.m155943n();
        if (l2 != null && l2.longValue() == jM155943n) {
            return iIntValue == 2;
        }
        this.suggest_save_follow_show_suggest_count.put(1);
        this.suggest_save_follow_show_suggest_time.put(Long.valueOf(mqi0.m155943n()));
        return false;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m118098c3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM195974w5 = s9s.f163228b.m195974w5();
        if (bSuggestedTabAnimationItemM195974w5 == null || !bSuggestedTabAnimationItemM195974w5.f44517on) {
            return;
        }
        Long l2 = this.suggest_save_follow_time.get();
        Integer num = this.suggest_save_follow_show_day_count.get();
        long jM155943n = mqi0.m155943n();
        if (l2 != null && l2.longValue() == jM155943n) {
            if (num.intValue() < bSuggestedTabAnimationItemM195974w5.dayLimit) {
                this.needAdd = true;
                this.api.getData();
                return;
            }
            return;
        }
        long jM155943n2 = mqi0.m155943n();
        l2.getClass();
        if (jM155943n2 - l2.longValue() <= bSuggestedTabAnimationItemM195974w5.nextDay * 86400000 || bSuggestedTabAnimationItemM195974w5.dayLimit <= 0) {
            return;
        }
        this.needAdd = false;
        this.api.getData();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m118099d3(ArrayList<BLiveAnchors> resultData) {
        if (this.util.m185745a("SuggestFollow")) {
            Act act = getAct();
            if (act != null) {
                act.startActivity(LiveSuggestPopAct.INSTANCE.m68996a(act, resultData));
            }
            boolean z = this.needAdd;
            tpd0 tpd0Var = this.suggest_save_follow_show_day_count;
            if (z) {
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            } else {
                tpd0Var.put(1);
            }
            this.suggest_save_follow_time.put(Long.valueOf(mqi0.m155943n()));
        }
    }
}
