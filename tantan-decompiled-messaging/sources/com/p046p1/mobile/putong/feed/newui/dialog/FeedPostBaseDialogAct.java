package com.p046p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.PostBasePopWindow;
import com.p046p1.mobile.putong.feed.newui.dialog.FeedPostBaseDialogAct;
import p149l.e30;
import p149l.mkd0;
import p149l.p6j0;
import p149l.roj0;
import p149l.rrh;
import p149l.uzb0;
import p149l.vrh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostBaseDialogAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public RelativeLayout f39936c;

    /* JADX INFO: renamed from: d */
    public PostBasePopWindow f39937d;

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m61865V1(Throwable th) {
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m61867Z1(Context context, PostBasePopWindow postBasePopWindow) {
        Intent intent = new Intent(context, (Class<?>) FeedPostBaseDialogAct.class);
        intent.putExtra("extra_postBasePopWindow", postBasePopWindow);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public View m61868Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rrh.m180546b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m61869a2(roj0 roj0Var) {
        lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        vrh.m199662f("");
        act().overridePendingTransition(0, uzb0.f178983h);
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM61868Y1 = m61868Y1(layoutInflater, viewGroup);
        duringCreated(FeedModule.f38859h.closePostBasePopWindowSub).subscribe(mkd0.m154956H(new e30() { // from class: l.prh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150910a.m61869a2((roj0) obj);
            }
        }, new e30() { // from class: l.qrh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedPostBaseDialogAct.m61865V1((Throwable) obj);
            }
        }));
        return viewM61868Y1;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_post_guide_pop";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        PostBasePopWindow postBasePopWindow = (PostBasePopWindow) getIntent().getSerializableExtra("extra_postBasePopWindow");
        this.f39937d = postBasePopWindow;
        this.pageHelper.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("guide_from", postBasePopWindow.basic.param.guideFrom)));
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
