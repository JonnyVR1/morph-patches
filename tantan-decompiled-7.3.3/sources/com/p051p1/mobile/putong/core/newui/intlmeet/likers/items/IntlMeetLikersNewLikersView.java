package com.p051p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aho;
import p153l.bnl0;
import p153l.dho;
import p153l.joa;
import p153l.zgo;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)¨\u0006+"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetLikersNewLikersView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/zgo;", "meetLikersNewLikersAdapter", Constants.INAPP_DATA_TAG, "(Ll/zgo;)V", "Ll/aho;", "meetLikersUserItemData", "e", "(Ll/aho;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_new_likers_title", "()Landroid/widget/TextView;", "set_new_likers_title", "(Landroid/widget/TextView;)V", "_new_likers_title", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "get_new_likers_recycler", "()Landroidx/recyclerview/widget/RecyclerView;", "set_new_likers_recycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_new_likers_recycler", "Ll/zgo;", "adapter", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetLikersNewLikersView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView _new_likers_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RecyclerView _new_likers_recycler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public zgo adapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersView$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"com/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetLikersNewLikersView$a", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "dx", "dy", "", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "", "a", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8230a extends RecyclerView.AbstractC0584t {
        public C8230a() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m40433a(RecyclerView recyclerView) {
            return recyclerView != null && recyclerView.computeHorizontalScrollRange() > bnl0.m105592y0() && recyclerView.computeHorizontalScrollExtent() + recyclerView.computeHorizontalScrollOffset() >= recyclerView.computeHorizontalScrollRange();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            recyclerView.getClass();
            super.onScrolled(recyclerView, dx, dy);
            if (joa.m146392i4() && m40433a(recyclerView)) {
                CoreModule.m30933P().m143405a().mo34625wr(IntlMeetLikersNewLikersView.this.m40430c(), "p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", Privilege.see_who_likes_me);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlMeetLikersNewLikersView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m40429a(View view) {
        dho.m115807a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final Act m40430c() {
        Context context = getContext();
        context.getClass();
        return (Act) context;
    }

    /* JADX INFO: renamed from: d */
    public final void m40431d(@Nullable zgo meetLikersNewLikersAdapter) {
        this.adapter = meetLikersNewLikersAdapter;
        RecyclerView recyclerView = get_new_likers_recycler();
        recyclerView.setAdapter(meetLikersNewLikersAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addOnScrollListener(new C8230a());
    }

    /* JADX INFO: renamed from: e */
    public final void m40432e(@NotNull aho meetLikersUserItemData) {
        meetLikersUserItemData.getClass();
        List<User> listM97866b = meetLikersUserItemData.m97866b();
        meetLikersUserItemData.getDbLinks();
        get_new_likers_title().setText(getContext().getString(R$string.f21359V));
        zgo zgoVar = this.adapter;
        if (zgoVar != null) {
            zgoVar.m219651G(listM97866b);
        }
    }

    @NotNull
    public final RecyclerView get_new_likers_recycler() {
        RecyclerView recyclerView = this._new_likers_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_new_likers_recycler");
        return null;
    }

    @NotNull
    public final TextView get_new_likers_title() {
        TextView textView = this._new_likers_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_new_likers_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40429a(this);
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
    public IntlMeetLikersNewLikersView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlMeetLikersNewLikersView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
