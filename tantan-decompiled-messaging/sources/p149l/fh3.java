package p149l;

import android.app.Application;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.auth.AbstractC12885a;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.AbstractC12888b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fh3 {

    /* JADX INFO: renamed from: a */
    public Application f97469a;

    /* JADX INFO: renamed from: b */
    public AbstractC12885a f97470b;

    /* JADX INFO: renamed from: c */
    public zqi0 f97471c;

    /* JADX INFO: renamed from: d */
    public AbstractC12888b f97472d;

    /* JADX INFO: renamed from: e */
    public kwt f97473e;

    /* JADX INFO: renamed from: f */
    public vul f97474f;

    /* JADX INFO: renamed from: g */
    public yxv f97475g;

    /* JADX INFO: renamed from: h */
    public List<bxm> f97476h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public osm f97477i;

    /* JADX INFO: renamed from: j */
    public vkf0 f97478j;

    /* JADX INFO: renamed from: k */
    public t1w f97479k;

    /* JADX INFO: renamed from: a */
    public fh3 m121338a(bxm bxmVar) {
        this.f97476h.add(bxmVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public p850 m121339b() {
        if (this.f97473e == null) {
            this.f97473e = new hvk(uvr.m196087d().m162661C0());
        }
        if (this.f97477i == null) {
            this.f97477i = osm.m165823a();
        }
        if (this.f97475g == null) {
            this.f97475g = yxv.m216484c();
        }
        return new p850(new lec0(this));
    }

    /* JADX INFO: renamed from: c */
    public fh3 m121340c(Application application) {
        this.f97469a = application;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public fh3 m121341d(AbstractC12885a abstractC12885a) {
        this.f97470b = abstractC12885a;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public fh3 m121342e(AbstractC12888b abstractC12888b) {
        this.f97472d = abstractC12888b;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public fh3 m121343f(vul vulVar) {
        this.f97474f = vulVar;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public fh3 m121344g(osm osmVar) {
        this.f97477i = osmVar;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public fh3 m121345h(t1w t1wVar) {
        this.f97479k = t1wVar;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public fh3 m121346i(vkf0 vkf0Var) {
        this.f97478j = vkf0Var;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public fh3 m121347j(zqi0 zqi0Var) {
        this.f97471c = zqi0Var;
        return this;
    }
}
