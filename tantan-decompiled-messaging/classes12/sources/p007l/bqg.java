package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeUsersView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView;
import com.p1.mobile.android.app.Act;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bqg {

    /* JADX INFO: renamed from: l.bqg$a */
    public static final class C2345a {

        /* JADX INFO: renamed from: a */
        public Act f6408a;

        /* JADX INFO: renamed from: b */
        public hx60 f6409b;

        /* JADX INFO: renamed from: c */
        public Moment f6410c;

        /* JADX INFO: renamed from: d */
        public ViewGroup f6411d;

        /* JADX INFO: renamed from: e */
        public String f6412e;

        /* JADX INFO: renamed from: f */
        public boolean f6413f;

        public C2345a(Act act, ViewGroup viewGroup) {
            this.f6411d = viewGroup;
            this.f6408a = act;
        }

        /* JADX INFO: renamed from: g */
        public View m9017g() {
            return bqg.m9010b(this);
        }

        /* JADX INFO: renamed from: h */
        public C2345a m9018h(boolean z) {
            this.f6413f = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2345a m9019i(Moment moment) {
            this.f6410c = moment;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2345a m9020j(String str) {
            this.f6412e = str;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2345a m9021k(hx60 hx60Var) {
            this.f6409b = hx60Var;
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeUsersView] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedBottomAttitudeView] */
    /* JADX INFO: renamed from: a */
    public static View m9009a(Act act, hx60 hx60Var, Moment moment, String str, boolean z) {
        if ((moment.attitudes.count > yih.m17138l().m17142h() || !yih.m17138l().m17143i()) && !z) {
            ?? r3 = (FeedBottomAttitudeUsersView) LayoutInflater.from(act).inflate(o6c0.f11105P, (ViewGroup) null);
            r3.m5651w(str, moment);
            return r3;
        }
        ?? r4 = (FeedBottomAttitudeView) LayoutInflater.from(act).inflate(o6c0.f11111Q, (ViewGroup) null);
        r4.m5657C(str, hx60Var, moment);
        return r4;
    }

    /* JADX INFO: renamed from: b */
    public static View m9010b(C2345a c2345a) {
        View viewM9009a = m9009a(c2345a.f6408a, c2345a.f6409b, c2345a.f6410c, c2345a.f6412e, c2345a.f6413f);
        c2345a.f6411d.addView(viewM9009a);
        return viewM9009a;
    }
}
