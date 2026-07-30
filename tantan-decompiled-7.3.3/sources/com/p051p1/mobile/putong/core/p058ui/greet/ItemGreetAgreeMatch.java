package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetAgreeMatch;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.h39;
import p153l.o1j0;
import p153l.ovb0;
import p153l.psd0;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGreetAgreeMatch extends VFrame implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public TextView f30281a;

    /* JADX INFO: renamed from: b */
    public VText f30282b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemGreetAgreeMatch$a */
    public static class C8517a {
        /* JADX INFO: renamed from: b */
        public static void m46973b(ItemGreetAgreeMatch itemGreetAgreeMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemGreetAgreeMatch.f30281a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemGreetAgreeMatch.f30282b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemGreetAgreeMatch(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m46963E(Message message, View view) {
        sfj0.m185596c("e_kankan_chat_notice", "p_kankan_chat_popup", new sfj0.C20032a[0]);
        m46971C(message);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m46965s(Greeting greeting) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m46966u(Throwable th) {
        int i;
        if ((th instanceof TantanException.Client.CoreService) && ((i = ((TantanException.Client.CoreService) th).code) == 40044 || i == 40045)) {
            o1j0.m165651y("对方账号异常");
        } else {
            bsj0.m106246D(th);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        String strM133414C = h39.m133414C();
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.localGreetingId);
        this.f30281a.setText(String.format("%1$s向你表达了好感，%2$s", (NullChecker.m82486a(userM116503Pa) && userM116503Pa.isFemale()) ? "她" : "他", strM133414C));
        bnl0.m105509E0(this.f30282b, new View.OnClickListener() { // from class: l.v5q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182562a.m46963E(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m46970B(View view) {
        C8517a.m46973b(this, view);
    }

    /* JADX INFO: renamed from: C */
    public final void m46971C(final Message message) {
        act().duringCreated(CoreModule.f18264c.f20420r0.m35121f5(message.localGreetingId).doOnNext(new y20() { // from class: l.w5q
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20384f0.m33905ap(message.localGreetingId);
            }
        })).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.x5q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemGreetAgreeMatch.m46965s((Greeting) obj);
            }
        }, new y20() { // from class: l.y5q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemGreetAgreeMatch.m46966u((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46970B(this);
    }

    public ItemGreetAgreeMatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemGreetAgreeMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
