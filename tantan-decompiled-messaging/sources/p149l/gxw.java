package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class gxw extends iww<dxw> {

    /* JADX INFO: renamed from: c */
    public VText f104932c;

    /* JADX INFO: renamed from: d */
    public VFrame f104933d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f104934e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f104935f;

    /* JADX INFO: renamed from: g */
    public WheelPicker f104936g;

    /* JADX INFO: renamed from: h */
    public dxw f104937h;

    /* JADX INFO: renamed from: i */
    public List<String> f104938i;

    /* JADX INFO: renamed from: j */
    public boolean f104939j;

    /* JADX INFO: renamed from: k */
    public int f104940k;

    /* JADX INFO: renamed from: l.gxw$a */
    public static class C17198a {
        /* JADX INFO: renamed from: b */
        public static void m128668b(gxw gxwVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            gxwVar.f104932c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            gxwVar.f104933d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            gxwVar.f104934e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            gxwVar.f104935f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            gxwVar.f104936g = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m128669c(gxw gxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137313O, viewGroup, false);
            m128668b(gxwVar, viewInflate);
            return viewInflate;
        }
    }

    public gxw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f104938i = new ArrayList();
        this.f104939j = false;
        this.f104940k = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m128659A(WheelPicker wheelPicker) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("-");
        wheelPicker.setData(arrayList);
        wheelPicker.setSelectedItemPosition(0);
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo104516c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f104934e.getSelectItem().toString());
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: e */
    public void mo104517e(MarrySeriesType marrySeriesType, User user) {
        String string = this.f104934e.getSelectItem().toString();
        String string2 = this.f104935f.getSelectItem().toString();
        String string3 = this.f104936g.getSelectItem().toString();
        if (TextUtils.equals(string2, "-")) {
            string2 = "";
        }
        if (TextUtils.equals(string3, "-")) {
            string3 = "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (TextUtils.equals(act().getString(R$string.f27890m2), string) || TextUtils.equals(act().getString(R$string.f27884l2), string)) {
            arrayList.add(string);
            arrayList2.add("");
            arrayList3.add("");
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.house = arrayList;
            userWealth.houseRegion = arrayList2;
            userWealth.houseSubRegion = arrayList3;
            return;
        }
        if (TextUtils.equals(act().getString(R$string.f27796W0), string)) {
            arrayList.add(string);
            arrayList2.add(string2);
            arrayList3.add(string3);
            UserWealth userWealth2 = user.profile.extensions.wealth;
            userWealth2.house = arrayList;
            userWealth2.houseRegion = arrayList2;
            userWealth2.houseSubRegion = arrayList3;
        }
    }

    @Override // p149l.iww
    /* JADX INFO: renamed from: i */
    public void mo104518i(MarrySeriesType marrySeriesType, User user) {
        String str;
        int iIndexOf;
        this.f104932c.setText(marrySeriesType.getTitleName());
        this.f104932c.setTypeface(eqh0.m117752c(3), 1);
        if (NullChecker.m81303a(m2x.m152727i())) {
            Iterator<HometownChinaItem> it = m2x.m152727i().china.iterator();
            while (it.hasNext()) {
                this.f104938i.add(it.next().region);
            }
        }
        this.f104934e.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.exw
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f93698a.m128663w(wheelPicker, obj, i);
            }
        });
        this.f104935f.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.fxw
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f99816a.m128664x(wheelPicker, obj, i);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(act().getString(R$string.f27796W0));
        arrayList.add(act().getString(R$string.f27896n2));
        xdl0.m208345M0(this.f104933d, true);
        this.f104934e.setData(arrayList);
        List<String> list = user.profile.extensions.wealth.house;
        if (vwb.m200296J(list) || !TextUtils.equals(list.get(0), act().getString(R$string.f27796W0))) {
            if (vwb.m200296J(list) || !TextUtils.equals(list.get(0), act().getString(R$string.f27884l2))) {
                this.f104934e.setSelectedItemPosition(1);
                m128659A(this.f104935f);
                m128659A(this.f104936g);
                return;
            } else {
                this.f104934e.setSelectedItemPosition(2);
                m128659A(this.f104935f);
                m128659A(this.f104936g);
                return;
            }
        }
        this.f104934e.setSelectedItemPosition(0);
        boolean zM200296J = vwb.m200296J(this.f104938i);
        WheelPicker wheelPicker = this.f104935f;
        if (zM200296J) {
            m128659A(wheelPicker);
            m128659A(this.f104936g);
            return;
        }
        wheelPicker.setData(this.f104938i);
        List<String> list2 = user.profile.extensions.wealth.houseRegion;
        if (vwb.m200296J(list2) || TextUtils.isEmpty(list2.get(0))) {
            str = "";
            iIndexOf = 0;
        } else {
            str = list2.get(0);
            iIndexOf = this.f104938i.indexOf(str);
        }
        WheelPicker wheelPicker2 = this.f104935f;
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        wheelPicker2.setSelectedItemPosition(iIndexOf);
        List<String> listM128662v = m128662v(str);
        boolean zM200296J2 = vwb.m200296J(listM128662v);
        WheelPicker wheelPicker3 = this.f104936g;
        if (zM200296J2) {
            m128659A(wheelPicker3);
            return;
        }
        wheelPicker3.setData(listM128662v);
        List<String> list3 = user.profile.extensions.wealth.houseSubRegion;
        if (vwb.m200296J(list3) || TextUtils.isEmpty(list3.get(0))) {
            this.f104936g.setSelectedItemPosition(0);
        } else {
            int iIndexOf2 = this.f104938i.indexOf(listM128662v.get(0));
            this.f104936g.setSelectedItemPosition(iIndexOf2 != -1 ? iIndexOf2 : 0);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m128660s(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public View m128660s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C17198a.m128669c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dxw dxwVar) {
        this.f104937h = dxwVar;
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m128662v(String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.m81303a(m2x.m152727i())) {
            for (HometownChinaItem hometownChinaItem : m2x.m152727i().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !vwb.m200296J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m128663w(WheelPicker wheelPicker, Object obj, int i) {
        m128665y((String) obj);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m128664x(WheelPicker wheelPicker, Object obj, int i) {
        m128666z((String) obj);
    }

    /* JADX INFO: renamed from: y */
    public void m128665y(String str) {
        if (vwb.m200296J(this.f104938i) || !TextUtils.equals(str, act().getString(R$string.f27796W0))) {
            m128659A(this.f104935f);
            m128659A(this.f104936g);
            return;
        }
        this.f104935f.setData(this.f104938i);
        this.f104935f.setSelectedItemPosition(0);
        List<String> listM128662v = m128662v(this.f104938i.get(0));
        boolean zM200296J = vwb.m200296J(listM128662v);
        WheelPicker wheelPicker = this.f104936g;
        if (zM200296J) {
            m128659A(wheelPicker);
        } else {
            wheelPicker.setData(listM128662v);
            this.f104936g.setSelectedItemPosition(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m128666z(String str) {
        List<String> listM128662v = m128662v(str);
        boolean zM200296J = vwb.m200296J(listM128662v);
        WheelPicker wheelPicker = this.f104936g;
        if (zM200296J) {
            m128659A(wheelPicker);
        } else {
            wheelPicker.setData(listM128662v);
            this.f104936g.setSelectedItemPosition(0);
        }
    }
}
