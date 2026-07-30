package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class du2 {

    /* JADX INFO: renamed from: a */
    public static C16472a f87948a = new C16472a();

    /* JADX INFO: renamed from: l.du2$a */
    public static class C16472a implements mwv {

        /* JADX INFO: renamed from: a */
        public mwv f87949a = null;

        /* JADX INFO: renamed from: a */
        public void m113673a(mwv mwvVar) {
            this.f87949a = mwvVar;
        }

        @Override // p149l.mwv
        public void log(String str, String str2) {
            mwv mwvVar = this.f87949a;
            if (mwvVar != null) {
                mwvVar.log(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m113670a(String str, String str2) {
        f87948a.log(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m113671b(String str, Class cls, String str2, String str3) {
        if (cls == null || TextUtils.isEmpty(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder(cls.getName());
        sb.append(":");
        sb.append(str2);
        if (!TextUtils.isEmpty(str3)) {
            sb.append(":");
            sb.append(str3);
        }
        f87948a.log(str, sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m113672c(mwv mwvVar) {
        f87948a.m113673a(mwvVar);
    }
}
