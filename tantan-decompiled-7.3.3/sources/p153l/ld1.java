package p153l;

import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class ld1 extends qrb {
    public ld1(int i, final TextView textView) {
        super(i, 1000, new y20() { // from class: l.kd1
            @Override // p153l.y20
            public final void call(Object obj) {
                textView.setText(String.format(Locale.getDefault(), "%d s", Long.valueOf(((Long) obj).longValue() / 1000)));
            }
        });
    }
}
