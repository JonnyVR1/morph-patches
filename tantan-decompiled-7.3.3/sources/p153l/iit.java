package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0001\n\u001f !\"#$%&'(¨\u0006)"}, m88121d2 = {"Ll/iit;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "trickProgress", "Lrx/c;", "obs", "", "finish", "<init>", "(Ljava/lang/String;ILrx/c;Z)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "Lrx/c;", "getObs", "()Lrx/c;", Constants.INAPP_DATA_TAG, "Z", "f", "()Z", RXScreenCaptureService.KEY_INDEX, "(Z)V", "Companion", "Ll/qn0;", "Ll/nu6;", "Ll/h9e;", "Ll/l9e;", "Ll/bae;", "Ll/guf;", "Ll/zwm;", "Ll/qtv;", "Ll/rtv;", "Ll/hgl0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class iit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f115127e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f115128f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f115129g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f115130h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f115131i = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int trickProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final C22421c<iit> obs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean finish;

    public /* synthetic */ iit(String str, int i, C22421c c22421c, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : c22421c, (i2 & 8) != 0 ? false : z, null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFinish() {
        return this.finish;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTrickProgress() {
        return this.trickProgress;
    }

    /* JADX INFO: renamed from: i */
    public final void m140088i(boolean z) {
        this.finish = z;
    }

    /* JADX INFO: renamed from: l.iit$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010%R\u001a\u0010-\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010%R\u001a\u0010/\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010%R\u001a\u00101\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010%R\u001a\u00103\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010%¨\u00065"}, m88121d2 = {"Ll/iit$a;", "", "<init>", "()V", "", "action", "", "extraObjs", "", "X", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Ll/iit;", "task", "a0", "(Ll/iit;)V", "", p7f.GPS_MEASUREMENT_INTERRUPTED, "()Ljava/util/List;", "W", "c0", "b0", "L", "", "type", p7f.GPS_DIRECTION_TRUE, "(I)Ljava/util/List;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lrx/c;", "Q", "(Lcom/p1/mobile/android/app/Act;Ll/iit;[Ljava/lang/Object;)Lrx/c;", "K", "(Ll/iit;)Ll/iit;", "", "M", "(I)Z", "Z", "()I", "Y", "(I)V", "U", "(I)Ljava/lang/String;", "NormalAnchor", "I", BloodType.f39576O, "Voice", p7f.LATITUDE_SOUTH, "NormalAudience", "P", "VideoChat", "R", "FFmpegSo", "N", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public static void m140089A(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: B */
        public static iit m140090B(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
            return iit.INSTANCE.m140125K(l9e.INSTANCE);
        }

        /* JADX INFO: renamed from: C */
        public static iit m140091C(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            return companion.m140125K(iitVar);
        }

        /* JADX INFO: renamed from: D */
        public static void m140092D(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: E */
        public static Unit m140093E(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: F */
        public static void m140094F(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: G */
        public static Unit m140095G(Object[] objArr, iit iitVar) {
            iit.INSTANCE.m140138X("anchor_mmcv_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: H */
        public static void m140096H(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: I */
        public static Unit m140097I(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: J */
        public static void m140098J(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: a */
        public static Unit m140099a(Object[] objArr, iit iitVar) {
            iit.INSTANCE.m140138X("receive_verify_info", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m140100b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: c */
        public static iit m140101c(Function1 function1, Object obj) {
            return (iit) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static iit m140102d(h9e h9eVar) {
            Companion companion = iit.INSTANCE;
            h9eVar.getClass();
            return companion.m140125K(h9eVar);
        }

        /* JADX INFO: renamed from: e */
        public static iit m140103e(Function1 function1, Object obj) {
            return (iit) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: f */
        public static void m140104f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: g */
        public static Unit m140105g(Object[] objArr, iit iitVar) {
            iit.INSTANCE.m140138X("anchor_so_res_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        public static iit m140106h(Function1 function1, Object obj) {
            return (iit) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: i */
        public static void m140107i(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: j */
        public static Unit m140108j(Object[] objArr, iit iitVar) {
            iit.INSTANCE.m140138X("receive_framerate_info", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static void m140109k(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: l */
        public static Unit m140110l(Object[] objArr, iit iitVar) {
            iit.INSTANCE.m140138X("anchor_beauty_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: m */
        public static iit m140111m(Function1 function1, Object obj) {
            return (iit) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: n */
        public static Unit m140112n(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o */
        public static iit m140113o(Function1 function1, Object obj) {
            return (iit) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: p */
        public static Unit m140114p(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static void m140115q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: r */
        public static Unit m140116r(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static void m140117s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: t */
        public static iit m140118t(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
            return iit.INSTANCE.m140125K(nu6.INSTANCE);
        }

        /* JADX INFO: renamed from: u */
        public static void m140119u(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: v */
        public static void m140120v(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: w */
        public static Unit m140121w(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: x */
        public static iit m140122x(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            return companion.m140125K(iitVar);
        }

        /* JADX INFO: renamed from: y */
        public static Unit m140123y(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: z */
        public static Unit m140124z(iit iitVar) {
            Companion companion = iit.INSTANCE;
            iitVar.getClass();
            companion.m140141a0(iitVar);
            return Unit.INSTANCE;
        }

        @NotNull
        /* JADX INFO: renamed from: K */
        public final iit m140125K(@NotNull iit task) {
            task.getClass();
            task.m140088i(true);
            nsh0.m164608j("live_sdk", "checkPassed:" + task.getName());
            return task;
        }

        @NotNull
        /* JADX INFO: renamed from: L */
        public final List<iit> m140126L() {
            return CollectionsKt.listOf(guf.INSTANCE);
        }

        /* JADX INFO: renamed from: M */
        public final boolean m140127M(int type) {
            List<iit> listM140134T = m140134T(type);
            if ((listM140134T instanceof Collection) && listM140134T.isEmpty()) {
                return true;
            }
            Iterator<T> it = listM140134T.iterator();
            while (it.hasNext()) {
                if (!((iit) it.next()).getFinish()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: N */
        public final int m140128N() {
            return iit.f115131i;
        }

        /* JADX INFO: renamed from: O */
        public final int m140129O() {
            return iit.f115127e;
        }

        /* JADX INFO: renamed from: P */
        public final int m140130P() {
            return iit.f115129g;
        }

        @JvmOverloads
        @Nullable
        /* JADX INFO: renamed from: Q */
        public final C22421c<iit> m140131Q(@Nullable Act act, @NotNull iit task, @NotNull final Object... extraObjs) {
            task.getClass();
            extraObjs.getClass();
            if (Intrinsics.m88377d(task, rtv.INSTANCE)) {
                C22421c<iit> c22421cM121262F = vxr.m203876d().m170969C1() ? elt.m121262F(false) : elt.m121262F(true);
                final Function1 function1 = new Function1() { // from class: l.ygt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140097I((iit) obj);
                    }
                };
                return c22421cM121262F.doOnNext(new y20() { // from class: l.aht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140109k(function1, obj);
                    }
                });
            }
            if (Intrinsics.m88377d(task, qtv.INSTANCE)) {
                C22421c<iit> c22421cM121262F2 = elt.m121262F(true);
                final Function1 function2 = new Function1() { // from class: l.mht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140116r((iit) obj);
                    }
                };
                C22421c<iit> c22421cDoOnNext = c22421cM121262F2.doOnNext(new y20() { // from class: l.tht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140115q(function2, obj);
                    }
                });
                final Function1 function3 = new Function1() { // from class: l.vht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140105g(extraObjs, (iit) obj);
                    }
                };
                return c22421cDoOnNext.doOnNext(new y20() { // from class: l.wht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140119u(function3, obj);
                    }
                });
            }
            if (Intrinsics.m88377d(task, nu6.INSTANCE)) {
                C22421c<BLiveBeautyFilterConfig> c22421cM193619S = zrv.f205801c.m193619S();
                final Function1 function4 = new Function1() { // from class: l.xht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140118t((BLiveBeautyFilterConfig) obj);
                    }
                };
                C22421c<R> map = c22421cM193619S.map(new qcj() { // from class: l.yht
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return iit.Companion.m140106h(function4, obj);
                    }
                });
                final Function1 function5 = new Function1() { // from class: l.zht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140124z((iit) obj);
                    }
                };
                return map.doOnNext(new y20() { // from class: l.ait
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140107i(function5, obj);
                    }
                });
            }
            if (Intrinsics.m88377d(task, h9e.INSTANCE)) {
                C22421c<h9e> c22421cM165678j = o1s.m165678j();
                final Function1 function6 = new Function1() { // from class: l.jht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140102d((h9e) obj);
                    }
                };
                C22421c<R> map2 = c22421cM165678j.map(new qcj() { // from class: l.uht
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return iit.Companion.m140111m(function6, obj);
                    }
                });
                final Function1 function7 = new Function1() { // from class: l.bit
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140114p((iit) obj);
                    }
                };
                C22421c c22421cDoOnNext2 = map2.doOnNext(new y20() { // from class: l.cit
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140100b(function7, obj);
                    }
                });
                final Function1 function8 = new Function1() { // from class: l.dit
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140095G(extraObjs, (iit) obj);
                    }
                };
                return c22421cDoOnNext2.doOnNext(new y20() { // from class: l.eit
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140117s(function8, obj);
                    }
                });
            }
            if (Intrinsics.m88377d(task, l9e.INSTANCE)) {
                C22421c<BLiveBeautyFilterConfig> c22421cM193619S2 = zrv.f205801c.m193619S();
                final Function1 function9 = new Function1() { // from class: l.fit
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140090B((BLiveBeautyFilterConfig) obj);
                    }
                };
                C22421c<R> map3 = c22421cM193619S2.map(new qcj() { // from class: l.git
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return iit.Companion.m140113o(function9, obj);
                    }
                });
                final Function1 function10 = new Function1() { // from class: l.hit
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140121w((iit) obj);
                    }
                };
                C22421c c22421cDoOnNext3 = map3.doOnNext(new y20() { // from class: l.zgt
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140098J(function10, obj);
                    }
                });
                final Function1 function11 = new Function1() { // from class: l.bht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140110l(extraObjs, (iit) obj);
                    }
                };
                return c22421cDoOnNext3.doOnNext(new y20() { // from class: l.cht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140096H(function11, obj);
                    }
                });
            }
            if (Intrinsics.m88377d(task, hgl0.INSTANCE)) {
                C22421c<iit> c22421cM172989m = pn0.m172989m();
                final Function1 function12 = new Function1() { // from class: l.dht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140122x((iit) obj);
                    }
                };
                C22421c<R> map4 = c22421cM172989m.map(new qcj() { // from class: l.eht
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return iit.Companion.m140103e(function12, obj);
                    }
                });
                final Function1 function13 = new Function1() { // from class: l.fht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140093E((iit) obj);
                    }
                };
                C22421c c22421cDoOnNext4 = map4.doOnNext(new y20() { // from class: l.ght
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140094F(function13, obj);
                    }
                });
                final Function1 function14 = new Function1() { // from class: l.hht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140108j(extraObjs, (iit) obj);
                    }
                };
                return c22421cDoOnNext4.doOnNext(new y20() { // from class: l.iht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140104f(function14, obj);
                    }
                });
            }
            if (!Intrinsics.m88377d(task, qn0.INSTANCE)) {
                if (!Intrinsics.m88377d(task, guf.INSTANCE)) {
                    return null;
                }
                C22421c<iit> c22421cM121258B = elt.m121258B();
                final Function1 function15 = new Function1() { // from class: l.rht
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return iit.Companion.m140123y((iit) obj);
                    }
                };
                return c22421cM121258B.doOnNext(new y20() { // from class: l.sht
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        iit.Companion.m140120v(function15, obj);
                    }
                });
            }
            C22421c<iit> c22421cM172988l = pn0.m172988l(act);
            final Function1 function16 = new Function1() { // from class: l.kht
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return iit.Companion.m140091C((iit) obj);
                }
            };
            C22421c<R> map5 = c22421cM172988l.map(new qcj() { // from class: l.lht
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return iit.Companion.m140101c(function16, obj);
                }
            });
            final Function1 function17 = new Function1() { // from class: l.nht
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return iit.Companion.m140112n((iit) obj);
                }
            };
            C22421c c22421cDoOnNext5 = map5.doOnNext(new y20() { // from class: l.oht
                @Override // p153l.y20
                public final void call(Object obj) {
                    iit.Companion.m140089A(function17, obj);
                }
            });
            final Function1 function18 = new Function1() { // from class: l.pht
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return iit.Companion.m140099a(extraObjs, (iit) obj);
                }
            };
            return c22421cDoOnNext5.doOnNext(new y20() { // from class: l.qht
                @Override // p153l.y20
                public final void call(Object obj) {
                    iit.Companion.m140092D(function18, obj);
                }
            });
        }

        /* JADX INFO: renamed from: R */
        public final int m140132R() {
            return iit.f115130h;
        }

        /* JADX INFO: renamed from: S */
        public final int m140133S() {
            return iit.f115128f;
        }

        @NotNull
        /* JADX INFO: renamed from: T */
        public final List<iit> m140134T(int type) {
            if (type == m140129O()) {
                return m140136V();
            }
            if (type == m140133S()) {
                return m140143c0();
            }
            if (type == m140132R()) {
                return m140142b0();
            }
            return type == m140128N() ? m140126L() : m140137W();
        }

        @NotNull
        /* JADX INFO: renamed from: U */
        public final String m140135U(int type) {
            try {
                StringBuilder sb = new StringBuilder();
                for (iit iitVar : m140134T(type)) {
                    sb.append(iitVar.getName());
                    sb.append("-");
                    sb.append(iitVar.getFinish());
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                return sb.toString();
            } catch (Exception e) {
                String message = e.getMessage();
                return message == null ? "error" : message;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final List<iit> m140136V() {
            return CollectionsKt.listOf((Object[]) new iit[]{l9e.INSTANCE, h9e.INSTANCE, bae.INSTANCE, zwm.INSTANCE, qtv.INSTANCE, guf.INSTANCE, nu6.INSTANCE, hgl0.INSTANCE});
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final List<iit> m140137W() {
            return CollectionsKt.listOf((Object[]) new iit[]{l9e.INSTANCE, h9e.INSTANCE, bae.INSTANCE, zwm.INSTANCE, qtv.INSTANCE, nu6.INSTANCE});
        }

        /* JADX INFO: renamed from: X */
        public final void m140138X(String action, Object[] extraObjs) {
            if (extraObjs.length == 0) {
                return;
            }
            Object obj = extraObjs[0];
            if (obj instanceof AnchorStartData) {
                obj.getClass();
                AnchorStartData anchorStartData = (AnchorStartData) obj;
                fgt.m125529a(action, true, anchorStartData.traceId, anchorStartData.anchorSource, null, null);
            }
        }

        /* JADX INFO: renamed from: Y */
        public final void m140139Y(int type) {
            if (type == m140129O()) {
                qn0.INSTANCE.m140088i(false);
                hgl0.INSTANCE.m140088i(false);
            }
        }

        /* JADX INFO: renamed from: Z */
        public final int m140140Z() {
            int trickProgress = 0;
            for (iit iitVar : m140136V()) {
                trickProgress += iitVar.getFinish() ? iitVar.getTrickProgress() : 0;
            }
            return trickProgress;
        }

        /* JADX INFO: renamed from: a0 */
        public final void m140141a0(iit task) {
            nsh0.m164608j("live_sdk", "current_task_finish:" + task.getName());
        }

        @NotNull
        /* JADX INFO: renamed from: b0 */
        public final List<iit> m140142b0() {
            return CollectionsKt.listOf((Object[]) new iit[]{l9e.INSTANCE, h9e.INSTANCE, bae.INSTANCE, guf.INSTANCE, zwm.INSTANCE, qtv.INSTANCE, nu6.INSTANCE});
        }

        @NotNull
        /* JADX INFO: renamed from: c0 */
        public final List<iit> m140143c0() {
            return CollectionsKt.listOf((Object[]) new iit[]{bae.INSTANCE, zwm.INSTANCE, rtv.INSTANCE});
        }

        public Companion() {
        }
    }

    public iit(String str, int i, C22421c<iit> c22421c, boolean z) {
        this.name = str;
        this.trickProgress = i;
        this.obs = c22421c;
        this.finish = z;
    }

    public /* synthetic */ iit(String str, int i, C22421c c22421c, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, c22421c, z);
    }
}
