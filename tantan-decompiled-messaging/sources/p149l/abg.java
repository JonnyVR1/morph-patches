package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketPanel;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class abg extends h4t<ho2, LiveFansClubRedPacketPanel> {

    /* JADX INFO: renamed from: i */
    public byr f68659i;

    /* JADX INFO: renamed from: j */
    public mcr f68660j;

    /* JADX INFO: renamed from: k */
    public String f68661k;

    /* JADX INFO: renamed from: l */
    public c4g0 f68662l;

    public abg(bsm bsmVar) {
        super(bsmVar);
        this.f68660j = bsmVar.f77101g;
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ skc0 m95595N3(BLiveEnvelope bLiveEnvelope, BLiveCommonViewConfig bLiveCommonViewConfig) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new skc0(bLiveData.grabRedPacketInfo, bLiveData.fanbaseMedals, bLiveCommonViewConfig);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ skc0 m95600T3(BLiveEnvelope bLiveEnvelope, BLiveCommonViewConfig bLiveCommonViewConfig) {
        BLiveData bLiveData = bLiveEnvelope.data;
        List<BLiveFanBaseMedal> list = bLiveData.fanbaseMedals;
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = bLiveData.redPacketGrabResult;
        bLiveFanBaseRedPacketInfo.hasGrabbed = true;
        return new skc0(bLiveFanBaseRedPacketInfo, list, bLiveCommonViewConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m95602b4(DialogInterface dialogInterface) {
        this.f68659i = null;
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveFansClubRedPacketPanel) v2).destroy();
            this.viewModel = null;
        }
        this.f68661k = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    private void m95603f4(String str) {
        this.f68661k = str;
        if (this.f68659i == null) {
            LiveFansClubRedPacketPanel liveFansClubRedPacketPanel = (LiveFansClubRedPacketPanel) this.f188513f.inflater().inflate(t6c0.f168152Q0, (ViewGroup) null);
            mo51532C(liveFansClubRedPacketPanel);
            byr byrVar = new byr(this, liveFansClubRedPacketPanel);
            this.f68659i = byrVar;
            byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rag
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f158516a.m95602b4(dialogInterface);
                }
            });
        }
        ((LiveFansClubRedPacketPanel) this.viewModel).m72984m();
        this.f68659i.show();
        this.f68662l = duringCreated(C22306c.zip(LivingNormalApiProvider.m71302O5(ypv.f199493a.m199309D0(), str, m206027E2().f108741B.f116469b.f44363id), m206027E2().f108741B.m140028z().map(new w9j() { // from class: l.sag
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((gm0) obj).f103418b;
            }
        }), new x9j() { // from class: l.tag
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return abg.m95595N3((BLiveEnvelope) obj, (BLiveCommonViewConfig) obj2);
            }
        }).filter(new w9j() { // from class: l.uag
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175601a.m95610c4((skc0) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.vag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180733a.m95611d4((skc0) obj);
            }
        }, new e30() { // from class: l.wag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185464a.m95609a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX INFO: renamed from: V3 */
    public void m95604V3(String str) {
        if (TextUtils.isEmpty(this.f68661k)) {
            return;
        }
        duringCreated(C22306c.zip(LivingNormalApiProvider.m71438d6(ypv.f199493a.m199309D0(), this.f68661k, m206027E2().f108741B.f116469b.f44363id, str), m206027E2().f108741B.m140028z().map(new w9j() { // from class: l.xag
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((gm0) obj).f103418b;
            }
        }), new x9j() { // from class: l.yag
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return abg.m95600T3((BLiveEnvelope) obj, (BLiveCommonViewConfig) obj2);
            }
        })).subscribe(ffw.m121196g(ffw.m121194e(new e30() { // from class: l.zag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202346a.m95607Y3((skc0) obj);
            }
        }, new e30() { // from class: l.qag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153536a.m95608Z3((Throwable) obj);
            }
        })));
    }

    @Override // p149l.k4t, p149l.bwr, p149l.q0m
    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void mo51532C(LiveFansClubRedPacketPanel liveFansClubRedPacketPanel) {
        this.viewModel = liveFansClubRedPacketPanel;
        liveFansClubRedPacketPanel.mo21065i1(this);
    }

    /* JADX INFO: renamed from: X3 */
    public void m95606X3() {
        byr byrVar = this.f68659i;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        mkd0.m154992z(this.f68662l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m95607Y3(skc0 skc0Var) {
        ((LiveFansClubRedPacketPanel) this.viewModel).m72983l(skc0Var, this.f68660j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m95608Z3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            switch (((TantanException.Client.CoreService) th).code) {
                case 41607:
                    ((LiveFansClubRedPacketPanel) this.viewModel).m72987q();
                    break;
                case 41608:
                    ((LiveFansClubRedPacketPanel) this.viewModel).m72985n();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m95609a4(Throwable th) {
        ((LiveFansClubRedPacketPanel) this.viewModel).m72986p();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m95610c4(skc0 skc0Var) {
        return Boolean.valueOf(this.viewModel != 0);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m95611d4(skc0 skc0Var) {
        ((LiveFansClubRedPacketPanel) this.viewModel).m72983l(skc0Var, this.f68660j);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m95612e4(nag nagVar) {
        int action = nagVar.getAction();
        if (action == 1) {
            m95603f4(nagVar.f137897c);
        } else {
            if (action != 2) {
                return;
            }
            m95606X3();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f68661k = null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129305i3(nag.class, new int[0]).subscribe(ffw.m121193d(new e30() { // from class: l.pag
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147977a.m95612e4((nag) obj);
            }
        }));
    }
}
