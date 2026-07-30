package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetingItemRootLayout;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemDynamicGreetAgreeMatch;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetAgreeMatch;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetRecalled;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetingTip;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBase;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class kdk extends AbstractC15610a<Message> {

    /* JADX INFO: renamed from: d */
    public GreetAct f125251d;

    /* JADX INFO: renamed from: e */
    public ListView f125252e;

    /* JADX INFO: renamed from: c */
    public List<Message> f125250c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f125253f = false;

    /* JADX INFO: renamed from: g */
    public hgm f125254g = new hgm();

    public kdk(GreetAct greetAct, ListView listView) {
        this.f125251d = greetAct;
        this.f125252e = listView;
    }

    /* JADX INFO: renamed from: t */
    private int m149204t(Message message, int i) {
        return m149205w(message, i);
    }

    /* JADX INFO: renamed from: w */
    private int m149205w(Message message, int i) {
        Boolean bool = message.recalled;
        if (bool != null && bool.booleanValue()) {
            return 19;
        }
        if (TEnum.equals(message.messageType, MessageType.local_meet_reply)) {
            return 15;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_reply)) {
            return 12;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_agreematch_notice)) {
            return 13;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_agree_match)) {
            return 14;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greet_send_notice)) {
            return 16;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greet_receive_match_tip)) {
            return 17;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_break_ice)) {
            return 19;
        }
        if (TEnum.equals(message.messageType, MessageType.local_dynamic_greeting_agree_match)) {
            return 20;
        }
        if (message.isOtherUser()) {
            if (!TEnum.equals(message.messageType, MessageType.chat_gift)) {
                return TEnum.equals(message.messageType, MessageType.state_like) ? 3 : 0;
            }
            ChatGiftInfoExtra chatGiftInfoExtraM130167c = ggm.m130167c(message);
            return (CoreModule.m30933P().m143412i().mo180491k0() && NullChecker.m82486a(chatGiftInfoExtraM130167c) && chatGiftInfoExtraM130167c.needOpen) ? 2 : 1;
        }
        if (!TEnum.equals(message.messageType(), MessageType.chat_gift)) {
            return TEnum.equals(message.messageType, MessageType.state_like) ? 9 : 6;
        }
        ChatGiftInfoExtra chatGiftInfoExtraM130167c2 = ggm.m130167c(message);
        return (CoreModule.m30933P().m143412i().mo180491k0() && NullChecker.m82486a(chatGiftInfoExtraM130167c2) && chatGiftInfoExtraM130167c2.needOpen) ? 8 : 7;
    }

    /* JADX INFO: renamed from: z */
    private View m149206z(ViewGroup viewGroup, int i) {
        if (i == 12 || i == 13 || i == 15 || i == 16 || i == 17) {
            return p9r.m171370a(this.f125251d).inflate(qec0.f156995b0, (ViewGroup) null);
        }
        if (i == 14) {
            return p9r.m171370a(this.f125251d).inflate(qec0.f156937S, (ViewGroup) null);
        }
        if (i == 19) {
            return p9r.m171370a(this.f125251d).inflate(qec0.f156981Z, viewGroup, false);
        }
        return i == 20 ? p9r.m171370a(this.f125251d).inflate(qec0.f157141w, (ViewGroup) null) : m149209y(viewGroup, i);
    }

    /* JADX INFO: renamed from: A */
    public void m149207A(List<Message> list) {
        this.f125250c.clear();
        this.f125250c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return m149204t(getItem(i), i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 21;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        GreetingItemRootLayout greetingItemRootLayout = (GreetingItemRootLayout) p9r.m171370a(this.f125251d).inflate(qec0.f156988a0, (ViewGroup) null);
        greetingItemRootLayout.addView(m149206z(greetingItemRootLayout, i), 0, new LinearLayout.LayoutParams(-1, -2));
        return greetingItemRootLayout;
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<Message> mo21403p() {
        return this.f125250c;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, Message message, int i, int i2) {
        if (view instanceof GreetingItemRootLayout) {
            GreetingItemRootLayout greetingItemRootLayout = (GreetingItemRootLayout) view;
            greetingItemRootLayout.m46951m(message, i2, this, this.f125254g);
            View realRenderView = greetingItemRootLayout.getRealRenderView();
            if (i == 19) {
                ((ItemGreetRecalled) realRenderView).m46992a(message);
                return;
            }
            if (i == 12 || i == 13 || i == 15 || i == 16 || i == 17) {
                ((ItemGreetingTip) realRenderView).mo43399A(message);
                return;
            }
            if (i == 14) {
                ((ItemGreetAgreeMatch) realRenderView).mo43399A(message);
            } else if (i != 20) {
                ((ItemBase) realRenderView).mo49217g(this, message, i2 == 0 ? null : getItem(i2 - 1), i2 != getCount() - 1 ? getItem(i2 + 1) : null);
            } else {
                ((ItemDynamicGreetAgreeMatch) realRenderView).m46960z(message, this.f125251d, !this.f125253f);
                this.f125253f = true;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public View m149209y(ViewGroup viewGroup, int i) {
        boolean z = i >= 6;
        ItemMessageBase itemMessageBase = (ItemMessageBase) this.f125251d.inflater().inflate(z ? qec0.f157049i5 : qec0.f157042h5, viewGroup, false);
        int i2 = qec0.f156894L5;
        if (i == 0) {
            i2 = qec0.f156887K5;
        } else if (i == 1) {
            i2 = qec0.f157157y1;
        } else if (i == 7) {
            i2 = qec0.f157164z1;
        } else if (i == 2) {
            i2 = qec0.f156813A1;
        } else if (i == 8) {
            i2 = qec0.f156820B1;
        } else if (i == 3) {
            i2 = qec0.f156966W2;
        } else if (i == 9) {
            i2 = qec0.f156972X2;
        } else if (i == 4) {
            i2 = qec0.f156954U2;
        } else if (i == 10) {
            i2 = qec0.f156960V2;
        } else if (i == 5) {
            i2 = qec0.f157028f5;
        } else if (i == 11) {
            i2 = qec0.f157035g5;
        }
        itemMessageBase.mo49529U(i2, this.f125252e, 0, z);
        return itemMessageBase;
    }
}
