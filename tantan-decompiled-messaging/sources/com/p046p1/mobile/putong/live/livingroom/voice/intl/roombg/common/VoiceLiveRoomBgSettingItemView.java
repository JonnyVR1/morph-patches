package com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackgroundPriceGradient;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mmkv.MMKV;
import java.util.List;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.nvn0;
import p149l.t100;
import p149l.u6n;
import p149l.uep0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceLiveRoomBgSettingItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53384a;

    /* JADX INFO: renamed from: b */
    public ImageView f53385b;

    /* JADX INFO: renamed from: c */
    public ImageView f53386c;

    /* JADX INFO: renamed from: d */
    public TextView f53387d;

    /* JADX INFO: renamed from: e */
    public int f53388e;

    /* JADX INFO: renamed from: f */
    public int f53389f;

    public VoiceLiveRoomBgSettingItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78415b(View view) {
        nvn0.m161706a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final String m78416c(int i) {
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
    public final void m78417d() {
        ViewGroup.LayoutParams layoutParams = this.f53384a.getLayoutParams();
        int iM208412y0 = (int) ((xdl0.m208412y0() - t100.m186890d(54.0f)) / 3.0f);
        this.f53388e = iM208412y0;
        int i = (int) ((layoutParams.width * 140.0f) / 107.0f);
        this.f53389f = i;
        layoutParams.width = iM208412y0;
        layoutParams.height = i;
        this.f53384a.setLayoutParams(layoutParams);
        uep0.m193325l(this.f53384a, 0, 0, 0, 0, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: e */
    public final void m78418e(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        boolean z = bLiveVoiceBackGroundPics.free;
        TextView textView = this.f53387d;
        if (z) {
            textView.setText(R$string.f46985Ti);
        } else {
            textView.setText(m78416c(bLiveVoiceBackGroundPics.expireTime));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m78419f(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        List<BLiveVoiceBackgroundPriceGradient> list = bLiveVoiceBackGroundPics.priceGradient;
        if (vwb.m200296J(list)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0).price);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(getContext().getString(u6n.m192015a() ? R$string.f46577Ak : R$string.f46922Qi));
        sb.append("/");
        sb.append(getContext().getString(R$string.f46964Si));
        this.f53387d.setText(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public void m78420g(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, boolean z, final Runnable runnable) {
        if (NullChecker.m81303a(bLiveVoiceBackGroundPics)) {
            hxs.m133409v("context_single_room", this.f53384a, bLiveVoiceBackGroundPics.thumbnailUrl, this.f53388e, this.f53389f, true, false, true, null);
            xdl0.m208344M(this.f53385b, bLiveVoiceBackGroundPics.check);
            xdl0.m208344M(this.f53386c, !z);
            if (NullChecker.m81303a(runnable)) {
                xdl0.m208329E0(this.f53386c, new View.OnClickListener() { // from class: l.mvn0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        runnable.run();
                    }
                });
            }
            if (z) {
                m78418e(bLiveVoiceBackGroundPics);
            } else {
                m78419f(bLiveVoiceBackGroundPics);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78415b(this);
        m78417d();
    }

    public VoiceLiveRoomBgSettingItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceLiveRoomBgSettingItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
