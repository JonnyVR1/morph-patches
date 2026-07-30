package com.p046p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p149l.awt;
import p149l.e30;
import p149l.ivt;
import p149l.iyt;
import p149l.jvt;
import p149l.l8d0;
import p149l.s7m;
import p149l.t0g0;
import p149l.t9u;
import p149l.v9j;
import p149l.vut;
import p149l.vwb;
import p149l.w9j;
import p149l.x7d0;
import p149l.xdl0;
import p149l.ypv;
import p149l.yvt;
import p149l.zut;
import p149l.zvt;

/* JADX INFO: loaded from: classes4.dex */
public class LiveSideView extends LinearLayout implements s7m<zut> {

    /* JADX INFO: renamed from: a */
    public VImage f51252a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f51253b;

    /* JADX INFO: renamed from: c */
    public RoomFrag f51254c;

    /* JADX INFO: renamed from: d */
    public l8d0 f51255d;

    /* JADX INFO: renamed from: e */
    public iyt f51256e;

    /* JADX INFO: renamed from: f */
    public awt f51257f;

    /* JADX INFO: renamed from: g */
    public awt f51258g;

    /* JADX INFO: renamed from: h */
    public awt f51259h;

    /* JADX INFO: renamed from: i */
    public final zvt f51260i;

    /* JADX INFO: renamed from: j */
    public BLiveEntrance f51261j;

    /* JADX INFO: renamed from: k */
    public List<String> f51262k;

    /* JADX INFO: renamed from: l */
    public final String f51263l;

    /* JADX INFO: renamed from: m */
    public ivt f51264m;

    /* JADX INFO: renamed from: n */
    public zut f51265n;

