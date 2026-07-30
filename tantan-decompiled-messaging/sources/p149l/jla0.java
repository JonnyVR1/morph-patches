package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.HometownChinaItem;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopSelectInputAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.SearchPriority;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jla0 extends jq2<lla0> {

    /* JADX INFO: renamed from: g */
    public static hpd0 f118499g = new hpd0("isEnterHometownPager" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f118500a;

    /* JADX INFO: renamed from: b */
    public LoopInputType f118501b;

    /* JADX INFO: renamed from: c */
    public int f118502c;

    /* JADX INFO: renamed from: d */
    public boolean f118503d;

    /* JADX INFO: renamed from: e */
    public List<Integer> f118504e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopSelectInputFrag f118505f;

    public jla0(mcr mcrVar) {
        super(mcrVar);
        this.f118500a = new ArrayList<>();
        this.f118502c = -1;
        this.f118503d = false;
        this.f118504e = new ArrayList();
        this.f118505f = (ProfileLoopSelectInputFrag) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m142017E0(Bundle bundle) {
        m142048y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void m142031C0() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userMo223809clone = userM169527p9.mo223809clone();
        StudentVerification studentVerification = userMo223809clone.settings.verification.studies;
        studentVerification.school = "";
        studentVerification.status = StudentVerificationStatus.get("default");
        if (NullChecker.m81304b(userMo223809clone.settings.getSearchPriority())) {
            userMo223809clone.settings.getSearchPriority().remove(SearchPriority.get("student"));
        }
        User userSubtract = userMo223809clone.subtract(userM169527p9);
        if (NullChecker.m81303a(userSubtract)) {
            act().progress(R$string.f27771R0);
            act().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.yka0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198741a.m142035H0((roj0) obj);
                }
            }, new e30() { // from class: l.zka0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203525a.m142036I0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m142030A0() {
        return this.f118501b == LoopInputType.PET && lqa.m150985w();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m142032D0(DialogInterface dialogInterface) {
        ((lla0) this.viewModel).m150455j();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m142033F0() {
        m142038L0(this.f118502c);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m142034G0() {
        ((lla0) this.viewModel).f128670f.m52963f();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m142035H0(roj0 roj0Var) {
        act().progressDismiss();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userM51559u0 = ((lla0) this.viewModel).m150453f().m51509a2().m51559u0();
        Profile profile = userM51559u0.profile;
        Studies studies = profile.studies;
        Profile profile2 = userM169527p9.profile;
        Studies studies2 = profile2.studies;
        studies.verified = studies2.verified;
        studies.school = studies2.school;
        profile.school = profile2.school;
        LoopSelectFillData loopSelectFillData = this.f118500a.get(this.f118502c);
        userM51559u0.profile.work.industry = loopSelectFillData.m51575a();
        Profile profile3 = userM51559u0.profile;
        profile3.work.active = true;
        profile3.studies.active = false;
        m142039N0(this.f118502c, false);
        ((lla0) this.viewModel).m150455j();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m142036I0(Throwable th) {
        act().progressDismiss();
        ((lla0) this.viewModel).m150455j();
    }

    /* JADX INFO: renamed from: J0 */
    public void m142037J0(int i, int i2, Intent intent) {
        int i3;
        String stringExtra = intent.getStringExtra("loop_result_key");
        if (i == LoopInputType.HOMETOWN_CITY.requestCode) {
            String stringExtra2 = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra2) || (i3 = this.f118502c) < 0 || i3 >= this.f118500a.size()) {
                return;
            }
            ((lla0) this.viewModel).m150461q();
            this.f118500a.get(this.f118502c).m51582h(stringExtra2);
            e51.m114744I(((lla0) this.viewModel).f128675k, new Runnable() { // from class: l.bla0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76172a.m142034G0();
                }
            }, 300L);
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        ((lla0) this.viewModel).m150461q();
        ArrayList arrayList = new ArrayList();
        Iterator<LoopSelectFillData> it = this.f118500a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LoopSelectFillData next = it.next();
            if (!TextUtils.equals(stringExtra, next.m51575a())) {
                next.m51583i(false);
                arrayList.add(next);
            }
        }
        LoopSelectFillData loopSelectFillData = new LoopSelectFillData(stringExtra);
        loopSelectFillData.m51583i(true);
        this.f118502c = arrayList.size() > 0 ? 1 : 0;
        arrayList.add(arrayList.size() > 0 ? 1 : 0, loopSelectFillData);
        this.f118500a.clear();
        this.f118500a.addAll(arrayList);
        ((lla0) this.viewModel).m150459n(this.f118500a);
        e51.m114744I(((lla0) this.viewModel).f128675k, new Runnable() { // from class: l.cla0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81379a.m142033F0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: L0 */
    public void m142038L0(int i) {
        m142039N0(i, true);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x012d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x012d, please report this as an issue */
    /* JADX INFO: renamed from: N0 */
    public void m142039N0(final int i, boolean z) {
        boolean z2;
        String strM51575a;
        LoopSelectFillData loopSelectFillData = this.f118500a.get(i);
        this.f118502c = i;
        if (loopSelectFillData.m51579e()) {
            LoopEditInfo loopEditInfoM51494o = LoopFragmentFactory.m51494o(this.f118501b, ((lla0) this.viewModel).m150453f().m51509a2().m51559u0(), act());
            Intent intentM51638b2 = ProfileLoopCreateTagAct.m51638b2(loopEditInfoM51494o, m142773Y());
            wua0.m205597a(loopEditInfoM51494o, "loopInputClick");
            ((lla0) this.viewModel).f128675k.startActivityForResult(intentM51638b2, 0);
            return;
        }
        if (z && m142043r0(i)) {
            return;
        }
        if (z) {
            m142040P0(i);
        }
        if (this.f118501b == LoopInputType.HOMETOWN) {
            List<String> arrayList = new ArrayList<>();
            if (lqa.m150969g()) {
                if (NullChecker.m81303a(LoopFragmentFactory.m51500u())) {
                    if (loopSelectFillData.m51578d() != LoopSelectFillData.LoopSelectType.SELECT_OVERSEAS) {
                        for (HometownChinaItem hometownChinaItem : LoopFragmentFactory.m51500u().china) {
                            if (hometownChinaItem.region.equals(loopSelectFillData.m51575a())) {
                                arrayList = hometownChinaItem.subRegion;
                                break;
                            }
                        }
                    } else {
                        arrayList = LoopFragmentFactory.m51473Q(vwb.m200290D(LoopFragmentFactory.m51500u().overseas));
                        z2 = true;
                    }
                }
                if (!vwb.m200296J(arrayList)) {
                    Intent intentM51678c2 = ProfileLoopSelectInputAct.m51678c2(m142773Y(), loopSelectFillData.m51575a(), z2);
                    wua0.m205597a(((lla0) this.viewModel).m150453f().m51509a2().m51559u0(), "secondInput");
                    ((lla0) this.viewModel).f128675k.startActivityForResult(intentM51678c2, LoopInputType.HOMETOWN_CITY.requestCode);
                    return;
                } else if (lqa.m150969g()) {
                    strM51575a = loopSelectFillData.m51575a();
                    String string = CoreModule.f17544b.getString(R$string.f27773R2);
                    if (!"其他".equals(strM51575a) || string.equals(strM51575a)) {
                        loopSelectFillData.m51582h("·" + strM51575a);
                    } else {
                        loopSelectFillData.m51582h("中国·" + strM51575a);
                    }
                }
            } else if (NullChecker.m81303a(m142046u0())) {
                arrayList = m142046u0().hometown.get(loopSelectFillData.m51575a());
            }
            z2 = false;
            if (!vwb.m200296J(arrayList)) {
                Intent intentM51678c3 = ProfileLoopSelectInputAct.m51678c2(m142773Y(), loopSelectFillData.m51575a(), z2);
                wua0.m205597a(((lla0) this.viewModel).m150453f().m51509a2().m51559u0(), "secondInput");
                ((lla0) this.viewModel).f128675k.startActivityForResult(intentM51678c3, LoopInputType.HOMETOWN_CITY.requestCode);
                return;
            } else if (lqa.m150969g()) {
                strM51575a = loopSelectFillData.m51575a();
                String string2 = CoreModule.f17544b.getString(R$string.f27773R2);
                if ("其他".equals(strM51575a)) {
                    loopSelectFillData.m51582h("·" + strM51575a);
                } else {
                    loopSelectFillData.m51582h("·" + strM51575a);
                }
            }
        } else if (m142030A0()) {
            ((lla0) this.viewModel).f128668d.setVisible(false);
            xdl0.m208344M(((lla0) this.viewModel).f128669e, i == 0);
            ArrayList arrayListM200339n = vwb.m200339n(this.f118500a, new w9j() { // from class: l.gla0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m51580f());
                }
            });
            if (arrayListM200339n.size() >= 1 || loopSelectFillData.m51580f()) {
                ((LoopSelectFillData) arrayListM200339n.get(0)).m51583i(false);
            }
            loopSelectFillData.m51583i(true);
            ((lla0) this.viewModel).m150459n(this.f118500a);
            ((lla0) this.viewModel).m150462s(loopSelectFillData.m51577c());
            ((lla0) this.viewModel).m150463u();
            return;
        }
        LoopInputType loopInputType = this.f118501b;
        if (loopInputType == LoopInputType.QUALIFICATION) {
            ArrayList arrayListM200339n2 = vwb.m200339n(this.f118500a, new w9j() { // from class: l.hla0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m51580f());
                }
            });
            if (arrayListM200339n2.size() < 1 && !loopSelectFillData.m51580f()) {
                loopSelectFillData.m51583i(true);
                ((lla0) this.viewModel).m150459n(this.f118500a);
                ((lla0) this.viewModel).m150463u();
                return;
            } else {
                ((LoopSelectFillData) arrayListM200339n2.get(0)).m51583i(false);
                loopSelectFillData.m51583i(true);
                ((lla0) this.viewModel).m150459n(this.f118500a);
                ((lla0) this.viewModel).m150463u();
                return;
            }
        }
        if (!this.f118503d) {
            ((lla0) this.viewModel).m150461q();
            ((lla0) this.viewModel).f128670f.m52963f();
            return;
        }
        if (loopInputType == LoopInputType.GAME_NAME && !loopSelectFillData.m51580f() && vwb.m200323f(this.f118500a, new vka0()) >= 3) {
            lsi0.m151568F(act(), "最多选择3款游戏");
            return;
        }
        if (loopSelectFillData.m51580f()) {
            loopSelectFillData.m51583i(false);
            vwb.m200320d0(this.f118504e, new w9j() { // from class: l.ila0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Integer) obj).intValue() == i);
                }
            });
        } else {
            loopSelectFillData.m51583i(true);
            this.f118504e.add(Integer.valueOf(i));
        }
        ((lla0) this.viewModel).m150459n(this.f118500a);
        ((lla0) this.viewModel).m150463u();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m142040P0(int i) {
        ((lla0) this.viewModel).f128675k.m51608g5(i);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ala0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70421a.m142017E0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m142041p0() {
        if (this.f118501b == LoopInputType.QUALIFICATION) {
            return m142044s0();
        }
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m142042q0(boolean z) {
        act().dialog().m20503E0(z ? R$string.f27810Z : R$string.f27860h2).m20500D(z ? R$string.f27816a0 : R$string.f27866i2).m20543m0(act().getString(R$string.f27815a)).m20560v0(act().getString(R$string.f27836d2), new Runnable() { // from class: l.wka0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186738a.m142031C0();
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.xka0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f193278a.m142032D0(dialogInterface);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m142043r0(int i) {
        if (this.f118501b == LoopInputType.INDUSTRY) {
            if (!TextUtils.equals(this.f118500a.get(i).m51575a(), m142046u0().industry.get(0))) {
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification) && TEnum.equals(userM169527p9.settings.verification.studies.status, "verified")) {
                    m142042q0(false);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m142044s0() {
        return vwb.m200339n(this.f118500a, new vka0()).size() >= 1;
    }

    /* JADX INFO: renamed from: t0 */
    public void m142045t0(User user) {
        if (this.f118503d) {
            LoopInputType loopInputType = this.f118501b;
            LoopInputType loopInputType2 = LoopInputType.GROWTH_FOOD;
            ArrayList<LoopSelectFillData> arrayList = this.f118500a;
            if (loopInputType == loopInputType2) {
                LoopFragmentFactory.m51492m(user, loopInputType, vwb.m200303Q(vwb.m200339n(arrayList, new vka0()), new w9j() { // from class: l.dla0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((LoopSelectFillData) obj).m51576b();
                    }
                }));
                return;
            } else {
                LoopFragmentFactory.m51492m(user, loopInputType, vwb.m200303Q(vwb.m200339n(arrayList, new vka0()), new w9j() { // from class: l.ela0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((LoopSelectFillData) obj).m51575a();
                    }
                }));
                return;
            }
        }
        if (m142030A0()) {
            V v2 = this.viewModel;
            ((lla0) v2).f128669e.m53001m0(user, ((lla0) v2).f128675k.pageId());
        }
        int i = this.f118502c;
        if (i < 0 || i > this.f118500a.size()) {
            return;
        }
        LoopFragmentFactory.m51491l(user, this.f118501b, this.f118500a.get(this.f118502c).m51576b(), this.f118500a.get(this.f118502c).m51575a(), this.f118502c);
    }

    /* JADX INFO: renamed from: u0 */
    public final CategorySuggestions m142046u0() {
        return ura.m195053e().m195057d().mo33720Mk();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m142047x0() {
        if (m142049z0()) {
            LoopInputType loopInputType = this.f118501b;
            LoopInputType loopInputType2 = LoopInputType.GAME_NAME;
            if (loopInputType == loopInputType2 || loopInputType == LoopInputType.GAME_TOGETHER) {
                String str = this.f118505f.f33453G;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
                if (NullChecker.m81303a(userM169430Pa) && NullChecker.m81303a(userM169430Pa.profile) && NullChecker.m81303a(userM169430Pa.profile.extensions) && NullChecker.m81303a(userM169430Pa.profile.extensions.game)) {
                    if (this.f118501b == loopInputType2 && !vwb.m200296J(userM169430Pa.profile.extensions.game.name)) {
                        String str2 = userM169430Pa.profile.extensions.game.name.get(0);
                        if (!TextUtils.isEmpty(str2)) {
                            for (LoopSelectFillData loopSelectFillData : this.f118500a) {
                                if (TextUtils.equals(loopSelectFillData.m51575a(), str2)) {
                                    loopSelectFillData.m51583i(true);
                                }
                            }
                        }
                    } else if (this.f118501b == LoopInputType.GAME_TOGETHER && !vwb.m200296J(userM169430Pa.profile.extensions.game.together)) {
                        List<String> list = userM169430Pa.profile.extensions.game.together;
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
                            for (LoopSelectFillData loopSelectFillData2 : this.f118500a) {
                                if (TextUtils.equals(loopSelectFillData2.m51575a(), str3)) {
                                    loopSelectFillData2.m51583i(true);
                                }
                            }
                        }
                    }
                    ((lla0) this.viewModel).m150463u();
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m142048y0() {
        LoopInputType loopInputType = (LoopInputType) ((lla0) this.viewModel).m150452e().getSerializable("loop_input_type");
        this.f118501b = loopInputType;
        this.f118500a = LoopFragmentFactory.m51495p(loopInputType, ((lla0) this.viewModel).m150453f().m51509a2().m51559u0());
        if ((lqa.m150968f() && this.f118505f.m51595U4()) || TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f118505f.f33452F)) {
            vwb.m200322e0(this.f118500a, new w9j() { // from class: l.fla0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((LoopSelectFillData) obj).m51575a().equals(CoreModule.f17544b.getString(R$string.f27884l2)));
                }
            });
        }
        ((lla0) this.viewModel).m150460p(this.f118501b);
        ((lla0) this.viewModel).m150459n(this.f118500a);
        if (this.f118501b == LoopInputType.HOMETOWN && !f118499g.get().booleanValue() && lqa.m150969g()) {
            f118499g.put(Boolean.TRUE);
        }
        if (!m142030A0()) {
            ((lla0) this.viewModel).m150454i();
        }
        if (this.f118501b == LoopInputType.QUALIFICATION) {
            ((lla0) this.viewModel).m150463u();
        }
        LoopInputType loopInputType2 = this.f118501b;
        if (loopInputType2 == LoopInputType.GAME_NAME || loopInputType2 == LoopInputType.GAME_TOGETHER || loopInputType2 == LoopInputType.GROWTH_FOOD) {
            this.f118503d = true;
        }
        if (this.f118503d) {
            ((lla0) this.viewModel).m150463u();
        }
        if (this.f118501b == LoopInputType.PET && lqa.m150985w()) {
            V v2 = this.viewModel;
            ((lla0) v2).m150456k(((lla0) v2).m150453f().m51509a2().m51559u0());
        } else {
            xdl0.m208344M(((lla0) this.viewModel).f128669e, false);
        }
        m142047x0();
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m142049z0() {
        return TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f118505f.f33452F);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
