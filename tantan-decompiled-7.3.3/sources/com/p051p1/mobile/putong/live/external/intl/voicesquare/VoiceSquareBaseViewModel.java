package com.p051p1.mobile.putong.live.external.intl.voicesquare;

import android.content.Context;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.base.view.EmptyView;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.intl.voicesquare.base.LiveBaseQuickChatPageView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.m9c0;
import p153l.n3d0;
import p153l.nbc0;
import p153l.txq;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/voicesquare/VoiceSquareBaseViewModel;", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/base/LiveBaseQuickChatPageView;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "", "isWhiteTheme", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Z)V", "Lcom/p1/mobile/putong/live/base/view/EmptyView;", "emptyView", "", "a", "(Lcom/p1/mobile/putong/live/base/view/EmptyView;)V", "g", "Z", "b", "()Z", "setWhiteTheme", "(Z)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class VoiceSquareBaseViewModel extends LiveBaseQuickChatPageView {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isWhiteTheme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSquareBaseViewModel(@NotNull Context context, @NotNull BLiveVoiceTab bLiveVoiceTab, boolean z) {
        super(context, bLiveVoiceTab);
        context.getClass();
        bLiveVoiceTab.getClass();
        this.isWhiteTheme = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m71587a(@NotNull EmptyView emptyView) {
        emptyView.getClass();
        emptyView.m69903e(R$string.f45712C0).m69900b(this.isWhiteTheme ? nbc0.f141123Q0 : nbc0.f141121P0);
        emptyView.f45502b.setTextColor(n3d0.m161277a(this.isWhiteTheme ? m9c0.f135382g : m9c0.f135367A));
        emptyView.f45501a.getLayoutParams().width = txq.m193530c(220);
        emptyView.f45501a.getLayoutParams().height = txq.m193530c(150);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsWhiteTheme() {
        return this.isWhiteTheme;
    }

    public final void setWhiteTheme(boolean z) {
        this.isWhiteTheme = z;
    }
}
