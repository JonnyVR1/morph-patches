package p003l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.messages.C0107b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.l6c0;
import l.o7r;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import p028v.AutoVDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cek extends dac0<ChatGroupMember> {

    /* JADX INFO: renamed from: c */
    public List<ChatGroupMember> f2625c;

    /* JADX INFO: renamed from: d */
    public Act f2626d;

    /* JADX INFO: renamed from: e */
    public String f2627e;

    /* JADX INFO: renamed from: l.cek$a */
    public class C0198a implements C0107b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ChatGroupMember f2628a;

        public C0198a(ChatGroupMember chatGroupMember) {
            this.f2628a = chatGroupMember;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: a */
        public String mo1506a() {
            return this.f2628a.userId;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: b */
        public String mo1507b() {
            return cek.this.f2627e;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: c */
        public boolean mo1508c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.cek$b */
    public class ViewOnClickListenerC0199b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f2630a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ChatGroupMember f2631b;

        public ViewOnClickListenerC0199b(User user, ChatGroupMember chatGroupMember) {
            this.f2630a = user;
            this.f2631b = chatGroupMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (wdk.m8551d(this.f2630a)) {
                return;
            }
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(this.f2631b.groupId);
            cek.this.f2626d.startActivity(tbk.m7711e(cek.this.f2626d, this.f2631b.userId, (NullChecker.a(chatGroupS6) && tbk.m7725s(chatGroupS6)) ? "chat_group_anonymity" : "chat_group"));
        }
    }

    public cek(Act act, String str, @NonNull List<ChatGroupMember> list) {
        this.f2626d = act;
        this.f2627e = str;
        this.f2625c = list;
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: C */
    public int mo203C() {
        return this.f2625c.size();
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: D */
    public View mo204D(ViewGroup viewGroup, int i) {
        return o7r.a(viewGroup.getContext()).inflate(l6c0.g, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, com.facebook.drawee.view.SimpleDraweeView, v.AutoVDraweeView] */
    @Override // p003l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo202A(View view, ChatGroupMember chatGroupMember, int i, int i2) {
        User userById = CoreModule.K().getUserById(chatGroupMember.userId);
        C0107b.m2164r(view, new C0198a(chatGroupMember), new ViewOnClickListenerC0199b(userById, chatGroupMember));
        ?? r4 = (AutoVDraweeView) view.findViewById(y4c0.p);
        AppCompatTextView appCompatTextView = (VText) view.findViewById(y4c0.E2);
        AppCompatTextView appCompatTextView2 = (VText) view.findViewById(y4c0.d1);
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(chatGroupMember.groupId);
        if (NullChecker.a(chatGroupS6) && tbk.m7725s(chatGroupS6)) {
            r4.setBackgroundResource(c3c0.I0);
            r4.setImageUrl(tbk.m7716j(chatGroupMember));
        } else if (TextUtils.isEmpty(chatGroupMember.avatar)) {
            qib0.G.Y0((SimpleDraweeView) r4, c3c0.I0);
        } else if (TextUtils.equals(chatGroupMember.userId, CoreModule.H().userId())) {
            r4.setImageUrl(NullChecker.a(userById) ? ((Media) userById.pictures.get(0)).url : chatGroupMember.avatar);
        } else if (NullChecker.a(userById) && userById.isBanedOrInactivated()) {
            qib0.G.Y0((SimpleDraweeView) r4, CoreModule.P().i().T0());
        } else {
            r4.setImageUrl(chatGroupMember.avatar);
        }
        if (NullChecker.a(userById) && !userById.isMe() && userById.isBanedOrInactivated()) {
            appCompatTextView.setText(userById.publicId);
        } else {
            appCompatTextView.setText(chatGroupMember.groupMemberName());
        }
        xdl0.M(appCompatTextView2, true);
        if (NullChecker.a(chatGroupS6) && TextUtils.equals(chatGroupS6.ownerUserId, chatGroupMember.userId)) {
            appCompatTextView2.setText(R.string.P);
            appCompatTextView2.setBackgroundResource(c3c0.z0);
        } else if (!NullChecker.a(chatGroupS6) || vwb.J(chatGroupS6.adminUserIds) || !chatGroupS6.adminUserIds.contains(chatGroupMember.userId)) {
            xdl0.M(appCompatTextView2, false);
        } else {
            appCompatTextView2.setText(R.string.S);
            appCompatTextView2.setBackgroundResource(c3c0.y0);
        }
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ChatGroupMember getItem(int i) {
        return this.f2625c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m3255I(@NonNull List<ChatGroupMember> list) {
        this.f2625c = list;
    }
}
