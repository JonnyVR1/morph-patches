package com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.dww;
import p149l.eww;
import p149l.uvl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MarryEditProfileBaseFrag<P extends dww<V>, V extends eww<P>> extends PutongFrag implements uvl {

    /* JADX INFO: renamed from: A */
    public V f30393A;

    /* JADX INFO: renamed from: B */
    public User f30394B = null;

    /* JADX INFO: renamed from: z */
    public P f30395z;

    @Override // p149l.uvl
    /* JADX INFO: renamed from: I0 */
    public boolean mo47447I0(User user, boolean z) {
        V v2 = this.f30393A;
        return v2 instanceof uvl ? ((uvl) v2).mo47447I0(user, z) : super.mo47447I0(user, z);
    }

    /* JADX INFO: renamed from: M4 */
    public abstract P mo47407M4();

    /* JADX INFO: renamed from: N4 */
    public abstract V mo47408N4();

    /* JADX INFO: renamed from: O4 */
    public final void m47448O4(User user) {
        V v2 = this.f30393A;
        if (v2 instanceof uvl) {
            ((uvl) v2).mo47449d(user);
        }
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: d */
    public void mo47449d(User user) {
        V v2 = this.f30393A;
        if (v2 == null || !v2.f93544a) {
            this.f30394B = user;
        } else {
            m47448O4(user);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f30395z = (P) mo47407M4();
        V v2 = (V) mo47408N4();
        this.f30393A = v2;
        this.f30395z.mo51532C(v2);
        this.f30395z.mo39469Z();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public final void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (NullChecker.m81303a(this.f30394B)) {
            m47448O4(this.f30394B);
            this.f30394B = null;
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30393A.inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: r0 */
    public boolean mo47450r0(boolean z) {
        V v2 = this.f30393A;
        return v2 instanceof uvl ? ((uvl) v2).mo47450r0(z) : super.mo47450r0(z);
    }
}
