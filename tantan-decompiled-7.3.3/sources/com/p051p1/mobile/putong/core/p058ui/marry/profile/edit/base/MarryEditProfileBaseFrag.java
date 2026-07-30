package com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.czw;
import p153l.dzw;
import p153l.myl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MarryEditProfileBaseFrag<P extends czw<V>, V extends dzw<P>> extends PutongFrag implements myl {

    /* JADX INFO: renamed from: A */
    public V f31241A;

    /* JADX INFO: renamed from: B */
    public User f31242B = null;

    /* JADX INFO: renamed from: z */
    public P f31243z;

    @Override // p153l.myl
    /* JADX INFO: renamed from: I0 */
    public boolean mo48630I0(User user, boolean z) {
        V v2 = this.f31241A;
        return v2 instanceof myl ? ((myl) v2).mo48630I0(user, z) : super.mo48630I0(user, z);
    }

    /* JADX INFO: renamed from: M4 */
    public abstract P mo48590M4();

    /* JADX INFO: renamed from: N4 */
    public abstract V mo48591N4();

    /* JADX INFO: renamed from: O4 */
    public final void m48631O4(User user) {
        V v2 = this.f31241A;
        if (v2 instanceof myl) {
            ((myl) v2).mo48632d(user);
        }
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: d */
    public void mo48632d(User user) {
        V v2 = this.f31241A;
        if (v2 == null || !v2.f91387a) {
            this.f31242B = user;
        } else {
            m48631O4(user);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f31243z = (P) mo48590M4();
        V v2 = (V) mo48591N4();
        this.f31241A = v2;
        this.f31243z.mo52715C(v2);
        this.f31243z.mo40472Z();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public final void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (NullChecker.m82486a(this.f31242B)) {
            m48631O4(this.f31242B);
            this.f31242B = null;
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31241A.inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: r0 */
    public boolean mo48633r0(boolean z) {
        V v2 = this.f31241A;
        return v2 instanceof myl ? ((myl) v2).mo48633r0(z) : super.mo48633r0(z);
    }
}
