package p149l;

import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;

/* JADX INFO: loaded from: classes11.dex */
public class a4h0 extends AbstractC18834o4 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m94920c(z5l.C21640a c21640a) {
        c21640a.f201827a.act().m39801Z5().m39960B0();
        CoreModule.f17545c.f19659k2.f184659U.m189988a(1);
        CoreModule.f17545c.f19659k2.f184660V.put(Long.valueOf(mqi0.m155944o()));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(final z5l.C21640a c21640a) {
        w5b w5bVar = CoreModule.f17545c.f19659k2;
        w5bVar.f184661W = false;
        w5bVar.m201616s3();
        y3h0 y3h0Var = new y3h0(c21640a.m217363a());
        y3h0Var.m212819O(new d30() { // from class: l.z3h0
            @Override // p149l.d30
            public final void call() {
                a4h0.m94920c(c21640a);
            }
        });
        if (C4371a.m21100p().m21108I()) {
            C4371a.m21100p().m21103C(CorePopLevel.SURPRISE_BOX, c21640a.m217363a(), y3h0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
        } else {
            wc80.m202636e().m202649q(uc80.m192995a(y3h0Var));
        }
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        return CoreModule.f17545c.f19659k2.f184661W;
    }
}
