package p153l;

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
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionAnimationMsg;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceUpdateUserMaskProto;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.AuctionState;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionLeader;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionUserInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0012J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0012J\r\u00102\u001a\u00020\u000e¢\u0006\u0004\b2\u0010\u0012J\r\u00103\u001a\u00020\u000e¢\u0006\u0004\b3\u0010\u0012J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u0010\u0012J\u0015\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\f¢\u0006\u0004\b:\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b\u001c\u0010\u000b\"\u0004\bD\u0010\u001eR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u0002050I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010N\u001a\u0004\bS\u0010P¨\u0006U"}, m88121d2 = {"Ll/o81;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionView;", "Ll/d2m;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", "y4", "()Z", "", "invitedId", "", "n4", "(Ljava/lang/String;)V", "B4", "()V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionAnimationMsg$VoiceLiveAuctionAnimation;", "msg", "G4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionAnimationMsg$VoiceLiveAuctionAnimation;)V", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionMsg$VoiceLiveAuctionUpdate;", "updateMsg", "A4", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceLiveAuctionMsg$VoiceLiveAuctionUpdate;)V", "I4", "isCollapse", "H4", "(Z)V", p7f.GPS_DIRECTION_TRUE, Constants.KEY_T, "C4", Oauth2AccessToken.KEY_UID, "z4", "Y", "", "g1", "()I", "Landroid/view/View;", "T1", "()Landroid/view/View;", "G0", BaseSei.f14624X, "Landroid/view/ViewGroup;", "root", "u", "(Landroid/view/ViewGroup;)V", "n", "r4", "s4", "q4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;", "newAuction", "D4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceAuction;)V", "action", "t4", RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "getCurInfo", "()Ll/dum;", "j", "I", "refreshGapInMills", "k", "Z", "setCollapse", "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionToolbarView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/LiveVoiceCallAuctionToolbarView;", "toolbarView", "Lrx/subjects/a;", "m", "Lrx/subjects/a;", "ongoingAuction", "Landroid/animation/Animator;", "Lkotlin/Lazy;", "x4", "()Landroid/animation/Animator;", "expand", "o", "w4", "collapse", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class o81 extends i6t<rwn0, LiveVoiceCallAuctionView> implements d2m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<? extends rwn0> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int refreshGapInMills;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCollapse;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public LiveVoiceCallAuctionToolbarView toolbarView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public C22507a<BLiveVoiceAuction> ongoingAuction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy expand;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapse;

    /* JADX INFO: renamed from: l.o81$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C19049a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f145351a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f145352b;

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
            f145351a = iArr;
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
            f145352b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
        this.refreshGapInMills = 3000;
        C22507a<BLiveVoiceAuction> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.ongoingAuction = c22507aM222758b;
        this.expand = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.l81
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o81.m166418h4(this.f130405a);
            }
        });
        this.collapse = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.m81
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o81.m166420j4(this.f135142a);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m166391E4(Meta meta) {
        meta.getClass();
        if (meta.code != 200) {
            r1j0.m179415b(meta.message);
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m166392F4(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m166394J4(o81 o81Var, b3v b3vVar, View view) {
        String str = b3vVar.m102361b().inviteId;
        str.getClass();
        o81Var.m166432C4(str);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m166395K3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K4 */
    public static final void m166396K4(o81 o81Var, b3v b3vVar, View view) {
        String str = b3vVar.m102361b().inviteId;
        str.getClass();
        o81Var.m166437n4(str);
    }

    /* JADX INFO: renamed from: L3 */
    public static Boolean m166397L3(b3v b3vVar) {
        return Boolean.valueOf(Intrinsics.m88377d(b3vVar.m102362c(), "auctionInvite"));
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m166398M3(o81 o81Var, VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        String userId = userMaskUpdate.getUserId();
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = o81Var.ongoingAuction.m222761e();
        return Boolean.valueOf(TextUtils.equals(userId, bLiveVoiceAuctionM222761e != null ? bLiveVoiceAuctionM222761e.f45330id : null));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public static void m166399N3(o81 o81Var, BLiveEnvelope bLiveEnvelope) {
        bLiveEnvelope.getClass();
        ((rwn0) o81Var.m213810E2()).f165190M.m137019l(bLiveEnvelope.data.voiceLiveAuctionAsset);
        BLiveVoiceAuction bLiveVoiceAuction = bLiveEnvelope.data.voiceLiveAuctions.get(0);
        BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveVoiceAuction.guestUser;
        bLiveAuctionUserInfo.curLevel = bLiveVoiceAuction.level;
        bLiveAuctionUserInfo.curWorth = bLiveVoiceAuction.worth;
        String str = bLiveVoiceAuction.stage;
        int iHashCode = str.hashCode();
        if (iHashCode != -1318566021) {
            if (iHashCode == -935849721 && str.equals(AuctionState.blessing)) {
                LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) o81Var.viewModel;
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
                liveVoiceCallAuctionView.m79093G(str2, bLiveAuctionUserInfo2, bLiveAuctionRelation, bLiveAuctionUserInfo3, str3, bLiveVoiceAuction.isChoosingPledgeRelation);
            } else {
                ((LiveVoiceCallAuctionView) o81Var.viewModel).m79097M();
            }
        } else if (str.equals("ongoing")) {
            ((LiveVoiceCallAuctionView) o81Var.viewModel).m79096L(bLiveVoiceAuction);
        } else {
            ((LiveVoiceCallAuctionView) o81Var.viewModel).m79097M();
        }
        bLiveVoiceAuction.updateTimeInSec = pzi0.m174454o();
        o81Var.ongoingAuction.m137019l(bLiveVoiceAuction);
        o81Var.m166435H4(o81Var.isCollapse);
        ((LiveVoiceCallAuctionView) o81Var.viewModel).m79100P(bLiveVoiceAuction.guestUser, bLiveVoiceAuction.auctionRelation);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m166400O3(final o81 o81Var, final b3v b3vVar) {
        new th0.C20312a(o81Var.act()).m191151j(b3vVar.m102361b().message).m191159r("确定").m191147f("暂不上拍").m191149h(false).m191144c(new View.OnClickListener() { // from class: l.y71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o81.m166394J4(this.f197734a, b3vVar, view);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.z71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o81.m166396K4(this.f203213a, b3vVar, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m166401P3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m166402R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m166404T3(o81 o81Var, BLiveVoiceAuction bLiveVoiceAuction) {
        bLiveVoiceAuction.getClass();
        ((LiveVoiceCallAuctionView) o81Var.viewModel).m79092B(i9o0.m139137h(o81Var), bLiveVoiceAuction);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m166405U3(o81 o81Var) {
        o81Var.m166431B4();
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m166408X3(o81 o81Var, hrk0.C17564a c17564a) {
        return Boolean.valueOf(i9o0.m139137h(o81Var));
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m166410Z3(o81 o81Var, boolean z) {
        if (o81Var.ongoingAuction.m222765i()) {
            LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) o81Var.viewModel;
            BLiveVoiceAuction bLiveVoiceAuctionM222761e = o81Var.ongoingAuction.m222761e();
            bLiveVoiceAuctionM222761e.getClass();
            liveVoiceCallAuctionView.m79092B(z, bLiveVoiceAuctionM222761e);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static void m166411a4(o81 o81Var, BLiveAuctionAsset bLiveAuctionAsset) {
        ((LiveVoiceCallAuctionView) o81Var.viewModel).f49112G.m79054j0(-1, -1L, bLiveAuctionAsset.auctionLevels);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m166412b4(o81 o81Var, VoiceUpdateUserMaskProto.UserMaskUpdate userMaskUpdate) {
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) o81Var.viewModel;
        String avatar = userMaskUpdate.getMask().getAvatar();
        avatar.getClass();
        liveVoiceCallAuctionView.m79101Q(avatar);
    }

    /* JADX INFO: renamed from: c4 */
    public static Boolean m166413c4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m166415e4(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: f4 */
    public static Boolean m166416f4(o81 o81Var, x61 x61Var) {
        return Boolean.valueOf(o81Var.m166442y4());
    }

    /* JADX INFO: renamed from: h4 */
    public static Animator m166418h4(o81 o81Var) {
        return gt0.m132180z(gt0.m132171q(o81Var.mo113717x(), "translationY", qa00.m175859d(-10.0f), 0.0f), gt0.m132168n(o81Var.mo113717x(), View.ALPHA, 0.0f, 1.0f)).setDuration(400L);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m166419i4(o81 o81Var, LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate voiceLiveAuctionUpdate) {
        voiceLiveAuctionUpdate.getClass();
        o81Var.m166430A4(voiceLiveAuctionUpdate);
    }

    /* JADX INFO: renamed from: j4 */
    public static Animator m166420j4(o81 o81Var) {
        return gt0.m132168n(o81Var.mo113717x(), View.ALPHA, 1.0f, 0.0f).setDuration(300L);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m166421k4(o81 o81Var, LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation voiceLiveAuctionAnimation) {
        voiceLiveAuctionAnimation.getClass();
        o81Var.m166434G4(voiceLiveAuctionAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static void m166422l4(final o81 o81Var, BLiveAuctionAsset bLiveAuctionAsset) {
        bLiveAuctionAsset.getClass();
        ((rwn0) o81Var.m213810E2()).f165190M.m137019l(bLiveAuctionAsset);
        C22421c<T> c22421cM138858H3 = o81Var.m138858H3(((rwn0) o81Var.m213810E2()).m168521h2(bLiveAuctionAsset.autoRefreshSeconds, TimeUnit.SECONDS));
        final Function1 function1 = new Function1() { // from class: l.v71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o81.m166424o4(this.f182714a, (Long) obj);
            }
        };
        c22421cM138858H3.subscribe(new y20() { // from class: l.x71
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166425p4(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m166424o4(o81 o81Var, Long l2) {
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = o81Var.ongoingAuction.m222761e();
        if (System.currentTimeMillis() - (bLiveVoiceAuctionM222761e != null ? bLiveVoiceAuctionM222761e.updateTimeInSec : 0L) > o81Var.refreshGapInMills) {
            o81Var.m166431B4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m166425p4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m166426u4(Meta meta) {
        meta.getClass();
        if (meta.code != 200) {
            r1j0.m179415b(meta.message);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m166427v4(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: w4 */
    private final Animator m166428w4() {
        Object value = this.collapse.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: x4 */
    private final Animator m166429x4() {
        Object value = this.expand.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m166430A4(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate updateMsg) {
        LongLinkVoiceLiveAuctionMsg.UpdateType updateType = updateMsg.getUpdateType();
        int i = updateType == null ? -1 : C19049a.f145352b[updateType.ordinal()];
        if (i == 1) {
            m166431B4();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                m166436I4(updateMsg);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                ((LiveVoiceCallAuctionView) this.viewModel).m79102R(updateMsg.getLeaderboardGap());
                return;
            }
        }
        m166436I4(updateMsg);
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e == null) {
            m166431B4();
            return;
        }
        if (!TextUtils.equals(updateMsg.getAuctionId(), bLiveVoiceAuctionM222761e.f45330id)) {
            m166431B4();
            return;
        }
        List<LongLinkVoiceLiveAuctionMsg.AuctionLeaderboard> leaderboardsList = updateMsg.getLeaderboardsList();
        if (leaderboardsList != null) {
            bLiveVoiceAuctionM222761e.leaderboards.clear();
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
                bLiveVoiceAuctionM222761e.leaderboards.add(bLiveAuctionLeaderNew_);
            }
        }
        this.ongoingAuction.m137019l(bLiveVoiceAuctionM222761e);
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) this.viewModel;
        List<BLiveAuctionLeader> list = bLiveVoiceAuctionM222761e.leaderboards;
        list.getClass();
        liveVoiceCallAuctionView.m79104T(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public final void m166431B4() {
        w61 w61Var = w61.INSTANCE;
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(w61Var.m205074X(strM202194o)).subscribe(dhw.m115829h(new y20() { // from class: l.u71
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166399N3(this.f177872a, (BLiveEnvelope) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m166432C4(@NotNull String invitedId) {
        invitedId.getClass();
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(w61.m205043d0(strM202194o, invitedId)).subscribe(dhw.m115826e(new y20() { // from class: l.a81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166401P3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.b81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166415e4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public final void m166433D4(@NotNull BLiveVoiceAuction newAuction) {
        newAuction.getClass();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("winnerUserId", newAuction.leaderboards.get(0).userInfo.userId);
        String str = newAuction.roomId;
        str.getClass();
        String str2 = newAuction.f45330id;
        str2.getClass();
        duringCreated(w61.m205031P(str, str2, "settleAuction", jsonObject.toString())).subscribe(dhw.m115826e(new y20() { // from class: l.c81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166391E4((Meta) obj);
            }
        }, new y20() { // from class: l.d81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166392F4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo113707G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((LiveVoiceCallAuctionView) this.viewModel).f49137d;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    /* JADX INFO: renamed from: G4 */
    public final void m166434G4(LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation msg) {
        userMaskConfig.UserMask guestUser = msg.getGuestUser();
        userMaskConfig.UserMask winnerUser = msg.getWinnerUser();
        String guestTagImage = msg.getGuestTagImage();
        String winnerTagImage = msg.getWinnerTagImage();
        if (guestUser == null || winnerUser == null) {
            return;
        }
        LongLinkVoiceLiveAuctionAnimationMsg.AnimType type = msg.getType();
        int i = type == null ? -1 : C19049a.f145351a[type.ordinal()];
        if (i == 1) {
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            String avatar = guestUser.getAvatar();
            avatar.getClass();
            sVGADynamicEntity.setDynamicImage(avatar, "head_1");
            String avatar2 = winnerUser.getAvatar();
            avatar2.getClass();
            sVGADynamicEntity.setDynamicImage(avatar2, "head_2");
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(qa00.m175861f(12));
            textPaint.setFakeBoldText(true);
            textPaint.setColor(-1);
            textPaint.setAntiAlias(true);
            textPaint.setTextAlign(Paint.Align.CENTER);
            String name = winnerUser.getName();
            name.getClass();
            sVGADynamicEntity.setDynamicText("恭喜 " + bf10.m103845w(name, 4) + " 成为", textPaint, "text_1");
            String name2 = guestUser.getName();
            name2.getClass();
            String str = bf10.m103845w(name2, 4) + "的" + msg.getRelationName() + " Lv." + msg.getLevel();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(n3d0.m161277a(n9c0.f140855p0));
            String relationName = msg.getRelationName();
            relationName.getClass();
            spannableStringBuilder.setSpan(foregroundColorSpan, StringsKt.m94327c0(str, relationName, 0, false, 6, null), str.length(), 18);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(qa00.m175861f(12));
            textPaint2.setColor(-1);
            textPaint2.setFakeBoldText(true);
            sVGADynamicEntity.setDynamicText(new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint2, (int) textPaint2.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true), "text_2");
            m213811F2().VoiceAuctionEvent.showAuctionAnim().mo199273j(new rdh0("https://fe-static.tancdn.com/v1/raw/ab5268eb-a8dc-41bc-89c5-559696e85c8612.svga", sVGADynamicEntity));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m213811F2().VoiceAuctionEvent.showSpecialAuctionAnim().mo199273j(new ivf0(guestUser.getName(), winnerUser.getName(), guestUser.getAvatar(), winnerUser.getAvatar(), guestTagImage, winnerTagImage, msg.getRelationName(), msg.getDaysText()));
            return;
        }
        SVGADynamicEntity sVGADynamicEntity2 = new SVGADynamicEntity();
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setTextSize(qa00.m175861f(14));
        textPaint3.setFakeBoldText(true);
        textPaint3.setColor(-1);
        textPaint3.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint3.setTextAlign(align);
        sVGADynamicEntity2.setDynamicText("定拍成功", textPaint3, "text_1");
        TextPaint textPaint4 = new TextPaint();
        textPaint4.setTextSize(qa00.m175861f(12));
        textPaint4.setColor(-1);
        textPaint4.setAntiAlias(true);
        textPaint4.setTextAlign(align);
        sVGADynamicEntity2.setDynamicText("恭喜 " + winnerUser.getName() + " 成为", textPaint4, "text_2");
        String str2 = guestUser.getName() + "的" + msg.getRelationName() + " Lv." + msg.getLevel();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(n3d0.m161277a(n9c0.f140855p0));
        String relationName2 = msg.getRelationName();
        relationName2.getClass();
        spannableStringBuilder2.setSpan(foregroundColorSpan2, StringsKt.m94327c0(spannableStringBuilder2, relationName2, 0, false, 6, null), spannableStringBuilder2.length(), 18);
        TextPaint textPaint5 = new TextPaint();
        textPaint5.setTextSize(qa00.m175861f(12));
        textPaint5.setColor(-1);
        sVGADynamicEntity2.setDynamicText(new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint5, (int) textPaint5.measureText(str2), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true), "text_3");
        m213811F2().VoiceAuctionEvent.showAuctionAnim().mo199273j(new rdh0("https://fe-static.tancdn.com/v1/raw/933f3e1f-50d4-43f2-954f-a8ebb444fbc013.svga", sVGADynamicEntity2));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m166435H4(boolean isCollapse) {
        String str;
        String str2;
        BLiveAuctionRelation bLiveAuctionRelation;
        BLiveAuctionUserInfo bLiveAuctionUserInfo;
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e == null || (str = bLiveVoiceAuctionM222761e.stage) == null) {
            str = "pending";
        }
        boolean zM88377d = Intrinsics.m88377d(str, "pending");
        V v2 = this.viewModel;
        if (zM88377d) {
            ((LiveVoiceCallAuctionView) v2).m79094I(isCollapse, "res://drawable/" + obc0.f146385k, "拍拍关系，获得限定关系卡");
            return;
        }
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) v2;
        BLiveVoiceAuction bLiveVoiceAuctionM222761e2 = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e2 == null || (bLiveAuctionUserInfo = bLiveVoiceAuctionM222761e2.guestUser) == null || (str2 = bLiveAuctionUserInfo.avatar) == null) {
            str2 = "";
        }
        BLiveVoiceAuction bLiveVoiceAuctionM222761e3 = this.ongoingAuction.m222761e();
        liveVoiceCallAuctionView.m79094I(isCollapse, str2, "正在拍拍" + ((bLiveVoiceAuctionM222761e3 == null || (bLiveAuctionRelation = bLiveVoiceAuctionM222761e3.auctionRelation) == null) ? null : bLiveAuctionRelation.name) + "关系");
    }

    /* JADX INFO: renamed from: I4 */
    public final void m166436I4(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate updateMsg) {
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e == null) {
            m166431B4();
            return;
        }
        if (!TextUtils.equals(updateMsg.getAuctionId(), bLiveVoiceAuctionM222761e.f45330id)) {
            m166431B4();
            return;
        }
        bLiveVoiceAuctionM222761e.guestUser.curWorth = updateMsg.getWorth();
        bLiveVoiceAuctionM222761e.guestUser.curLevel = (int) updateMsg.getLevel();
        String panelBgId = updateMsg.getPanelBgId();
        bLiveVoiceAuctionM222761e.panelBgId = panelBgId;
        LiveVoiceCallAuctionView liveVoiceCallAuctionView = (LiveVoiceCallAuctionView) this.viewModel;
        panelBgId.getClass();
        BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveVoiceAuctionM222761e.guestUser;
        bLiveAuctionUserInfo.getClass();
        String worthBubble = updateMsg.getWorthBubble();
        worthBubble.getClass();
        liveVoiceCallAuctionView.m79103S(panelBgId, bLiveAuctionUserInfo, worthBubble);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo113708P1() {
        return super.mo113708P1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m153103z2(new lpm0(this.curInfo));
        dum<? extends T> dumVar = this.f196918e;
        dumVar.getClass();
        m153103z2(new qvk(dumVar));
        if (!((rwn0) m213810E2()).f165190M.m222765i()) {
            w61 w61Var = w61.INSTANCE;
            String strM202194o = ((rwn0) m213810E2()).m202194o();
            strM202194o.getClass();
            duringCreated(w61Var.m205071S(strM202194o)).subscribe(dhw.m115825d(new y20() { // from class: l.j71
                @Override // p153l.y20
                public final void call(Object obj) {
                    o81.m166422l4(this.f118621a, (BLiveAuctionAsset) obj);
                }
            }));
        }
        m138860d3(x61.class, new qcj() { // from class: l.m71
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o81.m166416f4(this.f135052a, (x61) obj);
            }
        });
        duringCreated(((rwn0) m213810E2()).f165190M.asObservable()).observeOn(fo0.m126432a()).filter(new if00()).subscribe(dhw.m115829h(new y20() { // from class: l.g81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166411a4(this.f102638a, (BLiveAuctionAsset) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m183413Q2());
        final Function1 function1 = new Function1() { // from class: l.h81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o81.m166408X3(this.f108202a, (hrk0.C17564a) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.i81
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o81.m166395K3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.j81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166410Z3(this.f118744a, ((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(this.ongoingAuction).filter(new if00()).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.k81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166404T3(this.f124348a, (BLiveVoiceAuction) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public View mo113709T1() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: Y */
    public void mo113710Y(boolean isCollapse) {
        this.isCollapse = isCollapse;
        LiveVoiceCallAuctionToolbarView liveVoiceCallAuctionToolbarView = this.toolbarView;
        if (liveVoiceCallAuctionToolbarView != null) {
            bnl0.m105524M(liveVoiceCallAuctionToolbarView, !isCollapse);
        }
        m166435H4(isCollapse);
        it0.m142009C(m166429x4());
        it0.m142009C(m166428w4());
        if (isCollapse) {
            m166428w4().start();
        } else {
            m166429x4().start();
        }
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e != null) {
            V v2 = this.viewModel;
            if (isCollapse) {
                ((LiveVoiceCallAuctionView) v2).m79107z(null);
            } else {
                ((LiveVoiceCallAuctionView) v2).m79107z(bLiveVoiceAuctionM222761e.panelBgId);
            }
        }
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ void mo113711b0(boolean z) {
        super.mo113711b0(z);
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: c2 */
    public /* bridge */ int mo113712c2() {
        return super.mo113712c2();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: e2 */
    public /* bridge */ boolean mo113713e2() {
        return super.mo113713e2();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: f1 */
    public /* bridge */ boolean mo113714f1() {
        return super.mo113714f1();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: g1 */
    public int mo113715g1() {
        return yec0.f198951V7;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        LiveVoiceCallAuctionToolbarView liveVoiceCallAuctionToolbarView = this.toolbarView;
        ViewParent parent = liveVoiceCallAuctionToolbarView != null ? liveVoiceCallAuctionToolbarView.getParent() : null;
        parent.getClass();
        ((ViewGroup) parent).removeView(this.toolbarView);
        this.toolbarView = null;
        m213811F2().VoiceAuctionEvent.showAuctionBoard().mo199273j(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m166437n4(String invitedId) {
        m213811F2().VoiceAuctionEvent.openRelationSettingsDlg().mo199273j(invitedId);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m166438q4() {
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e != null) {
            String str = bLiveVoiceAuctionM222761e.stage;
            if (str.hashCode() == -1318566021 && str.equals("ongoing")) {
                m166439r4();
            } else {
                m213811F2().VoiceAuctionEvent.openRelationSettingsDlg().mo199273j("");
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m166439r4() {
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e != null) {
            User userNew_ = User.new_();
            userNew_.f56859id = bLiveVoiceAuctionM222761e.guestUser.userId;
            Picture pictureNew_ = Picture.new_();
            pictureNew_.url = bLiveVoiceAuctionM222761e.guestUser.avatar;
            userNew_.pictures.add(pictureNew_);
            userNew_.name = bLiveVoiceAuctionM222761e.guestUser.userName;
            BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
            BLiveAuctionUserInfo bLiveAuctionUserInfo = bLiveVoiceAuctionM222761e.guestUser;
            bLiveUserMaskNew_.avatar = bLiveAuctionUserInfo.avatar;
            bLiveUserMaskNew_.userId = bLiveAuctionUserInfo.userId;
            bLiveUserMaskNew_.name = bLiveAuctionUserInfo.userName;
            ydn0.m215251d(this, nsv.m164636f(userNew_).m164639c(userNew_.f56859id, bLiveUserMaskNew_, true));
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final void m166440s4() {
        m166439r4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).f148282z.m170284r().m98233I0()).subscribe(dhw.m115829h(new y20() { // from class: l.n81
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166419i4(this.f140644a, (LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).f148282z.m170284r().m98229G0()).subscribe(dhw.m115829h(new y20() { // from class: l.l71
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166421k4(this.f130317a, (LongLinkVoiceLiveAuctionAnimationMsg.VoiceLiveAuctionAnimation) obj);
            }
        }));
        m166431B4();
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m168545q1().m98332v0());
        final Function1 function1 = new Function1() { // from class: l.n71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o81.m166397L3((b3v) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.o71
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o81.m166413c4(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.p71
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166400O3(this.f150894a, (b3v) obj);
            }
        }));
        m213811F2().VoiceAuctionEvent.showAuctionBoard().mo199274m(Boolean.TRUE);
        m138862g3(m213811F2().VoiceAuctionEvent.refreshAuction(), new x20() { // from class: l.q71
            @Override // p153l.x20
            public final void call() {
                o81.m166405U3(this.f155931a);
            }
        });
        C22421c c22421cObserveOn = duringCreated(((rwn0) m213810E2()).m168545q1().m98302l0()).observeOn(fo0.m126432a());
        final Function1 function2 = new Function1() { // from class: l.r71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o81.m166398M3(this.f161575a, (VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        };
        c22421cObserveOn.filter(new qcj() { // from class: l.s71
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return o81.m166402R3(function2, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.t71
            @Override // p153l.y20
            public final void call(Object obj) {
                o81.m166412b4(this.f172389a, (VoiceUpdateUserMaskProto.UserMaskUpdate) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m166441t4(@NotNull String action) {
        action.getClass();
        BLiveVoiceAuction bLiveVoiceAuctionM222761e = this.ongoingAuction.m222761e();
        if (bLiveVoiceAuctionM222761e != null) {
            String str = bLiveVoiceAuctionM222761e.roomId;
            str.getClass();
            String str2 = bLiveVoiceAuctionM222761e.f45330id;
            str2.getClass();
            w61.m205031P(str, str2, action, null).subscribe(dhw.m115826e(new y20() { // from class: l.e81
                @Override // p153l.y20
                public final void call(Object obj) {
                    o81.m166426u4((Meta) obj);
                }
            }, new y20() { // from class: l.f81
                @Override // p153l.y20
                public final void call(Object obj) {
                    o81.m166427v4((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: u */
    public void mo113716u(@NotNull ViewGroup root) {
        root.getClass();
        super.mo113716u(root);
        ((LiveVoiceCallAuctionView) this.viewModel).m79091A(root);
        if (root instanceof LiveVirtualVoiceFunctionPanelView) {
            LiveVirtualVoiceFunctionPanelView liveVirtualVoiceFunctionPanelView = (LiveVirtualVoiceFunctionPanelView) root;
            View viewInflate = LayoutInflater.from(liveVirtualVoiceFunctionPanelView.getContext()).inflate(yec0.f198939U7, (ViewGroup) null);
            viewInflate.getClass();
            this.toolbarView = (LiveVoiceCallAuctionToolbarView) viewInflate;
            liveVirtualVoiceFunctionPanelView.f48959g.addView(viewInflate);
            m153103z2(new x81(this.curInfo, this.toolbarView, this.ongoingAuction));
            m153103z2(new i71(this.f196918e, this.ongoingAuction));
        }
        ((LiveVoiceCallAuctionView) this.viewModel).m79099O();
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo113717x() {
        ConstraintLayout constraintLayout = ((LiveVoiceCallAuctionView) this.viewModel).f49138e;
        constraintLayout.getClass();
        return constraintLayout;
    }

    /* JADX INFO: renamed from: y4 */
    public final boolean m166442y4() {
        return this.ongoingAuction.m222765i() && Intrinsics.m88377d("ongoing", this.ongoingAuction.m222761e().stage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m166443z4(@NotNull String uid) {
        uid.getClass();
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(7013).userId(uid).setSource("auction").setFromIdentity(csq.m112227a(this, ((rwn0) m213810E2()).m168526j0(), uid, 7013)).setTo(csq.m112230d(this, ((rwn0) m213810E2()).m168526j0(), uid, 7013)).setScene(BLiveType.voiceLive).trackFrom("auction").build());
    }
}
