package com.p000p1.mobile.putong.account.p002ui.account;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.remote_config.b;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.j760;
import l.otb;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import p006l.b3f0;
import p006l.c3f0;
import p006l.eje;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class SignInBaseActMVP<Presenter extends b3f0, ViewModel extends c3f0> extends AccountBaseAct {
    public static final String AFTER_SIGNIN = "after_signin";
    public static final int AFTER_SIGNIN_NOTHING = 0;
    private View[] filterViews;
    protected Presenter signInPresenter;
    protected ViewModel signInViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$0() {
        eje.m14574h().m14584m();
        act().startActivity(WelcomeAct.m1130D2(((Act) this).act, true));
        ((Act) this).act.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$debugItems$1() {
        b.a(this);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.Y("back to welcomeAct", new d30() { // from class: l.n2f0
            public final void call() {
                this.f17455a.lambda$debugItems$0();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show RemoteConfig", new d30() { // from class: l.o2f0
            public final void call() {
                this.f17991a.lambda$debugItems$1();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && shouldHideKeyBord(motionEvent)) {
            ((Act) this).act.hideInput();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract Presenter generateSignInPresenter();

    public abstract ViewModel generateSignInViewModel();

    @NotNull
    public /* bridge */ /* synthetic */ otb getDefaultViewModelCreationExtras() {
        return super/*androidx.lifecycle.e*/.getDefaultViewModelCreationExtras();
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.signInPresenter = (Presenter) generateSignInPresenter();
        ViewModel viewmodel = (ViewModel) generateSignInViewModel();
        this.signInViewModel = viewmodel;
        this.signInPresenter.C(viewmodel);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    @CallSuper
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.signInPresenter.m12513t0(getIntent());
    }

    public void setFilterView(View... viewArr) {
        this.filterViews = viewArr;
    }

    public boolean shouldHideKeyBord(MotionEvent motionEvent) {
        if (!NullChecker.a(this.filterViews)) {
            return false;
        }
        for (View view : this.filterViews) {
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            int height = view.getHeight() + i2 + xdl0.F0();
            int width = view.getWidth() + i;
            if (motionEvent.getX() > i && motionEvent.getX() < width && motionEvent.getY() > i2 && motionEvent.getY() < height) {
                return false;
            }
        }
        return true;
    }
}
