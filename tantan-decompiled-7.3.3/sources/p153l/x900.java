package p153l;

import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface x900 {

    /* JADX INFO: renamed from: a */
    public static final x900 f192890a = new C21267a();

    /* JADX INFO: renamed from: l.x900$a */
    public class C21267a implements x900 {
        @Override // p153l.x900
        /* JADX INFO: renamed from: a */
        public boolean mo209760a(C1894k c1894k) {
            String str = c1894k.f7785l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p153l.x900
        /* JADX INFO: renamed from: b */
        public w900 mo209761b(C1894k c1894k) {
            String str = c1894k.f7785l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new vw0();
                    case "application/x-icy":
                        return new idm();
                    case "application/id3":
                        return new kdm();
                    case "application/x-emsg":
                        return new c5f();
                    case "application/x-scte35":
                        return new oxf0();
                }
            }
            ypg0.m217021a("Attempted to create decoder for unsupported MIME type: ", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo209760a(C1894k c1894k);

    /* JADX INFO: renamed from: b */
    w900 mo209761b(C1894k c1894k);
}
