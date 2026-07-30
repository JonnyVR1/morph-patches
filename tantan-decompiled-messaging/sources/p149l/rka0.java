package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.house.ProfileLoopSelectHouseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rka0 implements s7m<oka0> {

    /* JADX INFO: renamed from: a */
    public TextView f159786a;

    /* JADX INFO: renamed from: b */
    public TextView f159787b;

    /* JADX INFO: renamed from: c */
    public VFrame f159788c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f159789d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f159790e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f159791f;

    /* JADX INFO: renamed from: g */
    public VText f159792g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopEditUploadPhoto f159793h;

    /* JADX INFO: renamed from: i */
    public ProfileLoopActionLayout f159794i;

    /* JADX INFO: renamed from: j */
    public final Context f159795j;

    /* JADX INFO: renamed from: k */
    public final ProfileLoopSelectHouseFrag f159796k;

    /* JADX INFO: renamed from: l */
    public oka0 f159797l;

    /* JADX INFO: renamed from: m */
    public List<String> f159798m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f159799n = false;

    /* JADX INFO: renamed from: o */
    public int f159800o = -1;

    /* JADX INFO: renamed from: l.rka0$a */
    public static class C19720a {
        /* JADX INFO: renamed from: b */
        public static void m179704b(rka0 rka0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            rka0Var.f159786a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            rka0Var.f159787b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            rka0Var.f159788c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            rka0Var.f159789d = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            rka0Var.f159790e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            rka0Var.f159791f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2);
            rka0Var.f159792g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            rka0Var.f159793h = (ProfileLoopEditUploadPhoto) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
            rka0Var.f159794i = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m179705c(rka0 rka0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137387x0, viewGroup, false);
            m179704b(rka0Var, viewInflate);
            return viewInflate;
        }
    }

    public rka0(Context context, ProfileLoopSelectHouseFrag profileLoopSelectHouseFrag) {
        this.f159795j = context;
        this.f159796k = profileLoopSelectHouseFrag;
    }

    /* JADX INFO: renamed from: C */
    private void m179677C(WheelPicker wheelPicker) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("-");
        wheelPicker.setData(arrayList);
        wheelPicker.setSelectedItemPosition(0);
    }

    /* JADX INFO: renamed from: v */
    private List<String> m179689v(String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.m81303a(LoopFragmentFactory.m51500u())) {
            for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m51500u().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !vwb.m200296J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m179690w(WheelPicker wheelPicker, Object obj, int i) {
        m179701y((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m179691x(WheelPicker wheelPicker, Object obj, int i) {
        m179702z((String) obj);
    }

    /* JADX INFO: renamed from: A */
    public void m179692A(List<Media> list, int i) {
        this.f159793h.m53022a0(list);
    }

    /* JADX INFO: renamed from: A3 */
    public void m179693A3(String str) {
        if (NullChecker.m81303a(str)) {
            this.f159786a.setText(str);
            this.f159786a.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (NullChecker.m81303a(LoopFragmentFactory.m51500u())) {
            Iterator<HometownChinaItem> it = LoopFragmentFactory.m51500u().china.iterator();
            while (it.hasNext()) {
                this.f159798m.add(it.next().region);
            }
        }
        if (lqa.m150985w()) {
            xdl0.m208344M(this.f159792g, false);
        }
        this.f159789d.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.pka0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f149959a.m179690w(wheelPicker, obj, i);
            }
        });
        this.f159790e.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.qka0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f155091a.m179691x(wheelPicker, obj, i);
            }
        });
        this.f159794i.m52969l(this.f159796k);
        m179700u().m51509a2().m51548W0(this.f159796k);
    }

    /* JADX INFO: renamed from: B */
    public void m179694B(LoopInputType loopInputType) {
        String str;
        int iIndexOf;
        if (lqa.m150968f() && this.f159796k.m51595U4()) {
            String strM169801m = pj90.m169801m(this.f159796k.f33455z);
            if (!TextUtils.isEmpty(strM169801m)) {
                xdl0.m208344M(this.f159787b, true);
                xdl0.m208360X(this.f159787b, t100.m186890d(12.0f));
                xdl0.m208360X(this.f159788c, t100.m186890d(27.0f));
                this.f159787b.setTextSize(15.0f);
                this.f159787b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f159787b.setText(String.format("预计符合%s人的理想型", strM169801m));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(act().getString(R$string.f27796W0));
        arrayList.add(act().getString(R$string.f27896n2));
        xdl0.m208345M0(this.f159788c, true);
        this.f159789d.setData(arrayList);
        List<String> list = m179700u().m51509a2().m51559u0().profile.extensions.wealth.house;
        if (!vwb.m200296J(list) && TextUtils.equals(list.get(0), act().getString(R$string.f27796W0))) {
            this.f159789d.setSelectedItemPosition(0);
            boolean zM200296J = vwb.m200296J(this.f159798m);
            WheelPicker wheelPicker = this.f159790e;
            if (zM200296J) {
                m179677C(wheelPicker);
                m179677C(this.f159791f);
            } else {
                wheelPicker.setData(this.f159798m);
                List<String> list2 = m179700u().m51509a2().m51559u0().profile.extensions.wealth.houseRegion;
                if (vwb.m200296J(list2) || TextUtils.isEmpty(list2.get(0))) {
                    str = "";
                    iIndexOf = 0;
                } else {
                    str = list2.get(0);
                    iIndexOf = this.f159798m.indexOf(str);
                }
                WheelPicker wheelPicker2 = this.f159790e;
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                wheelPicker2.setSelectedItemPosition(iIndexOf);
                List<String> listM179689v = m179689v(str);
                boolean zM200296J2 = vwb.m200296J(listM179689v);
                WheelPicker wheelPicker3 = this.f159791f;
                if (zM200296J2) {
                    m179677C(wheelPicker3);
                } else {
                    wheelPicker3.setData(listM179689v);
                    List<String> list3 = m179700u().m51509a2().m51559u0().profile.extensions.wealth.houseSubRegion;
                    if (vwb.m200296J(list3) || TextUtils.isEmpty(list3.get(0))) {
                        this.f159791f.setSelectedItemPosition(0);
                    } else {
                        int iIndexOf2 = this.f159798m.indexOf(listM179689v.get(0));
                        this.f159791f.setSelectedItemPosition(iIndexOf2 != -1 ? iIndexOf2 : 0);
                    }
                }
            }
        } else if (vwb.m200296J(list) || !TextUtils.equals(list.get(0), act().getString(R$string.f27884l2))) {
            this.f159789d.setSelectedItemPosition(1);
            m179677C(this.f159790e);
            m179677C(this.f159791f);
        } else {
            this.f159792g.setText(this.f159795j.getString(R$string.f27920r2));
            this.f159789d.setSelectedItemPosition(2);
            m179677C(this.f159790e);
            m179677C(this.f159791f);
        }
        m179695E(loopInputType, list);
        this.f159796k.m51607f5();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f159795j;
    }

    /* JADX INFO: renamed from: E */
    public final void m179695E(LoopInputType loopInputType, List<String> list) {
        boolean z = false;
        if (!vwb.m200296J(list) && TextUtils.equals(list.get(0), act().getString(R$string.f27796W0))) {
            z = true;
        }
        this.f159793h.setVisible(z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m179696n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m179696n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19720a.m179705c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oka0 oka0Var) {
        this.f159797l = oka0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m179698q(User user) {
        String string = this.f159789d.getSelectItem().toString();
        String string2 = this.f159790e.getSelectItem().toString();
        String string3 = this.f159791f.getSelectItem().toString();
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
        } else if (TextUtils.equals(act().getString(R$string.f27796W0), string)) {
            arrayList.add(string);
            arrayList2.add(string2);
            arrayList3.add(string3);
            UserWealth userWealth2 = user.profile.extensions.wealth;
            userWealth2.house = arrayList;
            userWealth2.houseRegion = arrayList2;
            userWealth2.houseSubRegion = arrayList3;
        }
        this.f159793h.m53018W(user);
    }

    /* JADX INFO: renamed from: s */
    public Bundle m179699s() {
        return this.f159796k.getArguments();
    }

    /* JADX INFO: renamed from: u */
    public ProfileInfoLoopEditAct m179700u() {
        return (ProfileInfoLoopEditAct) this.f159795j;
    }

    /* JADX INFO: renamed from: y */
    public void m179701y(String str) {
        boolean z = !vwb.m200296J(this.f159798m) && TextUtils.equals(str, act().getString(R$string.f27796W0));
        WheelPicker wheelPicker = this.f159790e;
        if (z) {
            wheelPicker.setData(this.f159798m);
            this.f159790e.setSelectedItemPosition(0);
            List<String> listM179689v = m179689v(this.f159798m.get(0));
            boolean zM200296J = vwb.m200296J(listM179689v);
            WheelPicker wheelPicker2 = this.f159791f;
            if (zM200296J) {
                m179677C(wheelPicker2);
            } else {
                wheelPicker2.setData(listM179689v);
                this.f159791f.setSelectedItemPosition(0);
            }
        } else {
            m179677C(wheelPicker);
            m179677C(this.f159791f);
        }
        this.f159793h.setVisible(z);
    }

    /* JADX INFO: renamed from: z */
    public void m179702z(String str) {
        List<String> listM179689v = m179689v(str);
        boolean zM200296J = vwb.m200296J(listM179689v);
        WheelPicker wheelPicker = this.f159791f;
        if (zM200296J) {
            m179677C(wheelPicker);
        } else {
            wheelPicker.setData(listM179689v);
            this.f159791f.setSelectedItemPosition(0);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
