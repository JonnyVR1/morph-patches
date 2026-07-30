package p002l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.dqa0;
import l.mcr;
import l.o6j0;
import l.upa;
import l.vwb;
import v.VLinear_Dividers;
import v.VSwitchButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f8898u;

    /* JADX INFO: renamed from: v */
    public VText f8899v;

    /* JADX INFO: renamed from: w */
    public VSwitchButton f8900w;

    /* JADX INFO: renamed from: x */
    public boolean f8901x;

    /* JADX INFO: renamed from: y */
    public boolean f8902y;

    public cqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m11329Y(View view) {
        o6j0.c("e_edit_profile_post_pic", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("post_pic_state", this.f8901x ? "on" : "off")});
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: T */
    public View m11330T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dqa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public boolean m11331U() {
        return this.f8901x;
    }

    /* JADX INFO: renamed from: V */
    public boolean m11332V() {
        return this.f8902y;
    }

    /* JADX INFO: renamed from: W */
    public boolean m11333W() {
        return !this.f8901x && CoreModule.N().Bj();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m11334X(CompoundButton compoundButton, boolean z) {
        this.f8901x = z;
        this.f8902y = true;
    }

    /* JADX INFO: renamed from: Z */
    public void m11335Z(boolean z) {
        if (z) {
            this.f8902y = true;
        }
        if (NullChecker.a(this.f8900w)) {
            this.f8900w.setChecked(z);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f8899v.setTypeface(Typeface.DEFAULT_BOLD);
        if (CoreModule.N().ko()) {
            boolean zL3 = upa.L3();
            VText vText = this.f8899v;
            if (zL3) {
                vText.setText("上传新照片分享到动态及状态");
            } else {
                vText.setText("上传新头像分享到动态及状态");
            }
        }
        CoreModule.N().el();
        User userMo1517K2 = mo3351O().mo1517K2();
        if (vwb.J(userMo1517K2.profile.extensions.momentSwitch.noSyncMoment)) {
            this.f8901x = CoreModule.N().Ha();
        } else {
            this.f8901x = "false".equals((String) userMo1517K2.profile.extensions.momentSwitch.noSyncMoment.get(0));
        }
        this.f8900w.setChecked(this.f8901x);
        o6j0.h("e_edit_profile_post_pic", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("post_pic_state", this.f8901x ? "on" : "off")});
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return super.mo2919k();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m11330T(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        this.f8900w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.aqa0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f7861a.m11334X(compoundButton, z);
            }
        });
        this.f8900w.setOnClickListener(new View.OnClickListener() { // from class: l.bqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8309a.m11329Y(view);
            }
        });
    }
}
