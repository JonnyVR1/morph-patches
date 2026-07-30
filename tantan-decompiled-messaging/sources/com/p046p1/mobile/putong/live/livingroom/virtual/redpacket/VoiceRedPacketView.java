package com.p046p1.mobile.putong.live.livingroom.virtual.redpacket;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemTitle;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.dt0;
import p149l.e30;
import p149l.e51;
import p149l.fao0;
import p149l.ffw;
import p149l.g5c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.jbu;
import p149l.jo0;
import p149l.mkd0;
import p149l.nnn0;
import p149l.s7m;
import p149l.t100;
import p149l.x1e0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceRedPacketView extends VFrame implements s7m<fao0> {

    /* JADX INFO: renamed from: a */
    public VFrame f52656a;

    /* JADX INFO: renamed from: b */
    public VText f52657b;

    /* JADX INFO: renamed from: c */
    public VText f52658c;

    /* JADX INFO: renamed from: d */
    public View f52659d;

    /* JADX INFO: renamed from: e */
    public VLinear f52660e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52661f;

    /* JADX INFO: renamed from: g */
    public VText f52662g;

    /* JADX INFO: renamed from: h */
    public VText f52663h;

    /* JADX INFO: renamed from: i */
    public fao0 f52664i;

    /* JADX INFO: renamed from: j */
    public String f52665j;

    /* JADX INFO: renamed from: k */
    public Animator f52666k;

    /* JADX INFO: renamed from: l */
    public c4g0 f52667l;

    public VoiceRedPacketView(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fao0 fao0Var) {
        this.f52664i = fao0Var;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m77296E() {
        m77308T(false);
        mkd0.m154992z(this.f52667l);
        dt0.m113502B(this.f52666k);
    }

    /* JADX INFO: renamed from: F */
    public final void m77297F(BLiveOperationItem bLiveOperationItem) {
        this.f52664i.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e(bLiveOperationItem.popup.textDrawer.jumpScheme).m206699c());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m77298G() {
        this.f52664i.m120249T3();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m77299K() {
        xdl0.m208344M(this.f52660e, true);
        xdl0.m208344M(this.f52656a, false);
        this.f52660e.setAlpha(1.0f);
        this.f52660e.setPivotX(t100.m186890d(80.0f));
        this.f52660e.setPivotY(0.0f);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m77300L() {
        xdl0.m208344M(this.f52656a, true);
        this.f52656a.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m77301M() {
        xdl0.m208344M(this.f52660e, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m77302N(BLiveOperationItem bLiveOperationItem, View view) {
        m77297F(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m77303O(BLiveOperationItem bLiveOperationItem, View view) {
        m77297F(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m77304P(BLiveOperationItemCountDown bLiveOperationItemCountDown, Long l2) {
        m77305Q(bLiveOperationItemCountDown, Long.valueOf(l2.longValue() + 1));
    }

    /* JADX INFO: renamed from: Q */
    public final void m77305Q(BLiveOperationItemCountDown bLiveOperationItemCountDown, Long l2) {
        long jLongValue = (bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime) - (l2.longValue() * 1000);
        VText vText = this.f52657b;
        if (jLongValue > 0) {
            vText.setText(jbu.m140809Q(jLongValue));
            return;
        }
        vText.setText(bLiveOperationItemCountDown.endText);
        if (BLiveOperationActionAfterCountdown.refresh.equals(bLiveOperationItemCountDown.actionType)) {
            e51.m114743H(this.f52664i.act(), new Runnable() { // from class: l.mao0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132943a.m77298G();
                }
            }, bLiveOperationItemCountDown.randomDelaySeconds * 1000);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m77306R() {
        Animator animatorM103739l = bt0.m103739l(this.f52660e, bt0.f77162i, 0L, 500L, bt0.f77157d, 0.3f, 1.0f);
        bt0.m103749v(animatorM103739l, new Runnable() { // from class: l.iao0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112316a.m77299K();
            }
        });
        Animator duration = bt0.m103741n(this.f52660e, bt0.f77162i, 1.0f, 0.3f).setDuration(300L);
        Property property = View.ALPHA;
        Animator animatorM103753z = bt0.m103753z(duration, bt0.m103739l(this.f52660e, property, 150L, 150L, null, 1.0f, 0.0f));
        animatorM103753z.setInterpolator(bt0.f77159f);
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.jao0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117106a.m77300L();
            }
        });
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.kao0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122138a.m77301M();
            }
        });
        Animator animatorM103746s = bt0.m103746s(animatorM103739l, bt0.m103737j(2000), animatorM103753z, bt0.m103753z(bt0.m103741n(this.f52659d, View.TRANSLATION_Y, t100.m186890d(10.0f), 0.0f), bt0.m103741n(this.f52656a, property, 0.0f, 1.0f)).setDuration(100L));
        this.f52666k = animatorM103746s;
        animatorM103746s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public void m77307S(final BLiveOperationItem bLiveOperationItem) {
        m77308T(true);
        mkd0.m154992z(this.f52667l);
        hxs.m133406s("context_livingAct", this.f52661f, bLiveOperationItem.popup.textDrawer.iconUrl);
        this.f52662g.setText(bLiveOperationItem.popup.textDrawer.content.amount + "");
        xdl0.m208329E0(this.f52660e, new View.OnClickListener() { // from class: l.gao0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101689a.m77302N(bLiveOperationItem, view);
            }
        });
        xdl0.m208329E0(this.f52656a, new View.OnClickListener() { // from class: l.hao0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106764a.m77303O(bLiveOperationItem, view);
            }
        });
        BLiveOperationItemTitle bLiveOperationItemTitle = bLiveOperationItem.title;
        BLiveOperationItemCountDown bLiveOperationItemCountDown = bLiveOperationItemTitle.countdown;
        if (!"countdown".equals(bLiveOperationItemTitle.titleType.toString()) || bLiveOperationItemCountDown == null) {
            this.f52657b.setText(bLiveOperationItem.title.text.content);
            this.f52657b.setBackgroundResource(i3c0.f111166t0);
            this.f52657b.setTextColor(Color.parseColor("#ffffff"));
        } else {
            this.f52657b.setText(jbu.m140809Q(bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime));
            this.f52657b.setBackgroundResource(i3c0.f110915Y);
            this.f52657b.setTextColor(Color.parseColor("#FFE8BB"));
            m77309V(bLiveOperationItemCountDown);
        }
        BLiveOperationItemLabel bLiveOperationItemLabel = bLiveOperationItem.icon.label;
        if (bLiveOperationItemLabel != null) {
            String str = bLiveOperationItemLabel.content;
            this.f52658c.setText(str);
            xdl0.m208344M(this.f52658c, !TextUtils.isEmpty(str));
        } else {
            xdl0.m208344M(this.f52658c, false);
        }
        String str2 = bLiveOperationItem.popup.textDrawer.content.f44418id;
        if (!this.f52665j.equals(str2)) {
            this.f52665j = str2;
            ((nnn0) this.f52664i.m206027E2()).f139756Z = str2;
            m77306R();
        } else {
            if (this.f52666k.isRunning()) {
                return;
            }
            xdl0.m208344M(this.f52656a, true);
            xdl0.m208344M(this.f52660e, false);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m77308T(boolean z) {
        xdl0.m208344M(this, z);
    }

    /* JADX INFO: renamed from: V */
    public final void m77309V(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        this.f52667l = this.f52664i.m104250o2(C22306c.interval(1L, TimeUnit.SECONDS), false).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.lao0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127229a.m77304P(bLiveOperationItemCountDown, (Long) obj);
            }
        }));
    }

    @Override // p149l.s7m
    public void destroy() {
        m77296E();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52656a = (VFrame) findViewById(g5c0.f100833V5);
        this.f52659d = findViewById(g5c0.f100824U5);
        this.f52657b = (VText) findViewById(g5c0.f100735K6);
        this.f52660e = (VLinear) findViewById(g5c0.f100737L);
        this.f52661f = (VDraweeView) findViewById(g5c0.f101054t);
        this.f52662g = (VText) findViewById(g5c0.f100952i);
        this.f52658c = (VText) findViewById(g5c0.f100738L0);
        VText vText = (VText) findViewById(g5c0.f100762N6);
        this.f52663h = vText;
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        m77308T(false);
    }

    public void setCurrentPackId(String str) {
        this.f52665j = str;
    }

    public VoiceRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRedPacketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
