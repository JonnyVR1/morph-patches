package p149l;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.p046p1.mobile.putong.live.base.data.BLiveMixEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.C12532b;
import com.p046p1.mobile.putong.live.external.internal.vchat.sdk.base.MotionParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class t2l0 extends k2l0 {

    /* JADX INFO: renamed from: k */
    public final a3l0 f167517k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, Boolean> f167518l;

    public t2l0(a3l0 a3l0Var) {
        super(a3l0Var);
        this.f167518l = new HashMap<>();
        this.f167517k = a3l0Var;
    }

    /* JADX INFO: renamed from: r1 */
    public static C12532b m187013r1(MotionParams motionParams) {
        return motionParams instanceof a3l0 ? new t2l0((a3l0) motionParams) : iy00.f115419d;
    }

    /* JADX INFO: renamed from: w1 */
    private void m187014w1() {
        MMLiveTranscoding mMLiveTranscoding = this.f120746h;
        if (mMLiveTranscoding == null) {
            return;
        }
        mMLiveTranscoding.confMembers.clear();
        this.f120746h.infoMembers.clear();
        vwb.m200354z(this.f167518l.keySet(), new e30() { // from class: l.s2l0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161989a.m187016s1((String) obj);
            }
        });
        this.f45340d.f157169d.m138713a1(this.f120747i);
        this.f45340d.f157169d.m138712Z0(this.f120746h);
        gkh0.m126627j("videoChat", "updateCanvasAndVideoResolution sei = " + this.f120746h.toString());
    }

    @Override // p149l.k2l0, p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: C0 */
    public void mo110342C0(String str, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110342C0(str, i, mMLivePushType);
        m187017t1(ypv.f199493a.m199309D0());
    }

    @Override // p149l.k2l0, p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: d0 */
    public void mo110356d0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110356d0(str, j, mMLivePushType);
    }

    @Override // p149l.k2l0, p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e */
    public void mo110357e(long j, boolean z) {
        super.mo110357e(j, z);
        if (TextUtils.equals(l9s.m149093o0(), String.valueOf(j)) || !z) {
            return;
        }
        m187020x1(String.valueOf(j), Boolean.TRUE);
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: e0 */
    public void mo110358e0(String str, long j, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110358e0(str, j, mMLivePushType);
    }

    @Override // p149l.k2l0
    /* JADX INFO: renamed from: f1 */
    public MMLiveRoomParams mo144311f1() {
        MMLiveRoomParams mMLiveRoomParamsMo144311f1 = super.mo144311f1();
        mMLiveRoomParamsMo144311f1.isHost = true;
        return mMLiveRoomParamsMo144311f1;
    }

    @Override // p149l.k2l0
    /* JADX INFO: renamed from: g1 */
    public MMLiveMediaConfig mo144312g1(BLiveVideoQualityConf bLiveVideoQualityConf) {
        MMLiveMediaConfig mMLiveMediaConfigMo144312g1 = super.mo144312g1(bLiveVideoQualityConf);
        if (!TextUtils.isEmpty(bLiveVideoQualityConf.pushUrl)) {
            mMLiveMediaConfigMo144312g1.url = bLiveVideoQualityConf.pushUrl;
        }
        return mMLiveMediaConfigMo144312g1;
    }

    @Override // p149l.k2l0
    /* JADX INFO: renamed from: j1 */
    public MMLiveTranscoding mo144315j1(BLiveMixEncode bLiveMixEncode) {
        MMLiveTranscoding mMLiveTranscoding = new MMLiveTranscoding();
        mMLiveTranscoding.canvasWidth = bLiveMixEncode.width;
        mMLiveTranscoding.canvasHeight = bLiveMixEncode.height;
        mMLiveTranscoding.videoBitrate = bLiveMixEncode.bitRate;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = ypv.f199493a.m199309D0();
        m187018u1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f, 1);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMember);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMember);
        this.f167518l.put(ypv.f199493a.m199309D0(), Boolean.FALSE);
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember2 = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember2.userid = this.f167517k.f67393j;
        m187018u1(mMLiveLinkMember2, 0.003f, 0.003f, 0.0f, 0.0f, 2);
        mMLiveTranscoding.confMembers.add(mMLiveLinkMember2);
        mMLiveTranscoding.infoMembers.add(mMLiveLinkMember2);
        this.f167518l.put(this.f167517k.f67393j, Boolean.TRUE);
        mMLiveTranscoding.ctyp = Integer.parseInt(this.f167517k.f45335c);
        mMLiveTranscoding.userid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.mid = ypv.f199493a.m199309D0();
        mMLiveTranscoding.inv = String.valueOf(mqi0.m155944o());
        return mMLiveTranscoding;
    }

    @Override // p149l.k2l0
    /* JADX INFO: renamed from: k1 */
    public i3l0 mo144316k1() {
        return new i3l0(true);
    }

    @Override // p149l.k2l0, p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: o0 */
    public void mo110360o0(long j, int i, MMLiveRoomParams.MMLivePushType mMLivePushType) {
        super.mo110360o0(j, i, mMLivePushType);
        m187017t1(String.valueOf(j));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m187015q1(String str, boolean z) {
        this.f167518l.put(str, Boolean.valueOf(z));
        m187014w1();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m187016s1(String str) {
        t2l0 t2l0Var;
        MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember = new MMLiveTranscoding.MMLiveLinkMember();
        mMLiveLinkMember.userid = str.toString();
        if (this.f167517k.f67395l && TextUtils.equals(ypv.f199493a.m199309D0(), str.toString())) {
            t2l0Var = this;
            t2l0Var.m187018u1(mMLiveLinkMember, 1.0f, 1.0f, 0.0f, 0.0f, 1);
        } else {
            t2l0Var = this;
            if (t2l0Var.f167518l.get(str).booleanValue()) {
                t2l0Var.m187018u1(mMLiveLinkMember, 0.003f, 0.003f, 0.0f, 0.0f, 2);
            } else {
                t2l0Var.m187018u1(mMLiveLinkMember, 0.237f, 0.156f, 0.725f, 0.067f, 2);
            }
        }
        t2l0Var.f120746h.infoMembers.add(mMLiveLinkMember);
        t2l0Var.f120746h.confMembers.add(mMLiveLinkMember);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m187017t1(String str) {
        this.f167518l.remove(str);
        m187014w1();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m187018u1(MMLiveTranscoding.MMLiveLinkMember mMLiveLinkMember, float f, float f2, float f3, float f4, int i) {
        mMLiveLinkMember.f13962w = f;
        mMLiveLinkMember.f13961h = f2;
        mMLiveLinkMember.f13963x = f3;
        mMLiveLinkMember.f13964y = f4;
        mMLiveLinkMember.f13965z = i;
        gkh0.m126627j("videoChat", "member:" + mMLiveLinkMember.toString());
    }

    /* JADX INFO: renamed from: v1 */
    public void m187019v1(String str) {
        hfw.m130790a("videoChat", "anchor push setRestartWithURL:" + str);
        this.f45340d.f157169d.m138714b1(str);
    }

    /* JADX INFO: renamed from: x1 */
    public void m187020x1(String str, Boolean bool) {
        this.f167518l.put(str, bool);
        m187014w1();
    }

    @Override // p149l.k2l0, p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: z0 */
    public void mo110366z0(long j, SurfaceView surfaceView) {
        super.mo110366z0(j, surfaceView);
        m187015q1(String.valueOf(j), false);
    }
}
