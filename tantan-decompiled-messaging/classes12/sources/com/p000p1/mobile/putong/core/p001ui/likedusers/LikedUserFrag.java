package com.p000p1.mobile.putong.core.p001ui.likedusers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;
import l.v9j;
import l.w2b0;
import p007l.ehr;
import p007l.hhr;
import p007l.stl;
import p007l.xu10;
import p007l.zer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikedUserFrag extends PutongFrag implements v9j<String>, stl, xu10 {

    /* JADX INFO: renamed from: A */
    public hhr f75A;

    /* JADX INFO: renamed from: B */
    public zer f76B;

    /* JADX INFO: renamed from: z */
    public ehr f77z;

    /* JADX INFO: renamed from: N4 */
    public static LikedUserFrag m449N4(boolean z) {
        LikedUserFrag likedUserFrag = new LikedUserFrag();
        Bundle bundle = new Bundle();
        bundle.putBoolean("from_type", z);
        likedUserFrag.setArguments(bundle);
        return likedUserFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m450U4(Boolean bool) {
        if (bool.booleanValue()) {
            J4().l();
        } else {
            J4().k();
        }
    }

    @Override // p007l.stl
    /* JADX INFO: renamed from: G2 */
    public String mo451G2(boolean z) {
        return w2b0.c("p_navigation_ilike,card_button_pull", z ? 2 : 1);
    }

    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "我喜欢";
    }

    /* JADX INFO: renamed from: P4 */
    public void m453P4() {
        this.f77z = new ehr(this);
        hhr hhrVar = new hhr(this);
        this.f75A = hhrVar;
        this.f77z.C(hhrVar);
    }

    /* JADX INFO: renamed from: Q4 */
    public zer m454Q4() {
        if (this.f76B == null) {
            this.f76B = new zer(m456S4());
        }
        return this.f76B;
    }

    /* JADX INFO: renamed from: R4 */
    public final hhr m455R4() {
        if (this.f75A == null) {
            m453P4();
        }
        return this.f75A;
    }

    /* JADX INFO: renamed from: S4 */
    public ehr m456S4() {
        if (this.f77z == null) {
            m453P4();
        }
        return this.f77z;
    }

    /* JADX INFO: renamed from: T4 */
    public void m457T4() {
        this.f75A.m10630e();
    }

    @Override // p007l.stl
    /* JADX INFO: renamed from: Z0 */
    public void mo458Z0() {
        ehr ehrVar = this.f77z;
        ehrVar.f7379c = null;
        ehrVar.f7380d = null;
    }

    /* JADX INFO: renamed from: d4 */
    public void m459d4() {
        super.d4();
        m456S4().m9882Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m460f4() {
        super.f4();
        m456S4().m9883a0();
        if (CoreModule.P().a().Vf()) {
            L4().subscribe(mkd0.G(new e30() { // from class: l.bfr
                public final void call(Object obj) {
                    this.f6285a.m450U4((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m461g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        Bundle arguments = getArguments();
        if (NullChecker.a(arguments) && arguments.getBoolean("from_type")) {
            m457T4();
        }
    }

    @Override // p007l.xu10
    /* JADX INFO: renamed from: i */
    public boolean mo462i(int i, int i2, Intent intent) {
        ehr ehrVar = this.f77z;
        if (ehrVar == null) {
            return false;
        }
        return ehrVar.m9886c1(i, i2, intent);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m455R4().inflateView(layoutInflater, viewGroup);
    }

    @Override // p007l.stl
    public void notifyDataSetChanged() {
        m454Q4().notifyDataSetChanged();
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        m456S4().destroy();
        m455R4().destroy();
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        this.f77z.onResume();
    }

    public String pageId() {
        return "p_who_i_liked";
    }

    @Override // p007l.stl
    /* JADX INFO: renamed from: w0 */
    public void mo463w0(boolean z, String str, LikedUser likedUser) {
        this.f77z.m9888e1(likedUser);
    }
}
