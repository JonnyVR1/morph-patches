package p009l;

import com.p1.mobile.putong.data.AuthData;
import l.e30;
import l.mkd0;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class mnd0 {

    /* JADX INFO: renamed from: l.mnd0$a */
    public class C1035a implements e30<AuthData> {
        public C1035a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AuthData authData) {
            if (authData != null) {
                mnd0.this.m18523a(authData.userId);
            }
        }
    }

    public mnd0() {
        qib0.c0.getAuthData().c().subscribe(mkd0.H(new C1035a(), new C1036b()));
    }

    /* JADX INFO: renamed from: a */
    public abstract void m18523a(String str);

    /* JADX INFO: renamed from: l.mnd0$b */
    public class C1036b implements e30<Throwable> {
        public C1036b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
