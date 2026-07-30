package com.p046p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VText;
import p149l.cb3;
import p149l.kwm0;
import p149l.s7m;
import p149l.t100;
import p149l.x4s;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatBottomView extends LinearLayout implements s7m<cb3> {

    /* JADX INFO: renamed from: a */
    public VoiceChatBottomView f53014a;

    /* JADX INFO: renamed from: b */
    public VText f53015b;

    /* JADX INFO: renamed from: c */
    public ImageView f53016c;

    /* JADX INFO: renamed from: d */
    public cb3 f53017d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView$a */
    public class ViewOnClickListenerC13006a implements View.OnClickListener {
        public ViewOnClickListenerC13006a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VoiceChatBottomView.this.f53017d.m105969O3();
        }
    }

    public VoiceChatBottomView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m77981e(View view) {
        this.f53017d.m105968N3();
    }

    /* JADX INFO: renamed from: r */
    private void m77982r() {
        this.f53014a.setOnClickListener(new ViewOnClickListenerC13006a());
        xdl0.m208344M(this.f53016c, false);
        this.f53016c.setOnClickListener(new View.OnClickListener() { // from class: l.jwm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120099a.m77981e(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m77983c(View view) {
        kwm0.m147599a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cb3 cb3Var) {
        this.f53017d = cb3Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f */
    public void m77985f(boolean z) {
        if (this.f53017d.m206027E2().mo149813j() == null) {
            return;
        }
        xdl0.m208344M(this, z);
        if (x4s.m207012b(this.f53017d.m206027E2().mo149813j().liveMode)) {
            this.f53015b.setHintTextColor(Color.parseColor("#66ffffff"));
            xdl0.m208358V(this.f53014a, t100.f167261j);
        }
    }

    public View getBubbleHookedView() {
        return this.f53015b;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77983c(this);
        m77982r();
    }

    public VoiceChatBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
