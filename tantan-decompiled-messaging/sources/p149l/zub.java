package p149l;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class zub {

    /* JADX INFO: renamed from: a */
    public static volatile zgm.C21693a f204835a;

    /* JADX INFO: renamed from: b */
    public static ConcurrentHashMap<String, Integer> f204836b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public static long f204837c = -1;

    /* JADX INFO: renamed from: d */
    public static LinkedList<Long> f204838d = new LinkedList<>();

    /* JADX INFO: renamed from: e */
    public static LinkedList<Long> f204839e = new LinkedList<>();

    /* JADX INFO: renamed from: f */
    public static long f204840f = 1000;

    /* JADX INFO: renamed from: g */
    public static long f204841g = 500;

    /* JADX INFO: renamed from: h */
    public static final int[] f204842h = {720, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 1080, 1440};

    /* JADX INFO: renamed from: l.zub$a */
    public class C21772a extends uq2 {

        /* JADX INFO: renamed from: a */
        public long f204843a = -1;

        @Override // p149l.uq2, p149l.guc0
        /* JADX INFO: renamed from: b */
        public void mo109500b(ImageRequest imageRequest, String str, boolean z) {
            super.mo109500b(imageRequest, str, z);
            if (!upa.m194844y1() || this.f204843a <= 0) {
                return;
            }
            zub.m220204c(mqi0.m155944o() - this.f204843a);
        }

        @Override // p149l.uq2, p149l.guc0
        /* JADX INFO: renamed from: e */
        public void mo109503e(ImageRequest imageRequest, Object obj, String str, boolean z) {
            super.mo109503e(imageRequest, obj, str, z);
            this.f204843a = mqi0.m155944o();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m220202a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m220204c(long j) {
        f204839e.add(Long.valueOf(Math.max(5L, j)));
        if (f204839e.size() > 2) {
            f204839e.poll();
        }
        m220218q();
    }

    /* JADX INFO: renamed from: d */
    public static double m220205d() {
        if (upa.m194619C2()) {
            return Math.min(Math.max(upa.m194642H0(), 0.6d), 0.8d);
        }
        return 0.6d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX INFO: renamed from: e */
    public static Picture.ImageUri m220206e(Media media, String str) {
        if (!upa.m194844y1()) {
            return m220210i(media);
        }
        int iM208412y0 = xdl0.m208412y0();
        if (f204835a == null) {
            m220212k();
        }
        if (f204836b.containsKey(media.cover().url)) {
            return m220211j(media, f204836b.get(media.cover().url).intValue());
        }
        int i = 1;
        if (iM208412y0 <= 800 || iM208412y0 >= 1080) {
            if (iM208412y0 >= 1080 && iM208412y0 < 1440) {
                float f = f204840f / f204841g;
                if (f < 1.0f) {
                    i = 0;
                } else if (f >= 1.25f) {
                    i = 2;
                }
            } else if (iM208412y0 >= 1440) {
                float f2 = f204840f / f204841g;
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
        } else if (f204841g > f204840f) {
            i = 0;
        }
        int iMax = Math.max(0, Math.min(3, i));
        int[] iArr = f204842h;
        int i2 = iArr[iMax];
        f204836b.put(media.cover().url, Integer.valueOf(iArr[iMax]));
        Picture.ImageUri imageUriM220211j = m220211j(media, i2);
        m220217p(i2, imageUriM220211j, str, media.cover().url, iMax);
        return imageUriM220211j;
    }

    /* JADX INFO: renamed from: f */
    public static Picture.ImageUri m220207f(Media media) {
        return m220208g(media, "render");
    }

    /* JADX INFO: renamed from: g */
    public static Picture.ImageUri m220208g(Media media, String str) {
        return upa.m194844y1() ? m220206e(media, str) : m220210i(media);
    }

    /* JADX INFO: renamed from: h */
    public static Picture.ImageUri m220209h(Media media) {
        return media.cover().jpgMaxWidth1080();
    }

    /* JADX INFO: renamed from: i */
    public static Picture.ImageUri m220210i(Media media) {
        return media.cover().jpgMaxWidth720();
    }

    /* JADX INFO: renamed from: j */
    public static Picture.ImageUri m220211j(Media media, int i) {
        if (i == 960) {
            return m220213l(media.cover());
        }
        if (i != 1080) {
            return i != 1440 ? media.cover().jpgMaxWidth720() : media.cover().jpgMaxWidth1440();
        }
        return media.cover().jpgMaxWidth1080();
    }

    /* JADX INFO: renamed from: k */
    public static void m220212k() {
        zgm.m218660c().subscribe(mkd0.m154956H(new e30() { // from class: l.xub
            @Override // p149l.e30
            public final void call(Object obj) {
                zub.f204835a = (zgm.C21693a) obj;
            }
        }, new e30() { // from class: l.yub
            @Override // p149l.e30
            public final void call(Object obj) {
                zub.m220202a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static Picture.ImageUri m220213l(Picture picture) {
        return picture.maxWidth(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, wc40.m202626c() ? ".webp" : ".jpg");
    }

    /* JADX INFO: renamed from: m */
    public static void m220214m() {
        if (f204837c == -1) {
            f204837c = System.currentTimeMillis();
            return;
        }
        f204838d.add(Long.valueOf(Math.max(10L, System.currentTimeMillis() - f204837c)));
        f204837c = System.currentTimeMillis();
        if (f204838d.size() > 2) {
            f204838d.poll();
        }
        m220219r();
    }

    /* JADX INFO: renamed from: n */
    public static void m220215n(Media media) {
        m220216o(media, false);
    }

    /* JADX INFO: renamed from: o */
    public static void m220216o(Media media, boolean z) {
        qib0.f154691G.m102373t0(m220206e(media, "switchPreload"), Priority.MEDIUM, "", new C21772a(), z);
    }

    /* JADX INFO: renamed from: p */
    public static void m220217p(int i, Picture.ImageUri imageUri, String str, String str2, int i2) {
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_android_dynamic_resolution";
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125895n = "p_suggest_users_home_view";
        zvf0.m220393o(l3fVar, vwb.m200311Y("average_net_speed", (NullChecker.m81303a(f204835a) ? f204835a.f203058c : "NA") + ", op:" + f204840f + ",cache:" + f204841g), vwb.m200311Y("picture_download_time", Long.valueOf(f204841g)), vwb.m200311Y("picture_size", NullChecker.m81303a(f204835a) ? f204835a.f203057b : -1), vwb.m200311Y("screen_resolution", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: q */
    public static void m220218q() {
        if (f204839e.size() >= 2) {
            Iterator<Long> it = f204839e.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            f204841g = jLongValue / 2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m220219r() {
        if (f204838d.size() >= 2) {
            Iterator<Long> it = f204838d.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            f204840f = jLongValue / 2;
        }
    }
}
