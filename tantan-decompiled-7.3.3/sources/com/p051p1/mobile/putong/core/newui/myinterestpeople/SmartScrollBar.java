package com.p051p1.mobile.putong.core.newui.myinterestpeople;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ScrollView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 O2\u00020\u0001:\u0001\u0019B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001fR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u001fR\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u001fR\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u001fR\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u001fR\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010\u001fR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u001fR\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u001fR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/myinterestpeople/SmartScrollBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "onDraw", "b", "(Landroid/util/AttributeSet;)V", "c", "()V", "", "a", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "I", "minWidth", Constants.INAPP_DATA_TAG, "minHeight", "Landroid/widget/ScrollView;", "e", "Landroid/widget/ScrollView;", "bindView", "f", "getMaxLength", "()I", "setMaxLength", "(I)V", "maxLength", "g", "currentLength", "h", Constants.KEY_ORIENTATION, "Lcom/p1/mobile/putong/core/newui/myinterestpeople/a;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/newui/myinterestpeople/a;", "orientationHandler", "j", "backgroundCorner", "k", "sliderCorner", BLiveStormDanmakuGiftResourceType.f45292l, "sliderColor", "m", "sliderStyle", "", "n", "F", "sliderLength", "o", "cantScrollState", "p", "canScrollState", "q", "dismissTime", "", "r", "Z", "enableDrag", "Landroid/graphics/Region;", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/graphics/Region;", "sliderRegion", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SmartScrollBar extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int minWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int minHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ScrollView bindView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int maxLength;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int currentLength;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int orientation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public InterfaceC8341a orientationHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int backgroundCorner;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int sliderCorner;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int sliderColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int sliderStyle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float sliderLength;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int cantScrollState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int canScrollState;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int dismissTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean enableDrag;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Region sliderRegion;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.SmartScrollBar$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/newui/myinterestpeople/SmartScrollBar$b", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8340b extends ViewOutlineProvider {
        public C8340b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(0, 0, SmartScrollBar.this.getWidth(), SmartScrollBar.this.getHeight(), SmartScrollBar.this.backgroundCorner);
        }
    }

    public SmartScrollBar(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "==>scrollBar";
        this.minWidth = 100;
        this.minHeight = 30;
        this.orientation = 1;
        this.sliderColor = -1;
        this.sliderRegion = new Region();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        m43661b(attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public final void m43661b(AttributeSet attrs) {
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, khc0.f126787b0);
        typedArrayObtainStyledAttributes.getClass();
        this.backgroundCorner = (int) typedArrayObtainStyledAttributes.getDimension(khc0.f126790c0, 0.0f);
        this.sliderCorner = (int) typedArrayObtainStyledAttributes.getDimension(khc0.f126811j0, 0.0f);
        this.sliderColor = typedArrayObtainStyledAttributes.getColor(khc0.f126808i0, -1);
        this.cantScrollState = typedArrayObtainStyledAttributes.getInt(khc0.f126796e0, 0);
        this.canScrollState = typedArrayObtainStyledAttributes.getInt(khc0.f126793d0, 0);
        this.dismissTime = typedArrayObtainStyledAttributes.getInt(khc0.f126799f0, 1000);
        int i = typedArrayObtainStyledAttributes.getInt(khc0.f126805h0, 1);
        this.orientation = i;
        this.orientationHandler = InterfaceC8341a.INSTANCE.m43664a(i);
        this.sliderStyle = typedArrayObtainStyledAttributes.getInt(khc0.f126817l0, 0);
        try {
            dimension = typedArrayObtainStyledAttributes.getFraction(khc0.f126814k0, 1, 1, 0.0f);
        } catch (Exception unused) {
            dimension = typedArrayObtainStyledAttributes.getDimension(khc0.f126814k0, 0.0f);
        }
        this.sliderLength = dimension;
        this.enableDrag = typedArrayObtainStyledAttributes.getBoolean(khc0.f126802g0, false);
        this.paint.setColor(this.sliderColor);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    public final void m43662c() {
        setAlpha(1.0f);
        if (this.canScrollState == 1) {
            animate().alpha(0.0f).setDuration(this.dismissTime).start();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        int i = this.backgroundCorner;
        if (i == 0) {
            return;
        }
        if (i > Math.min(getWidth(), getHeight()) / 2) {
            this.backgroundCorner = Math.min(getWidth(), getHeight()) / 2;
        }
        setClipToOutline(true);
        setOutlineProvider(new C8340b());
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        InterfaceC8341a interfaceC8341a;
        RectF rectFMo43663a;
        InterfaceC8341a interfaceC8341a2;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.sliderStyle != 1 || this.sliderLength == 0.0f) {
            InterfaceC8341a interfaceC8341a3 = this.orientationHandler;
            if (interfaceC8341a3 == null) {
                Intrinsics.m88391r("orientationHandler");
                interfaceC8341a = null;
            } else {
                interfaceC8341a = interfaceC8341a3;
            }
            rectFMo43663a = interfaceC8341a.mo43663a(this.maxLength, this.currentLength, getWidth(), getHeight(), this.bindView);
        } else {
            InterfaceC8341a interfaceC8341a4 = this.orientationHandler;
            if (interfaceC8341a4 == null) {
                Intrinsics.m88391r("orientationHandler");
                interfaceC8341a2 = null;
            } else {
                interfaceC8341a2 = interfaceC8341a4;
            }
            rectFMo43663a = interfaceC8341a2.mo43663a(this.maxLength, this.currentLength, getWidth(), getHeight(), this.bindView);
        }
        int i = this.sliderCorner;
        canvas.drawRoundRect(rectFMo43663a, i, i, this.paint);
        Region region = this.sliderRegion;
        Rect rect = new Rect();
        rectFMo43663a.roundOut(rect);
        region.set(rect);
        m43662c();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (this.orientation == 1) {
            int i = this.minWidth;
            int i2 = this.minHeight;
            int i3 = i + i2;
            int i4 = i3 - i2;
            this.minHeight = i4;
            this.minWidth = i3 - i4;
        }
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(this.minWidth, this.minHeight);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(this.minWidth, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, this.minHeight);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setMaxLength(int i) {
        this.maxLength = i;
    }

    public SmartScrollBar(@Nullable Context context) {
        super(context);
        this.TAG = "==>scrollBar";
        this.minWidth = 100;
        this.minHeight = 30;
        this.orientation = 1;
        this.sliderColor = -1;
        this.sliderRegion = new Region();
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
    }
}
