package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
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
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Ll/lfo;", "Ll/ar2;", "Ll/rfo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "l0", "(Lkotlin/Pair;)V", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "m0", "(IILandroid/content/Intent;)Z", "hidden", "n0", "(Z)V", "o0", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lfo extends ar2<rfo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlMeetFrag frag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfo(@NotNull IntlMeetFrag intlMeetFrag) {
        super(intlMeetFrag);
        intlMeetFrag.getClass();
        this.frag = intlMeetFrag;
    }

    /* JADX INFO: renamed from: e0 */
    public static Pair m154020e0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m154021f0(lfo lfoVar, Bundle bundle) {
        ((rfo) lfoVar.viewModel).m181242m();
        ((rfo) lfoVar.viewModel).m181245q(0);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m154022g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static Pair m154023h0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m154024i0() {
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        CoreModule.f18264c.f20429u0.m31443g7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m154025j0(lfo lfoVar, Pair pair) {
        pair.getClass();
        lfoVar.m154027l0(pair);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m154026k0(lfo lfoVar, Integer num) {
        if (num.intValue() >= 0) {
            V v2 = lfoVar.viewModel;
            v2.getClass();
            ((rfo) v2).m181247u(num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: l0 */
    private final void m154027l0(Pair<? extends Optional<vg60<User>>, ? extends Optional<vg60<User>>> pair) {
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
            ((rfo) this.viewModel).m181243n(size + i);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m154030o0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.efo
            @Override // p153l.y20
            public final void call(Object obj) {
                lfo.m154021f0(this.f93807a, (Bundle) obj);
            }
        }, new x20() { // from class: l.ffo
            @Override // p153l.x20
            public final void call() {
                lfo.m154024i0();
            }
        });
        C22421c<Optional<vg60<User>>> c22421cM153380q3 = CoreModule.f18264c.f20432v0.m153380q3();
        C22421c<Optional<vg60<User>>> c22421cM153379p3 = CoreModule.f18264c.f20432v0.m153379p3();
        final Function2 function2 = new Function2() { // from class: l.gfo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return lfo.m154023h0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(psd0.m173625r(c22421cM153380q3, c22421cM153379p3, new rcj() { // from class: l.hfo
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return lfo.m154020e0(function2, obj, obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ifo
            @Override // p153l.y20
            public final void call(Object obj) {
                lfo.m154025j0(this.f114681a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20304E1.m109152H3()).subscribe(psd0.m173597H(new y20() { // from class: l.jfo
            @Override // p153l.y20
            public final void call(Object obj) {
                lfo.m154026k0(this.f120608a, (Integer) obj);
            }
        }, new y20() { // from class: l.kfo
            @Override // p153l.y20
            public final void call(Object obj) {
                lfo.m154022g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m154028m0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM181238f = ((rfo) this.viewModel).getMeetFrag();
        if (intlMeetLikersFragM181238f != null) {
            if (!intlMeetLikersFragM181238f.isAdded()) {
                intlMeetLikersFragM181238f = null;
            }
            if (intlMeetLikersFragM181238f != null && intlMeetLikersFragM181238f.m40385T4(requestCode, resultCode, data)) {
                return true;
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM181239i = ((rfo) this.viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM181239i == null) {
            return false;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM181239i.isAdded() ? intlMeetVisitorFragM181239i : null;
        return intlMeetVisitorFrag != null && intlMeetVisitorFrag.m40511R4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m154029n0(boolean hidden) {
        if (((rfo) this.viewModel).m181241k().getCurrentItem() == 0) {
            IntlMeetLikersFrag intlMeetLikersFragM181238f = ((rfo) this.viewModel).getMeetFrag();
            if (intlMeetLikersFragM181238f != null) {
                if (!intlMeetLikersFragM181238f.isAdded()) {
                    intlMeetLikersFragM181238f = null;
                }
                if (intlMeetLikersFragM181238f != null) {
                    intlMeetLikersFragM181238f.onHiddenChanged(hidden);
                }
            }
            if (!hidden) {
                CoreModule.f18264c.f20304E1.m109151G3();
            }
        }
        if (((rfo) this.viewModel).m181241k().getCurrentItem() == 1) {
            IntlMeetVisitorFrag intlMeetVisitorFragM181239i = ((rfo) this.viewModel).getVisitorFrag();
            if (intlMeetVisitorFragM181239i != null) {
                IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM181239i.isAdded() ? intlMeetVisitorFragM181239i : null;
                if (intlMeetVisitorFrag != null) {
                    intlMeetVisitorFrag.onHiddenChanged(hidden);
                }
            }
            if (hidden) {
                return;
            }
            m154030o0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m154030o0() {
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
