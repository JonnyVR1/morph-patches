package com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group;

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
import com.p051p1.mobile.putong.live.base.data.BLiveDirectionTags;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceMemberAvatar;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTag;
import com.p051p1.mobile.putong.live.external.R$string;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.f4n0;
import p153l.fc2;
import p153l.izs;
import p153l.jyb;
import p153l.nbc0;
import p153l.pf60;
import p153l.pss;
import p153l.qa00;
import p153l.wlj;
import p153l.xau;
import p153l.xlj;

/* JADX INFO: loaded from: classes9.dex */
public class LiveGroupChatItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f47396d;

    /* JADX INFO: renamed from: e */
    public TextView f47397e;

    /* JADX INFO: renamed from: f */
    public TextView f47398f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f47399g;

    /* JADX INFO: renamed from: h */
    public GradientDrawable f47400h;

    /* JADX INFO: renamed from: i */
    public GradientDrawable f47401i;

    public LiveGroupChatItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: m0 */
    private String m72344m0(String str) {
        return Integer.valueOf(str).intValue() >= 1000 ? "+999" : str;
    }

    public GradientDrawable getVoiceCardBg() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(qa00.m175859d(20.0f));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m72345h0(View view) {
        pss.m173696a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m72346i0(int i, int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f47399g.getChildCount() > 0 ? -qa00.m175859d(9.0f) : 0;
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        textView.setGravity(17);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, qa00.f156333t);
        int i3 = qa00.f156317d;
        layoutParams2.setMargins(i3, i3, i3, i3);
        int i4 = qa00.f156321h;
        textView.setPadding(i4, 0, i4, 0);
        textView.setMaxLines(1);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(11.0f);
        textView.setText(xau.m209910t(R$string.f45772r0));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        frameLayout.addView(textView);
        this.f47399g.addView(frameLayout);
        frameLayout.setBackground(fc2.m124971a(i, qa00.f156327n, false));
        textView.setBackground(fc2.m124971a(f4n0.m124016d(i2), qa00.f156325l, false));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m72347j0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i2) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f47399g.getChildCount() > 0 ? -qa00.m175859d(9.0f) : 0;
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(getContext());
        textView.setTextColor(-1);
        textView.setGravity(17);
        int i3 = qa00.f156333t;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, i3);
        int i4 = qa00.f156317d;
        layoutParams2.setMargins(i4, i4, i4, i4);
        textView.setMinWidth(i3);
        boolean z = Integer.parseInt(bLiveVoiceRoomFeed.memberCount) >= 100;
        if (z) {
            int i5 = qa00.f156321h;
            textView.setPadding(i5, 0, i5, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
        textView.setMaxLines(1);
        textView.setLayoutParams(layoutParams2);
        textView.setTextSize(11.0f);
        textView.setText(m72344m0(bLiveVoiceRoomFeed.memberCount));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        frameLayout.addView(textView);
        this.f47399g.addView(frameLayout);
        frameLayout.setBackground(z ? fc2.m124971a(i, qa00.f156327n, false) : fc2.m124978h(i));
        textView.setBackground(z ? fc2.m124971a(f4n0.m124016d(i2), qa00.f156325l, false) : fc2.m124978h(f4n0.m124016d(i2)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m72348k0(int i, BLiveVoiceRoomFeed bLiveVoiceRoomFeed, int i2) {
        this.f47399g.removeAllViews();
        List<BLiveVoiceMemberAvatar> list = bLiveVoiceRoomFeed.memberAvatars;
        if (bLiveVoiceRoomFeed.extraInfo.isfollowingAnchor) {
            if (!list.isEmpty()) {
                this.f47399g.addView(m72349l0(i, list.get(0), 0));
            }
            m72346i0(i, i2);
            return;
        }
        int iMin = Math.min(3, list.size());
        int i3 = 0;
        while (i3 < iMin) {
            BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar = list.get(i3);
            if (bLiveVoiceMemberAvatar.isOnCall) {
                this.f47399g.addView(m72349l0(i, bLiveVoiceMemberAvatar, i3 == 0 ? 0 : -qa00.m175859d(9.0f)));
            }
            i3++;
        }
        m72347j0(i, bLiveVoiceRoomFeed, i2);
    }

    /* JADX INFO: renamed from: l0 */
    public final View m72349l0(int i, BLiveVoiceMemberAvatar bLiveVoiceMemberAvatar, int i2) {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        wlj wljVarM211638a = new xlj(getResources()).m211638a();
        wljVarM211638a.m207045H(RoundingParams.m8301a());
        wljVarM211638a.m207065z(nbc0.f141125R0);
        vDraweeView.setHierarchy(wljVarM211638a);
        int i3 = qa00.f156333t;
        vDraweeView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
        if (!TextUtils.isEmpty(bLiveVoiceMemberAvatar.color)) {
            vDraweeView.setBackground(fc2.m124978h(Color.parseColor(bLiveVoiceMemberAvatar.color)));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(i2);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(vDraweeView);
        int i4 = qa00.f156317d;
        frameLayout.setPadding(i4, i4, i4, i4);
        frameLayout.setBackground(fc2.m124978h(i));
        izs.m142869t("context_common", vDraweeView, bLiveVoiceMemberAvatar.avatar, i3);
        return frameLayout;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m72350n0() {
        this.f47400h = getVoiceCardBg();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f47401i = gradientDrawable;
        gradientDrawable.setCornerRadius(qa00.m175859d(23.0f));
    }

    /* JADX INFO: renamed from: o0 */
    public void m72351o0(BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        this.f47397e.setText(bLiveVoiceRoomFeed.roomTitle);
        m72352p0(bLiveVoiceRoomFeed.liveAttributeTags);
        m72348k0(f4n0.m124015c(0), bLiveVoiceRoomFeed, 0);
        setBackground(this.f47400h);
        this.f47399g.setBackground(this.f47401i);
        pf60<String, String> pf60VarM124014b = f4n0.m124014b(0);
        this.f47400h.setColors(new int[]{Color.parseColor(pf60VarM124014b.f152156a), Color.parseColor(pf60VarM124014b.f152157b)});
        this.f47401i.setColor(f4n0.m124015c(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72345h0(this);
        m72350n0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m72352p0(BLiveDirectionTags bLiveDirectionTags) {
        if (bLiveDirectionTags == null) {
            return;
        }
        boolean zM147479J = jyb.m147479J(bLiveDirectionTags.topTags);
        bnl0.m105524M(this.f47396d, !zM147479J);
        if (!zM147479J) {
            BLiveVoiceTag bLiveVoiceTag = bLiveDirectionTags.topTags.get(0);
            if (bLiveDirectionTags.topTags.size() > 1) {
                for (int i = 0; i < bLiveDirectionTags.topTags.size(); i++) {
                    if ("hourLeaderboardLabel".equals(bLiveDirectionTags.topTags.get(i).type)) {
                        bLiveVoiceTag = bLiveDirectionTags.topTags.get(i);
                    }
                }
            }
            this.f47396d.setText(bLiveVoiceTag.text);
            this.f47396d.setBackground(fc2.m124975e(new int[]{TextUtils.isEmpty(bLiveVoiceTag.startColor) ? -11693 : Color.parseColor(bLiveVoiceTag.startColor), TextUtils.isEmpty(bLiveVoiceTag.endColor) ? -7523 : Color.parseColor(bLiveVoiceTag.endColor)}, GradientDrawable.Orientation.LEFT_RIGHT, qa00.f156320g, false));
        }
        boolean zM147479J2 = jyb.m147479J(bLiveDirectionTags.bottomTags);
        bnl0.m105524M(this.f47398f, !zM147479J2);
        if (zM147479J2) {
            return;
        }
        this.f47398f.setText(bLiveDirectionTags.bottomTags.get(0).text);
        this.f47398f.setBackground(fc2.m124971a(-1, qa00.f156320g, false));
    }

    public LiveGroupChatItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGroupChatItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
