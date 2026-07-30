package com.p000p1.mobile.putong.p004ui.datepicker.p006ex;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.p004ui.datepicker.WheelView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import l.d9c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ad50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010!R*\u0010%\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelHourView;", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "item", "", "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "hour", "isSmoothScroll", "smoothDuration", "", "U0", "(IZI)V", "Ll/ad50;", "amPmChangedListener", "setOnAmPmChangedListener", "(Ll/ad50;)V", "scrollOffsetY", "z0", "(I)V", "W0", "()V", "X0", "T0", "()I", "value", "M1", "Z", "is24Hour", "()Z", "set24Hour", "(Z)V", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelHourView$HourType;", "N1", "Lcom/p1/mobile/putong/ui/datepicker/ex/WheelHourView$HourType;", "getHourType", "()Lcom/p1/mobile/putong/ui/datepicker/ex/WheelHourView$HourType;", "setHourType", "(Lcom/p1/mobile/putong/ui/datepicker/ex/WheelHourView$HourType;)V", "hourType", "O1", "I", "dataHeight", "P1", "currentOffsetCount", "Q1", "currentOffsetYDirection", "Lkotlin/ranges/IntRange;", "R1", "Lkotlin/ranges/IntRange;", "hourRange", "HourType", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WheelHourView extends WheelView {

    /* JADX INFO: renamed from: M1, reason: from kotlin metadata */
    public boolean is24Hour;

    /* JADX INFO: renamed from: N1, reason: from kotlin metadata */
    @NotNull
    public HourType hourType;

    /* JADX INFO: renamed from: O1, reason: from kotlin metadata */
    public int dataHeight;

    /* JADX INFO: renamed from: P1, reason: from kotlin metadata */
    public int currentOffsetCount;

    /* JADX INFO: renamed from: Q1, reason: from kotlin metadata */
    public int currentOffsetYDirection;

    /* JADX INFO: renamed from: R1, reason: from kotlin metadata */
    @NotNull
    public IntRange hourRange;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelHourView$HourType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "AM", "PM", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum HourType {
        DEFAULT,
        AM,
        PM;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<HourType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelHourView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.is24Hour = true;
        this.hourType = HourType.DEFAULT;
        this.currentOffsetYDirection = 1;
        this.hourRange = a.k(0, 24);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d9c0.s0);
            typedArrayObtainStyledAttributes.getClass();
            set24Hour(typedArrayObtainStyledAttributes.getBoolean(d9c0.t0, true));
            int i2 = typedArrayObtainStyledAttributes.getInt(d9c0.w0, 1);
            int i3 = typedArrayObtainStyledAttributes.getInt(d9c0.v0, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(d9c0.u0, -1);
            typedArrayObtainStyledAttributes.recycle();
            m9806h0(WheelView.m9755e0(this, Integer.valueOf(i2), false, 2, null), WheelView.m9755e0(this, Integer.valueOf(i3), false, 2, null), WheelView.m9755e0(this, Integer.valueOf(i4), false, 2, null));
        }
        m9870W0();
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m9867V0(WheelHourView wheelHourView, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelHourView.m9869U0(i, z, i2);
    }

    /* JADX INFO: renamed from: T0 */
    public final int m9868T0() {
        return getItemHeight() * getItemCount();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: U0 */
    public final void m9869U0(int hour, boolean isSmoothScroll, int smoothDuration) {
        m9779K0(WheelView.m9755e0(this, Integer.valueOf(hour), false, 2, null), isSmoothScroll, smoothDuration);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m9870W0() {
        ArrayList arrayList = new ArrayList();
        m9871X0();
        IntRange intRange = this.hourRange;
        int iA = intRange.a();
        int iC = intRange.c();
        if (iA <= iC) {
            while (true) {
                if (this.is24Hour || iA != 0) {
                    arrayList.add(Integer.valueOf(iA));
                } else {
                    arrayList.add(12);
                }
                if (iA == iC) {
                    break;
                } else {
                    iA++;
                }
            }
        }
        setData(arrayList);
        this.dataHeight = m9868T0();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m9871X0() {
        this.hourRange = this.is24Hour ? a.k(0, 24) : new IntRange(0, 11);
    }

    @Override // com.p000p1.mobile.putong.p004ui.datepicker.WheelView
    /* JADX INFO: renamed from: d0 */
    public int mo9803d0(@Nullable Object item, boolean isCompareFormatText) {
        if (!(item instanceof Integer)) {
            return -1;
        }
        if (!this.is24Hour && Intrinsics.d(item, 12)) {
            return 0;
        }
        IntRange intRange = this.hourRange;
        int iA = intRange.a();
        int iC = intRange.c();
        Number number = (Number) item;
        int iIntValue = number.intValue();
        if (iA > iIntValue || iIntValue > iC) {
            return -1;
        }
        return number.intValue();
    }

    @NotNull
    public final HourType getHourType() {
        return this.hourType;
    }

    public final void set24Hour(boolean z) {
        if (z == this.is24Hour) {
            return;
        }
        this.is24Hour = z;
        m9870W0();
    }

    public final void setHourType(@NotNull HourType hourType) {
        hourType.getClass();
        this.hourType = hourType;
    }

    @JvmOverloads
    public final void setSelectedHour(int i) {
        m9867V0(this, i, false, 0, 6, null);
    }

    @Override // com.p000p1.mobile.putong.p004ui.datepicker.WheelView
    /* JADX INFO: renamed from: z0 */
    public void mo9842z0(int scrollOffsetY) {
        super.mo9842z0(scrollOffsetY);
        if (!this.is24Hour || getIsCyclic()) {
            if (this.hourType == HourType.DEFAULT) {
                this.hourType = HourType.AM;
            }
            if (this.dataHeight <= 0) {
                this.dataHeight = m9868T0();
            }
            if (this.dataHeight == 0) {
                return;
            }
            int itemHeight = (scrollOffsetY < 0 ? getItemHeight() + scrollOffsetY : scrollOffsetY) / this.dataHeight;
            int i = scrollOffsetY >= 0 ? 1 : -1;
            if (this.currentOffsetCount == itemHeight && this.currentOffsetYDirection == i) {
                return;
            }
            this.currentOffsetYDirection = i;
            this.currentOffsetCount = itemHeight;
            HourType hourType = this.hourType;
            HourType hourType2 = HourType.AM;
            if (hourType == hourType2) {
                hourType2 = HourType.PM;
            }
            this.hourType = hourType2;
        }
    }

    public final void setOnAmPmChangedListener(@Nullable ad50 amPmChangedListener) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelHourView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelHourView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelHourView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
