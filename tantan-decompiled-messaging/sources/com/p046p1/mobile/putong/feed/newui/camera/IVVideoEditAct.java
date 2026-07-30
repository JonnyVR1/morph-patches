package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.b5c0;
import p149l.e1c0;
import p149l.e30;
import p149l.o6c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class IVVideoEditAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m60957X1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) IVVideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public void m60958Y1(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m81303a(fragmentManager().m2554h0(b5c0.f73465A1)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        this.pageHelper.m109040p(vwb.m200311Y("photo_to_video_from", getIntent().getBundleExtra("extra_bundle").getString("extra_key_from")));
        Intent intent = getIntent();
        IVVideoEditFrag iVVideoEditFrag = new IVVideoEditFrag();
        iVVideoEditFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(b5c0.f73465A1, iVVideoEditFrag, "IVVideoEdit");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f142201h, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.u6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174872a.m60958Y1((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_photo_to_video_edit";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = this.act;
        act.setNavigationBarColor(act.color(e1c0.f88772a));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }
}
