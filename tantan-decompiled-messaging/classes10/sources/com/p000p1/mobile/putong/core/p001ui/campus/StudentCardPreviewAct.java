package com.p000p1.mobile.putong.core.p001ui.campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import l.d30;
import l.e30;
import l.rol;
import l.rzb0;
import l.td50;
import l.w0c0;
import l.xdl0;
import p003l.a1g0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class StudentCardPreviewAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public PhotoPreviewView f1053c;

    /* JADX INFO: renamed from: d */
    public VText f1054d;

    /* JADX INFO: renamed from: e */
    public Media f1055e;

    /* JADX INFO: renamed from: f */
    public d30 f1056f = new d30() { // from class: l.w0g0
        public final void call() {
            this.f8109a.m1778h2();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.StudentCardPreviewAct$a */
    public class C3071a implements td50 {
        public C3071a() {
        }

        /* JADX INFO: renamed from: c */
        public void m1782c(float f, float f2) {
            if (f2 >= 0.0f) {
                StudentCardPreviewAct.this.decorOrSwipingDecorView().getBackground().setAlpha((int) ((xdl0.w0() / (xdl0.w0() + f2)) * 255.0f));
            }
        }

        /* JADX INFO: renamed from: d */
        public void m1783d() {
            StudentCardPreviewAct.this.m1776e2();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static final Intent m1774c2(Context context, Media media, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StudentCardPreviewAct.class);
        intent.putExtra("media", (Serializable) media);
        if (z) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m1775d2(View view) {
        m1781k2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m1777g2(Bundle bundle) {
        xdl0.E0(this.f1054d, new View.OnClickListener() { // from class: l.x0g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8278a.m1775d2(view);
            }
        });
        this.f1053c.a.setOnDragDismissListenler(new C3071a());
        this.f1053c.setOnTapListener(new PhotoPreviewView.c() { // from class: l.y0g0
            /* JADX INFO: renamed from: a */
            public final void m11076a() {
                this.f8622a.m1776e2();
            }
        });
        this.f1053c.N(this.f1055e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m1778h2() {
        Intent intent = new Intent();
        intent.putExtra("returnedMedia", (Serializable) this.f1055e);
        setResult(1, intent);
        m1776e2();
    }

    /* JADX INFO: renamed from: b2 */
    public View m1779b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a1g0.m5270b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m1776e2() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.a, rzb0.b);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m1780i2() {
        this.f1056f.call();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m1779b2(inflater(), viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.v0g0
            public final void call(Object obj) {
                this.f7852a.m1777g2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m1781k2() {
        dialog().E0(R.string.a).m0(getResources().getString(R.string.c)).v0(getResources().getString(R.string.j), new Runnable() { // from class: l.z0g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9176a.m1780i2();
            }
        }).z0();
    }

    public String pageId() {
        return "p_credentials_preview_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f1055e = getIntent().getSerializableExtra("media");
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(w0c0.V1));
        decorOrSwipingDecorView().setBackgroundColor(-16777216);
        dimStatusBar(true);
        if (!hasCustomTransition()) {
            overridePendingTransition(rzb0.c, rzb0.d);
        }
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().m();
        }
    }

    public boolean shouldShowGradientActionBar() {
        return false;
    }
}
