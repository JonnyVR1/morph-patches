package p149l;

import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class moy extends cwy {
    public moy(int i, final TextView textView) {
        super(i, 1000, new e30() { // from class: l.loy
            @Override // p149l.e30
            public final void call(Object obj) {
                textView.setText(String.format(Locale.getDefault(), "%d s", Long.valueOf(((Long) obj).longValue() / 1000)));
            }
        });
    }
}
