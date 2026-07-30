package p006l;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class shd {

    /* JADX INFO: renamed from: g */
    public static long f21313g = 5000;

    /* JADX INFO: renamed from: h */
    public static volatile long f21314h = 5000;

    /* JADX INFO: renamed from: a */
    public String f21315a;

    /* JADX INFO: renamed from: b */
    public Intent f21316b;

    /* JADX INFO: renamed from: c */
    public Act f21317c;

    /* JADX INFO: renamed from: d */
    public View f21318d;

    /* JADX INFO: renamed from: e */
    public final Handler f21319e = new Handler();

    /* JADX INFO: renamed from: f */
    public boolean f21320f;

    static {
        ThreadUtil.e(new Runnable() { // from class: l.qhd
            @Override // java.lang.Runnable
            public final void run() {
                shd.f21314h = RemoteConfig.x().B("deepLinkDuration", shd.f21313g);
            }
        }, false);
    }

    public shd(Act act, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("backurl");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("btn_name");
        boolean zIsEmpty = TextUtils.isEmpty(stringExtra2);
        this.f21320f = !zIsEmpty;
        if (zIsEmpty) {
            if (stringExtra.contains("snssdk143")) {
                stringExtra2 = "头条";
            } else if (stringExtra.contains("snssdk35")) {
                stringExtra2 = "头条极速版";
            } else if (stringExtra.contains("snssdk32")) {
                stringExtra2 = "西瓜视频";
            } else if (stringExtra.contains("snssdk1128")) {
                stringExtra2 = "抖音";
            } else if (stringExtra.contains("snssdk2329")) {
                stringExtra2 = "抖音极速版";
            } else if (stringExtra.contains("snssdk1112")) {
                stringExtra2 = "火山视频";
            }
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
        this.f21317c = act;
        this.f21315a = stringExtra2;
        this.f21316b = intent2;
        m23754c(act);
        intent.removeExtra("backurl");
        intent.removeExtra("btn_name");
    }

    /* JADX INFO: renamed from: c */
    public final void m23754c(final Act act) {
        View viewInflate = LayoutInflater.from(act).inflate(e6c0.f10820t, (ViewGroup) null, false);
        this.f21318d = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(s4c0.f21096w0);
        if (!TextUtils.isEmpty(this.f21315a)) {
            textView.setText("返回" + this.f21315a);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.topMargin = xdl0.w0() / 3;
        this.f21318d.setLayoutParams(layoutParams);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f21318d);
        this.f21318d.setOnClickListener(new View.OnClickListener() { // from class: l.phd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18737a.m23758g(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m23755d() {
        if (m23757f()) {
            xdl0.M0(this.f21318d, false);
            ((ViewGroup) this.f21317c.getWindow().getDecorView()).removeView(this.f21318d);
            this.f21318d = null;
            this.f21319e.removeMessages(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m23756e() {
        return this.f21320f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23757f() {
        return this.f21318d != null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m23758g(Act act, View view) {
        if (NullChecker.a(this.f21316b)) {
            try {
                act.startActivity(this.f21316b);
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }
        m23755d();
    }

    /* JADX INFO: renamed from: h */
    public final void m23759h(Runnable runnable, long j) {
        this.f21319e.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: i */
    public void m23760i() {
        if (m23757f()) {
            xdl0.M0(this.f21318d, true);
            m23759h(new Runnable() { // from class: l.rhd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20550a.m23755d();
                }
            }, f21314h);
        }
    }
}
