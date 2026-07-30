package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bwr;
import l.e30;
import l.ffw;
import l.o3n0;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ll/lgc0;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "Ll/bsm;", "info", "giftUsersView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;)V", "", "t", "()V", "Ll/mlj;", "giftCallInfo", "", "giftBriefExtraType", "T3", "(Ll/mlj;Ljava/lang/String;)V", "Ll/o3n0;", "changeInfo", "S3", "(Ll/o3n0;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class lgc0 extends h4t<ho2, ReceiveGiftUsersView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgc0(@Nullable bsm<?> bsmVar, @NotNull ReceiveGiftUsersView receiveGiftUsersView) {
        super(bsmVar);
        receiveGiftUsersView.getClass();
        C(receiveGiftUsersView);
    }

    /* JADX INFO: renamed from: J3 */
    public static List m17217J3(lgc0 lgc0Var, qee0 qee0Var) {
        List<tfc0> currentDataList = ((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).getCurrentDataList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentDataList, 10));
        Iterator<T> it = currentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(((tfc0) it.next()).getCallInfo());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((mlj) obj).m18008h()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m17218K3(lgc0 lgc0Var, mtj mtjVar) {
        if (((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).m7547Y()) {
            ((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).m7546X(mtjVar.getIsPacketPanel());
            xdl0.M(((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).get_all(), !mtjVar.getIsPacketPanel());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: L3 */
    public static Boolean m17219L3(lgc0 lgc0Var, mtj mtjVar) {
        return Boolean.valueOf(lgc0Var.m25547E2().m14588n0().isVoiceLive());
    }

    /* JADX INFO: renamed from: M3 */
    public static void m17220M3(lgc0 lgc0Var, Boolean bool) {
        ((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).m7551c0(false);
        ((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).m7549a0();
    }

    /* JADX INFO: renamed from: N3 */
    public static Boolean m17221N3(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m17222O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m17223P3(lgc0 lgc0Var, o3n0 o3n0Var) {
        if (((ReceiveGiftUsersView) ((bwr) lgc0Var).viewModel).m7547Y()) {
            lgc0Var.m17225S3(o3n0Var);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m17224R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m17225S3(o3n0 changeInfo) {
        List<? extends mlj> listA;
        Object next;
        if (changeInfo == null || (listA = changeInfo.a()) == null) {
            return;
        }
        List<tfc0> currentDataList = ((ReceiveGiftUsersView) ((bwr) this).viewModel).getCurrentDataList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentDataList, 10));
        Iterator<T> it = currentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(((tfc0) it.next()).getCallInfo());
        }
        List<? extends mlj> list = listA;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((mlj) it2.next()).m18004d());
        }
        List listSorted = CollectionsKt.sorted(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((mlj) it3.next()).m18004d());
        }
        List listSorted2 = CollectionsKt.sorted(arrayList3);
        if (listSorted.size() == listSorted2.size() && listSorted2.containsAll(listSorted)) {
            return;
        }
        for (mlj mljVar : list) {
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!((mlj) next).m18007g(mljVar));
            mlj mljVar2 = (mlj) next;
            if (mljVar2 != null) {
                mljVar.m18010j(mljVar2.m18008h());
            }
        }
        ((ReceiveGiftUsersView) ((bwr) this).viewModel).m7553e0(listA);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m17226T3(@NotNull mlj giftCallInfo, @Nullable String giftBriefExtraType) {
        giftCallInfo.getClass();
        m25548F2().GiftDialogEventGroup.switchGiftDialogSourceEvent().j(new fp50().m13445i(700).m13446j(giftCallInfo.f15448g).m13444h(new mnj.C0680a().m18101e(giftCallInfo, giftBriefExtraType).m18100d()));
    }

    /* JADX INFO: renamed from: t */
    public void m17227t() {
        super.t();
        duringCreated((c) m25548F2().GiftDialogEventGroup.onVoiceDeputyChange().g()).subscribe(ffw.h(new e30() { // from class: l.dgc0
            public final void call(Object obj) {
                lgc0.m17223P3(this.f9213a, (o3n0) obj);
            }
        }));
        c cVarDuringCreated = duringCreated((c) m25548F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().g());
        final Function1 function1 = new Function1() { // from class: l.egc0
            public final Object invoke(Object obj) {
                return lgc0.m17219L3(this.f9749a, (mtj) obj);
            }
        };
        cVarDuringCreated.filter(new w9j() { // from class: l.fgc0
            public final Object call(Object obj) {
                return lgc0.m17222O3(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.ggc0
            public final void call(Object obj) {
                lgc0.m17218K3(this.f11403a, (mtj) obj);
            }
        }));
        c cVarDuringCreated2 = duringCreated((c) m25548F2().GiftDialogEventGroup.giftDialogStatus().g());
        final Function1 function2 = new Function1() { // from class: l.hgc0
            public final Object invoke(Object obj) {
                return lgc0.m17221N3((Boolean) obj);
            }
        };
        cVarDuringCreated2.filter(new w9j() { // from class: l.igc0
            public final Object call(Object obj) {
                return lgc0.m17224R3(function2, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.jgc0
            public final void call(Object obj) {
                lgc0.m17220M3(this.f13762a, (Boolean) obj);
            }
        }));
        m14188d3(qee0.class, new w9j() { // from class: l.kgc0
            public final Object call(Object obj) {
                return lgc0.m17217J3(this.f14319a, (qee0) obj);
            }
        });
    }
}
