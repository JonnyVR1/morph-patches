package p153l;

import androidx.datastore.preferences.protobuf.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class uri0 {

    /* JADX INFO: renamed from: l.uri0$a */
    public static class C20648a implements InterfaceC20649b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteString f180656a;

        public C20648a(ByteString byteString) {
            this.f180656a = byteString;
        }

        @Override // p153l.uri0.InterfaceC20649b
        /* JADX INFO: renamed from: a */
        public byte mo197615a(int i) {
            return this.f180656a.byteAt(i);
        }

        @Override // p153l.uri0.InterfaceC20649b
        public int size() {
            return this.f180656a.size();
        }
    }

    /* JADX INFO: renamed from: l.uri0$b */
    public interface InterfaceC20649b {
        /* JADX INFO: renamed from: a */
        byte mo197615a(int i);

        int size();
    }

    /* JADX INFO: renamed from: a */
    public static String m197612a(ByteString byteString) {
        return m197613b(new C20648a(byteString));
    }

    /* JADX INFO: renamed from: b */
    public static String m197613b(InterfaceC20649b interfaceC20649b) {
        StringBuilder sb = new StringBuilder(interfaceC20649b.size());
        for (int i = 0; i < interfaceC20649b.size(); i++) {
            byte bMo197615a = interfaceC20649b.mo197615a(i);
            if (bMo197615a == 34) {
                sb.append("\\\"");
            } else if (bMo197615a == 39) {
                sb.append("\\'");
            } else if (bMo197615a != 92) {
                switch (bMo197615a) {
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
                        if (bMo197615a < 32 || bMo197615a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo197615a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo197615a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo197615a & 7) + 48));
                        } else {
                            sb.append((char) bMo197615a);
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
    public static String m197614c(String str) {
        return m197612a(ByteString.copyFromUtf8(str));
    }
}
