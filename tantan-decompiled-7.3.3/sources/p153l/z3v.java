package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.AuctionState;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionQueueInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\r\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001b¨\u0006 "}, m88121d2 = {"Ll/z3v;", "Ll/rwn0;", "D", "Ll/bpm0;", "Ll/fpm0;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/dum;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", OMSTemplateModeType.view, "<init>", "(Ljava/lang/String;Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;)V", "", "K3", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;", "infoList", "", "b4", "(Ljava/util/List;)Ljava/util/List;", "type", "queueInfo", "f4", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;)V", "e4", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionQueueInfo;)V", "g4", "Z3", "a4", "Y3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class z3v<D extends rwn0> extends bpm0<fpm0, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3v(@NotNull String str, @NotNull dum<D> dumVar, @NotNull LiveVoiceAuctionListPage liveVoiceAuctionListPage) {
        super(str, dumVar, liveVoiceAuctionListPage);
        str.getClass();
        dumVar.getClass();
        liveVoiceAuctionListPage.getClass();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m218494L3(z3v z3vVar, BLiveEnvelope bLiveEnvelope) {
        z3vVar.mo99534K3();
    }

    /* JADX INFO: renamed from: M3 */
    public static void m218495M3(z3v z3vVar, Throwable th) {
        ((LiveVoiceAuctionListPage) z3vVar.viewModel).m79046l0(z3vVar.getName(), true);
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m218497O3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m218498P3(z3v z3vVar, BLiveEnvelope bLiveEnvelope) {
        z3vVar.mo99534K3();
    }

    /* JADX INFO: renamed from: R3 */
    public static void m218499R3(z3v z3vVar, List list) {
        z3vVar.mo99534K3();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: S3 */
    public static void m218500S3(z3v z3vVar, List list) throws JSONException {
        if (Intrinsics.m88377d("apply", z3vVar.getName()) && !jyb.m147479J(list)) {
            String strM202194o = z3vVar.m213810E2().m202194o();
            strM202194o.getClass();
            BLiveAuctionQueueInfo bLiveAuctionQueueInfo = (BLiveAuctionQueueInfo) list.get(0);
            w61.m205037a0(strM202194o, bLiveAuctionQueueInfo != null ? bLiveAuctionQueueInfo.f45181id : null);
        }
        LiveVoiceAuctionListPage liveVoiceAuctionListPage = (LiveVoiceAuctionListPage) z3vVar.viewModel;
        String name = z3vVar.getName();
        list.getClass();
        liveVoiceAuctionListPage.m79045k0(name, z3vVar.m218511b4(list));
    }

    /* JADX INFO: renamed from: T3 */
    public static void m218501T3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m218503V3(z3v z3vVar, Meta meta) {
        z3vVar.mo99534K3();
    }

    /* JADX INFO: renamed from: W3 */
    public static void m218504W3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: X3 */
    public static void m218505X3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m218506c4(z3v z3vVar, String str, BLiveAuctionQueueInfo bLiveAuctionQueueInfo) {
        str.getClass();
        bLiveAuctionQueueInfo.getClass();
        z3vVar.m218513f4(str, bLiveAuctionQueueInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bpm0
    /* JADX INFO: renamed from: K3 */
    public void mo99534K3() {
        C22421c c22421cM205072T;
        if (Intrinsics.m88377d("apply", getName())) {
            w61 w61Var = w61.INSTANCE;
            String strM202194o = m213810E2().m202194o();
            strM202194o.getClass();
            c22421cM205072T = w61Var.m205070R(strM202194o);
        } else if (Intrinsics.m88377d("invite", getName())) {
            w61 w61Var2 = w61.INSTANCE;
            String strM202194o2 = m213810E2().m202194o();
            strM202194o2.getClass();
            c22421cM205072T = w61Var2.m205073U(strM202194o2);
        } else {
            w61 w61Var3 = w61.INSTANCE;
            String strM202194o3 = m213810E2().m202194o();
            strM202194o3.getClass();
            c22421cM205072T = w61Var3.m205072T(strM202194o3);
        }
        duringCreated(c22421cM205072T).subscribe(dhw.m115826e(new y20() { // from class: l.n3v
            @Override // p153l.y20
            public final void call(Object obj) throws JSONException {
                z3v.m218500S3(this.f140036a, (List) obj);
            }
        }, new y20() { // from class: l.q3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218495M3(this.f155492a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m218508Y3(BLiveAuctionQueueInfo queueInfo) {
        w61 w61Var = w61.INSTANCE;
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String str = queueInfo.f45181id;
        str.getClass();
        duringCreated(w61Var.m205069O(strM202194o, str)).subscribe(dhw.m115826e(new y20() { // from class: l.x3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218499R3(this.f192307a, (List) obj);
            }
        }, new y20() { // from class: l.y3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218505X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m218509Z3(BLiveAuctionQueueInfo queueInfo) {
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String str = queueInfo.f45181id;
        str.getClass();
        duringCreated(w61.m205029M(strM202194o, str)).subscribe(dhw.m115826e(new y20() { // from class: l.o3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218498P3(this.f144859a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.p3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218504W3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m218510a4() {
        m213811F2().VoiceAuctionEvent.openRelationSettingsDlg().mo199273j("");
        m213811F2().VoiceAuctionEvent.openAuctionQueueDlg().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b4 */
    public final List<fpm0> m218511b4(List<? extends BLiveAuctionQueueInfo> infoList) {
        ArrayList arrayList = new ArrayList();
        for (BLiveAuctionQueueInfo bLiveAuctionQueueInfo : infoList) {
            i9o0 i9o0Var = i9o0.INSTANCE;
            String str = bLiveAuctionQueueInfo.userInfo.userId;
            str.getClass();
            bLiveAuctionQueueInfo.role = i9o0Var.m139147k(this, str);
            arrayList.add(new fpm0(getName(), bLiveAuctionQueueInfo, new z20() { // from class: l.r3v
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    z3v.m218506c4(this.f161085a, (String) obj, (BLiveAuctionQueueInfo) obj2);
                }
            }, new y20() { // from class: l.s3v
                @Override // p153l.y20
                public final void call(Object obj) {
                    z3v.m218507d4((String) obj);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m218512e4(BLiveAuctionQueueInfo queueInfo) {
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String str = queueInfo.userInfo.userId;
        str.getClass();
        duringCreated(w61.m205035Z(strM202194o, str)).subscribe(dhw.m115826e(new y20() { // from class: l.v3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218503V3(this.f182301a, (Meta) obj);
            }
        }, new y20() { // from class: l.w3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218501T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m218513f4(String type, BLiveAuctionQueueInfo queueInfo) {
        if (Intrinsics.m88377d("reject", type)) {
            m218514g4(queueInfo);
            return;
        }
        if (Intrinsics.m88377d("accept", type)) {
            m218509Z3(queueInfo);
            return;
        }
        if (Intrinsics.m88377d("apply", type)) {
            m218510a4();
        } else if (Intrinsics.m88377d(AuctionState.abort, type)) {
            m218508Y3(queueInfo);
        } else if (Intrinsics.m88377d("invite", type)) {
            m218512e4(queueInfo);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m218514g4(BLiveAuctionQueueInfo queueInfo) {
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String str = queueInfo.f45181id;
        str.getClass();
        duringCreated(w61.m205041c0(strM202194o, str)).subscribe(dhw.m115826e(new y20() { // from class: l.t3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218494L3(this.f171956a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.u3v
            @Override // p153l.y20
            public final void call(Object obj) {
                z3v.m218497O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m218507d4(String str) {
    }
}
