package com.p000p1.mobile.putong.feed.newui.view.suspenddraggableview;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p007l.vzh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
class FeedFloatingDraggableWithLifecycleContainerView extends FeedFloatingDraggableContainerView {

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableWithLifecycleContainerView$a */
    public class C2238a extends vzh {
        public C2238a() {
        }

        @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
            if (NullChecker.a((Object) null)) {
                FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
                throw null;
            }
        }

        @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            super.onActivityStopped(activity);
            FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
            if (NullChecker.a((Object) null)) {
                FeedFloatingDraggableWithLifecycleContainerView.this.getClass();
                throw null;
            }
        }
    }

    public FeedFloatingDraggableWithLifecycleContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: L */
    public final Application.ActivityLifecycleCallbacks m7644L() {
        return new C2238a();
    }

    /* JADX INFO: renamed from: M */
    public final void m7645M() {
        FeedModule.f313a.registerActivityLifecycleCallbacks(m7644L());
    }

    @Override // com.p000p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView
    /* JADX INFO: renamed from: p */
    public void mo7637p(Context context, View view) {
        super.mo7637p(context, view);
        m7645M();
    }

    public FeedFloatingDraggableWithLifecycleContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
