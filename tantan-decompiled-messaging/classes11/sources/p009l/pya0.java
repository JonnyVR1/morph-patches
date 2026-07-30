package p009l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Merchandise;
import java.util.List;
import l.vwb;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class pya0<T> extends AbstractC1278w4<T> {

    /* JADX INFO: renamed from: g */
    public Merchandise f18966g;

    public pya0(Context context) {
        super(context);
    }

    @Override // p009l.AbstractC1278w4
    /* JADX INFO: renamed from: p */
    public CharSequence mo20768p() {
        return m20769u(m23864j());
    }

    /* JADX INFO: renamed from: u */
    public final CharSequence m20769u(Context context) {
        if (this.f18966g == null || context == null || !w8e0.m24006c()) {
            return null;
        }
        List<String> listM24947b = xni.m24947b(this.f18966g);
        if (listM24947b.size() == 1) {
            return null;
        }
        if (listM24947b.size() != 4) {
            String str = String.format("%s:%s:%s", listM24947b.get(0), listM24947b.get(1), listM24947b.get(2));
            return i0g0.m16129b0(context.getString(R.string.D2, str), vwb.f0(new String[]{str}), Color.parseColor("#ebba63"), Typeface.DEFAULT);
        }
        int i = Integer.parseInt(listM24947b.get(0));
        String string = context.getString(R.string.E2, listM24947b.get(0), String.format("%s:%s:%s", listM24947b.get(1), listM24947b.get(2), listM24947b.get(3)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT, Color.parseColor("#ebba63"), 0), string.indexOf(i + ""), string.length(), 33);
        return spannableStringBuilder;
    }
}
