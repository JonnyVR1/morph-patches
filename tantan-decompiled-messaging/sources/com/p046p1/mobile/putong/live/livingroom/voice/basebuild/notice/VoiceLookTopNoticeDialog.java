package com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceLookTopNoticeDialog;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.byr;
import p149l.h1c0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.pwn0;
import p149l.qwn0;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u000eJ\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceLookTopNoticeDialog;", "Landroid/widget/LinearLayout;", "Ll/s7m;", "Ll/pwn0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", RXScreenCaptureService.KEY_INDEX, "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "r", "e", "j", "", "text", "k", "(Ljava/lang/String;)V", "presenter", "c", "(Ll/pwn0;)V", "", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljava/lang/Void;", "destroy", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/android/app/Act;", "a", "Landroid/view/View;", "get_empty", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/LinearLayout;", "get_container", "()Landroid/widget/LinearLayout;", "set_container", "(Landroid/widget/LinearLayout;)V", "_container", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_container_title", "()Landroid/widget/TextView;", "set_container_title", "(Landroid/widget/TextView;)V", "_container_title", "Landroid/widget/EditText;", "Landroid/widget/EditText;", "get_container_room_notice", "()Landroid/widget/EditText;", "set_container_room_notice", "(Landroid/widget/EditText;)V", "_container_room_notice", "Ll/pwn0;", "Ll/byr;", "Ll/byr;", OMSTemplateType.dialog, "g", "Ljava/lang/String;", "currentNotice", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceLookTopNoticeDialog extends LinearLayout implements s7m<pwn0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _container_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public EditText _container_room_notice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public pwn0 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public byr dialog;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String currentNotice;

    public /* synthetic */ VoiceLookTopNoticeDialog(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m77718a(VoiceLookTopNoticeDialog voiceLookTopNoticeDialog, View view) {
        voiceLookTopNoticeDialog.m77723e();
    }

    /* JADX INFO: renamed from: i */
    private final void m77719i() {
        xdl0.m208329E0(get_empty(), new View.OnClickListener() { // from class: l.mwn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceLookTopNoticeDialog.m77718a(this.f136073a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m77720b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM176874b = qwn0.m176874b(this, inflater, parent);
        viewM176874b.getClass();
        return viewM176874b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable pwn0 presenter) {
        this.presenter = presenter;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Act getContext() {
        pwn0 pwn0Var = this.presenter;
        if (pwn0Var != null) {
            return pwn0Var.act();
        }
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m77723e() {
        byr byrVar;
        byr byrVar2 = this.dialog;
        if (byrVar2 != null) {
            byrVar2.getClass();
            if (!byrVar2.isShowing() || (byrVar = this.dialog) == null) {
                return;
            }
            byrVar.dismiss();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Void m77724f(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
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
    public final EditText get_container_room_notice() {
        EditText editText = this._container_room_notice;
        if (editText != null) {
            return editText;
        }
        Intrinsics.m87502r("_container_room_notice");
        return null;
    }

    @NotNull
    public final TextView get_container_title() {
        TextView textView = this._container_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_container_title");
        return null;
    }

    @NotNull
    public final View get_empty() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @Override // p149l.s7m
    public /* bridge */ /* synthetic */ View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (View) m77724f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m77725j() {
        byr byrVar;
        m77727r();
        byr byrVar2 = this.dialog;
        if (byrVar2 != null) {
            byrVar2.getClass();
            if (byrVar2.isShowing() || (byrVar = this.dialog) == null) {
                return;
            }
            byrVar.show();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m77726k(@NotNull String text) {
        text.getClass();
        if (TextUtils.isEmpty(text)) {
            Act act = act();
            text = act != null ? act.getString(R$string.f46598Bj) : null;
        }
        this.currentNotice = text;
    }

    /* JADX INFO: renamed from: r */
    public final void m77727r() {
        if (this.dialog == null) {
            pwn0 pwn0Var = this.presenter;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            layoutInflaterFrom.getClass();
            this.dialog = new byr(pwn0Var, m77720b(layoutInflaterFrom, null));
            m77719i();
        }
        get_container_room_notice().setText(this.currentNotice);
        get_container().setBackground(kvc0.m147353b(i3c0.f111189v));
        get_container_title().setTextColor(kvc0.m147352a(h1c0.f105395p1));
        get_container_title().getPaint().setFakeBoldText(true);
        get_container_room_notice().setTextColor(kvc0.m147352a(h1c0.f105395p1));
    }

    public final void set_container(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._container = linearLayout;
    }

    public final void set_container_room_notice(@NotNull EditText editText) {
        editText.getClass();
        this._container_room_notice = editText;
    }

    public final void set_container_title(@NotNull TextView textView) {
        textView.getClass();
        this._container_title = textView;
    }

    public final void set_empty(@NotNull View view) {
        view.getClass();
        this._empty = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceLookTopNoticeDialog(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceLookTopNoticeDialog(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.currentNotice = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceLookTopNoticeDialog(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
