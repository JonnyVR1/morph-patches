package com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.hxs;
import l.nvn0;
import l.t100;
import l.u6n;
import l.uep0;
import l.vwb;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceLiveRoomBgSettingItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6990a;

    /* JADX INFO: renamed from: b */
    public ImageView f6991b;

    /* JADX INFO: renamed from: c */
    public ImageView f6992c;

    /* JADX INFO: renamed from: d */
    public TextView f6993d;

    /* JADX INFO: renamed from: e */
    public int f6994e;

    /* JADX INFO: renamed from: f */
    public int f6995f;

    public VoiceLiveRoomBgSettingItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m8618b(View view) {
        nvn0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final String m8619c(int i) {
        if (i < 3600) {
            return "1h";
        }
        int i2 = i / 86400;
        int i3 = (i % 86400) / 3600;
        StringBuilder sb = new StringBuilder();
        if (i2 != 0) {
            sb.append(i2);
            sb.append("d");
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append("h");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m8620d() {
        ViewGroup.LayoutParams layoutParams = this.f6990a.getLayoutParams();
        int iY0 = (int) ((xdl0.y0() - t100.d(54.0f)) / 3.0f);
        this.f6994e = iY0;
        int i = (int) ((layoutParams.width * 140.0f) / 107.0f);
        this.f6995f = i;
        layoutParams.width = iY0;
        layoutParams.height = i;
        this.f6990a.setLayoutParams(layoutParams);
        uep0.l(this.f6990a, 0, 0, 0, 0, t100.d(10.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m8621e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        boolean z = bLiveVoiceBackGroundPics.free;
        TextView textView = this.f6993d;
        if (z) {
            textView.setText(R.string.Ti);
        } else {
            textView.setText(m8619c(bLiveVoiceBackGroundPics.expireTime));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8622f(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        List list = bLiveVoiceBackGroundPics.priceGradient;
        if (vwb.J(list)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((BLiveVoiceBackgroundPriceGradient) list.get(0)).price);
        sb.append(" ");
        sb.append(getContext().getString(u6n.a() ? R.string.Ak : R.string.Qi));
        sb.append("/");
        sb.append(getContext().getString(R.string.Si));
        this.f6993d.setText(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public void m8623g(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, boolean z, final Runnable runnable) {
        if (NullChecker.a(bLiveVoiceBackGroundPics)) {
            hxs.v("context_single_room", this.f6990a, bLiveVoiceBackGroundPics.thumbnailUrl, this.f6994e, this.f6995f, true, false, true, (ym2) null);
            xdl0.M(this.f6991b, bLiveVoiceBackGroundPics.check);
            xdl0.M(this.f6992c, !z);
            if (NullChecker.a(runnable)) {
                xdl0.E0(this.f6992c, new View.OnClickListener() { // from class: l.mvn0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        runnable.run();
                    }
                });
            }
            if (z) {
                m8621e(bLiveVoiceBackGroundPics);
            } else {
                m8622f(bLiveVoiceBackGroundPics);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8618b(this);
        m8620d();
    }

    public VoiceLiveRoomBgSettingItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveRoomBgSettingItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
