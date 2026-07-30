package com.p046p1.mobile.putong.live.livingroom.increment.gift.wealth;

import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12848a {

    /* JADX INFO: renamed from: a */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f50399a;

    /* JADX INFO: renamed from: b */
    public LongLinkLiveUserLevel.UserLiveHierarchyProgressChange f50400b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.wealth.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long f50401a;

        /* JADX INFO: renamed from: b */
        public final long f50402b;

        /* JADX INFO: renamed from: c */
        public final double f50403c;

        /* JADX INFO: renamed from: d */
        public long f50404d;

        public a(long j, long j2, double d) {
            this.f50401a = j;
            this.f50402b = j2;
            this.f50403c = d;
        }

        /* JADX INFO: renamed from: a */
        public long m74614a() {
            return this.f50404d;
        }

        /* JADX INFO: renamed from: b */
        public long m74615b() {
            return this.f50401a;
        }

        /* JADX INFO: renamed from: c */
        public float m74616c() {
            return (float) this.f50403c;
        }

        /* JADX INFO: renamed from: d */
        public long m74617d() {
            return this.f50402b;
        }

        /* JADX INFO: renamed from: e */
        public void m74618e(long j) {
            this.f50404d = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74611a(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        if (this.f50399a == null || userLiveHierarchyProgressChange.getWealth() > this.f50399a.getWealth()) {
            this.f50399a = userLiveHierarchyProgressChange;
        }
        if (this.f50400b == null || userLiveHierarchyProgressChange.getPreWealth() < this.f50400b.getPreWealth()) {
            this.f50400b = userLiveHierarchyProgressChange;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m74612b() {
        this.f50399a = null;
        this.f50400b = null;
    }

    /* JADX INFO: renamed from: c */
    public a m74613c() {
        LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange = this.f50399a;
        if (userLiveHierarchyProgressChange == null || this.f50400b == null) {
            return null;
        }
        a aVar = new a(userLiveHierarchyProgressChange.getGrade(), this.f50399a.getSuperGrade(), this.f50399a.getWealthRatio());
        aVar.m74618e(this.f50399a.getWealth() - this.f50400b.getPreWealth());
        this.f50399a = null;
        this.f50400b = null;
        return aVar;
    }
}
