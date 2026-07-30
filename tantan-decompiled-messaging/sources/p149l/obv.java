package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class obv<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f142980e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f142981f;

    /* JADX INFO: renamed from: g */
    public LiveVoiceLeaderBoardTopAnimView f142982g;

    /* JADX INFO: renamed from: h */
    public DialogTitleBar f142983h;

    /* JADX INFO: renamed from: i */
    public VoiceUserLeaderBoardPage f142984i;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168439mb, viewGroup, false);
        m163464u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m163464u(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        this.f142980e = constraintLayout;
        this.f142981f = constraintLayout;
        String str = constraintLayout == null ? "_root" : null;
        LiveVoiceLeaderBoardTopAnimView liveVoiceLeaderBoardTopAnimView = (LiveVoiceLeaderBoardTopAnimView) viewGroup.getChildAt(0);
        this.f142982g = liveVoiceLeaderBoardTopAnimView;
        if (liveVoiceLeaderBoardTopAnimView == null) {
            str = "_animView";
        }
        DialogTitleBar dialogTitleBar = (DialogTitleBar) viewGroup.getChildAt(1);
        this.f142983h = dialogTitleBar;
        if (dialogTitleBar == null) {
            str = "_title_bar";
        }
        VoiceUserLeaderBoardPage voiceUserLeaderBoardPage = (VoiceUserLeaderBoardPage) viewGroup.getChildAt(2);
        this.f142984i = voiceUserLeaderBoardPage;
        if (voiceUserLeaderBoardPage == null) {
            str = "_leader_board_content_view";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}
