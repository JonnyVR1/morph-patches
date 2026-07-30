package com.p046p1.mobile.putong.live.livingroom.voice.intl.operations;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.view.LiveHorizontalAutoScrollView;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VText;
import p149l.c4g0;
import p149l.e30;
import p149l.f6o0;
import p149l.ffw;
import p149l.g5c0;
import p149l.hpd0;
import p149l.hxs;
import p149l.jo0;
import p149l.m6o0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nnn0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceOperationsItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53307a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53308b;

    /* JADX INFO: renamed from: c */
    public View f53309c;

    /* JADX INFO: renamed from: d */
    public VText f53310d;

    /* JADX INFO: renamed from: e */
    public LiveHorizontalAutoScrollView f53311e;

    /* JADX INFO: renamed from: f */
    public hpd0 f53312f;

    /* JADX INFO: renamed from: g */
    public c4g0 f53313g;

    public VoiceOperationsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m78316b() {
        this.f53312f = null;
        LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f53311e;
        if (liveHorizontalAutoScrollView != null) {
            liveHorizontalAutoScrollView.m76526l();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m78317c(long j) {
        return String.format("%02d:%02d", Long.valueOf(j / 60), Long.valueOf(j % 60));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m78318d(IntlLiveOperationItemBean intlLiveOperationItemBean, Long l2) {
        m78325k(intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: e */
    public final void m78319e(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (TextUtils.isEmpty(intlLiveOperationItemBean.icon)) {
            xdl0.m208344M(this.f53307a, false);
            xdl0.m208344M(this.f53308b, false);
            return;
        }
        boolean zEqualsIgnoreCase = "svga".equalsIgnoreCase(intlLiveOperationItemBean.iconType);
        VDraweeView vDraweeView = this.f53307a;
        if (zEqualsIgnoreCase) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f53308b, true);
            this.f53308b.m68500j(intlLiveOperationItemBean.icon, -1);
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208344M(this.f53308b, false);
            hxs.m133406s("context_single_room", this.f53307a, intlLiveOperationItemBean.icon);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78320f(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        hpd0 hpd0Var;
        if (!intlLiveOperationItemBean.enableRedDot || (hpd0Var = this.f53312f) == null) {
            return;
        }
        hpd0Var.put(Boolean.TRUE);
        m78324j(intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: g */
    public void m78321g(f6o0 f6o0Var, IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean == null) {
            return;
        }
        if (this.f53312f == null && !TextUtils.isEmpty(intlLiveOperationItemBean.f44235id)) {
            this.f53312f = new hpd0("voice_operation_reddot_" + intlLiveOperationItemBean.f44235id + "_" + ypv.f199493a.m199309D0(), Boolean.FALSE);
        }
        m78319e(intlLiveOperationItemBean);
        m78322h(intlLiveOperationItemBean.name);
        m78324j(intlLiveOperationItemBean);
        m78323i(f6o0Var, intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: h */
    public final void m78322h(String str) {
        if (this.f53311e != null) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f53311e;
            if (zIsEmpty) {
                liveHorizontalAutoScrollView.setSingleText("");
            } else {
                liveHorizontalAutoScrollView.setSingleText(str);
            }
            this.f53311e.m76527m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m78323i(f6o0 f6o0Var, final IntlLiveOperationItemBean intlLiveOperationItemBean) {
        mkd0.m154992z(this.f53313g);
        if (intlLiveOperationItemBean.countDownTimestamp > 0) {
            if (intlLiveOperationItemBean.countDownTimestamp - (mqi0.m155944o() / 1000) > 0) {
                m6o0 m6o0Var = f6o0Var.f96156j;
                this.f53313g = f6o0Var.mo67374c(m6o0Var, ((nnn0) m6o0Var.m206027E2()).m132139i2(TimeUnit.SECONDS)).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.g6o0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f101298a.m78318d(intlLiveOperationItemBean, (Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m78324j(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean.digitalRedDotCount > 0) {
            xdl0.m208344M(this.f53309c, false);
            xdl0.m208344M(this.f53310d, true);
            this.f53310d.setText(String.valueOf(intlLiveOperationItemBean.digitalRedDotCount));
        } else {
            if (!intlLiveOperationItemBean.enableRedDot) {
                xdl0.m208344M(this.f53309c, false);
                xdl0.m208344M(this.f53310d, false);
                return;
            }
            hpd0 hpd0Var = this.f53312f;
            if (hpd0Var == null || !hpd0Var.get().booleanValue()) {
                xdl0.m208344M(this.f53309c, true);
                xdl0.m208344M(this.f53310d, false);
            } else {
                xdl0.m208344M(this.f53309c, false);
                xdl0.m208344M(this.f53310d, false);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m78325k(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean != null && intlLiveOperationItemBean.countDownTimestamp > 0) {
            long jM155944o = intlLiveOperationItemBean.countDownTimestamp - (mqi0.m155944o() / 1000);
            if (jM155944o <= 0) {
                if (jM155944o == 0) {
                    m78322h(intlLiveOperationItemBean.name);
                }
            } else {
                String strM78317c = m78317c(jM155944o);
                LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f53311e;
                if (liveHorizontalAutoScrollView != null) {
                    liveHorizontalAutoScrollView.setSingleText(strM78317c);
                    this.f53311e.m76527m();
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53307a = (VDraweeView) findViewById(g5c0.f100650B2);
        this.f53308b = (AnimEffectPlayer) findViewById(g5c0.f101025p6);
        this.f53309c = findViewById(g5c0.f100859Y4);
        this.f53310d = (VText) findViewById(g5c0.f101050s4);
        this.f53311e = (LiveHorizontalAutoScrollView) findViewById(g5c0.f100780P6);
    }

    public VoiceOperationsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
