package com.p000p1.mobile.putong.p004ui.datepicker.p006ex;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.p004ui.datepicker.WheelView;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.d9c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelMonthView;", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "setMonthData", "(Ljava/util/List;)V", "", "item", "", "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "month", "isSmoothScroll", "smoothDuration", "T0", "(IZI)V", "minMonth", "maxMonth", "V0", "(II)V", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", "W0", "(IILcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "Y0", "()V", "Companion", "a", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WheelMonthView extends WheelView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d9c0.B0);
            typedArrayObtainStyledAttributes.getClass();
            int i2 = typedArrayObtainStyledAttributes.getInt(d9c0.D0, 1);
            int i3 = typedArrayObtainStyledAttributes.getInt(d9c0.z1, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(d9c0.C0, -1);
            typedArrayObtainStyledAttributes.recycle();
            m9806h0(WheelView.m9755e0(this, Integer.valueOf(i2), false, 2, null), WheelView.m9755e0(this, Integer.valueOf(i3), false, 2, null), WheelView.m9755e0(this, Integer.valueOf(i4), false, 2, null));
        }
        m9879Y0();
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m9874U0(WheelMonthView wheelMonthView, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelMonthView.m9876T0(i, z, i2);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m9875X0(WheelMonthView wheelMonthView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 1;
        }
        wheelMonthView.m9877V0(i, i2);
    }

    private final void setMonthData(List<String> data) {
        setData(data);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: T0 */
    public final void m9876T0(int month, boolean isSmoothScroll, int smoothDuration) {
        m9779K0(WheelView.m9755e0(this, Integer.valueOf(month), false, 2, null), isSmoothScroll, smoothDuration);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: V0 */
    public final void m9877V0(int minMonth, int maxMonth) {
        m9774H0(WheelView.m9755e0(this, Integer.valueOf(minMonth), false, 2, null), WheelView.m9755e0(this, Integer.valueOf(maxMonth), false, 2, null));
    }

    @JvmOverloads
    /* JADX INFO: renamed from: W0 */
    public final void m9878W0(int minMonth, int maxMonth, @NotNull WheelView.OverRangeMode overRangeMode) {
        overRangeMode.getClass();
        m9776I0(WheelView.m9755e0(this, Integer.valueOf(minMonth), false, 2, null), WheelView.m9755e0(this, Integer.valueOf(maxMonth), false, 2, null), overRangeMode);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m9879Y0() {
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 13; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        setData(arrayList);
    }

    @Override // com.p000p1.mobile.putong.p004ui.datepicker.WheelView
    /* JADX INFO: renamed from: d0 */
    public int mo9803d0(@Nullable Object item, boolean isCompareFormatText) {
        Number number;
        int iIntValue;
        if ((item instanceof Integer) && 1 <= (iIntValue = (number = (Number) item).intValue()) && iIntValue < 13) {
            return number.intValue() - 1;
        }
        return -1;
    }

    @JvmOverloads
    public final void setSelectedMonth(int i) {
        m9874U0(this, i, false, 0, 6, null);
    }

    @JvmOverloads
    public final void setSelectedMonthRange(int i) {
        m9875X0(this, 0, i, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelMonthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelMonthView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelMonthView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
