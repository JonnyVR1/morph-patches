package com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.ArrayList;
import java.util.List;
import l.awu;
import l.bt0;
import l.cwf0;
import l.d1q;
import l.d2s;
import l.ij4;
import l.iyt;
import l.q4s;
import l.x9u;
import l.xdl0;
import l.ypv;
import p002l.fht;
import p002l.g5c0;
import p002l.ugt;
import p002l.xye;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveRoomSuggestView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f5309c;

    /* JADX INFO: renamed from: d */
    public VText f5310d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f5311e;

    /* JADX INFO: renamed from: f */
    public iyt f5312f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView$a */
    public class C0356a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f5313a;

        public C0356a(GridLayoutManager gridLayoutManager) {
            this.f5313a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m6662f(int i) {
            return i == LiveRoomSuggestView.this.f5312f.getItemCount() + (-1) ? this.f5313a.m() : LiveRoomSuggestView.this.f5312f.K(i);
        }
    }

    public LiveRoomSuggestView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList<q4s> m6654T(List<BLiveSuggestLive> list, String str) {
        ArrayList<q4s> arrayList = new ArrayList<>();
        int i = 0;
        while (i < list.size()) {
            BLiveSuggestLive bLiveSuggestLive = list.get(i);
            i++;
            q4s q4sVar = new q4s();
            q4sVar.r(1002);
            awu awuVar = new awu();
            awuVar.live = bLiveSuggestLive;
            x9u.b(3, awuVar, "live-quit-popup");
            x9u.c(awuVar, i, str);
            q4sVar.v(awuVar);
            arrayList.add(q4sVar);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m6655r() {
        this.f5312f = iyt.H0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.v(new C0356a(gridLayoutManager));
        this.f5311e.setLayoutManager(gridLayoutManager);
        this.f5311e.setAdapter(this.f5312f);
    }

    /* JADX INFO: renamed from: S */
    public List<d1q<?>> m6656S(ugt ugtVar, LiveRoomSuggestBean liveRoomSuggestBean) {
        ArrayList arrayList = new ArrayList();
        if (liveRoomSuggestBean.getLiveQuitPopup() != null && liveRoomSuggestBean.getLiveQuitPopup().level2SuggestedLives != null && liveRoomSuggestBean.getLiveQuitPopup().level2SuggestedLives.size() != 0) {
            arrayList.add(new fht(liveRoomSuggestBean.getLiveQuitPopup(), ugtVar));
        }
        ArrayList<q4s> arrayListM6654T = m6654T(liveRoomSuggestBean.getSuggestedLives(), "p_live_exit_popup");
        ij4 ij4Var = new ij4(ugtVar);
        ij4Var.c(1);
        arrayList.addAll(d2s.b(ij4Var, arrayListM6654T));
        arrayList.add(new xye());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m6657V() {
        Animator animatorQ = bt0.q(this, "translationX", new float[]{-xdl0.y0(), 0.0f});
        animatorQ.setDuration(300L);
        bt0.v(animatorQ, new Runnable() { // from class: l.jht
            @Override // java.lang.Runnable
            public final void run() {
                this.f13778a.m6658W();
            }
        });
        animatorQ.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m6658W() {
        setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m6659X() {
        setTranslationX(-xdl0.y0());
        setAlpha(1.0f);
        setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public void m6660Y() {
        Animator animatorX = bt0.x(300L, new Animator[]{bt0.q(this, "translationX", new float[]{0.0f, (-xdl0.y0()) / 2.0f}), bt0.n(this, LinearLayout.ALPHA, new float[]{1.0f, 0.0f})});
        bt0.f(animatorX, new Runnable() { // from class: l.iht
            @Override // java.lang.Runnable
            public final void run() {
                this.f13258a.m6659X();
            }
        });
        animatorX.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public void m6661Z(ugt ugtVar, LiveRoomSuggestBean liveRoomSuggestBean) {
        if (liveRoomSuggestBean == null) {
            return;
        }
        setTranslationX(0.0f);
        if (ypv.k().b4() != null) {
            this.f5309c.setText(ypv.k().b4().quitLiveStayConfig.popupContent);
            if (liveRoomSuggestBean.getLiveQuitPopup() != null) {
                this.f5310d.setText(liveRoomSuggestBean.getLiveQuitPopup().customContent);
            }
        }
        this.f5312f.Z(m6656S(ugtVar, liveRoomSuggestBean));
        cwf0 cwf0Var = new cwf0("p_live_exit_popup", getClass().getSimpleName());
        cwf0Var.i();
        cwf0Var.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f5309c = findViewById(g5c0.f10912N6);
        this.f5310d = findViewById(g5c0.f11034b1);
        this.f5311e = findViewById(g5c0.f10807C0);
        m6655r();
    }

    public LiveRoomSuggestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomSuggestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
