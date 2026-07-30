package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p153l.ikj;
import p153l.yjj;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopGameCpFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public yjj f34360I;

    /* JADX INFO: renamed from: J */
    public ikj f34361J;

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: H */
    public void mo52769H() {
        super.mo52769H();
        this.f34361J.m140342F();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo52770M4() {
        act().m68056e2();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo52773P4(User user) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag, p153l.bqa0
    /* JADX INFO: renamed from: X */
    public boolean mo52781X() {
        return this.f34361J.m140349p();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo52783Y4(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        this.f34361J.m140343G(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f34360I = new yjj(act(), this);
        ikj ikjVar = new ikj(this);
        this.f34361J = ikjVar;
        this.f34360I.mo52715C(ikjVar);
        this.f34360I.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f34360I.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34361J.inflateView(layoutInflater, viewGroup);
    }
}
