package com.p000p1.mobile.putong.live.livingroom.voice.intl.operations;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.livingroom.view.LiveHorizontalAutoScrollView;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ffw;
import l.g5c0;
import l.hpd0;
import l.hxs;
import l.jo0;
import l.mkd0;
import l.xdl0;
import p009l.f6o0;
import p009l.m6o0;
import p009l.mqi0;
import p009l.ypv;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceOperationsItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6913a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f6914b;

    /* JADX INFO: renamed from: c */
    public View f6915c;

    /* JADX INFO: renamed from: d */
    public VText f6916d;

    /* JADX INFO: renamed from: e */
    public LiveHorizontalAutoScrollView f6917e;

    /* JADX INFO: renamed from: f */
    public hpd0 f6918f;

    /* JADX INFO: renamed from: g */
    public c4g0 f6919g;

    public VoiceOperationsItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public void m8509b() {
        this.f6918f = null;
        LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f6917e;
        if (liveHorizontalAutoScrollView != null) {
            liveHorizontalAutoScrollView.l();
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m8510c(long j) {
        return String.format("%02d:%02d", Long.valueOf(j / 60), Long.valueOf(j % 60));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8511d(IntlLiveOperationItemBean intlLiveOperationItemBean, Long l2) {
        m8518k(intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: e */
    public final void m8512e(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (TextUtils.isEmpty(intlLiveOperationItemBean.icon)) {
            xdl0.M(this.f6913a, false);
            xdl0.M(this.f6914b, false);
            return;
        }
        boolean zEqualsIgnoreCase = "svga".equalsIgnoreCase(intlLiveOperationItemBean.iconType);
        VDraweeView vDraweeView = this.f6913a;
        if (zEqualsIgnoreCase) {
            xdl0.M(vDraweeView, false);
            xdl0.M(this.f6914b, true);
            this.f6914b.j(intlLiveOperationItemBean.icon, -1);
        } else {
            xdl0.M(vDraweeView, true);
            xdl0.M(this.f6914b, false);
            hxs.s("context_single_room", this.f6913a, intlLiveOperationItemBean.icon);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8513f(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        hpd0 hpd0Var;
        if (!intlLiveOperationItemBean.enableRedDot || (hpd0Var = this.f6918f) == null) {
            return;
        }
        hpd0Var.put(Boolean.TRUE);
        m8517j(intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: g */
    public void m8514g(f6o0 f6o0Var, IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean == null) {
            return;
        }
        if (this.f6918f == null && !TextUtils.isEmpty(intlLiveOperationItemBean.id)) {
            this.f6918f = new hpd0("voice_operation_reddot_" + intlLiveOperationItemBean.id + "_" + ypv.f23196a.m23619D0(), Boolean.FALSE);
        }
        m8512e(intlLiveOperationItemBean);
        m8515h(intlLiveOperationItemBean.name);
        m8517j(intlLiveOperationItemBean);
        m8516i(f6o0Var, intlLiveOperationItemBean);
    }

    /* JADX INFO: renamed from: h */
    public final void m8515h(String str) {
        if (this.f6917e != null) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f6917e;
            if (zIsEmpty) {
                liveHorizontalAutoScrollView.setSingleText("");
            } else {
                liveHorizontalAutoScrollView.setSingleText(str);
            }
            this.f6917e.m();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8516i(f6o0 f6o0Var, final IntlLiveOperationItemBean intlLiveOperationItemBean) {
        mkd0.z(this.f6919g);
        if (intlLiveOperationItemBean.countDownTimestamp > 0) {
            if (intlLiveOperationItemBean.countDownTimestamp - (mqi0.m18550o() / 1000) > 0) {
                m6o0 m6o0Var = f6o0Var.f12841j;
                this.f6919g = f6o0Var.c(m6o0Var, m6o0Var.E2().i2(TimeUnit.SECONDS)).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.g6o0
                    public final void call(Object obj) {
                        this.f13331a.m8511d(intlLiveOperationItemBean, (Long) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8517j(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean.digitalRedDotCount > 0) {
            xdl0.M(this.f6915c, false);
            xdl0.M(this.f6916d, true);
            this.f6916d.setText(String.valueOf(intlLiveOperationItemBean.digitalRedDotCount));
        } else {
            if (!intlLiveOperationItemBean.enableRedDot) {
                xdl0.M(this.f6915c, false);
                xdl0.M(this.f6916d, false);
                return;
            }
            hpd0 hpd0Var = this.f6918f;
            if (hpd0Var == null || !((Boolean) hpd0Var.get()).booleanValue()) {
                xdl0.M(this.f6915c, true);
                xdl0.M(this.f6916d, false);
            } else {
                xdl0.M(this.f6915c, false);
                xdl0.M(this.f6916d, false);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m8518k(IntlLiveOperationItemBean intlLiveOperationItemBean) {
        if (intlLiveOperationItemBean != null && intlLiveOperationItemBean.countDownTimestamp > 0) {
            long jM18550o = intlLiveOperationItemBean.countDownTimestamp - (mqi0.m18550o() / 1000);
            if (jM18550o <= 0) {
                if (jM18550o == 0) {
                    m8515h(intlLiveOperationItemBean.name);
                }
            } else {
                String strM8510c = m8510c(jM18550o);
                LiveHorizontalAutoScrollView liveHorizontalAutoScrollView = this.f6917e;
                if (liveHorizontalAutoScrollView != null) {
                    liveHorizontalAutoScrollView.setSingleText(strM8510c);
                    this.f6917e.m();
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6913a = findViewById(g5c0.B2);
        this.f6914b = findViewById(g5c0.p6);
        this.f6915c = findViewById(g5c0.Y4);
        this.f6916d = findViewById(g5c0.s4);
        this.f6917e = findViewById(g5c0.P6);
    }

    public VoiceOperationsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationsItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
