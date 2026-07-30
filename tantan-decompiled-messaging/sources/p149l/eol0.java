package p149l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class eol0 extends LiveMenuDialogHolder<bol0> {

    /* JADX INFO: renamed from: k */
    public View f92458k;

    /* JADX INFO: renamed from: l */
    public TextView f92459l;

    /* JADX INFO: renamed from: m */
    public View f92460m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f92461n;

    /* JADX INFO: renamed from: o */
    public TextView f92462o;

    /* JADX INFO: renamed from: p */
    public VLinear f92463p;

    /* JADX INFO: renamed from: q */
    public VText f92464q;

    /* JADX INFO: renamed from: r */
    public VLinear f92465r;

    /* JADX INFO: renamed from: s */
    public VButton f92466s;

    /* JADX INFO: renamed from: t */
    public View f92467t;

    /* JADX INFO: renamed from: u */
    public VButton f92468u;

    /* JADX INFO: renamed from: v */
    public BLiveVoicePayGuideUser f92469v;

    public eol0(bol0 bol0Var) {
        super(t6c0.f168002D6, bol0Var.act(), bol0Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m117363I(View view) {
        mo71838p();
        zvf0.m220399u("e_audio_add_apply_button", fbp0.m120390f(((nnn0) ((bol0) this.f47757b).m206027E2()).mo97490p()), vwb.m200311Y("anchorId", ((nnn0) ((bol0) this.f47757b).m206027E2()).m132140j0()), vwb.m200311Y("roomId", ((nnn0) ((bol0) this.f47757b).m206027E2()).m149818o()), vwb.m200311Y("liveId", ((nnn0) ((bol0) this.f47757b).m206027E2()).m149814k()), vwb.m200311Y("other_user_id", this.f92469v.userId), vwb.m200311Y("button_type", "ignore"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m117364J(View view) {
        ((bol0) this.f47757b).m102952W3(this.f92469v);
    }

    /* JADX INFO: renamed from: H */
    public final void m117365H(View view) {
        fol0.m122459a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public void m117366K(BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        this.f92469v = bLiveVoicePayGuideUser;
        CommonMaskAvatarView commonMaskAvatarView = this.f92461n;
        int iM186890d = t100.m186890d(98.0f);
        String str = bLiveVoicePayGuideUser.avatar;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = bLiveVoicePayGuideUser.avatarFrame;
        agv.m96350h(commonMaskAvatarView, iM186890d, null, str, bLiveVoiceMedalWallItemHeaderUrl.staticUrl, bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl);
        this.f92462o.setText(bLiveVoicePayGuideUser.userName);
        m117367L(bLiveVoicePayGuideUser);
        this.f92464q.setText(String.format("%s送你诚意礼物，申请加你好友\n同意即可配对", TextUtils.equals(bLiveVoicePayGuideUser.gender, "male") ? "他" : "她"));
    }

    /* JADX INFO: renamed from: L */
    public final void m117367L(BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        BLiveUserLevel bLiveUserLevelM126036v;
        this.f92463p.removeAllViews();
        if (bLiveVoicePayGuideUser.age > 0) {
            TextView textView = new TextView(this.f92463p.getContext());
            textView.setTextSize(9.0f);
            textView.setTextColor(-1);
            textView.setGravity(16);
            textView.setPadding(t100.m186890d(2.0f), 0, t100.m186890d(4.0f), 0);
            Resources resources = this.f92463p.getContext().getResources();
            textView.setBackground(fce.m120425b(TextUtils.equals(bLiveVoicePayGuideUser.gender, "male") ? resources.getColor(h1c0.f105356c1) : resources.getColor(h1c0.f105353b1), t100.m186890d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(TextUtils.equals(bLiveVoicePayGuideUser.gender, "male") ? i3c0.f110996ea : i3c0.f110984da), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setText(String.valueOf(bLiveVoicePayGuideUser.age));
            this.f92463p.addView(textView, new ViewGroup.LayoutParams(xdl0.f192404f, t100.m186890d(14.0f)));
        }
        if (!TextUtils.isEmpty(bLiveVoicePayGuideUser.zodiac)) {
            ProfileZodiac profileZodiac = ProfileZodiac.get(bLiveVoicePayGuideUser.zodiac);
            Drawable drawableM120425b = fce.m120425b(i0g0.m133871l0(profileZodiac), t100.m186890d(4.0f));
            TextView textView2 = new TextView(this.f92463p.getContext());
            textView2.setBackground(drawableM120425b);
            textView2.setTextSize(9.0f);
            textView2.setTextColor(-1);
            textView2.setPadding(t100.m186890d(4.0f), 0, t100.m186890d(4.0f), 0);
            textView2.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.f192404f, t100.m186890d(14.0f));
            layoutParams.leftMargin = t100.m186890d(4.0f);
            textView2.setText(i0g0.m133869j0(profileZodiac));
            this.f92463p.addView(textView2, layoutParams);
        }
        if (bLiveVoicePayGuideUser.grade <= 0 || (bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveVoicePayGuideUser.grade)) == null || TextUtils.isEmpty(bLiveUserLevelM126036v.backendUrl)) {
            return;
        }
        VDraweeView vDraweeView = new VDraweeView(this.f92463p.getContext());
        int i = sxj.f166797a;
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.m186890d(4.0f));
        vDraweeView.getHierarchy().m112053H(roundingParams);
        sxj.m186442c(bLiveUserLevelM126036v.backendUrl, vDraweeView, i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(t100.m186890d(30.0f), t100.m186890d(14.0f));
        layoutParams2.leftMargin = t100.m186890d(4.0f);
        this.f92463p.addView(vDraweeView, layoutParams2);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m117365H(view);
        xdl0.m208329E0(this.f92466s, new View.OnClickListener() { // from class: l.col0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81847a.m117363I(view2);
            }
        });
        xdl0.m208329E0(this.f92468u, new View.OnClickListener() { // from class: l.dol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f87180a.m117364J(view2);
            }
        });
    }
}
