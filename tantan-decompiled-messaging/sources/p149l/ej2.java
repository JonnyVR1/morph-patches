package p149l;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ej2 implements s7m<lde> {

    /* JADX INFO: renamed from: a */
    public Act f91658a;

    /* JADX INFO: renamed from: b */
    public Boolean f91659b = Boolean.FALSE;

    public ej2(DropDownAct dropDownAct) {
        this.f91658a = dropDownAct;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f91658a;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f91658a;
    }

    /* JADX INFO: renamed from: b */
    public abstract Boolean mo116754b();

    /* JADX INFO: renamed from: c */
    public abstract void mo116755c();

    /* JADX INFO: renamed from: d */
    public abstract void mo116756d();

    /* JADX INFO: renamed from: e */
    public abstract void mo116757e();

    /* JADX INFO: renamed from: f */
    public abstract void mo116758f();

    /* JADX INFO: renamed from: i */
    public AnimatorSet m116759i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract View mo116760j();

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m116761k() {
        this.f91659b = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l */
    public void m116762l() {
        this.f91659b = Boolean.TRUE;
        e51.m114743H(getAct(), new Runnable() { // from class: l.dj2
            @Override // java.lang.Runnable
            public final void run() {
                this.f86476a.m116761k();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public abstract View mo116763m();

    /* JADX INFO: renamed from: n */
    public abstract void mo116764n(boolean z);

    /* JADX INFO: renamed from: p */
    public abstract void mo116765p();

    /* JADX INFO: renamed from: q */
    public abstract void mo116766q(OnlineMatchManager.QuickChatProduce quickChatProduce);
}
