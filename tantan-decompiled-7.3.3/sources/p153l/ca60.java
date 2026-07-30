package p153l;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u001f¨\u00063"}, m88121d2 = {"Ll/ca60;", "", "Landroid/view/View;", OMSTemplateModeType.view, "", "dragEnabled", "Lkotlin/Function0;", "", "getHorizontalEdgeMarginPercent", "getVerticalEdgeMarginPercent", "Ll/svm;", "getSafeInsets", "getBottomOffsetPx", "Lkotlin/Function1;", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "", "onSnapComplete", "onTap", "<init>", "(Landroid/view/View;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "e", "()V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "b", "(Landroid/view/MotionEvent;)V", Constants.INAPP_DATA_TAG, "(Landroid/view/MotionEvent;)Z", "c", "a", "Landroid/view/View;", "Z", "Lkotlin/jvm/functions/Function0;", "f", "g", "Lkotlin/jvm/functions/Function1;", "h", "", RXScreenCaptureService.KEY_INDEX, "F", "touchSlop", "j", "touchStartX", "k", "touchStartY", BLiveStormDanmakuGiftResourceType.f45292l, "viewStartX", "m", "viewStartY", "n", "isDragging", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class ca60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean dragEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> getHorizontalEdgeMarginPercent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> getVerticalEdgeMarginPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<svm> getSafeInsets;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<Integer> getBottomOffsetPx;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function1<PIPPosition, Unit> onSnapComplete;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function0<Unit> onTap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float touchSlop;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float touchStartX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float touchStartY;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float viewStartX;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float viewStartY;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isDragging;

    /* JADX WARN: Multi-variable type inference failed */
    public ca60(@NotNull View view, boolean z, @NotNull Function0<Integer> function0, @NotNull Function0<Integer> function1, @NotNull Function0<svm> function2, @NotNull Function0<Integer> function3, @NotNull Function1<? super PIPPosition, Unit> function4, @NotNull Function0<Unit> function5) {
        view.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        this.view = view;
        this.dragEnabled = z;
        this.getHorizontalEdgeMarginPercent = function0;
        this.getVerticalEdgeMarginPercent = function1;
        this.getSafeInsets = function2;
        this.getBottomOffsetPx = function3;
        this.onSnapComplete = function4;
        this.onTap = function5;
        this.touchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public static Unit m108474a(ca60 ca60Var, PIPPosition pIPPosition) {
        ca60Var.getClass();
        pIPPosition.getClass();
        ca60Var.onSnapComplete.invoke(pIPPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    private final void m108475e() {
        ViewParent parent = this.view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int iM212732b = xqf.m212732b(this.getHorizontalEdgeMarginPercent.invoke().intValue(), viewGroup.getWidth());
        int iM212732b2 = xqf.m212732b(this.getVerticalEdgeMarginPercent.invoke().intValue(), viewGroup.getHeight());
        kb60 kb60Var = kb60.INSTANCE;
        Map<PIPPosition, PointF> mapM149025b = kb60Var.m149025b(viewGroup.getWidth(), viewGroup.getHeight(), this.view.getWidth(), this.view.getHeight(), iM212732b, iM212732b2, this.getSafeInsets.invoke(), this.getBottomOffsetPx.invoke().intValue());
        final PIPPosition pIPPositionM149024a = kb60Var.m149024a((this.view.getWidth() / 2.0f) + this.view.getX(), this.view.getY() + (this.view.getHeight() / 2.0f), mapM149025b, this.view.getWidth(), this.view.getHeight());
        PointF pointF = mapM149025b.get(pIPPositionM149024a);
        if (pointF == null) {
            return;
        }
        l960.INSTANCE.m153345l(this.view, pointF.x, pointF.y, new Function0() { // from class: l.ba60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ca60.m108474a(this.f75646a, pIPPositionM149024a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m108476b(@NotNull MotionEvent event) {
        event.getClass();
        this.touchStartX = event.getRawX();
        this.touchStartY = event.getRawY();
        this.viewStartX = this.view.getX();
        this.viewStartY = this.view.getY();
        this.isDragging = false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m108477c(@NotNull MotionEvent event) {
        event.getClass();
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.dragEnabled) {
                    return false;
                }
                if (!this.isDragging) {
                    float fAbs = Math.abs(event.getRawX() - this.touchStartX);
                    float fAbs2 = Math.abs(event.getRawY() - this.touchStartY);
                    float f = this.touchSlop;
                    this.isDragging = fAbs > f || fAbs2 > f;
                }
                if (this.isDragging) {
                    float rawX = event.getRawX() - this.touchStartX;
                    float rawY = event.getRawY() - this.touchStartY;
                    this.view.setX(this.viewStartX + rawX);
                    this.view.setY(this.viewStartY + rawY);
                }
                return this.isDragging;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        if (this.isDragging) {
            m108475e();
        } else {
            this.onTap.invoke();
        }
        this.isDragging = false;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m108478d(@NotNull MotionEvent event) {
        event.getClass();
        if (!this.dragEnabled) {
            return false;
        }
        float fAbs = Math.abs(event.getRawX() - this.touchStartX);
        float fAbs2 = Math.abs(event.getRawY() - this.touchStartY);
        if (!this.isDragging) {
            float f = this.touchSlop;
            if (fAbs > f || fAbs2 > f) {
                this.isDragging = true;
            }
        }
        return this.isDragging;
    }
}
