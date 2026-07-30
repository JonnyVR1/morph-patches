package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.AuctionState;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001b¨\u0006 "}, m87232d2 = {"Ll/y1v;", "Ll/nnn0;", "D", "Ll/xfm0;", "Ll/bgm0;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bsm;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", OMSTemplateModeType.view, "<init>", "(Ljava/lang/String;Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;)V", "", "K3", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "infoList", "", "b4", "(Ljava/util/List;)Ljava/util/List;", "type", "queueInfo", "f4", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;)V", "e4", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;)V", "g4", "Z3", "a4", "Y3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class y1v<D extends nnn0> extends xfm0<bgm0, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1v(@NotNull String str, @NotNull bsm<D> bsmVar, @NotNull LiveVoiceAuctionListPage liveVoiceAuctionListPage) {
        super(str, bsmVar, liveVoiceAuctionListPage);
        str.getClass();
        bsmVar.getClass();
        liveVoiceAuctionListPage.getClass();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m212294L3(y1v y1vVar, BLiveEnvelope bLiveEnvelope) {
        y1vVar.mo203070K3();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m212295M3(y1v y1vVar, Throwable th) {
        ((LiveVoiceAuctionListPage) y1vVar.viewModel).m77863l0(y1vVar.getName(), true);
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m212297O3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m212298P3(y1v y1vVar, BLiveEnvelope bLiveEnvelope) {
        y1vVar.mo203070K3();
    }

    /* JADX INFO: renamed from: R3 */
    public static void m212299R3(y1v y1vVar, List list) {
        y1vVar.mo203070K3();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S3 */
    public static void m212300S3(y1v y1vVar, List list) throws JSONException {
        if (Intrinsics.m87488d("apply", y1vVar.getName()) && !vwb.m200296J(list)) {
            String strM149818o = y1vVar.m206027E2().m149818o();
            strM149818o.getClass();
            BLiveAuctionQueueInfo bLiveAuctionQueueInfo = (BLiveAuctionQueueInfo) list.get(0);
            p61.m167538a0(strM149818o, bLiveAuctionQueueInfo != null ? bLiveAuctionQueueInfo.f44333id : null);
        }
        LiveVoiceAuctionListPage liveVoiceAuctionListPage = (LiveVoiceAuctionListPage) y1vVar.viewModel;
        String name = y1vVar.getName();
        list.getClass();
        liveVoiceAuctionListPage.m77862k0(name, y1vVar.m212311b4(list));
    }

    /* JADX INFO: renamed from: T3 */
    public static void m212301T3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m212303V3(y1v y1vVar, Meta meta) {
        y1vVar.mo203070K3();
    }

    /* JADX INFO: renamed from: W3 */
    public static void m212304W3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m212305X3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m212306c4(y1v y1vVar, String str, BLiveAuctionQueueInfo bLiveAuctionQueueInfo) {
        str.getClass();
        bLiveAuctionQueueInfo.getClass();
        y1vVar.m212313f4(str, bLiveAuctionQueueInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.xfm0
    /* JADX INFO: renamed from: K3 */
    public void mo203070K3() {
        C22306c c22306cM167573T;
        if (Intrinsics.m87488d("apply", getName())) {
            p61 p61Var = p61.INSTANCE;
            String strM149818o = m206027E2().m149818o();
            strM149818o.getClass();
            c22306cM167573T = p61Var.m167571R(strM149818o);
        } else if (Intrinsics.m87488d("invite", getName())) {
            p61 p61Var2 = p61.INSTANCE;
            String strM149818o2 = m206027E2().m149818o();
            strM149818o2.getClass();
            c22306cM167573T = p61Var2.m167574U(strM149818o2);
        } else {
            p61 p61Var3 = p61.INSTANCE;
            String strM149818o3 = m206027E2().m149818o();
            strM149818o3.getClass();
            c22306cM167573T = p61Var3.m167573T(strM149818o3);
        }
        duringCreated(c22306cM167573T).subscribe(ffw.m121194e(new e30() { // from class: l.m1v
            @Override // p149l.e30
            public final void call(Object obj) throws JSONException {
                y1v.m212300S3(this.f130856a, (List) obj);
            }
        }, new e30() { // from class: l.p1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212295M3(this.f146774a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m212308Y3(BLiveAuctionQueueInfo queueInfo) {
        p61 p61Var = p61.INSTANCE;
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String str = queueInfo.f44333id;
        str.getClass();
        duringCreated(p61Var.m167570O(strM149818o, str)).subscribe(ffw.m121194e(new e30() { // from class: l.w1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212299R3(this.f184062a, (List) obj);
            }
        }, new e30() { // from class: l.x1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212305X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m212309Z3(BLiveAuctionQueueInfo queueInfo) {
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String str = queueInfo.f44333id;
        str.getClass();
        duringCreated(p61.m167530M(strM149818o, str)).subscribe(ffw.m121194e(new e30() { // from class: l.n1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212298P3(this.f136727a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.o1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212304W3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m212310a4() {
        m206028F2().VoiceAuctionEvent.openRelationSettingsDlg().mo172463j("");
        m206028F2().VoiceAuctionEvent.openAuctionQueueDlg().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b4 */
    public final List<bgm0> m212311b4(List<? extends BLiveAuctionQueueInfo> infoList) {
        ArrayList arrayList = new ArrayList();
        for (BLiveAuctionQueueInfo bLiveAuctionQueueInfo : infoList) {
            e0o0 e0o0Var = e0o0.INSTANCE;
            String str = bLiveAuctionQueueInfo.userInfo.userId;
            str.getClass();
            bLiveAuctionQueueInfo.role = e0o0Var.m114332k(this, str);
            arrayList.add(new bgm0(getName(), bLiveAuctionQueueInfo, new f30() { // from class: l.q1v
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    y1v.m212306c4(this.f152171a, (String) obj, (BLiveAuctionQueueInfo) obj2);
                }
            }, new e30() { // from class: l.r1v
                @Override // p149l.e30
                public final void call(Object obj) {
                    y1v.m212307d4((String) obj);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m212312e4(BLiveAuctionQueueInfo queueInfo) {
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String str = queueInfo.userInfo.userId;
        str.getClass();
        duringCreated(p61.m167536Z(strM149818o, str)).subscribe(ffw.m121194e(new e30() { // from class: l.u1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212303V3(this.f173048a, (Meta) obj);
            }
        }, new e30() { // from class: l.v1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212301T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m212313f4(String type, BLiveAuctionQueueInfo queueInfo) {
        if (Intrinsics.m87488d("reject", type)) {
            m212314g4(queueInfo);
            return;
        }
        if (Intrinsics.m87488d("accept", type)) {
            m212309Z3(queueInfo);
            return;
        }
        if (Intrinsics.m87488d("apply", type)) {
            m212310a4();
        } else if (Intrinsics.m87488d(AuctionState.abort, type)) {
            m212308Y3(queueInfo);
        } else if (Intrinsics.m87488d("invite", type)) {
            m212312e4(queueInfo);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m212314g4(BLiveAuctionQueueInfo queueInfo) {
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String str = queueInfo.f44333id;
        str.getClass();
        duringCreated(p61.m167542c0(strM149818o, str)).subscribe(ffw.m121194e(new e30() { // from class: l.s1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212294L3(this.f161947a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.t1v
            @Override // p149l.e30
            public final void call(Object obj) {
                y1v.m212297O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m212307d4(String str) {
    }
}
