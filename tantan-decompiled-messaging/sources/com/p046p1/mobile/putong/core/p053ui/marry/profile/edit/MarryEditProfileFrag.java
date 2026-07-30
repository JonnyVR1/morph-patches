package com.p046p1.mobile.putong.core.p053ui.marry.profile.edit;

import android.content.Intent;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.base.MarryEditProfileBaseFrag;
import p149l.fww;
import p149l.oww;
import p149l.vvl;
import p149l.zww;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileFrag extends MarryEditProfileBaseFrag<oww, zww> implements fww {

    /* JADX INFO: renamed from: C */
    public vvl f30388C;

    /* JADX INFO: renamed from: P4 */
    public void m47409P4(vvl vvlVar) {
        this.f30388C = vvlVar;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.base.MarryEditProfileBaseFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public oww mo47407M4() {
        return new oww(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.base.MarryEditProfileBaseFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public zww mo47408N4() {
        return new zww(this);
    }

    @Override // p149l.fww
    /* JADX INFO: renamed from: S3 */
    public void mo47412S3(String str) {
        ((zww) this.f30393A).m220720E(str);
    }

    /* JADX INFO: renamed from: S4 */
    public vvl m47413S4() {
        return this.f30388C;
    }

    @Override // p149l.fww
    /* JADX INFO: renamed from: l0 */
    public boolean mo47414l0(int i, int i2, Intent intent) {
        return ((zww) this.f30393A).m220721F(i, i2, intent);
    }
}