    public LiveSideView(Context context) {
        super(context);
        this.f51260i = new zvt();
        this.f51262k = new ArrayList();
        this.f51263l = getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m75563i(RoomFrag roomFrag, View view) {
        if (roomFrag != null) {
            roomFrag.m71804V4(false, false);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m75565p(BLiveEntrance bLiveEntrance) {
        if (bLiveEntrance == null) {
            this.f51257f = new awt(ypv.f199497e.getString(R$string.f46936Rb));
            this.f51258g = new awt(ypv.f199497e.getString(R$string.f47049Wj));
            this.f51259h = new awt(ypv.f199497e.getString(R$string.f47669z6));
        } else {
            this.f51257f = new awt(bLiveEntrance.defaultTitle);
            this.f51258g = new awt(bLiveEntrance.followTitle);
            this.f51259h = new awt(bLiveEntrance.hourlySuggestedTitle);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m75566q() {
        this.f51256e.m191779m0(this.f51264m, this.f51254c, new v9j() { // from class: l.bvt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77490a.m75572u();
            }
        });
        this.f51256e.m139000C0(this.f51254c, false);
        this.f51253b.setAdapter(this.f51256e);
        xdl0.m208329E0(this.f51253b, null);
        this.f51256e.m67375c0(new e30() { // from class: l.cvt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82686a.m75573v((Integer) obj);
            }
        });
        this.f51253b.setItemAnimator(null);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) xdl0.m208328E(this);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public List<String> getImageList() {
        return this.f51262k;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m75567k(View view) {
        jvt.m143574a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zut zutVar) {
        this.f51265n = zutVar;
    }

    /* JADX INFO: renamed from: m */
    public final List<yvt> m75569m(t9u t9uVar, String str, String str2) {
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom;
        ArrayList arrayList = new ArrayList();
        if (t9uVar != null && !vwb.m200296J(t9uVar.f169071a)) {
            int i = 0;
            while (i < t9uVar.f169071a.size()) {
                final BLiveSuggestLive bLiveSuggestLive = t9uVar.f169071a.get(i);
                i++;
                final yvt yvtVar = new yvt(bLiveSuggestLive, str2, i);
                yvtVar.m109663B(this.f51255d.pageId());
                arrayList.add(yvtVar);
                yvtVar.mo109662A(new View.OnClickListener() { // from class: l.hvt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f109695a.m75571s(yvtVar, bLiveSuggestLive, view);
                    }
                });
                if (!t0g0.m186871l(str, bLiveSuggestLive.anchor.f44451id) && (bLiveSuggestLiveRoom = bLiveSuggestLive.room) != null) {
                    this.f51262k.add(bLiveSuggestLiveRoom.coverUrl);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m75570n(final RoomFrag roomFrag, l8d0 l8d0Var) {
        this.f51254c = roomFrag;
        this.f51255d = l8d0Var;
        this.f51264m = new ivt(l8d0Var);
        iyt iytVarM138989H0 = iyt.m138989H0();
        this.f51256e = iytVarM138989H0;
        iytVarM138989H0.m67369X(false);
        m75566q();
        m75577z(l8d0Var.m148869E0(), l8d0Var.m148863A0());
        xdl0.m208329E0(this.f51252a, new View.OnClickListener() { // from class: l.avt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSideView.m75563i(roomFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75567k(this);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m75571s(yvt yvtVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        this.f51264m.m138637d(yvtVar);
        this.f51255d.m148885V0(new JumpRoomData.C12761a().m73026o(bLiveSuggestLive.expendToFullLive()).m73025n(JumpRoomType.DEFAULT).m73024m());
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = yvtVar.f200806a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            this.f51265n.m220257m0(bLiveSuggestLiveAnchor.f44451id);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m75572u() {
        return Boolean.valueOf(this.f51254c.m71801S4());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m75573v(Integer num) {
        l8d0 l8d0Var;
        if (num.intValue() <= this.f51256e.getItemCount() - 8 || (l8d0Var = this.f51255d) == null) {
            return;
        }
        l8d0Var.m148869E0().m207278t().mo114614h();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m75574w() {
        this.f51256e.m191783q0();
        this.f51256e.m139005I0();
    }

    /* JADX INFO: renamed from: x */
    public void m75575x(boolean z) {
        iyt iytVar = this.f51256e;
        if (iytVar != null && z) {
            iytVar.m191782p0();
            this.f51256e.m139005I0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m75576y(vut vutVar) {
        if (this.f51261j == null) {
            return;
        }
        t9u t9uVarM200124d = vutVar.m200124d();
        t9u t9uVarM200127g = vutVar.m200127g();
        t9u t9uVarM200125e = vutVar.m200125e();
        String strM220252h0 = this.f51265n.m220252h0();
        this.f51262k.clear();
        ArrayList arrayList = new ArrayList();
        if (this.f51261j.showHourlySuggested && !t9uVarM200125e.f169071a.isEmpty()) {
            arrayList.add(this.f51259h);
            arrayList.addAll(m75569m(t9uVarM200125e, strM220252h0, "hourRanking"));
            t9uVarM200127g.m187665C(vwb.m200303Q(t9uVarM200125e.f169071a, new w9j() { // from class: l.dvt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).f44450id;
                }
            }));
            if (this.f51261j.showFollow) {
                t9uVarM200124d.m187665C(vwb.m200303Q(t9uVarM200125e.f169071a, new w9j() { // from class: l.evt
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((BLiveSuggestLive) obj).f44450id;
                    }
                }));
            }
        }
        if (this.f51261j.showFollow) {
            arrayList.add(this.f51258g);
            if (vwb.m200296J(t9uVarM200124d.f169071a)) {
                arrayList.add(this.f51260i);
            }
            arrayList.addAll(m75569m(t9uVarM200124d, strM220252h0, "follow"));
            t9uVarM200127g.m187665C(vwb.m200303Q(t9uVarM200124d.f169071a, new w9j() { // from class: l.fvt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).f44450id;
                }
            }));
        }
        if (this.f51261j.showDefaultTitle && !t9uVarM200127g.f169071a.isEmpty()) {
            arrayList.add(this.f51257f);
        }
        arrayList.addAll(m75569m(t9uVarM200127g, strM220252h0, "recommend"));
        this.f51256e.m67372a0(arrayList, true);
        this.f51253b.post(new Runnable() { // from class: l.gvt
            @Override // java.lang.Runnable
            public final void run() {
                this.f104605a.m75574w();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m75577z(x7d0 x7d0Var, String str) {
        BLiveEntrance bLiveEntranceMo114609c = x7d0Var.m207278t().mo114609c();
        this.f51261j = bLiveEntranceMo114609c;
        m75565p(bLiveEntranceMo114609c);
        zut zutVar = this.f51265n;
        if (zutVar != null) {
            zutVar.m220253i0();
        } else {
            zut zutVar2 = new zut(this.f51254c);
            this.f51265n = zutVar2;
            zutVar2.mo51532C(this);
        }
        this.f51265n.m220256l0(x7d0Var);
    }

    public LiveSideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51260i = new zvt();
        this.f51262k = new ArrayList();
        this.f51263l = getClass().getSimpleName();
    }

    public LiveSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51260i = new zvt();
        this.f51262k = new ArrayList();
        this.f51263l = getClass().getSimpleName();
    }
}
