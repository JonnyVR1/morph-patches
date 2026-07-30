package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p149l.mss;
import p149l.quu;
import p149l.xuu;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoChatFrag extends LiveSquareBaseFrag {
    public static String KEY_VIDEO_CHAT_PAGE_SOURCE = "key_current_page_in_square";
    private quu presenter;
    private String source;
    private xuu viewModel;

    /* JADX INFO: renamed from: l5 */
    public static LiveVideoChatFrag m69136l5(Bundle bundle) {
        LiveVideoChatFrag liveVideoChatFrag = new LiveVideoChatFrag();
        liveVideoChatFrag.setArguments(bundle);
        return liveVideoChatFrag;
    }

    /* JADX INFO: renamed from: m5 */
    public static LiveVideoChatFrag m69137m5(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_VIDEO_CHAT_PAGE_SOURCE, str);
        return m69136l5(bundle);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        this.viewModel.m211216w(z, i, j);
        if (mo69050b5()) {
            this.presenter.m176643C2(z, i, j);
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        quu quuVar = this.presenter;
        if (quuVar != null) {
            quuVar.m176644D2();
            this.viewModel.m211205A();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo69050b5() {
        return "source_live_square".equals(this.source);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.presenter = new quu(this, new mss(m70813Z4(), this));
        xuu xuuVar = new xuu(this);
        this.viewModel = xuuVar;
        this.presenter.mo51532C(xuuVar);
        String string = getArguments().getString(KEY_VIDEO_CHAT_PAGE_SOURCE);
        this.source = string;
        if ("source_live_square".equals(string)) {
            return;
        }
        m70825W4(6);
        mo68932Y4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.presenter.m176651y2();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.viewModel.m211213r();
        this.viewModel.m211206B(!"source_live_square".equals(this.source));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.viewModel.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public String m69138k5() {
        return this.source;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_video_quickchat";
    }
}
