package com.p046p1.mobile.putong.live.livingroom.officialshow.showlist;

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
import androidx.recyclerview.widget.C0602h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.a650;
import p149l.d1q;
import p149l.e30;
import p149l.f650;
import p149l.hxs;
import p149l.i3c0;
import p149l.j760;
import p149l.k450;
import p149l.p550;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.ycu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class OfficialShowPlayBillView extends FrameLayout implements s7m<a650> {

    /* JADX INFO: renamed from: a */
    public TextView f51133a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f51134b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f51135c;

    /* JADX INFO: renamed from: d */
    public LiveMainlandTagView f51136d;

    /* JADX INFO: renamed from: e */
    public TextView f51137e;

    /* JADX INFO: renamed from: f */
    public TextView f51138f;

    /* JADX INFO: renamed from: g */
    public TextView f51139g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f51140h;

    /* JADX INFO: renamed from: i */
    public k450 f51141i;

    /* JADX INFO: renamed from: j */
    public LiveBaseAdapter f51142j;

    /* JADX INFO: renamed from: k */
    public boolean f51143k;

    /* JADX INFO: renamed from: l */
    public a650 f51144l;

    public OfficialShowPlayBillView(@NonNull Context context) {
        super(context);
        this.f51143k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m75409k(View view) {
        m75412i();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m75410e(View view) {
        f650.m119582a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a650 a650Var) {
        this.f51144l = a650Var;
        this.f51142j = new LiveBaseAdapter();
        this.f51140h.setLayoutManager(new LinearLayoutManager(a650Var.act()));
        this.f51140h.setAdapter(this.f51142j);
        C0602h c0602h = new C0602h(a650Var.act(), 1);
        c0602h.m3705h(a650Var.act().drawable(i3c0.f111134q4));
        this.f51140h.addItemDecoration(c0602h);
    }

    public k450 getInfo() {
        return this.f51141i;
    }

    /* JADX INFO: renamed from: i */
    public final void m75412i() {
        boolean z = this.f51143k;
        this.f51143k = !z;
        RecyclerView recyclerView = this.f51140h;
        if (z) {
            xdl0.m208344M(recyclerView, false);
            xdl0.m208344M(this.f51134b, true);
            this.f51133a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f111110o4, 0);
        } else {
            xdl0.m208344M(recyclerView, true);
            xdl0.m208344M(this.f51134b, false);
            this.f51133a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f111098n4, 0);
        }
        zvf0.m220399u(ycu.f197483a, this.f51144l.mo77274R2(), j760.m140076a("click_type", this.f51143k ? "open" : "close"));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m75413j() {
        if (this.f51143k) {
            m75412i();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m75414l(BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        this.f51144l.m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1400).userId(bLiveOfficialShowListItem.anchorId).setFromIdentity("audience").setTo("audience").setScene("live").setSource("anchor").trackFrom("live").build());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75415m(List list, BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        list.add(new p550(this.f51144l, bLiveOfficialShowListItem));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75416n(BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        a650 a650Var = this.f51144l;
        if (a650Var != null) {
            a650Var.m95119R3(bLiveOfficialShowListItem.anchorId);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75410e(this);
        this.f51136d.m68748c(-1, -1);
        this.f51133a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f111098n4, 0);
        xdl0.m208329E0(this.f51133a, new View.OnClickListener() { // from class: l.b650
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73744a.m75409k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m75417p(k450 k450Var, boolean z) {
        this.f51141i = k450Var;
        if (k450Var == null) {
            xdl0.m208344M(this, false);
            return;
        }
        this.f51136d.m68749d(t100.m186890d(17.0f), t100.m186890d(15.0f));
        ViewGroup.LayoutParams layoutParams = this.f51140h.getLayoutParams();
        if (vwb.m200296J(k450Var.m144477b())) {
            this.f51142j.m67371Z(vwb.m200324f0(new d1q[0]));
            layoutParams.height = xdl0.f192404f;
            xdl0.m208344M(this, false);
        } else {
            xdl0.m208344M(this, true);
            final BLiveOfficialShowListItem bLiveOfficialShowListItem = k450Var.m144477b().get(0);
            hxs.m133402o("context_single_room", this.f51135c, bLiveOfficialShowListItem.anchorAvatar);
            this.f51137e.setText(bLiveOfficialShowListItem.anchorName);
            this.f51138f.setText(bLiveOfficialShowListItem.desc);
            xdl0.m208344M(this.f51136d, bLiveOfficialShowListItem.isOnlive);
            xdl0.m208329E0(this.f51135c, new View.OnClickListener() { // from class: l.c650
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79438a.m75414l(bLiveOfficialShowListItem, view);
                }
            });
            final ArrayList arrayList = new ArrayList();
            vwb.m200354z(k450Var.m144477b(), new e30() { // from class: l.d650
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84586a.m75415m(arrayList, (BLiveOfficialShowListItem) obj);
                }
            });
            this.f51142j.m67371Z(arrayList);
            layoutParams.height = k450Var.m144477b().size() >= 6 ? t100.m186890d(460.0f) : xdl0.f192404f;
            xdl0.m208344M(this.f51139g, true ^ bLiveOfficialShowListItem.isFollowed);
            xdl0.m208329E0(this.f51139g, new View.OnClickListener() { // from class: l.e650
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89501a.m75416n(bLiveOfficialShowListItem, view);
                }
            });
        }
        this.f51140h.setLayoutParams(layoutParams);
        if (z) {
            return;
        }
        zvf0.m220402x(ycu.f197483a, this.f51144l.mo77274R2());
    }

    /* JADX INFO: renamed from: q */
    public void m75418q(String str) {
        k450 k450Var = this.f51141i;
        if (k450Var == null || vwb.m200296J(k450Var.m144477b())) {
            return;
        }
        boolean z = false;
        for (BLiveOfficialShowListItem bLiveOfficialShowListItem : this.f51141i.m144477b()) {
            if (TextUtils.equals(bLiveOfficialShowListItem.anchorId, str)) {
                bLiveOfficialShowListItem.isFollowed = true;
                z = true;
            }
        }
        if (z) {
            m75417p(this.f51141i, true);
        }
    }

    public OfficialShowPlayBillView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51143k = true;
    }

    public OfficialShowPlayBillView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51143k = true;
    }
}
