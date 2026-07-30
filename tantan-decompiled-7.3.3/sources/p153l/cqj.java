package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class cqj {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final coj f83093a;

    /* JADX INFO: renamed from: b */
    public String f83094b;

    /* JADX INFO: renamed from: c */
    public String f83095c;

    /* JADX INFO: renamed from: l.cqj$a */
    public static class C16337a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public coj f83096a;

        /* JADX INFO: renamed from: b */
        public String f83097b;

        /* JADX INFO: renamed from: c */
        public String f83098c;

        /* JADX INFO: renamed from: d */
        public cqj m111923d() {
            return new cqj(this);
        }

        /* JADX INFO: renamed from: e */
        public C16337a m111924e(@NonNull coj cojVar, String str) {
            this.f83096a = cojVar;
            this.f83097b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16337a m111925f(@NonNull coj cojVar) {
            this.f83096a = cojVar;
            this.f83097b = "extra_type_multi_call";
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C16337a m111926g(@NonNull coj cojVar) {
            this.f83096a = cojVar;
            this.f83097b = "extra_type_audience";
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C16337a m111927h(@NonNull coj cojVar) {
            this.f83096a = cojVar;
            this.f83097b = "extra_type_lian_mai";
            return this;
        }
    }

    public cqj(C16337a c16337a) {
        this.f83095c = "";
        this.f83093a = c16337a.f83096a;
        this.f83094b = c16337a.f83097b;
        this.f83095c = c16337a.f83098c;
    }

    /* JADX INFO: renamed from: a */
    public String m111912a() {
        return this.f83095c;
    }

    /* JADX INFO: renamed from: b */
    public String m111913b() {
        if (TextUtils.isEmpty(this.f83094b)) {
            this.f83094b = "extra_type_normal";
        }
        return this.f83094b;
    }

    /* JADX INFO: renamed from: c */
    public String m111914c() {
        return m111915d().f150592a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public p54 m111915d() {
        return this.f83093a.f82890f;
    }

    /* JADX INFO: renamed from: e */
    public String m111916e() {
        return this.f83093a.f82889e.f107997a;
    }

    /* JADX INFO: renamed from: f */
    public String m111917f() {
        return this.f83093a.f82889e.f107998b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public coj m111918g() {
        return this.f83093a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m111919h() {
        return this.f83093a.m111667i();
    }

    public String toString() {
        return "GiftDialogExtraInfo{userInfo=" + this.f83093a.toString() + ", giftBriefExtraType='" + this.f83094b + "'}";
    }
}
