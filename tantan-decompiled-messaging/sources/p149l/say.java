package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\fJ!\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"R,\u0010*\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Ll/say;", "Ll/x6s;", "Ll/nnn0;", "Ll/fay;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "defaultIndex", "", "j4", "(I)V", "state", "i4", "R3", "()V", j6f.GPS_DIRECTION_TRUE, "", "Ll/vay;", "e4", "()Ljava/util/List;", "menuType", "f4", FirebaseAnalytics.Param.INDEX, "k4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "count", "h4", "(ILcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;)V", "onePage", "g4", "", "d4", "()Ljava/lang/String;", "Ll/key;", "j", "Ll/key;", "getSettlePresenter", "()Ll/key;", "setSettlePresenter", "(Ll/key;)V", "settlePresenter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class say extends x6s<nnn0, fay> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public key<?, ?> settlePresenter;

    public say(@Nullable bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        mo51532C(new fay(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m183127S3(say sayVar, Integer num) {
        num.getClass();
        sayVar.m183139j4(num.intValue());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m183128T3(say sayVar, Integer num) {
        num.getClass();
        sayVar.m183143g4(num.intValue());
    }

    /* JADX INFO: renamed from: U3 */
    public static void m183129U3(say sayVar, Integer num) {
        num.getClass();
        sayVar.m183145k4(num.intValue());
    }

    /* JADX INFO: renamed from: V3 */
    public static void m183130V3(int i, gul gulVar) {
        if (gulVar instanceof gay) {
            gay gayVar = (gay) gulVar;
            if (gayVar.mo115767T3() == i) {
                gayVar.mo115769V3();
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static void m183131W3(say sayVar, Throwable th) {
        sayVar.m183144h4(0, null);
    }

    /* JADX INFO: renamed from: X3 */
    public static int m183132X3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m183133Y3(say sayVar, int i, BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter) {
        if (bLiveVoiceAdminPanelCounter.applyCallRedDot > 0) {
            if (i < 0) {
                i = 3;
            }
            sayVar.m183144h4(i, bLiveVoiceAdminPanelCounter);
        } else {
            if (bLiveVoiceAdminPanelCounter.applySettleRedDot <= 0) {
                sayVar.m183144h4(0, bLiveVoiceAdminPanelCounter);
                return;
            }
            if (i < 0) {
                i = 2;
            }
            sayVar.m183144h4(i, bLiveVoiceAdminPanelCounter);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m183134Z3(say sayVar, Integer num) {
        fay fayVar = (fay) sayVar.viewModel;
        num.getClass();
        fayVar.m120331M(num.intValue(), true);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m183135a4(ArrayList arrayList, gul gulVar) {
        if (gulVar instanceof gay) {
            arrayList.add(((gay) gulVar).mo115766S3());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static void m183136b4(say sayVar, Integer num) {
        fay fayVar = (fay) sayVar.viewModel;
        num.getClass();
        fayVar.m120331M(num.intValue(), false);
    }

    /* JADX INFO: renamed from: c4 */
    public static int m183137c4(vay vayVar, vay vayVar2) {
        vayVar.getClass();
        vayVar2.getClass();
        return vayVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - vayVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
    }

    /* JADX INFO: renamed from: i4 */
    private final void m183138i4(final int state) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.qay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183130V3(state, (gul) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private final void m183139j4(final int defaultIndex) {
        key<?, ?> keyVar = this.settlePresenter;
        if (keyVar != null) {
            keyVar.m145821j4(false);
        }
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.adminCounter(strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.ray
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183133Y3(this.f158569a, defaultIndex, (BLiveVoiceAdminPanelCounter) obj);
            }
        }, new e30() { // from class: l.iay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183131W3(this.f112331a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        bsm<? extends T> bsmVar = this.f188512e;
        m144512z2(new ecy(bsmVar, new fcy(bsmVar.f77095a)));
        bsm<? extends T> bsmVar2 = this.f188512e;
        this.settlePresenter = (key) m144512z2(new key(bsmVar2, new dey(bsmVar2.f77095a)));
        bsm<? extends T> bsmVar3 = this.f188512e;
        m144512z2(new wdy(bsmVar3, new pdy(bsmVar3.f77095a)));
        bsm<? extends T> bsmVar4 = this.f188512e;
        m144512z2(new ody(bsmVar4, new scy(bsmVar4.f77095a)));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().MemberManagerEvent.showMemberManagerDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.hay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183127S3(this.f106857a, (Integer) obj);
            }
        }));
        duringCreated(m206028F2().MemberManagerEvent.showMemberManagerDialogForce().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.jay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183129U3(this.f117141a, (Integer) obj);
            }
        }));
        duringCreated(m206028F2().MemberManagerEvent.showMemberManagerDialogWithOnePage().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.kay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183128T3(this.f122161a, (Integer) obj);
            }
        }));
        duringCreated(m206028F2().MemberManagerEvent.clearTabRedPoint().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.lay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183136b4(this.f127252a, (Integer) obj);
            }
        }));
        duringCreated(m206028F2().MemberManagerEvent.addTabRedPoint().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.may
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183134Z3(this.f132969a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final String m183140d4() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        if (e0o0.m114328o(strM199309D0, this)) {
            return "anchor";
        }
        if (e0o0.m114322h(this)) {
            return "manager";
        }
        return ((Boolean) m129297F3(new qul0(strM199309D0))).booleanValue() ? "member" : "passerby";
    }

    @NotNull
    /* JADX INFO: renamed from: e4 */
    public final List<vay> m183141e4() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.nay
            @Override // p149l.e30
            public final void call(Object obj) {
                say.m183135a4(arrayList, (gul) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.oay
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(say.m183137c4((vay) obj, (vay) obj2));
            }
        };
        vwb.m200295I(arrayList, new Comparator() { // from class: l.pay
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return say.m183132X3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m183142f4(int menuType) {
        String str = ((nnn0) m206027E2()).m132146l0().f56011id;
        str.getClass();
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        hby.m130356d(menuType, str, strM149814k, m183140d4());
        m183138i4(menuType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m183143g4(int onePage) {
        key<?, ?> keyVar = this.settlePresenter;
        if (keyVar != null) {
            keyVar.m145821j4(true);
        }
        String strM132140j0 = ((nnn0) m206027E2()).m132140j0();
        strM132140j0.getClass();
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        hby.m130358f(strM132140j0, strM149814k, m183140d4());
        ((fay) this.viewModel).m120339V(onePage, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m183144h4(int index, BLiveVoiceAdminPanelCounter count) {
        String strM132140j0 = ((nnn0) m206027E2()).m132140j0();
        strM132140j0.getClass();
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        hby.m130355c(strM132140j0, strM149814k, m183140d4());
        String str = ((nnn0) m206027E2()).m132146l0().f56011id;
        str.getClass();
        String strM149814k2 = ((nnn0) m206027E2()).m149814k();
        strM149814k2.getClass();
        hby.m130356d(index, str, strM149814k2, m183140d4());
        ((fay) this.viewModel).m120339V(index, false, count);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m183145k4(int index) {
        key<?, ?> keyVar = this.settlePresenter;
        if (keyVar != null) {
            keyVar.m145821j4(false);
        }
        m183144h4(index, null);
    }
}
