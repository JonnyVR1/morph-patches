package com.idv.identity.platform.widget.wheelpiker;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class WheelMonthPicker extends WheelPicker {

    /* JADX INFO: renamed from: E0 */
    private int f13509E0;

    public WheelMonthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 12; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        super.setData(arrayList);
        this.f13509E0 = Calendar.getInstance().get(2) + 1;
        m19224m();
    }

    /* JADX INFO: renamed from: m */
    private void m19224m() {
        setSelectedItemPosition(this.f13509E0 - 1);
    }

    public int getCurrentMonth() {
        return Integer.parseInt(String.valueOf(getData().get(getCurrentItemPosition())));
    }

    public int getSelectedMonth() {
        return this.f13509E0;
    }

    @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelMonthPicker");
    }

    public void setSelectedMonth(int i) {
        this.f13509E0 = i;
        m19224m();
    }

    public WheelMonthPicker(Context context) {
        this(context, null);
    }
}
