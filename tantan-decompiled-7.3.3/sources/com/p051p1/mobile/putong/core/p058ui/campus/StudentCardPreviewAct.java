package com.p051p1.mobile.putong.core.p058ui.campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import p151v.VText;
import p153l.am50;
import p153l.bnl0;
import p153l.c9c0;
import p153l.crl;
import p153l.h9g0;
import p153l.x20;
import p153l.x7c0;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class StudentCardPreviewAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public PhotoPreviewView f29507c;

    /* JADX INFO: renamed from: d */
    public VText f29508d;

    /* JADX INFO: renamed from: e */
    public Media f29509e;

    /* JADX INFO: renamed from: f */
    public x20 f29510f = new x20() { // from class: l.d9g0
        @Override // p153l.x20
        public final void call() {
            this.f85774a.m45662i2();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.campus.StudentCardPreviewAct$a */
    public class C8459a implements am50 {
        public C8459a() {
        }

        @Override // p153l.am50
        /* JADX INFO: renamed from: c */
        public void mo45666c(float f, float f2) {
            if (f2 >= 0.0f) {
                StudentCardPreviewAct.this.decorOrSwipingDecorView().getBackground().setAlpha((int) ((bnl0.m105588w0() / (bnl0.m105588w0() + f2)) * 255.0f));
            }
        }

        @Override // p153l.am50
        /* JADX INFO: renamed from: d */
        public void mo45667d() {
            StudentCardPreviewAct.this.m45660g2();
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static final Intent m45658d2(Context context, Media media, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StudentCardPreviewAct.class);
        intent.putExtra("media", media);
        if (z) {
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.addFlags(524288);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m45659e2(View view) {
        m45665l2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m45661h2(Bundle bundle) {
        bnl0.m105509E0(this.f29508d, new View.OnClickListener() { // from class: l.e9g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92633a.m45659e2(view);
            }
        });
        this.f29507c.f28870a.setOnDragDismissListenler(new C8459a());
        this.f29507c.setOnTapListener(new PhotoPreviewView.InterfaceC8426c() { // from class: l.f9g0
            @Override // com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView.InterfaceC8426c
            /* JADX INFO: renamed from: a */
            public final void mo45133a() {
                this.f97883a.m45660g2();
            }
        });
        this.f29507c.m45127N((Picture) this.f29509e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m45662i2() {
        Intent intent = new Intent();
        intent.putExtra("returnedMedia", this.f29509e);
        setResult(1, intent);
        m45660g2();
    }

    /* JADX INFO: renamed from: c2 */
    public View m45663c2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h9g0.m134057b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] */
    public void m45660g2() {
        super.m45660g2();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(x7c0.f192686a, x7c0.f192687b);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m45663c2(inflater(), viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.c9g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80484a.m45661h2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m45664k2() {
        this.f29510f.call();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m45665l2() {
        dialog().m21502E0(R$string.f19076a).m21542m0(getResources().getString(R$string.f19138c)).m21559v0(getResources().getString(R$string.f19352j), new Runnable() { // from class: l.g9g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f102846a.m45664k2();
            }
        }).m21567z0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_credentials_preview_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f29509e = (Media) getIntent().getSerializableExtra("media");
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(c9c0.f80386W1));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (!hasCustomTransition()) {
            overridePendingTransition(x7c0.f192688c, x7c0.f192689d);
        }
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102186m();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }
}
