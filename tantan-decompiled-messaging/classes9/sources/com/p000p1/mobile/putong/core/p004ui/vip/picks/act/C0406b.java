package com.p000p1.mobile.putong.core.p004ui.vip.picks.act;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.PicksItemView;
import com.p1.mobile.putong.core.data.PicksUser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v.VPullUpRecyclerView;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010&\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\u001f\u0010!\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00106\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\b\"\u0004\b4\u00105R\"\u00108\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u0010\b\"\u0004\b9\u00105R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u0010\b\"\u0004\b<\u00105¨\u0006>"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/b;", "Landroidx/recyclerview/widget/k$e;", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "callback", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;)V", "", "r", "()Z", "q", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "", "m", "(Landroidx/recyclerview/widget/RecyclerView$d0;)F", "defaultValue", "l", "(F)F", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "k", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)I", "p0", "p1", "p2", "y", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "direction", "", "B", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/graphics/Canvas;", "c", "dX", "dY", "actionState", "isCurrentlyActive", "u", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFIZ)V", "width", "distance", "C", "(IF)F", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)V", "d", "Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "getCallback", "()Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "e", "Z", "getCouldBeSwiped", "setCouldBeSwiped", "(Z)V", "couldBeSwiped", "f", "isLike", "setLike", "g", "isUnlike", "setUnlike", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0406b extends k.e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final a callback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean couldBeSwiped;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isLike;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isUnlike;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.act.b$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/act/b$a;", "", "Lcom/p1/mobile/putong/core/data/PicksUser;", "clickedUser", "", "liked", "superLike", "", "S", "(Lcom/p1/mobile/putong/core/data/PicksUser;ZZ)V", "c", "(Z)V", "n", "()Z", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: S */
        void mo10250S(@NotNull PicksUser clickedUser, boolean liked, boolean superLike);

        /* JADX INFO: renamed from: c */
        void mo10253c(boolean liked);

        /* JADX INFO: renamed from: n */
        boolean mo10254n();
    }

    public C0406b(@NotNull a aVar) {
        aVar.getClass();
        this.callback = aVar;
    }

    /* JADX INFO: renamed from: B */
    public void m10255B(@NotNull RecyclerView.d0 viewHolder, int direction) {
        viewHolder.getClass();
        if (this.couldBeSwiped) {
            View view = viewHolder.itemView;
            if (view instanceof PicksItemView) {
                view.getClass();
                this.callback.mo10250S(((PicksItemView) view).getMUser(), this.isLike, false);
                return;
            }
        }
        this.callback.mo10253c(this.isLike);
    }

    /* JADX INFO: renamed from: C */
    public final float m10256C(int width, float distance) {
        float fM5226B9 = width / CoreModule.f1543l.m11706a().m5226B9();
        if (fM5226B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(distance / fM5226B9, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public void m10257c(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        this.couldBeSwiped = false;
        this.isLike = false;
        this.isUnlike = false;
        super.c(recyclerView, viewHolder);
    }

    /* JADX INFO: renamed from: k */
    public int m10258k(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        View view = viewHolder.itemView;
        if ((view instanceof PicksItemView) && (layoutManager instanceof GridLayoutManager)) {
            return k.e.t(15, 15);
        }
        if ((view instanceof PicksItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return layoutManager.getOrientation() == 0 ? k.e.t(12, 3) : k.e.t(3, 12);
        }
        return k.e.t(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public float m10259l(float defaultValue) {
        return 2.1474836E9f;
    }

    /* JADX INFO: renamed from: m */
    public float m10260m(@NotNull RecyclerView.d0 viewHolder) {
        viewHolder.getClass();
        return 0.25f;
    }

    /* JADX INFO: renamed from: q */
    public boolean m10261q() {
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m10262r() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public void m10263u(@NotNull Canvas c, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.d0 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        c.getClass();
        recyclerView.getClass();
        viewHolder.getClass();
        if (actionState == 1 && (viewHolder.itemView instanceof PicksItemView)) {
            float width = recyclerView.getWidth() * m10260m(viewHolder);
            float fM10256C = m10256C(viewHolder.itemView.getMeasuredWidth(), 2.0f * Math.abs(dX));
            if (dX <= 0.0f) {
                fM10256C = -fM10256C;
            }
            if (this.callback.mo10254n()) {
                this.couldBeSwiped = isCurrentlyActive;
            } else {
                if (fM10256C > 0.0f) {
                    if (isCurrentlyActive) {
                        this.isLike = true;
                        this.isUnlike = false;
                    }
                } else if (fM10256C < 0.0f) {
                    if (isCurrentlyActive) {
                        this.isLike = false;
                        this.isUnlike = true;
                    }
                } else if (isCurrentlyActive) {
                    this.isLike = false;
                    this.isUnlike = false;
                }
                if (isCurrentlyActive) {
                    this.couldBeSwiped = Math.abs(dX) > width;
                }
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).F(viewHolder.itemView);
        }
        super.u(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    /* JADX INFO: renamed from: y */
    public boolean m10264y(@NotNull RecyclerView p0, @NotNull RecyclerView.d0 p1, @NotNull RecyclerView.d0 p2) {
        p0.getClass();
        p1.getClass();
        p2.getClass();
        return false;
    }
}
