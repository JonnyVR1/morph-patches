package p149l;

import android.content.DialogInterface;
import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 <*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002=>B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u001d\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, m87232d2 = {"Ll/fhn;", "Ll/ho2;", "D", "Ll/pat;", "Ll/bsm;", BaseSei.INFO, "Ll/fhn$a;", "refreshInterFace", "<init>", "(Ll/bsm;Ll/fhn$a;)V", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "a4", "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "", j6f.GPS_DIRECTION_TRUE, "()V", "", "Ll/hgn;", Careers.f38732it, "g4", "(Ljava/util/List;)V", "i4", "", "action", "f4", "(Ljava/lang/String;)V", "h4", "j4", "", "Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "", "e4", "(Ljava/util/List;)Z", "Ll/pgn;", "Y3", "()Ljava/util/List;", "m4", "data", "k4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;)V", "l4", RXScreenCaptureService.KEY_INDEX, "Ll/fhn$a;", "j", "Ljava/lang/String;", "action_init", "k", "action_open_board", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/List;", "list", "m", Banners.TYPE, "n", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "liveMenuDialog", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "o", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "gameBoardView", "Companion", "a", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fhn<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: p */
    public static volatile boolean f97525p;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC16833a refreshInterFace;

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
    public final List<hgn> banners;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public DialogC12611a liveMenuDialog;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public IntlGameBoardView gameBoardView;

    /* JADX INFO: renamed from: l.fhn$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Ll/fhn$a;", "", "", "isShowRedDot", "", "h0", "(Z)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC16833a {
        /* JADX INFO: renamed from: h0 */
        void mo108805h0(boolean isShowRedDot);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhn(@NotNull bsm<D> bsmVar, @NotNull InterfaceC16833a interfaceC16833a) {
        super(bsmVar);
        bsmVar.getClass();
        interfaceC16833a.getClass();
        this.refreshInterFace = interfaceC16833a;
        this.action_init = "init";
        this.action_open_board = "open_board";
        this.list = new ArrayList();
        this.banners = new ArrayList();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m121387J3(fhn fhnVar, soj0 soj0Var) {
        fhnVar.m121411i4();
    }

    /* JADX INFO: renamed from: K3 */
    public static Pair m121388K3(fhn fhnVar, List list) {
        list.getClass();
        return new Pair(Boolean.valueOf(fhnVar.m121407e4(list)), list);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m121390M3(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m121391N3(fhn fhnVar, List list) {
        list.getClass();
        fhnVar.m121409g4(list);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m121392O3(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static List m121393P3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m121394R3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean.list;
    }

    /* JADX INFO: renamed from: S3 */
    public static Pair m121395S3(Function1 function1, Object obj) {
        return (Pair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m121396T3(fhn fhnVar, String str, Pair pair) {
        fhnVar.list.clear();
        List<BLiveGamePanelButtons> list = fhnVar.list;
        Object second = pair.getSecond();
        second.getClass();
        list.addAll((Collection) second);
        fhnVar.refreshInterFace.mo108805h0(((Boolean) pair.getFirst()).booleanValue());
        if (Intrinsics.m87488d(str, fhnVar.action_open_board)) {
            fhnVar.m121412j4();
        }
        fhnVar.m121410h4();
    }

    /* JADX INFO: renamed from: V3 */
    public static Unit m121398V3(fhn fhnVar, hgn hgnVar) {
        hgnVar.getClass();
        String str = hgnVar.jumpScheme;
        if (str != null && str.length() != 0) {
            fhnVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(800).m206701e(hgnVar.jumpScheme).m206699c());
            DialogC12611a dialogC12611a = fhnVar.liveMenuDialog;
            if (dialogC12611a != null) {
                dialogC12611a.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m121401Z3(fhn fhnVar, BLiveGamePanelButtons bLiveGamePanelButtons, View view) {
        fhnVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(800).m206701e(bLiveGamePanelButtons.url).m206699c());
        ((bgv) ypv.m215673l(fld0.f98151f)).m101718F(bLiveGamePanelButtons.type);
        fhnVar.m121415m4();
        fhnVar.m121413k4(bLiveGamePanelButtons);
        DialogC12611a dialogC12611a = fhnVar.liveMenuDialog;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
    }

    /* JADX INFO: renamed from: a4 */
    private final DialogC12611a m121402a4() {
        if (this.liveMenuDialog == null) {
            byr byrVar = new byr(this, t6c0.f168547v2);
            this.liveMenuDialog = byrVar;
            byrVar.m71776h0(new e30() { // from class: l.ahn
                @Override // p149l.e30
                public final void call(Object obj) {
                    fhn.m121403b4(this.f69671a, (View) obj);
                }
            });
            byrVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.bhn
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    fhn.m121404c4(this.f75641a, dialogInterface);
                }
            });
            byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.chn
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    fhn.m121405d4(this.f80984a, dialogInterface);
                }
            });
        }
        return this.liveMenuDialog;
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m121403b4(fhn fhnVar, View view) {
        view.getClass();
        fhnVar.gameBoardView = (IntlGameBoardView) view;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m121404c4(fhn fhnVar, DialogInterface dialogInterface) {
        IntlGameBoardView intlGameBoardView = fhnVar.gameBoardView;
        if (intlGameBoardView != null) {
            List<pgn> listM121406Y3 = fhnVar.m121406Y3();
            DialogC12611a dialogC12611a = fhnVar.liveMenuDialog;
            dialogC12611a.getClass();
            intlGameBoardView.m75241m0(listM121406Y3, dialogC12611a);
        }
        fhnVar.m121414l4();
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m121405d4(fhn fhnVar, DialogInterface dialogInterface) {
        f97525p = false;
        IntlGameBoardView intlGameBoardView = fhnVar.gameBoardView;
        if (intlGameBoardView != null) {
            intlGameBoardView.m75240l0();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m121408f4(this.action_init);
        duringCreated((C22306c) m206028F2().IntlGameBoardEvent.openGameBoard().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rgn
            @Override // p149l.e30
            public final void call(Object obj) {
                fhn.m121387J3(this.f159269a, (soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<pgn> m121406Y3() {
        ArrayList arrayList = new ArrayList();
        for (final BLiveGamePanelButtons bLiveGamePanelButtons : this.list) {
            pgn pgnVar = new pgn(bLiveGamePanelButtons);
            pgnVar.mo109662A(new View.OnClickListener() { // from class: l.ugn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fhn.m121401Z3(this.f176403a, bLiveGamePanelButtons, view);
                }
            });
            arrayList.add(pgnVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m121407e4(List<? extends BLiveGamePanelButtons> it) {
        boolean z = false;
        for (BLiveGamePanelButtons bLiveGamePanelButtons : it) {
            boolean z2 = ((bgv) ypv.m215673l(fld0.f98151f)).m101723c(bLiveGamePanelButtons.type) && bLiveGamePanelButtons.enableRedDot;
            bLiveGamePanelButtons.enableRedDot = z2;
            if (z2 && !z) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m121408f4(final String action) {
        boolean z = false;
        f97525p = false;
        if (m206027E2().m132112Z0()) {
            D dM206027E2 = m206027E2();
            dM206027E2.getClass();
            BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) dM206027E2).m160261Y2();
            if (bLiveVoiceCallM160261Y2 != null && alk0.m97309h(bLiveVoiceCallM160261Y2) && !m206032L2()) {
                z = true;
            }
        }
        C22306c<T> c22306cDuringCreated = duringCreated(IntlLivingNormalApiProvider.pollGamePanelMenus(m206027E2().m132112Z0() ? VoiceLive.TYPE : "live", (m206032L2() ? "anchor" : "audience").concat(z ? "-caller" : ""), m206027E2().m149818o(), m206027E2().mo149813j().liveMode));
        final Function1 function1 = new Function1() { // from class: l.wgn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fhn.m121388K3(this.f186210a, (List) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.xgn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return fhn.m121395S3(function1, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ygn
            @Override // p149l.e30
            public final void call(Object obj) {
                fhn.m121396T3(this.f198211a, action, (Pair) obj);
            }
        }, new e30() { // from class: l.zgn
            @Override // p149l.e30
            public final void call(Object obj) {
                fhn.m121392O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m121409g4(@NotNull List<hgn> it) {
        it.getClass();
        if (m121402a4() != null) {
            DialogC12611a dialogC12611aM121402a4 = m121402a4();
            dialogC12611aM121402a4.getClass();
            if (dialogC12611aM121402a4.isShowing()) {
                this.banners.clear();
                List<hgn> list = it;
                if (!wwb.m205852a(list)) {
                    this.banners.addAll(list);
                }
                IntlGameBoardView intlGameBoardView = this.gameBoardView;
                if (intlGameBoardView != null) {
                    intlGameBoardView.m75239k0(this.banners, new Function1() { // from class: l.vgn
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return fhn.m121398V3(this.f181385a, (hgn) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m121410h4() {
        C22306c<BaseLiveListBean<hgn>> c22306cFetchIntlGameBanners = IntlLivingNormalApiProvider.fetchIntlGameBanners(m206027E2().m132140j0());
        final Function1 function1 = new Function1() { // from class: l.dhn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fhn.m121394R3((BaseLiveListBean) obj);
            }
        };
        duringCreated(c22306cFetchIntlGameBanners.map(new w9j() { // from class: l.ehn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return fhn.m121393P3(function1, obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.sgn
            @Override // p149l.e30
            public final void call(Object obj) {
                fhn.m121391N3(this.f164453a, (List) obj);
            }
        }, new e30() { // from class: l.tgn
            @Override // p149l.e30
            public final void call(Object obj) {
                fhn.m121390M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m121411i4() {
        m121408f4(this.action_open_board);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m121412j4() {
        DialogC12611a dialogC12611aM121402a4 = m121402a4();
        if (dialogC12611aM121402a4 == null || f97525p || dialogC12611aM121402a4.isShowing()) {
            return;
        }
        f97525p = true;
        dialogC12611aM121402a4.show();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m121413k4(BLiveGamePanelButtons data) {
        zvf0.m220397s("e_game_tab_main_element_click", "p_game_tab_main", MapsKt.mapOf(new Pair("intl_game_type", data.type), new Pair("campaign_type", data.type), new Pair("entry_type", m206027E2().m132112Z0() ? VoiceLive.TYPE : "live")));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m121414l4() {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = "p_game_tab_main";
        zvf0.m220392n(l3fVar, MapsKt.mapOf(new Pair("entry_type", m206027E2().m132112Z0() ? VoiceLive.TYPE : "live")));
    }

    /* JADX INFO: renamed from: m4 */
    public final void m121415m4() {
        this.refreshInterFace.mo108805h0(m121407e4(this.list));
    }
}
