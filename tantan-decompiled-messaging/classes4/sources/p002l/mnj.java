package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mnj {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final mlj f15493a;

    /* JADX INFO: renamed from: b */
    public String f15494b;

    /* JADX INFO: renamed from: c */
    public String f15495c;

    /* JADX INFO: renamed from: l.mnj$a */
    public static class C0680a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public mlj f15496a;

        /* JADX INFO: renamed from: b */
        public String f15497b;

        /* JADX INFO: renamed from: c */
        public String f15498c;

        /* JADX INFO: renamed from: d */
        public mnj m18100d() {
            return new mnj(this);
        }

        /* JADX INFO: renamed from: e */
        public C0680a m18101e(@NonNull mlj mljVar, String str) {
            this.f15496a = mljVar;
            this.f15497b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0680a m18102f(@NonNull mlj mljVar) {
            this.f15496a = mljVar;
            this.f15497b = "extra_type_multi_call";
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0680a m18103g(@NonNull mlj mljVar) {
            this.f15496a = mljVar;
            this.f15497b = "extra_type_audience";
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0680a m18104h(@NonNull mlj mljVar) {
            this.f15496a = mljVar;
            this.f15497b = "extra_type_lian_mai";
            return this;
        }
    }

    public mnj(C0680a c0680a) {
        this.f15495c = "";
        this.f15493a = c0680a.f15496a;
        this.f15494b = c0680a.f15497b;
        this.f15495c = c0680a.f15498c;
    }

    /* JADX INFO: renamed from: a */
    public String m18089a() {
        return this.f15495c;
    }

    /* JADX INFO: renamed from: b */
    public String m18090b() {
        if (TextUtils.isEmpty(this.f15494b)) {
            this.f15494b = "extra_type_normal";
        }
        return this.f15494b;
    }

    /* JADX INFO: renamed from: c */
    public String m18091c() {
        return m18092d().f17800a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public q44 m18092d() {
        return this.f15493a.f15447f;
    }

    /* JADX INFO: renamed from: e */
    public String m18093e() {
        return this.f15493a.f15446e.a;
    }

    /* JADX INFO: renamed from: f */
    public String m18094f() {
        return this.f15493a.f15446e.b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public mlj m18095g() {
        return this.f15493a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m18096h() {
        return this.f15493a.m18009i();
    }

    public String toString() {
        return "GiftDialogExtraInfo{userInfo=" + this.f15493a.toString() + ", giftBriefExtraType='" + this.f15494b + "'}";
    }
}
