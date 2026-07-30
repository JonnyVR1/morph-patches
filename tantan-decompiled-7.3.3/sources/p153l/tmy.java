package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import java.util.List;
import p153l.mmy;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class tmy<D extends rwn0, VM extends mmy> extends djy<D, VM> {

    /* JADX INFO: renamed from: j */
    public List<BLiveVoiceSettle> f175202j;

    public tmy(dum<D> dumVar, VM vm) {
        super(dumVar);
        this.f175202j = new ArrayList();
        mo52715C(vm);
    }

    /* JADX INFO: renamed from: j4 */
    private void m191867j4() {
        duringCreated(LivingNormalApiProvider.m72494P5(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.rmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163945a.m191873i4((List) obj);
            }
        }, new z2e0()));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        init();
    }

    @Override // p153l.djy
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public sjy mo104941S3() {
        return new sjy("入驻申请", ((mmy) this.viewModel).m159107c(), 2);
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: T3 */
    public int mo104942T3() {
        return 2;
    }

    @Override // p153l.djy
    /* JADX INFO: renamed from: V3 */
    public void mo104944V3() {
        m191867j4();
    }

    /* JADX INFO: renamed from: d4 */
    public final void m191868d4(final Boolean bool, final String str) {
        eky.m121088a(bool.booleanValue(), m213810E2().mo118373p(), m213810E2().m168532l0().f56859id, m213810E2().m202191k(), "management_host");
        duringCreated(LivingNormalApiProvider.m72429I3(m213810E2().m202194o(), str, bool)).subscribe(dhw.m115826e(new y20() { // from class: l.qmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158441a.m191869e4(bool, str, (String) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m191869e4(Boolean bool, final String str, String str2) {
        o1j0.m165651y(bool.booleanValue() ? "已同意该申请" : "已拒绝该申请");
        BLiveVoiceSettle bLiveVoiceSettle = (BLiveVoiceSettle) jyb.m147529r(this.f175202j, new qcj() { // from class: l.smy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceSettle) obj).userId.equals(str));
            }
        });
        int iIndexOf = this.f175202j.indexOf(bLiveVoiceSettle);
        List<BLiveVoiceSettle> listM147501c0 = jyb.m147501c0(this.f175202j, bLiveVoiceSettle);
        this.f175202j = listM147501c0;
        ((mmy) this.viewModel).m159109e(iIndexOf, listM147501c0);
        ((mmy) this.viewModel).m159106b(Boolean.valueOf(this.f175202j.size() < 2));
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m191870f4(BLiveVoiceSettle bLiveVoiceSettle) {
        m116162W3(bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m191871g4(BLiveVoiceSettle bLiveVoiceSettle) {
        m191868d4(Boolean.TRUE, bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m191872h4(BLiveVoiceSettle bLiveVoiceSettle) {
        m191868d4(Boolean.FALSE, bLiveVoiceSettle.userId);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m191873i4(List list) {
        this.f175202j = list;
        ((mmy) this.viewModel).m159106b(Boolean.valueOf(jyb.m147479J(list)));
        ((mmy) this.viewModel).m159110f(this.f175202j);
    }

    public void init() {
        ((mmy) this.viewModel).m159108d(this, new y20() { // from class: l.nmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142750a.m191870f4((BLiveVoiceSettle) obj);
            }
        }, new y20() { // from class: l.omy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148042a.m191871g4((BLiveVoiceSettle) obj);
            }
        }, new y20() { // from class: l.pmy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153240a.m191872h4((BLiveVoiceSettle) obj);
            }
        });
        m191867j4();
    }
}
