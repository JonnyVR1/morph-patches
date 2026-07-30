package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveWaveVoiceView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u0002\u001f\u0018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0010R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0016\u0010,\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u0016\u0010/\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00101¨\u00064"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveWaveVoiceView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "(Landroid/graphics/Canvas;)V", "", "volumeValue", "h", "(F)V", RXScreenCaptureService.KEY_INDEX, "()V", "e", "(Landroid/util/AttributeSet;Landroid/content/Context;)V", "g", "f", "Ljava/lang/Runnable;", "a", "Lkotlin/Lazy;", "getWaveTask", "()Ljava/lang/Runnable;", "waveTask", "Ljava/util/LinkedList;", "", "b", "Ljava/util/LinkedList;", "mWaveList", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "paint", Constants.INAPP_DATA_TAG, "I", "waveCount", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectLeft", "updateSpeed", "F", "lineWidth", "lineMinHeight", "", "Z", "isStart", "Companion", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class LiveWaveVoiceView extends View {

    /* JADX INFO: renamed from: j */
    public static final float f52220j = qa00.m175859d(6.0f);

    /* JADX INFO: renamed from: k */
    public static final float f52221k = qa00.m175859d(4.0f);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final float[] f52222l = {0.8f, 1.0f, 0.96f, 0.7f, 0.55f, 0.75f, 0.65f, 0.9f, 0.7f};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy waveTask;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LinkedList<Integer> mWaveList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int waveCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final RectF rectLeft;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int updateSpeed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float lineWidth;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float lineMinHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isStart;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiCall.view.LiveWaveVoiceView$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveWaveVoiceView$a;", "Ljava/lang/Runnable;", "<init>", "(Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/view/LiveWaveVoiceView;)V", "", "run", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public final class RunnableC13061a implements Runnable {
        public RunnableC13061a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LiveWaveVoiceView.this.isStart) {
                LiveWaveVoiceView.this.m76984f(0.0f);
                LiveWaveVoiceView.this.postInvalidate();
                LiveWaveVoiceView liveWaveVoiceView = LiveWaveVoiceView.this;
                liveWaveVoiceView.postDelayed(this, liveWaveVoiceView.updateSpeed);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveWaveVoiceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.waveTask = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.xdv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiveWaveVoiceView.m76979a(this.f193646a);
            }
        });
        this.mWaveList = new LinkedList<>();
        Paint paint = new Paint();
        paint.setStrokeWidth(0.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.paint = paint;
        this.waveCount = 4;
        this.rectLeft = new RectF();
        this.updateSpeed = 100;
        this.lineWidth = f52220j;
        this.lineMinHeight = -1.0f;
        m76983e(attributeSet, context);
        m76985g();
    }

    /* JADX INFO: renamed from: a */
    public static RunnableC13061a m76979a(LiveWaveVoiceView liveWaveVoiceView) {
        return liveWaveVoiceView.new RunnableC13061a();
    }

    private final Runnable getWaveTask() {
        return (Runnable) this.waveTask.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m76983e(AttributeSet attrs, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, vhc0.f184093D);
        this.paint.setColor(typedArrayObtainStyledAttributes.getColor(vhc0.f184094E, n3d0.m161277a(n9c0.f140877w1)));
        this.lineWidth = typedArrayObtainStyledAttributes.getDimension(vhc0.f184096G, f52220j);
        this.lineMinHeight = typedArrayObtainStyledAttributes.getDimension(vhc0.f184097H, -1.0f);
        this.waveCount = typedArrayObtainStyledAttributes.getInteger(vhc0.f184095F, 4);
        this.updateSpeed = typedArrayObtainStyledAttributes.getInt(vhc0.f184098I, 100);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m76984f(float volumeValue) {
        try {
            if (volumeValue > 0.0f) {
                float f = volumeValue * 4.5f;
                if (f > 1.0f) {
                    f = 1.0f;
                } else if (f < 0.7d) {
                    f = 0.7f;
                }
                float[] fArr = f52222l;
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int height = (int) (fArr[i] * f * getHeight());
                    float f2 = this.lineMinHeight;
                    LinkedList<Integer> linkedList = this.mWaveList;
                    if (f2 > 0.0f) {
                        if (height <= f2) {
                            height = (int) f2;
                        }
                        linkedList.set(i2, Integer.valueOf(height));
                    } else {
                        linkedList.set(i2, Integer.valueOf(height));
                    }
                    i++;
                    i2 = i3;
                }
            } else {
                Integer numPollFirst = this.mWaveList.pollFirst();
                if (numPollFirst != null) {
                    this.mWaveList.addLast(Integer.valueOf(numPollFirst.intValue()));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76985g() {
        this.mWaveList.clear();
        for (float f : f52222l) {
            this.mWaveList.add(Integer.valueOf((int) (f * getHeight())));
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m76986h(float volumeValue) {
        try {
            if (this.isStart) {
                m76984f(volumeValue);
            } else {
                this.isStart = true;
                m76984f(volumeValue);
                getWaveTask().run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m76987i() {
        if (this.isStart) {
            this.isStart = false;
            this.mWaveList.clear();
            removeCallbacks(getWaveTask());
            m76985g();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int i = this.waveCount;
        int i2 = i / 2;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.waveCount % 2 == 0) {
                RectF rectF = this.rectLeft;
                if (i3 < i2) {
                    float f = i2 - i3;
                    rectF.left = (width - (f52220j * f)) - ((f - 0.5f) * f52221k);
                } else {
                    float f2 = i3 - i2;
                    rectF.left = width + (f52220j * f2) + ((f2 + 0.5f) * f52221k);
                }
                float f3 = height;
                this.rectLeft.top = f3 - (this.mWaveList.get(i3).floatValue() / 2.0f);
                RectF rectF2 = this.rectLeft;
                rectF2.right = rectF2.left + this.lineWidth;
                rectF2.bottom = f3 + (this.mWaveList.get(i3).floatValue() / 2.0f);
                RectF rectF3 = this.rectLeft;
                int i4 = qa00.f156317d;
                canvas.drawRoundRect(rectF3, i4, i4, this.paint);
            }
        }
    }
}
