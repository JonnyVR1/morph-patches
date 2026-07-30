package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.q9p0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\"\u0010?\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u00102\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "text", "content", "Landroid/view/View$OnClickListener;", "clickListener", "j0", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "i0", "(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "", "visible", "setArrowVisible", "(Z)V", "groupCategory", "setContent", "(Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTitleItem;)V", "_root", "Landroid/widget/LinearLayout;", "e", "Landroid/widget/LinearLayout;", "get_title_layout", "()Landroid/widget/LinearLayout;", "set_title_layout", "(Landroid/widget/LinearLayout;)V", "_title_layout", "Lv/VText;", "f", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "g", "get_name_desc", "set_name_desc", "_name_desc", "h", "get_content", "set_content", "_content", "Lv/VImage;", RXScreenCaptureService.KEY_INDEX, "Lv/VImage;", "get_go_arrow", "()Lv/VImage;", "set_go_arrow", "(Lv/VImage;)V", "_go_arrow", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceVirtualRoomInfoTitleItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTitleItem _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public LinearLayout _title_layout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _name_desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _go_arrow;

    public /* synthetic */ VoiceVirtualRoomInfoTitleItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final VText get_content() {
        VText vText = this._content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    public final VImage get_go_arrow() {
        VImage vImage = this._go_arrow;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_go_arrow");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @NotNull
    public final VText get_name_desc() {
        VText vText = this._name_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name_desc");
        return null;
    }

    @NotNull
    public final VoiceVirtualRoomInfoTitleItem get_root() {
        VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem = this._root;
        if (voiceVirtualRoomInfoTitleItem != null) {
            return voiceVirtualRoomInfoTitleItem;
        }
        Intrinsics.m87502r("_root");
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

    /* JADX INFO: renamed from: h0 */
    public final void m77529h0(View view) {
        q9p0.m173661a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final VoiceVirtualRoomInfoTitleItem m77530i0(@NotNull String text, @NotNull View.OnClickListener clickListener) {
        text.getClass();
        clickListener.getClass();
        get_name().setText(text);
        xdl0.m208329E0(get_root(), clickListener);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final VoiceVirtualRoomInfoTitleItem m77531j0(@NotNull String text, @NotNull String content, @NotNull View.OnClickListener clickListener) {
        text.getClass();
        content.getClass();
        clickListener.getClass();
        get_name().setText(text);
        get_content().setText(content);
        xdl0.m208329E0(get_root(), clickListener);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77529h0(this);
    }

    public final void setArrowVisible(boolean visible) {
        xdl0.m208344M(get_go_arrow(), visible);
    }

    public final void setContent(@NotNull String groupCategory) {
        groupCategory.getClass();
        get_content().setText(groupCategory);
    }

    public final void set_content(@NotNull VText vText) {
        vText.getClass();
        this._content = vText;
    }

    public final void set_go_arrow(@NotNull VImage vImage) {
        vImage.getClass();
        this._go_arrow = vImage;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_name_desc(@NotNull VText vText) {
        vText.getClass();
        this._name_desc = vText;
    }

    public final void set_root(@NotNull VoiceVirtualRoomInfoTitleItem voiceVirtualRoomInfoTitleItem) {
        voiceVirtualRoomInfoTitleItem.getClass();
        this._root = voiceVirtualRoomInfoTitleItem;
    }

    public final void set_title_layout(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._title_layout = linearLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoTitleItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoTitleItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoTitleItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
