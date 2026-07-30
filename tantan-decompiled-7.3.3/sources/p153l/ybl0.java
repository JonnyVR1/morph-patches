package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p051p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.C12695b;
import com.p051p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ybl0 extends pbl0 {

    /* JADX INFO: renamed from: k */
    public final fcl0 f198345k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, Boolean> f198346l;

    public ybl0(fcl0 fcl0Var) {
        super(fcl0Var);
        this.f198346l = new HashMap<>();
        this.f198345k = fcl0Var;
    }

    /* JADX INFO: renamed from: r1 */
    public static C12695b m215077r1(MotionParams motionParams) {
        return motionParams instanceof fcl0 ? new ybl0((fcl0) motionParams) : s610.f166531d;
    }

    /* JADX INFO: renamed from: w1 */
    private void m215078w1() {
        MMLiveTranscoding mMLiveTranscoding = this.f151400h;
        if (mMLiveTranscoding == null) {
            return;
        }
        mMLiveTranscoding.confMembers.clear();
        this.f151400h.infoMembers.clear();
        jyb.m147537z(this.f198346l.keySet(), new y20() { // from class: l.xbl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193171a.m215080s1((String) obj);
            }
        });
        this.f46188d.f181964d.m175187a1(this.f151401i);
        this.f46188d.f181964d.m175186Z0(this.f151400h);
        nsh0.m164608j("videoChat", "updateCanvasAndVideoResolution sei = " + this.f151400h.toString());
    }

    @Override // p153l.pbl0, p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: C0 */
    public void mo96682C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96682C0(str, i, mMLivePushType);
        m215081t1(zrv.f205799a.m207631D0());
    }

    @Override // p153l.pbl0, p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: d0 */
    public void mo96686d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96686d0(str, j, mMLivePushType);
    }

    @Override // p153l.pbl0, p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e */
    public void mo120111e(long j, boolean z) {
        super.mo120111e(j, z);
        if (TextUtils.equals(mbs.m157870o0(), String.valueOf(j)) || !z) {
            return;
        }
        m215084x1(String.valueOf(j), Boolean.TRUE);
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: e0 */
    public void mo96687e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96687e0(str, j, mMLivePushType);
    }

    @Override // p153l.pbl0
    /* JADX INFO: renamed from: f1 */
    public MMLiveRoomParams mo171515f1() {
        MMLiveRoomParams mMLiveRoomParamsMo171515f1 = super.mo171515f1();
        mMLiveRoomParamsMo171515f1.isHost = true;
        return mMLiveRoomParamsMo171515f1;
    }

    @Override // p153l.pbl0
    /* JADX INFO: renamed from: g1 */
    public MMLiveMediaConfig mo171516g1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        MMLiveMediaConfig mMLiveMediaConfigMo171516g1 = super.mo171516g1(bLiveVideoQualityConf);
        if (!TextUtils.isEmpty(bLiveVideoQualityConf.pushUrl)) {
            mMLiveMediaConfigMo171516g1.url = bLiveVideoQualityConf.pushUrl;
        }
        return mMLiveMediaConfigMo171516g1;
    }

    @Override // p153l.pbl0
    /* JADX INFO: renamed from: j1 */
    public MMLiveTranscoding mo171519j1(BLiveMixEncode bLiveMixEncode) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = bLiveMixEncode.width;
        mMLiveTranscoding.canvasHeight = bLiveMixEncode.height;
        mMLiveTranscoding.videoBitrate = bLiveMixEncode.bitRate;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = zrv.f205799a.m207631D0();
        m215082u1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f, 1);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMember);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMember);
        this.f198346l.put(zrv.f205799a.m207631D0(), Boolean.FALSE);
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember2.userid = this.f198345k.f98230j;
        m215082u1(mMLiveLinkMember2, 0.003f, 0.003f, 0.0f, 0.0f, 2);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMember2);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMember2);
        this.f198346l.put(this.f198345k.f98230j, Boolean.TRUE);
        mMLiveTranscoding.ctyp = Integer.parseInt(this.f198345k.f46183c);
        mMLiveTranscoding.userid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.mid = zrv.f205799a.m207631D0();
        mMLiveTranscoding.inv = String.valueOf(pzi0.m174454o());
        return mMLiveTranscoding;
    }

    @Override // p153l.pbl0
    /* JADX INFO: renamed from: k1 */
    public ncl0 mo171520k1() {
        return new ncl0(true);
    }

    @Override // p153l.pbl0, p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: o0 */
    public void mo96689o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo96689o0(j, i, mMLivePushType);
        m215081t1(String.valueOf(j));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m215079q1(String str, boolean z) {
        this.f198346l.put(str, Boolean.valueOf(z));
        m215078w1();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m215080s1(String str) {
        ybl0 ybl0Var;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = str.toString();
        if (this.f198345k.f98232l && TextUtils.equals(zrv.f205799a.m207631D0(), str.toString())) {
            ybl0Var = this;
            ybl0Var.m215082u1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f, 1);
        } else {
            ybl0Var = this;
            if (ybl0Var.f198346l.get(str).booleanValue()) {
                ybl0Var.m215082u1(mMLiveLinkMember, 0.003f, 0.003f, 0.0f, 0.0f, 2);
            } else {
                ybl0Var.m215082u1(mMLiveLinkMember, 0.237f, 0.156f, 0.725f, 0.067f, 2);
            }
        }
        ybl0Var.f151400h.infoMembers.add(mMLiveLinkMember);
        ybl0Var.f151400h.confMembers.add(mMLiveLinkMember);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m215081t1(String str) {
        this.f198346l.remove(str);
        m215078w1();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m215082u1(MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember, float f, float f2, float f3, float f4, int i) {
        mMLiveLinkMember.f14656w = f;
        mMLiveLinkMember.f14655h = f2;
        mMLiveLinkMember.f14657x = f3;
        mMLiveLinkMember.f14658y = f4;
        mMLiveLinkMember.f14659z = i;
        nsh0.m164608j("videoChat", "member:" + mMLiveLinkMember.toString());
    }

    /* JADX INFO: renamed from: v1 */
    public void m215083v1(String str) {
        fhw.m125605a("videoChat", "anchor push setRestartWithURL:" + str);
        this.f46188d.f181964d.m175188b1(str);
    }

    /* JADX INFO: renamed from: x1 */
    public void m215084x1(String str, Boolean bool) {
        this.f198346l.put(str, bool);
        m215078w1();
    }

    @Override // p153l.pbl0, p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: z0 */
    public void mo96694z0(long j, SurfaceView surfaceView) {
        super.mo96694z0(j, surfaceView);
        m215079q1(String.valueOf(j), false);
    }
}
