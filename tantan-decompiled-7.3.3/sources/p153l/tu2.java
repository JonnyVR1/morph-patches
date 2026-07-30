package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class tu2 {

    /* JADX INFO: renamed from: a */
    public static C20398a f176131a = new C20398a();

    /* JADX INFO: renamed from: l.tu2$a */
    public static class C20398a implements myv {

        /* JADX INFO: renamed from: a */
        public myv f176132a = null;

        /* JADX INFO: renamed from: a */
        public void m192706a(myv myvVar) {
            this.f176132a = myvVar;
        }

        @Override // p153l.myv
        public void log(String str, String str2) {
            myv myvVar = this.f176132a;
            if (myvVar != null) {
                myvVar.log(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m192703a(String str, String str2) {
        f176131a.log(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m192704b(String str, Class cls, String str2, String str3) {
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
        f176131a.log(str, sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public static void m192705c(myv myvVar) {
        f176131a.m192706a(myvVar);
    }
}
