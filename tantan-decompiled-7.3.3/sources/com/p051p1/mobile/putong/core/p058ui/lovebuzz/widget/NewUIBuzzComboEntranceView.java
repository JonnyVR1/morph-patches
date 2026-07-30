package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.kk40;
import p153l.p9r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010@\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u000e\"\u0004\b?\u0010\u001f¨\u0006A"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/NewUIBuzzComboEntranceView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzComboEntranceView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "m0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "getIcon", "()Landroid/view/View;", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "getDesc", "getContentRoot", "", "count", "bonus", ShareConstants.RES_PATH, "", "k0", "(III)V", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "get_content_bg", "set_content_bg", "(Landroid/view/View;)V", "_content_bg", "Lv/VImage;", "e", "Lv/VImage;", "get_icon", "()Lv/VImage;", "set_icon", "(Lv/VImage;)V", "_icon", "Lv/VLinear;", "f", "Lv/VLinear;", "get_content_root", "()Lv/VLinear;", "set_content_root", "(Lv/VLinear;)V", "_content_root", "Lv/VText;", "g", "Lv/VText;", "get_content_root_title", "()Lv/VText;", "set_content_root_title", "(Lv/VText;)V", "_content_root_title", "h", "get_content_root_desc", "set_content_root_desc", "_content_root_desc", RXScreenCaptureService.KEY_INDEX, "get_red_dot", "set_red_dot", "_red_dot", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public NewUIBuzzComboEntranceView(@NotNull Context context) {
        super(context);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(context);
        layoutInflaterM171370a.getClass();
        m48443m0(layoutInflaterM171370a, this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public View getContentRoot() {
        return get_content_bg();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public TextView getDesc() {
        return get_content_root_desc();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzComboEntranceView
    @NotNull
    public View getIcon() {
        return get_icon();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzComboEntranceView
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
        Intrinsics.m88391r("_content_bg");
        return null;
    }

    @NotNull
    public final VLinear get_content_root() {
        VLinear vLinear = this._content_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content_root");
        return null;
    }

    @NotNull
    public final VText get_content_root_desc() {
        VText vText = this._content_root_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content_root_desc");
        return null;
    }

    @NotNull
    public final VText get_content_root_title() {
        VText vText = this._content_root_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content_root_title");
        return null;
    }

    @NotNull
    public final VImage get_icon() {
        VImage vImage = this._icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_icon");
        return null;
    }

    @NotNull
    public final View get_red_dot() {
        View view = this._red_dot;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_red_dot");
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzComboEntranceView
    /* JADX INFO: renamed from: k0 */
    public void mo48319k0(int count, int bonus, int res) {
        super.mo48319k0(count, bonus, res);
        bnl0.m105524M(get_red_dot(), bonus > 0);
    }

    @NotNull
    /* JADX INFO: renamed from: m0 */
    public final View m48443m0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM150084b = kk40.m150084b(this, inflater, parent);
        viewM150084b.getClass();
        return viewM150084b;
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
