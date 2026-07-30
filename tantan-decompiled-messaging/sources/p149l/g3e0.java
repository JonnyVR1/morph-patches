package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.p046p1.mobile.putong.core.data.School;
import com.p046p1.mobile.putong.core.p053ui.campus.SchoolItemView;
import com.p046p1.mobile.putong.core.p053ui.campus.SelectSchoolAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class g3e0 extends wp1<School> implements SectionIndexer {

    /* JADX INFO: renamed from: c */
    public SelectSchoolAct f100456c;

    /* JADX INFO: renamed from: d */
    public boolean f100457d = false;

    /* JADX INFO: renamed from: e */
    public List<School> f100458e = new ArrayList();

    public g3e0(SelectSchoolAct selectSchoolAct) {
        this.f100456c = selectSchoolAct;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f100457d ? this.f100456c.f28658d.f153908b.size() : this.f100458e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        for (int i2 = 0; i2 < this.f100458e.size(); i2++) {
            if (this.f100458e.get(i2).firstLetter.equals(rza.f161615i[i])) {
                return i2;
            }
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        int i2 = 0;
        while (true) {
            String[] strArr = rza.f161615i;
            if (i2 >= strArr.length) {
                return strArr.length - 1;
            }
            if (this.f100458e.size() > 0) {
                List<School> list = this.f100458e;
                if (list.get(i >= list.size() ? this.f100458e.size() : i).firstLetter.equals(rza.f161615i[i2])) {
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

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f100456c.inflater().inflate(f6c0.f95457Le, viewGroup, false);
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, School school, int i, int i2) {
        ((SchoolItemView) view).m44468e(this.f100457d, school, i2, m124259w(i2));
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public School getItem(int i) {
        return this.f100457d ? this.f100456c.f28658d.f153908b.get(i) : this.f100458e.get(i);
    }

    @Override // android.widget.SectionIndexer
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String[] getSections() {
        return rza.f161615i;
    }

    /* JADX INFO: renamed from: w */
    public boolean m124259w(int i) {
        return i == getPositionForSection(getSectionForPosition(i));
    }

    /* JADX INFO: renamed from: y */
    public void m124260y(boolean z) {
        this.f100456c.f28657c.f185788f.setVisibility(z ? 4 : 0);
        this.f100457d = z;
        this.f100458e = this.f100456c.f28658d.f153907a;
        notifyDataSetChanged();
    }
}
