package com.p051p1.mobile.putong.core.p058ui.likedusers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.tantanapp.common.utils.NullChecker;
import p153l.abb0;
import p153l.ahr;
import p153l.f320;
import p153l.fjr;
import p153l.gwl;
import p153l.ijr;
import p153l.pcj;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class LikedUserFrag extends PutongFrag implements pcj<String>, gwl, f320 {

    /* JADX INFO: renamed from: A */
    public ijr f30814A;

    /* JADX INFO: renamed from: B */
    public ahr f30815B;

    /* JADX INFO: renamed from: z */
    public fjr f30816z;

    /* JADX INFO: renamed from: N4 */
    public static LikedUserFrag m47960N4(boolean z) {
        LikedUserFrag likedUserFrag = new LikedUserFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("from_type", z);
        likedUserFrag.setArguments(bundle);
        return likedUserFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m47961U4(Boolean bool) {
        if (bool.booleanValue()) {
            mo30636J4().m152777l();
        } else {
            mo30636J4().m152776k();
        }
    }

    @Override // p153l.gwl
    /* JADX INFO: renamed from: G2 */
    public String mo47962G2(boolean z) {
        return abb0.m96736c("p_navigation_ilike,card_button_pull", z ? 2 : 1);
    }

    @Override // p153l.pcj, java.util.concurrent.Callable
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "我喜欢";
    }

    /* JADX INFO: renamed from: P4 */
    public void m47964P4() {
        this.f30816z = new fjr(this);
        ijr ijrVar = new ijr(this);
        this.f30814A = ijrVar;
        this.f30816z.mo52715C(ijrVar);
    }

    /* JADX INFO: renamed from: Q4 */
    public ahr m47965Q4() {
        if (this.f30815B == null) {
            this.f30815B = new ahr(m47967S4());
        }
        return this.f30815B;
    }

    /* JADX INFO: renamed from: R4 */
    public final ijr m47966R4() {
        if (this.f30814A == null) {
            m47964P4();
        }
        return this.f30814A;
    }

    /* JADX INFO: renamed from: S4 */
    public fjr m47967S4() {
        if (this.f30816z == null) {
            m47964P4();
        }
        return this.f30816z;
    }

    /* JADX INFO: renamed from: T4 */
    public void m47968T4() {
        this.f30814A.m140225e();
    }

    @Override // p153l.gwl
    /* JADX INFO: renamed from: Z0 */
    public void mo47969Z0() {
        fjr fjrVar = this.f30816z;
        fjrVar.f99415c = null;
        fjrVar.f99416d = null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m47967S4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m47967S4().mo40473a0();
        if (CoreModule.m30933P().m143405a().mo34436Vf()) {
            m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.chr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81858a.m47961U4((Boolean) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        Bundle arguments = getArguments();
        if (NullChecker.m82486a(arguments) && arguments.getBoolean("from_type")) {
            m47968T4();
        }
    }

    @Override // p153l.f320
    /* JADX INFO: renamed from: i */
    public boolean mo47970i(int i, int i2, Intent intent) {
        fjr fjrVar = this.f30816z;
        if (fjrVar == null) {
            return false;
        }
        return fjrVar.m125909c1(i, i2, intent);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m47966R4().inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.gwl
    public void notifyDataSetChanged() {
        m47965Q4().notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m47967S4().destroy();
        m47966R4().destroy();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f30816z.onResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_who_i_liked";
    }

    @Override // p153l.gwl
    /* JADX INFO: renamed from: w0 */
    public void mo47971w0(boolean z, String str, LikedUser likedUser) {
        this.f30816z.m125911e1(likedUser);
    }
}
