package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class mri0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC18543b f135366a;

    /* JADX INFO: renamed from: b */
    public static InterfaceC18543b f135367b;

    /* JADX INFO: renamed from: l.mri0$a */
    public class C18542a implements InterfaceC18543b {
        @Override // p149l.mri0.InterfaceC18543b
        /* JADX INFO: renamed from: e */
        public void mo156030e(String str, String str2, Object... objArr) {
            if (objArr == null || objArr.length == 0) {
                return;
            }
            String.format(str2, objArr);
        }

        @Override // p149l.mri0.InterfaceC18543b
        /* JADX INFO: renamed from: i */
        public void mo156031i(String str, String str2, Object... objArr) {
            if (objArr == null || objArr.length == 0) {
                return;
            }
            String.format(str2, objArr);
        }
    }

    /* JADX INFO: renamed from: l.mri0$b */
    public interface InterfaceC18543b {
        /* JADX INFO: renamed from: e */
        void mo156030e(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: i */
        void mo156031i(String str, String str2, Object... objArr);
    }

    static {
        C18542a c18542a = new C18542a();
        f135366a = c18542a;
        f135367b = c18542a;
    }

    /* JADX INFO: renamed from: a */
    public static void m156028a(String str, String str2, Object... objArr) {
        InterfaceC18543b interfaceC18543b = f135367b;
        if (interfaceC18543b != null) {
            interfaceC18543b.mo156030e(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m156029b(String str, String str2, Object... objArr) {
        InterfaceC18543b interfaceC18543b = f135367b;
        if (interfaceC18543b != null) {
            interfaceC18543b.mo156031i(str, str2, objArr);
        }
    }
}
