package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MyMeetEntryNearby;
import com.p046p1.mobile.putong.core.newui.meet.MeetAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010$¨\u0006&"}, m87232d2 = {"Ll/c0y;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "nearby", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "nearbyUser", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class c0y implements jwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MyMeetEntryNearby nearby;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public User nearbyUser;

    /* JADX INFO: renamed from: h */
    public static void m104775h(c0y c0yVar, BusinessConversationView businessConversationView, View view) {
        zvf0.m220399u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, vwb.m200311Y("guidance_type", c0yVar.mo104778d()));
        businessConversationView.getContext().startActivity(MeetAct.m40494Y1(businessConversationView.getContext(), "", "nearby"));
        CoreModule.f17545c.f19664m1.m34697L5();
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: a */
    public void mo104776a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.m208344M(_view.f25735i, false);
        xdl0.m208378h0(_view.f25734h, t100.m186890d(7.0f));
        _view.f25734h.setBackgroundResource(x2c0.f190171ge);
        boolean zM194847z = upa.m194847z();
        VImage vImage = _view.f25747u;
        if (zM194847z) {
            vImage.setImageResource(x2c0.f190109eg);
        } else {
            vImage.setImageResource(x2c0.f190329le);
        }
        xdl0.m208344M(_view.f25747u, true);
        boolean zM34715i4 = CoreModule.f17545c.f19664m1.m34715i4();
        VText vText = _view.f25752z;
        if (zM34715i4) {
            ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i = t100.f167261j;
                marginLayoutParams.width = i;
                marginLayoutParams.height = i;
                marginLayoutParams.topMargin = t100.f167254c;
                _view.f25752z.setLayoutParams(marginLayoutParams);
            }
            _view.f25752z.setMinWidth(t100.f167261j);
            _view.f25752z.setText("");
            _view.f25752z.setBackgroundResource(x2c0.f189878X5);
            xdl0.m208344M(_view.f25752z, true);
        } else {
            xdl0.m208344M(vText, false);
        }
        xdl0.m208344M(_view.f25729A, false);
        xdl0.m208329E0(_view, new View.OnClickListener() { // from class: l.b0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0y.m104775h(this.f72473a, _view, view);
            }
        });
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo94500b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        List<String> list;
        meetEntranceData.getClass();
        MyMeetEntryNearby nearby = meetEntranceData.getNearby();
        if (nearby != null && (list = nearby.userIds) != null && (!list.isEmpty())) {
            MyMeetEntryNearby nearby2 = meetEntranceData.getNearby();
            nearby2.getClass();
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(nearby2.userIds.get(0));
            if (userM169430Pa != null) {
                this.nearbyUser = userM169430Pa;
                this.nearby = meetEntranceData.getNearby();
                return true;
            }
        }
        return false;
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo104777c() {
        return (xma.m210047L3() || this.nearbyUser == null) ? false : true;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo104778d() {
        return "nearby";
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: f */
    public int mo104779f() {
        return 0;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo104780g() {
        String str;
        MyMeetEntryNearby myMeetEntryNearby = this.nearby;
        if (TextUtils.isEmpty(myMeetEntryNearby != null ? myMeetEntryNearby.subText : null)) {
            return "其中有人正在找人聊天，快去看看吧";
        }
        MyMeetEntryNearby myMeetEntryNearby2 = this.nearby;
        return (myMeetEntryNearby2 == null || (str = myMeetEntryNearby2.subText) == null) ? "" : str;
    }

    @Override // p149l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM60124fp;
        User user = this.nearbyUser;
        if (user == null || (pictureM60124fp = user.m60124fp()) == null) {
            return null;
        }
        return pictureM60124fp.profileSmall();
    }

    @Override // p149l.jwl
    @NotNull
    public CharSequence getTitle() {
        User user = this.nearbyUser;
        return "为你找到了附近在线的".concat((user == null || !user.isFemale()) ? "他" : "她");
    }
}
