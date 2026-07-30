package p009l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Picture;
import kotlin.Metadata;
import l.d30;
import l.da;
import l.eqh0;
import l.j760;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ll/lzx;", "Ll/jwl;", "<init>", "()V", "Ll/mzx;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/mzx;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", "d", "()Ljava/lang/String;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class lzx implements jwl {
    /* JADX INFO: renamed from: i */
    public static void m18133i(lzx lzxVar, final MeetEntranceModel meetEntranceModel, View view) {
        zvf0.u("e_red_dot_message_see", "p_messages_view", new j760[]{vwb.Y("guidance_type", lzxVar.mo12329d())});
        CoreModule.c.m1.G5();
        CoreModule.c.m1.J5();
        if (CoreModule.c.c2.t3()) {
            da.Companion.q(meetEntranceModel.m6467A());
        } else {
            da.Companion.u(meetEntranceModel.m6467A(), false, "p_message,accelerate_guide", new d30() { // from class: l.kzx
                public final void call() {
                    lzx.m18134j(meetEntranceModel);
                }
            });
            meetEntranceModel.m6468B();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m18134j(MeetEntranceModel meetEntranceModel) {
        da.Companion.q(meetEntranceModel.m6467A());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.jwl
    /* JADX INFO: renamed from: a */
    public void mo12327a(@NotNull final MeetEntranceModel viewModel, @NotNull BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        xdl0.M(_view.f4513i, false);
        xdl0.h0(_view.f4512h, t100.d(7.0f));
        _view.f4512h.setBackgroundResource(x2c0.ee);
        _view.f4525u.setImageResource(0);
        xdl0.M(_view.f4525u, false);
        xdl0.M(_view.f4530z, false);
        xdl0.M(_view.f4507A, false);
        xdl0.E0(_view, new View.OnClickListener() { // from class: l.jzx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lzx.m18133i(this.f15373a, viewModel, view);
            }
        });
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: b */
    public boolean mo11182b(@NotNull mzx meetEntranceData, boolean acceleratePairStrategyEnable) {
        meetEntranceData.getClass();
        if (acceleratePairStrategyEnable) {
            return CoreModule.c.m1.h4();
        }
        return false;
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: c */
    public boolean mo12328c() {
        return false;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo12329d() {
        return "boost";
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: e */
    public /* bridge */ int mo14718e() {
        return super.mo14718e();
    }

    @Override // p009l.jwl
    /* JADX INFO: renamed from: f */
    public int mo12330f() {
        return upa.z() ? x2c0.bg : x2c0.ie;
    }

    @Override // p009l.jwl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo12331g() {
        return "卡片排在首位，让更多人优先看到你";
    }

    @Override // p009l.jwl
    @Nullable
    public Picture.ImageUri getAvatar() {
        return null;
    }

    @Override // p009l.jwl
    @NotNull
    public CharSequence getTitle() {
        SpannableStringBuilder spannableStringBuilderM16131d0 = i0g0.m16131d0("最高收获10倍喜欢", vwb.f0(new String[]{"10"}), vwb.f0(new Integer[]{Integer.valueOf(mo14718e())}), Typeface.create(eqh0.c(2), 1), t100.f(15));
        spannableStringBuilderM16131d0.getClass();
        return spannableStringBuilderM16131d0;
    }
}
