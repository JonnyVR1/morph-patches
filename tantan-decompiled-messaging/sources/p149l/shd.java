package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;

/* JADX INFO: loaded from: classes9.dex */
public class shd {

    /* JADX INFO: renamed from: g */
    public static long f164544g = 5000;

    /* JADX INFO: renamed from: h */
    public static volatile long f164545h = 5000;

    /* JADX INFO: renamed from: a */
    public String f164546a;

    /* JADX INFO: renamed from: b */
    public Intent f164547b;

    /* JADX INFO: renamed from: c */
    public Act f164548c;

    /* JADX INFO: renamed from: d */
    public View f164549d;

    /* JADX INFO: renamed from: e */
    public final Handler f164550e = new Handler();

    /* JADX INFO: renamed from: f */
    public boolean f164551f;

    static {
        ThreadUtil.m81310e(new Runnable() { // from class: l.qhd
            @Override // java.lang.Runnable
            public final void run() {
                shd.f164545h = RemoteConfig.m79298x().m79300B("deepLinkDuration", shd.f164544g);
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
        this.f164551f = !zIsEmpty;
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
        this.f164548c = act;
        this.f164546a = stringExtra2;
        this.f164547b = intent2;
        m184182c(act);
        intent.removeExtra("backurl");
        intent.removeExtra("btn_name");
    }

    /* JADX INFO: renamed from: c */
    public final void m184182c(final Act act) {
        View viewInflate = LayoutInflater.from(act).inflate(e6c0.f89561t, (ViewGroup) null, false);
        this.f164549d = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(s4c0.f162368w0);
        if (!TextUtils.isEmpty(this.f164546a)) {
            textView.setText("返回" + this.f164546a);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.topMargin = xdl0.m208408w0() / 3;
        this.f164549d.setLayoutParams(layoutParams);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f164549d);
        this.f164549d.setOnClickListener(new View.OnClickListener() { // from class: l.phd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148889a.m184186g(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m184183d() {
        if (m184185f()) {
            xdl0.m208345M0(this.f164549d, false);
            ((ViewGroup) this.f164548c.getWindow().getDecorView()).removeView(this.f164549d);
            this.f164549d = null;
            this.f164550e.removeMessages(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m184184e() {
        return this.f164551f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m184185f() {
        return this.f164549d != null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m184186g(Act act, View view) {
        if (NullChecker.m81303a(this.f164547b)) {
            try {
                act.startActivity(this.f164547b);
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }
        m184183d();
    }

    /* JADX INFO: renamed from: h */
    public final void m184187h(Runnable runnable, long j) {
        this.f164550e.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: i */
    public void m184188i() {
        if (m184185f()) {
            xdl0.m208345M0(this.f164549d, true);
            m184187h(new Runnable() { // from class: l.rhd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159351a.m184183d();
                }
            }, f164545h);
        }
    }
}
