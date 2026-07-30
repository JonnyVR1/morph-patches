package p009l;

import android.widget.TextView;
import java.util.Locale;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ed1 extends cqb {
    public ed1(int i, final TextView textView) {
        super(i, 1000, new e30() { // from class: l.dd1
            public final void call(Object obj) {
                textView.setText(String.format(Locale.getDefault(), "%d s", Long.valueOf(((Long) obj).longValue() / 1000)));
            }
        });
    }
}
