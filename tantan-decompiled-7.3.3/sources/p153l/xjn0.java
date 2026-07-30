package p153l;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class xjn0 implements iam<qjn0> {

    /* JADX INFO: renamed from: a */
    public View f194610a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f194611b;

    /* JADX INFO: renamed from: c */
    public ImageView f194612c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f194613d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f194614e;

    /* JADX INFO: renamed from: f */
    public VText f194615f;

    /* JADX INFO: renamed from: g */
    public VoiceGiftWallLightItemView f194616g;

    /* JADX INFO: renamed from: h */
    public VoiceGiftWallLightItemView f194617h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f194618i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f194619j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f194620k;

    /* JADX INFO: renamed from: l */
    public VText f194621l;

    /* JADX INFO: renamed from: m */
    public VText f194622m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f194623n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f194624o;

    /* JADX INFO: renamed from: p */
    public VText f194625p;

    /* JADX INFO: renamed from: q */
    public TextView f194626q;

    /* JADX INFO: renamed from: r */
    public TextView f194627r;

    /* JADX INFO: renamed from: s */
    public qjn0 f194628s;

    /* JADX INFO: renamed from: t */
    public c0s f194629t;

    /* JADX INFO: renamed from: u */
    public BLiveVoiceGiftWallBookInfo f194630u;

    /* JADX INFO: renamed from: v */
    public BLiveVoiceGiftWallBrief f194631v;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m211242d(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m211245m(View view) {
        m211254l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m211246n(View view) {
        m211254l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m211247p(View view) {
        if (NullChecker.m82486a(this.f194631v) && NullChecker.m82486a(this.f194630u)) {
            this.f194628s.m176841P3(this.f194630u.giftId, this.f194631v.userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m211248q(View view) {
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = this.f194630u;
        if (bLiveVoiceGiftWallBookInfo == null || TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.firstLightUserId)) {
            return;
        }
        this.f194628s.m176842R3(this.f194630u.firstLightUserId);
    }

    /* JADX INFO: renamed from: r */
    private void m211249r() {
        if (this.f194629t == null) {
            this.f194629t = new c0s(this.f194628s, m211251i(LayoutInflater.from(this.f194628s.act()), null));
            bnl0.m105509E0(this.f194612c, new View.OnClickListener() { // from class: l.rjn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163492a.m211245m(view);
                }
            });
            bnl0.m105509E0(this.f194610a, new View.OnClickListener() { // from class: l.sjn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169129a.m211246n(view);
                }
            });
            bnl0.m105509E0(this.f194626q, new View.OnClickListener() { // from class: l.tjn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f174599a.m211247p(view);
                }
            });
            bnl0.m105509E0(this.f194616g.f54013b, new View.OnClickListener() { // from class: l.ujn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f179303a.m211248q(view);
                }
            });
            bnl0.m105509E0(this.f194617h.f54013b, new View.OnClickListener() { // from class: l.vjn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f184431a.m211250s(view);
                }
            });
            bnl0.m105509E0(this.f194611b, new View.OnClickListener() { // from class: l.wjn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xjn0.m211242d(view);
                }
            });
            izs.m142870u("context_livingAct", this.f194623n, zft.f204225t, qa00.m175859d(140.0f), qa00.m175859d(140.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m211250s(View view) {
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = this.f194630u;
        if (bLiveVoiceGiftWallBookInfo == null || TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.mostGiveUserId)) {
            return;
        }
        this.f194628s.m176842R3(this.f194630u.mostGiveUserId);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f194628s.act();
    }

    /* JADX INFO: renamed from: i */
    public View m211251i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yjn0.m216416b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qjn0 qjn0Var) {
        this.f194628s = qjn0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m211253k(boolean z) {
        bnl0.m105524M(this.f194613d, z);
        bnl0.m105524M(this.f194618i, !z);
    }

    /* JADX INFO: renamed from: l */
    public void m211254l() {
        c0s c0sVar = this.f194629t;
        if (c0sVar == null || !c0sVar.isShowing()) {
            return;
        }
        this.f194629t.dismiss();
    }

    /* JADX INFO: renamed from: u */
    public final void m211255u(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
        izs.m142868s("context_single_room", this.f194614e, bLiveVoiceGiftWallBookInfo.giftImage);
        this.f194615f.setText(bLiveVoiceGiftWallBookInfo.giftTitle);
        String str = bLiveVoiceGiftWallBookInfo.firstLightUserId;
        String str2 = bLiveVoiceGiftWallBookInfo.mostGiveUserId;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VoiceGiftWallLightItemView voiceGiftWallLightItemView = this.f194616g;
        if (zIsEmpty) {
            bnl0.m105524M(voiceGiftWallLightItemView, false);
        } else {
            voiceGiftWallLightItemView.m79350b(bLiveVoiceGiftWallBookInfo, 0);
            bnl0.m105524M(this.f194616g, true);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        VoiceGiftWallLightItemView voiceGiftWallLightItemView2 = this.f194617h;
        if (zIsEmpty2) {
            bnl0.m105524M(voiceGiftWallLightItemView2, false);
        } else {
            voiceGiftWallLightItemView2.m79350b(bLiveVoiceGiftWallBookInfo, 1);
            bnl0.m105524M(this.f194617h, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m211256v(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f194626q.setEnabled(bLiveVoiceGiftWallBookInfo.canLight);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f194620k.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        izs.m142868s("context_single_room", this.f194620k, bLiveVoiceGiftWallBookInfo.giftImage);
        this.f194621l.setText(bLiveVoiceGiftWallBookInfo.giftTitle);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.giftPrice);
        VText vText = this.f194622m;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f194622m.setText(xau.m209911u(u8n.m195065a() ? R$string.f48349re : R$string.f48239me, bLiveVoiceGiftWallBookInfo.giftPrice));
        }
        this.f194627r.setText(bLiveVoiceGiftWallBookInfo.noLightReason);
        this.f194626q.setTextColor(bLiveVoiceGiftWallBookInfo.canLight ? j26.m143190c(zrv.f205803e, n9c0.f140823e1) : j26.m143190c(zrv.f205803e, n9c0.f140844l1));
        if (NullChecker.m82486a(bLiveVoiceGiftWallBrief)) {
            izs.m142868s("context_single_room", this.f194624o, bLiveVoiceGiftWallBrief.userAvatar);
            this.f194625p.setText(bLiveVoiceGiftWallBrief.userName);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m211257w(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f194630u = bLiveVoiceGiftWallBookInfo;
        this.f194631v = bLiveVoiceGiftWallBrief;
        m211253k(bLiveVoiceGiftWallBookInfo.isLight);
        if (bLiveVoiceGiftWallBookInfo.isLight) {
            m211255u(bLiveVoiceGiftWallBookInfo);
        } else {
            m211256v(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m211258x(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        m211249r();
        m211257w(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
        c0s c0sVar = this.f194629t;
        if (c0sVar == null || c0sVar.isShowing()) {
            return;
        }
        this.f194629t.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
