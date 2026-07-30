package com.p051p1.mobile.putong.feed.newui.view.suspenddraggableview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p153l.k1i;

/* JADX INFO: loaded from: classes13.dex */
class FeedFloatingDraggableWithLifecycleContainerView extends FeedFloatingDraggableContainerView {

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableWithLifecycleContainerView$a */
    public class C11557a extends k1i {
        public C11557a() {
        }

        @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
            if (NullChecker.m82486a(null)) {
                FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
                throw null;
            }
        }

        @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            super.onActivityStopped(activity);
            FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
            if (NullChecker.m82486a(null)) {
                FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
                throw null;
            }
        }
    }

    public FeedFloatingDraggableWithLifecycleContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: L */
    public final Application.ActivityLifecycleCallbacks m67660L() {
        return new C11557a();
    }

    /* JADX INFO: renamed from: M */
    public final void m67661M() {
        FeedModule.f39700a.registerActivityLifecycleCallbacks(m67660L());
    }

    @Override // com.p051p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView
    /* JADX INFO: renamed from: p */
    public void mo67653p(Context context, View view) {
        super.mo67653p(context, view);
        m67661M();
    }

    public FeedFloatingDraggableWithLifecycleContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
