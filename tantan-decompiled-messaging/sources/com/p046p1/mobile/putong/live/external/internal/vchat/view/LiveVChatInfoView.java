package com.p046p1.mobile.putong.live.external.internal.vchat.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatUser;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.bmu;
import p149l.dmu;
import p149l.jbu;
import p149l.mqi0;
import p149l.s7m;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatInfoView extends FrameLayout implements s7m<bmu> {

    /* JADX INFO: renamed from: a */
    public VText f45386a;

    /* JADX INFO: renamed from: b */
    public ImageView f45387b;

    /* JADX INFO: renamed from: c */
    public TextView f45388c;

    /* JADX INFO: renamed from: d */
    public bmu f45389d;

    public LiveVChatInfoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m69732f(View view) {
        if (NullChecker.m81303a(this.f45389d)) {
            this.f45389d.m102698Z2();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m69733b(View view) {
        dmu.m112528a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bmu bmuVar) {
        this.f45389d = bmuVar;
    }

    /* JADX INFO: renamed from: d */
    public void m69735d() {
        xdl0.m208345M0(this, !xdl0.m208349O0(this));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m69736e() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: i */
    public void m69737i(long j) {
        this.f45388c.setText(jbu.m140809Q(j));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m69738j(BLiveVideoChatUser bLiveVideoChatUser, long j) {
        xdl0.m208344M(this, true);
        this.f45386a.setText(w8u.m202213p(bLiveVideoChatUser.userName, 6));
        m69737i(mqi0.m155944o() - (j / 1000000));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69733b(this);
        xdl0.m208329E0(this.f45387b, new View.OnClickListener() { // from class: l.cmu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81614a.m69732f(view);
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
