package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11461b {

    /* JADX INFO: renamed from: a */
    public List<TopicMoment> f42602a;

    /* JADX INFO: renamed from: b */
    public final C11462c.b f42603b;

    /* JADX INFO: renamed from: c */
    public final boolean f42604c;

    /* JADX INFO: renamed from: d */
    public final int f42605d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public List<TopicMoment> f42606a;

        /* JADX INFO: renamed from: b */
        public C11462c.b f42607b;

        /* JADX INFO: renamed from: c */
        public boolean f42608c;

        /* JADX INFO: renamed from: d */
        public int f42609d;

        /* JADX INFO: renamed from: a */
        public C11461b m65708a() {
            return new C11461b(this.f42606a, this.f42607b, this.f42608c, this.f42609d);
        }

        /* JADX INFO: renamed from: b */
        public a m65709b(int i) {
            this.f42609d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m65710c(boolean z) {
            this.f42608c = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m65711d(C11462c.b bVar) {
            this.f42607b = bVar;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m65712e(List<TopicMoment> list) {
            this.f42606a = list;
            return this;
        }
    }

    public C11461b(List<TopicMoment> list, C11462c.b bVar, boolean z, int i) {
        this.f42602a = list;
        this.f42603b = bVar;
        this.f42604c = z;
        this.f42605d = i;
    }

    /* JADX INFO: renamed from: a */
    public int m65704a() {
        return this.f42605d;
    }

    /* JADX INFO: renamed from: b */
    public C11462c.b m65705b() {
        return this.f42603b;
    }

    /* JADX INFO: renamed from: c */
    public List<TopicMoment> m65706c() {
        return this.f42602a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m65707d() {
        return this.f42604c;
    }
}
