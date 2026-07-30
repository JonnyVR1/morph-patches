package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.p107im.C14373IM;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.dt0;
import p149l.hxs;
import p149l.lfu;
import p149l.ofu;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatCallingView extends FrameLayout implements s7m<lfu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatCallingView f45366a;

    /* JADX INFO: renamed from: b */
    public VImage f45367b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f45368c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f45369d;

    /* JADX INFO: renamed from: e */
    public VImage f45370e;

    /* JADX INFO: renamed from: f */
    public VLinear f45371f;

    /* JADX INFO: renamed from: g */
    public VText f45372g;

    /* JADX INFO: renamed from: h */
    public VLinear f45373h;

    /* JADX INFO: renamed from: i */
    public VText f45374i;

    /* JADX INFO: renamed from: j */
    public TextView f45375j;

    /* JADX INFO: renamed from: k */
    public VFrame f45376k;

    /* JADX INFO: renamed from: l */
    public VImage f45377l;

    /* JADX INFO: renamed from: m */
    public VRelative f45378m;

    /* JADX INFO: renamed from: n */
    public VText f45379n;

    /* JADX INFO: renamed from: o */
    public VText f45380o;

    /* JADX INFO: renamed from: p */
    public lfu f45381p;

    /* JADX INFO: renamed from: q */
    public ObjectAnimator f45382q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f45383r;

    /* JADX INFO: renamed from: s */
    public String f45384s;

    /* JADX INFO: renamed from: t */
    public String[] f45385t;

    public LiveVChatCallingView(@NonNull Context context) {
        super(context);
        this.f45385t = new String[]{".", "..", "..."};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m69719f(View view) {
        if (NullChecker.m81303a(this.f45381p)) {
            dt0.m113502B(this.f45382q);
            this.f45381p.mo142754U2();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m69720k(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(this.f45373h, false);
            xdl0.m208344M(this.f45375j, false);
            return;
        }
        VText vText = this.f45374i;
        if (z) {
            vText.setTextColor(Color.parseColor("#dddddd"));
            VText vText2 = this.f45374i;
            vText2.setPaintFlags(vText2.getPaintFlags() | 16);
        } else {
            vText.setTextColor(-1);
            VText vText3 = this.f45374i;
            vText3.setPaintFlags(vText3.getPaintFlags() & (-17));
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f45375j.setText(str2);
        }
        this.f45374i.setText(str);
        xdl0.m208344M(this.f45373h, true);
        xdl0.m208344M(this.f45375j, true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m69721c(View view) {
        ofu.m164108a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(lfu lfuVar) {
        this.f45381p = lfuVar;
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113502B(this.f45382q);
        dt0.m113502B(this.f45383r);
    }

    /* JADX INFO: renamed from: e */
    public void m69723e() {
        this.f45381p.m149746V2();
        dt0.m113502B(this.f45383r);
        dt0.m113502B(this.f45382q);
        xdl0.m208344M(this, false);
        xdl0.m208344M(this.f45368c, true);
        if (this.f45368c.isAnimating()) {
            this.f45368c.m68505o();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m69724i(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        VText vText = this.f45380o;
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f45385t;
        sb.append(strArr[iIntValue % strArr.length]);
        sb.append("");
        vText.setText(sb.toString());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m69725j() {
        if (TextUtils.isEmpty(this.f45384s)) {
            return;
        }
        setAvatarUrl(this.f45384s);
    }

    /* JADX INFO: renamed from: l */
    public void m69726l() {
        this.f45372g.setText("接通中，请稍候");
        xdl0.m208344M(this.f45370e, true);
        xdl0.m208344M(this.f45378m, true);
        this.f45380o.setText(".");
        if (this.f45383r == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 3);
            this.f45383r = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f45383r.setRepeatCount(-1);
            this.f45383r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nfu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f138818a.m69724i(valueAnimator);
                }
            });
        }
        this.f45383r.start();
    }

    /* JADX INFO: renamed from: m */
    public void m69727m() {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f45378m, false);
        xdl0.m208344M(this.f45370e, false);
        dt0.m113502B(this.f45382q);
        xdl0.m208344M(this.f45376k, true);
        this.f45372g.setText("呼叫中，等待对方接通");
    }

    /* JADX INFO: renamed from: n */
    public void m69728n(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall) {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f45378m, false);
        xdl0.m208344M(this.f45370e, false);
        dt0.m113502B(this.f45382q);
        xdl0.m208344M(this.f45376k, true);
        setAvatarUrl(bLiveVideoChatAnchorCall.user.avatar);
        m69720k("", false, "");
        this.f45372g.setText("呼叫中，等待对方接通");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69721c(this);
        xdl0.m208329E0(this.f45377l, new View.OnClickListener() { // from class: l.mfu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133622a.m69719f(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m69729p(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f45378m, false);
        xdl0.m208344M(this.f45370e, false);
        dt0.m113502B(this.f45382q);
        xdl0.m208344M(this.f45376k, true);
        if (bLiveVideoChatAttendeeCallInfo != null) {
            setAvatarUrl(bLiveVideoChatAttendeeCallInfo.anchor.avatar);
            m69720k(bLiveVideoChatAttendeeCallInfo.price, bLiveVideoChatAttendeeCallInfo.hasDiscountPrice, bLiveVideoChatAttendeeCallInfo.callDesc);
        }
        this.f45372g.setText("呼叫中，等待对方接通");
    }

    /* JADX INFO: renamed from: q */
    public void m69730q(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch) {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f45378m, false);
        xdl0.m208344M(this.f45370e, false);
        dt0.m113502B(this.f45382q);
        xdl0.m208344M(this.f45376k, true);
        xdl0.m208344M(this.f45369d, false);
        xdl0.m208344M(this.f45368c, true);
        this.f45368c.m68500j("https://fe-static.tancdn.com/v1/raw/34f96929-433e-44b2-a864-edea60926b0a14.svga", -1);
        m69720k("", false, "");
        this.f45372g.setText("呼叫中，等待对方接通");
        xdl0.m208344M(this.f45375j, true);
        this.f45375j.setText("随机匹配时长耗尽后继续通话则按照原价进行扣减通话费用");
    }

    public void setAvatarUrl(String str) {
        this.f45384s = str;
        hxs.m133406s(C14373IM.CHAT_TYPE_VIDEO_CHAT, this.f45369d, str);
    }

    public void setTitle(String str) {
        this.f45372g.setText(str);
    }

    public LiveVChatCallingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45385t = new String[]{".", "..", "..."};
    }

    public LiveVChatCallingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45385t = new String[]{".", "..", "..."};
    }
}
