package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/x1h0;", "Ll/txs;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", BaseSei.INFO, "<init>", "(Ll/ner;Ll/nus;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "a3", "", "time", "b3", "(J)V", "Ll/vxd0;", "f", "Ll/vxd0;", "getSuggest_save_guide_total_num", "()Ll/vxd0;", "suggest_save_guide_total_num", "g", "getSuggest_save_guide_show_day_count", "suggest_save_guide_show_day_count", "Ll/byd0;", "h", "Ll/byd0;", "getSuggest_save_guide_show_day_time", "()Ll/byd0;", "suggest_save_guide_show_day_time", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class x1h0 extends txs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final vxd0 suggest_save_guide_total_num;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final vxd0 suggest_save_guide_show_day_count;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final byd0 suggest_save_guide_show_day_time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1h0(@NotNull ner nerVar, @NotNull nus nusVar) {
        super(nerVar, nusVar);
        nerVar.getClass();
        nusVar.getClass();
        this.suggest_save_guide_total_num = new vxd0("SuggestGuide_guide_total_" + mbs.m157870o0(), 0);
        this.suggest_save_guide_show_day_count = new vxd0("SuggestGuide_guide_show_day_count_" + mbs.m157870o0(), 0);
        this.suggest_save_guide_show_day_time = new byd0("SuggestGuide_guide_show_day_time_" + mbs.m157870o0(), 0L);
    }

    /* JADX INFO: renamed from: Q2 */
    public static Boolean m209050Q2(Boolean bool) {
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    /* JADX INFO: renamed from: R2 */
    public static void m209051R2(Long l2) {
        t4u.m189323l("guide", false);
    }

    /* JADX INFO: renamed from: S2 */
    public static void m209052S2(t4u.C20236a c20236a) {
        t4u.m189323l("guide", false);
    }

    /* JADX INFO: renamed from: T2 */
    public static void m209053T2(x1h0 x1h0Var, t4u.C20236a c20236a) {
        x1h0Var.m209060a3();
    }

    /* JADX INFO: renamed from: U2 */
    public static Boolean m209054U2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V2 */
    public static Boolean m209055V2(t4u.C20236a c20236a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c20236a.f172139a));
    }

    /* JADX INFO: renamed from: W2 */
    public static void m209056W2(Boolean bool) {
        t4u.m189323l("guide", false);
    }

    /* JADX INFO: renamed from: X2 */
    public static Boolean m209057X2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y2 */
    public static Boolean m209058Y2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z2 */
    public static Boolean m209059Z2(t4u.C20236a c20236a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c20236a.f172139a));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<T> c22421cDuringCreated = duringCreated(t4u.m189321j());
        final Function1 function1 = new Function1() { // from class: l.n1h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1h0.m209055V2((t4u.C20236a) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.o1h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x1h0.m209058Y2(function1, obj);
            }
        }).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.p1h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x1h0.m209053T2(this.f150172a, (t4u.C20236a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a3 */
    public final void m209060a3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM203768x5 = tbs.f172989b.m203768x5();
        if (bSuggestedTabAnimationItemM203768x5 == null || !bSuggestedTabAnimationItemM203768x5.f45365on) {
            return;
        }
        Integer num = this.suggest_save_guide_total_num.get();
        if (num.intValue() < bSuggestedTabAnimationItemM203768x5.total) {
            Long l2 = this.suggest_save_guide_show_day_time.get();
            Integer num2 = this.suggest_save_guide_show_day_count.get();
            long jM174453n = pzi0.m174453n();
            if (l2 != null && l2.longValue() == jM174453n) {
                if (num2.intValue() < bSuggestedTabAnimationItemM203768x5.dayLimit) {
                    this.suggest_save_guide_show_day_count.put(Integer.valueOf(num2.intValue() + 1));
                    this.suggest_save_guide_total_num.put(Integer.valueOf(num.intValue() + 1));
                    m209061b3(bSuggestedTabAnimationItemM203768x5.duration);
                    return;
                }
                return;
            }
            long jM174453n2 = pzi0.m174453n();
            l2.getClass();
            if (jM174453n2 - l2.longValue() <= bSuggestedTabAnimationItemM203768x5.nextDay * 86400000 || bSuggestedTabAnimationItemM203768x5.dayLimit <= 0) {
                return;
            }
            this.suggest_save_guide_show_day_time.put(Long.valueOf(pzi0.m174453n()));
            this.suggest_save_guide_show_day_count.put(1);
            this.suggest_save_guide_total_num.put(Integer.valueOf(num.intValue() + 1));
            m209061b3(bSuggestedTabAnimationItemM203768x5.duration);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final void m209061b3(long time) {
        t4u.m189323l("guide", true);
        duringCreated(C22421c.timer(time, TimeUnit.MILLISECONDS)).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.q1h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x1h0.m209051R2((Long) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(t4u.m189321j());
        final Function1 function1 = new Function1() { // from class: l.r1h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1h0.m209059Z2((t4u.C20236a) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.s1h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x1h0.m209054U2(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.t1h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x1h0.m209052S2((t4u.C20236a) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(t4u.m189320i());
        final Function1 function2 = new Function1() { // from class: l.u1h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return x1h0.m209050Q2((Boolean) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.v1h0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x1h0.m209057X2(function2, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.w1h0
            @Override // p153l.y20
            public final void call(Object obj) {
                x1h0.m209056W2((Boolean) obj);
            }
        }));
    }
}
