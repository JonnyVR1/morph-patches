package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelationCard;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/aqm0;", "Ll/rwn0;", "D", "Ll/bpm0;", "Ll/mpm0;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/dum;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", OMSTemplateModeType.view, "curUserId", "<init>", "(Ljava/lang/String;Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "auctionGuest", "U3", "(Ljava/util/List;)Ljava/util/List;", "", "K3", "()V", "cpId", "Y3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "asset", "Z3", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;)V", "W3", "", Careers.f39580it, "X3", "(Ljava/lang/Throwable;)V", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/String;", "Ll/jl80;", "m", "Ll/jl80;", "dissolveDialog", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class aqm0<D extends rwn0> extends bpm0<mpm0, D> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final String curUserId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public jl80 dissolveDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqm0(@NotNull String str, @NotNull dum<D> dumVar, @NotNull LiveVoiceAuctionListPage liveVoiceAuctionListPage, @NotNull String str2) {
        super(str, dumVar, liveVoiceAuctionListPage);
        str.getClass();
        dumVar.getClass();
        liveVoiceAuctionListPage.getClass();
        str2.getClass();
        this.curUserId = str2;
    }

    /* JADX INFO: renamed from: L3 */
    public static void m99524L3(aqm0 aqm0Var, String str, BLiveAuctionAsset bLiveAuctionAsset, View view) {
        aqm0Var.m99535W3(str, bLiveAuctionAsset);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m99526N3(aqm0 aqm0Var, List list) {
        LiveVoiceAuctionListPage liveVoiceAuctionListPage = (LiveVoiceAuctionListPage) aqm0Var.viewModel;
        String name = aqm0Var.getName();
        list.getClass();
        liveVoiceAuctionListPage.m79045k0(name, aqm0Var.m99532U3(list));
    }

    /* JADX INFO: renamed from: O3 */
    public static void m99527O3(aqm0 aqm0Var, View view) {
        ynp0.m216937n(aqm0Var.dissolveDialog);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m99528P3(aqm0 aqm0Var, Meta meta) {
        aqm0Var.mo99534K3();
        o1j0.m165651y("解除成功");
        ynp0.m216937n(aqm0Var.dissolveDialog);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m99529R3(aqm0 aqm0Var, Throwable th) {
        th.getClass();
        aqm0Var.m99536X3(th);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m99530S3(aqm0 aqm0Var, Throwable th) {
        ((LiveVoiceAuctionListPage) aqm0Var.viewModel).m79046l0(aqm0Var.getName(), true);
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m99531T3(aqm0 aqm0Var, String str, BLiveAuctionAsset bLiveAuctionAsset) {
        bLiveAuctionAsset.getClass();
        aqm0Var.m99538Z3(str, bLiveAuctionAsset);
    }

    /* JADX INFO: renamed from: U3 */
    private final List<mpm0> m99532U3(List<? extends BLiveAuctionRelationCard> auctionGuest) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : auctionGuest) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveAuctionRelationCard bLiveAuctionRelationCard = (BLiveAuctionRelationCard) obj;
            final mpm0 mpm0Var = new mpm0(bLiveAuctionRelationCard, i, getName());
            if (Intrinsics.m88377d("personal", getName()) && (Intrinsics.m88377d(zrv.f205799a.m207631D0(), bLiveAuctionRelationCard.otherUserInfo.userId) || Intrinsics.m88377d(zrv.f205799a.m207631D0(), bLiveAuctionRelationCard.userInfo.userId))) {
                mpm0Var.m159378L(new View.OnLongClickListener() { // from class: l.upm0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return aqm0.m99533V3(this.f180297a, mpm0Var, view);
                    }
                });
            }
            arrayList.add(mpm0Var);
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V3 */
    public static final boolean m99533V3(aqm0 aqm0Var, mpm0 mpm0Var, View view) {
        String str = mpm0Var.getRelation().f45182id;
        str.getClass();
        aqm0Var.m99537Y3(str);
        return true;
    }

    @Override // p153l.bpm0
    /* JADX INFO: renamed from: K3 */
    public void mo99534K3() {
        duringCreated(w61.INSTANCE.m205075Y(this.curUserId, getName())).subscribe(dhw.m115826e(new y20() { // from class: l.spm0
            @Override // p153l.y20
            public final void call(Object obj) {
                aqm0.m99526N3(this.f170061a, (List) obj);
            }
        }, new y20() { // from class: l.tpm0
            @Override // p153l.y20
            public final void call(Object obj) {
                aqm0.m99530S3(this.f175613a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m99535W3(String cpId, BLiveAuctionAsset asset) {
        duringCreated(w61.m205032Q(cpId, asset.auctionRelationUnbindTTC, asset.auctionRelationUnbindFreeCount)).subscribe(dhw.m115826e(new y20() { // from class: l.ypm0
            @Override // p153l.y20
            public final void call(Object obj) {
                aqm0.m99528P3(this.f201072a, (Meta) obj);
            }
        }, new y20() { // from class: l.zpm0
            @Override // p153l.y20
            public final void call(Object obj) {
                aqm0.m99529R3(this.f205485a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m99536X3(Throwable it) {
        if (yvr.m217556b(60101, it)) {
            m213811F2().GiftDialogEventGroup.openGoWallet().mo199273j(new ox50().m169679d(true));
        } else {
            yvr.m217557c(it);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m99537Y3(final String cpId) {
        w61 w61Var = w61.INSTANCE;
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        duringCreated(w61Var.m205071S(strM202194o)).subscribe(dhw.m115829h(new y20() { // from class: l.vpm0
            @Override // p153l.y20
            public final void call(Object obj) {
                aqm0.m99531T3(this.f185270a, cpId, (BLiveAuctionAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m99538Z3(final String cpId, final BLiveAuctionAsset asset) {
        View viewInflate = LayoutInflater.from(m113230C0()).inflate(yec0.f198795I7, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(mdc0.f136331w4);
        VText vText = (VText) viewInflate.findViewById(mdc0.f136168f0);
        VText vText2 = (VText) viewInflate.findViewById(mdc0.f136298s7);
        VText vText3 = (VText) viewInflate.findViewById(mdc0.f136253n7);
        jl80 jl80VarM146020O = new jl80.C17971a(this.f196919f).m146023R(viewInflate).m146020O();
        this.dissolveDialog = jl80VarM146020O;
        if (jl80VarM146020O != null) {
            jl80VarM146020O.show();
        }
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.wpm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqm0.m99527O3(this.f190323a, view);
            }
        });
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.xpm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqm0.m99524L3(this.f195718a, cpId, asset, view);
            }
        });
        int i = asset.auctionRelationUnbindFreeCount;
        if (i > 0) {
            vText2.setText("免费次数:" + i);
        } else {
            vText2.setText("(" + asset.auctionRelationUnbindTTC + "探币)");
        }
        if (TextUtils.isEmpty(asset.auctionRelationUnbindTips)) {
            bnl0.m105524M(vText3, false);
        } else {
            bnl0.m105524M(vText3, true);
            vText3.setText(asset.auctionRelationUnbindTips);
        }
    }
}
