package p153l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerHistoryAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class d15 implements iam<a15> {

    /* JADX INFO: renamed from: a */
    public VFrame f84639a;

    /* JADX INFO: renamed from: b */
    public VImage f84640b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f84641c;

    /* JADX INFO: renamed from: d */
    public VLinear f84642d;

    /* JADX INFO: renamed from: e */
    public ChatPartnerHistoryAct f84643e;

    /* JADX INFO: renamed from: f */
    public a15 f84644f;

    /* JADX INFO: renamed from: g */
    public C16415b f84645g;

    /* JADX INFO: renamed from: l.d15$a */
    public class C16414a extends jic0<User> {

        /* JADX INFO: renamed from: c */
        public final List<User> f84646c;

        public C16414a(List<User> list) {
            ArrayList arrayList = new ArrayList();
            this.f84646c = arrayList;
            arrayList.addAll(list);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f84646c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(d15.this.getContext()).inflate(kec0.f125857h1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final User user, int i, int i2) {
            int iM175859d = (qa00.m175859d(30.0f) * bnl0.m105592y0()) / qa00.m175859d(375.0f);
            bnl0.m105507D0(iM175859d, view);
            bnl0.m105505C0(view, iM175859d);
            uqb0.f180374G.m127115L0((VDraweeView) view, user.m61308fp().profileSmall().formatted());
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.c15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f79334a.m113502H(user, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f84646c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m113502H(User user, View view) {
            i4g0.m138520r("e_chat_avatar", d15.this.act().pageId());
            xwa.m213304D(d15.this.act(), Uri.parse(String.format("tantanapp://jumpChat?uid=%s", user.f56859id)));
        }
    }

    /* JADX INFO: renamed from: l.d15$b */
    public class C16415b extends jic0<ChatPartnersHistoryItem> {

        /* JADX INFO: renamed from: c */
        public List<ChatPartnersHistoryItem> f84648c;

        public C16415b() {
            this.f84648c = new ArrayList();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.f84648c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(d15.this.getContext()).inflate(kec0.f125874i1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, ChatPartnersHistoryItem chatPartnersHistoryItem, int i, int i2) {
            VText vText = (VText) view.findViewById(adc0.f70409je);
            VText vText2 = (VText) view.findViewById(adc0.f70274be);
            VRecyclerView vRecyclerView = (VRecyclerView) view.findViewById(adc0.f70301d7);
            VText vText3 = (VText) view.findViewById(adc0.f70499p2);
            vText.setText(chatPartnersHistoryItem.messageValue);
            vText2.setText(new m8c("yyyy.MM.dd HH.mm", Locale.getDefault()).m157356a().format(Double.valueOf(chatPartnersHistoryItem.createdTime)));
            vText3.setText(String.format(Locale.CHINA, "找到%d个好友", Integer.valueOf(chatPartnersHistoryItem.userIds.size())));
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = chatPartnersHistoryItem.userIds.iterator();
            while (it.hasNext()) {
                User userM95449l0 = d15.this.f84644f.m95449l0(it.next());
                if (NullChecker.m82486a(userM95449l0)) {
                    arrayList.add(userM95449l0);
                }
            }
            vRecyclerView.setAdapter(d15.this.new C16414a(arrayList));
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public ChatPartnersHistoryItem getItem(int i) {
            return this.f84648c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m113505G(List<ChatPartnersHistoryItem> list) {
            this.f84648c = list;
            notifyDataSetChanged();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
            if (this.f84648c.size() <= 0 || this.f84648c.size() - i >= 3) {
                return;
            }
            d15.this.f84644f.m95447b();
        }
    }

    public d15(ChatPartnerHistoryAct chatPartnerHistoryAct) {
        this.f84643e = chatPartnerHistoryAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m113494e(View view) {
        act().m68056e2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84643e;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f84643e;
    }

    /* JADX INFO: renamed from: c */
    public View m113495c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f15.m123555b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a15 a15Var) {
        this.f84644f = a15Var;
    }

    /* JADX INFO: renamed from: f */
    public void m113497f(List<ChatPartnersHistoryItem> list) {
        bnl0.m105524M(this.f84642d, jyb.m147479J(list));
        this.f84645g.m113505G(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m113495c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m113498r() {
        bnl0.m105509E0(this.f84640b, new View.OnClickListener() { // from class: l.b15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74320a.m113494e(view);
            }
        });
        C16415b c16415b = new C16415b();
        this.f84645g = c16415b;
        this.f84641c.setAdapter(c16415b);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
