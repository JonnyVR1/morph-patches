package p149l;

import com.p046p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes11.dex */
public abstract class mnd0 {

    /* JADX INFO: renamed from: l.mnd0$a */
    public class C18507a implements e30<AuthData> {
        public C18507a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AuthData authData) {
            if (authData != null) {
                mnd0.this.mo99213a(authData.userId);
            }
        }
    }

    public mnd0() {
        qib0.f154714c0.getAuthData().m127348c().subscribe(mkd0.m154956H(new C18507a(), new C18508b()));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo99213a(String str);

    /* JADX INFO: renamed from: l.mnd0$b */
    public class C18508b implements e30<Throwable> {
        public C18508b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
