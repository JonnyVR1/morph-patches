package p009l;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import l.e30;
import l.j760;
import l.l3f;
import l.mkd0;
import l.qib0;
import l.upa;
import l.uq2;
import l.vwb;
import l.wc40;
import l.xdl0;
import l.zgm;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zub {

    /* JADX INFO: renamed from: a */
    public static volatile zgm.a f23906a;

    /* JADX INFO: renamed from: b */
    public static ConcurrentHashMap<String, Integer> f23907b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public static long f23908c = -1;

    /* JADX INFO: renamed from: d */
    public static LinkedList<Long> f23909d = new LinkedList<>();

    /* JADX INFO: renamed from: e */
    public static LinkedList<Long> f23910e = new LinkedList<>();

    /* JADX INFO: renamed from: f */
    public static long f23911f = 1000;

    /* JADX INFO: renamed from: g */
    public static long f23912g = 500;

    /* JADX INFO: renamed from: h */
    public static final int[] f23913h = {720, 960, 1080, 1440};

    /* JADX INFO: renamed from: l.zub$a */
    public class C1373a extends uq2 {

        /* JADX INFO: renamed from: a */
        public long f23914a = -1;

        /* JADX INFO: renamed from: b */
        public void m25979b(ImageRequest imageRequest, String str, boolean z) {
            super.b(imageRequest, str, z);
            if (!upa.y1() || this.f23914a <= 0) {
                return;
            }
            zub.m25963c(mqi0.m18550o() - this.f23914a);
        }

        /* JADX INFO: renamed from: e */
        public void m25980e(ImageRequest imageRequest, Object obj, String str, boolean z) {
            super.e(imageRequest, obj, str, z);
            this.f23914a = mqi0.m18550o();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25961a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m25963c(long j) {
        f23910e.add(Long.valueOf(Math.max(5L, j)));
        if (f23910e.size() > 2) {
            f23910e.poll();
        }
        m25977q();
    }

    /* JADX INFO: renamed from: d */
    public static double m25964d() {
        if (upa.C2()) {
            return Math.min(Math.max(upa.H0(), 0.6d), 0.8d);
        }
        return 0.6d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX INFO: renamed from: e */
    public static Picture.ImageUri m25965e(Media media, String str) {
        if (!upa.y1()) {
            return m25969i(media);
        }
        int iY0 = xdl0.y0();
        if (f23906a == null) {
            m25971k();
        }
        if (f23907b.containsKey(((Media) media.cover()).url)) {
            return m25970j(media, f23907b.get(((Media) media.cover()).url).intValue());
        }
        int i = 1;
        if (iY0 <= 800 || iY0 >= 1080) {
            if (iY0 >= 1080 && iY0 < 1440) {
                float f = f23911f / f23912g;
                if (f < 1.0f) {
                    i = 0;
                } else if (f >= 1.25f) {
                    i = 2;
                }
            } else if (iY0 >= 1440) {
                float f2 = f23911f / f23912g;
                if (f2 < 1.0f) {
                    i = 0;
                } else if (f2 >= 1.25f) {
                    if (f2 < 1.5f) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                }
            } else {
                i = 0;
            }
        } else if (f23912g > f23911f) {
            i = 0;
        }
        int iMax = Math.max(0, Math.min(3, i));
        int[] iArr = f23913h;
        int i2 = iArr[iMax];
        f23907b.put(((Media) media.cover()).url, Integer.valueOf(iArr[iMax]));
        Picture.ImageUri imageUriM25970j = m25970j(media, i2);
        m25976p(i2, imageUriM25970j, str, ((Media) media.cover()).url, iMax);
        return imageUriM25970j;
    }

    /* JADX INFO: renamed from: f */
    public static Picture.ImageUri m25966f(Media media) {
        return m25967g(media, "render");
    }

    /* JADX INFO: renamed from: g */
    public static Picture.ImageUri m25967g(Media media, String str) {
        return upa.y1() ? m25965e(media, str) : m25969i(media);
    }

    /* JADX INFO: renamed from: h */
    public static Picture.ImageUri m25968h(Media media) {
        return media.cover().jpgMaxWidth1080();
    }

    /* JADX INFO: renamed from: i */
    public static Picture.ImageUri m25969i(Media media) {
        return media.cover().jpgMaxWidth720();
    }

    /* JADX INFO: renamed from: j */
    public static Picture.ImageUri m25970j(Media media, int i) {
        if (i == 960) {
            return m25972l(media.cover());
        }
        if (i != 1080) {
            return i != 1440 ? media.cover().jpgMaxWidth720() : media.cover().jpgMaxWidth1440();
        }
        return media.cover().jpgMaxWidth1080();
    }

    /* JADX INFO: renamed from: k */
    public static void m25971k() {
        zgm.c().subscribe(mkd0.H(new e30() { // from class: l.xub
            public final void call(Object obj) {
                zub.f23906a = (zgm.a) obj;
            }
        }, new e30() { // from class: l.yub
            public final void call(Object obj) {
                zub.m25961a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static Picture.ImageUri m25972l(Picture picture) {
        return picture.maxWidth(960, wc40.c() ? ".webp" : ".jpg");
    }

    /* JADX INFO: renamed from: m */
    public static void m25973m() {
        if (f23908c == -1) {
            f23908c = System.currentTimeMillis();
            return;
        }
        f23909d.add(Long.valueOf(Math.max(10L, System.currentTimeMillis() - f23908c)));
        f23908c = System.currentTimeMillis();
        if (f23909d.size() > 2) {
            f23909d.poll();
        }
        m25978r();
    }

    /* JADX INFO: renamed from: n */
    public static void m25974n(Media media) {
        m25975o(media, false);
    }

    /* JADX INFO: renamed from: o */
    public static void m25975o(Media media, boolean z) {
        qib0.G.t0(m25965e(media, "switchPreload"), Priority.MEDIUM, "", new C1373a(), z);
    }

    /* JADX INFO: renamed from: p */
    public static void m25976p(int i, Picture.ImageUri imageUri, String str, String str2, int i2) {
        l3f l3fVar = new l3f();
        l3fVar.s = "e_android_dynamic_resolution";
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.n = "p_suggest_users_home_view";
        zvf0.o(l3fVar, new j760[]{vwb.Y("average_net_speed", (NullChecker.a(f23906a) ? f23906a.c : "NA") + ", op:" + f23911f + ",cache:" + f23912g), vwb.Y("picture_download_time", Long.valueOf(f23912g)), vwb.Y("picture_size", NullChecker.a(f23906a) ? f23906a.b : -1), vwb.Y("screen_resolution", Integer.valueOf(i))});
    }

    /* JADX INFO: renamed from: q */
    public static void m25977q() {
        if (f23910e.size() >= 2) {
            Iterator<Long> it = f23910e.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            f23912g = jLongValue / 2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m25978r() {
        if (f23909d.size() >= 2) {
            Iterator<Long> it = f23909d.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            f23911f = jLongValue / 2;
        }
    }
}
