package com.p046p1.mobile.putong.live.livingroom.common.signin;

/* JADX INFO: loaded from: classes4.dex */
public class SignInEvent {

    /* JADX INFO: renamed from: a */
    public String f49273a;

    /* JADX INFO: renamed from: b */
    public Page f49274b;

    public enum Page {
        MAIN,
        RULE,
        PRIZE_LIST,
        MEDAL_LIST
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.SignInEvent$a */
    public static class C12768a {

        /* JADX INFO: renamed from: a */
        public String f49275a;

        /* JADX INFO: renamed from: b */
        public Page f49276b;

        /* JADX INFO: renamed from: a */
        public SignInEvent m73135a() {
            return new SignInEvent(this);
        }

        /* JADX INFO: renamed from: b */
        public C12768a m73136b(Page page) {
            this.f49276b = page;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12768a m73137c(String str) {
            this.f49275a = str;
            return this;
        }
    }

    public SignInEvent(C12768a c12768a) {
        this.f49273a = c12768a.f49275a;
        this.f49274b = c12768a.f49276b;
    }
}
