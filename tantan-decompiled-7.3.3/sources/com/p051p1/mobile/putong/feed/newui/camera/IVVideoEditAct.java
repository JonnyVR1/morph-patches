package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.hdc0;
import p153l.jyb;
import p153l.k9c0;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class IVVideoEditAct extends PutongAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m62141Y1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) IVVideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m62142Z1(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.m82486a(fragmentManager().m2555h0(hdc0.f108818A1)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        this.pageHelper.m152781p(jyb.m147494Y("photo_to_video_from", getIntent().getBundleExtra("extra_bundle").getString("extra_key_from")));
        Intent intent = getIntent();
        IVVideoEditFrag iVVideoEditFrag = new IVVideoEditFrag();
        iVVideoEditFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(hdc0.f108818A1, iVVideoEditFrag, "IVVideoEdit");
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(tec0.f173670h, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.k9m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124556a.m62142Z1((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_photo_to_video_edit";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = this.act;
        act.setNavigationBarColor(act.color(k9c0.f124495a));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }
}
