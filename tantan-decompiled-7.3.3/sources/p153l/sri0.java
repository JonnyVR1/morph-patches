package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class sri0 extends yr3 {
    @Override // p153l.yr3
    /* JADX INFO: renamed from: c */
    public int mo187628c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'a' && c <= 'z') {
            sb.append((char) (c - 'S'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c == '`') {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) 2);
            sb.append((char) (c - '@'));
            return 2;
        }
        if (c < '{' || c > 127) {
            sb.append("\u0001\u001e");
            return mo187628c((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    @Override // p153l.yr3
    /* JADX INFO: renamed from: e */
    public int mo187629e() {
        return 2;
    }
}
