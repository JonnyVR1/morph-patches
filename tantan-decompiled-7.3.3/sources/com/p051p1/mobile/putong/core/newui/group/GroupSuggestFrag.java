package com.p051p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.hpk;
import p153l.ppk;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ppk f22306A;

    /* JADX INFO: renamed from: z */
    public hpk f22307z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ void m37590O4(Boolean bool) {
        if (bool.booleanValue()) {
            if (m37591N4()) {
                mo30636J4().m152777l();
            }
        } else {
            if (m37591N4()) {
                mo30636J4().m152776k();
            }
            this.f22307z.m136563R0();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public boolean m37591N4() {
        return !CoreModule.m30933P().m143412i().mo180560x2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f22307z = new hpk(this);
        ppk ppkVar = new ppk(act());
        this.f22306A = ppkVar;
        this.f22307z.mo52715C(ppkVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f22307z.mo40473a0();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.nok
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142992a.m37590O4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f22306A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_group_chat_square";
    }
}
