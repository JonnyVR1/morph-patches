package com.p051p1.mobile.putong.live.livingroom.virtual.preview;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.preview.VoiceVirtualPreviewPresenter;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.acp0;
import p153l.bf10;
import p153l.dhw;
import p153l.dum;
import p153l.ere;
import p153l.fhw;
import p153l.htd0;
import p153l.i4g0;
import p153l.i6t;
import p153l.ifv;
import p153l.itv;
import p153l.jsv;
import p153l.n9c0;
import p153l.oho0;
import p153l.p7f;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.rwn0;
import p153l.th0;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u0015\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\"H\u0016¢\u0006\u0004\b,\u0010%J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\fJ\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\fJ\u0015\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001e¢\u0006\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R#\u0010A\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010%R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010E¨\u0006G"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;", "Ll/rwn0;", "D", "Ll/i6t;", "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VirtualNewPreviewView;", "Ll/dum;", BaseSei.INFO, "previewVirtualViewModel", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VirtualNewPreviewView;)V", "", "g4", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;", "roomInfo", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)V", "Ll/jsv;", "liveState", "n4", "(Ll/jsv;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "lives", "p4", "(Ljava/util/List;)V", "live", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoice;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAbsData;", "", "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveAbsData;)Z", "q4", "", "kotlin.jvm.PlatformType", "d4", "()Ljava/lang/String;", "m4", "()Z", "Lcom/p1/mobile/putong/live/base/data/BLiveStartPageTemplate;", "b4", "()Lcom/p1/mobile/putong/live/base/data/BLiveStartPageTemplate;", p7f.GPS_DIRECTION_TRUE, "R2", "a4", "o4", "isMC", "s4", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "getUserMask", "()Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "r4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;)V", "userMask", "Lcom/p1/mobile/android/app/Dialog;", "j", "Lcom/p1/mobile/android/app/Dialog;", "recoverDialog", "k", "Lkotlin/Lazy;", "e4", "userId", "Ll/acp0;", BLiveStormDanmakuGiftResourceType.f45292l, "c4", "()Ll/acp0;", "pushModule", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceVirtualPreviewPresenter<D extends rwn0> extends i6t<rwn0, VirtualNewPreviewView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public BLiveUserMask userMask;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Dialog recoverDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy userId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy pushModule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceVirtualPreviewPresenter(@NotNull final dum<D> dumVar, @NotNull VirtualNewPreviewView virtualNewPreviewView) {
        super(dumVar);
        dumVar.getClass();
        virtualNewPreviewView.getClass();
        this.userId = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.vgp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualPreviewPresenter.m78437L3();
            }
        });
        this.pushModule = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.igp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualPreviewPresenter.m78445U3(this.f114807a, dumVar);
            }
        });
        mo52715C(virtualNewPreviewView);
        m153103z2(new oho0(dumVar));
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m78435J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public static void m78436K3(final VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, final Pair pair) {
        Object first = pair.getFirst();
        first.getClass();
        if (!((Collection) first).isEmpty()) {
            ((rwn0) voiceVirtualPreviewPresenter.m213810E2()).f165200W = false;
            new th0.C20312a(voiceVirtualPreviewPresenter.act()).m191151j("已创建了1个群，暂不支持创建多个群。要进入已创建的群组吗？").m191157p(n9c0.f140855p0).m191159r("进入").m191156o(new View.OnClickListener() { // from class: l.jgp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceVirtualPreviewPresenter.m78453j4(this.f120755a, pair, view);
                }
            }).m191145d(n9c0.f140804X0).m191147f("取消").m191149h(false).m191144c(new View.OnClickListener() { // from class: l.kgp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceVirtualPreviewPresenter.m78454k4(this.f126639a, view);
                }
            }).m191142a().m191141g();
            return;
        }
        htd0<ifv> htd0Var = htd0.f111523e;
        if (((ifv) zrv.m221194l(htd0Var)).f114706o.get().booleanValue()) {
            ((ifv) zrv.m221194l(htd0Var)).f114706o.put(Boolean.FALSE);
        }
        ((VirtualNewPreviewView) voiceVirtualPreviewPresenter.viewModel).m78433y0(true);
        ((VirtualNewPreviewView) voiceVirtualPreviewPresenter.viewModel).m78432w0(((BLiveVoiceRoomAsset) pair.getSecond()).startPageTemplates, ((rwn0) voiceVirtualPreviewPresenter.m213810E2()).m183418T2(), ((rwn0) voiceVirtualPreviewPresenter.m213810E2()).m183416S2());
        D dM213810E2 = voiceVirtualPreviewPresenter.m213810E2();
        dM213810E2.getClass();
        ((rwn0) dM213810E2).f165200W = true;
    }

    /* JADX INFO: renamed from: L3 */
    public static String m78437L3() {
        return zrv.f205799a.m207631D0();
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m78438M3(jsv jsvVar) {
        jsvVar.getClass();
        return Boolean.valueOf(jsvVar.m146878d());
    }

    /* JADX INFO: renamed from: O3 */
    public static C22421c m78440O3(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m78441P3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, jsv jsvVar) {
        jsvVar.getClass();
        voiceVirtualPreviewPresenter.m78455n4(jsvVar);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m78444T3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static acp0 m78445U3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, dum dumVar) {
        return (acp0) voiceVirtualPreviewPresenter.m153103z2(new acp0(voiceVirtualPreviewPresenter, dumVar));
    }

    /* JADX INFO: renamed from: V3 */
    public static void m78446V3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        voiceVirtualPreviewPresenter.m78463f4(bLiveVoice);
    }

    /* JADX INFO: renamed from: X3 */
    public static C22421c m78448X3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        voiceVirtualPreviewPresenter.m78458Z3(bLiveVoiceRoom);
        if (Intrinsics.m88377d(BLiveVoiceRoom.EMPTY_ROOM, bLiveVoiceRoom)) {
            C22421c c22421cJust = C22421c.just(new ArrayList());
            C22421c<BLiveVoiceRoomAsset> voiceRoomAsset = VirtualVoiceRoomApiProvider.getVoiceRoomAsset(User.ID_TEAM_ACCOUNT);
            final VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1 voiceVirtualPreviewPresenter$initPreviewRoomData$1$1 = VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1.INSTANCE;
            return psd0.m173625r(c22421cJust, voiceRoomAsset, new rcj() { // from class: l.tgp0
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return VoiceVirtualPreviewPresenter.m78451h4(voiceVirtualPreviewPresenter$initPreviewRoomData$1$1, obj, obj2);
                }
            });
        }
        C22421c<List<BLiveVoice>> latestLive = VoiceRoomApiProvider.getLatestLive(voiceVirtualPreviewPresenter.m78450e4(), bLiveVoiceRoom.f45172id);
        C22421c<BLiveVoiceRoomAsset> voiceRoomAsset2 = VirtualVoiceRoomApiProvider.getVoiceRoomAsset(User.ID_TEAM_ACCOUNT);
        final VoiceVirtualPreviewPresenter$initPreviewRoomData$1$2 voiceVirtualPreviewPresenter$initPreviewRoomData$1$2 = VoiceVirtualPreviewPresenter$initPreviewRoomData$1$2.INSTANCE;
        return psd0.m173625r(latestLive, voiceRoomAsset2, new rcj() { // from class: l.ugp0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return VoiceVirtualPreviewPresenter.m78452i4(voiceVirtualPreviewPresenter$initPreviewRoomData$1$2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m78449Y3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, Throwable th) {
        ((VirtualNewPreviewView) voiceVirtualPreviewPresenter.viewModel).m78433y0(true);
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: e4 */
    private final String m78450e4() {
        return (String) this.userId.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static final Pair m78451h4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: i4 */
    public static final Pair m78452i4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m78453j4(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, Pair pair, View view) {
        Object first = pair.getFirst();
        first.getClass();
        voiceVirtualPreviewPresenter.m78468p4((List) first);
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m78454k4(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, View view) {
        voiceVirtualPreviewPresenter.act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n4 */
    private final void m78455n4(jsv liveState) {
        if (liveState.m146875a() != 2) {
            return;
        }
        ((VirtualNewPreviewView) this.viewModel).m78433y0(false);
        m78456q4();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m78456q4() {
        Dialog dialog = this.recoverDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.recoverDialog = null;
    }

    @Override // p153l.xzs
    @NotNull
    /* JADX INFO: renamed from: R2 */
    public String mo78457R2() {
        return "p_start_audio_room";
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        boolean zM183433h3 = ((rwn0) this.f196918e.f90822h).m183433h3();
        V v2 = this.viewModel;
        if (zM183433h3) {
            ((VirtualNewPreviewView) v2).m78433y0(false);
            acp0 acp0VarM78461c4 = m78461c4();
            String strM202194o = this.f196918e.f90822h.m202194o();
            strM202194o.getClass();
            acp0VarM78461c4.m96949X4(strM202194o);
            return;
        }
        ((VirtualNewPreviewView) v2).m78433y0(false);
        m78464g4();
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m202192l());
        final Function1 function1 = new Function1() { // from class: l.hgp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualPreviewPresenter.m78438M3((jsv) obj);
            }
        };
        c22421cDuringCreated.takeUntil(new qcj() { // from class: l.ngp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualPreviewPresenter.m78435J3(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ogp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m78441P3(this.f147298a, (jsv) obj);
            }
        }));
        ere.m122146i().m122163u();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m78458Z3(BLiveVoiceRoom roomInfo) {
        if (!Intrinsics.m88377d(roomInfo, BLiveVoiceRoom.EMPTY_ROOM)) {
            m78461c4().m96965u5(roomInfo);
        }
        m78461c4().m96963s5(roomInfo);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m78459a4() {
        m213811F2().LivePusherEvent.closeLive().m199277p();
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final BLiveStartPageTemplate m78460b4() {
        BLiveStartPageTemplate currentTemplate = ((VirtualNewPreviewView) this.viewModel).getCurrentTemplate();
        currentTemplate.getClass();
        return currentTemplate;
    }

    /* JADX INFO: renamed from: c4 */
    public final acp0 m78461c4() {
        Object value = this.pushModule.getValue();
        value.getClass();
        return (acp0) value;
    }

    /* JADX INFO: renamed from: d4 */
    public final String m78462d4() {
        return ((VirtualNewPreviewView) this.viewModel).getTitle();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m78463f4(BLiveVoice live) {
        m78461c4().m96964t5(live);
        m78461c4().m96966v5(true);
        m78461c4().m96956e5();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m78464g4() {
        C22421c<T> c22421cDuringCreated = duringCreated(VoiceRoomApiProvider.getRoomInfo(m78450e4()));
        final Function1 function1 = new Function1() { // from class: l.pgp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualPreviewPresenter.m78448X3(this.f152321a, (BLiveVoiceRoom) obj);
            }
        };
        c22421cDuringCreated.flatMap(new qcj() { // from class: l.qgp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualPreviewPresenter.m78440O3(function1, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.rgp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m78436K3(this.f163030a, (Pair) obj);
            }
        }, new y20() { // from class: l.sgp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m78449Y3(this.f167911a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m78465l4(BLiveAbsData live) {
        return TEnum.equals(live.state, "suspended") || TEnum.equals(live.state, "onlive");
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m78466m4() {
        return ((VirtualNewPreviewView) this.viewModel).m78428o0();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m78467o4() {
        m213810E2().m183407M3("");
        m213810E2().m183408N3("");
        m78461c4().m96966v5(false);
        m78461c4().m96956e5();
        m78470s4(true);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m78468p4(List<? extends BLiveVoice> lives) {
        BLiveVoice bLiveVoice = lives.get(0);
        fhw.m125605a("[live][virtual_voice]", "recover last live:" + m78465l4(bLiveVoice));
        if (m78465l4(bLiveVoice)) {
            m78463f4(bLiveVoice);
            return;
        }
        String strM96955d5 = m78461c4().m96955d5();
        String str = bLiveVoice.liveMode;
        str.getClass();
        duringCreated(itv.m142117t(strM96955d5, false, m213810E2().m168465M0(), str, "", "")).subscribe(dhw.m115826e(new y20() { // from class: l.lgp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m78446V3(this.f131998a, (BLiveVoice) obj);
            }
        }, new y20() { // from class: l.mgp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m78444T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m78469r4(@Nullable BLiveUserMask bLiveUserMask) {
        this.userMask = bLiveUserMask;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m78470s4(boolean isMC) {
        HashMap map = new HashMap();
        map.put("anchorId", zrv.f205799a.m207631D0());
        String str = m213810E2().f165204a0;
        if (str != null) {
            map.put("entrance_type", str);
        }
        if (isMC) {
            i4g0.m138521s("e_start_audio_room", mo78457R2(), map);
        } else {
            i4g0.m138527y("e_start_audio_room", mo78457R2(), map);
        }
    }
}
