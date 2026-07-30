package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVBestSinger;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongItem;
import com.tantanapp.media.ttmediautils.download.Action2;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bae0;
import p153l.bnl0;
import p153l.izs;
import p153l.o2r;
import p153l.obc0;
import p153l.qa00;
import p153l.t3r;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class KtvChooseSongItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public KtvChooseSongItem f53227d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53228e;

    /* JADX INFO: renamed from: f */
    public TextView f53229f;

    /* JADX INFO: renamed from: g */
    public VText f53230g;

    /* JADX INFO: renamed from: h */
    public VText f53231h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53232i;

    /* JADX INFO: renamed from: j */
    public VText f53233j;

    /* JADX INFO: renamed from: k */
    public VText f53234k;

    public KtvChooseSongItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m78218h0(BLiveVoiceKTVSong bLiveVoiceKTVSong, t3r t3rVar, View view) {
        if (TextUtils.isEmpty(bLiveVoiceKTVSong.schema)) {
            return;
        }
        t3rVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7009).m103154e(bLiveVoiceKTVSong.schema).m103152c());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78220j0(View view) {
        o2r.m165743a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m78221k0(boolean z) {
        this.f53234k.setSelected(z);
        this.f53234k.setText(z ? "已点" : "点歌");
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m78222l0(Action2 action2, BLiveVoiceKTVSong bLiveVoiceKTVSong, View view) {
        if (this.f53234k.isSelected()) {
            return;
        }
        action2.call(bLiveVoiceKTVSong, Integer.valueOf(bLiveVoiceKTVSong.position));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m0 */
    public void m78223m0(final t3r t3rVar, final Action2<BLiveVoiceKTVSong, Integer> action2, final BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        m78221k0(bLiveVoiceKTVSong.isOrdered);
        this.f53230g.setText(bLiveVoiceKTVSong.title);
        this.f53231h.setText(bLiveVoiceKTVSong.author);
        bnl0.m105509E0(this.f53234k, new View.OnClickListener() { // from class: l.m2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134603a.m78222l0(action2, bLiveVoiceKTVSong, view);
            }
        });
        izs.m142869t("context_single_room", this.f53228e, bLiveVoiceKTVSong.cover, qa00.f156291D);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.n2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongItem.m78218h0(bLiveVoiceKTVSong, t3rVar, view);
            }
        });
        m78224n0(bLiveVoiceKTVSong.bestSinger);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m78224n0(BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger) {
        if (bLiveVoiceKTVBestSinger == null) {
            return;
        }
        bnl0.m105524M(this.f53229f, bLiveVoiceKTVBestSinger.score > 0);
        this.f53229f.setText(yau.m214935c(bLiveVoiceKTVBestSinger.score) + "音浪");
        this.f53233j.setText(TextUtils.isEmpty(bLiveVoiceKTVBestSinger.userName) ? "虚位以待" : bLiveVoiceKTVBestSinger.userName);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceKTVBestSinger.userAvatar);
        VDraweeView vDraweeView = this.f53232i;
        if (zIsEmpty) {
            izs.m142873x(vDraweeView, obc0.f146047G9);
        } else {
            izs.m142869t("context_single_room", vDraweeView, bLiveVoiceKTVBestSinger.userAvatar, qa00.f156326m);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78220j0(this);
    }

    public KtvChooseSongItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvChooseSongItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
