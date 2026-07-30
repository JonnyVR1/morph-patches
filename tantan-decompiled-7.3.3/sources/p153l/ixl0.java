package p153l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMedalWallItemHeaderUrl;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePayGuideUser;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class ixl0 extends LiveMenuDialogHolder<fxl0> {

    /* JADX INFO: renamed from: k */
    public View f117427k;

    /* JADX INFO: renamed from: l */
    public TextView f117428l;

    /* JADX INFO: renamed from: m */
    public View f117429m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f117430n;

    /* JADX INFO: renamed from: o */
    public TextView f117431o;

    /* JADX INFO: renamed from: p */
    public VLinear f117432p;

    /* JADX INFO: renamed from: q */
    public VText f117433q;

    /* JADX INFO: renamed from: r */
    public VLinear f117434r;

    /* JADX INFO: renamed from: s */
    public VButton f117435s;

    /* JADX INFO: renamed from: t */
    public View f117436t;

    /* JADX INFO: renamed from: u */
    public VButton f117437u;

    /* JADX INFO: renamed from: v */
    public BLiveVoicePayGuideUser f117438v;

    public ixl0(fxl0 fxl0Var) {
        super(yec0.f198734D6, fxl0Var.act(), fxl0Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m142533I(View view) {
        mo73021p();
        i4g0.m138523u("e_audio_add_apply_button", jkp0.m145875f(((rwn0) ((fxl0) this.f48605b).m213810E2()).mo118373p()), jyb.m147494Y("anchorId", ((rwn0) ((fxl0) this.f48605b).m213810E2()).m168526j0()), jyb.m147494Y("roomId", ((rwn0) ((fxl0) this.f48605b).m213810E2()).m202194o()), jyb.m147494Y("liveId", ((rwn0) ((fxl0) this.f48605b).m213810E2()).m202191k()), jyb.m147494Y("other_user_id", this.f117438v.userId), jyb.m147494Y("button_type", "ignore"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m142534J(View view) {
        ((fxl0) this.f48605b).m127988W3(this.f117438v);
    }

    /* JADX INFO: renamed from: H */
    public final void m142535H(View view) {
        jxl0.m147367a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public void m142536K(BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        this.f117438v = bLiveVoicePayGuideUser;
        CommonMaskAvatarView commonMaskAvatarView = this.f117430n;
        int iM175859d = qa00.m175859d(98.0f);
        String str = bLiveVoicePayGuideUser.avatar;
        BLiveVoiceMedalWallItemHeaderUrl bLiveVoiceMedalWallItemHeaderUrl = bLiveVoicePayGuideUser.avatarFrame;
        biv.m104523h(commonMaskAvatarView, iM175859d, null, str, bLiveVoiceMedalWallItemHeaderUrl.staticUrl, bLiveVoiceMedalWallItemHeaderUrl.dynamicUrl);
        this.f117431o.setText(bLiveVoicePayGuideUser.userName);
        m142537L(bLiveVoicePayGuideUser);
        this.f117433q.setText(String.format("%s送你诚意礼物，申请加你好友\n同意即可配对", TextUtils.equals(bLiveVoicePayGuideUser.gender, "male") ? "他" : "她"));
    }

    /* JADX INFO: renamed from: L */
    public final void m142537L(BLiveVoicePayGuideUser bLiveVoicePayGuideUser) {
        BLiveUserLevel bLiveUserLevelM135170v;
        this.f117432p.removeAllViews();
        if (bLiveVoicePayGuideUser.age > 0) {
            TextView textView = new TextView(this.f117432p.getContext());
            textView.setTextSize(9.0f);
            textView.setTextColor(-1);
            textView.setGravity(16);
            textView.setPadding(qa00.m175859d(2.0f), 0, qa00.m175859d(4.0f), 0);
            Resources resources = this.f117432p.getContext().getResources();
            textView.setBackground(jde.m144406b(TextUtils.equals(bLiveVoicePayGuideUser.gender, "male") ? resources.getColor(n9c0.f140817c1) : resources.getColor(n9c0.f140814b1), qa00.m175859d(4.0f)));
            textView.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(TextUtils.equals(bLiveVoicePayGuideUser.gender, "male") ? obc0.f146324ea : obc0.f146312da), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setText(String.valueOf(bLiveVoicePayGuideUser.age));
            this.f117432p.addView(textView, new ViewGroup.LayoutParams(bnl0.f77545f, qa00.m175859d(14.0f)));
        }
        if (!TextUtils.isEmpty(bLiveVoicePayGuideUser.zodiac)) {
            ProfileZodiac profileZodiac = ProfileZodiac.get(bLiveVoicePayGuideUser.zodiac);
            Drawable drawableM144406b = jde.m144406b(q8g0.m175806l0(profileZodiac), qa00.m175859d(4.0f));
            TextView textView2 = new TextView(this.f117432p.getContext());
            textView2.setBackground(drawableM144406b);
            textView2.setTextSize(9.0f);
            textView2.setTextColor(-1);
            textView2.setPadding(qa00.m175859d(4.0f), 0, qa00.m175859d(4.0f), 0);
            textView2.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(14.0f));
            layoutParams.leftMargin = qa00.m175859d(4.0f);
            textView2.setText(q8g0.m175804j0(profileZodiac));
            this.f117432p.addView(textView2, layoutParams);
        }
        if (bLiveVoicePayGuideUser.grade <= 0 || (bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveVoicePayGuideUser.grade)) == null || TextUtils.isEmpty(bLiveUserLevelM135170v.backendUrl)) {
            return;
        }
        VDraweeView vDraweeView = new VDraweeView(this.f117432p.getContext());
        int i = i0k.f112378a;
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.m175859d(4.0f));
        vDraweeView.getHierarchy().m207045H(roundingParams);
        i0k.m137976c(bLiveUserLevelM135170v.backendUrl, vDraweeView, i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qa00.m175859d(30.0f), qa00.m175859d(14.0f));
        layoutParams2.leftMargin = qa00.m175859d(4.0f);
        this.f117432p.addView(vDraweeView, layoutParams2);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m142535H(view);
        bnl0.m105509E0(this.f117435s, new View.OnClickListener() { // from class: l.gxl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f106963a.m142533I(view2);
            }
        });
        bnl0.m105509E0(this.f117437u, new View.OnClickListener() { // from class: l.hxl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f112024a.m142534J(view2);
            }
        });
    }
}
