package p007l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentActivitiesAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentActivitiesView;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.q860;
import l.wp1;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h800 extends wp1<MomentActivity> {

    /* JADX INFO: renamed from: c */
    public q860<MomentActivity> f8622c = q860.a();

    /* JADX INFO: renamed from: d */
    public MomentActivitiesAct f8623d;

    public h800(MomentActivitiesAct momentActivitiesAct) {
        this.f8623d = momentActivitiesAct;
    }

    /* JADX INFO: renamed from: e */
    public void m10557e(int i) {
        if (i >= this.f8622c.a.size() - 4) {
            FeedModule.f315c.m1621Q2();
        }
    }

    public int getCount() {
        return this.f8622c.a.size() + 1;
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        List<Media> list;
        if (getCount() == i + 1) {
            return 5;
        }
        Moment momentM1635X3 = FeedModule.f315c.m1635X3(getItem(i).reference.f693id);
        if (momentM1635X3 == null || (list = momentM1635X3.media) == null) {
            return 0;
        }
        if (list.size() <= 0 || !(momentM1635X3.media.get(0) instanceof Video)) {
            return Math.min(momentM1635X3.media.size(), 4);
        }
        return 6;
    }

    public int getViewTypeCount() {
        return 7;
    }

    /* JADX INFO: renamed from: m */
    public View m10559m(ViewGroup viewGroup, int i) {
        MomentActivitiesAct momentActivitiesAct = this.f8623d;
        if (i == 5) {
            return momentActivitiesAct.f5123d.f14451a;
        }
        MomentActivitiesView momentActivitiesView = (MomentActivitiesView) momentActivitiesAct.inflater().inflate(o6c0.f11232i4, viewGroup, false);
        momentActivitiesView.m7843j(i);
        momentActivitiesView.f5130g.setBackgroundColor(i == 0 ? Color.argb(5, 0, 0, 0) : 0);
        return momentActivitiesView;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m10558j(View view, MomentActivity momentActivity, int i, int i2) {
        if (i <= 4 || i == 6) {
            MomentActivitiesView momentActivitiesView = (MomentActivitiesView) view;
            if (i == 6) {
                i = 1;
            }
            momentActivitiesView.m7850q(this, momentActivity, i, getItemViewType(i2 + 1) == 5);
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MomentActivity getItem(int i) {
        if (i + 1 == getCount()) {
            return null;
        }
        return (MomentActivity) this.f8622c.a.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m10562t(q860<MomentActivity> q860Var) {
        boolean z = q860Var.a.size() > 0 && this.f8622c.a.size() > 0 && !((DbObject) ((MomentActivity) q860Var.a.get(0))).id.equals(((DbObject) ((MomentActivity) this.f8622c.a.get(0))).id);
        this.f8622c = q860Var;
        xdl0.M(this.f8623d.f5123d.f14452b, q860Var.c());
        notifyDataSetChanged();
        if (z) {
            this.f8623d.f5123d.f14453c.setSelection(0);
        }
    }
}
