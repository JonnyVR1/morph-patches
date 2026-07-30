package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceSquareCampaignBean;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.common.VoiceRoomSquareCommonViewModel;
import com.p051p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceEntryView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.DialogC13310a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 u2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001vB\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ)\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001e0\u001c2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010\u0012J\u001f\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u000bJ\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010.J\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\u0015\u00104\u001a\u00020\t2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\t2\u0006\u00103\u001a\u000206¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\u0010¢\u0006\u0004\b>\u0010?J\u001d\u0010@\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\f¢\u0006\u0004\b@\u0010<J\u0015\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020&¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\t¢\u0006\u0004\bD\u0010\u000bJ\r\u0010E\u001a\u00020\t¢\u0006\u0004\bE\u0010\u000bJ\r\u0010F\u001a\u00020\u0010¢\u0006\u0004\bF\u0010\u0012R\u0014\u0010I\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010L\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR0\u0010Q\u001a\u001e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"0Mj\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\"`N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010TR\u001f\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001e\u0010b\u001a\n\u0018\u00010^j\u0004\u0018\u0001`_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010l\u001a\u0004\br\u0010s¨\u0006w"}, m88121d2 = {"Ll/tpn0;", "Ll/mus;", "Ll/zpn0;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", BaseSei.INFO, "<init>", "(Ll/ner;Ll/nus;)V", "", "K3", "()V", "", "staySec", "L3", "(I)V", "", "u3", "()Z", "F3", "Lcom/p1/mobile/putong/live/base/apibean/IntlVoiceSquareCampaignBean;", Careers.f39580it, "y3", "(Lcom/p1/mobile/putong/live/base/apibean/IntlVoiceSquareCampaignBean;)V", "G3", "E3", "p3", "q3", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "Ll/c8o;", "s3", "(Ljava/util/List;)Ljava/util/List;", "O3", "", xi5.API_VERSION_V3, "()J", "z3", "", "voiceTabId", "enable", "o3", "(Ljava/lang/String;Z)V", "I2", "show", "N3", "(Z)V", "hidden", "L2", "M3", "Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;", "entryView", "m3", "(Lcom/p1/mobile/putong/live/external/voiceslipcard/chatroom/LiveVoiceEntryView;)V", "Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;", "n3", "(Lcom/p1/mobile/putong/live/external/intl/common/gameoperation/IntlGameOperationView;)V", "voiceTab", "position", "I3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;I)V", "isRefresh", "J3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;IZ)V", "C3", "id", "D3", "(Ljava/lang/String;)V", "H3", "r3", "B3", "f", "I", "REFRESH_TIME_STEP", "g", "J", "currentActStopTime", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "topicTimeMap", "Ll/x20;", RXScreenCaptureService.KEY_INDEX, "Ll/x20;", "requestSuccess", "j", "requestError", "Ll/y20;", "k", "Ll/y20;", "getRefresh", "()Ll/y20;", BLiveOperationActionAfterCountdown.refresh, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/lang/Runnable;", "refreshCampaignRunnable", "Lcom/p1/mobile/putong/ui/webview/mk/a;", "m", "Lcom/p1/mobile/putong/ui/webview/mk/a;", "campaignDialog", "n", "Z", "isShowCampaign", "Ll/v5v;", "o", "Lkotlin/Lazy;", "x3", "()Ll/v5v;", "liveVoiceEntryPresenter", "Ll/rkn;", "p", "w3", "()Ll/rkn;", "gameEntryPresenter", "Companion", "a", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class tpn0 extends mus<zpn0> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int REFRESH_TIME_STEP;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long currentActStopTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final HashMap<String, Long> topicTimeMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final x20 requestSuccess;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final x20 requestError;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final y20<String> refresh;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Runnable refreshCampaignRunnable;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public DialogC13310a campaignDialog;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean isShowCampaign;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Lazy liveVoiceEntryPresenter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy gameEntryPresenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpn0(@Nullable ner nerVar, @NotNull nus nusVar) {
        super(nerVar, nusVar);
        nusVar.getClass();
        this.REFRESH_TIME_STEP = 5000;
        this.topicTimeMap = new HashMap<>();
        this.requestSuccess = new x20() { // from class: l.xon0
            @Override // p153l.x20
            public final void call() {
                tpn0.m192150T2(this.f195587a);
            }
        };
        this.requestError = new x20() { // from class: l.ipn0
            @Override // p153l.x20
            public final void call() {
                tpn0.m192147Q2(this.f116292a);
            }
        };
        this.refresh = new y20() { // from class: l.lpn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192154X2(this.f133079a, (String) obj);
            }
        };
        this.liveVoiceEntryPresenter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.mpn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tpn0.m192162f3(this.f137933a);
            }
        });
        this.gameEntryPresenter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.npn0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return tpn0.m192165i3(this.f143111a);
            }
        });
    }

    /* JADX INFO: renamed from: P2 */
    public static void m192146P2(uxj0 uxj0Var) {
        uxj0Var.getClass();
        LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
    }

    /* JADX INFO: renamed from: Q2 */
    public static void m192147Q2(tpn0 tpn0Var) {
        zpn0 zpn0Var = (zpn0) tpn0Var.viewModel;
        if (zpn0Var != null) {
            zpn0Var.m220886Y();
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static void m192148R2(tpn0 tpn0Var, List list) {
        zpn0 zpn0Var = (zpn0) tpn0Var.viewModel;
        list.getClass();
        zpn0Var.m220889b0(list, tpn0Var.m192189s3(list));
    }

    /* JADX INFO: renamed from: S2 */
    public static BLiveActivityCounter m192149S2(BLiveCounter bLiveCounter) {
        bLiveCounter.getClass();
        return bLiveCounter.activity;
    }

    /* JADX INFO: renamed from: T2 */
    public static void m192150T2(tpn0 tpn0Var) {
        zpn0 zpn0Var = (zpn0) tpn0Var.viewModel;
        if (zpn0Var != null) {
            zpn0Var.m220888a0();
        }
    }

    /* JADX INFO: renamed from: U2 */
    public static void m192151U2(tpn0 tpn0Var, Long l2) {
        tpn0Var.m192187q3();
    }

    /* JADX INFO: renamed from: V2 */
    public static void m192152V2(tpn0 tpn0Var, Throwable th) {
        th.getClass();
        nsh0.m164608j("VoiceIntlSquarePresenter", "error:" + th.getMessage());
        ((zpn0) tpn0Var.viewModel).m220886Y();
    }

    /* JADX INFO: renamed from: X2 */
    public static void m192154X2(tpn0 tpn0Var, String str) {
        if (!tpn0Var.m192195z3()) {
            tpn0Var.m192193x3().m199941t0();
        }
        tpn0Var.m192192w3().m181869U2();
    }

    /* JADX INFO: renamed from: Y2 */
    public static void m192155Y2(Throwable th) {
    }

    /* JADX INFO: renamed from: Z2 */
    public static void m192156Z2(tpn0 tpn0Var, int i) {
        tpn0Var.m192179L3(i);
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m192157a3(tpn0 tpn0Var, Long l2) {
        return Boolean.valueOf(tpn0Var.m192190u3());
    }

    /* JADX INFO: renamed from: b3 */
    public static BLiveActivityCounter m192158b3(Function1 function1, Object obj) {
        return (BLiveActivityCounter) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c3 */
    public static void m192159c3(tpn0 tpn0Var, IntlVoiceSquareCampaignBean intlVoiceSquareCampaignBean) {
        intlVoiceSquareCampaignBean.getClass();
        tpn0Var.m192194y3(intlVoiceSquareCampaignBean);
    }

    /* JADX INFO: renamed from: d3 */
    public static void m192160d3(tpn0 tpn0Var, C4470c c4470c) {
        c4470c.getClass();
        if (c4470c == C4470c.f16266h) {
            tpn0Var.m192173F3();
        } else if (c4470c == C4470c.f16269k) {
            tpn0Var.m192174G3();
        } else if (c4470c == C4470c.f16271m) {
            tpn0Var.m192172E3();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static void m192161e3(tpn0 tpn0Var, boolean z) {
        if (z) {
            return;
        }
        bnl0.m105524M(((zpn0) tpn0Var.viewModel).m220913x(), false);
    }

    /* JADX INFO: renamed from: f3 */
    public static v5v m192162f3(tpn0 tpn0Var) {
        return new v5v(tpn0Var.getAct());
    }

    /* JADX INFO: renamed from: g3 */
    public static void m192163g3(tpn0 tpn0Var, C4470c c4470c) {
        if (Intrinsics.m88377d(C4470c.f16267i, c4470c)) {
            tpn0Var.m192181N3(true);
        } else if (Intrinsics.m88377d(C4470c.f16268j, c4470c)) {
            tpn0Var.m192181N3(false);
        }
    }

    /* JADX INFO: renamed from: h3 */
    public static Boolean m192164h3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i3 */
    public static rkn m192165i3(tpn0 tpn0Var) {
        return new rkn(tpn0Var.getAct(), tpn0Var.m160239H2(), false);
    }

    /* JADX INFO: renamed from: j3 */
    public static void m192166j3(Throwable th) {
        th.getClass();
    }

    /* JADX INFO: renamed from: k3 */
    public static void m192167k3(tpn0 tpn0Var, BLiveActivityCounter bLiveActivityCounter) {
        bLiveActivityCounter.getClass();
        zpn0 zpn0Var = (zpn0) tpn0Var.viewModel;
        String str = b5p0.f75082c;
        str.getClass();
        zpn0Var.m220895g0(str, bLiveActivityCounter.momentUnReadCon > 0);
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m192168t3(tpn0 tpn0Var, BLiveVoiceTab bLiveVoiceTab, Boolean bool) {
        String str = bLiveVoiceTab.f45361id;
        str.getClass();
        bool.getClass();
        tpn0Var.m192185o3(str, bool.booleanValue());
    }

    /* JADX INFO: renamed from: B3 */
    public final boolean m192169B3() {
        return m160239H2().f143738b instanceof LiveSquareVoiceFragment;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m192170C3(@NotNull BLiveVoiceTab voiceTab, int position) {
        voiceTab.getClass();
        String str = voiceTab.f45361id;
        str.getClass();
        Long l2 = this.topicTimeMap.get(str);
        this.topicTimeMap.put(str, Long.valueOf(m192191v3()));
        if (l2 == null || l2.longValue() <= 0 || m192191v3() - l2.longValue() < this.REFRESH_TIME_STEP) {
            return;
        }
        m192176I3(voiceTab, position);
    }

    /* JADX INFO: renamed from: D3 */
    public final void m192171D3(@NotNull String id) {
        id.getClass();
        this.topicTimeMap.put(id, Long.valueOf(m192191v3()));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m192172E3() {
        ((zpn0) this.viewModel).m220904m0();
    }

    /* JADX INFO: renamed from: F3 */
    public final void m192173F3() {
        BLiveVoiceTab bLiveVoiceTabM220911v;
        BLiveVoiceTab bLiveVoiceTabM220911v2;
        avo0.INSTANCE.m100478b(false);
        if (((zpn0) this.viewModel).m220882U()) {
            m192180M3();
            return;
        }
        if (!((zpn0) this.viewModel).m220907p().get(((zpn0) this.viewModel).m220910u()).mo108375I().booleanValue() && (bLiveVoiceTabM220911v2 = ((zpn0) this.viewModel).m220911v()) != null) {
            m192176I3(bLiveVoiceTabM220911v2, ((zpn0) this.viewModel).m220910u());
            return;
        }
        if (m192186p3() && (bLiveVoiceTabM220911v = ((zpn0) this.viewModel).m220911v()) != null) {
            m192176I3(bLiveVoiceTabM220911v, ((zpn0) this.viewModel).m220910u());
        }
        ((zpn0) this.viewModel).m220900k0();
    }

    /* JADX INFO: renamed from: G3 */
    public final void m192174G3() {
        avo0.INSTANCE.m100478b(true);
        this.currentActStopTime = m192191v3();
        ((zpn0) this.viewModel).m220904m0();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m192175H3() {
        if (m192195z3()) {
            return;
        }
        m192193x3().m199940s0();
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.rpn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192160d3(this.f164385a, (C4470c) obj);
            }
        }));
        C22421c c22421cOnBackpressureLatest = duringCreated(C22421c.interval(1L, TimeUnit.MINUTES)).onBackpressureLatest();
        final Function1 function1 = new Function1() { // from class: l.zon0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tpn0.m192157a3(this.f205362a, (Long) obj);
            }
        };
        c22421cOnBackpressureLatest.filter(new qcj() { // from class: l.apn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tpn0.m192164h3(function1, obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.bpn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192151U2(this.f77792a, (Long) obj);
            }
        }));
        itd0<gm3> itd0Var = itd0.f116821c;
        C22421c<T> c22421cDuringCreated = duringCreated(((gm3) tbs.m190077m(itd0Var)).m130733h());
        final Function1 function2 = new Function1() { // from class: l.cpn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tpn0.m192149S2((BLiveCounter) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.dpn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tpn0.m192158b3(function2, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.epn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192167k3(this.f95259a, (BLiveActivityCounter) obj);
            }
        }, new y20() { // from class: l.fpn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192166j3((Throwable) obj);
            }
        }));
        duringCreated(((gm3) tbs.m190077m(itd0Var)).m130732g()).subscribe(dhw.m115826e(new y20() { // from class: l.gpn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192146P2((uxj0) obj);
            }
        }, new y20() { // from class: l.hpn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192155Y2((Throwable) obj);
            }
        }));
        duringCreated(m160238F2().IntlGameOperationEvent.gameEntranceViewVisibility().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.spn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192161e3(this.f170072a, ((Boolean) obj).booleanValue());
            }
        }));
        if (mbs.m157816B(getAct())) {
            return;
        }
        getAct().lifecycle().subscribe(dhw.m115829h(new y20() { // from class: l.yon0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192163g3(this.f200993a, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I3 */
    public final void m192176I3(@NotNull BLiveVoiceTab voiceTab, int position) {
        voiceTab.getClass();
        m192177J3(voiceTab, position, false);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m192177J3(@NotNull BLiveVoiceTab voiceTab, int position, boolean isRefresh) {
        eyr eyrVarMo108376m;
        voiceTab.getClass();
        c8o<BLiveVoiceTab> c8oVarM220905n = ((zpn0) this.viewModel).m220905n(position);
        if (c8oVarM220905n == null || (eyrVarMo108376m = c8oVarM220905n.mo108376m()) == null) {
            return;
        }
        eyrVarMo108376m.mo123231g0(voiceTab, position, ((zpn0) this.viewModel).m220907p(), isRefresh);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m192178K3() {
        l51.m152890J(this.refreshCampaignRunnable);
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: L2 */
    public void mo160241L2(boolean hidden) {
        if (hidden) {
            m192174G3();
        } else {
            m192173F3();
            ((zpn0) this.viewModel).m220906n0();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final void m192179L3(int staySec) {
        DialogC13310a dialogC13310a = this.campaignDialog;
        if (dialogC13310a == null || !dialogC13310a.isShowing()) {
            duringCreated(IntlVoiceCenterApiProvider.getVoiceSquareCampaignData(staySec)).subscribe(dhw.m115829h(new y20() { // from class: l.jpn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    tpn0.m192159c3(this.f122124a, (IntlVoiceSquareCampaignBean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m192180M3() {
        duringCreated(IntlVoiceCenterApiProvider.getVoiceLiveTabs()).subscribe(dhw.m115826e(new y20() { // from class: l.opn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192148R2(this.f148474a, (List) obj);
            }
        }, new y20() { // from class: l.ppn0
            @Override // p153l.y20
            public final void call(Object obj) {
                tpn0.m192152V2(this.f153573a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final void m192181N3(boolean show) {
        if (show) {
            this.isShowCampaign = true;
            m192179L3(0);
        } else {
            this.isShowCampaign = false;
            m192178K3();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m192182O3() {
        if (((zpn0) this.viewModel).m220911v() != null) {
            ((zpn0) this.viewModel).m220909s().mo108376m().mo123234j0(((zpn0) this.viewModel).m220910u(), ((zpn0) this.viewModel).m220907p());
        }
    }

    /* JADX INFO: renamed from: m3 */
    public final void m192183m3(@NotNull LiveVoiceEntryView entryView) {
        entryView.getClass();
        m192193x3().mo52715C(entryView);
        m192193x3().mo40473a0();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m192184n3(@NotNull IntlGameOperationView entryView) {
        entryView.getClass();
        m192192w3().mo52715C(entryView);
        m192192w3().mo70284I2();
        m192192w3().m181869U2();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m192185o3(String voiceTabId, boolean enable) {
        BLiveVoiceTab bLiveVoiceTabM220911v = ((zpn0) this.viewModel).m220911v();
        if (bLiveVoiceTabM220911v == null || !Intrinsics.m88377d(bLiveVoiceTabM220911v.f45361id, voiceTabId)) {
            return;
        }
        ((zpn0) this.viewModel).m220892d0(enable);
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m192186p3() {
        return m192191v3() - this.currentActStopTime >= ((long) this.REFRESH_TIME_STEP) && !((zpn0) this.viewModel).m220882U();
    }

    /* JADX INFO: renamed from: q3 */
    public final void m192187q3() {
        m192182O3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m192188r3() {
        BLiveCounter bLiveCounterM222761e = ((gm3) tbs.m190077m(itd0.f116821c)).m130733h().m222761e();
        if (bLiveCounterM222761e == null || !bLiveCounterM222761e.isHaveTextRed()) {
            return;
        }
        bLiveCounterM222761e.clearTextRed();
        LiveVoiceApi.postVoiceActivitiesToZero("text");
    }

    /* JADX INFO: renamed from: s3 */
    public final List<c8o<BLiveVoiceTab>> m192189s3(List<? extends BLiveVoiceTab> it) {
        ArrayList arrayList = new ArrayList();
        for (final BLiveVoiceTab bLiveVoiceTab : it) {
            hro0 hro0Var = new hro0(getAct(), bLiveVoiceTab, m192169B3(), new y20() { // from class: l.qpn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    tpn0.m192168t3(this.f158888a, bLiveVoiceTab, (Boolean) obj);
                }
            });
            Act act = getAct();
            act.getClass();
            VoiceRoomSquareCommonViewModel voiceRoomSquareCommonViewModel = new VoiceRoomSquareCommonViewModel(act, bLiveVoiceTab, m192169B3());
            hro0Var.mo40473a0();
            voiceRoomSquareCommonViewModel.setOnScrollListener(((zpn0) this.viewModel).getOnScrollListener());
            hro0Var.mo52715C(voiceRoomSquareCommonViewModel);
            int i = bnl0.f77544e;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.leftMargin = txq.m193530c(2);
            layoutParams.rightMargin = txq.m193530c(2);
            layoutParams.topMargin = txq.m193530c(10);
            hro0Var.mo108373A().setLayoutParams(layoutParams);
            hro0Var.m123233i0(this.refresh);
            hro0Var.m123232h0(this.requestSuccess, this.requestError);
            arrayList.add(hro0Var);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u3 */
    public final boolean m192190u3() {
        return lifecycle_() == C4470c.f16267i && !((zpn0) this.viewModel).m220882U();
    }

    /* JADX INFO: renamed from: v3 */
    public final long m192191v3() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: w3 */
    public final rkn m192192w3() {
        return (rkn) this.gameEntryPresenter.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public final v5v m192193x3() {
        return (v5v) this.liveVoiceEntryPresenter.getValue();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m192194y3(IntlVoiceSquareCampaignBean it) {
        IntlVoiceSquareCampaignBean.IntlVoiceSquareCampaignData intlVoiceSquareCampaignData = it.voiceRecommendPageCampaign;
        if (!this.isShowCampaign || intlVoiceSquareCampaignData == null) {
            return;
        }
        if (!TextUtils.isEmpty(intlVoiceSquareCampaignData.url)) {
            DialogC13310a dialogC13310a = this.campaignDialog;
            if (dialogC13310a != null) {
                dialogC13310a.dismiss();
            }
            DialogC13310a dialogC13310a2 = new DialogC13310a(getAct());
            this.campaignDialog = dialogC13310a2;
            dialogC13310a2.m81448Q(intlVoiceSquareCampaignData.url);
            return;
        }
        final int i = intlVoiceSquareCampaignData.staySeconds;
        if (i > 0) {
            Runnable runnable = new Runnable() { // from class: l.kpn0
                @Override // java.lang.Runnable
                public final void run() {
                    tpn0.m192156Z2(this.f127900a, i);
                }
            };
            this.refreshCampaignRunnable = runnable;
            l51.m152890J(runnable);
            l51.m152888H(getAct(), this.refreshCampaignRunnable, ((long) intlVoiceSquareCampaignData.staySeconds) * 1000);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final boolean m192195z3() {
        return tbs.f172989b.m203549W6();
    }
}
