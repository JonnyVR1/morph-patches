package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.meet.MeetAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MyMeetEntryNearby;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import l.j760;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010$¨\u0006&"}, d2 = {"Ll/c0y;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", "d", "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "nearby", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "nearbyUser", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class c0y implements jwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MyMeetEntryNearby nearby;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public User nearbyUser;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m12326h(c0y c0yVar, BusinessConversationView businessConversationView, View view) {
        zvf0.u("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", c0yVar.mo12329d())});
        businessConversationView.getContext().startActivity(MeetAct.m4580Y1(businessConversationView.getContext(), "", "nearby"));
        CoreModule.c.m1.L5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.jwl
    /* JADX INFO: renamed from: a */
    public void mo12327a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.M(_view.f4513i, false);
        xdl0.h0(_view.f4512h, t100.d(7.0f));
        _view.f4512h.setBackgroundResource(x2c0.ge);
        boolean z = upa.z();
        VImage vImage = _view.f4525u;
        if (z) {
            vImage.setImageResource(x2c0.eg);
        } else {
            vImage.setImageResource(x2c0.le);
        }
        xdl0.M(_view.f4525u, true);
        boolean zI4 = CoreModule.c.m1.i4();
        VText vText = _view.f4530z;
        if (zI4) {
            ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i = t100.j;
                marginLayoutParams.width = i;
                marginLayoutParams.height = i;
                marginLayoutParams.topMargin = t100.c;
                _view.f4530z.setLayoutParams(marginLayoutParams);
            }
            _view.f4530z.setMinWidth(t100.j);
            _view.f4530z.setText("");
            _view.f4530z.setBackgroundResource(x2c0.X5);
            xdl0.M(_view.f4530z, true);
        } else {
            xdl0.M(vText, false);
        }
        xdl0.M(_view.f4507A, false);
        xdl0.E0(_view, new View.OnClickListener() { // from class: l.b0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0y.m12326h(this.f9786a, _view, view);
            }
        });
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo11182b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        List list;
        meetEntranceData.getClass();
        MyMeetEntryNearby nearby = meetEntranceData.getNearby();
        if (nearby != null && (list = nearby.userIds) != null && (!list.isEmpty())) {
            MyMeetEntryNearby nearby2 = meetEntranceData.getNearby();
            nearby2.getClass();
            User userPa = CoreModule.c.e0.Pa((String) nearby2.userIds.get(0));
            if (userPa != null) {
                this.nearbyUser = userPa;
                this.nearby = meetEntranceData.getNearby();
                return true;
            }
        }
        return false;
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo12328c() {
        return (xma.L3() || this.nearbyUser == null) ? false : true;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo12329d() {
        return "nearby";
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: f */
    public int mo12330f() {
        return 0;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo12331g() {
        String str;
        MyMeetEntryNearby myMeetEntryNearby = this.nearby;
        if (TextUtils.isEmpty(myMeetEntryNearby != null ? myMeetEntryNearby.subText : null)) {
            return "其中有人正在找人聊天，快去看看吧";
        }
        MyMeetEntryNearby myMeetEntryNearby2 = this.nearby;
        return (myMeetEntryNearby2 == null || (str = myMeetEntryNearby2.subText) == null) ? "" : str;
    }

    @Override // p009l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureFp;
        User user = this.nearbyUser;
        if (user == null || (pictureFp = user.fp()) == null) {
            return null;
        }
        return pictureFp.profileSmall();
    }

    @Override // p009l.jwl
    @NotNull
    public CharSequence getTitle() {
        User user = this.nearbyUser;
        return "为你找到了附近在线的".concat((user == null || !user.isFemale()) ? "他" : "她");
    }
}
