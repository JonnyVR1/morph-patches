package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/ua10;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallApplyView;", "Ll/dum;", "Ll/mu40;", BaseSei.INFO, "inviteView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallApplyView;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "data", "Ll/s910;", "T3", "(Ljava/util/List;)Ljava/util/List;", "", Constants.KEY_T, "()V", "V3", "call", "U3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)Ll/s910;", "model", "S3", "(Ll/s910;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ua10 extends i6t<oo2, MultiCallApplyView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua10(@NotNull dum<mu40> dumVar, @NotNull MultiCallApplyView multiCallApplyView) {
        super(dumVar);
        dumVar.getClass();
        multiCallApplyView.getClass();
        mo52715C(multiCallApplyView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m195144J3(ua10 ua10Var, Throwable th) {
        ((MultiCallApplyView) ua10Var.viewModel).m76881r0(false);
    }

    /* JADX INFO: renamed from: K3 */
    public static Unit m195145K3(ua10 ua10Var, s910 s910Var) {
        s910Var.getClass();
        ua10Var.m195153S3(s910Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static void m195146L3(ua10 ua10Var, BLiveMultiCall bLiveMultiCall) {
        ua10Var.m213811F2().MultiCallEvent.addWatchList().mo199273j(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m195147M3(ua10 ua10Var, s910 s910Var, Throwable th) {
        MultiCallApplyView multiCallApplyView = (MultiCallApplyView) ua10Var.viewModel;
        String str = s910Var.getApplyData().f45248id;
        str.getClass();
        multiCallApplyView.m76878n0(str);
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m195148N3(Throwable th) {
        th.getMessage();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m195149O3(ua10 ua10Var, BLiveMultiCall bLiveMultiCall) {
        if (fp10.m126517d(bLiveMultiCall)) {
            MultiCallApplyView multiCallApplyView = (MultiCallApplyView) ua10Var.viewModel;
            String str = bLiveMultiCall.f45248id;
            str.getClass();
            multiCallApplyView.m76879o0(str);
            return;
        }
        MultiCallApplyView multiCallApplyView2 = (MultiCallApplyView) ua10Var.viewModel;
        String str2 = bLiveMultiCall.f45248id;
        str2.getClass();
        multiCallApplyView2.m76878n0(str2);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m195150P3(ua10 ua10Var, List list) {
        MultiCallApplyView multiCallApplyView = (MultiCallApplyView) ua10Var.viewModel;
        list.getClass();
        multiCallApplyView.m76880p0(ua10Var.m195152T3(list));
    }

    /* JADX INFO: renamed from: R3 */
    public static void m195151R3(ua10 ua10Var, List list) {
        v3f.C20736d<List, C22421c<List>> c20736dApplyData = ua10Var.m213811F2().MultiCallEvent.applyData();
        list.getClass();
        c20736dApplyData.mo199274m(list);
        ((MultiCallApplyView) ua10Var.viewModel).m76881r0(false);
    }

    /* JADX INFO: renamed from: T3 */
    private final List<s910> m195152T3(List<? extends BLiveMultiCall> data) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(m195154U3((BLiveMultiCall) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S3 */
    public final void m195153S3(final s910 model) {
        model.m185128J(true);
        duringCreated(LivingNormalApiProvider.m72420H3(model.getApplyData().f45248id, cd10.f81096x)).subscribe(dhw.m115826e(new y20() { // from class: l.sa10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195146L3(this.f166994a, (BLiveMultiCall) obj);
            }
        }, new y20() { // from class: l.ta10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195147M3(this.f172682a, model, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final s910 m195154U3(BLiveMultiCall call) {
        return new s910(call, bf10.m103805K(this)).m185133P(new Function1() { // from class: l.ra10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ua10.m195145K3(this.f161891a, (s910) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: V3 */
    public final void m195155V3() {
        ((MultiCallApplyView) this.viewModel).m76881r0(true);
        duringCreated(LivingNormalApiProvider.m72790w4(m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.pa10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195151R3(this.f151232a, (List) obj);
            }
        }, new y20() { // from class: l.qa10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195144J3(this.f156340a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().MultiCallEvent.applyData().m199270g()).subscribe(dhw.m115826e(new y20() { // from class: l.ma10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195150P3(this.f135463a, (List) obj);
            }
        }, new y20() { // from class: l.na10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195148N3((Throwable) obj);
            }
        }));
        duringCreated(m213811F2().MultiCallEvent.updateMultiCall().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.oa10
            @Override // p153l.y20
            public final void call(Object obj) {
                ua10.m195149O3(this.f145655a, (BLiveMultiCall) obj);
            }
        }));
    }
}
