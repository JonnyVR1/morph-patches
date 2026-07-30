package p153l;

import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class jxy extends z4z {
    public jxy(int i, final TextView textView) {
        super(i, 1000, new y20() { // from class: l.ixy
            @Override // p153l.y20
            public final void call(Object obj) {
                textView.setText(String.format(Locale.getDefault(), "%d s", Long.valueOf(((Long) obj).longValue() / 1000)));
            }
        });
    }
}
