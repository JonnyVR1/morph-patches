package com.idv.identity.platform.widget.wheelpiker;

import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class WheelDayPicker extends WheelPicker {

    /* JADX INFO: renamed from: J0 */
    private static final Map<Integer, List<Integer>> f13503J0 = new HashMap();

    /* JADX INFO: renamed from: E0 */
    private final Calendar f13504E0;

    /* JADX INFO: renamed from: F0 */
    private int f13505F0;

    /* JADX INFO: renamed from: G0 */
    private int f13506G0;

    /* JADX INFO: renamed from: H0 */
    private int f13507H0;

    /* JADX INFO: renamed from: I0 */
    public int f13508I0;

    public WheelDayPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Calendar calendar = Calendar.getInstance();
        this.f13504E0 = calendar;
        this.f13508I0 = calendar.getActualMaximum(5);
        this.f13505F0 = calendar.get(1);
        int i = calendar.get(2);
        this.f13506G0 = i;
        m19219p(this.f13505F0, i);
        this.f13507H0 = calendar.get(5);
        m19220q();
    }

    /* JADX INFO: renamed from: p */
    private void m19219p(int i, int i2) {
        this.f13504E0.set(1, this.f13505F0);
        this.f13504E0.set(2, this.f13506G0);
        if (i2 == -1) {
            i2 = this.f13506G0;
        }
        int iM19221m = m19221m(i2, i);
        this.f13508I0 = iM19221m;
        List<Integer> arrayList = f13503J0.get(Integer.valueOf(iM19221m));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            for (int i3 = 1; i3 <= iM19221m; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
            f13503J0.put(Integer.valueOf(iM19221m), arrayList);
        }
        super.setData(arrayList);
    }

    /* JADX INFO: renamed from: q */
    private void m19220q() {
        setSelectedItemPosition(this.f13507H0 - 1);
    }

    public int getCurrentDay() {
        return Integer.parseInt(String.valueOf(getData().get(getCurrentItemPosition())));
    }

    public int getSelectedDay() {
        return this.f13507H0;
    }

    /* JADX INFO: renamed from: m */
    public int m19221m(int i, int i2) {
        if (i == 1) {
            return 31;
        }
        if (i != 2) {
            return (i == 3 || i == 5 || i == 10 || i == 12 || i == 7 || i == 8) ? 31 : 30;
        }
        return (i2 % 4 != 0 || i2 % 400 == 0) ? 28 : 29;
    }

    /* JADX INFO: renamed from: n */
    public void m19222n(int i, int i2) {
        this.f13506G0 = i - 1;
        m19219p(i2, i);
    }

    /* JADX INFO: renamed from: o */
    public void m19223o(int i, int i2) {
        this.f13505F0 = i;
        m19219p(i, i2);
    }

    @Override // com.idv.identity.platform.widget.wheelpiker.WheelPicker
    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelDayPicker");
    }

    public void setSelectedDay(int i) {
        this.f13507H0 = i;
        m19220q();
    }

    public WheelDayPicker(Context context) {
        this(context, null);
    }
}
