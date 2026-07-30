package com.p051p1.mobile.putong.live.external.internal.vchat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.mmsdk.player.C12622a;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatView;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.tantan.library.svga.SVGALoader;
import p153l.cvk0;
import p153l.dhw;
import p153l.jgu;
import p153l.r230;
import p153l.uqb0;
import p153l.wvk0;
import p153l.x20;
import p153l.xec0;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatAct extends LiveBaseAct {

    /* JADX INFO: renamed from: h */
    public static String f45893h = "start_data";

    /* JADX INFO: renamed from: i */
    public static String f45894i = "key_video_chat";

    /* JADX INFO: renamed from: c */
    public boolean f45895c;

    /* JADX INFO: renamed from: d */
    public wvk0 f45896d;

    /* JADX INFO: renamed from: e */
    public LiveVChatView f45897e;

    /* JADX INFO: renamed from: f */
    public VChatStartData f45898f;

    /* JADX INFO: renamed from: g */
    public jgu f45899g;

    /* JADX INFO: renamed from: a2 */
    public static Intent m70347a2(Context context) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m70348b2(Context context, VChatStartData vChatStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatAct.class);
        intent.putExtra(f45893h, vChatStartData);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, true);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m70349c2(Context context, VChatStartData vChatStartData) {
        Intent intent = new Intent(context, (Class<?>) LiveVChatAct.class);
        intent.putExtra(AudienceStartData.ANCHOR_TAG, false);
        intent.putExtra(f45893h, vChatStartData);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m70350d2(Bundle bundle) {
        setTransparentStatusBar();
        if (this.f45895c) {
            setSwipeBackEnable(false);
        }
        wvk0 wvk0Var = new wvk0(this, this.f45897e, this.f45895c, this.f45898f, cvk0.m112810a().m112811b());
        this.f45896d = wvk0Var;
        wvk0Var.m208069R2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m70351h2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            C12622a.m69707b().m69710e(this);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m70352e2() {
        wvk0 wvk0Var = this.f45896d;
        if (wvk0Var != null) {
            wvk0Var.mo70300n();
        }
        uqb0.f180374G.m98794j();
        r230.m179477s();
        SVGALoader.clear();
        System.gc();
        r230.m179460G(zrv.f205803e);
    }

    /* JADX INFO: renamed from: g2 */
    public void m70353g2(PushMessageCustom pushMessageCustom) {
        jgu jguVar = this.f45899g;
        if (jguVar != null) {
            jguVar.m144794T2(pushMessageCustom);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        Configuration configuration = resources.getConfiguration();
        if (configuration.fontScale != 1.0f) {
            configuration.fontScale = 1.0f;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }

    /* JADX INFO: renamed from: i2 */
    public void m70354i2(jgu jguVar) {
        this.f45899g = jguVar;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193914u1, viewGroup, false);
        if (viewInflate instanceof LiveVChatView) {
            this.f45897e = (LiveVChatView) viewInflate;
        }
        this.f45897e.setKeepScreenOn(true);
        return this.f45897e;
    }

    @Override // com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.fgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98976a.m70350d2((Bundle) obj);
            }
        }, new x20() { // from class: l.ggu
            @Override // p153l.x20
            public final void call() {
                this.f104047a.m70352e2();
            }
        });
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.hgu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109441a.m70351h2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        this.f45895c = intent.getBooleanExtra(AudienceStartData.ANCHOR_TAG, false);
        this.f45898f = (VChatStartData) intent.getSerializableExtra(f45893h);
        setSwipeBackEnable(false);
    }
}
