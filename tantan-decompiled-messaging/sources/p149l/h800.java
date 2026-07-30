package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentActivitiesAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentActivitiesView;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class h800 extends wp1<MomentActivity> {

    /* JADX INFO: renamed from: c */
    public q860<MomentActivity> f106364c = q860.m173341a();

    /* JADX INFO: renamed from: d */
    public MomentActivitiesAct f106365d;

    public h800(MomentActivitiesAct momentActivitiesAct) {
        this.f106365d = momentActivitiesAct;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
        if (i >= this.f106364c.f153135a.size() - 4) {
            FeedModule.f38854c.m60695Q2();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f106364c.f153135a.size() + 1;
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
        Moment momentM60709X3 = FeedModule.f38854c.m60709X3(getItem(i).reference.f39232id);
        if (momentM60709X3 == null || (list = momentM60709X3.media) == null) {
            return 0;
        }
        if (list.size() <= 0 || !(momentM60709X3.media.get(0) instanceof Video)) {
            return Math.min(momentM60709X3.media.size(), 4);
        }
        return 6;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        MomentActivitiesAct momentActivitiesAct = this.f106365d;
        if (i == 5) {
            return momentActivitiesAct.f43662d.f185124a;
        }
        MomentActivitiesView momentActivitiesView = (MomentActivitiesView) momentActivitiesAct.inflater().inflate(o6c0.f142213i4, viewGroup, false);
        momentActivitiesView.m66652j(i);
        momentActivitiesView.f43669g.setBackgroundColor(i == 0 ? Color.argb(5, 0, 0, 0) : 0);
        return momentActivitiesView;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, MomentActivity momentActivity, int i, int i2) {
        if (i <= 4 || i == 6) {
            MomentActivitiesView momentActivitiesView = (MomentActivitiesView) view;
            if (i == 6) {
                i = 1;
            }
            momentActivitiesView.m66659q(this, momentActivity, i, getItemViewType(i2 + 1) == 5);
        }
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MomentActivity getItem(int i) {
        if (i + 1 == getCount()) {
            return null;
        }
        return this.f106364c.f153135a.get(i);
    }

    /* JADX INFO: renamed from: t */
    public void m129808t(q860<MomentActivity> q860Var) {
        boolean z = q860Var.f153135a.size() > 0 && this.f106364c.f153135a.size() > 0 && !q860Var.f153135a.get(0).f56011id.equals(this.f106364c.f153135a.get(0).f56011id);
        this.f106364c = q860Var;
        xdl0.m208344M(this.f106365d.f43662d.f185125b, q860Var.m173343c());
        notifyDataSetChanged();
        if (z) {
            this.f106365d.f43662d.f185126c.setSelection(0);
        }
    }
}
