package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.OpenSDKInfo;
import com.p1.mobile.putong.data.Scopes;
import com.p1.mobile.putong.data.User;
import l.dq50;
import l.qib0;
import l.s7m;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cq50 implements s7m<zp50> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f8887a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f8888b;

    /* JADX INFO: renamed from: c */
    public VText f8889c;

    /* JADX INFO: renamed from: d */
    public VText f8890d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f8891e;

    /* JADX INFO: renamed from: f */
    public VText f8892f;

    /* JADX INFO: renamed from: g */
    public VText f8893g;

    /* JADX INFO: renamed from: h */
    public VText f8894h;

    /* JADX INFO: renamed from: i */
    public VText f8895i;

    /* JADX INFO: renamed from: j */
    public zp50 f8896j;

    /* JADX INFO: renamed from: k */
    public Act f8897k;

    public cq50(Act act) {
        this.f8897k = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m11318f(View view) {
        this.f8896j.m27479q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m11319i(View view) {
        this.f8896j.m27475m0("you have canceled");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11320C0() {
        return this.f8897k;
    }

    /* JADX INFO: renamed from: c */
    public View m11321c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dq50.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m11324i1(zp50 zp50Var) {
        this.f8896j = zp50Var;
    }

    /* JADX INFO: renamed from: e */
    public void m11323e(User user) {
        this.f8897k.setTitle("第三方授权");
        this.f8892f.setText(user.name);
        qib0.G.Q0(this.f8891e, user.fp().profileSmall());
        xdl0.E0(this.f8894h, new View.OnClickListener() { // from class: l.aq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7860a.m11318f(view);
            }
        });
        xdl0.E0(this.f8895i, new View.OnClickListener() { // from class: l.bq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8305a.m11319i(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11321c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m11325j(@NonNull OpenSDKInfo openSDKInfo) {
        if (!TextUtils.isEmpty(openSDKInfo.logo_url)) {
            qib0.G.N0(this.f8888b, openSDKInfo.logo_url, false);
        }
        this.f8889c.setText(String.format("%s申请使用", openSDKInfo.name));
        Scopes scopes = openSDKInfo.scopes;
        if (scopes == null || TextUtils.isEmpty(scopes.user_profile)) {
            return;
        }
        this.f8890d.setText("您的" + openSDKInfo.scopes.user_profile);
    }

    public void destroy() {
    }
}
