package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.o5n0;
import p153l.qa00;
import p153l.rb3;
import p153l.y6s;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatBottomView extends LinearLayout implements iam<rb3> {

    /* JADX INFO: renamed from: a */
    public VoiceChatBottomView f53862a;

    /* JADX INFO: renamed from: b */
    public VText f53863b;

    /* JADX INFO: renamed from: c */
    public ImageView f53864c;

    /* JADX INFO: renamed from: d */
    public rb3 f53865d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView$a */
    public class ViewOnClickListenerC13169a implements View.OnClickListener {
        public ViewOnClickListenerC13169a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VoiceChatBottomView.this.f53865d.m180729O3();
        }
    }

    public VoiceChatBottomView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m79164e(View view) {
        this.f53865d.m180728N3();
    }

    /* JADX INFO: renamed from: r */
    private void m79165r() {
        this.f53862a.setOnClickListener(new ViewOnClickListenerC13169a());
        bnl0.m105524M(this.f53864c, false);
        this.f53864c.setOnClickListener(new View.OnClickListener() { // from class: l.n5n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140372a.m79164e(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m79166c(View view) {
        o5n0.m166163a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rb3 rb3Var) {
        this.f53865d = rb3Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: f */
    public void m79168f(boolean z) {
        if (this.f53865d.m213810E2().mo183435j() == null) {
            return;
        }
        bnl0.m105524M(this, z);
        if (y6s.m214494b(this.f53865d.m213810E2().mo183435j().liveMode)) {
            this.f53863b.setHintTextColor(Color.parseColor("#66ffffff"));
            bnl0.m105538V(this.f53862a, qa00.f156323j);
        }
    }

    public View getBubbleHookedView() {
        return this.f53863b;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79166c(this);
        m79165r();
    }

    public VoiceChatBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
