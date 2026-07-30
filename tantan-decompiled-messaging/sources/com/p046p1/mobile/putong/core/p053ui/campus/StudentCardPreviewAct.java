package com.p046p1.mobile.putong.core.p053ui.campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.a1g0;
import p149l.d30;
import p149l.e30;
import p149l.rol;
import p149l.rzb0;
import p149l.td50;
import p149l.w0c0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes10.dex */
public class StudentCardPreviewAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public PhotoPreviewView f28659c;

    /* JADX INFO: renamed from: d */
    public VText f28660d;

    /* JADX INFO: renamed from: e */
    public Media f28661e;

    /* JADX INFO: renamed from: f */
    public d30 f28662f = new d30() { // from class: l.w0g0
        @Override // p149l.d30
        public final void call() {
            this.f183917a.m44479h2();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.StudentCardPreviewAct$a */
    public class C8296a implements td50 {
        public C8296a() {
        }

        @Override // p149l.td50
        /* JADX INFO: renamed from: c */
        public void mo44483c(float f, float f2) {
            if (f2 >= 0.0f) {
                StudentCardPreviewAct.this.decorOrSwipingDecorView().getBackground().setAlpha((int) ((xdl0.m208408w0() / (xdl0.m208408w0() + f2)) * 255.0f));
            }
        }

        @Override // p149l.td50
        /* JADX INFO: renamed from: d */
        public void mo44484d() {
            StudentCardPreviewAct.this.m44477e2();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static final Intent m44475c2(Context context, Media media, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StudentCardPreviewAct.class);
        intent.putExtra("media", media);
        if (z) {
            intent.addFlags(268435456);
            intent.addFlags(524288);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m44476d2(View view) {
        m44482k2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m44478g2(Bundle bundle) {
        xdl0.m208329E0(this.f28660d, new View.OnClickListener() { // from class: l.x0g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188967a.m44476d2(view);
            }
        });
        this.f28659c.f28022a.setOnDragDismissListenler(new C8296a());
        this.f28659c.setOnTapListener(new PhotoPreviewView.InterfaceC8263c() { // from class: l.y0g0
            @Override // com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView.InterfaceC8263c
            /* JADX INFO: renamed from: a */
            public final void mo43950a() {
                this.f195308a.m44477e2();
            }
        });
        this.f28659c.m43944N((Picture) this.f28661e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m44479h2() {
        Intent intent = new Intent();
        intent.putExtra("returnedMedia", this.f28661e);
        setResult(1, intent);
        m44477e2();
    }

    /* JADX INFO: renamed from: b2 */
    public View m44480b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a1g0.m94563b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m44477e2() {
        super.m44477e2();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(rzb0.f161629a, rzb0.f161630b);
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m44481i2() {
        this.f28662f.call();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m44480b2(inflater(), viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.v0g0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179112a.m44478g2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m44482k2() {
        dialog().m20503E0(R$string.f18346a).m20543m0(getResources().getString(R$string.f18408c)).m20560v0(getResources().getString(R$string.f18622j), new Runnable() { // from class: l.z0g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200995a.m44481i2();
            }
        }).m20568z0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_credentials_preview_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f28661e = (Media) getIntent().getSerializableExtra("media");
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(w0c0.f183814V1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (!hasCustomTransition()) {
            overridePendingTransition(rzb0.f161631c, rzb0.f161632d);
        }
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }
}
