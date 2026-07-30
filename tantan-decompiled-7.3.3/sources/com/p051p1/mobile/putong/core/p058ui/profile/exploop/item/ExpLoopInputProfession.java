package com.p051p1.mobile.putong.core.p058ui.profile.exploop.item;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SearchPriority;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerification;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.a30;
import p153l.ctz;
import p153l.jyb;
import p153l.psd0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpLoopInputProfession extends ExpLoopInputType {
    private boolean hasCanceledStudentVerification;
    private final ArrayList<String> list;
    private final Map<String, List<String>> map;

    public ExpLoopInputProfession() {
        super(12, "你的职业是?", ExpLoopInputType.ICON_PROFESSION, 3);
        this.list = new ArrayList<>();
        this.map = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelStudentVerificationDlg$1(ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        resetDataToStudent();
        if (expProfileEditLoopBaseFrag instanceof ExpProfileLoopWheelTypeFrag) {
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m52581c5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillInputContentData$0(ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData, User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag, Integer num, String str, Integer num2) {
        if (num.intValue() == 1) {
            expProfileLoopWheelTypeData.wheelData2 = this.map.get(str);
            String str2 = user.profile.work.department;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.list.get(0);
            }
            expProfileLoopWheelTypeData.selectItem2 = str2;
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m52581c5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$patchCancelStudentVerification$3(ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag, uxj0 uxj0Var) {
        Settings settings;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userM52428N4 = expProfileEditLoopBaseFrag.m52428N4();
        if (userM52428N4.settings != null && (settings = userM116600p9.settings) != null) {
            userM52428N4.settings = settings;
        }
        this.hasCanceledStudentVerification = true;
        expProfileEditLoopBaseFrag.m21598s4();
        expProfileEditLoopBaseFrag.m52426M4().m52414b2().m110171q0();
    }

    private ArrayList<String> parseData() {
        JSONArray jSONArray;
        this.map.clear();
        String strM80485F = RemoteConfig.m80481x().m80485F("profile_industries_departments");
        if (TextUtils.isEmpty(strM80485F)) {
            return jyb.m147507f0(new String[0]);
        }
        try {
            jSONArray = new JSONArray(strM80485F);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(jSONArray) && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
                    arrayList.add(string);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("departments");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(jSONArray2.getString(i2));
                    }
                    this.map.put(string, arrayList2);
                } catch (JSONException e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: patchCancelStudentVerification, reason: merged with bridge method [inline-methods] */
    public void lambda$cancelStudentVerificationDlg$2(final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userMo225055clone = userM116600p9.mo225055clone();
        if (NullChecker.m82486a(userMo225055clone.settings)) {
            StudentVerification studentVerification = userMo225055clone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get("default");
            if (NullChecker.m82487b(userMo225055clone.settings.getSearchPriority())) {
                userMo225055clone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userMo225055clone.subtract(userM116600p9);
        if (NullChecker.m82486a(userSubtract)) {
            expProfileEditLoopBaseFrag.m21594o4(R$string.f28619R0);
            expProfileEditLoopBaseFrag.duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.ggf
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f104017a.lambda$patchCancelStudentVerification$3(expProfileEditLoopBaseFrag, (uxj0) obj);
                }
            }, new y20() { // from class: l.hgf
                @Override // p153l.y20
                public final void call(Object obj) {
                    expProfileEditLoopBaseFrag.m21598s4();
                }
            }));
        }
    }

    private void resetDataToStudent() {
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String string = CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.R$string.f19684tl);
        wheelType.selectItem1 = string;
        wheelType.wheelData2 = this.map.get(string);
        wheelType.selectItem2 = string;
    }

    public void cancelStudentVerificationDlg(final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        expProfileEditLoopBaseFrag.act().dialog().m21502E0(R$string.f28708h2).m21499D(R$string.f28714i2).m21543n0(expProfileEditLoopBaseFrag.act().getString(R$string.f28663a), new Runnable() { // from class: l.dgf
            @Override // java.lang.Runnable
            public final void run() {
                this.f88295a.lambda$cancelStudentVerificationDlg$1(expProfileEditLoopBaseFrag);
            }
        }).m21559v0(expProfileEditLoopBaseFrag.getString(R$string.f28684d2), new Runnable() { // from class: l.egf
            @Override // java.lang.Runnable
            public final void run() {
                this.f93922a.lambda$cancelStudentVerificationDlg$2(expProfileEditLoopBaseFrag);
            }
        }).m21567z0();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean checkOnComplete(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        if (!user.profile.studies.active || !NullChecker.m82486a(user.settings) || !TEnum.equals(user.settings.verification.studies.status, "verified") || getData().getWheelType().selectItem1.contains("学生") || getData().getWheelType().selectItem1.contains("Student")) {
            return true;
        }
        cancelStudentVerificationDlg(expProfileEditLoopBaseFrag);
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(final User user, final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        this.list.clear();
        this.list.addAll(parseData());
        final ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.R$string.f19684tl);
        }
        if (jyb.m147479J(this.list)) {
            expProfileLoopWheelTypeData.fillWithEmpty(2, "-");
            setData(expProfileLoopWheelTypeData);
            return;
        }
        if (expProfileEditLoopBaseFrag.f34132z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            jyb.m147503d0(this.list, new ctz("暂不透露"));
        }
        expProfileLoopWheelTypeData.wheelData1 = this.list;
        if (TextUtils.isEmpty(string)) {
            string = this.list.get(0);
        }
        expProfileLoopWheelTypeData.selectItem1 = string;
        if (TextUtils.isEmpty(string)) {
            expProfileLoopWheelTypeData.selectItem2 = "-";
            expProfileLoopWheelTypeData.wheelData2 = jyb.m147507f0("-");
        } else {
            expProfileLoopWheelTypeData.wheelData2 = this.map.get(expProfileLoopWheelTypeData.selectItem1);
            String str = user.profile.work.department;
            if (TextUtils.isEmpty(str)) {
                str = this.list.get(0);
            }
            expProfileLoopWheelTypeData.selectItem2 = str;
        }
        setData(expProfileLoopWheelTypeData);
        if (expProfileEditLoopBaseFrag instanceof ExpProfileLoopWheelTypeFrag) {
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m52583e5(new a30() { // from class: l.fgf
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f98923a.lambda$fillInputContentData$0(expProfileLoopWheelTypeData, user, expProfileEditLoopBaseFrag, (Integer) obj, (String) obj2, (Integer) obj3);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_occupation";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "occupation";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9.settings) && NullChecker.m82487b(userM116600p9.settings.verification) && NullChecker.m82487b(userM116600p9.settings.verification.studies) && TEnum.equals(userM116600p9.settings.verification.studies.status, "pending")) {
            return true;
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT) {
            Profile profile = user.profile;
            if (profile.studies.active) {
                return true;
            }
            Work work = profile.work;
            String str = work.industry;
            String str2 = work.department;
            String string = CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.R$string.f19870zl);
            if (!TextUtils.equals(str2, string)) {
                TextUtils.equals(str2, "其它");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str, string) || TextUtils.equals(str, "其它")) {
                return false;
            }
        } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            Work work2 = user.profile.work;
            boolean z = work2 == null || TextUtils.isEmpty(work2.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.R$string.f19066Zj));
            Work work3 = user.profile.work;
            return !(z || (work3 == null || TextUtils.isEmpty(work3.department) || TextUtils.equals(user.profile.work.department, CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.R$string.f19066Zj)))) || user.profile.studies.active;
        }
        return !TextUtils.isEmpty(user.profile.work.industry) || user.profile.studies.active;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        boolean zEquals;
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        Profile profile = user.profile;
        Work work = profile.work;
        String str = work.industry;
        String str2 = work.department;
        if (profile.studies.active) {
            zEquals = TextUtils.equals(CoreModule.f18263b.getString(com.p051p1.mobile.putong.core.R$string.f19684tl), wheelType.selectItem1);
        } else {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, wheelType.selectItem1)) {
                return true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String str3 = wheelType.selectItem2;
            zEquals = !zIsEmpty ? TextUtils.equals(str2, str3) : TextUtils.equals("-", str3);
        }
        return !zEquals;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String str = wheelType.selectItem1;
        String str2 = wheelType.selectItem2;
        if (TextUtils.equals(str, "-")) {
            str = "";
        }
        if (TextUtils.equals(str2, "-")) {
            str2 = "";
        }
        user.profile.work.industry = "暂不透露".equals(str) ? "" : str;
        if (str.contains("学生") || str.contains("Student")) {
            Profile profile = user.profile;
            profile.studies.active = true;
            profile.work.active = false;
            return;
        }
        Profile profile2 = user.profile;
        profile2.studies.active = false;
        Work work = profile2.work;
        work.active = true;
        work.department = "暂不透露".equals(str2) ? "" : str2;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (this.hasCanceledStudentVerification) {
            Profile profile3 = user.profile;
            Studies studies = profile3.studies;
            Profile profile4 = userM116600p9.profile;
            Studies studies2 = profile4.studies;
            studies.verified = studies2.verified;
            studies.school = studies2.school;
            profile3.school = profile4.school;
        }
    }
}
