package com.p046p1.mobile.putong.core.p053ui.likedusers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.ehr;
import p149l.hhr;
import p149l.mkd0;
import p149l.stl;
import p149l.v9j;
import p149l.w2b0;
import p149l.xu10;
import p149l.zer;

/* JADX INFO: loaded from: classes12.dex */
public class LikedUserFrag extends PutongFrag implements v9j<String>, stl, xu10 {

    /* JADX INFO: renamed from: A */
    public hhr f29966A;

    /* JADX INFO: renamed from: B */
    public zer f29967B;

    /* JADX INFO: renamed from: z */
    public ehr f29968z;

    /* JADX INFO: renamed from: N4 */
    public static LikedUserFrag m46777N4(boolean z) {
        LikedUserFrag likedUserFrag = new LikedUserFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("from_type", z);
        likedUserFrag.setArguments(bundle);
        return likedUserFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m46778U4(Boolean bool) {
        if (bool.booleanValue()) {
            mo29638J4().m109036l();
        } else {
            mo29638J4().m109035k();
        }
    }

    @Override // p149l.stl
    /* JADX INFO: renamed from: G2 */
    public String mo46779G2(boolean z) {
        return w2b0.m201089c("p_navigation_ilike,card_button_pull", z ? 2 : 1);
    }

    @Override // p149l.v9j, java.util.concurrent.Callable
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "我喜欢";
    }

    /* JADX INFO: renamed from: P4 */
    public void m46781P4() {
        this.f29968z = new ehr(this);
        hhr hhrVar = new hhr(this);
        this.f29966A = hhrVar;
        this.f29968z.mo51532C(hhrVar);
    }

    /* JADX INFO: renamed from: Q4 */
    public zer m46782Q4() {
        if (this.f29967B == null) {
            this.f29967B = new zer(m46784S4());
        }
        return this.f29967B;
    }

    /* JADX INFO: renamed from: R4 */
    public final hhr m46783R4() {
        if (this.f29966A == null) {
            m46781P4();
        }
        return this.f29966A;
    }

    /* JADX INFO: renamed from: S4 */
    public ehr m46784S4() {
        if (this.f29968z == null) {
            m46781P4();
        }
        return this.f29968z;
    }

    /* JADX INFO: renamed from: T4 */
    public void m46785T4() {
        this.f29966A.m131134e();
    }

    @Override // p149l.stl
    /* JADX INFO: renamed from: Z0 */
    public void mo46786Z0() {
        ehr ehrVar = this.f29968z;
        ehrVar.f91374c = null;
        ehrVar.f91375d = null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m46784S4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m46784S4().mo39470a0();
        if (CoreModule.m29935P().m94651a().mo33433Vf()) {
            m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.bfr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75348a.m46778U4((Boolean) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        Bundle arguments = getArguments();
        if (NullChecker.m81303a(arguments) && arguments.getBoolean("from_type")) {
            m46785T4();
        }
    }

    @Override // p149l.xu10
    /* JADX INFO: renamed from: i */
    public boolean mo46787i(int i, int i2, Intent intent) {
        ehr ehrVar = this.f29968z;
        if (ehrVar == null) {
            return false;
        }
        return ehrVar.m116554c1(i, i2, intent);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m46783R4().inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.stl
    public void notifyDataSetChanged() {
        m46782Q4().notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m46784S4().destroy();
        m46783R4().destroy();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f29968z.onResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_who_i_liked";
    }

    @Override // p149l.stl
    /* JADX INFO: renamed from: w0 */
    public void mo46788w0(boolean z, String str, LikedUser likedUser) {
        this.f29968z.m116556e1(likedUser);
    }
}
