package com.p046p1.mobile.putong.core.p053ui.visitor.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.p053ui.visitor.frag.VisitorTabFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.o7m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabFragment;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", BaseSei.f13932Z, "Lkotlin/Lazy;", "O4", "()Lcom/p1/mobile/putong/core/ui/visitor/frag/VisitorTabPresenter;", "presenter", "Ll/o7m0;", "A", "P4", "()Ll/o7m0;", "viewModel", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VisitorTabFragment extends PutongFrag {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.h6m0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VisitorTabFragment.m57982N4(this.f106096a);
        }
    });

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.i6m0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return VisitorTabFragment.m57981M4(this.f111754a);
        }
    });

    /* JADX INFO: renamed from: M4 */
    public static o7m0 m57981M4(VisitorTabFragment visitorTabFragment) {
        return new o7m0(visitorTabFragment);
    }

    /* JADX INFO: renamed from: N4 */
    public static VisitorTabPresenter m57982N4(VisitorTabFragment visitorTabFragment) {
        return new VisitorTabPresenter(visitorTabFragment);
    }

    /* JADX INFO: renamed from: O4 */
    private final VisitorTabPresenter m57983O4() {
        return (VisitorTabPresenter) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final o7m0 m57984P4() {
        return (o7m0) this.viewModel.getValue();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m57983O4().mo51532C(m57984P4());
        m57984P4().mo21065i1(m57983O4());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m57983O4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        m57984P4().m163021r();
        m57983O4().m58021P0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m57984P4().inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m57984P4().m163027y(hidden);
    }
}
