package com.p051p1.mobile.putong.core.p058ui.marry.profile.edit;

import android.content.Intent;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.base.MarryEditProfileBaseFrag;
import p153l.ezw;
import p153l.nyl;
import p153l.nzw;
import p153l.yzw;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileFrag extends MarryEditProfileBaseFrag<nzw, yzw> implements ezw {

    /* JADX INFO: renamed from: C */
    public nyl f31236C;

    /* JADX INFO: renamed from: P4 */
    public void m48592P4(nyl nylVar) {
        this.f31236C = nylVar;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.base.MarryEditProfileBaseFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public nzw mo48590M4() {
        return new nzw(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.base.MarryEditProfileBaseFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public yzw mo48591N4() {
        return new yzw(this);
    }

    @Override // p153l.ezw
    /* JADX INFO: renamed from: S3 */
    public void mo48595S3(String str) {
        ((yzw) this.f31241A).m218075E(str);
    }

    /* JADX INFO: renamed from: S4 */
    public nyl m48596S4() {
        return this.f31236C;
    }

    @Override // p153l.ezw
    /* JADX INFO: renamed from: l0 */
    public boolean mo48597l0(int i, int i2, Intent intent) {
        return ((yzw) this.f31241A).m218076F(i, i2, intent);
    }
}
