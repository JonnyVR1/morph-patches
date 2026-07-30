package com.p051p1.mobile.putong.live.livingroom.officialshow.avatar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p151v.VLinear;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.dc50;
import p153l.iam;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.vxr;
import p153l.yb50;
import p153l.ynp0;

/* JADX INFO: loaded from: classes5.dex */
public class OfficialShowAvatarView extends FrameLayout implements iam<yb50> {

    /* JADX INFO: renamed from: a */
    public OfficialShowAvatarView f51949a;

    /* JADX INFO: renamed from: b */
    public VLinear f51950b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f51951c;

    /* JADX INFO: renamed from: d */
    public VText f51952d;

    /* JADX INFO: renamed from: e */
    public VText f51953e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f51954f;

    /* JADX INFO: renamed from: g */
    public VText f51955g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f51956h;

    /* JADX INFO: renamed from: i */
    public yb50 f51957i;

    /* JADX INFO: renamed from: j */
    public int f51958j;

    public OfficialShowAvatarView(Context context) {
        super(context);
        this.f51958j = qa00.m175859d(44.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m76567i(View view) {
        this.f51957i.m215013f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m76568j(View view) {
        this.f51957i.m215012e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m76569k(View view) {
        this.f51957i.m215012e4();
    }

    /* JADX INFO: renamed from: r */
    private void m76570r() {
        bnl0.m105524M(this.f51952d, false);
        bnl0.m105524M(this.f51953e, false);
        this.f51958j = ynp0.m216942s(12, (String) getContext().getText(R$string.f47475D4)) + qa00.m175859d(16.0f);
        bnl0.m105509E0(this.f51955g, new View.OnClickListener() { // from class: l.zb50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203623a.m76567i(view);
            }
        });
        bnl0.m105509E0(this.f51951c, new View.OnClickListener() { // from class: l.ac50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69677a.m76568j(view);
            }
        });
        bnl0.m105509E0(this.f51956h, new View.OnClickListener() { // from class: l.bc50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76101a.m76569k(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        m76575n();
    }

    /* JADX INFO: renamed from: e */
    public final void m76571e(View view) {
        dc50.m115216a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yb50 yb50Var) {
        this.f51957i = yb50Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m76573l(boolean z) {
        if (!z || !vxr.m203876d().m170970D0()) {
            bnl0.m105525M0(this.f51955g, false);
            this.f51950b.setBackgroundResource(obc0.f146110M0);
            bnl0.m105507D0(bnl0.m105587w(126.0f), this.f51950b);
            return;
        }
        this.f51955g.setText("订阅");
        bnl0.m105525M0(this.f51955g, true);
        bnl0.m105507D0(this.f51958j, this.f51955g);
        this.f51954f.setBackground(null);
        this.f51957i.m215015h4(null);
        this.f51950b.setBackgroundResource(obc0.f146098L0);
        bnl0.m105507D0(bnl0.m105587w(170.0f), this.f51950b);
    }

    /* JADX INFO: renamed from: m */
    public void m76574m(boolean z) {
        bnl0.m105525M0((View) getParent(), z);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public void m76575n() {
        this.f51952d.setText("");
        this.f51953e.setText("");
        bnl0.m105524M(this.f51955g, false);
        this.f51956h.m73302i0();
        this.f51950b.setBackgroundResource(obc0.f146110M0);
        bnl0.m105507D0(bnl0.m105587w(126.0f), this.f51950b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76571e(this);
        m76570r();
    }

    /* JADX INFO: renamed from: p */
    public void m76576p(User user, BLiveUserMask bLiveUserMask) {
        biv.m104517b(this.f51956h, qa00.m175859d(53.0f), nsv.m164636f(user).m164641e(bLiveUserMask), new qcj() { // from class: l.cc50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().url;
            }
        });
        this.f51952d.setText(user.name);
        bnl0.m105524M(this.f51952d, true);
        int length = user.description.length();
        String strConcat = user.description;
        if (length > 6) {
            strConcat = strConcat.substring(0, 6).concat("...");
        }
        this.f51953e.setText(strConcat);
        bnl0.m105524M(this.f51953e, true);
    }

    public OfficialShowAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51958j = qa00.m175859d(44.0f);
    }

    public OfficialShowAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51958j = qa00.m175859d(44.0f);
    }
}
