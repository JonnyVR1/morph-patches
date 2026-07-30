package com.p000p1.mobile.putong.core.newui.home.card.expanded.transform;

import android.os.Bundle;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import l.e30;
import p009l.a950;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OldInfoTransNewAct extends PutongCoreMvpAct<a950, C0118a> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    private void m2150b2() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m2151d2(Bundle bundle) {
        m2150b2();
        setStatusBarColor(0);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public a950 m2152X1() {
        return new a950(this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public C0118a m2153Y1() {
        return new C0118a(this);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.s850
            public final void call(Object obj) {
                this.f20131a.m2151d2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        ((C0118a) ((PutongCoreMvpAct) this).e).m2182B();
    }

    public String pageId() {
        return "p_confirm_new_profile";
    }
}
