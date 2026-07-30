package p009l;

import android.view.View;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import l.i1c0;
import l.t100;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lli {

    /* JADX INFO: renamed from: c */
    public static volatile lli f16247c;

    /* JADX INFO: renamed from: a */
    public boolean f16248a = false;

    /* JADX INFO: renamed from: b */
    public a<Boolean> f16249b = a.b();

    /* JADX INFO: renamed from: a */
    public static lli m17962a() {
        if (f16247c == null) {
            synchronized (lli.class) {
                try {
                    if (f16247c == null) {
                        f16247c = new lli();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16247c;
    }

    /* JADX INFO: renamed from: b */
    public void m17963b(Act act, View view) {
        zvf0.x("e_find_partner_bubble", "p_suggest_users_home_view");
        if (view == null || act == null) {
            return;
        }
        TextView textView = new TextView(act);
        textView.setText("要找的搭子，都在这里");
        int i = t100.i;
        textView.setPadding(i, i, i, i);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        d.l().u(new com.p1.mobile.android.ui.bubble.a(act).s(textView).k(new int[]{act.color(i1c0.d)}).b(5000L).e(true).w(t100.d(6.0f)).x(t100.d(7.0f)).q(com.p1.mobile.android.ui.bubble.a.N | com.p1.mobile.android.ui.bubble.a.R), view, "growth_find_user_bubble");
    }
}
