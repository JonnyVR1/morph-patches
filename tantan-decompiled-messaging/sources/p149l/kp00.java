package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfileViewLarge;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class kp00 extends wp1<Moment> {

    /* JADX INFO: renamed from: c */
    public q860<Moment> f124083c = q860.m173341a();

    /* JADX INFO: renamed from: d */
    public MomentsInProfileAct f124084d;

    public kp00(MomentsInProfileAct momentsInProfileAct) {
        this.f124084d = momentsInProfileAct;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
        int i2 = i - 1;
        if ((this.f124084d.f43912d.m103348z0() || this.f124084d.f43912d.f76745c) && this.f124083c.m173343c() && this.f124083c.f153135a.size() > 0 && this.f124083c.f153135a.size() - i2 < 6) {
            FeedModule.f38854c.m60717b4(this.f124084d.f43912d.f76743a);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f124084d.f43912d.m103348z0() && !this.f124084d.f43912d.f76745c) {
            if (this.f124083c.f153135a.size() == 0) {
                return 2;
            }
            int size = this.f124083c.f153135a.size();
            q860<Moment> q860Var = this.f124083c;
            return size >= 6 ? q860Var.f153135a.size() + 2 : q860Var.f153135a.size() + 1;
        }
        boolean zM173343c = this.f124083c.m173343c();
        q860<Moment> q860Var2 = this.f124083c;
        if (zM173343c) {
            return q860Var2.f153135a.size() + 2;
        }
        if (!q860Var2.m173343c() && this.f124083c.f153135a.size() == 0) {
            return 2;
        }
        bq00 bq00Var = this.f124084d.f43912d;
        return (bq00Var.f76745c || User.isTeamAccount(bq00Var.f76743a) || !ll40.m150403a()) ? this.f124083c.f153135a.size() + 1 : this.f124083c.f153135a.size() + 2;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2;
        if (i != 0 && (i2 = i - 1) < this.f124083c.f153135a.size()) {
            return this.f124083c.f153135a.get(i2);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = i - 1;
        if (this.f124083c.f153135a.size() == 0 && (!this.f124083c.m173343c() || !this.f124084d.f43912d.m103348z0())) {
            return 7;
        }
        if (this.f124083c.f153135a.size() == i2) {
            if (!this.f124084d.f43912d.m103348z0() && !this.f124084d.f43912d.f76745c && this.f124083c.f153135a.size() >= 6) {
                return 9;
            }
            bq00 bq00Var = this.f124084d.f43912d;
            return (bq00Var.f76745c || User.isTeamAccount(bq00Var.f76743a) || !ll40.m150403a() || this.f124083c.m173343c() || this.f124083c.f153135a.size() <= 0) ? 5 : 10;
        }
        Moment moment = this.f124083c.f153135a.get(i2);
        List<Media> list = moment.media;
        if (list == null) {
            return 0;
        }
        if (list.size() <= 0 || !(moment.media.get(0) instanceof Video)) {
            return Math.min(moment.media.size(), 4);
        }
        return 8;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 12;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f124084d.f43911c.f171897l;
        }
        if (i == 7) {
            return this.f124084d.f43911c.f171898m;
        }
        if (i == 6) {
            return this.f124084d.f43911c.f171889d;
        }
        if (i == 9) {
            return this.f124084d.inflater().inflate(o6c0.f142037G4, viewGroup, false);
        }
        if (i == 10) {
            return this.f124084d.inflater().inflate(o6c0.f142109S4, viewGroup, false);
        }
        MomentsInProfileAct momentsInProfileAct = this.f124084d;
        if (i == 11) {
            return (MomentsInProfileViewLarge) momentsInProfileAct.inflater().inflate(o6c0.f142067L4, viewGroup, false);
        }
        MomentsInProfileView momentsInProfileView = (MomentsInProfileView) momentsInProfileAct.inflater().inflate(o6c0.f142055J4, viewGroup, false);
        if (i == 8) {
            momentsInProfileView.m66999W(o6c0.f142097Q4);
        } else if (i == 1) {
            momentsInProfileView.m66999W(o6c0.f142073M4);
        } else if (i == 2) {
            momentsInProfileView.m66999W(o6c0.f142085O4);
        } else if (i == 3) {
            momentsInProfileView.m66999W(o6c0.f142079N4);
        } else if (i == 4) {
            momentsInProfileView.m66999W(o6c0.f142061K4);
        }
        if (i == 0) {
            momentsInProfileView.f43949h.setBackgroundDrawable(null);
            return momentsInProfileView;
        }
        momentsInProfileView.f43949h.setBackgroundResource(f3c0.f94319E6);
        return momentsInProfileView;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, Moment moment, int i, int i2) {
        Moment moment2;
        if (i == 5 || i == 7 || i == 6 || i == 10 || i == 9) {
            return;
        }
        int i3 = i2 - 1;
        boolean z = false;
        if (i == 11) {
            MomentsInProfileViewLarge momentsInProfileViewLarge = (MomentsInProfileViewLarge) view;
            moment2 = i3 > 0 ? this.f124083c.f153135a.get(i2 - 2) : null;
            if (!this.f124083c.m173343c() && i3 == this.f124083c.f153135a.size() - 1) {
                z = true;
            }
            momentsInProfileViewLarge.m67012X(moment, 1, moment2, z);
            return;
        }
        MomentsInProfileView momentsInProfileView = (MomentsInProfileView) view;
        if (i == 8) {
            i = 1;
        }
        moment2 = i3 > 0 ? this.f124083c.f153135a.get(i2 - 2) : null;
        if (!this.f124083c.m173343c() && i3 == this.f124083c.f153135a.size() - 1) {
            z = true;
        }
        momentsInProfileView.m67003a0(moment, i, moment2, z);
    }

    /* JADX INFO: renamed from: s */
    public void m146802s(q860<Moment> q860Var) {
        this.f124083c = q860Var;
        notifyDataSetChanged();
    }
}
