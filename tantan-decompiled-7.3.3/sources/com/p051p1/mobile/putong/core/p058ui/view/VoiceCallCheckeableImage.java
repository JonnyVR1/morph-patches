package com.p051p1.mobile.putong.core.p058ui.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.view.VoiceCallCheckeableImage;
import com.p051p1.mobile.putong.data.ResourceDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p153l.bnl0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u000fR\"\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u000fR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/view/VoiceCallCheckeableImage;", "Lv/VImage;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checked", "", "setChecked", "(Z)V", "setCheckedNoListener", "onFinishInflate", "()V", "isChecked", "()Z", "toggle", "extraSpace", "", "onCreateDrawableState", "(I)[I", "setCheckWithoutCallback", Constants.INAPP_DATA_TAG, "Z", "isCheck", "setCheck", "Lcom/p1/mobile/putong/core/ui/view/VoiceCallCheckeableImage$a;", "e", "Lcom/p1/mobile/putong/core/ui/view/VoiceCallCheckeableImage$a;", "getCheckChangeListener", "()Lcom/p1/mobile/putong/core/ui/view/VoiceCallCheckeableImage$a;", "setCheckChangeListener", "(Lcom/p1/mobile/putong/core/ui/view/VoiceCallCheckeableImage$a;)V", "checkChangeListener", "a", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceCallCheckeableImage extends VImage implements Checkable {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isCheck;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InterfaceC9097a checkChangeListener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.VoiceCallCheckeableImage$a */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/view/VoiceCallCheckeableImage$a;", "", "Lv/VImage;", ResourceDirection.f39656v, "", "checked", "", "a", "(Lv/VImage;Z)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC9097a {
        /* JADX INFO: renamed from: a */
        void mo57366a(@NotNull VImage v2, boolean checked);
    }

    public /* synthetic */ VoiceCallCheckeableImage(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h */
    public static void m57365h(VoiceCallCheckeableImage voiceCallCheckeableImage, View view) {
        voiceCallCheckeableImage.toggle();
    }

    @Nullable
    public final InterfaceC9097a getCheckChangeListener() {
        return this.checkChangeListener;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isCheck;
    }

    @Override // android.widget.ImageView, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.state_checked});
        }
        iArrOnCreateDrawableState.getClass();
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.jxm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceCallCheckeableImage.m57365h(this.f123049a, view);
            }
        });
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    public final void setCheckChangeListener(@Nullable InterfaceC9097a interfaceC9097a) {
        this.checkChangeListener = interfaceC9097a;
    }

    public final void setCheckWithoutCallback(boolean checked) {
        if (this.isCheck != checked) {
            this.isCheck = checked;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.isCheck != checked) {
            this.isCheck = checked;
            refreshDrawableState();
            InterfaceC9097a interfaceC9097a = this.checkChangeListener;
            if (interfaceC9097a != null) {
                interfaceC9097a.mo57366a(this, checked);
            }
        }
    }

    public final void setCheckedNoListener(boolean checked) {
        if (this.isCheck != checked) {
            this.isCheck = checked;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.isCheck);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceCallCheckeableImage(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceCallCheckeableImage(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceCallCheckeableImage(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
