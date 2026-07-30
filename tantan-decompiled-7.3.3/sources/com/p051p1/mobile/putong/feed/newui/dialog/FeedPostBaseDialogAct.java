package com.p051p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p051p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import p153l.a8c0;
import p153l.gth;
import p153l.kth;
import p153l.psd0;
import p153l.tfj0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostBaseDialogAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public RelativeLayout f40784c;

    /* JADX INFO: renamed from: d */
    public PostBasePopWindow f40785d;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m63048X1(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m63050a2(Context context, PostBasePopWindow postBasePopWindow) {
        Intent intent = new Intent(context, (Class<?>) FeedPostBaseDialogAct.class);
        intent.putExtra("extra_postBasePopWindow", postBasePopWindow);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public View m63051Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gth.m132238b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m63052b2(uxj0 uxj0Var) {
        lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        kth.m151357f("");
        act().overridePendingTransition(0, a8c0.f68908h);
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM63051Z1 = m63051Z1(layoutInflater, viewGroup);
        duringCreated(FeedModule.f39707h.closePostBasePopWindowSub).subscribe(psd0.m173597H(new y20() { // from class: l.eth
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95754a.m63052b2((uxj0) obj);
            }
        }, new y20() { // from class: l.fth
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedPostBaseDialogAct.m63048X1((Throwable) obj);
            }
        }));
        return viewM63051Z1;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_moment_post_guide_pop";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        PostBasePopWindow postBasePopWindow = (PostBasePopWindow) getIntent().getSerializableExtra("extra_postBasePopWindow");
        this.f40785d = postBasePopWindow;
        this.pageHelper.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("guide_from", postBasePopWindow.basic.param.guideFrom)));
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
