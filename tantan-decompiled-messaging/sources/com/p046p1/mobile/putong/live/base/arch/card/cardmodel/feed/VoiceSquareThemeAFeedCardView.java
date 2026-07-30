package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

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
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveDirectionTags;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.p046p1.mobile.putong.live.base.view.LiveAvatarNumberItemView;
import com.p046p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bup;
import p149l.bvm0;
import p149l.d5c0;
import p149l.f1c0;
import p149l.hxs;
import p149l.ipn;
import p149l.j760;
import p149l.mep0;
import p149l.t100;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb2;

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
        gradientDrawable.setCornerRadius(t100.m186890d(10.0f));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: o0 */
    private void m67469o0(String str, String str2) {
        this._frame_view.m68736c(str, str2);
    }

    /* JADX INFO: renamed from: r */
    private void m67470r() {
        this.voiceCardBg = getVoiceCardBlackThemeBg();
        float fM208412y0 = (xdl0.m208412y0() * 1.0f) / t100.m186890d(375.0f);
        m67471i0(this._outer_ring, fM208412y0);
        m67471i0(this._middle_ring, fM208412y0);
        m67471i0(this._inner_ring, fM208412y0);
        m67471i0(this._avatar, fM208412y0);
        mep0.m154301c1(this, 0, 0, 0, 0, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m67471i0(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (layoutParams.width * f);
        layoutParams.height = (int) (layoutParams.height * f);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: j0 */
    public final String m67472j0(String str) {
        return Integer.valueOf(str).intValue() >= 1000 ? "+999" : str;
    }

    /* JADX INFO: renamed from: k0 */
    public void m67473k0() {
        LiveIntlSquareFrameView liveIntlSquareFrameView = this._frame_view;
        if (liveIntlSquareFrameView != null) {
            xdl0.m208344M(liveIntlSquareFrameView, false);
            this._frame_view.m68737d();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m67474l0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        if (list.isEmpty()) {
            return;
        }
        BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = list.get(0);
        VDraweeView vDraweeView = this._avatar;
        String str = bLiveVoiceMemberAvatar.avatar;
        int i = t100.f167244S;
        hxs.m133409v("context_common", vDraweeView, str, i, i, false, false, ipn.m137564a(), null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m67475m0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._item_background.setBackground(this.voiceCardBg);
        j760<String, String> j760VarM104058a = bvm0.m104058a(i);
        this.voiceCardBg.setColors(new int[]{Color.parseColor(j760VarM104058a.f116564a), Color.parseColor(j760VarM104058a.f116565b)});
    }

    /* JADX INFO: renamed from: n0 */
    public void m67476n0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, BLiveFrame bLiveFrame) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveVoiceRoomFeed.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            xdl0.m208344M(this._frame_view, false);
        } else if (bLiveFrame == null) {
            xdl0.m208344M(this._frame_view, false);
        } else {
            m67469o0(bLiveFrame.framePicUrl, bLiveFrame.frameSvgUrl);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._item_background = (VImage) findViewById(d5c0.f84450W);
        this._frame_view = (LiveIntlSquareFrameView) findViewById(d5c0.f84432N);
        this._outer_ring = findViewById(d5c0.f84513t0);
        this._middle_ring = findViewById(d5c0.f84501o0);
        this._inner_ring = findViewById(d5c0.f84446U);
        this._avatar = (VDraweeView) findViewById(d5c0.f84485j);
        this._title = (VText) findViewById(d5c0.f84457Z0);
        this._tag_container = (FrameLayout) findViewById(d5c0.f84435O0);
        this._tag = (VLinear) findViewById(d5c0.f84433N0);
        this._tag_icon = (VDraweeView) findViewById(d5c0.f84437P0);
        this._tag_text = (TextView) findViewById(d5c0.f84439Q0);
        this._container_avatar_1 = (LiveAvatarNumberItemView) findViewById(d5c0.f84518w);
        this._avatar_1 = (VDraweeView) findViewById(d5c0.f84488k);
        this._container_avatar_2 = (LiveAvatarNumberItemView) findViewById(d5c0.f84520x);
        this._avatar_2 = (VDraweeView) findViewById(d5c0.f84491l);
        this._container_avatar_3 = (LiveAvatarNumberItemView) findViewById(d5c0.f84522y);
        this._avatar_3 = (VDraweeView) findViewById(d5c0.f84494m);
        this._member_count = (VText) findViewById(d5c0.f84495m0);
        this._location = (VText) findViewById(d5c0.f84483i0);
        m67470r();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m67477p0(VDraweeView vDraweeView, BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar) {
        String str = bLiveVoiceMemberAvatar.avatar;
        int i = t100.f167266o;
        hxs.m133409v("context_common", vDraweeView, str, i, i, true, false, ipn.m137564a(), null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m67478q0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, boolean z) {
        xdl0.m208344M(this._location, z);
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
    public final void m67479r0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        ArrayList arrayListM200339n = vwb.m200339n(bLiveVoiceRoomFeed.memberAvatars, new w9j() { // from class: l.ylo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceMemberAvatar) obj).isOnCall);
            }
        });
        xdl0.m208344M(this._container_avatar_1, false);
        xdl0.m208344M(this._container_avatar_2, false);
        xdl0.m208344M(this._container_avatar_3, false);
        if (arrayListM200339n.size() >= 1) {
            m67477p0(this._avatar_1, (BLiveVoiceMemberAvatar) arrayListM200339n.get(0));
            xdl0.m208344M(this._container_avatar_1, true);
        }
        if (arrayListM200339n.size() >= 2) {
            m67477p0(this._avatar_2, (BLiveVoiceMemberAvatar) arrayListM200339n.get(1));
            xdl0.m208344M(this._container_avatar_2, true);
        }
        if (arrayListM200339n.size() >= 3) {
            m67477p0(this._avatar_3, (BLiveVoiceMemberAvatar) arrayListM200339n.get(2));
            xdl0.m208344M(this._container_avatar_3, true);
        }
        this._member_count.setText(w8u.m202218u(R$string.f44159d0, m67472j0(bLiveVoiceRoomFeed.memberCount)));
        xdl0.m208344M(this._member_count, arrayListM200339n.size() > 0);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m67480s0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        xdl0.m208344M(this._tag_container, false);
        BLiveDirectionTags bLiveDirectionTags = bLiveVoiceRoomFeed.liveAttributeTags;
        if (bLiveDirectionTags == null) {
            return;
        }
        boolean zM200296J = vwb.m200296J(bLiveDirectionTags.topTags);
        xdl0.m208344M(this._tag_container, !zM200296J);
        if (zM200296J) {
            return;
        }
        BLiveVoiceTag bLiveVoiceTag = bLiveDirectionTags.topTags.get(0);
        this._tag_text.setText(bLiveVoiceTag.text);
        xdl0.m208344M(this._tag_icon, !TextUtils.isEmpty(bLiveVoiceTag.url));
        if (!TextUtils.isEmpty(bLiveVoiceTag.url)) {
            hxs.m133406s("context_square", this._tag_icon, bLiveVoiceTag.url);
        }
        this._tag.setBackground(yb2.m213880e(new int[]{TextUtils.isEmpty(bLiveVoiceTag.startColor) ? f1c0.f94070g : Color.parseColor(bLiveVoiceTag.startColor), TextUtils.isEmpty(bLiveVoiceTag.endColor) ? f1c0.f94070g : Color.parseColor(bLiveVoiceTag.endColor)}, GradientDrawable.Orientation.LEFT_RIGHT, t100.f167258g, false));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m67481t0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._title.setText(bLiveVoiceRoomFeed.roomTitle);
    }

    /* JADX INFO: renamed from: u0 */
    public void m67482u0(bup bupVar, int i) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM103979c = bupVar.m103979c();
        m67475m0(i, bLiveVoiceRoomFeedM103979c);
        m67481t0(bLiveVoiceRoomFeedM103979c);
        m67474l0(bLiveVoiceRoomFeedM103979c);
        m67479r0(bLiveVoiceRoomFeedM103979c);
        m67480s0(bLiveVoiceRoomFeedM103979c);
        m67478q0(bLiveVoiceRoomFeedM103979c, bupVar.m103983g());
        m67476n0(bLiveVoiceRoomFeedM103979c, bupVar.m103978b());
    }

    public VoiceSquareThemeAFeedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSquareThemeAFeedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
