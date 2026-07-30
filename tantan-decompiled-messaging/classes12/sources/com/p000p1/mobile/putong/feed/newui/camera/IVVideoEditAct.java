package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.vwb;
import p007l.b5c0;
import p007l.e1c0;
import p007l.o6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IVVideoEditAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m1883X1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) IVVideoEditAct.class);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public void m1884Y1(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        if (NullChecker.a(fragmentManager().h0(b5c0.f5946A1)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("photo_to_video_from", getIntent().getBundleExtra("extra_bundle").getString("extra_key_from"))});
        Intent intent = getIntent();
        IVVideoEditFrag iVVideoEditFrag = new IVVideoEditFrag();
        iVVideoEditFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        k kVarM = getSupportFragmentManager().m();
        kVarM.c(b5c0.f5946A1, iVVideoEditFrag, "IVVideoEdit");
        kVarM.j();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f11220h, (ViewGroup) null);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.u6m
            public final void call(Object obj) {
                this.f13568a.m1884Y1((Bundle) obj);
            }
        });
    }

    public void initSubscription() {
        super.initSubscription();
    }

    public String pageId() {
        return "p_photo_to_video_edit";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = ((Act) this).act;
        act.setNavigationBarColor(act.color(e1c0.f7128a));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }
}
