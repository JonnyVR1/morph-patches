package com.p000p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p000p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.iyt;
import l.s7m;
import l.t0g0;
import l.t9u;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import l.yyt;
import p002l.awt;
import p002l.ivt;
import p002l.jvt;
import p002l.l8d0;
import p002l.vut;
import p002l.x7d0;
import p002l.yvt;
import p002l.zut;
import p002l.zvt;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveSideView extends LinearLayout implements s7m<zut> {

    /* JADX INFO: renamed from: a */
    public VImage f7294a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f7295b;

    /* JADX INFO: renamed from: c */
    public RoomFrag f7296c;

    /* JADX INFO: renamed from: d */
    public l8d0 f7297d;

    /* JADX INFO: renamed from: e */
    public iyt f7298e;

    /* JADX INFO: renamed from: f */
    public awt f7299f;

    /* JADX INFO: renamed from: g */
    public awt f7300g;

    /* JADX INFO: renamed from: h */
    public awt f7301h;

    /* JADX INFO: renamed from: i */
    public final zvt f7302i;

    /* JADX INFO: renamed from: j */
    public BLiveEntrance f7303j;

    /* JADX INFO: renamed from: k */
    public List<String> f7304k;

    /* JADX INFO: renamed from: l */
    public final String f7305l;

    /* JADX INFO: renamed from: m */
    public ivt f7306m;

    /* JADX INFO: renamed from: n */
    public zut f7307n;

    public LiveSideView(Context context) {
        super(context);
        this.f7302i = new zvt();
        this.f7304k = new ArrayList();
        this.f7305l = getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m9200i(RoomFrag roomFrag, View view) {
        if (roomFrag != null) {
            roomFrag.m5173V4(false, false);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m9202p(BLiveEntrance bLiveEntrance) {
        if (bLiveEntrance == null) {
            this.f7299f = new awt(ypv.e.getString(R$string.f2978Rb));
            this.f7300g = new awt(ypv.e.getString(R$string.f3091Wj));
            this.f7301h = new awt(ypv.e.getString(R$string.f3711z6));
        } else {
            this.f7299f = new awt(bLiveEntrance.defaultTitle);
            this.f7300g = new awt(bLiveEntrance.followTitle);
            this.f7301h = new awt(bLiveEntrance.hourlySuggestedTitle);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m9203q() {
        this.f7298e.m0(this.f7306m, this.f7296c, new v9j() { // from class: l.bvt
            public final Object call() {
                return this.f8381a.m9211u();
            }
        });
        this.f7298e.C0(this.f7296c, false);
        this.f7295b.setAdapter(this.f7298e);
        xdl0.E0(this.f7295b, (View.OnClickListener) null);
        this.f7298e.c0(new e30() { // from class: l.cvt
            public final void call(Object obj) {
                this.f8954a.m9212v((Integer) obj);
            }
        });
        this.f7295b.setItemAnimator((RecyclerView.l) null);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9204C0() {
        return getContext();
    }

    @Nullable
    public Act act() {
        return xdl0.E(this);
    }

    public void destroy() {
    }

    public List<String> getImageList() {
        return this.f7304k;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m9206k(View view) {
        jvt.m16352a(this, view);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m9205i1(zut zutVar) {
        this.f7307n = zutVar;
    }

    /* JADX INFO: renamed from: m */
    public final List<yvt> m9208m(t9u t9uVar, String str, String str2) {
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom;
        ArrayList arrayList = new ArrayList();
        if (t9uVar != null && !vwb.J(t9uVar.a)) {
            int i = 0;
            while (i < t9uVar.a.size()) {
                final BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) t9uVar.a.get(i);
                i++;
                final yvt yvtVar = new yvt(bLiveSuggestLive, str2, i);
                yvtVar.B(this.f7297d.pageId());
                arrayList.add(yvtVar);
                yvtVar.A(new View.OnClickListener() { // from class: l.hvt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f12298a.m9210s(yvtVar, bLiveSuggestLive, view);
                    }
                });
                if (!t0g0.l(str, bLiveSuggestLive.anchor.id) && (bLiveSuggestLiveRoom = bLiveSuggestLive.room) != null) {
                    this.f7304k.add(bLiveSuggestLiveRoom.coverUrl);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m9209n(final RoomFrag roomFrag, l8d0 l8d0Var) {
        this.f7296c = roomFrag;
        this.f7297d = l8d0Var;
        this.f7306m = new ivt(l8d0Var);
        iyt iytVarH0 = iyt.H0();
        this.f7298e = iytVarH0;
        iytVarH0.X(false);
        m9203q();
        m9216z(l8d0Var.m17060E0(), l8d0Var.m17054A0());
        xdl0.E0(this.f7294a, new View.OnClickListener() { // from class: l.avt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSideView.m9200i(roomFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9206k(this);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9210s(yvt yvtVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        this.f7306m.m15432d(yvtVar);
        this.f7297d.m17076V0(new JumpRoomData.C0350a().m6549o(bLiveSuggestLive.expendToFullLive()).m6548n(JumpRoomType.DEFAULT).m6547m());
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = ((yyt) yvtVar).a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            this.f7307n.m27541m0(bLiveSuggestLiveAnchor.id);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m9211u() {
        return Boolean.valueOf(this.f7296c.m5170S4());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m9212v(Integer num) {
        l8d0 l8d0Var;
        if (num.intValue() <= this.f7298e.getItemCount() - 8 || (l8d0Var = this.f7297d) == null) {
            return;
        }
        l8d0Var.m17060E0().m25730t().mo12172h();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m9213w() {
        this.f7298e.q0();
        this.f7298e.I0();
    }

    /* JADX INFO: renamed from: x */
    public void m9214x(boolean z) {
        iyt iytVar = this.f7298e;
        if (iytVar != null && z) {
            iytVar.p0();
            this.f7298e.I0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m9215y(vut vutVar) {
        if (this.f7303j == null) {
            return;
        }
        t9u t9uVarM24166d = vutVar.m24166d();
        t9u t9uVarM24169g = vutVar.m24169g();
        t9u t9uVarM24167e = vutVar.m24167e();
        String strM27536h0 = this.f7307n.m27536h0();
        this.f7304k.clear();
        ArrayList arrayList = new ArrayList();
        if (this.f7303j.showHourlySuggested && !t9uVarM24167e.a.isEmpty()) {
            arrayList.add(this.f7301h);
            arrayList.addAll(m9208m(t9uVarM24167e, strM27536h0, "hourRanking"));
            t9uVarM24169g.C(vwb.Q(t9uVarM24167e.a, new w9j() { // from class: l.dvt
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).id;
                }
            }));
            if (this.f7303j.showFollow) {
                t9uVarM24166d.C(vwb.Q(t9uVarM24167e.a, new w9j() { // from class: l.evt
                    public final Object call(Object obj) {
                        return ((BLiveSuggestLive) obj).id;
                    }
                }));
            }
        }
        if (this.f7303j.showFollow) {
            arrayList.add(this.f7300g);
            if (vwb.J(t9uVarM24166d.a)) {
                arrayList.add(this.f7302i);
            }
            arrayList.addAll(m9208m(t9uVarM24166d, strM27536h0, "follow"));
            t9uVarM24169g.C(vwb.Q(t9uVarM24166d.a, new w9j() { // from class: l.fvt
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).id;
                }
            }));
        }
        if (this.f7303j.showDefaultTitle && !t9uVarM24169g.a.isEmpty()) {
            arrayList.add(this.f7299f);
        }
        arrayList.addAll(m9208m(t9uVarM24169g, strM27536h0, "recommend"));
        this.f7298e.a0(arrayList, true);
        this.f7295b.post(new Runnable() { // from class: l.gvt
            @Override // java.lang.Runnable
            public final void run() {
                this.f11643a.m9213w();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m9216z(x7d0 x7d0Var, String str) {
        BLiveEntrance bLiveEntranceMo12167c = x7d0Var.m25730t().mo12167c();
        this.f7303j = bLiveEntranceMo12167c;
        m9202p(bLiveEntranceMo12167c);
        zut zutVar = this.f7307n;
        if (zutVar != null) {
            zutVar.m27537i0();
        } else {
            zut zutVar2 = new zut(this.f7296c);
            this.f7307n = zutVar2;
            zutVar2.C(this);
        }
        this.f7307n.m27540l0(x7d0Var);
    }

    public LiveSideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7302i = new zvt();
        this.f7304k = new ArrayList();
        this.f7305l = getClass().getSimpleName();
    }

    public LiveSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7302i = new zvt();
        this.f7304k = new ArrayList();
        this.f7305l = getClass().getSimpleName();
    }
}
