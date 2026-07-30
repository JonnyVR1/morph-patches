package com.p046p1.mobile.putong.core.newui.mytab.biz4.container.see;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.mbe0;
import p149l.nbe0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "Ll/mbe0;", BaseSei.f13932Z, "Lkotlin/Lazy;", "O4", "()Ll/mbe0;", "presenter", "Ll/nbe0;", "A", "P4", "()Ll/nbe0;", "viewModel", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SeeTabFragment extends PutongFrag {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.fbe0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SeeTabFragment.m42689N4(this.f96708a);
        }
    });

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.gbe0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SeeTabFragment.m42688M4(this.f101842a);
        }
    });

    /* JADX INFO: renamed from: M4 */
    public static nbe0 m42688M4(SeeTabFragment seeTabFragment) {
        return new nbe0(seeTabFragment);
    }

    /* JADX INFO: renamed from: N4 */
    public static mbe0 m42689N4(SeeTabFragment seeTabFragment) {
        return new mbe0(seeTabFragment);
    }

    /* JADX INFO: renamed from: O4 */
    public final mbe0 m42690O4() {
        return (mbe0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final nbe0 m42691P4() {
        return (nbe0) this.viewModel.getValue();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m42690O4().mo51532C(m42691P4());
        m42691P4().mo21065i1(m42690O4());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m42690O4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m42691P4().inflateView(inflater, container);
    }
}
