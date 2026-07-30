package p009l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import l.hxs;
import l.i3c0;
import l.ino0;
import l.j2g0;
import l.kvc0;
import l.t100;
import l.t6c0;
import l.u6n;
import l.w8u;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hno0 extends LiveMenuDialogHolder<gpo0> {

    /* JADX INFO: renamed from: k */
    public View f14185k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f14186l;

    /* JADX INFO: renamed from: m */
    public VText f14187m;

    /* JADX INFO: renamed from: n */
    public VText f14188n;

    /* JADX INFO: renamed from: o */
    public VoiceSweetCpHeadView f14189o;

    /* JADX INFO: renamed from: p */
    public View f14190p;

    /* JADX INFO: renamed from: q */
    public VText f14191q;

    /* JADX INFO: renamed from: r */
    public VText f14192r;

    /* JADX INFO: renamed from: s */
    public BLiveVoiceSweetCpRecommendUser f14193s;

    /* JADX INFO: renamed from: t */
    public BLiveVoiceCpHouseInfo f14194t;

    public hno0(Act act, gpo0 gpo0Var) {
        super(t6c0.na, act, gpo0Var, j2g0.d(0.35f, true));
        B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m15889N(View view) {
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m15890O(View view) {
        p();
        ((gpo0) ((LiveMenuDialogHolder) this).b).m15211q4(this.f14193s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m15891P(View view) {
        ((gpo0) ((LiveMenuDialogHolder) this).b).m15204U4(this.f14193s.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m15892Q(View view) {
        ((gpo0) ((LiveMenuDialogHolder) this).b).m15204U4(this.f14194t.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m15893R(View view) {
        ((gpo0) ((LiveMenuDialogHolder) this).b).m15204U4(this.f14193s.userId);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15894C0() {
        return ((gpo0) ((LiveMenuDialogHolder) this).b).act();
    }

    /* JADX INFO: renamed from: K */
    public final void m15895K(View view) {
        ino0.a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final SpannableStringBuilder m15897M(String str) {
        String strU = w8u.u(u6n.a() ? R.string.qg : R.string.pg, " " + str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strU);
        int iIndexOf = strU.indexOf(str);
        if (iIndexOf == -1) {
            return spannableStringBuilder;
        }
        Drawable drawableB = kvc0.b(u6n.a() ? i3c0.ua : i3c0.ja);
        drawableB.setBounds(0, 0, t100.d(18.0f), t100.d(18.0f));
        spannableStringBuilder.setSpan(new ImageSpan(drawableB), iIndexOf - 1, iIndexOf, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#e91e1e")), iIndexOf, str.length() + iIndexOf, 17);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: S */
    public final void m15898S(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        hxs.s("context_single_room", this.f14186l, bLiveVoiceSweetCpRecommendUser.userAvatar);
        String strConcat = bLiveVoiceSweetCpRecommendUser.nickName;
        if (strConcat.length() > 9) {
            strConcat = strConcat.substring(0, 9).concat("...");
        }
        this.f14187m.setText(w8u.u(R.string.mh, strConcat));
        this.f14188n.setText(m15897M(str));
        this.f14189o.m8701b(null, bLiveVoiceCpHouseInfo.houseImage, "LV." + bLiveVoiceCpHouseInfo.houseRank + bLiveVoiceCpHouseInfo.houseName, bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceSweetCpRecommendUser.userAvatar);
    }

    /* JADX INFO: renamed from: T */
    public void m15899T(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        String strUb = ypv.m25490k().ub();
        if (TextUtils.isEmpty(strUb)) {
            return;
        }
        this.f14193s = bLiveVoiceSweetCpRecommendUser;
        this.f14194t = bLiveVoiceCpHouseInfo;
        E();
        m15898S(bLiveVoiceSweetCpRecommendUser, bLiveVoiceCpHouseInfo, strUb);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m15901m(View view) {
        super.m(view);
        m15895K(view);
        xdl0.E0(this.f14191q, new View.OnClickListener() { // from class: l.cno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10712a.m15889N(view2);
            }
        });
        xdl0.E0(this.f14192r, new View.OnClickListener() { // from class: l.dno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11921a.m15890O(view2);
            }
        });
        xdl0.E0(this.f14186l, new View.OnClickListener() { // from class: l.eno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12626a.m15891P(view2);
            }
        });
        xdl0.E0(this.f14189o.f7140e, new View.OnClickListener() { // from class: l.fno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13109a.m15892Q(view2);
            }
        });
        xdl0.E0(this.f14189o.f7142g, new View.OnClickListener() { // from class: l.gno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13648a.m15893R(view2);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m15902n(gpo0 gpo0Var) {
    }
}
