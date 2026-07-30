package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetListItemView;
import p149l.e30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.ioo0;
import p149l.lro0;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f53612d;

    /* JADX INFO: renamed from: e */
    public TextView f53613e;

    /* JADX INFO: renamed from: f */
    public TextView f53614f;

    /* JADX INFO: renamed from: g */
    public TextView f53615g;

    /* JADX INFO: renamed from: h */
    public VoiceSweetCpHeadView f53616h;

    /* JADX INFO: renamed from: i */
    public final int f53617i;

    public VoiceSweetListItemView(Context context) {
        super(context);
        this.f53617i = t100.m186889c().widthPixels - t100.m186890d(51.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m78575h0(e30 e30Var, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, View view) {
        if (e30Var != null) {
            e30Var.call(bLiveSweetCpRankInfo.userId);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m78576i0(e30 e30Var, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, View view) {
        if (e30Var != null) {
            e30Var.call(bLiveSweetCpRankInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78577j0(View view) {
        lro0.m151497a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m78578k0(int i) {
        this.f53614f.setText("");
        if (i == 0) {
            this.f53615g.setTextColor(getContext().getResources().getColor(h1c0.f105396q));
            this.f53614f.setBackgroundResource(i3c0.f111152ra);
            this.f53613e.setBackgroundResource(i3c0.f110934Z7);
            this.f53613e.setTextColor(getContext().getResources().getColor(h1c0.f105396q));
            this.f53612d.setImageResource(i3c0.f111092ma);
            setBackgroundResource(i3c0.f110890V7);
            return;
        }
        if (i == 1) {
            this.f53615g.setTextColor(getContext().getResources().getColor(h1c0.f105369h));
            this.f53614f.setBackgroundResource(i3c0.f111164sa);
            this.f53613e.setBackgroundResource(i3c0.f110946a8);
            this.f53613e.setTextColor(getContext().getResources().getColor(h1c0.f105369h));
            this.f53612d.setImageResource(i3c0.f111104na);
            setBackgroundResource(i3c0.f110901W7);
            return;
        }
        TextView textView = this.f53615g;
        if (i == 2) {
            textView.setTextColor(getContext().getResources().getColor(h1c0.f105408u));
            this.f53614f.setBackgroundResource(i3c0.f111176ta);
            this.f53613e.setBackgroundResource(i3c0.f110958b8);
            this.f53613e.setTextColor(getContext().getResources().getColor(h1c0.f105408u));
            this.f53612d.setImageResource(i3c0.f111116oa);
            setBackgroundResource(i3c0.f110912X7);
            return;
        }
        textView.setTextColor(getContext().getResources().getColor(h1c0.f105385m0));
        this.f53614f.setBackgroundResource(i3c0.f111068ka);
        this.f53614f.setText(String.valueOf(i + 1));
        this.f53613e.setBackgroundResource(i3c0.f110970c8);
        this.f53613e.setTextColor(getContext().getResources().getColor(h1c0.f105385m0));
        this.f53612d.setImageResource(i3c0.f111128pa);
        setBackgroundResource(i3c0.f110923Y7);
    }

    /* JADX INFO: renamed from: l0 */
    public void m78579l0(final BLiveSweetCpRankInfo bLiveSweetCpRankInfo, int i, final e30<String> e30Var) {
        this.f53615g.setText(getContext().getString(R$string.f47262gg) + ":LV." + bLiveSweetCpRankInfo.houseRank);
        this.f53613e.setText(w8u.m202217t(R$string.f47349kg) + ":" + ioo0.INSTANCE.m137367a(bLiveSweetCpRankInfo.cpLuxuryValue));
        StringBuilder sb = new StringBuilder("LV.");
        sb.append(bLiveSweetCpRankInfo.houseRank);
        sb.append(bLiveSweetCpRankInfo.houseName);
        this.f53616h.m78492b(bLiveSweetCpRankInfo.houseBackground, bLiveSweetCpRankInfo.houseImage, sb.toString(), bLiveSweetCpRankInfo.meUserAvatar, bLiveSweetCpRankInfo.cpUserAvatar);
        this.f53616h.m78493c(t100.m186890d(70.0f), t100.m186890d(70.0f));
        xdl0.m208329E0(this.f53616h.f53534e, new View.OnClickListener() { // from class: l.jro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetListItemView.m78575h0(e30Var, bLiveSweetCpRankInfo, view);
            }
        });
        xdl0.m208329E0(this.f53616h.f53536g, new View.OnClickListener() { // from class: l.kro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetListItemView.m78576i0(e30Var, bLiveSweetCpRankInfo, view);
            }
        });
        m78578k0(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78577j0(this);
        xdl0.m208327D0(this.f53617i, this.f53616h);
        xdl0.m208325C0(this.f53616h, (int) (this.f53617i * 0.25f));
    }

    public VoiceSweetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53617i = t100.m186889c().widthPixels - t100.m186890d(51.0f);
    }

    public VoiceSweetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53617i = t100.m186889c().widthPixels - t100.m186890d(51.0f);
    }
}
