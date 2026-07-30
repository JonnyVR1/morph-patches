package com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.awu;
import p149l.bt0;
import p149l.cwf0;
import p149l.d1q;
import p149l.d2s;
import p149l.fht;
import p149l.g5c0;
import p149l.ij4;
import p149l.iyt;
import p149l.q4s;
import p149l.ugt;
import p149l.x9u;
import p149l.xdl0;
import p149l.xye;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomSuggestView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f49267c;

    /* JADX INFO: renamed from: d */
    public VText f49268d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f49269e;

    /* JADX INFO: renamed from: f */
    public iyt f49270f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView$a */
    public class C12767a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f49271a;

        public C12767a(GridLayoutManager gridLayoutManager) {
            this.f49271a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return i == LiveRoomSuggestView.this.f49270f.getItemCount() + (-1) ? this.f49271a.m3317m() : LiveRoomSuggestView.this.f49270f.m67356K(i);
        }
    }

    public LiveRoomSuggestView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList<q4s> m73127T(List<BLiveSuggestLive> list, String str) {
        ArrayList<q4s> arrayList = new ArrayList<>();
        int i = 0;
        while (i < list.size()) {
            BLiveSuggestLive bLiveSuggestLive = list.get(i);
            i++;
            q4s q4sVar = new q4s();
            q4sVar.m172969r(1002);
            awu awuVar = new awu();
            awuVar.live = bLiveSuggestLive;
            x9u.m207517b(3, awuVar, "live-quit-popup");
            x9u.m207518c(awuVar, i, str);
            q4sVar.m172973v(awuVar);
            arrayList.add(q4sVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    private void m73128r() {
        this.f49270f = iyt.m138989H0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.m3326v(new C12767a(gridLayoutManager));
        this.f49269e.setLayoutManager(gridLayoutManager);
        this.f49269e.setAdapter(this.f49270f);
    }

    /* JADX INFO: renamed from: S */
    public List<d1q<?>> m73129S(ugt ugtVar, LiveRoomSuggestBean liveRoomSuggestBean) {
        ArrayList arrayList = new ArrayList();
        if (liveRoomSuggestBean.getLiveQuitPopup() != null && liveRoomSuggestBean.getLiveQuitPopup().level2SuggestedLives != null && liveRoomSuggestBean.getLiveQuitPopup().level2SuggestedLives.size() != 0) {
            arrayList.add(new fht(liveRoomSuggestBean.getLiveQuitPopup(), ugtVar));
        }
        ArrayList<q4s> arrayListM73127T = m73127T(liveRoomSuggestBean.getSuggestedLives(), "p_live_exit_popup");
        ij4 ij4Var = new ij4(ugtVar);
        ij4Var.m136506c(1);
        arrayList.addAll(d2s.m109829b(ij4Var, arrayListM73127T));
        arrayList.add(new xye());
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public void m73130V() {
        Animator animatorM103744q = bt0.m103744q(this, "translationX", -xdl0.m208412y0(), 0.0f);
        animatorM103744q.setDuration(300L);
        bt0.m103749v(animatorM103744q, new Runnable() { // from class: l.jht
            @Override // java.lang.Runnable
            public final void run() {
                this.f118015a.m73131W();
            }
        });
        animatorM103744q.start();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m73131W() {
        setVisibility(0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m73132X() {
        setTranslationX(-xdl0.m208412y0());
        setAlpha(1.0f);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: Y */
    public void m73133Y() {
        Animator animatorM103751x = bt0.m103751x(300L, bt0.m103744q(this, "translationX", 0.0f, (-xdl0.m208412y0()) / 2.0f), bt0.m103741n(this, LinearLayout.ALPHA, 1.0f, 0.0f));
        bt0.m103733f(animatorM103751x, new Runnable() { // from class: l.iht
            @Override // java.lang.Runnable
            public final void run() {
                this.f113337a.m73132X();
            }
        });
        animatorM103751x.start();
    }

    /* JADX INFO: renamed from: Z */
    public void m73134Z(ugt ugtVar, LiveRoomSuggestBean liveRoomSuggestBean) {
        if (liveRoomSuggestBean == null) {
            return;
        }
        setTranslationX(0.0f);
        if (ypv.m215672k().m195799b4() != null) {
            this.f49267c.setText(ypv.m215672k().m195799b4().quitLiveStayConfig.popupContent);
            if (liveRoomSuggestBean.getLiveQuitPopup() != null) {
                this.f49268d.setText(liveRoomSuggestBean.getLiveQuitPopup().customContent);
            }
        }
        this.f49270f.m67371Z(m73129S(ugtVar, liveRoomSuggestBean));
        cwf0 cwf0Var = new cwf0("p_live_exit_popup", getClass().getSimpleName());
        cwf0Var.m109033i();
        cwf0Var.m109036l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49267c = (VText) findViewById(g5c0.f100762N6);
        this.f49268d = (VText) findViewById(g5c0.f100884b1);
        this.f49269e = (VRecyclerView) findViewById(g5c0.f100657C0);
        m73128r();
    }

    public LiveRoomSuggestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomSuggestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
