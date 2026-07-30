package com.p000p1.mobile.putong.core.p004ui.seeblindbox;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.a8e0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import p006l.x2c0;
import p006l.z7e0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\u000e¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010E\u001a\u0004\bK\u0010G\"\u0004\bL\u0010I¨\u0006N"}, d2 = {"Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Lcom/p1/mobile/putong/data/User;", "user", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/SwipeDirection;Lcom/p1/mobile/putong/data/User;)V", "", "isShow", "d", "(Z)V", "e", "", "url", "f", "(Ljava/lang/String;)V", "g", "b", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Lv/VDraweeView;", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "get_anim", "()Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;", "set_anim", "(Lcom/tantanapp/media/ttmediaeffect/anim/AnimEffectPlayer;)V", "_anim", "Lv/VImage;", "Lv/VImage;", "get_tag", "()Lv/VImage;", "set_tag", "(Lv/VImage;)V", "_tag", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_info_container", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_info_container", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_info_container", "Lv/VText;", "Lv/VText;", "get_info_container_name", "()Lv/VText;", "set_info_container_name", "(Lv/VText;)V", "_info_container_name", "get_info_container_age", "set_info_container_age", "_info_container_age", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class SeeBlindBoxItem extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public AnimEffectPlayer _anim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _info_container;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _info_container_name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _info_container_age;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.seeblindbox.SeeBlindBoxItem$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem$a", "Lcom/tantanapp/media/ttmediaeffect/anim/AnimListener;", "", "onFinished", "()V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0279a extends AnimListener {
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeBlindBoxItem(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m8312a(View view) {
        a8e0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m8313b() {
        get_anim().setVisibility(8);
    }

    /* JADX INFO: renamed from: c */
    public final void m8314c(@NotNull Act act, @Nullable SwipeDirection swipeDirection, @NotNull User user) {
        act.getClass();
        user.getClass();
        qib0.f19782G.m12727D(get_image(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlBTSkVKQVBTTExUNlVQUlZXT1JBUERSUVNMMkRJNDE0IiwidyI6NDgzLCJoIjo2MzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5MDM1MzMzNTMyMzk1MzQ1Nzg4fQ.webp");
        qib0.f19782G.m12744L0(get_image(), user.picture(0).profileMiddle().formatted());
        get_info_container_name().setTypeface(Typeface.DEFAULT_BOLD);
        get_info_container_name().setText(user.name);
        get_info_container_age().setText(String.valueOf(user.age.intValue()));
        get_tag().setBackgroundResource(swipeDirection == SwipeDirection.LEFT ? x2c0.f25893Gb : x2c0.f25924Hb);
        m8315d(true);
        m8316e(swipeDirection != null);
        if (swipeDirection != null) {
            z7e0.INSTANCE.m28622g(act, swipeDirection, user);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8315d(boolean isShow) {
        xdl0.M0(get_info_container(), isShow);
    }

    /* JADX INFO: renamed from: e */
    public final void m8316e(boolean isShow) {
        xdl0.M0(get_tag(), isShow);
    }

    /* JADX INFO: renamed from: f */
    public final void m8317f(@NotNull String url) {
        url.getClass();
        get_anim().setVisibility(0);
        get_anim().loadAnimWithListener(url, -1, new C0279a(), true);
    }

    /* JADX INFO: renamed from: g */
    public final void m8318g() {
        if (get_anim().getVisibility() == 0 && get_anim().isAnimating()) {
            get_anim().stopAnimation(false);
        }
    }

    @NotNull
    public final AnimEffectPlayer get_anim() {
        AnimEffectPlayer animEffectPlayer = this._anim;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_anim");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    public final ConstraintLayout get_info_container() {
        ConstraintLayout constraintLayout = this._info_container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.r("_info_container");
        return null;
    }

    @NotNull
    public final VText get_info_container_age() {
        VText vText = this._info_container_age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_info_container_age");
        return null;
    }

    @NotNull
    public final VText get_info_container_name() {
        VText vText = this._info_container_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_info_container_name");
        return null;
    }

    @NotNull
    public final VImage get_tag() {
        VImage vImage = this._tag;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_tag");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8312a(this);
    }

    public final void set_anim(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._anim = animEffectPlayer;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_info_container(@NotNull ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this._info_container = constraintLayout;
    }

    public final void set_info_container_age(@NotNull VText vText) {
        vText.getClass();
        this._info_container_age = vText;
    }

    public final void set_info_container_name(@NotNull VText vText) {
        vText.getClass();
        this._info_container_name = vText;
    }

    public final void set_tag(@NotNull VImage vImage) {
        vImage.getClass();
        this._tag = vImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeBlindBoxItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeBlindBoxItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeBlindBoxItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }
}
