package com.p051p1.mobile.putong.live.livingroom.virtual.preview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/preview/PreviewTagView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "tagText", "", "setTagText", "(Ljava/lang/String;)V", "a", "()V", "b", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "getTagTextView", "()Landroid/widget/TextView;", "tagTextView", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "getVoiceTopic", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "setVoiceTopic", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "voiceTopic", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PreviewTagView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TextView tagTextView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public BLiveVoiceChatTopic voiceTopic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PreviewTagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.tagTextView = new TextView(context);
        m78416b();
    }

    /* JADX INFO: renamed from: a */
    public final void m78415a() {
        Drawable drawableM161278b = n3d0.m161278b(obc0.f146263Z8);
        drawableM161278b.setBounds(0, 0, drawableM161278b.getMinimumWidth(), drawableM161278b.getMinimumHeight());
        this.tagTextView.setCompoundDrawablePadding(qa00.f156320g);
        this.tagTextView.setCompoundDrawables(null, null, drawableM161278b, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m78416b() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        TextView textView = this.tagTextView;
        textView.setTextSize(0, 12.0f);
        textView.setTextColor(n3d0.m161277a(n9c0.f140856p1));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.tagTextView, layoutParams);
        setBackground(n3d0.m161278b(obc0.f146261Z6));
    }

    @NotNull
    public final TextView getTagTextView() {
        return this.tagTextView;
    }

    @NotNull
    public final BLiveVoiceChatTopic getVoiceTopic() {
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.voiceTopic;
        if (bLiveVoiceChatTopic != null) {
            return bLiveVoiceChatTopic;
        }
        Intrinsics.m88391r("voiceTopic");
        return null;
    }

    public final void setTagText(@NotNull String tagText) {
        tagText.getClass();
        this.tagTextView.setText(tagText);
    }

    public final void setVoiceTopic(@NotNull BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        bLiveVoiceChatTopic.getClass();
        this.voiceTopic = bLiveVoiceChatTopic;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PreviewTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PreviewTagView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PreviewTagView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
