package com.p051p1.mobile.putong.live.livingroom.increment.gift.wealth;

import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.a */
/* JADX INFO: loaded from: classes4.dex */
public class C13011a {

    /* JADX INFO: renamed from: a */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f51247a;

    /* JADX INFO: renamed from: b */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f51248b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long f51249a;

        /* JADX INFO: renamed from: b */
        public final long f51250b;

        /* JADX INFO: renamed from: c */
        public final double f51251c;

        /* JADX INFO: renamed from: d */
        public long f51252d;

        public a(long j, long j2, double d) {
            this.f51249a = j;
            this.f51250b = j2;
            this.f51251c = d;
        }

        /* JADX INFO: renamed from: a */
        public long m75797a() {
            return this.f51252d;
        }

        /* JADX INFO: renamed from: b */
        public long m75798b() {
            return this.f51249a;
        }

        /* JADX INFO: renamed from: c */
        public float m75799c() {
            return (float) this.f51251c;
        }

        /* JADX INFO: renamed from: d */
        public long m75800d() {
            return this.f51250b;
        }

        /* JADX INFO: renamed from: e */
        public void m75801e(long j) {
            this.f51252d = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75794a(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        if (this.f51247a == null || userLiveHierarchyProgressChange.getWealth() > this.f51247a.getWealth()) {
            this.f51247a = userLiveHierarchyProgressChange;
        }
        if (this.f51248b == null || userLiveHierarchyProgressChange.getPreWealth() < this.f51248b.getPreWealth()) {
            this.f51248b = userLiveHierarchyProgressChange;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75795b() {
        this.f51247a = null;
        this.f51248b = null;
    }

    /* JADX INFO: renamed from: c */
    public a m75796c() {
        LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange = this.f51247a;
        if (userLiveHierarchyProgressChange == null || this.f51248b == null) {
            return null;
        }
        a aVar = new a(userLiveHierarchyProgressChange.getGrade(), this.f51247a.getSuperGrade(), this.f51247a.getWealthRatio());
        aVar.m75801e(this.f51247a.getWealth() - this.f51248b.getPreWealth());
        this.f51247a = null;
        this.f51248b = null;
        return aVar;
    }
}
