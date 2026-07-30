package com.p046p1.mobile.putong.live.livingroom.officialshow.avatar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.i3c0;
import p149l.j350;
import p149l.mqv;
import p149l.o350;
import p149l.s7m;
import p149l.t100;
import p149l.uep0;
import p149l.uvr;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OfficialShowAvatarView extends FrameLayout implements s7m<j350> {

    /* JADX INFO: renamed from: a */
    public OfficialShowAvatarView f51101a;

    /* JADX INFO: renamed from: b */
    public VLinear f51102b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f51103c;

    /* JADX INFO: renamed from: d */
    public VText f51104d;

    /* JADX INFO: renamed from: e */
    public VText f51105e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f51106f;

    /* JADX INFO: renamed from: g */
    public VText f51107g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f51108h;

    /* JADX INFO: renamed from: i */
    public j350 f51109i;

    /* JADX INFO: renamed from: j */
    public int f51110j;

    public OfficialShowAvatarView(Context context) {
        super(context);
        this.f51110j = t100.m186890d(44.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m75384i(View view) {
        this.f51109i.m139537f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m75385j(View view) {
        this.f51109i.m139536e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m75386k(View view) {
        this.f51109i.m139536e4();
    }

    /* JADX INFO: renamed from: r */
    private void m75387r() {
        xdl0.m208344M(this.f51104d, false);
        xdl0.m208344M(this.f51105e, false);
        this.f51110j = uep0.m193332s(12, (String) getContext().getText(R$string.f46627D4)) + t100.m186890d(16.0f);
        xdl0.m208329E0(this.f51107g, new View.OnClickListener() { // from class: l.k350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120796a.m75384i(view);
            }
        });
        xdl0.m208329E0(this.f51103c, new View.OnClickListener() { // from class: l.l350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125844a.m75385j(view);
            }
        });
        xdl0.m208329E0(this.f51108h, new View.OnClickListener() { // from class: l.m350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131020a.m75386k(view);
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        m75392n();
    }

    /* JADX INFO: renamed from: e */
    public final void m75388e(View view) {
        o350.m162411a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(j350 j350Var) {
        this.f51109i = j350Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m75390l(boolean z) {
        if (!z || !uvr.m196087d().m162663D0()) {
            xdl0.m208345M0(this.f51107g, false);
            this.f51102b.setBackgroundResource(i3c0.f110782M0);
            xdl0.m208327D0(xdl0.m208407w(126.0f), this.f51102b);
            return;
        }
        this.f51107g.setText("订阅");
        xdl0.m208345M0(this.f51107g, true);
        xdl0.m208327D0(this.f51110j, this.f51107g);
        this.f51106f.setBackground(null);
        this.f51109i.m139539h4(null);
        this.f51102b.setBackgroundResource(i3c0.f110770L0);
        xdl0.m208327D0(xdl0.m208407w(170.0f), this.f51102b);
    }

    /* JADX INFO: renamed from: m */
    public void m75391m(boolean z) {
        xdl0.m208345M0((View) getParent(), z);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public void m75392n() {
        this.f51104d.setText("");
        this.f51105e.setText("");
        xdl0.m208344M(this.f51107g, false);
        this.f51108h.m72119i0();
        this.f51102b.setBackgroundResource(i3c0.f110782M0);
        xdl0.m208327D0(xdl0.m208407w(126.0f), this.f51102b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75388e(this);
        m75387r();
    }

    /* JADX INFO: renamed from: p */
    public void m75393p(User user, BLiveUserMask bLiveUserMask) {
        agv.m96344b(this.f51108h, t100.m186890d(53.0f), mqv.m155998f(user).m156003e(bLiveUserMask), new w9j() { // from class: l.n350
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().url;
            }
        });
        this.f51104d.setText(user.name);
        xdl0.m208344M(this.f51104d, true);
        int length = user.description.length();
        String strConcat = user.description;
        if (length > 6) {
            strConcat = strConcat.substring(0, 6).concat("...");
        }
        this.f51105e.setText(strConcat);
        xdl0.m208344M(this.f51105e, true);
    }

    public OfficialShowAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51110j = t100.m186890d(44.0f);
    }

    public OfficialShowAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51110j = t100.m186890d(44.0f);
    }
}
