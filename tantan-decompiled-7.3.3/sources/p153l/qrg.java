package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeUsersView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;

/* JADX INFO: loaded from: classes13.dex */
public class qrg {

    /* JADX INFO: renamed from: l.qrg$a */
    public static final class C19633a {

        /* JADX INFO: renamed from: a */
        public Act f159115a;

        /* JADX INFO: renamed from: b */
        public n570 f159116b;

        /* JADX INFO: renamed from: c */
        public Moment f159117c;

        /* JADX INFO: renamed from: d */
        public ViewGroup f159118d;

        /* JADX INFO: renamed from: e */
        public String f159119e;

        /* JADX INFO: renamed from: f */
        public boolean f159120f;

        public C19633a(Act act, ViewGroup viewGroup) {
            this.f159118d = viewGroup;
            this.f159115a = act;
        }

        /* JADX INFO: renamed from: g */
        public View m177553g() {
            return qrg.m177546b(this);
        }

        /* JADX INFO: renamed from: h */
        public C19633a m177554h(boolean z) {
            this.f159120f = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19633a m177555i(Moment moment) {
            this.f159117c = moment;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C19633a m177556j(String str) {
            this.f159119e = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19633a m177557k(n570 n570Var) {
            this.f159116b = n570Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m177545a(Act act, n570 n570Var, Moment moment, String str, boolean z) {
        if ((moment.attitudes.count > nkh.m163608l().m163612h() || !nkh.m163608l().m163613i()) && !z) {
            FeedBottomAttitudeUsersView feedBottomAttitudeUsersView = (FeedBottomAttitudeUsersView) LayoutInflater.from(act).inflate(tec0.f173555P, (ViewGroup) null);
            feedBottomAttitudeUsersView.m65740w(str, moment);
            return feedBottomAttitudeUsersView;
        }
        FeedBottomAttitudeView feedBottomAttitudeView = (FeedBottomAttitudeView) LayoutInflater.from(act).inflate(tec0.f173561Q, (ViewGroup) null);
        feedBottomAttitudeView.m65746C(str, n570Var, moment);
        return feedBottomAttitudeView;
    }

    /* JADX INFO: renamed from: b */
    public static View m177546b(C19633a c19633a) {
        View viewM177545a = m177545a(c19633a.f159115a, c19633a.f159116b, c19633a.f159117c, c19633a.f159119e, c19633a.f159120f);
        c19633a.f159118d.addView(viewM177545a);
        return viewM177545a;
    }
}
