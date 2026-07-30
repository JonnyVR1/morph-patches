package com.p046p1.mobile.putong.live.external.intl.voicesquare.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBannerTab;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import java.util.List;
import p149l.e30;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LiveBaseQuickChatPageView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceTab f45905a;

    /* JADX INFO: renamed from: b */
    public e30<BLiveVoiceRoomFeed> f45906b;

    /* JADX INFO: renamed from: c */
    public e30<BLiveVoiceBannerTab> f45907c;

    /* JADX INFO: renamed from: d */
    public e30<List<String>> f45908d;

    /* JADX INFO: renamed from: e */
    public e30<String> f45909e;

    /* JADX INFO: renamed from: f */
    public boolean f45910f;

    public LiveBaseQuickChatPageView(Context context, BLiveVoiceTab bLiveVoiceTab) {
        super(context);
        this.f45905a = bLiveVoiceTab;
    }

    public BLiveVoiceTab getVoiceTab() {
        return this.f45905a;
    }

    public void setAllowReportVoiceCreateState(boolean z) {
        this.f45910f = z;
    }

    public void setBannerItemClickCallback(e30<BLiveVoiceBannerTab> e30Var) {
        this.f45907c = e30Var;
    }

    public void setItemClickCallback(e30<BLiveVoiceRoomFeed> e30Var) {
        this.f45906b = e30Var;
    }

    public void setReportCreateVoiceCard(e30<String> e30Var) {
        this.f45909e = e30Var;
    }

    public void setReportVisibleCeil(e30<List<String>> e30Var) {
        this.f45908d = e30Var;
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
