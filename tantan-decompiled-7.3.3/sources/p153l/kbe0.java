package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.p051p1.mobile.putong.core.data.School;
import com.p051p1.mobile.putong.core.p058ui.campus.SchoolItemView;
import com.p051p1.mobile.putong.core.p058ui.campus.SelectSchoolAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class kbe0 extends dq1<School> implements SectionIndexer {

    /* JADX INFO: renamed from: c */
    public SelectSchoolAct f124935c;

    /* JADX INFO: renamed from: d */
    public boolean f124936d = false;

    /* JADX INFO: renamed from: e */
    public List<School> f124937e = new ArrayList();

    public kbe0(SelectSchoolAct selectSchoolAct) {
        this.f124935c = selectSchoolAct;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f124936d ? this.f124935c.f29506d.f184564b.size() : this.f124937e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        for (int i2 = 0; i2 < this.f124937e.size(); i2++) {
            if (this.f124937e.get(i2).firstLetter.equals(e1b.f91577i[i])) {
                return i2;
            }
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        int i2 = 0;
        while (true) {
            String[] strArr = e1b.f91577i;
            if (i2 >= strArr.length) {
                return strArr.length - 1;
            }
            if (this.f124937e.size() > 0) {
                List<School> list = this.f124937e;
                if (list.get(i >= list.size() ? this.f124937e.size() : i).firstLetter.equals(e1b.f91577i[i2])) {
                    return i2;
                }
            }
            i2++;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f124935c.inflater().inflate(kec0.f125623Se, viewGroup, false);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, School school, int i, int i2) {
        ((SchoolItemView) view).m45651e(this.f124936d, school, i2, m149029w(i2));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public School getItem(int i) {
        return this.f124936d ? this.f124935c.f29506d.f184564b.get(i) : this.f124937e.get(i);
    }

    @Override // android.widget.SectionIndexer
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String[] getSections() {
        return e1b.f91577i;
    }

    /* JADX INFO: renamed from: w */
    public boolean m149029w(int i) {
        return i == getPositionForSection(getSectionForPosition(i));
    }

    /* JADX INFO: renamed from: y */
    public void m149030y(boolean z) {
        this.f124935c.f29505c.f77293f.setVisibility(z ? 4 : 0);
        this.f124936d = z;
        this.f124937e = this.f124935c.f29506d.f184563a;
        notifyDataSetChanged();
    }
}
