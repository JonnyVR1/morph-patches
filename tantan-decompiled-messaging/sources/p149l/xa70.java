package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class xa70 {

    /* JADX INFO: renamed from: a */
    public Moment f191689a;

    /* JADX INFO: renamed from: b */
    public String f191690b;

    /* JADX INFO: renamed from: c */
    public boolean f191691c;

    /* JADX INFO: renamed from: d */
    public boolean f191692d;

    /* JADX INFO: renamed from: e */
    public boolean f191693e;

    /* JADX INFO: renamed from: f */
    public User f191694f;

    /* JADX INFO: renamed from: g */
    public Act f191695g;

    /* JADX INFO: renamed from: h */
    public int f191696h;

    /* JADX INFO: renamed from: i */
    public Bundle f191697i;

    /* JADX INFO: renamed from: j */
    public hx60 f191698j;

    /* JADX INFO: renamed from: k */
    public RawFeed f191699k;

    /* JADX INFO: renamed from: l */
    public za70 f191700l;

    /* JADX INFO: renamed from: m */
    public d5i f191701m;

    /* JADX INFO: renamed from: n */
    public e5i f191702n;

    /* JADX INFO: renamed from: o */
    public c5i f191703o;

    /* JADX INFO: renamed from: p */
    public List<Object> f191704p;

    /* JADX INFO: renamed from: q */
    public String f191705q;

    /* JADX INFO: renamed from: l.xa70$a */
    public static final class C21052a {

        /* JADX INFO: renamed from: a */
        public Moment f191706a;

        /* JADX INFO: renamed from: b */
        public String f191707b;

        /* JADX INFO: renamed from: c */
        public boolean f191708c;

        /* JADX INFO: renamed from: d */
        public boolean f191709d;

        /* JADX INFO: renamed from: e */
        public boolean f191710e;

        /* JADX INFO: renamed from: f */
        public User f191711f;

        /* JADX INFO: renamed from: g */
        public RawFeed f191712g;

        /* JADX INFO: renamed from: h */
        public Act f191713h;

        /* JADX INFO: renamed from: i */
        public int f191714i;

        /* JADX INFO: renamed from: j */
        public Bundle f191715j;

        /* JADX INFO: renamed from: k */
        public hx60 f191716k;

        /* JADX INFO: renamed from: l */
        public e5i f191717l;

        /* JADX INFO: renamed from: m */
        public List<Object> f191718m;

        /* JADX INFO: renamed from: a */
        public static C21052a m207548a() {
            return new C21052a();
        }

        /* JADX INFO: renamed from: b */
        public xa70 m207549b() {
            xa70 xa70Var = new xa70();
            xa70Var.f191698j = this.f191716k;
            if (this.f191711f == null) {
                xa70Var.f191694f = FeedModule.f38855d.m209447e8(this.f191706a.owner);
            }
            xa70Var.f191699k = this.f191712g;
            xa70Var.f191696h = this.f191714i;
            xa70Var.f191695g = this.f191713h;
            xa70Var.f191689a = this.f191706a;
            xa70Var.f191691c = this.f191708c;
            xa70Var.f191692d = this.f191709d;
            xa70Var.f191693e = this.f191710e;
            xa70Var.f191690b = this.f191707b;
            xa70Var.f191697i = this.f191715j;
            xa70Var.f191704p = this.f191718m;
            xa70Var.f191700l = new za70(xa70Var);
            xa70Var.f191702n = this.f191717l;
            List<Object> list = this.f191718m;
            if (list != null && list.size() > 0) {
                xa70Var.f191701m = m207550c();
            }
            return xa70Var;
        }

        /* JADX INFO: renamed from: c */
        public d5i m207550c() {
            d5i d5iVar = new d5i();
            int iM110057b = d5i.m110057b();
            Iterator<Object> it = this.f191718m.iterator();
            while (it.hasNext()) {
                iM110057b &= ((d5i) it.next()).f84537a;
            }
            d5iVar.f84537a = iM110057b;
            return d5iVar;
        }

        /* JADX INFO: renamed from: d */
        public C21052a m207551d(Act act) {
            this.f191713h = act;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21052a m207552e(hx60 hx60Var) {
            this.f191716k = hx60Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C21052a m207553f(RawFeed rawFeed) {
            this.f191712g = rawFeed;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C21052a m207554g(String str) {
            this.f191707b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C21052a m207555h(boolean z) {
            this.f191708c = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C21052a m207556i(boolean z) {
            this.f191709d = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C21052a m207557j(boolean z) {
            this.f191710e = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C21052a m207558k(Moment moment) {
            this.f191706a = moment;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C21052a m207559l(Bundle bundle) {
            this.f191715j = bundle;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C21052a m207560m(List<Object> list) {
            this.f191718m = list;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C21052a m207561n(int i) {
            this.f191714i = i;
            return this;
        }
    }

    public xa70() {
        this.f191703o = new c5i();
    }
}
