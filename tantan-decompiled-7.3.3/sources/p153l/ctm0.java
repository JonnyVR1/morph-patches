package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceBonusGiftItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ctm0 {

    /* JADX INFO: renamed from: a */
    public VDraweeView f83716a;

    /* JADX INFO: renamed from: b */
    public VText f83717b;

    /* JADX INFO: renamed from: c */
    public TextView f83718c;

    /* JADX INFO: renamed from: a */
    public View m112517a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dtm0.m117886b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m112518b(BLiveVoiceBonusGiftItem bLiveVoiceBonusGiftItem, Typeface typeface) {
        if (bLiveVoiceBonusGiftItem == null) {
            return;
        }
        VDraweeView vDraweeView = this.f83716a;
        String str = bLiveVoiceBonusGiftItem.giftUrl;
        int i = qa00.f156296I;
        izs.m142870u("context_single_room", vDraweeView, str, i, i);
        this.f83718c.setText(bLiveVoiceBonusGiftItem.giftName);
        if (typeface != null) {
            this.f83717b.setTypeface(typeface);
        }
        this.f83717b.setText("X" + bLiveVoiceBonusGiftItem.count);
    }
}
