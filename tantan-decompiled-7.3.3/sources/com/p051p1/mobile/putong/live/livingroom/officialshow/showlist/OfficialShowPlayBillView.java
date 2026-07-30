package com.p051p1.mobile.putong.live.livingroom.officialshow.showlist;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C0604h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.d3q;
import p153l.ee50;
import p153l.i4g0;
import p153l.iam;
import p153l.izs;
import p153l.jyb;
import p153l.obc0;
import p153l.pe50;
import p153l.pf60;
import p153l.qa00;
import p153l.ue50;
import p153l.y20;
import p153l.zc50;
import p153l.zeu;

/* JADX INFO: loaded from: classes5.dex */
public class OfficialShowPlayBillView extends FrameLayout implements iam<pe50> {

    /* JADX INFO: renamed from: a */
    public TextView f51981a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f51982b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51983c;

    /* JADX INFO: renamed from: d */
    public LiveMainlandTagView f51984d;

    /* JADX INFO: renamed from: e */
    public TextView f51985e;

    /* JADX INFO: renamed from: f */
    public TextView f51986f;

    /* JADX INFO: renamed from: g */
    public TextView f51987g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f51988h;

    /* JADX INFO: renamed from: i */
    public zc50 f51989i;

    /* JADX INFO: renamed from: j */
    public LiveBaseAdapter f51990j;

    /* JADX INFO: renamed from: k */
    public boolean f51991k;

    /* JADX INFO: renamed from: l */
    public pe50 f51992l;

    public OfficialShowPlayBillView(@NonNull Context context) {
        super(context);
        this.f51991k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m76592k(View view) {
        m76595i();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m76593e(View view) {
        ue50.m195656a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pe50 pe50Var) {
        this.f51992l = pe50Var;
        this.f51990j = new LiveBaseAdapter();
        this.f51988h.setLayoutManager(new LinearLayoutManager(pe50Var.act()));
        this.f51988h.setAdapter(this.f51990j);
        C0604h c0604h = new C0604h(pe50Var.act(), 1);
        c0604h.m3706h(pe50Var.act().drawable(obc0.f146462q4));
        this.f51988h.addItemDecoration(c0604h);
    }

    public zc50 getInfo() {
        return this.f51989i;
    }

    /* JADX INFO: renamed from: i */
    public final void m76595i() {
        boolean z = this.f51991k;
        this.f51991k = !z;
        RecyclerView recyclerView = this.f51988h;
        if (z) {
            bnl0.m105524M(recyclerView, false);
            bnl0.m105524M(this.f51982b, true);
            this.f51981a.setCompoundDrawablesWithIntrinsicBounds(0, 0, obc0.f146438o4, 0);
        } else {
            bnl0.m105524M(recyclerView, true);
            bnl0.m105524M(this.f51982b, false);
            this.f51981a.setCompoundDrawablesWithIntrinsicBounds(0, 0, obc0.f146426n4, 0);
        }
        i4g0.m138523u(zeu.f204074a, this.f51992l.mo78457R2(), pf60.m172085a("click_type", this.f51991k ? "open" : "close"));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m76596j() {
        if (this.f51991k) {
            m76595i();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m76597l(BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        this.f51992l.m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1400).userId(bLiveOfficialShowListItem.anchorId).setFromIdentity("audience").setTo("audience").setScene("live").setSource("anchor").trackFrom("live").build());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76598m(List list, BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        list.add(new ee50(this.f51992l, bLiveOfficialShowListItem));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m76599n(BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        pe50 pe50Var = this.f51992l;
        if (pe50Var != null) {
            pe50Var.m171931R3(bLiveOfficialShowListItem.anchorId);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76593e(this);
        this.f51984d.m69931c(-1, -1);
        this.f51981a.setCompoundDrawablesWithIntrinsicBounds(0, 0, obc0.f146426n4, 0);
        bnl0.m105509E0(this.f51981a, new View.OnClickListener() { // from class: l.qe50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156795a.m76592k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m76600p(zc50 zc50Var, boolean z) {
        this.f51989i = zc50Var;
        if (zc50Var == null) {
            bnl0.m105524M(this, false);
            return;
        }
        this.f51984d.m69932d(qa00.m175859d(17.0f), qa00.m175859d(15.0f));
        ViewGroup.LayoutParams layoutParams = this.f51988h.getLayoutParams();
        if (jyb.m147479J(zc50Var.m219234b())) {
            this.f51990j.m68554Z(jyb.m147507f0(new d3q[0]));
            layoutParams.height = bnl0.f77545f;
            bnl0.m105524M(this, false);
        } else {
            bnl0.m105524M(this, true);
            final BLiveOfficialShowListItem bLiveOfficialShowListItem = zc50Var.m219234b().get(0);
            izs.m142864o("context_single_room", this.f51983c, bLiveOfficialShowListItem.anchorAvatar);
            this.f51985e.setText(bLiveOfficialShowListItem.anchorName);
            this.f51986f.setText(bLiveOfficialShowListItem.desc);
            bnl0.m105524M(this.f51984d, bLiveOfficialShowListItem.isOnlive);
            bnl0.m105509E0(this.f51983c, new View.OnClickListener() { // from class: l.re50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162397a.m76597l(bLiveOfficialShowListItem, view);
                }
            });
            final ArrayList arrayList = new ArrayList();
            jyb.m147537z(zc50Var.m219234b(), new y20() { // from class: l.se50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167487a.m76598m(arrayList, (BLiveOfficialShowListItem) obj);
                }
            });
            this.f51990j.m68554Z(arrayList);
            layoutParams.height = zc50Var.m219234b().size() >= 6 ? qa00.m175859d(460.0f) : bnl0.f77545f;
            bnl0.m105524M(this.f51987g, true ^ bLiveOfficialShowListItem.isFollowed);
            bnl0.m105509E0(this.f51987g, new View.OnClickListener() { // from class: l.te50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f173441a.m76599n(bLiveOfficialShowListItem, view);
                }
            });
        }
        this.f51988h.setLayoutParams(layoutParams);
        if (z) {
            return;
        }
        i4g0.m138526x(zeu.f204074a, this.f51992l.mo78457R2());
    }

    /* JADX INFO: renamed from: q */
    public void m76601q(String str) {
        zc50 zc50Var = this.f51989i;
        if (zc50Var == null || jyb.m147479J(zc50Var.m219234b())) {
            return;
        }
        boolean z = false;
        for (BLiveOfficialShowListItem bLiveOfficialShowListItem : this.f51989i.m219234b()) {
            if (TextUtils.equals(bLiveOfficialShowListItem.anchorId, str)) {
                bLiveOfficialShowListItem.isFollowed = true;
                z = true;
            }
        }
        if (z) {
            m76600p(this.f51989i, true);
        }
    }

    public OfficialShowPlayBillView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51991k = true;
    }

    public OfficialShowPlayBillView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51991k = true;
    }
}
