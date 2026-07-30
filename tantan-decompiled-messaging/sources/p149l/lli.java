package p149l;

import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class lli {

    /* JADX INFO: renamed from: c */
    public static volatile lli f128708c;

    /* JADX INFO: renamed from: a */
    public boolean f128709a = false;

    /* JADX INFO: renamed from: b */
    public C22392a<Boolean> f128710b = C22392a.m221512b();

    /* JADX INFO: renamed from: a */
    public static lli m150483a() {
        if (f128708c == null) {
            synchronized (lli.class) {
                try {
                    if (f128708c == null) {
                        f128708c = new lli();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f128708c;
    }

    /* JADX INFO: renamed from: b */
    public void m150484b(Act act, View view) {
        zvf0.m220402x("e_find_partner_bubble", "p_suggest_users_home_view");
        if (view == null || act == null) {
            return;
        }
        TextView textView = new TextView(act);
        textView.setText("要找的搭子，都在这里");
        int i = t100.f167260i;
        textView.setPadding(i, i, i, i);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        C4348d.m20896l().m20909u(new C4345a(act).m20877s(textView).m20870k(act.color(i1c0.f110441d)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20864e(true).m20881w(t100.m186890d(6.0f)).m20882x(t100.m186890d(7.0f)).m20875q(C4345a.f15680N | C4345a.f15684R), view, "growth_find_user_bubble");
    }
}
