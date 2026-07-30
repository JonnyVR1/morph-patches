package p153l;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class du90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public boolean f90777u;

    /* JADX INFO: renamed from: v */
    public VRelative f90778v;

    /* JADX INFO: renamed from: w */
    public VText f90779w;

    public du90(@NonNull t3m t3mVar, final ner nerVar) {
        super(t3mVar, nerVar);
        this.f90777u = false;
        m168321p().creates(new y20() { // from class: l.yt90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201495a.m118124Y(nerVar, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m118121a0(View view) {
        i4g0.m138523u("e_picture_fake_button", mo53983O().pageId(), jyb.m147494Y("pic_show_from", "profile_banner"));
        syx syxVar = new syx();
        syxVar.f171323a = 1;
        syxVar.f171325c = false;
        syxVar.f171324b = false;
        syxVar.f171326d = true;
        syxVar.f171328f = MediaPickerAct.f31471D;
        syxVar.f171327e = "profile";
        syxVar.f171329g = false;
        syxVar.f171330h = true;
        syxVar.f171331i = CoreModule.f18264c.f20381e0.m116600p9().gender;
        syxVar.f171333k = true;
        mo53983O().mo146496k0(com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct.m80102Y1(mo53983O().getContext(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), new C4468a.a() { // from class: l.cu90
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f83831a.m118125Z(i, i2, intent);
            }
        });
        mo53983O().act().overridePendingTransition(x7c0.f192710y, 0);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: W */
    public View m118122W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eu90.m122554b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m118123X(List list) {
        boolean z = this.f90777u;
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            this.f90777u = true;
            i4g0.m138492A("e_picture_fake_button", mo53983O().pageId(), jyb.m147494Y("pic_show_from", "profile_banner"));
        } else {
            this.f90777u = false;
        }
        if (z != this.f90777u) {
            mo53983O().mo52250J3();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m118124Y(ner nerVar, Bundle bundle) {
        if ((TextUtils.equals("preview_card", mo53983O().from()) && mo53983O().mo52258P1()) || mo53983O().mo52302m0() || !mo53983O().mo52258P1()) {
            return;
        }
        nerVar.duringCreated(CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.au90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.bu90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78471a.m118123X((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean m118125Z(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        qtk.m177983L0(mo53983O().act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        CoreModule.f18264c.f20381e0.m116468H7();
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m118126b0() {
        boolean zM148016a = k3g.m148016a();
        VText vText = this.f90779w;
        if (zM148016a) {
            vText.setText(CoreModule.m30934Q().mo68468sj());
        } else {
            vText.setText(R$string.f19791x4);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f90779w.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if ((TextUtils.equals("preview_card", mo53983O().from()) && mo53983O().mo52258P1()) || !mo53983O().mo52258P1() || mo53983O().mo52302m0()) {
            return false;
        }
        return this.f90777u;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m118122W(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m118126b0();
        this.f90778v.setOnClickListener(new View.OnClickListener() { // from class: l.zt90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205944a.m118121a0(view);
            }
        });
    }
}
