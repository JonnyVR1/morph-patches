package com.p051p1.mobile.putong.account.p055ui.account;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.remote_config.C13262b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.cvb;
import p153l.ibf0;
import p153l.ike;
import p153l.jbf0;
import p153l.jyb;
import p153l.pf60;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SignInBaseActMVP<Presenter extends ibf0, ViewModel extends jbf0> extends AccountBaseAct {
    public static final String AFTER_SIGNIN = "after_signin";
    public static final int AFTER_SIGNIN_NOTHING = 0;
    private View[] filterViews;
    protected Presenter signInPresenter;
    protected ViewModel signInViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$0() {
        ike.m140276h().m140286m();
        act().startActivity(WelcomeAct.m30223E2(this.act, true));
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        C13262b.m80531a(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("back to welcomeAct", new x20() { // from class: l.uaf0
            @Override // p153l.x20
            public final void call() {
                this.f178205a.lambda$debugItems$0();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show RemoteConfig", new x20() { // from class: l.vaf0
            @Override // p153l.x20
            public final void call() {
                this.f183088a.lambda$debugItems$1();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && shouldHideKeyBord(motionEvent)) {
            this.act.hideInput();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract Presenter generateSignInPresenter();

    public abstract ViewModel generateSignInViewModel();

    @Override // androidx.lifecycle.InterfaceC0476e
    @NotNull
    public /* bridge */ /* synthetic */ cvb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.signInPresenter = (Presenter) generateSignInPresenter();
        ViewModel viewmodel = (ViewModel) generateSignInViewModel();
        this.signInViewModel = viewmodel;
        this.signInPresenter.mo52715C(viewmodel);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    @CallSuper
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.signInPresenter.m139333t0(getIntent());
    }

    public void setFilterView(View... viewArr) {
        this.filterViews = viewArr;
    }

    public boolean shouldHideKeyBord(MotionEvent motionEvent) {
        if (!NullChecker.m82486a(this.filterViews)) {
            return false;
        }
        for (View view : this.filterViews) {
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int height = view.getHeight() + i2 + bnl0.m105511F0();
            int width = view.getWidth() + i;
            if (motionEvent.getX() > i && motionEvent.getX() < width && motionEvent.getY() > i2 && motionEvent.getY() < height) {
                return false;
            }
        }
        return true;
    }
}
