package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionToolbarViewBindings;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import p147v.VText;
import p149l.h4t;
import p149l.pul0;
import p149l.q81;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveVoiceCallAuctionToolbarView extends LiveVoiceCallAuctionToolbarViewBindings<q81> {

    /* JADX INFO: renamed from: g */
    public long f52960g;

    public LiveVoiceCallAuctionToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m77874c(View view) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m77877f(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m77878i(View view) {
        ((q81) this.f48250a).m173330X3();
    }

    /* JADX INFO: renamed from: r */
    private void m77879r() {
        xdl0.m208329E0(this.f48255f, new View.OnClickListener() { // from class: l.a2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67297a.m77878i(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m77880j(View view) {
        pul0.m171448f((h4t) this.f48250a);
        ((q81) this.f48250a).m206028F2().VoiceAuctionEvent.openRelationSettingsDlg().mo172463j("");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m77881k(View view) {
        ((q81) this.f48250a).m206028F2().VoiceAuctionEvent.openAuctionQueueDlg().mo172463j(Boolean.TRUE);
        if (this.f52960g > 0) {
            pul0.m171451i((h4t) this.f48250a);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m77882l(boolean z, BLiveVoiceAuction bLiveVoiceAuction) {
        if (z) {
            m77884n(bLiveVoiceAuction);
        } else {
            m77883m(bLiveVoiceAuction);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m77883m(BLiveVoiceAuction bLiveVoiceAuction) {
        xdl0.m208344M(this.f48252c, false);
        xdl0.m208344M(this.f48254e, true);
        xdl0.m208344M(this.f48253d, false);
        if (TextUtils.equals(bLiveVoiceAuction.currentUserQueueState, "applied")) {
            this.f48254e.setText("已申请");
            xdl0.m208329E0(this.f48254e, new View.OnClickListener() { // from class: l.b2v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionToolbarView.m77874c(view);
                }
            });
            return;
        }
        boolean zEquals = TextUtils.equals(bLiveVoiceAuction.currentUserQueueState, "queuing");
        VText vText = this.f48254e;
        if (zEquals) {
            vText.setText("等待上拍");
            xdl0.m208329E0(this.f48254e, new View.OnClickListener() { // from class: l.c2v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionToolbarView.m77877f(view);
                }
            });
        } else {
            vText.setText("申请拍拍");
            xdl0.m208329E0(this.f48254e, new View.OnClickListener() { // from class: l.d2v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f83434a.m77880j(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public void m77884n(BLiveVoiceAuction bLiveVoiceAuction) {
        xdl0.m208344M(this.f48252c, true);
        this.f48252c.setText("拍拍队列");
        xdl0.m208344M(this.f48254e, false);
        xdl0.m208344M(this.f48253d, false);
        xdl0.m208329E0(this.f48252c, new View.OnClickListener() { // from class: l.e2v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88945a.m77881k(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionToolbarViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77879r();
    }

    /* JADX INFO: renamed from: p */
    public void m77885p(long j) {
        VText vText = this.f48253d;
        if (j > 0) {
            xdl0.m208344M(vText, true);
            this.f48253d.setText(j > 99 ? "99+" : String.valueOf(j));
        } else {
            xdl0.m208344M(vText, false);
        }
        this.f52960g = j;
    }
}
