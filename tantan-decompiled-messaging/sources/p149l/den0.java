package p149l;

import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice.VoiceInternalFavoriteItemView;

/* JADX INFO: loaded from: classes13.dex */
public class den0 extends d1q<VoiceInternalFavoriteItemView> {

    /* JADX INFO: renamed from: a */
    public final VirtualVoiceGroupConversationCell f85820a;

    /* JADX INFO: renamed from: b */
    public final int f85821b;

    public den0(int i, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f85821b = i;
        this.f85820a = virtualVoiceGroupConversationCell;
    }

    /* JADX INFO: renamed from: H */
    public VirtualVoiceGroupConversationCell m111385H() {
        return this.f85820a;
    }

    /* JADX INFO: renamed from: I */
    public int m111386I() {
        return this.f85821b;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VoiceInternalFavoriteItemView voiceInternalFavoriteItemView) {
        super.mo70566u(voiceInternalFavoriteItemView);
        voiceInternalFavoriteItemView.m69858l0(this.f85821b, this.f85820a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162720X1;
    }
}
