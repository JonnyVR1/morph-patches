package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import com.p1.mobile.putong.core.ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p1.mobile.putong.core.ui.vip.likers.mytab.LikersMyTabFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.s7m;
import l.u4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\n¨\u0006#"}, d2 = {"Ll/nbe0;", "Ll/s7m;", "Ll/mbe0;", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;)V", "presenter", "", "a", "(Ll/mbe0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "hasSVIPPrivilege", "b", "(Z)V", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "Ll/mbe0;", "getPresenter", "()Ll/mbe0;", "c", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class nbe0 implements s7m<mbe0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SeeTabFragment frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public mbe0 presenter;

    public nbe0(@NotNull SeeTabFragment seeTabFragment) {
        seeTabFragment.getClass();
        this.frag = seeTabFragment;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18822C0() {
        return this.frag.getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m18826i1(@Nullable mbe0 presenter) {
        if (presenter != null) {
            m18825c(presenter);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m18824b(boolean hasSVIPPrivilege) {
        LikersMyTabFrag fakeLikersMyTabFrag;
        k kVarM = this.frag.getChildFragmentManager().m();
        kVarM.getClass();
        LikersMyTabFrag likersMyTabFragI0 = this.frag.getChildFragmentManager().i0("frag_tag_my_tab_see_tab");
        if (hasSVIPPrivilege) {
            fakeLikersMyTabFrag = likersMyTabFragI0 instanceof LikersMyTabFrag ? likersMyTabFragI0 : new LikersMyTabFrag();
        } else {
            fakeLikersMyTabFrag = likersMyTabFragI0 instanceof FakeLikersMyTabFrag ? (FakeLikersMyTabFrag) likersMyTabFragI0 : new FakeLikersMyTabFrag();
        }
        kVarM.t(u4c0.W1, fakeLikersMyTabFrag, "frag_tag_my_tab_see_tab");
        kVarM.j();
    }

    /* JADX INFO: renamed from: c */
    public final void m18825c(@NotNull mbe0 mbe0Var) {
        mbe0Var.getClass();
        this.presenter = mbe0Var;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setId(u4c0.W1);
        return frameLayout;
    }

    public void destroy() {
    }
}
