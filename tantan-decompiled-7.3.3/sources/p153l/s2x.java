package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.address.MarryAddressSelectAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarryAddressSelectData;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s2x extends gzw<u2x> {

    /* JADX INFO: renamed from: a */
    public List<MarryAddressSelectData> f165937a;

    /* JADX INFO: renamed from: b */
    public MarrySeriesType f165938b;

    /* JADX INFO: renamed from: c */
    public User f165939c;

    /* JADX INFO: renamed from: d */
    public MarryAddressSelectData f165940d;

    /* JADX INFO: renamed from: e */
    public int f165941e;

    public s2x(ner nerVar) {
        super(nerVar);
        this.f165937a = new ArrayList();
        this.f165940d = null;
        this.f165941e = -1;
    }

    /* JADX INFO: renamed from: o0 */
    private void m184145o0() {
        List<MarryAddressSelectData> listM153008e = l5x.m153008e(this.f165938b, this.f165939c);
        this.f165937a = listM153008e;
        for (MarryAddressSelectData marryAddressSelectData : listM153008e) {
            if (marryAddressSelectData.isSelected()) {
                this.f165940d = marryAddressSelectData;
                break;
            }
        }
        ((u2x) this.viewModel).m194312q(this.f165937a, false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(CoreModule.m30933P().m143405a().mo34620we().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.r2x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160990a.m184150p0((HometownSuggest) obj);
            }
        }));
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        this.f165938b = marrySeriesType;
        this.f165939c = user;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m184146k0() {
        return NullChecker.m82486a(this.f165940d);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m184147l0() {
        Iterator<MarryAddressSelectData> it = this.f165937a.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public MarryAddressSelectData m184148m0() {
        return this.f165940d;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m184149n0(String str, String str2, String str3) {
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
        return du4.m118067a("・", arrayList);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m184150p0(HometownSuggest hometownSuggest) {
        m184145o0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m184151q0(int i, int i2, Intent intent) {
        MarryAddressSelectData marryAddressSelectData;
        String showText;
        String showText2;
        if (i == 10011 && i2 == -1 && NullChecker.m82486a(intent)) {
            int intExtra = intent.getIntExtra("address_back_first", -1);
            int intExtra2 = intent.getIntExtra("address_back_second", -1);
            int i3 = this.f165941e;
            if (i3 < 0 || intExtra < 0) {
                return;
            }
            MarryAddressSelectData marryAddressSelectData2 = this.f165937a.get(i3);
            m184147l0();
            Iterator<MarryAddressSelectData> it = this.f165937a.iterator();
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
                this.f165937a.add(0, marryAddressSelectData);
            } else {
                marryAddressSelectData.setSelected(true);
            }
            if (marryAddressSelectData2.isOverseasData()) {
                String showText3 = marryAddressSelectData2.getNextList().get(intExtra).getShowText();
                showText = (intExtra2 < 0 || jyb.m147479J(marryAddressSelectData2.getNextList().get(intExtra).getNextList())) ? "" : marryAddressSelectData2.getNextList().get(intExtra).getNextList().get(intExtra2).getShowText();
                marryAddressSelectData.setData(showText3, showText, "");
                showText2 = "";
                str = showText3;
            } else {
                showText = marryAddressSelectData2.getShowText();
                showText2 = marryAddressSelectData2.getNextList().get(intExtra).getShowText();
                marryAddressSelectData.setData("", showText, showText2);
            }
            marryAddressSelectData.setShowText(m184149n0(str, showText, showText2));
            this.f165940d = marryAddressSelectData;
            ((u2x) this.viewModel).m194312q(this.f165937a, true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m184152r0(int i) {
        MarryAddressSelectData marryAddressSelectData = this.f165937a.get(i);
        this.f165941e = i;
        if (marryAddressSelectData.isSelected()) {
            this.f165940d = marryAddressSelectData;
            return;
        }
        m184147l0();
        if (marryAddressSelectData.hasNextData()) {
            ((u2x) this.viewModel).m137940f().startActivityForResult(MarryAddressSelectAct.m48649i2(m99640Y(), marryAddressSelectData), 10011);
        } else {
            marryAddressSelectData.setSelected(true);
            this.f165940d = marryAddressSelectData;
        }
        ((u2x) this.viewModel).m194311p();
    }
}
