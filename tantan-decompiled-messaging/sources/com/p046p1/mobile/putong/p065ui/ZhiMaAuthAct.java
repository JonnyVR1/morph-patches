package com.p046p1.mobile.putong.p065ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import p149l.c6q0;
import p149l.dgq0;
import p149l.e30;
import p149l.hfw;
import p149l.mkd0;
import p149l.nx0;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class ZhiMaAuthAct extends Act {

    /* JADX INFO: renamed from: c */
    public String f54299c;

    /* JADX INFO: renamed from: d */
    public boolean f54300d = true;

    /* JADX INFO: renamed from: e */
    public nx0 f54301e;

    /* JADX INFO: renamed from: G1 */
    public static Intent m79412G1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ZhiMaAuthAct.class);
        intent.putExtra("url", str);
        return intent;
    }

    /* JADX INFO: renamed from: H1 */
    public static Intent m79413H1(Context context, String str, String str2) {
        Intent intentM79412G1 = m79412G1(context, str);
        intentM79412G1.putExtra("from", str2);
        return intentM79412G1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public /* synthetic */ void m79414I1(C4319c c4319c) {
        if (this.f54300d) {
            this.f54300d = false;
            return;
        }
        dgq0.m111732c(2, null);
        m79416K1("send result cancel");
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        this.f54299c = getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            dgq0.m111732c(2, null);
            m79416K1("send result cancel in create");
            m66873d2();
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + URLEncoder.encode(stringExtra)));
            m79416K1("start alipay for zhiMaAuth");
            startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final void m79415J1(@Nullable Uri uri) {
        if (NullChecker.m81303a(uri)) {
            dgq0.m111732c(1, uri);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final void m79416K1(String str) {
        hfw.m130790a("[putong-common][zhimaauth]", str + (" firstOnResume : " + this.f54300d));
    }

    @Override // com.p046p1.mobile.android.app.Act
    @NonNull
    public nx0 getAppTheme() {
        if (this.f54301e == null) {
            this.f54301e = new c6q0(this);
        }
        return this.f54301e;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.agq0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69391a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.bgq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj).equals(C4319c.f15548i));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.cgq0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80789a.m79414I1((C4319c) obj);
            }
        }));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        dgq0.m111732c(2, null);
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        m79415J1(data);
        m79416K1("publishVerificationResult invoked in onNewIntent, uri = " + data);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Uri data = getIntent().getData();
        m79415J1(data);
        m79416K1("publishVerificationResult invoked in preCreateView, uri = " + data);
    }
}
