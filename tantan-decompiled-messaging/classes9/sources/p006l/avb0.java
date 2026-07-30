package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.TextQuickChatCardData;
import com.p1.mobile.putong.core.data.TextQuickChatEnvelope;
import com.p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class avb0 extends ax6 {

    /* JADX INFO: renamed from: R */
    public a<VideoChatSecondFloorSummary> f8552R;

    public avb0(C0158c c0158c) {
        super(c0158c);
        this.f8552R = a.b();
    }

    /* JADX INFO: renamed from: g3 */
    public static String m12293g3(String str) {
        return C0154a.m3130G("/quickchat/cards?" + str);
    }

    /* JADX INFO: renamed from: h3 */
    public static String m12294h3() {
        return C0154a.m3130G("/videochat-second-floor-summary");
    }

    /* JADX INFO: renamed from: i3 */
    public c<TextQuickChatCardData> m12295i3() {
        return this.f8580Q.scheduled("get_text_quick_chat_list", 0, new v9j() { // from class: l.vub0
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.xub0
                    public final Object call() {
                        return C0154a.f3483P.auth().q(avb0.m12293g3(String.format("sence=secondfloor&limit=%s", Integer.valueOf(CoreModule.m1854P().m11706a().m5237Cm())))).f().b();
                    }
                }, TextQuickChatEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.wub0
            public final Object call(Object obj) {
                return ((TextQuickChatEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public c<Envelope> m12296j3() {
        return this.f8580Q.scheduled("get_text_quick_chat_config", 0, new v9j() { // from class: l.uub0
            public final Object call() {
                return this.f23756a.m12298l3();
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ Envelope m12297k3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (NullChecker.a(moduleData.videoChatSecondFloorSummary)) {
            this.f8552R.onNext(moduleData.videoChatSecondFloorSummary);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ c m12298l3() {
        return ia20.m16567a(new v9j() { // from class: l.yub0
            public final Object call() {
                return C0154a.f3483P.auth().q(avb0.m12294h3()).f().b();
            }
        }).map(new w9j() { // from class: l.zub0
            public final Object call(Object obj) {
                return this.f28986a.m12297k3((Envelope) obj);
            }
        });
    }
}
