package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import com.p046p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ie90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VFrame f112716A;

    /* JADX INFO: renamed from: B */
    public List<j760<Integer, String>> f112717B;

    /* JADX INFO: renamed from: C */
    public List<Integer> f112718C;

    /* JADX INFO: renamed from: D */
    public boolean f112719D;

    /* JADX INFO: renamed from: E */
    public String f112720E;

    /* JADX INFO: renamed from: F */
    public j760<Integer, String> f112721F;

    /* JADX INFO: renamed from: G */
    public j760<Integer, String> f112722G;

    /* JADX INFO: renamed from: H */
    public j760<Integer, String> f112723H;

    /* JADX INFO: renamed from: I */
    public j760<Integer, String> f112724I;

    /* JADX INFO: renamed from: J */
    public j760<Integer, String> f112725J;

    /* JADX INFO: renamed from: K */
    public j760<Integer, String> f112726K;

    /* JADX INFO: renamed from: L */
    public j760<Integer, String> f112727L;

    /* JADX INFO: renamed from: M */
    public j760<Integer, String> f112728M;

    /* JADX INFO: renamed from: N */
    public j760<Integer, String> f112729N;

    /* JADX INFO: renamed from: O */
    public j760<Integer, String> f112730O;

    /* JADX INFO: renamed from: P */
    public j760<Integer, String> f112731P;

    /* JADX INFO: renamed from: Q */
    public j760<Integer, String> f112732Q;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f112733u;

    /* JADX INFO: renamed from: v */
    public VText f112734v;

    /* JADX INFO: renamed from: w */
    public VText f112735w;

    /* JADX INFO: renamed from: x */
    public FlowView f112736x;

    /* JADX INFO: renamed from: y */
    public VRecyclerView f112737y;

    /* JADX INFO: renamed from: z */
    public VLinear f112738z;

    public ie90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f112717B = new ArrayList();
        this.f112718C = new ArrayList();
        this.f112719D = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX INFO: renamed from: U */
    private void m135659U(User user) {
        String str;
        List<String> list;
        List<String> list2;
        boolean z;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        String str2;
        this.f112720E = user.description;
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.f17544b.getString(R$string.f18277Xk);
        }
        this.f112721F = j760.m140076a(Integer.valueOf(x2c0.f189819V8), string);
        if (!user.profile.studies.active) {
            this.f112722G = j760.m140076a(Integer.valueOf(x2c0.f189633P8), user.profile.work.company);
        }
        this.f112723H = j760.m140076a(Integer.valueOf(x2c0.f189881X8), user.profile.studies.school);
        String strM135661S = m135661S(user.profile);
        if (!TextUtils.isEmpty(strM135661S)) {
            this.f112724I = j760.m140076a(Integer.valueOf(x2c0.f189726S8), String.format(CoreModule.f17544b.getString(R$string.f17977Nk), strM135661S));
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            this.f112725J = j760.m140076a(Integer.valueOf(x2c0.f189664Q8), String.format(CoreModule.f17544b.getString(R$string.f18157Tk), user.profile.hangouts));
        }
        this.f112726K = i0g0.m133873m0(user.profile.zodiac);
        List<String> list6 = user.profile.extensions.basic.qualification;
        String strM129699K = null;
        this.f112727L = j760.m140076a(Integer.valueOf(x2c0.f189850W8), !vwb.m200296J(list6) ? h7j.m129711W(list6.get(0)) : null);
        List<String> list7 = user.profile.extensions.physical.height;
        if (vwb.m200296J(list7)) {
            str = null;
        } else {
            String str3 = list7.get(0);
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                str = str3 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
            }
        }
        this.f112728M = j760.m140076a(Integer.valueOf(x2c0.f189695R8), str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (NullChecker.m81303a(userM169527p9.profile.extensions.wealth)) {
            UserWealth userWealth2 = userM169527p9.profile.extensions.wealth;
            if (TextUtils.isEmpty(h7j.m129701M(userWealth2.upperIncome, userWealth2.lowIncome))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String strM129701M = (!(vwb.m200296J(list) && vwb.m200296J(list2)) && (user.isMe() || !z)) ? h7j.m129701M(list2, list) : null;
        String strM129701M2 = (!(vwb.m200296J(list) && vwb.m200296J(list2)) && user.isMe()) ? h7j.m129701M(list2, list) : null;
        this.f112729N = j760.m140076a(Integer.valueOf(x2c0.f189788U8), strM129701M);
        this.f112730O = j760.m140076a(Integer.valueOf(x2c0.f189788U8), strM129701M2);
        List<String> list8 = (NullChecker.m81303a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        this.f112731P = j760.m140076a(Integer.valueOf(x2c0.f189602O8), !vwb.m200296J(list8) ? h7j.m129730n(list8.get(0)) : null);
        if (NullChecker.m81303a(user.profile.extensions.wealth)) {
            UserWealth userWealth3 = user.profile.extensions.wealth;
            list4 = userWealth3.house;
            list5 = userWealth3.houseRegion;
            list3 = userWealth3.houseSubRegion;
        } else {
            list3 = null;
            list4 = null;
            list5 = null;
        }
        if (NullChecker.m81303a(userM169527p9.profile.extensions.wealth) && !vwb.m200296J(userM169527p9.profile.extensions.wealth.house)) {
            TextUtils.isEmpty(h7j.m129700L(userM169527p9.profile.extensions.wealth.house.get(0)));
        }
        if (!vwb.m200296J(list4) && user.isMe()) {
            if (vwb.m200296J(list3) || TextUtils.isEmpty(list3.get(0))) {
                str2 = (vwb.m200296J(list5) || TextUtils.isEmpty(list5.get(0))) ? "" : list5.get(0);
            } else {
                str2 = list3.get(0);
            }
            strM129699K = h7j.m129699K(list4.get(0), str2);
        }
        this.f112732Q = j760.m140076a(Integer.valueOf(x2c0.f189757T8), strM129699K);
    }

    /* JADX INFO: renamed from: R */
    public View m135660R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return je90.m141105b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public final String m135661S(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: T */
    public View m135662T(int i, String str) {
        View viewInflate = o7r.m163037a(mo52800O().act()).inflate(f6c0.f96014t9, (ViewGroup) this.f112736x, false);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174496u5);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        vDraweeView.setImageResource(i);
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: V */
    public final void m135663V(List<View> list, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m135662T(i, str));
        this.f112718C.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: W */
    public final boolean m135664W(User user) {
        Profile profile = user.profile;
        Work work = profile.work;
        return (TextUtils.isEmpty(work.industry) && TextUtils.isEmpty(work.company) && TextUtils.isEmpty(profile.studies.school) && TextUtils.isEmpty(profile.hometown) && TextUtils.isEmpty(profile.hangouts) && TextUtils.isEmpty(i0g0.m133873m0(profile.zodiac).f116565b)) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public final void m135665X(User user, String str, List<j760<Integer, String>> list) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f112735w;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(str);
            this.f112735w.setVisibility(0);
        }
        if (!m135664W(user)) {
            this.f112736x.setVisibility(8);
            return;
        }
        this.f112717B = list;
        FlowView flowView = this.f112736x;
        flowView.f34120f = true;
        flowView.setTags(m135666Y(list));
        this.f112736x.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    public final List<View> m135666Y(List<j760<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        this.f112718C.clear();
        for (j760<Integer, String> j760Var : list) {
            if (j760Var != null) {
                m135663V(arrayList, j760Var.f116564a.intValue(), j760Var.f116565b);
            }
        }
        return arrayList;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f112734v.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208370d0(this.f112733u, t100.m186890d(20.0f));
        xdl0.m208372e0(this.f112733u, t100.m186890d(20.0f));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m135660R(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        User userMo51069K2 = mo52800O().mo51069K2();
        m135659U(userMo51069K2);
        m135665X(userMo51069K2, this.f112720E, new ArrayList(vwb.m200324f0(this.f112721F, this.f112722G, this.f112723H, this.f112724I, this.f112725J, this.f112726K)));
    }
}
