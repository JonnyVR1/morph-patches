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
    private int f13561E0;

    /* JADX INFO: renamed from: F0 */
    private int f13562F0;

    /* JADX INFO: renamed from: G0 */
    private int f13563G0;

    public WheelYearPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13561E0 = Constants.UPNP_MULTICAST_PORT;
        this.f13562F0 = 2100;
        m19238n();
        this.f13563G0 = Calendar.getInstance().get(1);
        m19237m();
    }

    /* JADX INFO: renamed from: m */
    private void m19237m() {
        setSelectedItemPosition(this.f13563G0 - this.f13561E0);
    }

    /* JADX INFO: renamed from: n */
    private void m19238n() {
        ArrayList arrayList = new ArrayList();
        for (int i = this.f13561E0; i <= this.f13562F0; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        super.setData(arrayList);
    }

    public int getCurrentYear() {
        return Integer.parseInt(String.valueOf(getData().get(getCurrentItemPosition())));
    }

    public int getSelectedYear() {
        return this.f13563G0;
    }

    public int getYearEnd() {
        return this.f13562F0;
    }

    public int getYearStart() {
        return this.f13561E0;
    }

    @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelYearPicker");
    }

    public void setSelectedYear(int i) {
        this.f13563G0 = i;
        m19237m();
    }

    public void setYearEnd(int i) {
        this.f13562F0 = i;
        m19238n();
    }

    public void setYearStart(int i) {
        this.f13561E0 = i;
        this.f13563G0 = getCurrentYear();
        m19238n();
        m19237m();
    }

    public WheelYearPicker(Context context) {
        this(context, null);
    }
}
