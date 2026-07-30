package p153l;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.intlmeet.ilike.IntlILikeFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlMeetFrag2;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/yeo;", "Ll/ar2;", "Ll/cfo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "l0", "(Lkotlin/Pair;)V", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "m0", "(IILandroid/content/Intent;)Z", "hidden", "n0", "(Z)V", "o0", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/tribe/IntlMeetFrag2;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yeo extends ar2<cfo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag2 frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeo(@NotNull IntlMeetFrag2 intlMeetFrag2) {
        super(intlMeetFrag2);
        intlMeetFrag2.getClass();
        this.frag = intlMeetFrag2;
    }

    /* JADX INFO: renamed from: e0 */
    public static Pair m215424e0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m215425f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static void m215426g0(yeo yeoVar, Pair pair) {
        pair.getClass();
        yeoVar.m215431l0(pair);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m215427h0(yeo yeoVar, Bundle bundle) {
        ((cfo) yeoVar.viewModel).m109567u();
        ((cfo) yeoVar.viewModel).m109555A(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static Pair m215428i0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m215429j0(yeo yeoVar, Integer num) {
        if (num.intValue() >= 0) {
            V v2 = yeoVar.viewModel;
            v2.getClass();
            ((cfo) v2).m109557C(num.intValue());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m215430k0() {
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        CoreModule.f18264c.f20429u0.m31443g7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: l0 */
    private final void m215431l0(Pair<? extends Optional<vg60<User>>, ? extends Optional<vg60<User>>> pair) {
        int size;
        Optional<vg60<User>> first = pair.getFirst();
        Optional<vg60<User>> second = pair.getSecond();
        if (first.isPresent() && second.isPresent()) {
            int i = 0;
            if (first.isPresent()) {
                vg60<User> vg60Var = first.get();
                List<User> list = vg60Var.f184001a;
                list.getClass();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    size = vg60Var.f184001a.size();
                }
            } else {
                size = 0;
            }
            if (second.isPresent()) {
                vg60<User> vg60Var2 = second.get();
                List<User> list2 = vg60Var2.f184001a;
                list2.getClass();
                if (!list2.isEmpty()) {
                    i = vg60Var2.f184002b.total;
                }
            }
            ((cfo) this.viewModel).m109569w(size + i);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m215434o0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.reo
            @Override // p153l.y20
            public final void call(Object obj) {
                yeo.m215427h0(this.f162663a, (Bundle) obj);
            }
        }, new x20() { // from class: l.seo
            @Override // p153l.x20
            public final void call() {
                yeo.m215430k0();
            }
        });
        C22421c<Optional<vg60<User>>> c22421cM153380q3 = CoreModule.f18264c.f20432v0.m153380q3();
        C22421c<Optional<vg60<User>>> c22421cM153379p3 = CoreModule.f18264c.f20432v0.m153379p3();
        final Function2 function2 = new Function2() { // from class: l.teo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return yeo.m215424e0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(psd0.m173625r(c22421cM153380q3, c22421cM153379p3, new rcj() { // from class: l.ueo
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return yeo.m215428i0(function2, obj, obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.veo
            @Override // p153l.y20
            public final void call(Object obj) {
                yeo.m215426g0(this.f183835a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20304E1.m109152H3()).subscribe(psd0.m173597H(new y20() { // from class: l.weo
            @Override // p153l.y20
            public final void call(Object obj) {
                yeo.m215429j0(this.f188716a, (Integer) obj);
            }
        }, new y20() { // from class: l.xeo
            @Override // p153l.y20
            public final void call(Object obj) {
                yeo.m215425f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m215432m0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM109563l = ((cfo) this.viewModel).getMeetFrag();
        if (intlMeetLikersFragM109563l != null) {
            if (!intlMeetLikersFragM109563l.isAdded()) {
                intlMeetLikersFragM109563l = null;
            }
            if (intlMeetLikersFragM109563l != null && intlMeetLikersFragM109563l.m40385T4(requestCode, resultCode, data)) {
                return true;
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM109564m = ((cfo) this.viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM109564m == null) {
            return false;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM109564m.isAdded() ? intlMeetVisitorFragM109564m : null;
        return intlMeetVisitorFrag != null && intlMeetVisitorFrag.m40511R4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m215433n0(boolean hidden) {
        Fragment fragment;
        int currentItem = ((cfo) this.viewModel).m109566p().getCurrentItem();
        if (currentItem == 0) {
            IntlMeetLikersFrag intlMeetLikersFragM109563l = ((cfo) this.viewModel).getMeetFrag();
            if (intlMeetLikersFragM109563l != null) {
                fragment = intlMeetLikersFragM109563l.isAdded() ? intlMeetLikersFragM109563l : null;
                if (fragment != null) {
                    fragment.onHiddenChanged(hidden);
                }
            }
            if (hidden) {
                return;
            }
            CoreModule.f18264c.f20304E1.m109151G3();
            return;
        }
        if (currentItem == 1) {
            IntlILikeFrag intlILikeFragM109562k = ((cfo) this.viewModel).getILikeFrag();
            if (intlILikeFragM109562k != null) {
                fragment = intlILikeFragM109562k.isAdded() ? intlILikeFragM109562k : null;
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
        IntlMeetVisitorFrag intlMeetVisitorFragM109564m = ((cfo) this.viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM109564m != null) {
            fragment = intlMeetVisitorFragM109564m.isAdded() ? intlMeetVisitorFragM109564m : null;
            if (fragment != null) {
                fragment.onHiddenChanged(hidden);
            }
        }
        if (hidden) {
            return;
        }
        m215434o0();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m215434o0() {
        Long lValueOf = CoreModule.f18264c.f20429u0.f19996l0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(pzi0.m174454o());
        }
        CoreModule.f18264c.f20429u0.m31458m5();
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        CoreModule.f18264c.f20432v0.m153369A3(lValueOf.longValue());
        CoreModule.f18264c.f20432v0.m153388y3("", lValueOf.longValue());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
