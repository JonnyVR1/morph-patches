package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import com.p000p1.mobile.putong.core.data.School;
import com.p000p1.mobile.putong.core.p001ui.campus.SchoolItemView;
import com.p000p1.mobile.putong.core.p001ui.campus.SelectSchoolAct;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.rza;
import l.wp1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g3e0 extends wp1<School> implements SectionIndexer {

    /* JADX INFO: renamed from: c */
    public SelectSchoolAct f4536c;

    /* JADX INFO: renamed from: d */
    public boolean f4537d = false;

    /* JADX INFO: renamed from: e */
    public List<School> f4538e = new ArrayList();

    public g3e0(SelectSchoolAct selectSchoolAct) {
        this.f4536c = selectSchoolAct;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        return this.f4537d ? this.f4536c.f1052d.f7008b.size() : this.f4538e.size();
    }

    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        for (int i2 = 0; i2 < this.f4538e.size(); i2++) {
            if (this.f4538e.get(i2).firstLetter.equals(rza.i[i])) {
                return i2;
            }
        }
        return 0;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        int i2 = 0;
        while (true) {
            String[] strArr = rza.i;
            if (i2 >= strArr.length) {
                return strArr.length - 1;
            }
            if (this.f4538e.size() > 0) {
                List<School> list = this.f4538e;
                if (list.get(i >= list.size() ? this.f4538e.size() : i).firstLetter.equals(rza.i[i2])) {
                    return i2;
                }
            }
            i2++;
        }
    }

    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public View m6540m(ViewGroup viewGroup, int i) {
        return this.f4536c.inflater().inflate(f6c0.Le, viewGroup, false);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m6539j(View view, School school, int i, int i2) {
        ((SchoolItemView) view).m1767e(this.f4537d, school, i2, m6544w(i2));
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public School getItem(int i) {
        return this.f4537d ? this.f4536c.f1052d.f7008b.get(i) : this.f4538e.get(i);
    }

    @Override // android.widget.SectionIndexer
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String[] getSections() {
        return rza.i;
    }

    /* JADX INFO: renamed from: w */
    public boolean m6544w(int i) {
        return i == getPositionForSection(getSectionForPosition(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m6545y(boolean z) {
        this.f4536c.f1051c.f8165f.setVisibility(z ? 4 : 0);
        this.f4537d = z;
        this.f4538e = this.f4536c.f1052d.f7007a;
        notifyDataSetChanged();
    }
}
