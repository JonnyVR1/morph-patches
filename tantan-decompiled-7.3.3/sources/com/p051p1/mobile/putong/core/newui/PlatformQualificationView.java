package com.p051p1.mobile.putong.core.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p153l.bnl0;
import p153l.hd80;
import p153l.p9r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lv/VButton;", "a", "Lv/VButton;", "get_button", "()Lv/VButton;", "set_button", "(Lv/VButton;)V", "_button", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PlatformQualificationView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VButton _button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlatformQualificationView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m37137b(layoutInflaterM171370a, this);
        bnl0.m105509E0(get_button(), new View.OnClickListener() { // from class: l.gd80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlatformQualificationView.m37136a(context, view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m37136a(Context context, View view) {
        context.startActivity(AccessTokenWebViewAct.m81333a2(context, "平台资质", "http://m.tantanapp.com/middle-platform/bussiness_license?rid=5"));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m37137b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM134576b = hd80.m134576b(this, inflater, parent);
        viewM134576b.getClass();
        return viewM134576b;
    }

    @NotNull
    public final VButton get_button() {
        VButton vButton = this._button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_button");
        return null;
    }

    public final void set_button(@NotNull VButton vButton) {
        vButton.getClass();
        this._button = vButton;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlatformQualificationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PlatformQualificationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PlatformQualificationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
