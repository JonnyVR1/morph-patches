package com.p051p1.mobile.putong.live.livingroom.voice.intl.operations;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.view.LiveHorizontalAutoScrollView;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.izs;
import p153l.jfo0;
import p153l.jxd0;
import p153l.kcg0;
import p153l.mdc0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qfo0;
import p153l.rwn0;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceOperationsItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54155a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f54156b;

    /* JADX INFO: renamed from: c */
    public View f54157c;

    /* JADX INFO: renamed from: d */
    public VText f54158d;

    /* JADX INFO: renamed from: e */
    public LiveHorizontalAutoScrollView f54159e;

    /* JADX INFO: renamed from: f */
    public jxd0 f54160f;

    /* JADX INFO: renamed from: g */
    public kcg0 f54161g;

    public VoiceOperationsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m79499b() {
        this.f54160f = null;
        LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f54159e;
        if (liveHorizontalAutoScrollView != null) {
            liveHorizontalAutoScrollView.m77709l();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m79500c(long j) {
        return String.format("%02d:%02d", Long.valueOf(j / 60), Long.valueOf(j % 60));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m79501d(IntlLiveOperationItemBean intlLiveOperationItemBean, Long l2) {
        m79508k(intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: e */
    public final void m79502e(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (TextUtils.isEmpty(intlLiveOperationItemBean.icon)) {
            bnl0.m105524M(this.f54155a, false);
            bnl0.m105524M(this.f54156b, false);
            return;
        }
        boolean zEqualsIgnoreCase = "svga".equalsIgnoreCase(intlLiveOperationItemBean.iconType);
        VDraweeView vDraweeView = this.f54155a;
        if (zEqualsIgnoreCase) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f54156b, true);
            this.f54156b.m69683j(intlLiveOperationItemBean.icon, -1);
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105524M(this.f54156b, false);
            izs.m142868s("context_single_room", this.f54155a, intlLiveOperationItemBean.icon);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m79503f(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        jxd0 jxd0Var;
        if (!intlLiveOperationItemBean.enableRedDot || (jxd0Var = this.f54160f) == null) {
            return;
        }
        jxd0Var.put(Boolean.TRUE);
        m79507j(intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: g */
    public void m79504g(jfo0 jfo0Var, IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean == null) {
            return;
        }
        if (this.f54160f == null && !TextUtils.isEmpty(intlLiveOperationItemBean.f45083id)) {
            this.f54160f = new jxd0("voice_operation_reddot_" + intlLiveOperationItemBean.f45083id + "_" + zrv.f205799a.m207631D0(), Boolean.FALSE);
        }
        m79502e(intlLiveOperationItemBean);
        m79505h(intlLiveOperationItemBean.name);
        m79507j(intlLiveOperationItemBean);
        m79506i(jfo0Var, intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: h */
    public final void m79505h(String str) {
        if (this.f54159e != null) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f54159e;
            if (zIsEmpty) {
                liveHorizontalAutoScrollView.setSingleText("");
            } else {
                liveHorizontalAutoScrollView.setSingleText(str);
            }
            this.f54159e.m77710m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m79506i(jfo0 jfo0Var, final IntlLiveOperationItemBean intlLiveOperationItemBean) {
        psd0.m173633z(this.f54161g);
        if (intlLiveOperationItemBean.countDownTimestamp > 0) {
            if (intlLiveOperationItemBean.countDownTimestamp - (pzi0.m174454o() / 1000) > 0) {
                qfo0 qfo0Var = jfo0Var.f120609j;
                this.f54161g = jfo0Var.mo68557c(qfo0Var, ((rwn0) qfo0Var.m213810E2()).m168525i2(TimeUnit.SECONDS)).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.kfo0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f126464a.m79501d(intlLiveOperationItemBean, (Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m79507j(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean.digitalRedDotCount > 0) {
            bnl0.m105524M(this.f54157c, false);
            bnl0.m105524M(this.f54158d, true);
            this.f54158d.setText(String.valueOf(intlLiveOperationItemBean.digitalRedDotCount));
        } else {
            if (!intlLiveOperationItemBean.enableRedDot) {
                bnl0.m105524M(this.f54157c, false);
                bnl0.m105524M(this.f54158d, false);
                return;
            }
            jxd0 jxd0Var = this.f54160f;
            if (jxd0Var == null || !jxd0Var.get().booleanValue()) {
                bnl0.m105524M(this.f54157c, true);
                bnl0.m105524M(this.f54158d, false);
            } else {
                bnl0.m105524M(this.f54157c, false);
                bnl0.m105524M(this.f54158d, false);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m79508k(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean != null && intlLiveOperationItemBean.countDownTimestamp > 0) {
            long jM174454o = intlLiveOperationItemBean.countDownTimestamp - (pzi0.m174454o() / 1000);
            if (jM174454o <= 0) {
                if (jM174454o == 0) {
                    m79505h(intlLiveOperationItemBean.name);
                }
            } else {
                String strM79500c = m79500c(jM174454o);
                LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f54159e;
                if (liveHorizontalAutoScrollView != null) {
                    liveHorizontalAutoScrollView.setSingleText(strM79500c);
                    this.f54159e.m77710m();
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54155a = (VDraweeView) findViewById(mdc0.f135895B2);
        this.f54156b = (AnimEffectPlayer) findViewById(mdc0.f136270p6);
        this.f54157c = findViewById(mdc0.f136104Y4);
        this.f54158d = (VText) findViewById(mdc0.f136295s4);
        this.f54159e = (LiveHorizontalAutoScrollView) findViewById(mdc0.f136025P6);
    }

    public VoiceOperationsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
