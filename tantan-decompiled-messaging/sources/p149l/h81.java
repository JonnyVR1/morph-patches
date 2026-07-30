package p149l;

import android.animation.Animator;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.gson.JsonObject;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.AuctionState;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionLeader;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0012J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0012J\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b2\u0010\u0012J\r\u00103\u001a\u00020\u000e¢\u0006\u0004\b3\u0010\u0012J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u0010\u0012J\u0015\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\f¢\u0006\u0004\b:\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b\u001c\u0010\u000b\"\u0004\bD\u0010\u001eR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u0002050I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P¨\u0006U"}, m87232d2 = {"Ll/h81;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionView;", "Ll/jzl;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", "y4", "()Z", "", "invitedId", "", "n4", "(Ljava/lang/String;)V", "B4", "()V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionAnimationMsg$VoiceLiveAuctionAnimation;", "msg", "G4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionAnimationMsg$VoiceLiveAuctionAnimation;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionMsg$VoiceLiveAuctionUpdate;", "updateMsg", "A4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionMsg$VoiceLiveAuctionUpdate;)V", "I4", "isCollapse", "H4", "(Z)V", j6f.GPS_DIRECTION_TRUE, Constants.KEY_T, "C4", Oauth2AccessToken.KEY_UID, "z4", "Y", "", "g1", "()I", "Landroid/view/View;", "T1", "()Landroid/view/View;", "G0", BaseSei.f13930X, "Landroid/view/ViewGroup;", "root", "u", "(Landroid/view/ViewGroup;)V", "n", "r4", "s4", "q4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;", "newAuction", "D4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;)V", "action", "t4", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "j", "I", "refreshGapInMills", "k", "Z", "setCollapse", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionToolbarView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionToolbarView;", "toolbarView", "Lrx/subjects/a;", "m", "Lrx/subjects/a;", "ongoingAuction", "Landroid/animation/Animator;", "Lkotlin/Lazy;", "x4", "()Landroid/animation/Animator;", "expand", "o", "w4", "collapse", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class h81 extends h4t<nnn0, LiveVoiceCallAuctionView> implements jzl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<? extends nnn0> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int refreshGapInMills;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCollapse;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public LiveVoiceCallAuctionToolbarView toolbarView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public C22392a<BLiveVoiceAuction> ongoingAuction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy expand;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapse;

    /* JADX INFO: renamed from: l.h81$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C17244a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f106373a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f106374b;

        static {
            int[] iArr = new int[LongLinkVoiceLiveAuctionAnimationMsg.AnimType.values().length];
            try {
                iArr[LongLinkVoiceLiveAuctionAnimationMsg.AnimType.endAuction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongLinkVoiceLiveAuctionAnimationMsg.AnimType.settleAuction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LongLinkVoiceLiveAuctionAnimationMsg.AnimType.endPledgeAuction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f106373a = iArr;
            int[] iArr2 = new int[LongLinkVoiceLiveAuctionMsg.UpdateType.values().length];
            try {
                iArr2[LongLinkVoiceLiveAuctionMsg.UpdateType.refreshAuction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LongLinkVoiceLiveAuctionMsg.UpdateType.updateRank.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LongLinkVoiceLiveAuctionMsg.UpdateType.updateWorth.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LongLinkVoiceLiveAuctionMsg.UpdateType.updateGap.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f106374b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h81(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
        this.refreshGapInMills = 3000;
        C22392a<BLiveVoiceAuction> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.ongoingAuction = c22392aM221512b;
        this.expand = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.e81
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h81.m129836h4(this.f89782a);
            }
        });
        this.collapse = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.f81
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h81.m129838j4(this.f96308a);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m129809E4(Meta meta) {
        meta.getClass();
        if (meta.code != 200) {
            osi0.m165778b(meta.message);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m129810F4(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m129812J4(h81 h81Var, a1v a1vVar, View view) {
        String str = a1vVar.m94576b().inviteId;
        str.getClass();
        h81Var.m129850C4(str);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m129813K3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m129814K4(h81 h81Var, a1v a1vVar, View view) {
        String str = a1vVar.m94576b().inviteId;
        str.getClass();
        h81Var.m129855n4(str);
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m129815L3(a1v a1vVar) {
        return Boolean.valueOf(Intrinsics.m87488d(a1vVar.m94577c(), "auctionInvite"));
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m129816M3(h81 h81Var, VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        String userId = userMaskUpdate.getUserId();
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = h81Var.ongoingAuction.m221515e();
        return Boolean.valueOf(TextUtils.equals(userId, bLiveVoiceAuctionM221515e != null ? bLiveVoiceAuctionM221515e.f44482id : null));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public static void m129817N3(h81 h81Var, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        ((nnn0) h81Var.m206027E2()).f139743M.m132487l(bLiveEnvelope.data.voiceLiveAuctionAsset);
        BLiveVoiceAuction bLiveVoiceAuction = bLiveEnvelope.data.voiceLiveAuctions.get(0);
        BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveVoiceAuction.guestUser;
        bLiveAuctionUserInfo.curLevel = bLiveVoiceAuction.level;
        bLiveAuctionUserInfo.curWorth = bLiveVoiceAuction.worth;
        String str = bLiveVoiceAuction.stage;
        int iHashCode = str.hashCode();
        if (iHashCode != -1318566021) {
            if (iHashCode == -935849721 && str.equals(AuctionState.blessing)) {
                LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) h81Var.viewModel;
                String str2 = bLiveVoiceAuction.panelBgId;
                str2.getClass();
                BLiveAuctionUserInfo bLiveAuctionUserInfo2 = bLiveVoiceAuction.guestUser;
                bLiveAuctionUserInfo2.getClass();
                BLiveAuctionRelation bLiveAuctionRelation = bLiveVoiceAuction.auctionRelation;
                bLiveAuctionRelation.getClass();
                BLiveAuctionUserInfo bLiveAuctionUserInfo3 = bLiveVoiceAuction.winnerUser;
                bLiveAuctionUserInfo3.getClass();
                String str3 = bLiveVoiceAuction.worthBubble;
                str3.getClass();
                liveVoiceCallAuctionView.m77910G(str2, bLiveAuctionUserInfo2, bLiveAuctionRelation, bLiveAuctionUserInfo3, str3, bLiveVoiceAuction.isChoosingPledgeRelation);
            } else {
                ((LiveVoiceCallAuctionView) h81Var.viewModel).m77914M();
            }
        } else if (str.equals("ongoing")) {
            ((LiveVoiceCallAuctionView) h81Var.viewModel).m77913L(bLiveVoiceAuction);
        } else {
            ((LiveVoiceCallAuctionView) h81Var.viewModel).m77914M();
        }
        bLiveVoiceAuction.updateTimeInSec = mqi0.m155944o();
        h81Var.ongoingAuction.m132487l(bLiveVoiceAuction);
        h81Var.m129853H4(h81Var.isCollapse);
        ((LiveVoiceCallAuctionView) h81Var.viewModel).m77917P(bLiveVoiceAuction.guestUser, bLiveVoiceAuction.auctionRelation);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m129818O3(final h81 h81Var, final a1v a1vVar) {
        new xh0.C21150a(h81Var.act()).m208731j(a1vVar.m94576b().message).m208739r("确定").m208727f("暂不上拍").m208729h(false).m208724c(new View.OnClickListener() { // from class: l.r71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h81.m129812J4(this.f158003a, a1vVar, view);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.s71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h81.m129814K4(this.f162880a, a1vVar, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m129819P3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m129820R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m129822T3(h81 h81Var, BLiveVoiceAuction bLiveVoiceAuction) {
        bLiveVoiceAuction.getClass();
        ((LiveVoiceCallAuctionView) h81Var.viewModel).m77909B(e0o0.m114322h(h81Var), bLiveVoiceAuction);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m129823U3(h81 h81Var) {
        h81Var.m129849B4();
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m129826X3(h81 h81Var, bik0.C15867a c15867a) {
        return Boolean.valueOf(e0o0.m114322h(h81Var));
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m129828Z3(h81 h81Var, boolean z) {
        if (h81Var.ongoingAuction.m221519i()) {
            LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) h81Var.viewModel;
            BLiveVoiceAuction bLiveVoiceAuctionM221515e = h81Var.ongoingAuction.m221515e();
            bLiveVoiceAuctionM221515e.getClass();
            liveVoiceCallAuctionView.m77909B(z, bLiveVoiceAuctionM221515e);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static void m129829a4(h81 h81Var, BLiveAuctionAsset bLiveAuctionAsset) {
        ((LiveVoiceCallAuctionView) h81Var.viewModel).f48264G.m77871j0(-1, -1L, bLiveAuctionAsset.auctionLevels);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m129830b4(h81 h81Var, VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) h81Var.viewModel;
        String avatar = userMaskUpdate.getMask().getAvatar();
        avatar.getClass();
        liveVoiceCallAuctionView.m77918Q(avatar);
    }

    /* JADX INFO: renamed from: c4 */
    public static Boolean m129831c4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m129833e4(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: f4 */
    public static Boolean m129834f4(h81 h81Var, q61 q61Var) {
        return Boolean.valueOf(h81Var.m129860y4());
    }

    /* JADX INFO: renamed from: h4 */
    public static Animator m129836h4(h81 h81Var) {
        return bt0.m103753z(bt0.m103744q(h81Var.mo104863x(), "translationY", t100.m186890d(-10.0f), 0.0f), bt0.m103741n(h81Var.mo104863x(), View.ALPHA, 0.0f, 1.0f)).setDuration(400L);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m129837i4(h81 h81Var, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        voiceLiveAuctionUpdate.getClass();
        h81Var.m129848A4(voiceLiveAuctionUpdate);
    }

    /* JADX INFO: renamed from: j4 */
    public static Animator m129838j4(h81 h81Var) {
        return bt0.m103741n(h81Var.mo104863x(), View.ALPHA, 1.0f, 0.0f).setDuration(300L);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m129839k4(h81 h81Var, LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation voiceLiveAuctionAnimation) {
        voiceLiveAuctionAnimation.getClass();
        h81Var.m129852G4(voiceLiveAuctionAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static void m129840l4(final h81 h81Var, BLiveAuctionAsset bLiveAuctionAsset) {
        bLiveAuctionAsset.getClass();
        ((nnn0) h81Var.m206027E2()).f139743M.m132487l(bLiveAuctionAsset);
        C22306c<T> c22306cM129299H3 = h81Var.m129299H3(((nnn0) h81Var.m206027E2()).m132135h2(bLiveAuctionAsset.autoRefreshSeconds, TimeUnit.SECONDS));
        final Function1 function1 = new Function1() { // from class: l.o71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h81.m129842o4(this.f142447a, (Long) obj);
            }
        };
        c22306cM129299H3.subscribe(new e30() { // from class: l.q71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129843p4(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m129842o4(h81 h81Var, Long l2) {
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = h81Var.ongoingAuction.m221515e();
        if (System.currentTimeMillis() - (bLiveVoiceAuctionM221515e != null ? bLiveVoiceAuctionM221515e.updateTimeInSec : 0L) > h81Var.refreshGapInMills) {
            h81Var.m129849B4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m129843p4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m129844u4(Meta meta) {
        meta.getClass();
        if (meta.code != 200) {
            osi0.m165778b(meta.message);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m129845v4(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: w4 */
    private final Animator m129846w4() {
        Object value = this.collapse.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: x4 */
    private final Animator m129847x4() {
        Object value = this.expand.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m129848A4(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate updateMsg) {
        LongLinkVoiceLiveAuctionMsg.UpdateType updateType = updateMsg.getUpdateType();
        int i = updateType == null ? -1 : C17244a.f106374b[updateType.ordinal()];
        if (i == 1) {
            m129849B4();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                m129854I4(updateMsg);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                ((LiveVoiceCallAuctionView) this.viewModel).m77919R(updateMsg.getLeaderboardGap());
                return;
            }
        }
        m129854I4(updateMsg);
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e == null) {
            m129849B4();
            return;
        }
        if (!TextUtils.equals(updateMsg.getAuctionId(), bLiveVoiceAuctionM221515e.f44482id)) {
            m129849B4();
            return;
        }
        List<LongLinkVoiceLiveAuctionMsg.AuctionLeaderboard> leaderboardsList = updateMsg.getLeaderboardsList();
        if (leaderboardsList != null) {
            bLiveVoiceAuctionM221515e.leaderboards.clear();
            for (LongLinkVoiceLiveAuctionMsg.AuctionLeaderboard auctionLeaderboard : leaderboardsList) {
                BLiveAuctionLeader bLiveAuctionLeaderNew_ = BLiveAuctionLeader.new_();
                bLiveAuctionLeaderNew_.rank = (int) auctionLeaderboard.getRank();
                bLiveAuctionLeaderNew_.amount = auctionLeaderboard.getAmount();
                String amountBackgroundId = auctionLeaderboard.getAmountBackgroundId();
                amountBackgroundId.getClass();
                bLiveAuctionLeaderNew_.amountBackgroundId = Integer.parseInt(amountBackgroundId);
                bLiveAuctionLeaderNew_.background = auctionLeaderboard.getBackground();
                BLiveAuctionUserInfo bLiveAuctionUserInfoNew_ = BLiveAuctionUserInfo.new_();
                bLiveAuctionUserInfoNew_.userId = auctionLeaderboard.getUserId();
                bLiveAuctionUserInfoNew_.userName = auctionLeaderboard.getUserName();
                bLiveAuctionUserInfoNew_.avatar = auctionLeaderboard.getAvatar();
                BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrlNew_ = BLiveVoiceMedalWallItemHeaderUrl.new_();
                bLiveVoiceMedalWallItemHeaderUrlNew_.staticUrl = auctionLeaderboard.getAvatarFrameUrl();
                bLiveVoiceMedalWallItemHeaderUrlNew_.dynamicUrl = auctionLeaderboard.getAvatarFrameDynamicUrl();
                bLiveAuctionUserInfoNew_.avatarFrame = bLiveVoiceMedalWallItemHeaderUrlNew_;
                bLiveAuctionLeaderNew_.userInfo = bLiveAuctionUserInfoNew_;
                bLiveVoiceAuctionM221515e.leaderboards.add(bLiveAuctionLeaderNew_);
            }
        }
        this.ongoingAuction.m132487l(bLiveVoiceAuctionM221515e);
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) this.viewModel;
        List<BLiveAuctionLeader> list = bLiveVoiceAuctionM221515e.leaderboards;
        list.getClass();
        liveVoiceCallAuctionView.m77921T(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final void m129849B4() {
        p61 p61Var = p61.INSTANCE;
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(p61Var.m167575X(strM149818o)).subscribe(ffw.m121197h(new e30() { // from class: l.n71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129817N3(this.f137473a, (BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m129850C4(@NotNull String invitedId) {
        invitedId.getClass();
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(p61.m167544d0(strM149818o, invitedId)).subscribe(ffw.m121194e(new e30() { // from class: l.t71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129819P3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.u71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129833e4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public final void m129851D4(@NotNull BLiveVoiceAuction newAuction) {
        newAuction.getClass();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("winnerUserId", newAuction.leaderboards.get(0).userInfo.userId);
        String str = newAuction.roomId;
        str.getClass();
        String str2 = newAuction.f44482id;
        str2.getClass();
        duringCreated(p61.m167532P(str, str2, "settleAuction", jsonObject.toString())).subscribe(ffw.m121194e(new e30() { // from class: l.v71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129809E4((Meta) obj);
            }
        }, new e30() { // from class: l.w71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129810F4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo104849G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((LiveVoiceCallAuctionView) this.viewModel).f48289d;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    /* JADX INFO: renamed from: G4 */
    public final void m129852G4(LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation msg) {
        userMaskConfig.UserMask guestUser = msg.getGuestUser();
        userMaskConfig.UserMask winnerUser = msg.getWinnerUser();
        String guestTagImage = msg.getGuestTagImage();
        String winnerTagImage = msg.getWinnerTagImage();
        if (guestUser == null || winnerUser == null) {
            return;
        }
        LongLinkVoiceLiveAuctionAnimationMsg.AnimType type = msg.getType();
        int i = type == null ? -1 : C17244a.f106373a[type.ordinal()];
        if (i == 1) {
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            String avatar = guestUser.getAvatar();
            avatar.getClass();
            sVGADynamicEntity.setDynamicImage(avatar, "head_1");
            String avatar2 = winnerUser.getAvatar();
            avatar2.getClass();
            sVGADynamicEntity.setDynamicImage(avatar2, "head_2");
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(t100.m186892f(12));
            textPaint.setFakeBoldText(true);
            textPaint.setColor(-1);
            textPaint.setAntiAlias(true);
            textPaint.setTextAlign(Paint.Align.CENTER);
            String name = winnerUser.getName();
            name.getClass();
            sVGADynamicEntity.setDynamicText("恭喜 " + r610.m178016w(name, 4) + " 成为", textPaint, "text_1");
            String name2 = guestUser.getName();
            name2.getClass();
            String str = r610.m178016w(name2, 4) + "的" + msg.getRelationName() + " Lv." + msg.getLevel();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(kvc0.m147352a(h1c0.f105394p0));
            String relationName = msg.getRelationName();
            relationName.getClass();
            spannableStringBuilder.setSpan(foregroundColorSpan, StringsKt.m93436c0(str, relationName, 0, false, 6, null), str.length(), 18);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(t100.m186892f(12));
            textPaint2.setColor(-1);
            textPaint2.setFakeBoldText(true);
            sVGADynamicEntity.setDynamicText(new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint2, (int) textPaint2.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true), "text_2");
            m206028F2().VoiceAuctionEvent.showAuctionAnim().mo172463j(new j5h0("https://fe-static.tancdn.com/v1/raw/ab5268eb-a8dc-41bc-89c5-559696e85c8612.svga", sVGADynamicEntity));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m206028F2().VoiceAuctionEvent.showSpecialAuctionAnim().mo172463j(new zmf0(guestUser.getName(), winnerUser.getName(), guestUser.getAvatar(), winnerUser.getAvatar(), guestTagImage, winnerTagImage, msg.getRelationName(), msg.getDaysText()));
            return;
        }
        SVGADynamicEntity sVGADynamicEntity2 = new SVGADynamicEntity();
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setTextSize(t100.m186892f(14));
        textPaint3.setFakeBoldText(true);
        textPaint3.setColor(-1);
        textPaint3.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint3.setTextAlign(align);
        sVGADynamicEntity2.setDynamicText("定拍成功", textPaint3, "text_1");
        TextPaint textPaint4 = new TextPaint();
        textPaint4.setTextSize(t100.m186892f(12));
        textPaint4.setColor(-1);
        textPaint4.setAntiAlias(true);
        textPaint4.setTextAlign(align);
        sVGADynamicEntity2.setDynamicText("恭喜 " + winnerUser.getName() + " 成为", textPaint4, "text_2");
        String str2 = guestUser.getName() + "的" + msg.getRelationName() + " Lv." + msg.getLevel();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(kvc0.m147352a(h1c0.f105394p0));
        String relationName2 = msg.getRelationName();
        relationName2.getClass();
        spannableStringBuilder2.setSpan(foregroundColorSpan2, StringsKt.m93436c0(spannableStringBuilder2, relationName2, 0, false, 6, null), spannableStringBuilder2.length(), 18);
        TextPaint textPaint5 = new TextPaint();
        textPaint5.setTextSize(t100.m186892f(12));
        textPaint5.setColor(-1);
        sVGADynamicEntity2.setDynamicText(new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint5, (int) textPaint5.measureText(str2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true), "text_3");
        m206028F2().VoiceAuctionEvent.showAuctionAnim().mo172463j(new j5h0("https://fe-static.tancdn.com/v1/raw/933f3e1f-50d4-43f2-954f-a8ebb444fbc013.svga", sVGADynamicEntity2));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m129853H4(boolean isCollapse) {
        String str;
        String str2;
        BLiveAuctionRelation bLiveAuctionRelation;
        BLiveAuctionUserInfo bLiveAuctionUserInfo;
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e == null || (str = bLiveVoiceAuctionM221515e.stage) == null) {
            str = "pending";
        }
        boolean zM87488d = Intrinsics.m87488d(str, "pending");
        V v2 = this.viewModel;
        if (zM87488d) {
            ((LiveVoiceCallAuctionView) v2).m77911I(isCollapse, "res://drawable/" + i3c0.f111057k, "拍拍关系，获得限定关系卡");
            return;
        }
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) v2;
        BLiveVoiceAuction bLiveVoiceAuctionM221515e2 = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e2 == null || (bLiveAuctionUserInfo = bLiveVoiceAuctionM221515e2.guestUser) == null || (str2 = bLiveAuctionUserInfo.avatar) == null) {
            str2 = "";
        }
        BLiveVoiceAuction bLiveVoiceAuctionM221515e3 = this.ongoingAuction.m221515e();
        liveVoiceCallAuctionView.m77911I(isCollapse, str2, "正在拍拍" + ((bLiveVoiceAuctionM221515e3 == null || (bLiveAuctionRelation = bLiveVoiceAuctionM221515e3.auctionRelation) == null) ? null : bLiveAuctionRelation.name) + "关系");
    }

    /* JADX INFO: renamed from: I4 */
    public final void m129854I4(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate updateMsg) {
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e == null) {
            m129849B4();
            return;
        }
        if (!TextUtils.equals(updateMsg.getAuctionId(), bLiveVoiceAuctionM221515e.f44482id)) {
            m129849B4();
            return;
        }
        bLiveVoiceAuctionM221515e.guestUser.curWorth = updateMsg.getWorth();
        bLiveVoiceAuctionM221515e.guestUser.curLevel = (int) updateMsg.getLevel();
        String panelBgId = updateMsg.getPanelBgId();
        bLiveVoiceAuctionM221515e.panelBgId = panelBgId;
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) this.viewModel;
        panelBgId.getClass();
        BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveVoiceAuctionM221515e.guestUser;
        bLiveAuctionUserInfo.getClass();
        String worthBubble = updateMsg.getWorthBubble();
        worthBubble.getClass();
        liveVoiceCallAuctionView.m77920S(panelBgId, bLiveAuctionUserInfo, worthBubble);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo104850P1() {
        return super.mo104850P1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m144512z2(new hgm0(this.curInfo));
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        m144512z2(new atk(bsmVar));
        if (!((nnn0) m206027E2()).f139743M.m221519i()) {
            p61 p61Var = p61.INSTANCE;
            String strM149818o = ((nnn0) m206027E2()).m149818o();
            strM149818o.getClass();
            duringCreated(p61Var.m167572S(strM149818o)).subscribe(ffw.m121193d(new e30() { // from class: l.c71
                @Override // p149l.e30
                public final void call(Object obj) {
                    h81.m129840l4(this.f79592a, (BLiveAuctionAsset) obj);
                }
            }));
        }
        m129301d3(q61.class, new w9j() { // from class: l.f71
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h81.m129834f4(this.f96191a, (q61) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).f139743M.asObservable()).observeOn(jo0.m142408a()).filter(new z600()).subscribe(ffw.m121197h(new e30() { // from class: l.z71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129829a4(this.f201982a, (BLiveAuctionAsset) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m160251Q2());
        final Function1 function1 = new Function1() { // from class: l.a81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h81.m129826X3(this.f67994a, (bik0.C15867a) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.b81
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h81.m129813K3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.c81
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129828Z3(this.f79676a, ((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(this.ongoingAuction).filter(new z600()).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.d81
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129822T3(this.f84809a, (BLiveVoiceAuction) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public View mo104853T1() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: Y */
    public void mo104856Y(boolean isCollapse) {
        this.isCollapse = isCollapse;
        LiveVoiceCallAuctionToolbarView liveVoiceCallAuctionToolbarView = this.toolbarView;
        if (liveVoiceCallAuctionToolbarView != null) {
            xdl0.m208344M(liveVoiceCallAuctionToolbarView, !isCollapse);
        }
        m129853H4(isCollapse);
        dt0.m113503C(m129847x4());
        dt0.m113503C(m129846w4());
        if (isCollapse) {
            m129846w4().start();
        } else {
            m129847x4().start();
        }
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e != null) {
            V v2 = this.viewModel;
            if (isCollapse) {
                ((LiveVoiceCallAuctionView) v2).m77924z(null);
            } else {
                ((LiveVoiceCallAuctionView) v2).m77924z(bLiveVoiceAuctionM221515e.panelBgId);
            }
        }
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ void mo104857b0(boolean z) {
        super.mo104857b0(z);
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: c2 */
    public /* bridge */ int mo104858c2() {
        return super.mo104858c2();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: e2 */
    public /* bridge */ boolean mo104859e2() {
        return super.mo104859e2();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: f1 */
    public /* bridge */ boolean mo104860f1() {
        return super.mo104860f1();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: g1 */
    public int mo104861g1() {
        return t6c0.f168219V7;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        LiveVoiceCallAuctionToolbarView liveVoiceCallAuctionToolbarView = this.toolbarView;
        ViewParent parent = liveVoiceCallAuctionToolbarView != null ? liveVoiceCallAuctionToolbarView.getParent() : null;
        parent.getClass();
        ((ViewGroup) parent).removeView(this.toolbarView);
        this.toolbarView = null;
        m206028F2().VoiceAuctionEvent.showAuctionBoard().mo172463j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m129855n4(String invitedId) {
        m206028F2().VoiceAuctionEvent.openRelationSettingsDlg().mo172463j(invitedId);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m129856q4() {
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e != null) {
            String str = bLiveVoiceAuctionM221515e.stage;
            if (str.hashCode() == -1318566021 && str.equals("ongoing")) {
                m129857r4();
            } else {
                m206028F2().VoiceAuctionEvent.openRelationSettingsDlg().mo172463j("");
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m129857r4() {
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e != null) {
            User userNew_ = User.new_();
            userNew_.f56011id = bLiveVoiceAuctionM221515e.guestUser.userId;
            Picture pictureNew_ = Picture.new_();
            pictureNew_.url = bLiveVoiceAuctionM221515e.guestUser.avatar;
            userNew_.pictures.add(pictureNew_);
            userNew_.name = bLiveVoiceAuctionM221515e.guestUser.userName;
            BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
            BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveVoiceAuctionM221515e.guestUser;
            bLiveUserMaskNew_.avatar = bLiveAuctionUserInfo.avatar;
            bLiveUserMaskNew_.userId = bLiveAuctionUserInfo.userId;
            bLiveUserMaskNew_.name = bLiveAuctionUserInfo.userName;
            u4n0.m191745d(this, mqv.m155998f(userNew_).m156001c(userNew_.f56011id, bLiveUserMaskNew_, true));
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m129858s4() {
        m129857r4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).f108769z.m181789r().m189051I0()).subscribe(ffw.m121197h(new e30() { // from class: l.g81
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129837i4(this.f101466a, (LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).f108769z.m181789r().m189047G0()).subscribe(ffw.m121197h(new e30() { // from class: l.e71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129839k4(this.f89664a, (LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation) obj);
            }
        }));
        m129849B4();
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m132160q1().m189150v0());
        final Function1 function1 = new Function1() { // from class: l.g71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h81.m129815L3((a1v) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.h71
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h81.m129831c4(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.i71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129818O3(this.f111819a, (a1v) obj);
            }
        }));
        m206028F2().VoiceAuctionEvent.showAuctionBoard().mo172464m(Boolean.TRUE);
        m129303g3(m206028F2().VoiceAuctionEvent.refreshAuction(), new d30() { // from class: l.j71
            @Override // p149l.d30
            public final void call() {
                h81.m129823U3(this.f116558a);
            }
        });
        C22306c c22306cObserveOn = duringCreated(((nnn0) m206027E2()).m132160q1().m189120l0()).observeOn(jo0.m142408a());
        final Function1 function2 = new Function1() { // from class: l.k71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h81.m129816M3(this.f121524a, (VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        };
        c22306cObserveOn.filter(new w9j() { // from class: l.l71
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return h81.m129820R3(function2, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.m71
            @Override // p149l.e30
            public final void call(Object obj) {
                h81.m129830b4(this.f131784a, (VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m129859t4(@NotNull String action) {
        action.getClass();
        BLiveVoiceAuction bLiveVoiceAuctionM221515e = this.ongoingAuction.m221515e();
        if (bLiveVoiceAuctionM221515e != null) {
            String str = bLiveVoiceAuctionM221515e.roomId;
            str.getClass();
            String str2 = bLiveVoiceAuctionM221515e.f44482id;
            str2.getClass();
            p61.m167532P(str, str2, action, null).subscribe(ffw.m121194e(new e30() { // from class: l.x71
                @Override // p149l.e30
                public final void call(Object obj) {
                    h81.m129844u4((Meta) obj);
                }
            }, new e30() { // from class: l.y71
                @Override // p149l.e30
                public final void call(Object obj) {
                    h81.m129845v4((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: u */
    public void mo104862u(@NotNull ViewGroup root) {
        root.getClass();
        super.mo104862u(root);
        ((LiveVoiceCallAuctionView) this.viewModel).m77908A(root);
        if (root instanceof LiveVirtualVoiceFunctionPanelView) {
            LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView = (LiveVirtualVoiceFunctionPanelView) root;
            View viewInflate = LayoutInflater.from(liveVirtualVoiceFunctionPanelView.getContext()).inflate(t6c0.f168207U7, (ViewGroup) null);
            viewInflate.getClass();
            this.toolbarView = (LiveVoiceCallAuctionToolbarView) viewInflate;
            liveVirtualVoiceFunctionPanelView.f48111g.addView(viewInflate);
            m144512z2(new q81(this.curInfo, this.toolbarView, this.ongoingAuction));
            m144512z2(new b71(this.f188512e, this.ongoingAuction));
        }
        ((LiveVoiceCallAuctionView) this.viewModel).m77916O();
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo104863x() {
        ConstraintLayout constraintLayout = ((LiveVoiceCallAuctionView) this.viewModel).f48290e;
        constraintLayout.getClass();
        return constraintLayout;
    }

    /* JADX INFO: renamed from: y4 */
    public final boolean m129860y4() {
        return this.ongoingAuction.m221519i() && Intrinsics.m87488d("ongoing", this.ongoingAuction.m221515e().stage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m129861z4(@NotNull String uid) {
        uid.getClass();
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(7013).userId(uid).setSource("auction").setFromIdentity(bqq.m103386a(this, ((nnn0) m206027E2()).m132140j0(), uid, 7013)).setTo(bqq.m103389d(this, ((nnn0) m206027E2()).m132140j0(), uid, 7013)).setScene(BLiveType.voiceLive).trackFrom("auction").build());
    }
}
