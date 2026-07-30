package p153l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/i8y;", "Ll/bzl;", "<init>", "()V", "Ll/j8y;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/j8y;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class i8y implements bzl {
    /* JADX INFO: renamed from: i */
    public static void m139038i(i8y i8yVar, final MeetEntranceModel meetEntranceModel, View view) {
        i4g0.m138523u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", i8yVar.mo107170d()));
        CoreModule.f18264c.f20406m1.m35692G5();
        CoreModule.f18264c.f20406m1.m35696J5();
        if (CoreModule.f18264c.f20377c2.m118408t3()) {
            C21545y9.INSTANCE.m214802q(meetEntranceModel.m43326A());
        } else {
            C21545y9.INSTANCE.m214806u(meetEntranceModel.m43326A(), false, "p_message,accelerate_guide", new x20() { // from class: l.h8y
                @Override // p153l.x20
                public final void call() {
                    i8y.m139039j(meetEntranceModel);
                }
            });
            meetEntranceModel.m43327B();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m139039j(MeetEntranceModel meetEntranceModel) {
        C21545y9.INSTANCE.m214802q(meetEntranceModel.m43326A());
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: a */
    public void mo107167a(@NotNull final MeetEntranceModel viewModel, @NotNull BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        bnl0.m105524M(_view.f26477i, false);
        bnl0.m105558h0(_view.f26476h, qa00.m175859d(7.0f));
        _view.f26476h.setBackgroundResource(dbc0.f86567Se);
        _view.f26489u.setImageResource(0);
        bnl0.m105524M(_view.f26489u, false);
        bnl0.m105524M(_view.f26494z, false);
        bnl0.m105524M(_view.f26471A, false);
        bnl0.m105509E0(_view, new View.OnClickListener() { // from class: l.g8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i8y.m139038i(this.f102724a, viewModel, view);
            }
        });
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: b */
    public boolean mo107168b(@NotNull j8y meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        if (acceleratePairStrategyEnable) {
            return CoreModule.f18264c.f20406m1.m35717h4();
        }
        return false;
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: c */
    public boolean mo107169c() {
        return false;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo107170d() {
        return "boost";
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo107171e() {
        return super.mo107171e();
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: f */
    public int mo107172f() {
        return gra.m131778z() ? dbc0.f86473Pg : dbc0.f86695We;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo107173g() {
        return "卡片排在首位，让更多人优先看到你";
    }

    @Override // p153l.bzl
    @Nullable
    public Picture.ImageUri getAvatar() {
        return null;
    }

    @Override // p153l.bzl
    @NotNull
    public CharSequence getTitle() {
        SpannableStringBuilder spannableStringBuilderM175798d0 = q8g0.m175798d0("最高收获10倍喜欢", jyb.m147507f0(com.tencent.connect.common.Constants.VIA_REPORT_TYPE_SHARE_TO_QQ), jyb.m147507f0(Integer.valueOf(mo107171e())), Typeface.create(lyh0.m156283c(2), 1), qa00.m175861f(15));
        spannableStringBuilderM175798d0.getClass();
        return spannableStringBuilderM175798d0;
    }
}
