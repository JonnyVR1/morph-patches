package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010,\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0015¨\u0006-"}, m88121d2 = {"Ll/qvk;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/kvk;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "Z3", "()Ll/kvk;", "U3", "Ll/dqm0;", "model", "", "a4", "(Ll/dqm0;)Z", "b4", "(Ll/dqm0;)V", "", "invitedId", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "template", "e4", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;)V", "W3", "", Careers.f39580it, "V3", "(Ljava/lang/Throwable;)V", "k", "Ljava/lang/String;", "X3", "()Ljava/lang/String;", "c4", "(Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/dqm0;", "Y3", "()Ll/dqm0;", "d4", "selectedAdapterModel", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qvk<D extends rwn0> extends hj2<D, kvk<D>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String invitedId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public dqm0 selectedAdapterModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvk(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m178302O3(qvk qvkVar, BLiveEnvelope bLiveEnvelope) {
        qvkVar.m178309W3();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m178303P3(qvk qvkVar, Throwable th) {
        th.getClass();
        qvkVar.m178308V3(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public static void m178304R3(qvk qvkVar, String str) {
        if (((rwn0) qvkVar.m213810E2()).f165190M.m222765i()) {
            str.getClass();
            BLiveAuctionAsset bLiveAuctionAssetM222761e = ((rwn0) qvkVar.m213810E2()).f165190M.m222761e();
            bLiveAuctionAssetM222761e.getClass();
            qvkVar.m178317e4(str, bLiveAuctionAssetM222761e);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static void m178305S3(qvk qvkVar, Throwable th) {
        th.getClass();
        qvkVar.m178308V3(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m178306T3(qvk qvkVar, BLiveEnvelope bLiveEnvelope) {
        qvkVar.m178309W3();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m178307U3() {
        dqm0 dqm0Var = this.selectedAdapterModel;
        if (dqm0Var == null) {
            o1j0.m165651y("请选择拍拍关系");
            return;
        }
        dqm0Var.getClass();
        String str = dqm0Var.getRelation().type;
        str.getClass();
        if (m178310X3().length() > 0) {
            String strM202194o = m213810E2().m202194o();
            strM202194o.getClass();
            duringCreated(w61.m205030N(strM202194o, m178310X3(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.mvk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qvk.m178306T3(this.f138906a, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.nvk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qvk.m178303P3(this.f143811a, (Throwable) obj);
                }
            }));
        } else {
            w61 w61Var = w61.INSTANCE;
            String strM202194o2 = m213810E2().m202194o();
            strM202194o2.getClass();
            duringCreated(w61Var.m205068L(strM202194o2, str)).subscribe(dhw.m115826e(new y20() { // from class: l.ovk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qvk.m178302O3(this.f149275a, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.pvk
                @Override // p153l.y20
                public final void call(Object obj) {
                    qvk.m178305S3(this.f154305a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m178308V3(Throwable it) {
        bf10.m103834j(it);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m178309W3() {
        m213810E2().f148282z.m170284r().m98293i0(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate.newBuilder().setUpdateType(LongLinkVoiceLiveAuctionMsg.UpdateType.refreshAuction).build());
        ((kvk) this.viewModel).mo72910j();
    }

    @NotNull
    /* JADX INFO: renamed from: X3 */
    public final String m178310X3() {
        String str = this.invitedId;
        if (str != null) {
            return str;
        }
        Intrinsics.m88391r("invitedId");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: Y3, reason: from getter */
    public final dqm0 getSelectedAdapterModel() {
        return this.selectedAdapterModel;
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public kvk<D> mo76862K3() {
        return new kvk<>();
    }

    /* JADX INFO: renamed from: a4 */
    public final boolean m178313a4(@NotNull dqm0 model) {
        model.getClass();
        dqm0 dqm0Var = this.selectedAdapterModel;
        if (dqm0Var == null) {
            return true;
        }
        dqm0Var.getClass();
        return Intrinsics.m88377d(dqm0Var.getRelation().type, model.getRelation().type);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m178314b4(@NotNull dqm0 model) {
        model.getClass();
        dqm0 dqm0Var = this.selectedAdapterModel;
        if (dqm0Var != null) {
            dqm0Var.m117555L();
        }
        model.m117554K();
        ((kvk) this.viewModel).m151670E(model.getRelation());
        this.selectedAdapterModel = model;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m178315c4(@NotNull String str) {
        str.getClass();
        this.invitedId = str;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m178316d4(@Nullable dqm0 dqm0Var) {
        this.selectedAdapterModel = dqm0Var;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m178317e4(String invitedId, BLiveAuctionAsset template) {
        m178315c4(invitedId);
        if (this.viewModel == 0) {
            m135319L3();
        }
        ((kvk) this.viewModel).mo72905F0(false);
        ((kvk) this.viewModel).m151667A(template);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceAuctionEvent.openRelationSettingsDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.lvk
            @Override // p153l.y20
            public final void call(Object obj) {
                qvk.m178304R3(this.f133715a, (String) obj);
            }
        }));
    }
}
