package p153l;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2089x;
import com.google.android.exoplayer2.InterfaceC2090y;
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.source.InterfaceC1988i;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class cgj0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public InterfaceC16249a f81681a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public md2 f81682b;

    /* JADX INFO: renamed from: a */
    public final md2 m109691a() {
        return (md2) w11.m204373i(this.f81682b);
    }

    /* JADX INFO: renamed from: c */
    public agj0 mo100064c() {
        return agj0.f71165A;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public InterfaceC2090y.a mo100065d() {
        return null;
    }

    @CallSuper
    /* JADX INFO: renamed from: e */
    public void m109692e(InterfaceC16249a interfaceC16249a, md2 md2Var) {
        this.f81681a = interfaceC16249a;
        this.f81682b = md2Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m109693f() {
        InterfaceC16249a interfaceC16249a = this.f81681a;
        if (interfaceC16249a != null) {
            interfaceC16249a.mo10253c();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m109694g(InterfaceC2089x interfaceC2089x) {
        InterfaceC16249a interfaceC16249a = this.f81681a;
        if (interfaceC16249a != null) {
            interfaceC16249a.mo10250b(interfaceC2089x);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean mo100066h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo109695i(@Nullable Object obj);

    @CallSuper
    /* JADX INFO: renamed from: j */
    public void mo100067j() {
        this.f81681a = null;
        this.f81682b = null;
    }

    /* JADX INFO: renamed from: k */
    public abstract dgj0 mo109696k(InterfaceC2090y[] interfaceC2090yArr, ffj0 ffj0Var, InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0) throws ExoPlaybackException;

    /* JADX INFO: renamed from: l.cgj0$a */
    public interface InterfaceC16249a {
        /* JADX INFO: renamed from: c */
        void mo10253c();

        /* JADX INFO: renamed from: b */
        default void mo10250b(InterfaceC2089x interfaceC2089x) {
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo100068l(C1841a c1841a) {
    }

    /* JADX INFO: renamed from: m */
    public void mo100069m(agj0 agj0Var) {
    }
}
