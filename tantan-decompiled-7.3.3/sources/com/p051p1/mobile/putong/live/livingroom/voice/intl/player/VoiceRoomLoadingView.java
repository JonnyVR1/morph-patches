package com.p051p1.mobile.putong.live.livingroom.voice.intl.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.LiveLoadingView;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.mdc0;
import p153l.woo0;
import p153l.yoo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceRoomLoadingView extends FrameLayout implements iam<woo0> {

    /* JADX INFO: renamed from: a */
    public ViewStub f54180a;

    /* JADX INFO: renamed from: b */
    public ViewStub f54181b;

    /* JADX INFO: renamed from: c */
    public VText f54182c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f54183d;

    /* JADX INFO: renamed from: e */
    public woo0 f54184e;

    /* JADX INFO: renamed from: f */
    public LiveLoadingView f54185f;

    public VoiceRoomLoadingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m79526i(View view) {
        this.f54184e.m207338O3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m79527b(View view) {
        yoo0.m216978a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(woo0 woo0Var) {
        this.f54184e = woo0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m79529d() {
        m79534l(false);
        m79530e();
    }

    @Override // p153l.iam
    public void destroy() {
        m79532j();
    }

    /* JADX INFO: renamed from: e */
    public void m79530e() {
        LinearLayout linearLayout = this.f54183d;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m79531f() {
        LinearLayout linearLayout = this.f54183d;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout.findViewById(mdc0.f136274q1), false);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m79532j() {
        m79529d();
    }

    /* JADX INFO: renamed from: k */
    public void m79533k(String str) {
        m79534l(false);
        if (this.f54183d == null) {
            LinearLayout linearLayout = (LinearLayout) this.f54181b.inflate();
            this.f54183d = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f54183d.findViewById(mdc0.f136274q1).setOnClickListener(new View.OnClickListener() { // from class: l.xoo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f195590a.m79526i(view);
                }
            });
        }
        ((TextView) this.f54183d.findViewById(mdc0.f136301t1)).setText(str);
        bnl0.m105524M(this.f54183d.findViewById(mdc0.f136274q1), true);
        bnl0.m105524M(this.f54183d, true);
    }

    /* JADX INFO: renamed from: l */
    public void m79534l(boolean z) {
        if (this.f54185f == null) {
            this.f54185f = (LiveLoadingView) this.f54180a.inflate();
        }
        LiveLoadingView liveLoadingView = this.f54185f;
        if (z) {
            bnl0.m105524M(liveLoadingView, true);
            this.f54185f.m69927g();
        } else {
            liveLoadingView.m69928h();
            bnl0.m105524M(this.f54180a, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79527b(this);
    }

    public VoiceRoomLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRoomLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
