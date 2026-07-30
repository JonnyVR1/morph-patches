package com.p046p1.mobile.putong.live.base.webview;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.ccv;
import p149l.ddv;
import p149l.dze0;
import p149l.e30;
import p149l.ffw;
import p149l.hfw;
import p149l.ipq;
import p149l.uvr;
import p149l.zqx;

/* JADX INFO: loaded from: classes13.dex */
public class LiveWebViewAct extends PutongAct {

    /* JADX INFO: renamed from: k */
    public static int f44846k = 1;

    /* JADX INFO: renamed from: l */
    public static int f44847l = 2;

    /* JADX INFO: renamed from: m */
    public static int f44848m = 3;

    /* JADX INFO: renamed from: n */
    public static int f44849n = 4;

    /* JADX INFO: renamed from: o */
    public static List<String> f44850o = Arrays.asList(ddv.f85652b, ddv.f85651a);

    /* JADX INFO: renamed from: c */
    public FrameLayout f44851c;

    /* JADX INFO: renamed from: d */
    public LiveMkWebView f44852d;

    /* JADX INFO: renamed from: e */
    public String f44853e;

    /* JADX INFO: renamed from: f */
    public String f44854f;

    /* JADX INFO: renamed from: g */
    public int f44855g;

    /* JADX INFO: renamed from: h */
    public boolean f44856h = false;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f44857i;

    /* JADX INFO: renamed from: j */
    public dze0 f44858j;

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ boolean m68882a2(View view) {
        return true;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m68883c2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) LiveWebViewAct.class);
        intent.putExtra("url", str);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m68884d2(Context context, String str, int i) {
        Intent intent = new Intent(context, (Class<?>) LiveWebViewAct.class);
        intent.putExtra("url", str);
        intent.putExtra("extra_page_type", i);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m68885k2(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            this.f44852d.m68867p();
            if (f44847l == this.f44855g) {
                uvr.m196094k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTitle(this.f44853e);
        m68889h2();
    }

    /* JADX INFO: renamed from: b2 */
    public View m68886b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ccv.m106202b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public int m68887e2() {
        return this.f44855g;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m68888g2() {
        this.f44852d.m68865n(this.f44857i);
    }

    /* JADX INFO: renamed from: h2 */
    public void m68889h2() {
        String queryParameter;
        try {
            queryParameter = Uri.parse(this.f44854f).getQueryParameter("_bid");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            queryParameter = null;
        }
        boolean zM81303a = NullChecker.m81303a(queryParameter);
        LiveMkWebView liveMkWebView = this.f44852d;
        if (zM81303a) {
            liveMkWebView.m68876y(true, this.f44854f, CommonH5Builder.BgType.DEFAULT_BG);
        } else {
            liveMkWebView.m68876y(false, this.f44854f, CommonH5Builder.BgType.DEFAULT_BG);
        }
        duringCreated(uvr.m196086a()).subscribe(ffw.m121194e(new e30() { // from class: l.zbv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202492a.m68891l2((AuthData) obj);
            }
        }, new e30() { // from class: l.acv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68882a.m68892m2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i2 */
    public final boolean m68890i2() {
        return !TextUtils.isEmpty(this.f44854f) && this.f44854f.contains(ddv.f85652b);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m68886b2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        String stringExtra = getIntent().getStringExtra("title");
        this.f44853e = stringExtra;
        if (stringExtra == null) {
            this.f44853e = "";
        }
        this.f44854f = getIntent().getStringExtra("url");
        this.f44855g = getIntent().getIntExtra("extra_page_type", 0);
        this.f44856h = getIntent().getBooleanExtra("extra_is_need_status_bar_hide", false);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.xbv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191967a.lambda$initSubscription$0((Bundle) obj);
            }
        });
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.ybv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197368a.m68885k2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m68891l2(AuthData authData) {
        HashMap map = new HashMap();
        map.put("Authorization", m68893n2());
        m68895p2(authData.accessToken, map);
        this.f44852d.setWebViewLongClickListener(new View.OnLongClickListener() { // from class: l.bcv
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return LiveWebViewAct.m68882a2(view);
            }
        });
        this.f44852d.setWebViewOverScrollMode(2);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m68892m2(Throwable th) {
        this.f44852d.m68860A();
    }

    /* JADX INFO: renamed from: n2 */
    public String m68893n2() {
        return ipq.m137568d(null, null);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m68894o2() {
        if (f44850o.contains(ddv.f85651a) || f44850o.contains(ddv.f85652b)) {
            getWindow().setSoftInputMode(32);
        } else {
            getWindow().setSoftInputMode(16);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        hfw.m130790a("[live]verification", "on ActivityResult called for requestCode " + i);
        if (i == 10002 && i2 == -1) {
            m68888g2();
        }
        if (m68890i2() && NullChecker.m81303a(this.f44858j)) {
            this.f44858j.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f44852d.m68866o()) {
            this.f44852d.m68869r();
        } else {
            m66873d2();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f44852d.m68866o()) {
            this.f44852d.m68869r();
            return true;
        }
        m66873d2();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f44852d.m68866o()) {
            this.f44852d.m68869r();
            return true;
        }
        m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: p2 */
    public final void m68895p2(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(this.f44854f)) {
            return;
        }
        m68894o2();
        if (m68890i2()) {
            PermissionHelper.m79882c().m79900r(zqx.m219898k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"}).m79905w(false).m79903u(true).m79891i(this.act);
            this.f44852d.setWebChromeClientX(new dze0(this));
        }
        LiveMkWebView liveMkWebView = this.f44852d;
        if (map != null) {
            liveMkWebView.m68863l(this, str, this.f44854f, map);
        } else {
            liveMkWebView.m68862k(this, str, this.f44854f);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        checkGradientColors();
        if (this.f44856h) {
            setTransparentStatusBar();
        }
    }
}
