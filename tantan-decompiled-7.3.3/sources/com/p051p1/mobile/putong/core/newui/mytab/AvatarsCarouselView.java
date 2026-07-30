package com.p051p1.mobile.putong.core.newui.mytab;

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
import com.p051p1.mobile.putong.core.newui.mytab.AvatarsCarouselView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VDraweeView;
import p153l.adc0;
import p153l.go5;
import p153l.gt0;
import p153l.jyb;
import p153l.khc0;
import p153l.l51;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u001eJ\u0015\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00106\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00101R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\n098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\r098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0014\u0010D\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010CR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010OR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010Q¨\u0006S"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/mytab/AvatarsCarouselView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "o", "()Ljava/lang/String;", "Lv/VDraweeView;", OMSTemplateModeType.view, "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lv/VDraweeView;)Landroid/animation/Animator;", "j", "m", "currentState", "k", "(ILv/VDraweeView;)I", "", "p", "(Lv/VDraweeView;)V", "nextState", RXScreenCaptureService.KEY_INDEX, "(ILv/VDraweeView;)Landroid/animation/Animator;", "n", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "q", "", "blur", "setAvatarBlur", "(Z)V", "", "startDelay", "setStartDelay", "(J)V", "count", "setRepeatCount", "(I)V", "", "a", "F", "imageBorder", "b", "imageRadius", "c", "imageSize", Constants.INAPP_DATA_TAG, "imageOffset", "", "e", "Ljava/util/List;", "carouselImages", "f", "I", "carouselImageCount", "g", "carouselViews", "h", "J", BLiveOperationTitleShowType.duration, "carouselInternal", "Landroid/animation/AnimatorSet;", "Landroid/animation/AnimatorSet;", "carouselAnimatorSet", "Landroid/view/animation/DecelerateInterpolator;", "Landroid/view/animation/DecelerateInterpolator;", "interpolator", "maxCarouselRepeatCount", "currentCarouselCount", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "carouselAnimRunnable", "Z", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/newui/mytab/AvatarsCarouselView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8345b extends AnimatorListenerAdapter {
        public C8345b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            super.onAnimationEnd(animation);
            l51.m152888H(AvatarsCarouselView.this.getContext(), AvatarsCarouselView.this.carouselAnimRunnable, AvatarsCarouselView.this.carouselInternal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AvatarsCarouselView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        int i2 = qa00.f156316c;
        this.imageBorder = i2;
        int i3 = qa00.f156324k;
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
        this.carouselAnimRunnable = new Runnable() { // from class: l.jp1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m43685e(this.f122068a);
            }
        };
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126783a);
            typedArrayObtainStyledAttributes.getClass();
            int i4 = typedArrayObtainStyledAttributes.getInt(khc0.f126789c, 4);
            this.carouselImageCount = i4;
            this.carouselImageCount = Math.max(i4, 1);
            float dimension = typedArrayObtainStyledAttributes.getDimension(khc0.f126795e, i3);
            this.imageRadius = dimension;
            this.imageSize = 2.0f * dimension;
            this.imageOffset = typedArrayObtainStyledAttributes.getDimension(khc0.f126792d, i2);
            this.imageBorder = typedArrayObtainStyledAttributes.getDimension(khc0.f126786b, i2);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m43681a(VDraweeView vDraweeView, AvatarsCarouselView avatarsCarouselView) {
        float f = avatarsCarouselView.imageRadius;
        vDraweeView.setTranslationX(((avatarsCarouselView.carouselImageCount - 2) * (avatarsCarouselView.imageOffset + f)) + f + f);
    }

    /* JADX INFO: renamed from: b */
    public static void m43682b(VDraweeView vDraweeView, AvatarsCarouselView avatarsCarouselView) {
        float f = avatarsCarouselView.imageRadius;
        vDraweeView.setTranslationX(((avatarsCarouselView.carouselImageCount - 2) * (avatarsCarouselView.imageOffset + f)) + f + f);
    }

    /* JADX INFO: renamed from: c */
    public static Comparable m43683c(VDraweeView vDraweeView) {
        vDraweeView.getClass();
        Object tag = vDraweeView.getTag(adc0.f70362h0);
        tag.getClass();
        return (Integer) tag;
    }

    /* JADX INFO: renamed from: d */
    public static void m43684d(VDraweeView vDraweeView) {
        vDraweeView.setAlpha(1.0f);
        vDraweeView.setScaleX(1.0f);
        vDraweeView.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: e */
    public static void m43685e(AvatarsCarouselView avatarsCarouselView) {
        int i = avatarsCarouselView.currentCarouselCount + 1;
        avatarsCarouselView.currentCarouselCount = i;
        if (i <= avatarsCarouselView.maxCarouselRepeatCount) {
            avatarsCarouselView.m43694n();
        } else {
            avatarsCarouselView.m43697q();
        }
    }

    /* JADX INFO: renamed from: f */
    public static Comparable m43686f(VDraweeView vDraweeView) {
        vDraweeView.getClass();
        return Float.valueOf(vDraweeView.getTranslationX() * (-1.0f));
    }

    /* JADX INFO: renamed from: i */
    public final Animator m43689i(int nextState, VDraweeView view) {
        if (nextState != 0) {
            return nextState != 1 ? m43690j(view) : m43692l(view);
        }
        return m43693m(view);
    }

    /* JADX INFO: renamed from: j */
    public final Animator m43690j(final VDraweeView view) {
        view.setTag(adc0.f70362h0, 0);
        float f = this.imageRadius;
        int i = this.carouselImageCount;
        float f2 = this.imageOffset;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.ALPHA, 0.0f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.TRANSLATION_X, ((i - 2) * (f + f2)) + f + f, f + ((i - 2) * (f2 + f))));
        objectAnimatorOfPropertyValuesHolder.getClass();
        gt0.m132176v(objectAnimatorOfPropertyValuesHolder, new Runnable() { // from class: l.op1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m43682b(view, this);
            }
        });
        objectAnimatorOfPropertyValuesHolder.setDuration(this.duration);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: k */
    public final int m43691k(int currentState, VDraweeView view) {
        if (currentState != 0) {
            return currentState != 1 ? 0 : -1;
        }
        return view.getTranslationX() <= this.imageRadius ? 1 : 0;
    }

    /* JADX INFO: renamed from: l */
    public final Animator m43692l(final VDraweeView view) {
        view.setTag(adc0.f70362h0, 1);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_X, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.SCALE_Y, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.TRANSLATION_X, view.getTranslationX(), 0.0f));
        objectAnimatorOfPropertyValuesHolder.getClass();
        gt0.m132160f(objectAnimatorOfPropertyValuesHolder, new Runnable() { // from class: l.np1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m43681a(view, this);
            }
        });
        objectAnimatorOfPropertyValuesHolder.setDuration(this.duration);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: m */
    public final Animator m43693m(final VDraweeView view) {
        view.setTag(adc0.f70362h0, 0);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) FrameLayout.TRANSLATION_X, view.getTranslationX(), view.getTranslationX() - (this.imageRadius + this.imageOffset)));
        objectAnimatorOfPropertyValuesHolder.getClass();
        gt0.m132176v(objectAnimatorOfPropertyValuesHolder, new Runnable() { // from class: l.mp1
            @Override // java.lang.Runnable
            public final void run() {
                AvatarsCarouselView.m43684d(view);
            }
        });
        objectAnimatorOfPropertyValuesHolder.setDuration(this.duration);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(this.interpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: n */
    public final void m43694n() {
        m43697q();
        ArrayList arrayList = new ArrayList();
        int size = this.carouselViews.size();
        for (int i = 0; i < size; i++) {
            VDraweeView vDraweeView = this.carouselViews.get(i);
            Object tag = vDraweeView.getTag(adc0.f70362h0);
            tag.getClass();
            int iM43691k = m43691k(((Integer) tag).intValue(), vDraweeView);
            if (iM43691k == -1) {
                m43696p(vDraweeView);
            }
            arrayList.add(m43689i(iM43691k, vDraweeView));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.carouselAnimatorSet = animatorSet;
        animatorSet.addListener(new C8345b());
        AnimatorSet animatorSet2 = this.carouselAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(arrayList);
        }
        CollectionsKt.sortWith(this.carouselViews, go5.m131085b(new Function1() { // from class: l.kp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AvatarsCarouselView.m43683c((VDraweeView) obj);
            }
        }, new Function1() { // from class: l.lp1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AvatarsCarouselView.m43686f((VDraweeView) obj);
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
    public final String m43695o() {
        int iNextInt;
        if (jyb.m147479J(this.carouselImages)) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        int size = this.carouselViews.size();
        String str = null;
        for (int i = 0; i < size; i++) {
            VDraweeView vDraweeView = this.carouselViews.get(i);
            String str2 = (String) vDraweeView.getTag(adc0.f70379i0);
            Object tag = vDraweeView.getTag(adc0.f70362h0);
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
    public final void m43696p(VDraweeView view) {
        String strM43695o = m43695o();
        if (TextUtils.isEmpty(strM43695o)) {
            return;
        }
        if (this.blur) {
            uqb0.f180374G.m127120O(view, strM43695o, 2, 8);
        } else {
            uqb0.f180374G.m127115L0(view, strM43695o);
        }
        view.setTag(adc0.f70379i0, strM43695o);
    }

    /* JADX INFO: renamed from: q */
    public final void m43697q() {
        l51.m152890J(this.carouselAnimRunnable);
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
