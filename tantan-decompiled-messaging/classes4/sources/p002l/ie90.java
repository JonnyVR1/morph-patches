package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import com.p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.i0g0;
import l.j760;
import l.je90;
import l.mcr;
import l.o7r;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VLinear_Dividers;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ie90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VFrame f13162A;

    /* JADX INFO: renamed from: B */
    public List<j760<Integer, String>> f13163B;

    /* JADX INFO: renamed from: C */
    public List<Integer> f13164C;

    /* JADX INFO: renamed from: D */
    public boolean f13165D;

    /* JADX INFO: renamed from: E */
    public String f13166E;

    /* JADX INFO: renamed from: F */
    public j760<Integer, String> f13167F;

    /* JADX INFO: renamed from: G */
    public j760<Integer, String> f13168G;

    /* JADX INFO: renamed from: H */
    public j760<Integer, String> f13169H;

    /* JADX INFO: renamed from: I */
    public j760<Integer, String> f13170I;

    /* JADX INFO: renamed from: J */
    public j760<Integer, String> f13171J;

    /* JADX INFO: renamed from: K */
    public j760<Integer, String> f13172K;

    /* JADX INFO: renamed from: L */
    public j760<Integer, String> f13173L;

    /* JADX INFO: renamed from: M */
    public j760<Integer, String> f13174M;

    /* JADX INFO: renamed from: N */
    public j760<Integer, String> f13175N;

    /* JADX INFO: renamed from: O */
    public j760<Integer, String> f13176O;

    /* JADX INFO: renamed from: P */
    public j760<Integer, String> f13177P;

    /* JADX INFO: renamed from: Q */
    public j760<Integer, String> f13178Q;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f13179u;

    /* JADX INFO: renamed from: v */
    public VText f13180v;

    /* JADX INFO: renamed from: w */
    public VText f13181w;

    /* JADX INFO: renamed from: x */
    public FlowView f13182x;

    /* JADX INFO: renamed from: y */
    public VRecyclerView f13183y;

    /* JADX INFO: renamed from: z */
    public VLinear f13184z;

    public ie90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f13163B = new ArrayList();
        this.f13164C = new ArrayList();
        this.f13165D = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX INFO: renamed from: U */
    private void m15102U(User user) {
        String str;
        List list;
        List list2;
        boolean z;
        List list3;
        List list4;
        List list5;
        String str2;
        this.f13166E = user.description;
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.b.getString(R.string.Xk);
        }
        this.f13167F = j760.a(Integer.valueOf(x2c0.V8), string);
        if (!user.profile.studies.active) {
            this.f13168G = j760.a(Integer.valueOf(x2c0.P8), user.profile.work.company);
        }
        this.f13169H = j760.a(Integer.valueOf(x2c0.X8), user.profile.studies.school);
        String strM15104S = m15104S(user.profile);
        if (!TextUtils.isEmpty(strM15104S)) {
            this.f13170I = j760.a(Integer.valueOf(x2c0.S8), String.format(CoreModule.b.getString(R.string.Nk), strM15104S));
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            this.f13171J = j760.a(Integer.valueOf(x2c0.Q8), String.format(CoreModule.b.getString(R.string.Tk), user.profile.hangouts));
        }
        this.f13172K = i0g0.m0(user.profile.zodiac);
        List list6 = user.profile.extensions.basic.qualification;
        String strM14230K = null;
        this.f13173L = j760.a(Integer.valueOf(x2c0.W8), !vwb.J(list6) ? h7j.m14242W((String) list6.get(0)) : null);
        List list7 = user.profile.extensions.physical.height;
        if (vwb.J(list7)) {
            str = null;
        } else {
            String str3 = (String) list7.get(0);
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                str = str3 + "cm";
            }
        }
        this.f13174M = j760.a(Integer.valueOf(x2c0.R8), str);
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (NullChecker.a(userP9.profile.extensions.wealth)) {
            UserWealth userWealth2 = userP9.profile.extensions.wealth;
            if (TextUtils.isEmpty(h7j.m14232M(userWealth2.upperIncome, userWealth2.lowIncome))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String strM14232M = (!(vwb.J(list) && vwb.J(list2)) && (user.isMe() || !z)) ? h7j.m14232M(list2, list) : null;
        String strM14232M2 = (!(vwb.J(list) && vwb.J(list2)) && user.isMe()) ? h7j.m14232M(list2, list) : null;
        this.f13175N = j760.a(Integer.valueOf(x2c0.U8), strM14232M);
        this.f13176O = j760.a(Integer.valueOf(x2c0.U8), strM14232M2);
        List list8 = (NullChecker.a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        this.f13177P = j760.a(Integer.valueOf(x2c0.O8), !vwb.J(list8) ? h7j.m14261n((String) list8.get(0)) : null);
        if (NullChecker.a(user.profile.extensions.wealth)) {
            UserWealth userWealth3 = user.profile.extensions.wealth;
            list4 = userWealth3.house;
            list5 = userWealth3.houseRegion;
            list3 = userWealth3.houseSubRegion;
        } else {
            list3 = null;
            list4 = null;
            list5 = null;
        }
        if (NullChecker.a(userP9.profile.extensions.wealth) && !vwb.J(userP9.profile.extensions.wealth.house)) {
            TextUtils.isEmpty(h7j.m14231L((String) userP9.profile.extensions.wealth.house.get(0)));
        }
        if (!vwb.J(list4) && user.isMe()) {
            if (vwb.J(list3) || TextUtils.isEmpty((CharSequence) list3.get(0))) {
                str2 = (vwb.J(list5) || TextUtils.isEmpty((CharSequence) list5.get(0))) ? "" : (String) list5.get(0);
            } else {
                str2 = (String) list3.get(0);
            }
            strM14230K = h7j.m14230K((String) list4.get(0), str2);
        }
        this.f13178Q = j760.a(Integer.valueOf(x2c0.T8), strM14230K);
    }

    /* JADX INFO: renamed from: R */
    public View m15103R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return je90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public final String m15104S(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: T */
    public View m15105T(int i, String str) {
        View viewInflate = o7r.a(mo3351O().act()).inflate(f6c0.t9, (ViewGroup) this.f13182x, false);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.u5);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        vDraweeViewFindViewById.setImageResource(i);
        vTextFindViewById.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: V */
    public final void m15106V(List<View> list, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m15105T(i, str));
        this.f13164C.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: W */
    public final boolean m15107W(User user) {
        Profile profile = user.profile;
        Work work = profile.work;
        return (TextUtils.isEmpty(work.industry) && TextUtils.isEmpty(work.company) && TextUtils.isEmpty(profile.studies.school) && TextUtils.isEmpty(profile.hometown) && TextUtils.isEmpty(profile.hangouts) && TextUtils.isEmpty((CharSequence) i0g0.m0(profile.zodiac).b)) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public final void m15108X(User user, String str, List<j760<Integer, String>> list) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f13181w;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(str);
            this.f13181w.setVisibility(0);
        }
        if (!m15107W(user)) {
            this.f13182x.setVisibility(8);
            return;
        }
        this.f13163B = list;
        FlowView flowView = this.f13182x;
        flowView.f1942f = true;
        flowView.setTags(m15109Y(list));
        this.f13182x.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    public final List<View> m15109Y(List<j760<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        this.f13164C.clear();
        for (j760<Integer, String> j760Var : list) {
            if (j760Var != null) {
                m15106V(arrayList, ((Integer) j760Var.a).intValue(), (String) j760Var.b);
            }
        }
        return arrayList;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f13180v.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.d0(this.f13179u, t100.d(20.0f));
        xdl0.e0(this.f13179u, t100.d(20.0f));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m15103R(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        User userMo1517K2 = mo3351O().mo1517K2();
        m15102U(userMo1517K2);
        m15108X(userMo1517K2, this.f13166E, new ArrayList(vwb.f0(new j760[]{this.f13167F, this.f13168G, this.f13169H, this.f13170I, this.f13171J, this.f13172K})));
    }
}
