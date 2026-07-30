package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class lcd0 extends ar2<ocd0> {

    /* JADX INFO: renamed from: a */
    public UserRightType f131348a;

    /* JADX INFO: renamed from: b */
    public String f131349b;

    public lcd0(Frag frag) {
        super(frag.act());
        m153668l0(frag);
    }

    /* JADX INFO: renamed from: l0 */
    private void m153668l0(Frag frag) {
        Bundle arguments = frag.getArguments();
        if (arguments != null) {
            this.f131348a = UserRightType.valueOf(arguments.getString("right_type"));
            this.f131349b = arguments.getString("anchor_id");
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m153678s0();
    }

    /* JADX INFO: renamed from: i0 */
    public void m153669i0(final String str, final boolean z) {
        duringCreated(LiveSquareApi.equipNiceNumber(this.f131349b, str)).subscribe(dhw.m115826e(new y20() { // from class: l.icd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114399a.m153672m0(str, z, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.jcd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120044a.m153673n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m153670j0(int i, String str) {
        if (i == 42140 || i == 42145) {
            o1j0.m165651y(str);
            m153676q0();
        }
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final void m153672m0(BLiveEnvelope bLiveEnvelope, String str, boolean z) {
        Meta meta = bLiveEnvelope.meta;
        int i = meta.code;
        if (i == 42140 || i == 42145) {
            m153670j0(i, meta.message);
            return;
        }
        if (z) {
            o1j0.m165649w(R$string.f45020h1);
        } else {
            o1j0.m165649w(R$string.f45026j1);
        }
        ((ocd0) this.viewModel).m167150j(str);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m153673n0(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            m153670j0(coreService.code, coreService.metaMessage);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m153674o0(BLiveNiceNumberList bLiveNiceNumberList) {
        ((ocd0) this.viewModel).m167157s(bLiveNiceNumberList, true);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m153675p0(kr40 kr40Var) {
        ((ocd0) this.viewModel).m167159v(kr40Var);
    }

    /* JADX INFO: renamed from: q0 */
    public void m153676q0() {
        duringCreated(LiveSquareApi.getNiceNumberList(this.f131349b)).subscribe(dhw.m115829h(new y20() { // from class: l.kcd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125044a.m153674o0((BLiveNiceNumberList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m153677r0() {
        ((ocd0) this.viewModel).m167152l(this.f131348a);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m153678s0() {
        duringCreated(C22421c.zip(LiveSquareApi.getNiceNumberDetails(this.f131349b), LiveSquareApi.getNiceNumberList(this.f131349b), new rcj() { // from class: l.gcd0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new kr40((BLiveNiceNumberDetail) obj, (BLiveNiceNumberList) obj2);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.hcd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108688a.m153675p0((kr40) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
