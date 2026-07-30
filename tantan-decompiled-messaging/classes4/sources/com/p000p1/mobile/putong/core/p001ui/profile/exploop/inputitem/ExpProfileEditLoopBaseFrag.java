package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.ExpProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.t100;
import p002l.gif;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ExpProfileEditLoopBaseFrag extends PutongFrag implements gif {

    /* JADX INFO: renamed from: A */
    public ExpLoopInputType f1101A;

    /* JADX INFO: renamed from: B */
    public String f1102B;

    /* JADX INFO: renamed from: C */
    public int f1103C;

    /* JADX INFO: renamed from: D */
    public int f1104D;

    /* JADX INFO: renamed from: E */
    public boolean f1105E;

    /* JADX INFO: renamed from: z */
    public LoopFragmentFactory.LoopCreateEntryType f1106z;

    @Override // p002l.gif
    /* JADX INFO: renamed from: L */
    public void mo1697L() {
        mo1706T4(m1700N4());
        m1698M4().m1686a2().m24635N0();
    }

    /* JADX INFO: renamed from: M4 */
    public ExpProfileInfoLoopEditAct m1698M4() {
        return getActivity();
    }

    @Override // p002l.gif
    /* JADX INFO: renamed from: N */
    public void mo1699N() {
        m1698M4().m1686a2().m24634L0(false);
    }

    /* JADX INFO: renamed from: N4 */
    public User m1700N4() {
        User userM24660x0;
        return (!(act() instanceof ExpProfileInfoLoopEditAct) || (userM24660x0 = m1698M4().m1686a2().m24660x0()) == null) ? CoreModule.c.e0.na().clone() : userM24660x0;
    }

    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: P4 */
    public User m1702P4() {
        return act() instanceof ExpProfileInfoLoopEditAct ? m1698M4().m1686a2().m24662z0() : CoreModule.c.e0.na().clone();
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo1703Q4(List<Media> list, int i) {
    }

    /* JADX INFO: renamed from: R4 */
    public void m1704R4(boolean z) {
        ExpProfileInfoLoopEditAct expProfileInfoLoopEditActM1698M4 = m1698M4();
        if (NullChecker.a(expProfileInfoLoopEditActM1698M4)) {
            expProfileInfoLoopEditActM1698M4.m1688c2(this.f1101A, z);
        }
    }

    /* JADX INFO: renamed from: S4 */
    public void m1705S4() {
        J4().p(new j760[]{j760.a("continuous_edit_complete_count", Integer.valueOf(this.f1104D)), j760.a("continuous_edit_last_step", Boolean.valueOf(this.f1105E)), j760.a("continuous_edit_step_num", Integer.valueOf(this.f1103C)), j760.a("edit_specific_profile_show_from", m1698M4().m1685Z1())});
    }

    /* JADX INFO: renamed from: T4 */
    public void mo1706T4(User user) {
        this.f1101A.saveUserInfo(user);
    }

    /* JADX INFO: renamed from: U4 */
    public void m1707U4(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, int i, int i2, boolean z) {
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

    /* JADX INFO: renamed from: d4 */
    public void mo1708d4() {
        super.d4();
        m1698M4().m1686a2().m24638R0(this);
        ExpLoopInputType expLoopInputType = this.f1101A;
        String str = expLoopInputType.title;
        String str2 = expLoopInputType.iconUrl;
        String str3 = expLoopInputType.subTitle;
        m1698M4().m1692h2(str);
        m1698M4().m1690e2(str3);
        m1698M4().m1689d2(str2);
        this.f1101A.fillInputContentData(m1700N4(), this);
    }

    public boolean disableAutoPV() {
        return false;
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo1701O4 = mo1701O4(layoutInflater, viewGroup);
        FrameLayout frameLayout = new FrameLayout(act());
        int i = t100.y;
        frameLayout.setPadding(i, 0, i, 0);
        frameLayout.addView(viewMo1701O4, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onCreate(Bundle bundle) {
        this.f1106z = (LoopFragmentFactory.LoopCreateEntryType) getArguments().getSerializable("loop_entry_type");
        this.f1101A = (ExpLoopInputType) getArguments().getSerializable("loop_input_type");
        this.f1102B = getArguments().getString("loop_page_id");
        this.f1103C = getArguments().getInt("loop_has_show_count") + 1;
        this.f1104D = getArguments().getInt("loop_has_input_count");
        this.f1105E = getArguments().getBoolean("loop_is_finish_page");
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        m1705S4();
    }

    public String pageId() {
        return this.f1102B;
    }

    @Override // p002l.gif
    /* JADX INFO: renamed from: t0 */
    public void mo1709t0() {
        User userM1700N4 = m1700N4();
        if (this.f1101A.checkOnComplete(userM1700N4, this)) {
            mo1706T4(userM1700N4);
            m1698M4().m1686a2().m24634L0(true);
        }
    }

    @Override // p002l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo1710x3() {
        return true;
    }
}
