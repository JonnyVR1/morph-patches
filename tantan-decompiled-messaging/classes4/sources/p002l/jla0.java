package p002l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopSelectInputAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.HometownChinaItem;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.SearchPriority;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.e51;
import l.hpd0;
import l.jq2;
import l.lqa;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.s7m;
import l.ura;
import l.vwb;
import l.w9j;
import l.wua0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jla0 extends jq2<lla0> {

    /* JADX INFO: renamed from: g */
    public static hpd0 f13856g = new hpd0("isEnterHometownPager" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f13857a;

    /* JADX INFO: renamed from: b */
    public LoopInputType f13858b;

    /* JADX INFO: renamed from: c */
    public int f13859c;

    /* JADX INFO: renamed from: d */
    public boolean f13860d;

    /* JADX INFO: renamed from: e */
    public List<Integer> f13861e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopSelectInputFrag f13862f;

    public jla0(mcr mcrVar) {
        super(mcrVar);
        this.f13857a = new ArrayList<>();
        this.f13859c = -1;
        this.f13860d = false;
        this.f13861e = new ArrayList();
        this.f13862f = (ProfileLoopSelectInputFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m15999E0(Bundle bundle) {
        m16032y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void m16013C0() {
        User userP9 = CoreModule.c.e0.p9();
        User userClone = userP9.clone();
        StudentVerification studentVerification = userClone.settings.verification.studies;
        studentVerification.school = "";
        studentVerification.status = StudentVerificationStatus.get("default");
        if (NullChecker.b(userClone.settings.getSearchPriority())) {
            userClone.settings.getSearchPriority().remove(SearchPriority.get("student"));
        }
        User userSubtract = userClone.subtract(userP9);
        if (NullChecker.a(userSubtract)) {
            act().progress(R.string.R0);
            act().duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.yka0
                public final void call(Object obj) {
                    this.f22953a.m16017H0((roj0) obj);
                }
            }, new e30() { // from class: l.zka0
                public final void call(Object obj) {
                    this.f23477a.m16018I0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m16012A0() {
        return this.f13858b == LoopInputType.PET && lqa.w();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m16014D0(DialogInterface dialogInterface) {
        ((lla0) ((jq2) this).viewModel).m17303j();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m16015F0() {
        m16020L0(this.f13859c);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m16016G0() {
        ((lla0) ((jq2) this).viewModel).f14928f.m3521f();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m16017H0(roj0 roj0Var) {
        act().progressDismiss();
        User userP9 = CoreModule.c.e0.p9();
        User userM2043u0 = ((lla0) ((jq2) this).viewModel).m17300f().m1991a2().m2043u0();
        Profile profile = userM2043u0.profile;
        Studies studies = profile.studies;
        Profile profile2 = userP9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        LoopSelectFillData loopSelectFillData = this.f13857a.get(this.f13859c);
        userM2043u0.profile.work.industry = loopSelectFillData.m2061a();
        Profile profile3 = userM2043u0.profile;
        profile3.work.active = true;
        profile3.studies.active = false;
        m16021N0(this.f13859c, false);
        ((lla0) ((jq2) this).viewModel).m17303j();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m16018I0(Throwable th) {
        act().progressDismiss();
        ((lla0) ((jq2) this).viewModel).m17303j();
    }

    /* JADX INFO: renamed from: J0 */
    public void m16019J0(int i, int i2, Intent intent) {
        int i3;
        String stringExtra = intent.getStringExtra("loop_result_key");
        if (i == LoopInputType.HOMETOWN_CITY.requestCode) {
            String stringExtra2 = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra2) || (i3 = this.f13859c) < 0 || i3 >= this.f13857a.size()) {
                return;
            }
            ((lla0) ((jq2) this).viewModel).m17309q();
            this.f13857a.get(this.f13859c).m2068h(stringExtra2);
            e51.I(((lla0) ((jq2) this).viewModel).f14933k, new Runnable() { // from class: l.bla0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8253a.m16016G0();
                }
            }, 300L);
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        ((lla0) ((jq2) this).viewModel).m17309q();
        ArrayList arrayList = new ArrayList();
        Iterator<LoopSelectFillData> it = this.f13857a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LoopSelectFillData next = it.next();
            if (!TextUtils.equals(stringExtra, next.m2061a())) {
                next.m2069i(false);
                arrayList.add(next);
            }
        }
        LoopSelectFillData loopSelectFillData = new LoopSelectFillData(stringExtra);
        loopSelectFillData.m2069i(true);
        this.f13859c = arrayList.size() > 0 ? 1 : 0;
        arrayList.add(arrayList.size() > 0 ? 1 : 0, loopSelectFillData);
        this.f13857a.clear();
        this.f13857a.addAll(arrayList);
        ((lla0) ((jq2) this).viewModel).m17307n(this.f13857a);
        e51.I(((lla0) ((jq2) this).viewModel).f14933k, new Runnable() { // from class: l.cla0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8735a.m16015F0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: L0 */
    public void m16020L0(int i) {
        m16021N0(i, true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x012d, please report this as an issue */
    /* JADX INFO: renamed from: N0 */
    public void m16021N0(final int i, boolean z) {
        boolean z2;
        String strM2061a;
        LoopSelectFillData loopSelectFillData = this.f13857a.get(i);
        this.f13859c = i;
        if (loopSelectFillData.m2065e()) {
            LoopEditInfo loopEditInfoM1976o = LoopFragmentFactory.m1976o(this.f13858b, ((lla0) ((jq2) this).viewModel).m17300f().m1991a2().m2043u0(), act());
            Intent intentM2131b2 = ProfileLoopCreateTagAct.m2131b2(loopEditInfoM1976o, Y());
            wua0.a(loopEditInfoM1976o, "loopInputClick");
            ((lla0) ((jq2) this).viewModel).f14933k.startActivityForResult(intentM2131b2, 0);
            return;
        }
        if (z && m16027r0(i)) {
            return;
        }
        if (z) {
            m16022P0(i);
        }
        if (this.f13858b == LoopInputType.HOMETOWN) {
            List<String> arrayList = new ArrayList<>();
            if (lqa.g()) {
                if (NullChecker.a(LoopFragmentFactory.m1982u())) {
                    if (loopSelectFillData.m2064d() != LoopSelectFillData.LoopSelectType.SELECT_OVERSEAS) {
                        for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m1982u().china) {
                            if (hometownChinaItem.region.equals(loopSelectFillData.m2061a())) {
                                arrayList = hometownChinaItem.subRegion;
                                break;
                            }
                        }
                    } else {
                        arrayList = LoopFragmentFactory.m1955Q(vwb.D(LoopFragmentFactory.m1982u().overseas));
                        z2 = true;
                    }
                }
                if (!vwb.J(arrayList)) {
                    Intent intentM2189c2 = ProfileLoopSelectInputAct.m2189c2(Y(), loopSelectFillData.m2061a(), z2);
                    wua0.a(((lla0) ((jq2) this).viewModel).m17300f().m1991a2().m2043u0(), "secondInput");
                    ((lla0) ((jq2) this).viewModel).f14933k.startActivityForResult(intentM2189c2, LoopInputType.HOMETOWN_CITY.requestCode);
                    return;
                } else if (lqa.g()) {
                    strM2061a = loopSelectFillData.m2061a();
                    String string = CoreModule.b.getString(R.string.R2);
                    if (!"其他".equals(strM2061a) || string.equals(strM2061a)) {
                        loopSelectFillData.m2068h("·" + strM2061a);
                    } else {
                        loopSelectFillData.m2068h("中国·" + strM2061a);
                    }
                }
            } else if (NullChecker.a(m16030u0())) {
                arrayList = (List) m16030u0().hometown.get(loopSelectFillData.m2061a());
            }
            z2 = false;
            if (!vwb.J(arrayList)) {
                Intent intentM2189c3 = ProfileLoopSelectInputAct.m2189c2(Y(), loopSelectFillData.m2061a(), z2);
                wua0.a(((lla0) ((jq2) this).viewModel).m17300f().m1991a2().m2043u0(), "secondInput");
                ((lla0) ((jq2) this).viewModel).f14933k.startActivityForResult(intentM2189c3, LoopInputType.HOMETOWN_CITY.requestCode);
                return;
            } else if (lqa.g()) {
                strM2061a = loopSelectFillData.m2061a();
                String string2 = CoreModule.b.getString(R.string.R2);
                if ("其他".equals(strM2061a)) {
                    loopSelectFillData.m2068h("·" + strM2061a);
                } else {
                    loopSelectFillData.m2068h("·" + strM2061a);
                }
            }
        } else if (m16012A0()) {
            ((lla0) ((jq2) this).viewModel).f14926d.setVisible(false);
            xdl0.M(((lla0) ((jq2) this).viewModel).f14927e, i == 0);
            ArrayList arrayListN = vwb.n(this.f13857a, new w9j() { // from class: l.gla0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m2066f());
                }
            });
            if (arrayListN.size() >= 1 || loopSelectFillData.m2066f()) {
                ((LoopSelectFillData) arrayListN.get(0)).m2069i(false);
            }
            loopSelectFillData.m2069i(true);
            ((lla0) ((jq2) this).viewModel).m17307n(this.f13857a);
            ((lla0) ((jq2) this).viewModel).m17310s(loopSelectFillData.m2063c());
            ((lla0) ((jq2) this).viewModel).m17311u();
            return;
        }
        LoopInputType loopInputType = this.f13858b;
        if (loopInputType == LoopInputType.QUALIFICATION) {
            ArrayList arrayListN2 = vwb.n(this.f13857a, new w9j() { // from class: l.hla0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m2066f());
                }
            });
            if (arrayListN2.size() < 1 && !loopSelectFillData.m2066f()) {
                loopSelectFillData.m2069i(true);
                ((lla0) ((jq2) this).viewModel).m17307n(this.f13857a);
                ((lla0) ((jq2) this).viewModel).m17311u();
                return;
            } else {
                ((LoopSelectFillData) arrayListN2.get(0)).m2069i(false);
                loopSelectFillData.m2069i(true);
                ((lla0) ((jq2) this).viewModel).m17307n(this.f13857a);
                ((lla0) ((jq2) this).viewModel).m17311u();
                return;
            }
        }
        if (!this.f13860d) {
            ((lla0) ((jq2) this).viewModel).m17309q();
            ((lla0) ((jq2) this).viewModel).f14928f.m3521f();
            return;
        }
        if (loopInputType == LoopInputType.GAME_NAME && !loopSelectFillData.m2066f() && vwb.f(this.f13857a, new vka0()) >= 3) {
            lsi0.F(act(), "最多选择3款游戏");
            return;
        }
        if (loopSelectFillData.m2066f()) {
            loopSelectFillData.m2069i(false);
            vwb.d0(this.f13861e, new w9j() { // from class: l.ila0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == i);
                }
            });
        } else {
            loopSelectFillData.m2069i(true);
            this.f13861e.add(Integer.valueOf(i));
        }
        ((lla0) ((jq2) this).viewModel).m17307n(this.f13857a);
        ((lla0) ((jq2) this).viewModel).m17311u();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m16022P0(int i) {
        ((lla0) ((jq2) this).viewModel).f14933k.m2094g5(i);
    }

    /* JADX INFO: renamed from: Z */
    public void m16023Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m16024a0() {
        super.a0();
        creates(new e30() { // from class: l.ala0
            public final void call(Object obj) {
                this.f7717a.m15999E0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m16025p0() {
        if (this.f13858b == LoopInputType.QUALIFICATION) {
            return m16028s0();
        }
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m16026q0(boolean z) {
        act().dialog().E0(z ? R.string.Z : R.string.h2).D(z ? R.string.a0 : R.string.i2).m0(act().getString(R.string.a)).v0(act().getString(R.string.d2), new Runnable() { // from class: l.wka0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21808a.m16013C0();
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.xka0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f22333a.m16014D0(dialogInterface);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m16027r0(int i) {
        if (this.f13858b == LoopInputType.INDUSTRY) {
            if (!TextUtils.equals(this.f13857a.get(i).m2061a(), (String) m16030u0().industry.get(0))) {
                User userP9 = CoreModule.c.e0.p9();
                if (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification) && TEnum.equals(userP9.settings.verification.studies.status, "verified")) {
                    m16026q0(false);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m16028s0() {
        return vwb.n(this.f13857a, new vka0()).size() >= 1;
    }

    /* JADX INFO: renamed from: t0 */
    public void m16029t0(User user) {
        if (this.f13860d) {
            LoopInputType loopInputType = this.f13858b;
            LoopInputType loopInputType2 = LoopInputType.GROWTH_FOOD;
            ArrayList<LoopSelectFillData> arrayList = this.f13857a;
            if (loopInputType == loopInputType2) {
                LoopFragmentFactory.m1974m(user, loopInputType, vwb.Q(vwb.n(arrayList, new vka0()), new w9j() { // from class: l.dla0
                    public final Object call(Object obj) {
                        return ((LoopSelectFillData) obj).m2062b();
                    }
                }));
                return;
            } else {
                LoopFragmentFactory.m1974m(user, loopInputType, vwb.Q(vwb.n(arrayList, new vka0()), new w9j() { // from class: l.ela0
                    public final Object call(Object obj) {
                        return ((LoopSelectFillData) obj).m2061a();
                    }
                }));
                return;
            }
        }
        if (m16012A0()) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((lla0) s7mVar).f14927e.m3559m0(user, ((lla0) s7mVar).f14933k.pageId());
        }
        int i = this.f13859c;
        if (i < 0 || i > this.f13857a.size()) {
            return;
        }
        LoopFragmentFactory.m1973l(user, this.f13858b, this.f13857a.get(this.f13859c).m2062b(), this.f13857a.get(this.f13859c).m2061a(), this.f13859c);
    }

    /* JADX INFO: renamed from: u0 */
    public final CategorySuggestions m16030u0() {
        return ura.e().d().Mk();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m16031x0() {
        if (m16033z0()) {
            LoopInputType loopInputType = this.f13858b;
            LoopInputType loopInputType2 = LoopInputType.GAME_NAME;
            if (loopInputType == loopInputType2 || loopInputType == LoopInputType.GAME_TOGETHER) {
                String str = this.f13862f.f1275G;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                User userPa = CoreModule.c.e0.Pa(str);
                if (NullChecker.a(userPa) && NullChecker.a(userPa.profile) && NullChecker.a(userPa.profile.extensions) && NullChecker.a(userPa.profile.extensions.game)) {
                    if (this.f13858b == loopInputType2 && !vwb.J(userPa.profile.extensions.game.name)) {
                        String str2 = (String) userPa.profile.extensions.game.name.get(0);
                        if (!TextUtils.isEmpty(str2)) {
                            for (LoopSelectFillData loopSelectFillData : this.f13857a) {
                                if (TextUtils.equals(loopSelectFillData.m2061a(), str2)) {
                                    loopSelectFillData.m2069i(true);
                                }
                            }
                        }
                    } else if (this.f13858b == LoopInputType.GAME_TOGETHER && !vwb.J(userPa.profile.extensions.game.together)) {
                        List list = userPa.profile.extensions.game.together;
                        String str3 = "cpdd";
                        if (!list.contains("cpdd")) {
                            str3 = "组队";
                            if (!list.contains("组队")) {
                                str3 = "求大佬";
                                if (!list.contains("求大佬")) {
                                    str3 = "找战队";
                                    if (!list.contains("找战队")) {
                                        str3 = "其他";
                                        if (!list.contains("其他")) {
                                            str3 = "";
                                        }
                                    }
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            for (LoopSelectFillData loopSelectFillData2 : this.f13857a) {
                                if (TextUtils.equals(loopSelectFillData2.m2061a(), str3)) {
                                    loopSelectFillData2.m2069i(true);
                                }
                            }
                        }
                    }
                    ((lla0) ((jq2) this).viewModel).m17311u();
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m16032y0() {
        LoopInputType loopInputType = (LoopInputType) ((lla0) ((jq2) this).viewModel).m17299e().getSerializable("loop_input_type");
        this.f13858b = loopInputType;
        this.f13857a = LoopFragmentFactory.m1977p(loopInputType, ((lla0) ((jq2) this).viewModel).m17300f().m1991a2().m2043u0());
        if ((lqa.f() && this.f13862f.m2081U4()) || TextUtils.equals("from_card_guide_improve_profile", this.f13862f.f1274F)) {
            vwb.e0(this.f13857a, new w9j() { // from class: l.fla0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m2061a().equals(CoreModule.b.getString(R.string.l2)));
                }
            });
        }
        ((lla0) ((jq2) this).viewModel).m17308p(this.f13858b);
        ((lla0) ((jq2) this).viewModel).m17307n(this.f13857a);
        if (this.f13858b == LoopInputType.HOMETOWN && !((Boolean) f13856g.get()).booleanValue() && lqa.g()) {
            f13856g.put(Boolean.TRUE);
        }
        if (!m16012A0()) {
            ((lla0) ((jq2) this).viewModel).m17301i();
        }
        if (this.f13858b == LoopInputType.QUALIFICATION) {
            ((lla0) ((jq2) this).viewModel).m17311u();
        }
        LoopInputType loopInputType2 = this.f13858b;
        if (loopInputType2 == LoopInputType.GAME_NAME || loopInputType2 == LoopInputType.GAME_TOGETHER || loopInputType2 == LoopInputType.GROWTH_FOOD) {
            this.f13860d = true;
        }
        if (this.f13860d) {
            ((lla0) ((jq2) this).viewModel).m17311u();
        }
        if (this.f13858b == LoopInputType.PET && lqa.w()) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((lla0) s7mVar).m17304k(((lla0) s7mVar).m17300f().m1991a2().m2043u0());
        } else {
            xdl0.M(((lla0) ((jq2) this).viewModel).f14927e, false);
        }
        m16031x0();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m16033z0() {
        return TextUtils.equals("from_card_guide_improve_profile", this.f13862f.f1274F);
    }

    public void destroy() {
    }
}
