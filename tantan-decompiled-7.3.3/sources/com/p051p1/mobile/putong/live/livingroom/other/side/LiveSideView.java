package com.p051p1.mobile.putong.live.livingroom.other.side;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p153l.a9g0;
import p153l.agd0;
import p153l.axt;
import p153l.ayt;
import p153l.bnl0;
import p153l.byt;
import p153l.iam;
import p153l.j0u;
import p153l.jxt;
import p153l.jyb;
import p153l.kxt;
import p153l.ogd0;
import p153l.pcj;
import p153l.qcj;
import p153l.ubu;
import p153l.wwt;
import p153l.y20;
import p153l.zrv;
import p153l.zxt;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSideView extends LinearLayout implements iam<axt> {

    /* JADX INFO: renamed from: a */
    public VImage f52100a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f52101b;

    /* JADX INFO: renamed from: c */
    public RoomFrag f52102c;

    /* JADX INFO: renamed from: d */
    public ogd0 f52103d;

    /* JADX INFO: renamed from: e */
    public j0u f52104e;

    /* JADX INFO: renamed from: f */
    public byt f52105f;

    /* JADX INFO: renamed from: g */
    public byt f52106g;

    /* JADX INFO: renamed from: h */
    public byt f52107h;

    /* JADX INFO: renamed from: i */
    public final ayt f52108i;

    /* JADX INFO: renamed from: j */
    public BLiveEntrance f52109j;

    /* JADX INFO: renamed from: k */
    public List<String> f52110k;

    /* JADX INFO: renamed from: l */
    public final String f52111l;

    /* JADX INFO: renamed from: m */
    public jxt f52112m;

    /* JADX INFO: renamed from: n */
    public axt f52113n;

    public LiveSideView(Context context) {
        super(context);
        this.f52108i = new ayt();
        this.f52110k = new ArrayList();
        this.f52111l = getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m76746i(RoomFrag roomFrag, View view) {
        if (roomFrag != null) {
            roomFrag.m72987V4(false, false);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m76748p(BLiveEntrance bLiveEntrance) {
        if (bLiveEntrance == null) {
            this.f52105f = new byt(zrv.f205803e.getString(R$string.f47784Rb));
            this.f52106g = new byt(zrv.f205803e.getString(R$string.f47897Wj));
            this.f52107h = new byt(zrv.f205803e.getString(R$string.f48517z6));
        } else {
            this.f52105f = new byt(bLiveEntrance.defaultTitle);
            this.f52106g = new byt(bLiveEntrance.followTitle);
            this.f52107h = new byt(bLiveEntrance.hourlySuggestedTitle);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m76749q() {
        this.f52104e.m200147m0(this.f52112m, this.f52102c, new pcj() { // from class: l.cxt
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f84272a.m76755u();
            }
        });
        this.f52104e.m143018C0(this.f52102c, false);
        this.f52101b.setAdapter(this.f52104e);
        bnl0.m105509E0(this.f52101b, null);
        this.f52104e.m68558c0(new y20() { // from class: l.dxt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91110a.m76756v((Integer) obj);
            }
        });
        this.f52101b.setItemAnimator(null);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return (Act) bnl0.m105508E(this);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public List<String> getImageList() {
        return this.f52110k;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m76750k(View view) {
        kxt.m151892a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(axt axtVar) {
        this.f52113n = axtVar;
    }

    /* JADX INFO: renamed from: m */
    public final List<zxt> m76752m(ubu ubuVar, String str, String str2) {
        BLiveSuggestLiveRoom bLiveSuggestLiveRoom;
        ArrayList arrayList = new ArrayList();
        if (ubuVar != null && !jyb.m147479J(ubuVar.f178357a)) {
            int i = 0;
            while (i < ubuVar.f178357a.size()) {
                final BLiveSuggestLive bLiveSuggestLive = ubuVar.f178357a.get(i);
                i++;
                final zxt zxtVar = new zxt(bLiveSuggestLive, str2, i);
                zxtVar.m113882B(this.f52103d.pageId());
                arrayList.add(zxtVar);
                zxtVar.mo113881A(new View.OnClickListener() { // from class: l.ixt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f117458a.m76754s(zxtVar, bLiveSuggestLive, view);
                    }
                });
                if (!a9g0.m96577l(str, bLiveSuggestLive.anchor.f45299id) && (bLiveSuggestLiveRoom = bLiveSuggestLive.room) != null) {
                    this.f52110k.add(bLiveSuggestLiveRoom.coverUrl);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public void m76753n(final RoomFrag roomFrag, ogd0 ogd0Var) {
        this.f52102c = roomFrag;
        this.f52103d = ogd0Var;
        this.f52112m = new jxt(ogd0Var);
        j0u j0uVarM143007H0 = j0u.m143007H0();
        this.f52104e = j0uVarM143007H0;
        j0uVarM143007H0.m68552X(false);
        m76749q();
        m76760z(ogd0Var.m167544E0(), ogd0Var.m167538A0());
        bnl0.m105509E0(this.f52100a, new View.OnClickListener() { // from class: l.bxt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveSideView.m76746i(roomFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76750k(this);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m76754s(zxt zxtVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        this.f52112m.m147398d(zxtVar);
        this.f52103d.m167560V0(new JumpRoomData.C12924a().m74209o(bLiveSuggestLive.expendToFullLive()).m74208n(JumpRoomType.DEFAULT).m74207m());
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = zxtVar.f202383a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            this.f52113n.m100840m0(bLiveSuggestLiveAnchor.f45299id);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Boolean m76755u() {
        return Boolean.valueOf(this.f52102c.m72984S4());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m76756v(Integer num) {
        ogd0 ogd0Var;
        if (num.intValue() <= this.f52104e.getItemCount() - 8 || (ogd0Var = this.f52103d) == null) {
            return;
        }
        ogd0Var.m167544E0().m97615t().mo129567h();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m76757w() {
        this.f52104e.m200151q0();
        this.f52104e.m143023I0();
    }

    /* JADX INFO: renamed from: x */
    public void m76758x(boolean z) {
        j0u j0uVar = this.f52104e;
        if (j0uVar != null && z) {
            j0uVar.m200150p0();
            this.f52104e.m143023I0();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m76759y(wwt wwtVar) {
        if (this.f52109j == null) {
            return;
        }
        ubu ubuVarM208298d = wwtVar.m208298d();
        ubu ubuVarM208301g = wwtVar.m208301g();
        ubu ubuVarM208299e = wwtVar.m208299e();
        String strM100835h0 = this.f52113n.m100835h0();
        this.f52110k.clear();
        ArrayList arrayList = new ArrayList();
        if (this.f52109j.showHourlySuggested && !ubuVarM208299e.f178357a.isEmpty()) {
            arrayList.add(this.f52107h);
            arrayList.addAll(m76752m(ubuVarM208299e, strM100835h0, "hourRanking"));
            ubuVarM208301g.m195319C(jyb.m147486Q(ubuVarM208299e.f178357a, new qcj() { // from class: l.ext
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).f45298id;
                }
            }));
            if (this.f52109j.showFollow) {
                ubuVarM208298d.m195319C(jyb.m147486Q(ubuVarM208299e.f178357a, new qcj() { // from class: l.fxt
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((BLiveSuggestLive) obj).f45298id;
                    }
                }));
            }
        }
        if (this.f52109j.showFollow) {
            arrayList.add(this.f52106g);
            if (jyb.m147479J(ubuVarM208298d.f178357a)) {
                arrayList.add(this.f52108i);
            }
            arrayList.addAll(m76752m(ubuVarM208298d, strM100835h0, "follow"));
            ubuVarM208301g.m195319C(jyb.m147486Q(ubuVarM208298d.f178357a, new qcj() { // from class: l.gxt
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((BLiveSuggestLive) obj).f45298id;
                }
            }));
        }
        if (this.f52109j.showDefaultTitle && !ubuVarM208301g.f178357a.isEmpty()) {
            arrayList.add(this.f52105f);
        }
        arrayList.addAll(m76752m(ubuVarM208301g, strM100835h0, "recommend"));
        this.f52104e.m68555a0(arrayList, true);
        this.f52101b.post(new Runnable() { // from class: l.hxt
            @Override // java.lang.Runnable
            public final void run() {
                this.f112046a.m76757w();
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m76760z(agd0 agd0Var, String str) {
        BLiveEntrance bLiveEntranceMo129563c = agd0Var.m97615t().mo129563c();
        this.f52109j = bLiveEntranceMo129563c;
        m76748p(bLiveEntranceMo129563c);
        axt axtVar = this.f52113n;
        if (axtVar != null) {
            axtVar.m100836i0();
        } else {
            axt axtVar2 = new axt(this.f52102c);
            this.f52113n = axtVar2;
            axtVar2.mo52715C(this);
        }
        this.f52113n.m100839l0(agd0Var);
    }

    public LiveSideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52108i = new ayt();
        this.f52110k = new ArrayList();
        this.f52111l = getClass().getSimpleName();
    }

    public LiveSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52108i = new ayt();
        this.f52110k = new ArrayList();
        this.f52111l = getClass().getSimpleName();
    }
}
