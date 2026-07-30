package com.p046p1.mobile.putong.core.newui.messages.anim.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.svq;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 /2\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010.\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0018¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/QuickChatBgTopView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "show", "b", "(Z)V", "heigh", "a", "(I)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paintWhite", "paintTrans", "c", "paintCover", "Landroid/graphics/Rect;", Constants.INAPP_DATA_TAG, "Landroid/graphics/Rect;", "rectBg", "e", "I", "rount", "f", "Z", "getTipsShow", "()Z", "setTipsShow", "tipsShow", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class QuickChatBgTopView extends View {

    /* JADX INFO: renamed from: g */
    public static final int f25567g = svq.m186103c(16);

    /* JADX INFO: renamed from: h */
    public static final int f25568h = svq.m186103c(4);

    /* JADX INFO: renamed from: i */
    public static final int f25569i = svq.m186103c(24);

    /* JADX INFO: renamed from: j */
    public static final int f25570j = svq.m186103c(4);

    /* JADX INFO: renamed from: k */
    public static final int f25571k = svq.m186103c(160);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Paint paintWhite;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint paintTrans;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Paint paintCover;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Rect rectBg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int rount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean tipsShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatBgTopView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        this.paintWhite = paint;
        Paint paint2 = new Paint();
        this.paintTrans = paint2;
        Paint paint3 = new Paint();
        this.paintCover = paint3;
        this.rount = f25568h;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setColor(Color.parseColor("#ffffff"));
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setColor(Color.parseColor("#ffffff"));
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#ffffff"));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.rectBg = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final void m42074a(int heigh) {
        int i;
        int i2 = f25570j;
        if (heigh <= i2) {
            i = f25568h;
        } else {
            int i3 = f25569i;
            i = heigh >= i3 ? f25567g : (((heigh - i2) * (f25567g - f25568h)) / (i3 - i2)) + i2;
        }
        this.rount = i;
        boolean z = this.tipsShow;
        Paint paint = this.paintCover;
        if (z) {
            paint.setAlpha(0);
        } else {
            paint.setAlpha((int) (127.5f - ((heigh - i2) * (127.5f / (f25571k - i2)))));
        }
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m42075b(boolean show) {
        if (this.tipsShow == show) {
            return;
        }
        this.tipsShow = show;
        Paint paint = this.paintCover;
        if (show) {
            paint.setAlpha(0);
        } else {
            int i = getLayoutParams().height;
            int i2 = f25570j;
            paint.setAlpha((int) (127.5f - ((i - i2) * (127.5f / (f25571k - i2)))));
        }
        invalidate();
    }

    public final boolean getTipsShow() {
        return this.tipsShow;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Rect rect = this.rectBg;
        int iSaveLayer = canvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom, this.paintWhite, 31);
        Rect rect2 = this.rectBg;
        canvas.drawRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, 0.0f, 0.0f, this.paintWhite);
        Rect rect3 = this.rectBg;
        float f = rect3.left;
        float f2 = rect3.top;
        float f3 = rect3.right;
        float f4 = rect3.bottom;
        int i = this.rount;
        canvas.drawRoundRect(f, f2, f3, f4, i, i, this.paintTrans);
        canvas.restoreToCount(iSaveLayer);
        Rect rect4 = this.rectBg;
        float f5 = rect4.left;
        float f6 = rect4.top;
        float f7 = rect4.right;
        float f8 = rect4.bottom;
        int i2 = this.rount;
        canvas.drawRoundRect(f5, f6, f7, f8, i2, i2, this.paintCover);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.rectBg.set(0, 0, w, h);
    }

    public final void setTipsShow(boolean z) {
        this.tipsShow = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatBgTopView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuickChatBgTopView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ QuickChatBgTopView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
