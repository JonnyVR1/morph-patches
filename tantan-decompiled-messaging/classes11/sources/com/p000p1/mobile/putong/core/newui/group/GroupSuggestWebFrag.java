package com.p000p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.WebViewFrag;
import com.p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.xdl0;
import p009l.aoq;
import p009l.jkp0;
import p009l.sw3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupSuggestWebFrag extends WebViewFrag {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.group.GroupSuggestWebFrag$a */
    public class C0014a implements sw3.InterfaceC1195a {
        public C0014a() {
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: a */
        public void mo552a(String str) {
            ((WebViewFrag) GroupSuggestWebFrag.this).C.setVisibility(8);
            ((WebViewFrag) GroupSuggestWebFrag.this).B.setVisibility(8);
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: b */
        public void mo553b(String str) {
        }

        @Override // p009l.sw3.InterfaceC1195a
        /* JADX INFO: renamed from: c */
        public void mo554c(int i, String str, String str2) {
            ((WebViewFrag) GroupSuggestWebFrag.this).C.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static GroupSuggestWebFrag m543d5(String str) {
        GroupSuggestWebFrag groupSuggestWebFrag = new GroupSuggestWebFrag();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        groupSuggestWebFrag.setArguments(bundle);
        return groupSuggestWebFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m544f5(Boolean bool) {
        if (m548e5()) {
            if (bool.booleanValue()) {
                J4().l();
            } else {
                J4().k();
            }
        }
    }

    /* JADX INFO: renamed from: T4 */
    public sw3.InterfaceC1195a m545T4() {
        return new C0014a();
    }

    /* JADX INFO: renamed from: V4 */
    public void m546V4(Map<String, String> map) {
        super.V4(map);
        boolean zX2 = CoreModule.P().i().x2();
        FrameLayout frameLayout = ((WebViewFrag) this).z;
        if (zX2) {
            frameLayout.setPadding(0, 0, 0, 0);
        } else {
            frameLayout.setPadding(0, t100.E, 0, 0);
            xdl0.g0(new View[]{((WebViewFrag) this).z});
        }
        duringCreated(qib0.b0.a.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.cnk
            public final void call(Object obj) {
                this.f10702a.m550g5((AuthData) obj);
            }
        }, new e30() { // from class: l.dnk
            public final void call(Object obj) {
                this.f11919a.m551h5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: e5 */
    public boolean m548e5() {
        return !CoreModule.P().i().x2();
    }

    /* JADX INFO: renamed from: f4 */
    public void m549f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.bnk
            public final void call(Object obj) {
                this.f10207a.m544f5((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m550g5(AuthData authData) {
        ((WebViewFrag) this).H = new aoq(act(), authData.accessToken, ((WebViewFrag) this).A);
        HashMap map = new HashMap();
        if (jkp0.m17145d(U4())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        ((WebViewFrag) this).A.setOverScrollMode(2);
        super.V4(map);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m551h5(Throwable th) {
        ((WebViewFrag) this).C.setVisibility(0);
        ((WebViewFrag) this).B.setVisibility(8);
        lsi0.n(R.string.B2);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
    }

    public String pageId() {
        return "p_group_chat_square";
    }
}
