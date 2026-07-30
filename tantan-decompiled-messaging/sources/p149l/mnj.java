package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class mnj {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final mlj f134754a;

    /* JADX INFO: renamed from: b */
    public String f134755b;

    /* JADX INFO: renamed from: c */
    public String f134756c;

    /* JADX INFO: renamed from: l.mnj$a */
    public static class C18509a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public mlj f134757a;

        /* JADX INFO: renamed from: b */
        public String f134758b;

        /* JADX INFO: renamed from: c */
        public String f134759c;

        /* JADX INFO: renamed from: d */
        public mnj m155523d() {
            return new mnj(this);
        }

        /* JADX INFO: renamed from: e */
        public C18509a m155524e(@NonNull mlj mljVar, String str) {
            this.f134757a = mljVar;
            this.f134758b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C18509a m155525f(@NonNull mlj mljVar) {
            this.f134757a = mljVar;
            this.f134758b = "extra_type_multi_call";
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C18509a m155526g(@NonNull mlj mljVar) {
            this.f134757a = mljVar;
            this.f134758b = "extra_type_audience";
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C18509a m155527h(@NonNull mlj mljVar) {
            this.f134757a = mljVar;
            this.f134758b = "extra_type_lian_mai";
            return this;
        }
    }

    public mnj(C18509a c18509a) {
        this.f134756c = "";
        this.f134754a = c18509a.f134757a;
        this.f134755b = c18509a.f134758b;
        this.f134756c = c18509a.f134759c;
    }

    /* JADX INFO: renamed from: a */
    public String m155512a() {
        return this.f134756c;
    }

    /* JADX INFO: renamed from: b */
    public String m155513b() {
        if (TextUtils.isEmpty(this.f134755b)) {
            this.f134755b = "extra_type_normal";
        }
        return this.f134755b;
    }

    /* JADX INFO: renamed from: c */
    public String m155514c() {
        return m155515d().f152537a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public q44 m155515d() {
        return this.f134754a.f134445f;
    }

    /* JADX INFO: renamed from: e */
    public String m155516e() {
        return this.f134754a.f134444e.f111520a;
    }

    /* JADX INFO: renamed from: f */
    public String m155517f() {
        return this.f134754a.f134444e.f111521b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public mlj m155518g() {
        return this.f134754a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m155519h() {
        return this.f134754a.m155160i();
    }

    public String toString() {
        return "GiftDialogExtraInfo{userInfo=" + this.f134754a.toString() + ", giftBriefExtraType='" + this.f134755b + "'}";
    }
}
