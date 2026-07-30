package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeUsersView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;

/* JADX INFO: loaded from: classes12.dex */
public class bqg {

    /* JADX INFO: renamed from: l.bqg$a */
    public static final class C15943a {

        /* JADX INFO: renamed from: a */
        public Act f76772a;

        /* JADX INFO: renamed from: b */
        public hx60 f76773b;

        /* JADX INFO: renamed from: c */
        public Moment f76774c;

        /* JADX INFO: renamed from: d */
        public ViewGroup f76775d;

        /* JADX INFO: renamed from: e */
        public String f76776e;

        /* JADX INFO: renamed from: f */
        public boolean f76777f;

        public C15943a(Act act, ViewGroup viewGroup) {
            this.f76775d = viewGroup;
            this.f76772a = act;
        }

        /* JADX INFO: renamed from: g */
        public View m103375g() {
            return bqg.m103368b(this);
        }

        /* JADX INFO: renamed from: h */
        public C15943a m103376h(boolean z) {
            this.f76777f = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C15943a m103377i(Moment moment) {
            this.f76774c = moment;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C15943a m103378j(String str) {
            this.f76776e = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C15943a m103379k(hx60 hx60Var) {
            this.f76773b = hx60Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m103367a(Act act, hx60 hx60Var, Moment moment, String str, boolean z) {
        if ((moment.attitudes.count > yih.m214909l().m214913h() || !yih.m214909l().m214914i()) && !z) {
            FeedBottomAttitudeUsersView feedBottomAttitudeUsersView = (FeedBottomAttitudeUsersView) LayoutInflater.from(act).inflate(o6c0.f142086P, (ViewGroup) null);
            feedBottomAttitudeUsersView.m64557w(str, moment);
            return feedBottomAttitudeUsersView;
        }
        FeedBottomAttitudeView feedBottomAttitudeView = (FeedBottomAttitudeView) LayoutInflater.from(act).inflate(o6c0.f142092Q, (ViewGroup) null);
        feedBottomAttitudeView.m64563C(str, hx60Var, moment);
        return feedBottomAttitudeView;
    }

    /* JADX INFO: renamed from: b */
    public static View m103368b(C15943a c15943a) {
        View viewM103367a = m103367a(c15943a.f76772a, c15943a.f76773b, c15943a.f76774c, c15943a.f76776e, c15943a.f76777f);
        c15943a.f76775d.addView(viewM103367a);
        return viewM103367a;
    }
}
