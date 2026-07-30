package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.cropiwa.NewCropperAct;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;

/* JADX INFO: loaded from: classes9.dex */
public class szx extends C4850a {

    /* JADX INFO: renamed from: b */
    public keh f171433b;

    /* JADX INFO: renamed from: c */
    public y20<Intent> f171434c;

    public szx(PutongAct putongAct) {
        super(putongAct);
        this.f171434c = dmk0.m116962a(400, new y20() { // from class: l.rzx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165639a.m188686o((Intent) obj);
            }
        });
        this.f171433b = CoreModule.m30932N().getFeedMediaHandler(putongAct);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: a */
    public void mo30651a(String str) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(NewCropperAct.m37195F1(putongAct, str), Act.CROP_IMAGE);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: b */
    public void mo30652b(int i) {
        this.f171433b.mo149321c(this.f17913a, i, this.f171434c);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: c */
    public void mo30653c(int i, y20<Intent> y20Var) {
        this.f171433b.mo149325g(this.f17913a, i, y20Var, this.f171434c);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: d */
    public void mo30654d(int i, boolean z, boolean z2, boolean z3) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48965d2(putongAct, i, z, z2, z3), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: e */
    public void mo30655e(int i, boolean z, boolean z2, boolean z3, int i2) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48965d2(putongAct, i, z, z2, z3), i2);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: f */
    public void mo30656f(int i, boolean z, boolean z2, boolean z3, String str) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48966e2(putongAct, i, z, z2, z3, str), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: g */
    public void mo30657g(int i, boolean z, boolean z2, boolean z3, String str, int i2) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48966e2(putongAct, i, z, z2, z3, str), i2);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: h */
    public void mo30658h(int i, boolean z, boolean z2, boolean z3, Gender gender) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48968h2(putongAct, i, z, z2, z3, null, MediaPickerAct.f31471D, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: i */
    public void mo30659i(int i, boolean z, boolean z2, boolean z3, Gender gender, String str) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48968h2(putongAct, i, z, z2, z3, str, MediaPickerAct.f31471D, false, true, gender), PutongAct.REQUEST_CODE_PICKER);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: j */
    public void mo30660j() {
        this.f171433b.mo149322d(this.f17913a, this.f171434c);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: k */
    public void mo30661k(MusicContent musicContent) {
        this.f171433b.mo149324f(this.f17913a, musicContent, this.f171434c);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: l */
    public void mo30662l(String str, MusicContent musicContent) {
        this.f171433b.mo149319a(this.f17913a, str, musicContent, this.f171434c);
    }

    @Override // com.p051p1.mobile.putong.app.C4850a
    /* JADX INFO: renamed from: m */
    public void mo30663m(boolean z) {
        PutongAct putongAct = this.f17913a;
        putongAct.startActivityForResult(MediaPickerAct.m48965d2(putongAct, -1, z, true, false), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m188686o(Intent intent) {
        this.f17913a.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }
}
