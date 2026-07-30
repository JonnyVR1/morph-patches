package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSRuleCount;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ach0 implements cvv.InterfaceC16252c {

    /* JADX INFO: renamed from: a */
    public int f68806a;

    /* JADX INFO: renamed from: b */
    public int f68807b;

    /* JADX INFO: renamed from: c */
    public int f68808c;

    /* JADX INFO: renamed from: d */
    public int f68809d;

    /* JADX INFO: renamed from: e */
    public tpd0 f68810e = new tpd0("dislike_count_device", 0);

    /* JADX INFO: renamed from: f */
    public tpd0 f68811f = new tpd0("like_count_device", 0);

    /* JADX INFO: renamed from: g */
    public tpd0 f68812g = new tpd0("superlike_count_device", 0);

    /* JADX INFO: renamed from: h */
    public tpd0 f68813h = new tpd0("like_superlike_count_device", 0);

    /* JADX INFO: renamed from: i */
    public zpd0 f68814i = CoreModule.f17550h.f119919b;

    /* JADX INFO: renamed from: j */
    public tpd0 f68815j = new tpd0("without_match_like_superlike_count_device", 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object m95736n() {
        return Integer.valueOf(this.f68809d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object m95737o() {
        return this.f68814i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object m95738q() {
        return Integer.valueOf(this.f68806a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object m95739r() {
        return Integer.valueOf(this.f68807b);
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: a */
    public void mo95740a(Map<String, cvv.InterfaceC16251b<Object>> map) {
        map.put(OMSRuleCount.swipe_count_session, new cvv.InterfaceC16251b() { // from class: l.pbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f148085a.m95736n();
            }
        });
        map.put("swipe_count_device", new cvv.InterfaceC16251b() { // from class: l.sbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f163540a.m95737o();
            }
        });
        map.put("without_match_like_superlike_count_session", new cvv.InterfaceC16251b() { // from class: l.tbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f17545c.f19663m0.f19466y0);
            }
        });
        map.put("dislike_count_session", new cvv.InterfaceC16251b() { // from class: l.ubh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f175696a.m95738q();
            }
        });
        map.put("superlike_count_session", new cvv.InterfaceC16251b() { // from class: l.vbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f180844a.m95739r();
            }
        });
        map.put("like_superlike_count_session", new cvv.InterfaceC16251b() { // from class: l.wbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f185576a.m95743s();
            }
        });
        map.put("dislike_count_device", new cvv.InterfaceC16251b() { // from class: l.xbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f191951a.m95744t();
            }
        });
        map.put("like_count_device", new cvv.InterfaceC16251b() { // from class: l.ybh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f197333a.m95745u();
            }
        });
        map.put("superlike_count_device", new cvv.InterfaceC16251b() { // from class: l.zbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f202442a.m95746v();
            }
        });
        map.put("like_superlike_count_device", new cvv.InterfaceC16251b() { // from class: l.qbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f153651a.m95747w();
            }
        });
        map.put("without_match_like_superlike_count_device", new cvv.InterfaceC16251b() { // from class: l.rbh0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f158610a.m95742p();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object m95742p() {
        return this.f68815j.get();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object m95743s() {
        return Integer.valueOf(this.f68808c);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object m95744t() {
        return this.f68810e.get();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object m95745u() {
        return this.f68811f.get();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object m95746v() {
        return this.f68812g.get();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object m95747w() {
        return this.f68813h.get();
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: b */
    public void mo95741b(Map<String, cvv.InterfaceC16250a<Object>> map) {
    }
}
