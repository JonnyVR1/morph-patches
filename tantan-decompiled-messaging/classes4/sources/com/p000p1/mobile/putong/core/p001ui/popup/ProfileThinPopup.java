package com.p000p1.mobile.putong.core.p001ui.popup;

import android.app.Activity;
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
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.ejj;
import l.mep0;
import l.qib0;
import l.rzb0;
import l.t100;
import l.u4e;
import l.uua0;
import l.vtd;
import v.VButton_FakeShadow;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileThinPopup extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LinearLayout f666c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f667d;

    /* JADX INFO: renamed from: e */
    public ProfileThinPopup_LinearLayout f668e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f669f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f670g;

    /* JADX INFO: renamed from: h */
    public VText f671h;

    /* JADX INFO: renamed from: i */
    public ProfileThinPopup_MovableImage f672i;

    /* JADX INFO: renamed from: j */
    public ProfileThinPopup_MovableImage f673j;

    /* JADX INFO: renamed from: k */
    public ProfileThinPopup_MovableImage f674k;

    /* JADX INFO: renamed from: l */
    public ProfileThinPopup_MovableImage f675l;

    /* JADX INFO: renamed from: m */
    public ProfileThinPopup_MovableImage f676m;

    /* JADX INFO: renamed from: n */
    public ProfileThinPopup_MovableImage f677n;

    /* JADX INFO: renamed from: o */
    public boolean f678o = false;

    /* JADX INFO: renamed from: p */
    public Handler f679p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.popup.ProfileThinPopup$a */
    public class ViewTreeObserverOnPreDrawListenerC0040a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver f680a;

        public ViewTreeObserverOnPreDrawListenerC0040a(ViewTreeObserver viewTreeObserver) {
            this.f680a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f680a.isAlive()) {
                this.f680a.removeOnPreDrawListener(this);
            }
            if (ProfileThinPopup.this.f678o) {
                return true;
            }
            ProfileThinPopup.this.f678o = true;
            ProfileThinPopup.this.f666c.setAlpha(0.0f);
            ProfileThinPopup.this.f666c.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(400L).start();
            ProfileThinPopup_LinearLayout profileThinPopup_LinearLayout = ProfileThinPopup.this.f668e;
            profileThinPopup_LinearLayout.setPivotX(profileThinPopup_LinearLayout.getMeasuredWidth() / 2);
            ProfileThinPopup_LinearLayout profileThinPopup_LinearLayout2 = ProfileThinPopup.this.f668e;
            profileThinPopup_LinearLayout2.setPivotY(profileThinPopup_LinearLayout2.getMeasuredHeight() * 2);
            ProfileThinPopup.this.f668e.setRotation(-30.0f);
            ProfileThinPopup.this.f668e.animate().alpha(1.0f).rotation(0.0f).setDuration(800L).translationX(0.0f).setInterpolator(new OvershootInterpolator()).start();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m886o2() {
        m898z2(this.f672i, 0.0f);
        this.f672i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m887p2() {
        m898z2(this.f673j, 0.182f);
        this.f673j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m888q2() {
        m898z2(this.f674k, 0.364f);
        this.f674k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m889r2() {
        m898z2(this.f675l, 0.545f);
        this.f675l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m890s2() {
        m898z2(this.f676m, 0.727f);
        this.f676m.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m891u2() {
        m898z2(this.f677n, 0.909f);
        this.f677n.setVisibility(0);
    }

    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m893m2() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        overridePendingTransition(0, rzb0.r);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m892l2(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.jua0
            public final void call(Object obj) {
                this.f14025a.m896w2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public View m892l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uua0.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m894n2(View view) {
        startActivity(ProfileAct.m1176p2(this, CoreModule.H().userId(), "thin_popup", false, true));
        view.postDelayed(new Runnable() { // from class: l.kua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14532a.m893m2();
            }
        }, 200L);
    }

    public void onResumeLifecycle() {
        User userP9 = CoreModule.c.e0.p9();
        this.f671h.setOnClickListener(new View.OnClickListener() { // from class: l.lua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15068a.m897y2(view);
            }
        });
        this.f669f.setHierarchy(new ejj(getResources()).K(RoundingParams.b(t100.d(5.0f), t100.d(5.0f), 0.0f, 0.0f)).a());
        qib0.G.J0(this.f669f, userP9.fp().profileBig(), false);
        super.onResumeLifecycle();
    }

    public void onStartLifecycle() {
        ((PutongAct) this).pageHelper.o(u4e.b("passive", "alert", "alert_special", "card", "swipe_page", "swipe"));
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    public String pageId() {
        return "p_alert_profile_perfect_guide";
    }

    public void preCreateView(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.preCreateView(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m895v2() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, rzb0.p);
        animationLoadAnimation.setFillAfter(true);
        this.f670g.startAnimation(animationLoadAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m896w2(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f679p = new Handler();
        this.f670g.setOnClickListener(new View.OnClickListener() { // from class: l.mua0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15637a.m894n2(view);
            }
        });
        ViewTreeObserver viewTreeObserver = this.f666c.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0040a(viewTreeObserver));
        this.f679p.postDelayed(new Runnable() { // from class: l.nua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16200a.m886o2();
            }
        }, 900L);
        this.f679p.postDelayed(new Runnable() { // from class: l.oua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16795a.m887p2();
            }
        }, 1200L);
        this.f679p.postDelayed(new Runnable() { // from class: l.pua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17652a.m888q2();
            }
        }, 1500L);
        this.f679p.postDelayed(new Runnable() { // from class: l.qua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18235a.m889r2();
            }
        }, 1800L);
        this.f679p.postDelayed(new Runnable() { // from class: l.rua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18683a.m890s2();
            }
        }, 2100L);
        this.f679p.postDelayed(new Runnable() { // from class: l.sua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19294a.m891u2();
            }
        }, 2400L);
        this.f679p.postDelayed(new Runnable() { // from class: l.tua0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20381a.m895v2();
            }
        }, 1000L);
        if (NullChecker.a(bundle)) {
            ArrayList arrayList = (ArrayList) Act.globalLifeCycle_().get(Integer.valueOf(getTaskId()));
            mep0.Y0(arrayList.size() > 0 ? (Activity) ((Act.r) arrayList.get(0)).a.get() : null, this);
        }
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m897y2(View view) {
        m893m2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z2 */
    public final void m898z2(View view, float f) {
        int width = (int) (this.f669f.getWidth() * f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = (int) (((double) this.f669f.getHeight()) * 0.227d);
        layoutParams.height = (int) (((double) this.f669f.getHeight()) * 0.227d);
        layoutParams.setMargins((this.f668e.getLeft() - ((int) (((double) this.f669f.getWidth()) * 0.068d))) + width, this.f669f.getHeight() + vtd.a(this, 22.0f), 0, 0);
        view.setLayoutParams(layoutParams);
    }
}
