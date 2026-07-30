package com.p046p1.mobile.putong.core.p053ui.popup;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.ejj;
import p149l.mep0;
import p149l.qib0;
import p149l.rzb0;
import p149l.t100;
import p149l.u4e;
import p149l.uua0;
import p149l.vtd;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileThinPopup extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LinearLayout f32844c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f32845d;

    /* JADX INFO: renamed from: e */
    public ProfileThinPopup_LinearLayout f32846e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32847f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f32848g;

    /* JADX INFO: renamed from: h */
    public VText f32849h;

    /* JADX INFO: renamed from: i */
    public ProfileThinPopup_MovableImage f32850i;

    /* JADX INFO: renamed from: j */
    public ProfileThinPopup_MovableImage f32851j;

    /* JADX INFO: renamed from: k */
    public ProfileThinPopup_MovableImage f32852k;

    /* JADX INFO: renamed from: l */
    public ProfileThinPopup_MovableImage f32853l;

    /* JADX INFO: renamed from: m */
    public ProfileThinPopup_MovableImage f32854m;

    /* JADX INFO: renamed from: n */
    public ProfileThinPopup_MovableImage f32855n;

    /* JADX INFO: renamed from: o */
    public boolean f32856o = false;

    /* JADX INFO: renamed from: p */
    public Handler f32857p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.popup.ProfileThinPopup$a */
    public class ViewTreeObserverOnPreDrawListenerC8615a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver f32858a;

        public ViewTreeObserverOnPreDrawListenerC8615a(ViewTreeObserver viewTreeObserver) {
            this.f32858a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f32858a.isAlive()) {
                this.f32858a.removeOnPreDrawListener(this);
            }
            if (ProfileThinPopup.this.f32856o) {
                return true;
            }
            ProfileThinPopup.this.f32856o = true;
            ProfileThinPopup.this.f32844c.setAlpha(0.0f);
            ProfileThinPopup.this.f32844c.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(400L).start();
            ProfileThinPopup_LinearLayout profileThinPopup_LinearLayout = ProfileThinPopup.this.f32846e;
            profileThinPopup_LinearLayout.setPivotX(profileThinPopup_LinearLayout.getMeasuredWidth() / 2);
            ProfileThinPopup_LinearLayout profileThinPopup_LinearLayout2 = ProfileThinPopup.this.f32846e;
            profileThinPopup_LinearLayout2.setPivotY(profileThinPopup_LinearLayout2.getMeasuredHeight() * 2);
            ProfileThinPopup.this.f32846e.setRotation(-30.0f);
            ProfileThinPopup.this.f32846e.animate().alpha(1.0f).rotation(0.0f).setDuration(800L).translationX(0.0f).setInterpolator(new OvershootInterpolator()).start();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m50451o2() {
        m50463z2(this.f32850i, 0.0f);
        this.f32850i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m50452p2() {
        m50463z2(this.f32851j, 0.182f);
        this.f32851j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m50453q2() {
        m50463z2(this.f32852k, 0.364f);
        this.f32852k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m50454r2() {
        m50463z2(this.f32853l, 0.545f);
        this.f32853l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m50455s2() {
        m50463z2(this.f32854m, 0.727f);
        this.f32854m.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m50456u2() {
        m50463z2(this.f32855n, 0.909f);
        this.f32855n.setVisibility(0);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m50458m2() {
        super.m50458m2();
        overridePendingTransition(0, rzb0.f161646r);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m50457l2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.jua0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119751a.m50461w2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public View m50457l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uua0.m195330b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m50459n2(View view) {
        startActivity(ProfileAct.m50738p2(this, CoreModule.m29931H().userId(), CoreStaticData.ProfileFromType.FROM_THIN_POPUP, false, true));
        view.postDelayed(new Runnable() { // from class: l.kua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f124671a.m50458m2();
            }
        }, 200L);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        this.f32849h.setOnClickListener(new View.OnClickListener() { // from class: l.lua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130040a.m50462y2(view);
            }
        });
        this.f32847f.setHierarchy(new ejj(getResources()).m116870K(RoundingParams.m8248b(t100.m186890d(5.0f), t100.m186890d(5.0f), 0.0f, 0.0f)).m116872a());
        qib0.f154691G.m102327J0(this.f32847f, userM169527p9.m60124fp().profileBig(), false);
        super.onResumeLifecycle();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.pageHelper.m109039o(u4e.m191727b("passive", "alert", "alert_special", "card", "swipe_page", "swipe"));
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_alert_profile_perfect_guide";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m50460v2() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, rzb0.f161644p);
        animationLoadAnimation.setFillAfter(true);
        this.f32848g.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m50461w2(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f32857p = new Handler();
        this.f32848g.setOnClickListener(new View.OnClickListener() { // from class: l.mua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135775a.m50459n2(view);
            }
        });
        ViewTreeObserver viewTreeObserver = this.f32844c.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8615a(viewTreeObserver));
        this.f32857p.postDelayed(new Runnable() { // from class: l.nua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140590a.m50451o2();
            }
        }, 900L);
        this.f32857p.postDelayed(new Runnable() { // from class: l.oua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f145679a.m50452p2();
            }
        }, 1200L);
        this.f32857p.postDelayed(new Runnable() { // from class: l.pua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151263a.m50453q2();
            }
        }, 1500L);
        this.f32857p.postDelayed(new Runnable() { // from class: l.qua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156463a.m50454r2();
            }
        }, 1800L);
        this.f32857p.postDelayed(new Runnable() { // from class: l.rua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161043a.m50455s2();
            }
        }, 2100L);
        this.f32857p.postDelayed(new Runnable() { // from class: l.sua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f166460a.m50456u2();
            }
        }, 2400L);
        this.f32857p.postDelayed(new Runnable() { // from class: l.tua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172160a.m50460v2();
            }
        }, 1000L);
        if (NullChecker.m81303a(bundle)) {
            ArrayList<Act.C4299r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getTaskId()));
            mep0.m154297Y0(arrayList.size() > 0 ? arrayList.get(0).f15343a.get() : null, this);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m50462y2(View view) {
        m50458m2();
    }

    /* JADX INFO: renamed from: z2 */
    public final void m50463z2(View view, float f) {
        int width = (int) (this.f32847f.getWidth() * f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = (int) (((double) this.f32847f.getHeight()) * 0.227d);
        layoutParams.height = (int) (((double) this.f32847f.getHeight()) * 0.227d);
        layoutParams.setMargins((this.f32846e.getLeft() - ((int) (((double) this.f32847f.getWidth()) * 0.068d))) + width, this.f32847f.getHeight() + vtd.m199996a(this, 22.0f), 0, 0);
        view.setLayoutParams(layoutParams);
    }
}
