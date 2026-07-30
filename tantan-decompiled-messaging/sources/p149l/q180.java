package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;

/* JADX INFO: loaded from: classes5.dex */
public class q180 extends my70 {

    /* JADX INFO: renamed from: p */
    public final j180 f152114p;

    /* JADX INFO: renamed from: q */
    public final PkLaunchData f152115q;

    /* JADX INFO: renamed from: r */
    public String f152116r;

    /* JADX INFO: renamed from: l.q180$a */
    public static /* synthetic */ class C19389a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152117a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f152117a = iArr;
            try {
                iArr[PkAction.ACTION_CTYP_TO_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f152117a[PkAction.ACTION_TIME_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public q180(bsm bsmVar, PkLaunchData pkLaunchData) {
        super(bsmVar, pkLaunchData.pkView);
        j180 j180Var = (j180) m144512z2(new j180(bsmVar));
        this.f152114p = j180Var;
        this.f136259i.m99907R3(j180Var);
        this.f152115q = pkLaunchData;
    }

    /* JADX INFO: renamed from: B4 */
    private void m172374B4() {
        this.f136260j.m211939v4();
        this.f136261k.m144026R3();
    }

    private void reset() {
        this.f136261k.m144026R3();
        this.f152114p.reset();
        this.f136260j.m211926e4();
        ht70.m132851h();
        m156976W3();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m172377A4(PkData pkData) {
        String string = pkData.state.toString();
        int iHashCode = string.hashCode();
        if (iHashCode == -864432403) {
            if (string.equals(BLivePkStage.punishing)) {
                this.f136260j.m211941x4(true, pkData, pkData.lastStateIsPlaying());
                m156974S3(pkData);
                return;
            }
            return;
        }
        if (iHashCode != -493563858) {
            if (iHashCode != 96651962) {
                return;
            }
            string.equals("ended");
        } else if (string.equals("playing")) {
            m156974S3(pkData);
            if (pkData.isOnceMore()) {
                m172374B4();
            } else {
                m206028F2().LivePkEvent.updateCurrentPk().mo172463j(pkData.f51567pk.f44421id);
            }
            m172378C4(this.f136259i.m99904N3());
        }
    }

    /* JADX INFO: renamed from: C4 */
    public final void m172378C4(PkData pkData) {
        ht70.m132853j("showPkView pkdata state " + pkData.state.toString());
        if (pkData.isPking()) {
            ht70.m132853j("showPkView " + pkData.f51567pk.f44421id);
            this.f136260j.m211941x4(true, pkData, true);
        }
    }

    @Override // p149l.my70
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo127905V3(PkAction pkAction) {
        super.mo127905V3(pkAction);
        int i = C19389a.f152117a[pkAction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f152114p.m139291O3(BLivePkStage.get(pkAction.getExtra()));
        } else {
            this.f136260j.m211926e4();
            this.f152114p.reset();
            ht70.m132851h();
            this.f136261k.m144026R3();
            m156976W3();
            m206028F2().LivePkEvent.pkEndEvent().m172467p();
        }
    }

    @Override // p149l.my70
    /* JADX INFO: renamed from: a4 */
    public void mo156980a4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkMute pkMute = livePkMessage.pkMuteInfo;
        if (pkMute != null && TextUtils.equals(m156975T3(), pkMute.getPkId())) {
            lsi0.m151595y(wx70.m205911k(pkMute.getMuted(), m172379w4()));
            ((PkView) this.viewModel).m76035m0(pkMute.getMuted());
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        reset();
    }

    @Override // p149l.my70
    /* JADX INFO: renamed from: p4 */
    public void mo127906p4(boolean z, String str, e30<Boolean> e30Var) {
        lsi0.m151595y(wx70.m205911k(true, str));
    }

    @Override // p149l.my70, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m172381y4();
        duringCreated(this.f136259i.m99906P3()).subscribe(ffw.m121193d(new e30() { // from class: l.o180
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141414a.m172377A4((PkData) obj);
            }
        }));
        duringCreated(m206028F2().PlayerEvent.ctypChanged().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.p180
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146658a.m172382z4((rwb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public String m172379w4() {
        PkData pkDataM99904N3 = this.f136259i.m99904N3();
        return pkDataM99904N3.isPking() ? pkDataM99904N3.otherUser().name : "";
    }

    /* JADX INFO: renamed from: x4 */
    public final void m172380x4(int i) {
        if (i == 0) {
            mo127905V3(PkAction.ACTION_CTYP_TO_NORMAL);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m172381y4() {
        PkLaunchData pkLaunchData = this.f152115q;
        if (pkLaunchData == null) {
            return;
        }
        this.f136259i.m99913X3(pkLaunchData.pkId);
        this.f152116r = this.f152115q.pkId;
        ht70.m132853j("enter room pk id= " + this.f152116r);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m172382z4(rwb rwbVar) {
        m172380x4(rwbVar.f161324a);
    }
}
