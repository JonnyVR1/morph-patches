package p153l;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class fpr extends oj1 {

    /* JADX INFO: renamed from: s */
    public final ListView f100217s;

    public fpr(@NonNull ListView listView) {
        super(listView);
        this.f100217s = listView;
    }

    @Override // p153l.oj1
    /* JADX INFO: renamed from: a */
    public boolean mo126717a(int i) {
        return false;
    }

    @Override // p153l.oj1
    /* JADX INFO: renamed from: b */
    public boolean mo126718b(int i) {
        ListView listView = this.f100217s;
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

    @Override // p153l.oj1
    /* JADX INFO: renamed from: j */
    public void mo126719j(int i, int i2) {
        this.f100217s.scrollListBy(i2);
    }
}
