package p002l;

import android.app.Application;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC0474a;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC0477b;
import java.util.ArrayList;
import java.util.List;
import l.uvr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fh3 {

    /* JADX INFO: renamed from: a */
    public Application f10342a;

    /* JADX INFO: renamed from: b */
    public AbstractC0474a f10343b;

    /* JADX INFO: renamed from: c */
    public zqi0 f10344c;

    /* JADX INFO: renamed from: d */
    public AbstractC0477b f10345d;

    /* JADX INFO: renamed from: e */
    public kwt f10346e;

    /* JADX INFO: renamed from: f */
    public vul f10347f;

    /* JADX INFO: renamed from: g */
    public yxv f10348g;

    /* JADX INFO: renamed from: h */
    public List<bxm> f10349h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public osm f10350i;

    /* JADX INFO: renamed from: j */
    public vkf0 f10351j;

    /* JADX INFO: renamed from: k */
    public t1w f10352k;

    /* JADX INFO: renamed from: a */
    public fh3 m13172a(bxm bxmVar) {
        this.f10349h.add(bxmVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public p850 m13173b() {
        if (this.f10346e == null) {
            this.f10346e = new hvk(uvr.d().C0());
        }
        if (this.f10350i == null) {
            this.f10350i = osm.m19737a();
        }
        if (this.f10348g == null) {
            this.f10348g = yxv.m26977c();
        }
        return new p850(new lec0(this));
    }

    /* JADX INFO: renamed from: c */
    public fh3 m13174c(Application application) {
        this.f10342a = application;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public fh3 m13175d(AbstractC0474a abstractC0474a) {
        this.f10343b = abstractC0474a;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public fh3 m13176e(AbstractC0477b abstractC0477b) {
        this.f10345d = abstractC0477b;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public fh3 m13177f(vul vulVar) {
        this.f10347f = vulVar;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public fh3 m13178g(osm osmVar) {
        this.f10350i = osmVar;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public fh3 m13179h(t1w t1wVar) {
        this.f10352k = t1wVar;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public fh3 m13180i(vkf0 vkf0Var) {
        this.f10351j = vkf0Var;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public fh3 m13181j(zqi0 zqi0Var) {
        this.f10344c = zqi0Var;
        return this;
    }
}
