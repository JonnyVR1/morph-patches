package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear_Dividers;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gya0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f107036u;

    /* JADX INFO: renamed from: v */
    public VText f107037v;

    /* JADX INFO: renamed from: w */
    public VSwitchButton f107038w;

    /* JADX INFO: renamed from: x */
    public boolean f107039x;

    /* JADX INFO: renamed from: y */
    public boolean f107040y;

    public gya0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m132949Y(View view) {
        sfj0.m185596c("e_edit_profile_post_pic", "p_edit_profile_view", sfj0.C20032a.m185615h("post_pic_state", this.f107039x ? "on" : BLiveOperationTitleShowType.off));
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: T */
    public View m132950T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hya0.m137715b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public boolean m132951U() {
        return this.f107039x;
    }

    /* JADX INFO: renamed from: V */
    public boolean m132952V() {
        return this.f107040y;
    }

    /* JADX INFO: renamed from: W */
    public boolean m132953W() {
        return !this.f107039x && CoreModule.m30932N().mo61448Bj();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m132954X(CompoundButton compoundButton, boolean z) {
        this.f107039x = z;
        this.f107040y = true;
    }

    /* JADX INFO: renamed from: Z */
    public void m132955Z(boolean z) {
        if (z) {
            this.f107040y = true;
        }
        if (NullChecker.m82486a(this.f107038w)) {
            this.f107038w.setChecked(z);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f107037v.setTypeface(Typeface.DEFAULT_BOLD);
        if (CoreModule.m30932N().mo61549ko()) {
            boolean zM131596L3 = gra.m131596L3();
            VText vText = this.f107037v;
            if (zM131596L3) {
                vText.setText("上传新照片分享到动态及状态");
            } else {
                vText.setText("上传新头像分享到动态及状态");
            }
        }
        CoreModule.m30932N().mo61532el();
        User userMo52252K2 = mo53983O().mo52252K2();
        if (jyb.m147479J(userMo52252K2.profile.extensions.momentSwitch.noSyncMoment)) {
            this.f107039x = CoreModule.m30932N().mo61464Ha();
        } else {
            this.f107039x = "false".equals(userMo52252K2.profile.extensions.momentSwitch.noSyncMoment.get(0));
        }
        this.f107038w.setChecked(this.f107039x);
        sfj0.m185601h("e_edit_profile_post_pic", "p_edit_profile_view", sfj0.C20032a.m185615h("post_pic_state", this.f107039x ? "on" : BLiveOperationTitleShowType.off));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return super.mo53568k();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m132950T(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        this.f107038w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.eya0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f96415a.m132954X(compoundButton, z);
            }
        });
        this.f107038w.setOnClickListener(new View.OnClickListener() { // from class: l.fya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101356a.m132949Y(view);
            }
        });
    }
}
