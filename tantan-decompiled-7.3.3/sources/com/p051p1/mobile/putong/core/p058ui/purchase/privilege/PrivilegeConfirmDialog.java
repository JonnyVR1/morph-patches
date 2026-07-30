package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeConfirmDialog;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.od0;
import p153l.x190;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010&\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\"\u0010)\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001e¨\u0006*"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/privilege/PrivilegeConfirmDialog;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/text/SpannableStringBuilder;", "content", "Ll/x20;", BLiveVoiceSingTogehterState.confirm, "cancel", Constants.INAPP_DATA_TAG, "(Landroid/text/SpannableStringBuilder;Ll/x20;Ll/x20;)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VText;", "a", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "b", "get_subtitle", "set_subtitle", "_subtitle", "get_get", "set_get", "_get", "get_dismiss", "set_dismiss", "_dismiss", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegeConfirmDialog extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _get;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _dismiss;

    public /* synthetic */ PrivilegeConfirmDialog(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m55412a(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m55413b(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55414c(View view) {
        x190.m209014a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m55415d(@NotNull SpannableStringBuilder content, @Nullable final x20 confirm, @Nullable final x20 cancel) {
        content.getClass();
        VText vText = get_title();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        get_subtitle().setText(content);
        get_subtitle().setOnTouchListener(new od0(content));
        get_get().setTypeface(typeface);
        bnl0.m105509E0(get_get(), new View.OnClickListener() { // from class: l.v190
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeConfirmDialog.m55412a(confirm, view);
            }
        });
        bnl0.m105509E0(get_dismiss(), new View.OnClickListener() { // from class: l.w190
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeConfirmDialog.m55413b(cancel, view);
            }
        });
    }

    @NotNull
    public final VText get_dismiss() {
        VText vText = this._dismiss;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_dismiss");
        return null;
    }

    @NotNull
    public final VText get_get() {
        VText vText = this._get;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_get");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_subtitle");
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

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55414c(this);
    }

    public final void set_dismiss(@NotNull VText vText) {
        vText.getClass();
        this._dismiss = vText;
    }

    public final void set_get(@NotNull VText vText) {
        vText.getClass();
        this._get = vText;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeConfirmDialog(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeConfirmDialog(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegeConfirmDialog(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
