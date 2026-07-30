package com.p046p1.mobile.putong.account.p050ui.account;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.remote_config.C13099b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p149l.b3f0;
import p149l.c3f0;
import p149l.d30;
import p149l.eje;
import p149l.j760;
import p149l.otb;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SignInBaseActMVP<Presenter extends b3f0, ViewModel extends c3f0> extends AccountBaseAct {
    public static final String AFTER_SIGNIN = "after_signin";
    public static final int AFTER_SIGNIN_NOTHING = 0;
    private View[] filterViews;
    protected Presenter signInPresenter;
    protected ViewModel signInViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$0() {
        eje.m116824h().m116834m();
        act().startActivity(WelcomeAct.m29224D2(this.act, true));
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        C13099b.m79348a(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("back to welcomeAct", new d30() { // from class: l.n2f0
            @Override // p149l.d30
            public final void call() {
                this.f136827a.lambda$debugItems$0();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show RemoteConfig", new d30() { // from class: l.o2f0
            @Override // p149l.d30
            public final void call() {
                this.f141528a.lambda$debugItems$1();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && shouldHideKeyBord(motionEvent)) {
            this.act.hideInput();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract Presenter generateSignInPresenter();

    public abstract ViewModel generateSignInViewModel();

    @Override // androidx.lifecycle.InterfaceC0475e
    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.signInPresenter = (Presenter) generateSignInPresenter();
        ViewModel viewmodel = (ViewModel) generateSignInViewModel();
        this.signInViewModel = viewmodel;
        this.signInPresenter.mo51532C(viewmodel);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    @CallSuper
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.signInPresenter.m100090t0(getIntent());
    }

    public void setFilterView(View... viewArr) {
        this.filterViews = viewArr;
    }

    public boolean shouldHideKeyBord(MotionEvent motionEvent) {
        if (!NullChecker.m81303a(this.filterViews)) {
            return false;
        }
        for (View view : this.filterViews) {
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int height = view.getHeight() + i2 + xdl0.m208331F0();
            int width = view.getWidth() + i;
            if (motionEvent.getX() > i && motionEvent.getX() < width && motionEvent.getY() > i2 && motionEvent.getY() < height) {
                return false;
            }
        }
        return true;
    }
}
