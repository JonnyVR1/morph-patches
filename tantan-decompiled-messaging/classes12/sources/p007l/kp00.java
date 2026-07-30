package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileViewLarge;
import java.util.List;
import l.q860;
import l.wp1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kp00 extends wp1<Moment> {

    /* JADX INFO: renamed from: c */
    public q860<Moment> f9762c = q860.a();

    /* JADX INFO: renamed from: d */
    public MomentsInProfileAct f9763d;

    public kp00(MomentsInProfileAct momentsInProfileAct) {
        this.f9763d = momentsInProfileAct;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m11507e(int i) {
        int i2 = i - 1;
        if ((this.f9763d.f5373d.m9008z0() || this.f9763d.f5373d.f6404c) && this.f9762c.c() && this.f9762c.a.size() > 0 && this.f9762c.a.size() - i2 < 6) {
            FeedModule.f315c.m1643b4(this.f9763d.f5373d.f6402a);
        }
    }

    public int getCount() {
        if (!this.f9763d.f5373d.m9008z0() && !this.f9763d.f5373d.f6404c) {
            if (this.f9762c.a.size() == 0) {
                return 2;
            }
            int size = this.f9762c.a.size();
            q860<Moment> q860Var = this.f9762c;
            return size >= 6 ? q860Var.a.size() + 2 : q860Var.a.size() + 1;
        }
        boolean zC = this.f9762c.c();
        q860<Moment> q860Var2 = this.f9762c;
        if (zC) {
            return q860Var2.a.size() + 2;
        }
        if (!q860Var2.c() && this.f9762c.a.size() == 0) {
            return 2;
        }
        bq00 bq00Var = this.f9763d.f5373d;
        return (bq00Var.f6404c || User.isTeamAccount(bq00Var.f6402a) || !ll40.m11639a()) ? this.f9762c.a.size() + 1 : this.f9762c.a.size() + 2;
    }

    public Object getItem(int i) {
        int i2;
        if (i != 0 && (i2 = i - 1) < this.f9762c.a.size()) {
            return this.f9762c.a.get(i2);
        }
        return null;
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = i - 1;
        if (this.f9762c.a.size() == 0 && (!this.f9762c.c() || !this.f9763d.f5373d.m9008z0())) {
            return 7;
        }
        if (this.f9762c.a.size() == i2) {
            if (!this.f9763d.f5373d.m9008z0() && !this.f9763d.f5373d.f6404c && this.f9762c.a.size() >= 6) {
                return 9;
            }
            bq00 bq00Var = this.f9763d.f5373d;
            return (bq00Var.f6404c || User.isTeamAccount(bq00Var.f6402a) || !ll40.m11639a() || this.f9762c.c() || this.f9762c.a.size() <= 0) ? 5 : 10;
        }
        Moment moment = (Moment) this.f9762c.a.get(i2);
        List<Media> list = moment.media;
        if (list == null) {
            return 0;
        }
        if (list.size() <= 0 || !(moment.media.get(0) instanceof Video)) {
            return Math.min(moment.media.size(), 4);
        }
        return 8;
    }

    public int getViewTypeCount() {
        return 12;
    }

    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.p1.mobile.putong.feed.ui.moments.MomentsInProfileView] */
    /* JADX INFO: renamed from: m */
    public View m11509m(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f9763d.f5372c.f13402l;
        }
        if (i == 7) {
            return this.f9763d.f5372c.f13403m;
        }
        if (i == 6) {
            return this.f9763d.f5372c.f13394d;
        }
        if (i == 9) {
            return this.f9763d.inflater().inflate(o6c0.f11056G4, viewGroup, false);
        }
        if (i == 10) {
            return this.f9763d.inflater().inflate(o6c0.f11128S4, viewGroup, false);
        }
        MomentsInProfileAct momentsInProfileAct = this.f9763d;
        if (i == 11) {
            return (MomentsInProfileViewLarge) momentsInProfileAct.inflater().inflate(o6c0.f11086L4, viewGroup, false);
        }
        ?? r2 = (MomentsInProfileView) momentsInProfileAct.inflater().inflate(o6c0.f11074J4, viewGroup, false);
        if (i == 8) {
            r2.m8201W(o6c0.f11116Q4);
        } else if (i == 1) {
            r2.m8201W(o6c0.f11092M4);
        } else if (i == 2) {
            r2.m8201W(o6c0.f11104O4);
        } else if (i == 3) {
            r2.m8201W(o6c0.f11098N4);
        } else if (i == 4) {
            r2.m8201W(o6c0.f11080K4);
        }
        if (i == 0) {
            r2.f5410h.setBackgroundDrawable(null);
            return r2;
        }
        r2.f5410h.setBackgroundResource(f3c0.f7602E6);
        return r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m11508j(View view, Moment moment, int i, int i2) {
        Moment moment2;
        if (i == 5 || i == 7 || i == 6 || i == 10 || i == 9) {
            return;
        }
        int i3 = i2 - 1;
        boolean z = false;
        if (i == 11) {
            MomentsInProfileViewLarge momentsInProfileViewLarge = (MomentsInProfileViewLarge) view;
            moment2 = i3 > 0 ? (Moment) this.f9762c.a.get(i2 - 2) : null;
            if (!this.f9762c.c() && i3 == this.f9762c.a.size() - 1) {
                z = true;
            }
            momentsInProfileViewLarge.m8214X(moment, 1, moment2, z);
            return;
        }
        MomentsInProfileView momentsInProfileView = (MomentsInProfileView) view;
        if (i == 8) {
            i = 1;
        }
        moment2 = i3 > 0 ? (Moment) this.f9762c.a.get(i2 - 2) : null;
        if (!this.f9762c.c() && i3 == this.f9762c.a.size() - 1) {
            z = true;
        }
        momentsInProfileView.m8205a0(moment, i, moment2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m11511s(q860<Moment> q860Var) {
        this.f9762c = q860Var;
        notifyDataSetChanged();
    }
}
