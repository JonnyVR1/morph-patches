package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvStageSuggestItemView;
import p147v.VDraweeView;
import p149l.g5c0;
import p149l.hxs;
import p149l.j4r;
import p149l.p4r;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvStageSuggestItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52444d;

    /* JADX INFO: renamed from: e */
    public TextView f52445e;

    /* JADX INFO: renamed from: f */
    public TextView f52446f;

    /* JADX INFO: renamed from: g */
    public TextView f52447g;

    public KtvStageSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m77099h0(int i, BLiveVoiceKTVSong bLiveVoiceKTVSong, j4r j4rVar, View view) {
        p4r.m167405d(1001, i, bLiveVoiceKTVSong.title, j4rVar);
        j4rVar.m139765S3(bLiveVoiceKTVSong);
    }

    /* JADX INFO: renamed from: i0 */
    public void m77100i0(final BLiveVoiceKTVSong bLiveVoiceKTVSong, final j4r j4rVar, final int i) {
        hxs.m133408u("context_single_room", this.f52444d, bLiveVoiceKTVSong.cover, t100.m186890d(48.0f), t100.m186890d(48.0f));
        this.f52445e.setText(bLiveVoiceKTVSong.title);
        this.f52446f.setText(bLiveVoiceKTVSong.author);
        xdl0.m208329E0(this.f52447g, new View.OnClickListener() { // from class: l.z3r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvStageSuggestItemView.m77099h0(i, bLiveVoiceKTVSong, j4rVar, view);
            }
        });
        this.f52447g.setText(bLiveVoiceKTVSong.isOrdered ? "已点" : "点歌");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52444d = (VDraweeView) findViewById(g5c0.f100783Q0);
        this.f52445e = (TextView) findViewById(g5c0.f100762N6);
        this.f52446f = (TextView) findViewById(g5c0.f101045s);
        this.f52447g = (TextView) findViewById(g5c0.f101055t0);
        xdl0.m208327D0((int) ((xdl0.m208412y0() - t100.m186890d(18.0f)) / 3.0f), this);
    }

    public KtvStageSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvStageSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
