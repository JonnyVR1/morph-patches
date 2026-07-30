package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LoveBuzzPushData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.j760;
import l.j8w;
import l.l6w;
import l.m6w;
import l.mcr;
import l.p9w;
import l.qa2;
import l.tg2;
import l.vwb;
import l.xma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Ll/iii0;", "Ll/tg2;", "Ll/mcr;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/mcr;Ljava/lang/String;)V", "Ll/j760;", "", "pair", "", "A0", "(Ll/j760;)Z", "", "u0", "(Ll/j760;)V", "U0", "()V", "V0", "e1", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class iii0 extends tg2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iii0(@NotNull mcr mcrVar, @NotNull String str) {
        super(mcrVar, str);
        mcrVar.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m5124b1(iii0 iii0Var) {
        iii0Var.m5130e1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m5125c1() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m5126d1() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m5127A0(@NotNull j760<String, Object> pair) {
        pair.getClass();
        if (!Intrinsics.d(pair.a, "intl.text.lovebuzz.show.notify")) {
            return false;
        }
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.a("BaseBuzzSearchPresenter", "filter " + pair.a);
        Object obj = pair.b;
        if (obj instanceof LoveBuzzPushData) {
            obj.getClass();
            String str = ((LoveBuzzPushData) obj).buzzIntent;
            if (Intrinsics.d(str, "intl.lovebuzz.match")) {
                return true;
            }
            if (Intrinsics.d(str, "intl.lovebuzz.invite")) {
                boolean zE4 = xma.e4();
                StringBuilder sb = new StringBuilder("filter hadSVip ");
                sb.append(!zE4);
                qa2Var.a("BaseBuzzSearchPresenter", sb.toString());
                if (!zE4) {
                    return true;
                }
                int iE = l6w.INSTANCE.e();
                qa2Var.a("BaseBuzzSearchPresenter", "filter buzzMatchTimes " + iE);
                if (iE > 0 || iE == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public void m5128U0() {
        if (t0()) {
            super.U0();
            qa2.INSTANCE.a("BaseBuzzSearchPresenter", "startSearch");
            j8w.Companion.a().m1();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m5129V0() {
        super.V0();
        qa2.INSTANCE.a("BaseBuzzSearchPresenter", "stopSearch");
        j8w.Companion.a().o1();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m5130e1() {
        j8w.Companion.a().z0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
        L0();
        Act act = act();
        if (act != null) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m5131u0(@NotNull j760<String, Object> pair) {
        Act act;
        pair.getClass();
        super.u0(pair);
        Object obj = pair.b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        if (loveBuzzPushData == null || (act = act()) == null || !m6w.INSTANCE.a(act)) {
            return;
        }
        j8w j8wVarA = j8w.Companion.a();
        Act act2 = act();
        act2.getClass();
        j8wVarA.q0(act2, loveBuzzPushData.buzzToken, loveBuzzPushData, p9w.INSTANCE.y("textBuzz"), new Function0() { // from class: l.fii0
            public final Object invoke() {
                return iii0.m5124b1(this.f3650a);
            }
        }, new Function0() { // from class: l.gii0
            public final Object invoke() {
                return iii0.m5125c1();
            }
        }, new Function0() { // from class: l.hii0
            public final Object invoke() {
                return iii0.m5126d1();
            }
        }, false);
    }
}
