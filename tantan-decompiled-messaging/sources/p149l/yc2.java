package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.account.BanDetailAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class yc2 implements s7m<wc2> {

    /* JADX INFO: renamed from: a */
    public VText f197400a;

    /* JADX INFO: renamed from: b */
    public VText f197401b;

    /* JADX INFO: renamed from: c */
    public VText f197402c;

    /* JADX INFO: renamed from: d */
    public View f197403d;

    /* JADX INFO: renamed from: e */
    public VButton f197404e;

    /* JADX INFO: renamed from: f */
    public View f197405f;

    /* JADX INFO: renamed from: g */
    public BanDetailAct f197406g;

    /* JADX INFO: renamed from: h */
    public wc2 f197407h;

    public yc2(BanDetailAct banDetailAct) {
        this.f197406g = banDetailAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197406g;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f197406g;
    }

    /* JADX INFO: renamed from: b */
    public View m213999b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zc2.m218011b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wc2 wc2Var) {
        this.f197407h = wc2Var;
    }

    /* JADX INFO: renamed from: d */
    public void m214001d() {
        this.f197407h.m202595i0(true);
        xdl0.m208329E0(this.f197404e, new View.OnClickListener() { // from class: l.xc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192178a.m214002e(view);
            }
        });
        this.f197401b.setText("1、" + this.f197406g.getString(R$string.f27947w) + "\n2、" + this.f197406g.getString(R$string.f27953x) + "\n3、" + this.f197406g.getString(R$string.f27959y) + "\n4、" + this.f197406g.getString(R$string.f27965z) + "\n5、" + this.f197406g.getString(R$string.f27680A) + "\n6、" + this.f197406g.getString(R$string.f27686B) + "\n7、" + this.f197406g.getString(R$string.f27692C) + "\n8、" + this.f197406g.getString(R$string.f27698D) + SignParameters.NEW_LINE);
        this.f197402c.setText(this.f197406g.getString(R$string.f27704E));
        VText vText = this.f197402c;
        vText.setTypeface(vText.getTypeface(), 1);
        VText vText2 = this.f197400a;
        vText2.setTypeface(vText2.getTypeface(), 1);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m214002e(View view) {
        zvf0.m220399u("e_ban_detail", this.f197406g.pageId(), vwb.m200311Y("ban_detail_button", "appeal"));
        this.f197407h.m202595i0(false);
    }

    /* JADX INFO: renamed from: f */
    public void m214003f() {
        xdl0.m208344M(this.f197403d, true);
        xdl0.m208344M(this.f197404e, true);
        xdl0.m208344M(this.f197405f, true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m213999b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
