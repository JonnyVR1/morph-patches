package p003l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.profile.views.WheelPicker;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.n6c0;
import l.vwb;
import l.xdl0;
import p028v.VFrame;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gxw extends iww<dxw> {

    /* JADX INFO: renamed from: c */
    public VText f4080c;

    /* JADX INFO: renamed from: d */
    public VFrame f4081d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f4082e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f4083f;

    /* JADX INFO: renamed from: g */
    public WheelPicker f4084g;

    /* JADX INFO: renamed from: h */
    public dxw f4085h;

    /* JADX INFO: renamed from: i */
    public List<String> f4086i;

    /* JADX INFO: renamed from: j */
    public boolean f4087j;

    /* JADX INFO: renamed from: k */
    public int f4088k;

    /* JADX INFO: renamed from: l.gxw$a */
    public static class C0330a {
        /* JADX INFO: renamed from: b */
        public static void m4895b(gxw gxwVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            gxwVar.f4080c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            gxwVar.f4081d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            gxwVar.f4082e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            gxwVar.f4083f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            gxwVar.f4084g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m4896c(gxw gxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.O, viewGroup, false);
            m4895b(gxwVar, viewInflate);
            return viewInflate;
        }
    }

    public gxw(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f4086i = new ArrayList();
        this.f4087j = false;
        this.f4088k = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m4885A(WheelPicker wheelPicker) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("-");
        wheelPicker.setData(arrayList);
        wheelPicker.setSelectedItemPosition(0);
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: c */
    public boolean mo3208c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f4082e.getSelectItem().toString());
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: e */
    public void mo3209e(MarrySeriesType marrySeriesType, User user) {
        String string = this.f4082e.getSelectItem().toString();
        String string2 = this.f4083f.getSelectItem().toString();
        String string3 = this.f4084g.getSelectItem().toString();
        if (TextUtils.equals(string2, "-")) {
            string2 = "";
        }
        if (TextUtils.equals(string3, "-")) {
            string3 = "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (TextUtils.equals(act().getString(R.string.m2), string) || TextUtils.equals(act().getString(R.string.l2), string)) {
            arrayList.add(string);
            arrayList2.add("");
            arrayList3.add("");
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.house = arrayList;
            userWealth.houseRegion = arrayList2;
            userWealth.houseSubRegion = arrayList3;
            return;
        }
        if (TextUtils.equals(act().getString(R.string.W0), string)) {
            arrayList.add(string);
            arrayList2.add(string2);
            arrayList3.add(string3);
            UserWealth userWealth2 = user.profile.extensions.wealth;
            userWealth2.house = arrayList;
            userWealth2.houseRegion = arrayList2;
            userWealth2.houseSubRegion = arrayList3;
        }
    }

    @Override // p003l.iww
    /* JADX INFO: renamed from: i */
    public void mo3210i(MarrySeriesType marrySeriesType, User user) {
        String str;
        int iIndexOf;
        this.f4080c.setText(marrySeriesType.getTitleName());
        this.f4080c.setTypeface(eqh0.m3924c(3), 1);
        if (NullChecker.a(m2x.m6202i())) {
            Iterator it = m2x.m6202i().china.iterator();
            while (it.hasNext()) {
                this.f4086i.add(((HometownChinaItem) it.next()).region);
            }
        }
        this.f4082e.setOnItemSelectedListener(new WheelPicker.a() { // from class: l.exw
            /* JADX INFO: renamed from: a */
            public final void m3951a(WheelPicker wheelPicker, Object obj, int i) {
                this.f3417a.m4890w(wheelPicker, obj, i);
            }
        });
        this.f4083f.setOnItemSelectedListener(new WheelPicker.a() { // from class: l.fxw
            /* JADX INFO: renamed from: a */
            public final void m4478a(WheelPicker wheelPicker, Object obj, int i) {
                this.f3763a.m4891x(wheelPicker, obj, i);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(act().getString(R.string.W0));
        arrayList.add(act().getString(R.string.n2));
        xdl0.M0(this.f4081d, true);
        this.f4082e.setData(arrayList);
        List list = user.profile.extensions.wealth.house;
        if (vwb.J(list) || !TextUtils.equals((CharSequence) list.get(0), act().getString(R.string.W0))) {
            if (vwb.J(list) || !TextUtils.equals((CharSequence) list.get(0), act().getString(R.string.l2))) {
                this.f4082e.setSelectedItemPosition(1);
                m4885A(this.f4083f);
                m4885A(this.f4084g);
                return;
            } else {
                this.f4082e.setSelectedItemPosition(2);
                m4885A(this.f4083f);
                m4885A(this.f4084g);
                return;
            }
        }
        this.f4082e.setSelectedItemPosition(0);
        boolean zJ = vwb.J(this.f4086i);
        WheelPicker wheelPicker = this.f4083f;
        if (zJ) {
            m4885A(wheelPicker);
            m4885A(this.f4084g);
            return;
        }
        wheelPicker.setData(this.f4086i);
        List list2 = user.profile.extensions.wealth.houseRegion;
        if (vwb.J(list2) || TextUtils.isEmpty((CharSequence) list2.get(0))) {
            str = "";
            iIndexOf = 0;
        } else {
            str = (String) list2.get(0);
            iIndexOf = this.f4086i.indexOf(str);
        }
        WheelPicker wheelPicker2 = this.f4083f;
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        wheelPicker2.setSelectedItemPosition(iIndexOf);
        List<String> listM4889v = m4889v(str);
        boolean zJ2 = vwb.J(listM4889v);
        WheelPicker wheelPicker3 = this.f4084g;
        if (zJ2) {
            m4885A(wheelPicker3);
            return;
        }
        wheelPicker3.setData(listM4889v);
        List list3 = user.profile.extensions.wealth.houseSubRegion;
        if (vwb.J(list3) || TextUtils.isEmpty((CharSequence) list3.get(0))) {
            this.f4084g.setSelectedItemPosition(0);
        } else {
            int iIndexOf2 = this.f4086i.indexOf(listM4889v.get(0));
            this.f4084g.setSelectedItemPosition(iIndexOf2 != -1 ? iIndexOf2 : 0);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4887s(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public View m4887s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0330a.m4896c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m4886i1(dxw dxwVar) {
        this.f4085h = dxwVar;
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m4889v(String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.a(m2x.m6202i())) {
            for (HometownChinaItem hometownChinaItem : m2x.m6202i().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !vwb.J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m4890w(WheelPicker wheelPicker, Object obj, int i) {
        m4892y((String) obj);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m4891x(WheelPicker wheelPicker, Object obj, int i) {
        m4893z((String) obj);
    }

    /* JADX INFO: renamed from: y */
    public void m4892y(String str) {
        if (vwb.J(this.f4086i) || !TextUtils.equals(str, act().getString(R.string.W0))) {
            m4885A(this.f4083f);
            m4885A(this.f4084g);
            return;
        }
        this.f4083f.setData(this.f4086i);
        this.f4083f.setSelectedItemPosition(0);
        List<String> listM4889v = m4889v(this.f4086i.get(0));
        boolean zJ = vwb.J(listM4889v);
        WheelPicker wheelPicker = this.f4084g;
        if (zJ) {
            m4885A(wheelPicker);
        } else {
            wheelPicker.setData(listM4889v);
            this.f4084g.setSelectedItemPosition(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m4893z(String str) {
        List<String> listM4889v = m4889v(str);
        boolean zJ = vwb.J(listM4889v);
        WheelPicker wheelPicker = this.f4084g;
        if (zJ) {
            m4885A(wheelPicker);
        } else {
            wheelPicker.setData(listM4889v);
            this.f4084g.setSelectedItemPosition(0);
        }
    }
}
