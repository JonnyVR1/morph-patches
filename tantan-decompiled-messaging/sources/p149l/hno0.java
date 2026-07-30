package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class hno0 extends LiveMenuDialogHolder<gpo0> {

    /* JADX INFO: renamed from: k */
    public View f108651k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f108652l;

    /* JADX INFO: renamed from: m */
    public VText f108653m;

    /* JADX INFO: renamed from: n */
    public VText f108654n;

    /* JADX INFO: renamed from: o */
    public VoiceSweetCpHeadView f108655o;

    /* JADX INFO: renamed from: p */
    public View f108656p;

    /* JADX INFO: renamed from: q */
    public VText f108657q;

    /* JADX INFO: renamed from: r */
    public VText f108658r;

    /* JADX INFO: renamed from: s */
    public BLiveVoiceSweetCpRecommendUser f108659s;

    /* JADX INFO: renamed from: t */
    public BLiveVoiceCpHouseInfo f108660t;

    public hno0(Act act, gpo0 gpo0Var) {
        super(t6c0.f168451na, act, gpo0Var, j2g0.m139457d(0.35f, true));
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m131963N(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m131964O(View view) {
        mo71838p();
        ((gpo0) this.f47757b).m127470q4(this.f108659s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m131965P(View view) {
        ((gpo0) this.f47757b).m127463U4(this.f108659s.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m131966Q(View view) {
        ((gpo0) this.f47757b).m127463U4(this.f108660t.userId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m131967R(View view) {
        ((gpo0) this.f47757b).m127463U4(this.f108659s.userId);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((gpo0) this.f47757b).act();
    }

    /* JADX INFO: renamed from: K */
    public final void m131968K(View view) {
        ino0.m137148a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final SpannableStringBuilder m131970M(String str) {
        String strM202218u = w8u.m202218u(u6n.m192015a() ? R$string.f47481qg : R$string.f47459pg, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM202218u);
        int iIndexOf = strM202218u.indexOf(str);
        if (iIndexOf == -1) {
            return spannableStringBuilder;
        }
        Drawable drawableM147353b = kvc0.m147353b(u6n.m192015a() ? i3c0.f111188ua : i3c0.f111056ja);
        drawableM147353b.setBounds(0, 0, t100.m186890d(18.0f), t100.m186890d(18.0f));
        spannableStringBuilder.setSpan(new ImageSpan(drawableM147353b), iIndexOf - 1, iIndexOf, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#e91e1e")), iIndexOf, str.length() + iIndexOf, 17);
        spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, str.length() + iIndexOf, 17);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: S */
    public final void m131971S(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, String str) {
        hxs.m133406s("context_single_room", this.f108652l, bLiveVoiceSweetCpRecommendUser.userAvatar);
        String strConcat = bLiveVoiceSweetCpRecommendUser.nickName;
        if (strConcat.length() > 9) {
            strConcat = strConcat.substring(0, 9).concat("...");
        }
        this.f108653m.setText(w8u.m202218u(R$string.f47394mh, strConcat));
        this.f108654n.setText(m131970M(str));
        this.f108655o.m78492b(null, bLiveVoiceCpHouseInfo.houseImage, "LV." + bLiveVoiceCpHouseInfo.houseRank + bLiveVoiceCpHouseInfo.houseName, bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceSweetCpRecommendUser.userAvatar);
    }

    /* JADX INFO: renamed from: T */
    public void m131972T(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        String strM195963ub = ypv.m215672k().m195963ub();
        if (TextUtils.isEmpty(strM195963ub)) {
            return;
        }
        this.f108659s = bLiveVoiceSweetCpRecommendUser;
        this.f108660t = bLiveVoiceCpHouseInfo;
        m71834E();
        m131971S(bLiveVoiceSweetCpRecommendUser, bLiveVoiceCpHouseInfo, strM195963ub);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m131968K(view);
        xdl0.m208329E0(this.f108657q, new View.OnClickListener() { // from class: l.cno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81679a.m131963N(view2);
            }
        });
        xdl0.m208329E0(this.f108658r, new View.OnClickListener() { // from class: l.dno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f87088a.m131964O(view2);
            }
        });
        xdl0.m208329E0(this.f108652l, new View.OnClickListener() { // from class: l.eno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f92331a.m131965P(view2);
            }
        });
        xdl0.m208329E0(this.f108655o.f53534e, new View.OnClickListener() { // from class: l.fno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98439a.m131966Q(view2);
            }
        });
        xdl0.m208329E0(this.f108655o.f53536g, new View.OnClickListener() { // from class: l.gno0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f103612a.m131967R(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gpo0 gpo0Var) {
    }
}
