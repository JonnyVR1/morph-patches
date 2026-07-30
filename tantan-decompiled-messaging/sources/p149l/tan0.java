package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.detail.VoiceGiftWallLightItemView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class tan0 implements s7m<man0> {

    /* JADX INFO: renamed from: a */
    public View f169151a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f169152b;

    /* JADX INFO: renamed from: c */
    public ImageView f169153c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f169154d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f169155e;

    /* JADX INFO: renamed from: f */
    public VText f169156f;

    /* JADX INFO: renamed from: g */
    public VoiceGiftWallLightItemView f169157g;

    /* JADX INFO: renamed from: h */
    public VoiceGiftWallLightItemView f169158h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f169159i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f169160j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f169161k;

    /* JADX INFO: renamed from: l */
    public VText f169162l;

    /* JADX INFO: renamed from: m */
    public VText f169163m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f169164n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f169165o;

    /* JADX INFO: renamed from: p */
    public VText f169166p;

    /* JADX INFO: renamed from: q */
    public TextView f169167q;

    /* JADX INFO: renamed from: r */
    public TextView f169168r;

    /* JADX INFO: renamed from: s */
    public man0 f169169s;

    /* JADX INFO: renamed from: t */
    public byr f169170t;

    /* JADX INFO: renamed from: u */
    public BLiveVoiceGiftWallBookInfo f169171u;

    /* JADX INFO: renamed from: v */
    public BLiveVoiceGiftWallBrief f169172v;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m187749d(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m187752m(View view) {
        m187761l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m187753n(View view) {
        m187761l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m187754p(View view) {
        if (NullChecker.m81303a(this.f169172v) && NullChecker.m81303a(this.f169171u)) {
            this.f169169s.m153828P3(this.f169171u.giftId, this.f169172v.userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m187755q(View view) {
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = this.f169171u;
        if (bLiveVoiceGiftWallBookInfo == null || TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.firstLightUserId)) {
            return;
        }
        this.f169169s.m153829R3(this.f169171u.firstLightUserId);
    }

    /* JADX INFO: renamed from: r */
    private void m187756r() {
        if (this.f169170t == null) {
            this.f169170t = new byr(this.f169169s, m187758i(LayoutInflater.from(this.f169169s.act()), null));
            xdl0.m208329E0(this.f169153c, new View.OnClickListener() { // from class: l.nan0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137923a.m187752m(view);
                }
            });
            xdl0.m208329E0(this.f169151a, new View.OnClickListener() { // from class: l.oan0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142853a.m187753n(view);
                }
            });
            xdl0.m208329E0(this.f169167q, new View.OnClickListener() { // from class: l.pan0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147992a.m187754p(view);
                }
            });
            xdl0.m208329E0(this.f169157g.f53165b, new View.OnClickListener() { // from class: l.qan0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153546a.m187755q(view);
                }
            });
            xdl0.m208329E0(this.f169158h.f53165b, new View.OnClickListener() { // from class: l.ran0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158544a.m187757s(view);
                }
            });
            xdl0.m208329E0(this.f169152b, new View.OnClickListener() { // from class: l.san0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tan0.m187749d(view);
                }
            });
            hxs.m133408u("context_livingAct", this.f169164n, ydt.f197630t, t100.m186890d(140.0f), t100.m186890d(140.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m187757s(View view) {
        BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo = this.f169171u;
        if (bLiveVoiceGiftWallBookInfo == null || TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.mostGiveUserId)) {
            return;
        }
        this.f169169s.m153829R3(this.f169171u.mostGiveUserId);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f169169s.act();
    }

    /* JADX INFO: renamed from: i */
    public View m187758i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uan0.m192792b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(man0 man0Var) {
        this.f169169s = man0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m187760k(boolean z) {
        xdl0.m208344M(this.f169154d, z);
        xdl0.m208344M(this.f169159i, !z);
    }

    /* JADX INFO: renamed from: l */
    public void m187761l() {
        byr byrVar = this.f169170t;
        if (byrVar == null || !byrVar.isShowing()) {
            return;
        }
        this.f169170t.dismiss();
    }

    /* JADX INFO: renamed from: u */
    public final void m187762u(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo) {
        hxs.m133406s("context_single_room", this.f169155e, bLiveVoiceGiftWallBookInfo.giftImage);
        this.f169156f.setText(bLiveVoiceGiftWallBookInfo.giftTitle);
        String str = bLiveVoiceGiftWallBookInfo.firstLightUserId;
        String str2 = bLiveVoiceGiftWallBookInfo.mostGiveUserId;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VoiceGiftWallLightItemView voiceGiftWallLightItemView = this.f169157g;
        if (zIsEmpty) {
            xdl0.m208344M(voiceGiftWallLightItemView, false);
        } else {
            voiceGiftWallLightItemView.m78167b(bLiveVoiceGiftWallBookInfo, 0);
            xdl0.m208344M(this.f169157g, true);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        VoiceGiftWallLightItemView voiceGiftWallLightItemView2 = this.f169158h;
        if (zIsEmpty2) {
            xdl0.m208344M(voiceGiftWallLightItemView2, false);
        } else {
            voiceGiftWallLightItemView2.m78167b(bLiveVoiceGiftWallBookInfo, 1);
            xdl0.m208344M(this.f169158h, true);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m187763v(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f169167q.setEnabled(bLiveVoiceGiftWallBookInfo.canLight);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f169161k.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        hxs.m133406s("context_single_room", this.f169161k, bLiveVoiceGiftWallBookInfo.giftImage);
        this.f169162l.setText(bLiveVoiceGiftWallBookInfo.giftTitle);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceGiftWallBookInfo.giftPrice);
        VText vText = this.f169163m;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f169163m.setText(w8u.m202218u(u6n.m192015a() ? R$string.f47501re : R$string.f47391me, bLiveVoiceGiftWallBookInfo.giftPrice));
        }
        this.f169168r.setText(bLiveVoiceGiftWallBookInfo.noLightReason);
        this.f169167q.setTextColor(bLiveVoiceGiftWallBookInfo.canLight ? e16.m114375c(ypv.f199497e, h1c0.f105362e1) : e16.m114375c(ypv.f199497e, h1c0.f105383l1));
        if (NullChecker.m81303a(bLiveVoiceGiftWallBrief)) {
            hxs.m133406s("context_single_room", this.f169165o, bLiveVoiceGiftWallBrief.userAvatar);
            this.f169166p.setText(bLiveVoiceGiftWallBrief.userName);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m187764w(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f169171u = bLiveVoiceGiftWallBookInfo;
        this.f169172v = bLiveVoiceGiftWallBrief;
        m187760k(bLiveVoiceGiftWallBookInfo.isLight);
        if (bLiveVoiceGiftWallBookInfo.isLight) {
            m187762u(bLiveVoiceGiftWallBookInfo);
        } else {
            m187763v(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m187765x(BLiveVoiceGiftWallBookInfo bLiveVoiceGiftWallBookInfo, BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        m187756r();
        m187764w(bLiveVoiceGiftWallBookInfo, bLiveVoiceGiftWallBrief);
        byr byrVar = this.f169170t;
        if (byrVar == null || byrVar.isShowing()) {
            return;
        }
        this.f169170t.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
