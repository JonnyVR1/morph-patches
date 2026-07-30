package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetListItemView;
import com.p1.mobile.putong.live.base.data.BLiveSweetCpRankInfo;
import com.p1.mobile.putong.live.livingroom.R;
import l.e30;
import l.h1c0;
import l.i3c0;
import l.lro0;
import l.t100;
import l.w8u;
import l.xdl0;
import p009l.ioo0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f7218d;

    /* JADX INFO: renamed from: e */
    public TextView f7219e;

    /* JADX INFO: renamed from: f */
    public TextView f7220f;

    /* JADX INFO: renamed from: g */
    public TextView f7221g;

    /* JADX INFO: renamed from: h */
    public VoiceSweetCpHeadView f7222h;

    /* JADX INFO: renamed from: i */
    public final int f7223i;

    public VoiceSweetListItemView(Context context) {
        super(context);
        this.f7223i = t100.c().widthPixels - t100.d(51.0f);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m8788h0(e30 e30Var, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, View view) {
        if (e30Var != null) {
            e30Var.call(bLiveSweetCpRankInfo.userId);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m8789i0(e30 e30Var, BLiveSweetCpRankInfo bLiveSweetCpRankInfo, View view) {
        if (e30Var != null) {
            e30Var.call(bLiveSweetCpRankInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8790j0(View view) {
        lro0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final void m8791k0(int i) {
        this.f7220f.setText("");
        if (i == 0) {
            this.f7221g.setTextColor(getContext().getResources().getColor(h1c0.q));
            this.f7220f.setBackgroundResource(i3c0.ra);
            this.f7219e.setBackgroundResource(i3c0.Z7);
            this.f7219e.setTextColor(getContext().getResources().getColor(h1c0.q));
            this.f7218d.setImageResource(i3c0.ma);
            setBackgroundResource(i3c0.V7);
            return;
        }
        if (i == 1) {
            this.f7221g.setTextColor(getContext().getResources().getColor(h1c0.h));
            this.f7220f.setBackgroundResource(i3c0.sa);
            this.f7219e.setBackgroundResource(i3c0.a8);
            this.f7219e.setTextColor(getContext().getResources().getColor(h1c0.h));
            this.f7218d.setImageResource(i3c0.na);
            setBackgroundResource(i3c0.W7);
            return;
        }
        TextView textView = this.f7221g;
        if (i == 2) {
            textView.setTextColor(getContext().getResources().getColor(h1c0.u));
            this.f7220f.setBackgroundResource(i3c0.ta);
            this.f7219e.setBackgroundResource(i3c0.b8);
            this.f7219e.setTextColor(getContext().getResources().getColor(h1c0.u));
            this.f7218d.setImageResource(i3c0.oa);
            setBackgroundResource(i3c0.X7);
            return;
        }
        textView.setTextColor(getContext().getResources().getColor(h1c0.m0));
        this.f7220f.setBackgroundResource(i3c0.ka);
        this.f7220f.setText(String.valueOf(i + 1));
        this.f7219e.setBackgroundResource(i3c0.c8);
        this.f7219e.setTextColor(getContext().getResources().getColor(h1c0.m0));
        this.f7218d.setImageResource(i3c0.pa);
        setBackgroundResource(i3c0.Y7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m8792l0(final BLiveSweetCpRankInfo bLiveSweetCpRankInfo, int i, final e30<String> e30Var) {
        this.f7221g.setText(getContext().getString(R.string.gg) + ":LV." + bLiveSweetCpRankInfo.houseRank);
        this.f7219e.setText(w8u.t(R.string.kg) + ":" + ioo0.INSTANCE.m16658a(bLiveSweetCpRankInfo.cpLuxuryValue));
        StringBuilder sb = new StringBuilder("LV.");
        sb.append(bLiveSweetCpRankInfo.houseRank);
        sb.append(bLiveSweetCpRankInfo.houseName);
        this.f7222h.m8701b(bLiveSweetCpRankInfo.houseBackground, bLiveSweetCpRankInfo.houseImage, sb.toString(), bLiveSweetCpRankInfo.meUserAvatar, bLiveSweetCpRankInfo.cpUserAvatar);
        this.f7222h.m8702c(t100.d(70.0f), t100.d(70.0f));
        xdl0.E0(this.f7222h.f7140e, new View.OnClickListener() { // from class: l.jro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetListItemView.m8788h0(e30Var, bLiveSweetCpRankInfo, view);
            }
        });
        xdl0.E0(this.f7222h.f7142g, new View.OnClickListener() { // from class: l.kro0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSweetListItemView.m8789i0(e30Var, bLiveSweetCpRankInfo, view);
            }
        });
        m8791k0(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8790j0(this);
        xdl0.D0(this.f7223i, new View[]{this.f7222h});
        xdl0.C0(this.f7222h, (int) (this.f7223i * 0.25f));
    }

    public VoiceSweetListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7223i = t100.c().widthPixels - t100.d(51.0f);
    }

    public VoiceSweetListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7223i = t100.c().widthPixels - t100.d(51.0f);
    }
}
