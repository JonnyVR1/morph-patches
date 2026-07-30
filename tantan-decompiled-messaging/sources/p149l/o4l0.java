package p149l;

import android.net.Uri;
import com.immomo.velib.anim.model.VideoEffectMatchInfo;
import com.immomo.velib.player.C3985a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o4l0 {

    /* JADX INFO: renamed from: j */
    public static int f141782j = 1;

    /* JADX INFO: renamed from: a */
    public Uri f141783a;

    /* JADX INFO: renamed from: b */
    public int f141784b;

    /* JADX INFO: renamed from: c */
    public int f141785c;

    /* JADX INFO: renamed from: d */
    public int f141786d;

    /* JADX INFO: renamed from: e */
    public int f141787e;

    /* JADX INFO: renamed from: f */
    public int f141788f;

    /* JADX INFO: renamed from: g */
    public q4l0 f141789g;

    /* JADX INFO: renamed from: h */
    public List<p4l0> f141790h;

    /* JADX INFO: renamed from: i */
    public bvl f141791i;

    /* JADX INFO: renamed from: l.o4l0$a */
    public static class C18841a {

        /* JADX INFO: renamed from: a */
        public Uri f141792a;

        /* JADX INFO: renamed from: b */
        public int f141793b;

        /* JADX INFO: renamed from: c */
        public int f141794c;

        /* JADX INFO: renamed from: d */
        public int f141795d;

        /* JADX INFO: renamed from: e */
        public int f141796e;

        /* JADX INFO: renamed from: f */
        public int f141797f;

        /* JADX INFO: renamed from: g */
        public q4l0 f141798g;

        /* JADX INFO: renamed from: h */
        public List<p4l0> f141799h;

        /* JADX INFO: renamed from: i */
        public bvl f141800i;

        /* JADX INFO: renamed from: a */
        public o4l0 m162602a() {
            o4l0 o4l0Var = new o4l0();
            o4l0Var.f141783a = this.f141792a;
            o4l0Var.f141784b = this.f141793b;
            o4l0Var.f141785c = this.f141794c;
            o4l0Var.f141786d = this.f141795d;
            o4l0Var.f141787e = this.f141796e;
            o4l0Var.f141788f = this.f141797f;
            o4l0Var.f141789g = this.f141798g;
            o4l0Var.f141790h = this.f141799h;
            o4l0Var.f141791i = this.f141800i;
            return o4l0Var;
        }

        /* JADX INFO: renamed from: b */
        public C18841a m162603b(List<p4l0> list) {
            this.f141799h = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18841a m162604c(q4l0 q4l0Var) {
            this.f141798g = q4l0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18841a m162605d(int i) {
            this.f141793b = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18841a m162606e(bvl bvlVar) {
            this.f141800i = bvlVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<VideoEffectMatchInfo> m162600b(List<p4l0> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (p4l0 p4l0Var : list) {
                if (p4l0Var != null && p4l0Var.m167395a() != null) {
                    arrayList.add(p4l0Var.m167395a());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public C3985a m162601c() {
        return new C3985a.a().m19551r(this.f141784b).m19553t(this.f141785c, this.f141786d).m19554u(this.f141783a).m19550q(this.f141789g.m172946c()).m19553t(this.f141787e, this.f141788f).m19552s(this.f141791i).m19549p(m162600b(this.f141790h)).m19548o();
    }
}
