package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemGreetAgreeMatch;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.a;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.xdl0;
import l.yij0;
import p003l.o6j0;
import p003l.y19;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGreetAgreeMatch extends VFrame implements a {

    /* JADX INFO: renamed from: a */
    public TextView f1827a;

    /* JADX INFO: renamed from: b */
    public VText f1828b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemGreetAgreeMatch$a */
    public static class C3129a {
        /* JADX INFO: renamed from: b */
        public static void m3131b(ItemGreetAgreeMatch itemGreetAgreeMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemGreetAgreeMatch.f1827a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemGreetAgreeMatch.f1828b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemGreetAgreeMatch(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m3118E(Message message, View view) {
        o6j0.m8403c("e_kankan_chat_notice", "p_kankan_chat_popup", new o6j0.C3390a[0]);
        m3127C(message);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m3120s(Greeting greeting) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m3121u(Throwable th) {
        int i;
        if ((th instanceof TantanException.Client.CoreService) && ((i = ((TantanException.Client.CoreService) th).code) == 40044 || i == 40045)) {
            lsi0.y("对方账号异常");
        } else {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m3125A(final Message message) {
        String strM11079C = y19.m11079C();
        User userPa = CoreModule.c.e0.Pa(message.localGreetingId);
        this.f1827a.setText(String.format("%1$s向你表达了好感，%2$s", (NullChecker.a(userPa) && userPa.isFemale()) ? "她" : "他", strM11079C));
        xdl0.E0(this.f1828b, new View.OnClickListener() { // from class: l.v3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7859a.m3118E(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m3126B(View view) {
        C3129a.m3131b(this, view);
    }

    /* JADX INFO: renamed from: C */
    public final void m3127C(final Message message) {
        act().duringCreated(CoreModule.c.r0.f5(message.localGreetingId).doOnNext(new e30() { // from class: l.w3q
            public final void call(Object obj) {
                CoreModule.c.f0.ap(message.localGreetingId);
            }
        })).take(1).subscribe(mkd0.H(new e30() { // from class: l.x3q
            public final void call(Object obj) {
                ItemGreetAgreeMatch.m3120s((Greeting) obj);
            }
        }, new e30() { // from class: l.y3q
            public final void call(Object obj) {
                ItemGreetAgreeMatch.m3121u((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> m3128J() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: m */
    public void m3129m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3126B(this);
    }

    public ItemGreetAgreeMatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemGreetAgreeMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
