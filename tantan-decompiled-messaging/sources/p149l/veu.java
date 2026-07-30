package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatAct;
import com.p046p1.mobile.putong.live.external.internal.vchat.end.LiveVChatEndAct;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes13.dex */
public class veu extends zeu<veu> implements s7m<veu> {

    /* JADX INFO: renamed from: l.veu$a */
    public class C20624a implements z91 {
        public C20624a() {
        }
    }

    public veu(jlu jluVar) {
        super(jluVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public void m198242V2(String str) {
        if (slk0.m184826b(m218409H2().m203901A())) {
            m218409H2().m203930d0(m218409H2().m203901A().liveId, m218409H2().m203901A().roomId);
        }
        if (slk0.m184831g(m218409H2().m203901A())) {
            m198245W2();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ib1.m135233b().mo135238f(LiveVChatAct.f45046i, AudioBusinessType.VIDEO_CHAT, new C20624a());
        vet.m198232p(hgt.INSTANCE.m130911R(), act(), new Object[0]).subscribe(ffw.m121192c());
        m104250o2(m218409H2().m203948z(), false).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.teu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169912a.m198242V2((String) obj);
            }
        }));
        m104250o2(m218409H2().f186998c.m216979l().f170412V1, false).subscribe(ffw.m121197h(new e30() { // from class: l.ueu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176199a.m198246X2((liveAuthMessageNew.MultiDevice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public final void m198244U2() {
        gkh0.m126627j("videoChat", "audience handleMultiDeviceLogin");
        m218409H2().m203919S(slk0.f165244j);
        m218409H2().m203935i0("stopped", "已在其它设备登录");
    }

    /* JADX INFO: renamed from: W2 */
    public final void m198245W2() {
        if (!m218409H2().m203901A().called) {
            m218412L2(true);
            return;
        }
        act().startActivity(LiveVChatEndAct.m69285h2(act(), m218409H2().m203939p(), m218409H2().m203938o(), m218409H2().m203901A().endTipMessage, ""));
        m218412L2(false);
        act().overridePendingTransition(wzb0.f188721d, 0);
        if (m218409H2().f187000e) {
            C12505a.m69246p(this, true);
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m198246X2(liveAuthMessageNew.MultiDevice multiDevice) {
        m198244U2();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ib1.m135233b().mo135234a(LiveVChatAct.f45046i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: T2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(veu veuVar) {
    }
}
