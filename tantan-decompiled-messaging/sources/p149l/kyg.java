package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.status.share.DialogC11357a;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class kyg {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static final zpd0 f125294a = new zpd0("last_show_fake_comment_dialog_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static final zpd0 f125295b = new zpd0("last_show_fake_post_moment_dialog_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m147867b(Throwable th, boolean z) {
        if (NullChecker.m81303a(th) && (th instanceof TantanException.Client.TantanForbidden)) {
            if (((TantanException.Client.TantanForbidden) th).code == (z ? 40365 : 40366)) {
                final Activity activity = (Act.foreground_() == null || Act.foreground_().f15343a == null) ? null : Act.foreground_().f15343a.get();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                xh0.C21150a c21150aM208737p = new xh0.C21150a(activity).m208739r(FeedModule.f38852a.getString(R$string.f38867B)).m208737p(e1c0.f88798n);
                if ((e51.m114739D() ? FeedModule.m60222H().me_() : FeedModule.m60222H().queryMe()).jailedBusinessMomentHadReason()) {
                    c21150aM208737p.m208731j(FeedModule.f38852a.getString(R$string.f38873C)).m208727f(FeedModule.f38852a.getString(R$string.f38861A)).m208725d(e1c0.f88807t).m208724c(new View.OnClickListener() { // from class: l.jyg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeedModule.m60222H().mo30785ki(activity);
                        }
                    });
                } else {
                    c21150aM208737p.m208730i(R$string.f38992V4);
                }
                c21150aM208737p.m208729h(false).m208722a().m208721g();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m147868c(String str, DialogInterface dialogInterface) {
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            f125295b.put(Long.valueOf(mqi0.m155944o()));
        } else {
            f125294a.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m147869d(Act act, String str, String str2, String str3, boolean z) {
        if (act == null || act.isFinishing()) {
            return;
        }
        new bgh(act, str, str2, str3, z).show();
    }

    /* JADX INFO: renamed from: e */
    public static void m147870e(Act act, String str, User user, d30 d30Var) {
        m147871f(act, str, user, d30Var, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m147871f(Act act, final String str, User user, d30 d30Var, e30<Boolean> e30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        z7i z7iVar = new z7i(act, str, user, d30Var, e30Var);
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            long jLongValue = f125295b.get().longValue();
            if (jLongValue != 0 && mqi0.m155944o() - jLongValue < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                d30Var.call();
                return;
            }
        } else {
            long jLongValue2 = f125294a.get().longValue();
            if (jLongValue2 != 0 && mqi0.m155944o() - jLongValue2 < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                d30Var.call();
                return;
            }
        }
        z7iVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.iyg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kyg.m147868c(str, dialogInterface);
            }
        });
        if (act.isFinishing()) {
            return;
        }
        z7iVar.show();
    }

    /* JADX INFO: renamed from: g */
    public static void m147872g(final boolean z, final Throwable th) {
        e51.m114743H(FeedModule.f38852a, new Runnable() { // from class: l.hyg
            @Override // java.lang.Runnable
            public final void run() {
                kyg.m147867b(th, z);
            }
        }, 300L);
    }

    @SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public static void m147873h(Act act, String str, String str2, int i, e30<String> e30Var, e30<String> e30Var2) {
        m147874i(act, str, str2, i, e30Var, e30Var2, null);
    }

    @SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
    /* JADX INFO: renamed from: i */
    public static void m147874i(Act act, String str, String str2, int i, e30<String> e30Var, e30<String> e30Var2, gsl gslVar) {
        DialogC11357a dialogC11357a = new DialogC11357a(act, a8c0.f68018g);
        dialogC11357a.m65893K(str, str2, i, e30Var, e30Var2, gslVar);
        if (!NullChecker.m81303a(act) || act.isFinishing()) {
            return;
        }
        dialogC11357a.show();
    }
}
