package com.p051p1.mobile.putong.live.external.internal.vchat.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.p112im.C14536IM;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.mhu;
import p153l.phu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatCallingView extends FrameLayout implements iam<mhu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatCallingView f46214a;

    /* JADX INFO: renamed from: b */
    public VImage f46215b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f46216c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f46217d;

    /* JADX INFO: renamed from: e */
    public VImage f46218e;

    /* JADX INFO: renamed from: f */
    public VLinear f46219f;

    /* JADX INFO: renamed from: g */
    public VText f46220g;

    /* JADX INFO: renamed from: h */
    public VLinear f46221h;

    /* JADX INFO: renamed from: i */
    public VText f46222i;

    /* JADX INFO: renamed from: j */
    public TextView f46223j;

    /* JADX INFO: renamed from: k */
    public VFrame f46224k;

    /* JADX INFO: renamed from: l */
    public VImage f46225l;

    /* JADX INFO: renamed from: m */
    public VRelative f46226m;

    /* JADX INFO: renamed from: n */
    public VText f46227n;

    /* JADX INFO: renamed from: o */
    public VText f46228o;

    /* JADX INFO: renamed from: p */
    public mhu f46229p;

    /* JADX INFO: renamed from: q */
    public ObjectAnimator f46230q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f46231r;

    /* JADX INFO: renamed from: s */
    public String f46232s;

    /* JADX INFO: renamed from: t */
    public String[] f46233t;

    public LiveVChatCallingView(@NonNull Context context) {
        super(context);
        this.f46233t = new String[]{".", "..", "..."};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m70902f(View view) {
        if (NullChecker.m82486a(this.f46229p)) {
            it0.m142008B(this.f46230q);
            this.f46229p.mo151122U2();
        }
    }

    /* JADX INFO: renamed from: k */
    private void m70903k(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(this.f46221h, false);
            bnl0.m105524M(this.f46223j, false);
            return;
        }
        VText vText = this.f46222i;
        if (z) {
            vText.setTextColor(Color.parseColor("#dddddd"));
            VText vText2 = this.f46222i;
            vText2.setPaintFlags(vText2.getPaintFlags() | 16);
        } else {
            vText.setTextColor(-1);
            VText vText3 = this.f46222i;
            vText3.setPaintFlags(vText3.getPaintFlags() & (-17));
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f46223j.setText(str2);
        }
        this.f46222i.setText(str);
        bnl0.m105524M(this.f46221h, true);
        bnl0.m105524M(this.f46223j, true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m70904c(View view) {
        phu.m172337a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mhu mhuVar) {
        this.f46229p = mhuVar;
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142008B(this.f46230q);
        it0.m142008B(this.f46231r);
    }

    /* JADX INFO: renamed from: e */
    public void m70906e() {
        this.f46229p.m158429V2();
        it0.m142008B(this.f46231r);
        it0.m142008B(this.f46230q);
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.f46216c, true);
        if (this.f46216c.isAnimating()) {
            this.f46216c.m69688o();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m70907i(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        VText vText = this.f46228o;
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f46233t;
        sb.append(strArr[iIntValue % strArr.length]);
        sb.append("");
        vText.setText(sb.toString());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m70908j() {
        if (TextUtils.isEmpty(this.f46232s)) {
            return;
        }
        setAvatarUrl(this.f46232s);
    }

    /* JADX INFO: renamed from: l */
    public void m70909l() {
        this.f46220g.setText("接通中，请稍候");
        bnl0.m105524M(this.f46218e, true);
        bnl0.m105524M(this.f46226m, true);
        this.f46228o.setText(".");
        if (this.f46231r == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 3);
            this.f46231r = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(600L);
            this.f46231r.setRepeatCount(-1);
            this.f46231r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ohu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f147487a.m70907i(valueAnimator);
                }
            });
        }
        this.f46231r.start();
    }

    /* JADX INFO: renamed from: m */
    public void m70910m() {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f46226m, false);
        bnl0.m105524M(this.f46218e, false);
        it0.m142008B(this.f46230q);
        bnl0.m105524M(this.f46224k, true);
        this.f46220g.setText("呼叫中，等待对方接通");
    }

    /* JADX INFO: renamed from: n */
    public void m70911n(BLiveVideoChatAnchorCall bLiveVideoChatAnchorCall) {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f46226m, false);
        bnl0.m105524M(this.f46218e, false);
        it0.m142008B(this.f46230q);
        bnl0.m105524M(this.f46224k, true);
        setAvatarUrl(bLiveVideoChatAnchorCall.user.avatar);
        m70903k("", false, "");
        this.f46220g.setText("呼叫中，等待对方接通");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70904c(this);
        bnl0.m105509E0(this.f46225l, new View.OnClickListener() { // from class: l.nhu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142066a.m70902f(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m70912p(BLiveVideoChatAttendeeCallInfo bLiveVideoChatAttendeeCallInfo) {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f46226m, false);
        bnl0.m105524M(this.f46218e, false);
        it0.m142008B(this.f46230q);
        bnl0.m105524M(this.f46224k, true);
        if (bLiveVideoChatAttendeeCallInfo != null) {
            setAvatarUrl(bLiveVideoChatAttendeeCallInfo.anchor.avatar);
            m70903k(bLiveVideoChatAttendeeCallInfo.price, bLiveVideoChatAttendeeCallInfo.hasDiscountPrice, bLiveVideoChatAttendeeCallInfo.callDesc);
        }
        this.f46220g.setText("呼叫中，等待对方接通");
    }

    /* JADX INFO: renamed from: q */
    public void m70913q(BLiveVideoChatRandomMatch bLiveVideoChatRandomMatch) {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f46226m, false);
        bnl0.m105524M(this.f46218e, false);
        it0.m142008B(this.f46230q);
        bnl0.m105524M(this.f46224k, true);
        bnl0.m105524M(this.f46217d, false);
        bnl0.m105524M(this.f46216c, true);
        this.f46216c.m69683j("https://fe-static.tancdn.com/v1/raw/34f96929-433e-44b2-a864-edea60926b0a14.svga", -1);
        m70903k("", false, "");
        this.f46220g.setText("呼叫中，等待对方接通");
        bnl0.m105524M(this.f46223j, true);
        this.f46223j.setText("随机匹配时长耗尽后继续通话则按照原价进行扣减通话费用");
    }

    public void setAvatarUrl(String str) {
        this.f46232s = str;
        izs.m142868s(C14536IM.CHAT_TYPE_VIDEO_CHAT, this.f46217d, str);
    }

    public void setTitle(String str) {
        this.f46220g.setText(str);
    }

    public LiveVChatCallingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46233t = new String[]{".", "..", "..."};
    }

    public LiveVChatCallingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46233t = new String[]{".", "..", "..."};
    }
}
