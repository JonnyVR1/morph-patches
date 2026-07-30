package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.data.Links;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class wik extends jq2<mik> {

    /* JADX INFO: renamed from: a */
    public c4g0 f186547a;

    /* JADX INFO: renamed from: b */
    public String f186548b;

    /* JADX INFO: renamed from: c */
    public Set<String> f186549c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f186550d;

    /* JADX INFO: renamed from: e */
    public Links f186551e;

    /* JADX INFO: renamed from: f */
    public boolean f186552f;

    public wik(mcr mcrVar) {
        super(mcrVar);
        this.f186548b = null;
        this.f186549c = new HashSet();
        this.f186550d = new ArrayList();
        this.f186552f = false;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m203326i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m203330o0(List list) {
        ((mik) this.viewModel).m154710F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m203331p0(Throwable th) {
        ((mik) this.viewModel).m154710F(Collections.EMPTY_LIST);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.f17545c.f19645g0.m31788A6()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.oik
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144137a.m203333n0((roj0) obj);
            }
        }, new e30() { // from class: l.pik
            @Override // p149l.e30
            public final void call(Object obj) {
                wik.m203326i0((Throwable) obj);
            }
        }));
        if (CoreModule.m29935P().m94658i().mo158222E()) {
            duringCreated(CoreModule.f17545c.f19645g0.m31879e9()).subscribe(mkd0.m154956H(new e30() { // from class: l.qik
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154784a.m203330o0((List) obj);
                }
            }, new e30() { // from class: l.rik
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159563a.m203331p0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m203332m0(String str, Pair<List<ChatGroup>, List<ChatGroup>> pair) {
        for (ChatGroup chatGroup : (List) pair.first) {
            if (!this.f186549c.contains(chatGroup.publicId)) {
                this.f186549c.add(chatGroup.publicId);
                this.f186550d.add(chatGroup);
            }
        }
        ((mik) this.viewModel).m154711G(this.f186550d, (List) pair.second, str);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m203333n0(roj0 roj0Var) {
        ((mik) this.viewModel).m154713J();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m203334q0(Pair pair) {
        this.f186552f = false;
        this.f186551e = (Links) pair.first;
        m203332m0(this.f186548b, (Pair) pair.second);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m203335r0(Throwable th) {
        this.f186552f = false;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m203336s0(String str, Pair pair) {
        this.f186551e = (Links) pair.first;
        this.f186549c.clear();
        this.f186550d.clear();
        m203332m0(str, (Pair) pair.second);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m203337t0(Throwable th) {
        ((mik) this.viewModel).m154709E();
    }

    /* JADX INFO: renamed from: u0 */
    public void m203338u0() {
        Links links = this.f186551e;
        if (links == null || TextUtils.isEmpty(links.next) || this.f186552f) {
            return;
        }
        this.f186552f = true;
        duringCreated(CoreModule.f17545c.f19645g0.m31873c9(this.f186548b, this.f186551e.next)).subscribe(mkd0.m154956H(new e30() { // from class: l.uik
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176656a.m203334q0((Pair) obj);
            }
        }, new e30() { // from class: l.vik
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181616a.m203335r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m203339x0() {
        this.f186552f = false;
        m203340y0(this.f186548b);
    }

    /* JADX INFO: renamed from: y0 */
    public void m203340y0(final String str) {
        this.f186551e = null;
        this.f186548b = str.trim();
        mkd0.m154992z(this.f186547a);
        if (TextUtils.isEmpty(this.f186548b)) {
            ((mik) this.viewModel).m154712H();
        } else {
            this.f186547a = duringCreated(CoreModule.f17545c.f19645g0.m31873c9(str, "")).subscribe(mkd0.m154956H(new e30() { // from class: l.sik
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164719a.m203336s0(str, (Pair) obj);
                }
            }, new e30() { // from class: l.tik
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170590a.m203337t0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
