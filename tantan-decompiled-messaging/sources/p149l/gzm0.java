package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomAsset;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;

/* JADX INFO: loaded from: classes5.dex */
public class gzm0 extends h4t<ho2, VoiceChatInputView> {

    /* JADX INFO: renamed from: i */
    public long f105154i;

    /* JADX INFO: renamed from: j */
    public String f105155j;

    /* JADX INFO: renamed from: k */
    public String f105156k;

    /* JADX INFO: renamed from: l */
    public String f105157l;

    /* JADX INFO: renamed from: m */
    public String f105158m;

    /* JADX INFO: renamed from: n */
    public String f105159n;

    public gzm0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new VoiceChatInputView());
    }

    /* JADX INFO: renamed from: S3 */
    private boolean m128884S3(String str, String str2) {
        if (mqi0.m155944o() - this.f105154i < ypv.m215672k().m195688N4()) {
            return false;
        }
        return m128885T3(str, str2);
    }

    /* JADX INFO: renamed from: T3 */
    private boolean m128885T3(String str, String str2) {
        if (mqi0.m155944o() - this.f105154i < ypv.m215672k().m195903o4() * 1000) {
            return !str.equals(this.f105155j);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m128886Z3(soj0 soj0Var) {
        ((VoiceChatInputView) this.viewModel).m78022z();
    }

    /* JADX INFO: renamed from: g4 */
    private void m128887g4() {
        this.f105159n = "0";
        this.f105158m = "";
        this.f105157l = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m128888j4(boolean z) {
        ((VoiceChatInputView) this.viewModel).m78012O(z);
    }

    /* JADX INFO: renamed from: U3 */
    public void m128889U3() {
        ((VoiceChatInputView) this.viewModel).m78018v();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m128890V3(BLiveVoiceRoomAsset bLiveVoiceRoomAsset) {
        ((VoiceChatInputView) this.viewModel).m78011J(bLiveVoiceRoomAsset.tips);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m128891W3(String str, String str2, roj0 roj0Var) {
        m128903l4(((VoiceChatInputView) this.viewModel).m78020x(), str, "", "");
        m206028F2().ChatEvent.sendMessageResult().mo172463j(Boolean.TRUE);
        this.f105156k = null;
        m128898e4(str2);
        m128887g4();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m128892X3(String str, Throwable th) {
        int i;
        if (th instanceof TantanException.Client.CoreService) {
            i = ((TantanException.Client.CoreService) th).code;
            m128903l4(((VoiceChatInputView) this.viewModel).m78020x(), str, "", String.valueOf(i));
        } else {
            m128903l4(((VoiceChatInputView) this.viewModel).m78020x(), str, "", "");
            i = 0;
        }
        m206028F2().ChatEvent.sendMessageResult().mo172463j(Boolean.FALSE);
        this.f105156k = null;
        if (i == 42008) {
            this.f188513f.dialog().m20504F(((TantanException.Client.CoreService) th).metaMessage).m20496B(false).m20543m0(ypv.f199497e.getString(R$string.f47423o2)).m20568z0();
        } else {
            qlt.m175502a(th);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m128893Y3(sn40 sn40Var) {
        m128901i4(sn40Var.f165410a, "user");
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m128894a4(sy4 sy4Var) {
        m128901i4(sy4Var.m186606a().getMessageOnly(), "user");
    }

    /* JADX INFO: renamed from: b4 */
    public void m128895b4(wu4 wu4Var) {
        String str = wu4Var.f188083c;
        this.f105159n = str;
        if ("3".equals(str)) {
            this.f105157l = wu4Var.f188086f;
            this.f105158m = wu4Var.f188082b;
        }
        ((VoiceChatInputView) this.viewModel).m78010I(wu4Var.f188081a, wu4Var.f188082b);
    }

    /* JADX INFO: renamed from: c4 */
    public void m128896c4() {
        if (vdt.m198092b(3)) {
            m128900h4();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m128897d4(int i) {
        m206028F2().KeyboardEvent.show().mo172463j(new KeyboardEventData(KeyboardEventData.Action.Hide, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX INFO: renamed from: e4 */
    public void m128898e4(String str) {
        ((VoiceChatInputView) this.viewModel).m78017u(str);
    }

    /* JADX INFO: renamed from: f4 */
    public void m128899f4(int i) {
        m206028F2().KeyboardEvent.show().mo172463j(new KeyboardEventData(KeyboardEventData.Action.Show, KeyboardEventData.Type.SoftKeyBoard, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m128900h4() {
        if ((m206027E2() instanceof fhm0) && ((fhm0) m206027E2()).f139754X) {
            fhm0 fhm0Var = (fhm0) m206027E2();
            duringCreated(fhm0Var.m160265c3(fhm0Var.m149818o(), fhm0Var.m121381b4().getFocusUser())).subscribe(ffw.m121197h(new e30() { // from class: l.fzm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99981a.m128890V3((BLiveVoiceRoomAsset) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public void m128901i4(final String str, final String str2) {
        String strReplace;
        if (str.length() == 0) {
            return;
        }
        if (!m128884S3(str, str2)) {
            lsi0.m151580j(ypv.m215672k().m195775Y3());
            return;
        }
        sy4.C20071a c20071a = new sy4.C20071a("");
        if (!TextUtils.isEmpty(this.f105158m)) {
            this.f105158m = this.f105158m.trim();
        }
        if ("3".equals(this.f105159n) && !TextUtils.isEmpty(this.f105157l) && !TextUtils.isEmpty(this.f105158m) && this.f105158m.contains("@") && str.contains(this.f105158m)) {
            strReplace = str.replace(this.f105158m, "");
            c20071a.f166890b = this.f105157l;
            c20071a.f166891c = this.f105158m.replace("@", "");
        } else {
            m128887g4();
            strReplace = str;
        }
        this.f105154i = mqi0.m155944o();
        this.f105155j = strReplace;
        this.f105156k = str2;
        duringCreated(m206027E2().m132101V1(strReplace, c20071a)).subscribe(ffw.m121194e(new e30() { // from class: l.dzm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88493a.m128891W3(str2, str, (roj0) obj);
            }
        }, new e30() { // from class: l.ezm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93915a.m128892X3(str2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m128902k4(boolean z) {
        if (z) {
            ((VoiceChatInputView) this.viewModel).m78013P(true);
        } else {
            m128889U3();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceChatInputView) this.viewModel).m78015r();
        duringCreated(m206028F2().ChatEvent.chatInputClick().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xym0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195093a.m128895b4((wu4) obj);
            }
        }));
        duringCreated(m206028F2().VoiceChatEvent.chatInputVisibleEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yym0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200782a.m128902k4(((Boolean) obj).booleanValue());
            }
        }));
        if (!vdt.m198092b(3)) {
            duringCreated(m206028F2().LiveBridgeImplEvent.sendChatMessage().m172460g()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.czm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83099a.m128894a4((sy4) obj);
                }
            }));
            return;
        }
        duringCreated(m206028F2().VoiceChatEvent.chatEmojiVisibleEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zym0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205701a.m128888j4(((Boolean) obj).booleanValue());
            }
        }));
        duringCreated(m206028F2().ChatEvent.sendNormalMessage().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.azm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72365a.m128893Y3((sn40) obj);
            }
        }));
        m129304h3(m206028F2().VoiceVirtualLiveEvent.dismissChatTips(), new e30() { // from class: l.bzm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78045a.m128886Z3((soj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final void m128903l4(String str, String str2, String str3, String str4) {
    }
}
