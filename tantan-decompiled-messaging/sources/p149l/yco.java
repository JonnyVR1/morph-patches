package p149l;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2;
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
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Ll/yco;", "Ll/jq2;", "Ll/cdo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "l0", "(Lkotlin/Pair;)V", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "m0", "(IILandroid/content/Intent;)Z", "hidden", "n0", "(Z)V", "o0", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class yco extends jq2<cdo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag2 frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yco(@NotNull IntlMeetFrag2 intlMeetFrag2) {
        super(intlMeetFrag2);
        intlMeetFrag2.getClass();
        this.frag = intlMeetFrag2;
    }

    /* JADX INFO: renamed from: e0 */
    public static Pair m214172e0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m214173f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static void m214174g0(yco ycoVar, Pair pair) {
        pair.getClass();
        ycoVar.m214179l0(pair);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m214175h0(yco ycoVar, Bundle bundle) {
        ((cdo) ycoVar.viewModel).m106273u();
        ((cdo) ycoVar.viewModel).m106261A(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static Pair m214176i0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m214177j0(yco ycoVar, Integer num) {
        if (num.intValue() >= 0) {
            V v2 = ycoVar.viewModel;
            v2.getClass();
            ((cdo) v2).m106263C(num.intValue());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m214178k0() {
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        CoreModule.f17545c.f19687u0.m30433c7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: l0 */
    private final void m214179l0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
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
            ((cdo) this.viewModel).m106275w(size + i);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m214182o0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.rco
            @Override // p149l.e30
            public final void call(Object obj) {
                yco.m214175h0(this.f158802a, (Bundle) obj);
            }
        }, new d30() { // from class: l.sco
            @Override // p149l.d30
            public final void call() {
                yco.m214178k0();
            }
        });
        C22306c<Optional<q860<User>>> c22306cM105767q3 = CoreModule.f17545c.f19690v0.m105767q3();
        C22306c<Optional<q860<User>>> c22306cM105766p3 = CoreModule.f17545c.f19690v0.m105766p3();
        final Function2 function2 = new Function2() { // from class: l.tco
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return yco.m214172e0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(mkd0.m154984r(c22306cM105767q3, c22306cM105766p3, new x9j() { // from class: l.uco
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return yco.m214176i0(function2, obj, obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.vco
            @Override // p149l.e30
            public final void call(Object obj) {
                yco.m214174g0(this.f180969a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19562E1.m187833H3()).subscribe(mkd0.m154956H(new e30() { // from class: l.wco
            @Override // p149l.e30
            public final void call(Object obj) {
                yco.m214177j0(this.f185702a, (Integer) obj);
            }
        }, new e30() { // from class: l.xco
            @Override // p149l.e30
            public final void call(Object obj) {
                yco.m214173f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m214180m0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM106269l = ((cdo) this.viewModel).getMeetFrag();
        if (intlMeetLikersFragM106269l != null) {
            if (!intlMeetLikersFragM106269l.isAdded()) {
                intlMeetLikersFragM106269l = null;
            }
            if (intlMeetLikersFragM106269l != null && intlMeetLikersFragM106269l.m39382T4(requestCode, resultCode, data)) {
                return true;
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM106270m = ((cdo) this.viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM106270m == null) {
            return false;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM106270m.isAdded() ? intlMeetVisitorFragM106270m : null;
        return intlMeetVisitorFrag != null && intlMeetVisitorFrag.m39508R4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m214181n0(boolean hidden) {
        Fragment fragment;
        int currentItem = ((cdo) this.viewModel).m106272p().getCurrentItem();
        if (currentItem == 0) {
            IntlMeetLikersFrag intlMeetLikersFragM106269l = ((cdo) this.viewModel).getMeetFrag();
            if (intlMeetLikersFragM106269l != null) {
                fragment = intlMeetLikersFragM106269l.isAdded() ? intlMeetLikersFragM106269l : null;
                if (fragment != null) {
                    fragment.onHiddenChanged(hidden);
                }
            }
            if (hidden) {
                return;
            }
            CoreModule.f17545c.f19562E1.m187832G3();
            return;
        }
        if (currentItem == 1) {
            IntlILikeFrag intlILikeFragM106268k = ((cdo) this.viewModel).getILikeFrag();
            if (intlILikeFragM106268k != null) {
                fragment = intlILikeFragM106268k.isAdded() ? intlILikeFragM106268k : null;
                if (fragment != null) {
                    fragment.onHiddenChanged(hidden);
                    return;
                }
                return;
            }
            return;
        }
        if (currentItem != 2) {
            return;
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM106270m = ((cdo) this.viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM106270m != null) {
            fragment = intlMeetVisitorFragM106270m.isAdded() ? intlMeetVisitorFragM106270m : null;
            if (fragment != null) {
                fragment.onHiddenChanged(hidden);
            }
        }
        if (hidden) {
            return;
        }
        m214182o0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m214182o0() {
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
