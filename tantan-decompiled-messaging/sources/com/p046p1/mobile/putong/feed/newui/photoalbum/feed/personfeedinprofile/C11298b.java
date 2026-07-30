package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11298b {

    /* JADX INFO: renamed from: a */
    public List<TopicMoment> f41754a;

    /* JADX INFO: renamed from: b */
    public final C11299c.b f41755b;

    /* JADX INFO: renamed from: c */
    public final boolean f41756c;

    /* JADX INFO: renamed from: d */
    public final int f41757d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public List<TopicMoment> f41758a;

        /* JADX INFO: renamed from: b */
        public C11299c.b f41759b;

        /* JADX INFO: renamed from: c */
        public boolean f41760c;

        /* JADX INFO: renamed from: d */
        public int f41761d;

        /* JADX INFO: renamed from: a */
        public C11298b m64525a() {
            return new C11298b(this.f41758a, this.f41759b, this.f41760c, this.f41761d);
        }

        /* JADX INFO: renamed from: b */
        public a m64526b(int i) {
            this.f41761d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m64527c(boolean z) {
            this.f41760c = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m64528d(C11299c.b bVar) {
            this.f41759b = bVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m64529e(List<TopicMoment> list) {
            this.f41758a = list;
            return this;
        }
    }

    public C11298b(List<TopicMoment> list, C11299c.b bVar, boolean z, int i) {
        this.f41754a = list;
        this.f41755b = bVar;
        this.f41756c = z;
        this.f41757d = i;
    }

    /* JADX INFO: renamed from: a */
    public int m64521a() {
        return this.f41757d;
    }

    /* JADX INFO: renamed from: b */
    public C11299c.b m64522b() {
        return this.f41755b;
    }

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> m64523c() {
        return this.f41754a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m64524d() {
        return this.f41756c;
    }
}
