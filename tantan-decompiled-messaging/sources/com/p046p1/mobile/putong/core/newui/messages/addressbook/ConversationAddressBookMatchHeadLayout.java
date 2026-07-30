package com.p046p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchHeadLayout;
import java.util.List;
import p147v.VText;
import p149l.b46;
import p149l.b86;
import p149l.bjb;
import p149l.e30;
import p149l.j46;
import p149l.j760;
import p149l.mkd0;
import p149l.q860;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookMatchHeadLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f25318a;

    /* JADX INFO: renamed from: b */
    public VText f25319b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f25320c;

    /* JADX INFO: renamed from: d */
    public ImageView f25321d;

    /* JADX INFO: renamed from: e */
    public TextView f25322e;

    /* JADX INFO: renamed from: f */
    public TextView f25323f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f25324g;

    /* JADX INFO: renamed from: h */
    public ImageView f25325h;

    /* JADX INFO: renamed from: i */
    public TextView f25326i;

    /* JADX INFO: renamed from: j */
    public TextView f25327j;

    /* JADX INFO: renamed from: k */
    public VText f25328k;

    public ConversationAddressBookMatchHeadLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m41874a(b46 b46Var, List list, View view) {
        zvf0.m220399u("e_contacts_all_matches_entrance", b46Var.m121485J(), j760.m140076a("remote_count", Integer.valueOf(list.size())));
        b86.m100756a(b46Var.f97616m, list.size());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m41877d(b46 b46Var, View view) {
        zvf0.m220396r("e_search_entrance", b46Var.m121485J());
        b46Var.m121489N();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m41878e(b46 b46Var, q860 q860Var, View view) {
        zvf0.m220399u("e_contacts_unmatch_entrance", b46Var.m121485J(), j760.m140076a("remote_count", Integer.valueOf(q860Var.f153135a.size())));
        Act act = b46Var.f97616m;
        act.startActivity(ConversationAddressBookUnMatchAct.m41883Z1(act));
    }

    /* JADX INFO: renamed from: f */
    public final void m41879f(View view) {
        j46.m139616a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41880g(final b46 b46Var, final q860 q860Var) {
        boolean zM200296J = vwb.m200296J(q860Var.f153135a);
        TextView textView = this.f25326i;
        if (zM200296J) {
            textView.setText("解除的配对");
        } else {
            textView.setText("解除的配对（" + q860Var.f153135a.size() + "）");
        }
        this.f25326i.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this.f25324g, new View.OnClickListener() { // from class: l.h46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m41878e(b46Var, q860Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41881h(final b46 b46Var, final List list) {
        boolean zM200296J = vwb.m200296J(list);
        TextView textView = this.f25322e;
        if (zM200296J) {
            textView.setText("所有配对");
        } else {
            textView.setText("所有配对（" + list.size() + "）");
        }
        this.f25322e.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this.f25320c, new View.OnClickListener() { // from class: l.i46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m41874a(b46Var, list, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m41882i(final b46 b46Var) {
        int iM121486K = b46Var.m121486K();
        VText vText = this.f25328k;
        if (iM121486K <= 0) {
            vText.setText("新配对");
        } else {
            vText.setText("新配对（" + iM121486K + "）");
        }
        this.f25328k.getPaint().setFakeBoldText(true);
        if (bjb.m102165q0()) {
            this.f25319b.setText("输入昵称/聊天内容/ID搜索");
        }
        b46Var.mo67374c(b46Var.f97616m, CoreModule.f17545c.f19642f0.m33164vn()).subscribe(mkd0.m154955G(new e30() { // from class: l.e46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89251a.m41880g(b46Var, (q860) obj);
            }
        }));
        b46Var.mo67374c(b46Var.f97616m, CoreModule.f17553k.f91950m.f118448A.m165620m()).subscribe(mkd0.m154955G(new e30() { // from class: l.f46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94739a.m41881h(b46Var, (List) obj);
            }
        }));
        xdl0.m208329E0(this.f25318a, new View.OnClickListener() { // from class: l.g46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationAddressBookMatchHeadLayout.m41877d(b46Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41879f(this);
    }

    public ConversationAddressBookMatchHeadLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationAddressBookMatchHeadLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
