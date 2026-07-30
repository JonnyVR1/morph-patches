package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.house.ProfileLoopSelectHouseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vsa0 implements iam<ssa0> {

    /* JADX INFO: renamed from: a */
    public TextView f185572a;

    /* JADX INFO: renamed from: b */
    public TextView f185573b;

    /* JADX INFO: renamed from: c */
    public VFrame f185574c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f185575d;

    /* JADX INFO: renamed from: e */
    public WheelPicker f185576e;

    /* JADX INFO: renamed from: f */
    public WheelPicker f185577f;

    /* JADX INFO: renamed from: g */
    public VText f185578g;

    /* JADX INFO: renamed from: h */
    public ProfileLoopEditUploadPhoto f185579h;

    /* JADX INFO: renamed from: i */
    public ProfileLoopActionLayout f185580i;

    /* JADX INFO: renamed from: j */
    public final Context f185581j;

    /* JADX INFO: renamed from: k */
    public final ProfileLoopSelectHouseFrag f185582k;

    /* JADX INFO: renamed from: l */
    public ssa0 f185583l;

    /* JADX INFO: renamed from: m */
    public List<String> f185584m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f185585n = false;

    /* JADX INFO: renamed from: o */
    public int f185586o = -1;

    /* JADX INFO: renamed from: l.vsa0$a */
    public static class C20919a {
        /* JADX INFO: renamed from: b */
        public static void m202603b(vsa0 vsa0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            vsa0Var.f185572a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            vsa0Var.f185573b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            vsa0Var.f185574c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            vsa0Var.f185575d = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            vsa0Var.f185576e = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            vsa0Var.f185577f = (WheelPicker) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2);
            vsa0Var.f185578g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            vsa0Var.f185579h = (ProfileLoopEditUploadPhoto) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
            vsa0Var.f185580i = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m202604c(vsa0 vsa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167601x0, viewGroup, false);
            m202603b(vsa0Var, viewInflate);
            return viewInflate;
        }
    }

    public vsa0(Context context, ProfileLoopSelectHouseFrag profileLoopSelectHouseFrag) {
        this.f185581j = context;
        this.f185582k = profileLoopSelectHouseFrag;
    }

    /* JADX INFO: renamed from: C */
    private void m202576C(WheelPicker wheelPicker) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("-");
        wheelPicker.setData(arrayList);
        wheelPicker.setSelectedItemPosition(0);
    }

    /* JADX INFO: renamed from: v */
    private List<String> m202588v(String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.m82486a(LoopFragmentFactory.m52683u())) {
            for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m52683u().china) {
                if (TextUtils.equals(hometownChinaItem.region, str) && !jyb.m147479J(hometownChinaItem.subRegion)) {
                    return hometownChinaItem.subRegion;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m202589w(WheelPicker wheelPicker, Object obj, int i) {
        m202600y((String) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m202590x(WheelPicker wheelPicker, Object obj, int i) {
        m202601z((String) obj);
    }

    /* JADX INFO: renamed from: A */
    public void m202591A(List<Media> list, int i) {
        this.f185579h.m54205a0(list);
    }

    /* JADX INFO: renamed from: A3 */
    public void m202592A3(String str) {
        if (NullChecker.m82486a(str)) {
            this.f185572a.setText(str);
            this.f185572a.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (NullChecker.m82486a(LoopFragmentFactory.m52683u())) {
            Iterator<HometownChinaItem> it = LoopFragmentFactory.m52683u().china.iterator();
            while (it.hasNext()) {
                this.f185584m.add(it.next().region);
            }
        }
        if (xra.m212804w()) {
            bnl0.m105524M(this.f185578g, false);
        }
        this.f185575d.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.tsa0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f175970a.m202589w(wheelPicker, obj, i);
            }
        });
        this.f185576e.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.usa0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f180756a.m202590x(wheelPicker, obj, i);
            }
        });
        this.f185580i.m54152l(this.f185582k);
        m202599u().m52692b2().m52731W0(this.f185582k);
    }

    /* JADX INFO: renamed from: B */
    public void m202593B(LoopInputType loopInputType) {
        String str;
        int iIndexOf;
        if (xra.m212787f() && this.f185582k.m52778U4()) {
            String strM192426m = tr90.m192426m(this.f185582k.f34303z);
            if (!TextUtils.isEmpty(strM192426m)) {
                bnl0.m105524M(this.f185573b, true);
                bnl0.m105540X(this.f185573b, qa00.m175859d(12.0f));
                bnl0.m105540X(this.f185574c, qa00.m175859d(27.0f));
                this.f185573b.setTextSize(15.0f);
                this.f185573b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f185573b.setText(String.format("预计符合%s人的理想型", strM192426m));
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(act().getString(R$string.f28644W0));
        arrayList.add(act().getString(R$string.f28744n2));
        bnl0.m105525M0(this.f185574c, true);
        this.f185575d.setData(arrayList);
        List<String> list = m202599u().m52692b2().m52742u0().profile.extensions.wealth.house;
        if (!jyb.m147479J(list) && TextUtils.equals(list.get(0), act().getString(R$string.f28644W0))) {
            this.f185575d.setSelectedItemPosition(0);
            boolean zM147479J = jyb.m147479J(this.f185584m);
            WheelPicker wheelPicker = this.f185576e;
            if (zM147479J) {
                m202576C(wheelPicker);
                m202576C(this.f185577f);
            } else {
                wheelPicker.setData(this.f185584m);
                List<String> list2 = m202599u().m52692b2().m52742u0().profile.extensions.wealth.houseRegion;
                if (jyb.m147479J(list2) || TextUtils.isEmpty(list2.get(0))) {
                    str = "";
                    iIndexOf = 0;
                } else {
                    str = list2.get(0);
                    iIndexOf = this.f185584m.indexOf(str);
                }
                WheelPicker wheelPicker2 = this.f185576e;
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                wheelPicker2.setSelectedItemPosition(iIndexOf);
                List<String> listM202588v = m202588v(str);
                boolean zM147479J2 = jyb.m147479J(listM202588v);
                WheelPicker wheelPicker3 = this.f185577f;
                if (zM147479J2) {
                    m202576C(wheelPicker3);
                } else {
                    wheelPicker3.setData(listM202588v);
                    List<String> list3 = m202599u().m52692b2().m52742u0().profile.extensions.wealth.houseSubRegion;
                    if (jyb.m147479J(list3) || TextUtils.isEmpty(list3.get(0))) {
                        this.f185577f.setSelectedItemPosition(0);
                    } else {
                        int iIndexOf2 = this.f185584m.indexOf(listM202588v.get(0));
                        this.f185577f.setSelectedItemPosition(iIndexOf2 != -1 ? iIndexOf2 : 0);
                    }
                }
            }
        } else if (jyb.m147479J(list) || !TextUtils.equals(list.get(0), act().getString(R$string.f28732l2))) {
            this.f185575d.setSelectedItemPosition(1);
            m202576C(this.f185576e);
            m202576C(this.f185577f);
        } else {
            this.f185578g.setText(this.f185581j.getString(R$string.f28768r2));
            this.f185575d.setSelectedItemPosition(2);
            m202576C(this.f185576e);
            m202576C(this.f185577f);
        }
        m202594E(loopInputType, list);
        this.f185582k.m52790f5();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f185581j;
    }

    /* JADX INFO: renamed from: E */
    public final void m202594E(LoopInputType loopInputType, List<String> list) {
        boolean z = false;
        if (!jyb.m147479J(list) && TextUtils.equals(list.get(0), act().getString(R$string.f28644W0))) {
            z = true;
        }
        this.f185579h.setVisible(z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m202595n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m202595n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20919a.m202604c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ssa0 ssa0Var) {
        this.f185583l = ssa0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m202597q(User user) {
        String string = this.f185575d.getSelectItem().toString();
        String string2 = this.f185576e.getSelectItem().toString();
        String string3 = this.f185577f.getSelectItem().toString();
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
        } else if (TextUtils.equals(act().getString(R$string.f28644W0), string)) {
            arrayList.add(string);
            arrayList2.add(string2);
            arrayList3.add(string3);
            UserWealth userWealth2 = user.profile.extensions.wealth;
            userWealth2.house = arrayList;
            userWealth2.houseRegion = arrayList2;
            userWealth2.houseSubRegion = arrayList3;
        }
        this.f185579h.m54201W(user);
    }

    /* JADX INFO: renamed from: s */
    public Bundle m202598s() {
        return this.f185582k.getArguments();
    }

    /* JADX INFO: renamed from: u */
    public ProfileInfoLoopEditAct m202599u() {
        return (ProfileInfoLoopEditAct) this.f185581j;
    }

    /* JADX INFO: renamed from: y */
    public void m202600y(String str) {
        boolean z = !jyb.m147479J(this.f185584m) && TextUtils.equals(str, act().getString(R$string.f28644W0));
        WheelPicker wheelPicker = this.f185576e;
        if (z) {
            wheelPicker.setData(this.f185584m);
            this.f185576e.setSelectedItemPosition(0);
            List<String> listM202588v = m202588v(this.f185584m.get(0));
            boolean zM147479J = jyb.m147479J(listM202588v);
            WheelPicker wheelPicker2 = this.f185577f;
            if (zM147479J) {
                m202576C(wheelPicker2);
            } else {
                wheelPicker2.setData(listM202588v);
                this.f185577f.setSelectedItemPosition(0);
            }
        } else {
            m202576C(wheelPicker);
            m202576C(this.f185577f);
        }
        this.f185579h.setVisible(z);
    }

    /* JADX INFO: renamed from: z */
    public void m202601z(String str) {
        List<String> listM202588v = m202588v(str);
        boolean zM147479J = jyb.m147479J(listM202588v);
        WheelPicker wheelPicker = this.f185577f;
        if (zM147479J) {
            m202576C(wheelPicker);
        } else {
            wheelPicker.setData(listM202588v);
            this.f185577f.setSelectedItemPosition(0);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
