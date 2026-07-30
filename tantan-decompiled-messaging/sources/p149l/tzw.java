package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.HometownSuggest;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.address.MarryAddressSelectAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tzw extends hww<vzw> {

    /* JADX INFO: renamed from: a */
    public List<MarryAddressSelectData> f172760a;

    /* JADX INFO: renamed from: b */
    public MarrySeriesType f172761b;

    /* JADX INFO: renamed from: c */
    public User f172762c;

    /* JADX INFO: renamed from: d */
    public MarryAddressSelectData f172763d;

    /* JADX INFO: renamed from: e */
    public int f172764e;

    public tzw(mcr mcrVar) {
        super(mcrVar);
        this.f172760a = new ArrayList();
        this.f172763d = null;
        this.f172764e = -1;
    }

    /* JADX INFO: renamed from: o0 */
    private void m191218o0() {
        List<MarryAddressSelectData> listM152723e = m2x.m152723e(this.f172761b, this.f172762c);
        this.f172760a = listM152723e;
        for (MarryAddressSelectData marryAddressSelectData : listM152723e) {
            if (marryAddressSelectData.isSelected()) {
                this.f172763d = marryAddressSelectData;
                break;
            }
        }
        ((vzw) this.viewModel).m200795q(this.f172760a, false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(CoreModule.m29935P().m94651a().mo33617we().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.szw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167084a.m191223p0((HometownSuggest) obj);
            }
        }));
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        this.f172761b = marrySeriesType;
        this.f172762c = user;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m191219k0() {
        return NullChecker.m81303a(this.f172763d);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m191220l0() {
        Iterator<MarryAddressSelectData> it = this.f172760a.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public MarryAddressSelectData m191221m0() {
        return this.f172763d;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m191222n0(String str, String str2, String str3) {
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
        return et4.m117971a("・", arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m191223p0(HometownSuggest hometownSuggest) {
        m191218o0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m191224q0(int i, int i2, Intent intent) {
        MarryAddressSelectData marryAddressSelectData;
        String showText;
        String showText2;
        if (i == 10011 && i2 == -1 && NullChecker.m81303a(intent)) {
            int intExtra = intent.getIntExtra("address_back_first", -1);
            int intExtra2 = intent.getIntExtra("address_back_second", -1);
            int i3 = this.f172764e;
            if (i3 < 0 || intExtra < 0) {
                return;
            }
            MarryAddressSelectData marryAddressSelectData2 = this.f172760a.get(i3);
            m191220l0();
            Iterator<MarryAddressSelectData> it = this.f172760a.iterator();
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
                this.f172760a.add(0, marryAddressSelectData);
            } else {
                marryAddressSelectData.setSelected(true);
            }
            if (marryAddressSelectData2.isOverseasData()) {
                String showText3 = marryAddressSelectData2.getNextList().get(intExtra).getShowText();
                showText = (intExtra2 < 0 || vwb.m200296J(marryAddressSelectData2.getNextList().get(intExtra).getNextList())) ? "" : marryAddressSelectData2.getNextList().get(intExtra).getNextList().get(intExtra2).getShowText();
                marryAddressSelectData.setData(showText3, showText, "");
                showText2 = "";
                str = showText3;
            } else {
                showText = marryAddressSelectData2.getShowText();
                showText2 = marryAddressSelectData2.getNextList().get(intExtra).getShowText();
                marryAddressSelectData.setData("", showText, showText2);
            }
            marryAddressSelectData.setShowText(m191222n0(str, showText, showText2));
            this.f172763d = marryAddressSelectData;
            ((vzw) this.viewModel).m200795q(this.f172760a, true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m191225r0(int i) {
        MarryAddressSelectData marryAddressSelectData = this.f172760a.get(i);
        this.f172764e = i;
        if (marryAddressSelectData.isSelected()) {
            this.f172763d = marryAddressSelectData;
            return;
        }
        m191220l0();
        if (marryAddressSelectData.hasNextData()) {
            ((vzw) this.viewModel).m138777f().startActivityForResult(MarryAddressSelectAct.m47466h2(m142773Y(), marryAddressSelectData), 10011);
        } else {
            marryAddressSelectData.setSelected(true);
            this.f172763d = marryAddressSelectData;
        }
        ((vzw) this.viewModel).m200794p();
    }
}
