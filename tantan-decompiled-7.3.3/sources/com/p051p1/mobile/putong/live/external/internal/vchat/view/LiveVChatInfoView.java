package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.cou;
import p153l.eou;
import p153l.iam;
import p153l.kdu;
import p153l.pzi0;
import p153l.xau;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatInfoView extends FrameLayout implements iam<cou> {

    /* JADX INFO: renamed from: a */
    public VText f46234a;

    /* JADX INFO: renamed from: b */
    public ImageView f46235b;

    /* JADX INFO: renamed from: c */
    public TextView f46236c;

    /* JADX INFO: renamed from: d */
    public cou f46237d;

    public LiveVChatInfoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m70915f(View view) {
        if (NullChecker.m82486a(this.f46237d)) {
            this.f46237d.m111708Z2();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m70916b(View view) {
        eou.m121820a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cou couVar) {
        this.f46237d = couVar;
    }

    /* JADX INFO: renamed from: d */
    public void m70918d() {
        bnl0.m105525M0(this, !bnl0.m105529O0(this));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m70919e() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: i */
    public void m70920i(long j) {
        this.f46236c.setText(kdu.m149272Q(j));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m70921j(BLiveVideoChatUser bLiveVideoChatUser, long j) {
        bnl0.m105524M(this, true);
        this.f46234a.setText(xau.m209906p(bLiveVideoChatUser.userName, 6));
        m70920i(pzi0.m174454o() - (j / 1000000));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70916b(this);
        bnl0.m105509E0(this.f46235b, new View.OnClickListener() { // from class: l.dou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90002a.m70915f(view);
            }
        });
    }

    public LiveVChatInfoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatInfoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
