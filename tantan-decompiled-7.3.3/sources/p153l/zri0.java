package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class zri0 implements qbm {

    /* JADX INFO: renamed from: a */
    public yxz f205765a;

    /* JADX INFO: renamed from: b */
    public tvz f205766b;

    /* JADX INFO: renamed from: c */
    public vxd0 f205767c;

    /* JADX INFO: renamed from: d */
    public List<BreakIce> f205768d = new ArrayList();

    public zri0(yxz yxzVar, tvz tvzVar) {
        this.f205765a = yxzVar;
        this.f205766b = tvzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Boolean m221166e(List list) {
        this.f205768d.addAll(list);
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    @Override // p153l.qbm
    /* JADX INFO: renamed from: a */
    public boolean mo119523a(@Nullable Conversation conversation, @Nullable User user) {
        if (!TextUtils.isEmpty(this.f205766b.act().getIntent().getStringExtra("autoSendMessage")) || h39.m133428Q()) {
            return false;
        }
        if ((h39.m133422K() && NullChecker.m82486a(conversation) && (conversation.isFakeHeartbeatConv() || conversation.isFakeQuickChatConv())) || this.f205766b.m193318vg()) {
            return false;
        }
        MsgIcebreakType msgIcebreakTypeM133447k = h39.m133447k();
        if (msgIcebreakTypeM133447k != MsgIcebreakType.ALL && msgIcebreakTypeM133447k != MsgIcebreakType.TEXT_BREAK && !this.f205766b.f176345Z0) {
            return false;
        }
        if (h39.m133439c() && (!h39.m133437a() || (conversation != null && !TextUtils.isEmpty(conversation.localDraft)))) {
            return false;
        }
        this.f205767c = new vxd0("break_ice_show_count" + CoreModule.m30929H().userId() + "/" + this.f205766b.mo111034r3() + "/" + pzi0.m174459t(), 0);
        if ((!CoreModule.m30933P().m143412i().mo180431Z0() && !m221167d(conversation)) || this.f205766b.mo110970e4() || !NullChecker.m82486a(user) || user.isTeamAccount() || user.unilateralBlock() || ((NullChecker.m82486a(conversation) && TEnum.equals(conversation.status, "dismissed")) || (this.f205767c.get().intValue() >= CoreModule.m30933P().m143412i().mo180380Q0() && !this.f205766b.f176345Z0))) {
            return false;
        }
        if (h39.m133437a()) {
            return NullChecker.m82486a(conversation) && TextUtils.isEmpty(conversation.localDraft);
        }
        return true;
    }

    @Override // p153l.qbm
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22421c<Boolean> mo119524b() {
        ArrayList arrayList = new ArrayList();
        if (this.f205766b.f176345Z0) {
            arrayList.add("hello，在干嘛呢？");
            arrayList.add("hi ，在干嘛呢？");
        }
        return CoreModule.f18264c.f20381e0.m116574j7(this.f205766b.m110989i3(), "", arrayList).map(new qcj() { // from class: l.yri0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201326a.m221166e((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m221167d(Conversation conversation) {
        if (CoreModule.m30933P().m143412i().mo180542u() && NullChecker.m82486a(conversation) && conversation.isHeartbeatConv() && TEnum.equals(conversation.status, ConversationStatus.get("default"))) {
            return (NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.heartbeatMatch) && ((long) conversation.additional.heartbeatMatch.expireTime) < pzi0.m174454o()) ? false : true;
        }
        return false;
    }

    @Override // p153l.qbm
    public boolean handle() {
        if (h39.m133439c()) {
            return this.f205765a.m217878h5(this.f205768d);
        }
        if (NullChecker.m82486a(this.f205767c)) {
            vxd0 vxd0Var = this.f205767c;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        }
        CoreModule.f18264c.f20384f0.m33861Xg(this.f205766b.m110989i3(), this.f205768d);
        return true;
    }
}
