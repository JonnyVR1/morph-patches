package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.live.base.data.BLiveDirectionTags;
import com.p051p1.mobile.putong.live.base.data.BLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.p051p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bwp;
import p153l.fc2;
import p153l.fn2;
import p153l.irn;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.l9c0;
import p153l.mbc0;
import p153l.n3d0;
import p153l.qa00;
import p153l.qim;
import p153l.qnp0;
import p153l.wlj;
import p153l.xlj;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceSquareThemeBFeedCardView extends ConstraintLayout {
    public VDraweeView _avatar;
    public LiveIntlSquareFrameView _frame_view;
    public VText _location;
    public VLinear _member_container;
    public VText _member_count;
    public VLinear _tag;
    public FrameLayout _tag_container;
    public VDraweeView _tag_icon;
    public TextView _tag_text;
    public VText _title;
    public VDraweeView left_top_tag;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.card.cardmodel.feed.VoiceSquareThemeBFeedCardView$a */
    public class C11591a extends fn2 {
        public C11591a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            bnl0.m105507D0((int) (VoiceSquareThemeBFeedCardView.this.left_top_tag.getHeight() * ((qimVar.getWidth() * 1.0f) / qimVar.getHeight())), VoiceSquareThemeBFeedCardView.this.left_top_tag);
        }
    }

    public VoiceSquareThemeBFeedCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    private String m68666i0(String str) {
        return Integer.valueOf(str).intValue() >= 1000 ? "+999" : str;
    }

    /* JADX INFO: renamed from: k0 */
    private void m68667k0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        if (list.isEmpty()) {
            return;
        }
        izs.m142871v("context_common", this._avatar, list.get(0).avatar, qa00.m175859d(176.0f), qa00.m175859d(176.0f), false, false, irn.m141839a(), null);
    }

    /* JADX INFO: renamed from: l0 */
    private void m68668l0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, BLiveFrame bLiveFrame) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveVoiceRoomFeed.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            bnl0.m105524M(this._frame_view, false);
        } else if (bLiveFrame == null) {
            bnl0.m105524M(this._frame_view, false);
        } else {
            m68669m0(bLiveFrame.framePicUrl, bLiveFrame.frameSvgUrl);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m68669m0(String str, String str2) {
        this._frame_view.m69919c(str, str2);
    }

    /* JADX INFO: renamed from: n0 */
    private void m68670n0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, boolean z) {
        bnl0.m105524M(this._location, z);
        if (z) {
            Region region = bLiveVoiceRoomFeed.anchorLocation.region;
            String str = region.city;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            VText vText = this._location;
            if (zIsEmpty) {
                vText.setText(region.country);
            } else {
                vText.setText(str);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    private void m68671o0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._member_container.removeAllViews();
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        int iMin = Math.min(3, list.size());
        int i = 0;
        while (i < iMin) {
            BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = list.get(i);
            if (bLiveVoiceMemberAvatar.isOnCall) {
                this._member_container.addView(m68675h0(bLiveVoiceMemberAvatar, i == 0 ? 0 : -qa00.m175859d(5.0f)));
            }
            i++;
        }
        this._member_count.setText(m68666i0(bLiveVoiceRoomFeed.memberCount));
        bnl0.m105524M(this._member_count, list.size() > 0);
    }

    /* JADX INFO: renamed from: p0 */
    private void m68672p0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        bnl0.m105524M(this._tag_container, false);
        BLiveDirectionTags bLiveDirectionTags = bLiveVoiceRoomFeed.liveAttributeTags;
        if (bLiveDirectionTags == null) {
            return;
        }
        boolean zM147479J = jyb.m147479J(bLiveDirectionTags.topTags);
        bnl0.m105524M(this._tag_container, !zM147479J);
        if (!zM147479J) {
            BLiveVoiceTag bLiveVoiceTag = bLiveDirectionTags.topTags.get(0);
            this._tag_text.setText(bLiveVoiceTag.text);
            bnl0.m105524M(this._tag_icon, !TextUtils.isEmpty(bLiveVoiceTag.url));
            if (!TextUtils.isEmpty(bLiveVoiceTag.url)) {
                izs.m142868s("context_square", this._tag_icon, bLiveVoiceTag.url);
            }
            this._tag.setBackground(fc2.m124975e(new int[]{TextUtils.isEmpty(bLiveVoiceTag.startColor) ? l9c0.f130594g : Color.parseColor(bLiveVoiceTag.startColor), TextUtils.isEmpty(bLiveVoiceTag.endColor) ? l9c0.f130594g : Color.parseColor(bLiveVoiceTag.endColor)}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.f156320g, false));
        }
        List<BLiveVoiceTag> list = bLiveDirectionTags.leftTopTags;
        boolean zM147479J2 = jyb.m147479J(list);
        VDraweeView vDraweeView = this.left_top_tag;
        if (zM147479J2) {
            bnl0.m105524M(vDraweeView, false);
        } else {
            bnl0.m105524M(vDraweeView, true);
            izs.m142872w("context_square", this.left_top_tag, list.get(0).url, new C11591a());
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m68673q0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._title.setText(bLiveVoiceRoomFeed.roomTitle);
    }

    /* JADX INFO: renamed from: r */
    private void m68674r() {
        qnp0.m177260c1(this, 0, 0, 0, 0, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: h0 */
    public final View m68675h0(BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar, int i) {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        wlj wljVarM211638a = new xlj(getResources()).m211638a();
        wljVarM211638a.m207045H(RoundingParams.m8301a());
        wljVarM211638a.m207065z(mbc0.f135660T);
        vDraweeView.setHierarchy(wljVarM211638a);
        int i2 = qa00.f156327n;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(i);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(vDraweeView);
        int i3 = qa00.f156314a;
        frameLayout.setPadding(i3, i3, i3, i3);
        frameLayout.setBackground(fc2.m124978h(n3d0.m161277a(l9c0.f130595h)));
        izs.m142871v("context_common", vDraweeView, bLiveVoiceMemberAvatar.avatar, i2, i2, true, false, irn.m141839a(), null);
        return frameLayout;
    }

    /* JADX INFO: renamed from: j0 */
    public void m68676j0() {
        LiveIntlSquareFrameView liveIntlSquareFrameView = this._frame_view;
        if (liveIntlSquareFrameView != null) {
            bnl0.m105524M(liveIntlSquareFrameView, false);
            this._frame_view.m69920d();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._frame_view = (LiveIntlSquareFrameView) findViewById(jdc0.f120150N);
        this._avatar = (VDraweeView) findViewById(jdc0.f120203j);
        this._title = (VText) findViewById(jdc0.f120175Z0);
        this._tag_container = (FrameLayout) findViewById(jdc0.f120153O0);
        this._tag = (VLinear) findViewById(jdc0.f120151N0);
        this._tag_icon = (VDraweeView) findViewById(jdc0.f120155P0);
        this._tag_text = (TextView) findViewById(jdc0.f120157Q0);
        this._member_count = (VText) findViewById(jdc0.f120213m0);
        this._location = (VText) findViewById(jdc0.f120201i0);
        this._member_container = (VLinear) findViewById(jdc0.f120210l0);
        this.left_top_tag = (VDraweeView) findViewById(jdc0.f120177a0);
        m68674r();
    }

    /* JADX INFO: renamed from: r0 */
    public void m68677r0(bwp bwpVar) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM106730c = bwpVar.m106730c();
        m68667k0(bwpVar.m106731d(), bLiveVoiceRoomFeedM106730c);
        m68673q0(bLiveVoiceRoomFeedM106730c);
        m68671o0(bLiveVoiceRoomFeedM106730c);
        m68672p0(bLiveVoiceRoomFeedM106730c);
        m68670n0(bLiveVoiceRoomFeedM106730c, bwpVar.m106734g());
        m68668l0(bLiveVoiceRoomFeedM106730c, bwpVar.m106729b());
    }

    public VoiceSquareThemeBFeedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSquareThemeBFeedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
