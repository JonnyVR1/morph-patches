package com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveQuitPopup;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.b0f;
import p153l.bnl0;
import p153l.byu;
import p153l.d3q;
import p153l.e4s;
import p153l.hk4;
import p153l.j0u;
import p153l.l4g0;
import p153l.mdc0;
import p153l.r6s;
import p153l.vit;
import p153l.ybu;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomSuggestSubView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f50107c;

    /* JADX INFO: renamed from: d */
    public VText f50108d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f50109e;

    /* JADX INFO: renamed from: f */
    public j0u f50110f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$a */
    public class C12927a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f50111a;

        public C12927a(GridLayoutManager gridLayoutManager) {
            this.f50111a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return i == LiveRoomSuggestSubView.this.f50110f.getItemCount() + (-1) ? this.f50111a.m3318m() : LiveRoomSuggestSubView.this.f50110f.m68539K(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$b */
    public class C12928b extends AnimatorListenerAdapter {
        public C12928b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LiveRoomSuggestSubView.this.setAlpha(1.0f);
            LiveRoomSuggestSubView.this.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView$c */
    public class C12929c extends AnimatorListenerAdapter {
        public C12929c() {
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
    public static /* synthetic */ void m74299P(vit vitVar, View view) {
        if (vitVar != null) {
            vitVar.m201424b4(false, "p_live_exit_popup");
        }
    }

    /* JADX INFO: renamed from: S */
    public static ArrayList<r6s> m74301S(List<BLiveSuggestLive> list, String str) {
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
    private void m74302r() {
        this.f50110f = j0u.m143007H0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6);
        gridLayoutManager.m3327v(new C12927a(gridLayoutManager));
        this.f50109e.setLayoutManager(gridLayoutManager);
        this.f50109e.setAdapter(this.f50110f);
    }

    /* JADX INFO: renamed from: R */
    public List<d3q<?>> m74303R(vit vitVar, String str, List<BLiveSuggestLive> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList<r6s> arrayListM74301S = m74301S(list, str);
        hk4 hk4Var = new hk4(vitVar);
        hk4Var.m135617c(1);
        ArrayList arrayList = new ArrayList(e4s.m119474b(hk4Var, arrayListM74301S));
        arrayList.add(new b0f());
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public void m74304T() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationX", bnl0.m105592y0(), 0.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50108d, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        objectAnimatorOfFloat3.setStartDelay(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50107c, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat4.setStartDelay(150L);
        objectAnimatorOfFloat4.setDuration(150L);
        animatorSet.addListener(new C12929c());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: V */
    public void m74305V() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationX", 0.0f, bnl0.m105592y0());
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f50108d, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f50107c, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(150L);
        animatorSet.addListener(new C12928b());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: W */
    public void m74306W(final vit vitVar, BLiveQuitPopup bLiveQuitPopup) {
        this.f50107c.setOnClickListener(new View.OnClickListener() { // from class: l.ijt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveRoomSuggestSubView.m74299P(vitVar, view);
            }
        });
        this.f50108d.setText(bLiveQuitPopup.recommendPolicyName);
        this.f50110f.m68554Z(m74303R(vitVar, bLiveQuitPopup.pageViewId, bLiveQuitPopup.level2SuggestedLives));
        l4g0 l4g0Var = new l4g0(bLiveQuitPopup.pageViewId, getClass().getSimpleName());
        l4g0Var.m152774i();
        l4g0Var.m152777l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50107c = (VImage) findViewById(mdc0.f135901C);
        this.f50108d = (VText) findViewById(mdc0.f136204i6);
        this.f50109e = (VRecyclerView) findViewById(mdc0.f136194h6);
        m74302r();
    }

    public LiveRoomSuggestSubView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRoomSuggestSubView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
