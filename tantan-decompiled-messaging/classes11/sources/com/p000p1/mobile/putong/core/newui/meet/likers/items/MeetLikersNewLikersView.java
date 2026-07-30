package com.p000p1.mobile.putong.core.newui.meet.likers.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.n3y;
import l.t0g0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.j3y;
import p009l.k3y;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010-\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010.¨\u00060"}, d2 = {"Lcom/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersNewLikersView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/j3y;", "meetLikersNewLikersAdapter", "d", "(Ll/j3y;)V", "Ll/k3y;", "meetLikersUserItemData", "e", "(Ll/k3y;)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_new_likers_title", "()Landroid/widget/TextView;", "set_new_likers_title", "(Landroid/widget/TextView;)V", "_new_likers_title", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "get_new_likers_recycler", "()Landroidx/recyclerview/widget/RecyclerView;", "set_new_likers_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_new_likers_recycler", "Landroid/view/View;", "get_new_likers_divider", "()Landroid/view/View;", "set_new_likers_divider", "_new_likers_divider", "Ll/j3y;", "adapter", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MeetLikersNewLikersView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView _new_likers_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RecyclerView _new_likers_recycler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _new_likers_divider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public j3y adapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView$a */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p1/mobile/putong/core/newui/meet/likers/items/MeetLikersNewLikersView$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "a", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0264a extends RecyclerView.t {
        public C0264a() {
        }

        /* JADX INFO: renamed from: a */
        private final boolean m4609a(RecyclerView recyclerView) {
            return recyclerView != null && recyclerView.computeHorizontalScrollRange() > xdl0.y0() && recyclerView.computeHorizontalScrollExtent() + recyclerView.computeHorizontalScrollOffset() >= recyclerView.computeHorizontalScrollRange();
        }

        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (CoreModule.P().g().Fs() || !m4609a(recyclerView)) {
                return;
            }
            CoreModule.P().a().wr(MeetLikersNewLikersView.this.m4606c(), "p_meet_see,newlike", Privilege.see_who_likes_me);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MeetLikersNewLikersView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m4605a(View view) {
        n3y.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m4606c() {
        Act context = getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: d */
    public final void m4607d(@Nullable j3y meetLikersNewLikersAdapter) {
        this.adapter = meetLikersNewLikersAdapter;
        RecyclerView recyclerView = get_new_likers_recycler();
        recyclerView.setAdapter(meetLikersNewLikersAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addOnScrollListener(new C0264a());
    }

    /* JADX INFO: renamed from: e */
    public final void m4608e(@NotNull k3y meetLikersUserItemData) {
        String str;
        meetLikersUserItemData.getClass();
        List<User> listM17286c = meetLikersUserItemData.m17286c();
        DbLinks dbLinks = meetLikersUserItemData.getDbLinks();
        TextView textView = get_new_likers_title();
        if (meetLikersUserItemData.getNewLikersCount() > 0) {
            str = "新增喜欢我的人·" + t0g0.a(meetLikersUserItemData.getNewLikersCount(), 999L);
        } else {
            str = "新增喜欢我的人";
        }
        textView.setText(str);
        j3y j3yVar = this.adapter;
        if (j3yVar != null) {
            j3yVar.m16867J(dbLinks, listM17286c);
        }
    }

    @NotNull
    public final View get_new_likers_divider() {
        View view = this._new_likers_divider;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_new_likers_divider");
        return null;
    }

    @NotNull
    public final RecyclerView get_new_likers_recycler() {
        RecyclerView recyclerView = this._new_likers_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.r("_new_likers_recycler");
        return null;
    }

    @NotNull
    public final TextView get_new_likers_title() {
        TextView textView = this._new_likers_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_new_likers_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4605a(this);
    }

    public final void set_new_likers_divider(@NotNull View view) {
        view.getClass();
        this._new_likers_divider = view;
    }

    public final void set_new_likers_recycler(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._new_likers_recycler = recyclerView;
    }

    public final void set_new_likers_title(@NotNull TextView textView) {
        textView.getClass();
        this._new_likers_title = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetLikersNewLikersView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MeetLikersNewLikersView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
