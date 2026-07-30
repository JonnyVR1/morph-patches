package p009l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.meet.MeetAct;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import l.eqh0;
import l.j760;
import l.t0g0;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.zbc0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006\""}, d2 = {"Ll/ozx;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "totalLikersUsers", "I", "totalLikersCount", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ozx implements jwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User totalLikersUsers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int totalLikersCount;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static void m20074h(ozx ozxVar, BusinessConversationView businessConversationView, View view) {
        zvf0.u("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", ozxVar.mo12329d())});
        businessConversationView.getContext().startActivity(MeetAct.m4580Y1(businessConversationView.getContext(), "", "see"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.jwl
    /* JADX INFO: renamed from: a */
    public void mo12327a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.M(_view.f4513i, false);
        _view.f4512h.setBackgroundResource(0);
        xdl0.h0(_view.f4512h, t100.d(3.0f));
        xdl0.M(_view.f4525u, false);
        xdl0.M(_view.f4530z, false);
        xdl0.M(_view.f4507A, false);
        xdl0.E0(_view, new View.OnClickListener() { // from class: l.nzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ozx.m20074h(this.f17787a, _view, view);
            }
        });
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo11182b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        CoreLikers.a likersData = meetEntranceData.getLikersData();
        List list = likersData != null ? likersData.d : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            CoreLikers.a likersData2 = meetEntranceData.getLikersData();
            list = likersData2 != null ? likersData2.e : null;
        }
        if (list != null && (!list.isEmpty())) {
            this.totalLikersUsers = (User) list.get(0);
            CoreLikers.a likersData3 = meetEntranceData.getLikersData();
            this.totalLikersCount = likersData3 != null ? likersData3.b : 0;
        }
        return true;
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo12328c() {
        return (xma.L3() || this.totalLikersUsers == null) ? false : true;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public /* bridge */ String mo12329d() {
        return super.mo12329d();
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo14718e() {
        return super.mo14718e();
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: f */
    public int mo12330f() {
        return upa.z() ? x2c0.oe : x2c0.ne;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo12331g() {
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
        boolean zB3 = CoreModule.c.E0.B3(user);
        int i = user.location.distance;
        if (!zB3 && i < 10000 && i >= 100) {
            if (i < 1000) {
                str = i + "m";
            } else {
                str = (i / 1000.0f) + "km";
            }
            SpannableStringBuilder spannableStringBuilderM16131d0 = i0g0.m16131d0(str2 + "仅离你" + str + "，想和你认识", vwb.f0(new String[]{str}), vwb.f0(new Integer[]{Integer.valueOf(mo14718e())}), Typeface.create(eqh0.c(2), 1), t100.f(13));
            spannableStringBuilderM16131d0.getClass();
            arrayList.add(spannableStringBuilderM16131d0);
        }
        arrayList.add(str2.concat("觉得你很特别，想和你认识"));
        arrayList.add(str2.concat("正在等待你的回复，快去看看吧"));
        return (CharSequence) arrayList.get(zbc0.a(0, arrayList.size()));
    }

    @Override // p009l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureFp;
        User user = this.totalLikersUsers;
        if (user == null || (pictureFp = user.fp()) == null) {
            return null;
        }
        return pictureFp.profileSmall();
    }

    @Override // p009l.jwl
    @NotNull
    public CharSequence getTitle() {
        int i = this.totalLikersCount;
        if (i == 0) {
            return "查看喜欢我的人";
        }
        String strA = t0g0.a(i, 999L);
        SpannableStringBuilder spannableStringBuilderM16131d0 = i0g0.m16131d0("解锁" + strA + "个喜欢我的人", vwb.f0(new String[]{strA}), vwb.f0(new Integer[]{Integer.valueOf(mo14718e())}), Typeface.create(eqh0.c(2), 1), t100.f(15));
        spannableStringBuilderM16131d0.getClass();
        return spannableStringBuilderM16131d0;
    }
}
