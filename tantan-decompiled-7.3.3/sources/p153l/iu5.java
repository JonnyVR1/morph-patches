package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, m88121d2 = {"Ll/iu5;", "", "<init>", "()V", "Ll/oo2;", "baseLiveData", "", BaseSei.f14624X, "(Ll/oo2;)V", "w", "r", "o", "A", BaseSei.f14625Y, "E", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "message", "u", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", ResourceDirection.f39656v, "B", BLiveStormDanmakuGiftResourceType.f45294s, "a", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "currentReceiveMessage", "b", "Ll/oo2;", "currentLiveData", "Ll/wu5;", "c", "Ll/wu5;", "confessMessageHelper", "Ll/uu5;", Constants.INAPP_DATA_TAG, "Ll/uu5;", "matchPopupWindowManager", "Ll/kcg0;", "e", "Ll/kcg0;", "countTimerSub", "f", "longLinkSub", "", "g", "Z", "isCanStartConsumer", "Ll/uu5$b;", "h", "Lkotlin/Lazy;", Constants.KEY_T, "()Ll/uu5$b;", "managerListener", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class iu5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public LongLinkConfession.ConfessionGiftReceiveMsg currentReceiveMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public oo2 currentLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public wu5 confessMessageHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public uu5 matchPopupWindowManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public kcg0 countTimerSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public kcg0 longLinkSub;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isCanStartConsumer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy managerListener = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.bu5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return iu5.m142142a(this.f78426a);
        }
    });

    /* JADX INFO: renamed from: l.iu5$a */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/iu5$a", "Ll/uu5$b;", "", "c", "()V", "b", "a", "", Reason.TYPE, Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C17805a implements uu5.InterfaceC20677b {
        public C17805a() {
        }

        @Override // p153l.uu5.InterfaceC20677b
        /* JADX INFO: renamed from: a */
        public void mo142171a() {
            iu5.this.m142164s();
            wu5 wu5Var = iu5.this.confessMessageHelper;
            if (wu5Var != null) {
                wu5Var.m207924e();
            }
        }

        @Override // p153l.uu5.InterfaceC20677b
        /* JADX INFO: renamed from: b */
        public void mo142172b() {
            iu5.this.m142160B();
        }

        @Override // p153l.uu5.InterfaceC20677b
        /* JADX INFO: renamed from: c */
        public void mo142173c() {
            iu5.this.m142162o();
        }

        @Override // p153l.uu5.InterfaceC20677b
        /* JADX INFO: renamed from: d */
        public void mo142174d(String reason) {
            reason.getClass();
        }
    }

    /* JADX INFO: renamed from: l.iu5$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/iu5$b", "Ll/wu5$a;", "Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;", "receiveMsg", "", "b", "(Lcom/p1/mobile/longlink/msg/livegift/LongLinkConfession$ConfessionGiftReceiveMsg;)V", "", "a", "()Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17806b implements wu5.InterfaceC21180a {
        public C17806b() {
        }

        @Override // p153l.wu5.InterfaceC21180a
        /* JADX INFO: renamed from: a */
        public boolean mo142175a() {
            if (!iu5.this.isCanStartConsumer) {
                return false;
            }
            uu5 uu5Var = iu5.this.matchPopupWindowManager;
            if (uu5Var != null) {
                return !uu5Var.getIsShowingPopUpWindow();
            }
            return true;
        }

        @Override // p153l.wu5.InterfaceC21180a
        /* JADX INFO: renamed from: b */
        public void mo142176b(LongLinkConfession.ConfessionGiftReceiveMsg receiveMsg) {
            receiveMsg.getClass();
            iu5.this.m142167v(receiveMsg);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m142139C(iu5 iu5Var, LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg, Long l2) {
        uu5 uu5Var = iu5Var.matchPopupWindowManager;
        if (uu5Var != null) {
            long showTime = confessionGiftReceiveMsg.getShowTime();
            l2.getClass();
            uu5Var.m198167q((int) (showTime - l2.longValue()));
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m142141F(iu5 iu5Var, LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
        confessionGiftReceiveMsg.getClass();
        iu5Var.m142166u(confessionGiftReceiveMsg);
    }

    /* JADX INFO: renamed from: a */
    public static C17805a m142142a(iu5 iu5Var) {
        return iu5Var.new C17805a();
    }

    /* JADX INFO: renamed from: p */
    public static final void m142156p(Meta meta) {
        o1j0.m165649w(R$string.f48227m2);
    }

    /* JADX INFO: renamed from: q */
    public static final void m142157q(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m142158z(iu5 iu5Var, LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg) {
        confessionGiftReceiveMsg.getClass();
        iu5Var.m142166u(confessionGiftReceiveMsg);
    }

    /* JADX INFO: renamed from: A */
    public final void m142159A() {
        wu5 wu5Var = this.confessMessageHelper;
        if (wu5Var != null) {
            wu5Var.m207925f(new C17806b());
        }
        this.isCanStartConsumer = true;
    }

    /* JADX INFO: renamed from: B */
    public final void m142160B() {
        final LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg = this.currentReceiveMessage;
        if (confessionGiftReceiveMsg != null) {
            m142164s();
            this.countTimerSub = C22421c.interval(0L, 1L, TimeUnit.SECONDS).take(((int) confessionGiftReceiveMsg.getShowTime()) + 1).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.eu5
                @Override // p153l.y20
                public final void call(Object obj) {
                    iu5.m142139C(this.f95842a, confessionGiftReceiveMsg, (Long) obj);
                }
            }, new y20() { // from class: l.fu5
                @Override // p153l.y20
                public final void call(Object obj) {
                    iu5.m142140D((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m142161E(oo2 baseLiveData) {
        kcg0 kcg0Var = this.longLinkSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        this.currentLiveData = baseLiveData;
        if (baseLiveData != null) {
            this.longLinkSub = baseLiveData.m168545q1().f71749o0.subscribe(dhw.m115829h(new y20() { // from class: l.du5
                @Override // p153l.y20
                public final void call(Object obj) {
                    iu5.m142141F(this.f90741a, (LongLinkConfession.ConfessionGiftReceiveMsg) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m142162o() {
        LongLinkConfession.ConfessionGiftReceiveMsg confessionGiftReceiveMsg = this.currentReceiveMessage;
        if (confessionGiftReceiveMsg != null) {
            bv5 bv5Var = bv5.INSTANCE;
            String roomId = confessionGiftReceiveMsg.getRoomId();
            roomId.getClass();
            String liveId = confessionGiftReceiveMsg.getLiveId();
            liveId.getClass();
            String confessRecordId = confessionGiftReceiveMsg.getConfessRecordId();
            confessRecordId.getClass();
            String strM207631D0 = zrv.f205799a.m207631D0();
            strM207631D0.getClass();
            String id = confessionGiftReceiveMsg.getUser().getId();
            id.getClass();
            bv5Var.m106553c(roomId, liveId, confessRecordId, strM207631D0, id).subscribe(dhw.m115826e(new y20() { // from class: l.gu5
                @Override // p153l.y20
                public final void call(Object obj) {
                    iu5.m142156p((Meta) obj);
                }
            }, new y20() { // from class: l.hu5
                @Override // p153l.y20
                public final void call(Object obj) {
                    iu5.m142157q((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m142163r() {
        wu5 wu5Var = this.confessMessageHelper;
        if (wu5Var != null) {
            wu5Var.m207923d();
        }
        this.confessMessageHelper = null;
        uu5 uu5Var = this.matchPopupWindowManager;
        if (uu5Var != null) {
            uu5Var.m198158f();
        }
        this.matchPopupWindowManager = null;
        this.currentLiveData = null;
        this.currentReceiveMessage = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m142164s() {
        kcg0 kcg0Var = this.countTimerSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
    }

    /* JADX INFO: renamed from: t */
    public final uu5.InterfaceC20677b m142165t() {
        return (uu5.InterfaceC20677b) this.managerListener.getValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m142166u(LongLinkConfession.ConfessionGiftReceiveMsg message) {
        wu5 wu5Var = this.confessMessageHelper;
        if (wu5Var != null) {
            wu5Var.m207921b(message);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m142167v(LongLinkConfession.ConfessionGiftReceiveMsg message) {
        this.currentReceiveMessage = message;
        if (this.matchPopupWindowManager == null) {
            this.matchPopupWindowManager = new uu5(m142165t());
        }
        uu5 uu5Var = this.matchPopupWindowManager;
        if (uu5Var != null) {
            uu5Var.m198168r(message);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m142168w() {
        m142164s();
        if (cmp0.m111299d().m111305f()) {
            return;
        }
        m142163r();
    }

    /* JADX INFO: renamed from: x */
    public final void m142169x(@NotNull oo2 baseLiveData) {
        oo2 oo2Var;
        baseLiveData.getClass();
        this.isCanStartConsumer = false;
        m142164s();
        wu5 wu5Var = this.confessMessageHelper;
        if (wu5Var != null) {
            wu5Var.m207926g();
        }
        if (this.currentLiveData == null) {
            this.currentLiveData = baseLiveData;
            m142170y();
        } else {
            uu5 uu5Var = this.matchPopupWindowManager;
            if (uu5Var != null) {
                uu5Var.m198158f();
            }
            if (!Intrinsics.m88377d(this.currentLiveData, baseLiveData) && (oo2Var = this.currentLiveData) != null) {
                if (oo2Var.m202194o().equals(baseLiveData.m202194o())) {
                    m142161E(baseLiveData);
                } else {
                    m142163r();
                    if (this.confessMessageHelper == null) {
                        this.confessMessageHelper = new wu5();
                    }
                    m142161E(baseLiveData);
                }
            }
        }
        m142159A();
    }

    /* JADX INFO: renamed from: y */
    public final void m142170y() {
        kcg0 kcg0Var = this.longLinkSub;
        if (kcg0Var != null) {
            psd0.m173633z(kcg0Var);
        }
        oo2 oo2Var = this.currentLiveData;
        if (oo2Var != null) {
            wu5 wu5Var = this.confessMessageHelper;
            if (wu5Var == null) {
                this.confessMessageHelper = new wu5();
            } else if (wu5Var != null) {
                wu5Var.m207923d();
            }
            this.longLinkSub = oo2Var.m168545q1().f71749o0.subscribe(dhw.m115829h(new y20() { // from class: l.cu5
                @Override // p153l.y20
                public final void call(Object obj) {
                    iu5.m142158z(this.f83816a, (LongLinkConfession.ConfessionGiftReceiveMsg) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m142140D(Throwable th) {
    }
}
