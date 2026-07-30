package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.MultiCallEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/vi10;", "Ll/j0m;", "Ll/hj2;", "Ll/mu40;", "Ll/ni10;", "Ll/dum;", "infoPackage", "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "Ll/iam;", "model", "z1", "(Ll/iam;)V", "V3", "()Ll/ni10;", "W3", "k", "Ll/dum;", "", "", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/List;", "applyData", "", "m", "I", "openType", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class vi10 extends hj2<mu40, ni10> implements j0m {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<mu40> infoPackage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<Object> applyData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int openType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi10(@NotNull dum<mu40> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.infoPackage = dumVar;
        this.applyData = new ArrayList();
        this.openType = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public static void m201310O3(vi10 vi10Var, List list) {
        vi10Var.f196919f.progressDismiss();
        vi10Var.mo135321N3();
        LivingNormalApiProvider.m72367B4(((mu40) vi10Var.m213810E2()).m202191k());
        v3f.C20736d<List, C22421c<List>> c20736dInviteList = vi10Var.m213811F2().MultiCallEvent.inviteList();
        list.getClass();
        c20736dInviteList.mo199274m(list);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m201311P3(vi10 vi10Var, List list) {
        list.getClass();
        vi10Var.applyData = list;
    }

    /* JADX INFO: renamed from: R3 */
    public static void m201312R3(vi10 vi10Var, Integer num) {
        num.getClass();
        vi10Var.openType = num.intValue();
        if (num.intValue() != -100) {
            vi10Var.m135319L3();
            vi10Var.m201317W3();
        } else {
            ni10 ni10Var = (ni10) vi10Var.viewModel;
            if (ni10Var != null) {
                ni10Var.mo72910j();
            }
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static void m201313S3(vi10 vi10Var, Throwable th) {
        vi10Var.f196919f.progressDismiss();
    }

    /* JADX INFO: renamed from: T3 */
    public static List m201314T3(vi10 vi10Var, t910 t910Var) {
        return vi10Var.applyData;
    }

    /* JADX INFO: renamed from: U3 */
    public static void m201315U3(vi10 vi10Var, Integer num) {
        ni10 ni10Var = (ni10) vi10Var.viewModel;
        num.getClass();
        ni10Var.m163260x(num.intValue());
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public ni10 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new ni10(act);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m201317W3() {
        this.f196919f.progress(R$string.f48312q, true);
        duringCreated(LivingNormalApiProvider.m72781v4()).subscribe(dhw.m115826e(new y20() { // from class: l.ti10
            @Override // p153l.y20
            public final void call(Object obj) {
                vi10.m201310O3(this.f174438a, (List) obj);
            }
        }, new y20() { // from class: l.ui10
            @Override // p153l.y20
            public final void call(Object obj) {
                vi10.m201313S3(this.f179072a, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        LiveEventBus liveEventBusM213811F2 = m213811F2();
        liveEventBusM213811F2.getClass();
        duringCreated(liveEventBusM213811F2.new MultiCallEvent().openManageDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.pi10
            @Override // p153l.y20
            public final void call(Object obj) {
                vi10.m201312R3(this.f152509a, (Integer) obj);
            }
        }));
        m138860d3(t910.class, new qcj() { // from class: l.qi10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vi10.m201314T3(this.f157793a, (t910) obj);
            }
        });
        duringCreated(m213811F2().MultiCallEvent.applyData().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ri10
            @Override // p153l.y20
            public final void call(Object obj) {
                vi10.m201311P3(this.f163330a, (List) obj);
            }
        }));
        duringCreated(m213811F2().MultiCallEvent.changeTab().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.si10
            @Override // p153l.y20
            public final void call(Object obj) {
                vi10.m201315U3(this.f168786a, (Integer) obj);
            }
        }));
    }

    @Override // p153l.j0m
    /* JADX INFO: renamed from: z1 */
    public void mo142982z1(@NotNull iam<?> model) {
        model.getClass();
        if (model instanceof MultiCallMainView) {
            m153103z2(new ki10(this.infoPackage, (MultiCallMainView) model, this.openType));
        } else if (model instanceof MultiCallInviteMoreView) {
            m153103z2(new of10(this.infoPackage, (MultiCallInviteMoreView) model));
        }
    }
}
