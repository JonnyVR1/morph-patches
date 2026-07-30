package p153l;

/* JADX INFO: loaded from: classes11.dex */
public class p0j0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC19265b f150052a;

    /* JADX INFO: renamed from: b */
    public static InterfaceC19265b f150053b;

    /* JADX INFO: renamed from: l.p0j0$a */
    public class C19264a implements InterfaceC19265b {
        @Override // p153l.p0j0.InterfaceC19265b
        /* JADX INFO: renamed from: e */
        public void mo170059e(String str, String str2, Object... objArr) {
            if (objArr == null || objArr.length == 0) {
                return;
            }
            String.format(str2, objArr);
        }

        @Override // p153l.p0j0.InterfaceC19265b
        /* JADX INFO: renamed from: i */
        public void mo170060i(String str, String str2, Object... objArr) {
            if (objArr == null || objArr.length == 0) {
                return;
            }
            String.format(str2, objArr);
        }
    }

    /* JADX INFO: renamed from: l.p0j0$b */
    public interface InterfaceC19265b {
        /* JADX INFO: renamed from: e */
        void mo170059e(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: i */
        void mo170060i(String str, String str2, Object... objArr);
    }

    static {
        C19264a c19264a = new C19264a();
        f150052a = c19264a;
        f150053b = c19264a;
    }

    /* JADX INFO: renamed from: a */
    public static void m170057a(String str, String str2, Object... objArr) {
        InterfaceC19265b interfaceC19265b = f150053b;
        if (interfaceC19265b != null) {
            interfaceC19265b.mo170059e(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m170058b(String str, String str2, Object... objArr) {
        InterfaceC19265b interfaceC19265b = f150053b;
        if (interfaceC19265b != null) {
            interfaceC19265b.mo170060i(str, str2, objArr);
        }
    }
}
