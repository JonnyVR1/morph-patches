package p149l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006)"}, m87232d2 = {"Ll/g0y;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "", "Lcom/p1/mobile/putong/data/User;", "allUsers", "k", "(Ljava/util/List;)Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "newLikersUser", "I", "newLikersCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g0y implements jwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User newLikersUser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int newLikersCount;

    /* JADX INFO: renamed from: h */
    public static Boolean m124028h(User user) {
        return ((long) (((double) mqi0.m155944o()) - user.location.updatedTime)) / Constants.ONE_MIN_IN_MILLIS < 30 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public static void m124029i(g0y g0yVar, BusinessConversationView businessConversationView, View view) {
        zvf0.m220399u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, vwb.m200311Y("guidance_type", g0yVar.mo104778d()));
        businessConversationView.getContext().startActivity(MeetAct.m40494Y1(businessConversationView.getContext(), "", "see"));
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m124030j(User user) {
        return user.location.distance < 10000 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: a */
    public void mo104776a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.m208344M(_view.f25735i, false);
        xdl0.m208378h0(_view.f25734h, t100.m186890d(7.0f));
        _view.f25734h.setBackgroundResource(x2c0.f190139fe);
        boolean zM194847z = upa.m194847z();
        VImage vImage = _view.f25747u;
        if (zM194847z) {
            vImage.setImageResource(x2c0.f190078dg);
        } else {
            vImage.setImageResource(x2c0.f190297ke);
        }
        xdl0.m208344M(_view.f25747u, true);
        ViewGroup.LayoutParams layoutParams = _view.f25752z.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = -2;
            marginLayoutParams.height = t100.f167268q;
            marginLayoutParams.topMargin = -t100.f167257f;
            _view.f25752z.setLayoutParams(marginLayoutParams);
        }
        _view.f25752z.setMinWidth(t100.f167268q);
        _view.f25752z.setBackgroundResource(x2c0.f189785U5);
        _view.f25752z.setText(zz6.m221000q0(this.newLikersCount));
        xdl0.m208344M(_view.f25752z, true);
        xdl0.m208344M(_view.f25729A, false);
        xdl0.m208329E0(_view, new View.OnClickListener() { // from class: l.d0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0y.m124029i(this.f83218a, _view, view);
            }
        });
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo94500b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        CoreLikers.C4719a likersData = meetEntranceData.getLikersData();
        if (likersData == null || likersData.f19271c <= 0) {
            return false;
        }
        List<User> list = likersData.f19272d;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        List<User> list2 = likersData.f19272d;
        list2.getClass();
        this.newLikersUser = m124032k(list2);
        this.newLikersCount = likersData.f19271c;
        return true;
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo104777c() {
        return xma.m210077h4() && this.newLikersUser != null;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo104778d() {
        return "newlike";
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo124031e() {
        return super.mo124031e();
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
        User user = this.newLikersUser;
        if (user == null) {
            return "其中有人觉得你很特别，想和你认识";
        }
        boolean zM203772B3 = CoreModule.f17545c.f19561E0.m203772B3(user);
        int i = user.location.distance;
        if (zM203772B3 || i >= 10000 || i < 100) {
            return (user.isHideActiveFromSVip() || ((long) (((double) mqi0.m155944o()) - user.location.updatedTime)) / 1000 >= 1800) ? "其中有人觉得你很特别，想和你认识" : "其中有人当前在线，快去看看吧";
        }
        if (i < 1000) {
            str = i + "m";
        } else {
            str = (i / 1000.0f) + "km";
        }
        SpannableStringBuilder spannableStringBuilderM133863d0 = i0g0.m133863d0((user.isFemale() ? "她" : "他") + "仅离你" + str + "，想和你认识", vwb.m200324f0(str), vwb.m200324f0(Integer.valueOf(mo124031e())), Typeface.create(eqh0.m117752c(2), 1), t100.m186892f(15));
        spannableStringBuilderM133863d0.getClass();
        return spannableStringBuilderM133863d0;
    }

    @Override // p149l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM60124fp;
        User user = this.newLikersUser;
        if (user == null || (pictureM60124fp = user.m60124fp()) == null) {
            return null;
        }
        return pictureM60124fp.profileSmall();
    }

    @Override // p149l.jwl
    @NotNull
    public CharSequence getTitle() {
        SpannableStringBuilder spannableStringBuilderM133863d0 = i0g0.m133863d0("有" + this.newLikersCount + "个人新喜欢了你", vwb.m200324f0(String.valueOf(this.newLikersCount)), vwb.m200324f0(Integer.valueOf(mo124031e())), Typeface.create(eqh0.m117752c(2), 1), t100.m186892f(15));
        spannableStringBuilderM133863d0.getClass();
        return spannableStringBuilderM133863d0;
    }

    /* JADX INFO: renamed from: k */
    public final User m124032k(List<? extends User> allUsers) {
        User user = (User) vwb.m200350v(allUsers, new w9j() { // from class: l.e0y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return g0y.m124030j((User) obj);
            }
        }, 5);
        if (user != null) {
            return user;
        }
        User user2 = (User) vwb.m200350v(allUsers, new w9j() { // from class: l.f0y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return g0y.m124028h((User) obj);
            }
        }, 5);
        return user2 != null ? user2 : allUsers.get(0);
    }
}
