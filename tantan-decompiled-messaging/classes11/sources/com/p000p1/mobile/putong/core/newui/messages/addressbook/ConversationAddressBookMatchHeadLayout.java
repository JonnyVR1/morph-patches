package com.p000p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import java.util.List;
import l.bjb;
import l.e30;
import l.j46;
import l.j760;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p009l.b46;
import p009l.b86;
import p009l.q860;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAddressBookMatchHeadLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4096a;

    /* JADX INFO: renamed from: b */
    public VText f4097b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4098c;

    /* JADX INFO: renamed from: d */
    public ImageView f4099d;

    /* JADX INFO: renamed from: e */
    public TextView f4100e;

    /* JADX INFO: renamed from: f */
    public TextView f4101f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f4102g;

    /* JADX INFO: renamed from: h */
    public ImageView f4103h;

    /* JADX INFO: renamed from: i */
    public TextView f4104i;

    /* JADX INFO: renamed from: j */
    public TextView f4105j;

    /* JADX INFO: renamed from: k */
    public VText f4106k;

    public ConversationAddressBookMatchHeadLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6008a(b46 b46Var, List list, View view) {
        zvf0.u("e_contacts_all_matches_entrance", b46Var.m14440J(), new j760[]{j760.a("remote_count", Integer.valueOf(list.size()))});
        b86.m11914a(b46Var.f13017m, list.size());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6011d(b46 b46Var, View view) {
        zvf0.r("e_search_entrance", b46Var.m14440J());
        b46Var.m14444N();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6012e(b46 b46Var, q860 q860Var, View view) {
        zvf0.u("e_contacts_unmatch_entrance", b46Var.m14440J(), new j760[]{j760.a("remote_count", Integer.valueOf(q860Var.f19068a.size()))});
        Act act = b46Var.f13017m;
        act.startActivity(ConversationAddressBookUnMatchAct.m6017Z1(act));
    }

    /* JADX INFO: renamed from: f */
    public final void m6013f(View view) {
        j46.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m6014g(final b46 b46Var, final q860 q860Var) {
        boolean zJ = vwb.J(q860Var.f19068a);
        TextView textView = this.f4104i;
        if (zJ) {
            textView.setText("解除的配对");
        } else {
            textView.setText("解除的配对（" + q860Var.f19068a.size() + "）");
        }
        this.f4104i.getPaint().setFakeBoldText(true);
        xdl0.E0(this.f4102g, new View.OnClickListener() { // from class: l.h46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m6012e(b46Var, q860Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m6015h(final b46 b46Var, final List list) {
        boolean zJ = vwb.J(list);
        TextView textView = this.f4100e;
        if (zJ) {
            textView.setText("所有配对");
        } else {
            textView.setText("所有配对（" + list.size() + "）");
        }
        this.f4100e.getPaint().setFakeBoldText(true);
        xdl0.E0(this.f4098c, new View.OnClickListener() { // from class: l.i46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m6008a(b46Var, list, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m6016i(final b46 b46Var) {
        int iM14441K = b46Var.m14441K();
        VText vText = this.f4106k;
        if (iM14441K <= 0) {
            vText.setText("新配对");
        } else {
            vText.setText("新配对（" + iM14441K + "）");
        }
        this.f4106k.getPaint().setFakeBoldText(true);
        if (bjb.q0()) {
            this.f4097b.setText("输入昵称/聊天内容/ID搜索");
        }
        b46Var.c(b46Var.f13017m, CoreModule.c.f0.vn()).subscribe(mkd0.G(new e30() { // from class: l.e46
            public final void call(Object obj) {
                this.f12362a.m6014g(b46Var, (q860) obj);
            }
        }));
        b46Var.c(b46Var.f13017m, CoreModule.k.m.A.m()).subscribe(mkd0.G(new e30() { // from class: l.f46
            public final void call(Object obj) {
                this.f12771a.m6015h(b46Var, (List) obj);
            }
        }));
        xdl0.E0(this.f4096a, new View.OnClickListener() { // from class: l.g46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m6011d(b46Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6013f(this);
    }

    public ConversationAddressBookMatchHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAddressBookMatchHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
