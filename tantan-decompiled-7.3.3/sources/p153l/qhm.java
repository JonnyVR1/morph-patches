package p153l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.google.android.gms.common.api.Api;
import p153l.qhm;

/* JADX INFO: loaded from: classes.dex */
public class qhm<T extends qhm> {

    /* JADX INFO: renamed from: a */
    public int f157724a = 100;

    /* JADX INFO: renamed from: b */
    public int f157725b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c */
    public boolean f157726c;

    /* JADX INFO: renamed from: d */
    public boolean f157727d;

    /* JADX INFO: renamed from: e */
    public boolean f157728e;

    /* JADX INFO: renamed from: f */
    public boolean f157729f;

    /* JADX INFO: renamed from: g */
    public boolean f157730g;

    /* JADX INFO: renamed from: h */
    public Bitmap.Config f157731h;

    /* JADX INFO: renamed from: i */
    public Bitmap.Config f157732i;

    /* JADX INFO: renamed from: j */
    public shm f157733j;

    /* JADX INFO: renamed from: k */
    public ColorSpace f157734k;

    /* JADX INFO: renamed from: l */
    public boolean f157735l;

    public qhm() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f157731h = config;
        this.f157732i = config;
    }

    /* JADX INFO: renamed from: a */
    public phm m176595a() {
        return new phm(this);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap.Config m176596b() {
        return this.f157732i;
    }

    /* JADX INFO: renamed from: c */
    public Bitmap.Config m176597c() {
        return this.f157731h;
    }

    /* JADX INFO: renamed from: d */
    public f33 m176598d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public ColorSpace m176599e() {
        return this.f157734k;
    }

    /* JADX INFO: renamed from: f */
    public shm m176600f() {
        return this.f157733j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m176601g() {
        return this.f157729f;
    }

    /* JADX INFO: renamed from: h */
    public boolean m176602h() {
        return this.f157726c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m176603i() {
        return this.f157735l;
    }

    /* JADX INFO: renamed from: j */
    public boolean m176604j() {
        return this.f157730g;
    }

    /* JADX INFO: renamed from: k */
    public int m176605k() {
        return this.f157725b;
    }

    /* JADX INFO: renamed from: l */
    public int m176606l() {
        return this.f157724a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m176608n() {
        return this.f157728e;
    }

    /* JADX INFO: renamed from: o */
    public boolean m176609o() {
        return this.f157727d;
    }

    /* JADX INFO: renamed from: p */
    public T m176610p(Bitmap.Config config) {
        this.f157731h = config;
        return (T) m176607m();
    }

    /* JADX INFO: renamed from: m */
    public T m176607m() {
        return this;
    }
}
