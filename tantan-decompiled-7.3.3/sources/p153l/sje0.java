package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.core.newui.mytab.biz4.container.see.SeeTabFragment;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.mytab.FakeLikersMyTabFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.mytab.LikersMyTabFrag;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\n¨\u0006#"}, m88121d2 = {"Ll/sje0;", "Ll/iam;", "Ll/rje0;", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;)V", "presenter", "", "a", "(Ll/rje0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "hasSVIPPrivilege", "b", "(Z)V", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/mytab/biz4/container/see/SeeTabFragment;", "Ll/rje0;", "getPresenter", "()Ll/rje0;", "c", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sje0 implements iam<rje0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SeeTabFragment frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public rje0 presenter;

    public sje0(@NotNull SeeTabFragment seeTabFragment) {
        seeTabFragment.getClass();
        this.frag = seeTabFragment;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable rje0 presenter) {
        if (presenter != null) {
            m186067c(presenter);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m186066b(boolean hasSVIPPrivilege) {
        Fragment fakeLikersMyTabFrag;
        AbstractC0428k abstractC0428kM2568m = this.frag.getChildFragmentManager().m2568m();
        abstractC0428kM2568m.getClass();
        Fragment fragmentM2558i0 = this.frag.getChildFragmentManager().m2558i0("frag_tag_my_tab_see_tab");
        if (hasSVIPPrivilege) {
            fakeLikersMyTabFrag = fragmentM2558i0 instanceof LikersMyTabFrag ? (LikersMyTabFrag) fragmentM2558i0 : new LikersMyTabFrag();
        } else {
            fakeLikersMyTabFrag = fragmentM2558i0 instanceof FakeLikersMyTabFrag ? (FakeLikersMyTabFrag) fragmentM2558i0 : new FakeLikersMyTabFrag();
        }
        abstractC0428kM2568m.m2813t(adc0.f70212Y1, fakeLikersMyTabFrag, "frag_tag_my_tab_see_tab");
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: c */
    public final void m186067c(@NotNull rje0 rje0Var) {
        rje0Var.getClass();
        this.presenter = rje0Var;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setId(adc0.f70212Y1);
        return frameLayout;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
