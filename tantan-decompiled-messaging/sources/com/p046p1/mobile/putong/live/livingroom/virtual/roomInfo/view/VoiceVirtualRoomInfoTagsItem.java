package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.g5c0;
import p149l.kvc0;
import p149l.p9p0;
import p149l.t100;
import p149l.t6c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomAttributes;", "roomAttributes", "b", "(Ljava/util/List;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/view/VoiceVirtualRoomInfoTagsItem;)V", "_root", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_tag_title", "()Landroid/widget/TextView;", "set_tag_title", "(Landroid/widget/TextView;)V", "_tag_title", "c", "Landroid/widget/LinearLayout;", "get_tag_container", "()Landroid/widget/LinearLayout;", "set_tag_container", "(Landroid/widget/LinearLayout;)V", "_tag_container", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceVirtualRoomInfoTagsItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VoiceVirtualRoomInfoTagsItem _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _tag_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LinearLayout _tag_container;

    public /* synthetic */ VoiceVirtualRoomInfoTagsItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m77527a(View view) {
        p9p0.m167876a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m77528b(@NotNull List<BLiveVoiceVirtualRoomAttributes> roomAttributes) {
        roomAttributes.getClass();
        get_tag_container().removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(get_root().getContext());
        for (BLiveVoiceVirtualRoomAttributes bLiveVoiceVirtualRoomAttributes : roomAttributes) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.f167236K, t100.f167231F);
            layoutParams.setMarginEnd(t100.f167257f);
            View viewInflate = layoutInflaterFrom.inflate(t6c0.f168334ea, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(g5c0.f101106y6)).setText(bLiveVoiceVirtualRoomAttributes.content);
            ((TextView) viewInflate.findViewById(g5c0.f101097x6)).setText(bLiveVoiceVirtualRoomAttributes.name);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(kvc0.m147358g(bLiveVoiceVirtualRoomAttributes.bgColor));
            gradientDrawable.setCornerRadius(t100.f167260i);
            gradientDrawable.setShape(0);
            viewInflate.setBackground(gradientDrawable);
            get_tag_container().addView(viewInflate, layoutParams);
        }
    }

    @NotNull
    public final VoiceVirtualRoomInfoTagsItem get_root() {
        VoiceVirtualRoomInfoTagsItem voiceVirtualRoomInfoTagsItem = this._root;
        if (voiceVirtualRoomInfoTagsItem != null) {
            return voiceVirtualRoomInfoTagsItem;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final LinearLayout get_tag_container() {
        LinearLayout linearLayout = this._tag_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_tag_container");
        return null;
    }

    @NotNull
    public final TextView get_tag_title() {
        TextView textView = this._tag_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tag_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77527a(this);
    }

    public final void set_root(@NotNull VoiceVirtualRoomInfoTagsItem voiceVirtualRoomInfoTagsItem) {
        voiceVirtualRoomInfoTagsItem.getClass();
        this._root = voiceVirtualRoomInfoTagsItem;
    }

    public final void set_tag_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._tag_container = linearLayout;
    }

    public final void set_tag_title(@NotNull TextView textView) {
        textView.getClass();
        this._tag_title = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoTagsItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoTagsItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualRoomInfoTagsItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
