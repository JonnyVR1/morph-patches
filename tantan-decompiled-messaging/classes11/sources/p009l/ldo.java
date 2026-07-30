package p009l;

import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.intlmeet.frag.IntlMeetFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.x9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f2*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ll/ldo;", "Ll/jq2;", "Ll/rdo;", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;)V", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "", "l0", "(Lkotlin/Pair;)V", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "m0", "(IILandroid/content/Intent;)Z", "hidden", "n0", "(Z)V", "o0", "a", "Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/intlmeet/frag/IntlMeetFrag;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static Pair m17842e0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m17843f0(ldo ldoVar, Bundle bundle) {
        ((rdo) ((jq2) ldoVar).viewModel).m21613m();
        ((rdo) ((jq2) ldoVar).viewModel).m21616q(0);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m17844g0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static Pair m17845h0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m17846i0() {
        CoreModule.c.v0.n3();
        CoreModule.c.v0.m3();
        CoreModule.c.u0.c7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m17847j0(ldo ldoVar, Pair pair) {
        pair.getClass();
        ldoVar.m17849l0(pair);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m17848k0(ldo ldoVar, Integer num) {
        if (num.intValue() >= 0) {
            s7m s7mVar = ((jq2) ldoVar).viewModel;
            s7mVar.getClass();
            ((rdo) s7mVar).m21618u(num.intValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: l0 */
    private final void m17849l0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
        int size;
        Optional optional = (Optional) pair.getFirst();
        Optional optional2 = (Optional) pair.getSecond();
        if (optional.isPresent() && optional2.isPresent()) {
            int i = 0;
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                Collection collection = q860Var.f19068a;
                collection.getClass();
                if (collection.isEmpty()) {
                    size = 0;
                } else {
                    size = q860Var.f19068a.size();
                }
            } else {
                size = 0;
            }
            if (optional2.isPresent()) {
                q860 q860Var2 = (q860) optional2.get();
                Collection collection2 = q860Var2.f19068a;
                collection2.getClass();
                if (!collection2.isEmpty()) {
                    i = q860Var2.f19069b.total;
                }
            }
            ((rdo) ((jq2) this).viewModel).m21614n(size + i);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m17850Z() {
        super.Z();
        m17854o0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m17851a0() {
        super.a0();
        creates(new e30() { // from class: l.edo
            public final void call(Object obj) {
                ldo.m17843f0(this.f12516a, (Bundle) obj);
            }
        }, new d30() { // from class: l.fdo
            public final void call() {
                ldo.m17846i0();
            }
        });
        c cVarQ3 = CoreModule.c.v0.q3();
        c cVarP3 = CoreModule.c.v0.p3();
        final Function2 function2 = new Function2() { // from class: l.gdo
            public final Object invoke(Object obj, Object obj2) {
                return ldo.m17845h0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(mkd0.r(cVarQ3, cVarP3, new x9j() { // from class: l.hdo
            public final Object call(Object obj, Object obj2) {
                return ldo.m17842e0(function2, obj, obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.ido
            public final void call(Object obj) {
                ldo.m17847j0(this.f14584a, (Pair) obj);
            }
        }));
        duringCreated(CoreModule.c.E1.H3()).subscribe(mkd0.H(new e30() { // from class: l.jdo
            public final void call(Object obj) {
                ldo.m17848k0(this.f15066a, (Integer) obj);
            }
        }, new e30() { // from class: l.kdo
            public final void call(Object obj) {
                ldo.m17844g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m17852m0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM21608f = ((rdo) ((jq2) this).viewModel).getMeetFrag();
        if (intlMeetLikersFragM21608f != null) {
            if (!intlMeetLikersFragM21608f.isAdded()) {
                intlMeetLikersFragM21608f = null;
            }
            if (intlMeetLikersFragM21608f != null && intlMeetLikersFragM21608f.m3427T4(requestCode, resultCode, data)) {
                return true;
            }
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM21609i = ((rdo) ((jq2) this).viewModel).getVisitorFrag();
        if (intlMeetVisitorFragM21609i == null) {
            return false;
        }
        IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM21609i.isAdded() ? intlMeetVisitorFragM21609i : null;
        return intlMeetVisitorFrag != null && intlMeetVisitorFrag.m3568R4(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m17853n0(boolean hidden) {
        if (((rdo) ((jq2) this).viewModel).m21612k().getCurrentItem() == 0) {
            IntlMeetLikersFrag intlMeetLikersFragM21608f = ((rdo) ((jq2) this).viewModel).getMeetFrag();
            if (intlMeetLikersFragM21608f != null) {
                if (!intlMeetLikersFragM21608f.isAdded()) {
                    intlMeetLikersFragM21608f = null;
                }
                if (intlMeetLikersFragM21608f != null) {
                    intlMeetLikersFragM21608f.onHiddenChanged(hidden);
                }
            }
            if (!hidden) {
                CoreModule.c.E1.G3();
            }
        }
        if (((rdo) ((jq2) this).viewModel).m21612k().getCurrentItem() == 1) {
            IntlMeetVisitorFrag intlMeetVisitorFragM21609i = ((rdo) ((jq2) this).viewModel).getVisitorFrag();
            if (intlMeetVisitorFragM21609i != null) {
                IntlMeetVisitorFrag intlMeetVisitorFrag = intlMeetVisitorFragM21609i.isAdded() ? intlMeetVisitorFragM21609i : null;
                if (intlMeetVisitorFrag != null) {
                    intlMeetVisitorFrag.onHiddenChanged(hidden);
                }
            }
            if (hidden) {
                return;
            }
            m17854o0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m17854o0() {
        Long lValueOf = (Long) CoreModule.c.u0.k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m18550o());
        }
        CoreModule.c.u0.m5();
        CoreModule.c.v0.n3();
        CoreModule.c.v0.m3();
        CoreModule.c.v0.A3(lValueOf.longValue());
        CoreModule.c.v0.y3("", lValueOf.longValue());
    }

    public void destroy() {
    }
}
