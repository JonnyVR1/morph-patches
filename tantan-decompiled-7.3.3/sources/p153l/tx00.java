package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileViewLarge;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class tx00 extends dq1<Moment> {

    /* JADX INFO: renamed from: c */
    public vg60<Moment> f176487c = vg60.m201219a();

    /* JADX INFO: renamed from: d */
    public MomentsInProfileAct f176488d;

    public tx00(MomentsInProfileAct momentsInProfileAct) {
        this.f176488d = momentsInProfileAct;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
        int i2 = i - 1;
        if ((this.f176488d.f44760d.m151939z0() || this.f176488d.f44760d.f129258c) && this.f176487c.m201221c() && this.f176487c.f184001a.size() > 0 && this.f176487c.f184001a.size() - i2 < 6) {
            FeedModule.f39702c.m61901b4(this.f176488d.f44760d.f129256a);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f176488d.f44760d.m151939z0() && !this.f176488d.f44760d.f129258c) {
            if (this.f176487c.f184001a.size() == 0) {
                return 2;
            }
            int size = this.f176487c.f184001a.size();
            vg60<Moment> vg60Var = this.f176487c;
            return size >= 6 ? vg60Var.f184001a.size() + 2 : vg60Var.f184001a.size() + 1;
        }
        boolean zM201221c = this.f176487c.m201221c();
        vg60<Moment> vg60Var2 = this.f176487c;
        if (zM201221c) {
            return vg60Var2.f184001a.size() + 2;
        }
        if (!vg60Var2.m201221c() && this.f176487c.f184001a.size() == 0) {
            return 2;
        }
        ky00 ky00Var = this.f176488d.f44760d;
        return (ky00Var.f129258c || User.isTeamAccount(ky00Var.f129256a) || !zt40.m221413a()) ? this.f176487c.f184001a.size() + 1 : this.f176487c.f184001a.size() + 2;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2;
        if (i != 0 && (i2 = i - 1) < this.f176487c.f184001a.size()) {
            return this.f176487c.f184001a.get(i2);
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
        if (this.f176487c.f184001a.size() == 0 && (!this.f176487c.m201221c() || !this.f176488d.f44760d.m151939z0())) {
            return 7;
        }
        if (this.f176487c.f184001a.size() == i2) {
            if (!this.f176488d.f44760d.m151939z0() && !this.f176488d.f44760d.f129258c && this.f176487c.f184001a.size() >= 6) {
                return 9;
            }
            ky00 ky00Var = this.f176488d.f44760d;
            return (ky00Var.f129258c || User.isTeamAccount(ky00Var.f129256a) || !zt40.m221413a() || this.f176487c.m201221c() || this.f176487c.f184001a.size() <= 0) ? 5 : 10;
        }
        Moment moment = this.f176487c.f184001a.get(i2);
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

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f176488d.f44759c.f79325l;
        }
        if (i == 7) {
            return this.f176488d.f44759c.f79326m;
        }
        if (i == 6) {
            return this.f176488d.f44759c.f79317d;
        }
        if (i == 9) {
            return this.f176488d.inflater().inflate(tec0.f173506G4, viewGroup, false);
        }
        if (i == 10) {
            return this.f176488d.inflater().inflate(tec0.f173578S4, viewGroup, false);
        }
        MomentsInProfileAct momentsInProfileAct = this.f176488d;
        if (i == 11) {
            return (MomentsInProfileViewLarge) momentsInProfileAct.inflater().inflate(tec0.f173536L4, viewGroup, false);
        }
        MomentsInProfileView momentsInProfileView = (MomentsInProfileView) momentsInProfileAct.inflater().inflate(tec0.f173524J4, viewGroup, false);
        if (i == 8) {
            momentsInProfileView.m68182W(tec0.f173566Q4);
        } else if (i == 1) {
            momentsInProfileView.m68182W(tec0.f173542M4);
        } else if (i == 2) {
            momentsInProfileView.m68182W(tec0.f173554O4);
        } else if (i == 3) {
            momentsInProfileView.m68182W(tec0.f173548N4);
        } else if (i == 4) {
            momentsInProfileView.m68182W(tec0.f173530K4);
        }
        if (i == 0) {
            momentsInProfileView.f44797h.setBackgroundDrawable(null);
            return momentsInProfileView;
        }
        momentsInProfileView.f44797h.setBackgroundResource(lbc0.f130837E6);
        return momentsInProfileView;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, Moment moment, int i, int i2) {
        Moment moment2;
        if (i == 5 || i == 7 || i == 6 || i == 10 || i == 9) {
            return;
        }
        int i3 = i2 - 1;
        boolean z = false;
        if (i == 11) {
            MomentsInProfileViewLarge momentsInProfileViewLarge = (MomentsInProfileViewLarge) view;
            moment2 = i3 > 0 ? this.f176487c.f184001a.get(i2 - 2) : null;
            if (!this.f176487c.m201221c() && i3 == this.f176487c.f184001a.size() - 1) {
                z = true;
            }
            momentsInProfileViewLarge.m68195X(moment, 1, moment2, z);
            return;
        }
        MomentsInProfileView momentsInProfileView = (MomentsInProfileView) view;
        if (i == 8) {
            i = 1;
        }
        moment2 = i3 > 0 ? this.f176487c.f184001a.get(i2 - 2) : null;
        if (!this.f176487c.m201221c() && i3 == this.f176487c.f184001a.size() - 1) {
            z = true;
        }
        momentsInProfileView.m68186a0(moment, i, moment2, z);
    }

    /* JADX INFO: renamed from: s */
    public void m193464s(vg60<Moment> vg60Var) {
        this.f176487c = vg60Var;
        notifyDataSetChanged();
    }
}
