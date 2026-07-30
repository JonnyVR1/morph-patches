package p006l;

import android.content.Intent;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import l.e30;
import l.vch;
import l.xck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vqx extends C0125a {

    /* JADX INFO: renamed from: b */
    public vch f24421b;

    /* JADX INFO: renamed from: c */
    public e30<Intent> f24422c;

    public vqx(PutongAct putongAct) {
        super(putongAct);
        this.f24422c = xck0.a(400, new e30() { // from class: l.uqx
            public final void call(Object obj) {
                this.f23712a.m25854o((Intent) obj);
            }
        });
        this.f24421b = CoreModule.m1853N().getFeedMediaHandler(putongAct);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: a */
    public void mo1563a(String str) {
        PutongAct putongAct = this.f1183a;
        putongAct.startActivityForResult(NewCropperAct.E1(putongAct, str), 24576);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: b */
    public void mo1564b(int i) {
        this.f24421b.c(this.f1183a, i, this.f24422c);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: c */
    public void mo1565c(int i, e30<Intent> e30Var) {
        this.f24421b.g(this.f1183a, i, e30Var, this.f24422c);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: d */
    public void mo1566d(int i, boolean z, boolean z2, boolean z3) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.c2(act, i, z, z2, z3), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: e */
    public void mo1567e(int i, boolean z, boolean z2, boolean z3, int i2) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.c2(act, i, z, z2, z3), i2);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: f */
    public void mo1568f(int i, boolean z, boolean z2, boolean z3, String str) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.d2(act, i, z, z2, z3, str), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: g */
    public void mo1569g(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.d2(act, i, z, z2, z3, str), i2);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: h */
    public void mo1570h(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.g2(act, i, z, z2, z3, (String) null, MediaPickerAct.D, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: i */
    public void mo1571i(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.g2(act, i, z, z2, z3, str, MediaPickerAct.D, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: j */
    public void mo1572j() {
        this.f24421b.d(this.f1183a, this.f24422c);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: k */
    public void mo1573k(MusicContent musicContent) {
        this.f24421b.f(this.f1183a, musicContent, this.f24422c);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: l */
    public void mo1574l(String str, MusicContent musicContent) {
        this.f24421b.a(this.f1183a, str, musicContent, this.f24422c);
    }

    @Override // com.p000p1.mobile.putong.app.C0125a
    /* JADX INFO: renamed from: m */
    public void mo1575m(boolean z) {
        Act act = this.f1183a;
        act.startActivityForResult(MediaPickerAct.c2(act, -1, z, true, false), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m25854o(Intent intent) {
        this.f1183a.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }
}
