package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Merchandise;
import java.util.List;
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes11.dex */
public abstract class t6b0<T> extends AbstractC20482u4<T> {

    /* JADX INFO: renamed from: g */
    public Merchandise f172323g;

    public t6b0(Context context) {
        super(context);
    }

    @Override // p153l.AbstractC20482u4
    /* JADX INFO: renamed from: p */
    public CharSequence mo189516p() {
        return m189517u(m194456j());
    }

    /* JADX INFO: renamed from: u */
    public final CharSequence m189517u(Context context) {
        if (this.f172323g == null || context == null || !bhe0.m104330c()) {
            return null;
        }
        List<String> listM192302b = tqi.m192302b(this.f172323g);
        if (listM192302b.size() == 1) {
            return null;
        }
        if (listM192302b.size() != 4) {
            String str = String.format("%s:%s:%s", listM192302b.get(0), listM192302b.get(1), listM192302b.get(2));
            return q8g0.m175796b0(context.getString(R$string.f18443F2, str), jyb.m147507f0(str), Color.parseColor("#ebba63"), Typeface.DEFAULT);
        }
        int i = Integer.parseInt(listM192302b.get(0));
        String string = context.getString(R$string.f18474G2, listM192302b.get(0), String.format("%s:%s:%s", listM192302b.get(1), listM192302b.get(2), listM192302b.get(3)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT, Color.parseColor("#ebba63"), 0), string.indexOf(i + ""), string.length(), 33);
        return spannableStringBuilder;
    }
}
