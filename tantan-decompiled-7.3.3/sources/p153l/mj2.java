package p153l;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;

/* JADX INFO: loaded from: classes12.dex */
public abstract class mj2 implements iam<pee> {

    /* JADX INFO: renamed from: a */
    public Act f137050a;

    /* JADX INFO: renamed from: b */
    public Boolean f137051b = Boolean.FALSE;

    public mj2(DropDownAct dropDownAct) {
        this.f137050a = dropDownAct;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f137050a;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f137050a;
    }

    /* JADX INFO: renamed from: b */
    public abstract Boolean mo149469b();

    /* JADX INFO: renamed from: c */
    public abstract void mo149471c();

    /* JADX INFO: renamed from: d */
    public abstract void mo149473d();

    /* JADX INFO: renamed from: e */
    public abstract void mo149475e();

    /* JADX INFO: renamed from: f */
    public abstract void mo149477f();

    /* JADX INFO: renamed from: i */
    public AnimatorSet m158562i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract View mo149482j();

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m158563k() {
        this.f137051b = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: l */
    public void m158564l() {
        this.f137051b = Boolean.TRUE;
        l51.m152888H(getAct(), new Runnable() { // from class: l.lj2
            @Override // java.lang.Runnable
            public final void run() {
                this.f132294a.m158563k();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: m */
    public abstract View mo149486m();

    /* JADX INFO: renamed from: n */
    public abstract void mo149488n(boolean z);

    /* JADX INFO: renamed from: p */
    public abstract void mo149491p();

    /* JADX INFO: renamed from: q */
    public abstract void mo149493q(OnlineMatchManager.QuickChatProduce quickChatProduce);
}
