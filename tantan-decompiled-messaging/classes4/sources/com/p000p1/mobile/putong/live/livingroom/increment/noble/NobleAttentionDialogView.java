package com.p000p1.mobile.putong.live.livingroom.increment.noble;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.noble.NobleAttentionDialogView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.live.base.data.BLiveWealthButton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.hxs;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.il40;
import p002l.mlj;
import p002l.nfs;
import p002l.x5s;
import p002l.x6s;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0016R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u0016R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\"\u0010<\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/¨\u0006="}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/noble/NobleAttentionDialogView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/x6s;", "presenter", "Ll/d30;", "dismissAction", "m0", "(Ll/x6s;Ll/d30;)V", "Landroid/view/View;", "view", "l0", "(Landroid/view/View;)V", "d", "Landroid/view/View;", "get_empty_view", "()Landroid/view/View;", "set_empty_view", "_empty_view", "e", "get_bg", "set_bg", "_bg", "Lv/VDraweeView;", "f", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "g", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "h", "get_summary", "set_summary", "_summary", "i", "get_see", "set_see", "_see", "j", "get_leave", "set_leave", "_leave", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m8585h0(x6s x6sVar, View view) {
        BLiveWealthButton bLiveWealthButton = (BLiveWealthButton) x6sVar.m14184F3(new x5s());
        if (bLiveWealthButton != null) {
            String str = bLiveWealthButton.schema;
            str.getClass();
            if (str.length() == 0) {
                return;
            }
            x6sVar.mo14197p3(700, bLiveWealthButton.schema);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m8586i0(d30 d30Var, View view) {
        d30Var.call();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m8587j0(View view) {
    }

    /* JADX INFO: renamed from: k0 */
    public static void m8588k0(d30 d30Var, View view) {
        d30Var.call();
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_avatar");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    public final View get_empty_view() {
        View view = this._empty_view;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty_view");
        return null;
    }

    @NotNull
    public final VText get_leave() {
        VText vText = this._leave;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_leave");
        return null;
    }

    @NotNull
    public final VText get_see() {
        VText vText = this._see;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_see");
        return null;
    }

    @NotNull
    public final VText get_summary() {
        VText vText = this._summary;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_summary");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8589l0(View view) {
        il40.m15234a(this, view);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m0 */
    public final void m8590m0(@NotNull final x6s<?, ?> presenter, @NotNull final d30 dismissAction) {
        presenter.getClass();
        dismissAction.getClass();
        mlj mljVar = (mlj) presenter.m14184F3(new nfs());
        String str = ((Media) presenter.m25547E2().m14582l0().picture(0).cover()).url;
        str.getClass();
        if (mljVar != null) {
            str = mljVar.f15446e.c;
        }
        VDraweeView vDraweeView = get_avatar();
        int i = t100.S;
        hxs.u("context_livingAct", vDraweeView, str, i, i);
        xdl0.E0(get_empty_view(), new View.OnClickListener() { // from class: l.el40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m8586i0(dismissAction, view);
            }
        });
        xdl0.E0(get_bg(), new View.OnClickListener() { // from class: l.fl40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m8587j0(view);
            }
        });
        xdl0.E0(get_see(), new View.OnClickListener() { // from class: l.gl40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m8585h0(presenter, view);
            }
        });
        xdl0.E0(get_leave(), new View.OnClickListener() { // from class: l.hl40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NobleAttentionDialogView.m8588k0(dismissAction, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8589l0(this);
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
