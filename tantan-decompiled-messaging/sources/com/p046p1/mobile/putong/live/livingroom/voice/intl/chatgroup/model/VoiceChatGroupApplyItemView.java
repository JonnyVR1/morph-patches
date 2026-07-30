package com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.axm0;
import p149l.wk3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/model/VoiceChatGroupApplyItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "voiceChatGroupApply", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/model/VoiceChatGroupApplyItemView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/model/VoiceChatGroupApplyItemView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/model/VoiceChatGroupApplyItemView;)V", "_root", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_profile", "()Lv/VDraweeView;", "set_profile", "(Lv/VDraweeView;)V", "_profile", "Lv/VText;", "f", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "g", "get_agree_btn", "set_agree_btn", "_agree_btn", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceChatGroupApplyItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VoiceChatGroupApplyItemView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _profile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _agree_btn;

    public /* synthetic */ VoiceChatGroupApplyItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final VText get_agree_btn() {
        VText vText = this._agree_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_agree_btn");
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
    public final VDraweeView get_profile() {
        VDraweeView vDraweeView = this._profile;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_profile");
        return null;
    }

    @NotNull
    public final VoiceChatGroupApplyItemView get_root() {
        VoiceChatGroupApplyItemView voiceChatGroupApplyItemView = this._root;
        if (voiceChatGroupApplyItemView != null) {
            return voiceChatGroupApplyItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78100h0(View view) {
        axm0.m99455a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78101i0(@NotNull BLiveVoiceChatGroupApply voiceChatGroupApply) {
        voiceChatGroupApply.getClass();
        wk3.m203643b(get_profile(), voiceChatGroupApply.mask, true);
        get_name().setText(voiceChatGroupApply.mask.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78100h0(this);
    }

    public final void set_agree_btn(@NotNull VText vText) {
        vText.getClass();
        this._agree_btn = vText;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_profile(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._profile = vDraweeView;
    }

    public final void set_root(@NotNull VoiceChatGroupApplyItemView voiceChatGroupApplyItemView) {
        voiceChatGroupApplyItemView.getClass();
        this._root = voiceChatGroupApplyItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceChatGroupApplyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceChatGroupApplyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceChatGroupApplyItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
