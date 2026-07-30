package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class zii0 implements a9m {

    /* JADX INFO: renamed from: a */
    public bpz f203334a;

    /* JADX INFO: renamed from: b */
    public wmz f203335b;

    /* JADX INFO: renamed from: c */
    public tpd0 f203336c;

    /* JADX INFO: renamed from: d */
    public List<BreakIce> f203337d = new ArrayList();

    public zii0(bpz bpzVar, wmz wmzVar) {
        this.f203334a = bpzVar;
        this.f203335b = wmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Boolean m219027e(List list) {
        this.f203337d.addAll(list);
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    @Override // p149l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo95447a(@Nullable Conversation conversation, @Nullable User user) {
        if (!TextUtils.isEmpty(this.f203335b.act().getIntent().getStringExtra("autoSendMessage")) || y19.m212157Q()) {
            return false;
        }
        if ((y19.m212151K() && NullChecker.m81303a(conversation) && (conversation.isFakeHeartbeatConv() || conversation.isFakeQuickChatConv())) || this.f203335b.m204530vg()) {
            return false;
        }
        MsgIcebreakType msgIcebreakTypeM212176k = y19.m212176k();
        if (msgIcebreakTypeM212176k != MsgIcebreakType.ALL && msgIcebreakTypeM212176k != MsgIcebreakType.TEXT_BREAK && !this.f203335b.f187208Z0) {
            return false;
        }
        if (y19.m212168c() && (!y19.m212166a() || (conversation != null && !TextUtils.isEmpty(conversation.localDraft)))) {
            return false;
        }
        this.f203336c = new tpd0("break_ice_show_count" + CoreModule.m29931H().userId() + "/" + this.f203335b.mo120828r3() + "/" + mqi0.m155949t(), 0);
        if ((!CoreModule.m29935P().m94658i().mo158339Z0() && !m219028d(conversation)) || this.f203335b.mo120764e4() || !NullChecker.m81303a(user) || user.isTeamAccount() || user.unilateralBlock() || ((NullChecker.m81303a(conversation) && TEnum.equals(conversation.status, "dismissed")) || (this.f203336c.get().intValue() >= CoreModule.m29935P().m94658i().mo158288Q0() && !this.f203335b.f187208Z0))) {
            return false;
        }
        if (y19.m212166a()) {
            return NullChecker.m81303a(conversation) && TextUtils.isEmpty(conversation.localDraft);
        }
        return true;
    }

    @Override // p149l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C22306c<Boolean> mo95448b() {
        ArrayList arrayList = new ArrayList();
        if (this.f203335b.f187208Z0) {
            arrayList.add("hello，在干嘛呢？");
            arrayList.add("hi ，在干嘛呢？");
        }
        return CoreModule.f17545c.f19639e0.m169501j7(this.f203335b.m120783i3(), "", arrayList).map(new w9j() { // from class: l.yii0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198503a.m219027e((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m219028d(Conversation conversation) {
        if (CoreModule.m29935P().m94658i().mo158450u() && NullChecker.m81303a(conversation) && conversation.isHeartbeatConv() && TEnum.equals(conversation.status, ConversationStatus.get("default"))) {
            return (NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.heartbeatMatch) && ((long) conversation.additional.heartbeatMatch.expireTime) < mqi0.m155944o()) ? false : true;
        }
        return false;
    }

    @Override // p149l.a9m
    public boolean handle() {
        if (y19.m212168c()) {
            return this.f203334a.m103237h5(this.f203337d);
        }
        if (NullChecker.m81303a(this.f203336c)) {
            tpd0 tpd0Var = this.f203336c;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        }
        CoreModule.f17545c.f19642f0.m32858Xg(this.f203335b.m120783i3(), this.f203337d);
        return true;
    }
}
