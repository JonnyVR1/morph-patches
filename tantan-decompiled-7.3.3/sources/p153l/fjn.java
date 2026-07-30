package p153l;

import android.content.DialogInterface;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 <*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002=>B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u001d\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, m88121d2 = {"Ll/fjn;", "Ll/oo2;", "D", "Ll/qct;", "Ll/dum;", BaseSei.INFO, "Ll/fjn$a;", "refreshInterFace", "<init>", "(Ll/dum;Ll/fjn$a;)V", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "a4", "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "", p7f.GPS_DIRECTION_TRUE, "()V", "", "Ll/hin;", Careers.f39580it, "g4", "(Ljava/util/List;)V", "i4", "", "action", "f4", "(Ljava/lang/String;)V", "h4", "j4", "", "Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "", "e4", "(Ljava/util/List;)Z", "Ll/pin;", "Y3", "()Ljava/util/List;", "m4", "data", "k4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;)V", "l4", RXScreenCaptureService.KEY_INDEX, "Ll/fjn$a;", "j", "Ljava/lang/String;", "action_init", "k", "action_open_board", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/List;", "list", "m", Banners.TYPE, "n", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "liveMenuDialog", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "o", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "gameBoardView", "Companion", "a", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fjn<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: p */
    public static volatile boolean f99390p;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC16988a refreshInterFace;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String action_init;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String action_open_board;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final List<BLiveGamePanelButtons> list;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final List<hin> banners;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public DialogC12774a liveMenuDialog;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public IntlGameBoardView gameBoardView;

    /* JADX INFO: renamed from: l.fjn$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Ll/fjn$a;", "", "", "isShowRedDot", "", "h0", "(Z)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC16988a {
        /* JADX INFO: renamed from: h0 */
        void mo112927h0(boolean isShowRedDot);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjn(@NotNull dum<D> dumVar, @NotNull InterfaceC16988a interfaceC16988a) {
        super(dumVar);
        dumVar.getClass();
        interfaceC16988a.getClass();
        this.refreshInterFace = interfaceC16988a;
        this.action_init = "init";
        this.action_open_board = "open_board";
        this.list = new ArrayList();
        this.banners = new ArrayList();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m125835J3(fjn fjnVar, vxj0 vxj0Var) {
        fjnVar.m125859i4();
    }

    /* JADX INFO: renamed from: K3 */
    public static Pair m125836K3(fjn fjnVar, List list) {
        list.getClass();
        return new Pair(Boolean.valueOf(fjnVar.m125855e4(list)), list);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m125838M3(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m125839N3(fjn fjnVar, List list) {
        list.getClass();
        fjnVar.m125857g4(list);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m125840O3(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static List m125841P3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m125842R3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean.list;
    }

    /* JADX INFO: renamed from: S3 */
    public static Pair m125843S3(Function1 function1, Object obj) {
        return (Pair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m125844T3(fjn fjnVar, String str, Pair pair) {
        fjnVar.list.clear();
        List<BLiveGamePanelButtons> list = fjnVar.list;
        Object second = pair.getSecond();
        second.getClass();
        list.addAll((Collection) second);
        fjnVar.refreshInterFace.mo112927h0(((Boolean) pair.getFirst()).booleanValue());
        if (Intrinsics.m88377d(str, fjnVar.action_open_board)) {
            fjnVar.m125860j4();
        }
        fjnVar.m125858h4();
    }

    /* JADX INFO: renamed from: V3 */
    public static Unit m125846V3(fjn fjnVar, hin hinVar) {
        hinVar.getClass();
        String str = hinVar.jumpScheme;
        if (str != null && str.length() != 0) {
            fjnVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(800).m103154e(hinVar.jumpScheme).m103152c());
            DialogC12774a dialogC12774a = fjnVar.liveMenuDialog;
            if (dialogC12774a != null) {
                dialogC12774a.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m125849Z3(fjn fjnVar, BLiveGamePanelButtons bLiveGamePanelButtons, View view) {
        fjnVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(800).m103154e(bLiveGamePanelButtons.url).m103152c());
        ((civ) zrv.m221194l(htd0.f111524f)).m109954F(bLiveGamePanelButtons.type);
        fjnVar.m125863m4();
        fjnVar.m125861k4(bLiveGamePanelButtons);
        DialogC12774a dialogC12774a = fjnVar.liveMenuDialog;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
    }

    /* JADX INFO: renamed from: a4 */
    private final DialogC12774a m125850a4() {
        if (this.liveMenuDialog == null) {
            c0s c0sVar = new c0s(this, yec0.f199279v2);
            this.liveMenuDialog = c0sVar;
            c0sVar.m72959h0(new y20() { // from class: l.ajn
                @Override // p153l.y20
                public final void call(Object obj) {
                    fjn.m125851b4(this.f71840a, (View) obj);
                }
            });
            c0sVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.bjn
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    fjn.m125852c4(this.f77002a, dialogInterface);
                }
            });
            c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cjn
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    fjn.m125853d4(this.f82204a, dialogInterface);
                }
            });
        }
        return this.liveMenuDialog;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m125851b4(fjn fjnVar, View view) {
        view.getClass();
        fjnVar.gameBoardView = (IntlGameBoardView) view;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m125852c4(fjn fjnVar, DialogInterface dialogInterface) {
        IntlGameBoardView intlGameBoardView = fjnVar.gameBoardView;
        if (intlGameBoardView != null) {
            List<pin> listM125854Y3 = fjnVar.m125854Y3();
            DialogC12774a dialogC12774a = fjnVar.liveMenuDialog;
            dialogC12774a.getClass();
            intlGameBoardView.m76424m0(listM125854Y3, dialogC12774a);
        }
        fjnVar.m125862l4();
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m125853d4(fjn fjnVar, DialogInterface dialogInterface) {
        f99390p = false;
        IntlGameBoardView intlGameBoardView = fjnVar.gameBoardView;
        if (intlGameBoardView != null) {
            intlGameBoardView.m76423l0();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m125856f4(this.action_init);
        duringCreated((C22421c) m213811F2().IntlGameBoardEvent.openGameBoard().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.rin
            @Override // p153l.y20
            public final void call(Object obj) {
                fjn.m125835J3(this.f163380a, (vxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<pin> m125854Y3() {
        ArrayList arrayList = new ArrayList();
        for (final BLiveGamePanelButtons bLiveGamePanelButtons : this.list) {
            pin pinVar = new pin(bLiveGamePanelButtons);
            pinVar.mo113881A(new View.OnClickListener() { // from class: l.uin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fjn.m125849Z3(this.f179135a, bLiveGamePanelButtons, view);
                }
            });
            arrayList.add(pinVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m125855e4(List<? extends BLiveGamePanelButtons> it) {
        boolean z = false;
        for (BLiveGamePanelButtons bLiveGamePanelButtons : it) {
            boolean z2 = ((civ) zrv.m221194l(htd0.f111524f)).m109959c(bLiveGamePanelButtons.type) && bLiveGamePanelButtons.enableRedDot;
            bLiveGamePanelButtons.enableRedDot = z2;
            if (z2 && !z) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m125856f4(final String action) {
        boolean z = false;
        f99390p = false;
        if (m213810E2().m168498Z0()) {
            D dM213810E2 = m213810E2();
            dM213810E2.getClass();
            BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) dM213810E2).m183423Y2();
            if (bLiveVoiceCallM183423Y2 != null && guk0.m132329h(bLiveVoiceCallM183423Y2) && !m213815L2()) {
                z = true;
            }
        }
        C22421c<T> c22421cDuringCreated = duringCreated(IntlLivingNormalApiProvider.pollGamePanelMenus(m213810E2().m168498Z0() ? VoiceLive.TYPE : "live", (m213815L2() ? "anchor" : "audience").concat(z ? "-caller" : ""), m213810E2().m202194o(), m213810E2().mo183435j().liveMode));
        final Function1 function1 = new Function1() { // from class: l.win
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fjn.m125836K3(this.f189374a, (List) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.xin
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fjn.m125843S3(function1, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.yin
            @Override // p153l.y20
            public final void call(Object obj) {
                fjn.m125844T3(this.f200225a, action, (Pair) obj);
            }
        }, new y20() { // from class: l.zin
            @Override // p153l.y20
            public final void call(Object obj) {
                fjn.m125840O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m125857g4(@NotNull List<hin> it) {
        it.getClass();
        if (m125850a4() != null) {
            DialogC12774a dialogC12774aM125850a4 = m125850a4();
            dialogC12774aM125850a4.getClass();
            if (dialogC12774aM125850a4.isShowing()) {
                this.banners.clear();
                List<hin> list = it;
                if (!kyb.m151952a(list)) {
                    this.banners.addAll(list);
                }
                IntlGameBoardView intlGameBoardView = this.gameBoardView;
                if (intlGameBoardView != null) {
                    intlGameBoardView.m76422k0(this.banners, new Function1() { // from class: l.vin
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return fjn.m125846V3(this.f184283a, (hin) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m125858h4() {
        C22421c<BaseLiveListBean<hin>> c22421cFetchIntlGameBanners = IntlLivingNormalApiProvider.fetchIntlGameBanners(m213810E2().m168526j0());
        final Function1 function1 = new Function1() { // from class: l.djn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fjn.m125842R3((BaseLiveListBean) obj);
            }
        };
        duringCreated(c22421cFetchIntlGameBanners.map(new qcj() { // from class: l.ejn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fjn.m125841P3(function1, obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.sin
            @Override // p153l.y20
            public final void call(Object obj) {
                fjn.m125839N3(this.f168854a, (List) obj);
            }
        }, new y20() { // from class: l.tin
            @Override // p153l.y20
            public final void call(Object obj) {
                fjn.m125838M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m125859i4() {
        m125856f4(this.action_open_board);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m125860j4() {
        DialogC12774a dialogC12774aM125850a4 = m125850a4();
        if (dialogC12774aM125850a4 == null || f99390p || dialogC12774aM125850a4.isShowing()) {
            return;
        }
        f99390p = true;
        dialogC12774aM125850a4.show();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m125861k4(BLiveGamePanelButtons data) {
        i4g0.m138521s("e_game_tab_main_element_click", "p_game_tab_main", MapsKt.mapOf(new Pair("intl_game_type", data.type), new Pair("campaign_type", data.type), new Pair("entry_type", m213810E2().m168498Z0() ? VoiceLive.TYPE : "live")));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m125862l4() {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = "p_game_tab_main";
        i4g0.m138516n(q4fVar, MapsKt.mapOf(new Pair("entry_type", m213810E2().m168498Z0() ? VoiceLive.TYPE : "live")));
    }

    /* JADX INFO: renamed from: m4 */
    public final void m125863m4() {
        this.refreshInterFace.mo112927h0(m125855e4(this.list));
    }
}
