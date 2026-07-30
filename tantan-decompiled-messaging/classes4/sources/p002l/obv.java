package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p1.mobile.putong.live.livingroom.virtual.call.userleaderboard.page.VoiceUserLeaderBoardPage;
import com.p1.mobile.putong.live.livingroom.virtual.room.hourleaderboard.mainland.LiveVoiceLeaderBoardTopAnimView;
import l.jfd0;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class obv<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f16512e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f16513f;

    /* JADX INFO: renamed from: g */
    public LiveVoiceLeaderBoardTopAnimView f16514g;

    /* JADX INFO: renamed from: h */
    public DialogTitleBar f16515h;

    /* JADX INFO: renamed from: i */
    public VoiceUserLeaderBoardPage f16516i;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19935mb, viewGroup, false);
        m19389u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m19389u(ViewGroup viewGroup) {
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        this.f16512e = constraintLayout;
        this.f16513f = constraintLayout;
        String str = constraintLayout == null ? "_root" : null;
        LiveVoiceLeaderBoardTopAnimView childAt = viewGroup.getChildAt(0);
        this.f16514g = childAt;
        if (childAt == null) {
            str = "_animView";
        }
        DialogTitleBar childAt2 = viewGroup.getChildAt(1);
        this.f16515h = childAt2;
        if (childAt2 == null) {
            str = "_title_bar";
        }
        VoiceUserLeaderBoardPage childAt3 = viewGroup.getChildAt(2);
        this.f16516i = childAt3;
        if (childAt3 == null) {
            str = "_leader_board_content_view";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}
