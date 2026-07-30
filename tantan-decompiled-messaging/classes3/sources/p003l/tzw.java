package p003l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.address.MarryAddressSelectAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.HometownSuggest;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.et4;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tzw extends hww<vzw> {

    /* JADX INFO: renamed from: a */
    public List<MarryAddressSelectData> f7825a;

    /* JADX INFO: renamed from: b */
    public MarrySeriesType f7826b;

    /* JADX INFO: renamed from: c */
    public User f7827c;

    /* JADX INFO: renamed from: d */
    public MarryAddressSelectData f7828d;

    /* JADX INFO: renamed from: e */
    public int f7829e;

    public tzw(mcr mcrVar) {
        super(mcrVar);
        this.f7825a = new ArrayList();
        this.f7828d = null;
        this.f7829e = -1;
    }

    /* JADX INFO: renamed from: o0 */
    private void m8054o0() {
        List<MarryAddressSelectData> listM6198e = m2x.m6198e(this.f7826b, this.f7827c);
        this.f7825a = listM6198e;
        for (MarryAddressSelectData marryAddressSelectData : listM6198e) {
            if (marryAddressSelectData.isSelected()) {
                this.f7828d = marryAddressSelectData;
                break;
            }
        }
        ((vzw) ((jq2) this).viewModel).m8425q(this.f7825a, false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m8055a0() {
        super.a0();
        duringCreated(CoreModule.P().a().we().observeOn(jo0.m5414a())).subscribe((m250) mkd0.G(new e30() { // from class: l.szw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7372a.m8060p0((HometownSuggest) obj);
            }
        }));
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        this.f7826b = marrySeriesType;
        this.f7827c = user;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m8056k0() {
        return NullChecker.a(this.f7828d);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8057l0() {
        Iterator<MarryAddressSelectData> it = this.f7825a.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public MarryAddressSelectData m8058m0() {
        return this.f7828d;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m8059n0(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3);
        }
        return et4.a("・", arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8060p0(HometownSuggest hometownSuggest) {
        m8054o0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m8061q0(int i, int i2, Intent intent) {
        MarryAddressSelectData marryAddressSelectData;
        String showText;
        String showText2;
        if (i == 10011 && i2 == -1 && NullChecker.a(intent)) {
            int intExtra = intent.getIntExtra("address_back_first", -1);
            int intExtra2 = intent.getIntExtra("address_back_second", -1);
            int i3 = this.f7829e;
            if (i3 < 0 || intExtra < 0) {
                return;
            }
            MarryAddressSelectData marryAddressSelectData2 = this.f7825a.get(i3);
            m8057l0();
            Iterator<MarryAddressSelectData> it = this.f7825a.iterator();
            do {
                if (!it.hasNext()) {
                    marryAddressSelectData = null;
                    break;
                }
                marryAddressSelectData = it.next();
            } while (!marryAddressSelectData.isOldData());
            String str = "";
            if (marryAddressSelectData == null) {
                marryAddressSelectData = new MarryAddressSelectData("", MarryAddressSelectData.MarryAddressDataSelectType.OLD_DATA);
                marryAddressSelectData.setSelected(true);
                this.f7825a.add(0, marryAddressSelectData);
            } else {
                marryAddressSelectData.setSelected(true);
            }
            if (marryAddressSelectData2.isOverseasData()) {
                String showText3 = marryAddressSelectData2.getNextList().get(intExtra).getShowText();
                showText = (intExtra2 < 0 || vwb.J(marryAddressSelectData2.getNextList().get(intExtra).getNextList())) ? "" : marryAddressSelectData2.getNextList().get(intExtra).getNextList().get(intExtra2).getShowText();
                marryAddressSelectData.setData(showText3, showText, "");
                showText2 = "";
                str = showText3;
            } else {
                showText = marryAddressSelectData2.getShowText();
                showText2 = marryAddressSelectData2.getNextList().get(intExtra).getShowText();
                marryAddressSelectData.setData("", showText, showText2);
            }
            marryAddressSelectData.setShowText(m8059n0(str, showText, showText2));
            this.f7828d = marryAddressSelectData;
            ((vzw) ((jq2) this).viewModel).m8425q(this.f7825a, true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m8062r0(int i) {
        MarryAddressSelectData marryAddressSelectData = this.f7825a.get(i);
        this.f7829e = i;
        if (marryAddressSelectData.isSelected()) {
            this.f7828d = marryAddressSelectData;
            return;
        }
        m8057l0();
        if (marryAddressSelectData.hasNextData()) {
            ((vzw) ((jq2) this).viewModel).m5256f().startActivityForResult(MarryAddressSelectAct.m513h2(Y(), marryAddressSelectData), IjkMediaPlayer.FFP_PROP_FLOAT_FIRST_VRENDER);
        } else {
            marryAddressSelectData.setSelected(true);
            this.f7828d = marryAddressSelectData;
        }
        ((vzw) ((jq2) this).viewModel).m8424p();
    }
}
