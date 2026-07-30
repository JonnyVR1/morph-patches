package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionToolbarViewBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import p151v.VText;
import p153l.bnl0;
import p153l.i6t;
import p153l.t3m0;
import p153l.x81;

/* JADX INFO: loaded from: classes5.dex */
public class LiveVoiceCallAuctionToolbarView extends LiveVoiceCallAuctionToolbarViewBindings<x81> {

    /* JADX INFO: renamed from: g */
    public long f53808g;

    public LiveVoiceCallAuctionToolbarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79057c(View view) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m79060f(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m79061i(View view) {
        ((x81) this.f49098a).m209666X3();
    }

    /* JADX INFO: renamed from: r */
    private void m79062r() {
        bnl0.m105509E0(this.f49103f, new View.OnClickListener() { // from class: l.b4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74990a.m79061i(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m79063j(View view) {
        t3m0.m189092f((i6t) this.f49098a);
        ((x81) this.f49098a).m213811F2().VoiceAuctionEvent.openRelationSettingsDlg().mo199273j("");
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m79064k(View view) {
        ((x81) this.f49098a).m213811F2().VoiceAuctionEvent.openAuctionQueueDlg().mo199273j(Boolean.TRUE);
        if (this.f53808g > 0) {
            t3m0.m189095i((i6t) this.f49098a);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m79065l(boolean z, BLiveVoiceAuction bLiveVoiceAuction) {
        if (z) {
            m79067n(bLiveVoiceAuction);
        } else {
            m79066m(bLiveVoiceAuction);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m79066m(BLiveVoiceAuction bLiveVoiceAuction) {
        bnl0.m105524M(this.f49100c, false);
        bnl0.m105524M(this.f49102e, true);
        bnl0.m105524M(this.f49101d, false);
        if (TextUtils.equals(bLiveVoiceAuction.currentUserQueueState, "applied")) {
            this.f49102e.setText("已申请");
            bnl0.m105509E0(this.f49102e, new View.OnClickListener() { // from class: l.c4v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionToolbarView.m79057c(view);
                }
            });
            return;
        }
        boolean zEquals = TextUtils.equals(bLiveVoiceAuction.currentUserQueueState, "queuing");
        VText vText = this.f49102e;
        if (zEquals) {
            vText.setText("等待上拍");
            bnl0.m105509E0(this.f49102e, new View.OnClickListener() { // from class: l.d4v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveVoiceCallAuctionToolbarView.m79060f(view);
                }
            });
        } else {
            vText.setText("申请拍拍");
            bnl0.m105509E0(this.f49102e, new View.OnClickListener() { // from class: l.e4v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92160a.m79063j(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public void m79067n(BLiveVoiceAuction bLiveVoiceAuction) {
        bnl0.m105524M(this.f49100c, true);
        this.f49100c.setText("拍拍队列");
        bnl0.m105524M(this.f49102e, false);
        bnl0.m105524M(this.f49101d, false);
        bnl0.m105509E0(this.f49100c, new View.OnClickListener() { // from class: l.f4v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97144a.m79064k(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceCallAuctionToolbarViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79062r();
    }

    /* JADX INFO: renamed from: p */
    public void m79068p(long j) {
        VText vText = this.f49101d;
        if (j > 0) {
            bnl0.m105524M(vText, true);
            this.f49101d.setText(j > 99 ? "99+" : String.valueOf(j));
        } else {
            bnl0.m105524M(vText, false);
        }
        this.f53808g = j;
    }
}
