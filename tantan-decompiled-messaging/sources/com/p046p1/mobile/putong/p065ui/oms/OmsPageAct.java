package com.p046p1.mobile.putong.p065ui.oms;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.OmsMerCuryData;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p149l.dji0;
import p149l.e30;
import p149l.j760;
import p149l.mc50;
import p149l.nc50;
import p149l.qzb0;

/* JADX INFO: loaded from: classes11.dex */
public class OmsPageAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FrameLayout f54612c;

    /* JADX INFO: renamed from: d */
    public String f54613d;

    /* JADX INFO: renamed from: e */
    public OmsMerCuryData f54614e;

    /* JADX INFO: renamed from: f */
    public boolean f54615f;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m79874Y1(Context context, String str, OmsMerCuryData omsMerCuryData, boolean z) {
        Intent intent = new Intent(context, (Class<?>) OmsPageAct.class);
        intent.putExtra("oms_identifier", str);
        intent.putExtra("oms_mercury", omsMerCuryData);
        intent.putExtra("oms_cancel_able", z);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    private void m79875a2() {
        this.f54613d = getIntent().getStringExtra("oms_identifier");
        this.f54614e = (OmsMerCuryData) getIntent().getSerializableExtra("oms_mercury");
        this.f54615f = getIntent().getBooleanExtra("oms_cancel_able", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m79876r();
    }

    /* JADX INFO: renamed from: r */
    private void m79876r() {
        if (!nc50.m158912f().m158916d(this.f54613d) || nc50.m158912f().m158917e(this.f54613d) == null) {
            lambda$debugItems$19();
            return;
        }
        m79878Z1();
        nc50.m158912f().m158924m(this.f54613d, this);
        this.f54612c.removeAllViews();
        this.f54612c.addView(nc50.m158912f().m158917e(this.f54613d));
    }

    /* JADX INFO: renamed from: X1 */
    public View m79877X1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mc50.m153986b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m79878Z1() {
        View viewM158917e = nc50.m158912f().m158917e(this.f54613d);
        if (NullChecker.m81303a(viewM158917e) && NullChecker.m81303a(viewM158917e.getParent())) {
            ((ViewGroup) viewM158917e.getParent()).removeView(viewM158917e);
        }
        PutongAct putongActM158913a = nc50.m158912f().m158913a(this.f54613d);
        if (NullChecker.m81303a(putongActM158913a)) {
            putongActM158913a.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m79879b2() {
        this.pageHelper.m109041q(this.f54614e.f38800id);
        if (NullChecker.m81303a(this.f54614e) && NullChecker.m81303a(this.f54614e.server) && this.f54614e.server.size() > 0) {
            j760[] j760VarArr = new j760[this.f54614e.server.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : this.f54614e.server.entrySet()) {
                j760VarArr[i] = new j760(entry.getKey(), dji0.m112044g(entry.getValue()));
                i++;
            }
            this.pageHelper.m109040p(j760VarArr);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        nc50.m158912f().m158923l(this.f54613d);
        overridePendingTransition(0, qzb0.f157022c);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m79877X1(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m79875a2();
        m79879b2();
        creates(new e30() { // from class: l.lc50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127377a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f54615f) {
            super.onBackPressed();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        overridePendingTransition(qzb0.f157021b, 0);
        super.preCreateView(bundle);
    }
}
