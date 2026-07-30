package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: classes9.dex */
public class vqx extends C4699a {

    /* JADX INFO: renamed from: b */
    public vch f182682b;

    /* JADX INFO: renamed from: c */
    public e30<Intent> f182683c;

    public vqx(PutongAct putongAct) {
        super(putongAct);
        this.f182683c = xck0.m208120a(400, new e30() { // from class: l.uqx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177792a.m199607o((Intent) obj);
            }
        });
        this.f182682b = CoreModule.m29934N().getFeedMediaHandler(putongAct);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: a */
    public void mo29653a(String str) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(NewCropperAct.m36192E1(putongAct, str), Act.CROP_IMAGE);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: b */
    public void mo29654b(int i) {
        this.f182682b.mo197764c(this.f17194a, i, this.f182683c);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: c */
    public void mo29655c(int i, e30<Intent> e30Var) {
        this.f182682b.mo197768g(this.f17194a, i, e30Var, this.f182683c);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: d */
    public void mo29656d(int i, boolean z, boolean z2, boolean z3) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47782c2(putongAct, i, z, z2, z3), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: e */
    public void mo29657e(int i, boolean z, boolean z2, boolean z3, int i2) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47782c2(putongAct, i, z, z2, z3), i2);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: f */
    public void mo29658f(int i, boolean z, boolean z2, boolean z3, String str) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47783d2(putongAct, i, z, z2, z3, str), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: g */
    public void mo29659g(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47783d2(putongAct, i, z, z2, z3, str), i2);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: h */
    public void mo29660h(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47785g2(putongAct, i, z, z2, z3, null, MediaPickerAct.f30623D, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: i */
    public void mo29661i(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47785g2(putongAct, i, z, z2, z3, str, MediaPickerAct.f30623D, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: j */
    public void mo29662j() {
        this.f182682b.mo197765d(this.f17194a, this.f182683c);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: k */
    public void mo29663k(MusicContent musicContent) {
        this.f182682b.mo197767f(this.f17194a, musicContent, this.f182683c);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: l */
    public void mo29664l(String str, MusicContent musicContent) {
        this.f182682b.mo197762a(this.f17194a, str, musicContent, this.f182683c);
    }

    @Override // com.p046p1.mobile.putong.app.C4699a
    /* JADX INFO: renamed from: m */
    public void mo29665m(boolean z) {
        PutongAct putongAct = this.f17194a;
        putongAct.startActivityForResult(MediaPickerAct.m47782c2(putongAct, -1, z, true, false), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m199607o(Intent intent) {
        this.f17194a.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }
}
