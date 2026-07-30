package p149l;

import com.google.protobuf.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class tii0 {

    /* JADX INFO: renamed from: l.tii0$a */
    public static class C20181a implements InterfaceC20182b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteString f170585a;

        public C20181a(ByteString byteString) {
            this.f170585a = byteString;
        }

        @Override // p149l.tii0.InterfaceC20182b
        /* JADX INFO: renamed from: a */
        public byte mo189202a(int i) {
            return this.f170585a.byteAt(i);
        }

        @Override // p149l.tii0.InterfaceC20182b
        public int size() {
            return this.f170585a.size();
        }
    }

    /* JADX INFO: renamed from: l.tii0$b */
    public interface InterfaceC20182b {
        /* JADX INFO: renamed from: a */
        byte mo189202a(int i);

        int size();
    }

    /* JADX INFO: renamed from: a */
    public static String m189199a(ByteString byteString) {
        return m189200b(new C20181a(byteString));
    }

    /* JADX INFO: renamed from: b */
    public static String m189200b(InterfaceC20182b interfaceC20182b) {
        StringBuilder sb = new StringBuilder(interfaceC20182b.size());
        for (int i = 0; i < interfaceC20182b.size(); i++) {
            byte bMo189202a = interfaceC20182b.mo189202a(i);
            if (bMo189202a == 34) {
                sb.append("\\\"");
            } else if (bMo189202a == 39) {
                sb.append("\\'");
            } else if (bMo189202a != 92) {
                switch (bMo189202a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo189202a < 32 || bMo189202a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo189202a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo189202a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo189202a & 7) + 48));
                        } else {
                            sb.append((char) bMo189202a);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m189201c(String str) {
        return m189199a(ByteString.copyFromUtf8(str));
    }
}
