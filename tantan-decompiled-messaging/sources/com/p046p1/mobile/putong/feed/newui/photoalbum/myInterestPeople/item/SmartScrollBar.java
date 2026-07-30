package com.p046p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item;

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
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VScroll;
import p149l.m9c0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u00020\u0001:\u0001\u001eB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u0018\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\"\u00101\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010&\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010&R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010&R\u0016\u0010?\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010&R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010&R\u0016\u0010G\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010&R\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010&R\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, m87232d2 = {"Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/SmartScrollBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lv/VScroll;", "scrollView", "e", "(Lv/VScroll;)V", "onDraw", "f", "(Landroid/util/AttributeSet;)V", "g", "()V", "h", "", "a", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "paint", "c", "I", "minWidth", Constants.INAPP_DATA_TAG, "minHeight", "Landroid/widget/ScrollView;", "Landroid/widget/ScrollView;", "bindView", "getMaxLength", "()I", "setMaxLength", "(I)V", "maxLength", "currentLength", Constants.KEY_ORIENTATION, "Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/a;", "orientationHandler", "j", "backgroundCorner", "k", "sliderCorner", BLiveStormDanmakuGiftResourceType.f44444l, "sliderColor", "m", "sliderStyle", "", "n", "F", "sliderLength", "o", "cantScrollState", "p", "canScrollState", "q", "dismissTime", "", "r", "Z", "enableDrag", "Landroid/graphics/Region;", BLiveStormDanmakuGiftResourceType.f44446s, "Landroid/graphics/Region;", "sliderRegion", "Companion", "b_feed_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public InterfaceC11310a orientationHandler;

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

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.SmartScrollBar$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/SmartScrollBar$b", "Lv/VScroll$a;", "Lv/VScroll;", ResourceDirection.f38808v, "", BaseSei.f13930X, BaseSei.f13931Y, "oldX", "oldY", "", "a", "(Lv/VScroll;IIII)V", "b_feed_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C11308b implements VScroll.InterfaceC22566a {
        public C11308b() {
        }

        @Override // p147v.VScroll.InterfaceC22566a
        /* JADX INFO: renamed from: a */
        public void mo43191a(VScroll v2, int x, int y, int oldX, int oldY) {
            View childAt;
            Integer numValueOf = (v2 == null || (childAt = v2.getChildAt(0)) == null) ? null : Integer.valueOf(childAt.getHeight());
            SmartScrollBar smartScrollBar = SmartScrollBar.this;
            numValueOf.getClass();
            smartScrollBar.setMaxLength(numValueOf.intValue());
            SmartScrollBar smartScrollBar2 = SmartScrollBar.this;
            ScrollView scrollView = smartScrollBar2.bindView;
            scrollView.getClass();
            smartScrollBar2.currentLength = y + ((VScroll) scrollView).getHeight();
            SmartScrollBar.this.m64958g();
            SmartScrollBar.this.postInvalidate();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.myInterestPeople.item.SmartScrollBar$c */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/p1/mobile/putong/feed/newui/photoalbum/myInterestPeople/item/SmartScrollBar$c", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "b_feed_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C11309c extends ViewOutlineProvider {
        public C11309c() {
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
        m64957f(attributeSet);
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
        setOutlineProvider(new C11309c());
    }

    /* JADX INFO: renamed from: e */
    public final void m64956e(@NotNull VScroll scrollView) {
        scrollView.getClass();
        if (this.bindView != null) {
            return;
        }
        this.bindView = scrollView;
        scrollView.m223193d(new C11308b());
    }

    /* JADX INFO: renamed from: f */
    public final void m64957f(AttributeSet attrs) {
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, m9c0.f132708Q);
        typedArrayObtainStyledAttributes.getClass();
        this.backgroundCorner = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132709R, 0.0f);
        this.sliderCorner = (int) typedArrayObtainStyledAttributes.getDimension(m9c0.f132716Y, 0.0f);
        this.sliderColor = typedArrayObtainStyledAttributes.getColor(m9c0.f132715X, -1);
        this.cantScrollState = typedArrayObtainStyledAttributes.getInt(m9c0.f132711T, 0);
        this.canScrollState = typedArrayObtainStyledAttributes.getInt(m9c0.f132710S, 0);
        this.dismissTime = typedArrayObtainStyledAttributes.getInt(m9c0.f132712U, 1000);
        int i = typedArrayObtainStyledAttributes.getInt(m9c0.f132714W, 1);
        this.orientation = i;
        this.orientationHandler = InterfaceC11310a.INSTANCE.m64962a(i);
        this.sliderStyle = typedArrayObtainStyledAttributes.getInt(m9c0.f132719a0, 0);
        try {
            dimension = typedArrayObtainStyledAttributes.getFraction(m9c0.f132717Z, 1, 1, 0.0f);
        } catch (Exception unused) {
            dimension = typedArrayObtainStyledAttributes.getDimension(m9c0.f132717Z, 0.0f);
        }
        this.sliderLength = dimension;
        this.enableDrag = typedArrayObtainStyledAttributes.getBoolean(m9c0.f132713V, false);
        this.paint.setColor(this.sliderColor);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: g */
    public final void m64958g() {
        InterfaceC11310a interfaceC11310a = this.orientationHandler;
        if (interfaceC11310a == null) {
            Intrinsics.m87502r("orientationHandler");
            interfaceC11310a = null;
        }
        if (interfaceC11310a.mo64961b(this.bindView)) {
            setVisibility(0);
            return;
        }
        int i = this.cantScrollState;
        if (i == 0) {
            setVisibility(4);
        } else {
            if (i != 1) {
                return;
            }
            setVisibility(8);
        }
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: h */
    public final void m64959h() {
        setAlpha(1.0f);
        if (this.canScrollState == 1) {
            animate().alpha(0.0f).setDuration(this.dismissTime).start();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        InterfaceC11310a interfaceC11310a;
        RectF rectFMo64960a;
        InterfaceC11310a interfaceC11310a2;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.sliderStyle != 1 || this.sliderLength == 0.0f) {
            InterfaceC11310a interfaceC11310a3 = this.orientationHandler;
            if (interfaceC11310a3 == null) {
                Intrinsics.m87502r("orientationHandler");
                interfaceC11310a = null;
            } else {
                interfaceC11310a = interfaceC11310a3;
            }
            rectFMo64960a = interfaceC11310a.mo64960a(this.maxLength, this.currentLength, getWidth(), getHeight(), this.bindView);
        } else {
            InterfaceC11310a interfaceC11310a4 = this.orientationHandler;
            if (interfaceC11310a4 == null) {
                Intrinsics.m87502r("orientationHandler");
                interfaceC11310a2 = null;
            } else {
                interfaceC11310a2 = interfaceC11310a4;
            }
            rectFMo64960a = interfaceC11310a2.mo64960a(this.maxLength, this.currentLength, getWidth(), getHeight(), this.bindView);
        }
        int i = this.sliderCorner;
        canvas.drawRoundRect(rectFMo64960a, i, i, this.paint);
        Region region = this.sliderRegion;
        Rect rect = new Rect();
        rectFMo64960a.roundOut(rect);
        region.set(rect);
        m64959h();
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
