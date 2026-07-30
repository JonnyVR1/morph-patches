package p006l;

import com.p000p1.mobile.putong.account.p002ui.account.AccountNewCropperAct;
import com.p000p1.mobile.putong.account.p002ui.mediapicker.impl.AccountMediaPickerAct;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Gender;

/* JADX INFO: renamed from: l.ht */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0814ht extends C0125a {
    public C0814ht(PutongAct putongAct) {
        super(putongAct);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: a */
    public void mo1563a(String str) {
        PutongAct putongAct = this.f1183a;
        putongAct.startActivityForResult(AccountNewCropperAct.m277E1(putongAct, str), 24576);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: d */
    public void mo1566d(int i, boolean z, boolean z2, boolean z3) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1085a2(act, i, z, z2, z3), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: e */
    public void mo1567e(int i, boolean z, boolean z2, boolean z3, int i2) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1085a2(act, i, z, z2, z3), i2);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: f */
    public void mo1568f(int i, boolean z, boolean z2, boolean z3, String str) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1086b2(act, i, z, z2, z3, str), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: g */
    public void mo1569g(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1086b2(act, i, z, z2, z3, str), i2);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: h */
    public void mo1570h(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1088d2(act, i, z, z2, z3, null, AccountMediaPickerAct.f1002C, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: i */
    public void mo1571i(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1088d2(act, i, z, z2, z3, str, AccountMediaPickerAct.f1002C, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: m */
    public void mo1575m(boolean z) {
        Act act = this.f1183a;
        act.startActivityForResult(AccountMediaPickerAct.m1085a2(act, -1, z, true, false), PutongAct.REQUEST_CODE_PICKER);
    }
}
