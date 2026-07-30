package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketPanel;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class ocg extends i6t<oo2, LiveFansClubRedPacketPanel> {

    /* JADX INFO: renamed from: i */
    public c0s f146700i;

    /* JADX INFO: renamed from: j */
    public ner f146701j;

    /* JADX INFO: renamed from: k */
    public String f146702k;

    /* JADX INFO: renamed from: l */
    public kcg0 f146703l;

    public ocg(dum dumVar) {
        super(dumVar);
        this.f146701j = dumVar.f90821g;
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ zsc0 m167194N3(BLiveEnvelope bLiveEnvelope, BLiveCommonViewConfig bLiveCommonViewConfig) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new zsc0(bLiveData.grabRedPacketInfo, bLiveData.fanbaseMedals, bLiveCommonViewConfig);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ zsc0 m167199T3(BLiveEnvelope bLiveEnvelope, BLiveCommonViewConfig bLiveCommonViewConfig) {
        BLiveData bLiveData = bLiveEnvelope.data;
        List<BLiveFanBaseMedal> list = bLiveData.fanbaseMedals;
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = bLiveData.redPacketGrabResult;
        bLiveFanBaseRedPacketInfo.hasGrabbed = true;
        return new zsc0(bLiveFanBaseRedPacketInfo, list, bLiveCommonViewConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m167201b4(DialogInterface dialogInterface) {
        this.f146700i = null;
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveFansClubRedPacketPanel) v2).destroy();
            this.viewModel = null;
        }
        this.f146702k = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: f4 */
    private void m167202f4(String str) {
        this.f146702k = str;
        if (this.f146700i == null) {
            LiveFansClubRedPacketPanel liveFansClubRedPacketPanel = (LiveFansClubRedPacketPanel) this.f196919f.inflater().inflate(yec0.f198884Q0, (ViewGroup) null);
            mo52715C(liveFansClubRedPacketPanel);
            c0s c0sVar = new c0s(this, liveFansClubRedPacketPanel);
            this.f146700i = c0sVar;
            c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fcg
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f98216a.m167201b4(dialogInterface);
                }
            });
        }
        ((LiveFansClubRedPacketPanel) this.viewModel).m74167m();
        this.f146700i.show();
        this.f146703l = duringCreated(C22421c.zip(LivingNormalApiProvider.m72485O5(zrv.f205799a.m207631D0(), str, m213810E2().f148254B.f192716b.f45211id), m213810E2().f148254B.m209633z().map(new qcj() { // from class: l.gcg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((cm0) obj).f82502b;
            }
        }), new rcj() { // from class: l.hcg
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ocg.m167194N3((BLiveEnvelope) obj, (BLiveCommonViewConfig) obj2);
            }
        }).filter(new qcj() { // from class: l.icg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f114407a.m167209c4((zsc0) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.jcg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120049a.m167210d4((zsc0) obj);
            }
        }, new y20() { // from class: l.kcg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125062a.m167208a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX INFO: renamed from: V3 */
    public void m167203V3(String str) {
        if (TextUtils.isEmpty(this.f146702k)) {
            return;
        }
        duringCreated(C22421c.zip(LivingNormalApiProvider.m72621d6(zrv.f205799a.m207631D0(), this.f146702k, m213810E2().f148254B.f192716b.f45211id, str), m213810E2().f148254B.m209633z().map(new qcj() { // from class: l.lcg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((cm0) obj).f82502b;
            }
        }), new rcj() { // from class: l.mcg
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ocg.m167199T3((BLiveEnvelope) obj, (BLiveCommonViewConfig) obj2);
            }
        })).subscribe(dhw.m115828g(dhw.m115826e(new y20() { // from class: l.ncg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141351a.m167206Y3((zsc0) obj);
            }
        }, new y20() { // from class: l.ecg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93057a.m167207Z3((Throwable) obj);
            }
        })));
    }

    @Override // p153l.l6t, p153l.cyr, p153l.k3m
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void mo52715C(LiveFansClubRedPacketPanel liveFansClubRedPacketPanel) {
        this.viewModel = liveFansClubRedPacketPanel;
        liveFansClubRedPacketPanel.mo22064i1(this);
    }

    /* JADX INFO: renamed from: X3 */
    public void m167205X3() {
        c0s c0sVar = this.f146700i;
        if (c0sVar != null) {
            c0sVar.dismiss();
        }
        psd0.m173633z(this.f146703l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m167206Y3(zsc0 zsc0Var) {
        ((LiveFansClubRedPacketPanel) this.viewModel).m74166l(zsc0Var, this.f146701j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m167207Z3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            switch (((TantanException.Client.CoreService) th).code) {
                case 41607:
                    ((LiveFansClubRedPacketPanel) this.viewModel).m74170q();
                    break;
                case 41608:
                    ((LiveFansClubRedPacketPanel) this.viewModel).m74168n();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m167208a4(Throwable th) {
        ((LiveFansClubRedPacketPanel) this.viewModel).m74169p();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m167209c4(zsc0 zsc0Var) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m167210d4(zsc0 zsc0Var) {
        ((LiveFansClubRedPacketPanel) this.viewModel).m74166l(zsc0Var, this.f146701j);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m167211e4(bcg bcgVar) {
        int action = bcgVar.getAction();
        if (action == 1) {
            m167202f4(bcgVar.f76140c);
        } else {
            if (action != 2) {
                return;
            }
            m167205X3();
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f146702k = null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138864i3(bcg.class, new int[0]).subscribe(dhw.m115825d(new y20() { // from class: l.dcg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87784a.m167211e4((bcg) obj);
            }
        }));
    }
}
