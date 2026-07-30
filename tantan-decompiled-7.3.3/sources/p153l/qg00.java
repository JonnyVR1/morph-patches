package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentActivitiesAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentActivitiesView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class qg00 extends dq1<MomentActivity> {

    /* JADX INFO: renamed from: c */
    public vg60<MomentActivity> f157370c = vg60.m201219a();

    /* JADX INFO: renamed from: d */
    public MomentActivitiesAct f157371d;

    public qg00(MomentActivitiesAct momentActivitiesAct) {
        this.f157371d = momentActivitiesAct;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
        if (i >= this.f157370c.f184001a.size() - 4) {
            FeedModule.f39702c.m61879Q2();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f157370c.f184001a.size() + 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        List<Media> list;
        if (getCount() == i + 1) {
            return 5;
        }
        Moment momentM61893X3 = FeedModule.f39702c.m61893X3(getItem(i).reference.f40080id);
        if (momentM61893X3 == null || (list = momentM61893X3.media) == null) {
            return 0;
        }
        if (list.size() <= 0 || !(momentM61893X3.media.get(0) instanceof Video)) {
            return Math.min(momentM61893X3.media.size(), 4);
        }
        return 6;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        MomentActivitiesAct momentActivitiesAct = this.f157371d;
        if (i == 5) {
            return momentActivitiesAct.f44510d.f98992a;
        }
        MomentActivitiesView momentActivitiesView = (MomentActivitiesView) momentActivitiesAct.inflater().inflate(tec0.f173682i4, viewGroup, false);
        momentActivitiesView.m67835j(i);
        momentActivitiesView.f44517g.setBackgroundColor(i == 0 ? Color.argb(5, 0, 0, 0) : 0);
        return momentActivitiesView;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, MomentActivity momentActivity, int i, int i2) {
        if (i <= 4 || i == 6) {
            MomentActivitiesView momentActivitiesView = (MomentActivitiesView) view;
            if (i == 6) {
                i = 1;
            }
            momentActivitiesView.m67842q(this, momentActivity, i, getItemViewType(i2 + 1) == 5);
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MomentActivity getItem(int i) {
        if (i + 1 == getCount()) {
            return null;
        }
        return this.f157370c.f184001a.get(i);
    }

    /* JADX INFO: renamed from: t */
    public void m176430t(vg60<MomentActivity> vg60Var) {
        boolean z = vg60Var.f184001a.size() > 0 && this.f157370c.f184001a.size() > 0 && !vg60Var.f184001a.get(0).f56859id.equals(this.f157370c.f184001a.get(0).f56859id);
        this.f157370c = vg60Var;
        bnl0.m105524M(this.f157371d.f44510d.f98993b, vg60Var.m201221c());
        notifyDataSetChanged();
        if (z) {
            this.f157371d.f44510d.f98994c.setSelection(0);
        }
    }
}
