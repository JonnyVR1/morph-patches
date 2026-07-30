package com.p051p1.mobile.putong.core.newui.group;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.WebViewFrag;
import com.p051p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import p153l.bnl0;
import p153l.ntp0;
import p153l.o1j0;
import p153l.psd0;
import p153l.qa00;
import p153l.rx3;
import p153l.uqb0;
import p153l.y20;
import p153l.zpq;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestWebFrag extends WebViewFrag {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.group.GroupSuggestWebFrag$a */
    public class C8001a implements rx3.InterfaceC19928a {
        public C8001a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            GroupSuggestWebFrag.this.f29026C.setVisibility(8);
            GroupSuggestWebFrag.this.f29025B.setVisibility(8);
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            GroupSuggestWebFrag.this.f29026C.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public static GroupSuggestWebFrag m37605d5(String str) {
        GroupSuggestWebFrag groupSuggestWebFrag = new GroupSuggestWebFrag();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        groupSuggestWebFrag.setArguments(bundle);
        return groupSuggestWebFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m37606f5(Boolean bool) {
        if (m37610e5()) {
            if (bool.booleanValue()) {
                mo30636J4().m152777l();
            } else {
                mo30636J4().m152776k();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.WebViewFrag
    /* JADX INFO: renamed from: T4 */
    public rx3.InterfaceC19928a mo37607T4() {
        return new C8001a();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.WebViewFrag
    /* JADX INFO: renamed from: V4 */
    public void mo37608V4(Map<String, String> map) {
        super.mo37608V4(map);
        boolean zMo180560x2 = CoreModule.m30933P().m143412i().mo180560x2();
        FrameLayout frameLayout = this.f29033z;
        if (zMo180560x2) {
            frameLayout.setPadding(0, 0, 0, 0);
        } else {
            frameLayout.setPadding(0, qa00.f156292E, 0, 0);
            bnl0.m105556g0(this.f29033z);
        }
        duringCreated(uqb0.f180396b0.f170324a.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.spk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170057a.m37611g5((AuthData) obj);
            }
        }, new y20() { // from class: l.tpk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175610a.m37612h5((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return (PutongAct) getActivity();
    }

    /* JADX INFO: renamed from: e5 */
    public boolean m37610e5() {
        return !CoreModule.m30933P().m143412i().mo180560x2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.rpk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164375a.m37606f5((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m37611g5(AuthData authData) {
        this.f29031H = new zpq(act(), authData.accessToken, this.f29024A);
        HashMap map = new HashMap();
        if (ntp0.m164746d(m45266U4())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f29024A.setOverScrollMode(2);
        super.mo37608V4(map);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m37612h5(Throwable th) {
        this.f29026C.setVisibility(0);
        this.f29025B.setVisibility(8);
        o1j0.m165640n(R$string.f21461B2);
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
