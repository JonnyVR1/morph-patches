package p007l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.status.share.C2201a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.mqi0;
import l.xh0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kyg {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static final zpd0 f9818a = new zpd0("last_show_fake_comment_dialog_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static final zpd0 f9819b = new zpd0("last_show_fake_post_moment_dialog_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11533b(Throwable th, boolean z) {
        if (NullChecker.a(th) && (th instanceof TantanException.Client.TantanForbidden)) {
            if (((TantanException.Client.TantanForbidden) th).code == (z ? 40365 : 40366)) {
                final Activity activity = (Act.foreground_() == null || Act.foreground_().a == null) ? null : (Activity) Act.foreground_().a.get();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                xh0.a aVarP = new xh0.a(activity).r(FeedModule.f313a.getString(R$string.f328B)).p(e1c0.f7154n);
                if ((e51.D() ? FeedModule.m1140H().me_() : FeedModule.m1140H().queryMe()).jailedBusinessMomentHadReason()) {
                    aVarP.j(FeedModule.f313a.getString(R$string.f334C)).f(FeedModule.f313a.getString(R$string.f322A)).d(e1c0.f7163t).c(new View.OnClickListener() { // from class: l.jyg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeedModule.m1140H().ki(activity);
                        }
                    });
                } else {
                    aVarP.i(R$string.f453V4);
                }
                aVarP.h(false).a().g();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11534c(String str, DialogInterface dialogInterface) {
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            f9819b.put(Long.valueOf(mqi0.o()));
        } else {
            f9818a.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m11535d(Act act, String str, String str2, String str3, boolean z) {
        if (act == null || act.isFinishing()) {
            return;
        }
        new bgh(act, str, str2, str3, z).show();
    }

    /* JADX INFO: renamed from: e */
    public static void m11536e(Act act, String str, User user, d30 d30Var) {
        m11537f(act, str, user, d30Var, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m11537f(Act act, final String str, User user, d30 d30Var, e30<Boolean> e30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        z7i z7iVar = new z7i(act, str, user, d30Var, e30Var);
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            long jLongValue = ((Long) f9819b.get()).longValue();
            if (jLongValue != 0 && mqi0.o() - jLongValue < 300000) {
                d30Var.call();
                return;
            }
        } else {
            long jLongValue2 = ((Long) f9818a.get()).longValue();
            if (jLongValue2 != 0 && mqi0.o() - jLongValue2 < 300000) {
                d30Var.call();
                return;
            }
        }
        z7iVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.iyg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kyg.m11534c(str, dialogInterface);
            }
        });
        if (act.isFinishing()) {
            return;
        }
        z7iVar.show();
    }

    /* JADX INFO: renamed from: g */
    public static void m11538g(final boolean z, final Throwable th) {
        e51.H(FeedModule.f313a, new Runnable() { // from class: l.hyg
            @Override // java.lang.Runnable
            public final void run() {
                kyg.m11533b(th, z);
            }
        }, 300L);
    }

    @SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public static void m11539h(Act act, String str, String str2, int i, e30<String> e30Var, e30<String> e30Var2) {
        m11540i(act, str, str2, i, e30Var, e30Var2, null);
    }

    @SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
    /* JADX INFO: renamed from: i */
    public static void m11540i(Act act, String str, String str2, int i, e30<String> e30Var, e30<String> e30Var2, gsl gslVar) {
        C2201a c2201a = new C2201a(act, a8c0.f5638g);
        c2201a.m7040K(str, str2, i, e30Var, e30Var2, gslVar);
        if (!NullChecker.a(act) || act.isFinishing()) {
            return;
        }
        c2201a.show();
    }
}
