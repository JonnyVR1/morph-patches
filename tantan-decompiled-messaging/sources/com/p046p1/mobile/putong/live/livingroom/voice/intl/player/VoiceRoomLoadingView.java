package com.p046p1.mobile.putong.live.livingroom.voice.intl.player;

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
import com.p046p1.mobile.putong.live.base.view.LiveLoadingView;
import p147v.VText;
import p149l.g5c0;
import p149l.s7m;
import p149l.sfo0;
import p149l.ufo0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceRoomLoadingView extends FrameLayout implements s7m<sfo0> {

    /* JADX INFO: renamed from: a */
    public ViewStub f53332a;

    /* JADX INFO: renamed from: b */
    public ViewStub f53333b;

    /* JADX INFO: renamed from: c */
    public VText f53334c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f53335d;

    /* JADX INFO: renamed from: e */
    public sfo0 f53336e;

    /* JADX INFO: renamed from: f */
    public LiveLoadingView f53337f;

    public VoiceRoomLoadingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m78343i(View view) {
        this.f53336e.m183988O3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m78344b(View view) {
        ufo0.m193455a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sfo0 sfo0Var) {
        this.f53336e = sfo0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m78346d() {
        m78351l(false);
        m78347e();
    }

    @Override // p149l.s7m
    public void destroy() {
        m78349j();
    }

    /* JADX INFO: renamed from: e */
    public void m78347e() {
        LinearLayout linearLayout = this.f53335d;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78348f() {
        LinearLayout linearLayout = this.f53335d;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout.findViewById(g5c0.f101029q1), false);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m78349j() {
        m78346d();
    }

    /* JADX INFO: renamed from: k */
    public void m78350k(String str) {
        m78351l(false);
        if (this.f53335d == null) {
            LinearLayout linearLayout = (LinearLayout) this.f53333b.inflate();
            this.f53335d = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f53335d.findViewById(g5c0.f101029q1).setOnClickListener(new View.OnClickListener() { // from class: l.tfo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170011a.m78343i(view);
                }
            });
        }
        ((TextView) this.f53335d.findViewById(g5c0.f101056t1)).setText(str);
        xdl0.m208344M(this.f53335d.findViewById(g5c0.f101029q1), true);
        xdl0.m208344M(this.f53335d, true);
    }

    /* JADX INFO: renamed from: l */
    public void m78351l(boolean z) {
        if (this.f53337f == null) {
            this.f53337f = (LiveLoadingView) this.f53332a.inflate();
        }
        LiveLoadingView liveLoadingView = this.f53337f;
        if (z) {
            xdl0.m208344M(liveLoadingView, true);
            this.f53337f.m68744g();
        } else {
            liveLoadingView.m68745h();
            xdl0.m208344M(this.f53332a, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78344b(this);
    }

    public VoiceRoomLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRoomLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
