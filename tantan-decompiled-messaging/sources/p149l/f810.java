package p149l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ]\u0010\u001a\u001a\u00020\f2)\b\u0002\u0010\u0016\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f0\u00102#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\u001c¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m87232d2 = {"Ll/f810;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView;", "Ll/bsm;", "Ll/yl40;", BaseSei.INFO, "inviteView", "", "tabType", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView;I)V", "", "e4", "()V", Constants.KEY_T, "Lkotlin/Function1;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "data", "success", "", "throwable", NotificationCompat.CATEGORY_ERROR, "f4", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lrx/c;", "Ll/v610;", "b4", "()Lrx/c;", "a4", "d4", "", "type", "Y3", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "call", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;Ljava/lang/String;)Ll/v610;", "h4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "I", "c4", "()I", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class f810 extends h4t<ho2, MultiCallInviteView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int tabType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f810(@NotNull bsm<yl40> bsmVar, @NotNull MultiCallInviteView multiCallInviteView, int i) {
        super(bsmVar);
        bsmVar.getClass();
        multiCallInviteView.getClass();
        this.tabType = i;
        mo51532C(multiCallInviteView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m119845J3(BLiveMultiCallInvite bLiveMultiCallInvite, f810 f810Var, List list) {
        int i = R$string.f47627x8;
        String str = bLiveMultiCallInvite.toUserName;
        str.getClass();
        lsi0.m151595y(w8u.m202218u(i, r610.m178017x(str, 0, 2, null)));
        f810Var.m119859e4();
    }

    /* JADX INFO: renamed from: K3 */
    public static Unit m119846K3(Throwable th) {
        th.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static List m119847L3(f810 f810Var, List list) {
        list.getClass();
        String str = s410.f162214D;
        str.getClass();
        return f810Var.m119861Y3(list, str);
    }

    /* JADX INFO: renamed from: M3 */
    public static List m119848M3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static Unit m119849N3(List list) {
        list.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m119850O3(b6t b6tVar) {
        return Boolean.valueOf(!Intrinsics.m87488d(b6tVar.m100475c(), s410.f162260z));
    }

    /* JADX INFO: renamed from: P3 */
    public static void m119851P3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m119852R3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m119853S3(f810 f810Var, BLiveMultiCallInvite bLiveMultiCallInvite, String str, v610 v610Var) {
        f810Var.m119868h4(bLiveMultiCallInvite, str);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m119854T3(Function1 function1, f810 f810Var, List list) {
        list.getClass();
        function1.invoke(list);
        f810Var.m206028F2().MultiCallEvent.inviteList().mo172464m(list);
    }

    /* JADX INFO: renamed from: U3 */
    public static List m119855U3(f810 f810Var, List list) {
        list.getClass();
        String str = s410.f162213C;
        str.getClass();
        return f810Var.m119861Y3(list, str);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m119856V3(Function1 function1, Throwable th) {
        th.getClass();
        function1.invoke(th);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m119857W3(f810 f810Var, b6t b6tVar) {
        f810Var.m119859e4();
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m119858X3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    private final void m119859e4() {
        ((MultiCallInviteView) this.viewModel).m75736o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m119860g4(f810 f810Var, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: l.r710
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return f810.m119849N3((List) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: l.w710
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return f810.m119846K3((Throwable) obj2);
                }
            };
        }
        f810Var.m119867f4(function1, function2);
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<v610> m119861Y3(List<? extends BLiveMultiCallInvite> data, String type) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(m119862Z3((BLiveMultiCallInvite) it.next(), type));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public final v610 m119862Z3(final BLiveMultiCallInvite call, final String type) {
        return new v610(call, false, type, "邀请").m197194Q(new e30() { // from class: l.e810
            @Override // p149l.e30
            public final void call(Object obj) {
                f810.m119853S3(this.f89783a, call, type, (v610) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final C22306c<List<v610>> m119863a4() {
        C22306c<T> c22306cDuringCreated = duringCreated(m206028F2().MultiCallEvent.inviteList().m172460g());
        final Function1 function1 = new Function1() { // from class: l.a810
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f810.m119855U3(this.f67995a, (List) obj);
            }
        };
        C22306c<List<v610>> map = c22306cDuringCreated.map(new w9j() { // from class: l.b810
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f810.m119848M3(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final C22306c<List<v610>> m119864b4() {
        C22306c<List<BLiveMultiCallInvite>> c22306cM71625y4 = LivingNormalApiProvider.m71625y4();
        final Function1 function1 = new Function1() { // from class: l.u710
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f810.m119847L3(this.f174914a, (List) obj);
            }
        };
        C22306c c22306cDuringCreated = duringCreated((C22306c) c22306cM71625y4.map(new w9j() { // from class: l.v710
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f810.m119852R3(function1, obj);
            }
        }));
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    /* JADX INFO: renamed from: c4, reason: from getter */
    public final int getTabType() {
        return this.tabType;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m119866d4() {
        m206028F2().MultiCallEvent.changeTab().mo172463j(1);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m119867f4(@NotNull final Function1<? super List<? extends BLiveMultiCallInvite>, Unit> success, @NotNull final Function1<? super Throwable, Unit> err) {
        success.getClass();
        err.getClass();
        duringCreated(LivingNormalApiProvider.m71598v4()).subscribe(ffw.m121194e(new e30() { // from class: l.c810
            @Override // p149l.e30
            public final void call(Object obj) {
                f810.m119854T3(success, this, (List) obj);
            }
        }, new e30() { // from class: l.d810
            @Override // p149l.e30
            public final void call(Object obj) {
                f810.m119856V3(err, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m119868h4(final BLiveMultiCallInvite call, String type) {
        duringCreated(LivingNormalApiProvider.m71178A7(CollectionsKt.listOf(call.toUserId), r610.m177966A(this), type, s410.f162255u)).subscribe(ffw.m121194e(new e30() { // from class: l.s710
            @Override // p149l.e30
            public final void call(Object obj) {
                f810.m119845J3(call, this, (List) obj);
            }
        }, new e30() { // from class: l.t710
            @Override // p149l.e30
            public final void call(Object obj) {
                f810.m119851P3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m132160q1().m189066Q());
        final Function1 function1 = new Function1() { // from class: l.x710
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f810.m119850O3((b6t) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.y710
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return f810.m119858X3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.z710
            @Override // p149l.e30
            public final void call(Object obj) {
                f810.m119857W3(this.f201983a, (b6t) obj);
            }
        }));
    }
}
