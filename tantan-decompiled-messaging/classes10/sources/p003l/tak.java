package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.p000p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetAct;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetingItemRootLayout;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemDynamicGreetAgreeMatch;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemGreetAgreeMatch;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemGreetRecalled;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemGreetingTip;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.ItemBase;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.o7r;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tak extends a<Message> {

    /* JADX INFO: renamed from: d */
    public GreetAct f7551d;

    /* JADX INFO: renamed from: e */
    public ListView f7552e;

    /* JADX INFO: renamed from: c */
    public List<Message> f7550c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f7553f = false;

    /* JADX INFO: renamed from: g */
    public rdm f7554g = new rdm();

    public tak(GreetAct greetAct, ListView listView) {
        this.f7551d = greetAct;
        this.f7552e = listView;
    }

    /* JADX INFO: renamed from: t */
    private int m9554t(Message message, int i) {
        return m9555w(message, i);
    }

    /* JADX INFO: renamed from: w */
    private int m9555w(Message message, int i) {
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
            ChatGiftInfoExtra chatGiftInfoExtraM8976c = qdm.m8976c(message);
            return (CoreModule.P().i().k0() && NullChecker.a(chatGiftInfoExtraM8976c) && chatGiftInfoExtraM8976c.needOpen) ? 2 : 1;
        }
        if (!TEnum.equals(message.messageType(), MessageType.chat_gift)) {
            return TEnum.equals(message.messageType, MessageType.state_like) ? 9 : 6;
        }
        ChatGiftInfoExtra chatGiftInfoExtraM8976c2 = qdm.m8976c(message);
        return (CoreModule.P().i().k0() && NullChecker.a(chatGiftInfoExtraM8976c2) && chatGiftInfoExtraM8976c2.needOpen) ? 8 : 7;
    }

    /* JADX INFO: renamed from: z */
    private View m9556z(ViewGroup viewGroup, int i) {
        if (i == 12 || i == 13 || i == 15 || i == 16 || i == 17) {
            return o7r.a(this.f7551d).inflate(l6c0.f5948b0, (ViewGroup) null);
        }
        if (i == 14) {
            return o7r.a(this.f7551d).inflate(l6c0.f5890S, (ViewGroup) null);
        }
        if (i == 19) {
            return o7r.a(this.f7551d).inflate(l6c0.f5934Z, viewGroup, false);
        }
        return i == 20 ? o7r.a(this.f7551d).inflate(l6c0.f6094w, (ViewGroup) null) : m9562y(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void m9557A(List<Message> list) {
        this.f7550c.clear();
        this.f7550c.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return m9554t((Message) getItem(i), i);
    }

    public int getViewTypeCount() {
        return 21;
    }

    /* JADX INFO: renamed from: m */
    public View m9559m(ViewGroup viewGroup, int i) {
        GreetingItemRootLayout greetingItemRootLayout = (GreetingItemRootLayout) o7r.a(this.f7551d).inflate(l6c0.f5941a0, (ViewGroup) null);
        greetingItemRootLayout.addView(m9556z(greetingItemRootLayout, i), 0, new LinearLayout.LayoutParams(-1, -2));
        return greetingItemRootLayout;
    }

    /* JADX INFO: renamed from: p */
    public List<Message> m9560p() {
        return this.f7550c;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m9558j(View view, Message message, int i, int i2) {
        if (view instanceof GreetingItemRootLayout) {
            GreetingItemRootLayout greetingItemRootLayout = (GreetingItemRootLayout) view;
            greetingItemRootLayout.m3106m(message, i2, this, this.f7554g);
            ItemBase realRenderView = greetingItemRootLayout.getRealRenderView();
            if (i == 19) {
                ((ItemGreetRecalled) realRenderView).m3150a(message);
                return;
            }
            if (i == 12 || i == 13 || i == 15 || i == 16 || i == 17) {
                ((ItemGreetingTip) realRenderView).m3153A(message);
                return;
            }
            if (i == 14) {
                ((ItemGreetAgreeMatch) realRenderView).m3125A(message);
            } else if (i != 20) {
                realRenderView.g(this, message, i2 == 0 ? null : (Message) getItem(i2 - 1), i2 != getCount() - 1 ? (Message) getItem(i2 + 1) : null);
            } else {
                ((ItemDynamicGreetAgreeMatch) realRenderView).m3115z(message, this.f7551d, !this.f7553f);
                this.f7553f = true;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public View m9562y(ViewGroup viewGroup, int i) {
        boolean z = i >= 6;
        ItemMessageBase itemMessageBaseInflate = this.f7551d.inflater().inflate(z ? l6c0.f6002i5 : l6c0.f5995h5, viewGroup, false);
        int i2 = l6c0.f5847L5;
        if (i == 0) {
            i2 = l6c0.f5840K5;
        } else if (i == 1) {
            i2 = l6c0.f6110y1;
        } else if (i == 7) {
            i2 = l6c0.f6117z1;
        } else if (i == 2) {
            i2 = l6c0.f5766A1;
        } else if (i == 8) {
            i2 = l6c0.f5773B1;
        } else if (i == 3) {
            i2 = l6c0.f5919W2;
        } else if (i == 9) {
            i2 = l6c0.f5925X2;
        } else if (i == 4) {
            i2 = l6c0.f5907U2;
        } else if (i == 10) {
            i2 = l6c0.f5913V2;
        } else if (i == 5) {
            i2 = l6c0.f5981f5;
        } else if (i == 11) {
            i2 = l6c0.f5988g5;
        }
        itemMessageBaseInflate.U(i2, this.f7552e, 0, z);
        return itemMessageBaseInflate;
    }
}
