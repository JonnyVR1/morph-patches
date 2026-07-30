package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item.VoiceSweetCpInviteRecordItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class yno0 {
    /* JADX INFO: renamed from: a */
    public static void m215427a(VoiceSweetCpInviteRecordItemView voiceSweetCpInviteRecordItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetCpInviteRecordItemView._inviteAvatar = (VDraweeView) viewGroup.getChildAt(0);
        voiceSweetCpInviteRecordItemView._inviteName = (TextView) viewGroup.getChildAt(1);
        voiceSweetCpInviteRecordItemView._inviteTime = (TextView) viewGroup.getChildAt(2);
        voiceSweetCpInviteRecordItemView._stateView = (TextView) viewGroup.getChildAt(3);
        voiceSweetCpInviteRecordItemView._operateLayout = (LinearLayout) viewGroup.getChildAt(4);
        voiceSweetCpInviteRecordItemView._operateLayout_refuseBtn = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        voiceSweetCpInviteRecordItemView._operateLayout_agreeBtn = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
