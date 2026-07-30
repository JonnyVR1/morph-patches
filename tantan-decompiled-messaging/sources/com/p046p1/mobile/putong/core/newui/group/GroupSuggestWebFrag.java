package com.p046p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.WebViewFrag;
import com.p046p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import p149l.aoq;
import p149l.e30;
import p149l.jkp0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.sw3;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestWebFrag extends WebViewFrag {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.group.GroupSuggestWebFrag$a */
    public class C7850a implements sw3.InterfaceC20043a {
        public C7850a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            GroupSuggestWebFrag.this.f28178C.setVisibility(8);
            GroupSuggestWebFrag.this.f28177B.setVisibility(8);
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            GroupSuggestWebFrag.this.f28178C.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static GroupSuggestWebFrag m36602d5(String str) {
        GroupSuggestWebFrag groupSuggestWebFrag = new GroupSuggestWebFrag();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        groupSuggestWebFrag.setArguments(bundle);
        return groupSuggestWebFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m36603f5(Boolean bool) {
        if (m36607e5()) {
            if (bool.booleanValue()) {
                mo29638J4().m109036l();
            } else {
                mo29638J4().m109035k();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.WebViewFrag
    /* JADX INFO: renamed from: T4 */
    public sw3.InterfaceC20043a mo36604T4() {
        return new C7850a();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.WebViewFrag
    /* JADX INFO: renamed from: V4 */
    public void mo36605V4(Map<String, String> map) {
        super.mo36605V4(map);
        boolean zMo158468x2 = CoreModule.m29935P().m94658i().mo158468x2();
        FrameLayout frameLayout = this.f28185z;
        if (zMo158468x2) {
            frameLayout.setPadding(0, 0, 0, 0);
        } else {
            frameLayout.setPadding(0, t100.f167230E, 0, 0);
            xdl0.m208376g0(this.f28185z);
        }
        duringCreated(qib0.f154713b0.f139230a.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.cnk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81666a.m36608g5((AuthData) obj);
            }
        }, new e30() { // from class: l.dnk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87081a.m36609h5((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return (PutongAct) getActivity();
    }

    /* JADX INFO: renamed from: e5 */
    public boolean m36607e5() {
        return !CoreModule.m29935P().m94658i().mo158468x2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.bnk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76407a.m36603f5((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m36608g5(AuthData authData) {
        this.f28183H = new aoq(act(), authData.accessToken, this.f28176A);
        HashMap map = new HashMap();
        if (jkp0.m141904d(m44083U4())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f28176A.setOverScrollMode(2);
        super.mo36605V4(map);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m36609h5(Throwable th) {
        this.f28178C.setVisibility(0);
        this.f28177B.setVisibility(8);
        lsi0.m151584n(R$string.f20719B2);
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
