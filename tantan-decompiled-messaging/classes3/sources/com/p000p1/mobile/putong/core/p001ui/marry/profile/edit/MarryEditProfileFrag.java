package com.p000p1.mobile.putong.core.p001ui.marry.profile.edit;

import android.content.Intent;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.base.MarryEditProfileBaseFrag;
import p003l.fww;
import p003l.oww;
import p003l.vvl;
import p003l.zww;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileFrag extends MarryEditProfileBaseFrag<oww, zww> implements fww {

    /* JADX INFO: renamed from: C */
    public vvl f279C;

    /* JADX INFO: renamed from: P4 */
    public void m452P4(vvl vvlVar) {
        this.f279C = vvlVar;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.base.MarryEditProfileBaseFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public oww mo450M4() {
        return new oww(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.base.MarryEditProfileBaseFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public zww mo451N4() {
        return new zww(this);
    }

    @Override // p003l.fww
    /* JADX INFO: renamed from: S3 */
    public void mo455S3(String str) {
        ((zww) this.f284A).m9508E(str);
    }

    /* JADX INFO: renamed from: S4 */
    public vvl m456S4() {
        return this.f279C;
    }

    @Override // p003l.fww
    /* JADX INFO: renamed from: l0 */
    public boolean mo457l0(int i, int i2, Intent intent) {
        return ((zww) this.f284A).m9509F(i, i2, intent);
    }
}
