package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public class sa10<D extends ho2> extends pat<D> {

    /* JADX INFO: renamed from: i */
    public final j510<D> f163252i;

    /* JADX INFO: renamed from: l.sa10$a */
    public static /* synthetic */ class C19876a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f163253a;

        static {
            int[] iArr = new int[LongLinkMultiCallMessage.MultiCallActionMessage.Type.values().length];
            f163253a = iArr;
            try {
                iArr[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOnFreeCall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f163253a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOffFreeCall.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f163253a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOffMultiCall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f163253a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOnMultiCall.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f163253a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.switch6MaxCallNum.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f163253a[LongLinkMultiCallMessage.MultiCallActionMessage.Type.switch9MaxCallNum.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public sa10(bsm<D> bsmVar, j510<D> j510Var) {
        super(bsmVar);
        this.f163252i = j510Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public void m182784R3(u5t u5tVar) {
        if (s410.f162219I.equals(u5tVar.m191878d())) {
            this.f163252i.m139798Z3(u5tVar.m191876b());
        } else if (m182791V3(u5tVar)) {
            this.f163252i.m139822x4(u5tVar.m191876b());
        } else if (s410.f162220J.equals(u5tVar.m191878d())) {
            m182789T3(u5tVar.m191876b());
        } else if (s410.f162218H.equals(u5tVar.m191878d())) {
            r610.m178004i0(this, u5tVar.m191876b(), "longlink");
        } else if (s410.f162229S.equals(u5tVar.m191878d())) {
            m206028F2().MultiCallEvent.switchToLeadRole().mo172463j(u5tVar.m191876b());
        } else if (s410.f162230T.equals(u5tVar.m191878d())) {
            m206028F2().MultiCallEvent.cancelLeadRole().mo172463j(u5tVar);
        } else if (s410.f162232V.equals(u5tVar.m191878d())) {
            hfw.m130790a(s410.f162235a, "receive cdn fail" + u5tVar.f174754a.refreshPushStreamUrl);
            this.f163252i.f116261l.mo144991i4(u5tVar.f174754a.refreshPushStreamUrl);
        }
        if (m182790U3(u5tVar.m191878d())) {
            duringCreated(LivingNormalApiProvider.m71607w4(m206027E2().m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.ra10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f158469a.m182792W3((List) obj);
                }
            }));
        }
        if (TextUtils.isEmpty(u5tVar.m191877c())) {
            return;
        }
        lsi0.m151595y(u5tVar.m191877c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ Boolean m182785X3(u5t u5tVar) {
        return Boolean.valueOf(this.f163252i.m139808j4(u5tVar.m191876b()));
    }

    /* JADX INFO: renamed from: O3 */
    public final void m182786O3(LongLinkMultiCallMessage.MultiCallActionMessage multiCallActionMessage) {
        switch (C19876a.f163253a[multiCallActionMessage.getType().ordinal()]) {
            case 1:
            case 2:
                this.f163252i.m139800b4().f73728b = multiCallActionMessage.getType().equals(LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOnFreeCall);
                break;
            case 3:
            case 4:
                m182788S3(multiCallActionMessage.getType(), multiCallActionMessage.getUserId());
                break;
            case 5:
                if (!ve10.m198136j(this.f163252i.m139803e4()) && !ve10.m198140n(r610.m177969D(this))) {
                    m206028F2().MultiCallEvent.switchDeputyCount().mo172463j(6);
                    break;
                }
                break;
            case 6:
                if (!ve10.m198136j(this.f163252i.m139803e4()) && !ve10.m198140n(r610.m177969D(this))) {
                    m206028F2().MultiCallEvent.switchDeputyCount().mo172463j(9);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m182787P3(b6t b6tVar) {
        if (s410.f162259y.equals(b6tVar.m100475c())) {
            lsi0.m151595y(w8u.m202218u(R$string.f47233f9, b6tVar.m100474b().toUserName));
        } else if (s410.f162211A.equals(b6tVar.m100475c())) {
            lsi0.m151595y(w8u.m202218u(R$string.f47255g9, b6tVar.m100474b().toUserName));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m182788S3(LongLinkMultiCallMessage.MultiCallActionMessage.Type type, String str) {
        BLiveMultiCall bLiveMultiCallM178019z = r610.m178019z(this);
        if ((bLiveMultiCallM178019z == null || bLiveMultiCallM178019z.isAway) && LongLinkMultiCallMessage.MultiCallActionMessage.Type.turnOffMultiCall.equals(type)) {
            m206028F2().MultiCallEvent.openApplyDlg().mo172463j(-100);
            m206028F2().MultiCallEvent.closeAcceptDlg().mo172463j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m182789T3(BLiveMultiCall bLiveMultiCall) {
        if (r610.m177988W(bLiveMultiCall.userId) && r610.m177981P(this)) {
            m206028F2().MultiCallEvent.hangUpSelfCall().mo172463j(bLiveMultiCall);
        }
        if (!ve10.m198136j(bLiveMultiCall)) {
            this.f163252i.m139820v4(bLiveMultiCall);
        }
        if (!ve10.m198136j(bLiveMultiCall) || r610.m177988W(bLiveMultiCall.userId)) {
            return;
        }
        m206028F2().MultiCallEvent.openApplyDlg().mo172463j(-100);
        m206028F2().MultiCallEvent.closeAcceptDlg().mo172463j(Boolean.TRUE);
        if (m206027E2().mo97490p()) {
            lsi0.m151593w(R$string.f46924R);
        } else {
            lsi0.m151593w(R$string.f47466q1);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m182790U3(String str) {
        return s410.f162216F.equals(str) || s410.f162217G.equals(str) || s410.f162218H.equals(str) || s410.f162220J.equals(str) || s410.f162221K.equals(str);
    }

    /* JADX INFO: renamed from: V3 */
    public final boolean m182791V3(u5t u5tVar) {
        return s410.f162224N.equals(u5tVar.m191878d()) || s410.f162225O.equals(u5tVar.m191878d()) || s410.f162221K.equals(u5tVar.m191878d()) || s410.f162222L.equals(u5tVar.m191878d()) || s410.f162223M.equals(u5tVar.m191878d()) || s410.f162228R.equals(u5tVar.m191878d());
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m182792W3(List list) {
        m206028F2().MultiCallEvent.applyData().mo172464m(list);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189068R()).filter(new w9j() { // from class: l.ma10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f132828a.m182785X3((u5t) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.na10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137856a.m182784R3((u5t) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189066Q()).subscribe(ffw.m121197h(new e30() { // from class: l.oa10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142770a.m182787P3((b6t) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189060N()).subscribe(ffw.m121197h(new e30() { // from class: l.pa10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147835a.m182786O3((LongLinkMultiCallMessage.MultiCallActionMessage) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m132160q1().m189064P());
        final q2f.C19397d<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage, C22306c<LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage>> c19397dReceiveInviteLeadRoleMessage = m206028F2().MultiCallEvent.receiveInviteLeadRoleMessage();
        Objects.requireNonNull(c19397dReceiveInviteLeadRoleMessage);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.qa10
            @Override // p149l.e30
            public final void call(Object obj) {
                c19397dReceiveInviteLeadRoleMessage.mo172463j((LongLinkMultiCallMessage.MultiCallSwitchToLeadRoleInviteMessage) obj);
            }
        }));
    }
}
