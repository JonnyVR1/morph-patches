package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/ll0;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/dl0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "W3", "", "content", "Z3", "(Ljava/lang/String;)V", "Y3", "()Ll/dl0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "k", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", VirtualVoiceMotionType.announcement, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ll0<D extends oo2> extends hj2<D, dl0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public BLiveMultiCallAnnouncement announcement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: P3 */
    public static Boolean m154666P3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static void m154667R3(ll0 ll0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        if (TEnum.equals(bLiveMultiCallAnnouncement.state, "approved")) {
            r1j0.m179419f(R$string.f48193kc);
        } else if (TEnum.equals(bLiveMultiCallAnnouncement.state, "pending")) {
            r1j0.m179419f(R$string.f48215lc);
        }
        ((dl0) ll0Var.viewModel).mo72910j();
        LiveEventBus liveEventBusM213811F2 = ll0Var.m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new MultiCallEvent().announcementData().mo199274m(bLiveMultiCallAnnouncement);
    }

    /* JADX INFO: renamed from: S3 */
    public static Boolean m154668S3(ll0 ll0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        dl0 dl0Var = (dl0) ll0Var.viewModel;
        return Boolean.valueOf(dl0Var != null ? dl0Var.isShowing() : false);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m154669T3(ll0 ll0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        ll0Var.announcement = bLiveMultiCallAnnouncement;
        dl0 dl0Var = (dl0) ll0Var.viewModel;
        bLiveMultiCallAnnouncement.getClass();
        dl0Var.m116707L(bLiveMultiCallAnnouncement);
    }

    /* JADX INFO: renamed from: U3 */
    public static void m154670U3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m154671V3(ll0 ll0Var, Boolean bool) {
        bf10.INSTANCE.m103851f0(ll0Var);
        ll0Var.m135319L3();
        ll0Var.mo135321N3();
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m154672X3(ll0 ll0Var, BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement) {
        ((dl0) ll0Var.viewModel).mo72910j();
        r1j0.m179419f(R$string.f48062ec);
        LiveEventBus liveEventBusM213811F2 = ll0Var.m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new MultiCallEvent().announcementData().mo199274m(bLiveMultiCallAnnouncement);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m154673W3() {
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.announcement;
        if (bLiveMultiCallAnnouncement != null) {
            jr10.m146655a();
            es0 es0Var = es0.INSTANCE;
            String str = bLiveMultiCallAnnouncement.roomId;
            str.getClass();
            String str2 = bLiveMultiCallAnnouncement.f45249id;
            str2.getClass();
            duringCreated(es0Var.m122301g(str, str2)).subscribe(dhw.m115829h(new y20() { // from class: l.kl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ll0.m154672X3(this.f127319a, (BLiveMultiCallAnnouncement) obj);
                }
            }));
        }
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] */
    public dl0 mo76862K3() {
        return new dl0();
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m154675Z3(@NotNull String content) {
        content.getClass();
        if (TextUtils.isEmpty(content)) {
            r1j0.m179419f(R$string.f48106gc);
            return;
        }
        BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement = this.announcement;
        if (bLiveMultiCallAnnouncement != null) {
            bLiveMultiCallAnnouncement.getClass();
            if (TEnum.equals(bLiveMultiCallAnnouncement.state, "approved")) {
                BLiveMultiCallAnnouncement bLiveMultiCallAnnouncement2 = this.announcement;
                bLiveMultiCallAnnouncement2.getClass();
                if (Intrinsics.m88377d(content, bLiveMultiCallAnnouncement2.content)) {
                    ((dl0) this.viewModel).mo72910j();
                    return;
                }
            }
        }
        jr10.m146660g();
        es0 es0Var = es0.INSTANCE;
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        duringCreated(es0Var.m122302i(strM202194o, content)).subscribe(dhw.m115826e(new y20() { // from class: l.il0
            @Override // p153l.y20
            public final void call(Object obj) {
                ll0.m154667R3(this.f115476a, (BLiveMultiCallAnnouncement) obj);
            }
        }, new y20() { // from class: l.jl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ll0.m154670U3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        bf10.INSTANCE.m103851f0(this);
        duringCreated((C22421c) m213811F2().MultiCallEvent.showAnnouncementDlg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.el0
            @Override // p153l.y20
            public final void call(Object obj) {
                ll0.m154671V3(this.f94466a, (Boolean) obj);
            }
        }));
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        C22421c<BLiveMultiCallAnnouncement> c22421cM199270g = liveEventBusM213811F2.new MultiCallEvent().announcementData().m199270g();
        final Function1 function1 = new Function1() { // from class: l.fl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ll0.m154668S3(this.f99578a, (BLiveMultiCallAnnouncement) obj);
            }
        };
        duringCreated(c22421cM199270g.filter(new qcj() { // from class: l.gl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ll0.m154666P3(function1, obj);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.hl0
            @Override // p153l.y20
            public final void call(Object obj) {
                ll0.m154669T3(this.f110469a, (BLiveMultiCallAnnouncement) obj);
            }
        }));
    }
}
