package com.p051p1.mobile.putong.live.external.intl.common.gameguide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLivePopUp;
import com.p051p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p051p1.mobile.putong.live.external.intl.common.gameguide.IntlGameGuideDialogView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VText;
import p153l.bnl0;
import p153l.q3d0;
import p153l.uqb0;
import p153l.xjn;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010>\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109¨\u0006?"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/common/gameguide/IntlGameGuideDialogView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "data", "", "isLiveType", "f", "(Lcom/p1/mobile/putong/live/base/data/BLivePopUp;Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "e", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "a", "Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "get_avatar", "()Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;", "set_avatar", "(Lcom/p1/mobile/putong/live/base/view/LiveHaloAvatar;)V", "_avatar", "Lv/VText;", "b", "Lv/VText;", "get_name", "()Lv/VText;", "set_name", "(Lv/VText;)V", "_name", "c", "get_content", "set_content", "_content", "Lv/VButton;", Constants.INAPP_DATA_TAG, "Lv/VButton;", "get_btn_positive", "()Lv/VButton;", "set_btn_positive", "(Lv/VButton;)V", "_btn_positive", "get_btn_negative", "set_btn_negative", "_btn_negative", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getSureAction", "()Lkotlin/jvm/functions/Function0;", "setSureAction", "(Lkotlin/jvm/functions/Function0;)V", "sureAction", "g", "getDismissAction", "setDismissAction", "dismissAction", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlGameGuideDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LiveHaloAvatar _avatar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VButton _btn_positive;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _btn_negative;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> sureAction;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> dismissAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlGameGuideDialogView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static void m71108a(IntlGameGuideDialogView intlGameGuideDialogView, View view) {
        Function0<Unit> function0 = intlGameGuideDialogView.sureAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m71109b(IntlGameGuideDialogView intlGameGuideDialogView, View view) {
        Function0<Unit> function0 = intlGameGuideDialogView.sureAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m71110c(IntlGameGuideDialogView intlGameGuideDialogView, View view) {
        Function0<Unit> function0 = intlGameGuideDialogView.dismissAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m71111d(IntlGameGuideDialogView intlGameGuideDialogView, Bitmap bitmap) {
        intlGameGuideDialogView.get_avatar().setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: e */
    public final void m71112e(View view) {
        xjn.m211238a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m71113f(@NotNull BLivePopUp data, boolean isLiveType) {
        data.getClass();
        int color = Color.parseColor(isLiveType ? "#FFFF60E4" : "#FF32C3BB");
        get_avatar().m69914c(color, color);
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(data.anchorAvatar).m8661O(new q3d0(get_avatar().getAvatarSize(), get_avatar().getAvatarSize(), 0.0f, 0.0f, 12, null)).m8668a();
        imageRequestM8668a.getClass();
        uqb0.f180374G.m127102F(imageRequestM8668a, new y20() { // from class: l.tjn
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlGameGuideDialogView.m71111d(this.f174598a, (Bitmap) obj);
            }
        });
        get_name().setText(data.anchorName);
        get_content().setText(data.contentText);
        bnl0.m105509E0(get_btn_positive(), new View.OnClickListener() { // from class: l.ujn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlGameGuideDialogView.m71108a(this.f179302a, view);
            }
        });
        bnl0.m105509E0(get_avatar(), new View.OnClickListener() { // from class: l.vjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlGameGuideDialogView.m71109b(this.f184430a, view);
            }
        });
        bnl0.m105509E0(get_btn_negative(), new View.OnClickListener() { // from class: l.wjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlGameGuideDialogView.m71110c(this.f189473a, view);
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
    public final LiveHaloAvatar get_avatar() {
        LiveHaloAvatar liveHaloAvatar = this._avatar;
        if (liveHaloAvatar != null) {
            return liveHaloAvatar;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_btn_negative() {
        VText vText = this._btn_negative;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_btn_negative");
        return null;
    }

    @NotNull
    public final VButton get_btn_positive() {
        VButton vButton = this._btn_positive;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_btn_positive");
        return null;
    }

    @NotNull
    public final VText get_content() {
        VText vText = this._content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_name");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71112e(this);
    }

    public final void setDismissAction(@Nullable Function0<Unit> function0) {
        this.dismissAction = function0;
    }

    public final void setSureAction(@Nullable Function0<Unit> function0) {
        this.sureAction = function0;
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
