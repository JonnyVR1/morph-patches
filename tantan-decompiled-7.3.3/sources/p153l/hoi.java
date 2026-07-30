package p153l;

import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class hoi {

    /* JADX INFO: renamed from: c */
    public static volatile hoi f110917c;

    /* JADX INFO: renamed from: a */
    public boolean f110918a = false;

    /* JADX INFO: renamed from: b */
    public C22507a<Boolean> f110919b = C22507a.m222758b();

    /* JADX INFO: renamed from: a */
    public static hoi m136432a() {
        if (f110917c == null) {
            synchronized (hoi.class) {
                try {
                    if (f110917c == null) {
                        f110917c = new hoi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f110917c;
    }

    /* JADX INFO: renamed from: b */
    public void m136433b(Act act, View view) {
        i4g0.m138526x("e_find_partner_bubble", "p_suggest_users_home_view");
        if (view == null || act == null) {
            return;
        }
        TextView textView = new TextView(act);
        textView.setText("要找的搭子，都在这里");
        int i = qa00.f156322i;
        textView.setPadding(i, i, i, i);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        C4499d.m21895l().m21908u(new C4496a(act).m21876s(textView).m21869k(act.color(o9c0.f145548d)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21863e(true).m21880w(qa00.m175859d(6.0f)).m21881x(qa00.m175859d(7.0f)).m21874q(C4496a.f16399N | C4496a.f16403R), view, "growth_find_user_bubble");
    }
}
