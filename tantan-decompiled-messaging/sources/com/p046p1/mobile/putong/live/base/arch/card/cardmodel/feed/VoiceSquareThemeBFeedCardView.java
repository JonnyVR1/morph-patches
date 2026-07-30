package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.feed;

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
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.live.base.data.BLiveDirectionTags;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.p046p1.mobile.putong.live.base.view.LiveIntlSquareFrameView;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.bup;
import p149l.d5c0;
import p149l.djj;
import p149l.ejj;
import p149l.f1c0;
import p149l.g3c0;
import p149l.hxs;
import p149l.ipn;
import p149l.kvc0;
import p149l.mep0;
import p149l.ngm;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.yb2;
import p149l.ym2;

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
    public class C11428a extends ym2 {
        public C11428a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            xdl0.m208327D0((int) (VoiceSquareThemeBFeedCardView.this.left_top_tag.getHeight() * ((ngmVar.getWidth() * 1.0f) / ngmVar.getHeight())), VoiceSquareThemeBFeedCardView.this.left_top_tag);
        }
    }

    public VoiceSquareThemeBFeedCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    private String m67483i0(String str) {
        return Integer.valueOf(str).intValue() >= 1000 ? "+999" : str;
    }

    /* JADX INFO: renamed from: k0 */
    private void m67484k0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        if (list.isEmpty()) {
            return;
        }
        hxs.m133409v("context_common", this._avatar, list.get(0).avatar, t100.m186890d(176.0f), t100.m186890d(176.0f), false, false, ipn.m137564a(), null);
    }

    /* JADX INFO: renamed from: l0 */
    private void m67485l0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, BLiveFrame bLiveFrame) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveVoiceRoomFeed.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            xdl0.m208344M(this._frame_view, false);
        } else if (bLiveFrame == null) {
            xdl0.m208344M(this._frame_view, false);
        } else {
            m67486m0(bLiveFrame.framePicUrl, bLiveFrame.frameSvgUrl);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m67486m0(String str, String str2) {
        this._frame_view.m68736c(str, str2);
    }

    /* JADX INFO: renamed from: n0 */
    private void m67487n0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed, boolean z) {
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

    /* JADX INFO: renamed from: o0 */
    private void m67488o0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._member_container.removeAllViews();
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        int iMin = Math.min(3, list.size());
        int i = 0;
        while (i < iMin) {
            BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = list.get(i);
            if (bLiveVoiceMemberAvatar.isOnCall) {
                this._member_container.addView(m67492h0(bLiveVoiceMemberAvatar, i == 0 ? 0 : -t100.m186890d(5.0f)));
            }
            i++;
        }
        this._member_count.setText(m67483i0(bLiveVoiceRoomFeed.memberCount));
        xdl0.m208344M(this._member_count, list.size() > 0);
    }

    /* JADX INFO: renamed from: p0 */
    private void m67489p0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        xdl0.m208344M(this._tag_container, false);
        BLiveDirectionTags bLiveDirectionTags = bLiveVoiceRoomFeed.liveAttributeTags;
        if (bLiveDirectionTags == null) {
            return;
        }
        boolean zM200296J = vwb.m200296J(bLiveDirectionTags.topTags);
        xdl0.m208344M(this._tag_container, !zM200296J);
        if (!zM200296J) {
            BLiveVoiceTag bLiveVoiceTag = bLiveDirectionTags.topTags.get(0);
            this._tag_text.setText(bLiveVoiceTag.text);
            xdl0.m208344M(this._tag_icon, !TextUtils.isEmpty(bLiveVoiceTag.url));
            if (!TextUtils.isEmpty(bLiveVoiceTag.url)) {
                hxs.m133406s("context_square", this._tag_icon, bLiveVoiceTag.url);
            }
            this._tag.setBackground(yb2.m213880e(new int[]{TextUtils.isEmpty(bLiveVoiceTag.startColor) ? f1c0.f94070g : Color.parseColor(bLiveVoiceTag.startColor), TextUtils.isEmpty(bLiveVoiceTag.endColor) ? f1c0.f94070g : Color.parseColor(bLiveVoiceTag.endColor)}, GradientDrawable.Orientation.LEFT_RIGHT, t100.f167258g, false));
        }
        List<BLiveVoiceTag> list = bLiveDirectionTags.leftTopTags;
        boolean zM200296J2 = vwb.m200296J(list);
        VDraweeView vDraweeView = this.left_top_tag;
        if (zM200296J2) {
            xdl0.m208344M(vDraweeView, false);
        } else {
            xdl0.m208344M(vDraweeView, true);
            hxs.m133410w("context_square", this.left_top_tag, list.get(0).url, new C11428a());
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m67490q0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this._title.setText(bLiveVoiceRoomFeed.roomTitle);
    }

    /* JADX INFO: renamed from: r */
    private void m67491r() {
        mep0.m154301c1(this, 0, 0, 0, 0, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: h0 */
    public final View m67492h0(BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar, int i) {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        djj djjVarM116872a = new ejj(getResources()).m116872a();
        djjVarM116872a.m112053H(RoundingParams.m8247a());
        djjVarM116872a.m112079z(g3c0.f100398T);
        vDraweeView.setHierarchy(djjVarM116872a);
        int i2 = t100.f167265n;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(i);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(vDraweeView);
        int i3 = t100.f167252a;
        frameLayout.setPadding(i3, i3, i3, i3);
        frameLayout.setBackground(yb2.m213883h(kvc0.m147352a(f1c0.f94071h)));
        hxs.m133409v("context_common", vDraweeView, bLiveVoiceMemberAvatar.avatar, i2, i2, true, false, ipn.m137564a(), null);
        return frameLayout;
    }

    /* JADX INFO: renamed from: j0 */
    public void m67493j0() {
        LiveIntlSquareFrameView liveIntlSquareFrameView = this._frame_view;
        if (liveIntlSquareFrameView != null) {
            xdl0.m208344M(liveIntlSquareFrameView, false);
            this._frame_view.m68737d();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._frame_view = (LiveIntlSquareFrameView) findViewById(d5c0.f84432N);
        this._avatar = (VDraweeView) findViewById(d5c0.f84485j);
        this._title = (VText) findViewById(d5c0.f84457Z0);
        this._tag_container = (FrameLayout) findViewById(d5c0.f84435O0);
        this._tag = (VLinear) findViewById(d5c0.f84433N0);
        this._tag_icon = (VDraweeView) findViewById(d5c0.f84437P0);
        this._tag_text = (TextView) findViewById(d5c0.f84439Q0);
        this._member_count = (VText) findViewById(d5c0.f84495m0);
        this._location = (VText) findViewById(d5c0.f84483i0);
        this._member_container = (VLinear) findViewById(d5c0.f84492l0);
        this.left_top_tag = (VDraweeView) findViewById(d5c0.f84459a0);
        m67491r();
    }

    /* JADX INFO: renamed from: r0 */
    public void m67494r0(bup bupVar) {
        BLiveVoiceRoomFeed bLiveVoiceRoomFeedM103979c = bupVar.m103979c();
        m67484k0(bupVar.m103980d(), bLiveVoiceRoomFeedM103979c);
        m67490q0(bLiveVoiceRoomFeedM103979c);
        m67488o0(bLiveVoiceRoomFeedM103979c);
        m67489p0(bLiveVoiceRoomFeedM103979c);
        m67487n0(bLiveVoiceRoomFeedM103979c, bupVar.m103983g());
        m67485l0(bLiveVoiceRoomFeedM103979c, bupVar.m103978b());
    }

    public VoiceSquareThemeBFeedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSquareThemeBFeedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
