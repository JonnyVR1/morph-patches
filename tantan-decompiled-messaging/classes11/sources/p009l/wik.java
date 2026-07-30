package p009l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.data.Links;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.c4g0;
import l.e30;
import l.jo0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wik extends jq2<mik> {

    /* JADX INFO: renamed from: a */
    public c4g0 f22133a;

    /* JADX INFO: renamed from: b */
    public String f22134b;

    /* JADX INFO: renamed from: c */
    public Set<String> f22135c;

    /* JADX INFO: renamed from: d */
    public List<ChatGroup> f22136d;

    /* JADX INFO: renamed from: e */
    public Links f22137e;

    /* JADX INFO: renamed from: f */
    public boolean f22138f;

    public wik(mcr mcrVar) {
        super(mcrVar);
        this.f22134b = null;
        this.f22135c = new HashSet();
        this.f22136d = new ArrayList();
        this.f22138f = false;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m24228i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m24232o0(List list) {
        ((mik) ((jq2) this).viewModel).m18498F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m24233p0(Throwable th) {
        ((mik) ((jq2) this).viewModel).m18498F(Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a0 */
    public void m24234a0() {
        super.a0();
        duringCreated(CoreModule.c.g0.A6()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.oik
            public final void call(Object obj) {
                this.f18067a.m24236n0((roj0) obj);
            }
        }, new e30() { // from class: l.pik
            public final void call(Object obj) {
                wik.m24228i0((Throwable) obj);
            }
        }));
        if (CoreModule.P().i().E()) {
            duringCreated(CoreModule.c.g0.e9()).subscribe(mkd0.H(new e30() { // from class: l.qik
                public final void call(Object obj) {
                    this.f19296a.m24232o0((List) obj);
                }
            }, new e30() { // from class: l.rik
                public final void call(Object obj) {
                    this.f19852a.m24233p0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m24235m0(String str, Pair<List<ChatGroup>, List<ChatGroup>> pair) {
        for (ChatGroup chatGroup : (List) pair.first) {
            if (!this.f22135c.contains(chatGroup.publicId)) {
                this.f22135c.add(chatGroup.publicId);
                this.f22136d.add(chatGroup);
            }
        }
        ((mik) ((jq2) this).viewModel).m18499G(this.f22136d, (List) pair.second, str);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m24236n0(roj0 roj0Var) {
        ((mik) ((jq2) this).viewModel).m18501J();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m24237q0(Pair pair) {
        this.f22138f = false;
        this.f22137e = (Links) pair.first;
        m24235m0(this.f22134b, (Pair) pair.second);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m24238r0(Throwable th) {
        this.f22138f = false;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m24239s0(String str, Pair pair) {
        this.f22137e = (Links) pair.first;
        this.f22135c.clear();
        this.f22136d.clear();
        m24235m0(str, (Pair) pair.second);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m24240t0(Throwable th) {
        ((mik) ((jq2) this).viewModel).m18497E();
    }

    /* JADX INFO: renamed from: u0 */
    public void m24241u0() {
        Links links = this.f22137e;
        if (links == null || TextUtils.isEmpty(links.next) || this.f22138f) {
            return;
        }
        this.f22138f = true;
        duringCreated(CoreModule.c.g0.c9(this.f22134b, this.f22137e.next)).subscribe(mkd0.H(new e30() { // from class: l.uik
            public final void call(Object obj) {
                this.f21204a.m24237q0((Pair) obj);
            }
        }, new e30() { // from class: l.vik
            public final void call(Object obj) {
                this.f21598a.m24238r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m24242x0() {
        this.f22138f = false;
        m24243y0(this.f22134b);
    }

    /* JADX INFO: renamed from: y0 */
    public void m24243y0(final String str) {
        this.f22137e = null;
        this.f22134b = str.trim();
        mkd0.z(this.f22133a);
        if (TextUtils.isEmpty(this.f22134b)) {
            ((mik) ((jq2) this).viewModel).m18500H();
        } else {
            this.f22133a = duringCreated(CoreModule.c.g0.c9(str, "")).subscribe(mkd0.H(new e30() { // from class: l.sik
                public final void call(Object obj) {
                    this.f20281a.m24239s0(str, (Pair) obj);
                }
            }, new e30() { // from class: l.tik
                public final void call(Object obj) {
                    this.f20723a.m24240t0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}
