package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvStageSuggestItemView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.k6r;
import p153l.mdc0;
import p153l.q6r;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class KtvStageSuggestItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53292d;

    /* JADX INFO: renamed from: e */
    public TextView f53293e;

    /* JADX INFO: renamed from: f */
    public TextView f53294f;

    /* JADX INFO: renamed from: g */
    public TextView f53295g;

    public KtvStageSuggestItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m78282h0(int i, BLiveVoiceKTVSong bLiveVoiceKTVSong, k6r k6rVar, View view) {
        q6r.m175604d(1001, i, bLiveVoiceKTVSong.title, k6rVar);
        k6rVar.m148549S3(bLiveVoiceKTVSong);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78283i0(final BLiveVoiceKTVSong bLiveVoiceKTVSong, final k6r k6rVar, final int i) {
        izs.m142870u("context_single_room", this.f53292d, bLiveVoiceKTVSong.cover, qa00.m175859d(48.0f), qa00.m175859d(48.0f));
        this.f53293e.setText(bLiveVoiceKTVSong.title);
        this.f53294f.setText(bLiveVoiceKTVSong.author);
        bnl0.m105509E0(this.f53295g, new View.OnClickListener() { // from class: l.a6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvStageSuggestItemView.m78282h0(i, bLiveVoiceKTVSong, k6rVar, view);
            }
        });
        this.f53295g.setText(bLiveVoiceKTVSong.isOrdered ? "已点" : "点歌");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53292d = (VDraweeView) findViewById(mdc0.f136028Q0);
        this.f53293e = (TextView) findViewById(mdc0.f136007N6);
        this.f53294f = (TextView) findViewById(mdc0.f136290s);
        this.f53295g = (TextView) findViewById(mdc0.f136300t0);
        bnl0.m105507D0((int) ((bnl0.m105592y0() - qa00.m175859d(18.0f)) / 3.0f), this);
    }

    public KtvStageSuggestItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvStageSuggestItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
