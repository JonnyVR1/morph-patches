package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.receivegift.ReceiveGiftUsersView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Ll/lgc0;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;", "Ll/bsm;", BaseSei.INFO, "giftUsersView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/increment/gift/receivegift/ReceiveGiftUsersView;)V", "", Constants.KEY_T, "()V", "Ll/mlj;", "giftCallInfo", "", "giftBriefExtraType", "T3", "(Ll/mlj;Ljava/lang/String;)V", "Ll/o3n0;", "changeInfo", "S3", "(Ll/o3n0;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class lgc0 extends h4t<ho2, ReceiveGiftUsersView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgc0(@Nullable bsm<?> bsmVar, @NotNull ReceiveGiftUsersView receiveGiftUsersView) {
        super(bsmVar);
        receiveGiftUsersView.getClass();
        mo51532C(receiveGiftUsersView);
    }

    /* JADX INFO: renamed from: J3 */
    public static List m149763J3(lgc0 lgc0Var, qee0 qee0Var) {
        List<tfc0> currentDataList = ((ReceiveGiftUsersView) lgc0Var.viewModel).getCurrentDataList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentDataList, 10));
        Iterator<T> it = currentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(((tfc0) it.next()).getCallInfo());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((mlj) obj).m155159h()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: K3 */
    public static void m149764K3(lgc0 lgc0Var, mtj mtjVar) {
        if (((ReceiveGiftUsersView) lgc0Var.viewModel).m73987Y()) {
            ((ReceiveGiftUsersView) lgc0Var.viewModel).m73986X(mtjVar.getIsPacketPanel());
            xdl0.m208344M(((ReceiveGiftUsersView) lgc0Var.viewModel).get_all(), !mtjVar.getIsPacketPanel());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: L3 */
    public static Boolean m149765L3(lgc0 lgc0Var, mtj mtjVar) {
        return Boolean.valueOf(lgc0Var.m206027E2().m132152n0().isVoiceLive());
    }

    /* JADX INFO: renamed from: M3 */
    public static void m149766M3(lgc0 lgc0Var, Boolean bool) {
        ((ReceiveGiftUsersView) lgc0Var.viewModel).m73991c0(false);
        ((ReceiveGiftUsersView) lgc0Var.viewModel).m73989a0();
    }

    /* JADX INFO: renamed from: N3 */
    public static Boolean m149767N3(Boolean bool) {
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m149768O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m149769P3(lgc0 lgc0Var, o3n0 o3n0Var) {
        if (((ReceiveGiftUsersView) lgc0Var.viewModel).m73987Y()) {
            lgc0Var.m149771S3(o3n0Var);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m149770R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m149771S3(o3n0 changeInfo) {
        List<mlj> listM162458a;
        Object next;
        if (changeInfo == null || (listM162458a = changeInfo.m162458a()) == null) {
            return;
        }
        List<tfc0> currentDataList = ((ReceiveGiftUsersView) this.viewModel).getCurrentDataList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentDataList, 10));
        Iterator<T> it = currentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(((tfc0) it.next()).getCallInfo());
        }
        List<mlj> list = listM162458a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((mlj) it2.next()).m155155d());
        }
        List listSorted = CollectionsKt.sorted(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((mlj) it3.next()).m155155d());
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
            } while (!((mlj) next).m155158g(mljVar));
            mlj mljVar2 = (mlj) next;
            if (mljVar2 != null) {
                mljVar.m155161j(mljVar2.m155159h());
            }
        }
        ((ReceiveGiftUsersView) this.viewModel).m73993e0(listM162458a);
    }

    /* JADX INFO: renamed from: T3 */
    public final void m149772T3(@NotNull mlj giftCallInfo, @Nullable String giftBriefExtraType) {
        giftCallInfo.getClass();
        m206028F2().GiftDialogEventGroup.switchGiftDialogSourceEvent().mo172463j(new fp50().m122565i(700).m122566j(giftCallInfo.f134446g).m122564h(new mnj.C18509a().m155524e(giftCallInfo, giftBriefExtraType).m155523d()));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().GiftDialogEventGroup.onVoiceDeputyChange().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.dgc0
            @Override // p149l.e30
            public final void call(Object obj) {
                lgc0.m149769P3(this.f86071a, (o3n0) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(m206028F2().GiftDialogEventGroup.onGiftDialogPanelSwitchChange().m172460g());
        final Function1 function1 = new Function1() { // from class: l.egc0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lgc0.m149765L3(this.f90922a, (mtj) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.fgc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lgc0.m149768O3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ggc0
            @Override // p149l.e30
            public final void call(Object obj) {
                lgc0.m149764K3(this.f102489a, (mtj) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(m206028F2().GiftDialogEventGroup.giftDialogStatus().m172460g());
        final Function1 function2 = new Function1() { // from class: l.hgc0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lgc0.m149767N3((Boolean) obj);
            }
        };
        c22306cDuringCreated2.filter(new w9j() { // from class: l.igc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lgc0.m149770R3(function2, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.jgc0
            @Override // p149l.e30
            public final void call(Object obj) {
                lgc0.m149766M3(this.f117770a, (Boolean) obj);
            }
        }));
        m129301d3(qee0.class, new w9j() { // from class: l.kgc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return lgc0.m149763J3(this.f123022a, (qee0) obj);
            }
        });
    }
}
