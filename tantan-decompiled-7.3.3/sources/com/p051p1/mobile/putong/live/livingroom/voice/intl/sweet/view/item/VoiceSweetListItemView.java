package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetListItemView;
import p153l.bnl0;
import p153l.mxo0;
import p153l.n9c0;
import p153l.obc0;
import p153l.p0p0;
import p153l.qa00;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f54460d;

    /* JADX INFO: renamed from: e */
    public TextView f54461e;

    /* JADX INFO: renamed from: f */
    public TextView f54462f;

    /* JADX INFO: renamed from: g */
    public TextView f54463g;

    /* JADX INFO: renamed from: h */
    public VoiceSweetCpHeadView f54464h;

    /* JADX INFO: renamed from: i */
    public final int f54465i;

    public VoiceSweetListItemView(Context context) {
        super(context);
        this.f54465i = qa00.m175858c().widthPixels - qa00.m175859d(51.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m79758h0(y20 y20Var, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, View view) {
        if (y20Var != null) {
            y20Var.call(bLiveSweetCpRankInfo.userId);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m79759i0(y20 y20Var, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, View view) {
        if (y20Var != null) {
            y20Var.call(bLiveSweetCpRankInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79760j0(View view) {
        p0p0.m170179a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m79761k0(int i) {
        this.f54462f.setText("");
        if (i == 0) {
            this.f54463g.setTextColor(getContext().getResources().getColor(n9c0.f140857q));
            this.f54462f.setBackgroundResource(obc0.f146480ra);
            this.f54461e.setBackgroundResource(obc0.f146262Z7);
            this.f54461e.setTextColor(getContext().getResources().getColor(n9c0.f140857q));
            this.f54460d.setImageResource(obc0.f146420ma);
            setBackgroundResource(obc0.f146218V7);
            return;
        }
        if (i == 1) {
            this.f54463g.setTextColor(getContext().getResources().getColor(n9c0.f140830h));
            this.f54462f.setBackgroundResource(obc0.f146492sa);
            this.f54461e.setBackgroundResource(obc0.f146274a8);
            this.f54461e.setTextColor(getContext().getResources().getColor(n9c0.f140830h));
            this.f54460d.setImageResource(obc0.f146432na);
            setBackgroundResource(obc0.f146229W7);
            return;
        }
        TextView textView = this.f54463g;
        if (i == 2) {
            textView.setTextColor(getContext().getResources().getColor(n9c0.f140869u));
            this.f54462f.setBackgroundResource(obc0.f146504ta);
            this.f54461e.setBackgroundResource(obc0.f146286b8);
            this.f54461e.setTextColor(getContext().getResources().getColor(n9c0.f140869u));
            this.f54460d.setImageResource(obc0.f146444oa);
            setBackgroundResource(obc0.f146240X7);
            return;
        }
        textView.setTextColor(getContext().getResources().getColor(n9c0.f140846m0));
        this.f54462f.setBackgroundResource(obc0.f146396ka);
        this.f54462f.setText(String.valueOf(i + 1));
        this.f54461e.setBackgroundResource(obc0.f146298c8);
        this.f54461e.setTextColor(getContext().getResources().getColor(n9c0.f140846m0));
        this.f54460d.setImageResource(obc0.f146456pa);
        setBackgroundResource(obc0.f146251Y7);
    }

    /* JADX INFO: renamed from: l0 */
    public void m79762l0(final BLiveSweetCpRankInfo bLiveSweetCpRankInfo, int i, final y20<String> y20Var) {
        this.f54463g.setText(getContext().getString(R$string.f48110gg) + ":LV." + bLiveSweetCpRankInfo.houseRank);
        this.f54461e.setText(xau.m209910t(R$string.f48197kg) + ":" + mxo0.INSTANCE.m160692a(bLiveSweetCpRankInfo.cpLuxuryValue));
        StringBuilder sb = new StringBuilder("LV.");
        sb.append(bLiveSweetCpRankInfo.houseRank);
        sb.append(bLiveSweetCpRankInfo.houseName);
        this.f54464h.m79675b(bLiveSweetCpRankInfo.houseBackground, bLiveSweetCpRankInfo.houseImage, sb.toString(), bLiveSweetCpRankInfo.meUserAvatar, bLiveSweetCpRankInfo.cpUserAvatar);
        this.f54464h.m79676c(qa00.m175859d(70.0f), qa00.m175859d(70.0f));
        bnl0.m105509E0(this.f54464h.f54382e, new View.OnClickListener() { // from class: l.n0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetListItemView.m79758h0(y20Var, bLiveSweetCpRankInfo, view);
            }
        });
        bnl0.m105509E0(this.f54464h.f54384g, new View.OnClickListener() { // from class: l.o0p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetListItemView.m79759i0(y20Var, bLiveSweetCpRankInfo, view);
            }
        });
        m79761k0(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79760j0(this);
        bnl0.m105507D0(this.f54465i, this.f54464h);
        bnl0.m105505C0(this.f54464h, (int) (this.f54465i * 0.25f));
    }

    public VoiceSweetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54465i = qa00.m175858c().widthPixels - qa00.m175859d(51.0f);
    }

    public VoiceSweetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54465i = qa00.m175858c().widthPixels - qa00.m175859d(51.0f);
    }
}
