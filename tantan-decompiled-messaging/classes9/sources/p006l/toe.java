package p006l;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class toe implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final int f22210a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1317a f22211b;

    /* JADX INFO: renamed from: l.toe$a */
    public interface InterfaceC1317a {
        /* JADX INFO: renamed from: a */
        void mo20531a();
    }

    public toe(int i, InterfaceC1317a interfaceC1317a) {
        this.f22210a = i;
        this.f22211b = interfaceC1317a;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f22210a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            InterfaceC1317a interfaceC1317a = this.f22211b;
            if (interfaceC1317a != null) {
                interfaceC1317a.mo20531a();
            }
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        InterfaceC1317a interfaceC1317a2 = this.f22211b;
        if (interfaceC1317a2 != null) {
            interfaceC1317a2.mo20531a();
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }
}
