package p153l;

import android.net.Uri;
import com.immomo.velib.anim.model.VideoEffectMatchInfo;
import com.immomo.velib.player.C4136a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class sdl0 {

    /* JADX INFO: renamed from: j */
    public static int f167422j = 1;

    /* JADX INFO: renamed from: a */
    public Uri f167423a;

    /* JADX INFO: renamed from: b */
    public int f167424b;

    /* JADX INFO: renamed from: c */
    public int f167425c;

    /* JADX INFO: renamed from: d */
    public int f167426d;

    /* JADX INFO: renamed from: e */
    public int f167427e;

    /* JADX INFO: renamed from: f */
    public int f167428f;

    /* JADX INFO: renamed from: g */
    public udl0 f167429g;

    /* JADX INFO: renamed from: h */
    public List<tdl0> f167430h;

    /* JADX INFO: renamed from: i */
    public txl f167431i;

    /* JADX INFO: renamed from: l.sdl0$a */
    public static class C20024a {

        /* JADX INFO: renamed from: a */
        public Uri f167432a;

        /* JADX INFO: renamed from: b */
        public int f167433b;

        /* JADX INFO: renamed from: c */
        public int f167434c;

        /* JADX INFO: renamed from: d */
        public int f167435d;

        /* JADX INFO: renamed from: e */
        public int f167436e;

        /* JADX INFO: renamed from: f */
        public int f167437f;

        /* JADX INFO: renamed from: g */
        public udl0 f167438g;

        /* JADX INFO: renamed from: h */
        public List<tdl0> f167439h;

        /* JADX INFO: renamed from: i */
        public txl f167440i;

        /* JADX INFO: renamed from: a */
        public sdl0 m185478a() {
            sdl0 sdl0Var = new sdl0();
            sdl0Var.f167423a = this.f167432a;
            sdl0Var.f167424b = this.f167433b;
            sdl0Var.f167425c = this.f167434c;
            sdl0Var.f167426d = this.f167435d;
            sdl0Var.f167427e = this.f167436e;
            sdl0Var.f167428f = this.f167437f;
            sdl0Var.f167429g = this.f167438g;
            sdl0Var.f167430h = this.f167439h;
            sdl0Var.f167431i = this.f167440i;
            return sdl0Var;
        }

        /* JADX INFO: renamed from: b */
        public C20024a m185479b(List<tdl0> list) {
            this.f167439h = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20024a m185480c(udl0 udl0Var) {
            this.f167438g = udl0Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20024a m185481d(int i) {
            this.f167433b = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20024a m185482e(txl txlVar) {
            this.f167440i = txlVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<VideoEffectMatchInfo> m185476b(List<tdl0> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (tdl0 tdl0Var : list) {
                if (tdl0Var != null && tdl0Var.m190631a() != null) {
                    arrayList.add(tdl0Var.m190631a());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public C4136a m185477c() {
        return new C4136a.a().m20550r(this.f167424b).m20552t(this.f167425c, this.f167426d).m20553u(this.f167423a).m20549q(this.f167429g.m195500c()).m20552t(this.f167427e, this.f167428f).m20551s(this.f167431i).m20548p(m185476b(this.f167430h)).m20547o();
    }
}
