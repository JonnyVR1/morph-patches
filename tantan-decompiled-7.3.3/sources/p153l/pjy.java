package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\fJ!\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"R,\u0010*\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Ll/pjy;", "Ll/y8s;", "Ll/rwn0;", "Ll/cjy;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "defaultIndex", "", "j4", "(I)V", "state", "i4", "R3", "()V", p7f.GPS_DIRECTION_TRUE, "", "Ll/sjy;", "e4", "()Ljava/util/List;", "menuType", "f4", FirebaseAnalytics.Param.INDEX, "k4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;", "count", "h4", "(ILcom/p1/mobile/putong/live/base/data/BLiveVoiceAdminPanelCounter;)V", "onePage", "g4", "", "d4", "()Ljava/lang/String;", "Ll/hny;", "j", "Ll/hny;", "getSettlePresenter", "()Ll/hny;", "setSettlePresenter", "(Ll/hny;)V", "settlePresenter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class pjy extends y8s<rwn0, cjy> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public hny<?, ?> settlePresenter;

    public pjy(@Nullable dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        mo52715C(new cjy(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: S3 */
    public static void m172542S3(pjy pjyVar, Integer num) {
        num.getClass();
        pjyVar.m172554j4(num.intValue());
    }

    /* JADX INFO: renamed from: T3 */
    public static void m172543T3(pjy pjyVar, Integer num) {
        num.getClass();
        pjyVar.m172558g4(num.intValue());
    }

    /* JADX INFO: renamed from: U3 */
    public static void m172544U3(pjy pjyVar, Integer num) {
        num.getClass();
        pjyVar.m172560k4(num.intValue());
    }

    /* JADX INFO: renamed from: V3 */
    public static void m172545V3(int i, uwl uwlVar) {
        if (uwlVar instanceof djy) {
            djy djyVar = (djy) uwlVar;
            if (djyVar.mo104942T3() == i) {
                djyVar.mo104944V3();
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static void m172546W3(pjy pjyVar, Throwable th) {
        pjyVar.m172559h4(0, null);
    }

    /* JADX INFO: renamed from: X3 */
    public static int m172547X3(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m172548Y3(pjy pjyVar, int i, BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter) {
        if (bLiveVoiceAdminPanelCounter.applyCallRedDot > 0) {
            if (i < 0) {
                i = 3;
            }
            pjyVar.m172559h4(i, bLiveVoiceAdminPanelCounter);
        } else {
            if (bLiveVoiceAdminPanelCounter.applySettleRedDot <= 0) {
                pjyVar.m172559h4(0, bLiveVoiceAdminPanelCounter);
                return;
            }
            if (i < 0) {
                i = 2;
            }
            pjyVar.m172559h4(i, bLiveVoiceAdminPanelCounter);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m172549Z3(pjy pjyVar, Integer num) {
        cjy cjyVar = (cjy) pjyVar.viewModel;
        num.getClass();
        cjyVar.m110297M(num.intValue(), true);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m172550a4(ArrayList arrayList, uwl uwlVar) {
        if (uwlVar instanceof djy) {
            arrayList.add(((djy) uwlVar).mo104941S3());
        }
    }

    /* JADX INFO: renamed from: b4 */
    public static void m172551b4(pjy pjyVar, Integer num) {
        cjy cjyVar = (cjy) pjyVar.viewModel;
        num.getClass();
        cjyVar.m110297M(num.intValue(), false);
    }

    /* JADX INFO: renamed from: c4 */
    public static int m172552c4(sjy sjyVar, sjy sjyVar2) {
        sjyVar.getClass();
        sjyVar2.getClass();
        return sjyVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() - sjyVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
    }

    /* JADX INFO: renamed from: i4 */
    private final void m172553i4(final int state) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.njy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172545V3(state, (uwl) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    private final void m172554j4(final int defaultIndex) {
        hny<?, ?> hnyVar = this.settlePresenter;
        if (hnyVar != null) {
            hnyVar.m136288j4(false);
        }
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.adminCounter(strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.ojy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172548Y3(this.f147722a, defaultIndex, (BLiveVoiceAdminPanelCounter) obj);
            }
        }, new y20() { // from class: l.fjy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172546W3(this.f99441a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        dum<? extends T> dumVar = this.f196918e;
        m153103z2(new bly(dumVar, new cly(dumVar.f90815a)));
        dum<? extends T> dumVar2 = this.f196918e;
        this.settlePresenter = (hny) m153103z2(new hny(dumVar2, new any(dumVar2.f90815a)));
        dum<? extends T> dumVar3 = this.f196918e;
        m153103z2(new tmy(dumVar3, new mmy(dumVar3.f90815a)));
        dum<? extends T> dumVar4 = this.f196918e;
        m153103z2(new lmy(dumVar4, new ply(dumVar4.f90815a)));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().MemberManagerEvent.showMemberManagerDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ejy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172542S3(this.f94328a, (Integer) obj);
            }
        }));
        duringCreated(m213811F2().MemberManagerEvent.showMemberManagerDialogForce().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.gjy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172544U3(this.f104694a, (Integer) obj);
            }
        }));
        duringCreated(m213811F2().MemberManagerEvent.showMemberManagerDialogWithOnePage().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.hjy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172543T3(this.f110344a, (Integer) obj);
            }
        }));
        duringCreated(m213811F2().MemberManagerEvent.clearTabRedPoint().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ijy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172551b4(this.f115308a, (Integer) obj);
            }
        }));
        duringCreated(m213811F2().MemberManagerEvent.addTabRedPoint().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.jjy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172549Z3(this.f121254a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public final String m172555d4() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        strM207631D0.getClass();
        if (i9o0.m139143o(strM207631D0, this)) {
            return "anchor";
        }
        if (i9o0.m139137h(this)) {
            return "manager";
        }
        return ((Boolean) m138856F3(new u3m0(strM207631D0))).booleanValue() ? "member" : "passerby";
    }

    @NotNull
    /* JADX INFO: renamed from: e4 */
    public final List<sjy> m172556e4() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.kjy
            @Override // p153l.y20
            public final void call(Object obj) {
                pjy.m172550a4(arrayList, (uwl) obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: l.ljy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(pjy.m172552c4((sjy) obj, (sjy) obj2));
            }
        };
        jyb.m147478I(arrayList, new Comparator() { // from class: l.mjy
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pjy.m172547X3(function2, obj, obj2);
            }
        });
        return CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final void m172557f4(int menuType) {
        String str = ((rwn0) m213810E2()).m168532l0().f56859id;
        str.getClass();
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        eky.m121091d(menuType, str, strM202191k, m172555d4());
        m172553i4(menuType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m172558g4(int onePage) {
        hny<?, ?> hnyVar = this.settlePresenter;
        if (hnyVar != null) {
            hnyVar.m136288j4(true);
        }
        String strM168526j0 = ((rwn0) m213810E2()).m168526j0();
        strM168526j0.getClass();
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        eky.m121093f(strM168526j0, strM202191k, m172555d4());
        ((cjy) this.viewModel).m110305V(onePage, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m172559h4(int index, BLiveVoiceAdminPanelCounter count) {
        String strM168526j0 = ((rwn0) m213810E2()).m168526j0();
        strM168526j0.getClass();
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        eky.m121090c(strM168526j0, strM202191k, m172555d4());
        String str = ((rwn0) m213810E2()).m168532l0().f56859id;
        str.getClass();
        String strM202191k2 = ((rwn0) m213810E2()).m202191k();
        strM202191k2.getClass();
        eky.m121091d(index, str, strM202191k2, m172555d4());
        ((cjy) this.viewModel).m110305V(index, false, count);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m172560k4(int index) {
        hny<?, ?> hnyVar = this.settlePresenter;
        if (hnyVar != null) {
            hnyVar.m136288j4(false);
        }
        m172559h4(index, null);
    }
}
