package p153l;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class gkh extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public NoCopySpan[] f104734a;

    public gkh(NoCopySpan... noCopySpanArr) {
        this.f104734a = noCopySpanArr;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        for (NoCopySpan noCopySpan : this.f104734a) {
            spannableStringBuilderValueOf.setSpan(noCopySpan, 0, charSequence.length(), 18);
        }
        return spannableStringBuilderValueOf;
    }
}
