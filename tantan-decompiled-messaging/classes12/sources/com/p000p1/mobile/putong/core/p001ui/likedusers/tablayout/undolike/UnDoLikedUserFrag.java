package com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.mkd0;
import p007l.bkj0;
import p007l.ijj0;
import p007l.xu10;
import p007l.zjj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UnDoLikedUserFrag extends PutongFrag implements xu10 {

    /* JADX INFO: renamed from: A */
    public bkj0 f125A;

    /* JADX INFO: renamed from: B */
    public ijj0 f126B;

    /* JADX INFO: renamed from: z */
    public zjj0 f127z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m507R4(Boolean bool) {
        if (bool.booleanValue()) {
            J4().l();
        } else {
            J4().k();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m508N4() {
        this.f127z = new zjj0(this);
        bkj0 bkj0Var = new bkj0(this);
        this.f125A = bkj0Var;
        this.f127z.C(bkj0Var);
    }

    /* JADX INFO: renamed from: O4 */
    public ijj0 m509O4() {
        if (this.f126B == null) {
            this.f126B = new ijj0(m511Q4());
        }
        return this.f126B;
    }

    /* JADX INFO: renamed from: P4 */
    public final bkj0 m510P4() {
        if (this.f125A == null) {
            m508N4();
        }
        return this.f125A;
    }

    /* JADX INFO: renamed from: Q4 */
    public zjj0 m511Q4() {
        if (this.f127z == null) {
            m508N4();
        }
        return this.f127z;
    }

    /* JADX INFO: renamed from: d4 */
    public void m512d4() {
        super.d4();
        m511Q4().m17493Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m513f4() {
        super.f4();
        m511Q4().m17494a0();
        L4().subscribe(mkd0.G(new e30() { // from class: l.jjj0
            public final void call(Object obj) {
                this.f9377a.m507R4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m514g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
    }

    @Override // p007l.xu10
    /* JADX INFO: renamed from: i */
    public boolean mo462i(int i, int i2, Intent intent) {
        return false;
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m510P4().inflateView(layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        CoreModule.c.m0.S5();
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        m511Q4().destroy();
        m510P4().destroy();
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        this.f127z.m17489C0(false);
    }

    public String pageId() {
        return "p_who_i_disliked";
    }
}
