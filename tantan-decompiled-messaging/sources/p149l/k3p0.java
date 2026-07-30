package p149l;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/k3p0;", "Ll/d1q;", "Landroid/view/View;", "Ll/m3m;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;", "layoutParams", "", "b", "(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;)V", "", "o", "()I", "itemView", "u", "(Landroid/view/View;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k3p0 extends d1q<View> implements m3m {
    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(@Nullable RecyclerView.AbstractC0566d0 viewHolder, @Nullable StaggeredGridLayoutManager.C0593c layoutParams) {
        if (layoutParams != null) {
            layoutParams.m3576i(true);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168032G0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(@NotNull View itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        xdl0.m208327D0(xdl0.f192403e, itemView);
        xdl0.m208325C0(itemView, xdl0.m208407w(40.0f));
    }
}
