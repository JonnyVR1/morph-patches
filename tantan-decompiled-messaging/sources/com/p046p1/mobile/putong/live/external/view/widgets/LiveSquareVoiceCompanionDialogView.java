package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSquareVoiceCompanionDialogView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VText;
import p149l.d5u;
import p149l.e30;
import p149l.nvc0;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010)\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R*\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/view/widgets/LiveSquareVoiceCompanionDialogView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "data", "e", "(Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;)V", "Landroid/view/View;", OMSTemplateModeType.view, Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "a", "Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "get_avatar", "()Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "set_avatar", "(Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;)V", "_avatar", "Lv/VText;", "b", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "c", "get_age", "set_age", "_age", "get_content", "set_content", "_content", "Lv/VButton;", "Lv/VButton;", "get_btn_positive", "()Lv/VButton;", "set_btn_positive", "(Lv/VButton;)V", "_btn_positive", "f", "get_btn_negative", "set_btn_negative", "_btn_negative", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "getSureAction", "()Lkotlin/jvm/functions/Function0;", "setSureAction", "(Lkotlin/jvm/functions/Function0;)V", "sureAction", "h", "getDismissAction", "setDismissAction", "dismissAction", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveSquareVoiceCompanionDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LiveHaloAvatar _avatar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VButton _btn_positive;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _btn_negative;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> sureAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> dismissAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSquareVoiceCompanionDialogView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m70912a(LiveSquareVoiceCompanionDialogView liveSquareVoiceCompanionDialogView, Bitmap bitmap) {
        liveSquareVoiceCompanionDialogView.get_avatar().setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: b */
    public static void m70913b(LiveSquareVoiceCompanionDialogView liveSquareVoiceCompanionDialogView, View view) {
        Function0<Unit> function0 = liveSquareVoiceCompanionDialogView.dismissAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m70914c(LiveSquareVoiceCompanionDialogView liveSquareVoiceCompanionDialogView, View view) {
        Function0<Unit> function0 = liveSquareVoiceCompanionDialogView.sureAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m70915d(View view) {
        d5u.m110071a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m70916e(@NotNull BLiveAnchors data) {
        data.getClass();
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(data.avatar.url).m8607O(new nvc0(get_avatar().getAvatarSize(), get_avatar().getAvatarSize(), 0.0f, 0.0f, 12, null)).m8614a();
        imageRequestM8614a.getClass();
        qib0.f154691G.m102318F(imageRequestM8614a, new e30() { // from class: l.a5u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareVoiceCompanionDialogView.m70912a(this.f67723a, (Bitmap) obj);
            }
        });
        get_name().setText(data.userName);
        ViewGroup.LayoutParams layoutParams = get_name().getLayoutParams();
        layoutParams.getClass();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = xdl0.m208407w(2.0f);
        get_name().setLayoutParams(layoutParams2);
        get_btn_negative().setText(getContext().getString(R$string.f44872J));
        xdl0.m208329E0(get_btn_positive(), new View.OnClickListener() { // from class: l.b5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSquareVoiceCompanionDialogView.m70914c(this.f73699a, view);
            }
        });
        xdl0.m208329E0(get_btn_negative(), new View.OnClickListener() { // from class: l.c5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSquareVoiceCompanionDialogView.m70913b(this.f79419a, view);
            }
        });
    }

    @Nullable
    public final Function0<Unit> getDismissAction() {
        return this.dismissAction;
    }

    @Nullable
    public final Function0<Unit> getSureAction() {
        return this.sureAction;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age");
        return null;
    }

    @NotNull
    public final LiveHaloAvatar get_avatar() {
        LiveHaloAvatar liveHaloAvatar = this._avatar;
        if (liveHaloAvatar != null) {
            return liveHaloAvatar;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_btn_negative() {
        VText vText = this._btn_negative;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_btn_negative");
        return null;
    }

    @NotNull
    public final VButton get_btn_positive() {
        VButton vButton = this._btn_positive;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_btn_positive");
        return null;
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
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_name");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70915d(this);
    }

    public final void setDismissAction(@Nullable Function0<Unit> function0) {
        this.dismissAction = function0;
    }

    public final void setSureAction(@Nullable Function0<Unit> function0) {
        this.sureAction = function0;
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_avatar(@NotNull LiveHaloAvatar liveHaloAvatar) {
        liveHaloAvatar.getClass();
        this._avatar = liveHaloAvatar;
    }

    public final void set_btn_negative(@NotNull VText vText) {
        vText.getClass();
        this._btn_negative = vText;
    }

    public final void set_btn_positive(@NotNull VButton vButton) {
        vButton.getClass();
        this._btn_positive = vButton;
    }

    public final void set_content(@NotNull VText vText) {
        vText.getClass();
        this._content = vText;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }
}
