package com.p000p1.mobile.putong.core.p004ui.visitor.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.p004ui.visitor.frag.VisitorTabFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.o7m0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "z", "Lkotlin/Lazy;", "O4", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "presenter", "Ll/o7m0;", "A", "P4", "()Ll/o7m0;", "viewModel", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VisitorTabFragment extends PutongFrag {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.h6m0
        public final Object invoke() {
            return VisitorTabFragment.m11504N4(this.f13723a);
        }
    });

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.i6m0
        public final Object invoke() {
            return VisitorTabFragment.m11503M4(this.f14270a);
        }
    });

    /* JADX INFO: renamed from: M4 */
    public static o7m0 m11503M4(VisitorTabFragment visitorTabFragment) {
        return new o7m0(visitorTabFragment);
    }

    /* JADX INFO: renamed from: N4 */
    public static VisitorTabPresenter m11504N4(VisitorTabFragment visitorTabFragment) {
        return new VisitorTabPresenter(visitorTabFragment);
    }

    /* JADX INFO: renamed from: O4 */
    private final VisitorTabPresenter m11505O4() {
        return (VisitorTabPresenter) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final o7m0 m11506P4() {
        return (o7m0) this.viewModel.getValue();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        m11505O4().C(m11506P4());
        m11506P4().m20402i1(m11505O4());
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        m11505O4().m11546a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m11507g4(@Nullable Bundle sis) {
        super.g4(sis);
        m11506P4().m20406r();
        m11505O4().m11544P0();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m11506P4().inflateView(inflater, container);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m11506P4().m20413y(hidden);
    }
}
