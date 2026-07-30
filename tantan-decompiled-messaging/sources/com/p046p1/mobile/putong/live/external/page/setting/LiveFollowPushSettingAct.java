package com.p046p1.mobile.putong.live.external.page.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VButton;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.e30;
import p149l.f5c0;
import p149l.s6c0;
import p149l.s7m;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveFollowPushSettingAct extends LiveBaseAct implements s7m<C12581b> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f46157c;

    /* JADX INFO: renamed from: d */
    public VText f46158d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f46159e;

    /* JADX INFO: renamed from: f */
    public VRelative f46160f;

    /* JADX INFO: renamed from: g */
    public VButton f46161g;

    /* JADX INFO: renamed from: h */
    public C12581b f46162h;

    /* JADX INFO: renamed from: i */
    public final LiveBaseAdapter f46163i = new LiveBaseAdapter();

    /* JADX INFO: renamed from: j */
    public List<C12580a> f46164j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f46165k = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m70685Z1(Bundle bundle) {
        m70687r();
        C12581b c12581b = new C12581b(this);
        this.f46162h = c12581b;
        c12581b.mo51532C(this);
        this.f46162h.m70771E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m70686c2(View view) {
        this.f46162h.m70772F2();
    }

    /* JADX INFO: renamed from: r */
    private void m70687r() {
        this.f46157c.setTitle(getString(R$string.f44859A));
        this.f46157c.setLeftIconAsBack(this);
        this.f46159e.setAdapter(this.f46163i);
        xdl0.m208329E0(this.f46161g, new View.OnClickListener() { // from class: l.hds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107291a.m70686c2(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C12581b c12581b) {
        this.f46162h = c12581b;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m70689a2() {
        return this.f46165k;
    }

    /* JADX INFO: renamed from: b2 */
    public List<C12580a> m70690b2() {
        return this.f46164j;
    }

    /* JADX INFO: renamed from: d2 */
    public void m70691d2(List<LivePushNoticeItemBean> list) {
        this.f46164j.clear();
        ArrayList arrayList = new ArrayList();
        boolean zM200296J = vwb.m200296J(list);
        RecyclerView recyclerView = this.f46159e;
        if (zM200296J) {
            xdl0.m208345M0(recyclerView, false);
            xdl0.m208345M0(this.f46160f, true);
            xdl0.m208345M0(this.f46161g, false);
        } else {
            xdl0.m208345M0(recyclerView, true);
            xdl0.m208345M0(this.f46160f, false);
            xdl0.m208345M0(this.f46161g, true);
            this.f46165k = true;
            Iterator<LivePushNoticeItemBean> it = list.iterator();
            while (it.hasNext()) {
                C12580a c12580a = new C12580a(it.next());
                c12580a.m70758K(this.f46162h);
                this.f46164j.add(c12580a);
                arrayList.add(c12580a);
            }
        }
        this.f46163i.m67371Z(arrayList);
        m70695i2();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e2 */
    public void m70692e2() {
        xdl0.m208345M0(this.f46159e, false);
        xdl0.m208345M0(this.f46160f, true);
        xdl0.m208345M0(this.f46161g, false);
    }

    /* JADX INFO: renamed from: g2 */
    public void m70693g2() {
        xdl0.m208345M0(this.f46159e, false);
        xdl0.m208345M0(this.f46160f, false);
    }

    /* JADX INFO: renamed from: h2 */
    public void m70694h2(boolean z) {
        for (C12580a c12580a : this.f46164j) {
            c12580a.m70755H().setPushEnabled(z);
            this.f46163i.m67361P(c12580a, new C12580a.a(z));
        }
        this.f46165k = z;
        m70695i2();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m70695i2() {
        if (vwb.m200296J(this.f46164j)) {
            return;
        }
        boolean z = this.f46165k;
        VButton vButton = this.f46161g;
        if (z) {
            vButton.setText(getString(R$string.f44937y));
        } else {
            vButton.setText(getString(R$string.f44939z));
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162774m, viewGroup, false);
        this.f46157c = (VNavigationBar) viewInflate.findViewById(f5c0.f95078c1);
        this.f46158d = (VText) viewInflate.findViewById(f5c0.f95129p0);
        this.f46159e = (RecyclerView) viewInflate.findViewById(f5c0.f95110k1);
        this.f46160f = (VRelative) viewInflate.findViewById(f5c0.f95093g0);
        this.f46161g = (VButton) viewInflate.findViewById(f5c0.f95164y);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.gds
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102131a.m70685Z1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public void m70696k2(String str, boolean z) {
        for (C12580a c12580a : this.f46164j) {
            if (c12580a.m70755H().anchorId.equals(str)) {
                c12580a.m70755H().setPushEnabled(z);
                this.f46163i.m67361P(c12580a, new C12580a.a(z));
                return;
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_live_setting";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(true);
        super.preCreateView(bundle);
    }
}
