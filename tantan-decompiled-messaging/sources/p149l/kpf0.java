package p149l;

import com.google.android.gms.common.api.Api;
import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class kpf0 {

    /* JADX INFO: renamed from: a */
    public final yr4 f124135a;

    /* JADX INFO: renamed from: b */
    public final boolean f124136b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC18060c f124137c;

    /* JADX INFO: renamed from: d */
    public final int f124138d;

    /* JADX INFO: renamed from: l.kpf0$a */
    public class C18058a implements InterfaceC18060c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yr4 f124139a;

        /* JADX INFO: renamed from: l.kpf0$a$a */
        public class a extends AbstractC18059b {
            public a(kpf0 kpf0Var, CharSequence charSequence) {
                super(kpf0Var, charSequence);
            }

            @Override // p149l.kpf0.AbstractC18059b
            /* JADX INFO: renamed from: e */
            public int mo146850e(int i) {
                return i + 1;
            }

            @Override // p149l.kpf0.AbstractC18059b
            /* JADX INFO: renamed from: f */
            public int mo146851f(int i) {
                return C18058a.this.f124139a.mo215776e(this.f124141c, i);
            }
        }

        public C18058a(yr4 yr4Var) {
            this.f124139a = yr4Var;
        }

        @Override // p149l.kpf0.InterfaceC18060c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC18059b mo146848a(kpf0 kpf0Var, CharSequence charSequence) {
            return new a(kpf0Var, charSequence);
        }
    }

    /* JADX INFO: renamed from: l.kpf0$b */
    public static abstract class AbstractC18059b extends AbstractIterator<String> {

        /* JADX INFO: renamed from: c */
        public final CharSequence f124141c;

        /* JADX INFO: renamed from: d */
        public final yr4 f124142d;

        /* JADX INFO: renamed from: e */
        public final boolean f124143e;

        /* JADX INFO: renamed from: f */
        public int f124144f = 0;

        /* JADX INFO: renamed from: g */
        public int f124145g;

        public AbstractC18059b(kpf0 kpf0Var, CharSequence charSequence) {
            this.f124142d = kpf0Var.f124135a;
            this.f124143e = kpf0Var.f124136b;
            this.f124145g = kpf0Var.f124138d;
            this.f124141c = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo15408a() {
            int i = this.f124144f;
            while (true) {
                int i2 = this.f124144f;
                if (i2 == -1) {
                    return m15409b();
                }
                int iMo146851f = mo146851f(i2);
                if (iMo146851f == -1) {
                    iMo146851f = this.f124141c.length();
                    this.f124144f = -1;
                } else {
                    this.f124144f = mo146850e(iMo146851f);
                }
                int i3 = this.f124144f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f124144f = i4;
                    if (i4 > this.f124141c.length()) {
                        this.f124144f = -1;
                    }
                } else {
                    while (i < iMo146851f && this.f124142d.mo215777g(this.f124141c.charAt(i))) {
                        i++;
                    }
                    while (iMo146851f > i && this.f124142d.mo215777g(this.f124141c.charAt(iMo146851f - 1))) {
                        iMo146851f--;
                    }
                    if (!this.f124143e || i != iMo146851f) {
                        int i5 = this.f124145g;
                        if (i5 == 1) {
                            iMo146851f = this.f124141c.length();
                            this.f124144f = -1;
                            while (iMo146851f > i && this.f124142d.mo215777g(this.f124141c.charAt(iMo146851f - 1))) {
                                iMo146851f--;
                            }
                        } else {
                            this.f124145g = i5 - 1;
                        }
                        return this.f124141c.subSequence(i, iMo146851f).toString();
                    }
                    i = this.f124144f;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo146850e(int i);

        /* JADX INFO: renamed from: f */
        public abstract int mo146851f(int i);
    }

    /* JADX INFO: renamed from: l.kpf0$c */
    public interface InterfaceC18060c {
        /* JADX INFO: renamed from: a */
        Iterator<String> mo146848a(kpf0 kpf0Var, CharSequence charSequence);
    }

    public kpf0(InterfaceC18060c interfaceC18060c) {
        this(interfaceC18060c, false, yr4.m215773i(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: d */
    public static kpf0 m146844d(char c) {
        return m146845e(yr4.m215772f(c));
    }

    /* JADX INFO: renamed from: e */
    public static kpf0 m146845e(yr4 yr4Var) {
        sf80.m183894p(yr4Var);
        return new kpf0(new C18058a(yr4Var));
    }

    /* JADX INFO: renamed from: f */
    public List<String> m146846f(CharSequence charSequence) {
        sf80.m183894p(charSequence);
        Iterator<String> itM146847g = m146847g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM146847g.hasNext()) {
            arrayList.add(itM146847g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final Iterator<String> m146847g(CharSequence charSequence) {
        return this.f124137c.mo146848a(this, charSequence);
    }

    public kpf0(InterfaceC18060c interfaceC18060c, boolean z, yr4 yr4Var, int i) {
        this.f124137c = interfaceC18060c;
        this.f124136b = z;
        this.f124135a = yr4Var;
        this.f124138d = i;
    }
}
