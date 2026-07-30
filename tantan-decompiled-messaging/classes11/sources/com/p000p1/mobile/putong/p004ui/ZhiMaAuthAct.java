package com.p000p1.mobile.putong.p004ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import l.c6q0;
import l.e30;
import l.hfw;
import l.mkd0;
import l.nx0;
import l.w9j;
import p009l.dgq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ZhiMaAuthAct extends Act {

    /* JADX INFO: renamed from: c */
    public String f7905c;

    /* JADX INFO: renamed from: d */
    public boolean f7906d = true;

    /* JADX INFO: renamed from: e */
    public nx0 f7907e;

    /* JADX INFO: renamed from: G1 */
    public static Intent m9733G1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) ZhiMaAuthAct.class);
        intent.putExtra("url", str);
        return intent;
    }

    /* JADX INFO: renamed from: H1 */
    public static Intent m9734H1(Context context, String str, String str2) {
        Intent intentM9733G1 = m9733G1(context, str);
        intentM9733G1.putExtra("from", str2);
        return intentM9733G1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public /* synthetic */ void m9735I1(c cVar) {
        if (this.f7906d) {
            this.f7906d = false;
            return;
        }
        dgq0.m13345c(2, null);
        m9737K1("send result cancel");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("url");
        this.f7905c = getIntent().getStringExtra("from");
        if (TextUtils.isEmpty(stringExtra)) {
            dgq0.m13345c(2, null);
            m9737K1("send result cancel in create");
            finish();
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + URLEncoder.encode(stringExtra)));
            m9737K1("start alipay for zhiMaAuth");
            startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final void m9736J1(@Nullable Uri uri) {
        if (NullChecker.a(uri)) {
            dgq0.m13345c(1, uri);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final void m9737K1(String str) {
        hfw.a("[putong-common][zhimaauth]", str + (" firstOnResume : " + this.f7906d));
    }

    @NonNull
    public nx0 getAppTheme() {
        if (this.f7907e == null) {
            this.f7907e = new c6q0(this);
        }
        return this.f7907e;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.agq0
            public final void call(Object obj) {
                this.f9497a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        lifecycle().filter(new w9j() { // from class: l.bgq0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj).equals(c.i));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.cgq0
            public final void call(Object obj) {
                this.f10586a.m9735I1((c) obj);
            }
        }));
    }

    public void onBackPressed() {
        dgq0.m13345c(2, null);
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Uri data = intent.getData();
        m9736J1(data);
        m9737K1("publishVerificationResult invoked in onNewIntent, uri = " + data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Uri data = getIntent().getData();
        m9736J1(data);
        m9737K1("publishVerificationResult invoked in preCreateView, uri = " + data);
    }
}
