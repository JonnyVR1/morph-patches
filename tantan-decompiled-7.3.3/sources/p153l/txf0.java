package p153l;

import com.google.android.gms.common.api.Api;
import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class txf0 {

    /* JADX INFO: renamed from: a */
    public final xs4 f176548a;

    /* JADX INFO: renamed from: b */
    public final boolean f176549b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20424c f176550c;

    /* JADX INFO: renamed from: d */
    public final int f176551d;

    /* JADX INFO: renamed from: l.txf0$a */
    public class C20422a implements InterfaceC20424c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xs4 f176552a;

        /* JADX INFO: renamed from: l.txf0$a$a */
        public class a extends AbstractC20423b {
            public a(txf0 txf0Var, CharSequence charSequence) {
                super(txf0Var, charSequence);
            }

            @Override // p153l.txf0.AbstractC20423b
            /* JADX INFO: renamed from: e */
            public int mo193497e(int i) {
                return i + 1;
            }

            @Override // p153l.txf0.AbstractC20423b
            /* JADX INFO: renamed from: f */
            public int mo193498f(int i) {
                return C20422a.this.f176552a.mo212955e(this.f176554c, i);
            }
        }

        public C20422a(xs4 xs4Var) {
            this.f176552a = xs4Var;
        }

        @Override // p153l.txf0.InterfaceC20424c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC20423b mo193495a(txf0 txf0Var, CharSequence charSequence) {
            return new a(txf0Var, charSequence);
        }
    }

    /* JADX INFO: renamed from: l.txf0$b */
    public static abstract class AbstractC20423b extends AbstractIterator<String> {

        /* JADX INFO: renamed from: c */
        public final CharSequence f176554c;

        /* JADX INFO: renamed from: d */
        public final xs4 f176555d;

        /* JADX INFO: renamed from: e */
        public final boolean f176556e;

        /* JADX INFO: renamed from: f */
        public int f176557f = 0;

        /* JADX INFO: renamed from: g */
        public int f176558g;

        public AbstractC20423b(txf0 txf0Var, CharSequence charSequence) {
            this.f176555d = txf0Var.f176548a;
            this.f176556e = txf0Var.f176549b;
            this.f176558g = txf0Var.f176551d;
            this.f176554c = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String mo15462a() {
            int i = this.f176557f;
            while (true) {
                int i2 = this.f176557f;
                if (i2 == -1) {
                    return m15463b();
                }
                int iMo193498f = mo193498f(i2);
                if (iMo193498f == -1) {
                    iMo193498f = this.f176554c.length();
                    this.f176557f = -1;
                } else {
                    this.f176557f = mo193497e(iMo193498f);
                }
                int i3 = this.f176557f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f176557f = i4;
                    if (i4 > this.f176554c.length()) {
                        this.f176557f = -1;
                    }
                } else {
                    while (i < iMo193498f && this.f176555d.mo212956g(this.f176554c.charAt(i))) {
                        i++;
                    }
                    while (iMo193498f > i && this.f176555d.mo212956g(this.f176554c.charAt(iMo193498f - 1))) {
                        iMo193498f--;
                    }
                    if (!this.f176556e || i != iMo193498f) {
                        int i5 = this.f176558g;
                        if (i5 == 1) {
                            iMo193498f = this.f176554c.length();
                            this.f176557f = -1;
                            while (iMo193498f > i && this.f176555d.mo212956g(this.f176554c.charAt(iMo193498f - 1))) {
                                iMo193498f--;
                            }
                        } else {
                            this.f176558g = i5 - 1;
                        }
                        return this.f176554c.subSequence(i, iMo193498f).toString();
                    }
                    i = this.f176557f;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public abstract int mo193497e(int i);

        /* JADX INFO: renamed from: f */
        public abstract int mo193498f(int i);
    }

    /* JADX INFO: renamed from: l.txf0$c */
    public interface InterfaceC20424c {
        /* JADX INFO: renamed from: a */
        Iterator<String> mo193495a(txf0 txf0Var, CharSequence charSequence);
    }

    public txf0(InterfaceC20424c interfaceC20424c) {
        this(interfaceC20424c, false, xs4.m212952i(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: d */
    public static txf0 m193491d(char c) {
        return m193492e(xs4.m212951f(c));
    }

    /* JADX INFO: renamed from: e */
    public static txf0 m193492e(xs4 xs4Var) {
        xn80.m212111p(xs4Var);
        return new txf0(new C20422a(xs4Var));
    }

    /* JADX INFO: renamed from: f */
    public List<String> m193493f(CharSequence charSequence) {
        xn80.m212111p(charSequence);
        Iterator<String> itM193494g = m193494g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM193494g.hasNext()) {
            arrayList.add(itM193494g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final Iterator<String> m193494g(CharSequence charSequence) {
        return this.f176550c.mo193495a(this, charSequence);
    }

    public txf0(InterfaceC20424c interfaceC20424c, boolean z, xs4 xs4Var, int i) {
        this.f176550c = interfaceC20424c;
        this.f176549b = z;
        this.f176548a = xs4Var;
        this.f176551d = i;
    }
}
