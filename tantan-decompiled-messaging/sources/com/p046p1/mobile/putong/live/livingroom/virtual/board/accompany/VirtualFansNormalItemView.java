package com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHourLeaderBoardItemUser;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.LiveGenderMedalView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.accompany.VirtualFansNormalItemView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.kjn0;
import p149l.qjn0;
import p149l.t100;
import p149l.xdl0;
import p149l.zpl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualFansNormalItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f52236d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f52237e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52238f;

    /* JADX INFO: renamed from: g */
    public VText f52239g;

    /* JADX INFO: renamed from: h */
    public LiveGenderMedalView f52240h;

    /* JADX INFO: renamed from: i */
    public VText f52241i;

    public VirtualFansNormalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m76871h0(kjn0 kjn0Var, BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, View view) {
        if (kjn0Var != null) {
            kjn0Var.mo76879q(bLiveVoiceHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76872i0(View view) {
        zpl0.m219677a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m76873j0(final BLiveVoiceHourLeaderBoardItem bLiveVoiceHourLeaderBoardItem, final kjn0 kjn0Var) {
        this.f52239g.setText(bLiveVoiceHourLeaderBoardItem.user.name);
        this.f52236d.setText(qjn0.m175024e(bLiveVoiceHourLeaderBoardItem.rank));
        this.f52241i.setText(qjn0.m175023d(bLiveVoiceHourLeaderBoardItem.amount));
        qjn0.m175025f(this.f52237e, bLiveVoiceHourLeaderBoardItem, t100.m186890d(73.0f));
        LiveGenderMedalView liveGenderMedalView = this.f52240h;
        BLiveVoiceHourLeaderBoardItemUser bLiveVoiceHourLeaderBoardItemUser = bLiveVoiceHourLeaderBoardItem.user;
        liveGenderMedalView.m74889Q(bLiveVoiceHourLeaderBoardItemUser.gender, (int) bLiveVoiceHourLeaderBoardItemUser.age, true);
        this.f52236d.setText(qjn0.m175024e(bLiveVoiceHourLeaderBoardItem.rank));
        this.f52236d.setTextSize(bLiveVoiceHourLeaderBoardItem.rank > 99 ? 12.0f : 18.0f);
        xdl0.m208329E0(this.f52237e, new View.OnClickListener() { // from class: l.ypl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualFansNormalItemView.m76871h0(kjn0Var, bLiveVoiceHourLeaderBoardItem, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76872i0(this);
        this.f52236d.setTypeface(Typeface.defaultFromStyle(1));
    }

    public VirtualFansNormalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualFansNormalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
