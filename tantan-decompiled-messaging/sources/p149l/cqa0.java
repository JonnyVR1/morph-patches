package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear_Dividers;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f82050u;

    /* JADX INFO: renamed from: v */
    public VText f82051v;

    /* JADX INFO: renamed from: w */
    public VSwitchButton f82052w;

    /* JADX INFO: renamed from: x */
    public boolean f82053x;

    /* JADX INFO: renamed from: y */
    public boolean f82054y;

    public cqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m108238Y(View view) {
        o6j0.m162859c("e_edit_profile_post_pic", "p_edit_profile_view", o6j0.C18854a.m162878h("post_pic_state", this.f82053x ? "on" : BLiveOperationTitleShowType.off));
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: T */
    public View m108239T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dqa0.m112997b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public boolean m108240U() {
        return this.f82053x;
    }

    /* JADX INFO: renamed from: V */
    public boolean m108241V() {
        return this.f82054y;
    }

    /* JADX INFO: renamed from: W */
    public boolean m108242W() {
        return !this.f82053x && CoreModule.m29934N().mo60264Bj();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m108243X(CompoundButton compoundButton, boolean z) {
        this.f82053x = z;
        this.f82054y = true;
    }

    /* JADX INFO: renamed from: Z */
    public void m108244Z(boolean z) {
        if (z) {
            this.f82054y = true;
        }
        if (NullChecker.m81303a(this.f82052w)) {
            this.f82052w.setChecked(z);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f82051v.setTypeface(Typeface.DEFAULT_BOLD);
        if (CoreModule.m29934N().mo60365ko()) {
            boolean zM194665L3 = upa.m194665L3();
            VText vText = this.f82051v;
            if (zM194665L3) {
                vText.setText("上传新照片分享到动态及状态");
            } else {
                vText.setText("上传新头像分享到动态及状态");
            }
        }
        CoreModule.m29934N().mo60348el();
        User userMo51069K2 = mo52800O().mo51069K2();
        if (vwb.m200296J(userMo51069K2.profile.extensions.momentSwitch.noSyncMoment)) {
            this.f82053x = CoreModule.m29934N().mo60280Ha();
        } else {
            this.f82053x = "false".equals(userMo51069K2.profile.extensions.momentSwitch.noSyncMoment.get(0));
        }
        this.f82052w.setChecked(this.f82053x);
        o6j0.m162864h("e_edit_profile_post_pic", "p_edit_profile_view", o6j0.C18854a.m162878h("post_pic_state", this.f82053x ? "on" : BLiveOperationTitleShowType.off));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return super.mo52385k();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m108239T(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        this.f82052w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.aqa0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f71140a.m108243X(compoundButton, z);
            }
        });
        this.f82052w.setOnClickListener(new View.OnClickListener() { // from class: l.bqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76764a.m108238Y(view);
            }
        });
    }
}
