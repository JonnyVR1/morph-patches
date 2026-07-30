package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class f0x extends hzw<c0x> {

    /* JADX INFO: renamed from: c */
    public VText f96723c;

    /* JADX INFO: renamed from: d */
    public VFrame f96724d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f96725e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f96726f;

    /* JADX INFO: renamed from: g */
    public WheelPicker f96727g;

    /* JADX INFO: renamed from: h */
    public c0x f96728h;

    /* JADX INFO: renamed from: i */
    public List<String> f96729i;

    /* JADX INFO: renamed from: j */
    public boolean f96730j;

    /* JADX INFO: renamed from: k */
    public int f96731k;

    /* JADX INFO: renamed from: l.f0x$a */
    public static class C16874a {
        /* JADX INFO: renamed from: b */
        public static void m123533b(f0x f0xVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            f0xVar.f96723c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            f0xVar.f96724d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            f0xVar.f96725e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            f0xVar.f96726f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            f0xVar.f96727g = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m123534c(f0x f0xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167527O, viewGroup, false);
            m123533b(f0xVar, viewInflate);
            return viewInflate;
        }
    }

    public f0x(Act act, MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag) {
        super(act, marryEditProfileBaseMvpFrag);
        this.f96729i = new ArrayList();
        this.f96730j = false;
        this.f96731k = -1;
    }

    /* JADX INFO: renamed from: A */
    public final void m123524A(WheelPicker wheelPicker) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("-");
        wheelPicker.setData(arrayList);
        wheelPicker.setSelectedItemPosition(0);
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: c */
    public boolean mo95576c(MarrySeriesType marrySeriesType) {
        return !TextUtils.isEmpty(this.f96725e.getSelectItem().toString());
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: e */
    public void mo95577e(MarrySeriesType marrySeriesType, User user) {
        String string = this.f96725e.getSelectItem().toString();
        String string2 = this.f96726f.getSelectItem().toString();
        String string3 = this.f96727g.getSelectItem().toString();
        if (TextUtils.equals(string2, "-")) {
            string2 = "";
        }
        if (TextUtils.equals(string3, "-")) {
            string3 = "";
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (TextUtils.equals(act().getString(R$string.f28738m2), string) || TextUtils.equals(act().getString(R$string.f28732l2), string)) {
            arrayList.add(string);
            arrayList2.add("");
            arrayList3.add("");
            UserWealth userWealth = user.profile.extensions.wealth;
            userWealth.house = arrayList;
            userWealth.houseRegion = arrayList2;
            userWealth.houseSubRegion = arrayList3;
            return;
        }
        if (TextUtils.equals(act().getString(R$string.f28644W0), string)) {
            arrayList.add(string);
            arrayList2.add(string2);
            arrayList3.add(string3);
            UserWealth userWealth2 = user.profile.extensions.wealth;
            userWealth2.house = arrayList;
            userWealth2.houseRegion = arrayList2;
            userWealth2.houseSubRegion = arrayList3;
        }
    }

    @Override // p153l.hzw
    /* JADX INFO: renamed from: i */
    public void mo95578i(MarrySeriesType marrySeriesType, User user) {
        String str;
        int iIndexOf;
        this.f96723c.setText(marrySeriesType.getTitleName());
        this.f96723c.setTypeface(lyh0.m156283c(3), 1);
        if (NullChecker.m82486a(l5x.m153012i())) {
            Iterator<HometownChinaItem> it = l5x.m153012i().china.iterator();
            while (it.hasNext()) {
                this.f96729i.add(it.next().region);
            }
        }
        this.f96725e.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.d0x
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f84626a.m123528w(wheelPicker, obj, i);
            }
        });
        this.f96726f.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.e0x
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f91554a.m123529x(wheelPicker, obj, i);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(act().getString(R$string.f28644W0));
        arrayList.add(act().getString(R$string.f28744n2));
        bnl0.m105525M0(this.f96724d, true);
        this.f96725e.setData(arrayList);
        List<String> list = user.profile.extensions.wealth.house;
        if (jyb.m147479J(list) || !TextUtils.equals(list.get(0), act().getString(R$string.f28644W0))) {
            if (jyb.m147479J(list) || !TextUtils.equals(list.get(0), act().getString(R$string.f28732l2))) {
                this.f96725e.setSelectedItemPosition(1);
                m123524A(this.f96726f);
                m123524A(this.f96727g);
                return;
            } else {
                this.f96725e.setSelectedItemPosition(2);
                m123524A(this.f96726f);
                m123524A(this.f96727g);
                return;
            }
        }
        this.f96725e.setSelectedItemPosition(0);
        boolean zM147479J = jyb.m147479J(this.f96729i);
        WheelPicker wheelPicker = this.f96726f;
        if (zM147479J) {
            m123524A(wheelPicker);
            m123524A(this.f96727g);
            return;
        }
        wheelPicker.setData(this.f96729i);
        List<String> list2 = user.profile.extensions.wealth.houseRegion;
        if (jyb.m147479J(list2) || TextUtils.isEmpty(list2.get(0))) {
            str = "";
            iIndexOf = 0;
        } else {
            str = list2.get(0);
            iIndexOf = this.f96729i.indexOf(str);
        }
        WheelPicker wheelPicker2 = this.f96726f;
        if (iIndexOf == -1) {
            iIndexOf = 0;
        }
        wheelPicker2.setSelectedItemPosition(iIndexOf);
        List<String> listM123527v = m123527v(str);
        boolean zM147479J2 = jyb.m147479J(listM123527v);
        WheelPicker wheelPicker3 = this.f96727g;
        if (zM147479J2) {
            m123524A(wheelPicker3);
            return;
        }
        wheelPicker3.setData(listM123527v);
        List<String> list3 = user.profile.extensions.wealth.houseSubRegion;
        if (jyb.m147479J(list3) || TextUtils.isEmpty(list3.get(0))) {
            this.f96727g.setSelectedItemPosition(0);
        } else {
            int iIndexOf2 = this.f96729i.indexOf(listM123527v.get(0));
            this.f96727g.setSelectedItemPosition(iIndexOf2 != -1 ? iIndexOf2 : 0);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m123525s(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public View m123525s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16874a.m123534c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(c0x c0xVar) {
        this.f96728h = c0xVar;
    }

    /* JADX INFO: renamed from: v */
    public final List<String> m123527v(String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.m82486a(l5x.m153012i())) {
            for (HometownChinaItem hometownChinaItem : l5x.m153012i().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !jyb.m147479J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m123528w(WheelPicker wheelPicker, Object obj, int i) {
        m123530y((String) obj);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m123529x(WheelPicker wheelPicker, Object obj, int i) {
        m123531z((String) obj);
    }

    /* JADX INFO: renamed from: y */
    public void m123530y(String str) {
        if (jyb.m147479J(this.f96729i) || !TextUtils.equals(str, act().getString(R$string.f28644W0))) {
            m123524A(this.f96726f);
            m123524A(this.f96727g);
            return;
        }
        this.f96726f.setData(this.f96729i);
        this.f96726f.setSelectedItemPosition(0);
        List<String> listM123527v = m123527v(this.f96729i.get(0));
        boolean zM147479J = jyb.m147479J(listM123527v);
        WheelPicker wheelPicker = this.f96727g;
        if (zM147479J) {
            m123524A(wheelPicker);
        } else {
            wheelPicker.setData(listM123527v);
            this.f96727g.setSelectedItemPosition(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m123531z(String str) {
        List<String> listM123527v = m123527v(str);
        boolean zM147479J = jyb.m147479J(listM123527v);
        WheelPicker wheelPicker = this.f96727g;
        if (zM147479J) {
            m123524A(wheelPicker);
        } else {
            wheelPicker.setData(listM123527v);
            this.f96727g.setSelectedItemPosition(0);
        }
    }
}
