package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0001\n\u001f !\"#$%&'(¨\u0006)"}, m87232d2 = {"Ll/hgt;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "trickProgress", "Lrx/c;", "obs", "", "finish", "<init>", "(Ljava/lang/String;ILrx/c;Z)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "Lrx/c;", "getObs", "()Lrx/c;", Constants.INAPP_DATA_TAG, "Z", "f", "()Z", RXScreenCaptureService.KEY_INDEX, "(Z)V", "Companion", "Ll/un0;", "Ll/kt6;", "Ll/s7e;", "Ll/y7e;", "Ll/p8e;", "Ll/ssf;", "Ll/yum;", "Ll/prv;", "Ll/qrv;", "Ll/d7l0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class hgt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f107653e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f107654f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f107655g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f107656h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f107657i = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int trickProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final C22306c<hgt> obs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean finish;

    public /* synthetic */ hgt(String str, int i, C22306c c22306c, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : c22306c, (i2 & 8) != 0 ? false : z, null);
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
    public final void m130867i(boolean z) {
        this.finish = z;
    }

    /* JADX INFO: renamed from: l.hgt$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010%R\u001a\u0010-\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010%R\u001a\u0010/\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010%R\u001a\u00101\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010%R\u001a\u00103\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010%¨\u00065"}, m87232d2 = {"Ll/hgt$a;", "", "<init>", "()V", "", "action", "", "extraObjs", "", "X", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Ll/hgt;", "task", "a0", "(Ll/hgt;)V", "", j6f.GPS_MEASUREMENT_INTERRUPTED, "()Ljava/util/List;", "W", "c0", "b0", "L", "", "type", j6f.GPS_DIRECTION_TRUE, "(I)Ljava/util/List;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lrx/c;", "Q", "(Lcom/p1/mobile/android/app/Act;Ll/hgt;[Ljava/lang/Object;)Lrx/c;", "K", "(Ll/hgt;)Ll/hgt;", "", "M", "(I)Z", "Z", "()I", "Y", "(I)V", "U", "(I)Ljava/lang/String;", "NormalAnchor", "I", BloodType.f38728O, "Voice", j6f.LATITUDE_SOUTH, "NormalAudience", "P", "VideoChat", "R", "FFmpegSo", "N", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public static void m130868A(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: B */
        public static hgt m130869B(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
            return hgt.INSTANCE.m130904K(y7e.INSTANCE);
        }

        /* JADX INFO: renamed from: C */
        public static hgt m130870C(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            return companion.m130904K(hgtVar);
        }

        /* JADX INFO: renamed from: D */
        public static void m130871D(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: E */
        public static Unit m130872E(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: F */
        public static void m130873F(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: G */
        public static Unit m130874G(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m130917X("anchor_mmcv_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: H */
        public static void m130875H(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: I */
        public static Unit m130876I(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: J */
        public static void m130877J(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: a */
        public static Unit m130878a(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m130917X("receive_verify_info", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m130879b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: c */
        public static hgt m130880c(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static hgt m130881d(s7e s7eVar) {
            Companion companion = hgt.INSTANCE;
            s7eVar.getClass();
            return companion.m130904K(s7eVar);
        }

        /* JADX INFO: renamed from: e */
        public static hgt m130882e(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: f */
        public static void m130883f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: g */
        public static Unit m130884g(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m130917X("anchor_so_res_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        public static hgt m130885h(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: i */
        public static void m130886i(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: j */
        public static Unit m130887j(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m130917X("receive_framerate_info", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static void m130888k(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: l */
        public static Unit m130889l(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m130917X("anchor_beauty_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: m */
        public static hgt m130890m(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: n */
        public static Unit m130891n(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o */
        public static hgt m130892o(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: p */
        public static Unit m130893p(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static void m130894q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: r */
        public static Unit m130895r(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static void m130896s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: t */
        public static hgt m130897t(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
            return hgt.INSTANCE.m130904K(kt6.INSTANCE);
        }

        /* JADX INFO: renamed from: u */
        public static void m130898u(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: v */
        public static void m130899v(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: w */
        public static Unit m130900w(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: x */
        public static hgt m130901x(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            return companion.m130904K(hgtVar);
        }

        /* JADX INFO: renamed from: y */
        public static Unit m130902y(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: z */
        public static Unit m130903z(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m130920a0(hgtVar);
            return Unit.INSTANCE;
        }

        @NotNull
        /* JADX INFO: renamed from: K */
        public final hgt m130904K(@NotNull hgt task) {
            task.getClass();
            task.m130867i(true);
            gkh0.m126627j("live_sdk", "checkPassed:" + task.getName());
            return task;
        }

        @NotNull
        /* JADX INFO: renamed from: L */
        public final List<hgt> m130905L() {
            return CollectionsKt.listOf(ssf.INSTANCE);
        }

        /* JADX INFO: renamed from: M */
        public final boolean m130906M(int type) {
            List<hgt> listM130913T = m130913T(type);
            if ((listM130913T instanceof Collection) && listM130913T.isEmpty()) {
                return true;
            }
            Iterator<T> it = listM130913T.iterator();
            while (it.hasNext()) {
                if (!((hgt) it.next()).getFinish()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: N */
        public final int m130907N() {
            return hgt.f107657i;
        }

        /* JADX INFO: renamed from: O */
        public final int m130908O() {
            return hgt.f107653e;
        }

        /* JADX INFO: renamed from: P */
        public final int m130909P() {
            return hgt.f107655g;
        }

        @JvmOverloads
        @Nullable
        /* JADX INFO: renamed from: Q */
        public final C22306c<hgt> m130910Q(@Nullable Act act, @NotNull hgt task, @NotNull final Object... extraObjs) {
            task.getClass();
            extraObjs.getClass();
            if (Intrinsics.m87488d(task, qrv.INSTANCE)) {
                C22306c<hgt> c22306cM112117F = uvr.m196087d().m162662C1() ? djt.m112117F(false) : djt.m112117F(true);
                final Function1 function1 = new Function1() { // from class: l.xet
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130876I((hgt) obj);
                    }
                };
                return c22306cM112117F.doOnNext(new e30() { // from class: l.zet
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130888k(function1, obj);
                    }
                });
            }
            if (Intrinsics.m87488d(task, prv.INSTANCE)) {
                C22306c<hgt> c22306cM112117F2 = djt.m112117F(true);
                final Function1 function2 = new Function1() { // from class: l.lft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130895r((hgt) obj);
                    }
                };
                C22306c<hgt> c22306cDoOnNext = c22306cM112117F2.doOnNext(new e30() { // from class: l.sft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130894q(function2, obj);
                    }
                });
                final Function1 function3 = new Function1() { // from class: l.uft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130884g(extraObjs, (hgt) obj);
                    }
                };
                return c22306cDoOnNext.doOnNext(new e30() { // from class: l.vft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130898u(function3, obj);
                    }
                });
            }
            if (Intrinsics.m87488d(task, kt6.INSTANCE)) {
                C22306c<BLiveBeautyFilterConfig> c22306cM186354S = ypv.f199495c.m186354S();
                final Function1 function4 = new Function1() { // from class: l.wft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130897t((BLiveBeautyFilterConfig) obj);
                    }
                };
                C22306c<R> map = c22306cM186354S.map(new w9j() { // from class: l.xft
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return hgt.Companion.m130885h(function4, obj);
                    }
                });
                final Function1 function5 = new Function1() { // from class: l.yft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130903z((hgt) obj);
                    }
                };
                return map.doOnNext(new e30() { // from class: l.zft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130886i(function5, obj);
                    }
                });
            }
            if (Intrinsics.m87488d(task, s7e.INSTANCE)) {
                C22306c<s7e> c22306cM162093j = nzr.m162093j();
                final Function1 function6 = new Function1() { // from class: l.ift
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130881d((s7e) obj);
                    }
                };
                C22306c<R> map2 = c22306cM162093j.map(new w9j() { // from class: l.tft
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return hgt.Companion.m130890m(function6, obj);
                    }
                });
                final Function1 function7 = new Function1() { // from class: l.agt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130893p((hgt) obj);
                    }
                };
                C22306c c22306cDoOnNext2 = map2.doOnNext(new e30() { // from class: l.bgt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130879b(function7, obj);
                    }
                });
                final Function1 function8 = new Function1() { // from class: l.cgt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130874G(extraObjs, (hgt) obj);
                    }
                };
                return c22306cDoOnNext2.doOnNext(new e30() { // from class: l.dgt
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130896s(function8, obj);
                    }
                });
            }
            if (Intrinsics.m87488d(task, y7e.INSTANCE)) {
                C22306c<BLiveBeautyFilterConfig> c22306cM186354S2 = ypv.f199495c.m186354S();
                final Function1 function9 = new Function1() { // from class: l.egt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130869B((BLiveBeautyFilterConfig) obj);
                    }
                };
                C22306c<R> map3 = c22306cM186354S2.map(new w9j() { // from class: l.fgt
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return hgt.Companion.m130892o(function9, obj);
                    }
                });
                final Function1 function10 = new Function1() { // from class: l.ggt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130900w((hgt) obj);
                    }
                };
                C22306c c22306cDoOnNext3 = map3.doOnNext(new e30() { // from class: l.yet
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130877J(function10, obj);
                    }
                });
                final Function1 function11 = new Function1() { // from class: l.aft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130889l(extraObjs, (hgt) obj);
                    }
                };
                return c22306cDoOnNext3.doOnNext(new e30() { // from class: l.bft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130875H(function11, obj);
                    }
                });
            }
            if (Intrinsics.m87488d(task, d7l0.INSTANCE)) {
                C22306c<hgt> c22306cM189745m = tn0.m189745m();
                final Function1 function12 = new Function1() { // from class: l.cft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130901x((hgt) obj);
                    }
                };
                C22306c<R> map4 = c22306cM189745m.map(new w9j() { // from class: l.dft
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return hgt.Companion.m130882e(function12, obj);
                    }
                });
                final Function1 function13 = new Function1() { // from class: l.eft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130872E((hgt) obj);
                    }
                };
                C22306c c22306cDoOnNext4 = map4.doOnNext(new e30() { // from class: l.fft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130873F(function13, obj);
                    }
                });
                final Function1 function14 = new Function1() { // from class: l.gft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130887j(extraObjs, (hgt) obj);
                    }
                };
                return c22306cDoOnNext4.doOnNext(new e30() { // from class: l.hft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130883f(function14, obj);
                    }
                });
            }
            if (!Intrinsics.m87488d(task, un0.INSTANCE)) {
                if (!Intrinsics.m87488d(task, ssf.INSTANCE)) {
                    return null;
                }
                C22306c<hgt> c22306cM112113B = djt.m112113B();
                final Function1 function15 = new Function1() { // from class: l.qft
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m130902y((hgt) obj);
                    }
                };
                return c22306cM112113B.doOnNext(new e30() { // from class: l.rft
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hgt.Companion.m130899v(function15, obj);
                    }
                });
            }
            C22306c<hgt> c22306cM189744l = tn0.m189744l(act);
            final Function1 function16 = new Function1() { // from class: l.jft
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hgt.Companion.m130870C((hgt) obj);
                }
            };
            C22306c<R> map5 = c22306cM189744l.map(new w9j() { // from class: l.kft
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return hgt.Companion.m130880c(function16, obj);
                }
            });
            final Function1 function17 = new Function1() { // from class: l.mft
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hgt.Companion.m130891n((hgt) obj);
                }
            };
            C22306c c22306cDoOnNext5 = map5.doOnNext(new e30() { // from class: l.nft
                @Override // p149l.e30
                public final void call(Object obj) {
                    hgt.Companion.m130868A(function17, obj);
                }
            });
            final Function1 function18 = new Function1() { // from class: l.oft
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return hgt.Companion.m130878a(extraObjs, (hgt) obj);
                }
            };
            return c22306cDoOnNext5.doOnNext(new e30() { // from class: l.pft
                @Override // p149l.e30
                public final void call(Object obj) {
                    hgt.Companion.m130871D(function18, obj);
                }
            });
        }

        /* JADX INFO: renamed from: R */
        public final int m130911R() {
            return hgt.f107656h;
        }

        /* JADX INFO: renamed from: S */
        public final int m130912S() {
            return hgt.f107654f;
        }

        @NotNull
        /* JADX INFO: renamed from: T */
        public final List<hgt> m130913T(int type) {
            if (type == m130908O()) {
                return m130915V();
            }
            if (type == m130912S()) {
                return m130922c0();
            }
            if (type == m130911R()) {
                return m130921b0();
            }
            return type == m130907N() ? m130905L() : m130916W();
        }

        @NotNull
        /* JADX INFO: renamed from: U */
        public final String m130914U(int type) {
            try {
                StringBuilder sb = new StringBuilder();
                for (hgt hgtVar : m130913T(type)) {
                    sb.append(hgtVar.getName());
                    sb.append("-");
                    sb.append(hgtVar.getFinish());
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
        public final List<hgt> m130915V() {
            return CollectionsKt.listOf((Object[]) new hgt[]{y7e.INSTANCE, s7e.INSTANCE, p8e.INSTANCE, yum.INSTANCE, prv.INSTANCE, ssf.INSTANCE, kt6.INSTANCE, d7l0.INSTANCE});
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final List<hgt> m130916W() {
            return CollectionsKt.listOf((Object[]) new hgt[]{y7e.INSTANCE, s7e.INSTANCE, p8e.INSTANCE, yum.INSTANCE, prv.INSTANCE, kt6.INSTANCE});
        }

        /* JADX INFO: renamed from: X */
        public final void m130917X(String action, Object[] extraObjs) {
            if (extraObjs.length == 0) {
                return;
            }
            Object obj = extraObjs[0];
            if (obj instanceof AnchorStartData) {
                obj.getClass();
                AnchorStartData anchorStartData = (AnchorStartData) obj;
                eet.m116002a(action, true, anchorStartData.traceId, anchorStartData.anchorSource, null, null);
            }
        }

        /* JADX INFO: renamed from: Y */
        public final void m130918Y(int type) {
            if (type == m130908O()) {
                un0.INSTANCE.m130867i(false);
                d7l0.INSTANCE.m130867i(false);
            }
        }

        /* JADX INFO: renamed from: Z */
        public final int m130919Z() {
            int trickProgress = 0;
            for (hgt hgtVar : m130915V()) {
                trickProgress += hgtVar.getFinish() ? hgtVar.getTrickProgress() : 0;
            }
            return trickProgress;
        }

        /* JADX INFO: renamed from: a0 */
        public final void m130920a0(hgt task) {
            gkh0.m126627j("live_sdk", "current_task_finish:" + task.getName());
        }

        @NotNull
        /* JADX INFO: renamed from: b0 */
        public final List<hgt> m130921b0() {
            return CollectionsKt.listOf((Object[]) new hgt[]{y7e.INSTANCE, s7e.INSTANCE, p8e.INSTANCE, ssf.INSTANCE, yum.INSTANCE, prv.INSTANCE, kt6.INSTANCE});
        }

        @NotNull
        /* JADX INFO: renamed from: c0 */
        public final List<hgt> m130922c0() {
            return CollectionsKt.listOf((Object[]) new hgt[]{p8e.INSTANCE, yum.INSTANCE, qrv.INSTANCE});
        }

        public Companion() {
        }
    }

    public hgt(String str, int i, C22306c<hgt> c22306c, boolean z) {
        this.name = str;
        this.trickProgress = i;
        this.obs = c22306c;
        this.finish = z;
    }

    public /* synthetic */ hgt(String str, int i, C22306c c22306c, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, c22306c, z);
    }
}
