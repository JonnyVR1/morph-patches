package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class l1d0 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f125637a;

    /* JADX INFO: renamed from: b */
    public VText f125638b;

    /* JADX INFO: renamed from: c */
    public VImage f125639c;

    /* JADX INFO: renamed from: d */
    public VImage f125640d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public VDraweeView f125641e;

    /* JADX INFO: renamed from: f */
    public VText f125642f;

    /* JADX INFO: renamed from: g */
    public VText f125643g;

    /* JADX INFO: renamed from: h */
    public VButton f125644h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f125645i;

    /* JADX INFO: renamed from: j */
    public CommonMedalView f125646j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f125647k;

    /* JADX INFO: renamed from: l */
    public Context f125648l;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m148157a(a1d0 a1d0Var, g1d0 g1d0Var, View view) {
        if (a1d0Var == null || a1d0Var.f67173e.isGray()) {
            return;
        }
        if (a1d0Var.m94560U()) {
            lsi0.m151595y(w8u.m202218u(R$string.f44204s0, String.valueOf(a1d0Var.m94556Q())));
            return;
        }
        if (a1d0Var.m94559T()) {
            lsi0.m151593w(R$string.f44201r0);
            return;
        }
        if (a1d0Var.m94552L()) {
            lsi0.m151593w(R$string.f44198q0);
        } else if (a1d0Var.f67173e.isLocked()) {
            lsi0.m151593w(R$string.f44144X0);
        } else if (g1d0Var != null) {
            g1d0Var.mo124069a(a1d0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m148158b(g1d0 g1d0Var, a1d0 a1d0Var, View view) {
        if (g1d0Var != null) {
            g1d0Var.mo124071c(a1d0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m148159c(g1d0 g1d0Var, a1d0 a1d0Var, View view) {
        if (g1d0Var == null || a1d0Var == null || TextUtils.isEmpty(a1d0Var.f67173e.jumpUrl)) {
            return;
        }
        g1d0Var.mo124070b(a1d0Var.f67173e.jumpUrl);
    }

    /* JADX INFO: renamed from: e */
    public static String m148160e(Context context, BLiveRightItem bLiveRightItem) {
        if (bLiveRightItem.permanent) {
            return context.getString(R$string.f44140V0);
        }
        return bLiveRightItem.isGray() ? context.getString(R$string.f44138U0) : jbu.m140813U(bLiveRightItem.periodEndTimeInSeconds);
    }

    /* JADX INFO: renamed from: d */
    public void m148161d(j2m j2mVar) {
        this.f125637a = j2mVar.getRightContentView();
        this.f125638b = j2mVar.getRightDurationView();
        this.f125639c = j2mVar.getRightArrowView();
        this.f125640d = j2mVar.getRightLockIconView();
        this.f125641e = j2mVar.getRightIconView();
        this.f125642f = j2mVar.getRightTitleView();
        this.f125643g = j2mVar.getRightDescView();
        this.f125644h = j2mVar.getCraftButton();
        this.f125645i = j2mVar.getDescLayout();
        this.f125646j = j2mVar.getCommonIconView();
        this.f125647k = j2mVar.getDynamicIcon();
        this.f125648l = this.f125637a.getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m148162f(a1d0 a1d0Var) {
        BLiveRightItem bLiveRightItem = a1d0Var.f67173e;
        this.f125638b.setText(m148160e(this.f125648l, bLiveRightItem));
        int color = Color.parseColor(bLiveRightItem.isGray() ? "#999999" : "#212121");
        this.f125642f.setTextColor(color);
        this.f125638b.setTextColor(color);
        VDraweeView vDraweeView = this.f125641e;
        if (vDraweeView != null) {
            vDraweeView.setAlpha(bLiveRightItem.isGray() ? 0.5f : 1.0f);
        }
        AnimEffectPlayer animEffectPlayer = this.f125647k;
        if (animEffectPlayer != null) {
            animEffectPlayer.setAlpha(bLiveRightItem.isGray() ? 0.5f : 1.0f);
        }
        Drawable drawable = this.f125648l.getResources().getDrawable(bLiveRightItem.isGray() ? g3c0.f100441s : g3c0.f100397S);
        drawable.setBounds(0, 0, t100.m186890d(20.0f), t100.m186890d(20.0f));
        this.f125638b.setCompoundDrawables(drawable, null, null, null);
    }

    /* JADX INFO: renamed from: g */
    public void m148163g(a1d0 a1d0Var) {
        this.f125637a.setBackgroundResource(a1d0Var.m94553N() ? g3c0.f100379A : g3c0.f100451z);
    }

    /* JADX INFO: renamed from: h */
    public final void m148164h(final a1d0 a1d0Var, final g1d0 g1d0Var) {
        this.f125637a.setOnClickListener(new View.OnClickListener() { // from class: l.j1d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l1d0.m148157a(a1d0Var, g1d0Var, view);
            }
        });
        this.f125643g.setOnClickListener(new View.OnClickListener() { // from class: l.k1d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l1d0.m148159c(g1d0Var, a1d0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m148165i(a1d0 a1d0Var) {
        BLiveRightItem bLiveRightItem = a1d0Var.f67173e;
        this.f125642f.setText(lmj.m150590a(bLiveRightItem.rightName));
        this.f125643g.setText(lmj.m150590a(bLiveRightItem.description));
        AnimEffectPlayer animEffectPlayer = this.f125647k;
        if (animEffectPlayer != null) {
            xdl0.m208344M(animEffectPlayer, false);
        }
        if (this.f125641e != null && !w8u.m202223z(bLiveRightItem.getThumbnailUrl())) {
            this.f125641e.setImageResource(g3c0.f100437q);
            hxs.m133406s("context_right_act", this.f125641e, bLiveRightItem.getThumbnailUrl());
        } else if (this.f125647k != null && w8u.m202223z(bLiveRightItem.getThumbnailUrl())) {
            xdl0.m208344M(this.f125647k, true);
            this.f125647k.mo68502l(bLiveRightItem.getThumbnailUrl(), -1, null);
        } else {
            CommonMedalView commonMedalView = this.f125646j;
            if (commonMedalView != null) {
                agv.m96351i(commonMedalView, t100.m186890d(21.0f), bLiveRightItem.thumbnailUrl, bLiveRightItem.dynamicUrl);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m148166j(final a1d0 a1d0Var, final g1d0 g1d0Var) {
        if (a1d0Var == null || !a1d0Var.m94552L()) {
            this.f125644h.setVisibility(8);
            VText vText = this.f125642f;
            int i = t100.f167261j;
            xdl0.m208359W(vText, i);
            xdl0.m208359W(this.f125645i, i);
            return;
        }
        this.f125644h.setVisibility(0);
        int iM186890d = t100.m186890d(76.0f);
        xdl0.m208359W(this.f125642f, iM186890d);
        xdl0.m208359W(this.f125645i, iM186890d);
        this.f125644h.setOnClickListener(new View.OnClickListener() { // from class: l.i1d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l1d0.m148158b(g1d0Var, a1d0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m148167k(BLiveRightItem bLiveRightItem) {
        Drawable drawable = !TextUtils.isEmpty(bLiveRightItem.jumpUrl) ? this.f125648l.getResources().getDrawable(g3c0.f100382D) : null;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.f125643g.setCompoundDrawables(null, null, drawable, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m148168l(a1d0 a1d0Var) {
        ViewGroup.LayoutParams layoutParams = this.f125637a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = a1d0Var.mo94557R();
            marginLayoutParams.leftMargin = a1d0Var.mo94554O();
            marginLayoutParams.rightMargin = a1d0Var.mo94555P();
        }
        this.f125637a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public final void m148169m(a1d0 a1d0Var) {
        m148170n(a1d0Var);
        m148162f(a1d0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m148170n(a1d0 a1d0Var) {
        int i;
        boolean zM94551K = a1d0Var.m94551K();
        xdl0.m208344M(this.f125639c, zM94551K);
        xdl0.m208344M(this.f125640d, false);
        if (zM94551K) {
            return;
        }
        if (a1d0Var.m94558S()) {
            i = g3c0.f100392N;
        } else if (a1d0Var.m94549I()) {
            i = g3c0.f100389K;
        } else {
            i = a1d0Var.m94550J() ? g3c0.f100396R : -1;
        }
        VImage vImage = this.f125640d;
        if (i == -1) {
            xdl0.m208344M(vImage, false);
        } else {
            vImage.setImageResource(i);
            xdl0.m208344M(this.f125640d, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m148171o(a1d0 a1d0Var, g1d0 g1d0Var) {
        m148164h(a1d0Var, g1d0Var);
        BLiveRightItem bLiveRightItem = a1d0Var.f67173e;
        m148165i(a1d0Var);
        m148167k(bLiveRightItem);
        m148168l(a1d0Var);
        m148163g(a1d0Var);
        m148169m(a1d0Var);
        m148166j(a1d0Var, g1d0Var);
    }
}
