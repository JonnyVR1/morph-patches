package p002l;

import android.annotation.SuppressLint;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttributeItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetProcesses;
import com.tantanapp.common.utils.NullChecker;
import l.mep0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zvj extends zjs<owj, BLiveGiftSetInfo> {

    /* JADX INFO: renamed from: s */
    public String f23612s;

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: A */
    public void m27611A(String str) {
        this.f23459i.setText(this.f23612s + " " + str);
    }

    /* JADX INFO: renamed from: B */
    public void m27612B(boolean z) {
        xdl0.M(this.f23468r, z);
        xdl0.M(this.f23456f, !z);
        if (z) {
            this.f23468r.e(R$string.f2696E9).b(i3c0.f12787f4);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m27613C(BLiveGiftSetInfo bLiveGiftSetInfo) {
        GiftSuitItemView[] giftSuitItemViewArr = {this.f23462l, this.f23463m, this.f23464n};
        for (int i = 0; i < bLiveGiftSetInfo.setProcesses.size() && i <= 3; i++) {
            if (NullChecker.a(bLiveGiftSetInfo.displayAttribute)) {
                giftSuitItemViewArr[i].m7579d((owj) this.f3748b, bLiveGiftSetInfo.displayAttribute);
            }
            giftSuitItemViewArr[i].m7578c((owj) this.f3748b, (BLiveGiftSetProcesses) bLiveGiftSetInfo.setProcesses.get(i));
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p002l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo5089F0(boolean z) {
        super.mo5089F0(z);
        pwj.m20733b(((owj) this.f3748b).m25552L2());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo5096k() {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public int m27614x() {
        return this.f23456f.getHeight();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m27615y(BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem, View view) {
        ((owj) this.f3748b).m19791n4(bLiveGiftSetDisplayAttributeItem.schemeUrl);
    }

    /* JADX INFO: renamed from: z */
    public void m27616z(BLiveGiftSetInfo bLiveGiftSetInfo) {
        xdl0.C0(m27400v(), (xdl0.y0() * 3) / 4);
        m27612B(false);
        if (NullChecker.a(bLiveGiftSetInfo.displayAttribute)) {
            ((owj) this.f3748b).m19795r4(bLiveGiftSetInfo.displayAttribute.safeAreaPicUrl, this.f23467q);
            mep0.c1(this.f23456f, 0, 0, 0, -xdl0.w(24.0f), xdl0.w(24.0f));
            ((owj) this.f3748b).m19795r4(bLiveGiftSetInfo.displayAttribute.backgroundPicUrl, this.f23456f);
            final BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = bLiveGiftSetInfo.displayAttribute.questionMarkDisplayAttribute;
            xdl0.E0(this.f23457g, new View.OnClickListener() { // from class: l.yvj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23119a.m27615y(bLiveGiftSetDisplayAttributeItem, view);
                }
            });
            ((owj) this.f3748b).m19795r4(bLiveGiftSetDisplayAttributeItem.iconUrl, this.f23457g);
            BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem2 = bLiveGiftSetInfo.displayAttribute.tickerDisplayAttribute;
            this.f23612s = bLiveGiftSetDisplayAttributeItem2.text;
            ((owj) this.f3748b).m19794q4(bLiveGiftSetDisplayAttributeItem2.iconUrl, this.f23458h);
            ((owj) this.f3748b).m19798t4(this.f23459i, bLiveGiftSetDisplayAttributeItem2.textColor);
            this.f23461k.setText(bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescText);
            ((owj) this.f3748b).m19798t4(this.f23461k, bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescTextColor);
            ((owj) this.f3748b).m19794q4(bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescBackgroundPicUrl, this.f23460j);
            BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem3 = bLiveGiftSetInfo.displayAttribute.resourceDisplayAttribute;
            ((owj) this.f3748b).m19795r4(bLiveGiftSetDisplayAttributeItem3.framePicUrl, this.f23465o);
            ((owj) this.f3748b).m19795r4(bLiveGiftSetDisplayAttributeItem3.resourcePicUrl, this.f23466p);
        }
        ((owj) this.f3748b).m19782e4((int) ((((double) bLiveGiftSetInfo.tickerLeft) * 1.0d) / 1000.0d), bLiveGiftSetInfo.hasSuitSend());
        m27613C(bLiveGiftSetInfo);
    }
}
