package com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p003l.dww;
import p003l.eww;
import p003l.uvl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class MarryEditProfileBaseFrag<P extends dww<V>, V extends eww<P>> extends PutongFrag implements uvl {

    /* JADX INFO: renamed from: A */
    public V f284A;

    /* JADX INFO: renamed from: B */
    public User f285B = null;

    /* JADX INFO: renamed from: z */
    public P f286z;

    @Override // p003l.uvl
    /* JADX INFO: renamed from: I0 */
    public boolean mo492I0(User user, boolean z) {
        V v2 = this.f284A;
        return v2 instanceof uvl ? ((uvl) v2).mo492I0(user, z) : super.mo492I0(user, z);
    }

    /* JADX INFO: renamed from: M4 */
    public abstract P mo450M4();

    /* JADX INFO: renamed from: N4 */
    public abstract V mo451N4();

    /* JADX INFO: renamed from: O4 */
    public final void m493O4(User user) {
        V v2 = this.f284A;
        if (v2 instanceof uvl) {
            ((uvl) v2).mo494d(user);
        }
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: d */
    public void mo494d(User user) {
        V v2 = this.f284A;
        if (v2 == null || !v2.f3407a) {
            this.f285B = user;
        } else {
            m493O4(user);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m495d4() {
        super.d4();
        this.f286z = (P) mo450M4();
        V v2 = (V) mo451N4();
        this.f284A = v2;
        this.f286z.C(v2);
        this.f286z.Z();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m496g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        if (NullChecker.a(this.f285B)) {
            m493O4(this.f285B);
            this.f285B = null;
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f284A.inflateView(layoutInflater, viewGroup);
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: r0 */
    public boolean mo497r0(boolean z) {
        V v2 = this.f284A;
        return v2 instanceof uvl ? ((uvl) v2).mo497r0(z) : super.mo497r0(z);
    }
}
