package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class i4d0 extends jq2<l4d0> {

    /* JADX INFO: renamed from: a */
    public UserRightType f111427a;

    /* JADX INFO: renamed from: b */
    public String f111428b;

    public i4d0(Frag frag) {
        super(frag.act());
        m134329l0(frag);
    }

    /* JADX INFO: renamed from: l0 */
    private void m134329l0(Frag frag) {
        Bundle arguments = frag.getArguments();
        if (arguments != null) {
            this.f111427a = UserRightType.valueOf(arguments.getString("right_type"));
            this.f111428b = arguments.getString("anchor_id");
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m134339s0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m134330i0(final String str, final boolean z) {
        duringCreated(LiveSquareApi.equipNiceNumber(this.f111428b, str)).subscribe(ffw.m121194e(new e30() { // from class: l.f4d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94804a.m134333m0(str, z, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.g4d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100561a.m134334n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m134331j0(int i, String str) {
        if (i == 42140 || i == 42145) {
            lsi0.m151595y(str);
            m134337q0();
        }
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final void m134333m0(BLiveEnvelope bLiveEnvelope, String str, boolean z) {
        Meta meta = bLiveEnvelope.meta;
        int i = meta.code;
        if (i == 42140 || i == 42145) {
            m134331j0(i, meta.message);
            return;
        }
        if (z) {
            lsi0.m151593w(R$string.f44172h1);
        } else {
            lsi0.m151593w(R$string.f44178j1);
        }
        ((l4d0) this.viewModel).m148436j(str);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m134334n0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            m134331j0(coreService.code, coreService.metaMessage);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m134335o0(BLiveNiceNumberList bLiveNiceNumberList) {
        ((l4d0) this.viewModel).m148443s(bLiveNiceNumberList, true);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m134336p0(wi40 wi40Var) {
        ((l4d0) this.viewModel).m148445v(wi40Var);
    }

    /* JADX INFO: renamed from: q0 */
    public void m134337q0() {
        duringCreated(LiveSquareApi.getNiceNumberList(this.f111428b)).subscribe(ffw.m121197h(new e30() { // from class: l.h4d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105826a.m134335o0((BLiveNiceNumberList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m134338r0() {
        ((l4d0) this.viewModel).m148438l(this.f111427a);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m134339s0() {
        duringCreated(C22306c.zip(LiveSquareApi.getNiceNumberDetails(this.f111428b), LiveSquareApi.getNiceNumberList(this.f111428b), new x9j() { // from class: l.d4d0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new wi40((BLiveNiceNumberDetail) obj, (BLiveNiceNumberList) obj2);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.e4d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89271a.m134336p0((wi40) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
