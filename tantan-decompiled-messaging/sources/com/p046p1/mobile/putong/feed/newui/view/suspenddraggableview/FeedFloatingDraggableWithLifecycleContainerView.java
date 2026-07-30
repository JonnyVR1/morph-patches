package com.p046p1.mobile.putong.feed.newui.view.suspenddraggableview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p149l.vzh;

/* JADX INFO: loaded from: classes12.dex */
class FeedFloatingDraggableWithLifecycleContainerView extends FeedFloatingDraggableContainerView {

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableWithLifecycleContainerView$a */
    public class C11394a extends vzh {
        public C11394a() {
        }

        @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
            if (NullChecker.m81303a(null)) {
                FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
                throw null;
            }
        }

        @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            super.onActivityStopped(activity);
            FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
            if (NullChecker.m81303a(null)) {
                FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
                throw null;
            }
        }
    }

    public FeedFloatingDraggableWithLifecycleContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: L */
    public final Application.ActivityLifecycleCallbacks m66477L() {
        return new C11394a();
    }

    /* JADX INFO: renamed from: M */
    public final void m66478M() {
        FeedModule.f38852a.registerActivityLifecycleCallbacks(m66477L());
    }

    @Override // com.p046p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView
    /* JADX INFO: renamed from: p */
    public void mo66470p(Context context, View view) {
        super.mo66470p(context, view);
        m66478M();
    }

    public FeedFloatingDraggableWithLifecycleContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
