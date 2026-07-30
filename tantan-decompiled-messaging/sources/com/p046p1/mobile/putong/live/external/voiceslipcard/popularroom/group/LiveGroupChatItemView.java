package com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.live.base.data.BLiveDirectionTags;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.p046p1.mobile.putong.live.external.R$string;
import java.util.List;
import p147v.VDraweeView;
import p149l.bvm0;
import p149l.djj;
import p149l.ejj;
import p149l.h3c0;
import p149l.hxs;
import p149l.j760;
import p149l.oqs;
import p149l.t100;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class LiveGroupChatItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f46548d;

    /* JADX INFO: renamed from: e */
    public TextView f46549e;

    /* JADX INFO: renamed from: f */
    public TextView f46550f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f46551g;

    /* JADX INFO: renamed from: h */
    public GradientDrawable f46552h;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f46553i;

    public LiveGroupChatItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    private String m71161m0(String str) {
        return Integer.valueOf(str).intValue() >= 1000 ? "+999" : str;
    }

    public GradientDrawable getVoiceCardBg() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(t100.m186890d(20.0f));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71162h0(View view) {
        oqs.m165491a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71163i0(int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f46551g.getChildCount() > 0 ? -t100.m186890d(9.0f) : 0;
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        textView.setGravity(17);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, t100.f167271t);
        int i3 = t100.f167255d;
        layoutParams2.setMargins(i3, i3, i3, i3);
        int i4 = t100.f167259h;
        textView.setPadding(i4, 0, i4, 0);
        textView.setMaxLines(1);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(11.0f);
        textView.setText(w8u.m202217t(R$string.f44924r0));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        frameLayout.addView(textView);
        this.f46551g.addView(frameLayout);
        frameLayout.setBackground(yb2.m213876a(i, t100.f167265n, false));
        textView.setBackground(yb2.m213876a(bvm0.m104061d(i2), t100.f167263l, false));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m71164j0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f46551g.getChildCount() > 0 ? -t100.m186890d(9.0f) : 0;
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        textView.setGravity(17);
        int i3 = t100.f167271t;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, i3);
        int i4 = t100.f167255d;
        layoutParams2.setMargins(i4, i4, i4, i4);
        textView.setMinWidth(i3);
        boolean z = Integer.parseInt(bLiveVoiceRoomFeed.memberCount) >= 100;
        if (z) {
            int i5 = t100.f167259h;
            textView.setPadding(i5, 0, i5, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
        textView.setMaxLines(1);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(11.0f);
        textView.setText(m71161m0(bLiveVoiceRoomFeed.memberCount));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        frameLayout.addView(textView);
        this.f46551g.addView(frameLayout);
        frameLayout.setBackground(z ? yb2.m213876a(i, t100.f167265n, false) : yb2.m213883h(i));
        textView.setBackground(z ? yb2.m213876a(bvm0.m104061d(i2), t100.f167263l, false) : yb2.m213883h(bvm0.m104061d(i2)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m71165k0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i2) {
        this.f46551g.removeAllViews();
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        if (bLiveVoiceRoomFeed.extraInfo.isfollowingAnchor) {
            if (!list.isEmpty()) {
                this.f46551g.addView(m71166l0(i, list.get(0), 0));
            }
            m71163i0(i, i2);
            return;
        }
        int iMin = Math.min(3, list.size());
        int i3 = 0;
        while (i3 < iMin) {
            BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = list.get(i3);
            if (bLiveVoiceMemberAvatar.isOnCall) {
                this.f46551g.addView(m71166l0(i, bLiveVoiceMemberAvatar, i3 == 0 ? 0 : -t100.m186890d(9.0f)));
            }
            i3++;
        }
        m71164j0(i, bLiveVoiceRoomFeed, i2);
    }

    /* JADX INFO: renamed from: l0 */
    public final View m71166l0(int i, BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar, int i2) {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        djj djjVarM116872a = new ejj(getResources()).m116872a();
        djjVarM116872a.m112053H(RoundingParams.m8247a());
        djjVarM116872a.m112079z(h3c0.f105634R0);
        vDraweeView.setHierarchy(djjVarM116872a);
        int i3 = t100.f167271t;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
        if (!TextUtils.isEmpty(bLiveVoiceMemberAvatar.color)) {
            vDraweeView.setBackground(yb2.m213883h(Color.parseColor(bLiveVoiceMemberAvatar.color)));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(i2);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(vDraweeView);
        int i4 = t100.f167255d;
        frameLayout.setPadding(i4, i4, i4, i4);
        frameLayout.setBackground(yb2.m213883h(i));
        hxs.m133407t("context_common", vDraweeView, bLiveVoiceMemberAvatar.avatar, i3);
        return frameLayout;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m71167n0() {
        this.f46552h = getVoiceCardBg();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f46553i = gradientDrawable;
        gradientDrawable.setCornerRadius(t100.m186890d(23.0f));
    }

    /* JADX INFO: renamed from: o0 */
    public void m71168o0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this.f46549e.setText(bLiveVoiceRoomFeed.roomTitle);
        m71169p0(bLiveVoiceRoomFeed.liveAttributeTags);
        m71165k0(bvm0.m104060c(0), bLiveVoiceRoomFeed, 0);
        setBackground(this.f46552h);
        this.f46551g.setBackground(this.f46553i);
        j760<String, String> j760VarM104059b = bvm0.m104059b(0);
        this.f46552h.setColors(new int[]{Color.parseColor(j760VarM104059b.f116564a), Color.parseColor(j760VarM104059b.f116565b)});
        this.f46553i.setColor(bvm0.m104060c(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71162h0(this);
        m71167n0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m71169p0(BLiveDirectionTags bLiveDirectionTags) {
        if (bLiveDirectionTags == null) {
            return;
        }
        boolean zM200296J = vwb.m200296J(bLiveDirectionTags.topTags);
        xdl0.m208344M(this.f46548d, !zM200296J);
        if (!zM200296J) {
            BLiveVoiceTag bLiveVoiceTag = bLiveDirectionTags.topTags.get(0);
            if (bLiveDirectionTags.topTags.size() > 1) {
                for (int i = 0; i < bLiveDirectionTags.topTags.size(); i++) {
                    if ("hourLeaderboardLabel".equals(bLiveDirectionTags.topTags.get(i).type)) {
                        bLiveVoiceTag = bLiveDirectionTags.topTags.get(i);
                    }
                }
            }
            this.f46548d.setText(bLiveVoiceTag.text);
            this.f46548d.setBackground(yb2.m213880e(new int[]{TextUtils.isEmpty(bLiveVoiceTag.startColor) ? -11693 : Color.parseColor(bLiveVoiceTag.startColor), TextUtils.isEmpty(bLiveVoiceTag.endColor) ? -7523 : Color.parseColor(bLiveVoiceTag.endColor)}, GradientDrawable.Orientation.LEFT_RIGHT, t100.f167258g, false));
        }
        boolean zM200296J2 = vwb.m200296J(bLiveDirectionTags.bottomTags);
        xdl0.m208344M(this.f46550f, !zM200296J2);
        if (zM200296J2) {
            return;
        }
        this.f46550f.setText(bLiveDirectionTags.bottomTags.get(0).text);
        this.f46550f.setBackground(yb2.m213876a(-1, t100.f167258g, false));
    }

    public LiveGroupChatItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGroupChatItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
