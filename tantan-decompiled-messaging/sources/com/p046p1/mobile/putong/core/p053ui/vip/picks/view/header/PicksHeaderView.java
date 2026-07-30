package com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.PicksHelper;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.mcr;
import p149l.me70;
import p149l.ue70;
import p149l.ve70;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\u0010¨\u0006;"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "type", "b", "(Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "get_picks_header", "()Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;", "set_picks_header", "(Lcom/p1/mobile/putong/core/ui/vip/picks/view/header/PicksHeaderView;)V", "_picks_header", "Landroid/view/ViewStub;", "Landroid/view/ViewStub;", "get_state_hide", "()Landroid/view/ViewStub;", "set_state_hide", "(Landroid/view/ViewStub;)V", "_state_hide", "c", "get_state_expand", "set_state_expand", "_state_expand", "Ll/ue70;", Constants.INAPP_DATA_TAG, "Ll/ue70;", "getViewModel", "()Ll/ue70;", "setViewModel", "(Ll/ue70;)V", "viewModel", "Ll/me70;", "e", "Ll/me70;", "getPresenter", "()Ll/me70;", "setPresenter", "(Ll/me70;)V", "presenter", "f", "Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "getType", "()Lcom/p1/mobile/putong/core/ui/vip/picks/PicksHelper$HeaderType;", "setType", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PicksHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public PicksHeaderView _picks_header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ViewStub _state_hide;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ViewStub _state_expand;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ue70 viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public me70 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public PicksHelper.HeaderType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (context instanceof mcr) {
            setPresenter(new me70((Act) context));
            setViewModel(new ue70(this, context));
            getPresenter().mo51532C(getViewModel());
            getPresenter().mo39469Z();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m56822a(View view) {
        ve70.m198156a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m56823b(@NotNull PicksHelper.HeaderType type) {
        type.getClass();
        setType(type);
        getPresenter().mo39470a0();
    }

    @NotNull
    public final me70 getPresenter() {
        me70 me70Var = this.presenter;
        if (me70Var != null) {
            return me70Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    public final PicksHelper.HeaderType getType() {
        PicksHelper.HeaderType headerType = this.type;
        if (headerType != null) {
            return headerType;
        }
        Intrinsics.m87502r("type");
        return null;
    }

    @NotNull
    public final ue70 getViewModel() {
        ue70 ue70Var = this.viewModel;
        if (ue70Var != null) {
            return ue70Var;
        }
        Intrinsics.m87502r("viewModel");
        return null;
    }

    @NotNull
    public final PicksHeaderView get_picks_header() {
        PicksHeaderView picksHeaderView = this._picks_header;
        if (picksHeaderView != null) {
            return picksHeaderView;
        }
        Intrinsics.m87502r("_picks_header");
        return null;
    }

    @NotNull
    public final ViewStub get_state_expand() {
        ViewStub viewStub = this._state_expand;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_state_expand");
        return null;
    }

    @NotNull
    public final ViewStub get_state_hide() {
        ViewStub viewStub = this._state_hide;
        if (viewStub != null) {
            return viewStub;
        }
        Intrinsics.m87502r("_state_hide");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56822a(this);
    }

    public final void setPresenter(@NotNull me70 me70Var) {
        me70Var.getClass();
        this.presenter = me70Var;
    }

    public final void setType(@NotNull PicksHelper.HeaderType headerType) {
        headerType.getClass();
        this.type = headerType;
    }

    public final void setViewModel(@NotNull ue70 ue70Var) {
        ue70Var.getClass();
        this.viewModel = ue70Var;
    }

    public final void set_picks_header(@NotNull PicksHeaderView picksHeaderView) {
        picksHeaderView.getClass();
        this._picks_header = picksHeaderView;
    }

    public final void set_state_expand(@NotNull ViewStub viewStub) {
        viewStub.getClass();
        this._state_expand = viewStub;
    }

    public final void set_state_hide(@NotNull ViewStub viewStub) {
        viewStub.getClass();
        this._state_hide = viewStub;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksHeaderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PicksHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
