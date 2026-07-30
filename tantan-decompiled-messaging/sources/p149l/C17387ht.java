package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.AccountNewCropperAct;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaPickerAct;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Gender;

/* JADX INFO: renamed from: l.ht */
/* JADX INFO: loaded from: classes9.dex */
public class C17387ht extends C4699a {
    public C17387ht(PutongAct putongAct) {
        super(putongAct);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: a */
    public void mo29653a(String str) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountNewCropperAct.m28382E1(putongAct, str), Act.CROP_IMAGE);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: d */
    public void mo29656d(int i, boolean z, boolean z2, boolean z3) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29179a2(putongAct, i, z, z2, z3), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: e */
    public void mo29657e(int i, boolean z, boolean z2, boolean z3, int i2) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29179a2(putongAct, i, z, z2, z3), i2);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: f */
    public void mo29658f(int i, boolean z, boolean z2, boolean z3, String str) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29180b2(putongAct, i, z, z2, z3, str), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: g */
    public void mo29659g(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29180b2(putongAct, i, z, z2, z3, str), i2);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: h */
    public void mo29660h(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29182d2(putongAct, i, z, z2, z3, null, AccountMediaPickerAct.f17013C, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: i */
    public void mo29661i(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29182d2(putongAct, i, z, z2, z3, str, AccountMediaPickerAct.f17013C, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: m */
    public void mo29665m(boolean z) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m29179a2(putongAct, -1, z, true, false), PutongAct.REQUEST_CODE_PICKER);
    }
}
