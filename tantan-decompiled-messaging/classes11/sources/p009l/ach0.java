package p009l;

import com.p1.mobile.putong.core.CoreModule;
import java.util.Map;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ach0 implements cvv.InterfaceC0829c {

    /* JADX INFO: renamed from: a */
    public int f9385a;

    /* JADX INFO: renamed from: b */
    public int f9386b;

    /* JADX INFO: renamed from: c */
    public int f9387c;

    /* JADX INFO: renamed from: d */
    public int f9388d;

    /* JADX INFO: renamed from: e */
    public tpd0 f9389e = new tpd0("dislike_count_device", 0);

    /* JADX INFO: renamed from: f */
    public tpd0 f9390f = new tpd0("like_count_device", 0);

    /* JADX INFO: renamed from: g */
    public tpd0 f9391g = new tpd0("superlike_count_device", 0);

    /* JADX INFO: renamed from: h */
    public tpd0 f9392h = new tpd0("like_superlike_count_device", 0);

    /* JADX INFO: renamed from: i */
    public zpd0 f9393i = CoreModule.h.b;

    /* JADX INFO: renamed from: j */
    public tpd0 f9394j = new tpd0("without_match_like_superlike_count_device", 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object m11310n() {
        return Integer.valueOf(this.f9388d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object m11311o() {
        return this.f9393i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object m11312q() {
        return Integer.valueOf(this.f9385a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object m11313r() {
        return Integer.valueOf(this.f9386b);
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: a */
    public void mo11314a(Map<String, cvv.InterfaceC0828b<Object>> map) {
        map.put("swipe_count_session", new cvv.InterfaceC0828b() { // from class: l.pbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f18456a.m11310n();
            }
        });
        map.put("swipe_count_device", new cvv.InterfaceC0828b() { // from class: l.sbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f20154a.m11311o();
            }
        });
        map.put("without_match_like_superlike_count_session", new cvv.InterfaceC0828b() { // from class: l.tbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(CoreModule.c.m0.y0);
            }
        });
        map.put("dislike_count_session", new cvv.InterfaceC0828b() { // from class: l.ubh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f21057a.m11312q();
            }
        });
        map.put("superlike_count_session", new cvv.InterfaceC0828b() { // from class: l.vbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f21519a.m11313r();
            }
        });
        map.put("like_superlike_count_session", new cvv.InterfaceC0828b() { // from class: l.wbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f21992a.m11317s();
            }
        });
        map.put("dislike_count_device", new cvv.InterfaceC0828b() { // from class: l.xbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f22498a.m11318t();
            }
        });
        map.put("like_count_device", new cvv.InterfaceC0828b() { // from class: l.ybh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f22982a.m11319u();
            }
        });
        map.put("superlike_count_device", new cvv.InterfaceC0828b() { // from class: l.zbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f23545a.m11320v();
            }
        });
        map.put("like_superlike_count_device", new cvv.InterfaceC0828b() { // from class: l.qbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f19127a.m11321w();
            }
        });
        map.put("without_match_like_superlike_count_device", new cvv.InterfaceC0828b() { // from class: l.rbh0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f19720a.m11316p();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object m11316p() {
        return this.f9394j.get();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object m11317s() {
        return Integer.valueOf(this.f9387c);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object m11318t() {
        return this.f9389e.get();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object m11319u() {
        return this.f9390f.get();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object m11320v() {
        return this.f9391g.get();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object m11321w() {
        return this.f9392h.get();
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: b */
    public void mo11315b(Map<String, cvv.InterfaceC0827a<Object>> map) {
    }
}
