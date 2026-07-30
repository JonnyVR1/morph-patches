package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelationCard;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationlist.view.LiveVoiceAuctionListPage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/wgm0;", "Ll/nnn0;", "D", "Ll/xfm0;", "Ll/igm0;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Ll/bsm;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;", OMSTemplateModeType.view, "curUserId", "<init>", "(Ljava/lang/String;Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationlist/view/LiveVoiceAuctionListPage;Ljava/lang/String;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelationCard;", "auctionGuest", "U3", "(Ljava/util/List;)Ljava/util/List;", "", "K3", "()V", "cpId", "Y3", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;", "asset", "Z3", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionAsset;)V", "W3", "", Careers.f38732it, "X3", "(Ljava/lang/Throwable;)V", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/String;", "Ll/dd80;", "m", "Ll/dd80;", "dissolveDialog", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class wgm0<D extends nnn0> extends xfm0<igm0, D> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final String curUserId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public dd80 dissolveDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgm0(@NotNull String str, @NotNull bsm<D> bsmVar, @NotNull LiveVoiceAuctionListPage liveVoiceAuctionListPage, @NotNull String str2) {
        super(str, bsmVar, liveVoiceAuctionListPage);
        str.getClass();
        bsmVar.getClass();
        liveVoiceAuctionListPage.getClass();
        str2.getClass();
        this.curUserId = str2;
    }

    /* JADX INFO: renamed from: L3 */
    public static void m203060L3(wgm0 wgm0Var, String str, BLiveAuctionAsset bLiveAuctionAsset, View view) {
        wgm0Var.m203071W3(str, bLiveAuctionAsset);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m203062N3(wgm0 wgm0Var, List list) {
        LiveVoiceAuctionListPage liveVoiceAuctionListPage = (LiveVoiceAuctionListPage) wgm0Var.viewModel;
        String name = wgm0Var.getName();
        list.getClass();
        liveVoiceAuctionListPage.m77862k0(name, wgm0Var.m203068U3(list));
    }

    /* JADX INFO: renamed from: O3 */
    public static void m203063O3(wgm0 wgm0Var, View view) {
        uep0.m193327n(wgm0Var.dissolveDialog);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m203064P3(wgm0 wgm0Var, Meta meta) {
        wgm0Var.mo203070K3();
        lsi0.m151595y("解除成功");
        uep0.m193327n(wgm0Var.dissolveDialog);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m203065R3(wgm0 wgm0Var, Throwable th) {
        th.getClass();
        wgm0Var.m203072X3(th);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m203066S3(wgm0 wgm0Var, Throwable th) {
        ((LiveVoiceAuctionListPage) wgm0Var.viewModel).m77863l0(wgm0Var.getName(), true);
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m203067T3(wgm0 wgm0Var, String str, BLiveAuctionAsset bLiveAuctionAsset) {
        bLiveAuctionAsset.getClass();
        wgm0Var.m203074Z3(str, bLiveAuctionAsset);
    }

    /* JADX INFO: renamed from: U3 */
    private final List<igm0> m203068U3(List<? extends BLiveAuctionRelationCard> auctionGuest) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : auctionGuest) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BLiveAuctionRelationCard bLiveAuctionRelationCard = (BLiveAuctionRelationCard) obj;
            final igm0 igm0Var = new igm0(bLiveAuctionRelationCard, i, getName());
            if (Intrinsics.m87488d("personal", getName()) && (Intrinsics.m87488d(ypv.f199493a.m199309D0(), bLiveAuctionRelationCard.otherUserInfo.userId) || Intrinsics.m87488d(ypv.f199493a.m199309D0(), bLiveAuctionRelationCard.userInfo.userId))) {
                igm0Var.m136079L(new View.OnLongClickListener() { // from class: l.qgm0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return wgm0.m203069V3(this.f154361a, igm0Var, view);
                    }
                });
            }
            arrayList.add(igm0Var);
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V3 */
    public static final boolean m203069V3(wgm0 wgm0Var, igm0 igm0Var, View view) {
        String str = igm0Var.getRelation().f44334id;
        str.getClass();
        wgm0Var.m203073Y3(str);
        return true;
    }

    @Override // p149l.xfm0
    /* JADX INFO: renamed from: K3 */
    public void mo203070K3() {
        duringCreated(p61.INSTANCE.m167576Y(this.curUserId, getName())).subscribe(ffw.m121194e(new e30() { // from class: l.ogm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wgm0.m203062N3(this.f143884a, (List) obj);
            }
        }, new e30() { // from class: l.pgm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wgm0.m203066S3(this.f148740a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m203071W3(String cpId, BLiveAuctionAsset asset) {
        duringCreated(p61.m167533Q(cpId, asset.auctionRelationUnbindTTC, asset.auctionRelationUnbindFreeCount)).subscribe(ffw.m121194e(new e30() { // from class: l.ugm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wgm0.m203064P3(this.f176402a, (Meta) obj);
            }
        }, new e30() { // from class: l.vgm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wgm0.m203065R3(this.f181384a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m203072X3(Throwable it) {
        if (xtr.m211022b(60101, it)) {
            m206028F2().GiftDialogEventGroup.openGoWallet().mo172463j(new ip50().m137454d(true));
        } else {
            xtr.m211023c(it);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m203073Y3(final String cpId) {
        p61 p61Var = p61.INSTANCE;
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        duringCreated(p61Var.m167572S(strM149818o)).subscribe(ffw.m121197h(new e30() { // from class: l.rgm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wgm0.m203067T3(this.f159267a, cpId, (BLiveAuctionAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m203074Z3(final String cpId, final BLiveAuctionAsset asset) {
        View viewInflate = LayoutInflater.from(m104249C0()).inflate(t6c0.f168063I7, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(g5c0.f101086w4);
        VText vText = (VText) viewInflate.findViewById(g5c0.f100923f0);
        VText vText2 = (VText) viewInflate.findViewById(g5c0.f101053s7);
        VText vText3 = (VText) viewInflate.findViewById(g5c0.f101008n7);
        dd80 dd80VarM110960O = new dd80.C16336a(this.f188513f).m110963R(viewInflate).m110960O();
        this.dissolveDialog = dd80VarM110960O;
        if (dd80VarM110960O != null) {
            dd80VarM110960O.show();
        }
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.sgm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wgm0.m203063O3(this.f164452a, view);
            }
        });
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.tgm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wgm0.m203060L3(this.f170105a, cpId, asset, view);
            }
        });
        int i = asset.auctionRelationUnbindFreeCount;
        if (i > 0) {
            vText2.setText("免费次数:" + i);
        } else {
            vText2.setText("(" + asset.auctionRelationUnbindTTC + "探币)");
        }
        if (TextUtils.isEmpty(asset.auctionRelationUnbindTips)) {
            xdl0.m208344M(vText3, false);
        } else {
            xdl0.m208344M(vText3, true);
            vText3.setText(asset.auctionRelationUnbindTips);
        }
    }
}
