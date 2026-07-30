package com.p046p1.mobile.putong.core.newui.mytab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.core.newui.mytab.AvatarsCarouselView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.cn5;
import p149l.e51;
import p149l.e9c0;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\n098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\r098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010D\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010CR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010Q¨\u0006S"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/mytab/AvatarsCarouselView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "o", "()Ljava/lang/String;", "Lv/VDraweeView;", OMSTemplateModeType.view, "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f44444l, "(Lv/VDraweeView;)Landroid/animation/Animator;", "j", "m", "currentState", "k", "(ILv/VDraweeView;)I", "", "p", "(Lv/VDraweeView;)V", "nextState", RXScreenCaptureService.KEY_INDEX, "(ILv/VDraweeView;)Landroid/animation/Animator;", "n", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "q", "", "blur", "setAvatarBlur", "(Z)V", "", "startDelay", "setStartDelay", "(J)V", "count", "setRepeatCount", "(I)V", "", "a", "F", "imageBorder", "b", "imageRadius", "c", "imageSize", Constants.INAPP_DATA_TAG, "imageOffset", "", "e", "Ljava/util/List;", "carouselImages", "f", "I", "carouselImageCount", "g", "carouselViews", "h", "J", BLiveOperationTitleShowType.duration, "carouselInternal", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "carouselAnimatorSet", "Landroid/view/animation/DecelerateInterpolator;", "Landroid/view/animation/DecelerateInterpolator;", "interpolator", "maxCarouselRepeatCount", "currentCarouselCount", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "carouselAnimRunnable", "Z", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class AvatarsCarouselView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float imageBorder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float imageRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public float imageSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float imageOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<String> carouselImages;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int carouselImageCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<VDraweeView> carouselViews;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long duration;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long carouselInternal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long startDelay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public AnimatorSet carouselAnimatorSet;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final DecelerateInterpolator interpolator;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int maxCarouselRepeatCount;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int currentCarouselCount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Runnable carouselAnimRunnable;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean blur;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.mytab.AvatarsCarouselView$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/newui/mytab/AvatarsCarouselView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8194b extends AnimatorListenerAdapter {
        public C8194b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            e51.m114743H(AvatarsCarouselView.this.getContext(), AvatarsCarouselView.this.carouselAnimRunnable, AvatarsCarouselView.this.carouselInternal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvatarsCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        int i2 = t100.f167254c;
        this.imageBorder = i2;
        int i3 = t100.f167262k;
        float f = i3;
        this.imageRadius = f;
        this.imageSize = f * 2.0f;
        this.imageOffset = i2;
        this.carouselImages = new ArrayList();
        this.carouselImageCount = 4;
        this.carouselViews = new ArrayList();
        this.duration = 400L;
        this.carouselInternal = 800L;
        this.startDelay = 400L;
        this.interpolator = new DecelerateInterpolator();
        this.maxCarouselRepeatCount = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.carouselAnimRunnable = new Runnable() { // from class: l.cp1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m42674e(this.f81896a);
            }
        };
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90013a);
            typedArrayObtainStyledAttributes.getClass();
            int i4 = typedArrayObtainStyledAttributes.getInt(e9c0.f90019c, 4);
            this.carouselImageCount = i4;
            this.carouselImageCount = Math.max(i4, 1);
            float dimension = typedArrayObtainStyledAttributes.getDimension(e9c0.f90025e, i3);
            this.imageRadius = dimension;
            this.imageSize = 2.0f * dimension;
            this.imageOffset = typedArrayObtainStyledAttributes.getDimension(e9c0.f90022d, i2);
            this.imageBorder = typedArrayObtainStyledAttributes.getDimension(e9c0.f90016b, i2);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42670a(VDraweeView vDraweeView, AvatarsCarouselView avatarsCarouselView) {
        float f = avatarsCarouselView.imageRadius;
        vDraweeView.setTranslationX(((avatarsCarouselView.carouselImageCount - 2) * (avatarsCarouselView.imageOffset + f)) + f + f);
    }

    /* JADX INFO: renamed from: b */
    public static void m42671b(VDraweeView vDraweeView, AvatarsCarouselView avatarsCarouselView) {
        float f = avatarsCarouselView.imageRadius;
        vDraweeView.setTranslationX(((avatarsCarouselView.carouselImageCount - 2) * (avatarsCarouselView.imageOffset + f)) + f + f);
    }

    /* JADX INFO: renamed from: c */
    public static Comparable m42672c(VDraweeView vDraweeView) {
        vDraweeView.getClass();
        Object tag = vDraweeView.getTag(u4c0.f174271h0);
        tag.getClass();
        return (Integer) tag;
    }

    /* JADX INFO: renamed from: d */
    public static void m42673d(VDraweeView vDraweeView) {
        vDraweeView.setAlpha(1.0f);
        vDraweeView.setScaleX(1.0f);
        vDraweeView.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: e */
    public static void m42674e(AvatarsCarouselView avatarsCarouselView) {
        int i = avatarsCarouselView.currentCarouselCount + 1;
        avatarsCarouselView.currentCarouselCount = i;
        if (i <= avatarsCarouselView.maxCarouselRepeatCount) {
            avatarsCarouselView.m42683n();
        } else {
            avatarsCarouselView.m42686q();
        }
    }

    /* JADX INFO: renamed from: f */
    public static Comparable m42675f(VDraweeView vDraweeView) {
        vDraweeView.getClass();
        return Float.valueOf(vDraweeView.getTranslationX() * (-1.0f));
    }

    /* JADX INFO: renamed from: i */
    public final Animator m42678i(int nextState, VDraweeView view) {
        if (nextState != 0) {
            return nextState != 1 ? m42679j(view) : m42681l(view);
        }
        return m42682m(view);
    }

    /* JADX INFO: renamed from: j */
    public final Animator m42679j(final VDraweeView view) {
        view.setTag(u4c0.f174271h0, 0);
        float f = this.imageRadius;
        int i = this.carouselImageCount;
        float f2 = this.imageOffset;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.TRANSLATION_X, ((i - 2) * (f + f2)) + f + f, f + ((i - 2) * (f2 + f))));
        objectAnimatorOfPropertyValuesHolder.getClass();
        bt0.m103749v(objectAnimatorOfPropertyValuesHolder, new Runnable() { // from class: l.hp1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m42671b(view, this);
            }
        });
        objectAnimatorOfPropertyValuesHolder.setDuration(this.duration);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: k */
    public final int m42680k(int currentState, VDraweeView view) {
        if (currentState != 0) {
            return currentState != 1 ? 0 : -1;
        }
        return view.getTranslationX() <= this.imageRadius ? 1 : 0;
    }

    /* JADX INFO: renamed from: l */
    public final Animator m42681l(final VDraweeView view) {
        view.setTag(u4c0.f174271h0, 1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.TRANSLATION_X, view.getTranslationX(), 0.0f));
        objectAnimatorOfPropertyValuesHolder.getClass();
        bt0.m103733f(objectAnimatorOfPropertyValuesHolder, new Runnable() { // from class: l.gp1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m42670a(view, this);
            }
        });
        objectAnimatorOfPropertyValuesHolder.setDuration(this.duration);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: m */
    public final Animator m42682m(final VDraweeView view) {
        view.setTag(u4c0.f174271h0, 0);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.TRANSLATION_X, view.getTranslationX(), view.getTranslationX() - (this.imageRadius + this.imageOffset)));
        objectAnimatorOfPropertyValuesHolder.getClass();
        bt0.m103749v(objectAnimatorOfPropertyValuesHolder, new Runnable() { // from class: l.fp1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m42673d(view);
            }
        });
        objectAnimatorOfPropertyValuesHolder.setDuration(this.duration);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: n */
    public final void m42683n() {
        m42686q();
        ArrayList arrayList = new ArrayList();
        int size = this.carouselViews.size();
        for (int i = 0; i < size; i++) {
            VDraweeView vDraweeView = this.carouselViews.get(i);
            Object tag = vDraweeView.getTag(u4c0.f174271h0);
            tag.getClass();
            int iM42680k = m42680k(((Integer) tag).intValue(), vDraweeView);
            if (iM42680k == -1) {
                m42685p(vDraweeView);
            }
            arrayList.add(m42678i(iM42680k, vDraweeView));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.carouselAnimatorSet = animatorSet;
        animatorSet.addListener(new C8194b());
        AnimatorSet animatorSet2 = this.carouselAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(arrayList);
        }
        CollectionsKt.sortWith(this.carouselViews, cn5.m107731b(new Function1() { // from class: l.dp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AvatarsCarouselView.m42672c((VDraweeView) obj);
            }
        }, new Function1() { // from class: l.ep1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AvatarsCarouselView.m42675f((VDraweeView) obj);
            }
        }));
        Iterator<VDraweeView> it = this.carouselViews.iterator();
        while (it.hasNext()) {
            it.next().bringToFront();
        }
        AnimatorSet animatorSet3 = this.carouselAnimatorSet;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    /* JADX INFO: renamed from: o */
    public final String m42684o() {
        int iNextInt;
        if (vwb.m200296J(this.carouselImages)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int size = this.carouselViews.size();
        String str = null;
        for (int i = 0; i < size; i++) {
            VDraweeView vDraweeView = this.carouselViews.get(i);
            String str2 = (String) vDraweeView.getTag(u4c0.f174288i0);
            Object tag = vDraweeView.getTag(u4c0.f174271h0);
            tag.getClass();
            if (((Integer) tag).intValue() == 1) {
                str = str2;
            } else if (str2 != null) {
                arrayList.add(str2);
            }
        }
        if (this.carouselImages.size() <= arrayList.size()) {
            return str == null ? "" : str;
        }
        do {
            iNextInt = Random.INSTANCE.nextInt(this.carouselImages.size());
        } while (arrayList.contains(this.carouselImages.get(iNextInt)));
        return this.carouselImages.get(iNextInt);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i = this.carouselImageCount;
        if (i <= 1) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) this.imageSize, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int) this.imageSize, Integer.MIN_VALUE));
        } else {
            float f = this.imageRadius;
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((int) (((i - 2) * (this.imageOffset + f)) + f + this.imageSize + f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int) this.imageSize, Integer.MIN_VALUE));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m42685p(VDraweeView view) {
        String strM42684o = m42684o();
        if (TextUtils.isEmpty(strM42684o)) {
            return;
        }
        if (this.blur) {
            qib0.f154691G.m102336O(view, strM42684o, 2, 8);
        } else {
            qib0.f154691G.m102331L0(view, strM42684o);
        }
        view.setTag(u4c0.f174288i0, strM42684o);
    }

    /* JADX INFO: renamed from: q */
    public final void m42686q() {
        e51.m114745J(this.carouselAnimRunnable);
        AnimatorSet animatorSet = this.carouselAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void setAvatarBlur(boolean blur) {
        this.blur = blur;
    }

    public final void setRepeatCount(int count) {
        this.maxCarouselRepeatCount = count;
    }

    public final void setStartDelay(long startDelay) {
        this.startDelay = startDelay;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvatarsCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvatarsCarouselView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ AvatarsCarouselView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
