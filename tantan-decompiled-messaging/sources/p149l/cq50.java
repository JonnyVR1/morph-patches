package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OpenSDKInfo;
import com.p046p1.mobile.putong.data.Scopes;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cq50 implements s7m<zp50> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f82030a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f82031b;

    /* JADX INFO: renamed from: c */
    public VText f82032c;

    /* JADX INFO: renamed from: d */
    public VText f82033d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f82034e;

    /* JADX INFO: renamed from: f */
    public VText f82035f;

    /* JADX INFO: renamed from: g */
    public VText f82036g;

    /* JADX INFO: renamed from: h */
    public VText f82037h;

    /* JADX INFO: renamed from: i */
    public VText f82038i;

    /* JADX INFO: renamed from: j */
    public zp50 f82039j;

    /* JADX INFO: renamed from: k */
    public Act f82040k;

    public cq50(Act act) {
        this.f82040k = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m108227f(View view) {
        this.f82039j.m219623q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m108228i(View view) {
        this.f82039j.m219619m0("you have canceled");
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82040k;
    }

    /* JADX INFO: renamed from: c */
    public View m108229c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dq50.m112995b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zp50 zp50Var) {
        this.f82039j = zp50Var;
    }

    /* JADX INFO: renamed from: e */
    public void m108231e(User user) {
        this.f82040k.setTitle("第三方授权");
        this.f82035f.setText(user.name);
        qib0.f154691G.m102341Q0(this.f82034e, user.m60124fp().profileSmall());
        xdl0.m208329E0(this.f82037h, new View.OnClickListener() { // from class: l.aq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71132a.m108227f(view);
            }
        });
        xdl0.m208329E0(this.f82038i, new View.OnClickListener() { // from class: l.bq50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76754a.m108228i(view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m108229c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m108232j(@NonNull OpenSDKInfo openSDKInfo) {
        if (!TextUtils.isEmpty(openSDKInfo.logo_url)) {
            qib0.f154691G.m102335N0(this.f82031b, openSDKInfo.logo_url, false);
        }
        this.f82032c.setText(String.format("%s申请使用", openSDKInfo.name));
        Scopes scopes = openSDKInfo.scopes;
        if (scopes == null || TextUtils.isEmpty(scopes.user_profile)) {
            return;
        }
        this.f82033d.setText("您的" + openSDKInfo.scopes.user_profile);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
