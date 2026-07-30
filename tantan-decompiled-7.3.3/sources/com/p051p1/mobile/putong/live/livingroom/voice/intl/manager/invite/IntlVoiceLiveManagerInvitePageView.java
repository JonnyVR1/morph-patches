package com.p051p1.mobile.putong.live.livingroom.voice.intl.manager.invite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;
import p153l.d3q;
import p153l.jn50;
import p153l.mvc0;
import p153l.mxp;
import p153l.xwp;
import p153l.yec0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\f2\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010;¨\u0006="}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll/xwp;", "presenter", "", "c", "(Ll/xwp;)V", "e", "()V", "", "Ll/d3q;", "itemModels", "setPageData", "(Ljava/util/List;)V", Careers.f39580it, "f", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "get_emptyView", "()Landroid/widget/ImageView;", "set_emptyView", "(Landroid/widget/ImageView;)V", "_emptyView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_emptyTitle", "()Landroid/widget/TextView;", "set_emptyTitle", "(Landroid/widget/TextView;)V", "_emptyTitle", "Lv/smart_refresh/SmartRefreshLayout;", "Lv/smart_refresh/SmartRefreshLayout;", "get_refreshLayout", "()Lv/smart_refresh/SmartRefreshLayout;", "set_refreshLayout", "(Lv/smart_refresh/SmartRefreshLayout;)V", "_refreshLayout", "Landroidx/recyclerview/widget/RecyclerView;", Constants.INAPP_DATA_TAG, "Landroidx/recyclerview/widget/RecyclerView;", "get_list", "()Landroidx/recyclerview/widget/RecyclerView;", "set_list", "(Landroidx/recyclerview/widget/RecyclerView;)V", "_list", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlVoiceLiveManagerInvitePageView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView _emptyView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _emptyTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public SmartRefreshLayout _refreshLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public RecyclerView _list;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlVoiceLiveManagerInvitePageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.adapter = liveBaseAdapter;
        LayoutInflater.from(context).inflate(yec0.f198898R2, (ViewGroup) this, true);
        m79451b(this);
        get_list().setLayoutManager(new LinearLayoutManager(context, 1, false));
        get_list().setAdapter(liveBaseAdapter);
    }

    /* JADX INFO: renamed from: d */
    public static final void m79450d(xwp xwpVar, mvc0 mvc0Var) {
        mvc0Var.getClass();
        xwpVar.m213388v4();
    }

    /* JADX INFO: renamed from: b */
    public final void m79451b(View view) {
        mxp.m160694a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m79452c(@NotNull final xwp<?> presenter) {
        presenter.getClass();
        SmartRefreshLayout smartRefreshLayout = get_refreshLayout();
        smartRefreshLayout.mo224409S(new TTRefreshHeader(getContext()));
        smartRefreshLayout.mo224407Q(new TTRefreshFooter(getContext()));
        smartRefreshLayout.mo224405O(new jn50() { // from class: l.lxp
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                IntlVoiceLiveManagerInvitePageView.m79450d(presenter, mvc0Var);
            }
        });
        smartRefreshLayout.m225001G(false);
        smartRefreshLayout.m225003I(true);
    }

    /* JADX INFO: renamed from: e */
    public final void m79453e() {
        get_refreshLayout().m225016o();
        get_refreshLayout().m225021t();
    }

    /* JADX INFO: renamed from: f */
    public final void m79454f(@NotNull List<d3q<?>> it) {
        it.getClass();
        this.adapter.m68538J().addAll(it);
        this.adapter.notifyDataSetChanged();
    }

    @NotNull
    public final TextView get_emptyTitle() {
        TextView textView = this._emptyTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_emptyTitle");
        return null;
    }

    @NotNull
    public final ImageView get_emptyView() {
        ImageView imageView = this._emptyView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_emptyView");
        return null;
    }

    @NotNull
    public final RecyclerView get_list() {
        RecyclerView recyclerView = this._list;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @NotNull
    public final SmartRefreshLayout get_refreshLayout() {
        SmartRefreshLayout smartRefreshLayout = this._refreshLayout;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        Intrinsics.m88391r("_refreshLayout");
        return null;
    }

    public final void setPageData(@NotNull List<d3q<?>> itemModels) {
        itemModels.getClass();
        if (itemModels.isEmpty()) {
            get_emptyView().setVisibility(0);
            get_emptyTitle().setVisibility(0);
            get_refreshLayout().setVisibility(8);
        } else {
            get_emptyView().setVisibility(8);
            get_emptyTitle().setVisibility(8);
            get_refreshLayout().setVisibility(0);
        }
        this.adapter.m68554Z(itemModels);
    }

    public final void set_emptyTitle(@NotNull TextView textView) {
        textView.getClass();
        this._emptyTitle = textView;
    }

    public final void set_emptyView(@NotNull ImageView imageView) {
        imageView.getClass();
        this._emptyView = imageView;
    }

    public final void set_list(@NotNull RecyclerView recyclerView) {
        recyclerView.getClass();
        this._list = recyclerView;
    }

    public final void set_refreshLayout(@NotNull SmartRefreshLayout smartRefreshLayout) {
        smartRefreshLayout.getClass();
        this._refreshLayout = smartRefreshLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlVoiceLiveManagerInvitePageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlVoiceLiveManagerInvitePageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IntlVoiceLiveManagerInvitePageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
