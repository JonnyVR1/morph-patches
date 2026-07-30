package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.AccountNewCropperAct;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaPickerAct;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Gender;

/* JADX INFO: renamed from: l.bt */
/* JADX INFO: loaded from: classes9.dex */
public class C16112bt extends C4850a {
    public C16112bt(PutongAct putongAct) {
        super(putongAct);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: a */
    public void mo30651a(String str) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountNewCropperAct.m29381F1(putongAct, str), Act.CROP_IMAGE);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: d */
    public void mo30654d(int i, boolean z, boolean z2, boolean z3) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30177b2(putongAct, i, z, z2, z3), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: e */
    public void mo30655e(int i, boolean z, boolean z2, boolean z3, int i2) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30177b2(putongAct, i, z, z2, z3), i2);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: f */
    public void mo30656f(int i, boolean z, boolean z2, boolean z3, String str) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30178c2(putongAct, i, z, z2, z3, str), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: g */
    public void mo30657g(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30178c2(putongAct, i, z, z2, z3, str), i2);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: h */
    public void mo30658h(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30180e2(putongAct, i, z, z2, z3, null, AccountMediaPickerAct.f17732C, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: i */
    public void mo30659i(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30180e2(putongAct, i, z, z2, z3, str, AccountMediaPickerAct.f17732C, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: m */
    public void mo30663m(boolean z) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(AccountMediaPickerAct.m30177b2(putongAct, -1, z, true, false), PutongAct.REQUEST_CODE_PICKER);
    }
}
