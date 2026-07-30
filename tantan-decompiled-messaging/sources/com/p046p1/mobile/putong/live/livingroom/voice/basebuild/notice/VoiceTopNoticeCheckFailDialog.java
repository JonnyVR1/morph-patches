package com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeCheckFailDialog;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.f2s;
import p149l.h1c0;
import p149l.hvo0;
import p149l.i3c0;
import p149l.ivo0;
import p149l.kvc0;
import p149l.nnn0;
import p149l.s7m;
import p149l.x4s;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ%\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010>\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u0018\u0010A\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010@R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010B¨\u0006C"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceTopNoticeCheckFailDialog;", "Landroid/widget/FrameLayout;", "Ll/s7m;", "Ll/hvo0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "k", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "c", "(Ll/hvo0;)V", "", Message.RULE, BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)V", "f", "", RXScreenCaptureService.KEY_INDEX, "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljava/lang/Void;", "destroy", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "", "j", "()Z", "Landroid/widget/LinearLayout;", "a", "Landroid/widget/LinearLayout;", "get_container", "()Landroid/widget/LinearLayout;", "set_container", "(Landroid/widget/LinearLayout;)V", "_container", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_dialog_title", "()Landroid/widget/TextView;", "set_dialog_title", "(Landroid/widget/TextView;)V", "_dialog_title", "get_rule", "set_rule", "_rule", "get_argue_continue", "set_argue_continue", "_argue_continue", "Ll/f2s;", "Ll/f2s;", OMSTemplateType.dialog, "Ll/hvo0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceTopNoticeCheckFailDialog extends FrameLayout implements s7m<hvo0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LinearLayout _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _dialog_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _rule;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _argue_continue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public f2s dialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public hvo0 presenter;

    public /* synthetic */ VoiceTopNoticeCheckFailDialog(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m77728a(VoiceTopNoticeCheckFailDialog voiceTopNoticeCheckFailDialog, View view) {
        voiceTopNoticeCheckFailDialog.m77735f();
        hvo0 hvo0Var = voiceTopNoticeCheckFailDialog.presenter;
        if (hvo0Var != null) {
            hvo0Var.m133195J3();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m77729k() {
        xdl0.m208329E0(get_argue_continue(), new View.OnClickListener() { // from class: l.gvo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceTopNoticeCheckFailDialog.m77728a(this.f104585a, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    private final void m77730r() {
        if (this.dialog == null) {
            hvo0 hvo0Var = this.presenter;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            layoutInflaterFrom.getClass();
            this.dialog = new f2s(hvo0Var, m77731b(layoutInflaterFrom, null));
            m77729k();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m77731b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM138631b = ivo0.m138631b(this, inflater, parent);
        viewM138631b.getClass();
        return viewM138631b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable hvo0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: d */
    public final void m77733d() {
        if (m77737j()) {
            get_container().setBackground(kvc0.m147353b(i3c0.f111153s));
            get_dialog_title().setTextColor(kvc0.m147352a(h1c0.f105395p1));
            get_rule().setTextColor(kvc0.m147352a(h1c0.f105386m1));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Act getContext() {
        hvo0 hvo0Var = this.presenter;
        if (hvo0Var != null) {
            return hvo0Var.act();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m77735f() {
        f2s f2sVar;
        f2s f2sVar2 = this.dialog;
        if (f2sVar2 != null) {
            f2sVar2.getClass();
            if (!f2sVar2.isShowing() || (f2sVar = this.dialog) == null) {
                return;
            }
            f2sVar.dismiss();
        }
    }

    @NotNull
    public final TextView get_argue_continue() {
        TextView textView = this._argue_continue;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_argue_continue");
        return null;
    }

    @NotNull
    public final LinearLayout get_container() {
        LinearLayout linearLayout = this._container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    public final TextView get_dialog_title() {
        TextView textView = this._dialog_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_dialog_title");
        return null;
    }

    @NotNull
    public final TextView get_rule() {
        TextView textView = this._rule;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_rule");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public Void m77736i(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @Override // p149l.s7m
    public /* bridge */ /* synthetic */ View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (View) m77736i(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final boolean m77737j() {
        nnn0 nnn0Var;
        BLiveVoice bLiveVoiceMo149813j;
        hvo0 hvo0Var = this.presenter;
        if (hvo0Var == null || (nnn0Var = (nnn0) hvo0Var.m206027E2()) == null || (bLiveVoiceMo149813j = nnn0Var.mo149813j()) == null) {
            return false;
        }
        return x4s.m207012b(bLiveVoiceMo149813j.liveMode);
    }

    /* JADX INFO: renamed from: l */
    public final void m77738l(@NotNull String rule) {
        f2s f2sVar;
        rule.getClass();
        m77730r();
        m77733d();
        get_rule().setText(rule);
        f2s f2sVar2 = this.dialog;
        if (f2sVar2 != null) {
            f2sVar2.getClass();
            if (f2sVar2.isShowing() || (f2sVar = this.dialog) == null) {
                return;
            }
            f2sVar.show();
        }
    }

    public final void set_argue_continue(@NotNull TextView textView) {
        textView.getClass();
        this._argue_continue = textView;
    }

    public final void set_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._container = linearLayout;
    }

    public final void set_dialog_title(@NotNull TextView textView) {
        textView.getClass();
        this._dialog_title = textView;
    }

    public final void set_rule(@NotNull TextView textView) {
        textView.getClass();
        this._rule = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceTopNoticeCheckFailDialog(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceTopNoticeCheckFailDialog(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceTopNoticeCheckFailDialog(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
