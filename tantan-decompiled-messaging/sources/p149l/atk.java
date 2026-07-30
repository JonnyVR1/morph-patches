package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010,\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0015¨\u0006-"}, m87232d2 = {"Ll/atk;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/usk;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Z3", "()Ll/usk;", "U3", "Ll/zgm0;", "model", "", "a4", "(Ll/zgm0;)Z", "b4", "(Ll/zgm0;)V", "", "invitedId", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "template", "e4", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;)V", "W3", "", Careers.f38732it, "V3", "(Ljava/lang/Throwable;)V", "k", "Ljava/lang/String;", "X3", "()Ljava/lang/String;", "c4", "(Ljava/lang/String;)V", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/zgm0;", "Y3", "()Ll/zgm0;", "d4", "selectedAdapterModel", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class atk<D extends nnn0> extends zi2<D, usk<D>> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public String invitedId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public zgm0 selectedAdapterModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atk(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m98817O3(atk atkVar, BLiveEnvelope bLiveEnvelope) {
        atkVar.m98824W3();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m98818P3(atk atkVar, Throwable th) {
        th.getClass();
        atkVar.m98823V3(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public static void m98819R3(atk atkVar, String str) {
        if (((nnn0) atkVar.m206027E2()).f139743M.m221519i()) {
            str.getClass();
            BLiveAuctionAsset bLiveAuctionAssetM221515e = ((nnn0) atkVar.m206027E2()).f139743M.m221515e();
            bLiveAuctionAssetM221515e.getClass();
            atkVar.m98832e4(str, bLiveAuctionAssetM221515e);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static void m98820S3(atk atkVar, Throwable th) {
        th.getClass();
        atkVar.m98823V3(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m98821T3(atk atkVar, BLiveEnvelope bLiveEnvelope) {
        atkVar.m98824W3();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m98822U3() {
        zgm0 zgm0Var = this.selectedAdapterModel;
        if (zgm0Var == null) {
            lsi0.m151595y("请选择拍拍关系");
            return;
        }
        zgm0Var.getClass();
        String str = zgm0Var.getRelation().type;
        str.getClass();
        if (m98825X3().length() > 0) {
            String strM149818o = m206027E2().m149818o();
            strM149818o.getClass();
            duringCreated(p61.m167531N(strM149818o, m98825X3(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.wsk
                @Override // p149l.e30
                public final void call(Object obj) {
                    atk.m98821T3(this.f187946a, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.xsk
                @Override // p149l.e30
                public final void call(Object obj) {
                    atk.m98818P3(this.f194282a, (Throwable) obj);
                }
            }));
        } else {
            p61 p61Var = p61.INSTANCE;
            String strM149818o2 = m206027E2().m149818o();
            strM149818o2.getClass();
            duringCreated(p61Var.m167569L(strM149818o2, str)).subscribe(ffw.m121194e(new e30() { // from class: l.ysk
                @Override // p149l.e30
                public final void call(Object obj) {
                    atk.m98817O3(this.f199789a, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.zsk
                @Override // p149l.e30
                public final void call(Object obj) {
                    atk.m98820S3(this.f204606a, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m98823V3(Throwable it) {
        r610.m178005j(it);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m98824W3() {
        m206027E2().f108769z.m181789r().m189111i0(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate.newBuilder().setUpdateType(LongLinkVoiceLiveAuctionMsg.UpdateType.refreshAuction).build());
        ((usk) this.viewModel).mo71727j();
    }

    @NotNull
    /* JADX INFO: renamed from: X3 */
    public final String m98825X3() {
        String str = this.invitedId;
        if (str != null) {
            return str;
        }
        Intrinsics.m87502r("invitedId");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: Y3, reason: from getter */
    public final zgm0 getSelectedAdapterModel() {
        return this.selectedAdapterModel;
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public usk<D> mo75679K3() {
        return new usk<>();
    }

    /* JADX INFO: renamed from: a4 */
    public final boolean m98828a4(@NotNull zgm0 model) {
        model.getClass();
        zgm0 zgm0Var = this.selectedAdapterModel;
        if (zgm0Var == null) {
            return true;
        }
        zgm0Var.getClass();
        return Intrinsics.m87488d(zgm0Var.getRelation().type, model.getRelation().type);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m98829b4(@NotNull zgm0 model) {
        model.getClass();
        zgm0 zgm0Var = this.selectedAdapterModel;
        if (zgm0Var != null) {
            zgm0Var.m218665L();
        }
        model.m218664K();
        ((usk) this.viewModel).m195221E(model.getRelation());
        this.selectedAdapterModel = model;
    }

    /* JADX INFO: renamed from: c4 */
    public final void m98830c4(@NotNull String str) {
        str.getClass();
        this.invitedId = str;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m98831d4(@Nullable zgm0 zgm0Var) {
        this.selectedAdapterModel = zgm0Var;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m98832e4(String invitedId, BLiveAuctionAsset template) {
        m98830c4(invitedId);
        if (this.viewModel == 0) {
            m218910L3();
        }
        ((usk) this.viewModel).mo71722F0(false);
        ((usk) this.viewModel).m195218A(template);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceAuctionEvent.openRelationSettingsDlg().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.vsk
            @Override // p149l.e30
            public final void call(Object obj) {
                atk.m98819R3(this.f182849a, (String) obj);
            }
        }));
    }
}
