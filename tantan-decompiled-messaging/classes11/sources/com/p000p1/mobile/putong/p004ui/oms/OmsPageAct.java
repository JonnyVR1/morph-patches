package com.p000p1.mobile.putong.p004ui.oms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.OmsMerCuryData;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.Map;
import l.e30;
import l.j760;
import l.mc50;
import l.qzb0;
import p009l.dji0;
import p009l.nc50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OmsPageAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FrameLayout f8218c;

    /* JADX INFO: renamed from: d */
    public String f8219d;

    /* JADX INFO: renamed from: e */
    public OmsMerCuryData f8220e;

    /* JADX INFO: renamed from: f */
    public boolean f8221f;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m10203Y1(Context context, String str, OmsMerCuryData omsMerCuryData, boolean z) {
        Intent intent = new Intent(context, (Class<?>) OmsPageAct.class);
        intent.putExtra("oms_identifier", str);
        intent.putExtra("oms_mercury", (Serializable) omsMerCuryData);
        intent.putExtra("oms_cancel_able", z);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    private void m10204a2() {
        this.f8219d = getIntent().getStringExtra("oms_identifier");
        this.f8220e = getIntent().getSerializableExtra("oms_mercury");
        this.f8221f = getIntent().getBooleanExtra("oms_cancel_able", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m10205r();
    }

    /* JADX INFO: renamed from: r */
    private void m10205r() {
        if (!nc50.m18839f().m18843d(this.f8219d) || nc50.m18839f().m18844e(this.f8219d) == null) {
            finish();
            return;
        }
        m10207Z1();
        nc50.m18839f().m18851m(this.f8219d, this);
        this.f8218c.removeAllViews();
        this.f8218c.addView(nc50.m18839f().m18844e(this.f8219d));
    }

    /* JADX INFO: renamed from: X1 */
    public View m10206X1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mc50.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m10207Z1() {
        View viewM18844e = nc50.m18839f().m18844e(this.f8219d);
        if (NullChecker.a(viewM18844e) && NullChecker.a(viewM18844e.getParent())) {
            ((ViewGroup) viewM18844e.getParent()).removeView(viewM18844e);
        }
        PutongAct putongActM18840a = nc50.m18839f().m18840a(this.f8219d);
        if (NullChecker.a(putongActM18840a)) {
            putongActM18840a.finish();
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m10208b2() {
        ((PutongAct) this).pageHelper.q(this.f8220e.id);
        if (NullChecker.a(this.f8220e) && NullChecker.a(this.f8220e.server) && this.f8220e.server.size() > 0) {
            j760[] j760VarArr = new j760[this.f8220e.server.size()];
            int i = 0;
            for (Map.Entry entry : this.f8220e.server.entrySet()) {
                j760VarArr[i] = new j760((String) entry.getKey(), dji0.m13360g((String) entry.getValue()));
                i++;
            }
            ((PutongAct) this).pageHelper.p(j760VarArr);
        }
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        nc50.m18839f().m18850l(this.f8219d);
        overridePendingTransition(0, qzb0.c);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10206X1(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        m10204a2();
        m10208b2();
        creates(new e30() { // from class: l.lc50
            public final void call(Object obj) {
                this.f16066a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        if (this.f8221f) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    public void preCreateView(Bundle bundle) {
        overridePendingTransition(qzb0.b, 0);
        super.preCreateView(bundle);
    }
}
