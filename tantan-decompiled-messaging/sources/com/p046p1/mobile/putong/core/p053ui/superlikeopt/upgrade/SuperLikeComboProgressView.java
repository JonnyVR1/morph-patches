package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboProgressView;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u001a\u0010'\u001a\u00020#8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\"\u0010,\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&\"\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", BLiveOperationTitleShowType.duration, "num", "c", "(II)V", Constants.INAPP_DATA_TAG, "()V", "Landroid/graphics/Paint;", "a", "Lkotlin/Lazy;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "b", "getPath", "()Landroid/graphics/Path;", "path", "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView$a;", "Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView$a;", "hpTimer", "", "F", "getMaxPercent", "()F", "maxPercent", "e", "getCurrentMax", "setCurrentMax", "(F)V", "currentMax", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SuperLikeComboProgressView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy paint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C8909a hpTimer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float maxPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float currentMax;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboProgressView$a */
    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/SuperLikeComboProgressView$a;", "", "<init>", "()V", "Landroid/view/View;", ResourceDirection.f38808v, "", "a", "(Landroid/view/View;)F", "", BLiveOperationTitleShowType.duration, "", "b", "(Landroid/view/View;I)V", "", "J", StudentVerRejectedReason.startTime, "I", "getDuration", "()I", "setDuration", "(I)V", "c", "F", "percent", "Companion", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8909a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public long startTime = -2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int duration;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public float percent;

        /* JADX INFO: renamed from: a */
        public final float m55800a(@NotNull View v2) {
            v2.getClass();
            long j = this.startTime;
            if (j == -2) {
                return this.percent;
            }
            if (j == -1) {
                this.startTime = SystemClock.elapsedRealtime();
                this.percent = 0.0f;
                v2.postInvalidate();
            } else {
                float fElapsedRealtime = ((SystemClock.elapsedRealtime() - this.startTime) * 1.0f) / this.duration;
                if (fElapsedRealtime > 1.0f) {
                    if (this.percent != 1.0f) {
                        v2.postInvalidate();
                    }
                    this.percent = 1.0f;
                } else if (fElapsedRealtime < 0.0f) {
                    if (this.percent != 0.0f) {
                        v2.postInvalidate();
                    }
                    this.percent = 0.0f;
                } else {
                    this.percent = fElapsedRealtime;
                    v2.postInvalidate();
                }
            }
            return this.percent;
        }

        /* JADX INFO: renamed from: b */
        public final void m55801b(@NotNull View v2, int duration) {
            v2.getClass();
            this.duration = duration;
            this.startTime = -1L;
            v2.postInvalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeComboProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.paint = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.mwg0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuperLikeComboProgressView.m55796a();
            }
        });
        this.path = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.nwg0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuperLikeComboProgressView.m55797b();
            }
        });
        this.hpTimer = new C8909a();
        this.maxPercent = 10.0f;
    }

    /* JADX INFO: renamed from: a */
    public static Paint m55796a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#2BCCFF"));
        return paint;
    }

    /* JADX INFO: renamed from: b */
    public static Path m55797b() {
        return new Path();
    }

    /* JADX INFO: renamed from: c */
    public final void m55798c(int duration, int num) {
        this.currentMax = num;
        this.hpTimer.m55801b(this, duration);
        if (num == 4) {
            getPaint().setColor(Color.parseColor("#24DDAF"));
        } else {
            if (num != 7) {
                return;
            }
            getPaint().setColor(Color.parseColor("#FF8A17"));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m55799d() {
        getPaint().setColor(Color.parseColor("#2BCCFF"));
        this.currentMax = 0.0f;
        getPath().reset();
        postInvalidate();
    }

    public final float getCurrentMax() {
        return this.currentMax;
    }

    public final float getMaxPercent() {
        return this.maxPercent;
    }

    @NotNull
    public final Paint getPaint() {
        return (Paint) this.paint.getValue();
    }

    @NotNull
    public final Path getPath() {
        return (Path) this.path.getValue();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float fM55800a = this.hpTimer.m55800a(this);
        float f = this.maxPercent;
        float f2 = (1.0f / f) * fM55800a;
        float f3 = this.currentMax;
        float width = (getWidth() * f2) + (((f3 <= 10.0f ? f3 - 1.0f : 9.0f) / f) * getWidth());
        getPath().moveTo(0.0f, 0.0f);
        getPath().lineTo(0.0f, getHeight());
        getPath().lineTo(width, getHeight());
        float height = width < ((float) getHeight()) ? 0.0f : width - getHeight();
        float f4 = this.currentMax;
        if (f4 > 10.0f && f4 <= 200.0f) {
            height += (f4 / 400.0f) * getHeight();
        }
        getPath().lineTo(height, 0.0f);
        getPath().close();
        canvas.drawPath(getPath(), getPaint());
    }

    public final void setCurrentMax(float f) {
        this.currentMax = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeComboProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperLikeComboProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ SuperLikeComboProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
