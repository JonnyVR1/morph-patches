package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.wmz;
import l.y19;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zii0 implements a9m {

    /* JADX INFO: renamed from: a */
    public bpz f9365a;

    /* JADX INFO: renamed from: b */
    public wmz f9366b;

    /* JADX INFO: renamed from: c */
    public tpd0 f9367c;

    /* JADX INFO: renamed from: d */
    public List<BreakIce> f9368d = new ArrayList();

    public zii0(bpz bpzVar, wmz wmzVar) {
        this.f9365a = bpzVar;
        this.f9366b = wmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ Boolean m9426e(List list) {
        this.f9368d.addAll(list);
        return Boolean.valueOf(!vwb.J(list));
    }

    @Override // p003l.a9m
    /* JADX INFO: renamed from: a */
    public boolean mo2765a(@Nullable Conversation conversation, @Nullable User user) {
        if (!TextUtils.isEmpty(this.f9366b.act().getIntent().getStringExtra("autoSendMessage")) || y19.Q()) {
            return false;
        }
        if ((y19.K() && NullChecker.a(conversation) && (conversation.isFakeHeartbeatConv() || conversation.isFakeQuickChatConv())) || this.f9366b.vg()) {
            return false;
        }
        MsgIcebreakType msgIcebreakTypeK = y19.k();
        if (msgIcebreakTypeK != MsgIcebreakType.ALL && msgIcebreakTypeK != MsgIcebreakType.TEXT_BREAK && !this.f9366b.Z0) {
            return false;
        }
        if (y19.c() && (!y19.a() || (conversation != null && !TextUtils.isEmpty(conversation.localDraft)))) {
            return false;
        }
        this.f9367c = new tpd0("break_ice_show_count" + CoreModule.H().userId() + "/" + this.f9366b.r3() + "/" + mqi0.t(), 0);
        if ((!CoreModule.P().i().Z0() && !m9427d(conversation)) || this.f9366b.m4231e4() || !NullChecker.a(user) || user.isTeamAccount() || user.unilateralBlock() || ((NullChecker.a(conversation) && TEnum.equals(conversation.status, "dismissed")) || (((Integer) this.f9367c.get()).intValue() >= CoreModule.P().i().Q0() && !this.f9366b.Z0))) {
            return false;
        }
        if (y19.a()) {
            return NullChecker.a(conversation) && TextUtils.isEmpty(conversation.localDraft);
        }
        return true;
    }

    @Override // p003l.a9m
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1099c<Boolean> mo2766b() {
        ArrayList arrayList = new ArrayList();
        if (this.f9366b.Z0) {
            arrayList.add("hello，在干嘛呢？");
            arrayList.add("hi ，在干嘛呢？");
        }
        return CoreModule.c.e0.j7(this.f9366b.m4250i3(), "", arrayList).map(new w9j() { // from class: l.yii0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f9075a.m9426e((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m9427d(Conversation conversation) {
        if (CoreModule.P().i().u() && NullChecker.a(conversation) && conversation.isHeartbeatConv() && TEnum.equals(conversation.status, ConversationStatus.get(ServletHandler.__DEFAULT_SERVLET))) {
            return (NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.heartbeatMatch) && ((long) conversation.additional.heartbeatMatch.expireTime) < mqi0.o()) ? false : true;
        }
        return false;
    }

    @Override // p003l.a9m
    public boolean handle() {
        if (y19.c()) {
            return this.f9365a.m3117h5(this.f9368d);
        }
        if (NullChecker.a(this.f9367c)) {
            tpd0 tpd0Var = this.f9367c;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        }
        CoreModule.c.f0.Xg(this.f9366b.m4250i3(), this.f9368d);
        return true;
    }
}
