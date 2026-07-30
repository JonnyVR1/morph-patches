package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Merchandise;
import java.util.List;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pya0<T> extends AbstractC20796w4<T> {

    /* JADX INFO: renamed from: g */
    public Merchandise f151827g;

    public pya0(Context context) {
        super(context);
    }

    @Override // p149l.AbstractC20796w4
    /* JADX INFO: renamed from: p */
    public CharSequence mo172098p() {
        return m172099u(m201439j());
    }

    /* JADX INFO: renamed from: u */
    public final CharSequence m172099u(Context context) {
        if (this.f151827g == null || context == null || !w8e0.m202165c()) {
            return null;
        }
        List<String> listM210164b = xni.m210164b(this.f151827g);
        if (listM210164b.size() == 1) {
            return null;
        }
        if (listM210164b.size() != 4) {
            String str = String.format("%s:%s:%s", listM210164b.get(0), listM210164b.get(1), listM210164b.get(2));
            return i0g0.m133861b0(context.getString(R$string.f17659D2, str), vwb.m200324f0(str), Color.parseColor("#ebba63"), Typeface.DEFAULT);
        }
        int i = Integer.parseInt(listM210164b.get(0));
        String string = context.getString(R$string.f17689E2, listM210164b.get(0), String.format("%s:%s:%s", listM210164b.get(1), listM210164b.get(2), listM210164b.get(3)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT, Color.parseColor("#ebba63"), 0), string.indexOf(i + ""), string.length(), 33);
        return spannableStringBuilder;
    }
}
