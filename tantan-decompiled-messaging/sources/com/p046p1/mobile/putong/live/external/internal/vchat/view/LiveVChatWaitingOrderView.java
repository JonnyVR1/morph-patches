package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.tencent.open.p107im.C14373IM;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.hxs;
import p149l.jbu;
import p149l.mqi0;
import p149l.rru;
import p149l.s7m;
import p149l.vru;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatWaitingOrderView extends FrameLayout implements s7m<rru> {

    /* JADX INFO: renamed from: a */
    public LiveVChatWaitingOrderView f45442a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45443b;

    /* JADX INFO: renamed from: c */
    public VImage f45444c;

    /* JADX INFO: renamed from: d */
    public VImage f45445d;

    /* JADX INFO: renamed from: e */
    public VLinear f45446e;

    /* JADX INFO: renamed from: f */
    public TextView f45447f;

    /* JADX INFO: renamed from: g */
    public TextView f45448g;

    /* JADX INFO: renamed from: h */
    public TextView f45449h;

    /* JADX INFO: renamed from: i */
    public VImage f45450i;

    /* JADX INFO: renamed from: j */
    public ImageView f45451j;

    /* JADX INFO: renamed from: k */
    public VText f45452k;

    /* JADX INFO: renamed from: l */
    public rru f45453l;

    public LiveVChatWaitingOrderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m69794f(View view) {
        rru rruVar = this.f45453l;
        if (rruVar != null) {
            rruVar.m180589D3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m69795i(View view) {
        rru rruVar = this.f45453l;
        if (rruVar != null) {
            rruVar.m180604v3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m69796j(View view) {
        rru rruVar = this.f45453l;
        if (rruVar != null) {
            rruVar.m180606y3();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m69797d(View view) {
        vru.m199753a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rru rruVar) {
        this.f45453l = rruVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public void m69799k(BLiveVideoChatLive bLiveVideoChatLive) {
        long jM155944o = mqi0.m155944o() - (bLiveVideoChatLive.startedTime / 1000000);
        this.f45449h.setText("开启时长" + jbu.m140809Q((int) jM155944o));
    }

    /* JADX INFO: renamed from: l */
    public void m69800l(BLiveVideoChatLive bLiveVideoChatLive) {
        xdl0.m208344M(this, true);
        hxs.m133406s(C14373IM.CHAT_TYPE_VIDEO_CHAT, this.f45443b, bLiveVideoChatLive.anchor.avatar);
        m69799k(bLiveVideoChatLive);
        xdl0.m208329E0(this.f45451j, new View.OnClickListener() { // from class: l.uru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177893a.m69796j(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m69801m(int i) {
        String str;
        xdl0.m208344M(this.f45452k, i > 0);
        if (i > 0) {
            VText vText = this.f45452k;
            if (i > 99) {
                str = "99+";
            } else {
                str = i + "";
            }
            vText.setText(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m69802n(boolean z) {
        xdl0.m208344M(this, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69797d(this);
        xdl0.m208329E0(this.f45450i, new View.OnClickListener() { // from class: l.sru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166137a.m69794f(view);
            }
        });
        xdl0.m208329E0(this.f45445d, new View.OnClickListener() { // from class: l.tru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171860a.m69795i(view);
            }
        });
    }

    public LiveVChatWaitingOrderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatWaitingOrderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
