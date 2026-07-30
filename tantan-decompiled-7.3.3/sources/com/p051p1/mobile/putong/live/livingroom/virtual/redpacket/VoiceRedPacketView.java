package com.p051p1.mobile.putong.live.livingroom.virtual.redpacket;

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
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemTitle;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bae0;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.gt0;
import p153l.iam;
import p153l.it0;
import p153l.izs;
import p153l.jjo0;
import p153l.kcg0;
import p153l.kdu;
import p153l.l51;
import p153l.mdc0;
import p153l.obc0;
import p153l.psd0;
import p153l.qa00;
import p153l.rwn0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceRedPacketView extends VFrame implements iam<jjo0> {

    /* JADX INFO: renamed from: a */
    public VFrame f53504a;

    /* JADX INFO: renamed from: b */
    public VText f53505b;

    /* JADX INFO: renamed from: c */
    public VText f53506c;

    /* JADX INFO: renamed from: d */
    public View f53507d;

    /* JADX INFO: renamed from: e */
    public VLinear f53508e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53509f;

    /* JADX INFO: renamed from: g */
    public VText f53510g;

    /* JADX INFO: renamed from: h */
    public VText f53511h;

    /* JADX INFO: renamed from: i */
    public jjo0 f53512i;

    /* JADX INFO: renamed from: j */
    public String f53513j;

    /* JADX INFO: renamed from: k */
    public Animator f53514k;

    /* JADX INFO: renamed from: l */
    public kcg0 f53515l;

    public VoiceRedPacketView(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jjo0 jjo0Var) {
        this.f53512i = jjo0Var;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m78479E() {
        m78491T(false);
        psd0.m173633z(this.f53515l);
        it0.m142008B(this.f53514k);
    }

    /* JADX INFO: renamed from: F */
    public final void m78480F(BLiveOperationItem bLiveOperationItem) {
        this.f53512i.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7012).m103154e(bLiveOperationItem.popup.textDrawer.jumpScheme).m103152c());
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m78481G() {
        this.f53512i.m145094T3();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m78482K() {
        bnl0.m105524M(this.f53508e, true);
        bnl0.m105524M(this.f53504a, false);
        this.f53508e.setAlpha(1.0f);
        this.f53508e.setPivotX(qa00.m175859d(80.0f));
        this.f53508e.setPivotY(0.0f);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m78483L() {
        bnl0.m105524M(this.f53504a, true);
        this.f53504a.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m78484M() {
        bnl0.m105524M(this.f53508e, false);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m78485N(BLiveOperationItem bLiveOperationItem, View view) {
        m78480F(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m78486O(BLiveOperationItem bLiveOperationItem, View view) {
        m78480F(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m78487P(BLiveOperationItemCountDown bLiveOperationItemCountDown, Long l2) {
        m78488Q(bLiveOperationItemCountDown, Long.valueOf(l2.longValue() + 1));
    }

    /* JADX INFO: renamed from: Q */
    public final void m78488Q(BLiveOperationItemCountDown bLiveOperationItemCountDown, Long l2) {
        long jLongValue = (bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime) - (l2.longValue() * 1000);
        VText vText = this.f53505b;
        if (jLongValue > 0) {
            vText.setText(kdu.m149272Q(jLongValue));
            return;
        }
        vText.setText(bLiveOperationItemCountDown.endText);
        if (BLiveOperationActionAfterCountdown.refresh.equals(bLiveOperationItemCountDown.actionType)) {
            l51.m152888H(this.f53512i.act(), new Runnable() { // from class: l.qjo0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158024a.m78481G();
                }
            }, bLiveOperationItemCountDown.randomDelaySeconds * 1000);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m78489R() {
        Animator animatorM132166l = gt0.m132166l(this.f53508e, gt0.f106354i, 0L, 500L, gt0.f106349d, 0.3f, 1.0f);
        gt0.m132176v(animatorM132166l, new Runnable() { // from class: l.mjo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137110a.m78482K();
            }
        });
        Animator duration = gt0.m132168n(this.f53508e, gt0.f106354i, 1.0f, 0.3f).setDuration(300L);
        Property property = View.ALPHA;
        Animator animatorM132180z = gt0.m132180z(duration, gt0.m132166l(this.f53508e, property, 150L, 150L, null, 1.0f, 0.0f));
        animatorM132180z.setInterpolator(gt0.f106351f);
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.njo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f142329a.m78483L();
            }
        });
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.ojo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147688a.m78484M();
            }
        });
        Animator animatorM132173s = gt0.m132173s(animatorM132166l, gt0.m132164j(2000), animatorM132180z, gt0.m132180z(gt0.m132168n(this.f53507d, View.TRANSLATION_Y, qa00.m175859d(10.0f), 0.0f), gt0.m132168n(this.f53504a, property, 0.0f, 1.0f)).setDuration(100L));
        this.f53514k = animatorM132173s;
        animatorM132173s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public void m78490S(final BLiveOperationItem bLiveOperationItem) {
        m78491T(true);
        psd0.m173633z(this.f53515l);
        izs.m142868s("context_livingAct", this.f53509f, bLiveOperationItem.popup.textDrawer.iconUrl);
        this.f53510g.setText(bLiveOperationItem.popup.textDrawer.content.amount + "");
        bnl0.m105509E0(this.f53508e, new View.OnClickListener() { // from class: l.kjo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127123a.m78485N(bLiveOperationItem, view);
            }
        });
        bnl0.m105509E0(this.f53504a, new View.OnClickListener() { // from class: l.ljo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132380a.m78486O(bLiveOperationItem, view);
            }
        });
        BLiveOperationItemTitle bLiveOperationItemTitle = bLiveOperationItem.title;
        BLiveOperationItemCountDown bLiveOperationItemCountDown = bLiveOperationItemTitle.countdown;
        if (!"countdown".equals(bLiveOperationItemTitle.titleType.toString()) || bLiveOperationItemCountDown == null) {
            this.f53505b.setText(bLiveOperationItem.title.text.content);
            this.f53505b.setBackgroundResource(obc0.f146494t0);
            this.f53505b.setTextColor(Color.parseColor("#ffffff"));
        } else {
            this.f53505b.setText(kdu.m149272Q(bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime));
            this.f53505b.setBackgroundResource(obc0.f146243Y);
            this.f53505b.setTextColor(Color.parseColor("#FFE8BB"));
            m78492V(bLiveOperationItemCountDown);
        }
        BLiveOperationItemLabel bLiveOperationItemLabel = bLiveOperationItem.icon.label;
        if (bLiveOperationItemLabel != null) {
            String str = bLiveOperationItemLabel.content;
            this.f53506c.setText(str);
            bnl0.m105524M(this.f53506c, !TextUtils.isEmpty(str));
        } else {
            bnl0.m105524M(this.f53506c, false);
        }
        String str2 = bLiveOperationItem.popup.textDrawer.content.f45266id;
        if (!this.f53513j.equals(str2)) {
            this.f53513j = str2;
            ((rwn0) this.f53512i.m213810E2()).f165203Z = str2;
            m78489R();
        } else {
            if (this.f53514k.isRunning()) {
                return;
            }
            bnl0.m105524M(this.f53504a, true);
            bnl0.m105524M(this.f53508e, false);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m78491T(boolean z) {
        bnl0.m105524M(this, z);
    }

    /* JADX INFO: renamed from: V */
    public final void m78492V(final BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        this.f53515l = this.f53512i.m113231o2(C22421c.interval(1L, TimeUnit.SECONDS), false).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.pjo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152727a.m78487P(bLiveOperationItemCountDown, (Long) obj);
            }
        }));
    }

    @Override // p153l.iam
    public void destroy() {
        m78479E();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53504a = (VFrame) findViewById(mdc0.f136078V5);
        this.f53507d = findViewById(mdc0.f136069U5);
        this.f53505b = (VText) findViewById(mdc0.f135980K6);
        this.f53508e = (VLinear) findViewById(mdc0.f135982L);
        this.f53509f = (VDraweeView) findViewById(mdc0.f136299t);
        this.f53510g = (VText) findViewById(mdc0.f136197i);
        this.f53506c = (VText) findViewById(mdc0.f135983L0);
        VText vText = (VText) findViewById(mdc0.f136007N6);
        this.f53511h = vText;
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        m78491T(false);
    }

    public void setCurrentPackId(String str) {
        this.f53513j = str;
    }

    public VoiceRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRedPacketView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
