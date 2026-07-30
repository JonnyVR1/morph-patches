package com.hellogroup.p036mk.business;

import android.app.Activity;
import android.app.Application;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.p036mk.business.webmonitor.MKWebMonitorManager;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.g4k;
import p153l.i5m;
import p153l.ivl;
import p153l.jzv;
import p153l.kw5;
import p153l.lv0;
import p153l.mjw;
import p153l.mxl;
import p153l.nvl;
import p153l.ojw;
import p153l.oxl;
import p153l.p7m;
import p153l.pjw;
import p153l.qjw;
import p153l.sgi;
import p153l.sjw;
import p153l.t1j0;
import p153l.wam;
import p153l.xh3;
import p153l.yym;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m88121d2 = {"Lcom/hellogroup/mk/business/MKConfigSetter;", "", "()V", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class MKConfigSetter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    private static String f11999a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private static ojw f12000b;

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final ojw m17757e() {
        return f12000b;
    }

    @Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0003R*\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010\u0003\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010'\u0012\u0004\b,\u0010\u0003\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u001f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010!¨\u0006."}, m88121d2 = {"Lcom/hellogroup/mk/business/MKConfigSetter$Companion;", "", "<init>", "()V", "Landroid/app/Application;", "app", "Ll/pjw;", "coreConfig", "Ll/qjw;", "coreDelegate", "", "g", "(Landroid/app/Application;Ll/pjw;Ll/qjw;)V", "f", "e", "h", "Landroid/app/Activity;", "activity", "Ll/wam;", "n", "(Landroid/app/Activity;)Ll/wam;", "", RXScreenCaptureService.KEY_INDEX, "()Z", "a", "Ll/ojw;", "router", Constants.INAPP_DATA_TAG, "(Landroid/app/Application;Ll/ojw;)V", "k", "j", "", "uploadFileUrl", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "uploadFileUrl$annotations", "Ll/ojw;", "b", "()Ll/ojw;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/ojw;)V", "router$annotations", "TAG", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: e */
        private final void m17758e() {
            m17761h();
            xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new MKConfigSetter$Companion$initBusinessKit$1(null), 3, null);
        }

        /* JADX INFO: renamed from: f */
        private final void m17759f() {
            m17758e();
        }

        /* JADX INFO: renamed from: g */
        private final void m17760g(Application app, pjw coreConfig, qjw coreDelegate) {
            lv0.m155975e(app);
            t1j0.m188911d(app);
            coreDelegate.m176891c();
            sjw.INSTANCE.m186334s(app, coreConfig, coreDelegate);
            FepManager.INSTANCE.m17610a().m17598u(new sgi());
        }

        /* JADX INFO: renamed from: h */
        private final void m17761h() {
            ojw ojwVarM17763b = m17763b();
            if (ojwVarM17763b != null) {
                ojwVarM17763b.m167960s();
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m17762a() {
            ojw ojwVarM17763b = m17763b();
            if (ojwVarM17763b != null) {
                return ojwVarM17763b.m167950i();
            }
            return false;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final ojw m17763b() {
            return MKConfigSetter.f12000b;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final String m17764c() {
            return MKConfigSetter.f11999a;
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m17765d(@NotNull Application app, @NotNull ojw router) {
            app.getClass();
            router.getClass();
            lv0.m155975e(app);
            m17769l(router);
            m17770m(router.m167941A());
            kw5 kw5VarMo167951j = router.mo167951j();
            boolean zMo167965x = router.mo167965x();
            boolean zMo167965x2 = router.mo167965x();
            pjw pjwVar = new pjw(zMo167965x, router.mo167949h(), zMo167965x2, router.mo167944c(), router.mo167943b(), kw5VarMo167951j.getMkSdcardPath(), kw5VarMo167951j.getMkHomeDir(), router.mo167947f(), router.mo167966y());
            ivl ivlVarMo167967z = router.mo167967z();
            nvl nvlVarMo167963v = router.mo167963v();
            oxl oxlVarMo167957p = router.mo167957p();
            mxl mxlVarM167953l = router.m167953l();
            g4k g4kVarMo167955n = router.mo167955n();
            yym yymVarMo167956o = router.mo167956o();
            i5m i5mVarMo167961t = router.mo167961t();
            p7m p7mVarM167964w = router.m167964w();
            router.m167954m();
            m17760g(app, pjwVar, new qjw(ivlVarMo167967z, nvlVarMo167963v, oxlVarMo167957p, mxlVarM167953l, g4kVarMo167955n, yymVarMo167956o, i5mVarMo167961t, p7mVarM167964w, null, router.mo167958q(), router.mo167952k()));
            m17759f();
        }

        /* JADX INFO: renamed from: i */
        public final boolean m17766i() {
            if (sjw.isInit) {
                return sjw.m186324m();
            }
            ojw ojwVarM17763b = m17763b();
            if (ojwVarM17763b != null) {
                return ojwVarM17763b.mo167965x();
            }
            return false;
        }

        /* JADX INFO: renamed from: j */
        public final void m17767j() {
            try {
                mjw.INSTANCE.m158637o();
            } catch (Throwable th) {
                jzv.m147730c("MKKit", "", th);
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m17768k() {
            try {
                Result.Companion companion = Result.INSTANCE;
                mjw.INSTANCE.m158636l();
                MKWebMonitorManager.INSTANCE.m18255j();
                Result.m225066constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
        }

        /* JADX INFO: renamed from: l */
        public final void m17769l(@Nullable ojw ojwVar) {
            MKConfigSetter.f12000b = ojwVar;
        }

        /* JADX INFO: renamed from: m */
        public final void m17770m(@Nullable String str) {
            MKConfigSetter.f11999a = str;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: n */
        public final wam m17771n(@NotNull Activity activity) {
            activity.getClass();
            ojw ojwVarM17763b = m17763b();
            if (ojwVarM17763b != null) {
                return ojwVarM17763b.m167962u(activity);
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
