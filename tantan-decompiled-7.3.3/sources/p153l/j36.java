package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveBoardHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardRecord;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderboardUser;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j36 extends d3q<RelativeLayout> {

    /* JADX INFO: renamed from: a */
    public nsv<d36.C16429b> f118153a;

    /* JADX INFO: renamed from: b */
    public y20<String> f118154b;

    public j36(nsv<d36.C16429b> nsvVar) {
        this.f118153a = nsvVar;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m143332J(BLiveLeaderboardUser bLiveLeaderboardUser, View view) {
        this.f118154b.call(bLiveLeaderboardUser.userId);
    }

    @Override // p153l.d3q
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RelativeLayout relativeLayout) {
        super.mo71749u(relativeLayout);
        d36.C16429b c16429b = this.f118153a.f143542a;
        final BLiveLeaderboardUser bLiveLeaderboardUser = c16429b.f84869d;
        BLiveLeaderboardRecord bLiveLeaderboardRecord = c16429b.f84867b;
        BLiveBoardHierarchy bLiveBoardHierarchy = c16429b.f84868c;
        VDraweeView vDraweeView = (VDraweeView) relativeLayout.findViewById(mdc0.f136048S2);
        TextView textView = (TextView) relativeLayout.findViewById(mdc0.f136271p7);
        TextView textView2 = (TextView) relativeLayout.findViewById(mdc0.f136135b7);
        VDraweeView vDraweeView2 = (VDraweeView) relativeLayout.findViewById(mdc0.f136035Q7);
        TextView textView3 = (TextView) relativeLayout.findViewById(mdc0.f136225k7);
        VText vText = (VText) relativeLayout.findViewById(mdc0.f136316u7);
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(mdc0.f135959I3);
        VImage vImage = (VImage) relativeLayout.findViewById(mdc0.f136152d4);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) relativeLayout.findViewById(mdc0.f136261o6);
        if (e3t.m119319a(this.f118153a).m119322d()) {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(vImage, true);
        } else {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(vImage, false);
            m143336O(vDraweeView2, bLiveBoardHierarchy);
            m143334L(relativeLayout.getContext(), textView2, bLiveLeaderboardUser);
        }
        ql3.m176985c(vDraweeView, this.f118153a, new qcj() { // from class: l.h36
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((d36.C16429b) obj).f84869d.imageUrl;
            }
        });
        textView.setText(bLiveLeaderboardUser.name);
        m143335N(animEffectPlayer, vText, bLiveLeaderboardRecord.rank, relativeLayout.getContext());
        String strM161280d = n3d0.m161280d(vxr.m203876d().m171022s0() ? R$string.f47456C7 : R$string.f47862V5);
        if (((civ) zrv.m221194l(htd0.f111524f)).m109970n()) {
            strM161280d = n3d0.m161280d(R$string.f47828Td);
        }
        textView3.setText(yau.m214935c(Long.valueOf(bLiveLeaderboardRecord.amount).longValue()) + strM161280d);
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.i36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112689a.m143332J(bLiveLeaderboardUser, view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L */
    public final void m143334L(Context context, TextView textView, BLiveLeaderboardUser bLiveLeaderboardUser) {
        boolean zEquals = TextUtils.equals(bLiveLeaderboardUser.gender, "female");
        textView.setCompoundDrawablesWithIntrinsicBounds(context.getDrawable(zEquals ? obc0.f146216V5 : obc0.f146194T5), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setBackground(jde.m144406b(!zEquals ? -10587906 : -509799, qa00.m175859d(5.0f)));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setText(bLiveLeaderboardUser.age + "");
    }

    /* JADX INFO: renamed from: N */
    public final void m143335N(AnimEffectPlayer animEffectPlayer, VText vText, int i, Context context) {
        okc0.m168005e(context, animEffectPlayer, vText, i);
    }

    /* JADX INFO: renamed from: O */
    public final void m143336O(VDraweeView vDraweeView, BLiveBoardHierarchy bLiveBoardHierarchy) {
        BLiveUserLevel bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveBoardHierarchy.grade);
        if (bLiveBoardHierarchy.grade == 0 || bLiveUserLevelM135170v == null) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            izs.m142868s("context_livingAct", vDraweeView, bLiveUserLevelM135170v.backendUrl);
            bnl0.m105524M(vDraweeView, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public j36 m143337P(y20<String> y20Var) {
        this.f118154b = y20Var;
        return this;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198763G;
    }
}
