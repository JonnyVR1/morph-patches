package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoiceShareItems;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.ho2;
import l.k9o;
import l.lsi0;
import l.wxs;
import l.x6s;
import l.xtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll/upn;", "Ll/x6s;", "Ll/ho2;", "Ll/ppn;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "bLiveEnvelope", "", "a4", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "Z3", "()V", "", "", "userIdList", "Y3", "(Ljava/util/List;)V", "W3", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceShareItems;", "shareItemsList", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "masks", "Ll/mfn;", "X3", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class upn extends x6s<ho2, ppn> {
    public upn(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m23115S3(upn upnVar, BLiveEnvelope bLiveEnvelope) {
        lsi0.w(R.string.nj);
        ((bwr) upnVar).viewModel.m20558N();
    }

    /* JADX INFO: renamed from: T3 */
    public static void m23116T3(Throwable th) {
        xtr.c(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m23117U3(upn upnVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            upnVar.m23119a4(bLiveEnvelope);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static void m23118V3(upn upnVar, Throwable th) {
        ((bwr) upnVar).viewModel.m20560R();
    }

    /* JADX INFO: renamed from: a4 */
    private final void m23119a4(BLiveEnvelope bLiveEnvelope) {
        ppn ppnVar = ((bwr) this).viewModel;
        BLiveData bLiveData = bLiveEnvelope.data;
        ppnVar.m20561U(m23121X3(bLiveData.shareItems, bLiveData.masks));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m23120W3() {
        c cVarDuringCreated;
        if (((bwr) this).viewModel == null) {
            Act act = ((wxs) this).e.a;
            act.getClass();
            ppn ppnVar = new ppn(act, this);
            ((bwr) this).viewModel = ppnVar;
            C(ppnVar);
        }
        ((bwr) this).viewModel.m20559Q();
        ho2 ho2VarE2 = E2();
        ho2VarE2.getClass();
        if (ho2VarE2.Z0()) {
            ho2 ho2VarE3 = E2();
            ho2VarE3.getClass();
            cVarDuringCreated = duringCreated(VoiceRoomApiProvider.getVoiceRoomShareList(ho2VarE3.o()));
        } else {
            ho2 ho2VarE4 = E2();
            ho2VarE4.getClass();
            cVarDuringCreated = duringCreated(k9o.i(ho2VarE4.o()));
        }
        cVarDuringCreated.subscribe(ffw.e(new e30() { // from class: l.qpn
            public final void call(Object obj) {
                upn.m23117U3(this.f19433a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rpn
            public final void call(Object obj) {
                upn.m23118V3(this.f19942a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final List<mfn> m23121X3(List<BLiveVoiceShareItems> shareItemsList, List<BLiveUserMask> masks) {
        List<BLiveUserMask> list;
        ArrayList arrayList = new ArrayList();
        List<BLiveVoiceShareItems> list2 = shareItemsList;
        if (list2 != null && !list2.isEmpty() && (list = masks) != null && !list.isEmpty()) {
            for (BLiveVoiceShareItems bLiveVoiceShareItems : shareItemsList) {
                for (BLiveUserMask bLiveUserMask : masks) {
                    if (Intrinsics.d(bLiveVoiceShareItems.id, bLiveUserMask.userId)) {
                        arrayList.add(new mfn(bLiveUserMask, false, bLiveVoiceShareItems.isOnline));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m23122Y3(@NotNull List<String> userIdList) {
        c cVarDuringCreated;
        userIdList.getClass();
        if (userIdList.isEmpty() || E2() == null) {
            return;
        }
        ho2 ho2VarE2 = E2();
        ho2VarE2.getClass();
        if (ho2VarE2.Z0()) {
            ho2 ho2VarE3 = E2();
            ho2VarE3.getClass();
            cVarDuringCreated = duringCreated(VoiceRoomApiProvider.postSelectedShareItem(ho2VarE3.o(), userIdList));
        } else {
            ho2 ho2VarE4 = E2();
            ho2VarE4.getClass();
            cVarDuringCreated = duringCreated(k9o.k(ho2VarE4.o(), userIdList));
        }
        cVarDuringCreated.subscribe(ffw.e(new e30() { // from class: l.spn
            public final void call(Object obj) {
                upn.m23115S3(this.f20414a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.tpn
            public final void call(Object obj) {
                upn.m23116T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m23123Z3() {
        m23120W3();
    }
}
