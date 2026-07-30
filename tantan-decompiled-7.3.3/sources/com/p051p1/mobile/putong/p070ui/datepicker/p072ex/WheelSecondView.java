package com.p051p1.mobile.putong.p070ui.datepicker.p072ex;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.data.MerchandiseTimeUnit;
import com.p051p1.mobile.putong.p070ui.datepicker.WheelView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.jhc0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/WheelSecondView;", "Lcom/p1/mobile/putong/ui/datepicker/ex/Wheel60View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", MerchandiseTimeUnit.second, "", "isSmoothScroll", "smoothDuration", "", "U0", "(IZI)V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class WheelSecondView extends Wheel60View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelSecondView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jhc0.f120845E0);
            typedArrayObtainStyledAttributes.getClass();
            int i2 = typedArrayObtainStyledAttributes.getInt(jhc0.f120851H0, 0);
            int i3 = typedArrayObtainStyledAttributes.getInt(jhc0.f120849G0, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(jhc0.f120847F0, -1);
            typedArrayObtainStyledAttributes.recycle();
            m80668h0(WheelView.m80617e0(this, Integer.valueOf(i2), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(i3), false, 2, null), WheelView.m80617e0(this, Integer.valueOf(i4), false, 2, null));
        }
        m80717T0();
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m80742V0(WheelSecondView wheelSecondView, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 250;
        }
        wheelSecondView.m80743U0(i, z, i2);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: U0 */
    public final void m80743U0(int second, boolean isSmoothScroll, int smoothDuration) {
        m80641K0(WheelView.m80617e0(this, Integer.valueOf(second), false, 2, null), isSmoothScroll, smoothDuration);
    }

    @JvmOverloads
    public final void setSelectedSecond(int i) {
        m80742V0(this, i, false, 0, 6, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelSecondView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WheelSecondView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ WheelSecondView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
