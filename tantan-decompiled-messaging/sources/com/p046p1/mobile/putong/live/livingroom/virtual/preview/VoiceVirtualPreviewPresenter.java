package com.p046p1.mobile.putong.live.livingroom.virtual.preview;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveStartPageTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.preview.VoiceVirtualPreviewPresenter;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;
import p149l.aqe;
import p149l.bsm;
import p149l.e30;
import p149l.ffw;
import p149l.fld0;
import p149l.h1c0;
import p149l.h4t;
import p149l.hdv;
import p149l.hfw;
import p149l.hrv;
import p149l.iqv;
import p149l.j6f;
import p149l.k8o0;
import p149l.mkd0;
import p149l.nnn0;
import p149l.r610;
import p149l.w2p0;
import p149l.w9j;
import p149l.x9j;
import p149l.xh0;
import p149l.ypv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u0015\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\"H\u0016¢\u0006\u0004\b,\u0010%J\r\u0010-\u001a\u00020\n¢\u0006\u0004\b-\u0010\fJ\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\fJ\u0015\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001e¢\u0006\u0004\b0\u00101R$\u00109\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R#\u0010A\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010%R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010E¨\u0006G"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VoiceVirtualPreviewPresenter;", "Ll/nnn0;", "D", "Ll/h4t;", "Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VirtualNewPreviewView;", "Ll/bsm;", BaseSei.INFO, "previewVirtualViewModel", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/preview/VirtualNewPreviewView;)V", "", "g4", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;", "roomInfo", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceRoom;)V", "Ll/iqv;", "liveState", "n4", "(Ll/iqv;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoice;", "lives", "p4", "(Ljava/util/List;)V", "live", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoice;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveAbsData;", "", "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveAbsData;)Z", "q4", "", "kotlin.jvm.PlatformType", "d4", "()Ljava/lang/String;", "m4", "()Z", "Lcom/p1/mobile/putong/live/base/data/BLiveStartPageTemplate;", "b4", "()Lcom/p1/mobile/putong/live/base/data/BLiveStartPageTemplate;", j6f.GPS_DIRECTION_TRUE, "R2", "a4", "o4", "isMC", "s4", "(Z)V", "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "getUserMask", "()Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;", "r4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUserMask;)V", "userMask", "Lcom/p1/mobile/android/app/Dialog;", "j", "Lcom/p1/mobile/android/app/Dialog;", "recoverDialog", "k", "Lkotlin/Lazy;", "e4", "userId", "Ll/w2p0;", BLiveStormDanmakuGiftResourceType.f44444l, "c4", "()Ll/w2p0;", "pushModule", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceVirtualPreviewPresenter<D extends nnn0> extends h4t<nnn0, VirtualNewPreviewView> {

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
    public VoiceVirtualPreviewPresenter(@NotNull final bsm<D> bsmVar, @NotNull VirtualNewPreviewView virtualNewPreviewView) {
        super(bsmVar);
        bsmVar.getClass();
        virtualNewPreviewView.getClass();
        this.userId = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.r7p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualPreviewPresenter.m77254L3();
            }
        });
        this.pushModule = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.e7p0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualPreviewPresenter.m77262U3(this.f89738a, bsmVar);
            }
        });
        mo51532C(virtualNewPreviewView);
        m144512z2(new k8o0(bsmVar));
    }

    /* JADX INFO: renamed from: J3 */
    public static Boolean m77252J3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public static void m77253K3(final VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, final Pair pair) {
        Object first = pair.getFirst();
        first.getClass();
        if (!((Collection) first).isEmpty()) {
            ((nnn0) voiceVirtualPreviewPresenter.m206027E2()).f139753W = false;
            new xh0.C21150a(voiceVirtualPreviewPresenter.act()).m208731j("已创建了1个群，暂不支持创建多个群。要进入已创建的群组吗？").m208737p(h1c0.f105394p0).m208739r("进入").m208736o(new View.OnClickListener() { // from class: l.f7p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceVirtualPreviewPresenter.m77270j4(this.f96274a, pair, view);
                }
            }).m208725d(h1c0.f105343X0).m208727f("取消").m208729h(false).m208724c(new View.OnClickListener() { // from class: l.g7p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoiceVirtualPreviewPresenter.m77271k4(this.f101424a, view);
                }
            }).m208722a().m208721g();
            return;
        }
        fld0<hdv> fld0Var = fld0.f98150e;
        if (((hdv) ypv.m215673l(fld0Var)).f107309o.get().booleanValue()) {
            ((hdv) ypv.m215673l(fld0Var)).f107309o.put(Boolean.FALSE);
        }
        ((VirtualNewPreviewView) voiceVirtualPreviewPresenter.viewModel).m77250y0(true);
        ((VirtualNewPreviewView) voiceVirtualPreviewPresenter.viewModel).m77249w0(((BLiveVoiceRoomAsset) pair.getSecond()).startPageTemplates, ((nnn0) voiceVirtualPreviewPresenter.m206027E2()).m160256T2(), ((nnn0) voiceVirtualPreviewPresenter.m206027E2()).m160254S2());
        D dM206027E2 = voiceVirtualPreviewPresenter.m206027E2();
        dM206027E2.getClass();
        ((nnn0) dM206027E2).f139753W = true;
    }

    /* JADX INFO: renamed from: L3 */
    public static String m77254L3() {
        return ypv.f199493a.m199309D0();
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m77255M3(iqv iqvVar) {
        iqvVar.getClass();
        return Boolean.valueOf(iqvVar.m137797d());
    }

    /* JADX INFO: renamed from: O3 */
    public static C22306c m77257O3(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m77258P3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, iqv iqvVar) {
        iqvVar.getClass();
        voiceVirtualPreviewPresenter.m77272n4(iqvVar);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m77261T3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: U3 */
    public static w2p0 m77262U3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, bsm bsmVar) {
        return (w2p0) voiceVirtualPreviewPresenter.m144512z2(new w2p0(voiceVirtualPreviewPresenter, bsmVar));
    }

    /* JADX INFO: renamed from: V3 */
    public static void m77263V3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        voiceVirtualPreviewPresenter.m77280f4(bLiveVoice);
    }

    /* JADX INFO: renamed from: X3 */
    public static C22306c m77265X3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, BLiveVoiceRoom bLiveVoiceRoom) {
        bLiveVoiceRoom.getClass();
        voiceVirtualPreviewPresenter.m77275Z3(bLiveVoiceRoom);
        if (Intrinsics.m87488d(BLiveVoiceRoom.EMPTY_ROOM, bLiveVoiceRoom)) {
            C22306c c22306cJust = C22306c.just(new ArrayList());
            C22306c<BLiveVoiceRoomAsset> voiceRoomAsset = VirtualVoiceRoomApiProvider.getVoiceRoomAsset(User.ID_TEAM_ACCOUNT);
            final VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1 voiceVirtualPreviewPresenter$initPreviewRoomData$1$1 = VoiceVirtualPreviewPresenter$initPreviewRoomData$1$1.INSTANCE;
            return mkd0.m154984r(c22306cJust, voiceRoomAsset, new x9j() { // from class: l.p7p0
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return VoiceVirtualPreviewPresenter.m77268h4(voiceVirtualPreviewPresenter$initPreviewRoomData$1$1, obj, obj2);
                }
            });
        }
        C22306c<List<BLiveVoice>> latestLive = VoiceRoomApiProvider.getLatestLive(voiceVirtualPreviewPresenter.m77267e4(), bLiveVoiceRoom.f44324id);
        C22306c<BLiveVoiceRoomAsset> voiceRoomAsset2 = VirtualVoiceRoomApiProvider.getVoiceRoomAsset(User.ID_TEAM_ACCOUNT);
        final VoiceVirtualPreviewPresenter$initPreviewRoomData$1$2 voiceVirtualPreviewPresenter$initPreviewRoomData$1$2 = VoiceVirtualPreviewPresenter$initPreviewRoomData$1$2.INSTANCE;
        return mkd0.m154984r(latestLive, voiceRoomAsset2, new x9j() { // from class: l.q7p0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return VoiceVirtualPreviewPresenter.m77269i4(voiceVirtualPreviewPresenter$initPreviewRoomData$1$2, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m77266Y3(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, Throwable th) {
        ((VirtualNewPreviewView) voiceVirtualPreviewPresenter.viewModel).m77250y0(true);
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: e4 */
    private final String m77267e4() {
        return (String) this.userId.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static final Pair m77268h4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: i4 */
    public static final Pair m77269i4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m77270j4(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, Pair pair, View view) {
        Object first = pair.getFirst();
        first.getClass();
        voiceVirtualPreviewPresenter.m77285p4((List) first);
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m77271k4(VoiceVirtualPreviewPresenter voiceVirtualPreviewPresenter, View view) {
        voiceVirtualPreviewPresenter.act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n4 */
    private final void m77272n4(iqv liveState) {
        if (liveState.m137794a() != 2) {
            return;
        }
        ((VirtualNewPreviewView) this.viewModel).m77250y0(false);
        m77273q4();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m77273q4() {
        Dialog dialog = this.recoverDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.recoverDialog = null;
    }

    @Override // p149l.wxs
    @NotNull
    /* JADX INFO: renamed from: R2 */
    public String mo77274R2() {
        return "p_start_audio_room";
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        boolean zM160270h3 = ((nnn0) this.f188512e.f77102h).m160270h3();
        V v2 = this.viewModel;
        if (zM160270h3) {
            ((VirtualNewPreviewView) v2).m77250y0(false);
            w2p0 w2p0VarM77278c4 = m77278c4();
            String strM149818o = this.f188512e.f77102h.m149818o();
            strM149818o.getClass();
            w2p0VarM77278c4.m201193X4(strM149818o);
            return;
        }
        ((VirtualNewPreviewView) v2).m77250y0(false);
        m77281g4();
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m149815l());
        final Function1 function1 = new Function1() { // from class: l.d7p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualPreviewPresenter.m77255M3((iqv) obj);
            }
        };
        c22306cDuringCreated.takeUntil(new w9j() { // from class: l.j7p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualPreviewPresenter.m77252J3(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.k7p0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m77258P3(this.f121615a, (iqv) obj);
            }
        }));
        aqe.m98261i().m98278u();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m77275Z3(BLiveVoiceRoom roomInfo) {
        if (!Intrinsics.m87488d(roomInfo, BLiveVoiceRoom.EMPTY_ROOM)) {
            m77278c4().m201209u5(roomInfo);
        }
        m77278c4().m201207s5(roomInfo);
    }

    /* JADX INFO: renamed from: a4 */
    public final void m77276a4() {
        m206028F2().LivePusherEvent.closeLive().m172467p();
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final BLiveStartPageTemplate m77277b4() {
        BLiveStartPageTemplate currentTemplate = ((VirtualNewPreviewView) this.viewModel).getCurrentTemplate();
        currentTemplate.getClass();
        return currentTemplate;
    }

    /* JADX INFO: renamed from: c4 */
    public final w2p0 m77278c4() {
        Object value = this.pushModule.getValue();
        value.getClass();
        return (w2p0) value;
    }

    /* JADX INFO: renamed from: d4 */
    public final String m77279d4() {
        return ((VirtualNewPreviewView) this.viewModel).getTitle();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m77280f4(BLiveVoice live) {
        m77278c4().m201208t5(live);
        m77278c4().m201210v5(true);
        m77278c4().m201200e5();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m77281g4() {
        C22306c<T> c22306cDuringCreated = duringCreated(VoiceRoomApiProvider.getRoomInfo(m77267e4()));
        final Function1 function1 = new Function1() { // from class: l.l7p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualPreviewPresenter.m77265X3(this.f126736a, (BLiveVoiceRoom) obj);
            }
        };
        c22306cDuringCreated.flatMap(new w9j() { // from class: l.m7p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualPreviewPresenter.m77257O3(function1, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.n7p0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m77253K3(this.f137542a, (Pair) obj);
            }
        }, new e30() { // from class: l.o7p0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m77266Y3(this.f142529a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final boolean m77282l4(BLiveAbsData live) {
        return TEnum.equals(live.state, "suspended") || TEnum.equals(live.state, "onlive");
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m77283m4() {
        return ((VirtualNewPreviewView) this.viewModel).m77245o0();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m77284o4() {
        m206027E2().m160245M3("");
        m206027E2().m160246N3("");
        m77278c4().m201210v5(false);
        m77278c4().m201200e5();
        m77287s4(true);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m77285p4(List<? extends BLiveVoice> lives) {
        BLiveVoice bLiveVoice = lives.get(0);
        hfw.m130790a("[live][virtual_voice]", "recover last live:" + m77282l4(bLiveVoice));
        if (m77282l4(bLiveVoice)) {
            m77280f4(bLiveVoice);
            return;
        }
        String strM201199d5 = m77278c4().m201199d5();
        String str = bLiveVoice.liveMode;
        str.getClass();
        duringCreated(hrv.m132758t(strM201199d5, false, m206027E2().m132077M0(), str, "", "")).subscribe(ffw.m121194e(new e30() { // from class: l.h7p0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m77263V3(this.f106326a, (BLiveVoice) obj);
            }
        }, new e30() { // from class: l.i7p0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualPreviewPresenter.m77261T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m77286r4(@Nullable BLiveUserMask bLiveUserMask) {
        this.userMask = bLiveUserMask;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m77287s4(boolean isMC) {
        HashMap map = new HashMap();
        map.put("anchorId", ypv.f199493a.m199309D0());
        String str = m206027E2().f139757a0;
        if (str != null) {
            map.put("entrance_type", str);
        }
        if (isMC) {
            zvf0.m220397s("e_start_audio_room", mo77274R2(), map);
        } else {
            zvf0.m220403y("e_start_audio_room", mo77274R2(), map);
        }
    }
}
