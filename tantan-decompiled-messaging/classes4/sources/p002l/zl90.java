package p002l;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import l.am90;
import l.ark;
import l.e30;
import l.j760;
import l.mcr;
import l.mkd0;
import l.rzb0;
import l.t100;
import l.vpx;
import l.vwb;
import l.w1g;
import l.w9j;
import l.xdl0;
import l.zvf0;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zl90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public boolean f23491u;

    /* JADX INFO: renamed from: v */
    public VRelative f23492v;

    /* JADX INFO: renamed from: w */
    public VText f23493w;

    public zl90(@NonNull a1m a1mVar, final mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f23491u = false;
        m14461p().creates(new e30() { // from class: l.ul90
            public final void call(Object obj) {
                this.f20694a.m27430Y(mcrVar, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m27427a0(View view) {
        zvf0.u("e_picture_fake_button", mo3351O().pageId(), new j760[]{vwb.Y("pic_show_from", "profile_banner")});
        vpx vpxVar = new vpx();
        vpxVar.a = 1;
        vpxVar.c = false;
        vpxVar.b = false;
        vpxVar.d = true;
        vpxVar.f = MediaPickerAct.D;
        vpxVar.e = "profile";
        vpxVar.g = false;
        vpxVar.h = true;
        vpxVar.i = CoreModule.c.e0.p9().gender;
        vpxVar.k = true;
        mo3351O().mo9269k0(com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct.X1(mo3351O().getContext(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), new a.a() { // from class: l.yl90
            /* JADX INFO: renamed from: a */
            public final boolean m26800a(int i, int i2, Intent intent) {
                return this.f22964a.m27431Z(i, i2, intent);
            }
        });
        mo3351O().act().overridePendingTransition(rzb0.y, 0);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: W */
    public View m27428W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return am90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m27429X(List list) {
        boolean z = this.f23491u;
        if (CoreModule.c.e0.Z7()) {
            this.f23491u = true;
            zvf0.A("e_picture_fake_button", mo3351O().pageId(), new j760[]{vwb.Y("pic_show_from", "profile_banner")});
        } else {
            this.f23491u = false;
        }
        if (z != this.f23491u) {
            mo3351O().mo1515J3();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m27430Y(mcr mcrVar, Bundle bundle) {
        if ((TextUtils.equals("preview_card", mo3351O().from()) && mo3351O().mo1523P1()) || mo3351O().mo1570m0() || !mo3351O().mo1523P1()) {
            return;
        }
        mcrVar.duringCreated(CoreModule.c.e0.o9().map(new w9j() { // from class: l.wl90
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.xl90
            public final void call(Object obj) {
                this.f22345a.m27429X((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean m27431Z(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        ark.L0(mo3351O().act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
        CoreModule.c.e0.H7();
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public void m27432b0() {
        boolean zA = w1g.a();
        VText vText = this.f23493w;
        if (zA) {
            vText.setText(CoreModule.Q().sj());
        } else {
            vText.setText(R.string.v4);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f23493w.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if ((TextUtils.equals("preview_card", mo3351O().from()) && mo3351O().mo1523P1()) || !mo3351O().mo1523P1() || mo3351O().mo1570m0()) {
            return false;
        }
        return this.f23491u;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m27428W(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m27432b0();
        this.f23492v.setOnClickListener(new View.OnClickListener() { // from class: l.vl90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21203a.m27427a0(view);
            }
        });
    }
}
