package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m87232d2 = {"Ll/et5;", "", "<init>", "()V", "Ll/ho2;", "baseLiveData", "", BaseSei.f13930X, "(Ll/ho2;)V", "w", "r", "o", "A", BaseSei.f13931Y, "E", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "message", "u", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", ResourceDirection.f38808v, "B", BLiveStormDanmakuGiftResourceType.f44446s, "a", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "currentReceiveMessage", "b", "Ll/ho2;", "currentLiveData", "Ll/st5;", "c", "Ll/st5;", "confessMessageHelper", "Ll/qt5;", Constants.INAPP_DATA_TAG, "Ll/qt5;", "matchPopupWindowManager", "Ll/c4g0;", "e", "Ll/c4g0;", "countTimerSub", "f", "longLinkSub", "", "g", "Z", "isCanStartConsumer", "Ll/qt5$b;", "h", "Lkotlin/Lazy;", Constants.KEY_T, "()Ll/qt5$b;", "managerListener", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class et5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public LongLinkConfession.ConfessionGiftReceiveMsg currentReceiveMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ho2 currentLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public st5 confessMessageHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public qt5 matchPopupWindowManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 countTimerSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public c4g0 longLinkSub;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isCanStartConsumer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy managerListener = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.xs5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return et5.m117975a(this.f194201a);
        }
    });

    /* JADX INFO: renamed from: l.et5$a */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/et5$a", "Ll/qt5$b;", "", "c", "()V", "b", "a", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C16675a implements qt5.InterfaceC19574b {
        public C16675a() {
        }

        @Override // p149l.qt5.InterfaceC19574b
        /* JADX INFO: renamed from: a */
        public void mo118004a() {
            et5.this.m117997s();
            st5 st5Var = et5.this.confessMessageHelper;
            if (st5Var != null) {
                st5Var.m185855e();
            }
        }

        @Override // p149l.qt5.InterfaceC19574b
        /* JADX INFO: renamed from: b */
        public void mo118005b() {
            et5.this.m117993B();
        }

        @Override // p149l.qt5.InterfaceC19574b
        /* JADX INFO: renamed from: c */
        public void mo118006c() {
            et5.this.m117995o();
        }

        @Override // p149l.qt5.InterfaceC19574b
        /* JADX INFO: renamed from: d */
        public void mo118007d(String reason) {
            reason.getClass();
        }
    }

    /* JADX INFO: renamed from: l.et5$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/et5$b", "Ll/st5$a;", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "receiveMsg", "", "b", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", "", "a", "()Z", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C16676b implements st5.InterfaceC20024a {
        public C16676b() {
        }

        @Override // p149l.st5.InterfaceC20024a
        /* JADX INFO: renamed from: a */
        public boolean mo118008a() {
            if (!et5.this.isCanStartConsumer) {
                return false;
            }
            qt5 qt5Var = et5.this.matchPopupWindowManager;
            if (qt5Var != null) {
                return !qt5Var.getIsShowingPopUpWindow();
            }
            return true;
        }

        @Override // p149l.st5.InterfaceC20024a
        /* JADX INFO: renamed from: b */
        public void mo118009b(LongLinkConfession.ConfessionGiftReceiveMsg receiveMsg) {
            receiveMsg.getClass();
            et5.this.m118000v(receiveMsg);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m117972C(et5 et5Var, LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg, Long l2) {
        qt5 qt5Var = et5Var.matchPopupWindowManager;
        if (qt5Var != null) {
            long showTime = confessionGiftReceiveMsg.getShowTime();
            l2.getClass();
            qt5Var.m176406q((int) (showTime - l2.longValue()));
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m117974F(et5 et5Var, LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
        confessionGiftReceiveMsg.getClass();
        et5Var.m117999u(confessionGiftReceiveMsg);
    }

    /* JADX INFO: renamed from: a */
    public static C16675a m117975a(et5 et5Var) {
        return et5Var.new C16675a();
    }

    /* JADX INFO: renamed from: p */
    public static final void m117989p(Meta meta) {
        lsi0.m151593w(R$string.f47379m2);
    }

    /* JADX INFO: renamed from: q */
    public static final void m117990q(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m117991z(et5 et5Var, LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
        confessionGiftReceiveMsg.getClass();
        et5Var.m117999u(confessionGiftReceiveMsg);
    }

    /* JADX INFO: renamed from: A */
    public final void m117992A() {
        st5 st5Var = this.confessMessageHelper;
        if (st5Var != null) {
            st5Var.m185856f(new C16676b());
        }
        this.isCanStartConsumer = true;
    }

    /* JADX INFO: renamed from: B */
    public final void m117993B() {
        final LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg = this.currentReceiveMessage;
        if (confessionGiftReceiveMsg != null) {
            m117997s();
            this.countTimerSub = C22306c.interval(0L, 1L, TimeUnit.SECONDS).take(((int) confessionGiftReceiveMsg.getShowTime()) + 1).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.at5
                @Override // p149l.e30
                public final void call(Object obj) {
                    et5.m117972C(this.f71556a, confessionGiftReceiveMsg, (Long) obj);
                }
            }, new e30() { // from class: l.bt5
                @Override // p149l.e30
                public final void call(Object obj) {
                    et5.m117973D((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m117994E(ho2 baseLiveData) {
        c4g0 c4g0Var = this.longLinkSub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        this.currentLiveData = baseLiveData;
        if (baseLiveData != null) {
            this.longLinkSub = baseLiveData.m132160q1().f170482o0.subscribe(ffw.m121197h(new e30() { // from class: l.zs5
                @Override // p149l.e30
                public final void call(Object obj) {
                    et5.m117974F(this.f204568a, (LongLinkConfession.ConfessionGiftReceiveMsg) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m117995o() {
        LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg = this.currentReceiveMessage;
        if (confessionGiftReceiveMsg != null) {
            xt5 xt5Var = xt5.INSTANCE;
            String roomId = confessionGiftReceiveMsg.getRoomId();
            roomId.getClass();
            String liveId = confessionGiftReceiveMsg.getLiveId();
            liveId.getClass();
            String confessRecordId = confessionGiftReceiveMsg.getConfessRecordId();
            confessRecordId.getClass();
            String strM199309D0 = ypv.f199493a.m199309D0();
            strM199309D0.getClass();
            String id = confessionGiftReceiveMsg.getUser().getId();
            id.getClass();
            xt5Var.m210960c(roomId, liveId, confessRecordId, strM199309D0, id).subscribe(ffw.m121194e(new e30() { // from class: l.ct5
                @Override // p149l.e30
                public final void call(Object obj) {
                    et5.m117989p((Meta) obj);
                }
            }, new e30() { // from class: l.dt5
                @Override // p149l.e30
                public final void call(Object obj) {
                    et5.m117990q((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m117996r() {
        st5 st5Var = this.confessMessageHelper;
        if (st5Var != null) {
            st5Var.m185854d();
        }
        this.confessMessageHelper = null;
        qt5 qt5Var = this.matchPopupWindowManager;
        if (qt5Var != null) {
            qt5Var.m176397f();
        }
        this.matchPopupWindowManager = null;
        this.currentLiveData = null;
        this.currentReceiveMessage = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m117997s() {
        c4g0 c4g0Var = this.countTimerSub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public final qt5.InterfaceC19574b m117998t() {
        return (qt5.InterfaceC19574b) this.managerListener.getValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m117999u(LongLinkConfession.ConfessionGiftReceiveMsg message) {
        st5 st5Var = this.confessMessageHelper;
        if (st5Var != null) {
            st5Var.m185852b(message);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m118000v(LongLinkConfession.ConfessionGiftReceiveMsg message) {
        this.currentReceiveMessage = message;
        if (this.matchPopupWindowManager == null) {
            this.matchPopupWindowManager = new qt5(m117998t());
        }
        qt5 qt5Var = this.matchPopupWindowManager;
        if (qt5Var != null) {
            qt5Var.m176407r(message);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m118001w() {
        m117997s();
        if (ycp0.m214190d().m214196f()) {
            return;
        }
        m117996r();
    }

    /* JADX INFO: renamed from: x */
    public final void m118002x(@NotNull ho2 baseLiveData) {
        ho2 ho2Var;
        baseLiveData.getClass();
        this.isCanStartConsumer = false;
        m117997s();
        st5 st5Var = this.confessMessageHelper;
        if (st5Var != null) {
            st5Var.m185857g();
        }
        if (this.currentLiveData == null) {
            this.currentLiveData = baseLiveData;
            m118003y();
        } else {
            qt5 qt5Var = this.matchPopupWindowManager;
            if (qt5Var != null) {
                qt5Var.m176397f();
            }
            if (!Intrinsics.m87488d(this.currentLiveData, baseLiveData) && (ho2Var = this.currentLiveData) != null) {
                if (ho2Var.m149818o().equals(baseLiveData.m149818o())) {
                    m117994E(baseLiveData);
                } else {
                    m117996r();
                    if (this.confessMessageHelper == null) {
                        this.confessMessageHelper = new st5();
                    }
                    m117994E(baseLiveData);
                }
            }
        }
        m117992A();
    }

    /* JADX INFO: renamed from: y */
    public final void m118003y() {
        c4g0 c4g0Var = this.longLinkSub;
        if (c4g0Var != null) {
            mkd0.m154992z(c4g0Var);
        }
        ho2 ho2Var = this.currentLiveData;
        if (ho2Var != null) {
            st5 st5Var = this.confessMessageHelper;
            if (st5Var == null) {
                this.confessMessageHelper = new st5();
            } else if (st5Var != null) {
                st5Var.m185854d();
            }
            this.longLinkSub = ho2Var.m132160q1().f170482o0.subscribe(ffw.m121197h(new e30() { // from class: l.ys5
                @Override // p149l.e30
                public final void call(Object obj) {
                    et5.m117991z(this.f199746a, (LongLinkConfession.ConfessionGiftReceiveMsg) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m117973D(Throwable th) {
    }
}
