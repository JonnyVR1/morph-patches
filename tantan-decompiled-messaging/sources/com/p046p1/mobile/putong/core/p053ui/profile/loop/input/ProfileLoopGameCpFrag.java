package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p149l.ehj;
import p149l.ohj;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopGameCpFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ehj f33512I;

    /* JADX INFO: renamed from: J */
    public ohj f33513J;

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: H */
    public void mo51586H() {
        super.mo51586H();
        this.f33513J.m164384F();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo51587M4() {
        act().m66873d2();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo51590P4(User user) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag, p149l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo51598X() {
        return this.f33513J.m164391p();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo51600Y4(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        this.f33513J.m164385G(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f33512I = new ehj(act(), this);
        ohj ohjVar = new ohj(this);
        this.f33513J = ohjVar;
        this.f33512I.mo51532C(ohjVar);
        this.f33512I.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f33512I.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33513J.inflateView(layoutInflater, viewGroup);
    }
}
