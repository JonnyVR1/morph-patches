package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class sgk extends jic0<ChatGroupMember> {

    /* JADX INFO: renamed from: c */
    public List<ChatGroupMember> f167881c;

    /* JADX INFO: renamed from: d */
    public Act f167882d;

    /* JADX INFO: renamed from: e */
    public String f167883e;

    /* JADX INFO: renamed from: l.sgk$a */
    public class C20040a implements C8687b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatGroupMember f167884a;

        public C20040a(ChatGroupMember chatGroupMember) {
            this.f167884a = chatGroupMember;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: a */
        public String mo49605a() {
            return this.f167884a.userId;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: b */
        public String mo49606b() {
            return sgk.this.f167883e;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: c */
        public boolean mo49607c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.sgk$b */
    public class ViewOnClickListenerC20041b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f167886a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChatGroupMember f167887b;

        public ViewOnClickListenerC20041b(User user, ChatGroupMember chatGroupMember) {
            this.f167886a = user;
            this.f167887b = chatGroupMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (mgk.m158353d(this.f167886a)) {
                return;
            }
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(this.f167887b.groupId);
            sgk.this.f167882d.startActivity(jek.m144573e(sgk.this.f167882d, this.f167887b.userId, (NullChecker.m82486a(chatGroupM32923s6) && jek.m144587s(chatGroupM32923s6)) ? "chat_group_anonymity" : "chat_group"));
        }
    }

    public sgk(Act act, String str, @NonNull List<ChatGroupMember> list) {
        this.f167882d = act;
        this.f167883e = str;
        this.f167881c = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f167881c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157029g, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, ChatGroupMember chatGroupMember, int i, int i2) {
        User userById = CoreModule.m30930K().getUserById(chatGroupMember.userId);
        C8687b.m50249r(view, new C20040a(chatGroupMember), new ViewOnClickListenerC20041b(userById, chatGroupMember));
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) view.findViewById(edc0.f93427p);
        VText vText = (VText) view.findViewById(edc0.f93193E2);
        VText vText2 = (VText) view.findViewById(edc0.f93345d1);
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(chatGroupMember.groupId);
        if (NullChecker.m82486a(chatGroupM32923s6) && jek.m144587s(chatGroupM32923s6)) {
            autoVDraweeView.setBackgroundResource(ibc0.f113815I0);
            autoVDraweeView.setImageUrl(jek.m144578j(chatGroupMember));
        } else if (TextUtils.isEmpty(chatGroupMember.avatar)) {
            uqb0.f180374G.m127138Y0(autoVDraweeView, ibc0.f113815I0);
        } else if (TextUtils.equals(chatGroupMember.userId, CoreModule.m30929H().userId())) {
            autoVDraweeView.setImageUrl(NullChecker.m82486a(userById) ? userById.pictures.get(0).url : chatGroupMember.avatar);
        } else if (NullChecker.m82486a(userById) && userById.isBanedOrInactivated()) {
            uqb0.f180374G.m127138Y0(autoVDraweeView, CoreModule.m30933P().m143412i().mo180398T0());
        } else {
            autoVDraweeView.setImageUrl(chatGroupMember.avatar);
        }
        if (NullChecker.m82486a(userById) && !userById.isMe() && userById.isBanedOrInactivated()) {
            vText.setText(userById.publicId);
        } else {
            vText.setText(chatGroupMember.groupMemberName());
        }
        bnl0.m105524M(vText2, true);
        if (NullChecker.m82486a(chatGroupM32923s6) && TextUtils.equals(chatGroupM32923s6.ownerUserId, chatGroupMember.userId)) {
            vText2.setText(R$string.f21570P);
            vText2.setBackgroundResource(ibc0.f114193z0);
        } else if (!NullChecker.m82486a(chatGroupM32923s6) || jyb.m147479J(chatGroupM32923s6.adminUserIds) || !chatGroupM32923s6.adminUserIds.contains(chatGroupMember.userId)) {
            bnl0.m105524M(vText2, false);
        } else {
            vText2.setText(R$string.f21594S);
            vText2.setBackgroundResource(ibc0.f114184y0);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ChatGroupMember getItem(int i) {
        return this.f167881c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m185791I(@NonNull List<ChatGroupMember> list) {
        this.f167881c = list;
    }
}
