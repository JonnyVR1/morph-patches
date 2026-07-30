package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import com.p000p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2142b {

    /* JADX INFO: renamed from: a */
    public List<TopicMoment> f3215a;

    /* JADX INFO: renamed from: b */
    public final C2143c.b f3216b;

    /* JADX INFO: renamed from: c */
    public final boolean f3217c;

    /* JADX INFO: renamed from: d */
    public final int f3218d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public List<TopicMoment> f3219a;

        /* JADX INFO: renamed from: b */
        public C2143c.b f3220b;

        /* JADX INFO: renamed from: c */
        public boolean f3221c;

        /* JADX INFO: renamed from: d */
        public int f3222d;

        /* JADX INFO: renamed from: a */
        public C2142b m5616a() {
            return new C2142b(this.f3219a, this.f3220b, this.f3221c, this.f3222d);
        }

        /* JADX INFO: renamed from: b */
        public a m5617b(int i) {
            this.f3222d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m5618c(boolean z) {
            this.f3221c = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m5619d(C2143c.b bVar) {
            this.f3220b = bVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m5620e(List<TopicMoment> list) {
            this.f3219a = list;
            return this;
        }
    }

    public C2142b(List<TopicMoment> list, C2143c.b bVar, boolean z, int i) {
        this.f3215a = list;
        this.f3216b = bVar;
        this.f3217c = z;
        this.f3218d = i;
    }

    /* JADX INFO: renamed from: a */
    public int m5612a() {
        return this.f3218d;
    }

    /* JADX INFO: renamed from: b */
    public C2143c.b m5613b() {
        return this.f3216b;
    }

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> m5614c() {
        return this.f3215a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m5615d() {
        return this.f3217c;
    }
}
