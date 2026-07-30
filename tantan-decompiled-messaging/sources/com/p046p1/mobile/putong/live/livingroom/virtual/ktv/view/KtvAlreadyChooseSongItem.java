package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.hxs;
import p149l.i0r;
import p149l.i3c0;
import p149l.k580;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAlreadyChooseSongItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public KtvAlreadyChooseSongItem f52365d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f52366e;

    /* JADX INFO: renamed from: f */
    public VText f52367f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52368g;

    /* JADX INFO: renamed from: h */
    public VText f52369h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f52370i;

    /* JADX INFO: renamed from: j */
    public VText f52371j;

    /* JADX INFO: renamed from: k */
    public VImage f52372k;

    /* JADX INFO: renamed from: l */
    public VImage f52373l;

    public KtvAlreadyChooseSongItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m77029h0(int i, e30 e30Var, BLiveVoiceKTVOrder bLiveVoiceKTVOrder, View view) {
        if (i == 0) {
            e30Var.call(new Pair(1, bLiveVoiceKTVOrder));
        } else {
            e30Var.call(new Pair(2, bLiveVoiceKTVOrder));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77031j0(View view) {
        i0r.m133903a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m77032k0(final e30<Pair<Integer, BLiveVoiceKTVOrder>> e30Var, final BLiveVoiceKTVOrder bLiveVoiceKTVOrder, final int i, boolean z, boolean z2) {
        if (bLiveVoiceKTVOrder == null || bLiveVoiceKTVOrder.song == null || bLiveVoiceKTVOrder.mask == null) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f52366e;
        if (i == 0) {
            animEffectPlayer.setVisibility(0);
            this.f52367f.setVisibility(8);
            this.f52366e.mo68502l("https://auto.tancdn.com/v1/raw/cb34326a-c938-4bc5-baaa-31c014cffabe11.pdf", -1, null);
            this.f52373l.setImageResource(i3c0.f110683D9);
            this.f52372k.setVisibility(0);
            this.f52373l.setVisibility((z2 || z) ? 0 : 8);
            this.f52372k.setVisibility((z2 || z) ? 0 : 8);
        } else {
            animEffectPlayer.setVisibility(8);
            this.f52367f.setVisibility(0);
            this.f52367f.setText(String.valueOf(i + 1));
            this.f52373l.setImageResource(i3c0.f111236ya);
            this.f52372k.setVisibility(8);
            this.f52373l.setVisibility((z || z2) ? 0 : 8);
        }
        this.f52372k.setImageResource(k580.f121167m.equals(bLiveVoiceKTVOrder.status) ? i3c0.f110707F9 : i3c0.f110695E9);
        VDraweeView vDraweeView = this.f52368g;
        String str = bLiveVoiceKTVOrder.song.cover;
        int i2 = t100.f167229D;
        hxs.m133407t("context_single_room", vDraweeView, str, i2);
        this.f52369h.setText(bLiveVoiceKTVOrder.song.title);
        hxs.m133407t("context_single_room", this.f52370i, bLiveVoiceKTVOrder.mask.avatar, i2);
        this.f52371j.setText(bLiveVoiceKTVOrder.mask.name);
        xdl0.m208329E0(this.f52372k, new View.OnClickListener() { // from class: l.g0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(new Pair(0, bLiveVoiceKTVOrder));
            }
        });
        xdl0.m208329E0(this.f52373l, new View.OnClickListener() { // from class: l.h0r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvAlreadyChooseSongItem.m77029h0(i, e30Var, bLiveVoiceKTVOrder, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77031j0(this);
    }

    public KtvAlreadyChooseSongItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvAlreadyChooseSongItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
