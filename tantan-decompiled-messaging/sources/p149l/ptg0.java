package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BSuggestedTabAnimationItem;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/ptg0;", "Ll/svs;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", BaseSei.INFO, "<init>", "(Ll/mcr;Ll/mss;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "a3", "", "time", "b3", "(J)V", "Ll/tpd0;", "f", "Ll/tpd0;", "getSuggest_save_guide_total_num", "()Ll/tpd0;", "suggest_save_guide_total_num", "g", "getSuggest_save_guide_show_day_count", "suggest_save_guide_show_day_count", "Ll/zpd0;", "h", "Ll/zpd0;", "getSuggest_save_guide_show_day_time", "()Ll/zpd0;", "suggest_save_guide_show_day_time", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ptg0 extends svs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final tpd0 suggest_save_guide_total_num;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final tpd0 suggest_save_guide_show_day_count;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final zpd0 suggest_save_guide_show_day_time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptg0(@NotNull mcr mcrVar, @NotNull mss mssVar) {
        super(mcrVar, mssVar);
        mcrVar.getClass();
        mssVar.getClass();
        this.suggest_save_guide_total_num = new tpd0("SuggestGuide_guide_total_" + l9s.m149093o0(), 0);
        this.suggest_save_guide_show_day_count = new tpd0("SuggestGuide_guide_show_day_count_" + l9s.m149093o0(), 0);
        this.suggest_save_guide_show_day_time = new zpd0("SuggestGuide_guide_show_day_time_" + l9s.m149093o0(), 0L);
    }

    /* JADX INFO: renamed from: Q2 */
    public static Boolean m171311Q2(Boolean bool) {
        return Boolean.valueOf(bool != null && bool.booleanValue());
    }

    /* JADX INFO: renamed from: R2 */
    public static void m171312R2(Long l2) {
        s2u.m182080l("guide", false);
    }

    /* JADX INFO: renamed from: S2 */
    public static void m171313S2(s2u.C19834a c19834a) {
        s2u.m182080l("guide", false);
    }

    /* JADX INFO: renamed from: T2 */
    public static void m171314T2(ptg0 ptg0Var, s2u.C19834a c19834a) {
        ptg0Var.m171321a3();
    }

    /* JADX INFO: renamed from: U2 */
    public static Boolean m171315U2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V2 */
    public static Boolean m171316V2(s2u.C19834a c19834a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c19834a.f162016a));
    }

    /* JADX INFO: renamed from: W2 */
    public static void m171317W2(Boolean bool) {
        s2u.m182080l("guide", false);
    }

    /* JADX INFO: renamed from: X2 */
    public static Boolean m171318X2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y2 */
    public static Boolean m171319Y2(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z2 */
    public static Boolean m171320Z2(s2u.C19834a c19834a) {
        return Boolean.valueOf(TextUtils.equals("p_live_recommend", c19834a.f162016a));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<T> c22306cDuringCreated = duringCreated(s2u.m182078j());
        final Function1 function1 = new Function1() { // from class: l.ftg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ptg0.m171316V2((s2u.C19834a) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.gtg0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ptg0.m171319Y2(function1, obj);
            }
        }).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.htg0
            @Override // p149l.e30
            public final void call(Object obj) {
                ptg0.m171314T2(this.f109391a, (s2u.C19834a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a3 */
    public final void m171321a3() {
        BSuggestedTabAnimationItem bSuggestedTabAnimationItemM195981x5 = s9s.f163228b.m195981x5();
        if (bSuggestedTabAnimationItemM195981x5 == null || !bSuggestedTabAnimationItemM195981x5.f44517on) {
            return;
        }
        Integer num = this.suggest_save_guide_total_num.get();
        if (num.intValue() < bSuggestedTabAnimationItemM195981x5.total) {
            Long l2 = this.suggest_save_guide_show_day_time.get();
            Integer num2 = this.suggest_save_guide_show_day_count.get();
            long jM155943n = mqi0.m155943n();
            if (l2 != null && l2.longValue() == jM155943n) {
                if (num2.intValue() < bSuggestedTabAnimationItemM195981x5.dayLimit) {
                    this.suggest_save_guide_show_day_count.put(Integer.valueOf(num2.intValue() + 1));
                    this.suggest_save_guide_total_num.put(Integer.valueOf(num.intValue() + 1));
                    m171322b3(bSuggestedTabAnimationItemM195981x5.duration);
                    return;
                }
                return;
            }
            long jM155943n2 = mqi0.m155943n();
            l2.getClass();
            if (jM155943n2 - l2.longValue() <= bSuggestedTabAnimationItemM195981x5.nextDay * 86400000 || bSuggestedTabAnimationItemM195981x5.dayLimit <= 0) {
                return;
            }
            this.suggest_save_guide_show_day_time.put(Long.valueOf(mqi0.m155943n()));
            this.suggest_save_guide_show_day_count.put(1);
            this.suggest_save_guide_total_num.put(Integer.valueOf(num.intValue() + 1));
            m171322b3(bSuggestedTabAnimationItemM195981x5.duration);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final void m171322b3(long time) {
        s2u.m182080l("guide", true);
        duringCreated(C22306c.timer(time, TimeUnit.MILLISECONDS)).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.itg0
            @Override // p149l.e30
            public final void call(Object obj) {
                ptg0.m171312R2((Long) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(s2u.m182078j());
        final Function1 function1 = new Function1() { // from class: l.jtg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ptg0.m171320Z2((s2u.C19834a) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.ktg0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ptg0.m171315U2(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ltg0
            @Override // p149l.e30
            public final void call(Object obj) {
                ptg0.m171313S2((s2u.C19834a) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(s2u.m182077i());
        final Function1 function2 = new Function1() { // from class: l.mtg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ptg0.m171311Q2((Boolean) obj);
            }
        };
        c22306cDuringCreated2.filter(new w9j() { // from class: l.ntg0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ptg0.m171318X2(function2, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.otg0
            @Override // p149l.e30
            public final void call(Object obj) {
                ptg0.m171317W2((Boolean) obj);
            }
        }));
    }
}
