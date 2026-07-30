package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import p002l.ehj;
import p002l.ohj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopGameCpFrag extends ProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: I */
    public ehj f1334I;

    /* JADX INFO: renamed from: J */
    public ohj f1335J;

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: H */
    public void mo2072H() {
        super.mo2072H();
        this.f1335J.m19527F();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: M4 */
    public void mo2073M4() {
        act().finish();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: P4 */
    public void mo2076P4(User user) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag, p002l.xha0
    /* JADX INFO: renamed from: X */
    public boolean mo2084X() {
        return this.f1335J.m19535p();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo2086Y4(List<Media> list, int i) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (picture instanceof Picture) {
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            }
        }
        this.f1335J.m19528G(list);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2152d4() {
        super.d4();
        this.f1334I = new ehj(act(), this);
        ohj ohjVar = new ohj(this);
        this.f1335J = ohjVar;
        this.f1334I.C(ohjVar);
        this.f1334I.Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m2153f4() {
        super.f4();
        this.f1334I.m12543a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1335J.inflateView(layoutInflater, viewGroup);
    }
}
