package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class pdv<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f151834e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f151835f;

    /* JADX INFO: renamed from: g */
    public LiveVoiceLeaderBoardTopAnimView f151836g;

    /* JADX INFO: renamed from: h */
    public DialogTitleBar f151837h;

    /* JADX INFO: renamed from: i */
    public VoiceUserLeaderBoardPage f151838i;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199171mb, viewGroup, false);
        m171892u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m171892u(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        this.f151834e = constraintLayout;
        this.f151835f = constraintLayout;
        String str = constraintLayout == null ? "_root" : null;
        LiveVoiceLeaderBoardTopAnimView liveVoiceLeaderBoardTopAnimView = (LiveVoiceLeaderBoardTopAnimView) viewGroup.getChildAt(0);
        this.f151836g = liveVoiceLeaderBoardTopAnimView;
        if (liveVoiceLeaderBoardTopAnimView == null) {
            str = "_animView";
        }
        DialogTitleBar dialogTitleBar = (DialogTitleBar) viewGroup.getChildAt(1);
        this.f151837h = dialogTitleBar;
        if (dialogTitleBar == null) {
            str = "_title_bar";
        }
        VoiceUserLeaderBoardPage voiceUserLeaderBoardPage = (VoiceUserLeaderBoardPage) viewGroup.getChildAt(2);
        this.f151838i = voiceUserLeaderBoardPage;
        if (voiceUserLeaderBoardPage == null) {
            str = "_leader_board_content_view";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}
