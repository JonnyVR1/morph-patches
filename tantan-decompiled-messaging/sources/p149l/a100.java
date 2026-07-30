package p149l;

import com.google.android.exoplayer2.C1871k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface a100 {

    /* JADX INFO: renamed from: a */
    public static final a100 f67091a = new C15509a();

    /* JADX INFO: renamed from: l.a100$a */
    public class C15509a implements a100 {
        @Override // p149l.a100
        /* JADX INFO: renamed from: a */
        public boolean mo94501a(C1871k c1871k) {
            String str = c1871k.f7748l;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p149l.a100
        /* JADX INFO: renamed from: b */
        public z000 mo94502b(C1871k c1871k) {
            String str = c1871k.f7748l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new ow0();
                    case "application/x-icy":
                        return new sam();
                    case "application/id3":
                        return new uam();
                    case "application/x-emsg":
                        return new y3f();
                    case "application/x-scte35":
                        return new fpf0();
                }
            }
            qhg0.m174539a("Attempted to create decoder for unsupported MIME type: ", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo94501a(C1871k c1871k);

    /* JADX INFO: renamed from: b */
    z000 mo94502b(C1871k c1871k);
}
