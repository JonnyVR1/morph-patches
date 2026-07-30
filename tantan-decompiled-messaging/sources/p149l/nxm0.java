package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Ll/nxm0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "Ll/bsm;", BaseSei.INFO, "viewModel", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;)V", "", Constants.KEY_T, "()V", "K3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class nxm0 extends h4t<nnn0, VoiceChatGroupEnterView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxm0(@NotNull bsm<? extends nnn0> bsmVar, @NotNull VoiceChatGroupEnterView voiceChatGroupEnterView) {
        super(bsmVar);
        bsmVar.getClass();
        voiceChatGroupEnterView.getClass();
        mo51532C(voiceChatGroupEnterView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public static void m161949J3(nxm0 nxm0Var, iqv iqvVar) {
        if (iqvVar.m137796c()) {
            V v2 = nxm0Var.viewModel;
            v2.getClass();
            ((View) v2).setVisibility(8);
        } else if (iqvVar.m137797d()) {
            V v3 = nxm0Var.viewModel;
            v3.getClass();
            ((View) v3).setVisibility(ypv.m215672k().m195857i6() ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m149815l()).subscribe(ffw.m121197h(new e30() { // from class: l.mxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                nxm0.m161949J3(this.f136186a, (iqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K3 */
    public void mo128714K3() {
    }
}
