package com.p051p1.mobile.putong.p070ui.datepicker.p072ex;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.p070ui.datepicker.WheelView;
import com.p051p1.mobile.putong.p070ui.datepicker.p072ex.WheelDayView;
import com.tencent.liteav.TXLiteAVCode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jhc0;
import p153l.s01;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u0001:\u0001?B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b \u0010!J)\u0010$\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060*2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,R*\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u00102R*\u00107\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u00102R'\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060*088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006@"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelDayView;", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getDaysByCalendar", "()I", "", Item.TYPE, "", "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "Ljava/util/Date;", "date", "", "setDate", "(Ljava/util/Date;)V", "getDate", "()Ljava/util/Date;", "dayOfMonth", "isSmoothScroll", "smoothDuration", "V0", "(IZI)V", "min", Constants.PRIORITY_MAX, "X0", "(II)V", "Lcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;", "overRangeMode", "Y0", "(IILcom/p1/mobile/putong/ui/datepicker/WheelView$OverRangeMode;)V", "getMaxDay", "a1", "()V", "days", "", "U0", "(I)Ljava/util/List;", "value", "M1", "I", "getYear", "setYear", "(I)V", MerchandiseTimeUnit.year, "N1", "getMonth", "setMonth", MerchandiseTimeUnit.month, "Landroid/util/SparseArray;", "O1", "Lkotlin/Lazy;", "getDaysArray", "()Landroid/util/SparseArray;", "daysArray", "Companion", "a", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class WheelDayView extends WheelView {

    /* JADX INFO: renamed from: M1, reason: from kotlin metadata */
    public int year;

    /* JADX INFO: renamed from: N1, reason: from kotlin metadata */
    public int month;

    /* JADX INFO: renamed from: O1, reason: from kotlin metadata */
    @NotNull
    public final Lazy daysArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelDayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.year = -1;
        this.month = -1;
        this.daysArray = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.eeq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelDayView.m80721T0();
            }
        });
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhc0.f120925m0);
            typedArrayObtainStyledAttributes.getClass();
            setYear(typedArrayObtainStyledAttributes.getInt(jhc0.f120940r0, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE));
            setMonth(typedArrayObtainStyledAttributes.getInt(jhc0.f120934p0, 1));
            int i2 = typedArrayObtainStyledAttributes.getInt(jhc0.f120937q0, 1);
            int i3 = typedArrayObtainStyledAttributes.getInt(jhc0.f120931o0, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(jhc0.f120928n0, -1);
            typedArrayObtainStyledAttributes.recycle();
            m80668h0(WheelView.m80617e0(this, Integer.valueOf(i2), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(i3), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(i4), false, 2, null));
        }
        m80728a1();
    }

    /* JADX INFO: renamed from: T0 */
    public static SparseArray m80721T0() {
        return new SparseArray();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m80722W0(WheelDayView wheelDayView, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelDayView.m80725V0(i, z, i2);
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m80723Z0(WheelDayView wheelDayView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 1;
        }
        wheelDayView.m80726X0(i, i2);
    }

    private final SparseArray<List<Integer>> getDaysArray() {
        return (SparseArray) this.daysArray.getValue();
    }

    private final int getDaysByCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        calendar.set(5, 1);
        calendar.roll(5, -1);
        return calendar.get(5);
    }

    /* JADX INFO: renamed from: U0 */
    public final List<Integer> m80724U0(int days) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (1 <= days) {
            while (true) {
                arrayList.add(Integer.valueOf(i));
                if (i == days) {
                    break;
                }
                i++;
            }
        }
        getDaysArray().put(days, arrayList);
        return arrayList;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: V0 */
    public final void m80725V0(int dayOfMonth, boolean isSmoothScroll, int smoothDuration) {
        m80641K0(WheelView.m80617e0(this, Integer.valueOf(dayOfMonth), false, 2, null), isSmoothScroll, smoothDuration);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: X0 */
    public final void m80726X0(int min, int max) {
        m80636H0(WheelView.m80617e0(this, Integer.valueOf(min), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(max), false, 2, null));
    }

    @JvmOverloads
    /* JADX INFO: renamed from: Y0 */
    public final void m80727Y0(int min, int max, @NotNull WheelView.OverRangeMode overRangeMode) {
        overRangeMode.getClass();
        m80638I0(WheelView.m80617e0(this, Integer.valueOf(min), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(max), false, 2, null), overRangeMode);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m80728a1() {
        int daysByCalendar = getDaysByCalendar();
        if (daysByCalendar == getItemCount()) {
            return;
        }
        List<Integer> listM80724U0 = getDaysArray().get(daysByCalendar);
        if (listM80724U0 == null) {
            listM80724U0 = m80724U0(daysByCalendar);
        }
        setData(listM80724U0);
    }

    @Override // com.p051p1.mobile.putong.p070ui.datepicker.WheelView
    /* JADX INFO: renamed from: d0 */
    public int mo80665d0(@Nullable Object item, boolean isCompareFormatText) {
        if (!(item instanceof Integer)) {
            return -1;
        }
        int daysByCalendar = getDaysByCalendar();
        Number number = (Number) item;
        int iIntValue = number.intValue();
        if (1 > iIntValue || iIntValue > daysByCalendar) {
            return -1;
        }
        return number.intValue() - 1;
    }

    @NotNull
    public final Date getDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        Integer num = (Integer) getSelectedItem();
        calendar.set(5, num != null ? num.intValue() : 1);
        Date time = calendar.getTime();
        time.getClass();
        return time;
    }

    public final int getMaxDay() {
        Integer num;
        s01<?> adapter = getAdapter();
        if (adapter == null || (num = (Integer) adapter.m183873l(getItemCount() - 1)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final void setDate(@NotNull Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        setYear(calendar.get(1));
        setMonth(calendar.get(2) + 1);
        int i = calendar.get(5);
        m80728a1();
        m80722W0(this, i, false, 0, 6, null);
    }

    public final void setMonth(int i) {
        if (i == this.month) {
            return;
        }
        this.month = Math.min(12, Math.max(0, i));
        m80728a1();
    }

    @JvmOverloads
    public final void setSelectedDay(int i) {
        m80722W0(this, i, false, 0, 6, null);
    }

    @JvmOverloads
    public final void setSelectedDayRange(int i) {
        m80723Z0(this, 0, i, 1, null);
    }

    public final void setYear(int i) {
        if (i == this.year) {
            return;
        }
        this.year = Math.max(i, 0);
        m80728a1();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelDayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelDayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelDayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
