package p149l;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2066x;
import com.google.android.exoplayer2.InterfaceC2067y;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.source.InterfaceC1965i;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class y6j0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public InterfaceC21314a f196572a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public fd2 f196573b;

    /* JADX INFO: renamed from: a */
    public final fd2 m213145a() {
        return (fd2) p11.m167015i(this.f196573b);
    }

    /* JADX INFO: renamed from: c */
    public w6j0 mo151245c() {
        return w6j0.f184850A;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public InterfaceC2067y.a mo151246d() {
        return null;
    }

    @CallSuper
    /* JADX INFO: renamed from: e */
    public void m213146e(InterfaceC21314a interfaceC21314a, fd2 fd2Var) {
        this.f196572a = interfaceC21314a;
        this.f196573b = fd2Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m213147f() {
        InterfaceC21314a interfaceC21314a = this.f196572a;
        if (interfaceC21314a != null) {
            interfaceC21314a.mo10199c();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m213148g(InterfaceC2066x interfaceC2066x) {
        InterfaceC21314a interfaceC21314a = this.f196572a;
        if (interfaceC21314a != null) {
            interfaceC21314a.mo10196b(interfaceC2066x);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean mo151247h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo166136i(@Nullable Object obj);

    @CallSuper
    /* JADX INFO: renamed from: j */
    public void mo151248j() {
        this.f196572a = null;
        this.f196573b = null;
    }

    /* JADX INFO: renamed from: k */
    public abstract z6j0 mo166137k(InterfaceC2067y[] interfaceC2067yArr, b6j0 b6j0Var, InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0) throws ExoPlaybackException;

    /* JADX INFO: renamed from: l.y6j0$a */
    public interface InterfaceC21314a {
        /* JADX INFO: renamed from: c */
        void mo10199c();

        /* JADX INFO: renamed from: b */
        default void mo10196b(InterfaceC2066x interfaceC2066x) {
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo151249l(C1818a c1818a) {
    }

    /* JADX INFO: renamed from: m */
    public void mo151250m(w6j0 w6j0Var) {
    }
}
