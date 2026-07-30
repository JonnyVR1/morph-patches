package p149l;

import android.annotation.SuppressLint;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSetDisplayAttributeItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.suit.view.GiftSuitItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class zvj extends zjs<owj, BLiveGiftSetInfo> {

    /* JADX INFO: renamed from: s */
    public String f205014s;

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: A */
    public void m220408A(String str) {
        this.f203469i.setText(this.f205014s + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
    }

    /* JADX INFO: renamed from: B */
    public void m220409B(boolean z) {
        xdl0.m208344M(this.f203478r, z);
        xdl0.m208344M(this.f203466f, !z);
        if (z) {
            this.f203478r.m68720e(R$string.f46654E9).m68717b(i3c0.f111002f4);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m220410C(BLiveGiftSetInfo bLiveGiftSetInfo) {
        GiftSuitItemView[] giftSuitItemViewArr = {this.f203472l, this.f203473m, this.f203474n};
        for (int i = 0; i < bLiveGiftSetInfo.setProcesses.size() && i <= 3; i++) {
            if (NullChecker.m81303a(bLiveGiftSetInfo.displayAttribute)) {
                giftSuitItemViewArr[i].m74018d((owj) this.f47706b, bLiveGiftSetInfo.displayAttribute);
            }
            giftSuitItemViewArr[i].m74017c((owj) this.f47706b, bLiveGiftSetInfo.setProcesses.get(i));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo71722F0(boolean z) {
        super.mo71722F0(z);
        pwj.m171753b(((owj) this.f47706b).m206032L2());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public int m220411x() {
        return this.f203466f.getHeight();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m220412y(BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem, View view) {
        ((owj) this.f47706b).m166412n4(bLiveGiftSetDisplayAttributeItem.schemeUrl);
    }

    /* JADX INFO: renamed from: z */
    public void m220413z(BLiveGiftSetInfo bLiveGiftSetInfo) {
        xdl0.m208325C0(m219148v(), (xdl0.m208412y0() * 3) / 4);
        m220409B(false);
        if (NullChecker.m81303a(bLiveGiftSetInfo.displayAttribute)) {
            ((owj) this.f47706b).m166416r4(bLiveGiftSetInfo.displayAttribute.safeAreaPicUrl, this.f203477q);
            mep0.m154301c1(this.f203466f, 0, 0, 0, -xdl0.m208407w(24.0f), xdl0.m208407w(24.0f));
            ((owj) this.f47706b).m166416r4(bLiveGiftSetInfo.displayAttribute.backgroundPicUrl, this.f203466f);
            final BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem = bLiveGiftSetInfo.displayAttribute.questionMarkDisplayAttribute;
            xdl0.m208329E0(this.f203467g, new View.OnClickListener() { // from class: l.yvj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200265a.m220412y(bLiveGiftSetDisplayAttributeItem, view);
                }
            });
            ((owj) this.f47706b).m166416r4(bLiveGiftSetDisplayAttributeItem.iconUrl, this.f203467g);
            BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem2 = bLiveGiftSetInfo.displayAttribute.tickerDisplayAttribute;
            this.f205014s = bLiveGiftSetDisplayAttributeItem2.text;
            ((owj) this.f47706b).m166415q4(bLiveGiftSetDisplayAttributeItem2.iconUrl, this.f203468h);
            ((owj) this.f47706b).m166418t4(this.f203469i, bLiveGiftSetDisplayAttributeItem2.textColor);
            this.f203471k.setText(bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescText);
            ((owj) this.f47706b).m166418t4(this.f203471k, bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescTextColor);
            ((owj) this.f47706b).m166415q4(bLiveGiftSetInfo.displayAttribute.giftSetDescDisplayAttribute.giftSetDescBackgroundPicUrl, this.f203470j);
            BLiveGiftSetDisplayAttributeItem bLiveGiftSetDisplayAttributeItem3 = bLiveGiftSetInfo.displayAttribute.resourceDisplayAttribute;
            ((owj) this.f47706b).m166416r4(bLiveGiftSetDisplayAttributeItem3.framePicUrl, this.f203475o);
            ((owj) this.f47706b).m166416r4(bLiveGiftSetDisplayAttributeItem3.resourcePicUrl, this.f203476p);
        }
        ((owj) this.f47706b).m166403e4((int) ((((double) bLiveGiftSetInfo.tickerLeft) * 1.0d) / 1000.0d), bLiveGiftSetInfo.hasSuitSend());
        m220410C(bLiveGiftSetInfo);
    }
}
