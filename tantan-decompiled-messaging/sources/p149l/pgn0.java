package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceSquareCampaignBean;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p046p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import com.p046p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.DialogC13147a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001vB\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ)\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001c2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0012J\u001f\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bJ\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010.J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\t2\u0006\u00103\u001a\u000206¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b@\u0010<J\u0015\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020&¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\t¢\u0006\u0004\bD\u0010\u000bJ\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010\u000bJ\r\u0010F\u001a\u00020\u0010¢\u0006\u0004\bF\u0010\u0012R\u0014\u0010I\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR0\u0010Q\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"0Mj\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"`N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u001f\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001e\u0010b\u001a\n\u0018\u00010^j\u0004\u0018\u0001`_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010l\u001a\u0004\br\u0010s¨\u0006w"}, m87232d2 = {"Ll/pgn0;", "Ll/lss;", "Ll/vgn0;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", BaseSei.INFO, "<init>", "(Ll/mcr;Ll/mss;)V", "", "K3", "()V", "", "staySec", "L3", "(I)V", "", "u3", "()Z", "F3", "Lcom/p1/mobile/putong/live/base/apibean/IntlVoiceSquareCampaignBean;", Careers.f38732it, "y3", "(Lcom/p1/mobile/putong/live/base/apibean/IntlVoiceSquareCampaignBean;)V", "G3", "E3", "p3", "q3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "Ll/c6o;", "s3", "(Ljava/util/List;)Ljava/util/List;", "O3", "", xh5.API_VERSION_V3, "()J", "z3", "", "voiceTabId", "enable", "o3", "(Ljava/lang/String;Z)V", "I2", "show", "N3", "(Z)V", "hidden", "L2", "M3", "Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", "entryView", "m3", "(Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;)V", "Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", "n3", "(Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;)V", "voiceTab", "position", "I3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;I)V", "isRefresh", "J3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;IZ)V", "C3", "id", "D3", "(Ljava/lang/String;)V", "H3", "r3", "B3", "f", "I", "REFRESH_TIME_STEP", "g", "J", "currentActStopTime", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "topicTimeMap", "Ll/d30;", RXScreenCaptureService.KEY_INDEX, "Ll/d30;", "requestSuccess", "j", "requestError", "Ll/e30;", "k", "Ll/e30;", "getRefresh", "()Ll/e30;", BLiveOperationActionAfterCountdown.refresh, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/lang/Runnable;", "refreshCampaignRunnable", "Lcom/p1/mobile/putong/ui/webview/mk/a;", "m", "Lcom/p1/mobile/putong/ui/webview/mk/a;", "campaignDialog", "n", "Z", "isShowCampaign", "Ll/u3v;", "o", "Lkotlin/Lazy;", "x3", "()Ll/u3v;", "liveVoiceEntryPresenter", "Ll/rin;", "p", "w3", "()Ll/rin;", "gameEntryPresenter", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pgn0 extends lss<vgn0> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int REFRESH_TIME_STEP;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long currentActStopTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Long> topicTimeMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final d30 requestSuccess;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final d30 requestError;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final e30<String> refresh;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Runnable refreshCampaignRunnable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public DialogC13147a campaignDialog;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isShowCampaign;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy liveVoiceEntryPresenter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy gameEntryPresenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgn0(@Nullable mcr mcrVar, @NotNull mss mssVar) {
        super(mcrVar, mssVar);
        mssVar.getClass();
        this.REFRESH_TIME_STEP = 5000;
        this.topicTimeMap = new HashMap<>();
        this.requestSuccess = new d30() { // from class: l.tfn0
            @Override // p149l.d30
            public final void call() {
                pgn0.m168773T2(this.f170009a);
            }
        };
        this.requestError = new d30() { // from class: l.egn0
            @Override // p149l.d30
            public final void call() {
                pgn0.m168770Q2(this.f90965a);
            }
        };
        this.refresh = new e30() { // from class: l.hgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168777X2(this.f107610a, (String) obj);
            }
        };
        this.liveVoiceEntryPresenter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ign0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pgn0.m168785f3(this.f113137a);
            }
        });
        this.gameEntryPresenter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.jgn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return pgn0.m168788i3(this.f117811a);
            }
        });
    }

    /* JADX INFO: renamed from: P2 */
    public static void m168769P2(roj0 roj0Var) {
        roj0Var.getClass();
        LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
    }

    /* JADX INFO: renamed from: Q2 */
    public static void m168770Q2(pgn0 pgn0Var) {
        vgn0 vgn0Var = (vgn0) pgn0Var.viewModel;
        if (vgn0Var != null) {
            vgn0Var.m198352Y();
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static void m168771R2(pgn0 pgn0Var, List list) {
        vgn0 vgn0Var = (vgn0) pgn0Var.viewModel;
        list.getClass();
        vgn0Var.m198355b0(list, pgn0Var.m168812s3(list));
    }

    /* JADX INFO: renamed from: S2 */
    public static BLiveActivityCounter m168772S2(BLiveCounter bLiveCounter) {
        bLiveCounter.getClass();
        return bLiveCounter.activity;
    }

    /* JADX INFO: renamed from: T2 */
    public static void m168773T2(pgn0 pgn0Var) {
        vgn0 vgn0Var = (vgn0) pgn0Var.viewModel;
        if (vgn0Var != null) {
            vgn0Var.m198354a0();
        }
    }

    /* JADX INFO: renamed from: U2 */
    public static void m168774U2(pgn0 pgn0Var, Long l2) {
        pgn0Var.m168810q3();
    }

    /* JADX INFO: renamed from: V2 */
    public static void m168775V2(pgn0 pgn0Var, Throwable th) {
        th.getClass();
        gkh0.m126627j("VoiceIntlSquarePresenter", "error:" + th.getMessage());
        ((vgn0) pgn0Var.viewModel).m198352Y();
    }

    /* JADX INFO: renamed from: X2 */
    public static void m168777X2(pgn0 pgn0Var, String str) {
        if (!pgn0Var.m168818z3()) {
            pgn0Var.m168816x3().m191640t0();
        }
        pgn0Var.m168815w3().m179524U2();
    }

    /* JADX INFO: renamed from: Y2 */
    public static void m168778Y2(Throwable th) {
    }

    /* JADX INFO: renamed from: Z2 */
    public static void m168779Z2(pgn0 pgn0Var, int i) {
        pgn0Var.m168802L3(i);
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m168780a3(pgn0 pgn0Var, Long l2) {
        return Boolean.valueOf(pgn0Var.m168813u3());
    }

    /* JADX INFO: renamed from: b3 */
    public static BLiveActivityCounter m168781b3(Function1 function1, Object obj) {
        return (BLiveActivityCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m168782c3(pgn0 pgn0Var, IntlVoiceSquareCampaignBean intlVoiceSquareCampaignBean) {
        intlVoiceSquareCampaignBean.getClass();
        pgn0Var.m168817y3(intlVoiceSquareCampaignBean);
    }

    /* JADX INFO: renamed from: d3 */
    public static void m168783d3(pgn0 pgn0Var, C4319c c4319c) {
        c4319c.getClass();
        if (c4319c == C4319c.f15547h) {
            pgn0Var.m168796F3();
        } else if (c4319c == C4319c.f15550k) {
            pgn0Var.m168797G3();
        } else if (c4319c == C4319c.f15552m) {
            pgn0Var.m168795E3();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static void m168784e3(pgn0 pgn0Var, boolean z) {
        if (z) {
            return;
        }
        xdl0.m208344M(((vgn0) pgn0Var.viewModel).m198379x(), false);
    }

    /* JADX INFO: renamed from: f3 */
    public static u3v m168785f3(pgn0 pgn0Var) {
        return new u3v(pgn0Var.getAct());
    }

    /* JADX INFO: renamed from: g3 */
    public static void m168786g3(pgn0 pgn0Var, C4319c c4319c) {
        if (Intrinsics.m87488d(C4319c.f15548i, c4319c)) {
            pgn0Var.m168804N3(true);
        } else if (Intrinsics.m87488d(C4319c.f15549j, c4319c)) {
            pgn0Var.m168804N3(false);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public static Boolean m168787h3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i3 */
    public static rin m168788i3(pgn0 pgn0Var) {
        return new rin(pgn0Var.getAct(), pgn0Var.m151643H2(), false);
    }

    /* JADX INFO: renamed from: j3 */
    public static void m168789j3(Throwable th) {
        th.getClass();
    }

    /* JADX INFO: renamed from: k3 */
    public static void m168790k3(pgn0 pgn0Var, BLiveActivityCounter bLiveActivityCounter) {
        bLiveActivityCounter.getClass();
        vgn0 vgn0Var = (vgn0) pgn0Var.viewModel;
        String str = xvo0.f194659c;
        str.getClass();
        vgn0Var.m198361g0(str, bLiveActivityCounter.momentUnReadCon > 0);
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m168791t3(pgn0 pgn0Var, BLiveVoiceTab bLiveVoiceTab, Boolean bool) {
        String str = bLiveVoiceTab.f44513id;
        str.getClass();
        bool.getClass();
        pgn0Var.m168808o3(str, bool.booleanValue());
    }

    /* JADX INFO: renamed from: B3 */
    public final boolean m168792B3() {
        return m151643H2().f135531b instanceof LiveSquareVoiceFragment;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m168793C3(@NotNull BLiveVoiceTab voiceTab, int position) {
        voiceTab.getClass();
        String str = voiceTab.f44513id;
        str.getClass();
        Long l2 = this.topicTimeMap.get(str);
        this.topicTimeMap.put(str, Long.valueOf(m168814v3()));
        if (l2 == null || l2.longValue() <= 0 || m168814v3() - l2.longValue() < this.REFRESH_TIME_STEP) {
            return;
        }
        m168799I3(voiceTab, position);
    }

    /* JADX INFO: renamed from: D3 */
    public final void m168794D3(@NotNull String id) {
        id.getClass();
        this.topicTimeMap.put(id, Long.valueOf(m168814v3()));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m168795E3() {
        ((vgn0) this.viewModel).m198370m0();
    }

    /* JADX INFO: renamed from: F3 */
    public final void m168796F3() {
        BLiveVoiceTab bLiveVoiceTabM198377v;
        BLiveVoiceTab bLiveVoiceTabM198377v2;
        wlo0.INSTANCE.m203844b(false);
        if (((vgn0) this.viewModel).m198348U()) {
            m168803M3();
            return;
        }
        if (!((vgn0) this.viewModel).m198373p().get(((vgn0) this.viewModel).m198376u()).mo105488I().booleanValue() && (bLiveVoiceTabM198377v2 = ((vgn0) this.viewModel).m198377v()) != null) {
            m168799I3(bLiveVoiceTabM198377v2, ((vgn0) this.viewModel).m198376u());
            return;
        }
        if (m168809p3() && (bLiveVoiceTabM198377v = ((vgn0) this.viewModel).m198377v()) != null) {
            m168799I3(bLiveVoiceTabM198377v, ((vgn0) this.viewModel).m198376u());
        }
        ((vgn0) this.viewModel).m198366k0();
    }

    /* JADX INFO: renamed from: G3 */
    public final void m168797G3() {
        wlo0.INSTANCE.m203844b(true);
        this.currentActStopTime = m168814v3();
        ((vgn0) this.viewModel).m198370m0();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m168798H3() {
        if (m168818z3()) {
            return;
        }
        m168816x3().m191639s0();
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.ngn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168783d3(this.f138890a, (C4319c) obj);
            }
        }));
        C22306c c22306cOnBackpressureLatest = duringCreated(C22306c.interval(1L, TimeUnit.MINUTES)).onBackpressureLatest();
        final Function1 function1 = new Function1() { // from class: l.vfn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pgn0.m168780a3(this.f181289a, (Long) obj);
            }
        };
        c22306cOnBackpressureLatest.filter(new w9j() { // from class: l.wfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pgn0.m168787h3(function1, obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.xfn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168774U2(this.f192699a, (Long) obj);
            }
        }));
        gld0<hl3> gld0Var = gld0.f103313c;
        C22306c<T> c22306cDuringCreated = duringCreated(((hl3) s9s.m182763m(gld0Var)).m131634h());
        final Function1 function2 = new Function1() { // from class: l.yfn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pgn0.m168772S2((BLiveCounter) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.zfn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return pgn0.m168781b3(function2, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.agn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168790k3(this.f69384a, (BLiveActivityCounter) obj);
            }
        }, new e30() { // from class: l.bgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168789j3((Throwable) obj);
            }
        }));
        duringCreated(((hl3) s9s.m182763m(gld0Var)).m131633g()).subscribe(ffw.m121194e(new e30() { // from class: l.cgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168769P2((roj0) obj);
            }
        }, new e30() { // from class: l.dgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168778Y2((Throwable) obj);
            }
        }));
        duringCreated(m151642F2().IntlGameOperationEvent.gameEntranceViewVisibility().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ogn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168784e3(this.f143885a, ((Boolean) obj).booleanValue());
            }
        }));
        if (l9s.m149039B(getAct())) {
            return;
        }
        getAct().lifecycle().subscribe(ffw.m121197h(new e30() { // from class: l.ufn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168786g3(this.f176291a, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I3 */
    public final void m168799I3(@NotNull BLiveVoiceTab voiceTab, int position) {
        voiceTab.getClass();
        m168800J3(voiceTab, position, false);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m168800J3(@NotNull BLiveVoiceTab voiceTab, int position, boolean isRefresh) {
        dwr dwrVarMo105489m;
        voiceTab.getClass();
        c6o<BLiveVoiceTab> c6oVarM198371n = ((vgn0) this.viewModel).m198371n(position);
        if (c6oVarM198371n == null || (dwrVarMo105489m = c6oVarM198371n.mo105489m()) == null) {
            return;
        }
        dwrVarMo105489m.mo111900g0(voiceTab, position, ((vgn0) this.viewModel).m198373p(), isRefresh);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m168801K3() {
        e51.m114745J(this.refreshCampaignRunnable);
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: L2 */
    public void mo151645L2(boolean hidden) {
        if (hidden) {
            m168797G3();
        } else {
            m168796F3();
            ((vgn0) this.viewModel).m198372n0();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final void m168802L3(int staySec) {
        DialogC13147a dialogC13147a = this.campaignDialog;
        if (dialogC13147a == null || !dialogC13147a.isShowing()) {
            duringCreated(IntlVoiceCenterApiProvider.getVoiceSquareCampaignData(staySec)).subscribe(ffw.m121197h(new e30() { // from class: l.fgn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pgn0.m168782c3(this.f97389a, (IntlVoiceSquareCampaignBean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m168803M3() {
        duringCreated(IntlVoiceCenterApiProvider.getVoiceLiveTabs()).subscribe(ffw.m121194e(new e30() { // from class: l.kgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168771R2(this.f123046a, (List) obj);
            }
        }, new e30() { // from class: l.lgn0
            @Override // p149l.e30
            public final void call(Object obj) {
                pgn0.m168775V2(this.f128007a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final void m168804N3(boolean show) {
        if (show) {
            this.isShowCampaign = true;
            m168802L3(0);
        } else {
            this.isShowCampaign = false;
            m168801K3();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m168805O3() {
        if (((vgn0) this.viewModel).m198377v() != null) {
            ((vgn0) this.viewModel).m198375s().mo105489m().mo111901j0(((vgn0) this.viewModel).m198376u(), ((vgn0) this.viewModel).m198373p());
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final void m168806m3(@NotNull LiveVoiceEntryView entryView) {
        entryView.getClass();
        m168816x3().mo51532C(entryView);
        m168816x3().mo39470a0();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m168807n3(@NotNull IntlGameOperationView entryView) {
        entryView.getClass();
        m168815w3().mo51532C(entryView);
        m168815w3().mo69101I2();
        m168815w3().m179524U2();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m168808o3(String voiceTabId, boolean enable) {
        BLiveVoiceTab bLiveVoiceTabM198377v = ((vgn0) this.viewModel).m198377v();
        if (bLiveVoiceTabM198377v == null || !Intrinsics.m87488d(bLiveVoiceTabM198377v.f44513id, voiceTabId)) {
            return;
        }
        ((vgn0) this.viewModel).m198358d0(enable);
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m168809p3() {
        return m168814v3() - this.currentActStopTime >= ((long) this.REFRESH_TIME_STEP) && !((vgn0) this.viewModel).m198348U();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m168810q3() {
        m168805O3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m168811r3() {
        BLiveCounter bLiveCounterM221515e = ((hl3) s9s.m182763m(gld0.f103313c)).m131634h().m221515e();
        if (bLiveCounterM221515e == null || !bLiveCounterM221515e.isHaveTextRed()) {
            return;
        }
        bLiveCounterM221515e.clearTextRed();
        LiveVoiceApi.postVoiceActivitiesToZero("text");
    }

    /* JADX INFO: renamed from: s3 */
    public final List<c6o<BLiveVoiceTab>> m168812s3(List<? extends BLiveVoiceTab> it) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceTab bLiveVoiceTab : it) {
            dio0 dio0Var = new dio0(getAct(), bLiveVoiceTab, m168792B3(), new e30() { // from class: l.mgn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    pgn0.m168791t3(this.f133706a, bLiveVoiceTab, (Boolean) obj);
                }
            });
            Act act = getAct();
            act.getClass();
            VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel = new VoiceRoomSquareCommonViewModel(act, bLiveVoiceTab, m168792B3());
            dio0Var.mo39470a0();
            voiceRoomSquareCommonViewModel.setOnScrollListener(((vgn0) this.viewModel).getOnScrollListener());
            dio0Var.mo51532C(voiceRoomSquareCommonViewModel);
            int i = xdl0.f192403e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.leftMargin = svq.m186103c(2);
            layoutParams.rightMargin = svq.m186103c(2);
            layoutParams.topMargin = svq.m186103c(10);
            dio0Var.mo105486A().setLayoutParams(layoutParams);
            dio0Var.m113941i0(this.refresh);
            dio0Var.m113940h0(this.requestSuccess, this.requestError);
            arrayList.add(dio0Var);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u3 */
    public final boolean m168813u3() {
        return lifecycle_() == C4319c.f15548i && !((vgn0) this.viewModel).m198348U();
    }

    /* JADX INFO: renamed from: v3 */
    public final long m168814v3() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: w3 */
    public final rin m168815w3() {
        return (rin) this.gameEntryPresenter.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final u3v m168816x3() {
        return (u3v) this.liveVoiceEntryPresenter.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m168817y3(IntlVoiceSquareCampaignBean it) {
        IntlVoiceSquareCampaignBean.IntlVoiceSquareCampaignData intlVoiceSquareCampaignData = it.voiceRecommendPageCampaign;
        if (!this.isShowCampaign || intlVoiceSquareCampaignData == null) {
            return;
        }
        if (!TextUtils.isEmpty(intlVoiceSquareCampaignData.url)) {
            DialogC13147a dialogC13147a = this.campaignDialog;
            if (dialogC13147a != null) {
                dialogC13147a.dismiss();
            }
            DialogC13147a dialogC13147a2 = new DialogC13147a(getAct());
            this.campaignDialog = dialogC13147a2;
            dialogC13147a2.m80265Q(intlVoiceSquareCampaignData.url);
            return;
        }
        final int i = intlVoiceSquareCampaignData.staySeconds;
        if (i > 0) {
            Runnable runnable = new Runnable() { // from class: l.ggn0
                @Override // java.lang.Runnable
                public final void run() {
                    pgn0.m168779Z2(this.f102526a, i);
                }
            };
            this.refreshCampaignRunnable = runnable;
            e51.m114745J(runnable);
            e51.m114743H(getAct(), this.refreshCampaignRunnable, ((long) intlVoiceSquareCampaignData.staySeconds) * 1000);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final boolean m168818z3() {
        return s9s.f163228b.m195762W6();
    }
}
