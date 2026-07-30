package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/kdp;", "Ll/y8s;", "Ll/oo2;", "Ll/edp;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "a4", "Z3", "b4", "Ll/urn;", "j", "Lkotlin/Lazy;", "Y3", "()Ll/urn;", "intlInviteFriendToSharePresenter", "Ll/uen;", "k", "X3", "()Ll/uen;", "intlFamilyChatSharePresenter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class kdp extends y8s<oo2, edp> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy intlInviteFriendToSharePresenter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy intlFamilyChatSharePresenter;

    public kdp(@Nullable final dum<? extends oo2> dumVar) {
        super(dumVar);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.intlInviteFriendToSharePresenter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.gdp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kdp.m149254W3(dumVar, this);
            }
        });
        this.intlFamilyChatSharePresenter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.hdp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kdp.m149250S3(dumVar, this);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public static uen m149250S3(dum dumVar, kdp kdpVar) {
        uen uenVar = new uen(dumVar);
        kdpVar.m153103z2(uenVar);
        return uenVar;
    }

    /* JADX INFO: renamed from: T3 */
    public static void m149251T3(kdp kdpVar, Boolean bool) {
        if (kdpVar.viewModel == 0) {
            Act act = kdpVar.f196918e.f90815a;
            act.getClass();
            edp edpVar = new edp(act, kdpVar);
            kdpVar.viewModel = edpVar;
            kdpVar.mo52715C(edpVar);
        }
        edp edpVar2 = (edp) kdpVar.viewModel;
        if (edpVar2 != null) {
            bool.getClass();
            edpVar2.m120518M(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static void m149252U3(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m149253V3(kdp kdpVar, vxj0 vxj0Var) {
        kdpVar.m149259b4();
    }

    /* JADX INFO: renamed from: W3 */
    public static urn m149254W3(dum dumVar, kdp kdpVar) {
        urn urnVar = new urn(dumVar);
        kdpVar.m153103z2(urnVar);
        return urnVar;
    }

    /* JADX INFO: renamed from: X3 */
    public final uen m149255X3() {
        return (uen) this.intlFamilyChatSharePresenter.getValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public final urn m149256Y3() {
        return (urn) this.intlInviteFriendToSharePresenter.getValue();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m149257Z3() {
        if (m213810E2() == 0) {
            return;
        }
        m149255X3().m195792W3();
    }

    /* JADX INFO: renamed from: a4 */
    public final void m149258a4() {
        if (m213810E2() == 0) {
            return;
        }
        m149256Y3().m197638Z3();
    }

    /* JADX INFO: renamed from: b4 */
    public final void m149259b4() {
        duringCreated(kbo.m149070g()).subscribe(dhw.m115826e(new y20() { // from class: l.idp
            @Override // p153l.y20
            public final void call(Object obj) {
                kdp.m149251T3(this.f114517a, (Boolean) obj);
            }
        }, new y20() { // from class: l.jdp
            @Override // p153l.y20
            public final void call(Object obj) {
                kdp.m149252U3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().IntlVoiceLiveEvent.openSharePanelDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.fdp
            @Override // p153l.y20
            public final void call(Object obj) {
                kdp.m149253V3(this.f98489a, (vxj0) obj);
            }
        }));
    }
}
