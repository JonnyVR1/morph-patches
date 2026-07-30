package com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cxq;
import p149l.nxm0;
import p149l.pxm0;
import p149l.s7m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "Landroid/widget/LinearLayout;", "Ll/s7m;", "Ll/nxm0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "presenter", "", "c", "(Ll/nxm0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "()V", "C0", "()Landroid/content/Context;", "onFinishInflate", "r", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "a", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;)V", "_root", "Ll/nxm0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceChatGroupEnterView extends LinearLayout implements s7m<nxm0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VoiceChatGroupEnterView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public nxm0 presenter;

    public /* synthetic */ VoiceChatGroupEnterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m78094a(VoiceChatGroupEnterView voiceChatGroupEnterView, View view) {
        view.getClass();
        nxm0 nxm0Var = voiceChatGroupEnterView.presenter;
        if (nxm0Var != null) {
            nxm0Var.mo128714K3();
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        nxm0 nxm0Var = this.presenter;
        if (nxm0Var != null) {
            return nxm0Var.act();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m78095b(View view) {
        pxm0.m171917a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable nxm0 presenter) {
        this.presenter = presenter;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @NotNull
    public final VoiceChatGroupEnterView get_root() {
        VoiceChatGroupEnterView voiceChatGroupEnterView = this._root;
        if (voiceChatGroupEnterView != null) {
            return voiceChatGroupEnterView;
        }
        Intrinsics.m87502r("_root");
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
        m78095b(this);
        m78097r();
    }

    /* JADX INFO: renamed from: r */
    public final void m78097r() {
        cxq.m109105c(get_root(), new Function1() { // from class: l.oxm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceChatGroupEnterView.m78094a(this.f146223a, (View) obj);
            }
        });
    }

    public final void set_root(@NotNull VoiceChatGroupEnterView voiceChatGroupEnterView) {
        voiceChatGroupEnterView.getClass();
        this._root = voiceChatGroupEnterView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceChatGroupEnterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceChatGroupEnterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceChatGroupEnterView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
