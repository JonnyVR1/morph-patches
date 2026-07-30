package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.ExpProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.gif;
import p149l.j760;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExpProfileEditLoopBaseFrag extends PutongFrag implements gif {

    /* JADX INFO: renamed from: A */
    public ExpLoopInputType f33279A;

    /* JADX INFO: renamed from: B */
    public String f33280B;

    /* JADX INFO: renamed from: C */
    public int f33281C;

    /* JADX INFO: renamed from: D */
    public int f33282D;

    /* JADX INFO: renamed from: E */
    public boolean f33283E;

    /* JADX INFO: renamed from: z */
    public LoopFragmentFactory.LoopCreateEntryType f33284z;

    @Override // p149l.gif
    /* JADX INFO: renamed from: L */
    public void mo51242L() {
        mo51251T4(m51245N4());
        m51243M4().m51231a2().m203186N0();
    }

    /* JADX INFO: renamed from: M4 */
    public ExpProfileInfoLoopEditAct m51243M4() {
        return (ExpProfileInfoLoopEditAct) getActivity();
    }

    @Override // p149l.gif
    /* JADX INFO: renamed from: N */
    public void mo51244N() {
        m51243M4().m51231a2().m203185L0(false);
    }

    /* JADX INFO: renamed from: N4 */
    public User m51245N4() {
        User userM203210x0;
        return (!(act() instanceof ExpProfileInfoLoopEditAct) || (userM203210x0 = m51243M4().m51231a2().m203210x0()) == null) ? CoreModule.f17545c.f19639e0.m169520na().mo223809clone() : userM203210x0;
    }

    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: P4 */
    public User m51247P4() {
        return act() instanceof ExpProfileInfoLoopEditAct ? m51243M4().m51231a2().m203212z0() : CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo51248Q4(List<Media> list, int i) {
    }

    /* JADX INFO: renamed from: R4 */
    public void m51249R4(boolean z) {
        ExpProfileInfoLoopEditAct expProfileInfoLoopEditActM51243M4 = m51243M4();
        if (NullChecker.m81303a(expProfileInfoLoopEditActM51243M4)) {
            expProfileInfoLoopEditActM51243M4.m51233c2(this.f33279A, z);
        }
    }

    /* JADX INFO: renamed from: S4 */
    public void m51250S4() {
        mo29638J4().m109040p(j760.m140076a("continuous_edit_complete_count", Integer.valueOf(this.f33282D)), j760.m140076a("continuous_edit_last_step", Boolean.valueOf(this.f33283E)), j760.m140076a("continuous_edit_step_num", Integer.valueOf(this.f33281C)), j760.m140076a("edit_specific_profile_show_from", m51243M4().m51230Z1()));
    }

    /* JADX INFO: renamed from: T4 */
    public void mo51251T4(User user) {
        this.f33279A.saveUserInfo(user);
    }

    /* JADX INFO: renamed from: U4 */
    public void m51252U4(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, int i, int i2, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            setArguments(arguments);
        }
        arguments.putSerializable("loop_entry_type", loopCreateEntryType);
        arguments.putSerializable("loop_input_type", expLoopInputType);
        arguments.putString("loop_page_id", expLoopInputType.getPageId());
        arguments.putInt("loop_has_input_count", i2);
        arguments.putInt("loop_has_show_count", i);
        arguments.putBoolean("loop_is_finish_page", z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m51243M4().m51231a2().m203189R0(this);
        ExpLoopInputType expLoopInputType = this.f33279A;
        String str = expLoopInputType.title;
        String str2 = expLoopInputType.iconUrl;
        String str3 = expLoopInputType.subTitle;
        m51243M4().m51237h2(str);
        m51243M4().m51235e2(str3);
        m51243M4().m51234d2(str2);
        this.f33279A.fillInputContentData(m51245N4(), this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo51246O4 = mo51246O4(layoutInflater, viewGroup);
        FrameLayout frameLayout = new FrameLayout(act());
        int i = t100.f167276y;
        frameLayout.setPadding(i, 0, i, 0);
        frameLayout.addView(viewMo51246O4, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.f33284z = (LoopFragmentFactory.LoopCreateEntryType) getArguments().getSerializable("loop_entry_type");
        this.f33279A = (ExpLoopInputType) getArguments().getSerializable("loop_input_type");
        this.f33280B = getArguments().getString("loop_page_id");
        this.f33281C = getArguments().getInt("loop_has_show_count") + 1;
        this.f33282D = getArguments().getInt("loop_has_input_count");
        this.f33283E = getArguments().getBoolean("loop_is_finish_page");
        super.onCreate(bundle);
        m51250S4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return this.f33280B;
    }

    @Override // p149l.gif
    /* JADX INFO: renamed from: t0 */
    public void mo51253t0() {
        User userM51245N4 = m51245N4();
        if (this.f33279A.checkOnComplete(userM51245N4, this)) {
            mo51251T4(userM51245N4);
            m51243M4().m51231a2().m203185L0(true);
        }
    }

    @Override // p149l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo51254x3() {
        return true;
    }
}
