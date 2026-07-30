package com.p051p1.mobile.putong.p070ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import p153l.fhw;
import p153l.hfq0;
import p153l.ipq0;
import p153l.psd0;
import p153l.qcj;
import p153l.ux0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class ZhiMaAuthAct extends Act {

    /* JADX INFO: renamed from: c */
    public String f55147c;

    /* JADX INFO: renamed from: d */
    public boolean f55148d = true;

    /* JADX INFO: renamed from: e */
    public ux0 f55149e;

    /* JADX INFO: renamed from: H1 */
    public static Intent m80595H1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ZhiMaAuthAct.class);
        intent.putExtra("url", str);
        return intent;
    }

    /* JADX INFO: renamed from: I1 */
    public static Intent m80596I1(Context context, String str, String str2) {
        Intent intentM80595H1 = m80595H1(context, str);
        intentM80595H1.putExtra("from", str2);
        return intentM80595H1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public /* synthetic */ void m80597J1(C4470c c4470c) {
        if (this.f55148d) {
            this.f55148d = false;
            return;
        }
        ipq0.m141537c(2, null);
        m80599L1("send result cancel");
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        this.f55147c = getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            ipq0.m141537c(2, null);
            m80599L1("send result cancel in create");
            m68056e2();
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + URLEncoder.encode(stringExtra)));
            m80599L1("start alipay for zhiMaAuth");
            startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final void m80598K1(@Nullable Uri uri) {
        if (NullChecker.m82486a(uri)) {
            ipq0.m141537c(1, uri);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m80599L1(String str) {
        fhw.m125605a("[putong-common][zhimaauth]", str + (" firstOnResume : " + this.f55148d));
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NonNull
    public ux0 getAppTheme() {
        if (this.f55149e == null) {
            this.f55149e = new hfq0(this);
        }
        return this.f55149e;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.fpq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100216a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        lifecycle().filter(new qcj() { // from class: l.gpq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj).equals(C4470c.f16267i));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.hpq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111046a.m80597J1((C4470c) obj);
            }
        }));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ipq0.m141537c(2, null);
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        m80598K1(data);
        m80599L1("publishVerificationResult invoked in onNewIntent, uri = " + data);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Uri data = getIntent().getData();
        m80598K1(data);
        m80599L1("publishVerificationResult invoked in preCreateView, uri = " + data);
    }
}
