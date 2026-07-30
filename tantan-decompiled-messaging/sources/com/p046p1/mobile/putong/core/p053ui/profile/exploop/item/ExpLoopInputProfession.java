package com.p046p1.mobile.putong.core.p053ui.profile.exploop.item;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.SearchPriority;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.e30;
import p149l.fkz;
import p149l.g30;
import p149l.mkd0;
import p149l.roj0;
import p149l.vwb;

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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m51398c5();
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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m51398c5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$patchCancelStudentVerification$3(ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag, roj0 roj0Var) {
        Settings settings;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userM51245N4 = expProfileEditLoopBaseFrag.m51245N4();
        if (userM51245N4.settings != null && (settings = userM169527p9.settings) != null) {
            userM51245N4.settings = settings;
        }
        this.hasCanceledStudentVerification = true;
        expProfileEditLoopBaseFrag.m20599s4();
        expProfileEditLoopBaseFrag.m51243M4().m51231a2().m203205q0();
    }

    private ArrayList<String> parseData() {
        JSONArray jSONArray;
        this.map.clear();
        String strM79302F = RemoteConfig.m79298x().m79302F("profile_industries_departments");
        if (TextUtils.isEmpty(strM79302F)) {
            return vwb.m200324f0(new String[0]);
        }
        try {
            jSONArray = new JSONArray(strM79302F);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(jSONArray) && jSONArray.length() > 0) {
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
                    CrashHelper.m81296c(e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: patchCancelStudentVerification, reason: merged with bridge method [inline-methods] */
    public void lambda$cancelStudentVerificationDlg$2(final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userMo223809clone = userM169527p9.mo223809clone();
        if (NullChecker.m81303a(userMo223809clone.settings)) {
            StudentVerification studentVerification = userMo223809clone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get("default");
            if (NullChecker.m81304b(userMo223809clone.settings.getSearchPriority())) {
                userMo223809clone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userMo223809clone.subtract(userM169527p9);
        if (NullChecker.m81303a(userSubtract)) {
            expProfileEditLoopBaseFrag.m20595o4(R$string.f27771R0);
            expProfileEditLoopBaseFrag.duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.aff
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f69169a.lambda$patchCancelStudentVerification$3(expProfileEditLoopBaseFrag, (roj0) obj);
                }
            }, new e30() { // from class: l.bff
                @Override // p149l.e30
                public final void call(Object obj) {
                    expProfileEditLoopBaseFrag.m20599s4();
                }
            }));
        }
    }

    private void resetDataToStudent() {
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String string = CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.R$string.f18277Xk);
        wheelType.selectItem1 = string;
        wheelType.wheelData2 = this.map.get(string);
        wheelType.selectItem2 = string;
    }

    public void cancelStudentVerificationDlg(final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        expProfileEditLoopBaseFrag.act().dialog().m20503E0(R$string.f27860h2).m20500D(R$string.f27866i2).m20544n0(expProfileEditLoopBaseFrag.act().getString(R$string.f27815a), new Runnable() { // from class: l.xef
            @Override // java.lang.Runnable
            public final void run() {
                this.f192595a.lambda$cancelStudentVerificationDlg$1(expProfileEditLoopBaseFrag);
            }
        }).m20560v0(expProfileEditLoopBaseFrag.getString(R$string.f27836d2), new Runnable() { // from class: l.yef
            @Override // java.lang.Runnable
            public final void run() {
                this.f197682a.lambda$cancelStudentVerificationDlg$2(expProfileEditLoopBaseFrag);
            }
        }).m20568z0();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean checkOnComplete(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        if (!user.profile.studies.active || !NullChecker.m81303a(user.settings) || !TEnum.equals(user.settings.verification.studies.status, "verified") || getData().getWheelType().selectItem1.contains("学生") || getData().getWheelType().selectItem1.contains("Student")) {
            return true;
        }
        cancelStudentVerificationDlg(expProfileEditLoopBaseFrag);
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(final User user, final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        this.list.clear();
        this.list.addAll(parseData());
        final ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.R$string.f18277Xk);
        }
        if (vwb.m200296J(this.list)) {
            expProfileLoopWheelTypeData.fillWithEmpty(2, "-");
            setData(expProfileLoopWheelTypeData);
            return;
        }
        if (expProfileEditLoopBaseFrag.f33284z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            vwb.m200320d0(this.list, new fkz("暂不透露"));
        }
        expProfileLoopWheelTypeData.wheelData1 = this.list;
        if (TextUtils.isEmpty(string)) {
            string = this.list.get(0);
        }
        expProfileLoopWheelTypeData.selectItem1 = string;
        if (TextUtils.isEmpty(string)) {
            expProfileLoopWheelTypeData.selectItem2 = "-";
            expProfileLoopWheelTypeData.wheelData2 = vwb.m200324f0("-");
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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m51400e5(new g30() { // from class: l.zef
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f202810a.lambda$fillInputContentData$0(expProfileLoopWheelTypeData, user, expProfileEditLoopBaseFrag, (Integer) obj, (String) obj2, (Integer) obj3);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_occupation";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "occupation";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9.settings) && NullChecker.m81304b(userM169527p9.settings.verification) && NullChecker.m81304b(userM169527p9.settings.verification.studies) && TEnum.equals(userM169527p9.settings.verification.studies.status, "pending")) {
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
            String string = CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.R$string.f18461dl);
            if (!TextUtils.equals(str2, string)) {
                TextUtils.equals(str2, "其它");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str, string) || TextUtils.equals(str, "其它")) {
                return false;
            }
        } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            Work work2 = user.profile.work;
            boolean z = work2 == null || TextUtils.isEmpty(work2.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.R$string.f17676Dj));
            Work work3 = user.profile.work;
            return !(z || (work3 == null || TextUtils.isEmpty(work3.department) || TextUtils.equals(user.profile.work.department, CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.R$string.f17676Dj)))) || user.profile.studies.active;
        }
        return !TextUtils.isEmpty(user.profile.work.industry) || user.profile.studies.active;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        boolean zEquals;
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        Profile profile = user.profile;
        Work work = profile.work;
        String str = work.industry;
        String str2 = work.department;
        if (profile.studies.active) {
            zEquals = TextUtils.equals(CoreModule.f17544b.getString(com.p046p1.mobile.putong.core.R$string.f18277Xk), wheelType.selectItem1);
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

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType
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
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (this.hasCanceledStudentVerification) {
            Profile profile3 = user.profile;
            Studies studies = profile3.studies;
            Profile profile4 = userM169527p9.profile;
            Studies studies2 = profile4.studies;
            studies.verified = studies2.verified;
            studies.school = studies2.school;
            profile3.school = profile4.school;
        }
    }
}
