package p149l;

import androidx.datastore.preferences.protobuf.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class uii0 {

    /* JADX INFO: renamed from: l.uii0$a */
    public static class C20439a implements InterfaceC20440b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteString f176655a;

        public C20439a(ByteString byteString) {
            this.f176655a = byteString;
        }

        @Override // p149l.uii0.InterfaceC20440b
        /* JADX INFO: renamed from: a */
        public byte mo193881a(int i) {
            return this.f176655a.byteAt(i);
        }

        @Override // p149l.uii0.InterfaceC20440b
        public int size() {
            return this.f176655a.size();
        }
    }

    /* JADX INFO: renamed from: l.uii0$b */
    public interface InterfaceC20440b {
        /* JADX INFO: renamed from: a */
        byte mo193881a(int i);

        int size();
    }

    /* JADX INFO: renamed from: a */
    public static String m193878a(ByteString byteString) {
        return m193879b(new C20439a(byteString));
    }

    /* JADX INFO: renamed from: b */
    public static String m193879b(InterfaceC20440b interfaceC20440b) {
        StringBuilder sb = new StringBuilder(interfaceC20440b.size());
        for (int i = 0; i < interfaceC20440b.size(); i++) {
            byte bMo193881a = interfaceC20440b.mo193881a(i);
            if (bMo193881a == 34) {
                sb.append("\\\"");
            } else if (bMo193881a == 39) {
                sb.append("\\'");
            } else if (bMo193881a != 92) {
                switch (bMo193881a) {
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
                        if (bMo193881a < 32 || bMo193881a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo193881a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo193881a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo193881a & 7) + 48));
                        } else {
                            sb.append((char) bMo193881a);
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
    public static String m193880c(String str) {
        return m193878a(ByteString.copyFromUtf8(str));
    }
}
