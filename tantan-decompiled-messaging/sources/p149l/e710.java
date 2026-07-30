package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m87232d2 = {"Ll/e710;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteMoreView;", "Ll/bsm;", "Ll/yl40;", BaseSei.INFO, "inviteMoreView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteMoreView;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "data", "Ll/v610;", "P3", "(Ljava/util/List;)Ljava/util/List;", "", "isRefreshing", "", "S3", "(Z)V", "", "ids", "U3", "(Ljava/util/List;)V", "T3", "()V", "call", "R3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;)Ll/v610;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class e710 extends h4t<ho2, MultiCallInviteMoreView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e710(@NotNull bsm<yl40> bsmVar, @NotNull MultiCallInviteMoreView multiCallInviteMoreView) {
        super(bsmVar);
        bsmVar.getClass();
        multiCallInviteMoreView.getClass();
        mo51532C(multiCallInviteMoreView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m115168J3(e710 e710Var, v610 v610Var) {
        MultiCallInviteMoreView multiCallInviteMoreView = (MultiCallInviteMoreView) e710Var.viewModel;
        v610Var.getClass();
        multiCallInviteMoreView.m75723p0(v610Var);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m115169K3(e710 e710Var, List list) {
        ((MultiCallInviteMoreView) e710Var.viewModel).m75727v0(false);
        MultiCallInviteMoreView multiCallInviteMoreView = (MultiCallInviteMoreView) e710Var.viewModel;
        list.getClass();
        multiCallInviteMoreView.m75726t0(e710Var.m115174P3(list));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m115170L3(e710 e710Var, v610 v610Var) {
        MultiCallInviteMoreView multiCallInviteMoreView = (MultiCallInviteMoreView) e710Var.viewModel;
        v610Var.getClass();
        multiCallInviteMoreView.m75723p0(v610Var);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m115171M3(e710 e710Var, List list, List list2) {
        ((MultiCallInviteMoreView) e710Var.viewModel).m75725s0(list);
        lsi0.m151595y(w8u.m202217t(R$string.f47605w8));
    }

    /* JADX INFO: renamed from: N3 */
    public static void m115172N3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m115173O3(e710 e710Var, Throwable th) {
        ((MultiCallInviteMoreView) e710Var.viewModel).m75727v0(false);
    }

    /* JADX INFO: renamed from: P3 */
    private final List<v610> m115174P3(List<? extends BLiveMultiCallInvite> data) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(m115175R3((BLiveMultiCallInvite) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R3 */
    public final v610 m115175R3(BLiveMultiCallInvite call) {
        String str = s410.f162215E;
        str.getClass();
        return new v610(call, true, str, null, 8, null).m197194Q(new e30() { // from class: l.c710
            @Override // p149l.e30
            public final void call(Object obj) {
                e710.m115168J3(this.f79593a, (v610) obj);
            }
        }).m197196S(new e30() { // from class: l.d710
            @Override // p149l.e30
            public final void call(Object obj) {
                e710.m115170L3(this.f84690a, (v610) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final void m115176S3(boolean isRefreshing) {
        if (isRefreshing) {
            ((MultiCallInviteMoreView) this.viewModel).m75727v0(true);
        }
        duringCreated(LivingNormalApiProvider.m71328R4()).subscribe(ffw.m121194e(new e30() { // from class: l.y610
            @Override // p149l.e30
            public final void call(Object obj) {
                e710.m115169K3(this.f196505a, (List) obj);
            }
        }, new e30() { // from class: l.z610
            @Override // p149l.e30
            public final void call(Object obj) {
                e710.m115173O3(this.f201883a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m115177T3() {
        m206028F2().MultiCallEvent.changeTab().mo172463j(0);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m115178U3(@NotNull final List<String> ids) {
        ids.getClass();
        duringCreated(LivingNormalApiProvider.m71178A7(ids, r610.m177966A(this), s410.f162215E, s410.f162256v)).subscribe(ffw.m121194e(new e30() { // from class: l.a710
            @Override // p149l.e30
            public final void call(Object obj) {
                e710.m115171M3(this.f67833a, ids, (List) obj);
            }
        }, new e30() { // from class: l.b710
            @Override // p149l.e30
            public final void call(Object obj) {
                e710.m115172N3((Throwable) obj);
            }
        }));
    }
}
