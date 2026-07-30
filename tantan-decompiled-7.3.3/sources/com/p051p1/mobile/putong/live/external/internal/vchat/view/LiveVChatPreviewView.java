package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p153l.bnl0;
import p153l.iam;
import p153l.vqu;
import p153l.zvk0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatPreviewView extends ConstraintLayout implements iam<zvk0> {

    /* JADX INFO: renamed from: d */
    public VFrame f46266d;

    /* JADX INFO: renamed from: e */
    public VImage f46267e;

    /* JADX INFO: renamed from: f */
    public VButton f46268f;

    /* JADX INFO: renamed from: g */
    public VImage f46269g;

    /* JADX INFO: renamed from: h */
    public zvk0 f46270h;

    public LiveVChatPreviewView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m70958m0(View view) {
        if (NullChecker.m82486a(this.f46270h)) {
            this.f46270h.m221781U2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m70959n0(View view) {
        if (NullChecker.m82486a(this.f46270h)) {
            this.f46270h.m221784X2();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m70960k0(View view) {
        vqu.m202455a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zvk0 zvk0Var) {
        this.f46270h = zvk0Var;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m70962o0(View view) {
        if (NullChecker.m82486a(this.f46270h)) {
            this.f46270h.m221780T2();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70960k0(this);
        bnl0.m105509E0(this.f46269g, new View.OnClickListener() { // from class: l.squ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170269a.m70958m0(view);
            }
        });
        bnl0.m105509E0(this.f46268f, new View.OnClickListener() { // from class: l.tqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175777a.m70959n0(view);
            }
        });
        bnl0.m105509E0(this.f46267e, new View.OnClickListener() { // from class: l.uqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180507a.m70962o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m70963p0(boolean z) {
        bnl0.m105524M(this, z);
    }

    public LiveVChatPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
