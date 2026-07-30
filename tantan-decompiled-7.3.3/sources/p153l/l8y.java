package p153l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006\""}, m88121d2 = {"Ll/l8y;", "Ll/bzl;", "<init>", "()V", "Ll/j8y;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/j8y;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "totalLikersUsers", "I", "totalLikersCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class l8y implements bzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User totalLikersUsers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int totalLikersCount;

    /* JADX INFO: renamed from: h */
    public static void m153304h(l8y l8yVar, BusinessConversationView businessConversationView, View view) {
        i4g0.m138523u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", l8yVar.mo107170d()));
        businessConversationView.getContext().startActivity(MeetAct.m41505Z1(businessConversationView.getContext(), "", "see"));
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: a */
    public void mo107167a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        bnl0.m105524M(_view.f26477i, false);
        _view.f26476h.setBackgroundResource(0);
        bnl0.m105558h0(_view.f26476h, qa00.m175859d(3.0f));
        bnl0.m105524M(_view.f26489u, false);
        bnl0.m105524M(_view.f26494z, false);
        bnl0.m105524M(_view.f26471A, false);
        bnl0.m105509E0(_view, new View.OnClickListener() { // from class: l.k8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l8y.m153304h(this.f124423a, _view, view);
            }
        });
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: b */
    public boolean mo107168b(@NotNull j8y meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        CoreLikers.C4870a likersData = meetEntranceData.getLikersData();
        List<User> list = likersData != null ? likersData.f20014d : null;
        List<User> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            CoreLikers.C4870a likersData2 = meetEntranceData.getLikersData();
            list = likersData2 != null ? likersData2.f20015e : null;
        }
        if (list != null && (!list.isEmpty())) {
            this.totalLikersUsers = list.get(0);
            CoreLikers.C4870a likersData3 = meetEntranceData.getLikersData();
            this.totalLikersCount = likersData3 != null ? likersData3.f20012b : 0;
        }
        return true;
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: c */
    public boolean mo107169c() {
        return (joa.m146361M3() || this.totalLikersUsers == null) ? false : true;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: d */
    public /* bridge */ String mo107170d() {
        return super.mo107170d();
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo107171e() {
        return super.mo107171e();
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: f */
    public int mo107172f() {
        return gra.m131778z() ? dbc0.f86890cf : dbc0.f86857bf;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo107173g() {
        String str;
        if (this.totalLikersCount == 0) {
            return "解锁后可立即配对聊天";
        }
        ArrayList arrayList = new ArrayList();
        User user = this.totalLikersUsers;
        if (user == null) {
            return "解锁后可立即配对聊天";
        }
        String str2 = user.isFemale() ? "她" : "他";
        boolean zM141060B3 = CoreModule.f18264c.f20303E0.m141060B3(user);
        int i = user.location.distance;
        if (!zM141060B3 && i < 10000 && i >= 100) {
            if (i < 1000) {
                str = i + "m";
            } else {
                str = (i / 1000.0f) + "km";
            }
            SpannableStringBuilder spannableStringBuilderM175798d0 = q8g0.m175798d0(str2 + "仅离你" + str + "，想和你认识", jyb.m147507f0(str), jyb.m147507f0(Integer.valueOf(mo107171e())), Typeface.create(lyh0.m156283c(2), 1), qa00.m175861f(13));
            spannableStringBuilderM175798d0.getClass();
            arrayList.add(spannableStringBuilderM175798d0);
        }
        arrayList.add(str2.concat("觉得你很特别，想和你认识"));
        arrayList.add(str2.concat("正在等待你的回复，快去看看吧"));
        return (CharSequence) arrayList.get(gkc0.m130573a(0, arrayList.size()));
    }

    @Override // p153l.bzl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM61308fp;
        User user = this.totalLikersUsers;
        if (user == null || (pictureM61308fp = user.m61308fp()) == null) {
            return null;
        }
        return pictureM61308fp.profileSmall();
    }

    @Override // p153l.bzl
    @NotNull
    public CharSequence getTitle() {
        int i = this.totalLikersCount;
        if (i == 0) {
            return "查看喜欢我的人";
        }
        String strM96566a = a9g0.m96566a(i, 999L);
        SpannableStringBuilder spannableStringBuilderM175798d0 = q8g0.m175798d0("解锁" + strM96566a + "个喜欢我的人", jyb.m147507f0(strM96566a), jyb.m147507f0(Integer.valueOf(mo107171e())), Typeface.create(lyh0.m156283c(2), 1), qa00.m175861f(15));
        spannableStringBuilderM175798d0.getClass();
        return spannableStringBuilderM175798d0;
    }
}
