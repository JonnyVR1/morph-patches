package com.p000p1.mobile.putong.core.newui.mytab.biz4.container.see;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import com.p1.mobile.putong.app.PutongFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.mbe0;
import p009l.nbe0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "Ll/mbe0;", "z", "Lkotlin/Lazy;", "O4", "()Ll/mbe0;", "presenter", "Ll/nbe0;", "A", "P4", "()Ll/nbe0;", "viewModel", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SeeTabFragment extends PutongFrag {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.fbe0
        public final Object invoke() {
            return SeeTabFragment.m6852N4(this.f12902a);
        }
    });

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.gbe0
        public final Object invoke() {
            return SeeTabFragment.m6851M4(this.f13399a);
        }
    });

    /* JADX INFO: renamed from: M4 */
    public static nbe0 m6851M4(SeeTabFragment seeTabFragment) {
        return new nbe0(seeTabFragment);
    }

    /* JADX INFO: renamed from: N4 */
    public static mbe0 m6852N4(SeeTabFragment seeTabFragment) {
        return new mbe0(seeTabFragment);
    }

    /* JADX INFO: renamed from: O4 */
    public final mbe0 m6853O4() {
        return (mbe0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final nbe0 m6854P4() {
        return (nbe0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: d4 */
    public void m6855d4() {
        super.d4();
        m6853O4().C(m6854P4());
        m6854P4().m18826i1(m6853O4());
    }

    /* JADX INFO: renamed from: f4 */
    public void m6856f4() {
        super.f4();
        m6853O4().m18336a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m6857g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
    }

    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m6854P4().inflateView(inflater, container);
    }
}
