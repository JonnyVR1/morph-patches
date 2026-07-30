package p153l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ]\u0010\u001a\u001a\u00020\f2)\b\u0002\u0010\u0016\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f0\u00102#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\u001c¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m88121d2 = {"Ll/pg10;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView;", "Ll/dum;", "Ll/mu40;", BaseSei.INFO, "inviteView", "", "tabType", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView;I)V", "", "e4", "()V", Constants.KEY_T, "Lkotlin/Function1;", "", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "data", "success", "", "throwable", NotificationCompat.CATEGORY_ERROR, "f4", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lrx/c;", "Ll/ff10;", "b4", "()Lrx/c;", "a4", "d4", "", "type", "Y3", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "call", "Z3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;Ljava/lang/String;)Ll/ff10;", "h4", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "I", "c4", "()I", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class pg10 extends i6t<oo2, MultiCallInviteView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int tabType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg10(@NotNull dum<mu40> dumVar, @NotNull MultiCallInviteView multiCallInviteView, int i) {
        super(dumVar);
        dumVar.getClass();
        multiCallInviteView.getClass();
        this.tabType = i;
        mo52715C(multiCallInviteView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m172177J3(BLiveMultiCallInvite bLiveMultiCallInvite, pg10 pg10Var, List list) {
        int i = R$string.f48475x8;
        String str = bLiveMultiCallInvite.toUserName;
        str.getClass();
        o1j0.m165651y(xau.m209911u(i, bf10.m103846x(str, 0, 2, null)));
        pg10Var.m172191e4();
    }

    /* JADX INFO: renamed from: K3 */
    public static Unit m172178K3(Throwable th) {
        th.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static List m172179L3(pg10 pg10Var, List list) {
        list.getClass();
        String str = cd10.f81052D;
        str.getClass();
        return pg10Var.m172193Y3(list, str);
    }

    /* JADX INFO: renamed from: M3 */
    public static List m172180M3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    public static Unit m172181N3(List list) {
        list.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m172182O3(c8t c8tVar) {
        return Boolean.valueOf(!Intrinsics.m88377d(c8tVar.m108382c(), cd10.f81098z));
    }

    /* JADX INFO: renamed from: P3 */
    public static void m172183P3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: R3 */
    public static List m172184R3(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m172185S3(pg10 pg10Var, BLiveMultiCallInvite bLiveMultiCallInvite, String str, ff10 ff10Var) {
        pg10Var.m172200h4(bLiveMultiCallInvite, str);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m172186T3(Function1 function1, pg10 pg10Var, List list) {
        list.getClass();
        function1.invoke(list);
        pg10Var.m213811F2().MultiCallEvent.inviteList().mo199274m(list);
    }

    /* JADX INFO: renamed from: U3 */
    public static List m172187U3(pg10 pg10Var, List list) {
        list.getClass();
        String str = cd10.f81051C;
        str.getClass();
        return pg10Var.m172193Y3(list, str);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m172188V3(Function1 function1, Throwable th) {
        th.getClass();
        function1.invoke(th);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m172189W3(pg10 pg10Var, c8t c8tVar) {
        pg10Var.m172191e4();
    }

    /* JADX INFO: renamed from: X3 */
    public static Boolean m172190X3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    private final void m172191e4() {
        ((MultiCallInviteView) this.viewModel).m76919o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public static /* synthetic */ void m172192g4(pg10 pg10Var, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: l.bg10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return pg10.m172181N3((List) obj2);
                }
            };
        }
        if ((i & 2) != 0) {
            function2 = new Function1() { // from class: l.gg10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return pg10.m172178K3((Throwable) obj2);
                }
            };
        }
        pg10Var.m172199f4(function1, function2);
    }

    /* JADX INFO: renamed from: Y3 */
    public final List<ff10> m172193Y3(List<? extends BLiveMultiCallInvite> data, String type) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(m172194Z3((BLiveMultiCallInvite) it.next(), type));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z3 */
    public final ff10 m172194Z3(final BLiveMultiCallInvite call, final String type) {
        return new ff10(call, false, type, "邀请").m125348Q(new y20() { // from class: l.og10
            @Override // p153l.y20
            public final void call(Object obj) {
                pg10.m172185S3(this.f147179a, call, type, (ff10) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final C22421c<List<ff10>> m172195a4() {
        C22421c<T> c22421cDuringCreated = duringCreated(m213811F2().MultiCallEvent.inviteList().m199270g());
        final Function1 function1 = new Function1() { // from class: l.kg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pg10.m172187U3(this.f126539a, (List) obj);
            }
        };
        C22421c<List<ff10>> map = c22421cDuringCreated.map(new qcj() { // from class: l.lg10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pg10.m172180M3(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final C22421c<List<ff10>> m172196b4() {
        C22421c<List<BLiveMultiCallInvite>> c22421cM72808y4 = LivingNormalApiProvider.m72808y4();
        final Function1 function1 = new Function1() { // from class: l.eg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pg10.m172179L3(this.f93891a, (List) obj);
            }
        };
        C22421c c22421cDuringCreated = duringCreated((C22421c) c22421cM72808y4.map(new qcj() { // from class: l.fg10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pg10.m172184R3(function1, obj);
            }
        }));
        c22421cDuringCreated.getClass();
        return c22421cDuringCreated;
    }

    /* JADX INFO: renamed from: c4, reason: from getter */
    public final int getTabType() {
        return this.tabType;
    }

    /* JADX INFO: renamed from: d4 */
    public final void m172198d4() {
        m213811F2().MultiCallEvent.changeTab().mo199273j(1);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m172199f4(@NotNull final Function1<? super List<? extends BLiveMultiCallInvite>, Unit> success, @NotNull final Function1<? super Throwable, Unit> err) {
        success.getClass();
        err.getClass();
        duringCreated(LivingNormalApiProvider.m72781v4()).subscribe(dhw.m115826e(new y20() { // from class: l.mg10
            @Override // p153l.y20
            public final void call(Object obj) {
                pg10.m172186T3(success, this, (List) obj);
            }
        }, new y20() { // from class: l.ng10
            @Override // p153l.y20
            public final void call(Object obj) {
                pg10.m172188V3(err, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m172200h4(final BLiveMultiCallInvite call, String type) {
        duringCreated(LivingNormalApiProvider.m72361A7(CollectionsKt.listOf(call.toUserId), bf10.m103795A(this), type, cd10.f81093u)).subscribe(dhw.m115826e(new y20() { // from class: l.cg10
            @Override // p153l.y20
            public final void call(Object obj) {
                pg10.m172177J3(call, this, (List) obj);
            }
        }, new y20() { // from class: l.dg10
            @Override // p153l.y20
            public final void call(Object obj) {
                pg10.m172183P3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m168545q1().m98248Q());
        final Function1 function1 = new Function1() { // from class: l.hg10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pg10.m172182O3((c8t) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.ig10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pg10.m172190X3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.jg10
            @Override // p153l.y20
            public final void call(Object obj) {
                pg10.m172189W3(this.f120666a, (c8t) obj);
            }
        }));
    }
}
