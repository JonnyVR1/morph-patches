package p149l;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class enr extends hj1 {

    /* JADX INFO: renamed from: s */
    public final ListView f92334s;

    public enr(@NonNull ListView listView) {
        super(listView);
        this.f92334s = listView;
    }

    @Override // p149l.hj1
    /* JADX INFO: renamed from: a */
    public boolean mo117288a(int i) {
        return false;
    }

    @Override // p149l.hj1
    /* JADX INFO: renamed from: b */
    public boolean mo117289b(int i) {
        ListView listView = this.f92334s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // p149l.hj1
    /* JADX INFO: renamed from: j */
    public void mo117290j(int i, int i2) {
        this.f92334s.scrollListBy(i2);
    }
}
