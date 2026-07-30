package p149l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.google.android.gms.common.api.Api;
import p149l.afm;

/* JADX INFO: loaded from: classes.dex */
public class afm<T extends afm> {

    /* JADX INFO: renamed from: a */
    public int f69184a = 100;

    /* JADX INFO: renamed from: b */
    public int f69185b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c */
    public boolean f69186c;

    /* JADX INFO: renamed from: d */
    public boolean f69187d;

    /* JADX INFO: renamed from: e */
    public boolean f69188e;

    /* JADX INFO: renamed from: f */
    public boolean f69189f;

    /* JADX INFO: renamed from: g */
    public boolean f69190g;

    /* JADX INFO: renamed from: h */
    public Bitmap.Config f69191h;

    /* JADX INFO: renamed from: i */
    public Bitmap.Config f69192i;

    /* JADX INFO: renamed from: j */
    public cfm f69193j;

    /* JADX INFO: renamed from: k */
    public ColorSpace f69194k;

    /* JADX INFO: renamed from: l */
    public boolean f69195l;

    public afm() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f69191h = config;
        this.f69192i = config;
    }

    /* JADX INFO: renamed from: a */
    public zem m96242a() {
        return new zem(this);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap.Config m96243b() {
        return this.f69192i;
    }

    /* JADX INFO: renamed from: c */
    public Bitmap.Config m96244c() {
        return this.f69191h;
    }

    /* JADX INFO: renamed from: d */
    public p23 m96245d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public ColorSpace m96246e() {
        return this.f69194k;
    }

    /* JADX INFO: renamed from: f */
    public cfm m96247f() {
        return this.f69193j;
    }

    /* JADX INFO: renamed from: g */
    public boolean m96248g() {
        return this.f69189f;
    }

    /* JADX INFO: renamed from: h */
    public boolean m96249h() {
        return this.f69186c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m96250i() {
        return this.f69195l;
    }

    /* JADX INFO: renamed from: j */
    public boolean m96251j() {
        return this.f69190g;
    }

    /* JADX INFO: renamed from: k */
    public int m96252k() {
        return this.f69185b;
    }

    /* JADX INFO: renamed from: l */
    public int m96253l() {
        return this.f69184a;
    }

    /* JADX INFO: renamed from: n */
    public boolean m96255n() {
        return this.f69188e;
    }

    /* JADX INFO: renamed from: o */
    public boolean m96256o() {
        return this.f69187d;
    }

    /* JADX INFO: renamed from: p */
    public T m96257p(Bitmap.Config config) {
        this.f69191h = config;
        return (T) m96254m();
    }

    /* JADX INFO: renamed from: m */
    public T m96254m() {
        return this;
    }
}
