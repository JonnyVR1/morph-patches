package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.TextQuickChatCardData;
import com.p051p1.mobile.putong.core.data.TextQuickChatEnvelope;
import com.p051p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class e3c0 extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22507a<VideoChatSecondFloorSummary> f91949R;

    public e3c0(C4883c c4883c) {
        super(c4883c);
        this.f91949R = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: g3 */
    public static String m119263g3(String str) {
        return C4879a.m32203G("/quickchat/cards?" + str);
    }

    /* JADX INFO: renamed from: h3 */
    public static String m119264h3() {
        return C4879a.m32203G("/videochat-second-floor-summary");
    }

    /* JADX INFO: renamed from: i3 */
    public C22421c<TextQuickChatCardData> m119265i3() {
        return this.f91137Q.scheduled("get_text_quick_chat_list", 0, new pcj() { // from class: l.z2c0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.b3c0
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(e3c0.m119263g3(String.format("sence=secondfloor&limit=%s", Integer.valueOf(CoreModule.m30933P().m143405a().mo34303Cm())))).m209032f().m209028b();
                    }
                }, TextQuickChatEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.a3c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((TextQuickChatEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public C22421c<Envelope> m119266j3() {
        return this.f91137Q.scheduled("get_text_quick_chat_config", 0, new pcj() { // from class: l.y2c0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f197207a.m119268l3();
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ Envelope m119267k3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData.videoChatSecondFloorSummary)) {
            this.f91949R.m137019l(coreData.videoChatSecondFloorSummary);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22421c m119268l3() {
        return qi20.m176654a(new pcj() { // from class: l.c3c0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(e3c0.m119264h3()).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.d3c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84885a.m119267k3((Envelope) obj);
            }
        });
    }
}
