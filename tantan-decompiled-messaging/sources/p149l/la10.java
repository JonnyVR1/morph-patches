package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Ll/la10;", "Ll/qxl;", "Ll/zi2;", "Ll/yl40;", "Ll/da10;", "Ll/bsm;", "infoPackage", "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Ll/s7m;", "model", "z1", "(Ll/s7m;)V", "V3", "()Ll/da10;", "W3", "k", "Ll/bsm;", "", "", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/List;", "applyData", "", "m", "I", "openType", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class la10 extends zi2<yl40, da10> implements qxl {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<yl40> infoPackage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<Object> applyData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int openType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la10(@NotNull bsm<yl40> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.infoPackage = bsmVar;
        this.applyData = new ArrayList();
        this.openType = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static void m149115O3(la10 la10Var, List list) {
        la10Var.f188513f.progressDismiss();
        la10Var.mo168244N3();
        LivingNormalApiProvider.m71184B4(((yl40) la10Var.m206027E2()).m149814k());
        q2f.C19397d<List, C22306c<List>> c19397dInviteList = la10Var.m206028F2().MultiCallEvent.inviteList();
        list.getClass();
        c19397dInviteList.mo172464m(list);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m149116P3(la10 la10Var, List list) {
        list.getClass();
        la10Var.applyData = list;
    }

    /* JADX INFO: renamed from: R3 */
    public static void m149117R3(la10 la10Var, Integer num) {
        num.getClass();
        la10Var.openType = num.intValue();
        if (num.intValue() != -100) {
            la10Var.m218910L3();
            la10Var.m149122W3();
        } else {
            da10 da10Var = (da10) la10Var.viewModel;
            if (da10Var != null) {
                da10Var.mo71727j();
            }
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static void m149118S3(la10 la10Var, Throwable th) {
        la10Var.f188513f.progressDismiss();
    }

    /* JADX INFO: renamed from: T3 */
    public static List m149119T3(la10 la10Var, j110 j110Var) {
        return la10Var.applyData;
    }

    /* JADX INFO: renamed from: U3 */
    public static void m149120U3(la10 la10Var, Integer num) {
        da10 da10Var = (da10) la10Var.viewModel;
        num.getClass();
        da10Var.m110532x(num.intValue());
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public da10 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new da10(act);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m149122W3() {
        this.f188513f.progress(R$string.f47464q, true);
        duringCreated(LivingNormalApiProvider.m71598v4()).subscribe(ffw.m121194e(new e30() { // from class: l.ja10
            @Override // p149l.e30
            public final void call(Object obj) {
                la10.m149115O3(this.f116997a, (List) obj);
            }
        }, new e30() { // from class: l.ka10
            @Override // p149l.e30
            public final void call(Object obj) {
                la10.m149118S3(this.f122091a, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        LiveEventBus liveEventBusM206028F2 = m206028F2();
        liveEventBusM206028F2.getClass();
        duringCreated(liveEventBusM206028F2.new MultiCallEvent().openManageDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.fa10
            @Override // p149l.e30
            public final void call(Object obj) {
                la10.m149117R3(this.f96555a, (Integer) obj);
            }
        }));
        m129301d3(j110.class, new w9j() { // from class: l.ga10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return la10.m149119T3(this.f101620a, (j110) obj);
            }
        });
        duringCreated(m206028F2().MultiCallEvent.applyData().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ha10
            @Override // p149l.e30
            public final void call(Object obj) {
                la10.m149116P3(this.f106707a, (List) obj);
            }
        }));
        duringCreated(m206028F2().MultiCallEvent.changeTab().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.ia10
            @Override // p149l.e30
            public final void call(Object obj) {
                la10.m149120U3(this.f112276a, (Integer) obj);
            }
        }));
    }

    @Override // p149l.qxl
    /* JADX INFO: renamed from: z1 */
    public void mo95516z1(@NotNull s7m<?> model) {
        model.getClass();
        if (model instanceof MultiCallMainView) {
            m144512z2(new aa10(this.infoPackage, (MultiCallMainView) model, this.openType));
        } else if (model instanceof MultiCallInviteMoreView) {
            m144512z2(new e710(this.infoPackage, (MultiCallInviteMoreView) model));
        }
    }
}
