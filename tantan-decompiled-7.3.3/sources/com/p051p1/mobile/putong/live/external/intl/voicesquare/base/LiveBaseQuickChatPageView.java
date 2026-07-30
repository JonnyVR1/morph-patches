package com.p051p1.mobile.putong.live.external.intl.voicesquare.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBannerTab;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import java.util.List;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LiveBaseQuickChatPageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceTab f46753a;

    /* JADX INFO: renamed from: b */
    public y20<BLiveVoiceRoomFeed> f46754b;

    /* JADX INFO: renamed from: c */
    public y20<BLiveVoiceBannerTab> f46755c;

    /* JADX INFO: renamed from: d */
    public y20<List<String>> f46756d;

    /* JADX INFO: renamed from: e */
    public y20<String> f46757e;

    /* JADX INFO: renamed from: f */
    public boolean f46758f;

    public LiveBaseQuickChatPageView(Context context, BLiveVoiceTab bLiveVoiceTab) {
        super(context);
        this.f46753a = bLiveVoiceTab;
    }

    public BLiveVoiceTab getVoiceTab() {
        return this.f46753a;
    }

    public void setAllowReportVoiceCreateState(boolean z) {
        this.f46758f = z;
    }

    public void setBannerItemClickCallback(y20<BLiveVoiceBannerTab> y20Var) {
        this.f46755c = y20Var;
    }

    public void setItemClickCallback(y20<BLiveVoiceRoomFeed> y20Var) {
        this.f46754b = y20Var;
    }

    public void setReportCreateVoiceCard(y20<String> y20Var) {
        this.f46757e = y20Var;
    }

    public void setReportVisibleCeil(y20<List<String>> y20Var) {
        this.f46756d = y20Var;
    }

    public LiveBaseQuickChatPageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public LiveBaseQuickChatPageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LiveBaseQuickChatPageView(@NonNull Context context) {
        super(context);
    }
}
