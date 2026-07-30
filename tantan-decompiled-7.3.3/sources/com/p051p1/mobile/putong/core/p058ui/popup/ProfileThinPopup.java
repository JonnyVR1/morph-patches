package com.p051p1.mobile.putong.core.p058ui.popup;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VText;
import p153l.i6e;
import p153l.jvd;
import p153l.qa00;
import p153l.qnp0;
import p153l.uqb0;
import p153l.x7c0;
import p153l.xlj;
import p153l.y20;
import p153l.y2b0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileThinPopup extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LinearLayout f33692c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f33693d;

    /* JADX INFO: renamed from: e */
    public ProfileThinPopup_LinearLayout f33694e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f33695f;

    /* JADX INFO: renamed from: g */
    public VButton_FakeShadow f33696g;

    /* JADX INFO: renamed from: h */
    public VText f33697h;

    /* JADX INFO: renamed from: i */
    public ProfileThinPopup_MovableImage f33698i;

    /* JADX INFO: renamed from: j */
    public ProfileThinPopup_MovableImage f33699j;

    /* JADX INFO: renamed from: k */
    public ProfileThinPopup_MovableImage f33700k;

    /* JADX INFO: renamed from: l */
    public ProfileThinPopup_MovableImage f33701l;

    /* JADX INFO: renamed from: m */
    public ProfileThinPopup_MovableImage f33702m;

    /* JADX INFO: renamed from: n */
    public ProfileThinPopup_MovableImage f33703n;

    /* JADX INFO: renamed from: o */
    public boolean f33704o = false;

    /* JADX INFO: renamed from: p */
    public Handler f33705p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.popup.ProfileThinPopup$a */
    public class ViewTreeObserverOnPreDrawListenerC8778a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver f33706a;

        public ViewTreeObserverOnPreDrawListenerC8778a(ViewTreeObserver viewTreeObserver) {
            this.f33706a = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f33706a.isAlive()) {
                this.f33706a.removeOnPreDrawListener(this);
            }
            if (ProfileThinPopup.this.f33704o) {
                return true;
            }
            ProfileThinPopup.this.f33704o = true;
            ProfileThinPopup.this.f33692c.setAlpha(0.0f);
            ProfileThinPopup.this.f33692c.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(400L).start();
            ProfileThinPopup_LinearLayout profileThinPopup_LinearLayout = ProfileThinPopup.this.f33694e;
            profileThinPopup_LinearLayout.setPivotX(profileThinPopup_LinearLayout.getMeasuredWidth() / 2);
            ProfileThinPopup_LinearLayout profileThinPopup_LinearLayout2 = ProfileThinPopup.this.f33694e;
            profileThinPopup_LinearLayout2.setPivotY(profileThinPopup_LinearLayout2.getMeasuredHeight() * 2);
            ProfileThinPopup.this.f33694e.setRotation(-30.0f);
            ProfileThinPopup.this.f33694e.animate().alpha(1.0f).rotation(0.0f).setDuration(800L).translationX(0.0f).setInterpolator(new OvershootInterpolator()).start();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m51634p2() {
        m51640A2(this.f33698i, 0.0f);
        this.f33698i.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public /* synthetic */ void m51635q2() {
        m51640A2(this.f33699j, 0.182f);
        this.f33699j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public /* synthetic */ void m51636r2() {
        m51640A2(this.f33700k, 0.364f);
        this.f33700k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public /* synthetic */ void m51637s2() {
        m51640A2(this.f33701l, 0.545f);
        this.f33701l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public /* synthetic */ void m51638u2() {
        m51640A2(this.f33702m, 0.727f);
        this.f33702m.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m51639v2() {
        m51640A2(this.f33703n, 0.909f);
        this.f33703n.setVisibility(0);
    }

    /* JADX INFO: renamed from: A2 */
    public final void m51640A2(View view, float f) {
        int width = (int) (this.f33695f.getWidth() * f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = (int) (((double) this.f33695f.getHeight()) * 0.227d);
        layoutParams.height = (int) (((double) this.f33695f.getHeight()) * 0.227d);
        layoutParams.setMargins((this.f33694e.getLeft() - ((int) (((double) this.f33695f.getWidth()) * 0.068d))) + width, this.f33695f.getHeight() + jvd.m147011a(this, 22.0f), 0, 0);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m51642n2() {
        super.m51642n2();
        overridePendingTransition(0, x7c0.f192703r);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51641m2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.n2b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139855a.m51645y2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public View m51641m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y2b0.m214049b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m51643o2(View view) {
        startActivity(ProfileAct.m51922q2(this, CoreModule.m30929H().userId(), CoreStaticData.ProfileFromType.FROM_THIN_POPUP, false, true));
        view.postDelayed(new Runnable() { // from class: l.o2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144736a.m51642n2();
            }
        }, 200L);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        this.f33697h.setOnClickListener(new View.OnClickListener() { // from class: l.p2b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150259a.m51646z2(view);
            }
        });
        this.f33695f.setHierarchy(new xlj(getResources()).m211636K(RoundingParams.m8302b(qa00.m175859d(5.0f), qa00.m175859d(5.0f), 0.0f, 0.0f)).m211638a());
        uqb0.f180374G.m127111J0(this.f33695f, userM116600p9.m61308fp().profileBig(), false);
        super.onResumeLifecycle();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.pageHelper.m152780o(i6e.m138810b("passive", "alert", "alert_special", "card", "swipe_page", "swipe"));
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_alert_profile_perfect_guide";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m51644w2() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, x7c0.f192701p);
        animationLoadAnimation.setFillAfter(true);
        this.f33696g.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m51645y2(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f33705p = new Handler();
        this.f33696g.setOnClickListener(new View.OnClickListener() { // from class: l.q2b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155316a.m51643o2(view);
            }
        });
        ViewTreeObserver viewTreeObserver = this.f33692c.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8778a(viewTreeObserver));
        this.f33705p.postDelayed(new Runnable() { // from class: l.r2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160928a.m51634p2();
            }
        }, 900L);
        this.f33705p.postDelayed(new Runnable() { // from class: l.s2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f165874a.m51635q2();
            }
        }, 1200L);
        this.f33705p.postDelayed(new Runnable() { // from class: l.t2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171731a.m51636r2();
            }
        }, 1500L);
        this.f33705p.postDelayed(new Runnable() { // from class: l.u2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f177200a.m51637s2();
            }
        }, 1800L);
        this.f33705p.postDelayed(new Runnable() { // from class: l.v2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182087a.m51638u2();
            }
        }, 2100L);
        this.f33705p.postDelayed(new Runnable() { // from class: l.w2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186892a.m51639v2();
            }
        }, 2400L);
        this.f33705p.postDelayed(new Runnable() { // from class: l.x2b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192137a.m51644w2();
            }
        }, 1000L);
        if (NullChecker.m82486a(bundle)) {
            ArrayList<Act.C4450r> arrayList = Act.globalLifeCycle_().get(Integer.valueOf(getTaskId()));
            qnp0.m177256Y0(arrayList.size() > 0 ? arrayList.get(0).f16062a.get() : null, this);
        }
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m51646z2(View view) {
        m51642n2();
    }
}
