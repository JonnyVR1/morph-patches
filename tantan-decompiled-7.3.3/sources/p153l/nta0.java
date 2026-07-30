package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSelectInputAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SearchPriority;
import com.p051p1.mobile.putong.data.StudentVerification;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nta0 extends ar2<pta0> {

    /* JADX INFO: renamed from: g */
    public static jxd0 f143587g = new jxd0("isEnterHometownPager" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f143588a;

    /* JADX INFO: renamed from: b */
    public LoopInputType f143589b;

    /* JADX INFO: renamed from: c */
    public int f143590c;

    /* JADX INFO: renamed from: d */
    public boolean f143591d;

    /* JADX INFO: renamed from: e */
    public List<Integer> f143592e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopSelectInputFrag f143593f;

    public nta0(ner nerVar) {
        super(nerVar);
        this.f143588a = new ArrayList<>();
        this.f143590c = -1;
        this.f143591d = false;
        this.f143592e = new ArrayList();
        this.f143593f = (ProfileLoopSelectInputFrag) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m164690E0(Bundle bundle) {
        m164721y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void m164704C0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userMo225055clone = userM116600p9.mo225055clone();
        StudentVerification studentVerification = userMo225055clone.settings.verification.studies;
        studentVerification.school = "";
        studentVerification.status = StudentVerificationStatus.get("default");
        if (NullChecker.m82487b(userMo225055clone.settings.getSearchPriority())) {
            userMo225055clone.settings.getSearchPriority().remove(SearchPriority.get("student"));
        }
        User userSubtract = userMo225055clone.subtract(userM116600p9);
        if (NullChecker.m82486a(userSubtract)) {
            act().progress(R$string.f28619R0);
            act().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.cta0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83676a.m164708H0((uxj0) obj);
                }
            }, new y20() { // from class: l.dta0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90557a.m164709I0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m164703A0() {
        return this.f143589b == LoopInputType.PET && xra.m212804w();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m164705D0(DialogInterface dialogInterface) {
        ((pta0) this.viewModel).m173742j();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m164706F0() {
        m164711L0(this.f143590c);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m164707G0() {
        ((pta0) this.viewModel).f154008f.m54146f();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m164708H0(uxj0 uxj0Var) {
        act().progressDismiss();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userM52742u0 = ((pta0) this.viewModel).m173740f().m52692b2().m52742u0();
        Profile profile = userM52742u0.profile;
        Studies studies = profile.studies;
        Profile profile2 = userM116600p9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        LoopSelectFillData loopSelectFillData = this.f143588a.get(this.f143590c);
        userM52742u0.profile.work.industry = loopSelectFillData.m52758a();
        Profile profile3 = userM52742u0.profile;
        profile3.work.active = true;
        profile3.studies.active = false;
        m164712N0(this.f143590c, false);
        ((pta0) this.viewModel).m173742j();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m164709I0(Throwable th) {
        act().progressDismiss();
        ((pta0) this.viewModel).m173742j();
    }

    /* JADX INFO: renamed from: J0 */
    public void m164710J0(int i, int i2, Intent intent) {
        int i3;
        String stringExtra = intent.getStringExtra("loop_result_key");
        if (i == LoopInputType.HOMETOWN_CITY.requestCode) {
            String stringExtra2 = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra2) || (i3 = this.f143590c) < 0 || i3 >= this.f143588a.size()) {
                return;
            }
            ((pta0) this.viewModel).m173748q();
            this.f143588a.get(this.f143590c).m52765h(stringExtra2);
            l51.m152889I(((pta0) this.viewModel).f154013k, new Runnable() { // from class: l.fta0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100726a.m164707G0();
                }
            }, 300L);
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        ((pta0) this.viewModel).m173748q();
        ArrayList arrayList = new ArrayList();
        Iterator<LoopSelectFillData> it = this.f143588a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LoopSelectFillData next = it.next();
            if (!TextUtils.equals(stringExtra, next.m52758a())) {
                next.m52766i(false);
                arrayList.add(next);
            }
        }
        LoopSelectFillData loopSelectFillData = new LoopSelectFillData(stringExtra);
        loopSelectFillData.m52766i(true);
        this.f143590c = arrayList.size() > 0 ? 1 : 0;
        arrayList.add(arrayList.size() > 0 ? 1 : 0, loopSelectFillData);
        this.f143588a.clear();
        this.f143588a.addAll(arrayList);
        ((pta0) this.viewModel).m173746n(this.f143588a);
        l51.m152889I(((pta0) this.viewModel).f154013k, new Runnable() { // from class: l.gta0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106394a.m164706F0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: L0 */
    public void m164711L0(int i) {
        m164712N0(i, true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x012d, please report this as an issue */
    /* JADX INFO: renamed from: N0 */
    public void m164712N0(final int i, boolean z) {
        boolean z2;
        String strM52758a;
        LoopSelectFillData loopSelectFillData = this.f143588a.get(i);
        this.f143590c = i;
        if (loopSelectFillData.m52762e()) {
            LoopEditInfo loopEditInfoM52677o = LoopFragmentFactory.m52677o(this.f143589b, ((pta0) this.viewModel).m173740f().m52692b2().m52742u0(), act());
            Intent intentM52821c2 = ProfileLoopCreateTagAct.m52821c2(loopEditInfoM52677o, m99640Y());
            a3b0.m95791a(loopEditInfoM52677o, "loopInputClick");
            ((pta0) this.viewModel).f154013k.startActivityForResult(intentM52821c2, 0);
            return;
        }
        if (z && m164716r0(i)) {
            return;
        }
        if (z) {
            m164713P0(i);
        }
        if (this.f143589b == LoopInputType.HOMETOWN) {
            List<String> arrayList = new ArrayList<>();
            if (xra.m212788g()) {
                if (NullChecker.m82486a(LoopFragmentFactory.m52683u())) {
                    if (loopSelectFillData.m52761d() != LoopSelectFillData.LoopSelectType.SELECT_OVERSEAS) {
                        for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m52683u().china) {
                            if (hometownChinaItem.region.equals(loopSelectFillData.m52758a())) {
                                arrayList = hometownChinaItem.subRegion;
                                break;
                            }
                        }
                    } else {
                        arrayList = LoopFragmentFactory.m52656Q(jyb.m147473D(LoopFragmentFactory.m52683u().overseas));
                        z2 = true;
                    }
                }
                if (!jyb.m147479J(arrayList)) {
                    Intent intentM52861d2 = ProfileLoopSelectInputAct.m52861d2(m99640Y(), loopSelectFillData.m52758a(), z2);
                    a3b0.m95791a(((pta0) this.viewModel).m173740f().m52692b2().m52742u0(), "secondInput");
                    ((pta0) this.viewModel).f154013k.startActivityForResult(intentM52861d2, LoopInputType.HOMETOWN_CITY.requestCode);
                    return;
                } else if (xra.m212788g()) {
                    strM52758a = loopSelectFillData.m52758a();
                    String string = CoreModule.f18263b.getString(R$string.f28621R2);
                    if (!"其他".equals(strM52758a) || string.equals(strM52758a)) {
                        loopSelectFillData.m52765h("·" + strM52758a);
                    } else {
                        loopSelectFillData.m52765h("中国·" + strM52758a);
                    }
                }
            } else if (NullChecker.m82486a(m164719u0())) {
                arrayList = m164719u0().hometown.get(loopSelectFillData.m52758a());
            }
            z2 = false;
            if (!jyb.m147479J(arrayList)) {
                Intent intentM52861d3 = ProfileLoopSelectInputAct.m52861d2(m99640Y(), loopSelectFillData.m52758a(), z2);
                a3b0.m95791a(((pta0) this.viewModel).m173740f().m52692b2().m52742u0(), "secondInput");
                ((pta0) this.viewModel).f154013k.startActivityForResult(intentM52861d3, LoopInputType.HOMETOWN_CITY.requestCode);
                return;
            } else if (xra.m212788g()) {
                strM52758a = loopSelectFillData.m52758a();
                String string2 = CoreModule.f18263b.getString(R$string.f28621R2);
                if ("其他".equals(strM52758a)) {
                    loopSelectFillData.m52765h("·" + strM52758a);
                } else {
                    loopSelectFillData.m52765h("·" + strM52758a);
                }
            }
        } else if (m164703A0()) {
            ((pta0) this.viewModel).f154006d.setVisible(false);
            bnl0.m105524M(((pta0) this.viewModel).f154007e, i == 0);
            ArrayList arrayListM147522n = jyb.m147522n(this.f143588a, new qcj() { // from class: l.kta0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m52763f());
                }
            });
            if (arrayListM147522n.size() >= 1 || loopSelectFillData.m52763f()) {
                ((LoopSelectFillData) arrayListM147522n.get(0)).m52766i(false);
            }
            loopSelectFillData.m52766i(true);
            ((pta0) this.viewModel).m173746n(this.f143588a);
            ((pta0) this.viewModel).m173749s(loopSelectFillData.m52760c());
            ((pta0) this.viewModel).m173750u();
            return;
        }
        LoopInputType loopInputType = this.f143589b;
        if (loopInputType == LoopInputType.QUALIFICATION) {
            ArrayList arrayListM147522n2 = jyb.m147522n(this.f143588a, new qcj() { // from class: l.lta0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m52763f());
                }
            });
            if (arrayListM147522n2.size() < 1 && !loopSelectFillData.m52763f()) {
                loopSelectFillData.m52766i(true);
                ((pta0) this.viewModel).m173746n(this.f143588a);
                ((pta0) this.viewModel).m173750u();
                return;
            } else {
                ((LoopSelectFillData) arrayListM147522n2.get(0)).m52766i(false);
                loopSelectFillData.m52766i(true);
                ((pta0) this.viewModel).m173746n(this.f143588a);
                ((pta0) this.viewModel).m173750u();
                return;
            }
        }
        if (!this.f143591d) {
            ((pta0) this.viewModel).m173748q();
            ((pta0) this.viewModel).f154008f.m54146f();
            return;
        }
        if (loopInputType == LoopInputType.GAME_NAME && !loopSelectFillData.m52763f() && jyb.m147506f(this.f143588a, new zsa0()) >= 3) {
            o1j0.m165624F(act(), "最多选择3款游戏");
            return;
        }
        if (loopSelectFillData.m52763f()) {
            loopSelectFillData.m52766i(false);
            jyb.m147503d0(this.f143592e, new qcj() { // from class: l.mta0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == i);
                }
            });
        } else {
            loopSelectFillData.m52766i(true);
            this.f143592e.add(Integer.valueOf(i));
        }
        ((pta0) this.viewModel).m173746n(this.f143588a);
        ((pta0) this.viewModel).m173750u();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m164713P0(int i) {
        ((pta0) this.viewModel).f154013k.m52791g5(i);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.eta0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95708a.m164690E0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m164714p0() {
        if (this.f143589b == LoopInputType.QUALIFICATION) {
            return m164717s0();
        }
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m164715q0(boolean z) {
        act().dialog().m21502E0(z ? R$string.f28658Z : R$string.f28708h2).m21499D(z ? R$string.f28664a0 : R$string.f28714i2).m21542m0(act().getString(R$string.f28663a)).m21559v0(act().getString(R$string.f28684d2), new Runnable() { // from class: l.ata0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73218a.m164704C0();
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.bta0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f78342a.m164705D0(dialogInterface);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m164716r0(int i) {
        if (this.f143589b == LoopInputType.INDUSTRY) {
            if (!TextUtils.equals(this.f143588a.get(i).m52758a(), m164719u0().industry.get(0))) {
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification) && TEnum.equals(userM116600p9.settings.verification.studies.status, "verified")) {
                    m164715q0(false);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m164717s0() {
        return jyb.m147522n(this.f143588a, new zsa0()).size() >= 1;
    }

    /* JADX INFO: renamed from: t0 */
    public void m164718t0(User user) {
        if (this.f143591d) {
            LoopInputType loopInputType = this.f143589b;
            LoopInputType loopInputType2 = LoopInputType.GROWTH_FOOD;
            ArrayList<LoopSelectFillData> arrayList = this.f143588a;
            if (loopInputType == loopInputType2) {
                LoopFragmentFactory.m52675m(user, loopInputType, jyb.m147486Q(jyb.m147522n(arrayList, new zsa0()), new qcj() { // from class: l.hta0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((LoopSelectFillData) obj).m52759b();
                    }
                }));
                return;
            } else {
                LoopFragmentFactory.m52675m(user, loopInputType, jyb.m147486Q(jyb.m147522n(arrayList, new zsa0()), new qcj() { // from class: l.ita0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((LoopSelectFillData) obj).m52758a();
                    }
                }));
                return;
            }
        }
        if (m164703A0()) {
            V v2 = this.viewModel;
            ((pta0) v2).f154007e.m54184m0(user, ((pta0) v2).f154013k.pageId());
        }
        int i = this.f143590c;
        if (i < 0 || i > this.f143588a.size()) {
            return;
        }
        LoopFragmentFactory.m52674l(user, this.f143589b, this.f143588a.get(this.f143590c).m52759b(), this.f143588a.get(this.f143590c).m52758a(), this.f143590c);
    }

    /* JADX INFO: renamed from: u0 */
    public final CategorySuggestions m164719u0() {
        return gta.m132210e().m132214d().mo34723Mk();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m164720x0() {
        if (m164722z0()) {
            LoopInputType loopInputType = this.f143589b;
            LoopInputType loopInputType2 = LoopInputType.GAME_NAME;
            if (loopInputType == loopInputType2 || loopInputType == LoopInputType.GAME_TOGETHER) {
                String str = this.f143593f.f34301G;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
                if (NullChecker.m82486a(userM116503Pa) && NullChecker.m82486a(userM116503Pa.profile) && NullChecker.m82486a(userM116503Pa.profile.extensions) && NullChecker.m82486a(userM116503Pa.profile.extensions.game)) {
                    if (this.f143589b == loopInputType2 && !jyb.m147479J(userM116503Pa.profile.extensions.game.name)) {
                        String str2 = userM116503Pa.profile.extensions.game.name.get(0);
                        if (!TextUtils.isEmpty(str2)) {
                            for (LoopSelectFillData loopSelectFillData : this.f143588a) {
                                if (TextUtils.equals(loopSelectFillData.m52758a(), str2)) {
                                    loopSelectFillData.m52766i(true);
                                }
                            }
                        }
                    } else if (this.f143589b == LoopInputType.GAME_TOGETHER && !jyb.m147479J(userM116503Pa.profile.extensions.game.together)) {
                        List<String> list = userM116503Pa.profile.extensions.game.together;
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
                            for (LoopSelectFillData loopSelectFillData2 : this.f143588a) {
                                if (TextUtils.equals(loopSelectFillData2.m52758a(), str3)) {
                                    loopSelectFillData2.m52766i(true);
                                }
                            }
                        }
                    }
                    ((pta0) this.viewModel).m173750u();
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m164721y0() {
        LoopInputType loopInputType = (LoopInputType) ((pta0) this.viewModel).m173739e().getSerializable("loop_input_type");
        this.f143589b = loopInputType;
        this.f143588a = LoopFragmentFactory.m52678p(loopInputType, ((pta0) this.viewModel).m173740f().m52692b2().m52742u0());
        if ((xra.m212787f() && this.f143593f.m52778U4()) || TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f143593f.f34300F)) {
            jyb.m147505e0(this.f143588a, new qcj() { // from class: l.jta0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m52758a().equals(CoreModule.f18263b.getString(R$string.f28732l2)));
                }
            });
        }
        ((pta0) this.viewModel).m173747p(this.f143589b);
        ((pta0) this.viewModel).m173746n(this.f143588a);
        if (this.f143589b == LoopInputType.HOMETOWN && !f143587g.get().booleanValue() && xra.m212788g()) {
            f143587g.put(Boolean.TRUE);
        }
        if (!m164703A0()) {
            ((pta0) this.viewModel).m173741i();
        }
        if (this.f143589b == LoopInputType.QUALIFICATION) {
            ((pta0) this.viewModel).m173750u();
        }
        LoopInputType loopInputType2 = this.f143589b;
        if (loopInputType2 == LoopInputType.GAME_NAME || loopInputType2 == LoopInputType.GAME_TOGETHER || loopInputType2 == LoopInputType.GROWTH_FOOD) {
            this.f143591d = true;
        }
        if (this.f143591d) {
            ((pta0) this.viewModel).m173750u();
        }
        if (this.f143589b == LoopInputType.PET && xra.m212804w()) {
            V v2 = this.viewModel;
            ((pta0) v2).m173743k(((pta0) v2).m173740f().m52692b2().m52742u0());
        } else {
            bnl0.m105524M(((pta0) this.viewModel).f154007e, false);
        }
        m164720x0();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m164722z0() {
        return TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f143593f.f34300F);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
