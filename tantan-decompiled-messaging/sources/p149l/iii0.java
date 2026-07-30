package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"Ll/iii0;", "Ll/tg2;", "Ll/mcr;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/mcr;Ljava/lang/String;)V", "Ll/j760;", "", "pair", "", "A0", "(Ll/j760;)Z", "", "u0", "(Ll/j760;)V", "U0", "()V", "V0", "e1", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class iii0 extends tg2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iii0(@NotNull mcr mcrVar, @NotNull String str) {
        super(mcrVar, str);
        mcrVar.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m136400b1(iii0 iii0Var) {
        iii0Var.m136405e1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m136401c1() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m136402d1() {
        return Unit.INSTANCE;
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: A0 */
    public boolean mo116414A0(@NotNull j760<String, Object> pair) {
        pair.getClass();
        if (!Intrinsics.m87488d(pair.f116564a, "intl.text.lovebuzz.show.notify")) {
            return false;
        }
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BaseBuzzSearchPresenter", "filter " + ((Object) pair.f116564a));
        Object obj = pair.f116565b;
        if (obj instanceof LoveBuzzPushData) {
            obj.getClass();
            String str = ((LoveBuzzPushData) obj).buzzIntent;
            if (Intrinsics.m87488d(str, "intl.lovebuzz.match")) {
                return true;
            }
            if (Intrinsics.m87488d(str, "intl.lovebuzz.invite")) {
                boolean zM210071e4 = xma.m210071e4();
                StringBuilder sb = new StringBuilder("filter hadSVip ");
                sb.append(!zM210071e4);
                qa2Var.m173681a("BaseBuzzSearchPresenter", sb.toString());
                if (!zM210071e4) {
                    return true;
                }
                int iM148776e = l6w.INSTANCE.m148776e();
                qa2Var.m173681a("BaseBuzzSearchPresenter", "filter buzzMatchTimes " + iM148776e);
                if (iM148776e > 0 || iM148776e == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: U0 */
    public void mo136403U0() {
        if (m188796t0()) {
            super.mo136403U0();
            qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "startSearch");
            j8w.INSTANCE.m140473a().m140455m1();
        }
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: V0 */
    public void mo136404V0() {
        super.mo136404V0();
        qa2.INSTANCE.m173681a("BaseBuzzSearchPresenter", "stopSearch");
        j8w.INSTANCE.m140473a().m140459o1();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m136405e1() {
        j8w.INSTANCE.m140473a().m140472z0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
        m188789L0();
        Act act = act();
        if (act != null) {
            act.m66873d2();
        }
    }

    @Override // p149l.tg2
    /* JADX INFO: renamed from: u0 */
    public void mo136406u0(@NotNull j760<String, Object> pair) {
        Act act;
        pair.getClass();
        super.mo136406u0(pair);
        Object obj = pair.f116565b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        if (loveBuzzPushData == null || (act = act()) == null || !m6w.INSTANCE.m153296a(act)) {
            return;
        }
        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
        Act act2 = act();
        act2.getClass();
        j8wVarM140473a.m140461q0(act2, loveBuzzPushData.buzzToken, loveBuzzPushData, p9w.INSTANCE.m167964y("textBuzz"), new Function0() { // from class: l.fii0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iii0.m136400b1(this.f97679a);
            }
        }, new Function0() { // from class: l.gii0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iii0.m136401c1();
            }
        }, new Function0() { // from class: l.hii0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iii0.m136402d1();
            }
        }, false);
    }
}
