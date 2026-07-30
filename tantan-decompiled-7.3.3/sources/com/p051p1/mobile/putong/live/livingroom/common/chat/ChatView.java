package com.p051p1.mobile.putong.live.livingroom.common.chat;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import java.util.Collections;
import p153l.bnl0;
import p153l.dw40;
import p153l.fc2;
import p153l.i4g0;
import p153l.iam;
import p153l.ive0;
import p153l.j35;
import p153l.m35;
import p153l.pae;
import p153l.qa00;
import p153l.w25;

/* JADX INFO: loaded from: classes4.dex */
public class ChatView extends RelativeLayout implements iam<w25<dw40>> {

    /* JADX INFO: renamed from: a */
    public ChatListView f49585a;

    /* JADX INFO: renamed from: b */
    public View f49586b;

    /* JADX INFO: renamed from: c */
    public View f49587c;

    /* JADX INFO: renamed from: d */
    public w25<dw40> f49588d;

    /* JADX INFO: renamed from: e */
    public boolean f49589e;

    /* JADX INFO: renamed from: f */
    public boolean f49590f;

    /* JADX INFO: renamed from: g */
    public int f49591g;

    /* JADX INFO: renamed from: h */
    public boolean f49592h;

    public ChatView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49589e = true;
        this.f49590f = false;
        this.f49591g = pae.f151257a;
        this.f49592h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m73663e(View view) {
        this.f49588d.m204526c4(false, null);
        m73673n();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m73664b(View view) {
        m35.m156919a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w25<dw40> w25Var) {
        this.f49588d = w25Var;
    }

    /* JADX INFO: renamed from: d */
    public void m73666d(int i) {
        int iM175859d = i - qa00.f156323j;
        if (iM175859d >= qa00.m175859d(195.0f)) {
            iM175859d = qa00.m175859d(195.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.f49587c.getLayoutParams();
        layoutParams.width = iM175859d;
        this.f49587c.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f49585a.destroy();
        this.f49589e = true;
        setDefaultHeight(pae.f151257a);
        j35.m143316a(this, false);
        this.f49585a.m73870I();
        m73671l(false);
        this.f49592h = false;
        this.f49587c.setBackground(fc2.m124979i(637534208, 12));
    }

    /* JADX INFO: renamed from: f */
    public void m73667f() {
        setTranslationY(0.0f);
        bnl0.m105525M0(this.f49587c, true);
        m73668i(false, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m73668i(boolean z, boolean z2) {
        this.f49585a.m73871J();
        int i = z2 ? pae.f151259c : pae.f151257a;
        if (!z) {
            i = this.f49591g;
        }
        bnl0.m105524M(this.f49586b, z2);
        m73669j(i, z2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m73669j(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f49585a.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        this.f49585a.setLayoutParams(layoutParams);
        if (z) {
            bnl0.m105505C0(this, pae.f151268l);
        } else {
            bnl0.m105505C0(this, layoutParams.height + pae.f151267k);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m73670k(Boolean bool, int i, boolean z) {
        if (bool.booleanValue()) {
            m73668i(true, z);
        }
        setTranslationY(-i);
    }

    /* JADX INFO: renamed from: l */
    public void m73671l(boolean z) {
        if (!ive0.m142299m() || Build.VERSION.SDK_INT >= 29) {
            bnl0.m105524M(this, z);
        } else {
            bnl0.m105525M0(this, z);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m73672m(boolean z) {
        bnl0.m105525M0(this.f49587c, z);
    }

    /* JADX INFO: renamed from: n */
    public final void m73673n() {
        i4g0.m138521s("e_live_chat_textbox", this.f49588d.mo78457R2(), Collections.singletonMap("live_chat_textbox_type", "click"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73664b(this);
        j35.m143316a(this, false);
        m73668i(false, false);
        bnl0.m105509E0(this.f49587c, new View.OnClickListener() { // from class: l.k35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123682a.m73663e(view);
            }
        });
    }

    public void setDefaultHeight(int i) {
        if (this.f49590f) {
            i = pae.f151258b;
        }
        if (this.f49591g == i) {
            return;
        }
        this.f49591g = i;
        m73668i(false, false);
    }

    public void setLiveMode(boolean z) {
        if (this.f49590f != z) {
            this.f49590f = z;
            setDefaultHeight(pae.f151258b);
        }
    }
}
