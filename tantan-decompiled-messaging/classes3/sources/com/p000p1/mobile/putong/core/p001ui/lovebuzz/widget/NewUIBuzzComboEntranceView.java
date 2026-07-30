package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.o7r;
import l.wb40;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u000e\"\u0004\b?\u0010\u001f¨\u0006A"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/NewUIBuzzComboEntranceView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "m0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "getIcon", "()Landroid/view/View;", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getDesc", "getContentRoot", "", "count", "bonus", "res", "", "k0", "(III)V", "d", "Landroid/view/View;", "get_content_bg", "set_content_bg", "(Landroid/view/View;)V", "_content_bg", "Lv/VImage;", "e", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "Lv/VLinear;", "f", "Lv/VLinear;", "get_content_root", "()Lv/VLinear;", "set_content_root", "(Lv/VLinear;)V", "_content_root", "Lv/VText;", "g", "Lv/VText;", "get_content_root_title", "()Lv/VText;", "set_content_root_title", "(Lv/VText;)V", "_content_root_title", XHTMLElement.XPATH_PREFIX, "get_content_root_desc", "set_content_root_desc", "_content_root_desc", "i", "get_red_dot", "set_red_dot", "_red_dot", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewUIBuzzComboEntranceView extends BuzzComboEntranceView {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _content_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _content_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _content_root_title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _content_root_desc;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public View _red_dot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewUIBuzzComboEntranceView(@NotNull Context context) {
        super(context);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(context);
        layoutInflaterA.getClass();
        m290m0(layoutInflaterA, this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public View getContentRoot() {
        return get_content_bg();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public TextView getDesc() {
        return get_content_root_desc();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public View getIcon() {
        return get_icon();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public TextView getTitle() {
        return get_content_root_title();
    }

    @NotNull
    public final View get_content_bg() {
        View view = this._content_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_content_bg");
        return null;
    }

    @NotNull
    public final VLinear get_content_root() {
        VLinear vLinear = this._content_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_content_root");
        return null;
    }

    @NotNull
    public final VText get_content_root_desc() {
        VText vText = this._content_root_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_content_root_desc");
        return null;
    }

    @NotNull
    public final VText get_content_root_title() {
        VText vText = this._content_root_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_content_root_title");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_icon");
        return null;
    }

    @NotNull
    public final View get_red_dot() {
        View view = this._red_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_red_dot");
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzComboEntranceView
    /* JADX INFO: renamed from: k0 */
    public void mo161k0(int count, int bonus, int res) {
        super.mo161k0(count, bonus, res);
        xdl0.M(get_red_dot(), bonus > 0);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final View m290m0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = wb40.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    public final void set_content_bg(@NotNull View view) {
        view.getClass();
        this._content_bg = view;
    }

    public final void set_content_root(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content_root = vLinear;
    }

    public final void set_content_root_desc(@NotNull VText vText) {
        vText.getClass();
        this._content_root_desc = vText;
    }

    public final void set_content_root_title(@NotNull VText vText) {
        vText.getClass();
        this._content_root_title = vText;
    }

    public final void set_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._icon = vImage;
    }

    public final void set_red_dot(@NotNull View view) {
        view.getClass();
        this._red_dot = view;
    }
}
