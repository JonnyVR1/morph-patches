package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/ldo;", "Ll/jq2;", "Ll/rdo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "l0", "(Lkotlin/Pair;)V", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "m0", "(IILandroid/content/Intent;)Z", "hidden", "n0", "(Z)V", "o0", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ldo extends jq2<rdo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldo(@NotNull IntlMeetFrag intlMeetFrag) {
        super(intlMeetFrag);
        intlMeetFrag.getClass();
        this.frag = intlMeetFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static Pair m149453e0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m149454f0(ldo ldoVar, Bundle bundle) {
        ((rdo) ldoVar.viewModel).m178989m();
        ((rdo) ldoVar.viewModel).m178992q(0);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m149455g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static Pair m149456h0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m149457i0() {
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        CoreModule.f17545c.f19687u0.m30433c7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m149458j0(ldo ldoVar, Pair pair) {
        pair.getClass();
        ldoVar.m149460l0(pair);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m149459k0(ldo ldoVar, Integer num) {
        if (num.intValue() >= 0) {
            V v2 = ldoVar.viewModel;
            v2.getClass();
            ((rdo) v2).m178994u(num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: l0 */
    private final void m149460l0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
        int size;
        Optional<q860<User>> first = pair.getFirst();
        Optional<q860<User>> second = pair.getSecond();
        if (first.isPresent() && second.isPresent()) {
            int i = 0;
            if (first.isPresent()) {
                q860<User> q860Var = first.get();
                List<User> list = q860Var.f153135a;
                list.getClass();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    size = q860Var.f153135a.size();
                }
            } else {
                size = 0;
            }
            if (second.isPresent()) {
                q860<User> q860Var2 = second.get();
                List<User> list2 = q860Var2.f153135a;
                list2.getClass();
                if (!list2.isEmpty()) {
                    i = q860Var2.f153136b.total;
                }
            }
            ((rdo) this.viewModel).m178990n(size + i);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m149463o0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.edo
            @Override // p149l.e30
            public final void call(Object obj) {
                ldo.m149454f0(this.f90633a, (Bundle) obj);
            }
        }, new d30() { // from class: l.fdo
            @Override // p149l.d30
            public final void call() {
                ldo.m149457i0();
            }
        });
        C22306c<Optional<q860<User>>> c22306cM105767q3 = CoreModule.f17545c.f19690v0.m105767q3();
        C22306c<Optional<q860<User>>> c22306cM105766p3 = CoreModule.f17545c.f19690v0.m105766p3();
        final Function2 function2 = new Function2() { // from class: l.gdo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ldo.m149456h0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(mkd0.m154984r(c22306cM105767q3, c22306cM105766p3, new x9j() { // from class: l.hdo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ldo.m149453e0(function2, obj, obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.ido
            @Override // p149l.e30
            public final void call(Object obj) {
                ldo.m149458j0(this.f112667a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19562E1.m187833H3()).subscribe(mkd0.m154956H(new e30() { // from class: l.jdo
            @Override // p149l.e30
            public final void call(Object obj) {
                ldo.m149459k0(this.f117425a, (Integer) obj);
            }
        }, new e30() { // from class: l.kdo
            @Override // p149l.e30
            public final void call(Object obj) {
                ldo.m149455g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m149461m0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM178985f = ((rdo) this.viewModel).getMeetFrag();
        if (intlMeetLikersFragM178985f != null) {
            if (!intlMeetLikersFragM178985f.isAdded()) {
                intlMeetLikersFragM178985f = null;
            }
            if (intlMeetLikersFragM178985f != null && intlMeetLikersFragM178985f.m39382T4(requestCode, resultCode, data)) {
                return true;
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM178986i = ((rdo) this.viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM178986i == null) {
            return false;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM178986i.isAdded() ? intlMeetVisitorFragM178986i : null;
        return intlMeetVisitorFrag != null && intlMeetVisitorFrag.m39508R4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m149462n0(boolean hidden) {
        if (((rdo) this.viewModel).m178988k().getCurrentItem() == 0) {
            IntlMeetLikersFrag intlMeetLikersFragM178985f = ((rdo) this.viewModel).getMeetFrag();
            if (intlMeetLikersFragM178985f != null) {
                if (!intlMeetLikersFragM178985f.isAdded()) {
                    intlMeetLikersFragM178985f = null;
                }
                if (intlMeetLikersFragM178985f != null) {
                    intlMeetLikersFragM178985f.onHiddenChanged(hidden);
                }
            }
            if (!hidden) {
                CoreModule.f17545c.f19562E1.m187832G3();
            }
        }
        if (((rdo) this.viewModel).m178988k().getCurrentItem() == 1) {
            IntlMeetVisitorFrag intlMeetVisitorFragM178986i = ((rdo) this.viewModel).getVisitorFrag();
            if (intlMeetVisitorFragM178986i != null) {
                IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM178986i.isAdded() ? intlMeetVisitorFragM178986i : null;
                if (intlMeetVisitorFrag != null) {
                    intlMeetVisitorFrag.onHiddenChanged(hidden);
                }
            }
            if (hidden) {
                return;
            }
            m149463o0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m149463o0() {
        Long lValueOf = CoreModule.f17545c.f19687u0.f19254k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m155944o());
        }
        CoreModule.f17545c.f19687u0.m30456m5();
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        CoreModule.f17545c.f19690v0.m105757A3(lValueOf.longValue());
        CoreModule.f17545c.f19690v0.m105775y3("", lValueOf.longValue());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
