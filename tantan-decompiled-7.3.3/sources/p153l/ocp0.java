package p153l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/ocp0;", "Ll/d3q;", "Landroid/view/View;", "Ll/d6m;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$e0;", "viewHolder", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;", "layoutParams", "", "b", "(Landroidx/recyclerview/widget/RecyclerView$e0;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;)V", "", "o", "()I", "itemView", "u", "(Landroid/view/View;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ocp0 extends d3q<View> implements d6m {
    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(@Nullable RecyclerView.AbstractC0569e0 viewHolder, @Nullable StaggeredGridLayoutManager.C0595c layoutParams) {
        if (layoutParams != null) {
            layoutParams.m3577i(true);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198764G0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(@NotNull View itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        bnl0.m105507D0(bnl0.f77544e, itemView);
        bnl0.m105505C0(itemView, bnl0.m105587w(40.0f));
    }
}
