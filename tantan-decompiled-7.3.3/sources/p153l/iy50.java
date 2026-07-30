package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OpenSDKInfo;
import com.p051p1.mobile.putong.data.Scopes;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iy50 implements iam<fy50> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f117512a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f117513b;

    /* JADX INFO: renamed from: c */
    public VText f117514c;

    /* JADX INFO: renamed from: d */
    public VText f117515d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f117516e;

    /* JADX INFO: renamed from: f */
    public VText f117517f;

    /* JADX INFO: renamed from: g */
    public VText f117518g;

    /* JADX INFO: renamed from: h */
    public VText f117519h;

    /* JADX INFO: renamed from: i */
    public VText f117520i;

    /* JADX INFO: renamed from: j */
    public fy50 f117521j;

    /* JADX INFO: renamed from: k */
    public Act f117522k;

    public iy50(Act act) {
        this.f117522k = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m142612f(View view) {
        this.f117521j.m128068q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m142613i(View view) {
        this.f117521j.m128064m0("you have canceled");
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f117522k;
    }

    /* JADX INFO: renamed from: c */
    public View m142614c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jy50.m147469b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fy50 fy50Var) {
        this.f117521j = fy50Var;
    }

    /* JADX INFO: renamed from: e */
    public void m142616e(User user) {
        this.f117522k.setTitle("第三方授权");
        this.f117517f.setText(user.name);
        uqb0.f180374G.m127125Q0(this.f117516e, user.m61308fp().profileSmall());
        bnl0.m105509E0(this.f117519h, new View.OnClickListener() { // from class: l.gy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107030a.m142612f(view);
            }
        });
        bnl0.m105509E0(this.f117520i, new View.OnClickListener() { // from class: l.hy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112099a.m142613i(view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m142614c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m142617j(@NonNull OpenSDKInfo openSDKInfo) {
        if (!TextUtils.isEmpty(openSDKInfo.logo_url)) {
            uqb0.f180374G.m127119N0(this.f117513b, openSDKInfo.logo_url, false);
        }
        this.f117514c.setText(String.format("%s申请使用", openSDKInfo.name));
        Scopes scopes = openSDKInfo.scopes;
        if (scopes == null || TextUtils.isEmpty(scopes.user_profile)) {
            return;
        }
        this.f117515d.setText("您的" + openSDKInfo.scopes.user_profile);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
