package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceShareItems;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/upn;", "Ll/x6s;", "Ll/ho2;", "Ll/ppn;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "bLiveEnvelope", "", "a4", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "Z3", "()V", "", "", "userIdList", "Y3", "(Ljava/util/List;)V", "W3", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceShareItems;", "shareItemsList", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "masks", "Ll/mfn;", "X3", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class upn extends x6s<ho2, ppn> {
    public upn(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m194891S3(upn upnVar, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f47418nj);
        ((ppn) upnVar.viewModel).m170752N();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m194892T3(Throwable th) {
        xtr.m211023c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m194893U3(upn upnVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            upnVar.m194895a4(bLiveEnvelope);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static void m194894V3(upn upnVar, Throwable th) {
        ((ppn) upnVar.viewModel).m170754R();
    }

    /* JADX INFO: renamed from: a4 */
    private final void m194895a4(BLiveEnvelope bLiveEnvelope) {
        ppn ppnVar = (ppn) this.viewModel;
        BLiveData bLiveData = bLiveEnvelope.data;
        ppnVar.m170755U(m194897X3(bLiveData.shareItems, bLiveData.masks));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final void m194896W3() {
        C22306c c22306cDuringCreated;
        if (this.viewModel == 0) {
            Act act = this.f188512e.f77095a;
            act.getClass();
            ppn ppnVar = new ppn(act, this);
            this.viewModel = ppnVar;
            mo51532C(ppnVar);
        }
        ((ppn) this.viewModel).m170753Q();
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        if (M206027E2.m132112Z0()) {
            ?? M206027E3 = m206027E2();
            M206027E3.getClass();
            c22306cDuringCreated = duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(M206027E3.m149818o()));
        } else {
            ?? M206027E4 = m206027E2();
            M206027E4.getClass();
            c22306cDuringCreated = duringCreated(k9o.m145109i(M206027E4.m149818o()));
        }
        c22306cDuringCreated.subscribe(ffw.m121194e(new e30() { // from class: l.qpn
            @Override // p149l.e30
            public final void call(Object obj) {
                upn.m194893U3(this.f155782a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rpn
            @Override // p149l.e30
            public final void call(Object obj) {
                upn.m194894V3(this.f160524a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final List<mfn> m194897X3(List<BLiveVoiceShareItems> shareItemsList, List<BLiveUserMask> masks) {
        List<BLiveUserMask> list;
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceShareItems> list2 = shareItemsList;
        if (list2 != null && !list2.isEmpty() && (list = masks) != null && !list.isEmpty()) {
            for (BLiveVoiceShareItems bLiveVoiceShareItems : shareItemsList) {
                for (BLiveUserMask bLiveUserMask : masks) {
                    if (Intrinsics.m87488d(bLiveVoiceShareItems.f44509id, bLiveUserMask.userId)) {
                        arrayList.add(new mfn(bLiveUserMask, false, bLiveVoiceShareItems.isOnline));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Y3 */
    public final void m194898Y3(@NotNull List<String> userIdList) {
        C22306c c22306cDuringCreated;
        userIdList.getClass();
        if (userIdList.isEmpty() || m206027E2() == 0) {
            return;
        }
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        if (M206027E2.m132112Z0()) {
            ?? M206027E3 = m206027E2();
            M206027E3.getClass();
            c22306cDuringCreated = duringCreated(VoiceRoomApiProvider.postSelectedShareItem(M206027E3.m149818o(), userIdList));
        } else {
            ?? M206027E4 = m206027E2();
            M206027E4.getClass();
            c22306cDuringCreated = duringCreated(k9o.m145111k(M206027E4.m149818o(), userIdList));
        }
        c22306cDuringCreated.subscribe(ffw.m121194e(new e30() { // from class: l.spn
            @Override // p149l.e30
            public final void call(Object obj) {
                upn.m194891S3(this.f165871a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.tpn
            @Override // p149l.e30
            public final void call(Object obj) {
                upn.m194892T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m194899Z3() {
        m194896W3();
    }
}
