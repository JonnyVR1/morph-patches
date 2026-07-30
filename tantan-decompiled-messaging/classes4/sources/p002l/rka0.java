package p002l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.house.ProfileLoopSelectHouseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.lqa;
import l.n6c0;
import l.pj90;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rka0 implements s7m<oka0> {

    /* JADX INFO: renamed from: a */
    public TextView f18572a;

    /* JADX INFO: renamed from: b */
    public TextView f18573b;

    /* JADX INFO: renamed from: c */
    public VFrame f18574c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f18575d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f18576e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f18577f;

    /* JADX INFO: renamed from: g */
    public VText f18578g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopEditUploadPhoto f18579h;

    /* JADX INFO: renamed from: i */
    public ProfileLoopActionLayout f18580i;

    /* JADX INFO: renamed from: j */
    public final Context f18581j;

    /* JADX INFO: renamed from: k */
    public final ProfileLoopSelectHouseFrag f18582k;

    /* JADX INFO: renamed from: l */
    public oka0 f18583l;

    /* JADX INFO: renamed from: m */
    public List<String> f18584m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f18585n = false;

    /* JADX INFO: renamed from: o */
    public int f18586o = -1;

    /* JADX INFO: renamed from: l.rka0$a */
    public static class C0798a {
        /* JADX INFO: renamed from: b */
        public static void m22072b(rka0 rka0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            rka0Var.f18572a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            rka0Var.f18573b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            rka0Var.f18574c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            rka0Var.f18575d = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            rka0Var.f18576e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            rka0Var.f18577f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2);
            rka0Var.f18578g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            rka0Var.f18579h = (ProfileLoopEditUploadPhoto) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
            rka0Var.f18580i = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m22073c(rka0 rka0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.x0, viewGroup, false);
            m22072b(rka0Var, viewInflate);
            return viewInflate;
        }
    }

    public rka0(Context context, ProfileLoopSelectHouseFrag profileLoopSelectHouseFrag) {
        this.f18581j = context;
        this.f18582k = profileLoopSelectHouseFrag;
    }

    /* JADX INFO: renamed from: C */
    private void m22043C(WheelPicker wheelPicker) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExpProfileLoopWheelTypeData.NONE_STR);
        wheelPicker.setData(arrayList);
        wheelPicker.setSelectedItemPosition(0);
    }

    /* JADX INFO: renamed from: v */
    private List<String> m22055v(String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.a(LoopFragmentFactory.m1982u())) {
            for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m1982u().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !vwb.J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m22056w(WheelPicker wheelPicker, Object obj, int i) {
        m22069y((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m22057x(WheelPicker wheelPicker, Object obj, int i) {
        m22070z((String) obj);
    }

    /* JADX INFO: renamed from: A */
    public void m22058A(List<Media> list, int i) {
        this.f18579h.m3580a0(list);
    }

    /* JADX INFO: renamed from: A3 */
    public void m22059A3(String str) {
        if (NullChecker.a(str)) {
            this.f18572a.setText(str);
            this.f18572a.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (NullChecker.a(LoopFragmentFactory.m1982u())) {
            Iterator it = LoopFragmentFactory.m1982u().china.iterator();
            while (it.hasNext()) {
                this.f18584m.add(((HometownChinaItem) it.next()).region);
            }
        }
        if (lqa.w()) {
            xdl0.M(this.f18578g, false);
        }
        this.f18575d.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.pka0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker, Object obj, int i) {
                this.f17457a.m22056w(wheelPicker, obj, i);
            }
        });
        this.f18576e.setOnItemSelectedListener(new WheelPicker.InterfaceC0174a() { // from class: l.qka0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.WheelPicker.InterfaceC0174a
            /* JADX INFO: renamed from: a */
            public final void mo3621a(WheelPicker wheelPicker, Object obj, int i) {
                this.f18075a.m22057x(wheelPicker, obj, i);
            }
        });
        this.f18580i.m3527l(this.f18582k);
        m22068u().m1991a2().m2030W0(this.f18582k);
    }

    /* JADX INFO: renamed from: B */
    public void m22060B(LoopInputType loopInputType) {
        String str;
        int iIndexOf;
        if (lqa.f() && this.f18582k.m2081U4()) {
            String strM = pj90.m(this.f18582k.f1277z);
            if (!TextUtils.isEmpty(strM)) {
                xdl0.M(this.f18573b, true);
                xdl0.X(this.f18573b, t100.d(12.0f));
                xdl0.X(this.f18574c, t100.d(27.0f));
                this.f18573b.setTextSize(15.0f);
                this.f18573b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f18573b.setText(String.format("预计符合%s人的理想型", strM));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(act().getString(R.string.W0));
        arrayList.add(act().getString(R.string.n2));
        xdl0.M0(this.f18574c, true);
        this.f18575d.setData(arrayList);
        List<String> list = m22068u().m1991a2().m2043u0().profile.extensions.wealth.house;
        if (!vwb.J(list) && TextUtils.equals(list.get(0), act().getString(R.string.W0))) {
            this.f18575d.setSelectedItemPosition(0);
            boolean zJ = vwb.J(this.f18584m);
            WheelPicker wheelPicker = this.f18576e;
            if (zJ) {
                m22043C(wheelPicker);
                m22043C(this.f18577f);
            } else {
                wheelPicker.setData(this.f18584m);
                List list2 = m22068u().m1991a2().m2043u0().profile.extensions.wealth.houseRegion;
                if (vwb.J(list2) || TextUtils.isEmpty((CharSequence) list2.get(0))) {
                    str = "";
                    iIndexOf = 0;
                } else {
                    str = (String) list2.get(0);
                    iIndexOf = this.f18584m.indexOf(str);
                }
                WheelPicker wheelPicker2 = this.f18576e;
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                wheelPicker2.setSelectedItemPosition(iIndexOf);
                List<String> listM22055v = m22055v(str);
                boolean zJ2 = vwb.J(listM22055v);
                WheelPicker wheelPicker3 = this.f18577f;
                if (zJ2) {
                    m22043C(wheelPicker3);
                } else {
                    wheelPicker3.setData(listM22055v);
                    List list3 = m22068u().m1991a2().m2043u0().profile.extensions.wealth.houseSubRegion;
                    if (vwb.J(list3) || TextUtils.isEmpty((CharSequence) list3.get(0))) {
                        this.f18577f.setSelectedItemPosition(0);
                    } else {
                        int iIndexOf2 = this.f18584m.indexOf(listM22055v.get(0));
                        this.f18577f.setSelectedItemPosition(iIndexOf2 != -1 ? iIndexOf2 : 0);
                    }
                }
            }
        } else if (vwb.J(list) || !TextUtils.equals(list.get(0), act().getString(R.string.l2))) {
            this.f18575d.setSelectedItemPosition(1);
            m22043C(this.f18576e);
            m22043C(this.f18577f);
        } else {
            this.f18578g.setText(this.f18581j.getString(R.string.r2));
            this.f18575d.setSelectedItemPosition(2);
            m22043C(this.f18576e);
            m22043C(this.f18577f);
        }
        m22062E(loopInputType, list);
        this.f18582k.m2093f5();
    }

    /* JADX INFO: renamed from: C0 */
    public Context m22061C0() {
        return this.f18581j;
    }

    /* JADX INFO: renamed from: E */
    public final void m22062E(LoopInputType loopInputType, List<String> list) {
        boolean z = false;
        if (!vwb.J(list) && TextUtils.equals(list.get(0), act().getString(R.string.W0))) {
            z = true;
        }
        this.f18579h.setVisible(z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22064n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m22064n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0798a.m22073c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m22063i1(oka0 oka0Var) {
        this.f18583l = oka0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m22066q(User user) {
        String string = this.f18575d.getSelectItem().toString();
        String string2 = this.f18576e.getSelectItem().toString();
        String string3 = this.f18577f.getSelectItem().toString();
        if (TextUtils.equals(string2, ExpProfileLoopWheelTypeData.NONE_STR)) {
            string2 = "";
        }
        if (TextUtils.equals(string3, ExpProfileLoopWheelTypeData.NONE_STR)) {
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
        } else if (TextUtils.equals(act().getString(R.string.W0), string)) {
            arrayList.add(string);
            arrayList2.add(string2);
            arrayList3.add(string3);
            UserWealth userWealth2 = user.profile.extensions.wealth;
            userWealth2.house = arrayList;
            userWealth2.houseRegion = arrayList2;
            userWealth2.houseSubRegion = arrayList3;
        }
        this.f18579h.m3576W(user);
    }

    /* JADX INFO: renamed from: s */
    public Bundle m22067s() {
        return this.f18582k.getArguments();
    }

    /* JADX INFO: renamed from: u */
    public ProfileInfoLoopEditAct m22068u() {
        return (ProfileInfoLoopEditAct) this.f18581j;
    }

    /* JADX INFO: renamed from: y */
    public void m22069y(String str) {
        boolean z = !vwb.J(this.f18584m) && TextUtils.equals(str, act().getString(R.string.W0));
        WheelPicker wheelPicker = this.f18576e;
        if (z) {
            wheelPicker.setData(this.f18584m);
            this.f18576e.setSelectedItemPosition(0);
            List<String> listM22055v = m22055v(this.f18584m.get(0));
            boolean zJ = vwb.J(listM22055v);
            WheelPicker wheelPicker2 = this.f18577f;
            if (zJ) {
                m22043C(wheelPicker2);
            } else {
                wheelPicker2.setData(listM22055v);
                this.f18577f.setSelectedItemPosition(0);
            }
        } else {
            m22043C(wheelPicker);
            m22043C(this.f18577f);
        }
        this.f18579h.setVisible(z);
    }

    /* JADX INFO: renamed from: z */
    public void m22070z(String str) {
        List<String> listM22055v = m22055v(str);
        boolean zJ = vwb.J(listM22055v);
        WheelPicker wheelPicker = this.f18577f;
        if (zJ) {
            m22043C(wheelPicker);
        } else {
            wheelPicker.setData(listM22055v);
            this.f18577f.setSelectedItemPosition(0);
        }
    }

    public void destroy() {
    }
}
