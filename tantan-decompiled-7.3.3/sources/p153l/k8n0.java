package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;

/* JADX INFO: loaded from: classes5.dex */
public class k8n0 extends i6t<oo2, VoiceChatInputView> {

    /* JADX INFO: renamed from: i */
    public long f124396i;

    /* JADX INFO: renamed from: j */
    public String f124397j;

    /* JADX INFO: renamed from: k */
    public String f124398k;

    /* JADX INFO: renamed from: l */
    public String f124399l;

    /* JADX INFO: renamed from: m */
    public String f124400m;

    /* JADX INFO: renamed from: n */
    public String f124401n;

    public k8n0(dum dumVar) {
        super(dumVar);
        mo52715C(new VoiceChatInputView());
    }

    /* JADX INFO: renamed from: S3 */
    private boolean m148721S3(String str, String str2) {
        if (pzi0.m174454o() - this.f124396i < zrv.m221193k().m203475N4()) {
            return false;
        }
        return m148722T3(str, str2);
    }

    /* JADX INFO: renamed from: T3 */
    private boolean m148722T3(String str, String str2) {
        if (pzi0.m174454o() - this.f124396i < zrv.m221193k().m203690o4() * 1000) {
            return !str.equals(this.f124397j);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m148723Z3(vxj0 vxj0Var) {
        ((VoiceChatInputView) this.viewModel).m79205z();
    }

    /* JADX INFO: renamed from: g4 */
    private void m148724g4() {
        this.f124401n = "0";
        this.f124400m = "";
        this.f124399l = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m148725j4(boolean z) {
        ((VoiceChatInputView) this.viewModel).m79195O(z);
    }

    /* JADX INFO: renamed from: U3 */
    public void m148726U3() {
        ((VoiceChatInputView) this.viewModel).m79201v();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m148727V3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        ((VoiceChatInputView) this.viewModel).m79194J(bLiveVoiceRoomAsset.tips);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m148728W3(String str, String str2, uxj0 uxj0Var) {
        m148740l4(((VoiceChatInputView) this.viewModel).m79203x(), str, "", "");
        m213811F2().ChatEvent.sendMessageResult().mo199273j(Boolean.TRUE);
        this.f124398k = null;
        m148735e4(str2);
        m148724g4();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m148729X3(String str, Throwable th) {
        int i;
        if (th instanceof TantanException.Client.CoreService) {
            i = ((TantanException.Client.CoreService) th).code;
            m148740l4(((VoiceChatInputView) this.viewModel).m79203x(), str, "", String.valueOf(i));
        } else {
            m148740l4(((VoiceChatInputView) this.viewModel).m79203x(), str, "", "");
            i = 0;
        }
        m213811F2().ChatEvent.sendMessageResult().mo199273j(Boolean.FALSE);
        this.f124398k = null;
        if (i == 42008) {
            this.f196919f.dialog().m21503F(((TantanException.Client.CoreService) th).metaMessage).m21495B(false).m21542m0(zrv.f205803e.getString(R$string.f48271o2)).m21567z0();
        } else {
            snt.m187001a(th);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m148730Y3(gw40 gw40Var) {
        m148738i4(gw40Var.f106726a, "user");
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m148731a4(rz4 rz4Var) {
        m148738i4(rz4Var.m183688a().getMessageOnly(), "user");
    }

    /* JADX INFO: renamed from: b4 */
    public void m148732b4(vv4 vv4Var) {
        String str = vv4Var.f185890c;
        this.f124401n = str;
        if ("3".equals(str)) {
            this.f124399l = vv4Var.f185893f;
            this.f124400m = vv4Var.f185889b;
        }
        ((VoiceChatInputView) this.viewModel).m79193I(vv4Var.f185888a, vv4Var.f185889b);
    }

    /* JADX INFO: renamed from: c4 */
    public void m148733c4() {
        if (wft.m206159b(3)) {
            m148737h4();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m148734d4(int i) {
        m213811F2().KeyboardEvent.show().mo199273j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: e4 */
    public void m148735e4(String str) {
        ((VoiceChatInputView) this.viewModel).m79200u(str);
    }

    /* JADX INFO: renamed from: f4 */
    public void m148736f4(int i) {
        m213811F2().KeyboardEvent.show().mo199273j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m148737h4() {
        if ((m213810E2() instanceof jqm0) && ((jqm0) m213810E2()).f165201X) {
            jqm0 jqm0Var = (jqm0) m213810E2();
            duringCreated(jqm0Var.m183427c3(jqm0Var.m202194o(), jqm0Var.m146609b4().getFocusUser())).subscribe(dhw.m115829h(new y20() { // from class: l.j8n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118794a.m148727V3((BLiveVoiceRoomAsset) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: i4 */
    public void m148738i4(final String str, final String str2) {
        String strReplace;
        if (str.length() == 0) {
            return;
        }
        if (!m148721S3(str, str2)) {
            o1j0.m165636j(zrv.m221193k().m203562Y3());
            return;
        }
        rz4.C19938a c19938a = new rz4.C19938a("");
        if (!TextUtils.isEmpty(this.f124400m)) {
            this.f124400m = this.f124400m.trim();
        }
        if ("3".equals(this.f124401n) && !TextUtils.isEmpty(this.f124399l) && !TextUtils.isEmpty(this.f124400m) && this.f124400m.contains("@") && str.contains(this.f124400m)) {
            strReplace = str.replace(this.f124400m, "");
            c19938a.f165486b = this.f124399l;
            c19938a.f165487c = this.f124400m.replace("@", "");
        } else {
            m148724g4();
            strReplace = str;
        }
        this.f124396i = pzi0.m174454o();
        this.f124397j = strReplace;
        this.f124398k = str2;
        duringCreated(m213810E2().m168487V1(strReplace, c19938a)).subscribe(dhw.m115826e(new y20() { // from class: l.h8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108254a.m148728W3(str2, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.i8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113362a.m148729X3(str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m148739k4(boolean z) {
        if (z) {
            ((VoiceChatInputView) this.viewModel).m79196P(true);
        } else {
            m148726U3();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceChatInputView) this.viewModel).m79198r();
        duringCreated(m213811F2().ChatEvent.chatInputClick().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.b8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75447a.m148732b4((vv4) obj);
            }
        }));
        duringCreated(m213811F2().VoiceChatEvent.chatInputVisibleEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.c8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80224a.m148739k4(((Boolean) obj).booleanValue());
            }
        }));
        if (!wft.m206159b(3)) {
            duringCreated(m213811F2().LiveBridgeImplEvent.sendChatMessage().m199270g()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.g8n0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102701a.m148731a4((rz4) obj);
                }
            }));
            return;
        }
        duringCreated(m213811F2().VoiceChatEvent.chatEmojiVisibleEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.d8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85659a.m148725j4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m213811F2().ChatEvent.sendNormalMessage().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.e8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92551a.m148730Y3((gw40) obj);
            }
        }));
        m138863h3(m213811F2().VoiceVirtualLiveEvent.dismissChatTips(), new y20() { // from class: l.f8n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97750a.m148723Z3((vxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final void m148740l4(String str, String str2, String str3, String str4) {
    }
}
