package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class qdh0 extends wo0 {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f156733a;

    /* JADX INFO: renamed from: b */
    public View f156734b;

    public qdh0(AnimEffectPlayer animEffectPlayer, View view) {
        this.f156733a = animEffectPlayer;
        this.f156734b = view;
    }

    @Override // p153l.wo0
    /* JADX INFO: renamed from: a */
    public void mo74020a(@NotNull String str) {
        m176165i(this.f156734b, true);
        m176165i(this.f156733a, false);
    }

    @Override // p153l.wo0
    /* JADX INFO: renamed from: b */
    public void mo70745b() {
        super.mo70745b();
        m176165i(this.f156734b, true);
        m176165i(this.f156733a, false);
    }

    @Override // p153l.wo0
    /* JADX INFO: renamed from: g */
    public void mo70786g() {
        super.mo70786g();
        m176165i(this.f156734b, false);
        m176165i(this.f156733a, true);
    }

    /* JADX INFO: renamed from: i */
    public final void m176165i(View view, boolean z) {
        if (view != null) {
            bnl0.m105525M0(view, z);
        }
    }
}
