package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/r6n0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;", "Ll/dum;", BaseSei.INFO, "viewModel", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/VoiceChatGroupEnterView;)V", "", Constants.KEY_T, "()V", "K3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public class r6n0 extends i6t<rwn0, VoiceChatGroupEnterView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6n0(@NotNull dum<? extends rwn0> dumVar, @NotNull VoiceChatGroupEnterView voiceChatGroupEnterView) {
        super(dumVar);
        dumVar.getClass();
        voiceChatGroupEnterView.getClass();
        mo52715C(voiceChatGroupEnterView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public static void m180016J3(r6n0 r6n0Var, jsv jsvVar) {
        if (jsvVar.m146877c()) {
            V v2 = r6n0Var.viewModel;
            v2.getClass();
            ((View) v2).setVisibility(8);
        } else if (jsvVar.m146878d()) {
            V v3 = r6n0Var.viewModel;
            v3.getClass();
            ((View) v3).setVisibility(zrv.m221193k().m203644i6() ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m202192l()).subscribe(dhw.m115829h(new y20() { // from class: l.q6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                r6n0.m180016J3(this.f155826a, (jsv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K3 */
    public void mo96481K3() {
    }
}
