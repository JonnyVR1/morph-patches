package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class lr70 extends mp70 {

    /* JADX INFO: renamed from: q */
    public final vs70 f129467q;

    /* JADX INFO: renamed from: r */
    public final PkLaunchData f129468r;

    /* JADX INFO: renamed from: s */
    public DialogInterfaceC0074a f129469s;

    /* JADX INFO: renamed from: l.lr70$a */
    public static /* synthetic */ class C18288a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f129470a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f129470a = iArr;
            try {
                iArr[PkAction.ACTION_PK_EXIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129470a[PkAction.ACTION_PK_ONCE_MORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129470a[PkAction.ACTION_TIME_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lr70(bsm bsmVar, PkLaunchData pkLaunchData) {
        super(bsmVar, pkLaunchData.pkViewInternal);
        this.f129468r = pkLaunchData;
        vs70 vs70Var = new vs70(bsmVar);
        this.f129467q = vs70Var;
        this.f135015i.m180306R3(vs70Var);
    }

    /* JADX INFO: renamed from: A4 */
    private void m151109A4() {
        ((bxl) m129297F3(new bu00(600))).mo71858G(1001);
    }

    /* JADX INFO: renamed from: B4 */
    private void m151110B4() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f129469s;
        if (dialogInterfaceC0074a == null || !dialogInterfaceC0074a.isShowing()) {
            return;
        }
        this.f129469s.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m151111D4(String str, boolean z, e30 e30Var) {
        ht70.m132853j("setMuteRemoteAudio name = " + str + " isMute = " + z);
        m151120N4(z, true);
        e30Var.call(Boolean.valueOf(z));
        lsi0.m151595y(wx70.m205910j(z, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m151112E4(BLivePk bLivePk) {
        ht70.m132850g(this, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m151113F4(Throwable th) {
        ht70.m132850g(this, false, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m151114G4(soj0 soj0Var) {
        m151134Q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public /* synthetic */ String m151115H4(am70 am70Var) {
        return ypv.m215672k().m195948t5(mo151135U3(), m155789d4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public /* synthetic */ Boolean m151116I4(b080 b080Var) {
        return Boolean.valueOf(m155791j4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public void m151117J4(PkData pkData) {
        String string = pkData.state.toString();
        string.getClass();
        switch (string) {
            case "preparing":
                m206028F2().LivePkEvent.pkPrepare().mo172463j(pkData);
                this.f129467q.m199827b4(pkData);
                break;
            case "punishing":
                this.f135016j.m118889v4(true, pkData, pkData.lastStateIsPlaying());
                if (TextUtils.equals(((pn40) m206027E2()).m132146l0().f56011id, pkData.f51567pk.situation.winnerId)) {
                    User user = pkData.getUser(pkData.f51567pk.mvpUserId);
                    this.f135016j.m118871c4(user == null ? 0L : user.hierarchy.grade);
                }
                m155782S3(pkData);
                break;
            case "playing":
                h5j0.INSTANCE.m129402a("pk_anchor_start_trace", "start_pk");
                m151122P4(pkData);
                m151119M4();
                break;
            case "ended":
                m151119M4();
                m151132C4();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public void m151118L4() {
        this.f129467q.m199832g4("leave");
    }

    /* JADX INFO: renamed from: M4 */
    private void m151119M4() {
        m151120N4(false, false);
        ((PkViewInternal) this.viewModel).m76129z0(false);
    }

    /* JADX INFO: renamed from: N4 */
    private void m151120N4(boolean z, boolean z2) {
        try {
            C12714b c12714bMo133471a = ((oxl) m129297F3(new rv00(600))).mo133471a();
            exl exlVar = (exl) m129297F3(new jw00(600));
            String strOtherUserId = this.f135015i.m180303N3().otherUserId();
            if (exlVar != null) {
                exlVar.mo118674P(Integer.parseInt(strOtherUserId), z);
            }
            if (c12714bMo133471a instanceof j080) {
                ((j080) c12714bMo133471a).m139151F1(strOtherUserId, z);
            }
            ht70.m132846c(this, exlVar == null, c12714bMo133471a == null, strOtherUserId, z);
            if (z2) {
                duringCreated(LivingNormalApiProvider.m71609w6(m155783T3(), z)).subscribe(ffw.m121194e(new e30() { // from class: l.ir70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f114591a.m151112E4((BLivePk) obj);
                    }
                }, new e30() { // from class: l.jr70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f119383a.m151113F4((Throwable) obj);
                    }
                }));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    private void m151121O4() {
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return;
        }
        ((pn40) m206027E2()).f108769z.m181793v(bLiveSettingsM195583A3.liveConfig.f44352pk.startShowMessage.anchorTemplateId);
    }

    /* JADX INFO: renamed from: P4 */
    private void m151122P4(PkData pkData) {
        m155782S3(pkData);
        if (pkData.isOnceMore()) {
            this.f129467q.m199850y4();
            m151133K4();
            ((exl) m129297F3(new jw00(600))).mo118680o(pkData.f51567pk.channelKey);
        } else {
            m151121O4();
            this.f129467q.m199825B4(pkData);
        }
        this.f135016j.m118889v4(false, pkData, true);
    }

    /* JADX INFO: renamed from: C4 */
    public void m151132C4() {
        this.f135016j.m118872d4();
        this.f129467q.m199826C4();
        m151109A4();
        mm70.m155308d(this, false);
        mm70.m155307c(this, false);
        this.f135017k.m109472R3();
        m155784W3();
        m151110B4();
    }

    /* JADX INFO: renamed from: K4 */
    public void m151133K4() {
        m151109A4();
        this.f135016j.m118887t4();
        m206028F2().LivePkEvent.pkOnceMoreSuccess().m172467p();
        this.f135017k.m109472R3();
    }

    /* JADX INFO: renamed from: Q4 */
    public void m151134Q4() {
        m206028F2().LivePkEvent.cancelMatch().m172467p();
        this.f129467q.m199832g4("leave");
    }

    @Override // p149l.mp70
    /* JADX INFO: renamed from: U3 */
    public int mo151135U3() {
        return ((Integer) m129297F3(new em70(600))).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.mp70
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo119102V3(PkAction pkAction) {
        super.mo119102V3(pkAction);
        int i = C18288a.f129470a[pkAction.ordinal()];
        if (i == 1) {
            this.f135016j.m118890w4(new d30() { // from class: l.br70
                @Override // p149l.d30
                public final void call() {
                    this.f76879a.m151118L4();
                }
            });
            zvf0.m220399u("e_pk_close_button", mo77274R2(), vwb.m200311Y("liveId", ((pn40) m206027E2()).mo149813j().f44323id), vwb.m200311Y("anchorId", ((pn40) m206027E2()).m132146l0().f56011id));
        } else if (i == 2) {
            m206028F2().LivePkEvent.clickOnceMore().mo172463j(this.f135015i.m180303N3().otherUser());
        } else {
            if (i != 3) {
                return;
            }
            this.f129467q.m199847v4(BLivePkStage.get(pkAction.getExtra()));
        }
    }

    @Override // p149l.mp70
    /* JADX INFO: renamed from: m4 */
    public void mo119104m4(final boolean z, final String str, final e30<Boolean> e30Var) {
        this.f129469s = wx70.m205914o(this.f188513f, this, z, str, new d30() { // from class: l.kr70
            @Override // p149l.d30
            public final void call() {
                this.f124328a.m151111D4(str, z, e30Var);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.mp70, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(this.f135015i.m180305P3()).subscribe(ffw.m121193d(new e30() { // from class: l.cr70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82189a.m151117J4((PkData) obj);
            }
        }));
        this.f135015i.m180308V3(this.f129468r.message);
        duringCreated(m206028F2().LivePkEvent.liveEndEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.dr70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87590a.m151114G4((soj0) obj);
            }
        }));
        m129301d3(am70.class, new w9j() { // from class: l.er70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f92888a.m151115H4((am70) obj);
            }
        });
        m129301d3(b080.class, new w9j() { // from class: l.fr70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98896a.m151116I4((b080) obj);
            }
        });
        C22306c c22306cFilter = duringCreated(((pn40) m206027E2()).m132160q1().m189074U()).filter(new w9j() { // from class: l.gr70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LivePkMessage) obj).type, "pk_cdn_fail"));
            }
        });
        final vs70 vs70Var = this.f129467q;
        Objects.requireNonNull(vs70Var);
        c22306cFilter.subscribe(ffw.m121193d(new e30() { // from class: l.hr70
            @Override // p149l.e30
            public final void call(Object obj) {
                vs70Var.m199834i4((LivePkMessage) obj);
            }
        }));
    }
}
