package com.p051p1.mobile.putong.live.base.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.dev;
import p153l.dhw;
import p153l.efv;
import p153l.fhw;
import p153l.irq;
import p153l.k7f0;
import p153l.lhl;
import p153l.vxr;
import p153l.wzx;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class LiveWebViewAct extends PutongAct {

    /* JADX INFO: renamed from: k */
    public static int f45694k = 1;

    /* JADX INFO: renamed from: l */
    public static int f45695l = 2;

    /* JADX INFO: renamed from: m */
    public static int f45696m = 3;

    /* JADX INFO: renamed from: n */
    public static int f45697n = 4;

    /* JADX INFO: renamed from: o */
    public static List<String> f45698o = Arrays.asList(efv.f93845b, efv.f93844a);

    /* JADX INFO: renamed from: c */
    public FrameLayout f45699c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f45700d;

    /* JADX INFO: renamed from: e */
    public String f45701e;

    /* JADX INFO: renamed from: f */
    public String f45702f;

    /* JADX INFO: renamed from: g */
    public int f45703g;

    /* JADX INFO: renamed from: h */
    public boolean f45704h = false;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f45705i;

    /* JADX INFO: renamed from: j */
    public k7f0 f45706j;

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ boolean m70065b2(View view) {
        return true;
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m70066d2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) LiveWebViewAct.class);
        intent.putExtra("url", str);
        return intent;
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m70067e2(Context context, String str, int i) {
        Intent intent = new Intent(context, (Class<?>) LiveWebViewAct.class);
        intent.putExtra("url", str);
        intent.putExtra("extra_page_type", i);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m70068l2(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            this.f45700d.m70050p();
            if (f45695l == this.f45703g) {
                vxr.m203883k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTitle(this.f45701e);
        m70072i2();
    }

    /* JADX INFO: renamed from: c2 */
    public View m70069c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dev.m115470b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g2 */
    public int m70070g2() {
        return this.f45703g;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m70071h2() {
        this.f45700d.m70048n(this.f45705i);
    }

    /* JADX INFO: renamed from: i2 */
    public void m70072i2() {
        String queryParameter;
        try {
            queryParameter = Uri.parse(this.f45702f).getQueryParameter("_bid");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            queryParameter = null;
        }
        boolean zM82486a = NullChecker.m82486a(queryParameter);
        LiveMkWebView liveMkWebView = this.f45700d;
        if (zM82486a) {
            liveMkWebView.m70059y(true, this.f45702f, CommonH5Builder.BgType.DEFAULT_BG);
        } else {
            liveMkWebView.m70059y(false, this.f45702f, CommonH5Builder.BgType.DEFAULT_BG);
        }
        duringCreated(vxr.m203875a()).subscribe(dhw.m115826e(new y20() { // from class: l.aev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70825a.m70074m2((AuthData) obj);
            }
        }, new y20() { // from class: l.bev
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76418a.m70075n2((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70069c2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        String stringExtra = getIntent().getStringExtra("title");
        this.f45701e = stringExtra;
        if (stringExtra == null) {
            this.f45701e = "";
        }
        this.f45702f = lhl.INSTANCE.m154223p(getIntent().getStringExtra("url"));
        this.f45703g = getIntent().getIntExtra("extra_page_type", 0);
        this.f45704h = getIntent().getBooleanExtra("extra_is_need_status_bar_hide", false);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.ydv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198628a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.zdv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203944a.m70068l2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m70073k2() {
        return !TextUtils.isEmpty(this.f45702f) && this.f45702f.contains(efv.f93845b);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m70074m2(AuthData authData) {
        HashMap map = new HashMap();
        map.put("Authorization", m70076o2());
        m70078q2(authData.accessToken, map);
        this.f45700d.setWebViewLongClickListener(new View.OnLongClickListener() { // from class: l.cev
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return LiveWebViewAct.m70065b2(view);
            }
        });
        this.f45700d.setWebViewOverScrollMode(2);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m70075n2(Throwable th) {
        this.f45700d.m70043A();
    }

    /* JADX INFO: renamed from: o2 */
    public String m70076o2() {
        return irq.m141843d(null, null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        fhw.m125605a("[live]verification", "on ActivityResult called for requestCode " + i);
        if (i == 10002 && i2 == -1) {
            m70071h2();
        }
        if (m70073k2() && NullChecker.m82486a(this.f45706j)) {
            this.f45706j.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f45700d.m70049o()) {
            this.f45700d.m70052r();
        } else {
            m45660g2();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f45700d.m70049o()) {
            this.f45700d.m70052r();
            return true;
        }
        m45660g2();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f45700d.m70049o()) {
            this.f45700d.m70052r();
            return true;
        }
        m45660g2();
        return true;
    }

    /* JADX INFO: renamed from: p2 */
    public final void m70077p2() {
        if (f45698o.contains(efv.f93844a) || f45698o.contains(efv.f93845b)) {
            getWindow().setSoftInputMode(32);
        } else {
            getWindow().setSoftInputMode(16);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        checkGradientColors();
        if (this.f45704h) {
            setTransparentStatusBar();
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final void m70078q2(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(this.f45702f)) {
            return;
        }
        m70077p2();
        if (m70073k2()) {
            PermissionHelper.m81065c().m81083r(wzx.m208784k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}).m81088w(false).m81086u(true).m81074i(this.act);
            this.f45700d.setWebChromeClientX(new k7f0(this));
        }
        LiveMkWebView liveMkWebView = this.f45700d;
        if (map != null) {
            liveMkWebView.m70046l(this, str, this.f45702f, map);
        } else {
            liveMkWebView.m70045k(this, str, this.f45702f);
        }
    }
}
