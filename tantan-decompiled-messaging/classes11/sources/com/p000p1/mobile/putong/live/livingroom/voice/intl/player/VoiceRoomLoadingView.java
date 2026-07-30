package com.p000p1.mobile.putong.live.livingroom.voice.intl.player;

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
import com.p1.mobile.putong.live.base.view.LiveLoadingView;
import l.g5c0;
import l.s7m;
import l.ufo0;
import l.xdl0;
import p009l.sfo0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceRoomLoadingView extends FrameLayout implements s7m<sfo0> {

    /* JADX INFO: renamed from: a */
    public ViewStub f6938a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6939b;

    /* JADX INFO: renamed from: c */
    public VText f6940c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f6941d;

    /* JADX INFO: renamed from: e */
    public sfo0 f6942e;

    /* JADX INFO: renamed from: f */
    public LiveLoadingView f6943f;

    public VoiceRoomLoadingView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m8540i(View view) {
        this.f6942e.m22153O3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8541C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m8542b(View view) {
        ufo0.a(this, view);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m8547i1(sfo0 sfo0Var) {
        this.f6942e = sfo0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m8544d() {
        m8550l(false);
        m8545e();
    }

    public void destroy() {
        m8548j();
    }

    /* JADX INFO: renamed from: e */
    public void m8545e() {
        LinearLayout linearLayout = this.f6941d;
        if (linearLayout != null) {
            xdl0.M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8546f() {
        LinearLayout linearLayout = this.f6941d;
        if (linearLayout != null) {
            xdl0.M(linearLayout.findViewById(g5c0.q1), false);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m8548j() {
        m8544d();
    }

    /* JADX INFO: renamed from: k */
    public void m8549k(String str) {
        m8550l(false);
        if (this.f6941d == null) {
            LinearLayout linearLayout = (LinearLayout) this.f6939b.inflate();
            this.f6941d = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f6941d.findViewById(g5c0.q1).setOnClickListener(new View.OnClickListener() { // from class: l.tfo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20661a.m8540i(view);
                }
            });
        }
        ((TextView) this.f6941d.findViewById(g5c0.t1)).setText(str);
        xdl0.M(this.f6941d.findViewById(g5c0.q1), true);
        xdl0.M(this.f6941d, true);
    }

    /* JADX INFO: renamed from: l */
    public void m8550l(boolean z) {
        if (this.f6943f == null) {
            this.f6943f = this.f6938a.inflate();
        }
        LiveLoadingView liveLoadingView = this.f6943f;
        if (z) {
            xdl0.M(liveLoadingView, true);
            this.f6943f.g();
        } else {
            liveLoadingView.h();
            xdl0.M(this.f6938a, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8542b(this);
    }

    public VoiceRoomLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRoomLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
