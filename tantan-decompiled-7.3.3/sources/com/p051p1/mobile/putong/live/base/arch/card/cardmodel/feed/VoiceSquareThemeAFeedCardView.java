package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveDirectionTags;
import com.p051p1.mobile.putong.live.base.data.BLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.p051p1.mobile.putong.live.base.view.LiveAvatarNumberItemView;
import com.p051p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bwp;
import p153l.f4n0;
import p153l.fc2;
import p153l.irn;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.l9c0;
import p153l.pf60;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.xau;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceSquareThemeAFeedCardView extends ConstraintLayout {
    public VDraweeView _avatar;
    public VDraweeView _avatar_1;
    public VDraweeView _avatar_2;
    public VDraweeView _avatar_3;
    public LiveAvatarNumberItemView _container_avatar_1;
    public LiveAvatarNumberItemView _container_avatar_2;
    public LiveAvatarNumberItemView _container_avatar_3;
    public LiveIntlSquareFrameView _frame_view;
    public View _inner_ring;
    public VImage _item_background;
    public VText _location;
    public VText _member_count;
    public View _middle_ring;
    public View _outer_ring;
    public VLinear _tag;
    public FrameLayout _tag_container;
    public VDraweeView _tag_icon;
    public TextView _tag_text;
    public VText _title;
    private GradientDrawable voiceCardBg;

    public VoiceSquareThemeAFeedCardView(Context context) {
        super(context);
    }

    private GradientDrawable getVoiceCardBlackThemeBg() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(qa00.m175859d(10.0f));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: o0 */
    private void m68652o0(String str, String str2) {
        this._frame_view.m69919c(str, str2);
    }

    /* JADX INFO: renamed from: r */
    private void m68653r() {
        this.voiceCardBg = getVoiceCardBlackThemeBg();
        float fM105592y0 = (bnl0.m105592y0() * 1.0f) / qa00.m175859d(375.0f);
        m68654i0(this._outer_ring, fM105592y0);
        m68654i0(this._middle_ring, fM105592y0);
        m68654i0(this._inner_ring, fM105592y0);
        m68654i0(this._avatar, fM105592y0);
        qnp0.m177260c1(this, 0, 0, 0, 0, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m68654i0(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (layoutParams.width * f);
        layoutParams.height = (int) (layoutParams.height * f);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m68655j0(String str) {
        return Integer.valueOf(str).intValue() >= 1000 ? "+999" : str;
    }

    /* JADX INFO: renamed from: k0 */
    public void m68656k0() {
        LiveIntlSquareFrameView liveIntlSquareFrameView = this._frame_view;
        if (liveIntlSquareFrameView != null) {
            bnl0.m105524M(liveIntlSquareFrameView, false);
            this._frame_view.m69920d();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m68657l0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        if (list.isEmpty()) {
            return;
        }
        BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = list.get(0);
        VDraweeView vDraweeView = this._avatar;
        String str = bLiveVoiceMemberAvatar.avatar;
        int i = qa00.f156306S;
        izs.m142871v("context_common", vDraweeView, str, i, i, false, false, irn.m141839a(), null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m68658m0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._item_background.setBackground(this.voiceCardBg);
        pf60<String, String> pf60VarM124013a = f4n0.m124013a(i);
        this.voiceCardBg.setColors(new int[]{Color.parseColor(pf60VarM124013a.f152156a), Color.parseColor(pf60VarM124013a.f152157b)});
    }

    /* JADX INFO: renamed from: n0 */
    public void m68659n0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, BLiveFrame bLiveFrame) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveVoiceRoomFeed.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            bnl0.m105524M(this._frame_view, false);
        } else if (bLiveFrame == null) {
            bnl0.m105524M(this._frame_view, false);
        } else {
            m68652o0(bLiveFrame.framePicUrl, bLiveFrame.frameSvgUrl);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._item_background = (VImage) findViewById(jdc0.f120168W);
        this._frame_view = (LiveIntlSquareFrameView) findViewById(jdc0.f120150N);
        this._outer_ring = findViewById(jdc0.f120231t0);
        this._middle_ring = findViewById(jdc0.f120219o0);
        this._inner_ring = findViewById(jdc0.f120164U);
        this._avatar = (VDraweeView) findViewById(jdc0.f120203j);
        this._title = (VText) findViewById(jdc0.f120175Z0);
        this._tag_container = (FrameLayout) findViewById(jdc0.f120153O0);
        this._tag = (VLinear) findViewById(jdc0.f120151N0);
        this._tag_icon = (VDraweeView) findViewById(jdc0.f120155P0);
        this._tag_text = (TextView) findViewById(jdc0.f120157Q0);
        this._container_avatar_1 = (LiveAvatarNumberItemView) findViewById(jdc0.f120236w);
        this._avatar_1 = (VDraweeView) findViewById(jdc0.f120206k);
        this._container_avatar_2 = (LiveAvatarNumberItemView) findViewById(jdc0.f120238x);
        this._avatar_2 = (VDraweeView) findViewById(jdc0.f120209l);
        this._container_avatar_3 = (LiveAvatarNumberItemView) findViewById(jdc0.f120240y);
        this._avatar_3 = (VDraweeView) findViewById(jdc0.f120212m);
        this._member_count = (VText) findViewById(jdc0.f120213m0);
        this._location = (VText) findViewById(jdc0.f120201i0);
        m68653r();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m68660p0(VDraweeView vDraweeView, BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar) {
        String str = bLiveVoiceMemberAvatar.avatar;
        int i = qa00.f156328o;
        izs.m142871v("context_common", vDraweeView, str, i, i, true, false, irn.m141839a(), null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m68661q0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, boolean z) {
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

    /* JADX INFO: renamed from: r0 */
    public final void m68662r0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        ArrayList arrayListM147522n = jyb.m147522n(bLiveVoiceRoomFeed.memberAvatars, new qcj() { // from class: l.cvo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceMemberAvatar) obj).isOnCall);
            }
        });
        bnl0.m105524M(this._container_avatar_1, false);
        bnl0.m105524M(this._container_avatar_2, false);
        bnl0.m105524M(this._container_avatar_3, false);
        if (arrayListM147522n.size() >= 1) {
            m68660p0(this._avatar_1, (BLiveVoiceMemberAvatar) arrayListM147522n.get(0));
            bnl0.m105524M(this._container_avatar_1, true);
        }
        if (arrayListM147522n.size() >= 2) {
            m68660p0(this._avatar_2, (BLiveVoiceMemberAvatar) arrayListM147522n.get(1));
            bnl0.m105524M(this._container_avatar_2, true);
        }
        if (arrayListM147522n.size() >= 3) {
            m68660p0(this._avatar_3, (BLiveVoiceMemberAvatar) arrayListM147522n.get(2));
            bnl0.m105524M(this._container_avatar_3, true);
        }
        this._member_count.setText(xau.m209911u(R$string.f45007d0, m68655j0(bLiveVoiceRoomFeed.memberCount)));
        bnl0.m105524M(this._member_count, arrayListM147522n.size() > 0);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m68663s0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        bnl0.m105524M(this._tag_container, false);
        BLiveDirectionTags bLiveDirectionTags = bLiveVoiceRoomFeed.liveAttributeTags;
        if (bLiveDirectionTags == null) {
            return;
        }
        boolean zM147479J = jyb.m147479J(bLiveDirectionTags.topTags);
        bnl0.m105524M(this._tag_container, !zM147479J);
        if (zM147479J) {
            return;
        }
        BLiveVoiceTag bLiveVoiceTag = bLiveDirectionTags.topTags.get(0);
        this._tag_text.setText(bLiveVoiceTag.text);
        bnl0.m105524M(this._tag_icon, !TextUtils.isEmpty(bLiveVoiceTag.url));
        if (!TextUtils.isEmpty(bLiveVoiceTag.url)) {
            izs.m142868s("context_square", this._tag_icon, bLiveVoiceTag.url);
        }
        this._tag.setBackground(fc2.m124975e(new int[]{TextUtils.isEmpty(bLiveVoiceTag.startColor) ? l9c0.f130594g : Color.parseColor(bLiveVoiceTag.startColor), TextUtils.isEmpty(bLiveVoiceTag.endColor) ? l9c0.f130594g : Color.parseColor(bLiveVoiceTag.endColor)}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.f156320g, false));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m68664t0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._title.setText(bLiveVoiceRoomFeed.roomTitle);
    }

    /* JADX INFO: renamed from: u0 */
    public void m68665u0(bwp bwpVar, int i) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM106730c = bwpVar.m106730c();
        m68658m0(i, bLiveVoiceRoomFeedM106730c);
        m68664t0(bLiveVoiceRoomFeedM106730c);
        m68657l0(bLiveVoiceRoomFeedM106730c);
        m68662r0(bLiveVoiceRoomFeedM106730c);
        m68663s0(bLiveVoiceRoomFeedM106730c);
        m68661q0(bLiveVoiceRoomFeedM106730c, bwpVar.m106734g());
        m68659n0(bLiveVoiceRoomFeedM106730c, bwpVar.m106729b());
    }

    public VoiceSquareThemeAFeedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSquareThemeAFeedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
