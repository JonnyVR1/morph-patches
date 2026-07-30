package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/s450;", "Ll/iam;", "Ll/q450;", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;)V", "presenter", "", "b", "(Ll/q450;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/odiamond/ODiamondFrag;", "Landroid/widget/FrameLayout;", "Lkotlin/Lazy;", "c", "()Landroid/widget/FrameLayout;", "root", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s450 implements iam<q450> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ODiamondFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy root;

    public s450(@NotNull ODiamondFrag oDiamondFrag) {
        oDiamondFrag.getClass();
        this.frag = oDiamondFrag;
        this.root = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.r450
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s450.m184449a(this.f161148a);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static FrameLayout m184449a(s450 s450Var) {
        return new FrameLayout(s450Var.getContext());
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final FrameLayout m184451c() {
        return (FrameLayout) this.root.getValue();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return m184451c();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable q450 presenter) {
    }
}
