package p149l;

import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface h5g0 {

    /* JADX INFO: renamed from: a */
    public static final h5g0 f105947a = new C17229a();

    /* JADX INFO: renamed from: l.h5g0$a */
    public class C17229a implements h5g0 {
        @Override // p149l.h5g0
        /* JADX INFO: renamed from: a */
        public boolean mo129398a(C1871k c1871k) {
            String str = c1871k.f7748l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // p149l.h5g0
        /* JADX INFO: renamed from: b */
        public g5g0 mo129399b(C1871k c1871k) {
            String str = c1871k.f7748l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new ree(c1871k.f7750n);
                    case "application/pgs":
                        return new lp60();
                    case "application/x-mp4-vtt":
                        return new vy00();
                    case "text/vtt":
                        return new amp0();
                    case "application/x-quicktime-tx3g":
                        return new rdj0(c1871k.f7750n);
                    case "text/x-ssa":
                        return new osf0(c1871k.f7750n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new hn4(str, c1871k.f7732D, 16000L);
                    case "text/x-exoplayer-cues":
                        return new p8f();
                    case "application/cea-708":
                        return new jn4(c1871k.f7732D, c1871k.f7750n);
                    case "application/x-subrip":
                        return new q3g0();
                    case "application/ttml+xml":
                        return new fcj0();
                }
            }
            qhg0.m174539a("Attempted to create decoder for unsupported MIME type: ", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo129398a(C1871k c1871k);

    /* JADX INFO: renamed from: b */
    g5g0 mo129399b(C1871k c1871k);
}
