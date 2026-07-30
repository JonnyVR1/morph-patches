package p006l;

import android.widget.TextView;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import java.util.Locale;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class moy extends cwy {
    public moy(int i, final TextView textView) {
        super(i, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, new e30() { // from class: l.loy
            public final void call(Object obj) {
                textView.setText(String.format(Locale.getDefault(), "%d s", Long.valueOf(((Long) obj).longValue() / 1000)));
            }
        });
    }
}
