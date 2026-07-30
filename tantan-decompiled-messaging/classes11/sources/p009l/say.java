package p009l;

import com.p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.gul;
import l.k4t;
import l.nnn0;
import l.qul0;
import l.vwb;
import l.wxs;
import l.x6s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\fJ!\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"R,\u0010*\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Ll/say;", "Ll/x6s;", "Ll/nnn0;", "Ll/fay;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "defaultIndex", "", "j4", "(I)V", "state", "i4", "R3", "()V", "T", "", "Ll/vay;", "e4", "()Ljava/util/List;", "menuType", "f4", "index", "k4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "count", "h4", "(ILcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;)V", "onePage", "g4", "", "d4", "()Ljava/lang/String;", "Ll/key;", "j", "Ll/key;", "getSettlePresenter", "()Ll/key;", "setSettlePresenter", "(Ll/key;)V", "settlePresenter", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class say extends x6s<nnn0, fay> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public key<?, ?> settlePresenter;

    public say(@Nullable bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        C(new fay(bsmVar.a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m22016S3(say sayVar, Integer num) {
        num.getClass();
        sayVar.m22028j4(num.intValue());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m22017T3(say sayVar, Integer num) {
        num.getClass();
        sayVar.m22034g4(num.intValue());
    }

    /* JADX INFO: renamed from: U3 */
    public static void m22018U3(say sayVar, Integer num) {
        num.getClass();
        sayVar.m22036k4(num.intValue());
    }

    /* JADX INFO: renamed from: V3 */
    public static void m22019V3(int i, gul gulVar) {
        if (gulVar instanceof gay) {
            gay gayVar = (gay) gulVar;
            if (gayVar.mo13820T3() == i) {
                gayVar.mo13822V3();
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static void m22020W3(say sayVar, Throwable th) {
        sayVar.m22035h4(0, null);
    }

    /* JADX INFO: renamed from: X3 */
    public static int m22021X3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m22022Y3(say sayVar, int i, BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter) {
        if (bLiveVoiceAdminPanelCounter.applyCallRedDot > 0) {
            if (i < 0) {
                i = 3;
            }
            sayVar.m22035h4(i, bLiveVoiceAdminPanelCounter);
        } else {
            if (bLiveVoiceAdminPanelCounter.applySettleRedDot <= 0) {
                sayVar.m22035h4(0, bLiveVoiceAdminPanelCounter);
                return;
            }
            if (i < 0) {
                i = 2;
            }
            sayVar.m22035h4(i, bLiveVoiceAdminPanelCounter);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m22023Z3(say sayVar, Integer num) {
        fay fayVar = ((bwr) sayVar).viewModel;
        num.getClass();
        fayVar.m14344M(num.intValue(), true);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m22024a4(ArrayList arrayList, gul gulVar) {
        if (gulVar instanceof gay) {
            arrayList.add(((gay) gulVar).mo13819S3());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static void m22025b4(say sayVar, Integer num) {
        fay fayVar = ((bwr) sayVar).viewModel;
        num.getClass();
        fayVar.m14344M(num.intValue(), false);
    }

    /* JADX INFO: renamed from: c4 */
    public static int m22026c4(vay vayVar, vay vayVar2) {
        vayVar.getClass();
        vayVar2.getClass();
        return vayVar.getIndex() - vayVar2.getIndex();
    }

    /* JADX INFO: renamed from: i4 */
    private final void m22027i4(final int state) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return;
        }
        vwb.z(map.values(), new e30() { // from class: l.qay
            public final void call(Object obj) {
                say.m22019V3(state, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j4 */
    private final void m22028j4(final int defaultIndex) {
        key<?, ?> keyVar = this.settlePresenter;
        if (keyVar != null) {
            keyVar.m17459j4(false);
        }
        String strK = E2().k();
        strK.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.adminCounter(strK)).subscribe(ffw.e(new e30() { // from class: l.ray
            public final void call(Object obj) {
                say.m22022Y3(this.f19715a, defaultIndex, (BLiveVoiceAdminPanelCounter) obj);
            }
        }, new e30() { // from class: l.iay
            public final void call(Object obj) {
                say.m22020W3(this.f14455a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3 */
    public void m22029R3() {
        super.R3();
        bsm bsmVar = ((wxs) this).e;
        z2(new ecy(bsmVar, new fcy(bsmVar.a)));
        bsm bsmVar2 = ((wxs) this).e;
        this.settlePresenter = z2(new key(bsmVar2, new dey(bsmVar2.a)));
        bsm bsmVar3 = ((wxs) this).e;
        z2(new wdy(bsmVar3, new pdy(bsmVar3.a)));
        bsm bsmVar4 = ((wxs) this).e;
        z2(new ody(bsmVar4, new scy(bsmVar4.a)));
    }

    /* JADX INFO: renamed from: T */
    public void m22030T() {
        super/*l.k4t*/.T();
        duringCreated((c) F2().MemberManagerEvent.showMemberManagerDialog().g()).subscribe(ffw.h(new e30() { // from class: l.hay
            public final void call(Object obj) {
                say.m22016S3(this.f13933a, (Integer) obj);
            }
        }));
        duringCreated((c) F2().MemberManagerEvent.showMemberManagerDialogForce().g()).subscribe(ffw.h(new e30() { // from class: l.jay
            public final void call(Object obj) {
                say.m22018U3(this.f15035a, (Integer) obj);
            }
        }));
        duringCreated((c) F2().MemberManagerEvent.showMemberManagerDialogWithOnePage().g()).subscribe(ffw.h(new e30() { // from class: l.kay
            public final void call(Object obj) {
                say.m22017T3(this.f15570a, (Integer) obj);
            }
        }));
        duringCreated((c) F2().MemberManagerEvent.clearTabRedPoint().g()).subscribe(ffw.h(new e30() { // from class: l.lay
            public final void call(Object obj) {
                say.m22025b4(this.f16039a, (Integer) obj);
            }
        }));
        duringCreated((c) F2().MemberManagerEvent.addTabRedPoint().g()).subscribe(ffw.h(new e30() { // from class: l.may
            public final void call(Object obj) {
                say.m22023Z3(this.f16783a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final String m22031d4() {
        String strM23619D0 = ypv.f23196a.m23619D0();
        strM23619D0.getClass();
        if (e0o0.m13625o(strM23619D0, this)) {
            return "anchor";
        }
        if (e0o0.m13619h(this)) {
            return "manager";
        }
        return ((Boolean) F3(new qul0(strM23619D0))).booleanValue() ? "member" : "passerby";
    }

    @NotNull
    /* JADX INFO: renamed from: e4 */
    public final List<vay> m22032e4() {
        final ArrayList arrayList = new ArrayList();
        vwb.z(((k4t) this).b.values(), new e30() { // from class: l.nay
            public final void call(Object obj) {
                say.m22024a4(arrayList, (gul) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.oay
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(say.m22026c4((vay) obj, (vay) obj2));
            }
        };
        vwb.I(arrayList, new Comparator() { // from class: l.pay
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return say.m22021X3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m22033f4(int menuType) {
        String str = ((DbObject) E2().l0()).id;
        str.getClass();
        String strK = E2().k();
        strK.getClass();
        hby.m15518d(menuType, str, strK, m22031d4());
        m22027i4(menuType);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m22034g4(int onePage) {
        key<?, ?> keyVar = this.settlePresenter;
        if (keyVar != null) {
            keyVar.m17459j4(true);
        }
        String strJ0 = E2().j0();
        strJ0.getClass();
        String strK = E2().k();
        strK.getClass();
        hby.m15520f(strJ0, strK, m22031d4());
        ((bwr) this).viewModel.m14352V(onePage, true, null);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m22035h4(int index, BLiveVoiceAdminPanelCounter count) {
        String strJ0 = E2().j0();
        strJ0.getClass();
        String strK = E2().k();
        strK.getClass();
        hby.m15517c(strJ0, strK, m22031d4());
        String str = ((DbObject) E2().l0()).id;
        str.getClass();
        String strK2 = E2().k();
        strK2.getClass();
        hby.m15518d(index, str, strK2, m22031d4());
        ((bwr) this).viewModel.m14352V(index, false, count);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22036k4(int index) {
        key<?, ?> keyVar = this.settlePresenter;
        if (keyVar != null) {
            keyVar.m17459j4(false);
        }
        m22035h4(index, null);
    }
}
