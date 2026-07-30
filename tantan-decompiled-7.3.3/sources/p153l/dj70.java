package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class dj70 {

    /* JADX INFO: renamed from: a */
    public Moment f88791a;

    /* JADX INFO: renamed from: b */
    public String f88792b;

    /* JADX INFO: renamed from: c */
    public boolean f88793c;

    /* JADX INFO: renamed from: d */
    public boolean f88794d;

    /* JADX INFO: renamed from: e */
    public boolean f88795e;

    /* JADX INFO: renamed from: f */
    public User f88796f;

    /* JADX INFO: renamed from: g */
    public Act f88797g;

    /* JADX INFO: renamed from: h */
    public int f88798h;

    /* JADX INFO: renamed from: i */
    public Bundle f88799i;

    /* JADX INFO: renamed from: j */
    public n570 f88800j;

    /* JADX INFO: renamed from: k */
    public RawFeed f88801k;

    /* JADX INFO: renamed from: l */
    public fj70 f88802l;

    /* JADX INFO: renamed from: m */
    public s6i f88803m;

    /* JADX INFO: renamed from: n */
    public t6i f88804n;

    /* JADX INFO: renamed from: o */
    public r6i f88805o;

    /* JADX INFO: renamed from: p */
    public List<Object> f88806p;

    /* JADX INFO: renamed from: q */
    public String f88807q;

    /* JADX INFO: renamed from: l.dj70$a */
    public static final class C16548a {

        /* JADX INFO: renamed from: a */
        public Moment f88808a;

        /* JADX INFO: renamed from: b */
        public String f88809b;

        /* JADX INFO: renamed from: c */
        public boolean f88810c;

        /* JADX INFO: renamed from: d */
        public boolean f88811d;

        /* JADX INFO: renamed from: e */
        public boolean f88812e;

        /* JADX INFO: renamed from: f */
        public User f88813f;

        /* JADX INFO: renamed from: g */
        public RawFeed f88814g;

        /* JADX INFO: renamed from: h */
        public Act f88815h;

        /* JADX INFO: renamed from: i */
        public int f88816i;

        /* JADX INFO: renamed from: j */
        public Bundle f88817j;

        /* JADX INFO: renamed from: k */
        public n570 f88818k;

        /* JADX INFO: renamed from: l */
        public t6i f88819l;

        /* JADX INFO: renamed from: m */
        public List<Object> f88820m;

        /* JADX INFO: renamed from: a */
        public static C16548a m116057a() {
            return new C16548a();
        }

        /* JADX INFO: renamed from: b */
        public dj70 m116058b() {
            dj70 dj70Var = new dj70();
            dj70Var.f88800j = this.f88818k;
            if (this.f88813f == null) {
                dj70Var.f88796f = FeedModule.f39703d.m145688e8(this.f88808a.owner);
            }
            dj70Var.f88801k = this.f88814g;
            dj70Var.f88798h = this.f88816i;
            dj70Var.f88797g = this.f88815h;
            dj70Var.f88791a = this.f88808a;
            dj70Var.f88793c = this.f88810c;
            dj70Var.f88794d = this.f88811d;
            dj70Var.f88795e = this.f88812e;
            dj70Var.f88792b = this.f88809b;
            dj70Var.f88799i = this.f88817j;
            dj70Var.f88806p = this.f88820m;
            dj70Var.f88802l = new fj70(dj70Var);
            dj70Var.f88804n = this.f88819l;
            List<Object> list = this.f88820m;
            if (list != null && list.size() > 0) {
                dj70Var.f88803m = m116059c();
            }
            return dj70Var;
        }

        /* JADX INFO: renamed from: c */
        public s6i m116059c() {
            s6i s6iVar = new s6i();
            int iM184911b = s6i.m184911b();
            Iterator<Object> it = this.f88820m.iterator();
            while (it.hasNext()) {
                iM184911b &= ((s6i) it.next()).f166578a;
            }
            s6iVar.f166578a = iM184911b;
            return s6iVar;
        }

        /* JADX INFO: renamed from: d */
        public C16548a m116060d(Act act) {
            this.f88815h = act;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16548a m116061e(n570 n570Var) {
            this.f88818k = n570Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16548a m116062f(RawFeed rawFeed) {
            this.f88814g = rawFeed;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16548a m116063g(String str) {
            this.f88809b = str;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16548a m116064h(boolean z) {
            this.f88810c = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C16548a m116065i(boolean z) {
            this.f88811d = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C16548a m116066j(boolean z) {
            this.f88812e = z;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C16548a m116067k(Moment moment) {
            this.f88808a = moment;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C16548a m116068l(Bundle bundle) {
            this.f88817j = bundle;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C16548a m116069m(List<Object> list) {
            this.f88820m = list;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C16548a m116070n(int i) {
            this.f88816i = i;
            return this;
        }
    }

    public dj70() {
        this.f88805o = new r6i();
    }
}
