package p009l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import l.hxs;
import l.t100;
import l.zjm0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yjm0 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f23108a;

    /* JADX INFO: renamed from: b */
    public VText f23109b;

    /* JADX INFO: renamed from: c */
    public TextView f23110c;

    /* JADX INFO: renamed from: a */
    public View m25428a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zjm0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m25429b(BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem, Typeface typeface) {
        if (bLiveVoiceBonusGiftItem == null) {
            return;
        }
        VDraweeView vDraweeView = this.f23108a;
        String str = bLiveVoiceBonusGiftItem.giftUrl;
        int i = t100.I;
        hxs.u("context_single_room", vDraweeView, str, i, i);
        this.f23110c.setText(bLiveVoiceBonusGiftItem.giftName);
        if (typeface != null) {
            this.f23109b.setTypeface(typeface);
        }
        this.f23109b.setText("X" + bLiveVoiceBonusGiftItem.count);
    }
}
