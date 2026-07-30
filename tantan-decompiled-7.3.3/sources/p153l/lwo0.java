package p153l;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lwo0 extends LiveMenuDialogHolder<kyo0> {

    /* JADX INFO: renamed from: k */
    public View f133833k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f133834l;

    /* JADX INFO: renamed from: m */
    public VText f133835m;

    /* JADX INFO: renamed from: n */
    public VText f133836n;

    /* JADX INFO: renamed from: o */
    public VoiceSweetCpHeadView f133837o;

    /* JADX INFO: renamed from: p */
    public View f133838p;

    /* JADX INFO: renamed from: q */
    public VText f133839q;

    /* JADX INFO: renamed from: r */
    public VText f133840r;

    /* JADX INFO: renamed from: s */
    public BLiveVoiceSweetCpRecommendUser f133841s;

    /* JADX INFO: renamed from: t */
    public BLiveVoiceCpHouseInfo f133842t;

    public lwo0(Act act, kyo0 kyo0Var) {
        super(yec0.f199183na, act, kyo0Var, qag0.m175923d(0.35f, true));
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m156078N(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m156079O(View view) {
        mo73021p();
        ((kyo0) this.f48605b).m152117q4(this.f133841s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m156080P(View view) {
        ((kyo0) this.f48605b).m152110U4(this.f133841s.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m156081Q(View view) {
        ((kyo0) this.f48605b).m152110U4(this.f133842t.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m156082R(View view) {
        ((kyo0) this.f48605b).m152110U4(this.f133841s.userId);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((kyo0) this.f48605b).act();
    }

    /* JADX INFO: renamed from: K */
    public final void m156083K(View view) {
        mwo0.m160578a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final SpannableStringBuilder m156085M(String str) {
        String strM209911u = xau.m209911u(u8n.m195065a() ? R$string.f48329qg : R$string.f48307pg, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM209911u);
        int iIndexOf = strM209911u.indexOf(str);
        if (iIndexOf == -1) {
            return spannableStringBuilder;
        }
        Drawable drawableM161278b = n3d0.m161278b(u8n.m195065a() ? obc0.f146516ua : obc0.f146384ja);
        drawableM161278b.setBounds(0, 0, qa00.m175859d(18.0f), qa00.m175859d(18.0f));
        spannableStringBuilder.setSpan(new ImageSpan(drawableM161278b), iIndexOf - 1, iIndexOf, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#e91e1e")), iIndexOf, str.length() + iIndexOf, 17);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: S */
    public final void m156086S(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        izs.m142868s("context_single_room", this.f133834l, bLiveVoiceSweetCpRecommendUser.userAvatar);
        String strConcat = bLiveVoiceSweetCpRecommendUser.nickName;
        if (strConcat.length() > 9) {
            strConcat = strConcat.substring(0, 9).concat("...");
        }
        this.f133835m.setText(xau.m209911u(R$string.f48242mh, strConcat));
        this.f133836n.setText(m156085M(str));
        this.f133837o.m79675b(null, bLiveVoiceCpHouseInfo.houseImage, "LV." + bLiveVoiceCpHouseInfo.houseRank + bLiveVoiceCpHouseInfo.houseName, bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceSweetCpRecommendUser.userAvatar);
    }

    /* JADX INFO: renamed from: T */
    public void m156087T(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        String strM203750ub = zrv.m221193k().m203750ub();
        if (TextUtils.isEmpty(strM203750ub)) {
            return;
        }
        this.f133841s = bLiveVoiceSweetCpRecommendUser;
        this.f133842t = bLiveVoiceCpHouseInfo;
        m73017E();
        m156086S(bLiveVoiceSweetCpRecommendUser, bLiveVoiceCpHouseInfo, strM203750ub);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m156083K(view);
        bnl0.m105509E0(this.f133839q, new View.OnClickListener() { // from class: l.gwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f106858a.m156078N(view2);
            }
        });
        bnl0.m105509E0(this.f133840r, new View.OnClickListener() { // from class: l.hwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f111906a.m156079O(view2);
            }
        });
        bnl0.m105509E0(this.f133834l, new View.OnClickListener() { // from class: l.iwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117286a.m156080P(view2);
            }
        });
        bnl0.m105509E0(this.f133837o.f54382e, new View.OnClickListener() { // from class: l.jwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f122948a.m156081Q(view2);
            }
        });
        bnl0.m105509E0(this.f133837o.f54384g, new View.OnClickListener() { // from class: l.kwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f129084a.m156082R(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kyo0 kyo0Var) {
    }
}
