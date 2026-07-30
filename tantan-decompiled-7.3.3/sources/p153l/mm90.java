package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import com.p051p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mm90 extends ep90 {

    /* JADX INFO: renamed from: A */
    public VFrame f137522A;

    /* JADX INFO: renamed from: B */
    public List<pf60<Integer, String>> f137523B;

    /* JADX INFO: renamed from: C */
    public List<Integer> f137524C;

    /* JADX INFO: renamed from: D */
    public boolean f137525D;

    /* JADX INFO: renamed from: E */
    public String f137526E;

    /* JADX INFO: renamed from: F */
    public pf60<Integer, String> f137527F;

    /* JADX INFO: renamed from: G */
    public pf60<Integer, String> f137528G;

    /* JADX INFO: renamed from: H */
    public pf60<Integer, String> f137529H;

    /* JADX INFO: renamed from: I */
    public pf60<Integer, String> f137530I;

    /* JADX INFO: renamed from: J */
    public pf60<Integer, String> f137531J;

    /* JADX INFO: renamed from: K */
    public pf60<Integer, String> f137532K;

    /* JADX INFO: renamed from: L */
    public pf60<Integer, String> f137533L;

    /* JADX INFO: renamed from: M */
    public pf60<Integer, String> f137534M;

    /* JADX INFO: renamed from: N */
    public pf60<Integer, String> f137535N;

    /* JADX INFO: renamed from: O */
    public pf60<Integer, String> f137536O;

    /* JADX INFO: renamed from: P */
    public pf60<Integer, String> f137537P;

    /* JADX INFO: renamed from: Q */
    public pf60<Integer, String> f137538Q;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f137539u;

    /* JADX INFO: renamed from: v */
    public VText f137540v;

    /* JADX INFO: renamed from: w */
    public VText f137541w;

    /* JADX INFO: renamed from: x */
    public FlowView f137542x;

    /* JADX INFO: renamed from: y */
    public VRecyclerView f137543y;

    /* JADX INFO: renamed from: z */
    public VLinear f137544z;

    public mm90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f137523B = new ArrayList();
        this.f137524C = new ArrayList();
        this.f137525D = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0100  */
    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX INFO: renamed from: U */
    private void m159051U(User user) {
        String str;
        List<String> list;
        List<String> list2;
        boolean z;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        String str2;
        this.f137526E = user.description;
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.f18263b.getString(R$string.f19684tl);
        }
        this.f137527F = pf60.m172085a(Integer.valueOf(dbc0.f86689W8), string);
        if (!user.profile.studies.active) {
            this.f137528G = pf60.m172085a(Integer.valueOf(dbc0.f86497Q8), user.profile.work.company);
        }
        this.f137529H = pf60.m172085a(Integer.valueOf(dbc0.f86753Y8), user.profile.studies.school);
        String strM159053S = m159053S(user.profile);
        if (!TextUtils.isEmpty(strM159053S)) {
            this.f137530I = pf60.m172085a(Integer.valueOf(dbc0.f86593T8), String.format(CoreModule.f18263b.getString(R$string.f19374jl), strM159053S));
        }
        if (!TextUtils.isEmpty(user.profile.hangouts)) {
            this.f137531J = pf60.m172085a(Integer.valueOf(dbc0.f86529R8), String.format(CoreModule.f18263b.getString(R$string.f19560pl), user.profile.hangouts));
        }
        this.f137532K = q8g0.m175808m0(user.profile.zodiac);
        List<String> list6 = user.profile.extensions.basic.qualification;
        String strM103170K = null;
        this.f137533L = pf60.m172085a(Integer.valueOf(dbc0.f86721X8), !jyb.m147479J(list6) ? baj.m103182W(list6.get(0)) : null);
        List<String> list7 = user.profile.extensions.physical.height;
        if (jyb.m147479J(list7)) {
            str = null;
        } else {
            String str3 = list7.get(0);
            if (TextUtils.isEmpty(str3)) {
                str = null;
            } else {
                str = str3 + CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR;
            }
        }
        this.f137534M = pf60.m172085a(Integer.valueOf(dbc0.f86561S8), str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth = user.profile.extensions.wealth;
            list2 = userWealth.upperIncome;
            list = userWealth.lowIncome;
        } else {
            list = null;
            list2 = null;
        }
        if (NullChecker.m82486a(userM116600p9.profile.extensions.wealth)) {
            UserWealth userWealth2 = userM116600p9.profile.extensions.wealth;
            if (TextUtils.isEmpty(baj.m103172M(userWealth2.upperIncome, userWealth2.lowIncome))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        String strM103172M = (!(jyb.m147479J(list) && jyb.m147479J(list2)) && (user.isMe() || !z)) ? baj.m103172M(list2, list) : null;
        String strM103172M2 = (!(jyb.m147479J(list) && jyb.m147479J(list2)) && user.isMe()) ? baj.m103172M(list2, list) : null;
        this.f137535N = pf60.m172085a(Integer.valueOf(dbc0.f86657V8), strM103172M);
        this.f137536O = pf60.m172085a(Integer.valueOf(dbc0.f86657V8), strM103172M2);
        List<String> list8 = (NullChecker.m82486a(user.profile.extensions.wealth) && user.isMe()) ? user.profile.extensions.wealth.car : null;
        this.f137537P = pf60.m172085a(Integer.valueOf(dbc0.f86465P8), !jyb.m147479J(list8) ? baj.m103201n(list8.get(0)) : null);
        if (NullChecker.m82486a(user.profile.extensions.wealth)) {
            UserWealth userWealth3 = user.profile.extensions.wealth;
            list4 = userWealth3.house;
            list5 = userWealth3.houseRegion;
            list3 = userWealth3.houseSubRegion;
        } else {
            list3 = null;
            list4 = null;
            list5 = null;
        }
        if (NullChecker.m82486a(userM116600p9.profile.extensions.wealth) && !jyb.m147479J(userM116600p9.profile.extensions.wealth.house)) {
            TextUtils.isEmpty(baj.m103171L(userM116600p9.profile.extensions.wealth.house.get(0)));
        }
        if (!jyb.m147479J(list4) && user.isMe()) {
            if (jyb.m147479J(list3) || TextUtils.isEmpty(list3.get(0))) {
                str2 = (jyb.m147479J(list5) || TextUtils.isEmpty(list5.get(0))) ? "" : list5.get(0);
            } else {
                str2 = list3.get(0);
            }
            strM103170K = baj.m103170K(list4.get(0), str2);
        }
        this.f137538Q = pf60.m172085a(Integer.valueOf(dbc0.f86625U8), strM103170K);
    }

    /* JADX INFO: renamed from: R */
    public View m159052R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nm90.m163807b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: S */
    public final String m159053S(Profile profile) {
        return profile.hometown;
    }

    /* JADX INFO: renamed from: T */
    public View m159054T(int i, String str) {
        View viewInflate = p9r.m171370a(mo53983O().act()).inflate(kec0.f125325A9, (ViewGroup) this.f137542x, false);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70621w5);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        vDraweeView.setImageResource(i);
        vText.setText(str);
        return viewInflate;
    }

    /* JADX INFO: renamed from: V */
    public final void m159055V(List<View> list, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(m159054T(i, str));
        this.f137524C.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: W */
    public final boolean m159056W(User user) {
        Profile profile = user.profile;
        Work work = profile.work;
        return (TextUtils.isEmpty(work.industry) && TextUtils.isEmpty(work.company) && TextUtils.isEmpty(profile.studies.school) && TextUtils.isEmpty(profile.hometown) && TextUtils.isEmpty(profile.hangouts) && TextUtils.isEmpty(q8g0.m175808m0(profile.zodiac).f152157b)) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public final void m159057X(User user, String str, List<pf60<Integer, String>> list) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f137541w;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(str);
            this.f137541w.setVisibility(0);
        }
        if (!m159056W(user)) {
            this.f137542x.setVisibility(8);
            return;
        }
        this.f137523B = list;
        FlowView flowView = this.f137542x;
        flowView.f34968f = true;
        flowView.setTags(m159058Y(list));
        this.f137542x.setVisibility(0);
    }

    /* JADX INFO: renamed from: Y */
    public final List<View> m159058Y(List<pf60<Integer, String>> list) {
        ArrayList arrayList = new ArrayList();
        this.f137524C.clear();
        for (pf60<Integer, String> pf60Var : list) {
            if (pf60Var != null) {
                m159055V(arrayList, pf60Var.f152156a.intValue(), pf60Var.f152157b);
            }
        }
        return arrayList;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f137540v.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105550d0(this.f137539u, qa00.m175859d(20.0f));
        bnl0.m105552e0(this.f137539u, qa00.m175859d(20.0f));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m159052R(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        User userMo52252K2 = mo53983O().mo52252K2();
        m159051U(userMo52252K2);
        m159057X(userMo52252K2, this.f137526E, new ArrayList(jyb.m147507f0(this.f137527F, this.f137528G, this.f137529H, this.f137530I, this.f137531J, this.f137532K)));
    }
}
