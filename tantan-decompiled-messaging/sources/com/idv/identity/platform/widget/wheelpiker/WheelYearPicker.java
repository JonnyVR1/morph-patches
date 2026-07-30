package com.idv.identity.platform.widget.wheelpiker;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class WheelYearPicker extends WheelPicker {

    /* JADX INFO: renamed from: E0 */
    private int f12820E0;

    /* JADX INFO: renamed from: F0 */
    private int f12821F0;

    /* JADX INFO: renamed from: G0 */
    private int f12822G0;

    public WheelYearPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12820E0 = Constants.UPNP_MULTICAST_PORT;
        this.f12821F0 = 2100;
        m18161n();
        this.f12822G0 = Calendar.getInstance().get(1);
        m18160m();
    }

    /* JADX INFO: renamed from: m */
    private void m18160m() {
        setSelectedItemPosition(this.f12822G0 - this.f12820E0);
    }

    /* JADX INFO: renamed from: n */
    private void m18161n() {
        ArrayList arrayList = new ArrayList();
        for (int i = this.f12820E0; i <= this.f12821F0; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        super.setData(arrayList);
    }

    public int getCurrentYear() {
        return Integer.parseInt(String.valueOf(getData().get(getCurrentItemPosition())));
    }

    public int getSelectedYear() {
        return this.f12822G0;
    }

    public int getYearEnd() {
        return this.f12821F0;
    }

    public int getYearStart() {
        return this.f12820E0;
    }

    @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelYearPicker");
    }

    public void setSelectedYear(int i) {
        this.f12822G0 = i;
        m18160m();
    }

    public void setYearEnd(int i) {
        this.f12821F0 = i;
        m18161n();
    }

    public void setYearStart(int i) {
        this.f12820E0 = i;
        this.f12822G0 = getCurrentYear();
        m18161n();
        m18160m();
    }

    public WheelYearPicker(Context context) {
        this(context, null);
    }
}
