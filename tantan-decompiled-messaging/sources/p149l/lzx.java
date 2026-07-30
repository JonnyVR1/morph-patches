package p149l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/lzx;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class lzx implements jwl {
    /* JADX INFO: renamed from: i */
    public static void m152406i(lzx lzxVar, final MeetEntranceModel meetEntranceModel, View view) {
        zvf0.m220399u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, vwb.m200311Y("guidance_type", lzxVar.mo104778d()));
        CoreModule.f17545c.f19664m1.m34689G5();
        CoreModule.f17545c.f19664m1.m34693J5();
        if (CoreModule.f17545c.f19635c2.m99148t3()) {
            C16319da.INSTANCE.m110515q(meetEntranceModel.m42315A());
        } else {
            C16319da.INSTANCE.m110519u(meetEntranceModel.m42315A(), false, "p_message,accelerate_guide", new d30() { // from class: l.kzx
                @Override // p149l.d30
                public final void call() {
                    lzx.m152407j(meetEntranceModel);
                }
            });
            meetEntranceModel.m42316B();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m152407j(MeetEntranceModel meetEntranceModel) {
        C16319da.INSTANCE.m110515q(meetEntranceModel.m42315A());
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: a */
    public void mo104776a(@NotNull final MeetEntranceModel viewModel, @NotNull BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.m208344M(_view.f25735i, false);
        xdl0.m208378h0(_view.f25734h, t100.m186890d(7.0f));
        _view.f25734h.setBackgroundResource(x2c0.f190107ee);
        _view.f25747u.setImageResource(0);
        xdl0.m208344M(_view.f25747u, false);
        xdl0.m208344M(_view.f25752z, false);
        xdl0.m208344M(_view.f25729A, false);
        xdl0.m208329E0(_view, new View.OnClickListener() { // from class: l.jzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lzx.m152406i(this.f120429a, viewModel, view);
            }
        });
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo94500b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        if (acceleratePairStrategyEnable) {
            return CoreModule.f17545c.f19664m1.m34714h4();
        }
        return false;
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo104777c() {
        return false;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo104778d() {
        return "boost";
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo124031e() {
        return super.mo124031e();
    }

    @Override // p149l.jwl
    /* JADX INFO: renamed from: f */
    public int mo104779f() {
        return upa.m194847z() ? x2c0.f190014bg : x2c0.f190235ie;
    }

    @Override // p149l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo104780g() {
        return "卡片排在首位，让更多人优先看到你";
    }

    @Override // p149l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        return null;
    }

    @Override // p149l.jwl
    @NotNull
    public CharSequence getTitle() {
        SpannableStringBuilder spannableStringBuilderM133863d0 = i0g0.m133863d0("最高收获10倍喜欢", vwb.m200324f0(com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), vwb.m200324f0(Integer.valueOf(mo124031e())), Typeface.create(eqh0.m117752c(2), 1), t100.m186892f(15));
        spannableStringBuilderM133863d0.getClass();
        return spannableStringBuilderM133863d0;
    }
}
