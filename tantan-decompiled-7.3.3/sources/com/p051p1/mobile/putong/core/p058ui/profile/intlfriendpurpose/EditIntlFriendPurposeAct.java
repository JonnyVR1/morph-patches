package com.p051p1.mobile.putong.core.p058ui.profile.intlfriendpurpose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p051p1.mobile.putong.data.ProfileExtensionBasic;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.khn;
import p153l.lhn;
import p153l.psd0;
import p153l.r1j0;
import p153l.uxj0;
import p153l.vle;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class EditIntlFriendPurposeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f34222c;

    /* JADX INFO: renamed from: d */
    public VImage f34223d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f34224e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f34225f;

    /* JADX INFO: renamed from: g */
    public khn f34226g;

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m52627a2(Throwable th) {
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m52630e2(Context context, String str, boolean z) {
        return m52631g2(context, str, z, null);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m52631g2(Context context, String str, boolean z, String str2) {
        return new Intent(context, (Class<?>) EditIntlFriendPurposeAct.class).putExtra("intl_friend_purpose", str).putExtra("is_patch", z).putExtra("extra_from", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m52632h2(View view) {
        m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m52633i2(View view) {
        String strM149802N = this.f34226g.m149802N();
        if (TextUtils.isEmpty(strM149802N)) {
            return;
        }
        i4g0.m138523u("e_intl_popup_relation_goals_button", "p_intl_popup_relation_goals", jyb.m147494Y("intl_purpose", strM149802N));
        if (getIntent().getBooleanExtra("is_patch", false)) {
            m52635m2(strM149802N);
        } else {
            m52639o2(strM149802N);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m52634k2(uxj0 uxj0Var) {
        r1j0.m179419f(R$string.f18831Ro);
        m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        CoreModule.f18264c.f20381e0.f89073L6.put(Boolean.TRUE);
        lhn.INSTANCE.m154231b().onNext(Unit.INSTANCE);
        m52638n2(getIntent().getStringExtra("intl_friend_purpose"));
        bnl0.m105509E0(this.f34223d, new View.OnClickListener() { // from class: l.qle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158222a.m52632h2(view);
            }
        });
        bnl0.m105509E0(this.f34225f, new View.OnClickListener() { // from class: l.rle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163717a.m52633i2(view);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    private void m52635m2(String str) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ProfileExtensionBasic profileExtensionBasic = userMo225055clone.profile.extensions.basic;
        profileExtensionBasic.intlFriendPurpose = arrayList;
        profileExtensionBasic.intlFriendPurposeV2 = arrayList;
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na());
        if (NullChecker.m82486a(userSubtract)) {
            this.act.duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.tle
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174811a.m52634k2((uxj0) obj);
                }
            }, new y20() { // from class: l.ule
                @Override // p153l.y20
                public final void call(Object obj) {
                    EditIntlFriendPurposeAct.m52627a2((Throwable) obj);
                }
            }));
        } else {
            m45660g2();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public View m52636d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vle.m201598b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m52636d2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.ple
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153022a.lambda$initSubscription$2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m52637l2(boolean z) {
        this.f34225f.setEnabled(z);
        this.f34225f.setBackgroundResource(z ? dbc0.f86392N : dbc0.f86424O);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m52638n2(String str) {
        List<lhn.C18395a> listM154232c = lhn.INSTANCE.m154232c();
        for (lhn.C18395a c18395a : listM154232c) {
            c18395a.m154241g(TextUtils.equals(c18395a.getId(), str));
        }
        khn khnVar = new khn(this.act, listM154232c);
        this.f34226g = khnVar;
        khnVar.m149805Q(new khn.InterfaceC18165a() { // from class: l.sle
            @Override // p153l.khn.InterfaceC18165a
            /* JADX INFO: renamed from: a */
            public final void mo97883a(boolean z) {
                this.f169368a.m52637l2(z);
            }
        });
        this.f34224e.setAdapter(this.f34226g);
        this.f34225f.setBackgroundResource(!TextUtils.isEmpty(this.f34226g.m149802N()) ? dbc0.f86392N : dbc0.f86424O);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m52639o2(String str) {
        Intent intent = new Intent();
        intent.putExtra("intl_friend_purpose", str);
        act().setResult(-1, intent);
        m45660g2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_popup_relation_goals";
    }
}
