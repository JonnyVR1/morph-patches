package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.common.utils.ThreadUtil;

/* JADX INFO: loaded from: classes9.dex */
public class yid {

    /* JADX INFO: renamed from: g */
    public static long f200069g = 5000;

    /* JADX INFO: renamed from: h */
    public static volatile long f200070h = 5000;

    /* JADX INFO: renamed from: a */
    public String f200071a;

    /* JADX INFO: renamed from: b */
    public Intent f200072b;

    /* JADX INFO: renamed from: c */
    public Act f200073c;

    /* JADX INFO: renamed from: d */
    public View f200074d;

    /* JADX INFO: renamed from: e */
    public final Handler f200075e = new Handler();

    /* JADX INFO: renamed from: f */
    public boolean f200076f;

    static {
        ThreadUtil.m82493e(new Runnable() { // from class: l.wid
            @Override // java.lang.Runnable
            public final void run() {
                yid.f200070h = RemoteConfig.m80481x().m80483B("deepLinkDuration", yid.f200069g);
            }
        }, false);
    }

    public yid(Act act, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("backurl");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("btn_name");
        boolean zIsEmpty = TextUtils.isEmpty(stringExtra2);
        this.f200076f = !zIsEmpty;
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
        this.f200073c = act;
        this.f200071a = stringExtra2;
        this.f200072b = intent2;
        m216061c(act);
        intent.removeExtra("backurl");
        intent.removeExtra("btn_name");
    }

    /* JADX INFO: renamed from: c */
    public final void m216061c(final Act act) {
        View viewInflate = LayoutInflater.from(act).inflate(jec0.f120474t, (ViewGroup) null, false);
        this.f200074d = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(ycc0.f198489w0);
        if (!TextUtils.isEmpty(this.f200071a)) {
            textView.setText("返回" + this.f200071a);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        layoutParams.topMargin = bnl0.m105588w0() / 3;
        this.f200074d.setLayoutParams(layoutParams);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f200074d);
        this.f200074d.setOnClickListener(new View.OnClickListener() { // from class: l.vid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184227a.m216065g(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m216062d() {
        if (m216064f()) {
            bnl0.m105525M0(this.f200074d, false);
            ((ViewGroup) this.f200073c.getWindow().getDecorView()).removeView(this.f200074d);
            this.f200074d = null;
            this.f200075e.removeMessages(0);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m216063e() {
        return this.f200076f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m216064f() {
        return this.f200074d != null;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m216065g(Act act, View view) {
        if (NullChecker.m82486a(this.f200072b)) {
            try {
                act.startActivity(this.f200072b);
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }
        m216062d();
    }

    /* JADX INFO: renamed from: h */
    public final void m216066h(Runnable runnable, long j) {
        this.f200075e.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: i */
    public void m216067i() {
        if (m216064f()) {
            bnl0.m105525M0(this.f200074d, true);
            m216066h(new Runnable() { // from class: l.xid
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194460a.m216062d();
                }
            }, f200070h);
        }
    }
}
