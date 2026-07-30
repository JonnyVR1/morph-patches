package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m88121d2 = {"Ll/of10;", "Ll/i6t;", "Ll/oo2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteMoreView;", "Ll/dum;", "Ll/mu40;", BaseSei.INFO, "inviteMoreView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteMoreView;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;", "data", "Ll/ff10;", "P3", "(Ljava/util/List;)Ljava/util/List;", "", "isRefreshing", "", "S3", "(Z)V", "", "ids", "U3", "(Ljava/util/List;)V", "T3", "()V", "call", "R3", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallInvite;)Ll/ff10;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class of10 extends i6t<oo2, MultiCallInviteMoreView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of10(@NotNull dum<mu40> dumVar, @NotNull MultiCallInviteMoreView multiCallInviteMoreView) {
        super(dumVar);
        dumVar.getClass();
        multiCallInviteMoreView.getClass();
        mo52715C(multiCallInviteMoreView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m167391J3(of10 of10Var, ff10 ff10Var) {
        MultiCallInviteMoreView multiCallInviteMoreView = (MultiCallInviteMoreView) of10Var.viewModel;
        ff10Var.getClass();
        multiCallInviteMoreView.m76906p0(ff10Var);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m167392K3(of10 of10Var, List list) {
        ((MultiCallInviteMoreView) of10Var.viewModel).m76910v0(false);
        MultiCallInviteMoreView multiCallInviteMoreView = (MultiCallInviteMoreView) of10Var.viewModel;
        list.getClass();
        multiCallInviteMoreView.m76909t0(of10Var.m167397P3(list));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m167393L3(of10 of10Var, ff10 ff10Var) {
        MultiCallInviteMoreView multiCallInviteMoreView = (MultiCallInviteMoreView) of10Var.viewModel;
        ff10Var.getClass();
        multiCallInviteMoreView.m76906p0(ff10Var);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m167394M3(of10 of10Var, List list, List list2) {
        ((MultiCallInviteMoreView) of10Var.viewModel).m76908s0(list);
        o1j0.m165651y(xau.m209910t(R$string.f48453w8));
    }

    /* JADX INFO: renamed from: N3 */
    public static void m167395N3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static void m167396O3(of10 of10Var, Throwable th) {
        ((MultiCallInviteMoreView) of10Var.viewModel).m76910v0(false);
    }

    /* JADX INFO: renamed from: P3 */
    private final List<ff10> m167397P3(List<? extends BLiveMultiCallInvite> data) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(m167398R3((BLiveMultiCallInvite) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R3 */
    public final ff10 m167398R3(BLiveMultiCallInvite call) {
        String str = cd10.f81053E;
        str.getClass();
        return new ff10(call, true, str, null, 8, null).m125348Q(new y20() { // from class: l.mf10
            @Override // p153l.y20
            public final void call(Object obj) {
                of10.m167391J3(this.f136585a, (ff10) obj);
            }
        }).m125350S(new y20() { // from class: l.nf10
            @Override // p153l.y20
            public final void call(Object obj) {
                of10.m167393L3(this.f141705a, (ff10) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public final void m167399S3(boolean isRefreshing) {
        if (isRefreshing) {
            ((MultiCallInviteMoreView) this.viewModel).m76910v0(true);
        }
        duringCreated(LivingNormalApiProvider.m72511R4()).subscribe(dhw.m115826e(new y20() { // from class: l.if10
            @Override // p153l.y20
            public final void call(Object obj) {
                of10.m167392K3(this.f114641a, (List) obj);
            }
        }, new y20() { // from class: l.jf10
            @Override // p153l.y20
            public final void call(Object obj) {
                of10.m167396O3(this.f120547a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final void m167400T3() {
        m213811F2().MultiCallEvent.changeTab().mo199273j(0);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m167401U3(@NotNull final List<String> ids) {
        ids.getClass();
        duringCreated(LivingNormalApiProvider.m72361A7(ids, bf10.m103795A(this), cd10.f81053E, cd10.f81094v)).subscribe(dhw.m115826e(new y20() { // from class: l.kf10
            @Override // p153l.y20
            public final void call(Object obj) {
                of10.m167394M3(this.f126227a, ids, (List) obj);
            }
        }, new y20() { // from class: l.lf10
            @Override // p153l.y20
            public final void call(Object obj) {
                of10.m167395N3((Throwable) obj);
            }
        }));
    }
}
