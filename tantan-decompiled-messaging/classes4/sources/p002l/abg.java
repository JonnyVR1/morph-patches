package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketPanel;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import java.util.List;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.w9j;
import l.x9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class abg extends h4t<ho2, LiveFansClubRedPacketPanel> {

    /* JADX INFO: renamed from: i */
    public byr f7486i;

    /* JADX INFO: renamed from: j */
    public mcr f7487j;

    /* JADX INFO: renamed from: k */
    public String f7488k;

    /* JADX INFO: renamed from: l */
    public c4g0 f7489l;

    public abg(bsm bsmVar) {
        super(bsmVar);
        this.f7487j = bsmVar.f8338g;
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ skc0 m9473N3(BLiveEnvelope bLiveEnvelope, BLiveCommonViewConfig bLiveCommonViewConfig) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new skc0(bLiveData.grabRedPacketInfo, bLiveData.fanbaseMedals, bLiveCommonViewConfig);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ skc0 m9478T3(BLiveEnvelope bLiveEnvelope, BLiveCommonViewConfig bLiveCommonViewConfig) {
        BLiveData bLiveData = bLiveEnvelope.data;
        List list = bLiveData.fanbaseMedals;
        BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo = bLiveData.redPacketGrabResult;
        bLiveFanBaseRedPacketInfo.hasGrabbed = true;
        return new skc0(bLiveFanBaseRedPacketInfo, list, bLiveCommonViewConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m9480b4(DialogInterface dialogInterface) {
        this.f7486i = null;
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((LiveFansClubRedPacketPanel) s7mVar).destroy();
            ((bwr) this).viewModel = null;
        }
        this.f7488k = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    private void m9481f4(String str) {
        this.f7488k = str;
        if (this.f7486i == null) {
            LiveFansClubRedPacketPanel liveFansClubRedPacketPanel = (LiveFansClubRedPacketPanel) this.f22037f.inflater().inflate(t6c0.f19648Q0, (ViewGroup) null);
            m9482C(liveFansClubRedPacketPanel);
            byr byrVar = new byr(this, liveFansClubRedPacketPanel);
            this.f7486i = byrVar;
            byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rag
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f18443a.m9480b4(dialogInterface);
                }
            });
        }
        ((LiveFansClubRedPacketPanel) ((bwr) this).viewModel).m6507m();
        this.f7486i.show();
        this.f7489l = duringCreated(c.zip(LivingNormalApiProvider.m4668O5(ypv.a.D0(), str, m25547E2().f12141B.f13607b.id), m25547E2().f12141B.m15719z().map(new w9j() { // from class: l.sag
            public final Object call(Object obj) {
                return ((gm0) obj).f11510b;
            }
        }), new x9j() { // from class: l.tag
            public final Object call(Object obj, Object obj2) {
                return abg.m9473N3((BLiveEnvelope) obj, (BLiveCommonViewConfig) obj2);
            }
        }).filter(new w9j() { // from class: l.uag
            public final Object call(Object obj) {
                return this.f20568a.m9489c4((skc0) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.vag
            public final void call(Object obj) {
                this.f21052a.m9490d4((skc0) obj);
            }
        }, new e30() { // from class: l.wag
            public final void call(Object obj) {
                this.f21591a.m9488a4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX INFO: renamed from: V3 */
    public void m9483V3(String str) {
        if (TextUtils.isEmpty(this.f7488k)) {
            return;
        }
        duringCreated(c.zip(LivingNormalApiProvider.m4804d6(ypv.a.D0(), this.f7488k, m25547E2().f12141B.f13607b.id, str), m25547E2().f12141B.m15719z().map(new w9j() { // from class: l.xag
            public final Object call(Object obj) {
                return ((gm0) obj).f11510b;
            }
        }), new x9j() { // from class: l.yag
            public final Object call(Object obj, Object obj2) {
                return abg.m9478T3((BLiveEnvelope) obj, (BLiveCommonViewConfig) obj2);
            }
        })).subscribe(ffw.g(ffw.e(new e30() { // from class: l.zag
            public final void call(Object obj) {
                this.f23323a.m9486Y3((skc0) obj);
            }
        }, new e30() { // from class: l.qag
            public final void call(Object obj) {
                this.f17883a.m9487Z3((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: W3, reason: merged with bridge method [inline-methods] */
    public void m9482C(LiveFansClubRedPacketPanel liveFansClubRedPacketPanel) {
        ((bwr) this).viewModel = liveFansClubRedPacketPanel;
        liveFansClubRedPacketPanel.m6504i1(this);
    }

    /* JADX INFO: renamed from: X3 */
    public void m9485X3() {
        byr byrVar = this.f7486i;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        mkd0.z(this.f7489l);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m9486Y3(skc0 skc0Var) {
        ((LiveFansClubRedPacketPanel) ((bwr) this).viewModel).m6506l(skc0Var, this.f7487j);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m9487Z3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            switch (((TantanException.Client.CoreService) th).code) {
                case 41607:
                    ((LiveFansClubRedPacketPanel) ((bwr) this).viewModel).m6510q();
                    break;
                case 41608:
                    ((LiveFansClubRedPacketPanel) ((bwr) this).viewModel).m6508n();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m9488a4(Throwable th) {
        ((LiveFansClubRedPacketPanel) ((bwr) this).viewModel).m6509p();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m9489c4(skc0 skc0Var) {
        return Boolean.valueOf(((bwr) this).viewModel != null);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m9490d4(skc0 skc0Var) {
        ((LiveFansClubRedPacketPanel) ((bwr) this).viewModel).m6506l(skc0Var, this.f7487j);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m9491e4(nag nagVar) {
        int action = nagVar.getAction();
        if (action == 1) {
            m9481f4(nagVar.f15904c);
        } else {
            if (action != 2) {
                return;
            }
            m9485X3();
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f7488k = null;
    }

    /* JADX INFO: renamed from: t */
    public void m9492t() {
        super.t();
        m14192i3(nag.class, new int[0]).subscribe(ffw.d(new e30() { // from class: l.pag
            public final void call(Object obj) {
                this.f17174a.m9491e4((nag) obj);
            }
        }));
    }
}
