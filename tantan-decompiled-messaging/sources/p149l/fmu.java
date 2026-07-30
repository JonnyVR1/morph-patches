package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveJsRoomInfo;
import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes13.dex */
public class fmu extends weu<fmu> implements ful {

    /* JADX INFO: renamed from: f */
    public final String f98376f;

    /* JADX INFO: renamed from: g */
    public String f98377g;

    public fmu(jlu jluVar) {
        super(jluVar);
        this.f98376f = "LivingJsBridgePlug:";
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m144512z2(new ziu(m218413M2()));
        hashCode();
        m218409H2().getClass();
        hgv.m130925c(this);
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.emu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92250a.m122255U2((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T2 */
    public final void m122254T2(e30<String> e30Var) {
        if (m218409H2() == null || m218409H2().m203901A() == null) {
            muk.m156415a("data() || data().getLive() == null.");
        } else {
            muk.m156415a("isAnchor() is " + m218414N2() + ", and live id is " + m218409H2().m203942s());
        }
        if (!TextUtils.isEmpty(this.f98377g)) {
            e30Var.call(this.f98377g);
            return;
        }
        if (m218409H2() == null || m218409H2().m203901A() == null) {
            e30Var.call(WeJson.EMPTY_MAP);
            return;
        }
        BLiveJsRoomInfo bLiveJsRoomInfoNew_ = BLiveJsRoomInfo.new_();
        bLiveJsRoomInfoNew_.roomId = m218409H2().m203901A().roomId;
        bLiveJsRoomInfoNew_.liveId = m218409H2().m203901A().liveId;
        bLiveJsRoomInfoNew_.anchorId = m218409H2().m203901A().anchorId;
        bLiveJsRoomInfoNew_.roomType = "videoChat";
        bLiveJsRoomInfoNew_.fakeId = w220.m201014a();
        bLiveJsRoomInfoNew_.liveMode = "normal";
        String strSerialize = BLiveJsRoomInfo.JSON_ADAPTER.serialize(bLiveJsRoomInfoNew_);
        this.f98377g = strSerialize;
        e30Var.call(strSerialize);
    }

    /* JADX INFO: renamed from: U2 */
    public final void m122255U2(String str) {
        if (VoiceCallStatus.calling.equals(str)) {
            this.f98377g = null;
        }
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: f0 */
    public void mo122256f0(u3g0 u3g0Var) {
        m218411K2().LiveVChatBridgeImplEvent.m69188c().mo172463j(u3g0Var);
    }

    @Override // p149l.ful
    /* JADX INFO: renamed from: j1 */
    public void mo122257j1(boolean z, e30<String> e30Var) {
        m122254T2(e30Var);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        hashCode();
        m218409H2().getClass();
        hgv.m130923a(this);
        this.f98377g = null;
    }
}
