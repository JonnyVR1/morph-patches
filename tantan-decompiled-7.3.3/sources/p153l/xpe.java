package p153l;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes9.dex */
public final class xpe implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final int f195703a;

    /* JADX INFO: renamed from: b */
    public InterfaceC21405a f195704b;

    /* JADX INFO: renamed from: l.xpe$a */
    public interface InterfaceC21405a {
        /* JADX INFO: renamed from: a */
        void mo115213a();
    }

    public xpe(int i, InterfaceC21405a interfaceC21405a) {
        this.f195703a = i;
        this.f195704b = interfaceC21405a;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f195703a - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            InterfaceC21405a interfaceC21405a = this.f195704b;
            if (interfaceC21405a != null) {
                interfaceC21405a.mo115213a();
            }
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        InterfaceC21405a interfaceC21405a2 = this.f195704b;
        if (interfaceC21405a2 != null) {
            interfaceC21405a2.mo115213a();
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }
}
