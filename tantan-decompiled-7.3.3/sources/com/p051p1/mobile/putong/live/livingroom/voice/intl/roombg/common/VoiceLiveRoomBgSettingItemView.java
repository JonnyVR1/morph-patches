package com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.jyb;
import p153l.qa00;
import p153l.r4o0;
import p153l.u8n;
import p153l.ynp0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceLiveRoomBgSettingItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54232a;

    /* JADX INFO: renamed from: b */
    public ImageView f54233b;

    /* JADX INFO: renamed from: c */
    public ImageView f54234c;

    /* JADX INFO: renamed from: d */
    public TextView f54235d;

    /* JADX INFO: renamed from: e */
    public int f54236e;

    /* JADX INFO: renamed from: f */
    public int f54237f;

    public VoiceLiveRoomBgSettingItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m79598b(View view) {
        r4o0.m179783a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final String m79599c(int i) {
        if (i < 3600) {
            return "1h";
        }
        int i2 = i / MMKV.ExpireInDay;
        int i3 = (i % MMKV.ExpireInDay) / MMKV.ExpireInHour;
        StringBuilder sb = new StringBuilder();
        if (i2 != 0) {
            sb.append(i2);
            sb.append(Constants.INAPP_DATA_TAG);
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append("h");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m79600d() {
        ViewGroup.LayoutParams layoutParams = this.f54232a.getLayoutParams();
        int iM105592y0 = (int) ((bnl0.m105592y0() - qa00.m175859d(54.0f)) / 3.0f);
        this.f54236e = iM105592y0;
        int i = (int) ((layoutParams.width * 140.0f) / 107.0f);
        this.f54237f = i;
        layoutParams.width = iM105592y0;
        layoutParams.height = i;
        this.f54232a.setLayoutParams(layoutParams);
        ynp0.m216935l(this.f54232a, 0, 0, 0, 0, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m79601e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        boolean z = bLiveVoiceBackGroundPics.free;
        TextView textView = this.f54235d;
        if (z) {
            textView.setText(R$string.f47833Ti);
        } else {
            textView.setText(m79599c(bLiveVoiceBackGroundPics.expireTime));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m79602f(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        List<BLiveVoiceBackgroundPriceGradient> list = bLiveVoiceBackGroundPics.priceGradient;
        if (jyb.m147479J(list)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0).price);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(getContext().getString(u8n.m195065a() ? R$string.f47425Ak : R$string.f47770Qi));
        sb.append("/");
        sb.append(getContext().getString(R$string.f47812Si));
        this.f54235d.setText(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public void m79603g(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, boolean z, final Runnable runnable) {
        if (NullChecker.m82486a(bLiveVoiceBackGroundPics)) {
            izs.m142871v("context_single_room", this.f54232a, bLiveVoiceBackGroundPics.thumbnailUrl, this.f54236e, this.f54237f, true, false, true, null);
            bnl0.m105524M(this.f54233b, bLiveVoiceBackGroundPics.check);
            bnl0.m105524M(this.f54234c, !z);
            if (NullChecker.m82486a(runnable)) {
                bnl0.m105509E0(this.f54234c, new View.OnClickListener() { // from class: l.q4o0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        runnable.run();
                    }
                });
            }
            if (z) {
                m79601e(bLiveVoiceBackGroundPics);
            } else {
                m79602f(bLiveVoiceBackGroundPics);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79598b(this);
        m79600d();
    }

    public VoiceLiveRoomBgSettingItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveRoomBgSettingItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
