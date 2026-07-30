package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class yjm0 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f198644a;

    /* JADX INFO: renamed from: b */
    public VText f198645b;

    /* JADX INFO: renamed from: c */
    public TextView f198646c;

    /* JADX INFO: renamed from: a */
    public View m215069a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zjm0.m219126b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m215070b(BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem, Typeface typeface) {
        if (bLiveVoiceBonusGiftItem == null) {
            return;
        }
        VDraweeView vDraweeView = this.f198644a;
        String str = bLiveVoiceBonusGiftItem.giftUrl;
        int i = t100.f167234I;
        hxs.m133408u("context_single_room", vDraweeView, str, i, i);
        this.f198646c.setText(bLiveVoiceBonusGiftItem.giftName);
        if (typeface != null) {
            this.f198645b.setTypeface(typeface);
        }
        this.f198645b.setText("X" + bLiveVoiceBonusGiftItem.count);
    }
}
