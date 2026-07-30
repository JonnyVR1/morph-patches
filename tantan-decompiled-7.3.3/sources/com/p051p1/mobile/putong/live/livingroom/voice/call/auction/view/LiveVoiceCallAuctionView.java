package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.AuctionState;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeader;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionViewBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bf10;
import p153l.bhn0;
import p153l.bnl0;
import p153l.czq;
import p153l.go5;
import p153l.i6t;
import p153l.i9o0;
import p153l.izs;
import p153l.jxd0;
import p153l.jyb;
import p153l.n3d0;
import p153l.n9c0;
import p153l.o81;
import p153l.obc0;
import p153l.p7f;
import p153l.q6s;
import p153l.qa00;
import p153l.rwn0;
import p153l.t3m0;
import p153l.th0;
import p153l.y6s;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020\t2\u0006\u0010+\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010-\u001a\u00020'2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J%\u00103\u001a\u00020\t2\u0006\u0010+\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00102\u001a\u00020'¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b5\u0010\u0011J\u0015\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J%\u0010<\u001a\u00020\t2\u0006\u0010:\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020'2\u0006\u0010;\u001a\u00020'¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020#¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020'¢\u0006\u0004\bC\u0010*R\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010N\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\b\u0012\u0006\u0012\u0002\b\u00030K0J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010X\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010*¨\u0006Y"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceCallAuctionViewBindings;", "Ll/o81;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", BaseSei.f14625Y, "()V", BaseSei.f14624X, "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeader;", "leaderBoards", "J", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;", "guestUser", "winnerUser", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;)V", "Landroid/view/ViewGroup;", "root", "A", "(Landroid/view/ViewGroup;)V", "onFinishInflate", "auctionUser", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "actionRelation", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;)V", BloodType.f39576O, "M", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;", "auction", "L", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;)V", "", "panelBg", BaseSei.f14626Z, "(Ljava/lang/String;)V", "panelBgId", "auctionRelation", "worthBubble", "", "isChoosingPledge", "G", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Ljava/lang/String;Z)V", "wealthBubble", p7f.LATITUDE_SOUTH, "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Ljava/lang/String;)V", p7f.GPS_DIRECTION_TRUE, "", "gap", "R", "(J)V", "isCollapse", "whoInProcessing", "I", "(ZLjava/lang/String;Ljava/lang/String;)V", "isManager", "newAuction", "B", "(ZLcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;)V", "newMask", "Q", "Ll/jxd0;", "L0", "Lkotlin/Lazy;", "getShowedActionGuideTip", "()Ll/jxd0;", "showedActionGuideTip", "", "", "M0", "Ljava/util/Map;", "seatResIdsMap", "", "N0", "[I", "bidderLevelBg", "O0", "Ljava/lang/String;", "getCurPanelBgUrl", "()Ljava/lang/String;", "setCurPanelBgUrl", "curPanelBgUrl", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LiveVoiceCallAuctionView extends LiveVoiceCallAuctionViewBindings<o81> {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final Lazy showedActionGuideTip;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public Map<String, ? extends Object[]> seatResIdsMap;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public final int[] bidderLevelBg;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @Nullable
    public String curPanelBgUrl;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C13156a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return go5.m131087d(Integer.valueOf(((BLiveAuctionLeader) t).rank), Integer.valueOf(((BLiveAuctionLeader) t2).rank));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceCallAuctionView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.showedActionGuideTip = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.g4v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVoiceCallAuctionView.m79090w();
            }
        });
        this.bidderLevelBg = new int[]{obc0.f146299c9, obc0.f146311d9, obc0.f146323e9, obc0.f146335f9};
    }

    /* JADX INFO: renamed from: C */
    public static final void m79069C(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveVoiceAuction bLiveVoiceAuction, View view) {
        ((o81) liveVoiceCallAuctionView.f49134a).m166433D4(bLiveVoiceAuction);
    }

    /* JADX INFO: renamed from: E */
    public static final void m79070E(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((o81) liveVoiceCallAuctionView.f49134a).m166441t4("failAuction");
    }

    /* JADX INFO: renamed from: F */
    public static final void m79071F(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((o81) liveVoiceCallAuctionView.f49134a).m166441t4("endAuction");
    }

    /* JADX INFO: renamed from: H */
    public static final void m79072H(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((o81) liveVoiceCallAuctionView.f49134a).m166441t4("endAuction");
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m79073K(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionLeader bLiveAuctionLeader, View view) {
        view.getClass();
        o81 o81Var = (o81) liveVoiceCallAuctionView.f49134a;
        String str = bLiveAuctionLeader.userInfo.userId;
        str.getClass();
        o81Var.m166443z4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m79074b(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((o81) liveVoiceCallAuctionView.f49134a).m166440s4();
    }

    /* JADX INFO: renamed from: d */
    public static void m79076d(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, final BLiveVoiceAuction bLiveVoiceAuction, View view) {
        new th0.C20312a(liveVoiceCallAuctionView.getAct()).m191151j("确定定拍吗？").m191159r("确定").m191147f("取消").m191149h(false).m191156o(new View.OnClickListener() { // from class: l.t4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m79069C(this.f172144a, bLiveVoiceAuction, view2);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: f */
    public static void m79078f(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        T t = liveVoiceCallAuctionView.f49134a;
        t.getClass();
        t3m0.m189093g((i6t) t, true);
        ((o81) liveVoiceCallAuctionView.f49134a).m166438q4();
    }

    private final jxd0 getShowedActionGuideTip() {
        return (jxd0) this.showedActionGuideTip.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m79079i(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, View view) {
        view.getClass();
        o81 o81Var = (o81) liveVoiceCallAuctionView.f49134a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        o81Var.m166443z4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m79080j(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, View view) {
        view.getClass();
        o81 o81Var = (o81) liveVoiceCallAuctionView.f49134a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        o81Var.m166443z4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static void m79081k(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        new th0.C20312a(liveVoiceCallAuctionView.getAct()).m191151j("确定结束拍拍吗？").m191159r("确定").m191149h(false).m191147f("取消").m191156o(new View.OnClickListener() { // from class: l.u4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m79071F(this.f177509a, view2);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: l */
    public static void m79082l(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        new th0.C20312a(liveVoiceCallAuctionView.getAct()).m191151j("确定流拍吗？").m191159r("确定").m191149h(false).m191147f("取消").m191156o(new View.OnClickListener() { // from class: l.j4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m79070E(this.f118329a, view2);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: m */
    public static Unit m79083m(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, BLiveVoiceAuction bLiveVoiceAuction, View view) {
        view.getClass();
        o81 o81Var = (o81) liveVoiceCallAuctionView.f49134a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        o81Var.m166443z4(str);
        String str2 = bLiveVoiceAuction.guestUser.userId;
        str2.getClass();
        T t = liveVoiceCallAuctionView.f49134a;
        t.getClass();
        t3m0.m189099m(str2, "cartoon_avatar", (i6t) t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m79084n(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, BLiveVoiceAuction bLiveVoiceAuction, View view) {
        view.getClass();
        o81 o81Var = (o81) liveVoiceCallAuctionView.f49134a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        o81Var.m166443z4(str);
        String str2 = bLiveVoiceAuction.guestUser.userId;
        str2.getClass();
        T t = liveVoiceCallAuctionView.f49134a;
        t.getClass();
        t3m0.m189099m(str2, ReminderAction.photo, (i6t) t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static void m79087s(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        new th0.C20312a(liveVoiceCallAuctionView.getAct()).m191151j("确定结束拍拍吗？").m191159r("确定").m191149h(false).m191147f("取消").m191156o(new View.OnClickListener() { // from class: l.n4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m79072H(this.f140259a, view2);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: v */
    public static void m79089v(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        T t = liveVoiceCallAuctionView.f49134a;
        t.getClass();
        t3m0.m189093g((i6t) t, false);
        ((o81) liveVoiceCallAuctionView.f49134a).m166439r4();
    }

    /* JADX INFO: renamed from: w */
    public static jxd0 m79090w() {
        return new jxd0("showed_auction_guide_tip_" + zrv.f205799a.m207631D0(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A */
    public final void m79091A(@NotNull ViewGroup root) {
        root.getClass();
        bnl0.m105552e0(this.f49137d, qa00.f156338y);
        bnl0.m105507D0(bhn0.m104350a(), this.f49138e);
        bnl0.m105507D0(bhn0.m104350a(), this.f49136c);
    }

    /* JADX INFO: renamed from: B */
    public final void m79092B(boolean isManager, @NotNull final BLiveVoiceAuction newAuction) {
        newAuction.getClass();
        if (!isManager) {
            bnl0.m105524M(this.f49144k, false);
            bnl0.m105524M(this.f49119J0, false);
            return;
        }
        String str = newAuction.stage;
        int iHashCode = str.hashCode();
        if (iHashCode != -1318566021) {
            if (iHashCode != -935849721) {
                if (iHashCode != 96651962 || !str.equals("ended")) {
                    return;
                }
            } else if (!str.equals(AuctionState.blessing)) {
                return;
            }
            bnl0.m105524M(this.f49144k, false);
            bnl0.m105524M(this.f49119J0, true);
            bnl0.m105509E0(this.f49119J0, new View.OnClickListener() { // from class: l.s4v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionView.m79081k(this.f166290a, view);
                }
            });
            return;
        }
        if (str.equals("ongoing")) {
            bnl0.m105524M(this.f49144k, true);
            boolean zM147479J = jyb.m147479J(newAuction.leaderboards);
            VText vText = this.f49144k;
            if (zM147479J) {
                vText.setText("流拍");
                bnl0.m105509E0(this.f49144k, new View.OnClickListener() { // from class: l.r4v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveVoiceCallAuctionView.m79082l(this.f161246a, view);
                    }
                });
            } else {
                vText.setText("定拍");
                bnl0.m105509E0(this.f49144k, new View.OnClickListener() { // from class: l.q4v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveVoiceCallAuctionView.m79076d(this.f155616a, newAuction, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m79093G(@NotNull String panelBgId, @NotNull final BLiveAuctionUserInfo guestUser, @NotNull BLiveAuctionRelation auctionRelation, @NotNull final BLiveAuctionUserInfo winnerUser, @NotNull String worthBubble, boolean isChoosingPledge) {
        panelBgId.getClass();
        guestUser.getClass();
        auctionRelation.getClass();
        winnerUser.getClass();
        worthBubble.getClass();
        m79105x();
        bnl0.m105524M(this.f49104A, false);
        izs.m142868s("context_single_room", this.f49154s, guestUser.avatar);
        VText vText = this.f49119J0;
        if (isChoosingPledge) {
            vText.setEnabled(true);
            this.f49119J0.setTextColor(n3d0.m161277a(n9c0.f140838j1));
            this.f49119J0.setText("称号选择中...");
        } else {
            vText.setEnabled(true);
            this.f49119J0.setTextColor(n3d0.m161277a(n9c0.f140847m1));
            this.f49119J0.setText("结束拍卖");
        }
        TextView textView = this.f49155t;
        String str = guestUser.userName;
        str.getClass();
        textView.setText(bf10.m103830g0(str, 4));
        this.f49156u.setText("总身价:" + yau.m214934b(guestUser.curWorth));
        VDraweeView vDraweeView = this.f49154s;
        vDraweeView.getClass();
        czq.m113347c(vDraweeView, new Function1() { // from class: l.v4v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m79080j(this.f182428a, guestUser, (View) obj);
            }
        });
        bnl0.m105524M(this.f49110F, false);
        izs.m142868s("context_single_room", this.f49147m, auctionRelation.image);
        this.f49148n.setText(auctionRelation.name);
        izs.m142868s("context_single_room", this.f49149o, winnerUser.avatar);
        VDraweeView vDraweeView2 = this.f49149o;
        vDraweeView2.getClass();
        czq.m113347c(vDraweeView2, new Function1() { // from class: l.w4v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m79079i(this.f187440a, winnerUser, (View) obj);
            }
        });
        TextView textView2 = this.f49150p;
        String str2 = winnerUser.userName;
        str2.getClass();
        textView2.setText(bf10.m103830g0(str2, 4));
        bnl0.m105509E0(this.f49121K0, new View.OnClickListener() { // from class: l.h4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVoiceCallAuctionView.m79074b(this.f107831a, view);
            }
        });
        m79103S(panelBgId, guestUser, worthBubble);
        bnl0.m105524M(this.f49144k, false);
        T t = this.f49134a;
        t.getClass();
        boolean zM139137h = i9o0.m139137h((i6t) t);
        VText vText2 = this.f49119J0;
        if (zM139137h) {
            bnl0.m105524M(vText2, true);
            bnl0.m105509E0(this.f49119J0, new View.OnClickListener() { // from class: l.i4v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionView.m79087s(this.f112950a, view);
                }
            });
        } else {
            bnl0.m105524M(vText2, false);
        }
        m79098N(guestUser, winnerUser);
    }

    /* JADX INFO: renamed from: I */
    public final void m79094I(boolean isCollapse, @NotNull String auctionUser, @NotNull String whoInProcessing) {
        auctionUser.getClass();
        whoInProcessing.getClass();
        bnl0.m105524M(this.f49138e, !isCollapse);
        this.f49137d.m78775b(new q6s(isCollapse, auctionUser, whoInProcessing, true));
    }

    /* JADX INFO: renamed from: J */
    public final void m79095J(List<? extends BLiveAuctionLeader> leaderBoards) {
        Object obj;
        if (leaderBoards != null) {
            CollectionsKt.sortedWith(leaderBoards, new C13156a());
        }
        int i = 0;
        while (i < 3) {
            final BLiveAuctionLeader bLiveAuctionLeader = (i >= (leaderBoards != null ? leaderBoards.size() : 0) || leaderBoards == null) ? null : leaderBoards.get(i);
            Map<String, ? extends Object[]> map = this.seatResIdsMap;
            if (bLiveAuctionLeader != null) {
                if (map == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map = null;
                }
                Object[] objArr = map.get("emptyOrder");
                Object obj2 = objArr != null ? objArr[i] : null;
                obj2.getClass();
                bnl0.m105524M((View) obj2, false);
                Map<String, ? extends Object[]> map2 = this.seatResIdsMap;
                if (map2 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map2 = null;
                }
                Object[] objArr2 = map2.get("avatar");
                Object obj3 = objArr2 != null ? objArr2[i] : null;
                obj3.getClass();
                bnl0.m105524M((View) obj3, true);
                Map<String, ? extends Object[]> map3 = this.seatResIdsMap;
                if (map3 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map3 = null;
                }
                Object[] objArr3 = map3.get(FirebaseAnalytics.Param.PRICE);
                Object obj4 = objArr3 != null ? objArr3[i] : null;
                obj4.getClass();
                bnl0.m105524M((View) obj4, true);
                Map<String, ? extends Object[]> map4 = this.seatResIdsMap;
                if (map4 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map4 = null;
                }
                Object[] objArr4 = map4.get("order");
                Object obj5 = objArr4 != null ? objArr4[i] : null;
                obj5.getClass();
                bnl0.m105524M((View) obj5, true);
                Map<String, ? extends Object[]> map5 = this.seatResIdsMap;
                if (map5 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map5 = null;
                }
                Object[] objArr5 = map5.get("order");
                Object obj6 = objArr5 != null ? objArr5[i] : null;
                obj6.getClass();
                ((VText) obj6).setText(String.valueOf(i + 1));
                Map<String, ? extends Object[]> map6 = this.seatResIdsMap;
                if (map6 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map6 = null;
                }
                Object[] objArr6 = map6.get(AuthenticationTokenClaims.JSON_KEY_NAME);
                Object obj7 = objArr6 != null ? objArr6[i] : null;
                obj7.getClass();
                VText vText = (VText) obj7;
                if (vText != null) {
                    String str = bLiveAuctionLeader.userInfo.userName;
                    str.getClass();
                    vText.setText(bf10.m103830g0(str, 4));
                    vText.setTextColor(n3d0.m161277a(n9c0.f140856p1));
                }
                Map<String, ? extends Object[]> map7 = this.seatResIdsMap;
                if (map7 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map7 = null;
                }
                Object[] objArr7 = map7.get("avatar");
                Object obj8 = objArr7 != null ? objArr7[i] : null;
                obj8.getClass();
                int i2 = qa00.f156292E;
                BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveAuctionLeader.userInfo;
                BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = bLiveAuctionUserInfo.avatarFrame;
                ((CommonMaskAvatarView) obj8).m73309q0(i2, bLiveVoiceMedalWallItemHeaderUrl.staticUrl, bLiveAuctionUserInfo.avatar, bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl);
                Map<String, ? extends Object[]> map8 = this.seatResIdsMap;
                if (map8 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map8 = null;
                }
                Object[] objArr8 = map8.get("avatar");
                Object obj9 = objArr8 != null ? objArr8[i] : null;
                obj9.getClass();
                czq.m113347c((CommonMaskAvatarView) obj9, new Function1() { // from class: l.p4v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj10) {
                        return LiveVoiceCallAuctionView.m79073K(this.f150565a, bLiveAuctionLeader, (View) obj10);
                    }
                });
                Map<String, ? extends Object[]> map9 = this.seatResIdsMap;
                if (map9 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map9 = null;
                }
                Object[] objArr9 = map9.get(FirebaseAnalytics.Param.PRICE);
                Object obj10 = objArr9 != null ? objArr9[i] : null;
                obj10.getClass();
                VText vText2 = (VText) obj10;
                if (vText2 != null) {
                    vText2.setText(yau.m214934b(bLiveAuctionLeader.amount));
                }
                int i3 = bLiveAuctionLeader.amountBackgroundId - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                Map<String, ? extends Object[]> map10 = this.seatResIdsMap;
                if (map10 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map10 = null;
                }
                Object[] objArr10 = map10.get(FirebaseAnalytics.Param.PRICE);
                Object obj11 = objArr10 != null ? objArr10[i] : null;
                obj11.getClass();
                int[] iArr = this.bidderLevelBg;
                ((VText) obj11).setBackgroundResource(iArr[i3 % iArr.length]);
                boolean zIsEmpty = TextUtils.isEmpty(bLiveAuctionLeader.background);
                Map<String, ? extends Object[]> map11 = this.seatResIdsMap;
                if (zIsEmpty) {
                    if (map11 == null) {
                        Intrinsics.m88391r("seatResIdsMap");
                        map11 = null;
                    }
                    Object[] objArr11 = map11.get("bidderBg");
                    obj = objArr11 != null ? objArr11[i] : null;
                    obj.getClass();
                    ((VDraweeView) obj).setActualImageResource(obc0.f146178S0);
                } else {
                    if (map11 == null) {
                        Intrinsics.m88391r("seatResIdsMap");
                        map11 = null;
                    }
                    Object[] objArr12 = map11.get("bidderBg");
                    obj = objArr12 != null ? objArr12[i] : null;
                    obj.getClass();
                    izs.m142870u("context_single_room", (SimpleDraweeView) obj, bLiveAuctionLeader.background, bnl0.m105587w(74.0f), bnl0.m105587w(100.0f));
                }
            } else {
                if (map == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map = null;
                }
                Object[] objArr13 = map.get("emptyOrder");
                Object obj12 = objArr13 != null ? objArr13[i] : null;
                obj12.getClass();
                bnl0.m105524M((View) obj12, true);
                Map<String, ? extends Object[]> map12 = this.seatResIdsMap;
                if (map12 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map12 = null;
                }
                Object[] objArr14 = map12.get("emptyOrder");
                Object obj13 = objArr14 != null ? objArr14[i] : null;
                obj13.getClass();
                ((TextView) obj13).setText(String.valueOf(i + 1));
                Map<String, ? extends Object[]> map13 = this.seatResIdsMap;
                if (map13 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map13 = null;
                }
                Object[] objArr15 = map13.get("avatar");
                Object obj14 = objArr15 != null ? objArr15[i] : null;
                obj14.getClass();
                bnl0.m105524M((View) obj14, false);
                Map<String, ? extends Object[]> map14 = this.seatResIdsMap;
                if (map14 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map14 = null;
                }
                Object[] objArr16 = map14.get(FirebaseAnalytics.Param.PRICE);
                Object obj15 = objArr16 != null ? objArr16[i] : null;
                obj15.getClass();
                bnl0.m105524M((View) obj15, false);
                Map<String, ? extends Object[]> map15 = this.seatResIdsMap;
                if (map15 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map15 = null;
                }
                Object[] objArr17 = map15.get("order");
                Object obj16 = objArr17 != null ? objArr17[i] : null;
                obj16.getClass();
                bnl0.m105524M((View) obj16, false);
                Map<String, ? extends Object[]> map16 = this.seatResIdsMap;
                if (map16 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map16 = null;
                }
                Object[] objArr18 = map16.get(AuthenticationTokenClaims.JSON_KEY_NAME);
                Object obj17 = objArr18 != null ? objArr18[i] : null;
                obj17.getClass();
                VText vText3 = (VText) obj17;
                vText3.setText(n3d0.m161280d(R$string.f47579Hk));
                vText3.setTextColor(n3d0.m161277a(n9c0.f140847m1));
                Map<String, ? extends Object[]> map17 = this.seatResIdsMap;
                if (map17 == null) {
                    Intrinsics.m88391r("seatResIdsMap");
                    map17 = null;
                }
                Object[] objArr19 = map17.get("bidderBg");
                obj = objArr19 != null ? objArr19[i] : null;
                obj.getClass();
                ((VDraweeView) obj).setActualImageResource(obc0.f146178S0);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final void m79096L(@NotNull final BLiveVoiceAuction auction) {
        auction.getClass();
        String str = auction.panelBgId;
        str.getClass();
        final BLiveAuctionUserInfo bLiveAuctionUserInfo = auction.guestUser;
        bLiveAuctionUserInfo.getClass();
        BLiveAuctionRelation bLiveAuctionRelation = auction.auctionRelation;
        bLiveAuctionRelation.getClass();
        List<BLiveAuctionLeader> list = auction.leaderboards;
        list.getClass();
        long j = auction.myLeaderboardGap;
        m79106y();
        bnl0.m105524M(this.f49104A, true);
        this.f49104A.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_single_room").m73296c(bLiveAuctionUserInfo.avatar).m73294a());
        if (!TextUtils.equals(auction.guestUser.userId, this.f49158w.m79112e())) {
            String str2 = auction.guestUser.userId;
            str2.getClass();
            T t = this.f49134a;
            t.getClass();
            t3m0.m189100n(str2, (i6t) t);
        }
        VoiceAuctionAvatarView voiceAuctionAvatarView = this.f49158w;
        Act act = getAct();
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = auction.guestUser;
        voiceAuctionAvatarView.m79117j(act, bLiveAuctionUserInfo2.profilePictures, bLiveAuctionUserInfo2.userId, qa00.f156324k);
        VoiceAuctionAvatarView voiceAuctionAvatarView2 = this.f49158w;
        voiceAuctionAvatarView2.getClass();
        czq.m113347c(voiceAuctionAvatarView2, new Function1() { // from class: l.k4v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m79084n(this.f123928a, bLiveAuctionUserInfo, auction, (View) obj);
            }
        });
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this.f49104A;
        commonAnimMaskAvatarView.getClass();
        czq.m113347c(commonAnimMaskAvatarView, new Function1() { // from class: l.l4v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m79083m(this.f130016a, bLiveAuctionUserInfo, auction, (View) obj);
            }
        });
        TextView textView = this.f49105B;
        String str3 = bLiveAuctionUserInfo.userName;
        str3.getClass();
        textView.setText(bf10.m103830g0(str3, 4));
        this.f49106C.setText("总身价:" + yau.m214934b(bLiveAuctionUserInfo.curWorth));
        this.f49105B.setTextColor(n3d0.m161277a(n9c0.f140856p1));
        this.f49143j.setText("竞拍");
        bnl0.m105509E0(this.f49143j, new View.OnClickListener() { // from class: l.m4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVoiceCallAuctionView.m79089v(this.f134835a, view);
            }
        });
        T t2 = this.f49134a;
        t2.getClass();
        boolean zM139137h = i9o0.m139137h((i6t) t2);
        VText vText = this.f49144k;
        if (zM139137h) {
            bnl0.m105524M(vText, true);
        } else {
            bnl0.m105524M(vText, false);
        }
        izs.m142868s("context_single_room", this.f49107D, bLiveAuctionRelation.image);
        this.f49108E.setTextColor(n3d0.m161277a(n9c0.f140856p1));
        this.f49108E.setText(bLiveAuctionRelation.name);
        bnl0.m105524M(this.f49110F, true);
        this.f49110F.setText("关系");
        this.f49112G.f53807o = "";
        BLiveAuctionAsset bLiveAuctionAssetM222761e = ((rwn0) ((o81) this.f49134a).m213810E2()).f165190M.m222761e();
        if (bLiveAuctionAssetM222761e != null) {
            this.f49112G.m79055k0(bLiveAuctionUserInfo.curLevel, bLiveAuctionUserInfo.curWorth, bLiveAuctionAssetM222761e.auctionLevels, auction.worthBubble);
        }
        m79095J(list);
        m79102R(j);
        m79107z(str);
    }

    /* JADX INFO: renamed from: M */
    public final void m79097M() {
        m79099O();
    }

    /* JADX INFO: renamed from: N */
    public final void m79098N(BLiveAuctionUserInfo guestUser, BLiveAuctionUserInfo winnerUser) {
        bnl0.m105524M(this.f49157v, !TextUtils.isEmpty(guestUser.tagImage));
        if (!TextUtils.isEmpty(guestUser.tagImage)) {
            this.f49156u.setText("");
            izs.m142868s("context_single_room", this.f49157v, guestUser.tagImage);
        }
        bnl0.m105524M(this.f49153r, !TextUtils.isEmpty(winnerUser.tagImage));
        if (TextUtils.isEmpty(winnerUser.tagImage)) {
            return;
        }
        this.f49152q.setText("");
        izs.m142868s("context_single_room", this.f49153r, winnerUser.tagImage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m79099O() {
        this.f49137d.m78776c(new q6s(false, "res://drawable/" + obc0.f146385k, "拍拍关系，获得限定关系卡", false, 9, null));
        m79106y();
        bnl0.m105524M(this.f49104A, false);
        this.f49158w.m79117j(getAct(), jyb.m147507f0("res://drawable/" + obc0.f146409m), null, 0.0f);
        this.f49158w.setOnClickListener(null);
        this.f49105B.setText(n3d0.m161280d(R$string.f47579Hk));
        this.f49105B.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        this.f49106C.setText("总身价:0");
        this.f49143j.setText("上拍");
        bnl0.m105524M(this.f49144k, false);
        bnl0.m105509E0(this.f49143j, new View.OnClickListener() { // from class: l.o4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVoiceCallAuctionView.m79078f(this.f145012a, view);
            }
        });
        izs.m142868s("context_single_room", this.f49107D, "res://drawable/" + obc0.f146397l);
        this.f49108E.setText("拍拍关系");
        this.f49108E.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        bnl0.m105524M(this.f49110F, true);
        this.f49110F.setText("暂无");
        this.f49112G.f53807o = "";
        BLiveAuctionAsset bLiveAuctionAssetM222761e = ((rwn0) ((o81) this.f49134a).m213810E2()).f165190M.m222761e();
        if (bLiveAuctionAssetM222761e != null) {
            this.f49112G.m79055k0(0, 0L, bLiveAuctionAssetM222761e.auctionLevels, "");
        }
        bnl0.m105524M(this.f49117I0, false);
        int i = 0;
        while (i < 3) {
            Map<String, ? extends Object[]> map = this.seatResIdsMap;
            if (map == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map = null;
            }
            Object[] objArr = map.get("avatar");
            Object obj = objArr != null ? objArr[i] : null;
            obj.getClass();
            bnl0.m105524M((View) obj, false);
            Map<String, ? extends Object[]> map2 = this.seatResIdsMap;
            if (map2 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map2 = null;
            }
            Object[] objArr2 = map2.get("emptyOrder");
            Object obj2 = objArr2 != null ? objArr2[i] : null;
            obj2.getClass();
            bnl0.m105524M((View) obj2, true);
            Map<String, ? extends Object[]> map3 = this.seatResIdsMap;
            if (map3 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map3 = null;
            }
            Object[] objArr3 = map3.get("emptyOrder");
            Object obj3 = objArr3 != null ? objArr3[i] : null;
            obj3.getClass();
            int i2 = i + 1;
            ((TextView) obj3).setText(String.valueOf(i2));
            Map<String, ? extends Object[]> map4 = this.seatResIdsMap;
            if (map4 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map4 = null;
            }
            Object[] objArr4 = map4.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            Object obj4 = objArr4 != null ? objArr4[i] : null;
            obj4.getClass();
            ((VText) obj4).setText(n3d0.m161280d(R$string.f47579Hk));
            Map<String, ? extends Object[]> map5 = this.seatResIdsMap;
            if (map5 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map5 = null;
            }
            Object[] objArr5 = map5.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            Object obj5 = objArr5 != null ? objArr5[i] : null;
            obj5.getClass();
            ((VText) obj5).setTextColor(n3d0.m161277a(n9c0.f140847m1));
            Map<String, ? extends Object[]> map6 = this.seatResIdsMap;
            if (map6 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map6 = null;
            }
            Object[] objArr6 = map6.get("order");
            Object obj6 = objArr6 != null ? objArr6[i] : null;
            obj6.getClass();
            bnl0.m105524M((View) obj6, false);
            Map<String, ? extends Object[]> map7 = this.seatResIdsMap;
            if (map7 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map7 = null;
            }
            Object[] objArr7 = map7.get(FirebaseAnalytics.Param.PRICE);
            Object obj7 = objArr7 != null ? objArr7[i] : null;
            obj7.getClass();
            bnl0.m105524M((View) obj7, false);
            Map<String, ? extends Object[]> map8 = this.seatResIdsMap;
            if (map8 == null) {
                Intrinsics.m88391r("seatResIdsMap");
                map8 = null;
            }
            Object[] objArr8 = map8.get("bidderBg");
            Object obj8 = objArr8 != null ? objArr8[i] : null;
            obj8.getClass();
            ((VDraweeView) obj8).setActualImageResource(obc0.f146178S0);
            i = i2;
        }
        m79107z(null);
        m79102R(-1L);
        bnl0.m105524M(this.f49157v, false);
        bnl0.m105524M(this.f49153r, false);
    }

    /* JADX INFO: renamed from: P */
    public final void m79100P(@Nullable BLiveAuctionUserInfo auctionUser, @Nullable BLiveAuctionRelation actionRelation) {
        String str;
        String str2;
        Resources resources;
        if (getShowedActionGuideTip().get().booleanValue() || C4499d.m21895l().m21911x(y6s.f197709b)) {
            return;
        }
        C4496a c4496a = new C4496a(getAct());
        if (TextUtils.isEmpty(auctionUser != null ? auctionUser.userId : null)) {
            str2 = "上竞拍位，他人可竞争与你的好友关系，定拍后榜一将会和你直接配对成功";
        } else {
            String str3 = TextUtils.equals(auctionUser != null ? auctionUser.gender : null, "male") ? "他" : "她";
            if (actionRelation == null || (str = actionRelation.name) == null) {
                str = "关系";
            }
            str2 = str3 + "正在寻找" + str + "，定拍后" + str3 + "将会和榜一直接配对成功";
        }
        C4496a c4496aM21873p = c4496a.m21846B(qa00.f156322i).m21848D(str2).m21854J(13.0f).m21873p(75);
        Act act = getAct();
        c4496aM21873p.m21869k((act == null || (resources = act.getResources()) == null) ? -1 : resources.getColor(n9c0.f140855p0)).m21874q(C4496a.f16402Q | C4496a.f16400O).m21857M(true).m21860b(8000L).m21881x(50);
        C4499d.m21895l().m21908u(c4496a, this.f49158w, y6s.f197710c);
        getShowedActionGuideTip().put(Boolean.TRUE);
        T t = this.f49134a;
        t.getClass();
        t3m0.m189097k((i6t) t);
    }

    /* JADX INFO: renamed from: Q */
    public final void m79101Q(@NotNull String newMask) {
        newMask.getClass();
        if (bnl0.m105529O0(this.f49104A)) {
            this.f49104A.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_single_room").m73296c(newMask).m73294a());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m79102R(long gap) {
        Resources resources;
        Resources resources2;
        TextView textView = this.f49115H0;
        if (gap <= 0) {
            bnl0.m105524M(textView, false);
            return;
        }
        bnl0.m105524M(textView, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "你距离上榜还差 ").append((CharSequence) (gap < 10000 ? String.valueOf(gap) : new DecimalFormat("0.#万").format(gap / 10000.0d)));
        Act act = getAct();
        spannableStringBuilder.setSpan(new ForegroundColorSpan((act == null || (resources2 = act.getResources()) == null) ? Color.parseColor("#66FFFFFF") : resources2.getColor(n9c0.f140847m1)), 0, 8, 18);
        Act act2 = getAct();
        spannableStringBuilder.setSpan(new ForegroundColorSpan((act2 == null || (resources = act2.getResources()) == null) ? Color.parseColor("#E29154") : resources.getColor(n9c0.f140831h0)), 8, spannableStringBuilder.length(), 34);
        this.f49115H0.setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m79103S(@NotNull String panelBgId, @NotNull BLiveAuctionUserInfo guestUser, @NotNull String wealthBubble) {
        panelBgId.getClass();
        guestUser.getClass();
        wealthBubble.getClass();
        this.f49106C.setText("总身价:" + yau.m214934b(guestUser.curWorth));
        if (!bnl0.m105529O0(this.f49157v)) {
            this.f49156u.setText("总身价:" + yau.m214934b(guestUser.curWorth));
        }
        BLiveAuctionAsset bLiveAuctionAssetM222761e = ((rwn0) ((o81) this.f49134a).m213810E2()).f165190M.m222761e();
        if (bLiveAuctionAssetM222761e != null) {
            this.f49112G.m79055k0(guestUser.curLevel, guestUser.curWorth, bLiveAuctionAssetM222761e.auctionLevels, wealthBubble);
        }
        m79107z(panelBgId);
    }

    /* JADX INFO: renamed from: T */
    public final void m79104T(@NotNull List<? extends BLiveAuctionLeader> leaderBoards) {
        leaderBoards.getClass();
        m79095J(leaderBoards);
    }

    @Nullable
    public final String getCurPanelBgUrl() {
        return this.curPanelBgUrl;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.seatResIdsMap = MapsKt.mapOf(TuplesKt.m88129a("avatar", new CommonMaskAvatarView[]{this.f49122L, this.f49129S, this.f49109E0}), TuplesKt.m88129a("order", new VText[]{this.f49123M, this.f49130T, this.f49111F0}), TuplesKt.m88129a(AuthenticationTokenClaims.JSON_KEY_NAME, new VText[]{this.f49124N, this.f49131U, this.f49113G0}), TuplesKt.m88129a(FirebaseAnalytics.Param.PRICE, new VText[]{this.f49118J, this.f49127Q, this.f49145k0}), TuplesKt.m88129a("emptyOrder", new VText[]{this.f49120K, this.f49128R, this.f49151p0}), TuplesKt.m88129a("bidderBg", new VDraweeView[]{this.f49116I, this.f49126P, this.f49133W}));
    }

    public final void setCurPanelBgUrl(@Nullable String str) {
        this.curPanelBgUrl = str;
    }

    /* JADX INFO: renamed from: x */
    public final void m79105x() {
        bnl0.m105524M(this.f49139f, true);
        bnl0.m105524M(this.f49157v, true);
        bnl0.m105524M(this.f49153r, true);
        bnl0.m105524M(this.f49141h, false);
        bnl0.m105525M0(this.f49140g, false);
        bnl0.m105524M(this.f49115H0, false);
    }

    /* JADX INFO: renamed from: y */
    public final void m79106y() {
        bnl0.m105524M(this.f49139f, false);
        bnl0.m105524M(this.f49157v, false);
        bnl0.m105524M(this.f49153r, false);
        bnl0.m105524M(this.f49141h, true);
        bnl0.m105525M0(this.f49140g, true);
    }

    /* JADX INFO: renamed from: z */
    public final void m79107z(@Nullable String panelBg) {
        String str;
        if (TextUtils.isEmpty(panelBg)) {
            this.curPanelBgUrl = null;
            this.f49136c.m69687n();
            bnl0.m105525M0(this.f49136c, false);
            return;
        }
        if (TextUtils.equals(this.curPanelBgUrl, panelBg)) {
            return;
        }
        if (panelBg != null) {
            switch (panelBg) {
                case "1":
                    str = "https://fe-static.tancdn.com/v1/raw/059c7f9d-0db8-4e44-9484-be5d9eed07c513.svga";
                    break;
                case "2":
                    str = "https://fe-static.tancdn.com/v1/raw/4dde7f26-66e1-455e-8642-b129fec6698d12.svga";
                    break;
                case "3":
                    str = "https://fe-static.tancdn.com/v1/raw/9461e7f1-548e-4ed9-8821-eb5324fed36212.svga";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = null;
        }
        this.curPanelBgUrl = str;
        AnimEffectPlayer animEffectPlayer = this.f49136c;
        if (str == null) {
            bnl0.m105525M0(animEffectPlayer, false);
            return;
        }
        bnl0.m105525M0(animEffectPlayer, true);
        this.f49136c.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f49136c.m69682i(str, -1, null, true);
    }
}
