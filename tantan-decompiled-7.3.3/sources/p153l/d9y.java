package p153l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010'¨\u0006)"}, m88121d2 = {"Ll/d9y;", "Ll/bzl;", "<init>", "()V", "Ll/j8y;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/j8y;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "", "Lcom/p1/mobile/putong/data/User;", "allUsers", "k", "(Ljava/util/List;)Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "newLikersUser", "I", "newLikersCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class d9y implements bzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User newLikersUser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int newLikersCount;

    /* JADX INFO: renamed from: h */
    public static Boolean m115101h(User user) {
        return ((long) (((double) pzi0.m174454o()) - user.location.updatedTime)) / Constants.ONE_MIN_IN_MILLIS < 30 ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public static void m115102i(d9y d9yVar, BusinessConversationView businessConversationView, View view) {
        i4g0.m138523u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", d9yVar.mo107170d()));
        businessConversationView.getContext().startActivity(MeetAct.m41505Z1(businessConversationView.getContext(), "", "see"));
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m115103j(User user) {
        return user.location.distance < 10000 ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: a */
    public void mo107167a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        bnl0.m105524M(_view.f26477i, false);
        bnl0.m105558h0(_view.f26476h, qa00.m175859d(7.0f));
        _view.f26476h.setBackgroundResource(dbc0.f86599Te);
        boolean zM131778z = gra.m131778z();
        VImage vImage = _view.f26489u;
        if (zM131778z) {
            vImage.setImageResource(dbc0.f86537Rg);
        } else {
            vImage.setImageResource(dbc0.f86759Ye);
        }
        bnl0.m105524M(_view.f26489u, true);
        ViewGroup.LayoutParams layoutParams = _view.f26494z.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = -2;
            marginLayoutParams.height = qa00.f156330q;
            marginLayoutParams.topMargin = -qa00.f156319f;
            _view.f26494z.setLayoutParams(marginLayoutParams);
        }
        _view.f26494z.setMinWidth(qa00.f156330q);
        _view.f26494z.setBackgroundResource(dbc0.f86654V5);
        _view.f26494z.setText(c17.m107524q0(this.newLikersCount));
        bnl0.m105524M(_view.f26494z, true);
        bnl0.m105524M(_view.f26471A, false);
        bnl0.m105509E0(_view, new View.OnClickListener() { // from class: l.a9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d9y.m115102i(this.f69086a, _view, view);
            }
        });
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: b */
    public boolean mo107168b(@NotNull j8y meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        CoreLikers.C4870a likersData = meetEntranceData.getLikersData();
        if (likersData == null || likersData.f20013c <= 0) {
            return false;
        }
        List<User> list = likersData.f20014d;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        List<User> list2 = likersData.f20014d;
        list2.getClass();
        this.newLikersUser = m115104k(list2);
        this.newLikersCount = likersData.f20013c;
        return true;
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: c */
    public boolean mo107169c() {
        return joa.m146392i4() && this.newLikersUser != null;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo107170d() {
        return "newlike";
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo107171e() {
        return super.mo107171e();
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: f */
    public int mo107172f() {
        return 0;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo107173g() {
        String str;
        User user = this.newLikersUser;
        if (user == null) {
            return "其中有人觉得你很特别，想和你认识";
        }
        boolean zM141060B3 = CoreModule.f18264c.f20303E0.m141060B3(user);
        int i = user.location.distance;
        if (zM141060B3 || i >= 10000 || i < 100) {
            return (user.isHideActiveFromSVip() || ((long) (((double) pzi0.m174454o()) - user.location.updatedTime)) / 1000 >= 1800) ? "其中有人觉得你很特别，想和你认识" : "其中有人当前在线，快去看看吧";
        }
        if (i < 1000) {
            str = i + "m";
        } else {
            str = (i / 1000.0f) + "km";
        }
        SpannableStringBuilder spannableStringBuilderM175798d0 = q8g0.m175798d0((user.isFemale() ? "她" : "他") + "仅离你" + str + "，想和你认识", jyb.m147507f0(str), jyb.m147507f0(Integer.valueOf(mo107171e())), Typeface.create(lyh0.m156283c(2), 1), qa00.m175861f(15));
        spannableStringBuilderM175798d0.getClass();
        return spannableStringBuilderM175798d0;
    }

    @Override // p153l.bzl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM61308fp;
        User user = this.newLikersUser;
        if (user == null || (pictureM61308fp = user.m61308fp()) == null) {
            return null;
        }
        return pictureM61308fp.profileSmall();
    }

    @Override // p153l.bzl
    @NotNull
    public CharSequence getTitle() {
        SpannableStringBuilder spannableStringBuilderM175798d0 = q8g0.m175798d0("有" + this.newLikersCount + "个人新喜欢了你", jyb.m147507f0(String.valueOf(this.newLikersCount)), jyb.m147507f0(Integer.valueOf(mo107171e())), Typeface.create(lyh0.m156283c(2), 1), qa00.m175861f(15));
        spannableStringBuilderM175798d0.getClass();
        return spannableStringBuilderM175798d0;
    }

    /* JADX INFO: renamed from: k */
    public final User m115104k(List<? extends User> allUsers) {
        User user = (User) jyb.m147533v(allUsers, new qcj() { // from class: l.b9y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return d9y.m115103j((User) obj);
            }
        }, 5);
        if (user != null) {
            return user;
        }
        User user2 = (User) jyb.m147533v(allUsers, new qcj() { // from class: l.c9y
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return d9y.m115101h((User) obj);
            }
        }, 5);
        return user2 != null ? user2 : allUsers.get(0);
    }
}
