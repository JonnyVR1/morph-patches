package com.p000p1.mobile.putong.core.p001ui.profile.intlfriendpurpose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.ProfileExtensionBasic;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import l.e30;
import l.j760;
import l.kfn;
import l.lfn;
import l.mkd0;
import l.osi0;
import l.rke;
import l.roj0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VImage;
import v.VRecyclerView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class EditIntlFriendPurposeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f1196c;

    /* JADX INFO: renamed from: d */
    public VImage f1197d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f1198e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f1199f;

    /* JADX INFO: renamed from: g */
    public kfn f1200g;

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m1926Z1(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m1929d2(Context context, String str, boolean z) {
        return m1930e2(context, str, z, null);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m1930e2(Context context, String str, boolean z, String str2) {
        return new Intent(context, (Class<?>) EditIntlFriendPurposeAct.class).putExtra("intl_friend_purpose", str).putExtra("is_patch", z).putExtra("extra_from", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m1931g2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m1932h2(View view) {
        String strN = this.f1200g.N();
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        zvf0.u("e_intl_popup_relation_goals_button", "p_intl_popup_relation_goals", new j760[]{vwb.Y("intl_purpose", strN)});
        if (getIntent().getBooleanExtra("is_patch", false)) {
            m1934l2(strN);
        } else {
            m1938n2(strN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m1933i2(roj0 roj0Var) {
        osi0.f(R.string.vo);
        finish();
    }

    /* JADX INFO: renamed from: l2 */
    private void m1934l2(String str) {
        User userClone = CoreModule.c.e0.na().clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ProfileExtensionBasic profileExtensionBasic = userClone.profile.extensions.basic;
        profileExtensionBasic.intlFriendPurpose = arrayList;
        profileExtensionBasic.intlFriendPurposeV2 = arrayList;
        User userSubtract = userClone.subtract(CoreModule.c.e0.na());
        if (NullChecker.a(userSubtract)) {
            ((Act) this).act.duringCreated(CoreModule.c.e0.u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.pke
                public final void call(Object obj) {
                    this.f17459a.m1933i2((roj0) obj);
                }
            }, new e30() { // from class: l.qke
                public final void call(Object obj) {
                    EditIntlFriendPurposeAct.m1926Z1((Throwable) obj);
                }
            }));
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        CoreModule.c.e0.L6.put(Boolean.TRUE);
        lfn.INSTANCE.b().onNext(Unit.INSTANCE);
        m1937m2(getIntent().getStringExtra("intl_friend_purpose"));
        xdl0.E0(this.f1197d, new View.OnClickListener() { // from class: l.mke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15432a.m1931g2(view);
            }
        });
        xdl0.E0(this.f1199f, new View.OnClickListener() { // from class: l.nke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16081a.m1932h2(view);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public View m1935c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rke.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m1935c2(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.lke
            public final void call(Object obj) {
                this.f14913a.lambda$initSubscription$2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m1936k2(boolean z) {
        this.f1199f.setEnabled(z);
        this.f1199f.setBackgroundResource(z ? x2c0.M : x2c0.N);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m1937m2(String str) {
        List<lfn.a> listC = lfn.INSTANCE.c();
        for (lfn.a aVar : listC) {
            aVar.g(TextUtils.equals(aVar.c(), str));
        }
        kfn kfnVar = new kfn(((Act) this).act, listC);
        this.f1200g = kfnVar;
        kfnVar.Q(new kfn.a() { // from class: l.oke
            /* JADX INFO: renamed from: a */
            public final void m19602a(boolean z) {
                this.f16683a.m1936k2(z);
            }
        });
        this.f1198e.setAdapter(this.f1200g);
        this.f1199f.setBackgroundResource(!TextUtils.isEmpty(this.f1200g.N()) ? x2c0.M : x2c0.N);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m1938n2(String str) {
        Intent intent = new Intent();
        intent.putExtra("intl_friend_purpose", str);
        act().setResult(-1, intent);
        finish();
    }

    public String pageId() {
        return "p_intl_popup_relation_goals";
    }
}
