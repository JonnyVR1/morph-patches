package com.p046p1.mobile.putong.p065ui.datepicker.p067ex;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.p065ui.datepicker.WheelView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Lcom/p1/mobile/putong/ui/datepicker/ex/Wheel60View;", "Lcom/p1/mobile/putong/ui/datepicker/WheelView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Item.TYPE, "", "isCompareFormatText", "d0", "(Ljava/lang/Object;Z)I", "", "T0", "()V", "Lkotlin/ranges/IntRange;", "M1", "Lkotlin/ranges/IntRange;", "range", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class Wheel60View extends WheelView {

    /* JADX INFO: renamed from: M1, reason: from kotlin metadata */
    @NotNull
    public final IntRange range;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Wheel60View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.range = C15167a.m87605k(0, 60);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m79534T0() {
        ArrayList arrayList = new ArrayList();
        IntRange intRange = this.range;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                arrayList.add(Integer.valueOf(first));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        setData(arrayList);
    }

    @Override // com.p046p1.mobile.putong.p065ui.datepicker.WheelView
    /* JADX INFO: renamed from: d0 */
    public int mo79482d0(@Nullable Object item, boolean isCompareFormatText) {
        if (!(item instanceof Integer)) {
            return -1;
        }
        IntRange intRange = this.range;
        int first = intRange.getFirst();
        int last = intRange.getLast();
        Number number = (Number) item;
        int iIntValue = number.intValue();
        if (first > iIntValue || iIntValue > last) {
            return -1;
        }
        return number.intValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Wheel60View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Wheel60View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ Wheel60View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
