package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.ExpProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.mjf;
import p153l.pf60;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExpProfileEditLoopBaseFrag extends PutongFrag implements mjf {

    /* JADX INFO: renamed from: A */
    public ExpLoopInputType f34127A;

    /* JADX INFO: renamed from: B */
    public String f34128B;

    /* JADX INFO: renamed from: C */
    public int f34129C;

    /* JADX INFO: renamed from: D */
    public int f34130D;

    /* JADX INFO: renamed from: E */
    public boolean f34131E;

    /* JADX INFO: renamed from: z */
    public LoopFragmentFactory.LoopCreateEntryType f34132z;

    @Override // p153l.mjf
    /* JADX INFO: renamed from: L */
    public void mo52425L() {
        mo52434T4(m52428N4());
        m52426M4().m52414b2().m110152N0();
    }

    /* JADX INFO: renamed from: M4 */
    public ExpProfileInfoLoopEditAct m52426M4() {
        return (ExpProfileInfoLoopEditAct) getActivity();
    }

    @Override // p153l.mjf
    /* JADX INFO: renamed from: N */
    public void mo52427N() {
        m52426M4().m52414b2().m110151L0(false);
    }

    /* JADX INFO: renamed from: N4 */
    public User m52428N4() {
        User userM110176x0;
        return (!(act() instanceof ExpProfileInfoLoopEditAct) || (userM110176x0 = m52426M4().m52414b2().m110176x0()) == null) ? CoreModule.f18264c.f20381e0.m116593na().mo225055clone() : userM110176x0;
    }

    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: P4 */
    public User m52430P4() {
        return act() instanceof ExpProfileInfoLoopEditAct ? m52426M4().m52414b2().m110178z0() : CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo52431Q4(List<Media> list, int i) {
    }

    /* JADX INFO: renamed from: R4 */
    public void m52432R4(boolean z) {
        ExpProfileInfoLoopEditAct expProfileInfoLoopEditActM52426M4 = m52426M4();
        if (NullChecker.m82486a(expProfileInfoLoopEditActM52426M4)) {
            expProfileInfoLoopEditActM52426M4.m52416d2(this.f34127A, z);
        }
    }

    /* JADX INFO: renamed from: S4 */
    public void m52433S4() {
        mo30636J4().m152781p(pf60.m172085a("continuous_edit_complete_count", Integer.valueOf(this.f34130D)), pf60.m172085a("continuous_edit_last_step", Boolean.valueOf(this.f34131E)), pf60.m172085a("continuous_edit_step_num", Integer.valueOf(this.f34129C)), pf60.m172085a("edit_specific_profile_show_from", m52426M4().m52413a2()));
    }

    /* JADX INFO: renamed from: T4 */
    public void mo52434T4(User user) {
        this.f34127A.saveUserInfo(user);
    }

    /* JADX INFO: renamed from: U4 */
    public void m52435U4(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, int i, int i2, boolean z) {
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

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m52426M4().m52414b2().m110155R0(this);
        ExpLoopInputType expLoopInputType = this.f34127A;
        String str = expLoopInputType.title;
        String str2 = expLoopInputType.iconUrl;
        String str3 = expLoopInputType.subTitle;
        m52426M4().m52420i2(str);
        m52426M4().m52418g2(str3);
        m52426M4().m52417e2(str2);
        this.f34127A.fillInputContentData(m52428N4(), this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewMo52429O4 = mo52429O4(layoutInflater, viewGroup);
        FrameLayout frameLayout = new FrameLayout(act());
        int i = qa00.f156338y;
        frameLayout.setPadding(i, 0, i, 0);
        frameLayout.addView(viewMo52429O4, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        this.f34132z = (LoopFragmentFactory.LoopCreateEntryType) getArguments().getSerializable("loop_entry_type");
        this.f34127A = (ExpLoopInputType) getArguments().getSerializable("loop_input_type");
        this.f34128B = getArguments().getString("loop_page_id");
        this.f34129C = getArguments().getInt("loop_has_show_count") + 1;
        this.f34130D = getArguments().getInt("loop_has_input_count");
        this.f34131E = getArguments().getBoolean("loop_is_finish_page");
        super.onCreate(bundle);
        m52433S4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return this.f34128B;
    }

    @Override // p153l.mjf
    /* JADX INFO: renamed from: t0 */
    public void mo52436t0() {
        User userM52428N4 = m52428N4();
        if (this.f34127A.checkOnComplete(userM52428N4, this)) {
            mo52434T4(userM52428N4);
            m52426M4().m52414b2().m110151L0(true);
        }
    }

    @Override // p153l.mjf
    /* JADX INFO: renamed from: x3 */
    public boolean mo52437x3() {
        return true;
    }
}
