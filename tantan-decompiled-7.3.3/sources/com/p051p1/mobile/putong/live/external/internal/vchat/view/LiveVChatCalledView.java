package com.p051p1.mobile.putong.live.external.internal.vchat.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.p112im.C14536IM;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dhu;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.jhu;
import p153l.nbc0;
import p153l.qa00;
import p153l.xau;
import p153l.xjg;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatCalledView extends FrameLayout implements iam<dhu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatCalledView f46190a;

    /* JADX INFO: renamed from: b */
    public VImage f46191b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f46192c;

    /* JADX INFO: renamed from: d */
    public VImage f46193d;

    /* JADX INFO: renamed from: e */
    public VLinear f46194e;

    /* JADX INFO: renamed from: f */
    public VText f46195f;

    /* JADX INFO: renamed from: g */
    public VLinear f46196g;

    /* JADX INFO: renamed from: h */
    public VText f46197h;

    /* JADX INFO: renamed from: i */
    public TextView f46198i;

    /* JADX INFO: renamed from: j */
    public VFrame f46199j;

    /* JADX INFO: renamed from: k */
    public VImage f46200k;

    /* JADX INFO: renamed from: l */
    public VFrame f46201l;

    /* JADX INFO: renamed from: m */
    public VImage f46202m;

    /* JADX INFO: renamed from: n */
    public VImage f46203n;

    /* JADX INFO: renamed from: o */
    public VRelative f46204o;

    /* JADX INFO: renamed from: p */
    public VText f46205p;

    /* JADX INFO: renamed from: q */
    public VText f46206q;

    /* JADX INFO: renamed from: r */
    public dhu f46207r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f46208s;

    /* JADX INFO: renamed from: t */
    public ValueAnimator f46209t;

    /* JADX INFO: renamed from: u */
    public Animator f46210u;

    /* JADX INFO: renamed from: v */
    public boolean f46211v;

    /* JADX INFO: renamed from: w */
    public String f46212w;

    /* JADX INFO: renamed from: x */
    public String[] f46213x;

    public LiveVChatCalledView(@NonNull Context context) {
        super(context);
        this.f46213x = new String[]{".", "..", "..."};
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142008B(this.f46208s);
        it0.m142008B(this.f46210u);
        it0.m142008B(this.f46209t);
    }

    /* JADX INFO: renamed from: f */
    public final void m70887f(View view) {
        jhu.m144935a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dhu dhuVar) {
        this.f46207r = dhuVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m70889j(boolean z) {
        this.f46207r.m115821W2();
        it0.m142008B(this.f46208s);
        it0.m142008B(this.f46209t);
        this.f46206q.setText(".");
        bnl0.m105524M(this.f46193d, false);
        bnl0.m105524M(this.f46204o, false);
        this.f46211v = false;
        if (!z) {
            bnl0.m105524M(this, false);
            return;
        }
        it0.m142008B(this.f46210u);
        Animator animatorM132170p = gt0.m132170p(this, "translationY", 0L, 500L, new xjg(), 0.0f, -getMeasuredHeight());
        this.f46210u = animatorM132170p;
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.ghu
            @Override // java.lang.Runnable
            public final void run() {
                this.f104155a.m70890k();
            }
        });
        this.f46210u.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m70890k() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m70891l(View view) {
        if (!NullChecker.m82486a(this.f46207r) || this.f46211v) {
            return;
        }
        this.f46211v = true;
        this.f46207r.mo115819T2();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m70892m(View view) {
        if (NullChecker.m82486a(this.f46207r)) {
            it0.m142008B(this.f46208s);
            it0.m142008B(this.f46209t);
            this.f46207r.mo115820V2();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m70893n(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        VText vText = this.f46206q;
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f46213x;
        sb.append(strArr[iIntValue % strArr.length]);
        sb.append("");
        vText.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70887f(this);
        bnl0.m105509E0(this.f46202m, new View.OnClickListener() { // from class: l.ehu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94077a.m70891l(view);
            }
        });
        bnl0.m105509E0(this.f46200k, new View.OnClickListener() { // from class: l.fhu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99120a.m70892m(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m70894p(BLiveVideoChat bLiveVideoChat) {
        setTranslationY(-getMeasuredHeight());
        bnl0.m105524M(this.f46201l, true);
        bnl0.m105524M(this.f46199j, true);
        VFrame vFrame = this.f46201l;
        int i = qa00.f156298K;
        vFrame.setTranslationX(-i);
        this.f46199j.setTranslationX(i);
        setAvatarUrl(bLiveVideoChat.getAttendee().avatar);
        this.f46195f.setText(String.format("%s\n向你发起视频闪聊", xau.m209906p(bLiveVideoChat.getAttendee().userName, 6)));
        m70896s("", false, "");
        this.f46203n.setImageResource(nbc0.f141147b1);
    }

    /* JADX INFO: renamed from: q */
    public void m70895q() {
        if (TextUtils.isEmpty(this.f46212w)) {
            return;
        }
        setAvatarUrl(this.f46212w);
    }

    /* JADX INFO: renamed from: s */
    public final void m70896s(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f46196g, false);
            bnl0.m105524M(this.f46198i, false);
            return;
        }
        VText vText = this.f46197h;
        if (z) {
            vText.setTextColor(Color.parseColor("#dddddd"));
            VText vText2 = this.f46197h;
            vText2.setPaintFlags(vText2.getPaintFlags() | 16);
        } else {
            vText.setTextColor(-1);
            VText vText3 = this.f46197h;
            vText3.setPaintFlags(vText3.getPaintFlags() & (-17));
        }
        this.f46197h.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            this.f46198i.setText(str2);
        }
        bnl0.m105524M(this.f46196g, true);
        bnl0.m105524M(this.f46198i, true);
    }

    public void setAvatarUrl(String str) {
        this.f46212w = str;
        izs.m142868s(C14536IM.CHAT_TYPE_VIDEO_CHAT, this.f46192c, str);
    }

    /* JADX INFO: renamed from: u */
    public void m70897u(boolean z) {
        bnl0.m105524M(this, true);
        this.f46203n.setImageResource(nbc0.f141150c1);
        it0.m142008B(this.f46208s);
        if (this.f46208s == null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132170p(this.f46203n, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, -360.0f);
            this.f46208s = objectAnimator;
            objectAnimator.setRepeatCount(-1);
        }
        this.f46195f.setText("接通中，请稍后");
        this.f46208s.start();
        if (z) {
            return;
        }
        bnl0.m105524M(this.f46204o, true);
        bnl0.m105524M(this.f46193d, true);
        this.f46206q.setText(".");
        it0.m142008B(this.f46209t);
        if (this.f46209t == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 3);
            this.f46209t = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f46209t.setRepeatCount(-1);
            this.f46209t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ihu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f115018a.m70893n(valueAnimator);
                }
            });
        }
        this.f46209t.start();
    }

    /* JADX INFO: renamed from: v */
    public void m70898v(final BLiveVideoChat bLiveVideoChat) {
        this.f46211v = false;
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f46204o, false);
        bnl0.m105524M(this.f46193d, false);
        it0.m142008B(this.f46209t);
        it0.m142008B(this.f46208s);
        xjg xjgVar = new xjg();
        Animator animatorM132170p = gt0.m132170p(this, "translationY", 0L, 500L, xjgVar, -getMeasuredHeight(), 0.0f);
        VFrame vFrame = this.f46201l;
        int i = qa00.f156298K;
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, gt0.m132170p(vFrame, "translationX", 200L, 300L, xjgVar, -i, 0.0f), gt0.m132170p(this.f46199j, "translationX", 200L, 300L, xjgVar, i, 0.0f));
        this.f46210u = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.hhu
            @Override // java.lang.Runnable
            public final void run() {
                this.f109925a.m70894p(bLiveVideoChat);
            }
        });
        this.f46210u.start();
    }

    /* JADX INFO: renamed from: w */
    public void m70899w(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        this.f46211v = false;
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f46204o, false);
        bnl0.m105524M(this.f46193d, false);
        it0.m142008B(this.f46209t);
        it0.m142008B(this.f46208s);
        bnl0.m105524M(this.f46201l, true);
        bnl0.m105524M(this.f46199j, true);
        setAvatarUrl(bLiveVideoChatAttendeeCallInfo.anchor.avatar);
        this.f46195f.setText(String.format("%s向你发起视频闪聊", xau.m209906p(bLiveVideoChatAttendeeCallInfo.anchor.userName, 4)));
        this.f46203n.setImageResource(nbc0.f141147b1);
        m70896s(bLiveVideoChatAttendeeCallInfo.price, bLiveVideoChatAttendeeCallInfo.hasDiscountPrice, bLiveVideoChatAttendeeCallInfo.callDesc);
    }

    public LiveVChatCalledView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46213x = new String[]{".", "..", "..."};
    }

    public LiveVChatCalledView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46213x = new String[]{".", "..", "..."};
    }
}
