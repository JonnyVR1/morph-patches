package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVBestSinger;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVSong;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvChooseSongItem;
import com.tantanapp.media.ttmediautils.download.Action2;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.n0r;
import p149l.s1r;
import p149l.t100;
import p149l.x1e0;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvChooseSongItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public KtvChooseSongItem f52379d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52380e;

    /* JADX INFO: renamed from: f */
    public TextView f52381f;

    /* JADX INFO: renamed from: g */
    public VText f52382g;

    /* JADX INFO: renamed from: h */
    public VText f52383h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f52384i;

    /* JADX INFO: renamed from: j */
    public VText f52385j;

    /* JADX INFO: renamed from: k */
    public VText f52386k;

    public KtvChooseSongItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m77035h0(BLiveVoiceKTVSong bLiveVoiceKTVSong, s1r s1rVar, View view) {
        if (TextUtils.isEmpty(bLiveVoiceKTVSong.schema)) {
            return;
        }
        s1rVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7009).m206701e(bLiveVoiceKTVSong.schema).m206699c());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77037j0(View view) {
        n0r.m157286a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m77038k0(boolean z) {
        this.f52386k.setSelected(z);
        this.f52386k.setText(z ? "已点" : "点歌");
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m77039l0(Action2 action2, BLiveVoiceKTVSong bLiveVoiceKTVSong, View view) {
        if (this.f52386k.isSelected()) {
            return;
        }
        action2.call(bLiveVoiceKTVSong, Integer.valueOf(bLiveVoiceKTVSong.position));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: m0 */
    public void m77040m0(final s1r s1rVar, final Action2<BLiveVoiceKTVSong, Integer> action2, final BLiveVoiceKTVSong bLiveVoiceKTVSong) {
        m77038k0(bLiveVoiceKTVSong.isOrdered);
        this.f52382g.setText(bLiveVoiceKTVSong.title);
        this.f52383h.setText(bLiveVoiceKTVSong.author);
        xdl0.m208329E0(this.f52386k, new View.OnClickListener() { // from class: l.l0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125560a.m77039l0(action2, bLiveVoiceKTVSong, view);
            }
        });
        hxs.m133407t("context_single_room", this.f52380e, bLiveVoiceKTVSong.cover, t100.f167229D);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.m0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvChooseSongItem.m77035h0(bLiveVoiceKTVSong, s1rVar, view);
            }
        });
        m77041n0(bLiveVoiceKTVSong.bestSinger);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n0 */
    public final void m77041n0(BLiveVoiceKTVBestSinger bLiveVoiceKTVBestSinger) {
        if (bLiveVoiceKTVBestSinger == null) {
            return;
        }
        xdl0.m208344M(this.f52381f, bLiveVoiceKTVBestSinger.score > 0);
        this.f52381f.setText(x8u.m207433c(bLiveVoiceKTVBestSinger.score) + "音浪");
        this.f52385j.setText(TextUtils.isEmpty(bLiveVoiceKTVBestSinger.userName) ? "虚位以待" : bLiveVoiceKTVBestSinger.userName);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceKTVBestSinger.userAvatar);
        VDraweeView vDraweeView = this.f52384i;
        if (zIsEmpty) {
            hxs.m133411x(vDraweeView, i3c0.f110719G9);
        } else {
            hxs.m133407t("context_single_room", vDraweeView, bLiveVoiceKTVBestSinger.userAvatar, t100.f167264m);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77037j0(this);
    }

    public KtvChooseSongItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvChooseSongItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
