package p153l;

import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice.VoiceInternalFavoriteItemView;

/* JADX INFO: loaded from: classes9.dex */
public class hnn0 extends d3q<VoiceInternalFavoriteItemView> {

    /* JADX INFO: renamed from: a */
    public final VirtualVoiceGroupConversationCell f110810a;

    /* JADX INFO: renamed from: b */
    public final int f110811b;

    public hnn0(int i, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f110811b = i;
        this.f110810a = virtualVoiceGroupConversationCell;
    }

    /* JADX INFO: renamed from: H */
    public VirtualVoiceGroupConversationCell m136264H() {
        return this.f110810a;
    }

    /* JADX INFO: renamed from: I */
    public int m136265I() {
        return this.f110811b;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(VoiceInternalFavoriteItemView voiceInternalFavoriteItemView) {
        super.mo71749u(voiceInternalFavoriteItemView);
        voiceInternalFavoriteItemView.m71041l0(this.f110811b, this.f110810a);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193834X1;
    }
}
