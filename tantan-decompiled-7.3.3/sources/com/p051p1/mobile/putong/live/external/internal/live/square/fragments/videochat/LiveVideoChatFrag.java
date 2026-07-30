package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p153l.nus;
import p153l.rwu;
import p153l.ywu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoChatFrag extends LiveSquareBaseFrag {
    public static String KEY_VIDEO_CHAT_PAGE_SOURCE = "key_current_page_in_square";
    private rwu presenter;
    private String source;
    private ywu viewModel;

    /* JADX INFO: renamed from: l5 */
    public static LiveVideoChatFrag m70319l5(Bundle bundle) {
        LiveVideoChatFrag liveVideoChatFrag = new LiveVideoChatFrag();
        liveVideoChatFrag.setArguments(bundle);
        return liveVideoChatFrag;
    }

    /* JADX INFO: renamed from: m5 */
    public static LiveVideoChatFrag m70320m5(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_VIDEO_CHAT_PAGE_SOURCE, str);
        return m70319l5(bundle);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        this.viewModel.m217649w(z, i, j);
        if (mo70233b5()) {
            this.presenter.m183469C2(z, i, j);
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        rwu rwuVar = this.presenter;
        if (rwuVar != null) {
            rwuVar.m183470D2();
            this.viewModel.m217638A();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo70233b5() {
        return "source_live_square".equals(this.source);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.presenter = new rwu(this, new nus(m71996Z4(), this));
        ywu ywuVar = new ywu(this);
        this.viewModel = ywuVar;
        this.presenter.mo52715C(ywuVar);
        String string = getArguments().getString(KEY_VIDEO_CHAT_PAGE_SOURCE);
        this.source = string;
        if ("source_live_square".equals(string)) {
            return;
        }
        m72008W4(6);
        mo70115Y4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.presenter.m183477y2();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.viewModel.m217646r();
        this.viewModel.m217639B(!"source_live_square".equals(this.source));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.viewModel.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public String m70321k5() {
        return this.source;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_video_quickchat";
    }
}
