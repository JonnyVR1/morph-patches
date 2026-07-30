package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/soc0;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "Ll/dum;", BaseSei.INFO, "giftUsersView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;)V", "", Constants.KEY_T, "()V", "Ll/coj;", "giftCallInfo", "", "giftBriefExtraType", "T3", "(Ll/coj;Ljava/lang/String;)V", "Ll/scn0;", "changeInfo", "S3", "(Ll/scn0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class soc0 extends i6t<oo2, ReceiveGiftUsersView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soc0(@Nullable dum<?> dumVar, @NotNull ReceiveGiftUsersView receiveGiftUsersView) {
        super(dumVar);
        receiveGiftUsersView.getClass();
        mo52715C(receiveGiftUsersView);
    }

    /* JADX INFO: renamed from: J3 */
    public static List m187179J3(soc0 soc0Var, vme0 vme0Var) {
        List<aoc0> currentDataList = ((ReceiveGiftUsersView) soc0Var.viewModel).getCurrentDataList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentDataList, 10));
        Iterator<T> it = currentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(((aoc0) it.next()).getCallInfo());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((coj) obj).m111666h()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m187180K3(soc0 soc0Var, cwj cwjVar) {
        if (((ReceiveGiftUsersView) soc0Var.viewModel).m75170Y()) {
            ((ReceiveGiftUsersView) soc0Var.viewModel).m75169X(cwjVar.getIsPacketPanel());
            bnl0.m105524M(((ReceiveGiftUsersView) soc0Var.viewModel).get_all(), !cwjVar.getIsPacketPanel());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: L3 */
    public static Boolean m187181L3(soc0 soc0Var, cwj cwjVar) {
        return Boolean.valueOf(soc0Var.m213810E2().m168538n0().isVoiceLive());
    }

    /* JADX INFO: renamed from: M3 */
    public static void m187182M3(soc0 soc0Var, Boolean bool) {
        ((ReceiveGiftUsersView) soc0Var.viewModel).m75174c0(false);
        ((ReceiveGiftUsersView) soc0Var.viewModel).m75172a0();
    }

    /* JADX INFO: renamed from: N3 */
    public static Boolean m187183N3(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m187184O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m187185P3(soc0 soc0Var, scn0 scn0Var) {
        if (((ReceiveGiftUsersView) soc0Var.viewModel).m75170Y()) {
            soc0Var.m187187S3(scn0Var);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m187186R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m187187S3(scn0 changeInfo) {
        List<coj> listM185378a;
        Object next;
        if (changeInfo == null || (listM185378a = changeInfo.m185378a()) == null) {
            return;
        }
        List<aoc0> currentDataList = ((ReceiveGiftUsersView) this.viewModel).getCurrentDataList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentDataList, 10));
        Iterator<T> it = currentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(((aoc0) it.next()).getCallInfo());
        }
        List<coj> list = listM185378a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((coj) it2.next()).m111662d());
        }
        List listSorted = CollectionsKt.sorted(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((coj) it3.next()).m111662d());
        }
        List listSorted2 = CollectionsKt.sorted(arrayList3);
        if (listSorted.size() == listSorted2.size() && listSorted2.containsAll(listSorted)) {
            return;
        }
        for (coj cojVar : list) {
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!((coj) next).m111665g(cojVar));
            coj cojVar2 = (coj) next;
            if (cojVar2 != null) {
                cojVar.m111668j(cojVar2.m111666h());
            }
        }
        ((ReceiveGiftUsersView) this.viewModel).m75176e0(listM185378a);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m187188T3(@NotNull coj giftCallInfo, @Nullable String giftBriefExtraType) {
        giftCallInfo.getClass();
        m213811F2().GiftDialogEventGroup.switchGiftDialogSourceEvent().mo199273j(new lx50().m156159i(700).m156160j(giftCallInfo.f82891g).m156158h(new cqj.C16337a().m111924e(giftCallInfo, giftBriefExtraType).m111923d()));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().GiftDialogEventGroup.onVoiceDeputyChange().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.koc0
            @Override // p153l.y20
            public final void call(Object obj) {
                soc0.m187185P3(this.f127713a, (scn0) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(m213811F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().m199270g());
        final Function1 function1 = new Function1() { // from class: l.loc0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return soc0.m187181L3(this.f132893a, (cwj) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.moc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return soc0.m187184O3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.noc0
            @Override // p153l.y20
            public final void call(Object obj) {
                soc0.m187180K3(this.f142974a, (cwj) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(m213811F2().GiftDialogEventGroup.giftDialogStatus().m199270g());
        final Function1 function2 = new Function1() { // from class: l.ooc0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return soc0.m187183N3((Boolean) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.poc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return soc0.m187186R3(function2, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.qoc0
            @Override // p153l.y20
            public final void call(Object obj) {
                soc0.m187182M3(this.f158718a, (Boolean) obj);
            }
        }));
        m138860d3(vme0.class, new qcj() { // from class: l.roc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return soc0.m187179J3(this.f164170a, (vme0) obj);
            }
        });
    }
}
