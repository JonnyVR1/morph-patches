package p006l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vhd {

    /* JADX INFO: renamed from: a */
    public String f24325a;

    /* JADX INFO: renamed from: b */
    public String f24326b;

    /* JADX INFO: renamed from: c */
    public Intent f24327c;

    /* JADX INFO: renamed from: d */
    public Act f24328d;

    /* JADX INFO: renamed from: e */
    public View f24329e;

    public vhd(Act act, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("backXHS");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("backText");
        String stringExtra3 = intent.getStringExtra("icon");
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
        this.f24328d = act;
        this.f24325a = stringExtra2;
        this.f24326b = stringExtra3;
        this.f24327c = intent2;
        m25812c(act);
        intent.removeExtra("backXHS");
        intent.removeExtra("backText");
        intent.removeExtra("icon");
    }

    /* JADX INFO: renamed from: c */
    public final void m25812c(final Act act) {
        View viewInflate = LayoutInflater.from(act).inflate(e6c0.f10819s, (ViewGroup) null, false);
        this.f24329e = viewInflate;
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(s4c0.f21021F);
        ImageView imageView = (ImageView) this.f24329e.findViewById(s4c0.f21083q);
        TextView textView = (TextView) this.f24329e.findViewById(s4c0.f21096w0);
        if (!TextUtils.isEmpty(this.f24325a)) {
            xdl0.H0(textView, this.f24325a);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.thd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22114a.m25817h(view);
            }
        });
        qib0.f19782G.m12744L0(simpleDraweeView, this.f24326b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.bottomMargin = xdl0.w(73.0f) + (m25813d(act) ? xdl0.I(act) : 0);
        layoutParams.height = xdl0.w(30.0f);
        this.f24329e.setLayoutParams(layoutParams);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f24329e);
        this.f24329e.setOnClickListener(new View.OnClickListener() { // from class: l.uhd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23546a.m25818i(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m25813d(Act act) {
        return xdl0.F(act).y + m25814e(act) < xdl0.J(act).y;
    }

    /* JADX INFO: renamed from: e */
    public final int m25814e(Act act) {
        try {
            int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m25815f() {
        if (m25816g()) {
            xdl0.M0(this.f24329e, false);
            ((ViewGroup) this.f24328d.getWindow().getDecorView()).removeView(this.f24329e);
            this.f24329e = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m25816g() {
        return this.f24329e != null;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m25817h(View view) {
        m25815f();
        zvf0.r("e_xiaohongshu_close", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m25818i(Act act, View view) {
        if (NullChecker.a(this.f24327c)) {
            try {
                act.startActivity(this.f24327c);
                zvf0.r("e_xiaohongshu", "p_suggest_users_home_view");
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }
        m25815f();
    }

    /* JADX INFO: renamed from: j */
    public void m25819j() {
        if (m25816g()) {
            zvf0.x("e_xiaohongshu", "p_suggest_users_home_view");
            xdl0.M0(this.f24329e, true);
        }
    }
}
