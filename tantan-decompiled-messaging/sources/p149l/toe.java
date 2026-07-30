package p149l;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes9.dex */
public final class toe implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final int f171356a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20221a f171357b;

    /* JADX INFO: renamed from: l.toe$a */
    public interface InterfaceC20221a {
        /* JADX INFO: renamed from: a */
        void mo163655a();
    }

    public toe(int i, InterfaceC20221a interfaceC20221a) {
        this.f171356a = i;
        this.f171357b = interfaceC20221a;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f171356a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            InterfaceC20221a interfaceC20221a = this.f171357b;
            if (interfaceC20221a != null) {
                interfaceC20221a.mo163655a();
            }
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        InterfaceC20221a interfaceC20221a2 = this.f171357b;
        if (interfaceC20221a2 != null) {
            interfaceC20221a2.mo163655a();
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }
}
