package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKTVOrder;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvAlreadyChooseSongItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.j2r;
import p153l.obc0;
import p153l.qa00;
import p153l.qd80;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAlreadyChooseSongItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public KtvAlreadyChooseSongItem f53213d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f53214e;

    /* JADX INFO: renamed from: f */
    public VText f53215f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53216g;

    /* JADX INFO: renamed from: h */
    public VText f53217h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f53218i;

    /* JADX INFO: renamed from: j */
    public VText f53219j;

    /* JADX INFO: renamed from: k */
    public VImage f53220k;

    /* JADX INFO: renamed from: l */
    public VImage f53221l;

    public KtvAlreadyChooseSongItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m78212h0(int i, y20 y20Var, BLiveVoiceKTVOrder bLiveVoiceKTVOrder, View view) {
        if (i == 0) {
            y20Var.call(new Pair(1, bLiveVoiceKTVOrder));
        } else {
            y20Var.call(new Pair(2, bLiveVoiceKTVOrder));
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78214j0(View view) {
        j2r.m143240a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m78215k0(final y20<Pair<Integer, BLiveVoiceKTVOrder>> y20Var, final BLiveVoiceKTVOrder bLiveVoiceKTVOrder, final int i, boolean z, boolean z2) {
        if (bLiveVoiceKTVOrder == null || bLiveVoiceKTVOrder.song == null || bLiveVoiceKTVOrder.mask == null) {
            return;
        }
        AnimEffectPlayer animEffectPlayer = this.f53214e;
        if (i == 0) {
            animEffectPlayer.setVisibility(0);
            this.f53215f.setVisibility(8);
            this.f53214e.mo69685l("https://auto.tancdn.com/v1/raw/cb34326a-c938-4bc5-baaa-31c014cffabe11.pdf", -1, null);
            this.f53221l.setImageResource(obc0.f146011D9);
            this.f53220k.setVisibility(0);
            this.f53221l.setVisibility((z2 || z) ? 0 : 8);
            this.f53220k.setVisibility((z2 || z) ? 0 : 8);
        } else {
            animEffectPlayer.setVisibility(8);
            this.f53215f.setVisibility(0);
            this.f53215f.setText(String.valueOf(i + 1));
            this.f53221l.setImageResource(obc0.f146564ya);
            this.f53220k.setVisibility(8);
            this.f53221l.setVisibility((z || z2) ? 0 : 8);
        }
        this.f53220k.setImageResource(qd80.f156678m.equals(bLiveVoiceKTVOrder.status) ? obc0.f146035F9 : obc0.f146023E9);
        VDraweeView vDraweeView = this.f53216g;
        String str = bLiveVoiceKTVOrder.song.cover;
        int i2 = qa00.f156291D;
        izs.m142869t("context_single_room", vDraweeView, str, i2);
        this.f53217h.setText(bLiveVoiceKTVOrder.song.title);
        izs.m142869t("context_single_room", this.f53218i, bLiveVoiceKTVOrder.mask.avatar, i2);
        this.f53219j.setText(bLiveVoiceKTVOrder.mask.name);
        bnl0.m105509E0(this.f53220k, new View.OnClickListener() { // from class: l.h2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(new Pair(0, bLiveVoiceKTVOrder));
            }
        });
        bnl0.m105509E0(this.f53221l, new View.OnClickListener() { // from class: l.i2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KtvAlreadyChooseSongItem.m78212h0(i, y20Var, bLiveVoiceKTVOrder, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78214j0(this);
    }

    public KtvAlreadyChooseSongItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvAlreadyChooseSongItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
