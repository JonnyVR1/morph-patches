package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.model.LiveFansClubRedPacketModel;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.f80;
import p153l.iam;
import p153l.jyb;
import p153l.ner;
import p153l.o1j0;
import p153l.ocg;
import p153l.tds;
import p153l.y20;
import p153l.zsc0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketPanel extends LinearLayout implements iam<ocg> {

    /* JADX INFO: renamed from: a */
    public View f49984a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f49985b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f49986c;

    /* JADX INFO: renamed from: d */
    public VImage f49987d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f49988e;

    /* JADX INFO: renamed from: f */
    public VText f49989f;

    /* JADX INFO: renamed from: g */
    public ocg f49990g;

    /* JADX INFO: renamed from: h */
    public LiveBaseAdapter f49991h;

    /* JADX INFO: renamed from: i */
    public LiveFansClubRedPacketModel f49992i;

    public LiveFansClubRedPacketPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49991h = new LiveBaseAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m74161i(View view) {
        this.f49990g.m167205X3();
    }

    private void init() {
        this.f49988e.setAdapter(this.f49991h);
        this.f49988e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f49988e.setItemAnimator(null);
        bnl0.m105509E0(this.f49984a, new View.OnClickListener() { // from class: l.pds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151828a.m74161i(view);
            }
        });
        bnl0.m105509E0(this.f49987d, new View.OnClickListener() { // from class: l.qds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156763a.m74162j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m74162j(View view) {
        this.f49990g.m167205X3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m74163e(View view) {
        tds.m190641a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ocg ocgVar) {
        this.f49990g = ocgVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m74165k(zsc0 zsc0Var, View view) {
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = zsc0Var.f205862a;
        if (bLiveFanBaseRedPacketInfo.isAnchor) {
            o1j0.m165636j(bLiveFanBaseRedPacketInfo.anchorContent);
            return;
        }
        this.f49992i.m74025K(LiveFansClubRedPacketModel.RedPacketState.GRABBING);
        this.f49991h.m68543O(this.f49992i);
        this.f49990g.m167203V3(zsc0Var.f205862a.token);
    }

    /* JADX INFO: renamed from: l */
    public void m74166l(final zsc0 zsc0Var, ner nerVar) {
        bnl0.m105524M(this.f49988e, true);
        bnl0.m105524M(this.f49989f, false);
        final ArrayList arrayList = new ArrayList();
        final f80 f80Var = new f80(this.f49991h, nerVar);
        LiveFansClubRedPacketModel liveFansClubRedPacketModel = new LiveFansClubRedPacketModel(zsc0Var.f205862a, f80Var);
        this.f49992i = liveFansClubRedPacketModel;
        liveFansClubRedPacketModel.m74024J(new View.OnClickListener() { // from class: l.rds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162356a.m74165k(zsc0Var, view);
            }
        });
        arrayList.add(this.f49992i);
        jyb.m147537z(zsc0Var.f205863b, new y20() { // from class: l.sds
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add(new mds((zsc0.C21884a) obj, f80Var));
            }
        });
        this.f49991h.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public void m74167m() {
        bnl0.m105524M(this.f49988e, false);
        bnl0.m105524M(this.f49989f, false);
    }

    /* JADX INFO: renamed from: n */
    public void m74168n() {
        this.f49992i.m74025K(LiveFansClubRedPacketModel.RedPacketState.EXPIRE);
        this.f49991h.m68543O(this.f49992i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74163e(this);
        init();
    }

    /* JADX INFO: renamed from: p */
    public void m74169p() {
        bnl0.m105524M(this.f49988e, false);
        bnl0.m105524M(this.f49989f, true);
    }

    /* JADX INFO: renamed from: q */
    public void m74170q() {
        this.f49992i.m74025K(LiveFansClubRedPacketModel.RedPacketState.NOT_ENOUGH);
        this.f49991h.m68543O(this.f49992i);
    }
}
