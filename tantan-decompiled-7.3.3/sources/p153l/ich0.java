package p153l;

import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;

/* JADX INFO: loaded from: classes11.dex */
public class ich0 extends AbstractC18774n4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m139437c(p8l.C19323a c19323a) {
        c19323a.f151040a.act().m40810d6().m40967B0();
        CoreModule.f18264c.f20401k2.f118662U.m203841a(1);
        CoreModule.f18264c.f20401k2.f118663V.put(Long.valueOf(pzi0.m174454o()));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(final p8l.C19323a c19323a) {
        j7b j7bVar = CoreModule.f18264c.f20401k2;
        j7bVar.f118664W = false;
        j7bVar.m143767s3();
        gch0 gch0Var = new gch0(c19323a.m171258a());
        gch0Var.m129886O(new x20() { // from class: l.hch0
            @Override // p153l.x20
            public final void call() {
                ich0.m139437c(c19323a);
            }
        });
        if (C4522a.m22099p().m22107I()) {
            C4522a.m22099p().m22102C(CorePopLevel.SURPRISE_BOX, c19323a.m171258a(), gch0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            cl80.m110426e().m110439q(al80.m98641a(gch0Var));
        }
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        return CoreModule.f18264c.f20401k2.f118664W;
    }
}
