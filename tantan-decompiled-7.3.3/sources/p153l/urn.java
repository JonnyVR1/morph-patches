package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceShareItems;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/urn;", "Ll/y8s;", "Ll/oo2;", "Ll/prn;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "bLiveEnvelope", "", "a4", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "Z3", "()V", "", "", "userIdList", "Y3", "(Ljava/util/List;)V", "W3", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceShareItems;", "shareItemsList", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "masks", "Ll/mhn;", "X3", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class urn extends y8s<oo2, prn> {
    public urn(@Nullable dum<?> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m197630S3(urn urnVar, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f48266nj);
        ((prn) urnVar.viewModel).m173518N();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m197631T3(Throwable th) {
        yvr.m217557c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m197632U3(urn urnVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            urnVar.m197634a4(bLiveEnvelope);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static void m197633V3(urn urnVar, Throwable th) {
        ((prn) urnVar.viewModel).m173520R();
    }

    /* JADX INFO: renamed from: a4 */
    private final void m197634a4(BLiveEnvelope bLiveEnvelope) {
        prn prnVar = (prn) this.viewModel;
        BLiveData bLiveData = bLiveEnvelope.data;
        prnVar.m173521U(m197636X3(bLiveData.shareItems, bLiveData.masks));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    public final void m197635W3() {
        C22421c c22421cDuringCreated;
        if (this.viewModel == 0) {
            Act act = this.f196918e.f90815a;
            act.getClass();
            prn prnVar = new prn(act, this);
            this.viewModel = prnVar;
            mo52715C(prnVar);
        }
        ((prn) this.viewModel).m173519Q();
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        if (M213810E2.m168498Z0()) {
            ?? M213810E3 = m213810E2();
            M213810E3.getClass();
            c22421cDuringCreated = duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(M213810E3.m202194o()));
        } else {
            ?? M213810E4 = m213810E2();
            M213810E4.getClass();
            c22421cDuringCreated = duringCreated(kbo.m149072i(M213810E4.m202194o()));
        }
        c22421cDuringCreated.subscribe(dhw.m115826e(new y20() { // from class: l.qrn
            @Override // p153l.y20
            public final void call(Object obj) {
                urn.m197632U3(this.f159154a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.rrn
            @Override // p153l.y20
            public final void call(Object obj) {
                urn.m197633V3(this.f164588a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final List<mhn> m197636X3(List<BLiveVoiceShareItems> shareItemsList, List<BLiveUserMask> masks) {
        List<BLiveUserMask> list;
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceShareItems> list2 = shareItemsList;
        if (list2 != null && !list2.isEmpty() && (list = masks) != null && !list.isEmpty()) {
            for (BLiveVoiceShareItems bLiveVoiceShareItems : shareItemsList) {
                for (BLiveUserMask bLiveUserMask : masks) {
                    if (Intrinsics.m88377d(bLiveVoiceShareItems.f45357id, bLiveUserMask.userId)) {
                        arrayList.add(new mhn(bLiveUserMask, false, bLiveVoiceShareItems.isOnline));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Y3 */
    public final void m197637Y3(@NotNull List<String> userIdList) {
        C22421c c22421cDuringCreated;
        userIdList.getClass();
        if (userIdList.isEmpty() || m213810E2() == 0) {
            return;
        }
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        if (M213810E2.m168498Z0()) {
            ?? M213810E3 = m213810E2();
            M213810E3.getClass();
            c22421cDuringCreated = duringCreated(VoiceRoomApiProvider.postSelectedShareItem(M213810E3.m202194o(), userIdList));
        } else {
            ?? M213810E4 = m213810E2();
            M213810E4.getClass();
            c22421cDuringCreated = duringCreated(kbo.m149074k(M213810E4.m202194o(), userIdList));
        }
        c22421cDuringCreated.subscribe(dhw.m115826e(new y20() { // from class: l.srn
            @Override // p153l.y20
            public final void call(Object obj) {
                urn.m197630S3(this.f170359a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.trn
            @Override // p153l.y20
            public final void call(Object obj) {
                urn.m197631T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m197638Z3() {
        m197635W3();
    }
}
