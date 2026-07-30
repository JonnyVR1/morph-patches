package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class i5h0 extends ap0 {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f111591a;

    /* JADX INFO: renamed from: b */
    public View f111592b;

    public i5h0(AnimEffectPlayer animEffectPlayer, View view) {
        this.f111591a = animEffectPlayer;
        this.f111592b = view;
    }

    @Override // p149l.ap0
    /* JADX INFO: renamed from: a */
    public void mo72837a(@NotNull String str) {
        m134486i(this.f111592b, true);
        m134486i(this.f111591a, false);
    }

    @Override // p149l.ap0
    /* JADX INFO: renamed from: b */
    public void mo69562b() {
        super.mo69562b();
        m134486i(this.f111592b, true);
        m134486i(this.f111591a, false);
    }

    @Override // p149l.ap0
    /* JADX INFO: renamed from: g */
    public void mo69603g() {
        super.mo69603g();
        m134486i(this.f111592b, false);
        m134486i(this.f111591a, true);
    }

    /* JADX INFO: renamed from: i */
    public final void m134486i(View view, boolean z) {
        if (view != null) {
            xdl0.m208345M0(view, z);
        }
    }
}
