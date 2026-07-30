package com.p046p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.e30;
import p149l.mkd0;
import p149l.rmk;
import p149l.zmk;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public zmk f21564A;

    /* JADX INFO: renamed from: z */
    public rmk f21565z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ void m36587O4(Boolean bool) {
        if (bool.booleanValue()) {
            if (m36588N4()) {
                mo29638J4().m109036l();
            }
        } else {
            if (m36588N4()) {
                mo29638J4().m109035k();
            }
            this.f21565z.m180015R0();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m36588N4() {
        return !CoreModule.m29935P().m94658i().mo158468x2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f21565z = new rmk(this);
        zmk zmkVar = new zmk(act());
        this.f21564A = zmkVar;
        this.f21565z.mo51532C(zmkVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f21565z.mo39470a0();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.xlk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193425a.m36587O4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f21564A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_group_chat_square";
    }
}
