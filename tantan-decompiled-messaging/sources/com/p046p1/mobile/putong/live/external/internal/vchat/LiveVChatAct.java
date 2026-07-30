package com.p046p1.mobile.putong.live.external.internal.vchat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.mmsdk.player.C12459a;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.tantan.library.svga.SVGALoader;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.hu20;
import p149l.ieu;
import p149l.qib0;
import p149l.qmk0;
import p149l.s6c0;
import p149l.wlk0;
import p149l.ypv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatAct extends LiveBaseAct {

    /* JADX INFO: renamed from: h */
    public static String f45045h = "start_data";

    /* JADX INFO: renamed from: i */
    public static String f45046i = "key_video_chat";

    /* JADX INFO: renamed from: c */
    public boolean f45047c;

    /* JADX INFO: renamed from: d */
    public qmk0 f45048d;

    /* JADX INFO: renamed from: e */
    public LiveVChatView f45049e;

    /* JADX INFO: renamed from: f */
    public VChatStartData f45050f;

    /* JADX INFO: renamed from: g */
    public ieu f45051g;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m69164Z1(Context context) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m69165a2(Context context, VChatStartData vChatStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatAct.class);
        intent.putExtra(f45045h, vChatStartData);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m69166b2(Context context, VChatStartData vChatStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, false);
        intent.putExtra(f45045h, vChatStartData);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m69167c2(Bundle bundle) {
        setTransparentStatusBar();
        if (this.f45047c) {
            setSwipeBackEnable(false);
        }
        qmk0 qmk0Var = new qmk0(this, this.f45049e, this.f45047c, this.f45050f, wlk0.m203819a().m203820b());
        this.f45048d = qmk0Var;
        qmk0Var.m175573R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m69168g2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            C12459a.m68524b().m68527e(this);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final void m69169d2() {
        qmk0 qmk0Var = this.f45048d;
        if (qmk0Var != null) {
            qmk0Var.mo69117n();
        }
        qib0.f154691G.m184721j();
        hu20.m132972s();
        SVGALoader.clear();
        System.gc();
        hu20.m132955G(ypv.f199497e);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m69170e2(PushMessageCustom pushMessageCustom) {
        ieu ieuVar = this.f45051g;
        if (ieuVar != null) {
            ieuVar.m135818T2(pushMessageCustom);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    /* JADX INFO: renamed from: h2 */
    public void m69171h2(ieu ieuVar) {
        this.f45051g = ieuVar;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162800u1, viewGroup, false);
        if (viewInflate instanceof LiveVChatView) {
            this.f45049e = (LiveVChatView) viewInflate;
        }
        this.f45049e.setKeepScreenOn(true);
        return this.f45049e;
    }

    @Override // com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.eeu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90781a.m69167c2((Bundle) obj);
            }
        }, new d30() { // from class: l.feu
            @Override // p149l.d30
            public final void call() {
                this.f97159a.m69169d2();
            }
        });
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.geu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102302a.m69168g2((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        this.f45047c = intent.getBooleanExtra(AudienceStartData.ANCHOR_TAG, false);
        this.f45050f = (VChatStartData) intent.getSerializableExtra(f45045h);
        setSwipeBackEnable(false);
    }
}
