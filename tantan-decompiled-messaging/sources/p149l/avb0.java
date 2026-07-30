package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.TextQuickChatCardData;
import com.p046p1.mobile.putong.core.data.TextQuickChatEnvelope;
import com.p046p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class avb0 extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22392a<VideoChatSecondFloorSummary> f71926R;

    public avb0(C4732c c4732c) {
        super(c4732c);
        this.f71926R = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: g3 */
    public static String m99157g3(String str) {
        return C4728a.m31200G("/quickchat/cards?" + str);
    }

    /* JADX INFO: renamed from: h3 */
    public static String m99158h3() {
        return C4728a.m31200G("/videochat-second-floor-summary");
    }

    /* JADX INFO: renamed from: i3 */
    public C22306c<TextQuickChatCardData> m99159i3() {
        return this.f72126Q.scheduled("get_text_quick_chat_list", 0, new v9j() { // from class: l.vub0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.xub0
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(avb0.m99157g3(String.format("sence=secondfloor&limit=%s", Integer.valueOf(CoreModule.m29935P().m94651a().mo33300Cm())))).m185887f().m185883b();
                    }
                }, TextQuickChatEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.wub0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((TextQuickChatEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public C22306c<Envelope> m99160j3() {
        return this.f72126Q.scheduled("get_text_quick_chat_config", 0, new v9j() { // from class: l.uub0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f178336a.m99162l3();
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ Envelope m99161k3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData.videoChatSecondFloorSummary)) {
            this.f71926R.m132487l(coreData.videoChatSecondFloorSummary);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ C22306c m99162l3() {
        return ia20.m135117a(new v9j() { // from class: l.yub0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(avb0.m99158h3()).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.zub0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204844a.m99161k3((Envelope) obj);
            }
        });
    }
}
