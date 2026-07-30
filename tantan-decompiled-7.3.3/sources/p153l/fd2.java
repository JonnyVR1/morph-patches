package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.account.BanDetailAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class fd2 implements iam<dd2> {

    /* JADX INFO: renamed from: a */
    public VText f98308a;

    /* JADX INFO: renamed from: b */
    public VText f98309b;

    /* JADX INFO: renamed from: c */
    public VText f98310c;

    /* JADX INFO: renamed from: d */
    public View f98311d;

    /* JADX INFO: renamed from: e */
    public VButton f98312e;

    /* JADX INFO: renamed from: f */
    public View f98313f;

    /* JADX INFO: renamed from: g */
    public BanDetailAct f98314g;

    /* JADX INFO: renamed from: h */
    public dd2 f98315h;

    public fd2(BanDetailAct banDetailAct) {
        this.f98314g = banDetailAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f98314g;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f98314g;
    }

    /* JADX INFO: renamed from: b */
    public View m125077b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gd2.m129915b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dd2 dd2Var) {
        this.f98315h = dd2Var;
    }

    /* JADX INFO: renamed from: d */
    public void m125079d() {
        this.f98315h.m115324i0(true);
        bnl0.m105509E0(this.f98312e, new View.OnClickListener() { // from class: l.ed2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93135a.m125080e(view);
            }
        });
        this.f98309b.setText("1、" + this.f98314g.getString(R$string.f28795w) + "\n2、" + this.f98314g.getString(R$string.f28801x) + "\n3、" + this.f98314g.getString(R$string.f28807y) + "\n4、" + this.f98314g.getString(R$string.f28813z) + "\n5、" + this.f98314g.getString(R$string.f28528A) + "\n6、" + this.f98314g.getString(R$string.f28534B) + "\n7、" + this.f98314g.getString(R$string.f28540C) + "\n8、" + this.f98314g.getString(R$string.f28546D) + SignParameters.NEW_LINE);
        this.f98310c.setText(this.f98314g.getString(R$string.f28552E));
        VText vText = this.f98310c;
        vText.setTypeface(vText.getTypeface(), 1);
        VText vText2 = this.f98308a;
        vText2.setTypeface(vText2.getTypeface(), 1);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m125080e(View view) {
        i4g0.m138523u("e_ban_detail", this.f98314g.pageId(), jyb.m147494Y("ban_detail_button", "appeal"));
        this.f98315h.m115324i0(false);
    }

    /* JADX INFO: renamed from: f */
    public void m125081f() {
        bnl0.m105524M(this.f98311d, true);
        bnl0.m105524M(this.f98312e, true);
        bnl0.m105524M(this.f98313f, true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m125077b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
