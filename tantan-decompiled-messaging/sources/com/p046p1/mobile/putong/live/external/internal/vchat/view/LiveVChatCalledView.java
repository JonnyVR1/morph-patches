package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.p107im.C14373IM;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.bt0;
import p149l.cfu;
import p149l.dt0;
import p149l.h3c0;
import p149l.hxs;
import p149l.ifu;
import p149l.jig;
import p149l.s7m;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatCalledView extends FrameLayout implements s7m<cfu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatCalledView f45342a;

    /* JADX INFO: renamed from: b */
    public VImage f45343b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f45344c;

    /* JADX INFO: renamed from: d */
    public VImage f45345d;

    /* JADX INFO: renamed from: e */
    public VLinear f45346e;

    /* JADX INFO: renamed from: f */
    public VText f45347f;

    /* JADX INFO: renamed from: g */
    public VLinear f45348g;

    /* JADX INFO: renamed from: h */
    public VText f45349h;

    /* JADX INFO: renamed from: i */
    public TextView f45350i;

    /* JADX INFO: renamed from: j */
    public VFrame f45351j;

    /* JADX INFO: renamed from: k */
    public VImage f45352k;

    /* JADX INFO: renamed from: l */
    public VFrame f45353l;

    /* JADX INFO: renamed from: m */
    public VImage f45354m;

    /* JADX INFO: renamed from: n */
    public VImage f45355n;

    /* JADX INFO: renamed from: o */
    public VRelative f45356o;

    /* JADX INFO: renamed from: p */
    public VText f45357p;

    /* JADX INFO: renamed from: q */
    public VText f45358q;

    /* JADX INFO: renamed from: r */
    public cfu f45359r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f45360s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f45361t;

    /* JADX INFO: renamed from: u */
    public Animator f45362u;

    /* JADX INFO: renamed from: v */
    public boolean f45363v;

    /* JADX INFO: renamed from: w */
    public String f45364w;

    /* JADX INFO: renamed from: x */
    public String[] f45365x;

    public LiveVChatCalledView(@NonNull Context context) {
        super(context);
        this.f45365x = new String[]{".", "..", "..."};
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113502B(this.f45360s);
        dt0.m113502B(this.f45362u);
        dt0.m113502B(this.f45361t);
    }

    /* JADX INFO: renamed from: f */
    public final void m69704f(View view) {
        ifu.m135952a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cfu cfuVar) {
        this.f45359r = cfuVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m69706j(boolean z) {
        this.f45359r.m106603W2();
        dt0.m113502B(this.f45360s);
        dt0.m113502B(this.f45361t);
        this.f45358q.setText(".");
        xdl0.m208344M(this.f45345d, false);
        xdl0.m208344M(this.f45356o, false);
        this.f45363v = false;
        if (!z) {
            xdl0.m208344M(this, false);
            return;
        }
        dt0.m113502B(this.f45362u);
        Animator animatorM103743p = bt0.m103743p(this, "translationY", 0L, 500L, new jig(), 0.0f, -getMeasuredHeight());
        this.f45362u = animatorM103743p;
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.ffu
            @Override // java.lang.Runnable
            public final void run() {
                this.f97306a.m69707k();
            }
        });
        this.f45362u.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m69707k() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m69708l(View view) {
        if (!NullChecker.m81303a(this.f45359r) || this.f45363v) {
            return;
        }
        this.f45363v = true;
        this.f45359r.mo106601T2();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m69709m(View view) {
        if (NullChecker.m81303a(this.f45359r)) {
            dt0.m113502B(this.f45360s);
            dt0.m113502B(this.f45361t);
            this.f45359r.mo106602V2();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m69710n(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        VText vText = this.f45358q;
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f45365x;
        sb.append(strArr[iIntValue % strArr.length]);
        sb.append("");
        vText.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69704f(this);
        xdl0.m208329E0(this.f45354m, new View.OnClickListener() { // from class: l.dfu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85977a.m69708l(view);
            }
        });
        xdl0.m208329E0(this.f45352k, new View.OnClickListener() { // from class: l.efu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90863a.m69709m(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m69711p(BLiveVideoChat bLiveVideoChat) {
        setTranslationY(-getMeasuredHeight());
        xdl0.m208344M(this.f45353l, true);
        xdl0.m208344M(this.f45351j, true);
        VFrame vFrame = this.f45353l;
        int i = t100.f167236K;
        vFrame.setTranslationX(-i);
        this.f45351j.setTranslationX(i);
        setAvatarUrl(bLiveVideoChat.getAttendee().avatar);
        this.f45347f.setText(String.format("%s\n向你发起视频闪聊", w8u.m202213p(bLiveVideoChat.getAttendee().userName, 6)));
        m69713s("", false, "");
        this.f45355n.setImageResource(h3c0.f105656b1);
    }

    /* JADX INFO: renamed from: q */
    public void m69712q() {
        if (TextUtils.isEmpty(this.f45364w)) {
            return;
        }
        setAvatarUrl(this.f45364w);
    }

    /* JADX INFO: renamed from: s */
    public final void m69713s(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f45348g, false);
            xdl0.m208344M(this.f45350i, false);
            return;
        }
        VText vText = this.f45349h;
        if (z) {
            vText.setTextColor(Color.parseColor("#dddddd"));
            VText vText2 = this.f45349h;
            vText2.setPaintFlags(vText2.getPaintFlags() | 16);
        } else {
            vText.setTextColor(-1);
            VText vText3 = this.f45349h;
            vText3.setPaintFlags(vText3.getPaintFlags() & (-17));
        }
        this.f45349h.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            this.f45350i.setText(str2);
        }
        xdl0.m208344M(this.f45348g, true);
        xdl0.m208344M(this.f45350i, true);
    }

    public void setAvatarUrl(String str) {
        this.f45364w = str;
        hxs.m133406s(C14373IM.CHAT_TYPE_VIDEO_CHAT, this.f45344c, str);
    }

    /* JADX INFO: renamed from: u */
    public void m69714u(boolean z) {
        xdl0.m208344M(this, true);
        this.f45355n.setImageResource(h3c0.f105659c1);
        dt0.m113502B(this.f45360s);
        if (this.f45360s == null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103743p(this.f45355n, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, -360.0f);
            this.f45360s = objectAnimator;
            objectAnimator.setRepeatCount(-1);
        }
        this.f45347f.setText("接通中，请稍后");
        this.f45360s.start();
        if (z) {
            return;
        }
        xdl0.m208344M(this.f45356o, true);
        xdl0.m208344M(this.f45345d, true);
        this.f45358q.setText(".");
        dt0.m113502B(this.f45361t);
        if (this.f45361t == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 3);
            this.f45361t = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f45361t.setRepeatCount(-1);
            this.f45361t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hfu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f107524a.m69710n(valueAnimator);
                }
            });
        }
        this.f45361t.start();
    }

    /* JADX INFO: renamed from: v */
    public void m69715v(final BLiveVideoChat bLiveVideoChat) {
        this.f45363v = false;
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f45356o, false);
        xdl0.m208344M(this.f45345d, false);
        dt0.m113502B(this.f45361t);
        dt0.m113502B(this.f45360s);
        jig jigVar = new jig();
        Animator animatorM103743p = bt0.m103743p(this, "translationY", 0L, 500L, jigVar, -getMeasuredHeight(), 0.0f);
        VFrame vFrame = this.f45353l;
        int i = t100.f167236K;
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, bt0.m103743p(vFrame, "translationX", 200L, 300L, jigVar, -i, 0.0f), bt0.m103743p(this.f45351j, "translationX", 200L, 300L, jigVar, i, 0.0f));
        this.f45362u = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.gfu
            @Override // java.lang.Runnable
            public final void run() {
                this.f102435a.m69711p(bLiveVideoChat);
            }
        });
        this.f45362u.start();
    }

    /* JADX INFO: renamed from: w */
    public void m69716w(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        this.f45363v = false;
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f45356o, false);
        xdl0.m208344M(this.f45345d, false);
        dt0.m113502B(this.f45361t);
        dt0.m113502B(this.f45360s);
        xdl0.m208344M(this.f45353l, true);
        xdl0.m208344M(this.f45351j, true);
        setAvatarUrl(bLiveVideoChatAttendeeCallInfo.anchor.avatar);
        this.f45347f.setText(String.format("%s向你发起视频闪聊", w8u.m202213p(bLiveVideoChatAttendeeCallInfo.anchor.userName, 4)));
        this.f45355n.setImageResource(h3c0.f105656b1);
        m69713s(bLiveVideoChatAttendeeCallInfo.price, bLiveVideoChatAttendeeCallInfo.hasDiscountPrice, bLiveVideoChatAttendeeCallInfo.callDesc);
    }

    public LiveVChatCalledView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45365x = new String[]{".", "..", "..."};
    }

    public LiveVChatCalledView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45365x = new String[]{".", "..", "..."};
    }
}
