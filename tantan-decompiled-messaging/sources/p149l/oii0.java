package p149l;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class oii0 {

    /* JADX INFO: renamed from: a */
    public static final nii0 f144125a = new C18947e(null, false);

    /* JADX INFO: renamed from: b */
    public static final nii0 f144126b = new C18947e(null, true);

    /* JADX INFO: renamed from: c */
    public static final nii0 f144127c;

    /* JADX INFO: renamed from: d */
    public static final nii0 f144128d;

    /* JADX INFO: renamed from: e */
    public static final nii0 f144129e;

    /* JADX INFO: renamed from: f */
    public static final nii0 f144130f;

    /* JADX INFO: renamed from: l.oii0$a */
    public static class C18943a implements InterfaceC18945c {

        /* JADX INFO: renamed from: b */
        public static final C18943a f144131b = new C18943a(true);

        /* JADX INFO: renamed from: a */
        public final boolean f144132a;

        public C18943a(boolean z) {
            this.f144132a = z;
        }

        @Override // p149l.oii0.InterfaceC18945c
        /* JADX INFO: renamed from: a */
        public int mo164522a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iM164520a = oii0.m164520a(Character.getDirectionality(charSequence.charAt(i)));
                if (iM164520a != 0) {
                    if (iM164520a != 1) {
                        continue;
                    } else if (!this.f144132a) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.f144132a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f144132a ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: l.oii0$b */
    public static class C18944b implements InterfaceC18945c {
        static final C18944b INSTANCE = new C18944b();

        @Override // p149l.oii0.InterfaceC18945c
        /* JADX INFO: renamed from: a */
        public int mo164522a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iM164521b = 2;
            while (i < i3 && iM164521b == 2) {
                iM164521b = oii0.m164521b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iM164521b;
        }
    }

    /* JADX INFO: renamed from: l.oii0$c */
    public interface InterfaceC18945c {
        /* JADX INFO: renamed from: a */
        int mo164522a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: renamed from: l.oii0$d */
    public static abstract class AbstractC18946d implements nii0 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC18945c f144133a;

        public AbstractC18946d(InterfaceC18945c interfaceC18945c) {
            this.f144133a = interfaceC18945c;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo164523a();

        /* JADX INFO: renamed from: b */
        public final boolean m164524b(CharSequence charSequence, int i, int i2) {
            int iMo164522a = this.f144133a.mo164522a(charSequence, i, i2);
            if (iMo164522a == 0) {
                return true;
            }
            if (iMo164522a != 1) {
                return mo164523a();
            }
            return false;
        }

        @Override // p149l.nii0
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f144133a == null ? mo164523a() : m164524b(charSequence, i, i2);
            }
            x9g0.m207497a();
            return false;
        }
    }

    /* JADX INFO: renamed from: l.oii0$e */
    public static class C18947e extends AbstractC18946d {

        /* JADX INFO: renamed from: b */
        public final boolean f144134b;

        public C18947e(InterfaceC18945c interfaceC18945c, boolean z) {
            super(interfaceC18945c);
            this.f144134b = z;
        }

        @Override // p149l.oii0.AbstractC18946d
        /* JADX INFO: renamed from: a */
        public boolean mo164523a() {
            return this.f144134b;
        }
    }

    /* JADX INFO: renamed from: l.oii0$f */
    public static class C18948f extends AbstractC18946d {
        static final C18948f INSTANCE = new C18948f();

        public C18948f() {
            super(null);
        }

        @Override // p149l.oii0.AbstractC18946d
        /* JADX INFO: renamed from: a */
        public boolean mo164523a() {
            return lji0.m149981a(Locale.getDefault()) == 1;
        }
    }

    static {
        C18944b c18944b = C18944b.INSTANCE;
        f144127c = new C18947e(c18944b, false);
        f144128d = new C18947e(c18944b, true);
        f144129e = new C18947e(C18943a.f144131b, false);
        f144130f = C18948f.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static int m164520a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m164521b(int i) {
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
