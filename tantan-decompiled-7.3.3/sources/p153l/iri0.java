package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"Ll/iri0;", "Ll/ah2;", "Ll/ner;", "lifecycleProvider", "", "pageType", "<init>", "(Ll/ner;Ljava/lang/String;)V", "Ll/pf60;", "", "pair", "", "A0", "(Ll/pf60;)Z", "", "u0", "(Ll/pf60;)V", "U0", "()V", "V0", "e1", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iri0 extends ah2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iri0(@NotNull ner nerVar, @NotNull String str) {
        super(nerVar, str);
        nerVar.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m141831b1(iri0 iri0Var) {
        iri0Var.m141834e1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m141832c1() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m141833d1() {
        return Unit.INSTANCE;
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: A0 */
    public boolean mo97752A0(@NotNull pf60<String, Object> pair) {
        pair.getClass();
        if (!Intrinsics.m88377d(pair.f152156a, "intl.text.lovebuzz.show.notify")) {
            return false;
        }
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BaseBuzzSearchPresenter", "filter " + ((Object) pair.f152156a));
        Object obj = pair.f152157b;
        if (obj instanceof LoveBuzzPushData) {
            obj.getClass();
            String str = ((LoveBuzzPushData) obj).buzzIntent;
            if (Intrinsics.m88377d(str, "intl.lovebuzz.match")) {
                return true;
            }
            if (Intrinsics.m88377d(str, "intl.lovebuzz.invite")) {
                boolean zM146386f4 = joa.m146386f4();
                StringBuilder sb = new StringBuilder("filter hadSVip ");
                sb.append(!zM146386f4);
                xa2Var.m209830a("BaseBuzzSearchPresenter", sb.toString());
                if (!zM146386f4) {
                    return true;
                }
                int iM143907e = j8w.INSTANCE.m143907e();
                xa2Var.m209830a("BaseBuzzSearchPresenter", "filter buzzMatchTimes " + iM143907e);
                if (iM143907e > 0 || iM143907e == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: U0 */
    public void mo97766U0() {
        if (m97770t0()) {
            super.mo97766U0();
            xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "startSearch");
            haw.INSTANCE.m134320a().m134302m1();
        }
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: V0 */
    public void mo97767V0() {
        super.mo97767V0();
        xa2.INSTANCE.m209830a("BaseBuzzSearchPresenter", "stopSearch");
        haw.INSTANCE.m134320a().m134306o1();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m141834e1() {
        haw.INSTANCE.m134320a().m134319z0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
        m97761L0();
        Act act = act();
        if (act != null) {
            act.m68056e2();
        }
    }

    @Override // p153l.ah2
    /* JADX INFO: renamed from: u0 */
    public void mo97771u0(@NotNull pf60<String, Object> pair) {
        Act act;
        pair.getClass();
        super.mo97771u0(pair);
        Object obj = pair.f152157b;
        LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
        if (loveBuzzPushData == null || (act = act()) == null || !k8w.INSTANCE.m148752a(act)) {
            return;
        }
        haw hawVarM134320a = haw.INSTANCE.m134320a();
        Act act2 = act();
        act2.getClass();
        hawVarM134320a.m134308q0(act2, loveBuzzPushData.buzzToken, loveBuzzPushData, nbw.INSTANCE.m162268y("textBuzz"), new Function0() { // from class: l.fri0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iri0.m141831b1(this.f100429a);
            }
        }, new Function0() { // from class: l.gri0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iri0.m141832c1();
            }
        }, new Function0() { // from class: l.hri0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iri0.m141833d1();
            }
        }, false);
    }
}
