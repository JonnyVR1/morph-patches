package p153l;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import com.tencent.liteav.audio.TXEAudioDef;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class nwb {

    /* JADX INFO: renamed from: a */
    public static volatile cjm.C16288a f143940a;

    /* JADX INFO: renamed from: b */
    public static ConcurrentHashMap<String, Integer> f143941b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public static long f143942c = -1;

    /* JADX INFO: renamed from: d */
    public static LinkedList<Long> f143943d = new LinkedList<>();

    /* JADX INFO: renamed from: e */
    public static LinkedList<Long> f143944e = new LinkedList<>();

    /* JADX INFO: renamed from: f */
    public static long f143945f = 1000;

    /* JADX INFO: renamed from: g */
    public static long f143946g = 500;

    /* JADX INFO: renamed from: h */
    public static final int[] f143947h = {720, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 1080, 1440};

    /* JADX INFO: renamed from: l.nwb$a */
    public class C18965a extends kr2 {

        /* JADX INFO: renamed from: a */
        public long f143948a = -1;

        @Override // p153l.kr2, p153l.j2d0
        /* JADX INFO: renamed from: b */
        public void mo143211b(ImageRequest imageRequest, String str, boolean z) {
            super.mo143211b(imageRequest, str, z);
            if (!gra.m131775y1() || this.f143948a <= 0) {
                return;
            }
            nwb.m164965c(pzi0.m174454o() - this.f143948a);
        }

        @Override // p153l.kr2, p153l.j2d0
        /* JADX INFO: renamed from: e */
        public void mo143212e(ImageRequest imageRequest, Object obj, String str, boolean z) {
            super.mo143212e(imageRequest, obj, str, z);
            this.f143948a = pzi0.m174454o();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m164963a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static void m164965c(long j) {
        f143944e.add(Long.valueOf(Math.max(5L, j)));
        if (f143944e.size() > 2) {
            f143944e.poll();
        }
        m164979q();
    }

    /* JADX INFO: renamed from: d */
    public static double m164966d() {
        if (gra.m131550C2()) {
            return Math.min(Math.max(gra.m131573H0(), 0.6d), 0.8d);
        }
        return 0.6d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX INFO: renamed from: e */
    public static Picture.ImageUri m164967e(Media media, String str) {
        if (!gra.m131775y1()) {
            return m164971i(media);
        }
        int iM105592y0 = bnl0.m105592y0();
        if (f143940a == null) {
            m164973k();
        }
        if (f143941b.containsKey(media.cover().url)) {
            return m164972j(media, f143941b.get(media.cover().url).intValue());
        }
        int i = 1;
        if (iM105592y0 <= 800 || iM105592y0 >= 1080) {
            if (iM105592y0 >= 1080 && iM105592y0 < 1440) {
                float f = f143945f / f143946g;
                if (f < 1.0f) {
                    i = 0;
                } else if (f >= 1.25f) {
                    i = 2;
                }
            } else if (iM105592y0 >= 1440) {
                float f2 = f143945f / f143946g;
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
        } else if (f143946g > f143945f) {
            i = 0;
        }
        int iMax = Math.max(0, Math.min(3, i));
        int[] iArr = f143947h;
        int i2 = iArr[iMax];
        f143941b.put(media.cover().url, Integer.valueOf(iArr[iMax]));
        Picture.ImageUri imageUriM164972j = m164972j(media, i2);
        m164978p(i2, imageUriM164972j, str, media.cover().url, iMax);
        return imageUriM164972j;
    }

    /* JADX INFO: renamed from: f */
    public static Picture.ImageUri m164968f(Media media) {
        return m164969g(media, "render");
    }

    /* JADX INFO: renamed from: g */
    public static Picture.ImageUri m164969g(Media media, String str) {
        return gra.m131775y1() ? m164967e(media, str) : m164971i(media);
    }

    /* JADX INFO: renamed from: h */
    public static Picture.ImageUri m164970h(Media media) {
        return media.cover().jpgMaxWidth1080();
    }

    /* JADX INFO: renamed from: i */
    public static Picture.ImageUri m164971i(Media media) {
        return media.cover().jpgMaxWidth720();
    }

    /* JADX INFO: renamed from: j */
    public static Picture.ImageUri m164972j(Media media, int i) {
        if (i == 960) {
            return m164974l(media.cover());
        }
        if (i != 1080) {
            return i != 1440 ? media.cover().jpgMaxWidth720() : media.cover().jpgMaxWidth1440();
        }
        return media.cover().jpgMaxWidth1080();
    }

    /* JADX INFO: renamed from: k */
    public static void m164973k() {
        cjm.m110272c().subscribe(psd0.m173597H(new y20() { // from class: l.lwb
            @Override // p153l.y20
            public final void call(Object obj) {
                nwb.f143940a = (cjm.C16288a) obj;
            }
        }, new y20() { // from class: l.mwb
            @Override // p153l.y20
            public final void call(Object obj) {
                nwb.m164963a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static Picture.ImageUri m164974l(Picture picture) {
        return picture.maxWidth(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, kl40.m150345c() ? ".webp" : ".jpg");
    }

    /* JADX INFO: renamed from: m */
    public static void m164975m() {
        if (f143942c == -1) {
            f143942c = System.currentTimeMillis();
            return;
        }
        f143943d.add(Long.valueOf(Math.max(10L, System.currentTimeMillis() - f143942c)));
        f143942c = System.currentTimeMillis();
        if (f143943d.size() > 2) {
            f143943d.poll();
        }
        m164980r();
    }

    /* JADX INFO: renamed from: n */
    public static void m164976n(Media media) {
        m164977o(media, false);
    }

    /* JADX INFO: renamed from: o */
    public static void m164977o(Media media, boolean z) {
        uqb0.f180374G.m127156t0(m164967e(media, "switchPreload"), Priority.MEDIUM, "", new C18965a(), z);
    }

    /* JADX INFO: renamed from: p */
    public static void m164978p(int i, Picture.ImageUri imageUri, String str, String str2, int i2) {
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_android_dynamic_resolution";
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155576n = "p_suggest_users_home_view";
        i4g0.m138517o(q4fVar, jyb.m147494Y("average_net_speed", (NullChecker.m82486a(f143940a) ? f143940a.f82200c : "NA") + ", op:" + f143945f + ",cache:" + f143946g), jyb.m147494Y("picture_download_time", Long.valueOf(f143946g)), jyb.m147494Y("picture_size", NullChecker.m82486a(f143940a) ? f143940a.f82199b : -1), jyb.m147494Y("screen_resolution", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: q */
    public static void m164979q() {
        if (f143944e.size() >= 2) {
            Iterator<Long> it = f143944e.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            f143946g = jLongValue / 2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m164980r() {
        if (f143943d.size() >= 2) {
            Iterator<Long> it = f143943d.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += it.next().longValue();
            }
            f143945f = jLongValue / 2;
        }
    }
}
