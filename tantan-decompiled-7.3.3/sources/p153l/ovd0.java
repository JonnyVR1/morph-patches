package p153l;

import com.p051p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ovd0 {

    /* JADX INFO: renamed from: l.ovd0$a */
    public class C19226a implements y20<AuthData> {
        public C19226a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(AuthData authData) {
            if (authData != null) {
                ovd0.this.mo169431a(authData.userId);
            }
        }
    }

    public ovd0() {
        uqb0.f180397c0.getAuthData().m142510c().subscribe(psd0.m173597H(new C19226a(), new C19227b()));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo169431a(String str);

    /* JADX INFO: renamed from: l.ovd0$b */
    public class C19227b implements y20<Throwable> {
        public C19227b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
        }
    }
}
