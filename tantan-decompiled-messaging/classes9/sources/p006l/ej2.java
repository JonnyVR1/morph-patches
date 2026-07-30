package p006l;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import l.e51;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class ej2 implements s7m<lde> {

    /* JADX INFO: renamed from: a */
    public Act f11175a;

    /* JADX INFO: renamed from: b */
    public Boolean f11176b = Boolean.FALSE;

    public ej2(DropDownAct dropDownAct) {
        this.f11175a = dropDownAct;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14555C0() {
        return this.f11175a;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f11175a;
    }

    /* JADX INFO: renamed from: b */
    public abstract Boolean mo14556b();

    /* JADX INFO: renamed from: c */
    public abstract void mo14557c();

    /* JADX INFO: renamed from: d */
    public abstract void mo14558d();

    /* JADX INFO: renamed from: e */
    public abstract void mo14559e();

    /* JADX INFO: renamed from: f */
    public abstract void mo14560f();

    /* JADX INFO: renamed from: i */
    public AnimatorSet m14561i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract View mo14562j();

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m14563k() {
        this.f11176b = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l */
    public void m14564l() {
        this.f11176b = Boolean.TRUE;
        e51.H(act(), new Runnable() { // from class: l.dj2
            @Override // java.lang.Runnable
            public final void run() {
                this.f10419a.m14563k();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public abstract View mo14565m();

    /* JADX INFO: renamed from: n */
    public abstract void mo14566n(boolean z);

    /* JADX INFO: renamed from: p */
    public abstract void mo14567p();

    /* JADX INFO: renamed from: q */
    public abstract void mo14568q(OnlineMatchManager.QuickChatProduce quickChatProduce);
}
