package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.AuctionState;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLeader;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionViewBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
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
import p147v.VDraweeView;
import p147v.VText;
import p149l.cn5;
import p149l.cxq;
import p149l.e0o0;
import p149l.h1c0;
import p149l.h4t;
import p149l.h81;
import p149l.hpd0;
import p149l.hxs;
import p149l.i3c0;
import p149l.j6f;
import p149l.kvc0;
import p149l.nnn0;
import p149l.p4s;
import p149l.pul0;
import p149l.r610;
import p149l.t100;
import p149l.vwb;
import p149l.x4s;
import p149l.x7n0;
import p149l.x8u;
import p149l.xdl0;
import p149l.xh0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020\t2\u0006\u0010+\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010-\u001a\u00020'2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J%\u00103\u001a\u00020\t2\u0006\u0010+\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00102\u001a\u00020'¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b5\u0010\u0011J\u0015\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J%\u0010<\u001a\u00020\t2\u0006\u0010:\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020'2\u0006\u0010;\u001a\u00020'¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020#¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\t2\u0006\u0010B\u001a\u00020'¢\u0006\u0004\bC\u0010*R\u001b\u0010I\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010N\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\b\u0012\u0006\u0012\u0002\b\u00030K0J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010X\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010*¨\u0006Y"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceCallAuctionViewBindings;", "Ll/h81;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", BaseSei.f13931Y, "()V", BaseSei.f13930X, "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionLeader;", "leaderBoards", "J", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;", "guestUser", "winnerUser", "N", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;)V", "Landroid/view/ViewGroup;", "root", "A", "(Landroid/view/ViewGroup;)V", "onFinishInflate", "auctionUser", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "actionRelation", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;)V", BloodType.f38728O, "M", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;", "auction", "L", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;)V", "", "panelBg", BaseSei.f13932Z, "(Ljava/lang/String;)V", "panelBgId", "auctionRelation", "worthBubble", "", "isChoosingPledge", "G", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Ljava/lang/String;Z)V", "wealthBubble", j6f.LATITUDE_SOUTH, "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveAuctionUserInfo;Ljava/lang/String;)V", j6f.GPS_DIRECTION_TRUE, "", "gap", "R", "(J)V", "isCollapse", "whoInProcessing", "I", "(ZLjava/lang/String;Ljava/lang/String;)V", "isManager", "newAuction", "B", "(ZLcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;)V", "newMask", "Q", "Ll/hpd0;", "L0", "Lkotlin/Lazy;", "getShowedActionGuideTip", "()Ll/hpd0;", "showedActionGuideTip", "", "", "M0", "Ljava/util/Map;", "seatResIdsMap", "", "N0", "[I", "bidderLevelBg", "O0", "Ljava/lang/String;", "getCurPanelBgUrl", "()Ljava/lang/String;", "setCurPanelBgUrl", "curPanelBgUrl", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LiveVoiceCallAuctionView extends LiveVoiceCallAuctionViewBindings<h81> {

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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C12993a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return cn5.m107733d(Integer.valueOf(((BLiveAuctionLeader) t).rank), Integer.valueOf(((BLiveAuctionLeader) t2).rank));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceCallAuctionView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.showedActionGuideTip = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.f2v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveVoiceCallAuctionView.m77907w();
            }
        });
        this.bidderLevelBg = new int[]{i3c0.f110971c9, i3c0.f110983d9, i3c0.f110995e9, i3c0.f111007f9};
    }

    /* JADX INFO: renamed from: C */
    public static final void m77886C(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveVoiceAuction bLiveVoiceAuction, View view) {
        ((h81) liveVoiceCallAuctionView.f48286a).m129851D4(bLiveVoiceAuction);
    }

    /* JADX INFO: renamed from: E */
    public static final void m77887E(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((h81) liveVoiceCallAuctionView.f48286a).m129859t4("failAuction");
    }

    /* JADX INFO: renamed from: F */
    public static final void m77888F(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((h81) liveVoiceCallAuctionView.f48286a).m129859t4("endAuction");
    }

    /* JADX INFO: renamed from: H */
    public static final void m77889H(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((h81) liveVoiceCallAuctionView.f48286a).m129859t4("endAuction");
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m77890K(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionLeader bLiveAuctionLeader, View view) {
        view.getClass();
        h81 h81Var = (h81) liveVoiceCallAuctionView.f48286a;
        String str = bLiveAuctionLeader.userInfo.userId;
        str.getClass();
        h81Var.m129861z4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m77891b(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        ((h81) liveVoiceCallAuctionView.f48286a).m129858s4();
    }

    /* JADX INFO: renamed from: d */
    public static void m77893d(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, final BLiveVoiceAuction bLiveVoiceAuction, View view) {
        new xh0.C21150a(liveVoiceCallAuctionView.getAct()).m208731j("确定定拍吗？").m208739r("确定").m208727f("取消").m208729h(false).m208736o(new View.OnClickListener() { // from class: l.s2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m77886C(this.f162019a, bLiveVoiceAuction, view2);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: f */
    public static void m77895f(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        T t = liveVoiceCallAuctionView.f48286a;
        t.getClass();
        pul0.m171449g((h4t) t, true);
        ((h81) liveVoiceCallAuctionView.f48286a).m129856q4();
    }

    private final hpd0 getShowedActionGuideTip() {
        return (hpd0) this.showedActionGuideTip.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m77896i(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, View view) {
        view.getClass();
        h81 h81Var = (h81) liveVoiceCallAuctionView.f48286a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        h81Var.m129861z4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m77897j(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, View view) {
        view.getClass();
        h81 h81Var = (h81) liveVoiceCallAuctionView.f48286a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        h81Var.m129861z4(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static void m77898k(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        new xh0.C21150a(liveVoiceCallAuctionView.getAct()).m208731j("确定结束拍拍吗？").m208739r("确定").m208729h(false).m208727f("取消").m208736o(new View.OnClickListener() { // from class: l.t2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m77888F(this.f167552a, view2);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: l */
    public static void m77899l(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        new xh0.C21150a(liveVoiceCallAuctionView.getAct()).m208731j("确定流拍吗？").m208739r("确定").m208729h(false).m208727f("取消").m208736o(new View.OnClickListener() { // from class: l.i2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m77887E(this.f110595a, view2);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: m */
    public static Unit m77900m(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, BLiveVoiceAuction bLiveVoiceAuction, View view) {
        view.getClass();
        h81 h81Var = (h81) liveVoiceCallAuctionView.f48286a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        h81Var.m129861z4(str);
        String str2 = bLiveVoiceAuction.guestUser.userId;
        str2.getClass();
        T t = liveVoiceCallAuctionView.f48286a;
        t.getClass();
        pul0.m171455m(str2, "cartoon_avatar", (h4t) t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static Unit m77901n(LiveVoiceCallAuctionView liveVoiceCallAuctionView, BLiveAuctionUserInfo bLiveAuctionUserInfo, BLiveVoiceAuction bLiveVoiceAuction, View view) {
        view.getClass();
        h81 h81Var = (h81) liveVoiceCallAuctionView.f48286a;
        String str = bLiveAuctionUserInfo.userId;
        str.getClass();
        h81Var.m129861z4(str);
        String str2 = bLiveVoiceAuction.guestUser.userId;
        str2.getClass();
        T t = liveVoiceCallAuctionView.f48286a;
        t.getClass();
        pul0.m171455m(str2, ReminderAction.photo, (h4t) t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static void m77904s(final LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        new xh0.C21150a(liveVoiceCallAuctionView.getAct()).m208731j("确定结束拍拍吗？").m208739r("确定").m208729h(false).m208727f("取消").m208736o(new View.OnClickListener() { // from class: l.m2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LiveVoiceCallAuctionView.m77889H(this.f130945a, view2);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: v */
    public static void m77906v(LiveVoiceCallAuctionView liveVoiceCallAuctionView, View view) {
        T t = liveVoiceCallAuctionView.f48286a;
        t.getClass();
        pul0.m171449g((h4t) t, false);
        ((h81) liveVoiceCallAuctionView.f48286a).m129857r4();
    }

    /* JADX INFO: renamed from: w */
    public static hpd0 m77907w() {
        return new hpd0("showed_auction_guide_tip_" + ypv.f199493a.m199309D0(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: A */
    public final void m77908A(@NotNull ViewGroup root) {
        root.getClass();
        xdl0.m208372e0(this.f48289d, t100.f167276y);
        xdl0.m208327D0(x7n0.m207301a(), this.f48290e);
        xdl0.m208327D0(x7n0.m207301a(), this.f48288c);
    }

    /* JADX INFO: renamed from: B */
    public final void m77909B(boolean isManager, @NotNull final BLiveVoiceAuction newAuction) {
        newAuction.getClass();
        if (!isManager) {
            xdl0.m208344M(this.f48296k, false);
            xdl0.m208344M(this.f48271J0, false);
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
            xdl0.m208344M(this.f48296k, false);
            xdl0.m208344M(this.f48271J0, true);
            xdl0.m208329E0(this.f48271J0, new View.OnClickListener() { // from class: l.r2v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionView.m77898k(this.f157453a, view);
                }
            });
            return;
        }
        if (str.equals("ongoing")) {
            xdl0.m208344M(this.f48296k, true);
            boolean zM200296J = vwb.m200296J(newAuction.leaderboards);
            VText vText = this.f48296k;
            if (zM200296J) {
                vText.setText("流拍");
                xdl0.m208329E0(this.f48296k, new View.OnClickListener() { // from class: l.q2v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveVoiceCallAuctionView.m77899l(this.f152312a, view);
                    }
                });
            } else {
                vText.setText("定拍");
                xdl0.m208329E0(this.f48296k, new View.OnClickListener() { // from class: l.p2v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveVoiceCallAuctionView.m77893d(this.f146931a, newAuction, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m77910G(@NotNull String panelBgId, @NotNull final BLiveAuctionUserInfo guestUser, @NotNull BLiveAuctionRelation auctionRelation, @NotNull final BLiveAuctionUserInfo winnerUser, @NotNull String worthBubble, boolean isChoosingPledge) {
        panelBgId.getClass();
        guestUser.getClass();
        auctionRelation.getClass();
        winnerUser.getClass();
        worthBubble.getClass();
        m77922x();
        xdl0.m208344M(this.f48256A, false);
        hxs.m133406s("context_single_room", this.f48306s, guestUser.avatar);
        VText vText = this.f48271J0;
        if (isChoosingPledge) {
            vText.setEnabled(true);
            this.f48271J0.setTextColor(kvc0.m147352a(h1c0.f105377j1));
            this.f48271J0.setText("称号选择中...");
        } else {
            vText.setEnabled(true);
            this.f48271J0.setTextColor(kvc0.m147352a(h1c0.f105386m1));
            this.f48271J0.setText("结束拍卖");
        }
        TextView textView = this.f48307t;
        String str = guestUser.userName;
        str.getClass();
        textView.setText(r610.m178001g0(str, 4));
        this.f48308u.setText("总身价:" + x8u.m207432b(guestUser.curWorth));
        VDraweeView vDraweeView = this.f48306s;
        vDraweeView.getClass();
        cxq.m109105c(vDraweeView, new Function1() { // from class: l.u2v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m77897j(this.f173520a, guestUser, (View) obj);
            }
        });
        xdl0.m208344M(this.f48262F, false);
        hxs.m133406s("context_single_room", this.f48299m, auctionRelation.image);
        this.f48300n.setText(auctionRelation.name);
        hxs.m133406s("context_single_room", this.f48301o, winnerUser.avatar);
        VDraweeView vDraweeView2 = this.f48301o;
        vDraweeView2.getClass();
        cxq.m109105c(vDraweeView2, new Function1() { // from class: l.v2v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m77896i(this.f179610a, winnerUser, (View) obj);
            }
        });
        TextView textView2 = this.f48302p;
        String str2 = winnerUser.userName;
        str2.getClass();
        textView2.setText(r610.m178001g0(str2, 4));
        xdl0.m208329E0(this.f48273K0, new View.OnClickListener() { // from class: l.g2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVoiceCallAuctionView.m77891b(this.f100306a, view);
            }
        });
        m77920S(panelBgId, guestUser, worthBubble);
        xdl0.m208344M(this.f48296k, false);
        T t = this.f48286a;
        t.getClass();
        boolean zM114322h = e0o0.m114322h((h4t) t);
        VText vText2 = this.f48271J0;
        if (zM114322h) {
            xdl0.m208344M(vText2, true);
            xdl0.m208329E0(this.f48271J0, new View.OnClickListener() { // from class: l.h2v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionView.m77904s(this.f105564a, view);
                }
            });
        } else {
            xdl0.m208344M(vText2, false);
        }
        m77915N(guestUser, winnerUser);
    }

    /* JADX INFO: renamed from: I */
    public final void m77911I(boolean isCollapse, @NotNull String auctionUser, @NotNull String whoInProcessing) {
        auctionUser.getClass();
        whoInProcessing.getClass();
        xdl0.m208344M(this.f48290e, !isCollapse);
        this.f48289d.m77592b(new p4s(isCollapse, auctionUser, whoInProcessing, true));
    }

    /* JADX INFO: renamed from: J */
    public final void m77912J(List<? extends BLiveAuctionLeader> leaderBoards) {
        Object obj;
        if (leaderBoards != null) {
            CollectionsKt.sortedWith(leaderBoards, new C12993a());
        }
        int i = 0;
        while (i < 3) {
            final BLiveAuctionLeader bLiveAuctionLeader = (i >= (leaderBoards != null ? leaderBoards.size() : 0) || leaderBoards == null) ? null : leaderBoards.get(i);
            Map<String, ? extends Object[]> map = this.seatResIdsMap;
            if (bLiveAuctionLeader != null) {
                if (map == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map = null;
                }
                Object[] objArr = map.get("emptyOrder");
                Object obj2 = objArr != null ? objArr[i] : null;
                obj2.getClass();
                xdl0.m208344M((View) obj2, false);
                Map<String, ? extends Object[]> map2 = this.seatResIdsMap;
                if (map2 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map2 = null;
                }
                Object[] objArr2 = map2.get("avatar");
                Object obj3 = objArr2 != null ? objArr2[i] : null;
                obj3.getClass();
                xdl0.m208344M((View) obj3, true);
                Map<String, ? extends Object[]> map3 = this.seatResIdsMap;
                if (map3 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map3 = null;
                }
                Object[] objArr3 = map3.get(FirebaseAnalytics.Param.PRICE);
                Object obj4 = objArr3 != null ? objArr3[i] : null;
                obj4.getClass();
                xdl0.m208344M((View) obj4, true);
                Map<String, ? extends Object[]> map4 = this.seatResIdsMap;
                if (map4 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map4 = null;
                }
                Object[] objArr4 = map4.get("order");
                Object obj5 = objArr4 != null ? objArr4[i] : null;
                obj5.getClass();
                xdl0.m208344M((View) obj5, true);
                Map<String, ? extends Object[]> map5 = this.seatResIdsMap;
                if (map5 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map5 = null;
                }
                Object[] objArr5 = map5.get("order");
                Object obj6 = objArr5 != null ? objArr5[i] : null;
                obj6.getClass();
                ((VText) obj6).setText(String.valueOf(i + 1));
                Map<String, ? extends Object[]> map6 = this.seatResIdsMap;
                if (map6 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map6 = null;
                }
                Object[] objArr6 = map6.get(AuthenticationTokenClaims.JSON_KEY_NAME);
                Object obj7 = objArr6 != null ? objArr6[i] : null;
                obj7.getClass();
                VText vText = (VText) obj7;
                if (vText != null) {
                    String str = bLiveAuctionLeader.userInfo.userName;
                    str.getClass();
                    vText.setText(r610.m178001g0(str, 4));
                    vText.setTextColor(kvc0.m147352a(h1c0.f105395p1));
                }
                Map<String, ? extends Object[]> map7 = this.seatResIdsMap;
                if (map7 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map7 = null;
                }
                Object[] objArr7 = map7.get("avatar");
                Object obj8 = objArr7 != null ? objArr7[i] : null;
                obj8.getClass();
                int i2 = t100.f167230E;
                BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveAuctionLeader.userInfo;
                BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = bLiveAuctionUserInfo.avatarFrame;
                ((CommonMaskAvatarView) obj8).m72126q0(i2, bLiveVoiceMedalWallItemHeaderUrl.staticUrl, bLiveAuctionUserInfo.avatar, bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl);
                Map<String, ? extends Object[]> map8 = this.seatResIdsMap;
                if (map8 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map8 = null;
                }
                Object[] objArr8 = map8.get("avatar");
                Object obj9 = objArr8 != null ? objArr8[i] : null;
                obj9.getClass();
                cxq.m109105c((CommonMaskAvatarView) obj9, new Function1() { // from class: l.o2v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj10) {
                        return LiveVoiceCallAuctionView.m77890K(this.f141557a, bLiveAuctionLeader, (View) obj10);
                    }
                });
                Map<String, ? extends Object[]> map9 = this.seatResIdsMap;
                if (map9 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map9 = null;
                }
                Object[] objArr9 = map9.get(FirebaseAnalytics.Param.PRICE);
                Object obj10 = objArr9 != null ? objArr9[i] : null;
                obj10.getClass();
                VText vText2 = (VText) obj10;
                if (vText2 != null) {
                    vText2.setText(x8u.m207432b(bLiveAuctionLeader.amount));
                }
                int i3 = bLiveAuctionLeader.amountBackgroundId - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                Map<String, ? extends Object[]> map10 = this.seatResIdsMap;
                if (map10 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
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
                        Intrinsics.m87502r("seatResIdsMap");
                        map11 = null;
                    }
                    Object[] objArr11 = map11.get("bidderBg");
                    obj = objArr11 != null ? objArr11[i] : null;
                    obj.getClass();
                    ((VDraweeView) obj).setActualImageResource(i3c0.f110850S0);
                } else {
                    if (map11 == null) {
                        Intrinsics.m87502r("seatResIdsMap");
                        map11 = null;
                    }
                    Object[] objArr12 = map11.get("bidderBg");
                    obj = objArr12 != null ? objArr12[i] : null;
                    obj.getClass();
                    hxs.m133408u("context_single_room", (SimpleDraweeView) obj, bLiveAuctionLeader.background, xdl0.m208407w(74.0f), xdl0.m208407w(100.0f));
                }
            } else {
                if (map == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map = null;
                }
                Object[] objArr13 = map.get("emptyOrder");
                Object obj12 = objArr13 != null ? objArr13[i] : null;
                obj12.getClass();
                xdl0.m208344M((View) obj12, true);
                Map<String, ? extends Object[]> map12 = this.seatResIdsMap;
                if (map12 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map12 = null;
                }
                Object[] objArr14 = map12.get("emptyOrder");
                Object obj13 = objArr14 != null ? objArr14[i] : null;
                obj13.getClass();
                ((TextView) obj13).setText(String.valueOf(i + 1));
                Map<String, ? extends Object[]> map13 = this.seatResIdsMap;
                if (map13 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map13 = null;
                }
                Object[] objArr15 = map13.get("avatar");
                Object obj14 = objArr15 != null ? objArr15[i] : null;
                obj14.getClass();
                xdl0.m208344M((View) obj14, false);
                Map<String, ? extends Object[]> map14 = this.seatResIdsMap;
                if (map14 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map14 = null;
                }
                Object[] objArr16 = map14.get(FirebaseAnalytics.Param.PRICE);
                Object obj15 = objArr16 != null ? objArr16[i] : null;
                obj15.getClass();
                xdl0.m208344M((View) obj15, false);
                Map<String, ? extends Object[]> map15 = this.seatResIdsMap;
                if (map15 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map15 = null;
                }
                Object[] objArr17 = map15.get("order");
                Object obj16 = objArr17 != null ? objArr17[i] : null;
                obj16.getClass();
                xdl0.m208344M((View) obj16, false);
                Map<String, ? extends Object[]> map16 = this.seatResIdsMap;
                if (map16 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map16 = null;
                }
                Object[] objArr18 = map16.get(AuthenticationTokenClaims.JSON_KEY_NAME);
                Object obj17 = objArr18 != null ? objArr18[i] : null;
                obj17.getClass();
                VText vText3 = (VText) obj17;
                vText3.setText(kvc0.m147355d(R$string.f46731Hk));
                vText3.setTextColor(kvc0.m147352a(h1c0.f105386m1));
                Map<String, ? extends Object[]> map17 = this.seatResIdsMap;
                if (map17 == null) {
                    Intrinsics.m87502r("seatResIdsMap");
                    map17 = null;
                }
                Object[] objArr19 = map17.get("bidderBg");
                obj = objArr19 != null ? objArr19[i] : null;
                obj.getClass();
                ((VDraweeView) obj).setActualImageResource(i3c0.f110850S0);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final void m77913L(@NotNull final BLiveVoiceAuction auction) {
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
        m77923y();
        xdl0.m208344M(this.f48256A, true);
        this.f48256A.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_single_room").m72113c(bLiveAuctionUserInfo.avatar).m72111a());
        if (!TextUtils.equals(auction.guestUser.userId, this.f48310w.m77929e())) {
            String str2 = auction.guestUser.userId;
            str2.getClass();
            T t = this.f48286a;
            t.getClass();
            pul0.m171456n(str2, (h4t) t);
        }
        VoiceAuctionAvatarView voiceAuctionAvatarView = this.f48310w;
        Act act = getAct();
        BLiveAuctionUserInfo bLiveAuctionUserInfo2 = auction.guestUser;
        voiceAuctionAvatarView.m77934j(act, bLiveAuctionUserInfo2.profilePictures, bLiveAuctionUserInfo2.userId, t100.f167262k);
        VoiceAuctionAvatarView voiceAuctionAvatarView2 = this.f48310w;
        voiceAuctionAvatarView2.getClass();
        cxq.m109105c(voiceAuctionAvatarView2, new Function1() { // from class: l.j2v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m77901n(this.f115968a, bLiveAuctionUserInfo, auction, (View) obj);
            }
        });
        CommonAnimMaskAvatarView commonAnimMaskAvatarView = this.f48256A;
        commonAnimMaskAvatarView.getClass();
        cxq.m109105c(commonAnimMaskAvatarView, new Function1() { // from class: l.k2v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceCallAuctionView.m77900m(this.f120765a, bLiveAuctionUserInfo, auction, (View) obj);
            }
        });
        TextView textView = this.f48257B;
        String str3 = bLiveAuctionUserInfo.userName;
        str3.getClass();
        textView.setText(r610.m178001g0(str3, 4));
        this.f48258C.setText("总身价:" + x8u.m207432b(bLiveAuctionUserInfo.curWorth));
        this.f48257B.setTextColor(kvc0.m147352a(h1c0.f105395p1));
        this.f48295j.setText("竞拍");
        xdl0.m208329E0(this.f48295j, new View.OnClickListener() { // from class: l.l2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVoiceCallAuctionView.m77906v(this.f125815a, view);
            }
        });
        T t2 = this.f48286a;
        t2.getClass();
        boolean zM114322h = e0o0.m114322h((h4t) t2);
        VText vText = this.f48296k;
        if (zM114322h) {
            xdl0.m208344M(vText, true);
        } else {
            xdl0.m208344M(vText, false);
        }
        hxs.m133406s("context_single_room", this.f48259D, bLiveAuctionRelation.image);
        this.f48260E.setTextColor(kvc0.m147352a(h1c0.f105395p1));
        this.f48260E.setText(bLiveAuctionRelation.name);
        xdl0.m208344M(this.f48262F, true);
        this.f48262F.setText("关系");
        this.f48264G.f52959o = "";
        BLiveAuctionAsset bLiveAuctionAssetM221515e = ((nnn0) ((h81) this.f48286a).m206027E2()).f139743M.m221515e();
        if (bLiveAuctionAssetM221515e != null) {
            this.f48264G.m77872k0(bLiveAuctionUserInfo.curLevel, bLiveAuctionUserInfo.curWorth, bLiveAuctionAssetM221515e.auctionLevels, auction.worthBubble);
        }
        m77912J(list);
        m77919R(j);
        m77924z(str);
    }

    /* JADX INFO: renamed from: M */
    public final void m77914M() {
        m77916O();
    }

    /* JADX INFO: renamed from: N */
    public final void m77915N(BLiveAuctionUserInfo guestUser, BLiveAuctionUserInfo winnerUser) {
        xdl0.m208344M(this.f48309v, !TextUtils.isEmpty(guestUser.tagImage));
        if (!TextUtils.isEmpty(guestUser.tagImage)) {
            this.f48308u.setText("");
            hxs.m133406s("context_single_room", this.f48309v, guestUser.tagImage);
        }
        xdl0.m208344M(this.f48305r, !TextUtils.isEmpty(winnerUser.tagImage));
        if (TextUtils.isEmpty(winnerUser.tagImage)) {
            return;
        }
        this.f48304q.setText("");
        hxs.m133406s("context_single_room", this.f48305r, winnerUser.tagImage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m77916O() {
        this.f48289d.m77593c(new p4s(false, "res://drawable/" + i3c0.f111057k, "拍拍关系，获得限定关系卡", false, 9, null));
        m77923y();
        xdl0.m208344M(this.f48256A, false);
        this.f48310w.m77934j(getAct(), vwb.m200324f0("res://drawable/" + i3c0.f111081m), null, 0.0f);
        this.f48310w.setOnClickListener(null);
        this.f48257B.setText(kvc0.m147355d(R$string.f46731Hk));
        this.f48257B.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        this.f48258C.setText("总身价:0");
        this.f48295j.setText("上拍");
        xdl0.m208344M(this.f48296k, false);
        xdl0.m208329E0(this.f48295j, new View.OnClickListener() { // from class: l.n2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveVoiceCallAuctionView.m77895f(this.f136875a, view);
            }
        });
        hxs.m133406s("context_single_room", this.f48259D, "res://drawable/" + i3c0.f111069l);
        this.f48260E.setText("拍拍关系");
        this.f48260E.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        xdl0.m208344M(this.f48262F, true);
        this.f48262F.setText("暂无");
        this.f48264G.f52959o = "";
        BLiveAuctionAsset bLiveAuctionAssetM221515e = ((nnn0) ((h81) this.f48286a).m206027E2()).f139743M.m221515e();
        if (bLiveAuctionAssetM221515e != null) {
            this.f48264G.m77872k0(0, 0L, bLiveAuctionAssetM221515e.auctionLevels, "");
        }
        xdl0.m208344M(this.f48269I0, false);
        int i = 0;
        while (i < 3) {
            Map<String, ? extends Object[]> map = this.seatResIdsMap;
            if (map == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map = null;
            }
            Object[] objArr = map.get("avatar");
            Object obj = objArr != null ? objArr[i] : null;
            obj.getClass();
            xdl0.m208344M((View) obj, false);
            Map<String, ? extends Object[]> map2 = this.seatResIdsMap;
            if (map2 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map2 = null;
            }
            Object[] objArr2 = map2.get("emptyOrder");
            Object obj2 = objArr2 != null ? objArr2[i] : null;
            obj2.getClass();
            xdl0.m208344M((View) obj2, true);
            Map<String, ? extends Object[]> map3 = this.seatResIdsMap;
            if (map3 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map3 = null;
            }
            Object[] objArr3 = map3.get("emptyOrder");
            Object obj3 = objArr3 != null ? objArr3[i] : null;
            obj3.getClass();
            int i2 = i + 1;
            ((TextView) obj3).setText(String.valueOf(i2));
            Map<String, ? extends Object[]> map4 = this.seatResIdsMap;
            if (map4 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map4 = null;
            }
            Object[] objArr4 = map4.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            Object obj4 = objArr4 != null ? objArr4[i] : null;
            obj4.getClass();
            ((VText) obj4).setText(kvc0.m147355d(R$string.f46731Hk));
            Map<String, ? extends Object[]> map5 = this.seatResIdsMap;
            if (map5 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map5 = null;
            }
            Object[] objArr5 = map5.get(AuthenticationTokenClaims.JSON_KEY_NAME);
            Object obj5 = objArr5 != null ? objArr5[i] : null;
            obj5.getClass();
            ((VText) obj5).setTextColor(kvc0.m147352a(h1c0.f105386m1));
            Map<String, ? extends Object[]> map6 = this.seatResIdsMap;
            if (map6 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map6 = null;
            }
            Object[] objArr6 = map6.get("order");
            Object obj6 = objArr6 != null ? objArr6[i] : null;
            obj6.getClass();
            xdl0.m208344M((View) obj6, false);
            Map<String, ? extends Object[]> map7 = this.seatResIdsMap;
            if (map7 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map7 = null;
            }
            Object[] objArr7 = map7.get(FirebaseAnalytics.Param.PRICE);
            Object obj7 = objArr7 != null ? objArr7[i] : null;
            obj7.getClass();
            xdl0.m208344M((View) obj7, false);
            Map<String, ? extends Object[]> map8 = this.seatResIdsMap;
            if (map8 == null) {
                Intrinsics.m87502r("seatResIdsMap");
                map8 = null;
            }
            Object[] objArr8 = map8.get("bidderBg");
            Object obj8 = objArr8 != null ? objArr8[i] : null;
            obj8.getClass();
            ((VDraweeView) obj8).setActualImageResource(i3c0.f110850S0);
            i = i2;
        }
        m77924z(null);
        m77919R(-1L);
        xdl0.m208344M(this.f48309v, false);
        xdl0.m208344M(this.f48305r, false);
    }

    /* JADX INFO: renamed from: P */
    public final void m77917P(@Nullable BLiveAuctionUserInfo auctionUser, @Nullable BLiveAuctionRelation actionRelation) {
        String str;
        String str2;
        Resources resources;
        if (getShowedActionGuideTip().get().booleanValue() || C4348d.m20896l().m20912x(x4s.f191054b)) {
            return;
        }
        C4345a c4345a = new C4345a(getAct());
        if (TextUtils.isEmpty(auctionUser != null ? auctionUser.userId : null)) {
            str2 = "上竞拍位，他人可竞争与你的好友关系，定拍后榜一将会和你直接配对成功";
        } else {
            String str3 = TextUtils.equals(auctionUser != null ? auctionUser.gender : null, "male") ? "他" : "她";
            if (actionRelation == null || (str = actionRelation.name) == null) {
                str = "关系";
            }
            str2 = str3 + "正在寻找" + str + "，定拍后" + str3 + "将会和榜一直接配对成功";
        }
        C4345a c4345aM20874p = c4345a.m20847B(t100.f167260i).m20849D(str2).m20855J(13.0f).m20874p(75);
        Act act = getAct();
        c4345aM20874p.m20870k((act == null || (resources = act.getResources()) == null) ? -1 : resources.getColor(h1c0.f105394p0)).m20875q(C4345a.f15683Q | C4345a.f15681O).m20858M(true).m20861b(8000L).m20882x(50);
        C4348d.m20896l().m20909u(c4345a, this.f48310w, x4s.f191055c);
        getShowedActionGuideTip().put(Boolean.TRUE);
        T t = this.f48286a;
        t.getClass();
        pul0.m171453k((h4t) t);
    }

    /* JADX INFO: renamed from: Q */
    public final void m77918Q(@NotNull String newMask) {
        newMask.getClass();
        if (xdl0.m208349O0(this.f48256A)) {
            this.f48256A.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_single_room").m72113c(newMask).m72111a());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m77919R(long gap) {
        Resources resources;
        Resources resources2;
        TextView textView = this.f48267H0;
        if (gap <= 0) {
            xdl0.m208344M(textView, false);
            return;
        }
        xdl0.m208344M(textView, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "你距离上榜还差 ").append((CharSequence) (gap < 10000 ? String.valueOf(gap) : new DecimalFormat("0.#万").format(gap / 10000.0d)));
        Act act = getAct();
        spannableStringBuilder.setSpan(new ForegroundColorSpan((act == null || (resources2 = act.getResources()) == null) ? Color.parseColor("#66FFFFFF") : resources2.getColor(h1c0.f105386m1)), 0, 8, 18);
        Act act2 = getAct();
        spannableStringBuilder.setSpan(new ForegroundColorSpan((act2 == null || (resources = act2.getResources()) == null) ? Color.parseColor("#E29154") : resources.getColor(h1c0.f105370h0)), 8, spannableStringBuilder.length(), 34);
        this.f48267H0.setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m77920S(@NotNull String panelBgId, @NotNull BLiveAuctionUserInfo guestUser, @NotNull String wealthBubble) {
        panelBgId.getClass();
        guestUser.getClass();
        wealthBubble.getClass();
        this.f48258C.setText("总身价:" + x8u.m207432b(guestUser.curWorth));
        if (!xdl0.m208349O0(this.f48309v)) {
            this.f48308u.setText("总身价:" + x8u.m207432b(guestUser.curWorth));
        }
        BLiveAuctionAsset bLiveAuctionAssetM221515e = ((nnn0) ((h81) this.f48286a).m206027E2()).f139743M.m221515e();
        if (bLiveAuctionAssetM221515e != null) {
            this.f48264G.m77872k0(guestUser.curLevel, guestUser.curWorth, bLiveAuctionAssetM221515e.auctionLevels, wealthBubble);
        }
        m77924z(panelBgId);
    }

    /* JADX INFO: renamed from: T */
    public final void m77921T(@NotNull List<? extends BLiveAuctionLeader> leaderBoards) {
        leaderBoards.getClass();
        m77912J(leaderBoards);
    }

    @Nullable
    public final String getCurPanelBgUrl() {
        return this.curPanelBgUrl;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.seatResIdsMap = MapsKt.mapOf(TuplesKt.m87240a("avatar", new CommonMaskAvatarView[]{this.f48274L, this.f48281S, this.f48261E0}), TuplesKt.m87240a("order", new VText[]{this.f48275M, this.f48282T, this.f48263F0}), TuplesKt.m87240a(AuthenticationTokenClaims.JSON_KEY_NAME, new VText[]{this.f48276N, this.f48283U, this.f48265G0}), TuplesKt.m87240a(FirebaseAnalytics.Param.PRICE, new VText[]{this.f48270J, this.f48279Q, this.f48297k0}), TuplesKt.m87240a("emptyOrder", new VText[]{this.f48272K, this.f48280R, this.f48303p0}), TuplesKt.m87240a("bidderBg", new VDraweeView[]{this.f48268I, this.f48278P, this.f48285W}));
    }

    public final void setCurPanelBgUrl(@Nullable String str) {
        this.curPanelBgUrl = str;
    }

    /* JADX INFO: renamed from: x */
    public final void m77922x() {
        xdl0.m208344M(this.f48291f, true);
        xdl0.m208344M(this.f48309v, true);
        xdl0.m208344M(this.f48305r, true);
        xdl0.m208344M(this.f48293h, false);
        xdl0.m208345M0(this.f48292g, false);
        xdl0.m208344M(this.f48267H0, false);
    }

    /* JADX INFO: renamed from: y */
    public final void m77923y() {
        xdl0.m208344M(this.f48291f, false);
        xdl0.m208344M(this.f48309v, false);
        xdl0.m208344M(this.f48305r, false);
        xdl0.m208344M(this.f48293h, true);
        xdl0.m208345M0(this.f48292g, true);
    }

    /* JADX INFO: renamed from: z */
    public final void m77924z(@Nullable String panelBg) {
        String str;
        if (TextUtils.isEmpty(panelBg)) {
            this.curPanelBgUrl = null;
            this.f48288c.m68504n();
            xdl0.m208345M0(this.f48288c, false);
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
        AnimEffectPlayer animEffectPlayer = this.f48288c;
        if (str == null) {
            xdl0.m208345M0(animEffectPlayer, false);
            return;
        }
        xdl0.m208345M0(animEffectPlayer, true);
        this.f48288c.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f48288c.m68499i(str, -1, null, true);
    }
}
