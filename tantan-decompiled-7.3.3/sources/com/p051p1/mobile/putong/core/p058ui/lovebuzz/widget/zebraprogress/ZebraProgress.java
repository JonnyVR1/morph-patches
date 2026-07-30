package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.zebraprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bdc0;
import p153l.bnl0;
import p153l.jvd;
import p153l.lhc0;
import p153l.mec0;
import p153l.p9r;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b!\u0010\tR\u001a\u0010&\u001a\u00020\"8\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-¨\u00060"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ZebraProgress;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxProgress", "", "setMax", "(I)V", "progress", "setProgress", "getProgress", "()I", ShareConstants.RES_PATH, "type", "c", "(II)V", "setBackgroundRes", "getMaxProgress", Constants.INAPP_DATA_TAG, "()V", "e", "", "b", "()Z", "a", "", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ProgressBgView;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/zebraprogress/ProgressBgView;", "mProgressIv", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "mBotIv", "I", "f", "progressRadius", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ZebraProgress extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ProgressBgView mProgressIv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ImageView mBotIv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int maxProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int progress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int progressRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZebraProgress(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = "ZebraProgressBar";
        m48455a(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m48455a(Context context, AttributeSet attrs) {
        View viewInflate = p9r.m171370a(context).inflate(mec0.f136480o, this);
        viewInflate.getClass();
        this.mProgressIv = (ProgressBgView) viewInflate.findViewById(bdc0.f76250g);
        this.mBotIv = (ImageView) viewInflate.findViewById(bdc0.f76249f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, lhc0.f132087f);
        typedArrayObtainStyledAttributes.getClass();
        this.progressRadius = (int) typedArrayObtainStyledAttributes.getDimension(lhc0.f132090i, jvd.m147011a(context, 10.0f));
        int color = typedArrayObtainStyledAttributes.getColor(lhc0.f132088g, Color.parseColor("#d9d9d9"));
        int integer = typedArrayObtainStyledAttributes.getInteger(lhc0.f132089h, 100);
        this.maxProgress = integer;
        this.progress = integer;
        typedArrayObtainStyledAttributes.recycle();
        ProgressBgView progressBgView = this.mProgressIv;
        if (progressBgView != null) {
            progressBgView.setRadiusPx(this.progressRadius);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        ImageView imageView = this.mBotIv;
        if (imageView != null) {
            imageView.setImageDrawable(gradientDrawable);
        }
        setProgress(this.maxProgress);
    }

    /* JADX INFO: renamed from: b */
    public boolean m48456b() {
        ProgressBgView progressBgView = this.mProgressIv;
        if (progressBgView != null) {
            return progressBgView.m48452b();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m48457c(int res, int type) {
        ProgressBgView progressBgView = this.mProgressIv;
        if (type == 0) {
            if (progressBgView != null) {
                progressBgView.setBackgroundAsTile(res);
            }
        } else if (progressBgView != null) {
            progressBgView.setBackgroundRes(res);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m48458d() {
        ProgressBgView progressBgView = this.mProgressIv;
        if (progressBgView != null) {
            progressBgView.m48453c();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m48459e() {
        ProgressBgView progressBgView = this.mProgressIv;
        if (progressBgView != null) {
            progressBgView.m48454d();
        }
    }

    public int getMaxProgress() {
        return this.maxProgress;
    }

    public int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public void setBackgroundRes(int res) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.progressRadius);
        gradientDrawable.setColor(getContext().getResources().getColor(res));
        ImageView imageView = this.mBotIv;
        if (imageView != null) {
            imageView.setImageDrawable(gradientDrawable);
        }
    }

    public void setMax(int maxProgress) {
        this.maxProgress = maxProgress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
        float f = progress / (this.maxProgress * 1.0f);
        ImageView imageView = this.mBotIv;
        int width = imageView != null ? imageView.getWidth() : 0;
        if (width == 0) {
            width = bnl0.m105592y0() - qa00.f156338y;
        }
        ProgressBgView progressBgView = this.mProgressIv;
        ViewGroup.LayoutParams layoutParams = progressBgView != null ? progressBgView.getLayoutParams() : null;
        layoutParams.getClass();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.width = width - ((int) ((1.0f - f) * width));
        ProgressBgView progressBgView2 = this.mProgressIv;
        if (progressBgView2 != null) {
            progressBgView2.setLayoutParams(layoutParams2);
        }
        ProgressBgView progressBgView3 = this.mProgressIv;
        if (progressBgView3 != null) {
            progressBgView3.postInvalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZebraProgress(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZebraProgress(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
