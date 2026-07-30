package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSRuleCount;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ikh0 implements dxv.InterfaceC16648c {

    /* JADX INFO: renamed from: a */
    public int f115368a;

    /* JADX INFO: renamed from: b */
    public int f115369b;

    /* JADX INFO: renamed from: c */
    public int f115370c;

    /* JADX INFO: renamed from: d */
    public int f115371d;

    /* JADX INFO: renamed from: e */
    public vxd0 f115372e = new vxd0("dislike_count_device", 0);

    /* JADX INFO: renamed from: f */
    public vxd0 f115373f = new vxd0("like_count_device", 0);

    /* JADX INFO: renamed from: g */
    public vxd0 f115374g = new vxd0("superlike_count_device", 0);

    /* JADX INFO: renamed from: h */
    public vxd0 f115375h = new vxd0("like_superlike_count_device", 0);

    /* JADX INFO: renamed from: i */
    public byd0 f115376i = CoreModule.f18269h.f186112b;

    /* JADX INFO: renamed from: j */
    public vxd0 f115377j = new vxd0("without_match_like_superlike_count_device", 0);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object m140314n() {
        return Integer.valueOf(this.f115371d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object m140315o() {
        return this.f115376i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object m140316q() {
        return Integer.valueOf(this.f115368a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object m140317r() {
        return Integer.valueOf(this.f115369b);
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: a */
    public void mo110417a(Map<String, dxv.InterfaceC16647b<Object>> map) {
        map.put(OMSRuleCount.swipe_count_session, new dxv.InterfaceC16647b() { // from class: l.xjh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f194574a.m140314n();
            }
        });
        map.put("swipe_count_device", new dxv.InterfaceC16647b() { // from class: l.akh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f72007a.m140315o();
            }
        });
        map.put("without_match_like_superlike_count_session", new dxv.InterfaceC16647b() { // from class: l.bkh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f18264c.f20405m0.f20208y0);
            }
        });
        map.put("dislike_count_session", new dxv.InterfaceC16647b() { // from class: l.ckh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f82284a.m140316q();
            }
        });
        map.put("superlike_count_session", new dxv.InterfaceC16647b() { // from class: l.dkh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f89406a.m140317r();
            }
        });
        map.put("like_superlike_count_session", new dxv.InterfaceC16647b() { // from class: l.ekh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f94378a.m140319s();
            }
        });
        map.put("dislike_count_device", new dxv.InterfaceC16647b() { // from class: l.fkh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f99510a.m140320t();
            }
        });
        map.put("like_count_device", new dxv.InterfaceC16647b() { // from class: l.gkh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f104735a.m140321u();
            }
        });
        map.put("superlike_count_device", new dxv.InterfaceC16647b() { // from class: l.hkh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f110416a.m140322v();
            }
        });
        map.put("like_superlike_count_device", new dxv.InterfaceC16647b() { // from class: l.yjh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f200302a.m140323w();
            }
        });
        map.put("without_match_like_superlike_count_device", new dxv.InterfaceC16647b() { // from class: l.zjh0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f204670a.m140318p();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object m140318p() {
        return this.f115377j.get();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object m140319s() {
        return Integer.valueOf(this.f115370c);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object m140320t() {
        return this.f115372e.get();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object m140321u() {
        return this.f115373f.get();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object m140322v() {
        return this.f115374g.get();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object m140323w() {
        return this.f115375h.get();
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: b */
    public void mo110418b(Map<String, dxv.InterfaceC16646a<Object>> map) {
    }
}
