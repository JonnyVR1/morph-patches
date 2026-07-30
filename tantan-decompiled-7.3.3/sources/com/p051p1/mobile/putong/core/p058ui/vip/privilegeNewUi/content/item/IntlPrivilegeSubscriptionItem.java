package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.d79;
import p153l.mcg0;
import p153l.qa00;
import p153l.x3p;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0018R\"\u00101\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010\u0018R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+\"\u0004\bH\u0010\u0018¨\u0006J"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/content/item/IntlPrivilegeSubscriptionItem;", "Lv/VRelative;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "Ll/mcg0;", "_data", "Lcom/p1/mobile/putong/app/PutongFrag;", "_frag", "q", "(Ll/mcg0;Lcom/p1/mobile/putong/app/PutongFrag;)V", "Landroid/view/View;", OMSTemplateModeType.view, "p", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "e", "I", "getDefStyleAttr", "()I", "f", "Lv/VRelative;", "get_item_layout", "()Lv/VRelative;", "set_item_layout", "(Lv/VRelative;)V", "_item_layout", "g", "Landroid/view/View;", "get_top_line", "()Landroid/view/View;", "set_top_line", "_top_line", "h", "get_top_divider_line", "set_top_divider_line", "_top_divider_line", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "j", "get_desc", "set_desc", "_desc", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "get_arrow", "()Landroid/widget/ImageView;", "set_arrow", "(Landroid/widget/ImageView;)V", "_arrow", BLiveStormDanmakuGiftResourceType.f45292l, "get_divider_line", "set_divider_line", "_divider_line", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlPrivilegeSubscriptionItem extends VRelative {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final AttributeSet attrs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int defStyleAttr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRelative _item_layout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _top_line;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _top_divider_line;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ImageView _arrow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _divider_line;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlPrivilegeSubscriptionItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.attrs = attributeSet;
        this.defStyleAttr = i;
    }

    @Nullable
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final int getDefStyleAttr() {
        return this.defStyleAttr;
    }

    @NotNull
    public final ImageView get_arrow() {
        ImageView imageView = this._arrow;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_arrow");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final View get_divider_line() {
        View view = this._divider_line;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_divider_line");
        return null;
    }

    @NotNull
    public final VRelative get_item_layout() {
        VRelative vRelative = this._item_layout;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m88391r("_item_layout");
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

    @NotNull
    public final View get_top_divider_line() {
        View view = this._top_divider_line;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_top_divider_line");
        return null;
    }

    @NotNull
    public final View get_top_line() {
        View view = this._top_line;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_top_line");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58855p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m58855p(View view) {
        x3p.m209258a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m58856q(@NotNull mcg0 _data, @NotNull PutongFrag _frag) {
        _data.getClass();
        _frag.getClass();
        get_title().setVisibility(8);
        get_desc().setVisibility(8);
        get_arrow().setVisibility(8);
        get_top_line().setVisibility(8);
        get_top_divider_line().setVisibility(8);
        get_divider_line().setVisibility(8);
        get_item_layout().setOnClickListener(null);
        get_item_layout().setClickable(false);
        setMinimumHeight(qa00.m175859d(1.0f));
        if (d79.m114668a0()) {
            bnl0.m105537U(this, qa00.m175859d(80.0f));
        } else {
            bnl0.m105537U(this, 0);
        }
    }

    public final void set_arrow(@NotNull ImageView imageView) {
        imageView.getClass();
        this._arrow = imageView;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_divider_line(@NotNull View view) {
        view.getClass();
        this._divider_line = view;
    }

    public final void set_item_layout(@NotNull VRelative vRelative) {
        vRelative.getClass();
        this._item_layout = vRelative;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    public final void set_top_divider_line(@NotNull View view) {
        view.getClass();
        this._top_divider_line = view;
    }

    public final void set_top_line(@NotNull View view) {
        view.getClass();
        this._top_line = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlPrivilegeSubscriptionItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IntlPrivilegeSubscriptionItem(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
