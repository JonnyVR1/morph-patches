package com.p046p1.mobile.putong.core.p053ui.profile.intlfriendpurpose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p046p1.mobile.putong.data.ProfileExtensionBasic;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;
import p149l.e30;
import p149l.kfn;
import p149l.lfn;
import p149l.mkd0;
import p149l.osi0;
import p149l.rke;
import p149l.roj0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class EditIntlFriendPurposeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f33374c;

    /* JADX INFO: renamed from: d */
    public VImage f33375d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f33376e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f33377f;

    /* JADX INFO: renamed from: g */
    public kfn f33378g;

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m51444Z1(Throwable th) {
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m51447d2(Context context, String str, boolean z) {
        return m51448e2(context, str, z, null);
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m51448e2(Context context, String str, boolean z, String str2) {
        return new Intent(context, (Class<?>) EditIntlFriendPurposeAct.class).putExtra("intl_friend_purpose", str).putExtra("is_patch", z).putExtra("extra_from", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m51449g2(View view) {
        m44477e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m51450h2(View view) {
        String strM145869N = this.f33378g.m145869N();
        if (TextUtils.isEmpty(strM145869N)) {
            return;
        }
        zvf0.m220399u("e_intl_popup_relation_goals_button", "p_intl_popup_relation_goals", vwb.m200311Y("intl_purpose", strM145869N));
        if (getIntent().getBooleanExtra("is_patch", false)) {
            m51452l2(strM145869N);
        } else {
            m51456n2(strM145869N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m51451i2(roj0 roj0Var) {
        osi0.m165782f(R$string.f19013vo);
        m44477e2();
    }

    /* JADX INFO: renamed from: l2 */
    private void m51452l2(String str) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ProfileExtensionBasic profileExtensionBasic = userMo223809clone.profile.extensions.basic;
        profileExtensionBasic.intlFriendPurpose = arrayList;
        profileExtensionBasic.intlFriendPurposeV2 = arrayList;
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na());
        if (NullChecker.m81303a(userSubtract)) {
            this.act.duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.pke
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f149967a.m51451i2((roj0) obj);
                }
            }, new e30() { // from class: l.qke
                @Override // p149l.e30
                public final void call(Object obj) {
                    EditIntlFriendPurposeAct.m51444Z1((Throwable) obj);
                }
            }));
        } else {
            m44477e2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        CoreModule.f17545c.f19639e0.f149216L6.put(Boolean.TRUE);
        lfn.INSTANCE.m149727b().onNext(Unit.INSTANCE);
        m51455m2(getIntent().getStringExtra("intl_friend_purpose"));
        xdl0.m208329E0(this.f33375d, new View.OnClickListener() { // from class: l.mke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134321a.m51449g2(view);
            }
        });
        xdl0.m208329E0(this.f33377f, new View.OnClickListener() { // from class: l.nke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139393a.m51450h2(view);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public View m51453c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rke.m179728b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51453c2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.lke
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128466a.lambda$initSubscription$2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m51454k2(boolean z) {
        this.f33377f.setEnabled(z);
        this.f33377f.setBackgroundResource(z ? x2c0.f189531M : x2c0.f189562N);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m51455m2(String str) {
        List<lfn.C18216a> listM149728c = lfn.INSTANCE.m149728c();
        for (lfn.C18216a c18216a : listM149728c) {
            c18216a.m149737g(TextUtils.equals(c18216a.getId(), str));
        }
        kfn kfnVar = new kfn(this.act, listM149728c);
        this.f33378g = kfnVar;
        kfnVar.m145872Q(new kfn.InterfaceC18004a() { // from class: l.oke
            @Override // p149l.kfn.InterfaceC18004a
            /* JADX INFO: renamed from: a */
            public final void mo96266a(boolean z) {
                this.f144416a.m51454k2(z);
            }
        });
        this.f33376e.setAdapter(this.f33378g);
        this.f33377f.setBackgroundResource(!TextUtils.isEmpty(this.f33378g.m145869N()) ? x2c0.f189531M : x2c0.f189562N);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m51456n2(String str) {
        Intent intent = new Intent();
        intent.putExtra("intl_friend_purpose", str);
        act().setResult(-1, intent);
        m44477e2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_popup_relation_goals";
    }
}
