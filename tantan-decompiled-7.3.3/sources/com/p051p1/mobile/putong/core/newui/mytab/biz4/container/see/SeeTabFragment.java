package com.p051p1.mobile.putong.core.newui.mytab.biz4.container.see;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.rje0;
import p153l.sje0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "Ll/rje0;", BaseSei.f14626Z, "Lkotlin/Lazy;", "O4", "()Ll/rje0;", "presenter", "Ll/sje0;", "A", "P4", "()Ll/sje0;", "viewModel", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class SeeTabFragment extends PutongFrag {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.kje0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SeeTabFragment.m43700N4(this.f127096a);
        }
    });

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.lje0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SeeTabFragment.m43699M4(this.f132330a);
        }
    });

    /* JADX INFO: renamed from: M4 */
    public static sje0 m43699M4(SeeTabFragment seeTabFragment) {
        return new sje0(seeTabFragment);
    }

    /* JADX INFO: renamed from: N4 */
    public static rje0 m43700N4(SeeTabFragment seeTabFragment) {
        return new rje0(seeTabFragment);
    }

    /* JADX INFO: renamed from: O4 */
    public final rje0 m43701O4() {
        return (rje0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final sje0 m43702P4() {
        return (sje0) this.viewModel.getValue();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m43701O4().mo52715C(m43702P4());
        m43702P4().mo22064i1(m43701O4());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m43701O4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m43702P4().inflateView(inflater, container);
    }
}
