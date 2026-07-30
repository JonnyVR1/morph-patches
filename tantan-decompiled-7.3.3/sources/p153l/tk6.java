package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p051p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class tk6 extends jic0<Conversation> implements u46 {

    /* JADX INFO: renamed from: c */
    public int f174675c = 0;

    /* JADX INFO: renamed from: d */
    public int f174676d = 0;

    /* JADX INFO: renamed from: e */
    public int f174677e = 0;

    /* JADX INFO: renamed from: f */
    public int f174678f = 0;

    /* JADX INFO: renamed from: g */
    public int f174679g = 0;

    /* JADX INFO: renamed from: h */
    public List<Conversation> f174680h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public List<User> f174681i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<Conversation> f174682j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public List<Conversation> f174683k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<Conversation> f174684l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public List<Message> f174685m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<Message> f174686n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ConversationSearchAct f174687o;

    /* JADX INFO: renamed from: p */
    public String f174688p;

    /* JADX INFO: renamed from: q */
    public int f174689q;

    /* JADX INFO: renamed from: r */
    public boolean f174690r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC20337a f174691s;

    /* JADX INFO: renamed from: l.tk6$a */
    public interface InterfaceC20337a {
        /* JADX INFO: renamed from: a */
        void mo130640a(boolean z);
    }

    public tk6(ConversationSearchAct conversationSearchAct, int i, boolean z, InterfaceC20337a interfaceC20337a) {
        this.f174687o = conversationSearchAct;
        this.f174689q = i;
        this.f174690r = z;
        this.f174691s = interfaceC20337a;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f174680h.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i != 4 && i != 6 && i != 7) {
            if (i == 9) {
                return this.f174687o.inflater().inflate(kec0.f125626T1, viewGroup, false);
            }
            if (i == 5 || i == 8) {
                return p9r.m171370a(this.f174687o).inflate(kec0.f125334B1, viewGroup, false);
            }
            return ue6.m195664Z(this.f174687o, viewGroup, i == 2);
        }
        TextView textView = new TextView(this.f174687o);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.parseColor("#66000000"));
        RecyclerView.C0580p c0580p = new RecyclerView.C0580p(-1, -2);
        ((ViewGroup.MarginLayoutParams) c0580p).topMargin = qa00.f156328o;
        ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin = qa00.f156318e;
        ((ViewGroup.MarginLayoutParams) c0580p).leftMargin = qa00.f156323j;
        textView.setLayoutParams(c0580p);
        return textView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Conversation conversation, final int i, int i2) {
        String str;
        String str2;
        int i3;
        int i4;
        if (i == 4) {
            ((TextView) view).setText(this.f174687o.getText(R$string.f19048Z1));
            return;
        }
        if (i == 6) {
            ((TextView) view).setText("探探ID搜索");
            return;
        }
        if (i == 7) {
            ((TextView) view).setText(this.f174687o.getText(R$string.f18442F1));
            return;
        }
        if (i == 5 || i == 8) {
            TextView textView = (TextView) view.findViewById(adc0.f70658y8);
            ConversationSearchAct conversationSearchAct = this.f174687o;
            textView.setText(i == 5 ? conversationSearchAct.getText(R$string.f19682tj) : conversationSearchAct.getText(R$string.f19651sj));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.sk6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f169232a.m191537J(i, view2);
                }
            });
            return;
        }
        if (i == 9) {
            ((ConversationItemVirtualVoiceGroupView) view).m42058E0(this.f174687o, conversation, i2);
        }
        if (view instanceof ConversationItemView) {
            NewConversationItemView newConversationItemView = (NewConversationItemView) view;
            int i5 = (i2 - this.f174678f) - 1;
            boolean z = false;
            boolean z2 = i5 >= 0 && i5 < this.f174685m.size();
            int i6 = this.f174689q;
            int i7 = ConversationSearchAct.f26695o;
            String str3 = "";
            User user = null;
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (i6 == i7) {
                if (jyb.m147479J(this.f174681i) || i2 <= (i3 = this.f174677e) || ((i4 = this.f174678f) >= 0 && i2 >= i4)) {
                    int i8 = this.f174678f;
                    if (i8 >= 0 && i2 > i8 && z2) {
                        Message message = this.f174685m.get(i5);
                        str3 = message.f56859id;
                        str = message.value;
                        str2 = message.owner;
                        d = message.createdTime;
                    }
                } else {
                    user = this.f174681i.get((i2 - i3) - 1);
                    z = true;
                }
                str = "";
                str2 = str;
            } else if (i6 == ConversationSearchAct.f26694n && z2) {
                Message message2 = this.f174685m.get(i5);
                str3 = message2.f56859id;
                str = message2.value;
                str2 = message2.owner;
                d = message2.createdTime;
            } else {
                str = "";
                str2 = str;
            }
            sj6 sj6Var = new sj6(newConversationItemView, this, conversation);
            sj6Var.f168941p = str3;
            sj6Var.f168942q = str;
            sj6Var.f168943r = str2;
            sj6Var.f168944s = d;
            String str4 = this.f174688p;
            sj6Var.f168945t = str4;
            sj6Var.f168946u = this.f174690r;
            sj6Var.f168940o = true;
            sj6Var.f168926a = conversation;
            sj6Var.f168930e = true;
            sj6Var.f168932g = i2;
            sj6Var.f168950y = str4;
            sj6Var.f168947v = z;
            sj6Var.f168927b = user;
            if (i == 0) {
                newConversationItemView.m42777i4(sj6Var);
                return;
            }
            if (i == 2) {
                newConversationItemView.m42781m4(sj6Var);
            } else if (i == 1) {
                newConversationItemView.m42788t4(sj6Var);
            } else if (i == 3) {
                newConversationItemView.m42782n4(this);
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return i < this.f174680h.size() ? this.f174680h.get(i) : Conversation.new_();
    }

    /* JADX INFO: renamed from: H */
    public final void m191535H(List<Conversation> list, List<User> list2, List<Conversation> list3) {
        int size;
        int i;
        m191536I();
        if (!jyb.m147479J(list)) {
            this.f174675c = 0;
            this.f174676d = list.size() > 3 ? 4 : -1;
            for (int i2 = 0; i2 < Math.min(3, list.size()); i2++) {
                this.f174682j.add(list.get(i2));
            }
        }
        if (!jyb.m147479J(list2)) {
            if (this.f174675c == -1) {
                i = 0;
            } else {
                int size2 = this.f174676d;
                if (size2 == -1) {
                    size2 = list.size();
                }
                i = size2 + 1;
            }
            this.f174677e = i;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                this.f174683k.add(Conversation.new_());
            }
        }
        if (jyb.m147479J(list3)) {
            return;
        }
        int i4 = this.f174677e;
        if (i4 != -1) {
            size = i4 + list2.size() + 1;
        } else if (this.f174675c == -1) {
            size = 0;
        } else {
            int i5 = this.f174676d;
            size = i5 == -1 ? list.size() + 1 : i5 + 1;
        }
        this.f174678f = size;
        int iMin = Math.min(3, list3.size());
        this.f174679g = list3.size() > 3 ? this.f174678f + 4 : -1;
        for (int i6 = 0; i6 < iMin; i6++) {
            this.f174684l.add(list3.get(i6));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m191536I() {
        this.f174675c = -1;
        this.f174676d = -1;
        this.f174677e = -1;
        this.f174678f = -1;
        this.f174679g = -1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m191537J(int i, View view) {
        if (NullChecker.m82486a(this.f174691s)) {
            this.f174691s.mo130640a(i == 5);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m191538K(List<Conversation> list, List<User> list2, List<Conversation> list3, List<Message> list4) {
        this.f174680h.clear();
        this.f174682j.clear();
        this.f174683k.clear();
        this.f174684l.clear();
        this.f174685m.clear();
        this.f174685m.addAll(list4);
        int i = this.f174689q;
        if (i == ConversationSearchAct.f26695o) {
            m191535H(list, list2, list3);
            if (this.f174675c != -1) {
                this.f174680h.add(Conversation.new_());
            }
            this.f174680h.addAll(this.f174682j);
            if (this.f174676d != -1) {
                this.f174680h.add(Conversation.new_());
            }
            if (this.f174677e != -1) {
                this.f174680h.add(Conversation.new_());
            }
            this.f174681i.clear();
            if (!jyb.m147479J(list2)) {
                this.f174681i.addAll(list2);
            }
            this.f174680h.addAll(this.f174683k);
            if (this.f174678f != -1) {
                this.f174680h.add(Conversation.new_());
            }
            this.f174680h.addAll(this.f174684l);
            if (this.f174679g != -1) {
                this.f174680h.add(Conversation.new_());
            }
        } else if (i == ConversationSearchAct.f26693m) {
            this.f174682j = list;
            if (!jyb.m147479J(list)) {
                this.f174680h.addAll(this.f174682j);
            }
        } else if (i == ConversationSearchAct.f26694n) {
            this.f174684l = list3;
            if (!jyb.m147479J(list3)) {
                this.f174680h.add(Conversation.new_());
                this.f174678f = 0;
                this.f174680h.addAll(this.f174684l);
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m191539L(String str) {
        this.f174688p = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f174689q == ConversationSearchAct.f26695o) {
            if (i == this.f174675c) {
                return 4;
            }
            if (i == this.f174676d) {
                return 5;
            }
            if (i == this.f174677e) {
                return 6;
            }
            if (i == this.f174678f) {
                return 7;
            }
            if (i == this.f174679g) {
                return 8;
            }
        }
        Conversation item = getItem(i);
        if (item == null) {
            return 0;
        }
        if (TEnum.equals(item.status, "dismissed")) {
            return 1;
        }
        if (pm6.m172913a(item)) {
            return 2;
        }
        if (fcp.m125024k(item)) {
            return 3;
        }
        return TextUtils.equals(ConversationType.virtualvoice, item.convType) ? 9 : 0;
    }

    @Override // p153l.u46
    /* JADX INFO: renamed from: h */
    public int mo42530h() {
        return this.f174680h.size();
    }

    @Override // p153l.u46
    /* JADX INFO: renamed from: k */
    public List<Conversation> mo42531k() {
        return this.f174680h;
    }

    @Override // p153l.u46
    /* JADX INFO: renamed from: o */
    public int mo42533o() {
        return -1;
    }

    @Override // p153l.u46
    /* JADX INFO: renamed from: q */
    public void mo42534q() {
        notifyDataSetChanged();
    }

    @Override // p153l.u46
    /* JADX INFO: renamed from: v */
    public C22421c<Boolean> mo42535v() {
        return C22421c.just(Boolean.TRUE);
    }
}
