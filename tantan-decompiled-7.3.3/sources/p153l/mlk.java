package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.data.Links;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class mlk extends ar2<clk> {

    /* JADX INFO: renamed from: a */
    public kcg0 f137416a;

    /* JADX INFO: renamed from: b */
    public String f137417b;

    /* JADX INFO: renamed from: c */
    public Set<String> f137418c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f137419d;

    /* JADX INFO: renamed from: e */
    public Links f137420e;

    /* JADX INFO: renamed from: f */
    public boolean f137421f;

    public mlk(ner nerVar) {
        super(nerVar);
        this.f137417b = null;
        this.f137418c = new HashSet();
        this.f137419d = new ArrayList();
        this.f137421f = false;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m158907i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m158911o0(List list) {
        ((clk) this.viewModel).m110662F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m158912p0(Throwable th) {
        ((clk) this.viewModel).m110662F(Collections.EMPTY_LIST);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.f18264c.f20387g0.m32791A6()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.elk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94565a.m158914n0((uxj0) obj);
            }
        }, new y20() { // from class: l.flk
            @Override // p153l.y20
            public final void call(Object obj) {
                mlk.m158907i0((Throwable) obj);
            }
        }));
        if (CoreModule.m30933P().m143412i().mo180314E()) {
            duringCreated(CoreModule.f18264c.f20387g0.m32882e9()).subscribe(psd0.m173597H(new y20() { // from class: l.glk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104865a.m158911o0((List) obj);
                }
            }, new y20() { // from class: l.hlk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110515a.m158912p0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m158913m0(String str, Pair<List<ChatGroup>, List<ChatGroup>> pair) {
        for (ChatGroup chatGroup : (List) pair.first) {
            if (!this.f137418c.contains(chatGroup.publicId)) {
                this.f137418c.add(chatGroup.publicId);
                this.f137419d.add(chatGroup);
            }
        }
        ((clk) this.viewModel).m110663G(this.f137419d, (List) pair.second, str);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m158914n0(uxj0 uxj0Var) {
        ((clk) this.viewModel).m110665J();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m158915q0(Pair pair) {
        this.f137421f = false;
        this.f137420e = (Links) pair.first;
        m158913m0(this.f137417b, (Pair) pair.second);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m158916r0(Throwable th) {
        this.f137421f = false;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m158917s0(String str, Pair pair) {
        this.f137420e = (Links) pair.first;
        this.f137418c.clear();
        this.f137419d.clear();
        m158913m0(str, (Pair) pair.second);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m158918t0(Throwable th) {
        ((clk) this.viewModel).m110661E();
    }

    /* JADX INFO: renamed from: u0 */
    public void m158919u0() {
        Links links = this.f137420e;
        if (links == null || TextUtils.isEmpty(links.next) || this.f137421f) {
            return;
        }
        this.f137421f = true;
        duringCreated(CoreModule.f18264c.f20387g0.m32876c9(this.f137417b, this.f137420e.next)).subscribe(psd0.m173597H(new y20() { // from class: l.klk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127389a.m158915q0((Pair) obj);
            }
        }, new y20() { // from class: l.llk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132566a.m158916r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m158920x0() {
        this.f137421f = false;
        m158921y0(this.f137417b);
    }

    /* JADX INFO: renamed from: y0 */
    public void m158921y0(final String str) {
        this.f137420e = null;
        this.f137417b = str.trim();
        psd0.m173633z(this.f137416a);
        if (TextUtils.isEmpty(this.f137417b)) {
            ((clk) this.viewModel).m110664H();
        } else {
            this.f137416a = duringCreated(CoreModule.f18264c.f20387g0.m32876c9(str, "")).subscribe(psd0.m173597H(new y20() { // from class: l.ilk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f115582a.m158917s0(str, (Pair) obj);
                }
            }, new y20() { // from class: l.jlk
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f121577a.m158918t0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
