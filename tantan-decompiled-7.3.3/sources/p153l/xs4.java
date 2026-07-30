package p153l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xs4 implements tp80<Character> {

    /* JADX INFO: renamed from: l.xs4$a */
    public static final class C21437a extends AbstractC21441e {
        static final C21437a INSTANCE = new C21437a();

        public C21437a() {
            super("CharMatcher.ascii()");
        }

        @Override // p153l.xs4
        /* JADX INFO: renamed from: g */
        public boolean mo212956g(char c) {
            return c <= 127;
        }
    }

    /* JADX INFO: renamed from: l.xs4$b */
    public static abstract class AbstractC21438b extends xs4 {
        @Override // p153l.tp80
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.m212954b(ch);
        }
    }

    /* JADX INFO: renamed from: l.xs4$c */
    public static final class C21439c extends AbstractC21438b {

        /* JADX INFO: renamed from: a */
        public final char f196057a;

        /* JADX INFO: renamed from: b */
        public final char f196058b;

        public C21439c(char c, char c2) {
            xn80.m212099d(c2 >= c);
            this.f196057a = c;
            this.f196058b = c2;
        }

        @Override // p153l.xs4
        /* JADX INFO: renamed from: g */
        public boolean mo212956g(char c) {
            return this.f196057a <= c && c <= this.f196058b;
        }

        public String toString() {
            String strM212953j = xs4.m212953j(this.f196057a);
            String strM212953j2 = xs4.m212953j(this.f196058b);
            StringBuilder sb = new StringBuilder(String.valueOf(strM212953j).length() + 27 + String.valueOf(strM212953j2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(strM212953j);
            sb.append("', '");
            sb.append(strM212953j2);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: l.xs4$d */
    public static final class C21440d extends AbstractC21438b {

        /* JADX INFO: renamed from: a */
        public final char f196059a;

        public C21440d(char c) {
            this.f196059a = c;
        }

        @Override // p153l.xs4
        /* JADX INFO: renamed from: g */
        public boolean mo212956g(char c) {
            return c == this.f196059a;
        }

        public String toString() {
            String strM212953j = xs4.m212953j(this.f196059a);
            StringBuilder sb = new StringBuilder(String.valueOf(strM212953j).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strM212953j);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: l.xs4$e */
    public static abstract class AbstractC21441e extends AbstractC21438b {

        /* JADX INFO: renamed from: a */
        public final String f196060a;

        public AbstractC21441e(String str) {
            this.f196060a = (String) xn80.m212111p(str);
        }

        public final String toString() {
            return this.f196060a;
        }
    }

    /* JADX INFO: renamed from: l.xs4$f */
    public static final class C21442f extends AbstractC21441e {
        static final C21442f INSTANCE = new C21442f();

        public C21442f() {
            super("CharMatcher.none()");
        }

        @Override // p153l.xs4
        /* JADX INFO: renamed from: e */
        public int mo212955e(CharSequence charSequence, int i) {
            xn80.m212114s(i, charSequence.length());
            return -1;
        }

        @Override // p153l.xs4
        /* JADX INFO: renamed from: g */
        public boolean mo212956g(char c) {
            return false;
        }

        @Override // p153l.xs4
        /* JADX INFO: renamed from: h */
        public boolean mo212957h(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static xs4 m212949c() {
        return C21437a.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static xs4 m212950d(char c, char c2) {
        return new C21439c(c, c2);
    }

    /* JADX INFO: renamed from: f */
    public static xs4 m212951f(char c) {
        return new C21440d(c);
    }

    /* JADX INFO: renamed from: i */
    public static xs4 m212952i() {
        return C21442f.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static String m212953j(char c) {
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
    public boolean m212954b(Character ch) {
        return mo212956g(ch.charValue());
    }

    /* JADX INFO: renamed from: e */
    public int mo212955e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        xn80.m212114s(i, length);
        while (i < length) {
            if (mo212956g(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo212956g(char c);

    /* JADX INFO: renamed from: h */
    public boolean mo212957h(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo212956g(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
