package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.LiveVChatOptItemView;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VText;
import p149l.aru;
import p149l.e30;
import p149l.h3c0;
import p149l.hou;
import p149l.jtk;
import p149l.oou;
import p149l.ptk;
import p149l.s7m;
import p149l.slk0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatOptView extends ConstraintLayout implements s7m<hou> {

    /* JADX INFO: renamed from: d */
    public VText f45403d;

    /* JADX INFO: renamed from: e */
    public LiveVChatOptItemView f45404e;

    /* JADX INFO: renamed from: f */
    public LiveVChatOptItemView f45405f;

    /* JADX INFO: renamed from: g */
    public LiveVChatOptItemView f45406g;

    /* JADX INFO: renamed from: h */
    public LiveVChatOptItemView f45407h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f45408i;

    /* JADX INFO: renamed from: j */
    public hou f45409j;

    /* JADX INFO: renamed from: k */
    public String f45410k;

    /* JADX INFO: renamed from: l */
    public String f45411l;

    /* JADX INFO: renamed from: m */
    public long f45412m;

    public LiveVChatOptView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m69752r() {
        this.f45408i.setImageResource(h3c0.f105640U0);
        LiveVChatOptItemView liveVChatOptItemView = this.f45406g;
        int i = h3c0.f105646X0;
        liveVChatOptItemView.m69208c(i, i);
        this.f45406g.setBackgroundResource(h3c0.f105681k);
        this.f45405f.m69208c(h3c0.f105644W0, h3c0.f105642V0);
        this.f45404e.m69208c(h3c0.f105650Z0, h3c0.f105648Y0);
        LiveVChatOptItemView liveVChatOptItemView2 = this.f45407h;
        int i2 = h3c0.f105653a1;
        liveVChatOptItemView2.m69208c(i2, i2);
        this.f45407h.setBackgroundResource(h3c0.f105681k);
        xdl0.m208329E0(this.f45408i, new View.OnClickListener() { // from class: l.iou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114201a.m69753t0(view);
            }
        });
        this.f45404e.setSelectListener(new e30() { // from class: l.jou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119011a.m69754u0((Boolean) obj);
            }
        });
        this.f45405f.setSelectListener(new e30() { // from class: l.kou
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124059a.m69766v0((Boolean) obj);
            }
        });
        xdl0.m208329E0(this.f45406g, new View.OnClickListener() { // from class: l.lou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129143a.m69755w0(view);
            }
        });
        xdl0.m208329E0(this.f45407h, new View.OnClickListener() { // from class: l.mou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134955a.m69756y0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m69753t0(View view) {
        this.f45409j.m218409H2().m203919S(slk0.f165239e);
        aru.m98565n(this.f45409j.m218414N2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m69754u0(Boolean bool) {
        this.f45409j.m218411K2().LiveVideoChatEvent.m69201k().mo172463j(Boolean.valueOf(!bool.booleanValue()));
        aru.m98568q(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m69755w0(View view) {
        hou houVar = this.f45409j;
        if (houVar != null) {
            C12505a.m69246p(houVar, false);
        }
        aru.m98566o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m69756y0(View view) {
        hou houVar = this.f45409j;
        if (houVar != null) {
            houVar.m132281k3();
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: B0 */
    public void m69757B0(boolean z, String str, long j) {
        xdl0.m208344M(this.f45403d, z && xdl0.m208349O0(this));
        if (j < 0) {
            return;
        }
        String strM69760n0 = m69760n0(j * 1000);
        String str2 = TextUtils.equals(str, "randomCoupon") ? "随机匹配剩余时长\n" : "倒计时";
        this.f45403d.setText(str2 + strM69760n0);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m69758D0(String str, long j) {
        this.f45411l = str;
        this.f45412m = j;
        if (TextUtils.isEmpty(str)) {
            m69764r0();
        } else if (xdl0.m208349O0(this)) {
            m69759E0(str, j);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m69759E0(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m69764r0();
        jtk jtkVarM143119k = new jtk(this.f45409j.act()).m143129u(str).m143113e(Color.parseColor("#fe7e1d")).m143119k(true);
        int i = t100.f167260i;
        this.f45410k = ptk.m171332h().m171346t(jtkVarM143119k.m143124p(i).m143128t(13).m143130v(false).m143127s(i, i, i, i).m143117i(jtk.f119617D).m143112d(new jtk.InterfaceC17857b() { // from class: l.nou
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str2) {
                this.f139878a.m69767z0(str2);
            }
        }).m143109a(j * 1000), this.f45406g);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public String m69760n0(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "00:00";
        }
        double d2 = d - (((long) ((int) (d / 3600000.0d))) * 3600000);
        int i = (int) (d2 / 60000.0d);
        return String.format(Locale.getDefault(), "%02d:%02d ", Integer.valueOf(i), Integer.valueOf((int) ((d2 - (((long) i) * Constants.ONE_MIN_IN_MILLIS)) / 1000.0d)));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m69761o0(View view) {
        oou.m165282a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69761o0(this);
        m69752r();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hou houVar) {
        this.f45409j = houVar;
    }

    /* JADX INFO: renamed from: q0 */
    public void m69763q0() {
        boolean zM208349O0 = xdl0.m208349O0(this);
        boolean z = !zM208349O0;
        xdl0.m208344M(this, z);
        if (!TextUtils.isEmpty(this.f45410k)) {
            ptk.m171332h().m171343q(this.f45410k, z);
        } else {
            if (zM208349O0) {
                return;
            }
            m69759E0(this.f45411l, this.f45412m);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m69764r0() {
        if (!TextUtils.isEmpty(this.f45410k)) {
            ptk.m171332h().m171334g(this.f45410k);
        }
        this.f45410k = null;
    }

    /* JADX INFO: renamed from: s0 */
    public void m69765s0(boolean z, boolean z2) {
        xdl0.m208344M(this, z);
        if (z) {
            xdl0.m208345M0(this.f45404e, !z2);
            xdl0.m208345M0(this.f45405f, !z2);
            xdl0.m208345M0(this.f45406g, !z2);
            this.f45404e.setSelectedUI(false);
            this.f45405f.setSelectedUI(true);
        }
    }

    public void setGiftButtonVisible(boolean z) {
        xdl0.m208344M(this.f45407h, z);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m69766v0(Boolean bool) {
        this.f45409j.m218411K2().LiveVideoChatEvent.m69191a().mo172463j(Boolean.valueOf(!bool.booleanValue()));
        aru.m98569r(bool.booleanValue());
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m69767z0(String str) {
        this.f45410k = "";
        this.f45411l = "";
    }

    public LiveVChatOptView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatOptView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
