package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveSuggestPopAct;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveAnchorsPlug;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ'\u0010\u0015\u001a\u00020\n2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010)\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010,\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\"\u00102\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m88121d2 = {"Ll/m1h0;", "Ll/txs;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", BaseSei.INFO, "Ll/a1h0;", "util", "<init>", "(Ll/ner;Ll/nus;Ll/a1h0;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "", "b3", "()Z", "c3", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "Lkotlin/collections/ArrayList;", "resultData", "d3", "(Ljava/util/ArrayList;)V", "f", "Ll/a1h0;", "getUtil", "()Ll/a1h0;", "Ll/byd0;", "g", "Ll/byd0;", "getSuggest_save_follow_time", "()Ll/byd0;", "suggest_save_follow_time", "Ll/vxd0;", "h", "Ll/vxd0;", "getSuggest_save_follow_show_day_count", "()Ll/vxd0;", "suggest_save_follow_show_day_count", RXScreenCaptureService.KEY_INDEX, "getSuggest_save_follow_show_suggest_time", "suggest_save_follow_show_suggest_time", "j", "getSuggest_save_follow_show_suggest_count", "suggest_save_follow_show_suggest_count", "k", "Z", "getNeedAdd", "setNeedAdd", "(Z)V", "needAdd", "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/external/internal/live/square/api/LiveAnchorsPlug;", "api", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class m1h0 extends txs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final a1h0 util;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final byd0 suggest_save_follow_time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final vxd0 suggest_save_follow_show_day_count;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final byd0 suggest_save_follow_show_suggest_time;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final vxd0 suggest_save_follow_show_suggest_count;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean needAdd;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final LiveAnchorsPlug api;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1h0(@NotNull ner nerVar, @NotNull nus nusVar, @NotNull a1h0 a1h0Var) {
        super(nerVar, nusVar);
        nerVar.getClass();
        nusVar.getClass();
        a1h0Var.getClass();
        this.util = a1h0Var;
        this.suggest_save_follow_time = new byd0("SuggestFollow_follow_time_" + mbs.m157870o0(), 0L);
        this.suggest_save_follow_show_day_count = new vxd0("SuggestFollow_follow_show_day_count_" + mbs.m157870o0(), 0);
        this.suggest_save_follow_show_suggest_time = new byd0("SuggestFollow_follow_suggest_time_" + mbs.m157870o0(), 0L);
        this.suggest_save_follow_show_suggest_count = new vxd0("SuggestFollow_follow_suggest_count_" + mbs.m157870o0(), 0);
        LiveAnchorsPlug liveAnchorsPlug = new LiveAnchorsPlug(this);
        liveAnchorsPlug.setSearch(RelationshipStatus.suggested);
        liveAnchorsPlug.setSource("square-follow-page");
        liveAnchorsPlug.setLimit(9);
        this.api = liveAnchorsPlug;
    }

    /* JADX INFO: renamed from: Q2 */
    public static Boolean m156676Q2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R2 */
    public static void m156677R2(m1h0 m1h0Var, t4u.C20236a c20236a) {
        m1h0Var.m156688c3();
    }

    /* JADX INFO: renamed from: S2 */
    public static Boolean m156678S2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T2 */
    public static Boolean m156679T2(t4u.C20236a c20236a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c20236a.f172139a));
    }

    /* JADX INFO: renamed from: U2 */
    public static void m156680U2(m1h0 m1h0Var, t4u.C20236a c20236a) {
        m1h0Var.m156688c3();
    }

    /* JADX INFO: renamed from: V2 */
    public static Boolean m156681V2(t4u.C20236a c20236a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c20236a.f172139a));
    }

    /* JADX INFO: renamed from: W2 */
    public static Unit m156682W2(m1h0 m1h0Var, ModelData modelData) {
        modelData.getClass();
        if (modelData.isSuccess() && !jyb.m147479J(m1h0Var.api.getResultData())) {
            m1h0Var.m156689d3(m1h0Var.api.getResultData());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X2 */
    public static Boolean m156683X2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y2 */
    public static Boolean m156684Y2(m1h0 m1h0Var, t4u.C20236a c20236a) {
        return Boolean.valueOf(m1h0Var.m156687b3());
    }

    /* JADX INFO: renamed from: Z2 */
    public static Boolean m156685Z2(m1h0 m1h0Var, t4u.C20236a c20236a) {
        return Boolean.valueOf(m1h0Var.m156687b3());
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m156686a3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (this.util.getRole() == 14 || this.util.getRole() == 20) {
            C22421c<T> c22421cDuringCreated = duringCreated(t4u.m189321j());
            final Function1 function1 = new Function1() { // from class: l.b1h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1h0.m156681V2((t4u.C20236a) obj);
                }
            };
            C22421c c22421cTake = c22421cDuringCreated.filter(new qcj() { // from class: l.e1h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return m1h0.m156676Q2(function1, obj);
                }
            }).take(1);
            final Function1 function2 = new Function1() { // from class: l.f1h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1h0.m156685Z2(this.f96798a, (t4u.C20236a) obj);
                }
            };
            c22421cTake.filter(new qcj() { // from class: l.g1h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return m1h0.m156678S2(function2, obj);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.h1h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    m1h0.m156677R2(this.f107458a, (t4u.C20236a) obj);
                }
            }));
        }
        if (this.util.getRole() == 24) {
            C22421c<T> c22421cDuringCreated2 = duringCreated(t4u.m189321j());
            final Function1 function3 = new Function1() { // from class: l.i1h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1h0.m156679T2((t4u.C20236a) obj);
                }
            };
            C22421c c22421cTake2 = c22421cDuringCreated2.filter(new qcj() { // from class: l.j1h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return m1h0.m156686a3(function3, obj);
                }
            }).take(1);
            final Function1 function4 = new Function1() { // from class: l.k1h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m1h0.m156684Y2(this.f123499a, (t4u.C20236a) obj);
                }
            };
            c22421cTake2.filter(new qcj() { // from class: l.l1h0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return m1h0.m156683X2(function4, obj);
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.c1h0
                @Override // p153l.y20
                public final void call(Object obj) {
                    m1h0.m156680U2(this.f79398a, (t4u.C20236a) obj);
                }
            }));
        }
        this.api.observe(new Function1() { // from class: l.d1h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m1h0.m156682W2(this.f84684a, (ModelData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m156687b3() {
        Long l2 = this.suggest_save_follow_show_suggest_time.get();
        int iIntValue = this.suggest_save_follow_show_suggest_count.get().intValue() + 1;
        this.suggest_save_follow_show_suggest_count.put(Integer.valueOf(iIntValue));
        long jM174453n = pzi0.m174453n();
        if (l2 != null && l2.longValue() == jM174453n) {
            return iIntValue == 2;
        }
        this.suggest_save_follow_show_suggest_count.put(1);
        this.suggest_save_follow_show_suggest_time.put(Long.valueOf(pzi0.m174453n()));
        return false;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m156688c3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM203761w5 = tbs.f172989b.m203761w5();
        if (bSuggestedTabAnimationItemM203761w5 == null || !bSuggestedTabAnimationItemM203761w5.f45365on) {
            return;
        }
        Long l2 = this.suggest_save_follow_time.get();
        Integer num = this.suggest_save_follow_show_day_count.get();
        long jM174453n = pzi0.m174453n();
        if (l2 != null && l2.longValue() == jM174453n) {
            if (num.intValue() < bSuggestedTabAnimationItemM203761w5.dayLimit) {
                this.needAdd = true;
                this.api.getData();
                return;
            }
            return;
        }
        long jM174453n2 = pzi0.m174453n();
        l2.getClass();
        if (jM174453n2 - l2.longValue() <= bSuggestedTabAnimationItemM203761w5.nextDay * 86400000 || bSuggestedTabAnimationItemM203761w5.dayLimit <= 0) {
            return;
        }
        this.needAdd = false;
        this.api.getData();
    }

    /* JADX INFO: renamed from: d3 */
    public final void m156689d3(ArrayList<BLiveAnchors> resultData) {
        if (this.util.m95506a("SuggestFollow")) {
            Act act = getAct();
            if (act != null) {
                act.startActivity(LiveSuggestPopAct.INSTANCE.m70179a(act, resultData));
            }
            boolean z = this.needAdd;
            vxd0 vxd0Var = this.suggest_save_follow_show_day_count;
            if (z) {
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            } else {
                vxd0Var.put(1);
            }
            this.suggest_save_follow_time.put(Long.valueOf(pzi0.m174453n()));
        }
    }
}
