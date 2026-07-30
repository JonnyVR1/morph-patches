package p002l;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardView;
import com.p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p1.mobile.putong.live.base.data.BLiveGamePanelButtons;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
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
import l.alk0;
import l.bgv;
import l.e30;
import l.ffw;
import l.fld0;
import l.l3f;
import l.nnn0;
import l.s25;
import l.soj0;
import l.w9j;
import l.wwb;
import l.ypv;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 <*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002=>B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u001d\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, d2 = {"Ll/fhn;", "Ll/ho2;", "D", "Ll/pat;", "Ll/bsm;", "info", "Ll/fhn$a;", "refreshInterFace", "<init>", "(Ll/bsm;Ll/fhn$a;)V", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "a4", "()Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "", "T", "()V", "", "Ll/hgn;", "it", "g4", "(Ljava/util/List;)V", "i4", "", "action", "f4", "(Ljava/lang/String;)V", "h4", "j4", "", "Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;", "", "e4", "(Ljava/util/List;)Z", "Ll/pgn;", "Y3", "()Ljava/util/List;", "m4", "data", "k4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGamePanelButtons;)V", "l4", "i", "Ll/fhn$a;", "j", "Ljava/lang/String;", "action_init", "k", "action_open_board", "l", "Ljava/util/List;", "list", "m", "banners", "n", "Lcom/p1/mobile/putong/live/livingroom/archi/dialogcenter/a;", "liveMenuDialog", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "o", "Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardView;", "gameBoardView", "Companion", "a", "b", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class fhn<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: p */
    public static volatile boolean f10358p;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0566a refreshInterFace;

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
    public C0200a liveMenuDialog;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public IntlGameBoardView gameBoardView;

    /* JADX INFO: renamed from: l.fhn$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll/fhn$a;", "", "", "isShowRedDot", "", "h0", "(Z)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0566a {
        /* JADX INFO: renamed from: h0 */
        void mo11386h0(boolean isShowRedDot);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhn(@NotNull bsm<D> bsmVar, @NotNull InterfaceC0566a interfaceC0566a) {
        super(bsmVar);
        bsmVar.getClass();
        interfaceC0566a.getClass();
        this.refreshInterFace = interfaceC0566a;
        this.action_init = "init";
        this.action_open_board = "open_board";
        this.list = new ArrayList();
        this.banners = new ArrayList();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m13183J3(fhn fhnVar, soj0 soj0Var) {
        fhnVar.m13208i4();
    }

    /* JADX INFO: renamed from: K3 */
    public static Pair m13184K3(fhn fhnVar, List list) {
        list.getClass();
        return new Pair(Boolean.valueOf(fhnVar.m13204e4(list)), list);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m13186M3(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m13187N3(fhn fhnVar, List list) {
        list.getClass();
        fhnVar.m13206g4(list);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m13188O3(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: P3 */
    public static List m13189P3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m13190R3(BaseLiveListBean baseLiveListBean) {
        return baseLiveListBean.list;
    }

    /* JADX INFO: renamed from: S3 */
    public static Pair m13191S3(Function1 function1, Object obj) {
        return (Pair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m13192T3(fhn fhnVar, String str, Pair pair) {
        fhnVar.list.clear();
        List<BLiveGamePanelButtons> list = fhnVar.list;
        Object second = pair.getSecond();
        second.getClass();
        list.addAll((Collection) second);
        fhnVar.refreshInterFace.mo11386h0(((Boolean) pair.getFirst()).booleanValue());
        if (Intrinsics.d(str, fhnVar.action_open_board)) {
            fhnVar.m13209j4();
        }
        fhnVar.m13207h4();
    }

    /* JADX INFO: renamed from: V3 */
    public static Unit m13194V3(fhn fhnVar, hgn hgnVar) {
        hgnVar.getClass();
        String str = hgnVar.jumpScheme;
        if (str != null && str.length() != 0) {
            fhnVar.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(800).m25610e(hgnVar.jumpScheme).m25608c());
            C0200a c0200a = fhnVar.liveMenuDialog;
            if (c0200a != null) {
                c0200a.dismiss();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m13197Z3(fhn fhnVar, BLiveGamePanelButtons bLiveGamePanelButtons, View view) {
        fhnVar.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(800).m25610e(bLiveGamePanelButtons.url).m25608c());
        ((bgv) ypv.l(fld0.f)).F(bLiveGamePanelButtons.type);
        fhnVar.m13212m4();
        fhnVar.m13210k4(bLiveGamePanelButtons);
        C0200a c0200a = fhnVar.liveMenuDialog;
        if (c0200a != null) {
            c0200a.dismiss();
        }
    }

    /* JADX INFO: renamed from: a4 */
    private final C0200a m13198a4() {
        if (this.liveMenuDialog == null) {
            byr byrVar = new byr(this, t6c0.f20043v2);
            this.liveMenuDialog = byrVar;
            byrVar.m5144h0(new e30() { // from class: l.ahn
                public final void call(Object obj) {
                    fhn.m13199b4(this.f7623a, (View) obj);
                }
            });
            byrVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.bhn
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    fhn.m13200c4(this.f8146a, dialogInterface);
                }
            });
            byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.chn
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    fhn.m13201d4(this.f8681a, dialogInterface);
                }
            });
        }
        return this.liveMenuDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public static final void m13199b4(fhn fhnVar, View view) {
        view.getClass();
        fhnVar.gameBoardView = (IntlGameBoardView) view;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m13200c4(fhn fhnVar, DialogInterface dialogInterface) {
        IntlGameBoardView intlGameBoardView = fhnVar.gameBoardView;
        if (intlGameBoardView != null) {
            List<pgn> listM13203Y3 = fhnVar.m13203Y3();
            C0200a c0200a = fhnVar.liveMenuDialog;
            c0200a.getClass();
            intlGameBoardView.m8860m0(listM13203Y3, c0200a);
        }
        fhnVar.m13211l4();
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m13201d4(fhn fhnVar, DialogInterface dialogInterface) {
        f10358p = false;
        IntlGameBoardView intlGameBoardView = fhnVar.gameBoardView;
        if (intlGameBoardView != null) {
            intlGameBoardView.m8859l0();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m13202T() {
        super.T();
        m13205f4(this.action_init);
        duringCreated((c) m25548F2().IntlGameBoardEvent.openGameBoard().g()).subscribe(ffw.d(new e30() { // from class: l.rgn
            public final void call(Object obj) {
                fhn.m13183J3(this.f18511a, (soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<pgn> m13203Y3() {
        ArrayList arrayList = new ArrayList();
        for (final BLiveGamePanelButtons bLiveGamePanelButtons : this.list) {
            pgn pgnVar = new pgn(bLiveGamePanelButtons);
            pgnVar.A(new View.OnClickListener() { // from class: l.ugn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fhn.m13197Z3(this.f20647a, bLiveGamePanelButtons, view);
                }
            });
            arrayList.add(pgnVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m13204e4(List<? extends BLiveGamePanelButtons> it) {
        boolean z = false;
        for (BLiveGamePanelButtons bLiveGamePanelButtons : it) {
            boolean z2 = ((bgv) ypv.l(fld0.f)).c(bLiveGamePanelButtons.type) && bLiveGamePanelButtons.enableRedDot;
            bLiveGamePanelButtons.enableRedDot = z2;
            if (z2 && !z) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m13205f4(final String action) {
        boolean z = false;
        f10358p = false;
        if (m25547E2().m14548Z0()) {
            nnn0 nnn0VarM25547E2 = m25547E2();
            nnn0VarM25547E2.getClass();
            BLiveVoiceCall bLiveVoiceCallY2 = nnn0VarM25547E2.Y2();
            if (bLiveVoiceCallY2 != null && alk0.h(bLiveVoiceCallY2) && !m25552L2()) {
                z = true;
            }
        }
        c cVarDuringCreated = duringCreated(IntlLivingNormalApiProvider.pollGamePanelMenus(m25547E2().m14548Z0() ? "voicelive" : "live", (m25552L2() ? "anchor" : "audience").concat(z ? "-caller" : ""), m25547E2().m17239o(), m25547E2().m17234j().liveMode));
        final Function1 function1 = new Function1() { // from class: l.wgn
            public final Object invoke(Object obj) {
                return fhn.m13184K3(this.f21761a, (List) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.xgn
            public final Object call(Object obj) {
                return fhn.m13191S3(function1, obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.ygn
            public final void call(Object obj) {
                fhn.m13192T3(this.f22880a, action, (Pair) obj);
            }
        }, new e30() { // from class: l.zgn
            public final void call(Object obj) {
                fhn.m13188O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m13206g4(@NotNull List<hgn> it) {
        it.getClass();
        if (m13198a4() != null) {
            a aVarM13198a4 = m13198a4();
            aVarM13198a4.getClass();
            if (aVarM13198a4.isShowing()) {
                this.banners.clear();
                List<hgn> list = it;
                if (!wwb.a(list)) {
                    this.banners.addAll(list);
                }
                IntlGameBoardView intlGameBoardView = this.gameBoardView;
                if (intlGameBoardView != null) {
                    intlGameBoardView.m8858k0(this.banners, new Function1() { // from class: l.vgn
                        public final Object invoke(Object obj) {
                            return fhn.m13194V3(this.f21121a, (hgn) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m13207h4() {
        c<BaseLiveListBean<hgn>> cVarFetchIntlGameBanners = IntlLivingNormalApiProvider.fetchIntlGameBanners(m25547E2().m14576j0());
        final Function1 function1 = new Function1() { // from class: l.dhn
            public final Object invoke(Object obj) {
                return fhn.m13190R3((BaseLiveListBean) obj);
            }
        };
        duringCreated(cVarFetchIntlGameBanners.map(new w9j() { // from class: l.ehn
            public final Object call(Object obj) {
                return fhn.m13189P3(function1, obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.sgn
            public final void call(Object obj) {
                fhn.m13187N3(this.f19014a, (List) obj);
            }
        }, new e30() { // from class: l.tgn
            public final void call(Object obj) {
                fhn.m13186M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m13208i4() {
        m13205f4(this.action_open_board);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Dialog, com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a] */
    /* JADX INFO: renamed from: j4 */
    public final void m13209j4() {
        ?? M13198a4 = m13198a4();
        if (M13198a4 == 0 || f10358p || M13198a4.isShowing()) {
            return;
        }
        f10358p = true;
        M13198a4.show();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13210k4(BLiveGamePanelButtons data) {
        zvf0.s("e_game_tab_main_element_click", "p_game_tab_main", MapsKt.mapOf(new Pair[]{new Pair("intl_game_type", data.type), new Pair("campaign_type", data.type), new Pair("entry_type", m25547E2().m14548Z0() ? "voicelive" : "live")}));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m13211l4() {
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.PAGE_VIEW;
        l3fVar.n = "p_game_tab_main";
        zvf0.n(l3fVar, MapsKt.mapOf(new Pair("entry_type", m25547E2().m14548Z0() ? "voicelive" : "live")));
    }

    /* JADX INFO: renamed from: m4 */
    public final void m13212m4() {
        this.refreshInterFace.mo11386h0(m13204e4(this.list));
    }
}
