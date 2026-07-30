package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.annotation.SuppressLint;
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
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.tencent.open.p112im.C14536IM;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.izs;
import p153l.kdu;
import p153l.pzi0;
import p153l.stu;
import p153l.wtu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatWaitingOrderView extends FrameLayout implements iam<stu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatWaitingOrderView f46290a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f46291b;

    /* JADX INFO: renamed from: c */
    public VImage f46292c;

    /* JADX INFO: renamed from: d */
    public VImage f46293d;

    /* JADX INFO: renamed from: e */
    public VLinear f46294e;

    /* JADX INFO: renamed from: f */
    public TextView f46295f;

    /* JADX INFO: renamed from: g */
    public TextView f46296g;

    /* JADX INFO: renamed from: h */
    public TextView f46297h;

    /* JADX INFO: renamed from: i */
    public VImage f46298i;

    /* JADX INFO: renamed from: j */
    public ImageView f46299j;

    /* JADX INFO: renamed from: k */
    public VText f46300k;

    /* JADX INFO: renamed from: l */
    public stu f46301l;

    public LiveVChatWaitingOrderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m70977f(View view) {
        stu stuVar = this.f46301l;
        if (stuVar != null) {
            stuVar.m187914D3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m70978i(View view) {
        stu stuVar = this.f46301l;
        if (stuVar != null) {
            stuVar.m187929v3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m70979j(View view) {
        stu stuVar = this.f46301l;
        if (stuVar != null) {
            stuVar.m187931y3();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m70980d(View view) {
        wtu.m207913a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(stu stuVar) {
        this.f46301l = stuVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public void m70982k(BLiveVideoChatLive bLiveVideoChatLive) {
        long jM174454o = pzi0.m174454o() - (bLiveVideoChatLive.startedTime / 1000000);
        this.f46297h.setText("开启时长" + kdu.m149272Q((int) jM174454o));
    }

    /* JADX INFO: renamed from: l */
    public void m70983l(BLiveVideoChatLive bLiveVideoChatLive) {
        bnl0.m105524M(this, true);
        izs.m142868s(C14536IM.CHAT_TYPE_VIDEO_CHAT, this.f46291b, bLiveVideoChatLive.anchor.avatar);
        m70982k(bLiveVideoChatLive);
        bnl0.m105509E0(this.f46299j, new View.OnClickListener() { // from class: l.vtu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185751a.m70979j(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m70984m(int i) {
        String str;
        bnl0.m105524M(this.f46300k, i > 0);
        if (i > 0) {
            VText vText = this.f46300k;
            if (i > 99) {
                str = "99+";
            } else {
                str = i + "";
            }
            vText.setText(str);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m70985n(boolean z) {
        bnl0.m105524M(this, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70980d(this);
        bnl0.m105509E0(this.f46298i, new View.OnClickListener() { // from class: l.ttu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176104a.m70977f(view);
            }
        });
        bnl0.m105509E0(this.f46293d, new View.OnClickListener() { // from class: l.utu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180996a.m70978i(view);
            }
        });
    }

    public LiveVChatWaitingOrderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatWaitingOrderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
