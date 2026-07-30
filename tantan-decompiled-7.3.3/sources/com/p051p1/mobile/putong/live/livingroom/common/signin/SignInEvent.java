package com.p051p1.mobile.putong.live.livingroom.common.signin;

/* JADX INFO: loaded from: classes4.dex */
public class SignInEvent {

    /* JADX INFO: renamed from: a */
    public String f50121a;

    /* JADX INFO: renamed from: b */
    public Page f50122b;

    public enum Page {
        MAIN,
        RULE,
        PRIZE_LIST,
        MEDAL_LIST
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.SignInEvent$a */
    public static class C12931a {

        /* JADX INFO: renamed from: a */
        public String f50123a;

        /* JADX INFO: renamed from: b */
        public Page f50124b;

        /* JADX INFO: renamed from: a */
        public SignInEvent m74318a() {
            return new SignInEvent(this);
        }

        /* JADX INFO: renamed from: b */
        public C12931a m74319b(Page page) {
            this.f50124b = page;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12931a m74320c(String str) {
            this.f50123a = str;
            return this;
        }
    }

    public SignInEvent(C12931a c12931a) {
        this.f50121a = c12931a.f50123a;
        this.f50122b = c12931a.f50124b;
    }
}
