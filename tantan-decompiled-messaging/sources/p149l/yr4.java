package p149l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yr4 implements oh80<Character> {

    /* JADX INFO: renamed from: l.yr4$a */
    public static final class C21483a extends AbstractC21487e {
        static final C21483a INSTANCE = new C21483a();

        public C21483a() {
            super("CharMatcher.ascii()");
        }

        @Override // p149l.yr4
        /* JADX INFO: renamed from: g */
        public boolean mo215777g(char c) {
            return c <= 127;
        }
    }

    /* JADX INFO: renamed from: l.yr4$b */
    public static abstract class AbstractC21484b extends yr4 {
        @Override // p149l.oh80
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.m215775b(ch);
        }
    }

    /* JADX INFO: renamed from: l.yr4$c */
    public static final class C21485c extends AbstractC21484b {

        /* JADX INFO: renamed from: a */
        public final char f199627a;

        /* JADX INFO: renamed from: b */
        public final char f199628b;

        public C21485c(char c, char c2) {
            sf80.m183882d(c2 >= c);
            this.f199627a = c;
            this.f199628b = c2;
        }

        @Override // p149l.yr4
        /* JADX INFO: renamed from: g */
        public boolean mo215777g(char c) {
            return this.f199627a <= c && c <= this.f199628b;
        }

        public String toString() {
            String strM215774j = yr4.m215774j(this.f199627a);
            String strM215774j2 = yr4.m215774j(this.f199628b);
            StringBuilder sb = new StringBuilder(String.valueOf(strM215774j).length() + 27 + String.valueOf(strM215774j2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(strM215774j);
            sb.append("', '");
            sb.append(strM215774j2);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: l.yr4$d */
    public static final class C21486d extends AbstractC21484b {

        /* JADX INFO: renamed from: a */
        public final char f199629a;

        public C21486d(char c) {
            this.f199629a = c;
        }

        @Override // p149l.yr4
        /* JADX INFO: renamed from: g */
        public boolean mo215777g(char c) {
            return c == this.f199629a;
        }

        public String toString() {
            String strM215774j = yr4.m215774j(this.f199629a);
            StringBuilder sb = new StringBuilder(String.valueOf(strM215774j).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strM215774j);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: l.yr4$e */
    public static abstract class AbstractC21487e extends AbstractC21484b {

        /* JADX INFO: renamed from: a */
        public final String f199630a;

        public AbstractC21487e(String str) {
            this.f199630a = (String) sf80.m183894p(str);
        }

        public final String toString() {
            return this.f199630a;
        }
    }

    /* JADX INFO: renamed from: l.yr4$f */
    public static final class C21488f extends AbstractC21487e {
        static final C21488f INSTANCE = new C21488f();

        public C21488f() {
            super("CharMatcher.none()");
        }

        @Override // p149l.yr4
        /* JADX INFO: renamed from: e */
        public int mo215776e(CharSequence charSequence, int i) {
            sf80.m183897s(i, charSequence.length());
            return -1;
        }

        @Override // p149l.yr4
        /* JADX INFO: renamed from: g */
        public boolean mo215777g(char c) {
            return false;
        }

        @Override // p149l.yr4
        /* JADX INFO: renamed from: h */
        public boolean mo215778h(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static yr4 m215770c() {
        return C21483a.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static yr4 m215771d(char c, char c2) {
        return new C21485c(c, c2);
    }

    /* JADX INFO: renamed from: f */
    public static yr4 m215772f(char c) {
        return new C21486d(c);
    }

    /* JADX INFO: renamed from: i */
    public static yr4 m215773i() {
        return C21488f.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static String m215774j(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public boolean m215775b(Character ch) {
        return mo215777g(ch.charValue());
    }

    /* JADX INFO: renamed from: e */
    public int mo215776e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        sf80.m183897s(i, length);
        while (i < length) {
            if (mo215777g(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo215777g(char c);

    /* JADX INFO: renamed from: h */
    public boolean mo215778h(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo215777g(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
