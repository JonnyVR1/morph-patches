package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/uen;", "Ll/y8s;", "Ll/oo2;", "Ll/pen;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "W3", "()V", "", "familyId", "X3", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class uen extends y8s<oo2, pen> {
    public uen(@Nullable dum<? extends oo2> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m195788S3(uen uenVar, uxj0 uxj0Var) {
        o1j0.m165649w(R$string.f48266nj);
        V v2 = uenVar.viewModel;
        v2.getClass();
        ((pen) v2).mo73021p();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m195789T3(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m195790U3(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m195791V3(uen uenVar, BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo) {
        if (uenVar.viewModel == 0) {
            Act act = uenVar.f196918e.f90815a;
            act.getClass();
            pen penVar = new pen(act, uenVar);
            uenVar.viewModel = penVar;
            uenVar.mo52715C(penVar);
        }
        V v2 = uenVar.viewModel;
        v2.getClass();
        bLiveIntlFamilyShareInfo.getClass();
        ((pen) v2).m172054K(bLiveIntlFamilyShareInfo);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    public final void m195792W3() {
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        String str = M213810E2.m168498Z0() ? BLiveType.voiceLive : "live";
        ?? M213810E3 = m213810E2();
        M213810E3.getClass();
        duringCreated(kbo.m149071h(str, M213810E3.m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.qen
            @Override // p153l.y20
            public final void call(Object obj) {
                uen.m195791V3(this.f157195a, (BLiveIntlFamilyShareInfo) obj);
            }
        }, new y20() { // from class: l.ren
            @Override // p153l.y20
            public final void call(Object obj) {
                uen.m195790U3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public final void m195793X3(@NotNull String familyId) {
        familyId.getClass();
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        String str = M213810E2.m168498Z0() ? BLiveType.voiceLive : "live";
        ?? M213810E3 = m213810E2();
        M213810E3.getClass();
        duringCreated(kbo.m149076m(str, M213810E3.m202194o(), familyId)).subscribe(dhw.m115826e(new y20() { // from class: l.sen
            @Override // p153l.y20
            public final void call(Object obj) {
                uen.m195788S3(this.f167634a, (uxj0) obj);
            }
        }, new y20() { // from class: l.ten
            @Override // p153l.y20
            public final void call(Object obj) {
                uen.m195789T3((Throwable) obj);
            }
        }));
    }
}
