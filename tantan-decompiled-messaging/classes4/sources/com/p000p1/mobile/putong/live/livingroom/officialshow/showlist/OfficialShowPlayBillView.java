package com.p000p1.mobile.putong.live.livingroom.officialshow.showlist;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowListItem;
import com.p1.mobile.putong.live.base.view.LiveMainlandTagView;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e30;
import l.hxs;
import l.j760;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ycu;
import l.zvf0;
import p002l.a650;
import p002l.f650;
import p002l.i3c0;
import p002l.k450;
import p002l.p550;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OfficialShowPlayBillView extends FrameLayout implements s7m<a650> {

    /* JADX INFO: renamed from: a */
    public TextView f7175a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f7176b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f7177c;

    /* JADX INFO: renamed from: d */
    public LiveMainlandTagView f7178d;

    /* JADX INFO: renamed from: e */
    public TextView f7179e;

    /* JADX INFO: renamed from: f */
    public TextView f7180f;

    /* JADX INFO: renamed from: g */
    public TextView f7181g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f7182h;

    /* JADX INFO: renamed from: i */
    public k450 f7183i;

    /* JADX INFO: renamed from: j */
    public LiveBaseAdapter f7184j;

    /* JADX INFO: renamed from: k */
    public boolean f7185k;

    /* JADX INFO: renamed from: l */
    public a650 f7186l;

    public OfficialShowPlayBillView(@NonNull Context context) {
        super(context);
        this.f7185k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m9038k(View view) {
        m9042i();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9039C0() {
        return null;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m9040e(View view) {
        f650.m12951a(this, view);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m9043i1(a650 a650Var) {
        this.f7186l = a650Var;
        this.f7184j = new LiveBaseAdapter();
        this.f7182h.setLayoutManager(new LinearLayoutManager(a650Var.act()));
        this.f7182h.setAdapter(this.f7184j);
        h hVar = new h(a650Var.act(), 1);
        hVar.h(a650Var.act().drawable(i3c0.f12919q4));
        this.f7182h.addItemDecoration(hVar);
    }

    public k450 getInfo() {
        return this.f7183i;
    }

    /* JADX INFO: renamed from: i */
    public final void m9042i() {
        boolean z = this.f7185k;
        this.f7185k = !z;
        RecyclerView recyclerView = this.f7182h;
        if (z) {
            xdl0.M(recyclerView, false);
            xdl0.M(this.f7176b, true);
            this.f7175a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f12895o4, 0);
        } else {
            xdl0.M(recyclerView, true);
            xdl0.M(this.f7176b, false);
            this.f7175a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f12883n4, 0);
        }
        zvf0.u(ycu.a, this.f7186l.mo21430R2(), new j760[]{j760.a("click_type", this.f7185k ? "open" : "close")});
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m9044j() {
        if (this.f7185k) {
            m9042i();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9045l(BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        this.f7186l.m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1400).userId(bLiveOfficialShowListItem.anchorId).setFromIdentity("audience").setTo("audience").setScene("live").setSource("anchor").trackFrom("live").build());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9046m(List list, BLiveOfficialShowListItem bLiveOfficialShowListItem) {
        list.add(new p550(this.f7186l, bLiveOfficialShowListItem));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m9047n(BLiveOfficialShowListItem bLiveOfficialShowListItem, View view) {
        a650 a650Var = this.f7186l;
        if (a650Var != null) {
            a650Var.m9437R3(bLiveOfficialShowListItem.anchorId);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9040e(this);
        this.f7178d.c(-1, -1);
        this.f7175a.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3c0.f12883n4, 0);
        xdl0.E0(this.f7175a, new View.OnClickListener() { // from class: l.b650
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8002a.m9038k(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m9048p(k450 k450Var, boolean z) {
        this.f7183i = k450Var;
        if (k450Var == null) {
            xdl0.M(this, false);
            return;
        }
        this.f7178d.d(t100.d(17.0f), t100.d(15.0f));
        ViewGroup.LayoutParams layoutParams = this.f7182h.getLayoutParams();
        if (vwb.J(k450Var.m16496b())) {
            this.f7184j.Z(vwb.f0(new d1q[0]));
            layoutParams.height = xdl0.f;
            xdl0.M(this, false);
        } else {
            xdl0.M(this, true);
            final BLiveOfficialShowListItem bLiveOfficialShowListItem = k450Var.m16496b().get(0);
            hxs.o("context_single_room", this.f7177c, bLiveOfficialShowListItem.anchorAvatar);
            this.f7179e.setText(bLiveOfficialShowListItem.anchorName);
            this.f7180f.setText(bLiveOfficialShowListItem.desc);
            xdl0.M(this.f7178d, bLiveOfficialShowListItem.isOnlive);
            xdl0.E0(this.f7177c, new View.OnClickListener() { // from class: l.c650
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8494a.m9045l(bLiveOfficialShowListItem, view);
                }
            });
            final ArrayList arrayList = new ArrayList();
            vwb.z(k450Var.m16496b(), new e30() { // from class: l.d650
                public final void call(Object obj) {
                    this.f9070a.m9046m(arrayList, (BLiveOfficialShowListItem) obj);
                }
            });
            this.f7184j.Z(arrayList);
            layoutParams.height = k450Var.m16496b().size() >= 6 ? t100.d(460.0f) : xdl0.f;
            xdl0.M(this.f7181g, true ^ bLiveOfficialShowListItem.isFollowed);
            xdl0.E0(this.f7181g, new View.OnClickListener() { // from class: l.e650
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9585a.m9047n(bLiveOfficialShowListItem, view);
                }
            });
        }
        this.f7182h.setLayoutParams(layoutParams);
        if (z) {
            return;
        }
        zvf0.x(ycu.a, this.f7186l.mo21430R2());
    }

    /* JADX INFO: renamed from: q */
    public void m9049q(String str) {
        k450 k450Var = this.f7183i;
        if (k450Var == null || vwb.J(k450Var.m16496b())) {
            return;
        }
        boolean z = false;
        for (BLiveOfficialShowListItem bLiveOfficialShowListItem : this.f7183i.m16496b()) {
            if (TextUtils.equals(bLiveOfficialShowListItem.anchorId, str)) {
                bLiveOfficialShowListItem.isFollowed = true;
                z = true;
            }
        }
        if (z) {
            m9048p(this.f7183i, true);
        }
    }

    public OfficialShowPlayBillView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7185k = true;
    }

    public OfficialShowPlayBillView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7185k = true;
    }
}
