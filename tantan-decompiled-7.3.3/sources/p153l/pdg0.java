package p153l;

import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface pdg0 {

    /* JADX INFO: renamed from: a */
    public static final pdg0 f151754a = new C19354a();

    /* JADX INFO: renamed from: l.pdg0$a */
    public class C19354a implements pdg0 {
        @Override // p153l.pdg0
        /* JADX INFO: renamed from: a */
        public boolean mo171812a(C1894k c1894k) {
            String str = c1894k.f7785l;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // p153l.pdg0
        /* JADX INFO: renamed from: b */
        public odg0 mo171813b(C1894k c1894k) {
            String str = c1894k.f7785l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new vfe(c1894k.f7787n);
                    case "application/pgs":
                        return new rx60();
                    case "application/x-mp4-vtt":
                        return new f710();
                    case "text/vtt":
                        return new evp0();
                    case "application/x-quicktime-tx3g":
                        return new vmj0(c1894k.f7787n);
                    case "text/x-ssa":
                        return new x0g0(c1894k.f7787n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new go4(str, c1894k.f7769D, 16000L);
                    case "text/x-exoplayer-cues":
                        return new v9f();
                    case "application/cea-708":
                        return new io4(c1894k.f7769D, c1894k.f7787n);
                    case "application/x-subrip":
                        return new xbg0();
                    case "application/ttml+xml":
                        return new jlj0();
                }
            }
            ypg0.m217021a("Attempted to create decoder for unsupported MIME type: ", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo171812a(C1894k c1894k);

    /* JADX INFO: renamed from: b */
    odg0 mo171813b(C1894k c1894k);
}
