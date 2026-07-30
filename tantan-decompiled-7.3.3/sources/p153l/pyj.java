package p153l;

import android.annotation.SuppressLint;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttributeItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class pyj extends ams<ezj, BLiveGiftSetInfo> {

    /* JADX INFO: renamed from: s */
    public String f154666s;

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: A */
    public void m174291A(String str) {
        this.f72262i.setText(this.f154666s + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
    }

    /* JADX INFO: renamed from: B */
    public void m174292B(boolean z) {
        bnl0.m105524M(this.f72271r, z);
        bnl0.m105524M(this.f72259f, !z);
        if (z) {
            this.f72271r.m69903e(R$string.f47502E9).m69900b(obc0.f146330f4);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m174293C(BLiveGiftSetInfo bLiveGiftSetInfo) {
        GiftSuitItemView[] giftSuitItemViewArr = {this.f72265l, this.f72266m, this.f72267n};
        for (int i = 0; i < bLiveGiftSetInfo.setProcesses.size() && i <= 3; i++) {
            if (NullChecker.m82486a(bLiveGiftSetInfo.displayAttribute)) {
                giftSuitItemViewArr[i].m75201d((ezj) this.f48554b, bLiveGiftSetInfo.displayAttribute);
            }
            giftSuitItemViewArr[i].m75200c((ezj) this.f48554b, bLiveGiftSetInfo.setProcesses.get(i));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    /* JADX INFO: renamed from: F0 */
    public void mo72905F0(boolean z) {
        super.mo72905F0(z);
        fzj.m128192b(((ezj) this.f48554b).m213815L2());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public int m174294x() {
        return this.f72259f.getHeight();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m174295y(BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem, View view) {
        ((ezj) this.f48554b).m123377n4(bLiveGiftSetDisplayAttributeItem.schemeUrl);
    }

    /* JADX INFO: renamed from: z */
    public void m174296z(BLiveGiftSetInfo bLiveGiftSetInfo) {
        bnl0.m105505C0(m98855v(), (bnl0.m105592y0() * 3) / 4);
        m174292B(false);
        if (NullChecker.m82486a(bLiveGiftSetInfo.displayAttribute)) {
            ((ezj) this.f48554b).m123380r4(bLiveGiftSetInfo.displayAttribute.safeAreaPicUrl, this.f72270q);
            qnp0.m177260c1(this.f72259f, 0, 0, 0, -bnl0.m105587w(24.0f), bnl0.m105587w(24.0f));
            ((ezj) this.f48554b).m123380r4(bLiveGiftSetInfo.displayAttribute.backgroundPicUrl, this.f72259f);
            final BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = bLiveGiftSetInfo.displayAttribute.questionMarkDisplayAttribute;
            bnl0.m105509E0(this.f72260g, new View.OnClickListener() { // from class: l.oyj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149804a.m174295y(bLiveGiftSetDisplayAttributeItem, view);
                }
            });
            ((ezj) this.f48554b).m123380r4(bLiveGiftSetDisplayAttributeItem.iconUrl, this.f72260g);
            BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem2 = bLiveGiftSetInfo.displayAttribute.tickerDisplayAttribute;
            this.f154666s = bLiveGiftSetDisplayAttributeItem2.text;
            ((ezj) this.f48554b).m123379q4(bLiveGiftSetDisplayAttributeItem2.iconUrl, this.f72261h);
            ((ezj) this.f48554b).m123382t4(this.f72262i, bLiveGiftSetDisplayAttributeItem2.textColor);
            this.f72264k.setText(bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescText);
            ((ezj) this.f48554b).m123382t4(this.f72264k, bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescTextColor);
            ((ezj) this.f48554b).m123379q4(bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescBackgroundPicUrl, this.f72263j);
            BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem3 = bLiveGiftSetInfo.displayAttribute.resourceDisplayAttribute;
            ((ezj) this.f48554b).m123380r4(bLiveGiftSetDisplayAttributeItem3.framePicUrl, this.f72268o);
            ((ezj) this.f48554b).m123380r4(bLiveGiftSetDisplayAttributeItem3.resourcePicUrl, this.f72269p);
        }
        ((ezj) this.f48554b).m123368e4((int) ((((double) bLiveGiftSetInfo.tickerLeft) * 1.0d) / 1000.0d), bLiveGiftSetInfo.hasSuitSend());
        m174293C(bLiveGiftSetInfo);
    }
}
