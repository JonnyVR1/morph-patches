package com.p051p1.mobile.putong.live.external.page.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VButton;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.iam;
import p153l.jyb;
import p153l.ldc0;
import p153l.xec0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveFollowPushSettingAct extends LiveBaseAct implements iam<C12744b> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f47005c;

    /* JADX INFO: renamed from: d */
    public VText f47006d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f47007e;

    /* JADX INFO: renamed from: f */
    public VRelative f47008f;

    /* JADX INFO: renamed from: g */
    public VButton f47009g;

    /* JADX INFO: renamed from: h */
    public C12744b f47010h;

    /* JADX INFO: renamed from: i */
    public final LiveBaseAdapter f47011i = new LiveBaseAdapter();

    /* JADX INFO: renamed from: j */
    public List<C12743a> f47012j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f47013k = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m71868a2(Bundle bundle) {
        m71870r();
        C12744b c12744b = new C12744b(this);
        this.f47010h = c12744b;
        c12744b.mo52715C(this);
        this.f47010h.m71954E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m71869d2(View view) {
        this.f47010h.m71955F2();
    }

    /* JADX INFO: renamed from: r */
    private void m71870r() {
        this.f47005c.setTitle(getString(R$string.f45707A));
        this.f47005c.setLeftIconAsBack(this);
        this.f47007e.setAdapter(this.f47011i);
        bnl0.m105509E0(this.f47009g, new View.OnClickListener() { // from class: l.ifs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114686a.m71869d2(view);
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C12744b c12744b) {
        this.f47010h = c12744b;
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m71872b2() {
        return this.f47013k;
    }

    /* JADX INFO: renamed from: c2 */
    public List<C12743a> m71873c2() {
        return this.f47012j;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public void m71874e2(List<LivePushNoticeItemBean> list) {
        this.f47012j.clear();
        ArrayList arrayList = new ArrayList();
        boolean zM147479J = jyb.m147479J(list);
        RecyclerView recyclerView = this.f47007e;
        if (zM147479J) {
            bnl0.m105525M0(recyclerView, false);
            bnl0.m105525M0(this.f47008f, true);
            bnl0.m105525M0(this.f47009g, false);
        } else {
            bnl0.m105525M0(recyclerView, true);
            bnl0.m105525M0(this.f47008f, false);
            bnl0.m105525M0(this.f47009g, true);
            this.f47013k = true;
            Iterator<LivePushNoticeItemBean> it = list.iterator();
            while (it.hasNext()) {
                C12743a c12743a = new C12743a(it.next());
                c12743a.m71941K(this.f47010h);
                this.f47012j.add(c12743a);
                arrayList.add(c12743a);
            }
        }
        this.f47011i.m68554Z(arrayList);
        m71878k2();
    }

    /* JADX INFO: renamed from: g2 */
    public void m71875g2() {
        bnl0.m105525M0(this.f47007e, false);
        bnl0.m105525M0(this.f47008f, true);
        bnl0.m105525M0(this.f47009g, false);
    }

    /* JADX INFO: renamed from: h2 */
    public void m71876h2() {
        bnl0.m105525M0(this.f47007e, false);
        bnl0.m105525M0(this.f47008f, false);
    }

    /* JADX INFO: renamed from: i2 */
    public void m71877i2(boolean z) {
        for (C12743a c12743a : this.f47012j) {
            c12743a.m71938H().setPushEnabled(z);
            this.f47011i.m68544P(c12743a, new C12743a.a(z));
        }
        this.f47013k = z;
        m71878k2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193888m, viewGroup, false);
        this.f47005c = (VNavigationBar) viewInflate.findViewById(ldc0.f131535c1);
        this.f47006d = (VText) viewInflate.findViewById(ldc0.f131586p0);
        this.f47007e = (RecyclerView) viewInflate.findViewById(ldc0.f131567k1);
        this.f47008f = (VRelative) viewInflate.findViewById(ldc0.f131550g0);
        this.f47009g = (VButton) viewInflate.findViewById(ldc0.f131621y);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.hfs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109342a.m71868a2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m71878k2() {
        if (jyb.m147479J(this.f47012j)) {
            return;
        }
        boolean z = this.f47013k;
        VButton vButton = this.f47009g;
        if (z) {
            vButton.setText(getString(R$string.f45785y));
        } else {
            vButton.setText(getString(R$string.f45787z));
        }
    }

    /* JADX INFO: renamed from: l2 */
    public void m71879l2(String str, boolean z) {
        for (C12743a c12743a : this.f47012j) {
            if (c12743a.m71938H().anchorId.equals(str)) {
                c12743a.m71938H().setPushEnabled(z);
                this.f47011i.m68544P(c12743a, new C12743a.a(z));
                return;
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_live_setting";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(true);
        super.preCreateView(bundle);
    }
}
