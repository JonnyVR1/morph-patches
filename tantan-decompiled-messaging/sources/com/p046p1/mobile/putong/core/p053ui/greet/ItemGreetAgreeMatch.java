package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemGreetAgreeMatch;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VText;
import p149l.e30;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.xdl0;
import p149l.y19;
import p149l.yij0;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGreetAgreeMatch extends VFrame implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public TextView f29433a;

    /* JADX INFO: renamed from: b */
    public VText f29434b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.greet.ItemGreetAgreeMatch$a */
    public static class C8354a {
        /* JADX INFO: renamed from: b */
        public static void m45790b(ItemGreetAgreeMatch itemGreetAgreeMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemGreetAgreeMatch.f29433a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            itemGreetAgreeMatch.f29434b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemGreetAgreeMatch(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m45780E(Message message, View view) {
        o6j0.m162859c("e_kankan_chat_notice", "p_kankan_chat_popup", new o6j0.C18854a[0]);
        m45788C(message);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m45782s(Greeting greeting) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m45783u(Throwable th) {
        int i;
        if ((th instanceof TantanException.Client.CoreService) && ((i = ((TantanException.Client.CoreService) th).code) == 40044 || i == 40045)) {
            lsi0.m151595y("对方账号异常");
        } else {
            yij0.m214926D(th);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        String strM212143C = y19.m212143C();
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.localGreetingId);
        this.f29433a.setText(String.format("%1$s向你表达了好感，%2$s", (NullChecker.m81303a(userM169430Pa) && userM169430Pa.isFemale()) ? "她" : "他", strM212143C));
        xdl0.m208329E0(this.f29434b, new View.OnClickListener() { // from class: l.v3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179836a.m45780E(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final void m45787B(View view) {
        C8354a.m45790b(this, view);
    }

    /* JADX INFO: renamed from: C */
    public final void m45788C(final Message message) {
        act().duringCreated(CoreModule.f17545c.f19678r0.m34118f5(message.localGreetingId).doOnNext(new e30() { // from class: l.w3q
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19642f0.m32902ap(message.localGreetingId);
            }
        })).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.x3q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemGreetAgreeMatch.m45782s((Greeting) obj);
            }
        }, new e30() { // from class: l.y3q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemGreetAgreeMatch.m45783u((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45787B(this);
    }

    public ItemGreetAgreeMatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemGreetAgreeMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
