package p009l;

import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveBeautyFilterConfig;
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
import l.e30;
import l.eet;
import l.gkh0;
import l.tn0;
import l.uvr;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001e2\u00020\u0001:\u0001\fB5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0001\n\u001f !\"#$%&'(¨\u0006)"}, d2 = {"Ll/hgt;", "", "", "name", "", "trickProgress", "Lrx/c;", "obs", "", "finish", "<init>", "(Ljava/lang/String;ILrx/c;Z)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "I", "h", "()I", "c", "Lrx/c;", "getObs", "()Lrx/c;", "d", "Z", "f", "()Z", "i", "(Z)V", "Companion", "Ll/un0;", "Ll/kt6;", "Ll/s7e;", "Ll/y7e;", "Ll/p8e;", "Ll/ssf;", "Ll/yum;", "Ll/prv;", "Ll/qrv;", "Ll/d7l0;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class hgt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f14070e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f14071f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f14072g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f14073h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f14074i = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int trickProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final c<hgt> obs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean finish;

    public /* synthetic */ hgt(String str, int i, c cVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : cVar, (i2 & 8) != 0 ? false : z, null);
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
    public final void m15639i(boolean z) {
        this.finish = z;
    }

    /* JADX INFO: renamed from: l.hgt$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0014\u0010\u0011J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010%R\u001a\u0010-\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010%R\u001a\u0010/\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010%R\u001a\u00101\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010%R\u001a\u00103\u001a\u00020\u00168\u0006X\u0086D¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010%¨\u00065"}, d2 = {"Ll/hgt$a;", "", "<init>", "()V", "", "action", "", "extraObjs", "", "X", "(Ljava/lang/String;[Ljava/lang/Object;)V", "Ll/hgt;", "task", "a0", "(Ll/hgt;)V", "", "V", "()Ljava/util/List;", "W", "c0", "b0", "L", "", MiniWidgetProvider.KEY_TYPE, "T", "(I)Ljava/util/List;", "Lcom/p1/mobile/android/app/Act;", "act", "Lrx/c;", "Q", "(Lcom/p1/mobile/android/app/Act;Ll/hgt;[Ljava/lang/Object;)Lrx/c;", "K", "(Ll/hgt;)Ll/hgt;", "", "M", "(I)Z", "Z", "()I", "Y", "(I)V", "U", "(I)Ljava/lang/String;", "NormalAnchor", "I", "O", "Voice", "S", "NormalAudience", "P", "VideoChat", "R", "FFmpegSo", "N", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: A */
        public static void m15640A(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: B */
        public static hgt m15641B(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
            return hgt.INSTANCE.m15676K(y7e.INSTANCE);
        }

        /* JADX INFO: renamed from: C */
        public static hgt m15642C(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            return companion.m15676K(hgtVar);
        }

        /* JADX INFO: renamed from: D */
        public static void m15643D(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: E */
        public static Unit m15644E(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: F */
        public static void m15645F(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: G */
        public static Unit m15646G(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m15689X("anchor_mmcv_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: H */
        public static void m15647H(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: I */
        public static Unit m15648I(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: J */
        public static void m15649J(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: a */
        public static Unit m15650a(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m15689X("receive_verify_info", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: b */
        public static void m15651b(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: c */
        public static hgt m15652c(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: d */
        public static hgt m15653d(s7e s7eVar) {
            Companion companion = hgt.INSTANCE;
            s7eVar.getClass();
            return companion.m15676K(s7eVar);
        }

        /* JADX INFO: renamed from: e */
        public static hgt m15654e(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: f */
        public static void m15655f(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: g */
        public static Unit m15656g(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m15689X("anchor_so_res_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: h */
        public static hgt m15657h(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: i */
        public static void m15658i(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: j */
        public static Unit m15659j(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m15689X("receive_framerate_info", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static void m15660k(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: l */
        public static Unit m15661l(Object[] objArr, hgt hgtVar) {
            hgt.INSTANCE.m15689X("anchor_beauty_complete", objArr);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: m */
        public static hgt m15662m(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: n */
        public static Unit m15663n(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o */
        public static hgt m15664o(Function1 function1, Object obj) {
            return (hgt) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: p */
        public static Unit m15665p(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: q */
        public static void m15666q(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: r */
        public static Unit m15667r(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: s */
        public static void m15668s(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: t */
        public static hgt m15669t(BLiveBeautyFilterConfig bLiveBeautyFilterConfig) {
            return hgt.INSTANCE.m15676K(kt6.INSTANCE);
        }

        /* JADX INFO: renamed from: u */
        public static void m15670u(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: v */
        public static void m15671v(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: w */
        public static Unit m15672w(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: x */
        public static hgt m15673x(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            return companion.m15676K(hgtVar);
        }

        /* JADX INFO: renamed from: y */
        public static Unit m15674y(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: z */
        public static Unit m15675z(hgt hgtVar) {
            Companion companion = hgt.INSTANCE;
            hgtVar.getClass();
            companion.m15692a0(hgtVar);
            return Unit.INSTANCE;
        }

        @NotNull
        /* JADX INFO: renamed from: K */
        public final hgt m15676K(@NotNull hgt task) {
            task.getClass();
            task.m15639i(true);
            gkh0.j("live_sdk", "checkPassed:" + task.getName());
            return task;
        }

        @NotNull
        /* JADX INFO: renamed from: L */
        public final List<hgt> m15677L() {
            return CollectionsKt.listOf(ssf.INSTANCE);
        }

        /* JADX INFO: renamed from: M */
        public final boolean m15678M(int type) {
            List<hgt> listM15685T = m15685T(type);
            if ((listM15685T instanceof Collection) && listM15685T.isEmpty()) {
                return true;
            }
            Iterator<T> it = listM15685T.iterator();
            while (it.hasNext()) {
                if (!((hgt) it.next()).getFinish()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: N */
        public final int m15679N() {
            return hgt.f14074i;
        }

        /* JADX INFO: renamed from: O */
        public final int m15680O() {
            return hgt.f14070e;
        }

        /* JADX INFO: renamed from: P */
        public final int m15681P() {
            return hgt.f14072g;
        }

        @JvmOverloads
        @Nullable
        /* JADX INFO: renamed from: Q */
        public final c<hgt> m15682Q(@Nullable Act act, @NotNull hgt task, @NotNull final Object... extraObjs) {
            task.getClass();
            extraObjs.getClass();
            if (Intrinsics.d(task, qrv.INSTANCE)) {
                c<hgt> cVarM13369F = uvr.d().C1() ? djt.m13369F(false) : djt.m13369F(true);
                final Function1 function1 = new Function1() { // from class: l.xet
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15648I((hgt) obj);
                    }
                };
                return cVarM13369F.doOnNext(new e30() { // from class: l.zet
                    public final void call(Object obj) {
                        hgt.Companion.m15660k(function1, obj);
                    }
                });
            }
            if (Intrinsics.d(task, prv.INSTANCE)) {
                c<hgt> cVarM13369F2 = djt.m13369F(true);
                final Function1 function2 = new Function1() { // from class: l.lft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15667r((hgt) obj);
                    }
                };
                c cVarDoOnNext = cVarM13369F2.doOnNext(new e30() { // from class: l.sft
                    public final void call(Object obj) {
                        hgt.Companion.m15666q(function2, obj);
                    }
                });
                final Function1 function3 = new Function1() { // from class: l.uft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15656g(extraObjs, (hgt) obj);
                    }
                };
                return cVarDoOnNext.doOnNext(new e30() { // from class: l.vft
                    public final void call(Object obj) {
                        hgt.Companion.m15670u(function3, obj);
                    }
                });
            }
            if (Intrinsics.d(task, kt6.INSTANCE)) {
                c cVarS = ypv.f23198c.S();
                final Function1 function4 = new Function1() { // from class: l.wft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15669t((BLiveBeautyFilterConfig) obj);
                    }
                };
                c map = cVarS.map(new w9j() { // from class: l.xft
                    public final Object call(Object obj) {
                        return hgt.Companion.m15657h(function4, obj);
                    }
                });
                final Function1 function5 = new Function1() { // from class: l.yft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15675z((hgt) obj);
                    }
                };
                return map.doOnNext(new e30() { // from class: l.zft
                    public final void call(Object obj) {
                        hgt.Companion.m15658i(function5, obj);
                    }
                });
            }
            if (Intrinsics.d(task, s7e.INSTANCE)) {
                c<s7e> cVarM19561j = nzr.m19561j();
                final Function1 function6 = new Function1() { // from class: l.ift
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15653d((s7e) obj);
                    }
                };
                c map2 = cVarM19561j.map(new w9j() { // from class: l.tft
                    public final Object call(Object obj) {
                        return hgt.Companion.m15662m(function6, obj);
                    }
                });
                final Function1 function7 = new Function1() { // from class: l.agt
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15665p((hgt) obj);
                    }
                };
                c cVarDoOnNext2 = map2.doOnNext(new e30() { // from class: l.bgt
                    public final void call(Object obj) {
                        hgt.Companion.m15651b(function7, obj);
                    }
                });
                final Function1 function8 = new Function1() { // from class: l.cgt
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15646G(extraObjs, (hgt) obj);
                    }
                };
                return cVarDoOnNext2.doOnNext(new e30() { // from class: l.dgt
                    public final void call(Object obj) {
                        hgt.Companion.m15668s(function8, obj);
                    }
                });
            }
            if (Intrinsics.d(task, y7e.INSTANCE)) {
                c cVarS2 = ypv.f23198c.S();
                final Function1 function9 = new Function1() { // from class: l.egt
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15641B((BLiveBeautyFilterConfig) obj);
                    }
                };
                c map3 = cVarS2.map(new w9j() { // from class: l.fgt
                    public final Object call(Object obj) {
                        return hgt.Companion.m15664o(function9, obj);
                    }
                });
                final Function1 function10 = new Function1() { // from class: l.ggt
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15672w((hgt) obj);
                    }
                };
                c cVarDoOnNext3 = map3.doOnNext(new e30() { // from class: l.yet
                    public final void call(Object obj) {
                        hgt.Companion.m15649J(function10, obj);
                    }
                });
                final Function1 function11 = new Function1() { // from class: l.aft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15661l(extraObjs, (hgt) obj);
                    }
                };
                return cVarDoOnNext3.doOnNext(new e30() { // from class: l.bft
                    public final void call(Object obj) {
                        hgt.Companion.m15647H(function11, obj);
                    }
                });
            }
            if (Intrinsics.d(task, d7l0.INSTANCE)) {
                c cVarM = tn0.m();
                final Function1 function12 = new Function1() { // from class: l.cft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15673x((hgt) obj);
                    }
                };
                c map4 = cVarM.map(new w9j() { // from class: l.dft
                    public final Object call(Object obj) {
                        return hgt.Companion.m15654e(function12, obj);
                    }
                });
                final Function1 function13 = new Function1() { // from class: l.eft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15644E((hgt) obj);
                    }
                };
                c cVarDoOnNext4 = map4.doOnNext(new e30() { // from class: l.fft
                    public final void call(Object obj) {
                        hgt.Companion.m15645F(function13, obj);
                    }
                });
                final Function1 function14 = new Function1() { // from class: l.gft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15659j(extraObjs, (hgt) obj);
                    }
                };
                return cVarDoOnNext4.doOnNext(new e30() { // from class: l.hft
                    public final void call(Object obj) {
                        hgt.Companion.m15655f(function14, obj);
                    }
                });
            }
            if (!Intrinsics.d(task, un0.INSTANCE)) {
                if (!Intrinsics.d(task, ssf.INSTANCE)) {
                    return null;
                }
                c<hgt> cVarM13365B = djt.m13365B();
                final Function1 function15 = new Function1() { // from class: l.qft
                    public final Object invoke(Object obj) {
                        return hgt.Companion.m15674y((hgt) obj);
                    }
                };
                return cVarM13365B.doOnNext(new e30() { // from class: l.rft
                    public final void call(Object obj) {
                        hgt.Companion.m15671v(function15, obj);
                    }
                });
            }
            c cVarL = tn0.l(act);
            final Function1 function16 = new Function1() { // from class: l.jft
                public final Object invoke(Object obj) {
                    return hgt.Companion.m15642C((hgt) obj);
                }
            };
            c map5 = cVarL.map(new w9j() { // from class: l.kft
                public final Object call(Object obj) {
                    return hgt.Companion.m15652c(function16, obj);
                }
            });
            final Function1 function17 = new Function1() { // from class: l.mft
                public final Object invoke(Object obj) {
                    return hgt.Companion.m15663n((hgt) obj);
                }
            };
            c cVarDoOnNext5 = map5.doOnNext(new e30() { // from class: l.nft
                public final void call(Object obj) {
                    hgt.Companion.m15640A(function17, obj);
                }
            });
            final Function1 function18 = new Function1() { // from class: l.oft
                public final Object invoke(Object obj) {
                    return hgt.Companion.m15650a(extraObjs, (hgt) obj);
                }
            };
            return cVarDoOnNext5.doOnNext(new e30() { // from class: l.pft
                public final void call(Object obj) {
                    hgt.Companion.m15643D(function18, obj);
                }
            });
        }

        /* JADX INFO: renamed from: R */
        public final int m15683R() {
            return hgt.f14073h;
        }

        /* JADX INFO: renamed from: S */
        public final int m15684S() {
            return hgt.f14071f;
        }

        @NotNull
        /* JADX INFO: renamed from: T */
        public final List<hgt> m15685T(int type) {
            if (type == m15680O()) {
                return m15687V();
            }
            if (type == m15684S()) {
                return m15694c0();
            }
            if (type == m15683R()) {
                return m15693b0();
            }
            return type == m15679N() ? m15677L() : m15688W();
        }

        @NotNull
        /* JADX INFO: renamed from: U */
        public final String m15686U(int type) {
            try {
                StringBuilder sb = new StringBuilder();
                for (hgt hgtVar : m15685T(type)) {
                    sb.append(hgtVar.getName());
                    sb.append("-");
                    sb.append(hgtVar.getFinish());
                    sb.append(",");
                }
                return sb.toString();
            } catch (Exception e) {
                String message = e.getMessage();
                return message == null ? "error" : message;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: V */
        public final List<hgt> m15687V() {
            return CollectionsKt.listOf(new hgt[]{y7e.INSTANCE, s7e.INSTANCE, p8e.INSTANCE, yum.INSTANCE, prv.INSTANCE, ssf.INSTANCE, kt6.INSTANCE, d7l0.INSTANCE});
        }

        @NotNull
        /* JADX INFO: renamed from: W */
        public final List<hgt> m15688W() {
            return CollectionsKt.listOf(new hgt[]{y7e.INSTANCE, s7e.INSTANCE, p8e.INSTANCE, yum.INSTANCE, prv.INSTANCE, kt6.INSTANCE});
        }

        /* JADX INFO: renamed from: X */
        public final void m15689X(String action, Object[] extraObjs) {
            if (extraObjs.length == 0) {
                return;
            }
            Object obj = extraObjs[0];
            if (obj instanceof AnchorStartData) {
                obj.getClass();
                AnchorStartData anchorStartData = (AnchorStartData) obj;
                eet.a(action, true, anchorStartData.traceId, anchorStartData.anchorSource, (BLiveAbsData) null, (e30) null);
            }
        }

        /* JADX INFO: renamed from: Y */
        public final void m15690Y(int type) {
            if (type == m15680O()) {
                un0.INSTANCE.m15639i(false);
                d7l0.INSTANCE.m15639i(false);
            }
        }

        /* JADX INFO: renamed from: Z */
        public final int m15691Z() {
            int trickProgress = 0;
            for (hgt hgtVar : m15687V()) {
                trickProgress += hgtVar.getFinish() ? hgtVar.getTrickProgress() : 0;
            }
            return trickProgress;
        }

        /* JADX INFO: renamed from: a0 */
        public final void m15692a0(hgt task) {
            gkh0.j("live_sdk", "current_task_finish:" + task.getName());
        }

        @NotNull
        /* JADX INFO: renamed from: b0 */
        public final List<hgt> m15693b0() {
            return CollectionsKt.listOf(new hgt[]{y7e.INSTANCE, s7e.INSTANCE, p8e.INSTANCE, ssf.INSTANCE, yum.INSTANCE, prv.INSTANCE, kt6.INSTANCE});
        }

        @NotNull
        /* JADX INFO: renamed from: c0 */
        public final List<hgt> m15694c0() {
            return CollectionsKt.listOf(new hgt[]{p8e.INSTANCE, yum.INSTANCE, qrv.INSTANCE});
        }

        public Companion() {
        }
    }

    public hgt(String str, int i, c<hgt> cVar, boolean z) {
        this.name = str;
        this.trickProgress = i;
        this.obs = cVar;
        this.finish = z;
    }

    public /* synthetic */ hgt(String str, int i, c cVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, cVar, z);
    }
}
