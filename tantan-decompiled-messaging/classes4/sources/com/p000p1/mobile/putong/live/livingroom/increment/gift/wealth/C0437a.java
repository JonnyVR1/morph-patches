package com.p000p1.mobile.putong.live.livingroom.increment.gift.wealth;

import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0437a {

    /* JADX INFO: renamed from: a */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f6441a;

    /* JADX INFO: renamed from: b */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f6442b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long f6443a;

        /* JADX INFO: renamed from: b */
        public final long f6444b;

        /* JADX INFO: renamed from: c */
        public final double f6445c;

        /* JADX INFO: renamed from: d */
        public long f6446d;

        public a(long j, long j2, double d) {
            this.f6443a = j;
            this.f6444b = j2;
            this.f6445c = d;
        }

        /* JADX INFO: renamed from: a */
        public long m8207a() {
            return this.f6446d;
        }

        /* JADX INFO: renamed from: b */
        public long m8208b() {
            return this.f6443a;
        }

        /* JADX INFO: renamed from: c */
        public float m8209c() {
            return (float) this.f6445c;
        }

        /* JADX INFO: renamed from: d */
        public long m8210d() {
            return this.f6444b;
        }

        /* JADX INFO: renamed from: e */
        public void m8211e(long j) {
            this.f6446d = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m8204a(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        if (this.f6441a == null || userLiveHierarchyProgressChange.getWealth() > this.f6441a.getWealth()) {
            this.f6441a = userLiveHierarchyProgressChange;
        }
        if (this.f6442b == null || userLiveHierarchyProgressChange.getPreWealth() < this.f6442b.getPreWealth()) {
            this.f6442b = userLiveHierarchyProgressChange;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8205b() {
        this.f6441a = null;
        this.f6442b = null;
    }

    /* JADX INFO: renamed from: c */
    public a m8206c() {
        LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange = this.f6441a;
        if (userLiveHierarchyProgressChange == null || this.f6442b == null) {
            return null;
        }
        a aVar = new a(userLiveHierarchyProgressChange.getGrade(), this.f6441a.getSuperGrade(), this.f6441a.getWealthRatio());
        aVar.m8211e(this.f6441a.getWealth() - this.f6442b.getPreWealth());
        this.f6441a = null;
        this.f6442b = null;
        return aVar;
    }
}
