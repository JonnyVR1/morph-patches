package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class cek extends dac0<ChatGroupMember> {

    /* JADX INFO: renamed from: c */
    public List<ChatGroupMember> f80466c;

    /* JADX INFO: renamed from: d */
    public Act f80467d;

    /* JADX INFO: renamed from: e */
    public String f80468e;

    /* JADX INFO: renamed from: l.cek$a */
    public class C16114a implements C8524b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatGroupMember f80469a;

        public C16114a(ChatGroupMember chatGroupMember) {
            this.f80469a = chatGroupMember;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: a */
        public String mo48422a() {
            return this.f80469a.userId;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: b */
        public String mo48423b() {
            return cek.this.f80468e;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: c */
        public boolean mo48424c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.cek$b */
    public class ViewOnClickListenerC16115b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f80471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChatGroupMember f80472b;

        public ViewOnClickListenerC16115b(User user, ChatGroupMember chatGroupMember) {
            this.f80471a = user;
            this.f80472b = chatGroupMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (wdk.m202744d(this.f80471a)) {
                return;
            }
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(this.f80472b.groupId);
            cek.this.f80467d.startActivity(tbk.m187858e(cek.this.f80467d, this.f80472b.userId, (NullChecker.m81303a(chatGroupM31920s6) && tbk.m187872s(chatGroupM31920s6)) ? "chat_group_anonymity" : "chat_group"));
        }
    }

    public cek(Act act, String str, @NonNull List<ChatGroupMember> list) {
        this.f80467d = act;
        this.f80468e = str;
        this.f80466c = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f80466c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126473g, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, ChatGroupMember chatGroupMember, int i, int i2) {
        User userById = CoreModule.m29932K().getUserById(chatGroupMember.userId);
        C8524b.m49066r(view, new C16114a(chatGroupMember), new ViewOnClickListenerC16115b(userById, chatGroupMember));
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) view.findViewById(y4c0.f196192p);
        VText vText = (VText) view.findViewById(y4c0.f195958E2);
        VText vText2 = (VText) view.findViewById(y4c0.f196110d1);
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(chatGroupMember.groupId);
        if (NullChecker.m81303a(chatGroupM31920s6) && tbk.m187872s(chatGroupM31920s6)) {
            autoVDraweeView.setBackgroundResource(c3c0.f78540I0);
            autoVDraweeView.setImageUrl(tbk.m187863j(chatGroupMember));
        } else if (TextUtils.isEmpty(chatGroupMember.avatar)) {
            qib0.f154691G.m102354Y0(autoVDraweeView, c3c0.f78540I0);
        } else if (TextUtils.equals(chatGroupMember.userId, CoreModule.m29931H().userId())) {
            autoVDraweeView.setImageUrl(NullChecker.m81303a(userById) ? userById.pictures.get(0).url : chatGroupMember.avatar);
        } else if (NullChecker.m81303a(userById) && userById.isBanedOrInactivated()) {
            qib0.f154691G.m102354Y0(autoVDraweeView, CoreModule.m29935P().m94658i().mo158306T0());
        } else {
            autoVDraweeView.setImageUrl(chatGroupMember.avatar);
        }
        if (NullChecker.m81303a(userById) && !userById.isMe() && userById.isBanedOrInactivated()) {
            vText.setText(userById.publicId);
        } else {
            vText.setText(chatGroupMember.groupMemberName());
        }
        xdl0.m208344M(vText2, true);
        if (NullChecker.m81303a(chatGroupM31920s6) && TextUtils.equals(chatGroupM31920s6.ownerUserId, chatGroupMember.userId)) {
            vText2.setText(R$string.f20828P);
            vText2.setBackgroundResource(c3c0.f78918z0);
        } else if (!NullChecker.m81303a(chatGroupM31920s6) || vwb.m200296J(chatGroupM31920s6.adminUserIds) || !chatGroupM31920s6.adminUserIds.contains(chatGroupMember.userId)) {
            xdl0.m208344M(vText2, false);
        } else {
            vText2.setText(R$string.f20852S);
            vText2.setBackgroundResource(c3c0.f78909y0);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ChatGroupMember getItem(int i) {
        return this.f80466c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m106323I(@NonNull List<ChatGroupMember> list) {
        this.f80466c = list;
    }
}
