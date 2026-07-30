package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/k210;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallApplyView;", "Ll/bsm;", "Ll/yl40;", BaseSei.INFO, "inviteView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallApplyView;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "data", "Ll/i110;", "T3", "(Ljava/util/List;)Ljava/util/List;", "", Constants.KEY_T, "()V", "V3", "call", "U3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/i110;", "model", "S3", "(Ll/i110;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class k210 extends h4t<ho2, MultiCallApplyView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k210(@NotNull bsm<yl40> bsmVar, @NotNull MultiCallApplyView multiCallApplyView) {
        super(bsmVar);
        bsmVar.getClass();
        multiCallApplyView.getClass();
        mo51532C(multiCallApplyView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m144244J3(k210 k210Var, Throwable th) {
        ((MultiCallApplyView) k210Var.viewModel).m75698r0(false);
    }

    /* JADX INFO: renamed from: K3 */
    public static Unit m144245K3(k210 k210Var, i110 i110Var) {
        i110Var.getClass();
        k210Var.m144253S3(i110Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static void m144246L3(k210 k210Var, BLiveMultiCall bLiveMultiCall) {
        k210Var.m206028F2().MultiCallEvent.addWatchList().mo172463j(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m144247M3(k210 k210Var, i110 i110Var, Throwable th) {
        MultiCallApplyView multiCallApplyView = (MultiCallApplyView) k210Var.viewModel;
        String str = i110Var.getApplyData().f44400id;
        str.getClass();
        multiCallApplyView.m75695n0(str);
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m144248N3(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m144249O3(k210 k210Var, BLiveMultiCall bLiveMultiCall) {
        if (vg10.m198312d(bLiveMultiCall)) {
            MultiCallApplyView multiCallApplyView = (MultiCallApplyView) k210Var.viewModel;
            String str = bLiveMultiCall.f44400id;
            str.getClass();
            multiCallApplyView.m75696o0(str);
            return;
        }
        MultiCallApplyView multiCallApplyView2 = (MultiCallApplyView) k210Var.viewModel;
        String str2 = bLiveMultiCall.f44400id;
        str2.getClass();
        multiCallApplyView2.m75695n0(str2);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m144250P3(k210 k210Var, List list) {
        MultiCallApplyView multiCallApplyView = (MultiCallApplyView) k210Var.viewModel;
        list.getClass();
        multiCallApplyView.m75697p0(k210Var.m144252T3(list));
    }

    /* JADX INFO: renamed from: R3 */
    public static void m144251R3(k210 k210Var, List list) {
        q2f.C19397d<List, C22306c<List>> c19397dApplyData = k210Var.m206028F2().MultiCallEvent.applyData();
        list.getClass();
        c19397dApplyData.mo172464m(list);
        ((MultiCallApplyView) k210Var.viewModel).m75698r0(false);
    }

    /* JADX INFO: renamed from: T3 */
    private final List<i110> m144252T3(List<? extends BLiveMultiCall> data) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(m144254U3((BLiveMultiCall) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m144253S3(final i110 model) {
        model.m133952J(true);
        duringCreated(LivingNormalApiProvider.m71237H3(model.getApplyData().f44400id, s410.f162258x)).subscribe(ffw.m121194e(new e30() { // from class: l.i210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144246L3(this.f110532a, (BLiveMultiCall) obj);
            }
        }, new e30() { // from class: l.j210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144247M3(this.f115869a, model, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final i110 m144254U3(BLiveMultiCall call) {
        return new i110(call, r610.m177976K(this)).m133957P(new Function1() { // from class: l.h210
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k210.m144245K3(this.f105479a, (i110) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V3 */
    public final void m144255V3() {
        ((MultiCallApplyView) this.viewModel).m75698r0(true);
        duringCreated(LivingNormalApiProvider.m71607w4(m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.f210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144251R3(this.f94138a, (List) obj);
            }
        }, new e30() { // from class: l.g210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144244J3(this.f100232a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().MultiCallEvent.applyData().m172460g()).subscribe(ffw.m121194e(new e30() { // from class: l.c210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144250P3(this.f78315a, (List) obj);
            }
        }, new e30() { // from class: l.d210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144248N3((Throwable) obj);
            }
        }));
        duringCreated(m206028F2().MultiCallEvent.updateMultiCall().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.e210
            @Override // p149l.e30
            public final void call(Object obj) {
                k210.m144249O3(this.f88874a, (BLiveMultiCall) obj);
            }
        }));
    }
}
