package com.p000p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.mkd0;
import p009l.rmk;
import p009l.zmk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupSuggestFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public zmk f342A;

    /* JADX INFO: renamed from: z */
    public rmk f343z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ void m526O4(Boolean bool) {
        if (bool.booleanValue()) {
            if (m527N4()) {
                J4().l();
            }
        } else {
            if (m527N4()) {
                J4().k();
            }
            this.f343z.m21733R0();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m527N4() {
        return !CoreModule.P().i().x2();
    }

    /* JADX INFO: renamed from: d4 */
    public void m528d4() {
        super.d4();
        this.f343z = new rmk(this);
        zmk zmkVar = new zmk(act());
        this.f342A = zmkVar;
        this.f343z.C(zmkVar);
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: f4 */
    public void m529f4() {
        super.f4();
        this.f343z.m21734a0();
        L4().subscribe(mkd0.G(new e30() { // from class: l.xlk
            public final void call(Object obj) {
                this.f22646a.m526O4((Boolean) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f342A.inflateView(layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public String pageId() {
        return "p_group_chat_square";
    }
}
