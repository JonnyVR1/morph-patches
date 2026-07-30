package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.model.LiveFansClubRedPacketModel;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.abg;
import p149l.e30;
import p149l.j80;
import p149l.lsi0;
import p149l.mcr;
import p149l.s7m;
import p149l.sbs;
import p149l.skc0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketPanel extends LinearLayout implements s7m<abg> {

    /* JADX INFO: renamed from: a */
    public View f49136a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f49137b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f49138c;

    /* JADX INFO: renamed from: d */
    public VImage f49139d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f49140e;

    /* JADX INFO: renamed from: f */
    public VText f49141f;

    /* JADX INFO: renamed from: g */
    public abg f49142g;

    /* JADX INFO: renamed from: h */
    public LiveBaseAdapter f49143h;

    /* JADX INFO: renamed from: i */
    public LiveFansClubRedPacketModel f49144i;

    public LiveFansClubRedPacketPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49143h = new LiveBaseAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m72978i(View view) {
        this.f49142g.m95606X3();
    }

    private void init() {
        this.f49140e.setAdapter(this.f49143h);
        this.f49140e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f49140e.setItemAnimator(null);
        xdl0.m208329E0(this.f49136a, new View.OnClickListener() { // from class: l.obs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142972a.m72978i(view);
            }
        });
        xdl0.m208329E0(this.f49139d, new View.OnClickListener() { // from class: l.pbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148108a.m72979j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m72979j(View view) {
        this.f49142g.m95606X3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m72980e(View view) {
        sbs.m183264a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(abg abgVar) {
        this.f49142g = abgVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m72982k(skc0 skc0Var, View view) {
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = skc0Var.f164951a;
        if (bLiveFanBaseRedPacketInfo.isAnchor) {
            lsi0.m151580j(bLiveFanBaseRedPacketInfo.anchorContent);
            return;
        }
        this.f49144i.m72842K(LiveFansClubRedPacketModel.RedPacketState.GRABBING);
        this.f49143h.m67360O(this.f49144i);
        this.f49142g.m95604V3(skc0Var.f164951a.token);
    }

    /* JADX INFO: renamed from: l */
    public void m72983l(final skc0 skc0Var, mcr mcrVar) {
        xdl0.m208344M(this.f49140e, true);
        xdl0.m208344M(this.f49141f, false);
        final ArrayList arrayList = new ArrayList();
        final j80 j80Var = new j80(this.f49143h, mcrVar);
        LiveFansClubRedPacketModel liveFansClubRedPacketModel = new LiveFansClubRedPacketModel(skc0Var.f164951a, j80Var);
        this.f49144i = liveFansClubRedPacketModel;
        liveFansClubRedPacketModel.m72841J(new View.OnClickListener() { // from class: l.qbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153694a.m72982k(skc0Var, view);
            }
        });
        arrayList.add(this.f49144i);
        vwb.m200354z(skc0Var.f164952b, new e30() { // from class: l.rbs
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add(new lbs((skc0.C19970a) obj, j80Var));
            }
        });
        this.f49143h.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public void m72984m() {
        xdl0.m208344M(this.f49140e, false);
        xdl0.m208344M(this.f49141f, false);
    }

    /* JADX INFO: renamed from: n */
    public void m72985n() {
        this.f49144i.m72842K(LiveFansClubRedPacketModel.RedPacketState.EXPIRE);
        this.f49143h.m67360O(this.f49144i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72980e(this);
        init();
    }

    /* JADX INFO: renamed from: p */
    public void m72986p() {
        xdl0.m208344M(this.f49140e, false);
        xdl0.m208344M(this.f49141f, true);
    }

    /* JADX INFO: renamed from: q */
    public void m72987q() {
        this.f49144i.m72842K(LiveFansClubRedPacketModel.RedPacketState.NOT_ENOUGH);
        this.f49143h.m67360O(this.f49144i);
    }
}
