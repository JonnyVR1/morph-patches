package p149l;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes12.dex */
public class rih extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public NoCopySpan[] f159554a;

    public rih(NoCopySpan... noCopySpanArr) {
        this.f159554a = noCopySpanArr;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        for (NoCopySpan noCopySpan : this.f159554a) {
            spannableStringBuilderValueOf.setSpan(noCopySpan, 0, charSequence.length(), 18);
        }
        return spannableStringBuilderValueOf;
    }
}
