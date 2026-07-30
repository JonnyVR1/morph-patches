package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.bgv;
import l.d1q;
import l.d1t;
import l.e30;
import l.fce;
import l.fld0;
import l.ggv;
import l.hcc0;
import l.hxs;
import l.kvc0;
import l.mqv;
import l.t100;
import l.uvr;
import l.w9j;
import l.wk3;
import l.x8u;
import l.xdl0;
import l.ypv;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e26 extends d1q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public mqv<y16.C0904b> f9549a;

    /* JADX INFO: renamed from: b */
    public e30<String> f9550b;

    public e26(mqv<y16.C0904b> mqvVar) {
        this.f9549a = mqvVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m12148J(BLiveLeaderboardUser bLiveLeaderboardUser, View view) {
        this.f9550b.call(bLiveLeaderboardUser.userId);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m12155u(RelativeLayout relativeLayout) {
        super.u(relativeLayout);
        Object obj = this.f9549a.a;
        final BLiveLeaderboardUser bLiveLeaderboardUser = ((y16.C0904b) obj).f22603d;
        BLiveLeaderboardRecord bLiveLeaderboardRecord = ((y16.C0904b) obj).f22601b;
        BLiveBoardHierarchy bLiveBoardHierarchy = ((y16.C0904b) obj).f22602c;
        VDraweeView vDraweeViewFindViewById = relativeLayout.findViewById(g5c0.f10953S2);
        TextView textView = (TextView) relativeLayout.findViewById(g5c0.f11176p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(g5c0.f11040b7);
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(g5c0.f10940Q7);
        TextView textView3 = (TextView) relativeLayout.findViewById(g5c0.f11130k7);
        VText vText = (VText) relativeLayout.findViewById(g5c0.f11221u7);
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(g5c0.f10864I3);
        VImage vImageFindViewById = relativeLayout.findViewById(g5c0.f11057d4);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) relativeLayout.findViewById(g5c0.f11166o6);
        if (d1t.a(this.f9549a).d()) {
            xdl0.M(linearLayout, false);
            xdl0.M(vImageFindViewById, true);
        } else {
            xdl0.M(linearLayout, true);
            xdl0.M(vImageFindViewById, false);
            m12152O(vDraweeView, bLiveBoardHierarchy);
            m12150L(relativeLayout.getContext(), textView2, bLiveLeaderboardUser);
        }
        wk3.c(vDraweeViewFindViewById, this.f9549a, new w9j() { // from class: l.c26
            public final Object call(Object obj2) {
                return ((y16.C0904b) obj2).f22603d.imageUrl;
            }
        });
        textView.setText(bLiveLeaderboardUser.name);
        m12151N(animEffectPlayer, vText, bLiveLeaderboardRecord.rank, relativeLayout.getContext());
        String strD = kvc0.d(uvr.d().s0() ? R$string.f2650C7 : R$string.f3056V5);
        if (((bgv) ypv.l(fld0.f)).n()) {
            strD = kvc0.d(R$string.f3022Td);
        }
        textView3.setText(x8u.c(Long.valueOf(bLiveLeaderboardRecord.amount).longValue()) + strD);
        xdl0.E0(vDraweeViewFindViewById, new View.OnClickListener() { // from class: l.d26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9043a.m12148J(bLiveLeaderboardUser, view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L */
    public final void m12150L(Context context, TextView textView, BLiveLeaderboardUser bLiveLeaderboardUser) {
        boolean zEquals = TextUtils.equals(bLiveLeaderboardUser.gender, "female");
        textView.setCompoundDrawablesWithIntrinsicBounds(context.getDrawable(zEquals ? i3c0.f12673V5 : i3c0.f12651T5), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackground(fce.b(!zEquals ? -10587906 : -509799, t100.d(5.0f)));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(bLiveLeaderboardUser.age + "");
    }

    /* JADX INFO: renamed from: N */
    public final void m12151N(AnimEffectPlayer animEffectPlayer, VText vText, int i, Context context) {
        hcc0.e(context, animEffectPlayer, vText, i);
    }

    /* JADX INFO: renamed from: O */
    public final void m12152O(VDraweeView vDraweeView, BLiveBoardHierarchy bLiveBoardHierarchy) {
        BLiveUserLevel bLiveUserLevelV = ((ggv) ypv.l(fld0.c)).v(bLiveBoardHierarchy.grade);
        if (bLiveBoardHierarchy.grade == 0 || bLiveUserLevelV == null) {
            xdl0.M(vDraweeView, false);
        } else {
            hxs.s("context_livingAct", vDraweeView, bLiveUserLevelV.backendUrl);
            xdl0.M(vDraweeView, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public e26 m12153P(e30<String> e30Var) {
        this.f9550b = e30Var;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public int m12154o() {
        return t6c0.f19527G;
    }
}
