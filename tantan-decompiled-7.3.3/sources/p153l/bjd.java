package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class bjd {

    /* JADX INFO: renamed from: a */
    public String f76974a;

    /* JADX INFO: renamed from: b */
    public String f76975b;

    /* JADX INFO: renamed from: c */
    public Intent f76976c;

    /* JADX INFO: renamed from: d */
    public Act f76977d;

    /* JADX INFO: renamed from: e */
    public View f76978e;

    public bjd(Act act, @Nullable Intent intent) {
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
        this.f76977d = act;
        this.f76974a = stringExtra2;
        this.f76975b = stringExtra3;
        this.f76976c = intent2;
        m104601c(act);
        intent.removeExtra("backXHS");
        intent.removeExtra("backText");
        intent.removeExtra("icon");
    }

    /* JADX INFO: renamed from: c */
    public final void m104601c(final Act act) {
        View viewInflate = LayoutInflater.from(act).inflate(jec0.f120473s, (ViewGroup) null, false);
        this.f76978e = viewInflate;
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(ycc0.f198414F);
        ImageView imageView = (ImageView) this.f76978e.findViewById(ycc0.f198476q);
        TextView textView = (TextView) this.f76978e.findViewById(ycc0.f198489w0);
        if (!TextUtils.isEmpty(this.f76974a)) {
            bnl0.m105515H0(textView, this.f76974a);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.zid
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204503a.m104606h(view);
            }
        });
        uqb0.f180374G.m127115L0(vDraweeView, this.f76975b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.bottomMargin = bnl0.m105587w(73.0f) + (m104602d(act) ? bnl0.m105516I(act) : 0);
        layoutParams.height = bnl0.m105587w(30.0f);
        this.f76978e.setLayoutParams(layoutParams);
        ((ViewGroup) act.getWindow().getDecorView()).addView(this.f76978e);
        this.f76978e.setOnClickListener(new View.OnClickListener() { // from class: l.ajd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71809a.m104607i(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m104602d(Act act) {
        return bnl0.m105510F(act).y + m104603e(act) < bnl0.m105518J(act).y;
    }

    /* JADX INFO: renamed from: e */
    public final int m104603e(Act act) {
        try {
            int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return act.getApplicationContext().getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m104604f() {
        if (m104605g()) {
            bnl0.m105525M0(this.f76978e, false);
            ((ViewGroup) this.f76977d.getWindow().getDecorView()).removeView(this.f76978e);
            this.f76978e = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m104605g() {
        return this.f76978e != null;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m104606h(View view) {
        m104604f();
        i4g0.m138520r("e_xiaohongshu_close", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m104607i(Act act, View view) {
        if (NullChecker.m82486a(this.f76976c)) {
            try {
                act.startActivity(this.f76976c);
                i4g0.m138520r("e_xiaohongshu", "p_suggest_users_home_view");
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }
        m104604f();
    }

    /* JADX INFO: renamed from: j */
    public void m104608j() {
        if (m104605g()) {
            i4g0.m138526x("e_xiaohongshu", "p_suggest_users_home_view");
            bnl0.m105525M0(this.f76978e, true);
        }
    }
}
