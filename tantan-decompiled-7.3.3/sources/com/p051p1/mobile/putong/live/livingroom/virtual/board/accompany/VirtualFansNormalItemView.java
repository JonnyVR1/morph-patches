package com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItemUser;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dzl0;
import p153l.osn0;
import p153l.qa00;
import p153l.usn0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualFansNormalItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53084d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f53085e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53086f;

    /* JADX INFO: renamed from: g */
    public VText f53087g;

    /* JADX INFO: renamed from: h */
    public LiveGenderMedalView f53088h;

    /* JADX INFO: renamed from: i */
    public VText f53089i;

    public VirtualFansNormalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m78054h0(osn0 osn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        if (osn0Var != null) {
            osn0Var.mo78062p(bLiveVoiceHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78055i0(View view) {
        dzl0.m118750a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78056j0(final BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, final osn0 osn0Var) {
        this.f53087g.setText(bLiveVoiceHourLeaderBoardItem.user.name);
        this.f53084d.setText(usn0.m197950e(bLiveVoiceHourLeaderBoardItem.rank));
        this.f53089i.setText(usn0.m197949d(bLiveVoiceHourLeaderBoardItem.amount));
        usn0.m197951f(this.f53085e, bLiveVoiceHourLeaderBoardItem, qa00.m175859d(73.0f));
        LiveGenderMedalView liveGenderMedalView = this.f53088h;
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = bLiveVoiceHourLeaderBoardItem.user;
        liveGenderMedalView.m76072Q(bLiveVoiceHourLeaderBoardItemUser.gender, (int) bLiveVoiceHourLeaderBoardItemUser.age, true);
        this.f53084d.setText(usn0.m197950e(bLiveVoiceHourLeaderBoardItem.rank));
        this.f53084d.setTextSize(bLiveVoiceHourLeaderBoardItem.rank > 99 ? 12.0f : 18.0f);
        bnl0.m105509E0(this.f53085e, new View.OnClickListener() { // from class: l.czl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualFansNormalItemView.m78054h0(osn0Var, bLiveVoiceHourLeaderBoardItem, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78055i0(this);
        this.f53084d.setTypeface(Typeface.defaultFromStyle(1));
    }

    public VirtualFansNormalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualFansNormalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
