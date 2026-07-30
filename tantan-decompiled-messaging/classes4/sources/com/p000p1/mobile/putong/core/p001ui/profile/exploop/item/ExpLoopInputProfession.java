package com.p000p1.mobile.putong.core.p001ui.profile.exploop.item;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeData;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopWheelTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.SearchPriority;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e30;
import l.g30;
import l.mkd0;
import l.roj0;
import l.vwb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.fkz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m1879c5();
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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m1879c5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$patchCancelStudentVerification$3(ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag, roj0 roj0Var) {
        Settings settings;
        User userP9 = CoreModule.c.e0.p9();
        User userM1700N4 = expProfileEditLoopBaseFrag.m1700N4();
        if (userM1700N4.settings != null && (settings = userP9.settings) != null) {
            userM1700N4.settings = settings;
        }
        this.hasCanceledStudentVerification = true;
        expProfileEditLoopBaseFrag.s4();
        expProfileEditLoopBaseFrag.m1698M4().m1686a2().m24655q0();
    }

    private ArrayList<String> parseData() {
        JSONArray jSONArray;
        this.map.clear();
        String strF = RemoteConfig.x().F("profile_industries_departments");
        if (TextUtils.isEmpty(strF)) {
            return vwb.f0(new String[0]);
        }
        try {
            jSONArray = new JSONArray(strF);
        } catch (JSONException unused) {
            jSONArray = null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (NullChecker.a(jSONArray) && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("name");
                    arrayList.add(string);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("departments");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(jSONArray2.getString(i2));
                    }
                    this.map.put(string, arrayList2);
                } catch (JSONException e) {
                    CrashHelper.c(e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: patchCancelStudentVerification, reason: merged with bridge method [inline-methods] */
    public void lambda$cancelStudentVerificationDlg$2(final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        User userP9 = CoreModule.c.e0.p9();
        User userClone = userP9.clone();
        if (NullChecker.a(userClone.settings)) {
            StudentVerification studentVerification = userClone.settings.verification.studies;
            studentVerification.school = "";
            studentVerification.status = StudentVerificationStatus.get("default");
            if (NullChecker.b(userClone.settings.getSearchPriority())) {
                userClone.settings.getSearchPriority().remove(SearchPriority.get("student"));
            }
        }
        User userSubtract = userClone.subtract(userP9);
        if (NullChecker.a(userSubtract)) {
            expProfileEditLoopBaseFrag.o4(R.string.R0);
            expProfileEditLoopBaseFrag.duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.aff
                public final void call(Object obj) {
                    this.f7533a.lambda$patchCancelStudentVerification$3(expProfileEditLoopBaseFrag, (roj0) obj);
                }
            }, new e30() { // from class: l.bff
                public final void call(Object obj) {
                    expProfileEditLoopBaseFrag.s4();
                }
            }));
        }
    }

    private void resetDataToStudent() {
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String string = CoreModule.b.getString(com.p1.mobile.putong.core.R.string.Xk);
        wheelType.selectItem1 = string;
        wheelType.wheelData2 = this.map.get(string);
        wheelType.selectItem2 = string;
    }

    public void cancelStudentVerificationDlg(final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        expProfileEditLoopBaseFrag.act().dialog().E0(R.string.h2).D(R.string.i2).n0(expProfileEditLoopBaseFrag.act().getString(R.string.a), new Runnable() { // from class: l.xef
            @Override // java.lang.Runnable
            public final void run() {
                this.f22244a.lambda$cancelStudentVerificationDlg$1(expProfileEditLoopBaseFrag);
            }
        }).v0(expProfileEditLoopBaseFrag.getString(R.string.d2), new Runnable() { // from class: l.yef
            @Override // java.lang.Runnable
            public final void run() {
                this.f22821a.lambda$cancelStudentVerificationDlg$2(expProfileEditLoopBaseFrag);
            }
        }).z0();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean checkOnComplete(User user, ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        if (!user.profile.studies.active || !NullChecker.a(user.settings) || !TEnum.equals(user.settings.verification.studies.status, "verified") || getData().getWheelType().selectItem1.contains("学生") || getData().getWheelType().selectItem1.contains("Student")) {
            return true;
        }
        cancelStudentVerificationDlg(expProfileEditLoopBaseFrag);
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void fillInputContentData(final User user, final ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag) {
        this.list.clear();
        this.list.addAll(parseData());
        final ExpProfileLoopWheelTypeData expProfileLoopWheelTypeData = new ExpProfileLoopWheelTypeData();
        Profile profile = user.profile;
        String string = profile.work.industry;
        if (profile.studies.active) {
            string = CoreModule.b.getString(com.p1.mobile.putong.core.R.string.Xk);
        }
        if (vwb.J(this.list)) {
            expProfileLoopWheelTypeData.fillWithEmpty(2, ExpProfileLoopWheelTypeData.NONE_STR);
            setData(expProfileLoopWheelTypeData);
            return;
        }
        if (expProfileEditLoopBaseFrag.f1106z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            vwb.d0(this.list, new fkz("暂不透露"));
        }
        expProfileLoopWheelTypeData.wheelData1 = this.list;
        if (TextUtils.isEmpty(string)) {
            string = this.list.get(0);
        }
        expProfileLoopWheelTypeData.selectItem1 = string;
        if (TextUtils.isEmpty(string)) {
            expProfileLoopWheelTypeData.selectItem2 = ExpProfileLoopWheelTypeData.NONE_STR;
            expProfileLoopWheelTypeData.wheelData2 = vwb.f0(new String[]{ExpProfileLoopWheelTypeData.NONE_STR});
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
            ((ExpProfileLoopWheelTypeFrag) expProfileEditLoopBaseFrag).m1881e5(new g30() { // from class: l.zef
                /* JADX INFO: renamed from: a */
                public final void m27174a(Object obj, Object obj2, Object obj3) {
                    this.f23359a.lambda$fillInputContentData$0(expProfileLoopWheelTypeData, user, expProfileEditLoopBaseFrag, (Integer) obj, (String) obj2, (Integer) obj3);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageId() {
        return "p_edit_occupation";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public String getPageName() {
        return "occupation";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasInfoExist(User user, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9.settings) && NullChecker.b(userP9.settings.verification) && NullChecker.b(userP9.settings.verification.studies) && TEnum.equals(userP9.settings.verification.studies.status, "pending")) {
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
            String string = CoreModule.b.getString(com.p1.mobile.putong.core.R.string.dl);
            if (!TextUtils.equals(str2, string)) {
                TextUtils.equals(str2, "其它");
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.equals(str, string) || TextUtils.equals(str, "其它")) {
                return false;
            }
        } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            Work work2 = user.profile.work;
            boolean z = work2 == null || TextUtils.isEmpty(work2.industry) || TextUtils.equals(user.profile.work.industry, CoreModule.b.getString(com.p1.mobile.putong.core.R.string.Dj));
            Work work3 = user.profile.work;
            return !(z || (work3 == null || TextUtils.isEmpty(work3.department) || TextUtils.equals(user.profile.work.department, CoreModule.b.getString(com.p1.mobile.putong.core.R.string.Dj)))) || user.profile.studies.active;
        }
        return !TextUtils.isEmpty(user.profile.work.industry) || user.profile.studies.active;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public boolean hasWheelDataChanged(User user) {
        boolean zEquals;
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        Profile profile = user.profile;
        Work work = profile.work;
        String str = work.industry;
        String str2 = work.department;
        if (profile.studies.active) {
            zEquals = TextUtils.equals(CoreModule.b.getString(com.p1.mobile.putong.core.R.string.Xk), wheelType.selectItem1);
        } else {
            if (TextUtils.isEmpty(str) || !TextUtils.equals(str, wheelType.selectItem1)) {
                return true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String str3 = wheelType.selectItem2;
            zEquals = !zIsEmpty ? TextUtils.equals(str2, str3) : TextUtils.equals(ExpProfileLoopWheelTypeData.NONE_STR, str3);
        }
        return !zEquals;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType
    public void saveUserInfo(User user) {
        super.saveUserInfo(user);
        ExpProfileLoopWheelTypeData wheelType = getData().getWheelType();
        String str = wheelType.selectItem1;
        String str2 = wheelType.selectItem2;
        if (TextUtils.equals(str, ExpProfileLoopWheelTypeData.NONE_STR)) {
            str = "";
        }
        if (TextUtils.equals(str2, ExpProfileLoopWheelTypeData.NONE_STR)) {
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
        User userP9 = CoreModule.c.e0.p9();
        if (this.hasCanceledStudentVerification) {
            Profile profile3 = user.profile;
            Studies studies = profile3.studies;
            Profile profile4 = userP9.profile;
            Studies studies2 = profile4.studies;
            studies.verified = studies2.verified;
            studies.school = studies2.school;
            profile3.school = profile4.school;
        }
    }
}
