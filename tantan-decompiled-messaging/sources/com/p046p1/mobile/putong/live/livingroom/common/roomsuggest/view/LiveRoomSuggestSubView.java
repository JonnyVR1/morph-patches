package com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveQuitPopup;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.awu;
import p149l.cwf0;
import p149l.d1q;
import p149l.d2s;
import p149l.g5c0;
import p149l.ij4;
import p149l.iyt;
import p149l.q4s;
import p149l.ugt;
import p149l.x9u;
import p149l.xdl0;
import p149l.xye;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomSuggestSubView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f49259c;

    /* JADX INFO: renamed from: d */
    public VText f49260d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f49261e;

    /* JADX INFO: renamed from: f */
    public iyt f49262f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$a */
    public class C12764a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f49263a;

        public C12764a(GridLayoutManager gridLayoutManager) {
            this.f49263a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return i == LiveRoomSuggestSubView.this.f49262f.getItemCount() + (-1) ? this.f49263a.m3317m() : LiveRoomSuggestSubView.this.f49262f.m67356K(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$b */
    public class C12765b extends AnimatorListenerAdapter {
        public C12765b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LiveRoomSuggestSubView.this.setAlpha(1.0f);
            LiveRoomSuggestSubView.this.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$c */
    public class C12766c extends AnimatorListenerAdapter {
        public C12766c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            LiveRoomSuggestSubView.this.setVisibility(0);
        }
    }

    public LiveRoomSuggestSubView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m73116P(ugt ugtVar, View view) {
        if (ugtVar != null) {
            ugtVar.m193584b4(false, "p_live_exit_popup");
        }
    }

    /* JADX INFO: renamed from: S */
    public static ArrayList<q4s> m73118S(List<BLiveSuggestLive> list, String str) {
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
    private void m73119r() {
        this.f49262f = iyt.m138989H0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.m3326v(new C12764a(gridLayoutManager));
        this.f49261e.setLayoutManager(gridLayoutManager);
        this.f49261e.setAdapter(this.f49262f);
    }

    /* JADX INFO: renamed from: R */
    public List<d1q<?>> m73120R(ugt ugtVar, String str, List<BLiveSuggestLive> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList<q4s> arrayListM73118S = m73118S(list, str);
        ij4 ij4Var = new ij4(ugtVar);
        ij4Var.m136506c(1);
        ArrayList arrayList = new ArrayList(d2s.m109829b(ij4Var, arrayListM73118S));
        arrayList.add(new xye());
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public void m73121T() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationX", xdl0.m208412y0(), 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f49260d, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        objectAnimatorOfFloat3.setStartDelay(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f49259c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setStartDelay(150L);
        objectAnimatorOfFloat4.setDuration(150L);
        animatorSet.addListener(new C12766c());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: V */
    public void m73122V() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationX", 0.0f, xdl0.m208412y0());
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f49260d, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f49259c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(150L);
        animatorSet.addListener(new C12765b());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: W */
    public void m73123W(final ugt ugtVar, BLiveQuitPopup bLiveQuitPopup) {
        this.f49259c.setOnClickListener(new View.OnClickListener() { // from class: l.hht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveRoomSuggestSubView.m73116P(ugtVar, view);
            }
        });
        this.f49260d.setText(bLiveQuitPopup.recommendPolicyName);
        this.f49262f.m67371Z(m73120R(ugtVar, bLiveQuitPopup.pageViewId, bLiveQuitPopup.level2SuggestedLives));
        cwf0 cwf0Var = new cwf0(bLiveQuitPopup.pageViewId, getClass().getSimpleName());
        cwf0Var.m109033i();
        cwf0Var.m109036l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49259c = (VImage) findViewById(g5c0.f100656C);
        this.f49260d = (VText) findViewById(g5c0.f100959i6);
        this.f49261e = (VRecyclerView) findViewById(g5c0.f100949h6);
        m73119r();
    }

    public LiveRoomSuggestSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomSuggestSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
