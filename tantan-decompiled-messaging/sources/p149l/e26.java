package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class e26 extends d1q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public mqv<y16.C21278b> f88887a;

    /* JADX INFO: renamed from: b */
    public e30<String> f88888b;

    public e26(mqv<y16.C21278b> mqvVar) {
        this.f88887a = mqvVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m114490J(BLiveLeaderboardUser bLiveLeaderboardUser, View view) {
        this.f88888b.call(bLiveLeaderboardUser.userId);
    }

    @Override // p149l.d1q
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RelativeLayout relativeLayout) {
        super.mo70566u(relativeLayout);
        y16.C21278b c21278b = this.f88887a.f135304a;
        final BLiveLeaderboardUser bLiveLeaderboardUser = c21278b.f195390d;
        BLiveLeaderboardRecord bLiveLeaderboardRecord = c21278b.f195388b;
        BLiveBoardHierarchy bLiveBoardHierarchy = c21278b.f195389c;
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(g5c0.f100803S2);
        TextView textView = (TextView) relativeLayout.findViewById(g5c0.f101026p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(g5c0.f100890b7);
        VDraweeView vDraweeView2 = (VDraweeView) relativeLayout.findViewById(g5c0.f100790Q7);
        TextView textView3 = (TextView) relativeLayout.findViewById(g5c0.f100980k7);
        VText vText = (VText) relativeLayout.findViewById(g5c0.f101071u7);
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(g5c0.f100714I3);
        VImage vImage = (VImage) relativeLayout.findViewById(g5c0.f100907d4);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) relativeLayout.findViewById(g5c0.f101016o6);
        if (d1t.m109678a(this.f88887a).m109681d()) {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(vImage, true);
        } else {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(vImage, false);
            m114494O(vDraweeView2, bLiveBoardHierarchy);
            m114492L(relativeLayout.getContext(), textView2, bLiveLeaderboardUser);
        }
        wk3.m203644c(vDraweeView, this.f88887a, new w9j() { // from class: l.c26
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((y16.C21278b) obj).f195390d.imageUrl;
            }
        });
        textView.setText(bLiveLeaderboardUser.name);
        m114493N(animEffectPlayer, vText, bLiveLeaderboardRecord.rank, relativeLayout.getContext());
        String strM147355d = kvc0.m147355d(uvr.m196087d().m162715s0() ? R$string.f46608C7 : R$string.f47014V5);
        if (((bgv) ypv.m215673l(fld0.f98151f)).m101734n()) {
            strM147355d = kvc0.m147355d(R$string.f46980Td);
        }
        textView3.setText(x8u.m207433c(Long.valueOf(bLiveLeaderboardRecord.amount).longValue()) + strM147355d);
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.d26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83329a.m114490J(bLiveLeaderboardUser, view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L */
    public final void m114492L(Context context, TextView textView, BLiveLeaderboardUser bLiveLeaderboardUser) {
        boolean zEquals = TextUtils.equals(bLiveLeaderboardUser.gender, "female");
        textView.setCompoundDrawablesWithIntrinsicBounds(context.getDrawable(zEquals ? i3c0.f110888V5 : i3c0.f110866T5), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackground(fce.m120425b(!zEquals ? -10587906 : -509799, t100.m186890d(5.0f)));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(bLiveLeaderboardUser.age + "");
    }

    /* JADX INFO: renamed from: N */
    public final void m114493N(AnimEffectPlayer animEffectPlayer, VText vText, int i, Context context) {
        hcc0.m130420e(context, animEffectPlayer, vText, i);
    }

    /* JADX INFO: renamed from: O */
    public final void m114494O(VDraweeView vDraweeView, BLiveBoardHierarchy bLiveBoardHierarchy) {
        BLiveUserLevel bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveBoardHierarchy.grade);
        if (bLiveBoardHierarchy.grade == 0 || bLiveUserLevelM126036v == null) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            hxs.m133406s("context_livingAct", vDraweeView, bLiveUserLevelM126036v.backendUrl);
            xdl0.m208344M(vDraweeView, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public e26 m114495P(e30<String> e30Var) {
        this.f88888b = e30Var;
        return this;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168031G;
    }
}
