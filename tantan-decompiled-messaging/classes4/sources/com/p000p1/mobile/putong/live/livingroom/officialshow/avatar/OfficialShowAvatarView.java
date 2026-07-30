package com.p000p1.mobile.putong.live.livingroom.officialshow.avatar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import l.agv;
import l.mqv;
import l.s7m;
import l.t100;
import l.uep0;
import l.uvr;
import l.w9j;
import l.xdl0;
import p002l.i3c0;
import p002l.j350;
import p002l.o350;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OfficialShowAvatarView extends FrameLayout implements s7m<j350> {

    /* JADX INFO: renamed from: a */
    public OfficialShowAvatarView f7143a;

    /* JADX INFO: renamed from: b */
    public VLinear f7144b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7145c;

    /* JADX INFO: renamed from: d */
    public VText f7146d;

    /* JADX INFO: renamed from: e */
    public VText f7147e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7148f;

    /* JADX INFO: renamed from: g */
    public VText f7149g;

    /* JADX INFO: renamed from: h */
    public CommonMaskAvatarView f7150h;

    /* JADX INFO: renamed from: i */
    public j350 f7151i;

    /* JADX INFO: renamed from: j */
    public int f7152j;

    public OfficialShowAvatarView(Context context) {
        super(context);
        this.f7152j = t100.d(44.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m9009i(View view) {
        this.f7151i.m15605f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m9010j(View view) {
        this.f7151i.m15604e4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m9011k(View view) {
        this.f7151i.m15604e4();
    }

    /* JADX INFO: renamed from: r */
    private void m9012r() {
        xdl0.M(this.f7146d, false);
        xdl0.M(this.f7147e, false);
        this.f7152j = uep0.s(12, (String) getContext().getText(R$string.f2669D4)) + t100.d(16.0f);
        xdl0.E0(this.f7149g, new View.OnClickListener() { // from class: l.k350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14181a.m9009i(view);
            }
        });
        xdl0.E0(this.f7145c, new View.OnClickListener() { // from class: l.l350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14663a.m9010j(view);
            }
        });
        xdl0.E0(this.f7150h, new View.OnClickListener() { // from class: l.m350
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15224a.m9011k(view);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public Context m9013C0() {
        return getContext();
    }

    public void destroy() {
        m9019n();
    }

    /* JADX INFO: renamed from: e */
    public final void m9014e(View view) {
        o350.m19193a(this, view);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m9016i1(j350 j350Var) {
        this.f7151i = j350Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m9017l(boolean z) {
        if (!z || !uvr.d().D0()) {
            xdl0.M0(this.f7149g, false);
            this.f7144b.setBackgroundResource(i3c0.f12567M0);
            xdl0.D0(xdl0.w(126.0f), new View[]{this.f7144b});
            return;
        }
        this.f7149g.setText("订阅");
        xdl0.M0(this.f7149g, true);
        xdl0.D0(this.f7152j, new View[]{this.f7149g});
        this.f7148f.setBackground(null);
        this.f7151i.m15607h4(null);
        this.f7144b.setBackgroundResource(i3c0.f12555L0);
        xdl0.D0(xdl0.w(170.0f), new View[]{this.f7144b});
    }

    /* JADX INFO: renamed from: m */
    public void m9018m(boolean z) {
        xdl0.M0((View) getParent(), z);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public void m9019n() {
        this.f7146d.setText("");
        this.f7147e.setText("");
        xdl0.M(this.f7149g, false);
        this.f7150h.m5592i0();
        this.f7144b.setBackgroundResource(i3c0.f12567M0);
        xdl0.D0(xdl0.w(126.0f), new View[]{this.f7144b});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9014e(this);
        m9012r();
    }

    /* JADX INFO: renamed from: p */
    public void m9020p(User user, BLiveUserMask bLiveUserMask) {
        agv.b(this.f7150h, t100.d(53.0f), mqv.f(user).e(bLiveUserMask), new w9j() { // from class: l.n350
            public final Object call(Object obj) {
                return ((Media) ((User) obj).fp()).url;
            }
        });
        this.f7146d.setText(user.name);
        xdl0.M(this.f7146d, true);
        int length = user.description.length();
        String strConcat = user.description;
        if (length > 6) {
            strConcat = strConcat.substring(0, 6).concat("...");
        }
        this.f7147e.setText(strConcat);
        xdl0.M(this.f7147e, true);
    }

    public OfficialShowAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7152j = t100.d(44.0f);
    }

    public OfficialShowAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7152j = t100.d(44.0f);
    }
}
