package com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cxq;
import p149l.i3c0;
import p149l.kvc0;
import p149l.nnn0;
import p149l.ovo0;
import p149l.s7m;
import p149l.t100;
import p149l.tvo0;
import p149l.x4s;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00109¨\u0006:"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "Landroid/widget/LinearLayout;", "Ll/s7m;", "Ll/ovo0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "r", "e", "presenter", "c", "(Ll/ovo0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "C0", "()Landroid/content/Context;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "", Constants.INAPP_DATA_TAG, "()Z", "a", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "get_notice", "()Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;", "set_notice", "(Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeView;)V", "_notice", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_notice_image", "()Landroid/widget/ImageView;", "set_notice_image", "(Landroid/widget/ImageView;)V", "_notice_image", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_notice_title", "()Landroid/widget/TextView;", "set_notice_title", "(Landroid/widget/TextView;)V", "_notice_title", "Ll/ovo0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceTopNoticeView extends LinearLayout implements s7m<ovo0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VoiceTopNoticeView _notice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView _notice_image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _notice_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public ovo0 presenter;

    public /* synthetic */ VoiceTopNoticeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m77739a(VoiceTopNoticeView voiceTopNoticeView, View view) {
        view.getClass();
        ovo0 ovo0Var = voiceTopNoticeView.presenter;
        if (ovo0Var != null) {
            ovo0Var.mo156574K3();
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m77740b(View view) {
        tvo0.m190770a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull ovo0 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final boolean m77742d() {
        nnn0 nnn0Var;
        BLiveVoice bLiveVoiceMo149813j;
        ovo0 ovo0Var = this.presenter;
        if (ovo0Var == null || (nnn0Var = (nnn0) ovo0Var.m206027E2()) == null || (bLiveVoiceMo149813j = nnn0Var.mo149813j()) == null) {
            return false;
        }
        return x4s.m207012b(bLiveVoiceMo149813j.liveMode);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m77743e() {
        xdl0.m208345M0(this, true);
        if (!m77742d()) {
            xdl0.m208359W(this, -t100.m186890d(5.0f));
            xdl0.m208344M(get_notice_title(), false);
            return;
        }
        setBackground(kvc0.m147353b(i3c0.f110805O));
        xdl0.m208325C0(this, t100.m186890d(26.0f));
        get_notice_image().setImageDrawable(kvc0.m147353b(i3c0.f110732Ha));
        TextView textView = get_notice_title();
        textView.setText(kvc0.m147355d(R$string.f46752Ij));
        textView.setTextSize(12.0f);
    }

    @NotNull
    public final VoiceTopNoticeView get_notice() {
        VoiceTopNoticeView voiceTopNoticeView = this._notice;
        if (voiceTopNoticeView != null) {
            return voiceTopNoticeView;
        }
        Intrinsics.m87502r("_notice");
        return null;
    }

    @NotNull
    public final ImageView get_notice_image() {
        ImageView imageView = this._notice_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_notice_image");
        return null;
    }

    @NotNull
    public final TextView get_notice_title() {
        TextView textView = this._notice_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_notice_title");
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77740b(this);
        m77744r();
    }

    /* JADX INFO: renamed from: r */
    public final void m77744r() {
        cxq.m109105c(get_notice(), new Function1() { // from class: l.svo0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceTopNoticeView.m77739a(this.f166585a, (View) obj);
            }
        });
    }

    public final void set_notice(@NotNull VoiceTopNoticeView voiceTopNoticeView) {
        voiceTopNoticeView.getClass();
        this._notice = voiceTopNoticeView;
    }

    public final void set_notice_image(@NotNull ImageView imageView) {
        imageView.getClass();
        this._notice_image = imageView;
    }

    public final void set_notice_title(@NotNull TextView textView) {
        textView.getClass();
        this._notice_title = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceTopNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceTopNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceTopNoticeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
