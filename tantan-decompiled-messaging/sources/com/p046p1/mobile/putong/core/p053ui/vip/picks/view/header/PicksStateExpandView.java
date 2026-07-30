package com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PicksUser;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksStateExpandView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p149l.cg70;
import p149l.d30;
import p149l.me70;
import p149l.t100;
import p149l.yf70;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006L"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView;", "Lv/VRelative;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/me70;", "presenter", "Ll/yf70;", "adapter", "", "Lcom/p1/mobile/putong/core/data/PicksUser;", "list", "Ll/d30;", "onClose", "H", "(Ll/me70;Ll/yf70;Ljava/util/List;Ll/d30;)V", "Landroid/view/View;", OMSTemplateModeType.view, "B", "(Landroid/view/View;)V", "Landroid/widget/LinearLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "get_title_layout", "()Landroid/widget/LinearLayout;", "set_title_layout", "(Landroid/widget/LinearLayout;)V", "_title_layout", "Lv/VImage;", "e", "Lv/VImage;", "get_title_icon", "()Lv/VImage;", "set_title_icon", "(Lv/VImage;)V", "_title_icon", "Lv/VText;", "f", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "g", "get_close", "set_close", "_close", "Lv/VPullUpRecyclerView;", "h", "Lv/VPullUpRecyclerView;", "get_list", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", RXScreenCaptureService.KEY_INDEX, "get_goto_picks", "set_goto_picks", "_goto_picks", "", "j", "Z", "getHasTrackMv", "()Z", "setHasTrackMv", "(Z)V", "hasTrackMv", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PicksStateExpandView extends VRelative {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LinearLayout _title_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _title_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _goto_picks;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean hasTrackMv;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.picks.view.header.PicksStateExpandView$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/core/ui/vip/picks/view/header/PicksStateExpandView$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "p0", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8973a extends GridLayoutManager.AbstractC0553c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int p0) {
            return 1;
        }
    }

    public /* synthetic */ PicksStateExpandView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: p */
    public static void m56824p(me70 me70Var, PicksStateExpandView picksStateExpandView, View view) {
        Act act = me70Var.act();
        zvf0.m220396r("e_picks_module_more", act != null ? act.pageId() : null);
        Intent intentMo35982a9 = CoreMemberModule.m36001F().m132651b().mo35982a9(me70Var.act());
        Act act2 = me70Var.act();
        if (act2 != null) {
            act2.startActivity(intentMo35982a9);
        }
        picksStateExpandView.get_close().performClick();
    }

    /* JADX INFO: renamed from: q */
    public static void m56825q(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: z */
    public static void m56826z(PicksStateExpandView picksStateExpandView) {
        View childAt;
        if (picksStateExpandView.get_list().getAdapter() == null || (childAt = picksStateExpandView.get_list().getChildAt(0)) == null) {
            return;
        }
        int height = (childAt.getHeight() * 2) + t100.f167266o;
        ViewGroup.LayoutParams layoutParams = picksStateExpandView.get_list().getLayoutParams();
        layoutParams.height = height;
        picksStateExpandView.get_list().setLayoutParams(layoutParams);
        picksStateExpandView.requestLayout();
        ViewGroup.LayoutParams layoutParams2 = picksStateExpandView.getLayoutParams();
        layoutParams2.height = picksStateExpandView.get_goto_picks().getHeight() + picksStateExpandView.get_title_layout().getHeight() + t100.m186890d(30.0f) + height;
        picksStateExpandView.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: B */
    public final void m56827B(View view) {
        cg70.m106697a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public final void m56828H(@NotNull final me70 presenter, @NotNull yf70 adapter, @NotNull List<? extends PicksUser> list, @NotNull final d30 onClose) {
        presenter.getClass();
        adapter.getClass();
        list.getClass();
        onClose.getClass();
        if (!this.hasTrackMv) {
            this.hasTrackMv = true;
            Act act = presenter.act();
            zvf0.m220402x("e_picks_module", act != null ? act.pageId() : null);
        }
        bringChildToFront(get_list());
        get_close().setOnClickListener(new View.OnClickListener() { // from class: l.zf70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksStateExpandView.m56825q(onClose, view);
            }
        });
        final Context context = getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context) { // from class: com.p1.mobile.putong.core.ui.vip.picks.view.header.PicksStateExpandView$render$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
            public boolean canScrollVertically() {
                return false;
            }
        };
        gridLayoutManager.m3326v(new C8973a());
        VPullUpRecyclerView vPullUpRecyclerView = get_list();
        vPullUpRecyclerView.setLayoutManager(gridLayoutManager);
        vPullUpRecyclerView.setAdapter(adapter);
        vPullUpRecyclerView.setPullUpInterval(300L);
        new C0605k(presenter.m154157m0()).m3750g(get_list());
        adapter.m214491N(list);
        VText vText = get_title();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        get_goto_picks().setTypeface(typeface);
        get_goto_picks().setOnClickListener(new View.OnClickListener() { // from class: l.ag70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksStateExpandView.m56824p(presenter, this, view);
            }
        });
        get_list().post(new Runnable() { // from class: l.bg70
            @Override // java.lang.Runnable
            public final void run() {
                PicksStateExpandView.m56826z(this.f75412a);
            }
        });
    }

    public final boolean getHasTrackMv() {
        return this.hasTrackMv;
    }

    @NotNull
    public final VImage get_close() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    public final VText get_goto_picks() {
        VText vText = this._goto_picks;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_goto_picks");
        return null;
    }

    @NotNull
    public final VPullUpRecyclerView get_list() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    public final VImage get_title_icon() {
        VImage vImage = this._title_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_title_icon");
        return null;
    }

    @NotNull
    public final LinearLayout get_title_layout() {
        LinearLayout linearLayout = this._title_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_title_layout");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56827B(this);
    }

    public final void setHasTrackMv(boolean z) {
        this.hasTrackMv = z;
    }

    public final void set_close(@NotNull VImage vImage) {
        vImage.getClass();
        this._close = vImage;
    }

    public final void set_goto_picks(@NotNull VText vText) {
        vText.getClass();
        this._goto_picks = vText;
    }

    public final void set_list(@NotNull VPullUpRecyclerView vPullUpRecyclerView) {
        vPullUpRecyclerView.getClass();
        this._list = vPullUpRecyclerView;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    public final void set_title_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._title_icon = vImage;
    }

    public final void set_title_layout(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._title_layout = linearLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksStateExpandView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksStateExpandView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksStateExpandView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
