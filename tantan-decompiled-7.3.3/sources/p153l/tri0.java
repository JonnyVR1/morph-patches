package p153l;

import com.google.protobuf.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class tri0 {

    /* JADX INFO: renamed from: l.tri0$a */
    public static class C20385a implements InterfaceC20386b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteString f175881a;

        public C20385a(ByteString byteString) {
            this.f175881a = byteString;
        }

        @Override // p153l.tri0.InterfaceC20386b
        /* JADX INFO: renamed from: a */
        public byte mo192514a(int i) {
            return this.f175881a.byteAt(i);
        }

        @Override // p153l.tri0.InterfaceC20386b
        public int size() {
            return this.f175881a.size();
        }
    }

    /* JADX INFO: renamed from: l.tri0$b */
    public interface InterfaceC20386b {
        /* JADX INFO: renamed from: a */
        byte mo192514a(int i);

        int size();
    }

    /* JADX INFO: renamed from: a */
    public static String m192511a(ByteString byteString) {
        return m192512b(new C20385a(byteString));
    }

    /* JADX INFO: renamed from: b */
    public static String m192512b(InterfaceC20386b interfaceC20386b) {
        StringBuilder sb = new StringBuilder(interfaceC20386b.size());
        for (int i = 0; i < interfaceC20386b.size(); i++) {
            byte bMo192514a = interfaceC20386b.mo192514a(i);
            if (bMo192514a == 34) {
                sb.append("\\\"");
            } else if (bMo192514a == 39) {
                sb.append("\\'");
            } else if (bMo192514a != 92) {
                switch (bMo192514a) {
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
                        if (bMo192514a < 32 || bMo192514a > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo192514a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo192514a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo192514a & 7) + 48));
                        } else {
                            sb.append((char) bMo192514a);
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
    public static String m192513c(String str) {
        return m192511a(ByteString.copyFromUtf8(str));
    }
}
