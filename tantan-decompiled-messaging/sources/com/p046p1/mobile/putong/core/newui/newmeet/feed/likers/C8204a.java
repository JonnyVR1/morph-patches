package com.p046p1.mobile.putong.core.newui.newmeet.feed.likers;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p149l.b2s;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010&\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\b\"\u0004\b3\u00104R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u0010\b\"\u0004\b8\u00104R\"\u0010:\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00101\u001a\u0004\b:\u0010\b\"\u0004\b;\u00104¨\u0006="}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/a;", "Landroidx/recyclerview/widget/k$e;", "Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/a$a;", "callback", "<init>", "(Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/a$a;)V", "", "r", "()Z", "q", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "", "m", "(Landroidx/recyclerview/widget/RecyclerView$d0;)F", "defaultValue", BLiveStormDanmakuGiftResourceType.f44444l, "(F)F", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "k", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;)I", "p0", "p1", "p2", BaseSei.f13931Y, "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$d0;)Z", "direction", "", "B", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/graphics/Canvas;", "c", "dX", "dY", "actionState", "isCurrentlyActive", "u", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;FFIZ)V", "width", "distance", b2s.C_ZONE, "(IF)F", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/a$a;", "getCallback", "()Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/a$a;", "e", "Z", "getCouldBeSwiped", "setCouldBeSwiped", "(Z)V", "couldBeSwiped", "f", "isLike", "setLike", "g", "isUnlike", "setUnlike", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8204a extends C0605k.e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final a callback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean couldBeSwiped;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isLike;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isUnlike;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.newmeet.feed.likers.a$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/likers/a$a;", "", "Lcom/p1/mobile/putong/data/User;", "clickedUser", "", "liked", "superLike", "fromButton", "", "p", "(Lcom/p1/mobile/putong/data/User;ZZZ)V", "o", "(Z)V", "n", "()Z", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface a {
        /* JADX INFO: renamed from: n */
        boolean mo42858n();

        /* JADX INFO: renamed from: o */
        void mo42859o(boolean liked);

        /* JADX INFO: renamed from: p */
        void mo42860p(@NotNull User clickedUser, boolean liked, boolean superLike, boolean fromButton);
    }

    public C8204a(@NotNull a aVar) {
        aVar.getClass();
        this.callback = aVar;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(@NotNull RecyclerView.AbstractC0566d0 viewHolder, int direction) {
        viewHolder.getClass();
        View view = viewHolder.itemView;
        if (view instanceof MeetLikersUserItemView) {
            if (!this.couldBeSwiped) {
                this.callback.mo42859o(this.isLike);
                return;
            }
            view.getClass();
            a aVar = this.callback;
            User user = ((MeetLikersUserItemView) view).f26224k;
            user.getClass();
            aVar.mo42860p(user, this.isLike, false, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final float m42889C(int width, float distance) {
        float fMo33289B9 = width / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(distance / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.AbstractC0566d0 viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        View view = viewHolder.itemView;
        if ((view instanceof MeetLikersUserItemView) && (layoutManager instanceof GridLayoutManager)) {
            return C0605k.e.m3771t(15, 15);
        }
        if ((view instanceof MeetLikersUserItemView) && (layoutManager instanceof LinearLayoutManager)) {
            return ((LinearLayoutManager) layoutManager).getOrientation() == 0 ? C0605k.e.m3771t(12, 3) : C0605k.e.m3771t(3, 12);
        }
        return C0605k.e.m3771t(0, 0);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: l */
    public float mo3784l(float defaultValue) {
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: m */
    public float mo3785m(@NotNull RecyclerView.AbstractC0566d0 viewHolder) {
        viewHolder.getClass();
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: q */
    public boolean mo3789q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3790r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: u */
    public void mo3791u(@NotNull Canvas c, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.AbstractC0566d0 viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        c.getClass();
        recyclerView.getClass();
        viewHolder.getClass();
        if (actionState == 1 && (viewHolder.itemView instanceof MeetLikersUserItemView)) {
            float width = recyclerView.getWidth() * mo3785m(viewHolder);
            float fM42889C = m42889C(viewHolder.itemView.getMeasuredWidth(), 2.0f * Math.abs(dX));
            if (dX <= 0.0f) {
                fM42889C = -fM42889C;
            }
            View view = viewHolder.itemView;
            view.getClass();
            MeetLikersUserItemView meetLikersUserItemView = (MeetLikersUserItemView) view;
            VImage vImage = meetLikersUserItemView.f26223j;
            vImage.getClass();
            VImage vImage2 = meetLikersUserItemView.f26222i;
            vImage2.getClass();
            if (fM42889C > 0.0f) {
                if (!this.callback.mo42858n()) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(4);
                    vImage.setAlpha(fM42889C);
                }
                if (isCurrentlyActive) {
                    this.isLike = true;
                    this.isUnlike = false;
                }
            } else {
                a aVar = this.callback;
                if (fM42889C < 0.0f) {
                    if (!aVar.mo42858n()) {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(0);
                        vImage2.setAlpha(-fM42889C);
                    }
                    if (isCurrentlyActive) {
                        this.isLike = false;
                        this.isUnlike = true;
                    }
                } else {
                    if (!aVar.mo42858n()) {
                        vImage.setVisibility(4);
                        vImage2.setVisibility(4);
                    }
                    if (isCurrentlyActive) {
                        this.isLike = false;
                        this.isUnlike = false;
                    }
                }
            }
            if (isCurrentlyActive) {
                this.couldBeSwiped = Math.abs(dX) > width;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m223189F(viewHolder.itemView);
        }
        super.mo3791u(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3795y(@NotNull RecyclerView p0, @NotNull RecyclerView.AbstractC0566d0 p1, @NotNull RecyclerView.AbstractC0566d0 p2) {
        p0.getClass();
        p1.getClass();
        p2.getClass();
        return false;
    }
}
