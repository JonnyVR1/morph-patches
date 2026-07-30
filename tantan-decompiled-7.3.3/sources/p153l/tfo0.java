package p153l;

import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.other.VoicePanelSwitchView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/tfo0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/other/VoicePanelSwitchView;", "Ll/dum;", "curInfo", "switchView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/other/VoicePanelSwitchView;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "J3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tfo0 extends i6t<rwn0, VoicePanelSwitchView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfo0(@NotNull dum<? extends rwn0> dumVar, @NotNull VoicePanelSwitchView voicePanelSwitchView) {
        super(dumVar);
        dumVar.getClass();
        voicePanelSwitchView.getClass();
        mo52715C(voicePanelSwitchView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public final void m190956J3() {
        m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(Integer.valueOf(n2m0.m161244c(((rwn0) m213810E2()).mo183435j().template)));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        ((VoicePanelSwitchView) this.viewModel).m78560r();
    }
}
