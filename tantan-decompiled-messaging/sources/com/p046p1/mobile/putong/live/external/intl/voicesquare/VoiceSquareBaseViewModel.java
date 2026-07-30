package com.p046p1.mobile.putong.live.external.intl.voicesquare;

import android.content.Context;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p046p1.mobile.putong.live.base.view.EmptyView;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.intl.voicesquare.base.LiveBaseQuickChatPageView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.g1c0;
import p149l.h3c0;
import p149l.kvc0;
import p149l.svq;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/voicesquare/VoiceSquareBaseViewModel;", "Lcom/p1/mobile/putong/live/external/intl/voicesquare/base/LiveBaseQuickChatPageView;", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;", "voiceTab", "", "isWhiteTheme", "<init>", "(Landroid/content/Context;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTab;Z)V", "Lcom/p1/mobile/putong/live/base/view/EmptyView;", "emptyView", "", "a", "(Lcom/p1/mobile/putong/live/base/view/EmptyView;)V", "g", "Z", "b", "()Z", "setWhiteTheme", "(Z)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final void m70404a(@NotNull EmptyView emptyView) {
        emptyView.getClass();
        emptyView.m68720e(R$string.f44864C0).m68717b(this.isWhiteTheme ? h3c0.f105632Q0 : h3c0.f105630P0);
        emptyView.f44654b.setTextColor(kvc0.m147352a(this.isWhiteTheme ? g1c0.f100152g : g1c0.f100137A));
        emptyView.f44653a.getLayoutParams().width = svq.m186103c(220);
        emptyView.f44653a.getLayoutParams().height = svq.m186103c(150);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsWhiteTheme() {
        return this.isWhiteTheme;
    }

    public final void setWhiteTheme(boolean z) {
        this.isWhiteTheme = z;
    }
}
