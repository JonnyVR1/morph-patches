package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public class cj10<D extends oo2> extends qct<D> {

    /* JADX INFO: renamed from: i */
    public final td10<D> f82094i;

    /* JADX INFO: renamed from: l.cj10$a */
    public static /* synthetic */ class C16272a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82095a;

        static {
            int[] iArr = new int[LongLinkMultiCallMessage.MultiCallActionMessage.Type.values().length];
            f82095a = iArr;
            try {
                iArr[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOnFreeCall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82095a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOffFreeCall.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82095a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOffMultiCall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82095a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOnMultiCall.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82095a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.switch6MaxCallNum.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82095a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.switch9MaxCallNum.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public cj10(dum<D> dumVar, td10<D> td10Var) {
        super(dumVar);
        this.f82094i = td10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public void m110038R3(v7t v7tVar) {
        if (cd10.f81057I.equals(v7tVar.m200276d())) {
            this.f82094i.m190582Z3(v7tVar.m200274b());
        } else if (m110045V3(v7tVar)) {
            this.f82094i.m190606x4(v7tVar.m200274b());
        } else if (cd10.f81058J.equals(v7tVar.m200276d())) {
            m110043T3(v7tVar.m200274b());
        } else if (cd10.f81056H.equals(v7tVar.m200276d())) {
            bf10.m103833i0(this, v7tVar.m200274b(), "longlink");
        } else if (cd10.f81067S.equals(v7tVar.m200276d())) {
            m213811F2().MultiCallEvent.switchToLeadRole().mo199273j(v7tVar.m200274b());
        } else if (cd10.f81068T.equals(v7tVar.m200276d())) {
            m213811F2().MultiCallEvent.cancelLeadRole().mo199273j(v7tVar);
        } else if (cd10.f81070V.equals(v7tVar.m200276d())) {
            fhw.m125605a(cd10.f81073a, "receive cdn fail" + v7tVar.f182817a.refreshPushStreamUrl);
            this.f82094i.f173297l.mo121414i4(v7tVar.f182817a.refreshPushStreamUrl);
        }
        if (m110044U3(v7tVar.m200276d())) {
            duringCreated(LivingNormalApiProvider.m72790w4(m213810E2().m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.bj10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76952a.m110046W3((List) obj);
                }
            }));
        }
        if (TextUtils.isEmpty(v7tVar.m200275c())) {
            return;
        }
        o1j0.m165651y(v7tVar.m200275c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ Boolean m110039X3(v7t v7tVar) {
        return Boolean.valueOf(this.f82094i.m190592j4(v7tVar.m200274b()));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m110040O3(LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage) {
        switch (C16272a.f82095a[multiCallActionMessage.getType().ordinal()]) {
            case 1:
            case 2:
                this.f82094i.m190584b4().f131691b = multiCallActionMessage.getType().equals(LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOnFreeCall);
                break;
            case 3:
            case 4:
                m110042S3(multiCallActionMessage.getType(), multiCallActionMessage.getUserId());
                break;
            case 5:
                if (!fn10.m126342j(this.f82094i.m190587e4()) && !fn10.m126346n(bf10.m103798D(this))) {
                    m213811F2().MultiCallEvent.switchDeputyCount().mo199273j(6);
                    break;
                }
                break;
            case 6:
                if (!fn10.m126342j(this.f82094i.m190587e4()) && !fn10.m126346n(bf10.m103798D(this))) {
                    m213811F2().MultiCallEvent.switchDeputyCount().mo199273j(9);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m110041P3(c8t c8tVar) {
        if (cd10.f81097y.equals(c8tVar.m108382c())) {
            o1j0.m165651y(xau.m209911u(R$string.f48081f9, c8tVar.m108381b().toUserName));
        } else if (cd10.f81049A.equals(c8tVar.m108382c())) {
            o1j0.m165651y(xau.m209911u(R$string.f48103g9, c8tVar.m108381b().toUserName));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m110042S3(LongLinkMultiCallMessage.MultiCallActionMessage.Type type, String str) {
        BLiveMultiCall bLiveMultiCallM103848z = bf10.m103848z(this);
        if ((bLiveMultiCallM103848z == null || bLiveMultiCallM103848z.isAway) && LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOffMultiCall.equals(type)) {
            m213811F2().MultiCallEvent.openApplyDlg().mo199273j(-100);
            m213811F2().MultiCallEvent.closeAcceptDlg().mo199273j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m110043T3(BLiveMultiCall bLiveMultiCall) {
        if (bf10.m103817W(bLiveMultiCall.userId) && bf10.m103810P(this)) {
            m213811F2().MultiCallEvent.hangUpSelfCall().mo199273j(bLiveMultiCall);
        }
        if (!fn10.m126342j(bLiveMultiCall)) {
            this.f82094i.m190604v4(bLiveMultiCall);
        }
        if (!fn10.m126342j(bLiveMultiCall) || bf10.m103817W(bLiveMultiCall.userId)) {
            return;
        }
        m213811F2().MultiCallEvent.openApplyDlg().mo199273j(-100);
        m213811F2().MultiCallEvent.closeAcceptDlg().mo199273j(Boolean.TRUE);
        if (m213810E2().mo118373p()) {
            o1j0.m165649w(R$string.f47772R);
        } else {
            o1j0.m165649w(R$string.f48314q1);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m110044U3(String str) {
        return cd10.f81054F.equals(str) || cd10.f81055G.equals(str) || cd10.f81056H.equals(str) || cd10.f81058J.equals(str) || cd10.f81059K.equals(str);
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m110045V3(v7t v7tVar) {
        return cd10.f81062N.equals(v7tVar.m200276d()) || cd10.f81063O.equals(v7tVar.m200276d()) || cd10.f81059K.equals(v7tVar.m200276d()) || cd10.f81060L.equals(v7tVar.m200276d()) || cd10.f81061M.equals(v7tVar.m200276d()) || cd10.f81066R.equals(v7tVar.m200276d());
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m110046W3(List list) {
        m213811F2().MultiCallEvent.applyData().mo199274m(list);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98250R()).filter(new qcj() { // from class: l.wi10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189331a.m110039X3((v7t) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.xi10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194429a.m110038R3((v7t) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98248Q()).subscribe(dhw.m115829h(new y20() { // from class: l.yi10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200007a.m110041P3((c8t) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98242N()).subscribe(dhw.m115829h(new y20() { // from class: l.zi10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204488a.m110040O3((LongLinkMultiCallMessage.MultiCallActionMessage) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m168545q1().m98246P());
        final v3f.C20736d<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage, C22421c<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage>> c20736dReceiveInviteLeadRoleMessage = m213811F2().MultiCallEvent.receiveInviteLeadRoleMessage();
        Objects.requireNonNull(c20736dReceiveInviteLeadRoleMessage);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.aj10
            @Override // p153l.y20
            public final void call(Object obj) {
                c20736dReceiveInviteLeadRoleMessage.mo199273j((LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage) obj);
            }
        }));
    }
}
