package com.p051p1.mobile.putong.p070ui.datepicker.p072ex;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.p070ui.datepicker.WheelView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jhc0;
import p153l.wg3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J)\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelYearView;", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Item.TYPE, "", "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "start", "end", "", "Z0", "(II)V", MerchandiseTimeUnit.year, "isSmoothScroll", "smoothDuration", "T0", "(IZI)V", "minYear", "maxYear", "V0", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", "W0", "(IILcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "a1", "()V", "M1", "I", "startYear", "N1", "endYear", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class WheelYearView extends WheelView {

    /* JADX INFO: renamed from: M1, reason: from kotlin metadata */
    public int startYear;

    /* JADX INFO: renamed from: N1, reason: from kotlin metadata */
    public int endYear;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelYearView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.startYear = 1970;
        this.endYear = 2100;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhc0.f120956w1);
            typedArrayObtainStyledAttributes.getClass();
            this.startYear = typedArrayObtainStyledAttributes.getInt(jhc0.f120839B1, 1970);
            this.endYear = typedArrayObtainStyledAttributes.getInt(jhc0.f120959x1, 2100);
            int i2 = typedArrayObtainStyledAttributes.getInt(jhc0.f120836A1, this.startYear);
            int i3 = typedArrayObtainStyledAttributes.getInt(jhc0.f120962y1, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(jhc0.f120965z1, -1);
            typedArrayObtainStyledAttributes.recycle();
            m80668h0(WheelView.m80617e0(this, Integer.valueOf(i2), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(i4), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(i3), false, 2, null));
        }
        m80751a1();
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m80744U0(WheelYearView wheelYearView, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelYearView.m80747T0(i, z, i2);
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m80745X0(WheelYearView wheelYearView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wheelYearView.startYear;
        }
        wheelYearView.m80748V0(i, i2);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m80746Y0(WheelYearView wheelYearView, int i, int i2, WheelView.OverRangeMode overRangeMode, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wheelYearView.startYear;
        }
        wheelYearView.m80749W0(i, i2, overRangeMode);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: T0 */
    public final void m80747T0(int year, boolean isSmoothScroll, int smoothDuration) {
        m80641K0(WheelView.m80617e0(this, Integer.valueOf(year), false, 2, null), isSmoothScroll, smoothDuration);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: V0 */
    public final void m80748V0(int minYear, int maxYear) {
        m80636H0(WheelView.m80617e0(this, Integer.valueOf(minYear), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(maxYear), false, 2, null));
    }

    @JvmOverloads
    /* JADX INFO: renamed from: W0 */
    public final void m80749W0(int minYear, int maxYear, @NotNull WheelView.OverRangeMode overRangeMode) {
        overRangeMode.getClass();
        m80638I0(WheelView.m80617e0(this, Integer.valueOf(minYear), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(maxYear), false, 2, null), overRangeMode);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m80750Z0(int start, int end) {
        if (start > end) {
            wg3.m206174a("endYear must be greater than startYear in WheelYearView.");
            return;
        }
        this.startYear = start;
        this.endYear = end;
        m80751a1();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m80751a1() {
        ArrayList arrayList = new ArrayList();
        int i = this.startYear;
        int i2 = this.endYear;
        if (i <= i2) {
            while (true) {
                arrayList.add(Integer.valueOf(i));
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        setData(arrayList);
    }

    @Override // com.p051p1.mobile.putong.p070ui.datepicker.WheelView
    /* JADX INFO: renamed from: d0 */
    public int mo80665d0(@Nullable Object item, boolean isCompareFormatText) {
        if (!(item instanceof Integer)) {
            return -1;
        }
        int i = this.startYear;
        int i2 = this.endYear;
        Number number = (Number) item;
        int iIntValue = number.intValue();
        if (i > iIntValue || iIntValue > i2) {
            return -1;
        }
        return number.intValue() - this.startYear;
    }

    @JvmOverloads
    public final void setSelectedYear(int i) {
        m80744U0(this, i, false, 0, 6, null);
    }

    @JvmOverloads
    public final void setSelectedYearRange(int i) {
        m80745X0(this, 0, i, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelYearView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelYearView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelYearView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
