package p153l;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ori0 {

    /* JADX INFO: renamed from: a */
    public static final nri0 f148708a = new C19201e(null, false);

    /* JADX INFO: renamed from: b */
    public static final nri0 f148709b = new C19201e(null, true);

    /* JADX INFO: renamed from: c */
    public static final nri0 f148710c;

    /* JADX INFO: renamed from: d */
    public static final nri0 f148711d;

    /* JADX INFO: renamed from: e */
    public static final nri0 f148712e;

    /* JADX INFO: renamed from: f */
    public static final nri0 f148713f;

    /* JADX INFO: renamed from: l.ori0$a */
    public static class C19197a implements InterfaceC19199c {

        /* JADX INFO: renamed from: b */
        public static final C19197a f148714b = new C19197a(true);

        /* JADX INFO: renamed from: a */
        public final boolean f148715a;

        public C19197a(boolean z) {
            this.f148715a = z;
        }

        @Override // p153l.ori0.InterfaceC19199c
        /* JADX INFO: renamed from: a */
        public int mo168925a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iM168923a = ori0.m168923a(Character.getDirectionality(charSequence.charAt(i)));
                if (iM168923a != 0) {
                    if (iM168923a != 1) {
                        continue;
                    } else if (!this.f148715a) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.f148715a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f148715a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.ori0$b */
    public static class C19198b implements InterfaceC19199c {
        static final C19198b INSTANCE = new C19198b();

        @Override // p153l.ori0.InterfaceC19199c
        /* JADX INFO: renamed from: a */
        public int mo168925a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iM168924b = 2;
            while (i < i3 && iM168924b == 2) {
                iM168924b = ori0.m168924b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iM168924b;
        }
    }

    /* JADX INFO: renamed from: l.ori0$c */
    public interface InterfaceC19199c {
        /* JADX INFO: renamed from: a */
        int mo168925a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: l.ori0$d */
    public static abstract class AbstractC19200d implements nri0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC19199c f148716a;

        public AbstractC19200d(InterfaceC19199c interfaceC19199c) {
            this.f148716a = interfaceC19199c;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo168926a();

        /* JADX INFO: renamed from: b */
        public final boolean m168927b(CharSequence charSequence, int i, int i2) {
            int iMo168925a = this.f148716a.mo168925a(charSequence, i, i2);
            if (iMo168925a == 0) {
                return true;
            }
            if (iMo168925a != 1) {
                return mo168926a();
            }
            return false;
        }

        @Override // p153l.nri0
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f148716a == null ? mo168926a() : m168927b(charSequence, i, i2);
            }
            fig0.m125680a();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.ori0$e */
    public static class C19201e extends AbstractC19200d {

        /* JADX INFO: renamed from: b */
        public final boolean f148717b;

        public C19201e(InterfaceC19199c interfaceC19199c, boolean z) {
            super(interfaceC19199c);
            this.f148717b = z;
        }

        @Override // p153l.ori0.AbstractC19200d
        /* JADX INFO: renamed from: a */
        public boolean mo168926a() {
            return this.f148717b;
        }
    }

    /* JADX INFO: renamed from: l.ori0$f */
    public static class C19202f extends AbstractC19200d {
        static final C19202f INSTANCE = new C19202f();

        public C19202f() {
            super(null);
        }

        @Override // p153l.ori0.AbstractC19200d
        /* JADX INFO: renamed from: a */
        public boolean mo168926a() {
            return lsi0.m155697a(Locale.getDefault()) == 1;
        }
    }

    static {
        C19198b c19198b = C19198b.INSTANCE;
        f148710c = new C19201e(c19198b, false);
        f148711d = new C19201e(c19198b, true);
        f148712e = new C19201e(C19197a.f148714b, false);
        f148713f = C19202f.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static int m168923a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m168924b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
