package p149l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.meet.MeetAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0016\u0010!\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006\""}, m87232d2 = {"Ll/ozx;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "totalLikersUsers", "I", "totalLikersCount", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ozx implements jwl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public User totalLikersUsers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int totalLikersCount;

    /* JADX INFO: renamed from: h */
    public static void m166892h(ozx ozxVar, BusinessConversationView businessConversationView, View view) {
        zvf0.m220399u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, vwb.m200311Y("guidance_type", ozxVar.mo104778d()));
        businessConversationView.getContext().startActivity(MeetAct.m40494Y1(businessConversationView.getContext(), "", "see"));
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: a */
    public void mo104776a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.m208344M(_view.f25735i, false);
        _view.f25734h.setBackgroundResource(0);
        xdl0.m208378h0(_view.f25734h, t100.m186890d(3.0f));
        xdl0.m208344M(_view.f25747u, false);
        xdl0.m208344M(_view.f25752z, false);
        xdl0.m208344M(_view.f25729A, false);
        xdl0.m208329E0(_view, new View.OnClickListener() { // from class: l.nzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ozx.m166892h(this.f141263a, _view, view);
            }
        });
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo94500b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        CoreLikers.C4719a likersData = meetEntranceData.getLikersData();
        List<User> list = likersData != null ? likersData.f19272d : null;
        List<User> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            CoreLikers.C4719a likersData2 = meetEntranceData.getLikersData();
            list = likersData2 != null ? likersData2.f19273e : null;
        }
        if (list != null && (!list.isEmpty())) {
            this.totalLikersUsers = list.get(0);
            CoreLikers.C4719a likersData3 = meetEntranceData.getLikersData();
            this.totalLikersCount = likersData3 != null ? likersData3.f19270b : 0;
        }
        return true;
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo104777c() {
        return (xma.m210047L3() || this.totalLikersUsers == null) ? false : true;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public /* bridge */ String mo104778d() {
        return super.mo104778d();
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo124031e() {
        return super.mo124031e();
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: f */
    public int mo104779f() {
        return upa.m194847z() ? x2c0.f190425oe : x2c0.f190393ne;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo104780g() {
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
        boolean zM203772B3 = CoreModule.f17545c.f19561E0.m203772B3(user);
        int i = user.location.distance;
        if (!zM203772B3 && i < 10000 && i >= 100) {
            if (i < 1000) {
                str = i + "m";
            } else {
                str = (i / 1000.0f) + "km";
            }
            SpannableStringBuilder spannableStringBuilderM133863d0 = i0g0.m133863d0(str2 + "仅离你" + str + "，想和你认识", vwb.m200324f0(str), vwb.m200324f0(Integer.valueOf(mo124031e())), Typeface.create(eqh0.m117752c(2), 1), t100.m186892f(13));
            spannableStringBuilderM133863d0.getClass();
            arrayList.add(spannableStringBuilderM133863d0);
        }
        arrayList.add(str2.concat("觉得你很特别，想和你认识"));
        arrayList.add(str2.concat("正在等待你的回复，快去看看吧"));
        return (CharSequence) arrayList.get(zbc0.m217835a(0, arrayList.size()));
    }

    @Override // p149l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM60124fp;
        User user = this.totalLikersUsers;
        if (user == null || (pictureM60124fp = user.m60124fp()) == null) {
            return null;
        }
        return pictureM60124fp.profileSmall();
    }

    @Override // p149l.jwl
    @NotNull
    public CharSequence getTitle() {
        int i = this.totalLikersCount;
        if (i == 0) {
            return "查看喜欢我的人";
        }
        String strM186860a = t0g0.m186860a(i, 999L);
        SpannableStringBuilder spannableStringBuilderM133863d0 = i0g0.m133863d0("解锁" + strM186860a + "个喜欢我的人", vwb.m200324f0(strM186860a), vwb.m200324f0(Integer.valueOf(mo124031e())), Typeface.create(eqh0.m117752c(2), 1), t100.m186892f(15));
        spannableStringBuilderM133863d0.getClass();
        return spannableStringBuilderM133863d0;
    }
}
