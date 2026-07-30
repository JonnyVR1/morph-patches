package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class vhd {

    /* JADX INFO: renamed from: a */
    public String f181485a;

    /* JADX INFO: renamed from: b */
    public String f181486b;

    /* JADX INFO: renamed from: c */
    public Intent f181487c;

    /* JADX INFO: renamed from: d */
    public Act f181488d;

    /* JADX INFO: renamed from: e */
    public View f181489e;

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
        this.f181488d = act;
        this.f181485a = stringExtra2;
        this.f181486b = stringExtra3;
        this.f181487c = intent2;
        m198428c(act);
        intent.removeExtra("backXHS");
        intent.removeExtra("backText");
        intent.removeExtra("icon");
    }

    /* JADX INFO: renamed from: c */
    public final void m198428c(final Act act) {
        View viewInflate = LayoutInflater.from(act).inflate(e6c0.f89560s, (ViewGroup) null, false);
        this.f181489e = viewInflate;
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(s4c0.f162293F);
        ImageView imageView = (ImageView) this.f181489e.findViewById(s4c0.f162355q);
        TextView textView = (TextView) this.f181489e.findViewById(s4c0.f162368w0);
        if (!TextUtils.isEmpty(this.f181485a)) {
            xdl0.m208335H0(textView, this.f181485a);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.thd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170220a.m198433h(view);
            }
        });
        qib0.f154691G.m102331L0(vDraweeView, this.f181486b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.bottomMargin = xdl0.m208407w(73.0f) + (m198429d(act) ? xdl0.m208336I(act) : 0);
        layoutParams.height = xdl0.m208407w(30.0f);
        this.f181489e.setLayoutParams(layoutParams);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f181489e);
        this.f181489e.setOnClickListener(new View.OnClickListener() { // from class: l.uhd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176548a.m198434i(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m198429d(Act act) {
        return xdl0.m208330F(act).y + m198430e(act) < xdl0.m208338J(act).y;
    }

    /* JADX INFO: renamed from: e */
    public final int m198430e(Act act) {
        try {
            int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m198431f() {
        if (m198432g()) {
            xdl0.m208345M0(this.f181489e, false);
            ((ViewGroup) this.f181488d.getWindow().getDecorView()).removeView(this.f181489e);
            this.f181489e = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m198432g() {
        return this.f181489e != null;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m198433h(View view) {
        m198431f();
        zvf0.m220396r("e_xiaohongshu_close", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m198434i(Act act, View view) {
        if (NullChecker.m81303a(this.f181487c)) {
            try {
                act.startActivity(this.f181487c);
                zvf0.m220396r("e_xiaohongshu", "p_suggest_users_home_view");
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }
        m198431f();
    }

    /* JADX INFO: renamed from: j */
    public void m198435j() {
        if (m198432g()) {
            zvf0.m220402x("e_xiaohongshu", "p_suggest_users_home_view");
            xdl0.m208345M0(this.f181489e, true);
        }
    }
}
