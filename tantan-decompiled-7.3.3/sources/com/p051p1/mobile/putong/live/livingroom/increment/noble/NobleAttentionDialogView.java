package com.p051p1.mobile.putong.live.livingroom.increment.noble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthButton;
import com.p051p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.coj;
import p153l.izs;
import p153l.ohs;
import p153l.qa00;
import p153l.wt40;
import p153l.x20;
import p153l.y7s;
import p153l.y8s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0016R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u0016R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\"\u0010<\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/¨\u0006="}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/noble/NobleAttentionDialogView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/y8s;", "presenter", "Ll/x20;", "dismissAction", "m0", "(Ll/y8s;Ll/x20;)V", "Landroid/view/View;", OMSTemplateModeType.view, "l0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_empty_view", "()Landroid/view/View;", "set_empty_view", "_empty_view", "e", "get_bg", "set_bg", "_bg", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "g", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "h", "get_summary", "set_summary", "_summary", RXScreenCaptureService.KEY_INDEX, "get_see", "set_see", "_see", "j", "get_leave", "set_leave", "_leave", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NobleAttentionDialogView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _empty_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _summary;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _see;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _leave;

    public /* synthetic */ NobleAttentionDialogView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m76162h0(y8s y8sVar, View view) {
        BLiveWealthButton bLiveWealthButton = (BLiveWealthButton) y8sVar.m138856F3(new y7s());
        if (bLiveWealthButton != null) {
            String str = bLiveWealthButton.schema;
            str.getClass();
            if (str.length() == 0) {
                return;
            }
            y8sVar.mo138869p3(700, bLiveWealthButton.schema);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m76163i0(x20 x20Var, View view) {
        x20Var.call();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m76164j0(View view) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m76165k0(x20 x20Var, View view) {
        x20Var.call();
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    public final View get_empty_view() {
        View view = this._empty_view;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty_view");
        return null;
    }

    @NotNull
    public final VText get_leave() {
        VText vText = this._leave;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_leave");
        return null;
    }

    @NotNull
    public final VText get_see() {
        VText vText = this._see;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_see");
        return null;
    }

    @NotNull
    public final VText get_summary() {
        VText vText = this._summary;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_summary");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m76166l0(View view) {
        wt40.m207816a(this, view);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: m0 */
    public final void m76167m0(@NotNull final y8s<?, ?> presenter, @NotNull final x20 dismissAction) {
        presenter.getClass();
        dismissAction.getClass();
        coj cojVar = (coj) presenter.m138856F3(new ohs());
        String str = presenter.m213810E2().m168532l0().picture(0).cover().url;
        str.getClass();
        if (cojVar != null) {
            str = cojVar.f82889e.f107999c;
        }
        VDraweeView vDraweeView = get_avatar();
        int i = qa00.f156306S;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        bnl0.m105509E0(get_empty_view(), new View.OnClickListener() { // from class: l.st40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m76163i0(dismissAction, view);
            }
        });
        bnl0.m105509E0(get_bg(), new View.OnClickListener() { // from class: l.tt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m76164j0(view);
            }
        });
        bnl0.m105509E0(get_see(), new View.OnClickListener() { // from class: l.ut40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m76162h0(presenter, view);
            }
        });
        bnl0.m105509E0(get_leave(), new View.OnClickListener() { // from class: l.vt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m76165k0(dismissAction, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76166l0(this);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_bg(@NotNull View view) {
        view.getClass();
        this._bg = view;
    }

    public final void set_empty_view(@NotNull View view) {
        view.getClass();
        this._empty_view = view;
    }

    public final void set_leave(@NotNull VText vText) {
        vText.getClass();
        this._leave = vText;
    }

    public final void set_see(@NotNull VText vText) {
        vText.getClass();
        this._see = vText;
    }

    public final void set_summary(@NotNull VText vText) {
        vText.getClass();
        this._summary = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NobleAttentionDialogView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NobleAttentionDialogView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NobleAttentionDialogView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
