package com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p1.mobile.putong.live.base.data.BLiveQuitPopup;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import java.util.ArrayList;
import java.util.List;
import l.awu;
import l.cwf0;
import l.d1q;
import l.d2s;
import l.ij4;
import l.iyt;
import l.q4s;
import l.x9u;
import l.xdl0;
import p002l.g5c0;
import p002l.ugt;
import p002l.xye;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveRoomSuggestSubView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f5301c;

    /* JADX INFO: renamed from: d */
    public VText f5302d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f5303e;

    /* JADX INFO: renamed from: f */
    public iyt f5304f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$a */
    public class C0353a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f5305a;

        public C0353a(GridLayoutManager gridLayoutManager) {
            this.f5305a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m6650f(int i) {
            return i == LiveRoomSuggestSubView.this.f5304f.getItemCount() + (-1) ? this.f5305a.m() : LiveRoomSuggestSubView.this.f5304f.K(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$b */
    public class C0354b extends AnimatorListenerAdapter {
        public C0354b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LiveRoomSuggestSubView.this.setAlpha(1.0f);
            LiveRoomSuggestSubView.this.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$c */
    public class C0355c extends AnimatorListenerAdapter {
        public C0355c() {
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
    public static /* synthetic */ void m6642P(ugt ugtVar, View view) {
        if (ugtVar != null) {
            ugtVar.m23468b4(false, "p_live_exit_popup");
        }
    }

    /* JADX INFO: renamed from: S */
    public static ArrayList<q4s> m6644S(List<BLiveSuggestLive> list, String str) {
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
    private void m6645r() {
        this.f5304f = iyt.H0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.v(new C0353a(gridLayoutManager));
        this.f5303e.setLayoutManager(gridLayoutManager);
        this.f5303e.setAdapter(this.f5304f);
    }

    /* JADX INFO: renamed from: R */
    public List<d1q<?>> m6646R(ugt ugtVar, String str, List<BLiveSuggestLive> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList<q4s> arrayListM6644S = m6644S(list, str);
        ij4 ij4Var = new ij4(ugtVar);
        ij4Var.c(1);
        ArrayList arrayList = new ArrayList(d2s.b(ij4Var, arrayListM6644S));
        arrayList.add(new xye());
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public void m6647T() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationX", xdl0.y0(), 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f5302d, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        objectAnimatorOfFloat3.setStartDelay(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f5301c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setStartDelay(150L);
        objectAnimatorOfFloat4.setDuration(150L);
        animatorSet.addListener(new C0355c());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: V */
    public void m6648V() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationX", 0.0f, xdl0.y0());
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f5302d, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f5301c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(150L);
        animatorSet.addListener(new C0354b());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: W */
    public void m6649W(final ugt ugtVar, BLiveQuitPopup bLiveQuitPopup) {
        this.f5301c.setOnClickListener(new View.OnClickListener() { // from class: l.hht
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveRoomSuggestSubView.m6642P(ugtVar, view);
            }
        });
        this.f5302d.setText(bLiveQuitPopup.recommendPolicyName);
        this.f5304f.Z(m6646R(ugtVar, bLiveQuitPopup.pageViewId, bLiveQuitPopup.level2SuggestedLives));
        cwf0 cwf0Var = new cwf0(bLiveQuitPopup.pageViewId, getClass().getSimpleName());
        cwf0Var.i();
        cwf0Var.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f5301c = findViewById(g5c0.f10806C);
        this.f5302d = findViewById(g5c0.f11109i6);
        this.f5303e = findViewById(g5c0.f11099h6);
        m6645r();
    }

    public LiveRoomSuggestSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomSuggestSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
