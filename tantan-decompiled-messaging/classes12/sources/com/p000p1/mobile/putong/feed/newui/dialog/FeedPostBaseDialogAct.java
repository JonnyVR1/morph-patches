package com.p000p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p000p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.mkd0;
import l.roj0;
import p007l.p6j0;
import p007l.rrh;
import p007l.uzb0;
import p007l.vrh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostBaseDialogAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public RelativeLayout f1397c;

    /* JADX INFO: renamed from: d */
    public PostBasePopWindow f1398d;

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m2832V1(Throwable th) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m2834Z1(Context context, PostBasePopWindow postBasePopWindow) {
        Intent intent = new Intent(context, (Class<?>) FeedPostBaseDialogAct.class);
        intent.putExtra("extra_postBasePopWindow", postBasePopWindow);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public View m2835Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rrh.m13954b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m2836a2(roj0 roj0Var) {
        finish();
    }

    public void finish() {
        vrh.m15561f("");
        act().overridePendingTransition(0, uzb0.f13994h);
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2835Y1 = m2835Y1(layoutInflater, viewGroup);
        duringCreated(FeedModule.f320h.closePostBasePopWindowSub).subscribe(mkd0.H(new e30() { // from class: l.prh
            public final void call(Object obj) {
                this.f11969a.m2836a2((roj0) obj);
            }
        }, new e30() { // from class: l.qrh
            public final void call(Object obj) {
                FeedPostBaseDialogAct.m2832V1((Throwable) obj);
            }
        }));
        return viewM2835Y1;
    }

    public String pageId() {
        return "p_moment_post_guide_pop";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        PostBasePopWindow postBasePopWindow = (PostBasePopWindow) getIntent().getSerializableExtra("extra_postBasePopWindow");
        this.f1398d = postBasePopWindow;
        ((PutongAct) this).pageHelper.o(p6j0.m12911a(p6j0.C2456a.m12922g("guide_from", postBasePopWindow.basic.param.guideFrom)));
        super.preCreateView(bundle);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
