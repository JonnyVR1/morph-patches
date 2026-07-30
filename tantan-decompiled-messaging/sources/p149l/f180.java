package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkAction;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;

/* JADX INFO: loaded from: classes5.dex */
public class f180 extends mp70 {

    /* JADX INFO: renamed from: q */
    public final n180 f94055q;

    /* JADX INFO: renamed from: r */
    public final PkLaunchData f94056r;

    /* JADX INFO: renamed from: s */
    public String f94057s;

    /* JADX INFO: renamed from: l.f180$a */
    public static /* synthetic */ class C16736a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94058a;

        static {
            int[] iArr = new int[PkAction.values().length];
            f94058a = iArr;
            try {
                iArr[PkAction.ACTION_CTYP_TO_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94058a[PkAction.ACTION_TIME_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f180(bsm bsmVar, PkLaunchData pkLaunchData) {
        super(bsmVar, pkLaunchData.pkViewInternal);
        n180 n180Var = (n180) m144512z2(new n180(bsmVar));
        this.f94055q = n180Var;
        this.f135015i.m180306R3(n180Var);
        this.f94056r = pkLaunchData;
    }

    private void reset() {
        this.f135017k.m109472R3();
        this.f94055q.reset();
        this.f135016j.m118872d4();
        ht70.m132851h();
        m155784W3();
    }

    /* JADX INFO: renamed from: u4 */
    private void m119096u4(int i) {
        if (i == 0) {
            mo119102V3(PkAction.ACTION_CTYP_TO_NORMAL);
        }
    }

    /* JADX INFO: renamed from: v4 */
    private void m119097v4() {
        PkLaunchData pkLaunchData = this.f94056r;
        if (pkLaunchData == null) {
            return;
        }
        this.f135015i.m180309X3(pkLaunchData.pkId);
        this.f94057s = this.f94056r.pkId;
        ht70.m132853j("enter room pk id= " + this.f94057s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m119098w4(rwb rwbVar) {
        m119096u4(rwbVar.f161324a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public void m119099x4(PkData pkData) {
        String string = pkData.state.toString();
        int iHashCode = string.hashCode();
        if (iHashCode == -864432403) {
            if (string.equals(BLivePkStage.punishing)) {
                this.f135016j.m118889v4(true, pkData, pkData.lastStateIsPlaying());
                m155782S3(pkData);
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
            m155782S3(pkData);
            if (pkData.isOnceMore()) {
                m119100y4();
            } else {
                m206028F2().LivePkEvent.updateCurrentPk().mo172463j(pkData.f51567pk.f44421id);
            }
            m119101z4(this.f135015i.m180303N3());
        }
    }

    /* JADX INFO: renamed from: y4 */
    private void m119100y4() {
        this.f135016j.m118887t4();
        this.f135017k.m109472R3();
    }

    /* JADX INFO: renamed from: z4 */
    private void m119101z4(PkData pkData) {
        ht70.m132853j("showPkView pkdata state " + pkData.state.toString());
        if (pkData.isPking()) {
            ht70.m132853j("showPkView " + pkData.f51567pk.f44421id);
            this.f135016j.m118889v4(true, pkData, true);
        }
    }

    @Override // p149l.mp70
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: V3 */
    public void mo119102V3(PkAction pkAction) {
        super.mo119102V3(pkAction);
        int i = C16736a.f94058a[pkAction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.f94055q.m157343O3(BLivePkStage.get(pkAction.getExtra()));
        } else {
            this.f135016j.m118872d4();
            this.f94055q.reset();
            ht70.m132851h();
            this.f135017k.m109472R3();
            m155784W3();
            m206028F2().LivePkEvent.pkEndEvent().m172467p();
        }
    }

    @Override // p149l.mp70
    /* JADX INFO: renamed from: a4 */
    public void mo119103a4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkMute pkMute = livePkMessage.pkMuteInfo;
        if (pkMute != null && TextUtils.equals(m155783T3(), pkMute.getPkId())) {
            lsi0.m151595y(wx70.m205911k(pkMute.getMuted(), m119105t4()));
            ((PkViewInternal) this.viewModel).m76127y0(pkMute.getMuted());
        }
    }

    @Override // p149l.mp70
    /* JADX INFO: renamed from: m4 */
    public void mo119104m4(boolean z, String str, e30<Boolean> e30Var) {
        lsi0.m151595y(wx70.m205911k(true, str));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        reset();
    }

    @Override // p149l.mp70, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m119097v4();
        duringCreated(this.f135015i.m180305P3()).subscribe(ffw.m121193d(new e30() { // from class: l.d180
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83247a.m119099x4((PkData) obj);
            }
        }));
        duringCreated(m206028F2().PlayerEvent.ctypChanged().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.e180
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88716a.m119098w4((rwb) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public String m119105t4() {
        PkData pkDataM180303N3 = this.f135015i.m180303N3();
        return pkDataM180303N3.isPking() ? pkDataM180303N3.otherUser().name : "";
    }
}
