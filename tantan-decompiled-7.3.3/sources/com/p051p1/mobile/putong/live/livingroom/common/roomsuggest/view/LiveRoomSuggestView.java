package com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.b0f;
import p153l.bnl0;
import p153l.byu;
import p153l.d3q;
import p153l.e4s;
import p153l.gjt;
import p153l.gt0;
import p153l.hk4;
import p153l.j0u;
import p153l.l4g0;
import p153l.mdc0;
import p153l.r6s;
import p153l.vit;
import p153l.ybu;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomSuggestView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f50115c;

    /* JADX INFO: renamed from: d */
    public VText f50116d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f50117e;

    /* JADX INFO: renamed from: f */
    public j0u f50118f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView$a */
    public class C12930a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f50119a;

        public C12930a(GridLayoutManager gridLayoutManager) {
            this.f50119a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return i == LiveRoomSuggestView.this.f50118f.getItemCount() + (-1) ? this.f50119a.m3318m() : LiveRoomSuggestView.this.f50118f.m68539K(i);
        }
    }

    public LiveRoomSuggestView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public static ArrayList<r6s> m74310T(List<BLiveSuggestLive> list, String str) {
        ArrayList<r6s> arrayList = new ArrayList<>();
        int i = 0;
        while (i < list.size()) {
            BLiveSuggestLive bLiveSuggestLive = list.get(i);
            i++;
            r6s r6sVar = new r6s();
            r6sVar.m180034r(1002);
            byu byuVar = new byu();
            byuVar.live = bLiveSuggestLive;
            ybu.m215111b(3, byuVar, "live-quit-popup");
            ybu.m215112c(byuVar, i, str);
            r6sVar.m180038v(byuVar);
            arrayList.add(r6sVar);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    private void m74311r() {
        this.f50118f = j0u.m143007H0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.m3327v(new C12930a(gridLayoutManager));
        this.f50117e.setLayoutManager(gridLayoutManager);
        this.f50117e.setAdapter(this.f50118f);
    }

    /* JADX INFO: renamed from: S */
    public List<d3q<?>> m74312S(vit vitVar, LiveRoomSuggestBean liveRoomSuggestBean) {
        ArrayList arrayList = new ArrayList();
        if (liveRoomSuggestBean.getLiveQuitPopup() != null && liveRoomSuggestBean.getLiveQuitPopup().level2SuggestedLives != null && liveRoomSuggestBean.getLiveQuitPopup().level2SuggestedLives.size() != 0) {
            arrayList.add(new gjt(liveRoomSuggestBean.getLiveQuitPopup(), vitVar));
        }
        ArrayList<r6s> arrayListM74310T = m74310T(liveRoomSuggestBean.getSuggestedLives(), "p_live_exit_popup");
        hk4 hk4Var = new hk4(vitVar);
        hk4Var.m135617c(1);
        arrayList.addAll(e4s.m119474b(hk4Var, arrayListM74310T));
        arrayList.add(new b0f());
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public void m74313V() {
        Animator animatorM132171q = gt0.m132171q(this, "translationX", -bnl0.m105592y0(), 0.0f);
        animatorM132171q.setDuration(300L);
        gt0.m132176v(animatorM132171q, new Runnable() { // from class: l.kjt
            @Override // java.lang.Runnable
            public final void run() {
                this.f127140a.m74314W();
            }
        });
        animatorM132171q.start();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m74314W() {
        setVisibility(0);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m74315X() {
        setTranslationX(-bnl0.m105592y0());
        setAlpha(1.0f);
        setVisibility(8);
    }

    /* JADX INFO: renamed from: Y */
    public void m74316Y() {
        Animator animatorM132178x = gt0.m132178x(300L, gt0.m132171q(this, "translationX", 0.0f, (-bnl0.m105592y0()) / 2.0f), gt0.m132168n(this, LinearLayout.ALPHA, 1.0f, 0.0f));
        gt0.m132160f(animatorM132178x, new Runnable() { // from class: l.jjt
            @Override // java.lang.Runnable
            public final void run() {
                this.f121240a.m74315X();
            }
        });
        animatorM132178x.start();
    }

    /* JADX INFO: renamed from: Z */
    public void m74317Z(vit vitVar, LiveRoomSuggestBean liveRoomSuggestBean) {
        if (liveRoomSuggestBean == null) {
            return;
        }
        setTranslationX(0.0f);
        if (zrv.m221193k().m203586b4() != null) {
            this.f50115c.setText(zrv.m221193k().m203586b4().quitLiveStayConfig.popupContent);
            if (liveRoomSuggestBean.getLiveQuitPopup() != null) {
                this.f50116d.setText(liveRoomSuggestBean.getLiveQuitPopup().customContent);
            }
        }
        this.f50118f.m68554Z(m74312S(vitVar, liveRoomSuggestBean));
        l4g0 l4g0Var = new l4g0("p_live_exit_popup", getClass().getSimpleName());
        l4g0Var.m152774i();
        l4g0Var.m152777l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50115c = (VText) findViewById(mdc0.f136007N6);
        this.f50116d = (VText) findViewById(mdc0.f136129b1);
        this.f50117e = (VRecyclerView) findViewById(mdc0.f135902C0);
        m74311r();
    }

    public LiveRoomSuggestView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomSuggestView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
