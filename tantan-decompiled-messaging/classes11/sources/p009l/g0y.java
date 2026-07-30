package p009l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.meet.MeetAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import l.eqh0;
import l.j760;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006)"}, d2 = {"Ll/g0y;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", "d", "()Ljava/lang/String;", "", "Lcom/p1/mobile/putong/data/User;", "allUsers", "k", "(Ljava/util/List;)Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "newLikersUser", "I", "newLikersCount", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0y implements jwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User newLikersUser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int newLikersCount;

    /* JADX INFO: renamed from: h */
    public static Boolean m14715h(User user) {
        return ((long) (((double) mqi0.m18550o()) - user.location.updatedTime)) / 60000 < 30 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static void m14716i(g0y g0yVar, BusinessConversationView businessConversationView, View view) {
        zvf0.u("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", g0yVar.mo12329d())});
        businessConversationView.getContext().startActivity(MeetAct.m4580Y1(businessConversationView.getContext(), "", "see"));
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m14717j(User user) {
        return user.location.distance < 10000 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.jwl
    /* JADX INFO: renamed from: a */
    public void mo12327a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.M(_view.f4513i, false);
        xdl0.h0(_view.f4512h, t100.d(7.0f));
        _view.f4512h.setBackgroundResource(x2c0.fe);
        boolean z = upa.z();
        VImage vImage = _view.f4525u;
        if (z) {
            vImage.setImageResource(x2c0.dg);
        } else {
            vImage.setImageResource(x2c0.ke);
        }
        xdl0.M(_view.f4525u, true);
        ViewGroup.LayoutParams layoutParams = _view.f4530z.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = -2;
            marginLayoutParams.height = t100.q;
            marginLayoutParams.topMargin = -t100.f;
            _view.f4530z.setLayoutParams(marginLayoutParams);
        }
        _view.f4530z.setMinWidth(t100.q);
        _view.f4530z.setBackgroundResource(x2c0.U5);
        _view.f4530z.setText(zz6.q0(this.newLikersCount));
        xdl0.M(_view.f4530z, true);
        xdl0.M(_view.f4507A, false);
        xdl0.E0(_view, new View.OnClickListener() { // from class: l.d0y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0y.m14716i(this.f10842a, _view, view);
            }
        });
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo11182b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        CoreLikers.a likersData = meetEntranceData.getLikersData();
        if (likersData == null || likersData.c <= 0) {
            return false;
        }
        List list = likersData.d;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        List<? extends User> list2 = likersData.d;
        list2.getClass();
        this.newLikersUser = m14719k(list2);
        this.newLikersCount = likersData.c;
        return true;
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo12328c() {
        return xma.h4() && this.newLikersUser != null;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo12329d() {
        return "newlike";
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo14718e() {
        return super.mo14718e();
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
        User user = this.newLikersUser;
        if (user == null) {
            return "其中有人觉得你很特别，想和你认识";
        }
        boolean zB3 = CoreModule.c.E0.B3(user);
        int i = user.location.distance;
        if (zB3 || i >= 10000 || i < 100) {
            return (user.isHideActiveFromSVip() || ((long) (((double) mqi0.m18550o()) - user.location.updatedTime)) / 1000 >= 1800) ? "其中有人觉得你很特别，想和你认识" : "其中有人当前在线，快去看看吧";
        }
        if (i < 1000) {
            str = i + "m";
        } else {
            str = (i / 1000.0f) + "km";
        }
        SpannableStringBuilder spannableStringBuilderM16131d0 = i0g0.m16131d0((user.isFemale() ? "她" : "他") + "仅离你" + str + "，想和你认识", vwb.f0(new String[]{str}), vwb.f0(new Integer[]{Integer.valueOf(mo14718e())}), Typeface.create(eqh0.c(2), 1), t100.f(15));
        spannableStringBuilderM16131d0.getClass();
        return spannableStringBuilderM16131d0;
    }

    @Override // p009l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureFp;
        User user = this.newLikersUser;
        if (user == null || (pictureFp = user.fp()) == null) {
            return null;
        }
        return pictureFp.profileSmall();
    }

    @Override // p009l.jwl
    @NotNull
    public CharSequence getTitle() {
        SpannableStringBuilder spannableStringBuilderM16131d0 = i0g0.m16131d0("有" + this.newLikersCount + "个人新喜欢了你", vwb.f0(new String[]{String.valueOf(this.newLikersCount)}), vwb.f0(new Integer[]{Integer.valueOf(mo14718e())}), Typeface.create(eqh0.c(2), 1), t100.f(15));
        spannableStringBuilderM16131d0.getClass();
        return spannableStringBuilderM16131d0;
    }

    /* JADX INFO: renamed from: k */
    public final User m14719k(List<? extends User> allUsers) {
        User user = (User) vwb.v(allUsers, new w9j() { // from class: l.e0y
            public final Object call(Object obj) {
                return g0y.m14717j((User) obj);
            }
        }, 5);
        if (user != null) {
            return user;
        }
        User user2 = (User) vwb.v(allUsers, new w9j() { // from class: l.f0y
            public final Object call(Object obj) {
                return g0y.m14715h((User) obj);
            }
        }, 5);
        return user2 != null ? user2 : allUsers.get(0);
    }
}
