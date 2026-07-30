package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p1.mobile.android.app.Act;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xa70 {

    /* JADX INFO: renamed from: a */
    public Moment f14820a;

    /* JADX INFO: renamed from: b */
    public String f14821b;

    /* JADX INFO: renamed from: c */
    public boolean f14822c;

    /* JADX INFO: renamed from: d */
    public boolean f14823d;

    /* JADX INFO: renamed from: e */
    public boolean f14824e;

    /* JADX INFO: renamed from: f */
    public User f14825f;

    /* JADX INFO: renamed from: g */
    public Act f14826g;

    /* JADX INFO: renamed from: h */
    public int f14827h;

    /* JADX INFO: renamed from: i */
    public Bundle f14828i;

    /* JADX INFO: renamed from: j */
    public hx60 f14829j;

    /* JADX INFO: renamed from: k */
    public RawFeed f14830k;

    /* JADX INFO: renamed from: l */
    public za70 f14831l;

    /* JADX INFO: renamed from: m */
    public d5i f14832m;

    /* JADX INFO: renamed from: n */
    public e5i f14833n;

    /* JADX INFO: renamed from: o */
    public c5i f14834o;

    /* JADX INFO: renamed from: p */
    public List<Object> f14835p;

    /* JADX INFO: renamed from: q */
    public String f14836q;

    /* JADX INFO: renamed from: l.xa70$a */
    public static final class C2532a {

        /* JADX INFO: renamed from: a */
        public Moment f14837a;

        /* JADX INFO: renamed from: b */
        public String f14838b;

        /* JADX INFO: renamed from: c */
        public boolean f14839c;

        /* JADX INFO: renamed from: d */
        public boolean f14840d;

        /* JADX INFO: renamed from: e */
        public boolean f14841e;

        /* JADX INFO: renamed from: f */
        public User f14842f;

        /* JADX INFO: renamed from: g */
        public RawFeed f14843g;

        /* JADX INFO: renamed from: h */
        public Act f14844h;

        /* JADX INFO: renamed from: i */
        public int f14845i;

        /* JADX INFO: renamed from: j */
        public Bundle f14846j;

        /* JADX INFO: renamed from: k */
        public hx60 f14847k;

        /* JADX INFO: renamed from: l */
        public e5i f14848l;

        /* JADX INFO: renamed from: m */
        public List<Object> f14849m;

        /* JADX INFO: renamed from: a */
        public static C2532a m16062a() {
            return new C2532a();
        }

        /* JADX INFO: renamed from: b */
        public xa70 m16063b() {
            xa70 xa70Var = new xa70();
            xa70Var.f14829j = this.f14847k;
            if (this.f14842f == null) {
                xa70Var.f14825f = FeedModule.f316d.m16628e8(this.f14837a.owner);
            }
            xa70Var.f14830k = this.f14843g;
            xa70Var.f14827h = this.f14845i;
            xa70Var.f14826g = this.f14844h;
            xa70Var.f14820a = this.f14837a;
            xa70Var.f14822c = this.f14839c;
            xa70Var.f14823d = this.f14840d;
            xa70Var.f14824e = this.f14841e;
            xa70Var.f14821b = this.f14838b;
            xa70Var.f14828i = this.f14846j;
            xa70Var.f14835p = this.f14849m;
            xa70Var.f14831l = new za70(xa70Var);
            xa70Var.f14833n = this.f14848l;
            List<Object> list = this.f14849m;
            if (list != null && list.size() > 0) {
                xa70Var.f14832m = m16064c();
            }
            return xa70Var;
        }

        /* JADX INFO: renamed from: c */
        public d5i m16064c() {
            d5i d5iVar = new d5i();
            int iM9306b = d5i.m9306b();
            Iterator<Object> it = this.f14849m.iterator();
            while (it.hasNext()) {
                iM9306b &= ((d5i) it.next()).f6835a;
            }
            d5iVar.f6835a = iM9306b;
            return d5iVar;
        }

        /* JADX INFO: renamed from: d */
        public C2532a m16065d(Act act) {
            this.f14844h = act;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2532a m16066e(hx60 hx60Var) {
            this.f14847k = hx60Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C2532a m16067f(RawFeed rawFeed) {
            this.f14843g = rawFeed;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C2532a m16068g(String str) {
            this.f14838b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C2532a m16069h(boolean z) {
            this.f14839c = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2532a m16070i(boolean z) {
            this.f14840d = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2532a m16071j(boolean z) {
            this.f14841e = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2532a m16072k(Moment moment) {
            this.f14837a = moment;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C2532a m16073l(Bundle bundle) {
            this.f14846j = bundle;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C2532a m16074m(List<Object> list) {
            this.f14849m = list;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C2532a m16075n(int i) {
            this.f14845i = i;
            return this;
        }
    }

    public xa70() {
        this.f14834o = new c5i();
    }
}
