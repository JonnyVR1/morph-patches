package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.model.LiveFansClubRedPacketModel;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import java.util.ArrayList;
import l.e30;
import l.j80;
import l.lsi0;
import l.mcr;
import l.s7m;
import l.vwb;
import l.xdl0;
import p002l.abg;
import p002l.sbs;
import p002l.skc0;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubRedPacketPanel extends LinearLayout implements s7m<abg> {

    /* JADX INFO: renamed from: a */
    public View f5178a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f5179b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f5180c;

    /* JADX INFO: renamed from: d */
    public VImage f5181d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f5182e;

    /* JADX INFO: renamed from: f */
    public VText f5183f;

    /* JADX INFO: renamed from: g */
    public abg f5184g;

    /* JADX INFO: renamed from: h */
    public LiveBaseAdapter f5185h;

    /* JADX INFO: renamed from: i */
    public LiveFansClubRedPacketModel f5186i;

    public LiveFansClubRedPacketPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5185h = new LiveBaseAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m6499i(View view) {
        this.f5184g.m9485X3();
    }

    private void init() {
        this.f5182e.setAdapter(this.f5185h);
        this.f5182e.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f5182e.setItemAnimator((RecyclerView.l) null);
        xdl0.E0(this.f5178a, new View.OnClickListener() { // from class: l.obs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16510a.m6499i(view);
            }
        });
        xdl0.E0(this.f5181d, new View.OnClickListener() { // from class: l.pbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17181a.m6500j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m6500j(View view) {
        this.f5184g.m9485X3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6501C0() {
        return getContext();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m6502e(View view) {
        sbs.m22351a(this, view);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m6504i1(abg abgVar) {
        this.f5184g = abgVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6505k(skc0 skc0Var, View view) {
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = skc0Var.f19062a;
        if (bLiveFanBaseRedPacketInfo.isAnchor) {
            lsi0.j(bLiveFanBaseRedPacketInfo.anchorContent);
            return;
        }
        this.f5186i.m6359K(LiveFansClubRedPacketModel.RedPacketState.GRABBING);
        this.f5185h.O(this.f5186i);
        this.f5184g.m9483V3(skc0Var.f19062a.token);
    }

    /* JADX INFO: renamed from: l */
    public void m6506l(final skc0 skc0Var, mcr mcrVar) {
        xdl0.M(this.f5182e, true);
        xdl0.M(this.f5183f, false);
        final ArrayList arrayList = new ArrayList();
        final j80 j80Var = new j80(this.f5185h, mcrVar);
        LiveFansClubRedPacketModel liveFansClubRedPacketModel = new LiveFansClubRedPacketModel(skc0Var.f19062a, j80Var);
        this.f5186i = liveFansClubRedPacketModel;
        liveFansClubRedPacketModel.m6358J(new View.OnClickListener() { // from class: l.qbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17892a.m6505k(skc0Var, view);
            }
        });
        arrayList.add(this.f5186i);
        vwb.z(skc0Var.f19063b, new e30() { // from class: l.rbs
            public final void call(Object obj) {
                arrayList.add(new lbs((skc0.C0818a) obj, j80Var));
            }
        });
        this.f5185h.Z(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public void m6507m() {
        xdl0.M(this.f5182e, false);
        xdl0.M(this.f5183f, false);
    }

    /* JADX INFO: renamed from: n */
    public void m6508n() {
        this.f5186i.m6359K(LiveFansClubRedPacketModel.RedPacketState.EXPIRE);
        this.f5185h.O(this.f5186i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6502e(this);
        init();
    }

    /* JADX INFO: renamed from: p */
    public void m6509p() {
        xdl0.M(this.f5182e, false);
        xdl0.M(this.f5183f, true);
    }

    /* JADX INFO: renamed from: q */
    public void m6510q() {
        this.f5186i.m6359K(LiveFansClubRedPacketModel.RedPacketState.NOT_ENOUGH);
        this.f5185h.O(this.f5186i);
    }
}
