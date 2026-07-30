package com.p000p1.mobile.putong.live.livingroom.common.signin;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInEvent {

    /* JADX INFO: renamed from: a */
    public String f5315a;

    /* JADX INFO: renamed from: b */
    public Page f5316b;

    public enum Page {
        MAIN,
        RULE,
        PRIZE_LIST,
        MEDAL_LIST
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.SignInEvent$a */
    public static class C0357a {

        /* JADX INFO: renamed from: a */
        public String f5317a;

        /* JADX INFO: renamed from: b */
        public Page f5318b;

        /* JADX INFO: renamed from: a */
        public SignInEvent m6663a() {
            return new SignInEvent(this);
        }

        /* JADX INFO: renamed from: b */
        public C0357a m6664b(Page page) {
            this.f5318b = page;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0357a m6665c(String str) {
            this.f5317a = str;
            return this;
        }
    }

    public SignInEvent(C0357a c0357a) {
        this.f5315a = c0357a.f5317a;
        this.f5316b = c0357a.f5318b;
    }
}
