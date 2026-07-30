package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.status.share.DialogC11520a;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class zzg {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static final byd0 f206700a = new byd0("last_show_fake_comment_dialog_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static final byd0 f206701b = new byd0("last_show_fake_post_moment_dialog_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m222250b(Throwable th, boolean z) {
        if (NullChecker.m82486a(th) && (th instanceof TantanException.Client.TantanForbidden)) {
            if (((TantanException.Client.TantanForbidden) th).code == (z ? 40365 : 40366)) {
                final Activity activity = (Act.foreground_() == null || Act.foreground_().f16062a == null) ? null : Act.foreground_().f16062a.get();
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                th0.C20312a c20312aM191157p = new th0.C20312a(activity).m191159r(FeedModule.f39700a.getString(R$string.f39715B)).m191157p(k9c0.f124521n);
                if ((l51.m152884D() ? FeedModule.m61406H().me_() : FeedModule.m61406H().queryMe()).jailedBusinessMomentHadReason()) {
                    c20312aM191157p.m191151j(FeedModule.f39700a.getString(R$string.f39721C)).m191147f(FeedModule.f39700a.getString(R$string.f39709A)).m191145d(k9c0.f124530t).m191144c(new View.OnClickListener() { // from class: l.yzg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FeedModule.m61406H().mo31788ki(activity);
                        }
                    });
                } else {
                    c20312aM191157p.m191150i(R$string.f39840V4);
                }
                c20312aM191157p.m191149h(false).m191142a().m191141g();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m222251c(String str, DialogInterface dialogInterface) {
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            f206701b.put(Long.valueOf(pzi0.m174454o()));
        } else {
            f206700a.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m222252d(Act act, String str, String str2, String str3, boolean z) {
        if (act == null || act.isFinishing()) {
            return;
        }
        new qhh(act, str, str2, str3, z).show();
    }

    /* JADX INFO: renamed from: e */
    public static void m222253e(Act act, String str, User user, x20 x20Var) {
        m222254f(act, str, user, x20Var, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m222254f(Act act, final String str, User user, x20 x20Var, y20<Boolean> y20Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        o9i o9iVar = new o9i(act, str, user, x20Var, y20Var);
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            long jLongValue = f206701b.get().longValue();
            if (jLongValue != 0 && pzi0.m174454o() - jLongValue < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                x20Var.call();
                return;
            }
        } else {
            long jLongValue2 = f206700a.get().longValue();
            if (jLongValue2 != 0 && pzi0.m174454o() - jLongValue2 < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
                x20Var.call();
                return;
            }
        }
        o9iVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xzg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zzg.m222251c(str, dialogInterface);
            }
        });
        if (act.isFinishing()) {
            return;
        }
        o9iVar.show();
    }

    /* JADX INFO: renamed from: g */
    public static void m222255g(final boolean z, final Throwable th) {
        l51.m152888H(FeedModule.f39700a, new Runnable() { // from class: l.wzg
            @Override // java.lang.Runnable
            public final void run() {
                zzg.m222250b(th, z);
            }
        }, 300L);
    }

    @SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
    /* JADX INFO: renamed from: h */
    public static void m222256h(Act act, String str, String str2, int i, y20<String> y20Var, y20<String> y20Var2) {
        m222257i(act, str, str2, i, y20Var, y20Var2, null);
    }

    @SuppressLint({"RtlHardcoded", "ClickableViewAccessibility"})
    /* JADX INFO: renamed from: i */
    public static void m222257i(Act act, String str, String str2, int i, y20<String> y20Var, y20<String> y20Var2, uul uulVar) {
        DialogC11520a dialogC11520a = new DialogC11520a(act, fgc0.f98904g);
        dialogC11520a.m67076K(str, str2, i, y20Var, y20Var2, uulVar);
        if (!NullChecker.m82486a(act) || act.isFinishing()) {
            return;
        }
        dialogC11520a.show();
    }
}
