package p007l;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rih extends Editable.Factory {

    /* JADX INFO: renamed from: a */
    public NoCopySpan[] f12656a;

    public rih(NoCopySpan... noCopySpanArr) {
        this.f12656a = noCopySpanArr;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        for (NoCopySpan noCopySpan : this.f12656a) {
            spannableStringBuilderValueOf.setSpan(noCopySpan, 0, charSequence.length(), 18);
        }
        return spannableStringBuilderValueOf;
    }
}
